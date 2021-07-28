package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.util.k;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public final class c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
  private static final c g = new c();
  
  private final AtomicBoolean c = new AtomicBoolean();
  
  private final AtomicBoolean d = new AtomicBoolean();
  
  private final ArrayList<a> e = new ArrayList<a>();
  
  private boolean f = false;
  
  public static void a(@RecentlyNonNull Application paramApplication) {
    synchronized (g) {
      if (!g.f) {
        paramApplication.registerActivityLifecycleCallbacks(g);
        paramApplication.registerComponentCallbacks((ComponentCallbacks)g);
        g.f = true;
      } 
      return;
    } 
  }
  
  @RecentlyNonNull
  public static c b() {
    return g;
  }
  
  private final void b(boolean paramBoolean) {
    synchronized (g) {
      ArrayList<a> arrayList = this.e;
      int j = arrayList.size();
      int i = 0;
      while (i < j) {
        a a = (a)arrayList.get(i);
        i++;
        ((a)a).a(paramBoolean);
      } 
      return;
    } 
  }
  
  public final void a(@RecentlyNonNull a parama) {
    synchronized (g) {
      this.e.add(parama);
      return;
    } 
  }
  
  @RecentlyNonNull
  public final boolean a() {
    return this.c.get();
  }
  
  @TargetApi(16)
  @RecentlyNonNull
  public final boolean a(@RecentlyNonNull boolean paramBoolean) {
    if (!this.d.get())
      if (k.b()) {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        if (!this.d.getAndSet(true) && runningAppProcessInfo.importance > 100)
          this.c.set(true); 
      } else {
        return paramBoolean;
      }  
    return a();
  }
  
  public final void onActivityCreated(@RecentlyNonNull Activity paramActivity, Bundle paramBundle) {
    boolean bool = this.c.compareAndSet(true, false);
    this.d.set(true);
    if (bool)
      b(false); 
  }
  
  public final void onActivityDestroyed(@RecentlyNonNull Activity paramActivity) {}
  
  public final void onActivityPaused(@RecentlyNonNull Activity paramActivity) {}
  
  public final void onActivityResumed(@RecentlyNonNull Activity paramActivity) {
    boolean bool = this.c.compareAndSet(true, false);
    this.d.set(true);
    if (bool)
      b(false); 
  }
  
  public final void onActivitySaveInstanceState(@RecentlyNonNull Activity paramActivity, @RecentlyNonNull Bundle paramBundle) {}
  
  public final void onActivityStarted(@RecentlyNonNull Activity paramActivity) {}
  
  public final void onActivityStopped(@RecentlyNonNull Activity paramActivity) {}
  
  public final void onConfigurationChanged(@RecentlyNonNull Configuration paramConfiguration) {}
  
  public final void onLowMemory() {}
  
  public final void onTrimMemory(@RecentlyNonNull int paramInt) {
    if (paramInt == 20 && this.c.compareAndSet(false, true)) {
      this.d.set(true);
      b(true);
    } 
  }
  
  public static interface a {
    void a(@RecentlyNonNull boolean param1Boolean);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/api/internal/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */