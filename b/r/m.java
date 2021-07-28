package b.r;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;

class m {
  static i a(View paramView, ViewGroup paramViewGroup, Matrix paramMatrix) {
    return (Build.VERSION.SDK_INT == 28) ? k.a(paramView, paramViewGroup, paramMatrix) : l.a(paramView, paramViewGroup, paramMatrix);
  }
  
  static void a(View paramView) {
    if (Build.VERSION.SDK_INT == 28) {
      k.a(paramView);
      return;
    } 
    l.b(paramView);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/r/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */