package androidx.biometric;

import android.content.Context;
import android.util.Log;

class j {
  static String a(Context paramContext, int paramInt) {
    if (paramContext == null)
      return ""; 
    if (paramInt != 1) {
      if (paramInt != 7) {
        StringBuilder stringBuilder;
        switch (paramInt) {
          default:
            stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown error code: ");
            stringBuilder.append(paramInt);
            Log.e("BiometricUtils", stringBuilder.toString());
            paramInt = t.default_error_msg;
            return paramContext.getString(paramInt);
          case 12:
            paramInt = t.fingerprint_error_hw_not_present;
            return paramContext.getString(paramInt);
          case 11:
            paramInt = t.fingerprint_error_no_fingerprints;
            return paramContext.getString(paramInt);
          case 10:
            paramInt = t.fingerprint_error_user_canceled;
            return paramContext.getString(paramInt);
          case 9:
            break;
        } 
      } 
      paramInt = t.fingerprint_error_lockout;
      return paramContext.getString(paramInt);
    } 
    paramInt = t.fingerprint_error_hw_not_available;
    return paramContext.getString(paramInt);
  }
  
  static boolean a(int paramInt) {
    switch (paramInt) {
      default:
        return false;
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 7:
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      case 15:
        break;
    } 
    return true;
  }
  
  static boolean b(int paramInt) {
    return (paramInt == 7 || paramInt == 9);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/biometric/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */