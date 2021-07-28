package e.d.c.o.a0;

import e.d.c.b;
import java.util.HashMap;

public class p0 extends b {
  protected static final HashMap<Integer, String> e = new HashMap<Integer, String>();
  
  static {
    e.put(Integer.valueOf(1), "Capture Mode");
    e.put(Integer.valueOf(2), "Quality Level");
    e.put(Integer.valueOf(3), "Focus Mode");
    e.put(Integer.valueOf(4), "Flash Mode");
    e.put(Integer.valueOf(7), "White Balance");
    e.put(Integer.valueOf(10), "Digital Zoom");
    e.put(Integer.valueOf(11), "Sharpness");
    e.put(Integer.valueOf(12), "Contrast");
    e.put(Integer.valueOf(13), "Saturation");
    e.put(Integer.valueOf(20), "ISO Speed");
    e.put(Integer.valueOf(23), "Colour");
    e.put(Integer.valueOf(3584), "Print Image Matching (PIM) Info");
    e.put(Integer.valueOf(4096), "Time Zone");
    e.put(Integer.valueOf(4097), "Daylight Savings");
  }
  
  public p0() {
    a(new o0(this));
  }
  
  public String a() {
    return "Pentax Makernote";
  }
  
  protected HashMap<Integer, String> b() {
    return e;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/o/a0/p0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */