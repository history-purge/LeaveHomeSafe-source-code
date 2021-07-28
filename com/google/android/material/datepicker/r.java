package com.google.android.material.datepicker;

import android.annotation.TargetApi;
import android.icu.text.DateFormat;
import android.icu.util.TimeZone;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

class r {
  static long a(long paramLong) {
    Calendar calendar = d();
    calendar.setTimeInMillis(paramLong);
    return a(calendar).getTimeInMillis();
  }
  
  @TargetApi(24)
  private static DateFormat a(String paramString, Locale paramLocale) {
    DateFormat dateFormat = DateFormat.getInstanceForSkeleton(paramString, paramLocale);
    dateFormat.setTimeZone(c());
    return dateFormat;
  }
  
  @TargetApi(24)
  static DateFormat a(Locale paramLocale) {
    return a("MMMEd", paramLocale);
  }
  
  private static DateFormat a(int paramInt, Locale paramLocale) {
    DateFormat dateFormat = DateFormat.getDateInstance(paramInt, paramLocale);
    dateFormat.setTimeZone(a());
    return dateFormat;
  }
  
  static Calendar a(Calendar paramCalendar) {
    paramCalendar = b(paramCalendar);
    Calendar calendar = d();
    calendar.set(paramCalendar.get(1), paramCalendar.get(2), paramCalendar.get(5));
    return calendar;
  }
  
  private static TimeZone a() {
    return TimeZone.getTimeZone("UTC");
  }
  
  static DateFormat b(Locale paramLocale) {
    return a(0, paramLocale);
  }
  
  private static SimpleDateFormat b(String paramString, Locale paramLocale) {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(paramString, paramLocale);
    simpleDateFormat.setTimeZone(a());
    return simpleDateFormat;
  }
  
  static Calendar b() {
    return a(Calendar.getInstance());
  }
  
  static Calendar b(Calendar paramCalendar) {
    Calendar calendar = Calendar.getInstance(a());
    if (paramCalendar == null) {
      calendar.clear();
      return calendar;
    } 
    calendar.setTimeInMillis(paramCalendar.getTimeInMillis());
    return calendar;
  }
  
  @TargetApi(24)
  static DateFormat c(Locale paramLocale) {
    return a("yMMMEd", paramLocale);
  }
  
  @TargetApi(24)
  private static TimeZone c() {
    return TimeZone.getTimeZone("UTC");
  }
  
  private static SimpleDateFormat d(Locale paramLocale) {
    return b("MMMM, yyyy", paramLocale);
  }
  
  static Calendar d() {
    return b((Calendar)null);
  }
  
  static SimpleDateFormat e() {
    return d(Locale.getDefault());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/datepicker/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */