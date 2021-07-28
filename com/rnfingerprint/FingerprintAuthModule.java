package com.rnfingerprint;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.KeyguardManager;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import javax.crypto.Cipher;

public class FingerprintAuthModule extends ReactContextBaseJavaModule implements LifecycleEventListener {
  private static final String FRAGMENT_TAG = "fingerprint_dialog";
  
  public static boolean inProgress = false;
  
  private boolean isAppActive;
  
  private KeyguardManager keyguardManager;
  
  public FingerprintAuthModule(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
    paramReactApplicationContext.addLifecycleEventListener(this);
  }
  
  private KeyguardManager getKeyguardManager() {
    KeyguardManager keyguardManager = this.keyguardManager;
    if (keyguardManager != null)
      return keyguardManager; 
    Activity activity = getCurrentActivity();
    if (activity == null)
      return null; 
    this.keyguardManager = (KeyguardManager)activity.getSystemService("keyguard");
    return this.keyguardManager;
  }
  
  private int isFingerprintAuthAvailable() {
    if (Build.VERSION.SDK_INT < 23)
      return 101; 
    Activity activity = getCurrentActivity();
    if (activity == null)
      return 103; 
    KeyguardManager keyguardManager = getKeyguardManager();
    FingerprintManager fingerprintManager = (FingerprintManager)activity.getSystemService("fingerprint");
    return (fingerprintManager == null || !fingerprintManager.isHardwareDetected()) ? 102 : ((keyguardManager != null) ? (!keyguardManager.isKeyguardSecure() ? 103 : (!fingerprintManager.hasEnrolledFingerprints() ? 104 : 100)) : 103);
  }
  
  @ReactMethod
  @TargetApi(23)
  public void authenticate(String paramString, ReadableMap paramReadableMap, Callback paramCallback1, Callback paramCallback2) {
    Activity activity = getCurrentActivity();
    if (!inProgress && this.isAppActive) {
      if (activity == null)
        return; 
      inProgress = true;
      int i = isFingerprintAuthAvailable();
      if (i != 100) {
        inProgress = false;
        paramCallback1.invoke(new Object[] { "Not supported", Integer.valueOf(i) });
        return;
      } 
      Cipher cipher = (new c()).a();
      if (cipher == null) {
        inProgress = false;
        paramCallback1.invoke(new Object[] { "Not supported", Integer.valueOf(103) });
        return;
      } 
      FingerprintManager.CryptoObject cryptoObject = new FingerprintManager.CryptoObject(cipher);
      a a = new a(paramCallback1, paramCallback2);
      d d = new d();
      d.a(cryptoObject);
      d.a(paramString);
      d.a(paramReadableMap);
      d.a(a);
      if (!this.isAppActive) {
        inProgress = false;
        return;
      } 
      d.show(activity.getFragmentManager(), "fingerprint_dialog");
    } 
  }
  
  public String getName() {
    return "FingerprintAuth";
  }
  
  @ReactMethod
  public void isSupported(Callback paramCallback1, Callback paramCallback2) {
    if (getCurrentActivity() == null)
      return; 
    int i = isFingerprintAuthAvailable();
    if (i == 100) {
      paramCallback2.invoke(new Object[] { "Is supported." });
      return;
    } 
    paramCallback1.invoke(new Object[] { "Not supported.", Integer.valueOf(i) });
  }
  
  public void onHostDestroy() {
    this.isAppActive = false;
  }
  
  public void onHostPause() {
    this.isAppActive = false;
  }
  
  public void onHostResume() {
    this.isAppActive = true;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/rnfingerprint/FingerprintAuthModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */