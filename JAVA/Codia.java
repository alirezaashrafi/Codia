import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Codia {

    private byte[] key;
    public Codia (String key){
        byte[] keyBytes = hashKey(key).getBytes();
        for (int i = 0; i < keyBytes.length; i++) {
            keyBytes[i] = (byte) (keyBytes[i]%3-1);
        }
        this.key = keyBytes;
    }
    public String encode(String string) {
        try {
            byte[] bytes = string.getBytes();
            for (int i = 0; i < bytes.length; i++) {
                bytes[i]+=key[(i%key.length)];
            }
            return new String(bytes);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public String decode(String string) {
        try {
            byte[] bytes = string.getBytes();
            for (int i = 0; i < bytes.length; i++) {
                bytes[i]-=key[i%key.length];
            }
            return new String(bytes);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private String hashKey(String key) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.reset();
            md.update(key.getBytes());
            byte[] digest = md.digest();
            BigInteger bigInt = new BigInteger(1, digest);
            String hashtext = bigInt.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "123456789";
        }
    }
}
