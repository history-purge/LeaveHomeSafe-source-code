package androidx.biometric;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

class m {
  static boolean a(Context paramContext) {
    return (Build.VERSION.SDK_INT >= 23 && paramContext != null && paramContext.getPackageManager() != null && a.a(paramContext.getPackageManager()));
  }
  
  private static class a {
    static boolean a(PackageManager param1PackageManager) {
      return param1PackageManager.hasSystemFeature("android.hardware.fingerprint");
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/biometric/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */