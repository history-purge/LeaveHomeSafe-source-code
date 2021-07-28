package net.time4j;

import java.io.Serializable;

public final class j implements Serializable {
  private static final long serialVersionUID = -4124961309622141228L;
  
  private final long days;
  
  private final g0 time;
  
  j(long paramLong, g0 paramg0) {
    this.days = paramLong;
    this.time = paramg0;
  }
  
  public long a() {
    return this.days;
  }
  
  public g0 b() {
    return this.time;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */