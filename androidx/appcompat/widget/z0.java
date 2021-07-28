package androidx.appcompat.widget;

import android.os.Build;
import android.view.View;

public class z0 {
  public static void a(View paramView, CharSequence paramCharSequence) {
    if (Build.VERSION.SDK_INT >= 26) {
      paramView.setTooltipText(paramCharSequence);
      return;
    } 
    a1.a(paramView, paramCharSequence);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/widget/z0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */