package androidx.core.widget;

import android.os.Build;

public interface b {
  public static final boolean a;
  
  static {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 27) {
      bool = true;
    } else {
      bool = false;
    } 
    a = bool;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/core/widget/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */