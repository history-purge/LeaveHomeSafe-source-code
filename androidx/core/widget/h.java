package androidx.core.widget;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import b.g.m.d;
import b.g.m.v;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class h {
  private static Method a;
  
  private static boolean b;
  
  private static Field c;
  
  private static boolean d;
  
  public static void a(PopupWindow paramPopupWindow, int paramInt) {
    if (Build.VERSION.SDK_INT >= 23) {
      paramPopupWindow.setWindowLayoutType(paramInt);
      return;
    } 
    if (!b) {
      try {
        Class<int> clazz = int.class;
        a = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", new Class[] { clazz });
        a.setAccessible(true);
      } catch (Exception exception) {}
      b = true;
    } 
    Method method = a;
    if (method != null)
      try {
        method.invoke(paramPopupWindow, new Object[] { Integer.valueOf(paramInt) });
        return;
      } catch (Exception exception) {
        return;
      }  
  }
  
  public static void a(PopupWindow paramPopupWindow, View paramView, int paramInt1, int paramInt2, int paramInt3) {
    if (Build.VERSION.SDK_INT >= 19) {
      paramPopupWindow.showAsDropDown(paramView, paramInt1, paramInt2, paramInt3);
      return;
    } 
    int i = paramInt1;
    if ((d.a(paramInt3, v.p(paramView)) & 0x7) == 5)
      i = paramInt1 - paramPopupWindow.getWidth() - paramView.getWidth(); 
    paramPopupWindow.showAsDropDown(paramView, i, paramInt2);
  }
  
  public static void a(PopupWindow paramPopupWindow, boolean paramBoolean) {
    int i = Build.VERSION.SDK_INT;
    if (i >= 23) {
      paramPopupWindow.setOverlapAnchor(paramBoolean);
      return;
    } 
    if (i >= 21) {
      if (!d) {
        try {
          c = PopupWindow.class.getDeclaredField("mOverlapAnchor");
          c.setAccessible(true);
        } catch (NoSuchFieldException noSuchFieldException) {
          Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", noSuchFieldException);
        } 
        d = true;
      } 
      Field field = c;
      if (field != null)
        try {
          field.set(paramPopupWindow, Boolean.valueOf(paramBoolean));
          return;
        } catch (IllegalAccessException illegalAccessException) {
          Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", illegalAccessException);
        }  
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/core/widget/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */