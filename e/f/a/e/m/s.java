package e.f.a.e.m;

import java.util.concurrent.Executor;

final class s<TResult, TContinuationResult> implements e, g, h<TContinuationResult>, g0<TResult> {
  private final Executor a;
  
  private final c<TResult, l<TContinuationResult>> b;
  
  private final j0<TContinuationResult> c;
  
  public s(Executor paramExecutor, c<TResult, l<TContinuationResult>> paramc, j0<TContinuationResult> paramj0) {
    this.a = paramExecutor;
    this.b = paramc;
    this.c = paramj0;
  }
  
  public final void a() {
    this.c.f();
  }
  
  public final void a(l<TResult> paraml) {
    this.a.execute(new u(this, paraml));
  }
  
  public final void a(Exception paramException) {
    this.c.a(paramException);
  }
  
  public final void a(TContinuationResult paramTContinuationResult) {
    this.c.a(paramTContinuationResult);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/m/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */