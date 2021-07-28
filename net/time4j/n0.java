package net.time4j;

import java.util.Comparator;
import net.time4j.d1.d0;
import net.time4j.d1.m0;
import net.time4j.d1.w;

class n0<U extends w> implements d0<U>, Comparator<m0.a<? extends w>> {
  private n0(boolean paramBoolean) {}
  
  static int a(w paramw1, w paramw2) {
    int i = Double.compare(paramw2.b(), paramw1.b());
    if (i == 0) {
      if (paramw1.equals(paramw2))
        return i; 
      throw new IllegalArgumentException("Mixing different units of same length not allowed.");
    } 
    return i;
  }
  
  static Comparator<m0.a<? extends w>> e() {
    return new n0<w>(false);
  }
  
  static n0<f> f() {
    return new n0<f>(false);
  }
  
  static n0<g> g() {
    return new n0<g>(false);
  }
  
  static n0<w> h() {
    return new n0<w>(true);
  }
  
  public int a(m0.a<? extends w> parama1, m0.a<? extends w> parama2) {
    return a((w)parama1.b(), (w)parama2.b());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/n0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */