package b.g.m.e0;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;

public final class b {
  public static int a(AccessibilityEvent paramAccessibilityEvent) {
    return (Build.VERSION.SDK_INT >= 19) ? paramAccessibilityEvent.getContentChangeTypes() : 0;
  }
  
  public static void a(AccessibilityEvent paramAccessibilityEvent, int paramInt) {
    if (Build.VERSION.SDK_INT >= 19)
      paramAccessibilityEvent.setContentChangeTypes(paramInt); 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/g/m/e0/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */