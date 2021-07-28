package e.e.l.e;

import e.e.e.k.b;

public class f {
  private static final f c = new f(-1, false);
  
  private static final f d = new f(-2, false);
  
  private static final f e = new f(-1, true);
  
  private final int a;
  
  private final boolean b;
  
  private f(int paramInt, boolean paramBoolean) {
    this.a = paramInt;
    this.b = paramBoolean;
  }
  
  public static f e() {
    return c;
  }
  
  public static f f() {
    return e;
  }
  
  public static f g() {
    return d;
  }
  
  public boolean a() {
    return this.b;
  }
  
  public int b() {
    if (!d())
      return this.a; 
    throw new IllegalStateException("Rotation is set to use EXIF");
  }
  
  public boolean c() {
    return (this.a != -2);
  }
  
  public boolean d() {
    return (this.a == -1);
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof f))
      return false; 
    paramObject = paramObject;
    return (this.a == ((f)paramObject).a && this.b == ((f)paramObject).b);
  }
  
  public int hashCode() {
    return b.a(Integer.valueOf(this.a), Boolean.valueOf(this.b));
  }
  
  public String toString() {
    return String.format(null, "%d defer:%b", new Object[] { Integer.valueOf(this.a), Boolean.valueOf(this.b) });
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/e/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */