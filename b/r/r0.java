package b.r;

import android.annotation.SuppressLint;
import android.view.View;

class r0 extends q0 {
  private static boolean j = true;
  
  @SuppressLint({"NewApi"})
  public void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (j)
      try {
        paramView.setLeftTopRightBottom(paramInt1, paramInt2, paramInt3, paramInt4);
        return;
      } catch (NoSuchMethodError noSuchMethodError) {
        j = false;
      }  
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/r/r0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */