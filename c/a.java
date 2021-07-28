package c;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

final class a {
  private static final a b = new a();
  
  private static final int c = Runtime.getRuntime().availableProcessors();
  
  static final int d;
  
  static final int e;
  
  private final Executor a = new b(null);
  
  static {
    int i = c;
    d = i + 1;
    e = i * 2 + 1;
  }
  
  public static ExecutorService a() {
    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(d, e, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>());
    a(threadPoolExecutor, true);
    return threadPoolExecutor;
  }
  
  @SuppressLint({"NewApi"})
  public static void a(ThreadPoolExecutor paramThreadPoolExecutor, boolean paramBoolean) {
    if (Build.VERSION.SDK_INT >= 9)
      paramThreadPoolExecutor.allowCoreThreadTimeOut(paramBoolean); 
  }
  
  public static Executor b() {
    return b.a;
  }
  
  private static class b implements Executor {
    private b() {}
    
    public void execute(Runnable param1Runnable) {
      (new Handler(Looper.getMainLooper())).post(param1Runnable);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */