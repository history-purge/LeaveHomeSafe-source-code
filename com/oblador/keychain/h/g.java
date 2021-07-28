package com.oblador.keychain.h;

import com.oblador.keychain.g.e;
import com.oblador.keychain.i.a;

public class g implements d {
  private e.c a;
  
  private Throwable b;
  
  public e.c a() {
    return this.a;
  }
  
  public void a(e.b paramb) {
    a(null, (Throwable)new a("Non interactive decryption mode."));
  }
  
  public void a(e.c paramc, Throwable paramThrowable) {
    this.a = paramc;
    this.b = paramThrowable;
  }
  
  public Throwable b() {
    return this.b;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/oblador/keychain/h/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */