package e.f.b.a.c;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.RecentlyNonNull;
import e.f.a.e.i.i.a;
import e.f.a.e.m.l;
import e.f.a.e.m.m;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public class g {
  private static final Object b = new Object();
  
  private static g c;
  
  private Handler a;
  
  private g(Looper paramLooper) {
    this.a = (Handler)new a(paramLooper);
  }
  
  @RecentlyNonNull
  public static g a() {
    synchronized (b) {
      if (c == null) {
        HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
        handlerThread.start();
        c = new g(handlerThread.getLooper());
      } 
      return c;
    } 
  }
  
  @RecentlyNonNull
  public static Executor b() {
    return u.c;
  }
  
  @RecentlyNonNull
  public <ResultT> l<ResultT> a(@RecentlyNonNull Callable<ResultT> paramCallable) {
    m m = new m();
    a(new t(paramCallable, m));
    return m.a();
  }
  
  public void a(@RecentlyNonNull Runnable paramRunnable) {
    b().execute(paramRunnable);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/b/a/c/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */