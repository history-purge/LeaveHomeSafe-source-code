package e.f.a.e.m;

import java.util.concurrent.Executor;

final class a0<TResult> implements g0<TResult> {
  private final Executor a;
  
  private final Object b = new Object();
  
  private g c;
  
  public a0(Executor paramExecutor, g paramg) {
    this.a = paramExecutor;
    this.c = paramg;
  }
  
  public final void a(l<TResult> paraml) {
    if (!paraml.e() && !paraml.c())
      synchronized (this.b) {
        if (this.c == null)
          return; 
        this.a.execute(new z(this, paraml));
        return;
      }  
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/m/a0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */