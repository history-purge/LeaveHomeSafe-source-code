package e.f.c;

public final class d extends m {
  private static final d e;
  
  static {
    d d1 = new d();
    e = d1;
    d1.setStackTrace(m.d);
  }
  
  public static d a() {
    return m.c ? new d() : e;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */