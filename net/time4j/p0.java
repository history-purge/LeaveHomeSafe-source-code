package net.time4j;

import net.time4j.d1.e;

final class p0 extends e<g0> implements t0 {
  static final p0 c = new p0();
  
  private static final long serialVersionUID = -3712256393866098916L;
  
  private p0() {
    super("WALL_TIME");
  }
  
  private Object readResolve() {
    return c;
  }
  
  public g0 b() {
    return g0.a(23, 59, 59, 999999999);
  }
  
  public boolean d() {
    return false;
  }
  
  protected boolean g() {
    return true;
  }
  
  public Class<g0> getType() {
    return g0.class;
  }
  
  public g0 q() {
    return g0.o;
  }
  
  public boolean s() {
    return true;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/p0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */