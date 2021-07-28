package b.g.l;

import android.icu.util.ULocale;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

public final class b {
  private static Method a;
  
  private static Method b;
  
  static {
    int i = Build.VERSION.SDK_INT;
    if (i < 21) {
      try {
        Class<?> clazz = Class.forName("libcore.icu.ICU");
        if (clazz != null) {
          a = clazz.getMethod("getScript", new Class[] { String.class });
          b = clazz.getMethod("addLikelySubtags", new Class[] { String.class });
          return;
        } 
      } catch (Exception exception) {
        a = null;
        b = null;
        Log.w("ICUCompat", exception);
        return;
      } 
    } else if (i < 24) {
      try {
        b = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", new Class[] { Locale.class });
        return;
      } catch (Exception exception) {
        throw new IllegalStateException(exception);
      } 
    } 
  }
  
  private static String a(String paramString) {
    try {
      if (a != null)
        return (String)a.invoke(null, new Object[] { paramString }); 
    } catch (IllegalAccessException illegalAccessException) {
      Log.w("ICUCompat", illegalAccessException);
    } catch (InvocationTargetException invocationTargetException) {}
    return null;
  }
  
  private static String a(Locale paramLocale) {
    String str = paramLocale.toString();
    try {
      if (b != null)
        return (String)b.invoke(null, new Object[] { str }); 
    } catch (IllegalAccessException illegalAccessException) {
      Log.w("ICUCompat", illegalAccessException);
    } catch (InvocationTargetException invocationTargetException) {}
    return str;
  }
  
  public static String b(Locale paramLocale) {
    int i = Build.VERSION.SDK_INT;
    if (i >= 24)
      return ULocale.addLikelySubtags(ULocale.forLocale(paramLocale)).getScript(); 
    if (i >= 21) {
      try {
        return ((Locale)b.invoke(null, new Object[] { paramLocale })).getScript();
      } catch (InvocationTargetException invocationTargetException) {
      
      } catch (IllegalAccessException illegalAccessException) {}
      Log.w("ICUCompat", illegalAccessException);
      return paramLocale.getScript();
    } 
    String str = a(paramLocale);
    return (str != null) ? a(str) : null;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/g/l/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */