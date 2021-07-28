package e.e.l.d;

import e.e.e.d.l;
import java.util.concurrent.TimeUnit;

public class k implements l<q> {
  private static final long a = TimeUnit.MINUTES.toMillis(5L);
  
  private int a() {
    int i = (int)Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
    return (i < 16777216) ? 1048576 : ((i < 33554432) ? 2097152 : 4194304);
  }
  
  public q get() {
    int i = a();
    return new q(i, 2147483647, i, 2147483647, i / 8, a);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/d/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */