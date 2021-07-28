package e.d.c.a0;

import e.d.c.b;
import java.util.HashMap;

public class i extends b {
  protected static final HashMap<Integer, String> e = new HashMap<Integer, String>();
  
  static {
    e.put(Integer.valueOf(1), "Channel Count");
    e.put(Integer.valueOf(2), "Image Height");
    e.put(Integer.valueOf(3), "Image Width");
    e.put(Integer.valueOf(4), "Bits Per Channel");
    e.put(Integer.valueOf(5), "Color Mode");
  }
  
  public i() {
    a(new h(this));
  }
  
  public String a() {
    return "PSD Header";
  }
  
  protected HashMap<Integer, String> b() {
    return e;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/a0/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */