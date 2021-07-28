package e.d.b;

import e.d.c.h;
import java.nio.charset.Charset;

public abstract class o {
  private boolean a = true;
  
  public abstract int a();
  
  public String a(int paramInt, Charset paramCharset) {
    return b(paramInt, paramCharset).toString();
  }
  
  public abstract void a(long paramLong);
  
  public void a(boolean paramBoolean) {
    this.a = paramBoolean;
  }
  
  public abstract void a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2);
  
  public abstract byte[] a(int paramInt);
  
  public abstract byte b();
  
  public h b(int paramInt, Charset paramCharset) {
    return new h(b(paramInt), paramCharset);
  }
  
  public abstract boolean b(long paramLong);
  
  public byte[] b(int paramInt) {
    byte[] arrayOfByte1 = new byte[paramInt];
    int i = 0;
    while (i < arrayOfByte1.length) {
      byte b = b();
      arrayOfByte1[i] = b;
      if (b != 0)
        i++; 
    } 
    if (i == paramInt)
      return arrayOfByte1; 
    byte[] arrayOfByte2 = new byte[i];
    if (i > 0)
      System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, i); 
    return arrayOfByte2;
  }
  
  public String c(int paramInt) {
    return new String(a(paramInt));
  }
  
  public String c(int paramInt, Charset paramCharset) {
    return new String(a(paramInt), paramCharset);
  }
  
  public short c() {
    if (this.a) {
      int k = (short)b() << 8 & 0xFFFFFF00;
      int m = (short)b() & 0xFF;
      return (short)(k | m);
    } 
    int i = (short)b() & 0xFF;
    int j = (short)b() << 8 & 0xFFFFFF00;
    return (short)(i | j);
  }
  
  public int d() {
    if (this.a) {
      int k = b() << 24 & 0xFF000000 | b() << 16 & 0xFF0000 | b() << 8 & 0xFF00;
      int m = b() & 0xFF;
      return k | m;
    } 
    int i = b() & 0xFF | 0xFF00 & b() << 8 | 0xFF0000 & b() << 16;
    int j = 0xFF000000 & b() << 24;
    return i | j;
  }
  
  public h d(int paramInt, Charset paramCharset) {
    return new h(a(paramInt), paramCharset);
  }
  
  public long e() {
    if (this.a)
      return 0xFF00000000000000L & b() << 56L | 0xFF000000000000L & b() << 48L | b() << 40L & 0xFF0000000000L | b() << 32L & 0xFF00000000L | b() << 24L & 0xFF000000L | b() << 16L & 0xFF0000L | b() << 8L & 0xFF00L | b() & 0xFFL; 
    long l = b();
    return b() << 8L & 0xFF00L | l & 0xFFL | b() << 16L & 0xFF0000L | b() << 24L & 0xFF000000L | 0xFF00000000L & b() << 32L | 0xFF0000000000L & b() << 40L | 0xFF000000000000L & b() << 48L | b() << 56L & 0xFF00000000000000L;
  }
  
  public byte f() {
    return b();
  }
  
  public abstract long g();
  
  public int h() {
    if (this.a) {
      int k = b() << 8 & 0xFF00;
      int m = b() & 0xFF;
      return k | m;
    } 
    int i = b() & 0xFF;
    int j = 0xFF00 & b() << 8;
    return i | j;
  }
  
  public long i() {
    if (this.a)
      return 0xFF000000L & b() << 24L | 0xFF0000L & b() << 16L | b() << 8L & 0xFF00L | b() & 0xFFL; 
    long l1 = b();
    long l2 = b();
    long l3 = b();
    return 0xFF000000L & b() << 24L | 0xFF0000L & l3 << 16L | 0xFF00L & l2 << 8L | 0xFFL & l1;
  }
  
  public short j() {
    return (short)(b() & 0xFF);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/b/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */