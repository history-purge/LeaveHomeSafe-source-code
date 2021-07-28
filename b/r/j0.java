package b.r;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;
import java.lang.reflect.Method;

class j0 {
  private static boolean a = true;
  
  private static Method b;
  
  private static boolean c;
  
  static int a(ViewGroup paramViewGroup, int paramInt) {
    if (Build.VERSION.SDK_INT >= 29)
      return paramViewGroup.getChildDrawingOrder(paramInt); 
    if (!c) {
      try {
        Class<int> clazz1 = int.class;
        Class<int> clazz2 = int.class;
        b = ViewGroup.class.getDeclaredMethod("getChildDrawingOrder", new Class[] { clazz1, clazz2 });
        b.setAccessible(true);
      } catch (NoSuchMethodException noSuchMethodException) {}
      c = true;
    } 
    Method method = b;
    if (method != null)
      try {
        return ((Integer)method.invoke(paramViewGroup, new Object[] { Integer.valueOf(paramViewGroup.getChildCount()), Integer.valueOf(paramInt) })).intValue();
      } catch (IllegalAccessException|java.lang.reflect.InvocationTargetException illegalAccessException) {
        return paramInt;
      }  
    return paramInt;
  }
  
  static i0 a(ViewGroup paramViewGroup) {
    return (i0)((Build.VERSION.SDK_INT >= 18) ? new h0(paramViewGroup) : g0.a(paramViewGroup));
  }
  
  @SuppressLint({"NewApi"})
  private static void a(ViewGroup paramViewGroup, boolean paramBoolean) {
    if (a)
      try {
        paramViewGroup.suppressLayout(paramBoolean);
        return;
      } catch (NoSuchMethodError noSuchMethodError) {
        a = false;
      }  
  }
  
  static void b(ViewGroup paramViewGroup, boolean paramBoolean) {
    int i = Build.VERSION.SDK_INT;
    if (i >= 29) {
      paramViewGroup.suppressLayout(paramBoolean);
      return;
    } 
    if (i >= 18) {
      a(paramViewGroup, paramBoolean);
      return;
    } 
    k0.a(paramViewGroup, paramBoolean);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/r/j0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */