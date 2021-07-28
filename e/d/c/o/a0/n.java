package e.d.c.o.a0;

import e.d.c.b;
import java.util.HashMap;

public class n extends b {
  protected static final HashMap<Integer, String> e = new HashMap<Integer, String>();
  
  static {
    e.put(Integer.valueOf(1), "Proprietary Thumbnail Format Data");
    e.put(Integer.valueOf(3584), "Print Image Matching (PIM) Info");
  }
  
  public n() {
    a(new m(this));
  }
  
  public String a() {
    return "Kyocera/Contax Makernote";
  }
  
  protected HashMap<Integer, String> b() {
    return e;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/o/a0/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */