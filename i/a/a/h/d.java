package i.a.a.h;

import i.a.a.c.a;
import java.io.DataInput;
import java.io.IOException;

public class d {
  public static byte a(int[] paramArrayOfint) {
    if (paramArrayOfint != null) {
      if (paramArrayOfint.length == 8) {
        if (b(paramArrayOfint)) {
          int i = 0;
          int j = 0;
          while (i < paramArrayOfint.length) {
            double d1 = j;
            double d2 = Math.pow(2.0D, i);
            double d3 = paramArrayOfint[i];
            Double.isNaN(d3);
            Double.isNaN(d1);
            j = (int)(d1 + d2 * d3);
            i++;
          } 
          return (byte)j;
        } 
        throw new a("invalid bits provided, bits contain other values than 0 or 1");
      } 
      throw new a("invalid bit array length, cannot calculate byte");
    } 
    a a = new a("bit array is null, cannot calculate byte from bits");
    throw a;
  }
  
  public static int a(DataInput paramDataInput, byte[] paramArrayOfbyte) {
    try {
      paramDataInput.readFully(paramArrayOfbyte, 0, 4);
      byte b1 = paramArrayOfbyte[0];
      byte b2 = paramArrayOfbyte[1];
      byte b3 = paramArrayOfbyte[2];
      return b1 & 0xFF | (b2 & 0xFF) << 8 | ((paramArrayOfbyte[3] & 0xFF) << 8 | b3 & 0xFF) << 16;
    } catch (IOException iOException) {
      throw new a(iOException);
    } 
  }
  
  public static int a(byte[] paramArrayOfbyte, int paramInt) {
    byte b1 = paramArrayOfbyte[paramInt];
    byte b2 = paramArrayOfbyte[paramInt + 1];
    byte b3 = paramArrayOfbyte[paramInt + 2];
    return ((paramArrayOfbyte[paramInt + 3] & 0xFF) << 8 | b3 & 0xFF) << 16 | b1 & 0xFF | (b2 & 0xFF) << 8;
  }
  
  public static void a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    paramArrayOfbyte[0] = (byte)paramInt1;
    paramArrayOfbyte[1] = (byte)(paramInt1 >> 8);
    paramArrayOfbyte[2] = (byte)(paramInt1 >> 16);
    paramArrayOfbyte[3] = (byte)(paramInt1 >> 24);
    paramArrayOfbyte[4] = 0;
    paramArrayOfbyte[5] = 0;
    paramArrayOfbyte[6] = 0;
    paramArrayOfbyte[7] = 0;
    paramArrayOfbyte[8] = 0;
    paramArrayOfbyte[9] = 0;
    paramArrayOfbyte[10] = 0;
    paramArrayOfbyte[11] = 0;
    paramArrayOfbyte[12] = 0;
    paramArrayOfbyte[13] = 0;
    paramArrayOfbyte[14] = 0;
    paramArrayOfbyte[15] = 0;
  }
  
  public static void a(byte[] paramArrayOfbyte, int paramInt, long paramLong) {
    paramArrayOfbyte[paramInt + 7] = (byte)(int)(paramLong >>> 56L);
    paramArrayOfbyte[paramInt + 6] = (byte)(int)(paramLong >>> 48L);
    paramArrayOfbyte[paramInt + 5] = (byte)(int)(paramLong >>> 40L);
    paramArrayOfbyte[paramInt + 4] = (byte)(int)(paramLong >>> 32L);
    paramArrayOfbyte[paramInt + 3] = (byte)(int)(paramLong >>> 24L);
    paramArrayOfbyte[paramInt + 2] = (byte)(int)(paramLong >>> 16L);
    paramArrayOfbyte[paramInt + 1] = (byte)(int)(paramLong >>> 8L);
    paramArrayOfbyte[paramInt] = (byte)(int)(paramLong & 0xFFL);
  }
  
  public static final void a(byte[] paramArrayOfbyte, int paramInt, short paramShort) {
    paramArrayOfbyte[paramInt + 1] = (byte)(paramShort >>> 8);
    paramArrayOfbyte[paramInt] = (byte)(paramShort & 0xFF);
  }
  
  public static byte[] a(char[] paramArrayOfchar) {
    if (paramArrayOfchar != null) {
      byte[] arrayOfByte = new byte[paramArrayOfchar.length];
      for (int i = 0; i < paramArrayOfchar.length; i++)
        arrayOfByte[i] = (byte)paramArrayOfchar[i]; 
      return arrayOfByte;
    } 
    NullPointerException nullPointerException = new NullPointerException();
    throw nullPointerException;
  }
  
  public static long b(byte[] paramArrayOfbyte, int paramInt) {
    long l1 = (paramArrayOfbyte[paramInt + 7] & 0xFF);
    long l2 = (paramArrayOfbyte[paramInt + 6] & 0xFF);
    long l3 = (paramArrayOfbyte[paramInt + 5] & 0xFF);
    long l4 = (paramArrayOfbyte[paramInt + 4] & 0xFF);
    long l5 = (paramArrayOfbyte[paramInt + 3] & 0xFF);
    long l6 = (paramArrayOfbyte[paramInt + 2] & 0xFF);
    long l7 = (paramArrayOfbyte[paramInt + 1] & 0xFF);
    return (paramArrayOfbyte[paramInt] & 0xFF) | (((((((l1 | 0x0L) << 8L | l2) << 8L | l3) << 8L | l4) << 8L | l5) << 8L | l6) << 8L | l7) << 8L;
  }
  
  public static final void b(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    paramArrayOfbyte[paramInt1 + 3] = (byte)(paramInt2 >>> 24);
    paramArrayOfbyte[paramInt1 + 2] = (byte)(paramInt2 >>> 16);
    paramArrayOfbyte[paramInt1 + 1] = (byte)(paramInt2 >>> 8);
    paramArrayOfbyte[paramInt1] = (byte)(paramInt2 & 0xFF);
  }
  
  private static boolean b(int[] paramArrayOfint) {
    for (int i = 0; i < paramArrayOfint.length; i++) {
      if (paramArrayOfint[i] != 0 && paramArrayOfint[i] != 1)
        return false; 
    } 
    return true;
  }
  
  public static final short c(byte[] paramArrayOfbyte, int paramInt) {
    short s = (short)((short)(paramArrayOfbyte[paramInt] & 0xFF | 0x0) << 8);
    return (short)(paramArrayOfbyte[paramInt + 1] & 0xFF | s);
  }
  
  public static int d(byte[] paramArrayOfbyte, int paramInt) {
    byte b = paramArrayOfbyte[paramInt];
    return (paramArrayOfbyte[paramInt + 1] & 0xFF) << 8 | b & 0xFF;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/i/a/a/h/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */