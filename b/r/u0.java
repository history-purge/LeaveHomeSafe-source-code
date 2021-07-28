package b.r;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class u0 {
  private static Method b;
  
  private static boolean c;
  
  private static Field d;
  
  private static boolean e;
  
  private float[] a;
  
  @SuppressLint({"PrivateApi"})
  private void a() {
    if (!c) {
      try {
        b = View.class.getDeclaredMethod("setFrame", new Class[] { int.class, int.class, int.class, int.class });
        b.setAccessible(true);
      } catch (NoSuchMethodException noSuchMethodException) {
        Log.i("ViewUtilsBase", "Failed to retrieve setFrame method", noSuchMethodException);
      } 
      c = true;
    } 
  }
  
  public void a(View paramView) {
    if (paramView.getVisibility() == 0)
      paramView.setTag(s.save_non_transition_alpha, null); 
  }
  
  public void a(View paramView, float paramFloat) {
    Float float_ = (Float)paramView.getTag(s.save_non_transition_alpha);
    if (float_ != null) {
      paramView.setAlpha(float_.floatValue() * paramFloat);
      return;
    } 
    paramView.setAlpha(paramFloat);
  }
  
  public void a(View paramView, int paramInt) {
    if (!e) {
      try {
        d = View.class.getDeclaredField("mViewFlags");
        d.setAccessible(true);
      } catch (NoSuchFieldException noSuchFieldException) {
        Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
      } 
      e = true;
    } 
    Field field = d;
    if (field != null)
      try {
        int i = field.getInt(paramView);
        d.setInt(paramView, paramInt | i & 0xFFFFFFF3);
        return;
      } catch (IllegalAccessException illegalAccessException) {
        return;
      }  
  }
  
  public void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    a();
    Method method = b;
    if (method != null)
      try {
        method.invoke(paramView, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
        return;
      } catch (IllegalAccessException illegalAccessException) {
        return;
      } catch (InvocationTargetException invocationTargetException) {
        throw new RuntimeException(invocationTargetException.getCause());
      }  
  }
  
  public void a(View paramView, Matrix paramMatrix) {
    boolean bool;
    if (paramMatrix == null || paramMatrix.isIdentity()) {
      paramView.setPivotX((paramView.getWidth() / 2));
      paramView.setPivotY((paramView.getHeight() / 2));
      paramView.setTranslationX(0.0F);
      paramView.setTranslationY(0.0F);
      paramView.setScaleX(1.0F);
      paramView.setScaleY(1.0F);
      paramView.setRotation(0.0F);
      return;
    } 
    float[] arrayOfFloat2 = this.a;
    float[] arrayOfFloat1 = arrayOfFloat2;
    if (arrayOfFloat2 == null) {
      arrayOfFloat1 = new float[9];
      this.a = arrayOfFloat1;
    } 
    paramMatrix.getValues(arrayOfFloat1);
    float f1 = arrayOfFloat1[3];
    float f2 = (float)Math.sqrt((1.0F - f1 * f1));
    if (arrayOfFloat1[0] < 0.0F) {
      bool = true;
    } else {
      bool = true;
    } 
    float f3 = f2 * bool;
    f1 = (float)Math.toDegrees(Math.atan2(f1, f3));
    f2 = arrayOfFloat1[0] / f3;
    f3 = arrayOfFloat1[4] / f3;
    float f4 = arrayOfFloat1[2];
    float f5 = arrayOfFloat1[5];
    paramView.setPivotX(0.0F);
    paramView.setPivotY(0.0F);
    paramView.setTranslationX(f4);
    paramView.setTranslationY(f5);
    paramView.setRotation(f1);
    paramView.setScaleX(f2);
    paramView.setScaleY(f3);
  }
  
  public float b(View paramView) {
    Float float_ = (Float)paramView.getTag(s.save_non_transition_alpha);
    float f2 = paramView.getAlpha();
    float f1 = f2;
    if (float_ != null)
      f1 = f2 / float_.floatValue(); 
    return f1;
  }
  
  public void b(View paramView, Matrix paramMatrix) {
    ViewParent viewParent = paramView.getParent();
    if (viewParent instanceof View) {
      View view = (View)viewParent;
      b(view, paramMatrix);
      paramMatrix.preTranslate(-view.getScrollX(), -view.getScrollY());
    } 
    paramMatrix.preTranslate(paramView.getLeft(), paramView.getTop());
    Matrix matrix = paramView.getMatrix();
    if (!matrix.isIdentity())
      paramMatrix.preConcat(matrix); 
  }
  
  public void c(View paramView) {
    if (paramView.getTag(s.save_non_transition_alpha) == null)
      paramView.setTag(s.save_non_transition_alpha, Float.valueOf(paramView.getAlpha())); 
  }
  
  public void c(View paramView, Matrix paramMatrix) {
    ViewParent viewParent = paramView.getParent();
    if (viewParent instanceof View) {
      View view = (View)viewParent;
      c(view, paramMatrix);
      paramMatrix.postTranslate(view.getScrollX(), view.getScrollY());
    } 
    paramMatrix.postTranslate(-paramView.getLeft(), -paramView.getTop());
    Matrix matrix = paramView.getMatrix();
    if (!matrix.isIdentity()) {
      Matrix matrix1 = new Matrix();
      if (matrix.invert(matrix1))
        paramMatrix.postConcat(matrix1); 
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/r/u0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */