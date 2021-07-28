package androidx.biometric;

import android.os.Build;

class b {
  static int a(BiometricPrompt.d paramd, BiometricPrompt.c paramc) {
    char c1;
    if (paramd.a() != 0)
      return paramd.a(); 
    if (paramc != null) {
      c1 = '\017';
    } else {
      c1 = 'ÿ';
    } 
    return paramd.g() ? (0x8000 | c1) : c1;
  }
  
  static String a(int paramInt) {
    return (paramInt != 15) ? ((paramInt != 255) ? ((paramInt != 32768) ? ((paramInt != 32783) ? ((paramInt != 33023) ? String.valueOf(paramInt) : "BIOMETRIC_WEAK | DEVICE_CREDENTIAL") : "BIOMETRIC_STRONG | DEVICE_CREDENTIAL") : "DEVICE_CREDENTIAL") : "BIOMETRIC_WEAK") : "BIOMETRIC_STRONG";
  }
  
  static boolean b(int paramInt) {
    return ((paramInt & 0x8000) != 0);
  }
  
  static boolean c(int paramInt) {
    return ((paramInt & 0x7FFF) != 0);
  }
  
  static boolean d(int paramInt) {
    boolean bool3 = true;
    boolean bool2 = true;
    boolean bool1 = bool3;
    if (paramInt != 15) {
      bool1 = bool3;
      if (paramInt != 255)
        if (paramInt != 32768) {
          if (paramInt != 32783) {
            bool1 = bool3;
            if (paramInt != 33023)
              return (paramInt == 0); 
          } else {
            paramInt = Build.VERSION.SDK_INT;
            bool1 = bool2;
            if (paramInt >= 28) {
              if (paramInt > 29)
                return true; 
              bool1 = false;
            } 
            return bool1;
          } 
        } else {
          if (Build.VERSION.SDK_INT >= 30)
            return true; 
          bool1 = false;
        }  
    } 
    return bool1;
  }
  
  static boolean e(int paramInt) {
    return ((paramInt & 0xFF) == 255);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/biometric/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */