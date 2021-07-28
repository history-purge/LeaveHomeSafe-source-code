package j;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class u {
  public static final u NONE = new a();
  
  private long deadlineNanoTime;
  
  private boolean hasDeadline;
  
  private long timeoutNanos;
  
  public u clearDeadline() {
    this.hasDeadline = false;
    return this;
  }
  
  public u clearTimeout() {
    this.timeoutNanos = 0L;
    return this;
  }
  
  public final u deadline(long paramLong, TimeUnit paramTimeUnit) {
    if (paramLong > 0L) {
      if (paramTimeUnit != null)
        return deadlineNanoTime(System.nanoTime() + paramTimeUnit.toNanos(paramLong)); 
      throw new IllegalArgumentException("unit == null");
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("duration <= 0: ");
    stringBuilder.append(paramLong);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public long deadlineNanoTime() {
    if (this.hasDeadline)
      return this.deadlineNanoTime; 
    throw new IllegalStateException("No deadline");
  }
  
  public u deadlineNanoTime(long paramLong) {
    this.hasDeadline = true;
    this.deadlineNanoTime = paramLong;
    return this;
  }
  
  public boolean hasDeadline() {
    return this.hasDeadline;
  }
  
  public void throwIfReached() {
    if (!Thread.interrupted()) {
      if (this.hasDeadline) {
        if (this.deadlineNanoTime - System.nanoTime() > 0L)
          return; 
        throw new InterruptedIOException("deadline reached");
      } 
      return;
    } 
    Thread.currentThread().interrupt();
    throw new InterruptedIOException("interrupted");
  }
  
  public u timeout(long paramLong, TimeUnit paramTimeUnit) {
    if (paramLong >= 0L) {
      if (paramTimeUnit != null) {
        this.timeoutNanos = paramTimeUnit.toNanos(paramLong);
        return this;
      } 
      throw new IllegalArgumentException("unit == null");
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("timeout < 0: ");
    stringBuilder.append(paramLong);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public long timeoutNanos() {
    return this.timeoutNanos;
  }
  
  public final void waitUntilNotified(Object paramObject) {
    long l1;
    long l2;
    try {
      boolean bool = hasDeadline();
      l1 = timeoutNanos();
      l2 = 0L;
      if (!bool && l1 == 0L) {
        paramObject.wait();
        return;
      } 
      long l = System.nanoTime();
      if (bool && l1 != 0L) {
        l1 = Math.min(l1, deadlineNanoTime() - l);
      } else if (bool) {
        l1 = deadlineNanoTime() - l;
      } 
      if (l1 > 0L) {
        l2 = l1 / 1000000L;
        Long.signum(l2);
        int i = (int)(l1 - 1000000L * l2);
        paramObject.wait(l2, i);
        l2 = System.nanoTime() - l;
      } 
    } catch (InterruptedException interruptedException) {
      Thread.currentThread().interrupt();
      throw new InterruptedIOException("interrupted");
    } 
    if (l2 < l1)
      return; 
    throw new InterruptedIOException("timeout");
  }
  
  final class a extends u {
    public u deadlineNanoTime(long param1Long) {
      return this;
    }
    
    public void throwIfReached() {}
    
    public u timeout(long param1Long, TimeUnit param1TimeUnit) {
      return this;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/j/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */