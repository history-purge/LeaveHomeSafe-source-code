package e.f.a.c.i.x.j;

import e.f.a.c.i.u.b.b;
import e.f.a.c.i.u.b.d;

public final class b0 implements b<String> {
  public static b0 a() {
    return a.a();
  }
  
  public static String b() {
    String str = a0.a();
    d.a(str, "Cannot return null from a non-@Nullable @Provides method");
    return str;
  }
  
  public String get() {
    return b();
  }
  
  private static final class a {
    private static final b0 a = new b0();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/c/i/x/j/b0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */