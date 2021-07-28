package e.e.l.d;

import android.app.ActivityManager;
import android.os.Build;
import e.e.e.d.l;
import java.util.concurrent.TimeUnit;

public class i implements l<q> {
  private static final long b = TimeUnit.MINUTES.toMillis(5L);
  
  private final ActivityManager a;
  
  public i(ActivityManager paramActivityManager) {
    this.a = paramActivityManager;
  }
  
  private int a() {
    int j = Math.min(this.a.getMemoryClass() * 1048576, 2147483647);
    return (j < 33554432) ? 4194304 : ((j < 67108864) ? 6291456 : ((Build.VERSION.SDK_INT < 11) ? 8388608 : (j / 4)));
  }
  
  public q get() {
    return new q(a(), 256, 2147483647, 2147483647, 2147483647, b);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/d/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */