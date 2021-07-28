package e.f.a.e.i.i;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public abstract class l extends d implements ExecutorService {
  public final boolean awaitTermination(long paramLong, TimeUnit paramTimeUnit) {
    return b().awaitTermination(paramLong, paramTimeUnit);
  }
  
  protected abstract ExecutorService b();
  
  public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> paramCollection) {
    return b().invokeAll(paramCollection);
  }
  
  public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> paramCollection, long paramLong, TimeUnit paramTimeUnit) {
    return b().invokeAll(paramCollection, paramLong, paramTimeUnit);
  }
  
  public final <T> T invokeAny(Collection<? extends Callable<T>> paramCollection) {
    return b().invokeAny(paramCollection);
  }
  
  public final <T> T invokeAny(Collection<? extends Callable<T>> paramCollection, long paramLong, TimeUnit paramTimeUnit) {
    return b().invokeAny(paramCollection, paramLong, paramTimeUnit);
  }
  
  public final boolean isShutdown() {
    return b().isShutdown();
  }
  
  public final boolean isTerminated() {
    return b().isTerminated();
  }
  
  public final void shutdown() {
    b().shutdown();
  }
  
  public final List<Runnable> shutdownNow() {
    return b().shutdownNow();
  }
  
  public final Future<?> submit(Runnable paramRunnable) {
    return b().submit(paramRunnable);
  }
  
  public final <T> Future<T> submit(Runnable paramRunnable, T paramT) {
    return b().submit(paramRunnable, paramT);
  }
  
  public final <T> Future<T> submit(Callable<T> paramCallable) {
    return b().submit(paramCallable);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/i/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */