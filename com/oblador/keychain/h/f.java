package com.oblador.keychain.h;

import android.os.Looper;
import android.util.Log;
import androidx.biometric.BiometricPrompt;
import androidx.fragment.app.e;
import com.facebook.react.bridge.ReactApplicationContext;
import com.oblador.keychain.g.e;

public class f extends e implements d {
  private BiometricPrompt i;
  
  private Boolean j = Boolean.valueOf(false);
  
  public f(ReactApplicationContext paramReactApplicationContext, e parame, BiometricPrompt.d paramd) {
    super(paramReactApplicationContext, parame, paramd);
  }
  
  private void h() {
    Log.d(e.h, "Cancelling authentication");
    BiometricPrompt biometricPrompt = this.i;
    if (biometricPrompt == null)
      return; 
    try {
      biometricPrompt.a();
    } catch (Exception exception) {
    
    } finally {}
    this.i = null;
  }
  
  public void a(int paramInt, CharSequence paramCharSequence) {
    if (this.j.booleanValue()) {
      this.i = null;
      this.j = Boolean.valueOf(false);
      g();
      return;
    } 
    super.a(paramInt, paramCharSequence);
  }
  
  public void a(BiometricPrompt.b paramb) {
    this.i = null;
    this.j = Boolean.valueOf(false);
    super.a(paramb);
  }
  
  public void c() {
    Log.d(e.h, "Authentication failed: biometric not recognized.");
    if (this.i != null) {
      this.j = Boolean.valueOf(true);
      h();
    } 
  }
  
  public void e() {
    e e1 = d();
    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
      e1.runOnUiThread(new c(this));
      f();
      return;
    } 
    this.i = a(e1);
  }
  
  protected void g() {
    Log.d(e.h, "Retrying biometric authentication.");
    e e1 = d();
    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
      try {
        Thread.sleep(100L);
      } catch (InterruptedException interruptedException) {}
      e1.runOnUiThread(new a(this));
      return;
    } 
    this.i = a(e1);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/oblador/keychain/h/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */