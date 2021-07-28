package b.q;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

public final class a {
  private static long a;
  
  private static Method b;
  
  public static void a() {
    if (Build.VERSION.SDK_INT >= 18)
      b.a(); 
  }
  
  public static void a(String paramString) {
    if (Build.VERSION.SDK_INT >= 18)
      b.a(paramString); 
  }
  
  private static void a(String paramString, Exception paramException) {
    Throwable throwable;
    if (paramException instanceof java.lang.reflect.InvocationTargetException) {
      throwable = paramException.getCause();
      if (throwable instanceof RuntimeException)
        throw (RuntimeException)throwable; 
      throw new RuntimeException(throwable);
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unable to call ");
    stringBuilder.append((String)throwable);
    stringBuilder.append(" via reflection");
    Log.v("Trace", stringBuilder.toString(), paramException);
  }
  
  @SuppressLint({"NewApi"})
  public static boolean b() {
    try {
      if (b == null)
        return Trace.isEnabled(); 
    } catch (NoSuchMethodError|NoClassDefFoundError noSuchMethodError) {}
    return c();
  }
  
  private static boolean c() {
    if (Build.VERSION.SDK_INT >= 18)
      try {
        if (b == null) {
          a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
          b = Trace.class.getMethod("isTagEnabled", new Class[] { long.class });
        } 
        return ((Boolean)b.invoke(null, new Object[] { Long.valueOf(a) })).booleanValue();
      } catch (Exception exception) {
        a("isTagEnabled", exception);
      }  
    return false;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/q/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */