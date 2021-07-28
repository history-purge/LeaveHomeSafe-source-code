package e.f.a.e.i.d;

final class l0 extends j0 {
  private int a;
  
  private int b;
  
  private int c;
  
  private int d;
  
  private int e = Integer.MAX_VALUE;
  
  private l0(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, boolean paramBoolean) {
    super(null);
    this.a = paramInt2 + paramInt1;
    this.c = paramInt1;
    this.d = this.c;
  }
  
  public final int a() {
    return this.c - this.d;
  }
  
  public final int b(int paramInt) {
    if (paramInt >= 0) {
      int i = paramInt + a();
      paramInt = this.e;
      if (i <= paramInt) {
        this.e = i;
        this.a += this.b;
        i = this.a;
        int j = i - this.d;
        int k = this.e;
        if (j > k) {
          this.b = j - k;
          this.a = i - this.b;
          return paramInt;
        } 
        this.b = 0;
        return paramInt;
      } 
      throw l1.a();
    } 
    throw new l1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/l0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */