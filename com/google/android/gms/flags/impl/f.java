package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import android.util.Log;
import e.f.a.e.i.h.d;

public final class f extends a<Long> {
  public static Long a(SharedPreferences paramSharedPreferences, String paramString, Long paramLong) {
    try {
      return (Long)d.a(new g(paramSharedPreferences, paramString, paramLong));
    } catch (Exception exception) {
      String str = String.valueOf(exception.getMessage());
      if (str.length() != 0) {
        str = "Flag value not available, returning default: ".concat(str);
      } else {
        str = new String("Flag value not available, returning default: ");
      } 
      Log.w("FlagDataUtils", str);
      return paramLong;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/flags/impl/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */