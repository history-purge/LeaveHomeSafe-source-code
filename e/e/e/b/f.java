package e.e.e.b;

import android.os.Handler;
import android.os.Looper;

public class f extends c {
  private static f d;
  
  private f() {
    super(new Handler(Looper.getMainLooper()));
  }
  
  public static f b() {
    if (d == null)
      d = new f(); 
    return d;
  }
  
  public void execute(Runnable paramRunnable) {
    if (a()) {
      paramRunnable.run();
      return;
    } 
    super.execute(paramRunnable);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/e/b/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */