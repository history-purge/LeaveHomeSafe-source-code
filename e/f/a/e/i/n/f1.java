package e.f.a.e.i.n;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

final class f1 implements v {
  private f1() {}
  
  public final ExecutorService a(int paramInt1, int paramInt2) {
    ThreadFactory threadFactory = Executors.defaultThreadFactory();
    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), threadFactory);
    threadPoolExecutor.allowCoreThreadTimeOut(true);
    return Executors.unconfigurableExecutorService(threadPoolExecutor);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/f1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */