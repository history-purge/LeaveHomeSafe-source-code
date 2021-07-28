package e.f.a.e.i.h;

import android.os.StrictMode;
import java.util.concurrent.Callable;

public final class d {
  public static <T> T a(Callable<T> paramCallable) {
    StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
    try {
      StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
      paramCallable = (Callable<T>)paramCallable.call();
      return (T)paramCallable;
    } finally {
      StrictMode.setThreadPolicy(threadPolicy);
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/h/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */