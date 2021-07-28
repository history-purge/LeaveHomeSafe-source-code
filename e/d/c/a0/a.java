package e.d.c.a0;

import e.d.c.b;
import e.d.c.j;
import java.util.HashMap;

public class a extends b {
  protected static final HashMap<Integer, String> e = new HashMap<Integer, String>();
  
  static {
    e.put(Integer.valueOf(1), "Quality");
    e.put(Integer.valueOf(2), "Comment");
    e.put(Integer.valueOf(3), "Copyright");
  }
  
  public a() {
    a(new j(this));
  }
  
  public String a() {
    return "Ducky";
  }
  
  protected HashMap<Integer, String> b() {
    return e;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/a0/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */