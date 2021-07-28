package e.d.c.s;

import e.d.c.b;
import java.util.HashMap;

public class b extends b {
  protected static final HashMap<Integer, String> e = new HashMap<Integer, String>();
  
  static {
    e.put(Integer.valueOf(1), "Image Type");
    e.put(Integer.valueOf(2), "Image Width");
    e.put(Integer.valueOf(3), "Image Height");
    e.put(Integer.valueOf(4), "Colour Palette Size");
    e.put(Integer.valueOf(5), "Colour Planes");
    e.put(Integer.valueOf(6), "Hotspot X");
    e.put(Integer.valueOf(7), "Bits Per Pixel");
    e.put(Integer.valueOf(8), "Hotspot Y");
    e.put(Integer.valueOf(9), "Image Size Bytes");
    e.put(Integer.valueOf(10), "Image Offset Bytes");
  }
  
  public b() {
    a(new a(this));
  }
  
  public String a() {
    return "ICO";
  }
  
  protected HashMap<Integer, String> b() {
    return e;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/s/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */