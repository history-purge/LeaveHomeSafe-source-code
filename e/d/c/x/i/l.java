package e.d.c.x.i;

import e.d.c.j;
import e.d.c.x.d;
import java.util.HashMap;

public class l extends d {
  protected static final HashMap<Integer, String> f = new HashMap<Integer, String>();
  
  static {
    a.a(f);
    f.put(Integer.valueOf(1), "Auto Scale");
    f.put(Integer.valueOf(2), "Use Background Color");
    f.put(Integer.valueOf(3), "Scroll In");
    f.put(Integer.valueOf(4), "Scroll Out");
    f.put(Integer.valueOf(5), "Scroll Orientation");
    f.put(Integer.valueOf(6), "Scroll Direction");
    f.put(Integer.valueOf(7), "Continuous Scroll");
    f.put(Integer.valueOf(8), "Drop Shadow");
    f.put(Integer.valueOf(9), "Anti-aliasing");
    f.put(Integer.valueOf(10), "Display Text Background Color");
    f.put(Integer.valueOf(11), "Alignment");
    f.put(Integer.valueOf(12), "Background Color");
    f.put(Integer.valueOf(13), "Default Text Box");
    f.put(Integer.valueOf(14), "Font Number");
    f.put(Integer.valueOf(15), "Font Face");
    f.put(Integer.valueOf(16), "Foreground Color");
    f.put(Integer.valueOf(17), "Font Name");
  }
  
  public l() {
    a((j)new k(this));
  }
  
  public String a() {
    return "QuickTime Text";
  }
  
  protected HashMap<Integer, String> b() {
    return f;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/x/i/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */