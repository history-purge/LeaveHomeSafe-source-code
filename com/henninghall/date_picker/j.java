package com.henninghall.date_picker;

import android.content.Context;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import com.henninghall.date_picker.k.d;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import k.a.a.a.c.a;
import net.time4j.PrettyTime;

public class j {
  public static d a(char paramChar) {
    if (paramChar != 'H')
      if (paramChar != 'M') {
        if (paramChar != 'a') {
          if (paramChar != 'd') {
            if (paramChar != 'h') {
              if (paramChar != 'm') {
                if (paramChar == 'y')
                  return d.f; 
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid pattern char: ");
                stringBuilder.append(paramChar);
                throw new Exception(stringBuilder.toString());
              } 
              return d.h;
            } 
          } else {
            return d.d;
          } 
        } else {
          return d.i;
        } 
      } else {
        return d.e;
      }  
    return d.g;
  }
  
  public static String a(String paramString) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramString.substring(0, 1).toUpperCase());
    stringBuilder.append(paramString.substring(1));
    return stringBuilder.toString();
  }
  
  public static String a(Calendar paramCalendar) {
    return b().format(paramCalendar.getTime());
  }
  
  public static String a(Locale paramLocale) {
    return PrettyTime.a(paramLocale).b();
  }
  
  public static Calendar a(String paramString, TimeZone paramTimeZone) {
    if (paramString == null)
      return null; 
    try {
      Calendar calendar = Calendar.getInstance(paramTimeZone);
      calendar.setTime(b().parse(paramString));
      return calendar;
    } catch (ParseException parseException) {
      parseException.printStackTrace();
      return null;
    } 
  }
  
  public static boolean a() {
    return DateFormat.is24HourFormat((Context)DatePickerManager.context) ^ true;
  }
  
  private static SimpleDateFormat b() {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
    simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    return simpleDateFormat;
  }
  
  public static Calendar b(Calendar paramCalendar) {
    try {
      return a.a(paramCalendar, 12);
    } catch (Exception exception) {
      return null;
    } 
  }
  
  public static boolean c(Calendar paramCalendar) {
    return DateUtils.isToday(paramCalendar.getTimeInMillis());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/henninghall/date_picker/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */