package com.google.android.material.datepicker;

import android.os.Build;
import java.util.Date;
import java.util.Locale;

class e {
  static String a(long paramLong) {
    return a(paramLong, Locale.getDefault());
  }
  
  static String a(long paramLong, Locale paramLocale) {
    return (Build.VERSION.SDK_INT >= 24) ? r.a(paramLocale).format(new Date(paramLong)) : r.b(paramLocale).format(new Date(paramLong));
  }
  
  static String b(long paramLong) {
    return b(paramLong, Locale.getDefault());
  }
  
  static String b(long paramLong, Locale paramLocale) {
    return (Build.VERSION.SDK_INT >= 24) ? r.c(paramLocale).format(new Date(paramLong)) : r.b(paramLocale).format(new Date(paramLong));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/datepicker/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */