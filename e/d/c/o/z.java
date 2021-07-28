package e.d.c.o;

import e.d.c.b;
import java.util.HashMap;

public class z extends b {
  protected static final HashMap<Integer, String> e = new HashMap<Integer, String>();
  
  static {
    e.put(Integer.valueOf(0), "PrintIM Version");
  }
  
  public z() {
    a(new y(this));
  }
  
  public String a() {
    return "PrintIM";
  }
  
  protected HashMap<Integer, String> b() {
    return e;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/o/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */