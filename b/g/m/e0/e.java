package b.g.m.e0;

import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityRecord;

public class e {
  public static void a(AccessibilityRecord paramAccessibilityRecord, int paramInt) {
    if (Build.VERSION.SDK_INT >= 15)
      paramAccessibilityRecord.setMaxScrollX(paramInt); 
  }
  
  public static void a(AccessibilityRecord paramAccessibilityRecord, View paramView, int paramInt) {
    if (Build.VERSION.SDK_INT >= 16)
      paramAccessibilityRecord.setSource(paramView, paramInt); 
  }
  
  public static void b(AccessibilityRecord paramAccessibilityRecord, int paramInt) {
    if (Build.VERSION.SDK_INT >= 15)
      paramAccessibilityRecord.setMaxScrollY(paramInt); 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/g/m/e0/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */