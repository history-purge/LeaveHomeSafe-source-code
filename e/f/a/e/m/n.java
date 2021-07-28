package e.f.a.e.m;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public final class n {
  public static final Executor a = new a();
  
  static final Executor b = new i0();
  
  private static final class a implements Executor {
    private final Handler c = (Handler)new e.f.a.e.i.m.a(Looper.getMainLooper());
    
    public final void execute(Runnable param1Runnable) {
      this.c.post(param1Runnable);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/m/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */