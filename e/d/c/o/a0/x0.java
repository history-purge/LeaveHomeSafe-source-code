package e.d.c.o.a0;

import e.d.c.b;
import java.util.HashMap;

public class x0 extends b {
  protected static final HashMap<Integer, String> e = new HashMap<Integer, String>();
  
  static {
    e.put(Integer.valueOf(1), "Maker Note Version");
    e.put(Integer.valueOf(2), "Device Type");
    e.put(Integer.valueOf(3), "Model Id");
    e.put(Integer.valueOf(67), "Camera Temperature");
    e.put(Integer.valueOf(256), "Face Detect");
    e.put(Integer.valueOf(288), "Face Recognition");
    e.put(Integer.valueOf(291), "Face Name");
    e.put(Integer.valueOf(40961), "Firmware Name");
  }
  
  public x0() {
    a(new w0(this));
  }
  
  public String a() {
    return "Samsung Makernote";
  }
  
  protected HashMap<Integer, String> b() {
    return e;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/o/a0/x0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */