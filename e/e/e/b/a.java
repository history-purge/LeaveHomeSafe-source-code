package e.e.e.b;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.TimeUnit;

public class a extends AbstractExecutorService {
  private static final a c = new a();
  
  public static a a() {
    return c;
  }
  
  public boolean awaitTermination(long paramLong, TimeUnit paramTimeUnit) {
    return true;
  }
  
  public void execute(Runnable paramRunnable) {
    paramRunnable.run();
  }
  
  public boolean isShutdown() {
    return false;
  }
  
  public boolean isTerminated() {
    return false;
  }
  
  public void shutdown() {}
  
  public List<Runnable> shutdownNow() {
    shutdown();
    return Collections.emptyList();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/e/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */