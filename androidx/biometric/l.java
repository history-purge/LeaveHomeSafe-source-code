package androidx.biometric;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build;

class l {
  static KeyguardManager a(Context paramContext) {
    if (Build.VERSION.SDK_INT >= 23)
      return b.a(paramContext); 
    Object object = paramContext.getSystemService("keyguard");
    return (object instanceof KeyguardManager) ? (KeyguardManager)object : null;
  }
  
  static boolean b(Context paramContext) {
    KeyguardManager keyguardManager = a(paramContext);
    if (keyguardManager == null)
      return false; 
    int i = Build.VERSION.SDK_INT;
    return (i >= 23) ? b.a(keyguardManager) : ((i >= 16) ? a.a(keyguardManager) : false);
  }
  
  private static class a {
    static boolean a(KeyguardManager param1KeyguardManager) {
      return param1KeyguardManager.isKeyguardSecure();
    }
  }
  
  private static class b {
    static KeyguardManager a(Context param1Context) {
      return (KeyguardManager)param1Context.getSystemService(KeyguardManager.class);
    }
    
    static boolean a(KeyguardManager param1KeyguardManager) {
      return param1KeyguardManager.isDeviceSecure();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/biometric/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */