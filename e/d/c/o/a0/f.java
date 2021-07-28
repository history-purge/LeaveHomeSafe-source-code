package e.d.c.o.a0;

import e.d.c.b;
import java.util.HashMap;

public class f extends b {
  protected static final HashMap<Integer, String> e = new HashMap<Integer, String>();
  
  static {
    e.put(Integer.valueOf(20), "CCD Sensitivity");
    e.put(Integer.valueOf(12), "Contrast");
    e.put(Integer.valueOf(10), "Digital Zoom");
    e.put(Integer.valueOf(5), "Flash Intensity");
    e.put(Integer.valueOf(4), "Flash Mode");
    e.put(Integer.valueOf(3), "Focusing Mode");
    e.put(Integer.valueOf(6), "Object Distance");
    e.put(Integer.valueOf(2), "Quality");
    e.put(Integer.valueOf(1), "Recording Mode");
    e.put(Integer.valueOf(13), "Saturation");
    e.put(Integer.valueOf(11), "Sharpness");
    e.put(Integer.valueOf(8), "Makernote Unknown 1");
    e.put(Integer.valueOf(9), "Makernote Unknown 2");
    e.put(Integer.valueOf(14), "Makernote Unknown 3");
    e.put(Integer.valueOf(15), "Makernote Unknown 4");
    e.put(Integer.valueOf(16), "Makernote Unknown 5");
    e.put(Integer.valueOf(17), "Makernote Unknown 6");
    e.put(Integer.valueOf(18), "Makernote Unknown 7");
    e.put(Integer.valueOf(19), "Makernote Unknown 8");
    e.put(Integer.valueOf(7), "White Balance");
  }
  
  public f() {
    a(new e(this));
  }
  
  public String a() {
    return "Casio Makernote";
  }
  
  protected HashMap<Integer, String> b() {
    return e;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/o/a0/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */