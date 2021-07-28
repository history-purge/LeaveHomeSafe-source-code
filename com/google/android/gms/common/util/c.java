package com.google.android.gms.common.util;

import android.util.Base64;
import androidx.annotation.RecentlyNonNull;

public final class c {
  @RecentlyNonNull
  public static String a(@RecentlyNonNull byte[] paramArrayOfbyte) {
    return (paramArrayOfbyte == null) ? null : Base64.encodeToString(paramArrayOfbyte, 11);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/util/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */