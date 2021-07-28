package e.e.e.k;

import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class c {
  public static String a(byte[] paramArrayOfbyte) {
    try {
      MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
      messageDigest.update(paramArrayOfbyte, 0, paramArrayOfbyte.length);
      return Base64.encodeToString(messageDigest.digest(), 11);
    } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
      throw new RuntimeException(noSuchAlgorithmException);
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/e/k/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */