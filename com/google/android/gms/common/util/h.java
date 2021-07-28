package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.RecentlyNonNull;

public final class h {
  private static Boolean a;
  
  private static Boolean b;
  
  private static Boolean c;
  
  private static Boolean d;
  
  @RecentlyNonNull
  public static boolean a() {
    return "user".equals(Build.TYPE);
  }
  
  @RecentlyNonNull
  public static boolean a(@RecentlyNonNull Context paramContext) {
    return a(paramContext.getPackageManager());
  }
  
  @RecentlyNonNull
  public static boolean a(@RecentlyNonNull PackageManager paramPackageManager) {
    if (d == null) {
      boolean bool;
      if (k.h() && paramPackageManager.hasSystemFeature("android.hardware.type.automotive")) {
        bool = true;
      } else {
        bool = false;
      } 
      d = Boolean.valueOf(bool);
    } 
    return d.booleanValue();
  }
  
  @TargetApi(20)
  @RecentlyNonNull
  public static boolean b(@RecentlyNonNull Context paramContext) {
    return b(paramContext.getPackageManager());
  }
  
  @TargetApi(20)
  @RecentlyNonNull
  public static boolean b(@RecentlyNonNull PackageManager paramPackageManager) {
    if (a == null) {
      boolean bool;
      if (k.e() && paramPackageManager.hasSystemFeature("android.hardware.type.watch")) {
        bool = true;
      } else {
        bool = false;
      } 
      a = Boolean.valueOf(bool);
    } 
    return a.booleanValue();
  }
  
  @TargetApi(26)
  @RecentlyNonNull
  public static boolean c(@RecentlyNonNull Context paramContext) {
    return (b(paramContext) && (!k.g() || (e(paramContext) && !k.h())));
  }
  
  @RecentlyNonNull
  public static boolean d(@RecentlyNonNull Context paramContext) {
    if (c == null) {
      boolean bool;
      if (paramContext.getPackageManager().hasSystemFeature("android.hardware.type.iot") || paramContext.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
        bool = true;
      } else {
        bool = false;
      } 
      c = Boolean.valueOf(bool);
    } 
    return c.booleanValue();
  }
  
  @TargetApi(21)
  private static boolean e(Context paramContext) {
    if (b == null) {
      boolean bool;
      if (k.f() && paramContext.getPackageManager().hasSystemFeature("cn.google")) {
        bool = true;
      } else {
        bool = false;
      } 
      b = Boolean.valueOf(bool);
    } 
    return b.booleanValue();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/util/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */