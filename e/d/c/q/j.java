package e.d.c.q;

import e.d.c.b;
import java.util.HashMap;

public class j extends b {
  protected static final HashMap<Integer, String> e = new HashMap<Integer, String>();
  
  static {
    e.put(Integer.valueOf(1), "Left");
    e.put(Integer.valueOf(2), "Top");
    e.put(Integer.valueOf(3), "Width");
    e.put(Integer.valueOf(4), "Height");
    e.put(Integer.valueOf(5), "Has Local Colour Table");
    e.put(Integer.valueOf(6), "Is Interlaced");
    e.put(Integer.valueOf(7), "Is Local Colour Table Sorted");
    e.put(Integer.valueOf(8), "Local Colour Table Bits Per Pixel");
  }
  
  public j() {
    a(new i(this));
  }
  
  public String a() {
    return "GIF Image";
  }
  
  protected HashMap<Integer, String> b() {
    return e;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/q/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */