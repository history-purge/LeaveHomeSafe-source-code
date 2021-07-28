package e.g.a;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class c {
  Semaphore a = new Semaphore(0);
  
  public void a() {
    p p = p.a(Thread.currentThread());
    c c1 = p.waiter;
    p.waiter = this;
    null = p.queueSemaphore;
    try {
      boolean bool = this.a.tryAcquire();
      if (bool)
        return; 
      while (true) {
        Runnable runnable = p.remove();
        if (runnable == null) {
          null.acquire(Math.max(1, null.availablePermits()));
          bool = this.a.tryAcquire();
          if (bool)
            return; 
          continue;
        } 
        runnable.run();
      } 
    } finally {
      p.waiter = c1;
    } 
  }
  
  public boolean a(long paramLong, TimeUnit paramTimeUnit) {
    paramLong = TimeUnit.MILLISECONDS.convert(paramLong, paramTimeUnit);
    p p = p.a(Thread.currentThread());
    c c1 = p.waiter;
    p.waiter = this;
    null = p.queueSemaphore;
    try {
      boolean bool = this.a.tryAcquire();
      if (bool)
        return true; 
      long l = System.currentTimeMillis();
      while (true) {
        Runnable runnable = p.remove();
        if (runnable == null) {
          bool = null.tryAcquire(Math.max(1, null.availablePermits()), paramLong, TimeUnit.MILLISECONDS);
          if (!bool)
            return false; 
          bool = this.a.tryAcquire();
          if (bool)
            return true; 
          long l1 = System.currentTimeMillis();
          if (l1 - l >= paramLong)
            return false; 
          continue;
        } 
        runnable.run();
      } 
    } finally {
      p.waiter = c1;
    } 
  }
  
  public void b() {
    this.a.release();
    p.a(this);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/g/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */