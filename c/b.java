package c;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

final class b {
  private static final b c = new b();
  
  private final ExecutorService a;
  
  private final Executor b;
  
  private b() {
    ExecutorService executorService;
    if (!c()) {
      executorService = Executors.newCachedThreadPool();
    } else {
      executorService = a.a();
    } 
    this.a = executorService;
    Executors.newSingleThreadScheduledExecutor();
    this.b = new b(null);
  }
  
  public static ExecutorService a() {
    return c.a;
  }
  
  static Executor b() {
    return c.b;
  }
  
  private static boolean c() {
    String str = System.getProperty("java.runtime.name");
    return (str == null) ? false : str.toLowerCase(Locale.US).contains("android");
  }
  
  private static class b implements Executor {
    private ThreadLocal<Integer> c = new ThreadLocal<Integer>();
    
    private b() {}
    
    private int a() {
      Integer integer2 = this.c.get();
      Integer integer1 = integer2;
      if (integer2 == null)
        integer1 = Integer.valueOf(0); 
      int i = integer1.intValue() - 1;
      ThreadLocal<Integer> threadLocal = this.c;
      if (i == 0) {
        threadLocal.remove();
        return i;
      } 
      threadLocal.set(Integer.valueOf(i));
      return i;
    }
    
    private int b() {
      Integer integer2 = this.c.get();
      Integer integer1 = integer2;
      if (integer2 == null)
        integer1 = Integer.valueOf(0); 
      int i = integer1.intValue() + 1;
      this.c.set(Integer.valueOf(i));
      return i;
    }
    
    public void execute(Runnable param1Runnable) {
      if (b() <= 15)
        try {
          param1Runnable.run();
          return;
        } finally {
          a();
        }  
      b.a().execute(param1Runnable);
      a();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */