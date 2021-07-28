package e.d.c.z;

import e.d.c.b;
import java.util.HashMap;

public class b extends b {
  protected static final HashMap<Integer, String> e = new HashMap<Integer, String>();
  
  static {
    e.put(Integer.valueOf(1), "Version");
    e.put(Integer.valueOf(2), "Bits Per Pixel");
    e.put(Integer.valueOf(3), "X Min");
    e.put(Integer.valueOf(4), "Y Min");
    e.put(Integer.valueOf(5), "X Max");
    e.put(Integer.valueOf(6), "Y Max");
    e.put(Integer.valueOf(7), "Horizontal DPI");
    e.put(Integer.valueOf(8), "Vertical DPI");
    e.put(Integer.valueOf(9), "Palette");
    e.put(Integer.valueOf(10), "Color Planes");
    e.put(Integer.valueOf(11), "Bytes Per Line");
    e.put(Integer.valueOf(12), "Palette Type");
    e.put(Integer.valueOf(13), "H Scr Size");
    e.put(Integer.valueOf(14), "V Scr Size");
  }
  
  public b() {
    a(new a(this));
  }
  
  public String a() {
    return "PCX";
  }
  
  protected HashMap<Integer, String> b() {
    return e;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/z/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */