package com.oblador.keychain;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build;
import androidx.biometric.e;

public class b {
  public static boolean a(Context paramContext) {
    return paramContext.getPackageManager().hasSystemFeature("android.hardware.biometrics.face");
  }
  
  public static boolean b(Context paramContext) {
    return paramContext.getPackageManager().hasSystemFeature("android.hardware.fingerprint");
  }
  
  public static boolean c(Context paramContext) {
    return paramContext.getPackageManager().hasSystemFeature("android.hardware.biometrics.iris");
  }
  
  public static boolean d(Context paramContext) {
    int i = Build.VERSION.SDK_INT;
    boolean bool2 = false;
    boolean bool1 = false;
    if (i < 23)
      return false; 
    if (!((KeyguardManager)paramContext.getSystemService("keyguard")).isKeyguardSecure())
      return false; 
    if (Build.VERSION.SDK_INT >= 28) {
      if (paramContext.checkSelfPermission("android.permission.USE_BIOMETRIC") == 0)
        bool1 = true; 
      return bool1;
    } 
    bool1 = bool2;
    if (paramContext.checkSelfPermission("android.permission.USE_FINGERPRINT") == 0)
      bool1 = true; 
    return bool1;
  }
  
  public static boolean e(Context paramContext) {
    return (e.a(paramContext).a(15) == 0);
  }
  
  public static boolean f(Context paramContext) {
    return (e.a(paramContext).a(33023) == 0);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/oblador/keychain/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */