package com.facebook.imagepipeline.memory;

import e.e.e.h.b;
import java.util.LinkedList;

class c0<V> extends f<V> {
  private LinkedList<b<V>> f = new LinkedList<b<V>>();
  
  public c0(int paramInt1, int paramInt2, int paramInt3) {
    super(paramInt1, paramInt2, paramInt3, false);
  }
  
  void a(V paramV) {
    b b2 = this.f.poll();
    b b1 = b2;
    if (b2 == null)
      b1 = new b(); 
    b1.a(paramV);
    this.c.add(b1);
  }
  
  public V f() {
    b<V> b = this.c.poll();
    Object object = b.b();
    b.a();
    this.f.add(b);
    return (V)object;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/imagepipeline/memory/c0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */