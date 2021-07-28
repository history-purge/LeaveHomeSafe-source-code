package net.time4j.android.spi;

import android.os.SystemClock;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import net.time4j.c1.c;
import net.time4j.g1.e;

class a implements e {
  private static final Class[] a = new Class[0];
  
  private static final Object[] b = new Object[0];
  
  private static final Method c;
  
  static {
    Method method = null;
    try {
      Method method1 = SystemClock.class.getMethod("elapsedRealtimeNanos", a);
      method1.invoke(null, b);
      method = method1;
    } catch (NoSuchMethodException|InvocationTargetException|IllegalAccessException|RuntimeException noSuchMethodException) {}
    c = method;
  }
  
  public long a() {
    Method method = c;
    if (method != null)
      try {
        return ((Long)method.invoke(null, b)).longValue();
      } catch (IllegalAccessException illegalAccessException) {
        illegalAccessException.printStackTrace(System.err);
      } catch (InvocationTargetException invocationTargetException) {
        invocationTargetException.printStackTrace(System.err);
      }  
    return c.b(SystemClock.elapsedRealtime(), 1000000L);
  }
  
  public String b() {
    return "Dalvik";
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/android/spi/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */