package e.d.b;

import e.d.c.h;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public abstract class k {
  private boolean a = true;
  
  public abstract long a();
  
  public String a(int paramInt1, int paramInt2, String paramString) {
    byte[] arrayOfByte = a(paramInt1, paramInt2);
    try {
      return new String(arrayOfByte, paramString);
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      return new String(arrayOfByte);
    } 
  }
  
  public String a(int paramInt1, int paramInt2, Charset paramCharset) {
    return new String(b(paramInt1, paramInt2), paramCharset.name());
  }
  
  public void a(boolean paramBoolean) {
    this.a = paramBoolean;
  }
  
  public boolean a(int paramInt) {
    int i = paramInt / 8;
    c(i, 1);
    return ((b(i) >> paramInt % 8 & 0x1) == 1);
  }
  
  public abstract byte[] a(int paramInt1, int paramInt2);
  
  public abstract byte b(int paramInt);
  
  public h b(int paramInt1, int paramInt2, Charset paramCharset) {
    return new h(b(paramInt1, paramInt2), paramCharset);
  }
  
  public boolean b() {
    return this.a;
  }
  
  public byte[] b(int paramInt1, int paramInt2) {
    byte[] arrayOfByte1 = a(paramInt1, paramInt2);
    for (paramInt1 = 0; paramInt1 < arrayOfByte1.length && arrayOfByte1[paramInt1] != 0; paramInt1++);
    if (paramInt1 == paramInt2)
      return arrayOfByte1; 
    byte[] arrayOfByte2 = new byte[paramInt1];
    if (paramInt1 > 0)
      System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, paramInt1); 
    return arrayOfByte2;
  }
  
  public double c(int paramInt) {
    return Double.longBitsToDouble(h(paramInt));
  }
  
  public String c(int paramInt1, int paramInt2, Charset paramCharset) {
    return new String(a(paramInt1, paramInt2), paramCharset.name());
  }
  
  protected abstract void c(int paramInt1, int paramInt2);
  
  public float d(int paramInt) {
    return Float.intBitsToFloat(g(paramInt));
  }
  
  public h d(int paramInt1, int paramInt2, Charset paramCharset) {
    return new h(a(paramInt1, paramInt2), paramCharset);
  }
  
  public short e(int paramInt) {
    c(paramInt, 2);
    if (this.a) {
      int j = (short)b(paramInt) << 8 & 0xFFFFFF00;
      return (short)((short)b(++paramInt) & 0xFF | j);
    } 
    int i = (short)b(paramInt + 1) << 8 & 0xFFFFFF00;
    return (short)((short)b(paramInt) & 0xFF | i);
  }
  
  public int f(int paramInt) {
    c(paramInt, 3);
    if (this.a) {
      int j = b(paramInt) << 16 & 0xFF0000 | 0xFF00 & b(paramInt + 1) << 8;
      paramInt += 2;
      return b(paramInt) & 0xFF | j;
    } 
    int i = b(paramInt + 2) << 16 & 0xFF0000 | 0xFF00 & b(paramInt + 1) << 8;
    return b(paramInt) & 0xFF | i;
  }
  
  public int g(int paramInt) {
    c(paramInt, 4);
    if (this.a) {
      int j = b(paramInt) << 24 & 0xFF000000 | 0xFF0000 & b(paramInt + 1) << 16 | 0xFF00 & b(paramInt + 2) << 8;
      paramInt += 3;
      return b(paramInt) & 0xFF | j;
    } 
    int i = b(paramInt + 3) << 24 & 0xFF000000 | 0xFF0000 & b(paramInt + 2) << 16 | 0xFF00 & b(paramInt + 1) << 8;
    return b(paramInt) & 0xFF | i;
  }
  
  public long h(int paramInt) {
    c(paramInt, 8);
    if (this.a) {
      long l1 = b(paramInt) << 56L & 0xFF00000000000000L | 0xFF000000000000L & b(paramInt + 1) << 48L | 0xFF0000000000L & b(paramInt + 2) << 40L | 0xFF00000000L & b(paramInt + 3) << 32L | b(paramInt + 4) << 24L & 0xFF000000L | b(paramInt + 5) << 16L & 0xFF0000L | b(paramInt + 6) << 8L & 0xFF00L;
      paramInt = b(paramInt + 7);
      return l1 | paramInt & 0xFFL;
    } 
    long l = b(paramInt + 7) << 56L & 0xFF00000000000000L | 0xFF000000000000L & b(paramInt + 6) << 48L | 0xFF0000000000L & b(paramInt + 5) << 40L | 0xFF00000000L & b(paramInt + 4) << 32L | b(paramInt + 3) << 24L & 0xFF000000L | b(paramInt + 2) << 16L & 0xFF0000L | b(paramInt + 1) << 8L & 0xFF00L;
    paramInt = b(paramInt);
    return l | paramInt & 0xFFL;
  }
  
  public byte i(int paramInt) {
    c(paramInt, 1);
    return b(paramInt);
  }
  
  public float j(int paramInt) {
    c(paramInt, 4);
    if (this.a) {
      float f1 = ((b(paramInt) & 0xFF) << 8 | b(paramInt + 1) & 0xFF);
      int j = (b(paramInt + 2) & 0xFF) << 8;
      paramInt += 3;
      paramInt = b(paramInt);
      double d3 = f1;
      double d4 = (paramInt & 0xFF | j);
      Double.isNaN(d4);
      d4 /= 65536.0D;
      Double.isNaN(d3);
      return (float)(d3 + d4);
    } 
    float f = ((b(paramInt + 3) & 0xFF) << 8 | b(paramInt + 2) & 0xFF);
    int i = (b(paramInt + 1) & 0xFF) << 8;
    paramInt = b(paramInt);
    double d1 = f;
    double d2 = (paramInt & 0xFF | i);
    Double.isNaN(d2);
    d2 /= 65536.0D;
    Double.isNaN(d1);
    return (float)(d1 + d2);
  }
  
  public int k(int paramInt) {
    c(paramInt, 2);
    if (this.a) {
      int j = b(paramInt) << 8 & 0xFF00;
      return b(++paramInt) & 0xFF | j;
    } 
    int i = b(paramInt + 1) << 8 & 0xFF00;
    return b(paramInt) & 0xFF | i;
  }
  
  public long l(int paramInt) {
    c(paramInt, 4);
    if (this.a) {
      long l3 = b(paramInt);
      long l4 = b(paramInt + 1);
      l3 = 0xFF00L & b(paramInt + 2) << 8L | 0xFF0000L & l4 << 16L | 0xFF000000L & l3 << 24L;
      paramInt += 3;
      return 0xFFL & b(paramInt) | l3;
    } 
    long l1 = b(paramInt + 3);
    long l2 = b(paramInt + 2);
    l1 = 0xFF00L & b(paramInt + 1) << 8L | 0xFF0000L & l2 << 16L | 0xFF000000L & l1 << 24L;
    return 0xFFL & b(paramInt) | l1;
  }
  
  public short m(int paramInt) {
    c(paramInt, 1);
    return (short)(b(paramInt) & 0xFF);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/b/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */