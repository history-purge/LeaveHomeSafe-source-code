package e.e.l.f;

import e.e.c.b.d;
import e.e.c.b.e;
import e.e.c.b.i;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class c implements g {
  private d a;
  
  public c(d paramd) {
    this.a = paramd;
  }
  
  public static e a(e.e.c.b.c paramc, d paramd) {
    return a(paramc, paramd, Executors.newSingleThreadExecutor());
  }
  
  public static e a(e.e.c.b.c paramc, d paramd, Executor paramExecutor) {
    e.c c1 = new e.c(paramc.k(), paramc.j(), paramc.f());
    return new e(paramd, paramc.h(), c1, paramc.d(), paramc.c(), paramc.g(), paramc.e(), paramExecutor, paramc.i());
  }
  
  public i a(e.e.c.b.c paramc) {
    return (i)a(paramc, this.a.a(paramc));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/f/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */