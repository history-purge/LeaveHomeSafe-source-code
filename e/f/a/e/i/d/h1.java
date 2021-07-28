package e.f.a.e.i.d;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class h1 {
  static final Charset a = Charset.forName("UTF-8");
  
  public static final byte[] b;
  
  static {
    Charset.forName("ISO-8859-1");
    byte[] arrayOfByte = new byte[0];
    b = arrayOfByte;
    ByteBuffer.wrap(arrayOfByte);
    arrayOfByte = b;
    j0.a(arrayOfByte, 0, arrayOfByte.length, false);
  }
  
  static int a(int paramInt1, byte[] paramArrayOfbyte, int paramInt2, int paramInt3) {
    int i = paramInt1;
    for (paramInt1 = paramInt2; paramInt1 < paramInt2 + paramInt3; paramInt1++)
      i = i * 31 + paramArrayOfbyte[paramInt1]; 
    return i;
  }
  
  public static int a(long paramLong) {
    return (int)(paramLong ^ paramLong >>> 32L);
  }
  
  public static int a(boolean paramBoolean) {
    return paramBoolean ? 1231 : 1237;
  }
  
  public static int a(byte[] paramArrayOfbyte) {
    int i = paramArrayOfbyte.length;
    int j = a(i, paramArrayOfbyte, 0, i);
    i = j;
    if (j == 0)
      i = 1; 
    return i;
  }
  
  static <T> T a(T paramT) {
    if (paramT != null)
      return paramT; 
    throw new NullPointerException();
  }
  
  static Object a(Object paramObject1, Object paramObject2) {
    paramObject1 = ((k2)paramObject1).d();
    paramObject1.a((k2)paramObject2);
    return paramObject1.v();
  }
  
  static <T> T a(T paramT, String paramString) {
    if (paramT != null)
      return paramT; 
    throw new NullPointerException(paramString);
  }
  
  static boolean a(k2 paramk2) {
    return false;
  }
  
  public static boolean b(byte[] paramArrayOfbyte) {
    return c4.a(paramArrayOfbyte);
  }
  
  public static String c(byte[] paramArrayOfbyte) {
    return new String(paramArrayOfbyte, a);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/h1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */