package com.oblador.keychain.h;

import android.os.Build;
import androidx.biometric.BiometricPrompt;
import com.facebook.react.bridge.ReactApplicationContext;
import com.oblador.keychain.g.e;
import java.util.Arrays;

public class h {
  private static final String[] a = new String[] { 
      "A0001", "ONE A2001", "ONE A2003", "ONE A2005", "ONE E1001", "ONE E1003", "ONE E1005", "ONEPLUS A3000", "ONEPLUS SM-A3000", "ONEPLUS A3003", 
      "ONEPLUS A3010", "ONEPLUS A5000", "ONEPLUS A5010", "ONEPLUS A6000", "ONEPLUS A6003" };
  
  public static d a(ReactApplicationContext paramReactApplicationContext, e parame, BiometricPrompt.d paramd) {
    return (d)(parame.b() ? (a() ? new f(paramReactApplicationContext, parame, paramd) : new e(paramReactApplicationContext, parame, paramd)) : new g());
  }
  
  private static boolean a() {
    return (Build.BRAND.toLowerCase().equals("oneplus") && !Arrays.<String>asList(a).contains(Build.MODEL));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/oblador/keychain/h/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */