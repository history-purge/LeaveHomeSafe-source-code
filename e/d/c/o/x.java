package e.d.c.o;

import e.d.c.b;
import java.util.HashMap;

public class x extends b {
  protected static final HashMap<Integer, String> e = new HashMap<Integer, String>();
  
  static {
    e.put(Integer.valueOf(0), "Num WB Entries");
    e.put(Integer.valueOf(1), "WB Type 1");
    e.put(Integer.valueOf(2), "WB RGB Levels 1");
    e.put(Integer.valueOf(4), "WB Type 2");
    e.put(Integer.valueOf(5), "WB RGB Levels 2");
    e.put(Integer.valueOf(7), "WB Type 3");
    e.put(Integer.valueOf(8), "WB RGB Levels 3");
    e.put(Integer.valueOf(10), "WB Type 4");
    e.put(Integer.valueOf(11), "WB RGB Levels 4");
    e.put(Integer.valueOf(13), "WB Type 5");
    e.put(Integer.valueOf(14), "WB RGB Levels 5");
    e.put(Integer.valueOf(16), "WB Type 6");
    e.put(Integer.valueOf(17), "WB RGB Levels 6");
    e.put(Integer.valueOf(19), "WB Type 7");
    e.put(Integer.valueOf(20), "WB RGB Levels 7");
  }
  
  public x() {
    a(new w(this));
  }
  
  public String a() {
    return "PanasonicRaw WbInfo";
  }
  
  protected HashMap<Integer, String> b() {
    return e;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/o/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */