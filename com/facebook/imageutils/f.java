package com.facebook.imageutils;

import android.util.Pair;
import java.io.IOException;
import java.io.InputStream;

public class f {
  public static int a(InputStream paramInputStream) {
    byte b = (byte)paramInputStream.read();
    return (byte)paramInputStream.read() << 8 & 0xFF00 | b & 0xFF;
  }
  
  private static String a(byte[] paramArrayOfbyte) {
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < paramArrayOfbyte.length; i++)
      stringBuilder.append((char)paramArrayOfbyte[i]); 
    return stringBuilder.toString();
  }
  
  private static boolean a(byte[] paramArrayOfbyte, String paramString) {
    if (paramArrayOfbyte.length != paramString.length())
      return false; 
    for (int i = 0; i < paramArrayOfbyte.length; i++) {
      if (paramString.charAt(i) != paramArrayOfbyte[i])
        return false; 
    } 
    return true;
  }
  
  private static byte b(InputStream paramInputStream) {
    return (byte)(paramInputStream.read() & 0xFF);
  }
  
  private static int c(InputStream paramInputStream) {
    byte b1 = (byte)paramInputStream.read();
    byte b2 = (byte)paramInputStream.read();
    byte b3 = (byte)paramInputStream.read();
    return (byte)paramInputStream.read() << 24 & 0xFF000000 | b3 << 16 & 0xFF0000 | b2 << 8 & 0xFF00 | b1 & 0xFF;
  }
  
  private static short d(InputStream paramInputStream) {
    return (short)(paramInputStream.read() & 0xFF);
  }
  
  public static Pair<Integer, Integer> e(InputStream paramInputStream) {
    byte[] arrayOfByte = new byte[4];
    try {
      Pair<Integer, Integer> pair;
      paramInputStream.read(arrayOfByte);
      boolean bool = a(arrayOfByte, "RIFF");
      if (!bool) {
        if (paramInputStream != null)
          try {
            paramInputStream.close();
            return null;
          } catch (IOException null) {
            iOException.printStackTrace();
          }  
        return null;
      } 
      c((InputStream)iOException);
      iOException.read(arrayOfByte);
      bool = a(arrayOfByte, "WEBP");
      if (!bool) {
        if (iOException != null)
          try {
            iOException.close();
            return null;
          } catch (IOException null) {
            iOException.printStackTrace();
          }  
        return null;
      } 
      iOException.read(arrayOfByte);
      String str = a(arrayOfByte);
      if ("VP8 ".equals(str)) {
        pair = f((InputStream)iOException);
        if (iOException != null)
          try {
            iOException.close();
            return pair;
          } catch (IOException null) {
            iOException.printStackTrace();
          }  
        return pair;
      } 
      if ("VP8L".equals(pair)) {
        pair = g((InputStream)iOException);
        if (iOException != null)
          try {
            iOException.close();
            return pair;
          } catch (IOException null) {
            iOException.printStackTrace();
          }  
        return pair;
      } 
      if ("VP8X".equals(pair)) {
        pair = h((InputStream)iOException);
        if (iOException != null)
          try {
            iOException.close();
            return pair;
          } catch (IOException null) {
            iOException.printStackTrace();
          }  
        return pair;
      } 
      if (iOException != null)
        try {
          iOException.close();
          return null;
        } catch (IOException iOException) {
          iOException.printStackTrace();
        }  
    } catch (IOException iOException1) {
      iOException1.printStackTrace();
      if (iOException != null) {
        iOException.close();
        return null;
      } 
    } finally {}
    return null;
  }
  
  private static Pair<Integer, Integer> f(InputStream paramInputStream) {
    paramInputStream.skip(7L);
    short s1 = d(paramInputStream);
    short s2 = d(paramInputStream);
    short s3 = d(paramInputStream);
    return (s1 != 157 || s2 != 1 || s3 != 42) ? null : new Pair(Integer.valueOf(a(paramInputStream)), Integer.valueOf(a(paramInputStream)));
  }
  
  private static Pair<Integer, Integer> g(InputStream paramInputStream) {
    c(paramInputStream);
    if (b(paramInputStream) != 47)
      return null; 
    byte b1 = (byte)paramInputStream.read();
    int i = (byte)paramInputStream.read() & 0xFF;
    byte b2 = (byte)paramInputStream.read();
    return new Pair(Integer.valueOf((b1 & 0xFF | (i & 0x3F) << 8) + 1), Integer.valueOf((((byte)paramInputStream.read() & 0xFF & 0xF) << 10 | (b2 & 0xFF) << 2 | (i & 0xC0) >> 6) + 1));
  }
  
  private static Pair<Integer, Integer> h(InputStream paramInputStream) {
    paramInputStream.skip(8L);
    return new Pair(Integer.valueOf(i(paramInputStream) + 1), Integer.valueOf(i(paramInputStream) + 1));
  }
  
  private static int i(InputStream paramInputStream) {
    byte b1 = b(paramInputStream);
    byte b2 = b(paramInputStream);
    return b(paramInputStream) << 16 & 0xFF0000 | b2 << 8 & 0xFF00 | b1 & 0xFF;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/imageutils/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */