package e.e.e.l;

import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Base64;
import java.io.UnsupportedEncodingException;

public class c {
  public static final boolean a;
  
  public static b b = null;
  
  private static boolean c = false;
  
  private static final byte[] d = a("RIFF");
  
  private static final byte[] e = a("WEBP");
  
  private static final byte[] f = a("VP8 ");
  
  private static final byte[] g = a("VP8L");
  
  private static final byte[] h = a("VP8X");
  
  private static boolean a() {
    int i = Build.VERSION.SDK_INT;
    if (i < 17)
      return false; 
    if (i == 17) {
      byte[] arrayOfByte = Base64.decode("UklGRkoAAABXRUJQVlA4WAoAAAAQAAAAAAAAAAAAQUxQSAwAAAARBxAR/Q9ERP8DAABWUDggGAAAABQBAJ0BKgEAAQAAAP4AAA3AAP7mtQAAAA==", 0);
      BitmapFactory.Options options = new BitmapFactory.Options();
      options.inJustDecodeBounds = true;
      BitmapFactory.decodeByteArray(arrayOfByte, 0, arrayOfByte.length, options);
      if (options.outHeight != 1 || options.outWidth != 1)
        return false; 
    } 
    return true;
  }
  
  public static boolean a(byte[] paramArrayOfbyte, int paramInt) {
    boolean bool = a(paramArrayOfbyte, paramInt + 12, h);
    if ((paramArrayOfbyte[paramInt + 20] & 0x2) == 2) {
      paramInt = 1;
    } else {
      paramInt = 0;
    } 
    return (bool && paramInt != 0);
  }
  
  public static boolean a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    return (paramInt2 >= 21 && a(paramArrayOfbyte, paramInt1 + 12, h));
  }
  
  private static boolean a(byte[] paramArrayOfbyte1, int paramInt, byte[] paramArrayOfbyte2) {
    if (paramArrayOfbyte2 != null) {
      if (paramArrayOfbyte1 == null)
        return false; 
      if (paramArrayOfbyte2.length + paramInt > paramArrayOfbyte1.length)
        return false; 
      for (int i = 0; i < paramArrayOfbyte2.length; i++) {
        if (paramArrayOfbyte1[i + paramInt] != paramArrayOfbyte2[i])
          return false; 
      } 
      return true;
    } 
    return false;
  }
  
  private static byte[] a(String paramString) {
    try {
      return paramString.getBytes("ASCII");
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      throw new RuntimeException("ASCII not found!", unsupportedEncodingException);
    } 
  }
  
  public static b b() {
    if (c)
      return b; 
    b b1 = null;
    try {
      b b2 = (b)Class.forName("com.facebook.webpsupport.WebpBitmapFactoryImpl").newInstance();
      b1 = b2;
    } finally {
      Exception exception;
    } 
    c = true;
    return b1;
  }
  
  public static boolean b(byte[] paramArrayOfbyte, int paramInt) {
    boolean bool = a(paramArrayOfbyte, paramInt + 12, h);
    if ((paramArrayOfbyte[paramInt + 20] & 0x10) == 16) {
      paramInt = 1;
    } else {
      paramInt = 0;
    } 
    return (bool && paramInt != 0);
  }
  
  public static boolean b(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    return (paramInt2 >= 20 && a(paramArrayOfbyte, paramInt1, d) && a(paramArrayOfbyte, paramInt1 + 8, e));
  }
  
  public static boolean c(byte[] paramArrayOfbyte, int paramInt) {
    return a(paramArrayOfbyte, paramInt + 12, g);
  }
  
  public static boolean d(byte[] paramArrayOfbyte, int paramInt) {
    return a(paramArrayOfbyte, paramInt + 12, f);
  }
  
  static {
    boolean bool;
    if (Build.VERSION.SDK_INT <= 17) {
      bool = true;
    } else {
      bool = false;
    } 
    a = bool;
    int i = Build.VERSION.SDK_INT;
    a();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/e/l/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */