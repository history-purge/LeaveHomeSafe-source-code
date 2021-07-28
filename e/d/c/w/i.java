package e.d.c.w;

import e.d.c.b;
import java.util.HashMap;

public class i extends b {
  protected static final HashMap<Integer, String> e = new HashMap<Integer, String>();
  
  static {
    e.put(Integer.valueOf(-3), "Compression Type");
    e.put(Integer.valueOf(0), "Data Precision");
    e.put(Integer.valueOf(3), "Image Width");
    e.put(Integer.valueOf(1), "Image Height");
    e.put(Integer.valueOf(5), "Number of Components");
    e.put(Integer.valueOf(6), "Component 1");
    e.put(Integer.valueOf(7), "Component 2");
    e.put(Integer.valueOf(8), "Component 3");
    e.put(Integer.valueOf(9), "Component 4");
  }
  
  public i() {
    a(new g(this));
  }
  
  public String a() {
    return "JPEG";
  }
  
  protected HashMap<Integer, String> b() {
    return e;
  }
  
  public f v(int paramInt) {
    return (f)m(paramInt + 6);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/w/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */