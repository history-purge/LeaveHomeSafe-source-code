package b.r;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class k implements i {
  private static Class<?> d;
  
  private static boolean e;
  
  private static Method f;
  
  private static boolean g;
  
  private static Method h;
  
  private static boolean i;
  
  private final View c;
  
  private k(View paramView) {
    this.c = paramView;
  }
  
  static i a(View paramView, ViewGroup paramViewGroup, Matrix paramMatrix) {
    a();
    Method method = f;
    if (method != null)
      try {
        return new k((View)method.invoke(null, new Object[] { paramView, paramViewGroup, paramMatrix }));
      } catch (IllegalAccessException illegalAccessException) {
        return null;
      } catch (InvocationTargetException invocationTargetException) {
        throw new RuntimeException(invocationTargetException.getCause());
      }  
    return null;
  }
  
  private static void a() {
    if (!g) {
      try {
        b();
        f = d.getDeclaredMethod("addGhost", new Class[] { View.class, ViewGroup.class, Matrix.class });
        f.setAccessible(true);
      } catch (NoSuchMethodException noSuchMethodException) {
        Log.i("GhostViewApi21", "Failed to retrieve addGhost method", noSuchMethodException);
      } 
      g = true;
    } 
  }
  
  static void a(View paramView) {
    c();
    Method method = h;
    if (method != null)
      try {
        method.invoke(null, new Object[] { paramView });
        return;
      } catch (IllegalAccessException illegalAccessException) {
        return;
      } catch (InvocationTargetException invocationTargetException) {
        throw new RuntimeException(invocationTargetException.getCause());
      }  
  }
  
  private static void b() {
    if (!e) {
      try {
        d = Class.forName("android.view.GhostView");
      } catch (ClassNotFoundException classNotFoundException) {
        Log.i("GhostViewApi21", "Failed to retrieve GhostView class", classNotFoundException);
      } 
      e = true;
    } 
  }
  
  private static void c() {
    if (!i) {
      try {
        b();
        h = d.getDeclaredMethod("removeGhost", new Class[] { View.class });
        h.setAccessible(true);
      } catch (NoSuchMethodException noSuchMethodException) {
        Log.i("GhostViewApi21", "Failed to retrieve removeGhost method", noSuchMethodException);
      } 
      i = true;
    } 
  }
  
  public void a(ViewGroup paramViewGroup, View paramView) {}
  
  public void setVisibility(int paramInt) {
    this.c.setVisibility(paramInt);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/r/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */