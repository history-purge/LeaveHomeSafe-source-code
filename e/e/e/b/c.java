package e.e.e.b;

import android.os.Handler;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class c extends AbstractExecutorService implements b {
  private final Handler c;
  
  public c(Handler paramHandler) {
    this.c = paramHandler;
  }
  
  public boolean a() {
    return (Thread.currentThread() == this.c.getLooper().getThread());
  }
  
  public boolean awaitTermination(long paramLong, TimeUnit paramTimeUnit) {
    throw new UnsupportedOperationException();
  }
  
  public void execute(Runnable paramRunnable) {
    this.c.post(paramRunnable);
  }
  
  public boolean isShutdown() {
    return false;
  }
  
  public boolean isTerminated() {
    return false;
  }
  
  protected <T> d<T> newTaskFor(Runnable paramRunnable, T paramT) {
    return new d<T>(this.c, paramRunnable, paramT);
  }
  
  protected <T> d<T> newTaskFor(Callable<T> paramCallable) {
    return new d<T>(this.c, paramCallable);
  }
  
  public ScheduledFuture<?> schedule(Runnable<?> paramRunnable, long paramLong, TimeUnit paramTimeUnit) {
    paramRunnable = newTaskFor(paramRunnable, (Object)null);
    this.c.postDelayed(paramRunnable, paramTimeUnit.toMillis(paramLong));
    return (ScheduledFuture<?>)paramRunnable;
  }
  
  public <V> ScheduledFuture<V> schedule(Callable<V> paramCallable, long paramLong, TimeUnit paramTimeUnit) {
    d<V> d = newTaskFor(paramCallable);
    this.c.postDelayed(d, paramTimeUnit.toMillis(paramLong));
    return d;
  }
  
  public ScheduledFuture<?> scheduleAtFixedRate(Runnable paramRunnable, long paramLong1, long paramLong2, TimeUnit paramTimeUnit) {
    throw new UnsupportedOperationException();
  }
  
  public ScheduledFuture<?> scheduleWithFixedDelay(Runnable paramRunnable, long paramLong1, long paramLong2, TimeUnit paramTimeUnit) {
    throw new UnsupportedOperationException();
  }
  
  public void shutdown() {
    throw new UnsupportedOperationException();
  }
  
  public List<Runnable> shutdownNow() {
    throw new UnsupportedOperationException();
  }
  
  public ScheduledFuture<?> submit(Runnable paramRunnable) {
    return submit(paramRunnable, (Object)null);
  }
  
  public <T> ScheduledFuture<T> submit(Runnable<T> paramRunnable, T paramT) {
    if (paramRunnable != null) {
      paramRunnable = newTaskFor(paramRunnable, paramT);
      execute(paramRunnable);
      return (ScheduledFuture<T>)paramRunnable;
    } 
    throw new NullPointerException();
  }
  
  public <T> ScheduledFuture<T> submit(Callable<T> paramCallable) {
    if (paramCallable != null) {
      d<T> d = newTaskFor(paramCallable);
      execute(d);
      return d;
    } 
    throw new NullPointerException();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/e/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */