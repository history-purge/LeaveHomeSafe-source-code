package e.d.c.o;

import e.d.c.b;
import java.util.HashMap;

public class v extends b {
  protected static final HashMap<Integer, String> e = new HashMap<Integer, String>();
  
  static {
    HashMap<Integer, String> hashMap = e;
    Integer integer = Integer.valueOf(0);
    hashMap.put(integer, "Num WB Entries");
    e.put(integer, "Num WB Entries");
    e.put(Integer.valueOf(1), "WB Type 1");
    e.put(Integer.valueOf(2), "WB RGB Levels 1");
    e.put(Integer.valueOf(5), "WB Type 2");
    e.put(Integer.valueOf(6), "WB RGB Levels 2");
    e.put(Integer.valueOf(9), "WB Type 3");
    e.put(Integer.valueOf(10), "WB RGB Levels 3");
    e.put(Integer.valueOf(13), "WB Type 4");
    e.put(Integer.valueOf(14), "WB RGB Levels 4");
    e.put(Integer.valueOf(17), "WB Type 5");
    e.put(Integer.valueOf(18), "WB RGB Levels 5");
    e.put(Integer.valueOf(21), "WB Type 6");
    e.put(Integer.valueOf(22), "WB RGB Levels 6");
    e.put(Integer.valueOf(25), "WB Type 7");
    e.put(Integer.valueOf(26), "WB RGB Levels 7");
  }
  
  public v() {
    a(new u(this));
  }
  
  public String a() {
    return "PanasonicRaw WbInfo2";
  }
  
  protected HashMap<Integer, String> b() {
    return e;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/o/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */