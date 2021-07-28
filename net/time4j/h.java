package net.time4j;

import net.time4j.d1.e;

final class h extends e<f0> implements e {
  static final h c = new h();
  
  private static final long serialVersionUID = -6519899440006935829L;
  
  private h() {
    super("CALENDAR_DATE");
  }
  
  private Object readResolve() {
    return c;
  }
  
  public f0 b() {
    return f0.g;
  }
  
  public boolean d() {
    return true;
  }
  
  protected boolean g() {
    return true;
  }
  
  public Class<f0> getType() {
    return f0.class;
  }
  
  public f0 q() {
    return f0.f;
  }
  
  public boolean s() {
    return false;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */