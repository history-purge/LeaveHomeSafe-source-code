package net.time4j;

import net.time4j.e1.d;

abstract class a<V extends Comparable<V>> extends d<V> implements c<V, f0> {
  a(String paramString) {
    super(paramString);
    new i(this, 0);
    new i(this, 1);
  }
  
  public o<f0> a(V paramV) {
    return new i(this, 6, paramV);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */