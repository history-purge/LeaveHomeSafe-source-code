package e.f.c.x.d.k;

public final class b {
  public static final b f = new b(929, 3);
  
  private final int[] a;
  
  private final int[] b;
  
  private final c c;
  
  private final c d;
  
  private final int e;
  
  private b(int paramInt1, int paramInt2) {
    this.e = paramInt1;
    this.a = new int[paramInt1];
    this.b = new int[paramInt1];
    int i = 0;
    int j = 1;
    while (i < paramInt1) {
      this.a[i] = j;
      j = j * paramInt2 % paramInt1;
      i++;
    } 
    for (paramInt2 = 0; paramInt2 < paramInt1 - 1; paramInt2++)
      this.b[this.a[paramInt2]] = paramInt2; 
    this.c = new c(this, new int[] { 0 });
    this.d = new c(this, new int[] { 1 });
  }
  
  int a(int paramInt) {
    return this.a[paramInt];
  }
  
  int a(int paramInt1, int paramInt2) {
    return (paramInt1 + paramInt2) % this.e;
  }
  
  c a() {
    return this.d;
  }
  
  int b() {
    return this.e;
  }
  
  int b(int paramInt) {
    if (paramInt != 0)
      return this.a[this.e - this.b[paramInt] - 1]; 
    throw new ArithmeticException();
  }
  
  c b(int paramInt1, int paramInt2) {
    if (paramInt1 >= 0) {
      if (paramInt2 == 0)
        return this.c; 
      int[] arrayOfInt = new int[paramInt1 + 1];
      arrayOfInt[0] = paramInt2;
      return new c(this, arrayOfInt);
    } 
    throw new IllegalArgumentException();
  }
  
  int c(int paramInt) {
    if (paramInt != 0)
      return this.b[paramInt]; 
    throw new IllegalArgumentException();
  }
  
  int c(int paramInt1, int paramInt2) {
    if (paramInt1 == 0 || paramInt2 == 0)
      return 0; 
    int[] arrayOfInt1 = this.a;
    int[] arrayOfInt2 = this.b;
    return arrayOfInt1[(arrayOfInt2[paramInt1] + arrayOfInt2[paramInt2]) % (this.e - 1)];
  }
  
  c c() {
    return this.c;
  }
  
  int d(int paramInt1, int paramInt2) {
    int i = this.e;
    return (paramInt1 + i - paramInt2) % i;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/x/d/k/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */