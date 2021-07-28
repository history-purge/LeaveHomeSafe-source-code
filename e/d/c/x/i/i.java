package e.d.c.x.i;

import e.d.c.j;
import e.d.c.x.d;
import java.util.HashMap;

public class i extends d {
  protected static final HashMap<Integer, String> f = new HashMap<Integer, String>();
  
  static {
    a.a(f);
    f.put(Integer.valueOf(1), "Vertical Placement");
    f.put(Integer.valueOf(2), "Some Samples Forced");
    f.put(Integer.valueOf(3), "All Samples Forced");
    f.put(Integer.valueOf(4), "Default Text Box");
    f.put(Integer.valueOf(5), "Font Identifier");
    f.put(Integer.valueOf(6), "Font Face");
    f.put(Integer.valueOf(7), "Font Size");
    f.put(Integer.valueOf(8), "Foreground Color");
  }
  
  public i() {
    a((j)new h(this));
  }
  
  public String a() {
    return "QuickTime Subtitle";
  }
  
  protected HashMap<Integer, String> b() {
    return f;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/x/i/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */