package e.d.c.w;

import e.d.c.b;
import java.util.HashMap;

public class d extends b {
  protected static final HashMap<Integer, String> e = new HashMap<Integer, String>();
  
  static {
    e.put(Integer.valueOf(0), "JPEG Comment");
  }
  
  public d() {
    a(new c(this));
  }
  
  public String a() {
    return "JpegComment";
  }
  
  protected HashMap<Integer, String> b() {
    return e;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/w/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */