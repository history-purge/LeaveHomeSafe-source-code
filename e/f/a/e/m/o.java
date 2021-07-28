package e.f.a.e.m;

import com.google.android.gms.common.internal.q;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class o {
  public static <TResult> l<TResult> a() {
    j0<TResult> j0 = new j0();
    j0.f();
    return j0;
  }
  
  public static <TResult> l<TResult> a(Exception paramException) {
    j0<TResult> j0 = new j0();
    j0.a(paramException);
    return j0;
  }
  
  public static <TResult> l<TResult> a(TResult paramTResult) {
    j0<TResult> j0 = new j0();
    j0.a(paramTResult);
    return j0;
  }
  
  @Deprecated
  public static <TResult> l<TResult> a(Executor paramExecutor, Callable<TResult> paramCallable) {
    q.a(paramExecutor, "Executor must not be null");
    q.a(paramCallable, "Callback must not be null");
    j0<TResult> j0 = new j0();
    paramExecutor.execute(new n0(j0, paramCallable));
    return j0;
  }
  
  public static <TResult> TResult a(l<TResult> paraml) {
    q.a();
    q.a(paraml, "Task must not be null");
    if (paraml.d())
      return b(paraml); 
    b b = new b(null);
    a(paraml, b);
    b.b();
    return b(paraml);
  }
  
  public static <TResult> TResult a(l<TResult> paraml, long paramLong, TimeUnit paramTimeUnit) {
    q.a();
    q.a(paraml, "Task must not be null");
    q.a(paramTimeUnit, "TimeUnit must not be null");
    if (paraml.d())
      return b(paraml); 
    b b = new b(null);
    a(paraml, b);
    if (b.a(paramLong, paramTimeUnit))
      return b(paraml); 
    throw new TimeoutException("Timed out waiting for Task");
  }
  
  private static <T> void a(l<T> paraml, a<? super T> parama) {
    paraml.a(n.b, parama);
    paraml.a(n.b, parama);
    paraml.a(n.b, parama);
  }
  
  private static <TResult> TResult b(l<TResult> paraml) {
    if (paraml.e())
      return paraml.b(); 
    if (paraml.c())
      throw new CancellationException("Task is already canceled"); 
    throw new ExecutionException(paraml.a());
  }
  
  static interface a<T> extends e, g, h<T> {}
  
  private static final class b implements a {
    private final CountDownLatch a = new CountDownLatch(1);
    
    private b() {}
    
    public final void a() {
      this.a.countDown();
    }
    
    public final void a(Exception param1Exception) {
      this.a.countDown();
    }
    
    public final void a(Object param1Object) {
      this.a.countDown();
    }
    
    public final boolean a(long param1Long, TimeUnit param1TimeUnit) {
      return this.a.await(param1Long, param1TimeUnit);
    }
    
    public final void b() {
      this.a.await();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/m/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */