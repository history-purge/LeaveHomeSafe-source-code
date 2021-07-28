package e.f.a.e.i.d;

final class d0 extends h0 {
  private final int zzfm;
  
  private final int zzfn;
  
  d0(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    super(paramArrayOfbyte);
    a0.b(paramInt1, paramInt1 + paramInt2, paramArrayOfbyte.length);
    this.zzfm = paramInt1;
    this.zzfn = paramInt2;
  }
  
  public final byte a(int paramInt) {
    int i = size();
    if ((i - paramInt + 1 | paramInt) < 0) {
      if (paramInt < 0) {
        StringBuilder stringBuilder1 = new StringBuilder(22);
        stringBuilder1.append("Index < 0: ");
        stringBuilder1.append(paramInt);
        throw new ArrayIndexOutOfBoundsException(stringBuilder1.toString());
      } 
      StringBuilder stringBuilder = new StringBuilder(40);
      stringBuilder.append("Index > length: ");
      stringBuilder.append(paramInt);
      stringBuilder.append(", ");
      stringBuilder.append(i);
      throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
    } 
    return this.zzfp[this.zzfm + paramInt];
  }
  
  protected final int d() {
    return this.zzfm;
  }
  
  public final int size() {
    return this.zzfn;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/d0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */