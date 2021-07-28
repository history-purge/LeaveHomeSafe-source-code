package net.time4j.calendar;

import net.time4j.d1.e;

final class m extends e<Integer> {
  static final m c = new m();
  
  private static final long serialVersionUID = -1117064522468823402L;
  
  private m() {
    super("RELATED_GREGORIAN_YEAR");
  }
  
  public char a() {
    return 'r';
  }
  
  public Integer b() {
    return Integer.valueOf(999999999);
  }
  
  public boolean d() {
    return true;
  }
  
  protected boolean g() {
    return true;
  }
  
  public Class<Integer> getType() {
    return Integer.class;
  }
  
  public Integer q() {
    return Integer.valueOf(-999999999);
  }
  
  protected Object readResolve() {
    return c;
  }
  
  public boolean s() {
    return false;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/calendar/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */