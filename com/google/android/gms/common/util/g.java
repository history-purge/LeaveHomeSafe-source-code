package com.google.android.gms.common.util;

import android.os.SystemClock;
import androidx.annotation.RecentlyNonNull;

public class g implements e {
  private static final g a = new g();
  
  @RecentlyNonNull
  public static e c() {
    return a;
  }
  
  @RecentlyNonNull
  public long a() {
    return System.currentTimeMillis();
  }
  
  @RecentlyNonNull
  public long b() {
    return SystemClock.elapsedRealtime();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/util/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */