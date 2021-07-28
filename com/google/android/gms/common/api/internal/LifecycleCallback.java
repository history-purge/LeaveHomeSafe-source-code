package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.RecentlyNonNull;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class LifecycleCallback {
  @RecentlyNonNull
  protected final i c;
  
  protected LifecycleCallback(@RecentlyNonNull i parami) {
    this.c = parami;
  }
  
  @RecentlyNonNull
  public static i a(@RecentlyNonNull Activity paramActivity) {
    return a(new h(paramActivity));
  }
  
  @RecentlyNonNull
  protected static i a(@RecentlyNonNull h paramh) {
    if (paramh.c())
      return c1.a(paramh.b()); 
    if (paramh.d())
      return b1.a(paramh.a()); 
    throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
  }
  
  @Keep
  private static i getChimeraLifecycleFragmentImpl(h paramh) {
    throw new IllegalStateException("Method not available in SDK.");
  }
  
  @RecentlyNonNull
  public Activity a() {
    return this.c.e();
  }
  
  public void a(@RecentlyNonNull int paramInt1, @RecentlyNonNull int paramInt2, @RecentlyNonNull Intent paramIntent) {}
  
  public void a(Bundle paramBundle) {}
  
  public void a(@RecentlyNonNull String paramString, @RecentlyNonNull FileDescriptor paramFileDescriptor, @RecentlyNonNull PrintWriter paramPrintWriter, @RecentlyNonNull String[] paramArrayOfString) {}
  
  public void b() {}
  
  public void b(@RecentlyNonNull Bundle paramBundle) {}
  
  public void c() {}
  
  public void d() {}
  
  public void e() {}
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/api/internal/LifecycleCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */