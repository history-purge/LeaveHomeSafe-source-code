package e.d.c.o.a0;

import e.d.c.b;
import java.util.HashMap;

public class r extends b {
  protected static final HashMap<Integer, String> e = new HashMap<Integer, String>();
  
  static {
    e.put(Integer.valueOf(771), "Lens Model");
    e.put(Integer.valueOf(1031), "Original File Name");
    e.put(Integer.valueOf(1032), "Original Directory");
    e.put(Integer.valueOf(1037), "Exposure Mode");
    e.put(Integer.valueOf(1040), "Shot Info");
    e.put(Integer.valueOf(1042), "Film Mode");
    e.put(Integer.valueOf(1043), "WB RGB Levels");
  }
  
  public r() {
    a(new q(this));
  }
  
  public String a() {
    return "Leica Makernote";
  }
  
  protected HashMap<Integer, String> b() {
    return e;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/o/a0/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */