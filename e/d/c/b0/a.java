package e.d.c.b0;

import e.d.c.b;
import e.d.c.j;
import java.util.HashMap;

public class a extends b {
  protected static final HashMap<Integer, String> e = new HashMap<Integer, String>();
  
  static {
    e.put(Integer.valueOf(1), "White Point X");
    e.put(Integer.valueOf(2), "White Point Y");
    e.put(Integer.valueOf(3), "Red X");
    e.put(Integer.valueOf(4), "Red Y");
    e.put(Integer.valueOf(5), "Green X");
    e.put(Integer.valueOf(6), "Green Y");
    e.put(Integer.valueOf(7), "Blue X");
    e.put(Integer.valueOf(8), "Blue Y");
  }
  
  public a() {
    a(new j(this));
  }
  
  public String a() {
    return "PNG Chromaticities";
  }
  
  protected HashMap<Integer, String> b() {
    return e;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/b0/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */