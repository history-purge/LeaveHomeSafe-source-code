package com.google.android.gms.common.util;

import android.content.Context;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.q;

public final class f {
  static {
  
  }
  
  @RecentlyNonNull
  public static boolean a(@RecentlyNonNull Context paramContext, @RecentlyNonNull Throwable paramThrowable) {
    return a(paramContext, paramThrowable, 536870912);
  }
  
  private static boolean a(Context paramContext, Throwable paramThrowable, int paramInt) {
    try {
      q.a(paramContext);
      q.a(paramThrowable);
      return false;
    } catch (Exception exception) {
      Log.e("CrashUtils", "Error adding exception to DropBox!", exception);
      return false;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/util/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */