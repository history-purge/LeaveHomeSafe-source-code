package b.r;

import android.annotation.SuppressLint;
import android.view.View;

class p0 extends u0 {
  private static boolean f = true;
  
  public void a(View paramView) {}
  
  @SuppressLint({"NewApi"})
  public void a(View paramView, float paramFloat) {
    if (f)
      try {
        paramView.setTransitionAlpha(paramFloat);
        return;
      } catch (NoSuchMethodError noSuchMethodError) {
        f = false;
      }  
    paramView.setAlpha(paramFloat);
  }
  
  @SuppressLint({"NewApi"})
  public float b(View paramView) {
    if (f)
      try {
        return paramView.getTransitionAlpha();
      } catch (NoSuchMethodError noSuchMethodError) {
        f = false;
      }  
    return paramView.getAlpha();
  }
  
  public void c(View paramView) {}
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/r/p0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */