package e.d.c.q;

import e.d.c.b;
import java.util.HashMap;

public class h extends b {
  protected static final HashMap<Integer, String> e = new HashMap<Integer, String>();
  
  static {
    e.put(Integer.valueOf(1), "GIF Format Version");
    e.put(Integer.valueOf(3), "Image Height");
    e.put(Integer.valueOf(2), "Image Width");
    e.put(Integer.valueOf(4), "Color Table Size");
    e.put(Integer.valueOf(5), "Is Color Table Sorted");
    e.put(Integer.valueOf(6), "Bits per Pixel");
    e.put(Integer.valueOf(7), "Has Global Color Table");
    e.put(Integer.valueOf(8), "Background Color Index");
    e.put(Integer.valueOf(9), "Pixel Aspect Ratio");
  }
  
  public h() {
    a(new g(this));
  }
  
  public String a() {
    return "GIF Header";
  }
  
  protected HashMap<Integer, String> b() {
    return e;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/q/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */