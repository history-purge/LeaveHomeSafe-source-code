package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.annotation.RecentlyNonNull;
import androidx.fragment.app.e;
import com.google.android.gms.common.internal.q;

public class h {
  private final Object a;
  
  public h(@RecentlyNonNull Activity paramActivity) {
    q.a(paramActivity, "Activity must not be null");
    this.a = paramActivity;
  }
  
  public Activity a() {
    return (Activity)this.a;
  }
  
  public e b() {
    return (e)this.a;
  }
  
  @RecentlyNonNull
  public boolean c() {
    return this.a instanceof e;
  }
  
  @RecentlyNonNull
  public final boolean d() {
    return this.a instanceof Activity;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/api/internal/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */