package com.alirezaashrafi.library;

public class Codia {


    private static int[] ints = {-1,1,1,1,-1,0};
    public static String encode(String string) {
        try {
            byte[] bytes = string.getBytes();
            for (int i = 0; i < bytes.length; i++) {
                bytes[i]+=ints[(i%ints.length)];
                //bytes[i]++;
            }
            return new String(bytes);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String decode(String string) {
        try {
            byte[] bytes = string.getBytes();
            for (int i = 0; i < bytes.length; i++) {


                bytes[i]-=ints[i%ints.length];
                //bytes[i]--;
            }
            return new String(bytes);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
