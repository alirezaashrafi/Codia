<?php
/**
 * Created by PhpStorm.
 * User: AlirezaAshrafi
 * Date: 2/15/2018
 * Time: 11:37 PM
 */

class Codia
{
    private static $ints = array(-1,1,1,1,-1,0);
    function encode(&$text)
    {
        //print_r(Codia::$ints);
        $byte_array = unpack('C*', ($text));
        for ($i = 0; $i < count($byte_array); $i++) {
            //$byte_array[$i + 1] ++;
            $byte_array[$i + 1] +=Codia::$ints[$i%count(Codia::$ints)];
        }
        return implode(array_map("chr", $byte_array));
    }

    function decode(&$text)
    {
        $byte_array = unpack('C*', ($text));
        for ($i = 0; $i < count($byte_array); $i++) {
            $byte_array[$i + 1]-=Codia::$ints[$i%count(Codia::$ints)];
            //$byte_array[$i + 1]--;
        }
        return implode(array_map("chr", $byte_array));
    }
}