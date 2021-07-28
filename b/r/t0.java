package b.r;

import android.graphics.Matrix;
import android.view.View;

class t0 extends s0 {
  public void a(View paramView, float paramFloat) {
    paramView.setTransitionAlpha(paramFloat);
  }
  
  public void a(View paramView, int paramInt) {
    paramView.setTransitionVisibility(paramInt);
  }
  
  public void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramView.setLeftTopRightBottom(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void a(View paramView, Matrix paramMatrix) {
    paramView.setAnimationMatrix(paramMatrix);
  }
  
  public float b(View paramView) {
    return paramView.getTransitionAlpha();
  }
  
  public void b(View paramView, Matrix paramMatrix) {
    paramView.transformMatrixToGlobal(paramMatrix);
  }
  
  public void c(View paramView, Matrix paramMatrix) {
    paramView.transformMatrixToLocal(paramMatrix);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/r/t0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */