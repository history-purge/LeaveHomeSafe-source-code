package e.f.a.e.m;

import java.util.concurrent.Executor;

public abstract class l<TResult> {
  public <TContinuationResult> l<TContinuationResult> a(c<TResult, TContinuationResult> paramc) {
    throw new UnsupportedOperationException("continueWith is not implemented");
  }
  
  public l<TResult> a(f<TResult> paramf) {
    throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
  }
  
  public abstract l<TResult> a(g paramg);
  
  public abstract l<TResult> a(h<? super TResult> paramh);
  
  public <TContinuationResult> l<TContinuationResult> a(k<TResult, TContinuationResult> paramk) {
    throw new UnsupportedOperationException("onSuccessTask is not implemented");
  }
  
  public <TContinuationResult> l<TContinuationResult> a(Executor paramExecutor, c<TResult, TContinuationResult> paramc) {
    throw new UnsupportedOperationException("continueWith is not implemented");
  }
  
  public l<TResult> a(Executor paramExecutor, e parame) {
    throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
  }
  
  public l<TResult> a(Executor paramExecutor, f<TResult> paramf) {
    throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
  }
  
  public abstract l<TResult> a(Executor paramExecutor, g paramg);
  
  public abstract l<TResult> a(Executor paramExecutor, h<? super TResult> paramh);
  
  public <TContinuationResult> l<TContinuationResult> a(Executor paramExecutor, k<TResult, TContinuationResult> paramk) {
    throw new UnsupportedOperationException("onSuccessTask is not implemented");
  }
  
  public abstract Exception a();
  
  public abstract <X extends Throwable> TResult a(Class<X> paramClass) throws X;
  
  public <TContinuationResult> l<TContinuationResult> b(Executor paramExecutor, c<TResult, l<TContinuationResult>> paramc) {
    throw new UnsupportedOperationException("continueWithTask is not implemented");
  }
  
  public abstract TResult b();
  
  public abstract boolean c();
  
  public abstract boolean d();
  
  public abstract boolean e();
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/m/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */