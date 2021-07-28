package e.f.a.e.i.d;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;

public abstract class a0 implements Serializable, Iterable<Byte> {
  static {
    if (u.a()) {
      i0 i0 = new i0(null);
    } else {
      c0 = new c0(null);
    } 
    d = c0;
  }
  
  public static a0 a(String paramString) {
    return new h0(paramString.getBytes(h1.a));
  }
  
  public static a0 a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    return new h0(d.a(paramArrayOfbyte, paramInt1, paramInt2));
  }
  
  static int b(int paramInt1, int paramInt2, int paramInt3) {
    int i = paramInt2 - paramInt1;
    if ((paramInt1 | paramInt2 | i | paramInt3 - paramInt2) < 0) {
      if (paramInt1 >= 0) {
        if (paramInt2 < paramInt1) {
          StringBuilder stringBuilder2 = new StringBuilder(66);
          stringBuilder2.append("Beginning index larger than ending index: ");
          stringBuilder2.append(paramInt1);
          stringBuilder2.append(", ");
          stringBuilder2.append(paramInt2);
          throw new IndexOutOfBoundsException(stringBuilder2.toString());
        } 
        StringBuilder stringBuilder1 = new StringBuilder(37);
        stringBuilder1.append("End index: ");
        stringBuilder1.append(paramInt2);
        stringBuilder1.append(" >= ");
        stringBuilder1.append(paramInt3);
        throw new IndexOutOfBoundsException(stringBuilder1.toString());
      } 
      StringBuilder stringBuilder = new StringBuilder(32);
      stringBuilder.append("Beginning index: ");
      stringBuilder.append(paramInt1);
      stringBuilder.append(" < 0");
      throw new IndexOutOfBoundsException(stringBuilder.toString());
    } 
    return i;
  }
  
  static f0 b(int paramInt) {
    return new f0(paramInt, null);
  }
  
  public abstract byte a(int paramInt);
  
  protected abstract int a(int paramInt1, int paramInt2, int paramInt3);
  
  public abstract a0 a(int paramInt1, int paramInt2);
  
  protected abstract String a(Charset paramCharset);
  
  abstract void a(z paramz);
  
  public abstract boolean a();
  
  protected final int b() {
    return this.zzfk;
  }
  
  public final String c() {
    Charset charset = h1.a;
    return (size() == 0) ? "" : a(charset);
  }
  
  public abstract boolean equals(Object paramObject);
  
  public final int hashCode() {
    int j = this.zzfk;
    int i = j;
    if (j == 0) {
      i = size();
      j = a(i, 0, i);
      i = j;
      if (j == 0)
        i = 1; 
      this.zzfk = i;
    } 
    return i;
  }
  
  public abstract int size();
  
  public final String toString() {
    return String.format("<ByteString@%s size=%d>", new Object[] { Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()) });
  }
  
  static {
    c0 c0;
  }
  
  public static final a0 c = new h0(h1.b);
  
  private static final e0 d;
  
  private int zzfk = 0;
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/a0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */