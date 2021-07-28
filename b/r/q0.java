package b.r;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

class q0 extends p0 {
  private static boolean g = true;
  
  private static boolean h = true;
  
  private static boolean i = true;
  
  @SuppressLint({"NewApi"})
  public void a(View paramView, Matrix paramMatrix) {
    if (g)
      try {
        paramView.setAnimationMatrix(paramMatrix);
        return;
      } catch (NoSuchMethodError noSuchMethodError) {
        g = false;
      }  
  }
  
  @SuppressLint({"NewApi"})
  public void b(View paramView, Matrix paramMatrix) {
    if (h)
      try {
        paramView.transformMatrixToGlobal(paramMatrix);
        return;
      } catch (NoSuchMethodError noSuchMethodError) {
        h = false;
      }  
  }
  
  @SuppressLint({"NewApi"})
  public void c(View paramView, Matrix paramMatrix) {
    if (i)
      try {
        paramView.transformMatrixToLocal(paramMatrix);
        return;
      } catch (NoSuchMethodError noSuchMethodError) {
        i = false;
      }  
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/r/q0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */