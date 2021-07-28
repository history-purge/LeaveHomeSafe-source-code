package e.f.a.e.i.n;

final class n2 extends m2 {
  private int a;
  
  private int b;
  
  private int c;
  
  private int d;
  
  private int e = Integer.MAX_VALUE;
  
  private n2(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, boolean paramBoolean) {
    super(null);
    this.a = paramInt2 + paramInt1;
    this.c = paramInt1;
    this.d = this.c;
  }
  
  private final void b() {
    this.a += this.b;
    int i = this.a;
    int j = i - this.d;
    int k = this.e;
    if (j > k) {
      this.b = j - k;
      this.a = i - this.b;
      return;
    } 
    this.b = 0;
  }
  
  public final int a() {
    return this.c - this.d;
  }
  
  public final int b(int paramInt) {
    if (paramInt >= 0) {
      paramInt += a();
      int i = this.e;
      if (paramInt <= i) {
        this.e = paramInt;
        b();
        return i;
      } 
      throw q3.a();
    } 
    throw q3.b();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/n2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */