package e.f.a.e.m;

import java.util.concurrent.Executor;

final class x<TResult> implements g0<TResult> {
  private final Executor a;
  
  private final Object b = new Object();
  
  private f<TResult> c;
  
  public x(Executor paramExecutor, f<TResult> paramf) {
    this.a = paramExecutor;
    this.c = paramf;
  }
  
  public final void a(l<TResult> paraml) {
    synchronized (this.b) {
      if (this.c == null)
        return; 
      this.a.execute(new y(this, paraml));
      return;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/m/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */