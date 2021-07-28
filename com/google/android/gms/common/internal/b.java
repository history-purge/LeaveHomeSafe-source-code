package com.google.android.gms.common.internal;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.k;

public class b {
  public static com.google.android.gms.common.api.b a(@RecentlyNonNull Status paramStatus) {
    return (com.google.android.gms.common.api.b)(paramStatus.e() ? new k(paramStatus) : new com.google.android.gms.common.api.b(paramStatus));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/internal/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */