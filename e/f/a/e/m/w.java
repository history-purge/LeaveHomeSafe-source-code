package e.f.a.e.m;

import java.util.concurrent.Executor;

final class w<TResult> implements g0<TResult> {
  private final Executor a;
  
  private final Object b = new Object();
  
  private e c;
  
  public w(Executor paramExecutor, e parame) {
    this.a = paramExecutor;
    this.c = parame;
  }
  
  public final void a(l<TResult> paraml) {
    if (paraml.c())
      synchronized (this.b) {
        if (this.c == null)
          return; 
        this.a.execute(new v(this));
        return;
      }  
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/m/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */