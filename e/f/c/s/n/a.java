package e.f.c.s.n;

public final class a {
  public static final a h = new a(4201, 4096, 1);
  
  public static final a i = new a(1033, 1024, 1);
  
  public static final a j = new a(67, 64, 1);
  
  public static final a k = new a(19, 16, 1);
  
  public static final a l = new a(285, 256, 0);
  
  public static final a m;
  
  public static final a n;
  
  public static final a o = j;
  
  private final int[] a;
  
  private final int[] b;
  
  private final b c;
  
  private final b d;
  
  private final int e;
  
  private final int f;
  
  private final int g;
  
  public a(int paramInt1, int paramInt2, int paramInt3) {
    this.f = paramInt1;
    this.e = paramInt2;
    this.g = paramInt3;
    this.a = new int[paramInt2];
    this.b = new int[paramInt2];
    int i = 0;
    paramInt3 = 1;
    while (i < paramInt2) {
      this.a[i] = paramInt3;
      int j = paramInt3 << 1;
      paramInt3 = j;
      if (j >= paramInt2)
        paramInt3 = (j ^ paramInt1) & paramInt2 - 1; 
      i++;
    } 
    for (paramInt1 = 0; paramInt1 < paramInt2 - 1; paramInt1++)
      this.b[this.a[paramInt1]] = paramInt1; 
    this.c = new b(this, new int[] { 0 });
    this.d = new b(this, new int[] { 1 });
  }
  
  static int c(int paramInt1, int paramInt2) {
    return paramInt1 ^ paramInt2;
  }
  
  public int a() {
    return this.g;
  }
  
  int a(int paramInt) {
    return this.a[paramInt];
  }
  
  b a(int paramInt1, int paramInt2) {
    if (paramInt1 >= 0) {
      if (paramInt2 == 0)
        return this.c; 
      int[] arrayOfInt = new int[paramInt1 + 1];
      arrayOfInt[0] = paramInt2;
      return new b(this, arrayOfInt);
    } 
    throw new IllegalArgumentException();
  }
  
  int b(int paramInt) {
    if (paramInt != 0)
      return this.a[this.e - this.b[paramInt] - 1]; 
    throw new ArithmeticException();
  }
  
  int b(int paramInt1, int paramInt2) {
    if (paramInt1 == 0 || paramInt2 == 0)
      return 0; 
    int[] arrayOfInt1 = this.a;
    int[] arrayOfInt2 = this.b;
    return arrayOfInt1[(arrayOfInt2[paramInt1] + arrayOfInt2[paramInt2]) % (this.e - 1)];
  }
  
  b b() {
    return this.d;
  }
  
  public int c() {
    return this.e;
  }
  
  int c(int paramInt) {
    if (paramInt != 0)
      return this.b[paramInt]; 
    throw new IllegalArgumentException();
  }
  
  b d() {
    return this.c;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder("GF(0x");
    stringBuilder.append(Integer.toHexString(this.f));
    stringBuilder.append(',');
    stringBuilder.append(this.e);
    stringBuilder.append(')');
    return stringBuilder.toString();
  }
  
  static {
    a a1 = new a(301, 256, 1);
    m = a1;
    n = a1;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/s/n/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */