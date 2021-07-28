package e.e.l.k;

public class f implements g {
  public static final g d = a(2147483647, true, true);
  
  int a;
  
  boolean b;
  
  boolean c;
  
  private f(int paramInt, boolean paramBoolean1, boolean paramBoolean2) {
    this.a = paramInt;
    this.b = paramBoolean1;
    this.c = paramBoolean2;
  }
  
  public static g a(int paramInt, boolean paramBoolean1, boolean paramBoolean2) {
    return new f(paramInt, paramBoolean1, paramBoolean2);
  }
  
  public boolean a() {
    return this.c;
  }
  
  public boolean b() {
    return this.b;
  }
  
  public int c() {
    return this.a;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof f))
      return false; 
    paramObject = paramObject;
    return (this.a == ((f)paramObject).a && this.b == ((f)paramObject).b && this.c == ((f)paramObject).c);
  }
  
  public int hashCode() {
    byte b;
    int j = this.a;
    boolean bool = this.b;
    int i = 0;
    if (bool) {
      b = 4194304;
    } else {
      b = 0;
    } 
    if (this.c)
      i = 8388608; 
    return j ^ b ^ i;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/k/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */