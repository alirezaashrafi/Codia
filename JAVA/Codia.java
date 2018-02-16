package co.hex.download;

public class Codia {

    //private static int[] ints = {-4,1,-1,0,1,3,3,-3,-2,4,1,1,2,3,-3,1,-1,3,1,-3,3,-2,-4,3,-1,3,2,-1,1,-1,2,-1,-3,2};

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
