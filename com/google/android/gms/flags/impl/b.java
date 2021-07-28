package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import android.util.Log;
import e.f.a.e.i.h.d;

public final class b extends a<Boolean> {
  public static Boolean a(SharedPreferences paramSharedPreferences, String paramString, Boolean paramBoolean) {
    try {
      return (Boolean)d.a(new c(paramSharedPreferences, paramString, paramBoolean));
    } catch (Exception exception) {
      String str = String.valueOf(exception.getMessage());
      if (str.length() != 0) {
        str = "Flag value not available, returning default: ".concat(str);
      } else {
        str = new String("Flag value not available, returning default: ");
      } 
      Log.w("FlagDataUtils", str);
      return paramBoolean;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/flags/impl/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */