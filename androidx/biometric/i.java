package androidx.biometric;

import android.content.Context;
import android.os.Build;

class i {
  static boolean a(Context paramContext, String paramString) {
    return (Build.VERSION.SDK_INT >= 30) ? false : a(paramContext, paramString, n.assume_strong_biometrics_models);
  }
  
  private static boolean a(Context paramContext, String paramString, int paramInt) {
    if (paramString == null)
      return false; 
    String[] arrayOfString = paramContext.getResources().getStringArray(paramInt);
    int j = arrayOfString.length;
    for (paramInt = 0; paramInt < j; paramInt++) {
      if (paramString.equals(arrayOfString[paramInt]))
        return true; 
    } 
    return false;
  }
  
  static boolean a(Context paramContext, String paramString1, String paramString2) {
    int j = Build.VERSION.SDK_INT;
    boolean bool = false;
    if (j != 28)
      return false; 
    if (c(paramContext, paramString1, n.crypto_fingerprint_fallback_vendors) || b(paramContext, paramString2, n.crypto_fingerprint_fallback_prefixes))
      bool = true; 
    return bool;
  }
  
  static boolean b(Context paramContext, String paramString) {
    return (Build.VERSION.SDK_INT != 29) ? false : a(paramContext, paramString, n.delay_showing_prompt_models);
  }
  
  private static boolean b(Context paramContext, String paramString, int paramInt) {
    if (paramString == null)
      return false; 
    String[] arrayOfString = paramContext.getResources().getStringArray(paramInt);
    int j = arrayOfString.length;
    for (paramInt = 0; paramInt < j; paramInt++) {
      if (paramString.startsWith(arrayOfString[paramInt]))
        return true; 
    } 
    return false;
  }
  
  static boolean c(Context paramContext, String paramString) {
    return (Build.VERSION.SDK_INT != 28) ? false : b(paramContext, paramString, n.hide_fingerprint_instantly_prefixes);
  }
  
  private static boolean c(Context paramContext, String paramString, int paramInt) {
    if (paramString == null)
      return false; 
    String[] arrayOfString = paramContext.getResources().getStringArray(paramInt);
    int j = arrayOfString.length;
    for (paramInt = 0; paramInt < j; paramInt++) {
      if (paramString.equalsIgnoreCase(arrayOfString[paramInt]))
        return true; 
    } 
    return false;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/biometric/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */