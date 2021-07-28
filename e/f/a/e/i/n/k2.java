package e.f.a.e.i.n;

import java.nio.charset.Charset;

class k2 extends h2 {
  protected final byte[] zzb;
  
  k2(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte != null) {
      this.zzb = paramArrayOfbyte;
      return;
    } 
    throw new NullPointerException();
  }
  
  protected final int a(int paramInt1, int paramInt2, int paramInt3) {
    return l3.a(paramInt1, this.zzb, e(), paramInt3);
  }
  
  public final z1 a(int paramInt1, int paramInt2) {
    paramInt1 = z1.b(0, paramInt2, zza());
    return (paramInt1 == 0) ? z1.c : new c2(this.zzb, e(), paramInt1);
  }
  
  protected final String a(Charset paramCharset) {
    return new String(this.zzb, e(), zza(), paramCharset);
  }
  
  final void a(w1 paramw1) {
    paramw1.a(this.zzb, e(), zza());
  }
  
  public final boolean a() {
    int i = e();
    return k6.a(this.zzb, i, zza() + i);
  }
  
  final boolean a(z1 paramz1, int paramInt1, int paramInt2) {
    if (paramInt2 <= paramz1.zza()) {
      if (paramInt2 <= paramz1.zza()) {
        if (paramz1 instanceof k2) {
          paramz1 = paramz1;
          byte[] arrayOfByte1 = this.zzb;
          byte[] arrayOfByte2 = ((k2)paramz1).zzb;
          int j = e();
          int i = e();
          for (paramInt1 = paramz1.e(); i < j + paramInt2; paramInt1++) {
            if (arrayOfByte1[i] != arrayOfByte2[paramInt1])
              return false; 
            i++;
          } 
          return true;
        } 
        return paramz1.a(0, paramInt2).equals(a(0, paramInt2));
      } 
      paramInt1 = paramz1.zza();
      StringBuilder stringBuilder1 = new StringBuilder(59);
      stringBuilder1.append("Ran off end of other: 0, ");
      stringBuilder1.append(paramInt2);
      stringBuilder1.append(", ");
      stringBuilder1.append(paramInt1);
      throw new IllegalArgumentException(stringBuilder1.toString());
    } 
    paramInt1 = zza();
    StringBuilder stringBuilder = new StringBuilder(40);
    stringBuilder.append("Length too large: ");
    stringBuilder.append(paramInt2);
    stringBuilder.append(paramInt1);
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
    throw illegalArgumentException;
  }
  
  protected int e() {
    return 0;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof z1))
      return false; 
    if (zza() != ((z1)paramObject).zza())
      return false; 
    if (zza() == 0)
      return true; 
    if (paramObject instanceof k2) {
      paramObject = paramObject;
      int i = f();
      int j = paramObject.f();
      return (i != 0 && j != 0 && i != j) ? false : a((z1)paramObject, 0, zza());
    } 
    return paramObject.equals(this);
  }
  
  public byte f(int paramInt) {
    return this.zzb[paramInt];
  }
  
  byte g(int paramInt) {
    return this.zzb[paramInt];
  }
  
  public int zza() {
    return this.zzb.length;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/k2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */