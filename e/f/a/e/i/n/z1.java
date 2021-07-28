package e.f.a.e.i.n;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

public abstract class z1 implements Serializable, Iterable<Byte> {
  static {
    if (r1.a()) {
      j2 j2 = new j2(null);
    } else {
      d2 = new d2(null);
    } 
    d = d2;
    new b2();
  }
  
  static i2 a(int paramInt) {
    return new i2(paramInt, null);
  }
  
  public static z1 a(String paramString) {
    return new k2(paramString.getBytes(l3.a));
  }
  
  public static z1 a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    b(paramInt1, paramInt1 + paramInt2, paramArrayOfbyte.length);
    return new k2(d.a(paramArrayOfbyte, paramInt1, paramInt2));
  }
  
  private static int b(byte paramByte) {
    return paramByte & 0xFF;
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
  
  protected abstract int a(int paramInt1, int paramInt2, int paramInt3);
  
  public abstract z1 a(int paramInt1, int paramInt2);
  
  protected abstract String a(Charset paramCharset);
  
  abstract void a(w1 paramw1);
  
  public abstract boolean a();
  
  public abstract boolean equals(Object paramObject);
  
  public abstract byte f(int paramInt);
  
  protected final int f() {
    return this.zzc;
  }
  
  abstract byte g(int paramInt);
  
  public final int hashCode() {
    int j = this.zzc;
    int i = j;
    if (j == 0) {
      i = zza();
      j = a(i, 0, i);
      i = j;
      if (j == 0)
        i = 1; 
      this.zzc = i;
    } 
    return i;
  }
  
  public final String toString() {
    String str1;
    Locale locale = Locale.ROOT;
    String str2 = Integer.toHexString(System.identityHashCode(this));
    int i = zza();
    if (zza() <= 50) {
      str1 = w5.a(this);
    } else {
      str1 = String.valueOf(w5.a(a(0, 47))).concat("...");
    } 
    return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", new Object[] { str2, Integer.valueOf(i), str1 });
  }
  
  public abstract int zza();
  
  public final String zzb() {
    Charset charset = l3.a;
    return (zza() == 0) ? "" : a(charset);
  }
  
  static {
    d2 d2;
  }
  
  public static final z1 c = new k2(l3.b);
  
  private static final f2 d;
  
  private int zzc = 0;
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/z1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */