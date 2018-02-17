<?php
/**
 * User: AlirezaAshrafi
 * Date: 2/15/2018
 * Time: 11:37 PM
 */

class Codia
{

    private $key = array();
    public function __construct($key)
    {
        $byte = unpack('C*', (md5($key)));
        for ($i=1;$i<=count($byte);$i++){
            $byte[$i] = (($byte[$i]%3)-1);
        }
        $this->key = $byte;
    }
    function encode($text)
    {
        $byte_array = unpack('C*', ($text));
        for ($i = 1; $i <= count($byte_array); $i++) {
            $byte_array[$i] +=$this->key[$i%count($this->key)];
        }
        return implode(array_map("chr", $byte_array));
    }

    function decode($text)
    {
        $byte_array = unpack('C*', ($text));
        for ($i = 1; $i <= count($byte_array); $i++) {
            $byte_array[$i]-=$this->key[$i%count($this->key)];
        }
        return implode(array_map("chr", $byte_array));
    }
}