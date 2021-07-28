package e.f.c.y.b;

public enum f {
  c(1),
  d(0),
  e(3),
  f(2);
  
  private static final f[] g;
  
  private final int bits;
  
  static {
    f f1 = c;
    f f2 = d;
    f f3 = e;
    f f4 = f;
    h = new f[] { f1, f2, f3, f4 };
    g = new f[] { f2, f1, f4, f3 };
  }
  
  f(int paramInt1) {
    this.bits = paramInt1;
  }
  
  public static f f(int paramInt) {
    if (paramInt >= 0) {
      f[] arrayOfF = g;
      if (paramInt < arrayOfF.length)
        return arrayOfF[paramInt]; 
    } 
    throw new IllegalArgumentException();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/y/b/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */