package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.g;
import androidx.lifecycle.h;
import androidx.lifecycle.j;
import java.lang.reflect.Field;

final class ImmLeaksCleaner implements h {
  private static int d;
  
  private static Field e;
  
  private static Field f;
  
  private static Field g;
  
  private Activity c;
  
  ImmLeaksCleaner(Activity paramActivity) {
    this.c = paramActivity;
  }
  
  private static void a() {
    try {
      d = 2;
      f = InputMethodManager.class.getDeclaredField("mServedView");
      f.setAccessible(true);
      g = InputMethodManager.class.getDeclaredField("mNextServedView");
      g.setAccessible(true);
      e = InputMethodManager.class.getDeclaredField("mH");
      e.setAccessible(true);
      d = 1;
      return;
    } catch (NoSuchFieldException noSuchFieldException) {
      return;
    } 
  }
  
  public void a(j paramj, g.b paramb) {
    if (paramb != g.b.ON_DESTROY)
      return; 
    if (d == 0)
      a(); 
    if (d == 1) {
      InputMethodManager inputMethodManager = (InputMethodManager)this.c.getSystemService("input_method");
      try {
        Object object = e.get(inputMethodManager);
        if (object == null)
          return; 
        /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        try {
          View view = (View)f.get(inputMethodManager);
          if (view == null) {
            /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
            return;
          } 
          if (view.isAttachedToWindow()) {
            /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
            return;
          } 
          try {
            g.set(inputMethodManager, null);
            /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
            inputMethodManager.isActive();
            return;
          } catch (IllegalAccessException illegalAccessException) {
            /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
            return;
          } 
        } catch (IllegalAccessException illegalAccessException) {
          /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
          return;
        } catch (ClassCastException classCastException) {
          /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
          return;
        } finally {}
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        throw inputMethodManager;
      } catch (IllegalAccessException illegalAccessException) {
        return;
      } 
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/activity/ImmLeaksCleaner.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */