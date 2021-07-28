package e.f.a.e.i.e;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

final class c implements b {
  private c() {}
  
  public final ExecutorService a(ThreadFactory paramThreadFactory, int paramInt) {
    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), paramThreadFactory);
    threadPoolExecutor.allowCoreThreadTimeOut(true);
    return Executors.unconfigurableExecutorService(threadPoolExecutor);
  }
  
  public final ScheduledExecutorService a(int paramInt1, ThreadFactory paramThreadFactory, int paramInt2) {
    return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, paramThreadFactory));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/e/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */