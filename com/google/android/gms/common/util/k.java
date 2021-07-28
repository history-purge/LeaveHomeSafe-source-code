package com.google.android.gms.common.util;

import android.os.Build;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;

public final class k {
  private static Boolean a;
  
  @RecentlyNonNull
  public static boolean a() {
    return true;
  }
  
  @RecentlyNonNull
  public static boolean b() {
    return (Build.VERSION.SDK_INT >= 16);
  }
  
  @RecentlyNonNull
  public static boolean c() {
    return (Build.VERSION.SDK_INT >= 18);
  }
  
  @RecentlyNonNull
  public static boolean d() {
    return (Build.VERSION.SDK_INT >= 19);
  }
  
  @RecentlyNonNull
  public static boolean e() {
    return (Build.VERSION.SDK_INT >= 20);
  }
  
  @RecentlyNonNull
  public static boolean f() {
    return (Build.VERSION.SDK_INT >= 21);
  }
  
  @RecentlyNonNull
  public static boolean g() {
    return (Build.VERSION.SDK_INT >= 24);
  }
  
  @RecentlyNonNull
  public static boolean h() {
    return (Build.VERSION.SDK_INT >= 26);
  }
  
  @RecentlyNonNull
  public static boolean i() {
    return (Build.VERSION.SDK_INT >= 28);
  }
  
  @RecentlyNonNull
  public static boolean j() {
    return (Build.VERSION.SDK_INT >= 29);
  }
  
  @RecentlyNonNull
  public static boolean k() {
    boolean bool1;
    boolean bool = j();
    boolean bool2 = false;
    if (!bool)
      return false; 
    if (Build.VERSION.SDK_INT >= 30 && Build.VERSION.CODENAME.equals("REL"))
      return true; 
    if (Build.VERSION.CODENAME.length() == 1 && Build.VERSION.CODENAME.charAt(0) >= 'R' && Build.VERSION.CODENAME.charAt(0) <= 'Z') {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    if (!bool1)
      return false; 
    Boolean bool3 = a;
    if (bool3 != null)
      return bool3.booleanValue(); 
    bool = bool2;
    try {
      if ("google".equals(Build.BRAND)) {
        bool = bool2;
        if (!Build.ID.startsWith("RPP1")) {
          bool = bool2;
          if (!Build.ID.startsWith("RPP2")) {
            bool = bool2;
            if (Integer.parseInt(Build.VERSION.INCREMENTAL) >= 6301457)
              bool = true; 
          } 
        } 
      } 
      a = Boolean.valueOf(bool);
    } catch (NumberFormatException numberFormatException) {
      a = Boolean.valueOf(true);
    } 
    if (!a.booleanValue())
      Log.w("PlatformVersion", "Build version must be at least 6301457 to support R in gmscore"); 
    return a.booleanValue();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/util/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */