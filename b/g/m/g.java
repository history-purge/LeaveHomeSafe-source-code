package b.g.m;

import android.os.Build;
import android.view.ViewGroup;

public final class g {
  public static int a(ViewGroup.MarginLayoutParams paramMarginLayoutParams) {
    return (Build.VERSION.SDK_INT >= 17) ? paramMarginLayoutParams.getMarginEnd() : paramMarginLayoutParams.rightMargin;
  }
  
  public static int b(ViewGroup.MarginLayoutParams paramMarginLayoutParams) {
    return (Build.VERSION.SDK_INT >= 17) ? paramMarginLayoutParams.getMarginStart() : paramMarginLayoutParams.leftMargin;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/g/m/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */