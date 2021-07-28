package e.d.c.o.a0;

import e.d.c.b;
import java.util.HashMap;

public class p extends b {
  protected static final HashMap<Integer, String> e = new HashMap<Integer, String>();
  
  static {
    e.put(Integer.valueOf(768), "Quality");
    e.put(Integer.valueOf(770), "User Profile");
    e.put(Integer.valueOf(771), "Serial Number");
    e.put(Integer.valueOf(772), "White Balance");
    e.put(Integer.valueOf(784), "Lens Type");
    e.put(Integer.valueOf(785), "External Sensor Brightness Value");
    e.put(Integer.valueOf(786), "Measured LV");
    e.put(Integer.valueOf(787), "Approximate F Number");
    e.put(Integer.valueOf(800), "Camera Temperature");
    e.put(Integer.valueOf(801), "Color Temperature");
    e.put(Integer.valueOf(802), "WB Red Level");
    e.put(Integer.valueOf(803), "WB Green Level");
    e.put(Integer.valueOf(804), "WB Blue Level");
    e.put(Integer.valueOf(816), "CCD Version");
    e.put(Integer.valueOf(817), "CCD Board Version");
    e.put(Integer.valueOf(818), "Controller Board Version");
    e.put(Integer.valueOf(819), "M16 C Version");
    e.put(Integer.valueOf(832), "Image ID Number");
  }
  
  public p() {
    a(new o(this));
  }
  
  public String a() {
    return "Leica Makernote";
  }
  
  protected HashMap<Integer, String> b() {
    return e;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/o/a0/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */