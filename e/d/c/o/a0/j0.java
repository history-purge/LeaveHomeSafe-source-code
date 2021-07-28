package e.d.c.o.a0;

import e.d.c.b;
import java.util.HashMap;

public class j0 extends b {
  protected static final HashMap<Integer, String> e = new HashMap<Integer, String>();
  
  static {
    e.put(Integer.valueOf(0), "Raw Dev Version");
    e.put(Integer.valueOf(256), "Raw Dev Exposure Bias Value");
    e.put(Integer.valueOf(257), "Raw Dev White Balance Value");
    e.put(Integer.valueOf(258), "Raw Dev WB Fine Adjustment");
    e.put(Integer.valueOf(259), "Raw Dev Gray Point");
    e.put(Integer.valueOf(260), "Raw Dev Saturation Emphasis");
    e.put(Integer.valueOf(261), "Raw Dev Memory Color Emphasis");
    e.put(Integer.valueOf(262), "Raw Dev Contrast Value");
    e.put(Integer.valueOf(263), "Raw Dev Sharpness Value");
    e.put(Integer.valueOf(264), "Raw Dev Color Space");
    e.put(Integer.valueOf(265), "Raw Dev Engine");
    e.put(Integer.valueOf(266), "Raw Dev Noise Reduction");
    e.put(Integer.valueOf(267), "Raw Dev Edit Status");
    e.put(Integer.valueOf(268), "Raw Dev Settings");
  }
  
  public j0() {
    a(new i0(this));
  }
  
  public String a() {
    return "Olympus Raw Development";
  }
  
  protected HashMap<Integer, String> b() {
    return e;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/o/a0/j0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */