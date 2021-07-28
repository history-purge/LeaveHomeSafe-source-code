package e.f.a.e.i.n;

final class c2 extends k2 {
  private final int zzc;
  
  private final int zzd;
  
  c2(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    super(paramArrayOfbyte);
    z1.b(paramInt1, paramInt1 + paramInt2, paramArrayOfbyte.length);
    this.zzc = paramInt1;
    this.zzd = paramInt2;
  }
  
  protected final int e() {
    return this.zzc;
  }
  
  public final byte f(int paramInt) {
    int i = zza();
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
    return this.zzb[this.zzc + paramInt];
  }
  
  final byte g(int paramInt) {
    return this.zzb[this.zzc + paramInt];
  }
  
  public final int zza() {
    return this.zzd;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/c2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */