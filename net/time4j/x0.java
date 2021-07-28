package net.time4j;

final class x0 extends a<Integer> implements d0 {
  static final x0 c = new x0();
  
  private static final long serialVersionUID = -2378018589067147278L;
  
  private x0() {
    super("WEEKDAY_IN_MONTH");
  }
  
  private Object readResolve() {
    return c;
  }
  
  public char a() {
    return 'F';
  }
  
  public Integer b() {
    return Integer.valueOf(5);
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
    return Integer.valueOf(1);
  }
  
  public boolean s() {
    return false;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/x0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */