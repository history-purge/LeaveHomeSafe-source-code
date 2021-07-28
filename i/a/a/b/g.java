package i.a.a.b;

import i.a.a.b.h.b;
import i.a.a.c.a;
import java.util.Random;

public class g implements d {
  private b a;
  
  private byte[] b;
  
  public g(char[] paramArrayOfchar, int paramInt) {
    if (paramArrayOfchar != null && paramArrayOfchar.length > 0) {
      this.a = new b();
      this.b = new byte[12];
      a(paramArrayOfchar, paramInt);
      return;
    } 
    throw new a("input password is null or empty in standard encrpyter constructor");
  }
  
  private void a(char[] paramArrayOfchar, int paramInt) {
    if (paramArrayOfchar != null && paramArrayOfchar.length > 0) {
      this.a.a(paramArrayOfchar);
      this.b = a(12);
      this.a.a(paramArrayOfchar);
      byte[] arrayOfByte = this.b;
      arrayOfByte[11] = (byte)(paramInt >>> 24);
      arrayOfByte[10] = (byte)(paramInt >>> 16);
      if (arrayOfByte.length >= 12) {
        a(arrayOfByte);
        return;
      } 
      throw new a("invalid header bytes generated, cannot perform standard encryption");
    } 
    throw new a("input password is null or empty, cannot initialize standard encrypter");
  }
  
  protected byte a(byte paramByte) {
    byte b1 = (byte)(this.a.a() & 0xFF ^ paramByte);
    this.a.a(paramByte);
    return b1;
  }
  
  public int a(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte != null) {
      int i = paramArrayOfbyte.length;
      a(paramArrayOfbyte, 0, i);
      return i;
    } 
    throw new NullPointerException();
  }
  
  public int a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (paramInt2 >= 0) {
      int i = paramInt1;
      while (i < paramInt1 + paramInt2) {
        try {
          paramArrayOfbyte[i] = a(paramArrayOfbyte[i]);
          i++;
        } catch (Exception exception) {
          throw new a(exception);
        } 
      } 
      return paramInt2;
    } 
    a a = new a("invalid length specified to decrpyt data");
    throw a;
  }
  
  public byte[] a() {
    return this.b;
  }
  
  protected byte[] a(int paramInt) {
    if (paramInt > 0) {
      byte[] arrayOfByte = new byte[paramInt];
      Random random = new Random();
      for (paramInt = 0; paramInt < arrayOfByte.length; paramInt++)
        arrayOfByte[paramInt] = a((byte)random.nextInt(256)); 
      return arrayOfByte;
    } 
    a a = new a("size is either 0 or less than 0, cannot generate header for standard encryptor");
    throw a;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/i/a/a/b/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */