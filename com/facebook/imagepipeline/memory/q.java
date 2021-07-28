package com.facebook.imagepipeline.memory;

import e.e.e.d.i;
import e.e.e.g.c;
import e.e.e.h.c;

public class q {
  private final c<byte[]> a;
  
  final b b;
  
  public q(c paramc, g0 paramg0) {
    boolean bool;
    if (paramg0.e > 0) {
      bool = true;
    } else {
      bool = false;
    } 
    i.a(bool);
    this.b = new b(paramc, paramg0, b0.c());
    this.a = new a(this);
  }
  
  public e.e.e.h.a<byte[]> a(int paramInt) {
    return e.e.e.h.a.a(this.b.get(paramInt), this.a);
  }
  
  public void a(byte[] paramArrayOfbyte) {
    this.b.a(paramArrayOfbyte);
  }
  
  class a implements c<byte[]> {
    a(q this$0) {}
    
    public void a(byte[] param1ArrayOfbyte) {
      this.a.a(param1ArrayOfbyte);
    }
  }
  
  static class b extends r {
    public b(c param1c, g0 param1g0, h0 param1h0) {
      super(param1c, param1g0, param1h0);
    }
    
    f<byte[]> f(int param1Int) {
      e(param1Int);
      return (f)new c0<byte>(param1Int, this.c.e, 0);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/imagepipeline/memory/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */