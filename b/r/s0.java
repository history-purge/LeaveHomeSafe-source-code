package b.r;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

class s0 extends r0 {
  private static boolean k = true;
  
  @SuppressLint({"NewApi"})
  public void a(View paramView, int paramInt) {
    if (Build.VERSION.SDK_INT == 28) {
      super.a(paramView, paramInt);
      return;
    } 
    if (k)
      try {
        paramView.setTransitionVisibility(paramInt);
        return;
      } catch (NoSuchMethodError noSuchMethodError) {
        k = false;
      }  
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/r/s0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */