package e.e.k;

import e.e.e.d.i;
import java.io.UnsupportedEncodingException;

public class e {
  public static int a(byte[] paramArrayOfbyte1, int paramInt1, byte[] paramArrayOfbyte2, int paramInt2) {
    i.a(paramArrayOfbyte1);
    i.a(paramArrayOfbyte2);
    if (paramInt2 > paramInt1)
      return -1; 
    int i = 0;
    byte b = paramArrayOfbyte2[0];
    int j = paramInt1 - paramInt2;
    for (paramInt1 = i; paramInt1 <= j; paramInt1 = i + 1) {
      byte b1 = paramArrayOfbyte1[paramInt1];
      int k = 1;
      i = paramInt1;
      if (b1 != b)
        while (true) {
          i = ++paramInt1;
          if (paramInt1 <= j) {
            i = paramInt1;
            if (paramArrayOfbyte1[paramInt1] != b)
              continue; 
          } 
          break;
        }  
      if (i <= j) {
        int m = i + 1;
        int n = m + paramInt2 - 1;
        paramInt1 = k;
        k = m;
        while (k < n && paramArrayOfbyte1[k] == paramArrayOfbyte2[paramInt1]) {
          k++;
          paramInt1++;
        } 
        if (k == n)
          return i; 
      } 
    } 
    return -1;
  }
  
  public static boolean a(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    i.a(paramArrayOfbyte1);
    i.a(paramArrayOfbyte2);
    if (paramArrayOfbyte2.length > paramArrayOfbyte1.length)
      return false; 
    for (int i = 0; i < paramArrayOfbyte2.length; i++) {
      if (paramArrayOfbyte1[i] != paramArrayOfbyte2[i])
        return false; 
    } 
    return true;
  }
  
  public static byte[] a(String paramString) {
    i.a(paramString);
    try {
      return paramString.getBytes("ASCII");
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      throw new RuntimeException("ASCII not found!", unsupportedEncodingException);
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/k/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */