package e.f.a.e.i.d;

import java.nio.charset.Charset;

class h0 extends g0 {
  protected final byte[] zzfp;
  
  h0(byte[] paramArrayOfbyte) {
    this.zzfp = paramArrayOfbyte;
  }
  
  public byte a(int paramInt) {
    return this.zzfp[paramInt];
  }
  
  protected final int a(int paramInt1, int paramInt2, int paramInt3) {
    return h1.a(paramInt1, this.zzfp, d(), paramInt3);
  }
  
  public final a0 a(int paramInt1, int paramInt2) {
    paramInt1 = a0.b(0, paramInt2, size());
    return (paramInt1 == 0) ? a0.c : new d0(this.zzfp, d(), paramInt1);
  }
  
  protected final String a(Charset paramCharset) {
    return new String(this.zzfp, d(), size(), paramCharset);
  }
  
  final void a(z paramz) {
    paramz.a(this.zzfp, d(), size());
  }
  
  public final boolean a() {
    int i = d();
    return c4.a(this.zzfp, i, size() + i);
  }
  
  final boolean a(a0 parama0, int paramInt1, int paramInt2) {
    if (paramInt2 <= parama0.size()) {
      if (paramInt2 <= parama0.size()) {
        if (parama0 instanceof h0) {
          parama0 = parama0;
          byte[] arrayOfByte1 = this.zzfp;
          byte[] arrayOfByte2 = ((h0)parama0).zzfp;
          int j = d();
          int i = d();
          for (paramInt1 = parama0.d(); i < j + paramInt2; paramInt1++) {
            if (arrayOfByte1[i] != arrayOfByte2[paramInt1])
              return false; 
            i++;
          } 
          return true;
        } 
        return parama0.a(0, paramInt2).equals(a(0, paramInt2));
      } 
      paramInt1 = parama0.size();
      StringBuilder stringBuilder1 = new StringBuilder(59);
      stringBuilder1.append("Ran off end of other: 0, ");
      stringBuilder1.append(paramInt2);
      stringBuilder1.append(", ");
      stringBuilder1.append(paramInt1);
      throw new IllegalArgumentException(stringBuilder1.toString());
    } 
    paramInt1 = size();
    StringBuilder stringBuilder = new StringBuilder(40);
    stringBuilder.append("Length too large: ");
    stringBuilder.append(paramInt2);
    stringBuilder.append(paramInt1);
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
    throw illegalArgumentException;
  }
  
  protected int d() {
    return 0;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof a0))
      return false; 
    if (size() != ((a0)paramObject).size())
      return false; 
    if (size() == 0)
      return true; 
    if (paramObject instanceof h0) {
      paramObject = paramObject;
      int i = b();
      int j = paramObject.b();
      return (i != 0 && j != 0 && i != j) ? false : a((a0)paramObject, 0, size());
    } 
    return paramObject.equals(this);
  }
  
  public int size() {
    return this.zzfp.length;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/h0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */