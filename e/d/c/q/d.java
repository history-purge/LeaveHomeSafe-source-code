package e.d.c.q;

import e.d.c.b;
import e.d.c.h;
import java.util.HashMap;

public class d extends b {
  protected static final HashMap<Integer, String> e = new HashMap<Integer, String>();
  
  static {
    e.put(Integer.valueOf(1), "Comment");
  }
  
  public d(h paramh) {
    a(new c(this));
    a(1, paramh);
  }
  
  public String a() {
    return "GIF Comment";
  }
  
  protected HashMap<Integer, String> b() {
    return e;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/q/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */