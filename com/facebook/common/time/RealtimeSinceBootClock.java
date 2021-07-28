package com.facebook.common.time;

import android.os.SystemClock;
import e.e.e.d.d;

@d
public class RealtimeSinceBootClock implements b {
  private static final RealtimeSinceBootClock a = new RealtimeSinceBootClock();
  
  @d
  public static RealtimeSinceBootClock get() {
    return a;
  }
  
  public long now() {
    return SystemClock.elapsedRealtime();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/common/time/RealtimeSinceBootClock.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */