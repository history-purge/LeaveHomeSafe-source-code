package e.e.e.b;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class d<V> implements RunnableFuture<V>, ScheduledFuture<V> {
  private final FutureTask<V> c;
  
  public d(Handler paramHandler, Runnable paramRunnable, V paramV) {
    this.c = new FutureTask<V>(paramRunnable, paramV);
  }
  
  public d(Handler paramHandler, Callable<V> paramCallable) {
    this.c = new FutureTask<V>(paramCallable);
  }
  
  public int a(Delayed paramDelayed) {
    throw new UnsupportedOperationException();
  }
  
  public boolean cancel(boolean paramBoolean) {
    return this.c.cancel(paramBoolean);
  }
  
  public V get() {
    return this.c.get();
  }
  
  public V get(long paramLong, TimeUnit paramTimeUnit) {
    return this.c.get(paramLong, paramTimeUnit);
  }
  
  public long getDelay(TimeUnit paramTimeUnit) {
    throw new UnsupportedOperationException();
  }
  
  public boolean isCancelled() {
    return this.c.isCancelled();
  }
  
  public boolean isDone() {
    return this.c.isDone();
  }
  
  public void run() {
    this.c.run();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/e/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */