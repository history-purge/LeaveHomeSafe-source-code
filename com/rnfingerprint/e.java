package com.rnfingerprint;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;

@TargetApi(23)
public class e extends FingerprintManager.AuthenticationCallback {
  private CancellationSignal a;
  
  private boolean b;
  
  private final FingerprintManager c;
  
  private final a d;
  
  public e(Context paramContext, a parama) {
    this.c = (FingerprintManager)paramContext.getSystemService(FingerprintManager.class);
    this.d = parama;
  }
  
  private void b() {
    this.b = true;
    CancellationSignal cancellationSignal = this.a;
    if (cancellationSignal != null) {
      cancellationSignal.cancel();
      this.a = null;
    } 
  }
  
  public void a() {
    b();
  }
  
  public void a(FingerprintManager.CryptoObject paramCryptoObject) {
    this.a = new CancellationSignal();
    this.b = false;
    this.c.authenticate(paramCryptoObject, this.a, 0, this, null);
  }
  
  public void onAuthenticationError(int paramInt, CharSequence paramCharSequence) {
    if (!this.b)
      this.d.a(paramCharSequence.toString(), paramInt); 
  }
  
  public void onAuthenticationFailed() {
    this.d.a("Not recognized. Try again.", 105);
  }
  
  public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult paramAuthenticationResult) {
    this.d.a();
    b();
  }
  
  public static interface a {
    void a();
    
    void a(String param1String, int param1Int);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/rnfingerprint/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */