package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

public interface i {
  @RecentlyNullable
  <T extends LifecycleCallback> T a(@RecentlyNonNull String paramString, @RecentlyNonNull Class<T> paramClass);
  
  void a(@RecentlyNonNull String paramString, @RecentlyNonNull LifecycleCallback paramLifecycleCallback);
  
  @RecentlyNonNull
  Activity e();
  
  void startActivityForResult(@RecentlyNonNull Intent paramIntent, @RecentlyNonNull int paramInt);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/api/internal/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */