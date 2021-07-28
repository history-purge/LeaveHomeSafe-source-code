package e.f.a.e.i.n;

final class h5 implements p4 {
  private final r4 a;
  
  private final String b;
  
  private final Object[] c;
  
  private final int d;
  
  h5(r4 paramr4, String paramString, Object[] paramArrayOfObject) {
    this.a = paramr4;
    this.b = paramString;
    this.c = paramArrayOfObject;
    char c = paramString.charAt(0);
    if (c < '?') {
      this.d = c;
      return;
    } 
    int j = c & 0x1FFF;
    int i = 13;
    c = '\001';
    while (true) {
      char c1 = paramString.charAt(c);
      if (c1 >= '?') {
        j |= (c1 & 0x1FFF) << i;
        i += 13;
        int k = c + 1;
        continue;
      } 
      this.d = j | c1 << i;
      return;
    } 
  }
  
  final String a() {
    return this.b;
  }
  
  final Object[] b() {
    return this.c;
  }
  
  public final r4 g() {
    return this.a;
  }
  
  public final int zza() {
    return ((this.d & 0x1) == 1) ? f5.a : f5.b;
  }
  
  public final boolean zzb() {
    return ((this.d & 0x2) == 2);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/h5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */