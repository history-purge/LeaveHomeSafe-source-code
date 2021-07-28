package e.f.b.a.c;

import androidx.annotation.RecentlyNonNull;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

public class n {
  private final Object a = new Object();
  
  private boolean b;
  
  private final Queue<e0> c = new ArrayDeque<e0>();
  
  private final AtomicReference<Thread> d = new AtomicReference<Thread>();
  
  private final void a() {
    synchronized (this.a) {
      if (this.c.isEmpty()) {
        this.b = false;
        return;
      } 
      e0 e0 = this.c.remove();
      b(e0.a, e0.b);
      return;
    } 
  }
  
  private final void b(Executor paramExecutor, Runnable paramRunnable) {
    paramRunnable = new c0(this, paramRunnable);
    try {
      paramExecutor.execute(paramRunnable);
      return;
    } catch (RejectedExecutionException rejectedExecutionException) {
      a();
      return;
    } 
  }
  
  public void a(@RecentlyNonNull Executor paramExecutor, @RecentlyNonNull Runnable paramRunnable) {
    synchronized (this.a) {
      if (this.b) {
        this.c.add(new e0(paramExecutor, paramRunnable, null));
        return;
      } 
      this.b = true;
      b(paramExecutor, paramRunnable);
      return;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/b/a/c/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */