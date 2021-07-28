package e.f.a.e.m;

import java.util.concurrent.Executor;

final class b0<TResult> implements g0<TResult> {
  private final Executor a;
  
  private final Object b = new Object();
  
  private h<? super TResult> c;
  
  public b0(Executor paramExecutor, h<? super TResult> paramh) {
    this.a = paramExecutor;
    this.c = paramh;
  }
  
  public final void a(l<TResult> paraml) {
    if (paraml.e())
      synchronized (this.b) {
        if (this.c == null)
          return; 
        this.a.execute(new c0(this, paraml));
        return;
      }  
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/m/b0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */