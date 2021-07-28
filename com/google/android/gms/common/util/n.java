package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import e.f.a.e.e.h;
import e.f.a.e.e.n.b;

public final class n {
  @RecentlyNonNull
  public static boolean a(@RecentlyNonNull Context paramContext, @RecentlyNonNull int paramInt) {
    if (!a(paramContext, paramInt, "com.google.android.gms"))
      return false; 
    PackageManager packageManager = paramContext.getPackageManager();
    try {
      PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.gms", 64);
      return h.a(paramContext).a(packageInfo);
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
      if (Log.isLoggable("UidVerifier", 3))
        Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false"); 
      return false;
    } 
  }
  
  @TargetApi(19)
  @RecentlyNonNull
  public static boolean a(@RecentlyNonNull Context paramContext, @RecentlyNonNull int paramInt, @RecentlyNonNull String paramString) {
    return b.a(paramContext).a(paramInt, paramString);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/util/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */