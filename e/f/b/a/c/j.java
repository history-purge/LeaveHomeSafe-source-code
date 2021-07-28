package e.f.b.a.c;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.q;
import e.f.a.e.i.i.l;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class j extends l {
  private static final ThreadLocal<Deque<Runnable>> d = new ThreadLocal<Deque<Runnable>>();
  
  private final ThreadPoolExecutor c;
  
  public j() {
    ThreadFactory threadFactory = Executors.defaultThreadFactory();
    int i = Runtime.getRuntime().availableProcessors();
    this.c = new ThreadPoolExecutor(i, i, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), new v(threadFactory));
    this.c.allowCoreThreadTimeOut(true);
  }
  
  private static void a(Deque<Runnable> paramDeque, Runnable paramRunnable) {
    q.a(paramDeque);
    paramDeque.add(paramRunnable);
    if (paramDeque.size() <= 1) {
      Runnable runnable;
      do {
        paramRunnable.run();
        paramDeque.removeFirst();
        runnable = paramDeque.peekFirst();
        paramRunnable = runnable;
      } while (runnable != null);
    } 
  }
  
  @RecentlyNonNull
  protected final ExecutorService b() {
    return this.c;
  }
  
  public final void execute(@RecentlyNonNull Runnable paramRunnable) {
    Deque<Runnable> deque = d.get();
    if (deque != null && deque.size() <= 1) {
      a(deque, paramRunnable);
      return;
    } 
    this.c.execute(new w(paramRunnable));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/b/a/c/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */