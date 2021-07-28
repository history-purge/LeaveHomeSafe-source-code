package e.f.a.e.m;

import java.util.concurrent.Executor;

final class e0<TResult, TContinuationResult> implements e, g, h<TContinuationResult>, g0<TResult> {
  private final Executor a;
  
  private final k<TResult, TContinuationResult> b;
  
  private final j0<TContinuationResult> c;
  
  public e0(Executor paramExecutor, k<TResult, TContinuationResult> paramk, j0<TContinuationResult> paramj0) {
    this.a = paramExecutor;
    this.b = paramk;
    this.c = paramj0;
  }
  
  public final void a() {
    this.c.f();
  }
  
  public final void a(l<TResult> paraml) {
    this.a.execute(new d0(this, paraml));
  }
  
  public final void a(Exception paramException) {
    this.c.a(paramException);
  }
  
  public final void a(TContinuationResult paramTContinuationResult) {
    this.c.a(paramTContinuationResult);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/m/e0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */