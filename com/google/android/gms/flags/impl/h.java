package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import android.util.Log;
import e.f.a.e.i.h.d;

public final class h extends a<String> {
  public static String a(SharedPreferences paramSharedPreferences, String paramString1, String paramString2) {
    try {
      return (String)d.a(new i(paramSharedPreferences, paramString1, paramString2));
    } catch (Exception exception) {
      String str = String.valueOf(exception.getMessage());
      if (str.length() != 0) {
        str = "Flag value not available, returning default: ".concat(str);
      } else {
        str = new String("Flag value not available, returning default: ");
      } 
      Log.w("FlagDataUtils", str);
      return paramString2;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/flags/impl/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */