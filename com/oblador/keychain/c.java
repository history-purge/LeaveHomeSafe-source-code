package com.oblador.keychain;

import com.facebook.react.bridge.ReactApplicationContext;

public class c {
  private ReactApplicationContext a;
  
  private boolean b = true;
  
  private void b() {
    if (this.a != null)
      return; 
    throw new Error("React Context was not provided");
  }
  
  public KeychainModule a() {
    b();
    return this.b ? KeychainModule.withWarming(this.a) : new KeychainModule(this.a);
  }
  
  public c a(ReactApplicationContext paramReactApplicationContext) {
    this.a = paramReactApplicationContext;
    return this;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/oblador/keychain/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */