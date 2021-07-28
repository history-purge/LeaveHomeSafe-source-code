package com.henninghall.date_picker;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import k.a.a.a.a;

public class e {
  public static String a(String paramString) {
    return a(paramString, d.c.d);
  }
  
  private static String a(String paramString, d.c paramc) {
    try {
      return d.a(paramString, paramc);
    } catch (d d) {
      try {
        return d.a(paramString.substring(0, paramString.indexOf("_")), paramc);
      } catch (d d1) {
        return d.a.get(paramc);
      } 
    } 
  }
  
  public static String a(Locale paramLocale) {
    return ((SimpleDateFormat)DateFormat.getDateInstance(0, paramLocale)).toLocalizedPattern().replaceAll(",", "").replaceAll("([a-zA-Z]+)", " $1").trim();
  }
  
  public static String b(String paramString) {
    return a(paramString, d.c.c);
  }
  
  static String b(Locale paramLocale) {
    return ((SimpleDateFormat)DateFormat.getDateTimeInstance(0, 0, paramLocale)).toLocalizedPattern().replace(",", "");
  }
  
  public static Locale c(String paramString) {
    try {
      return a.e(paramString);
    } catch (Exception exception) {
      return a.e(paramString.substring(0, paramString.indexOf("_")));
    } 
  }
  
  public static boolean c(Locale paramLocale) {
    boolean bool2 = false;
    DateFormat dateFormat = DateFormat.getTimeInstance(0, paramLocale);
    boolean bool1 = bool2;
    if (dateFormat instanceof SimpleDateFormat) {
      bool1 = bool2;
      if (((SimpleDateFormat)dateFormat).toPattern().contains("a"))
        bool1 = true; 
    } 
    return bool1;
  }
  
  public static String d(String paramString) {
    return a(paramString, d.c.e);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/henninghall/date_picker/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */