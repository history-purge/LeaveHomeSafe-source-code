package e.f.a.e.m;

import java.util.concurrent.Executor;

final class r<TResult, TContinuationResult> implements g0<TResult> {
  private final Executor a;
  
  private final c<TResult, TContinuationResult> b;
  
  private final j0<TContinuationResult> c;
  
  public r(Executor paramExecutor, c<TResult, TContinuationResult> paramc, j0<TContinuationResult> paramj0) {
    this.a = paramExecutor;
    this.b = paramc;
    this.c = paramj0;
  }
  
  public final void a(l<TResult> paraml) {
    this.a.execute(new t(this, paraml));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/m/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */