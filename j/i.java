package j;

import java.util.concurrent.TimeUnit;

public class i extends u {
  private u a;
  
  public i(u paramu) {
    if (paramu != null) {
      this.a = paramu;
      return;
    } 
    throw new IllegalArgumentException("delegate == null");
  }
  
  public final i a(u paramu) {
    if (paramu != null) {
      this.a = paramu;
      return this;
    } 
    throw new IllegalArgumentException("delegate == null");
  }
  
  public final u a() {
    return this.a;
  }
  
  public u clearDeadline() {
    return this.a.clearDeadline();
  }
  
  public u clearTimeout() {
    return this.a.clearTimeout();
  }
  
  public long deadlineNanoTime() {
    return this.a.deadlineNanoTime();
  }
  
  public u deadlineNanoTime(long paramLong) {
    return this.a.deadlineNanoTime(paramLong);
  }
  
  public boolean hasDeadline() {
    return this.a.hasDeadline();
  }
  
  public void throwIfReached() {
    this.a.throwIfReached();
  }
  
  public u timeout(long paramLong, TimeUnit paramTimeUnit) {
    return this.a.timeout(paramLong, paramTimeUnit);
  }
  
  public long timeoutNanos() {
    return this.a.timeoutNanos();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/j/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */