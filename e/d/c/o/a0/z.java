package e.d.c.o.a0;

import e.d.c.b;
import java.util.HashMap;

public class z extends b {
  protected static final HashMap<Integer, String> e = new HashMap<Integer, String>();
  
  static {
    e.put(Integer.valueOf(0), "Equipment Version");
    e.put(Integer.valueOf(256), "Camera Type 2");
    e.put(Integer.valueOf(257), "Serial Number");
    e.put(Integer.valueOf(258), "Internal Serial Number");
    e.put(Integer.valueOf(259), "Focal Plane Diagonal");
    e.put(Integer.valueOf(260), "Body Firmware Version");
    e.put(Integer.valueOf(513), "Lens Type");
    e.put(Integer.valueOf(514), "Lens Serial Number");
    e.put(Integer.valueOf(515), "Lens Model");
    e.put(Integer.valueOf(516), "Lens Firmware Version");
    e.put(Integer.valueOf(517), "Max Aperture At Min Focal");
    e.put(Integer.valueOf(518), "Max Aperture At Max Focal");
    e.put(Integer.valueOf(519), "Min Focal Length");
    e.put(Integer.valueOf(520), "Max Focal Length");
    e.put(Integer.valueOf(522), "Max Aperture");
    e.put(Integer.valueOf(523), "Lens Properties");
    e.put(Integer.valueOf(769), "Extender");
    e.put(Integer.valueOf(770), "Extender Serial Number");
    e.put(Integer.valueOf(771), "Extender Model");
    e.put(Integer.valueOf(772), "Extender Firmware Version");
    e.put(Integer.valueOf(1027), "Conversion Lens");
    e.put(Integer.valueOf(4096), "Flash Type");
    e.put(Integer.valueOf(4097), "Flash Model");
    e.put(Integer.valueOf(4098), "Flash Firmware Version");
    e.put(Integer.valueOf(4099), "Flash Serial Number");
  }
  
  public z() {
    a(new y(this));
  }
  
  public String a() {
    return "Olympus Equipment";
  }
  
  protected HashMap<Integer, String> b() {
    return e;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/o/a0/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */