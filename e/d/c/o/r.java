package e.d.c.o;

import e.d.c.b;
import java.util.HashMap;

public class r extends b {
  protected static final HashMap<Integer, String> e = new HashMap<Integer, String>();
  
  static {
    e.put(Integer.valueOf(2), "Distortion Param 2");
    e.put(Integer.valueOf(4), "Distortion Param 4");
    e.put(Integer.valueOf(5), "Distortion Scale");
    e.put(Integer.valueOf(7), "Distortion Correction");
    e.put(Integer.valueOf(8), "Distortion Param 8");
    e.put(Integer.valueOf(9), "Distortion Param 9");
    e.put(Integer.valueOf(11), "Distortion Param 11");
    e.put(Integer.valueOf(12), "Distortion N");
  }
  
  public r() {
    a(new q(this));
  }
  
  public String a() {
    return "PanasonicRaw DistortionInfo";
  }
  
  protected HashMap<Integer, String> b() {
    return e;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/o/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */