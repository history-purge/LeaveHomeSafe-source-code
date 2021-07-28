package e.e.l.f;

import android.os.Process;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class l implements ThreadFactory {
  private final int a;
  
  private final String b;
  
  private final boolean c;
  
  private final AtomicInteger d = new AtomicInteger(1);
  
  public l(int paramInt, String paramString, boolean paramBoolean) {
    this.a = paramInt;
    this.b = paramString;
    this.c = paramBoolean;
  }
  
  public Thread newThread(Runnable paramRunnable) {
    String str;
    a a = new a(this, paramRunnable);
    if (this.c) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(this.b);
      stringBuilder.append("-");
      stringBuilder.append(this.d.getAndIncrement());
      str = stringBuilder.toString();
    } else {
      str = this.b;
    } 
    return new Thread(a, str);
  }
  
  class a implements Runnable {
    a(l this$0, Runnable param1Runnable) {}
    
    public void run() {
      try {
        Process.setThreadPriority(l.a(this.d));
      } finally {
        Exception exception;
      } 
      this.c.run();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/f/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */