package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.RecentlyNonNull;
import e.f.a.e.e.n.b;

public class d {
  @RecentlyNonNull
  public static boolean a(@RecentlyNonNull Context paramContext, @RecentlyNonNull String paramString) {
    "com.google.android.gms".equals(paramString);
    try {
      int i = (b.a(paramContext).a(paramString, 0)).flags;
      return ((i & 0x200000) != 0);
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
      return false;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/util/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */