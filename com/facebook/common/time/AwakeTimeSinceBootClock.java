package com.facebook.common.time;

import android.os.SystemClock;
import e.e.e.d.d;

@d
public class AwakeTimeSinceBootClock implements b {
  @d
  private static final AwakeTimeSinceBootClock INSTANCE = new AwakeTimeSinceBootClock();
  
  @d
  public static AwakeTimeSinceBootClock get() {
    return INSTANCE;
  }
  
  @d
  public long now() {
    return SystemClock.uptimeMillis();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/common/time/AwakeTimeSinceBootClock.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */