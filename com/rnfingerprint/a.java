package com.rnfingerprint;

import com.facebook.react.bridge.Callback;

public class a implements d.c {
  private Callback a;
  
  private Callback b;
  
  public a(Callback paramCallback1, Callback paramCallback2) {
    this.a = paramCallback1;
    this.b = paramCallback2;
  }
  
  public void a() {
    FingerprintAuthModule.inProgress = false;
    this.b.invoke(new Object[] { "Successfully authenticated." });
  }
  
  public void b() {
    FingerprintAuthModule.inProgress = false;
    this.a.invoke(new Object[] { "cancelled", Integer.valueOf(106) });
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/rnfingerprint/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */