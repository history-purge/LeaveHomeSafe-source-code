package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import android.util.Log;

public final class d extends a<Integer> {
  public static Integer a(SharedPreferences paramSharedPreferences, String paramString, Integer paramInteger) {
    try {
      return (Integer)e.f.a.e.i.h.d.a(new e(paramSharedPreferences, paramString, paramInteger));
    } catch (Exception exception) {
      String str = String.valueOf(exception.getMessage());
      if (str.length() != 0) {
        str = "Flag value not available, returning default: ".concat(str);
      } else {
        str = new String("Flag value not available, returning default: ");
      } 
      Log.w("FlagDataUtils", str);
      return paramInteger;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/flags/impl/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */