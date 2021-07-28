package e.f.a.c.i.z;

import e.f.a.c.i.u.b.b;
import e.f.a.c.i.u.b.d;

public final class c implements b<a> {
  public static c a() {
    return a.a();
  }
  
  public static a b() {
    a a = b.a();
    d.a(a, "Cannot return null from a non-@Nullable @Provides method");
    return a;
  }
  
  public a get() {
    return b();
  }
  
  private static final class a {
    private static final c a = new c();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/c/i/z/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */