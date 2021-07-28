package e.d.c.o.a0;

import e.d.c.b;
import java.util.HashMap;

public class t extends b {
  protected static final HashMap<Integer, String> e = new HashMap<Integer, String>();
  
  static {
    e.put(Integer.valueOf(6), "CCD Sensitivity");
    e.put(Integer.valueOf(4), "Color Mode");
    e.put(Integer.valueOf(10), "Digital Zoom");
    e.put(Integer.valueOf(11), "Fisheye Converter");
    e.put(Integer.valueOf(8), "Focus");
    e.put(Integer.valueOf(5), "Image Adjustment");
    e.put(Integer.valueOf(3), "Quality");
    e.put(Integer.valueOf(2), "Makernote Unknown 1");
    e.put(Integer.valueOf(9), "Makernote Unknown 2");
    e.put(Integer.valueOf(3840), "Makernote Unknown 3");
    e.put(Integer.valueOf(7), "White Balance");
  }
  
  public t() {
    a(new s(this));
  }
  
  public String a() {
    return "Nikon Makernote";
  }
  
  protected HashMap<Integer, String> b() {
    return e;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/o/a0/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */