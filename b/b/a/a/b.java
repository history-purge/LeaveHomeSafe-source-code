package b.b.a.a;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class b extends c {
  private final Object a = new Object();
  
  private final ExecutorService b = Executors.newFixedThreadPool(4, new a(this));
  
  private volatile Handler c;
  
  private static Handler a(Looper paramLooper) {
    int i = Build.VERSION.SDK_INT;
    if (i >= 28)
      return Handler.createAsync(paramLooper); 
    if (i >= 16)
      try {
        return Handler.class.getDeclaredConstructor(new Class[] { Looper.class, Handler.Callback.class, boolean.class }).newInstance(new Object[] { paramLooper, null, Boolean.valueOf(true) });
      } catch (IllegalAccessException|InstantiationException|NoSuchMethodException illegalAccessException) {
        return new Handler(paramLooper);
      } catch (InvocationTargetException invocationTargetException) {
        return new Handler(paramLooper);
      }  
    return new Handler(paramLooper);
  }
  
  public void a(Runnable paramRunnable) {
    this.b.execute(paramRunnable);
  }
  
  public boolean a() {
    return (Looper.getMainLooper().getThread() == Thread.currentThread());
  }
  
  public void b(Runnable paramRunnable) {
    if (this.c == null)
      synchronized (this.a) {
        if (this.c == null)
          this.c = a(Looper.getMainLooper()); 
      }  
    this.c.post(paramRunnable);
  }
  
  class a implements ThreadFactory {
    private final AtomicInteger a = new AtomicInteger(0);
    
    a(b this$0) {}
    
    public Thread newThread(Runnable param1Runnable) {
      param1Runnable = new Thread(param1Runnable);
      param1Runnable.setName(String.format("arch_disk_io_%d", new Object[] { Integer.valueOf(this.a.getAndIncrement()) }));
      return (Thread)param1Runnable;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/b/a/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */