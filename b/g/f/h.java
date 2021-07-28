package b.g.f;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class h extends g {
  protected Typeface a(Object paramObject) {
    try {
      Object object = Array.newInstance(this.g, 1);
      Array.set(object, 0, paramObject);
      return (Typeface)this.m.invoke(null, new Object[] { object, "sans-serif", Integer.valueOf(-1), Integer.valueOf(-1) });
    } catch (IllegalAccessException illegalAccessException) {
    
    } catch (InvocationTargetException invocationTargetException) {}
    throw new RuntimeException(invocationTargetException);
  }
  
  protected Method d(Class<?> paramClass) {
    paramClass = Array.newInstance(paramClass, 1).getClass();
    Class<int> clazz = int.class;
    Method method = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[] { paramClass, String.class, clazz, clazz });
    method.setAccessible(true);
    return method;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/g/f/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */