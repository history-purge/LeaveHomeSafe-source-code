package e.f.a.c.i;

import e.f.a.c.i.u.b.b;
import e.f.a.c.i.u.b.d;
import java.util.concurrent.Executor;

public final class k implements b<Executor> {
  public static k a() {
    return a.a();
  }
  
  public static Executor b() {
    Executor executor = j.a();
    d.a(executor, "Cannot return null from a non-@Nullable @Provides method");
    return executor;
  }
  
  public Executor get() {
    return b();
  }
  
  private static final class a {
    private static final k a = new k();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/c/i/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */