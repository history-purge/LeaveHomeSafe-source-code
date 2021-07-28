package net.time4j;

import net.time4j.e1.d;

abstract class b<V extends Comparable<V>> extends d<V> implements c<V, g0> {
  b(String paramString) {
    super(paramString);
    new q0(this, 0);
    new q0(this, 1);
  }
  
  public o<g0> a(V paramV) {
    return new q0(this, 6, paramV);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */