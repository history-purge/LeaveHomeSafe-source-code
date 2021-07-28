package e.d.c.o.a0;

import e.d.c.b;
import java.util.HashMap;

public class t0 extends b {
  protected static final HashMap<Integer, String> e = new HashMap<Integer, String>();
  
  static {
    e.put(Integer.valueOf(0), "Makernote Label");
    e.put(Integer.valueOf(10), "Makernote ID");
    e.put(Integer.valueOf(14), "Makernote Size");
    e.put(Integer.valueOf(18), "Makernote Public ID");
    e.put(Integer.valueOf(22), "Makernote Public Size");
    e.put(Integer.valueOf(24), "Camera Version");
    e.put(Integer.valueOf(31), "Uib Version");
    e.put(Integer.valueOf(38), "Btl Version");
    e.put(Integer.valueOf(45), "Pex Version");
    e.put(Integer.valueOf(52), "Event Type");
    e.put(Integer.valueOf(53), "Sequence");
    e.put(Integer.valueOf(55), "Event Number");
    e.put(Integer.valueOf(59), "Date/Time Original");
    e.put(Integer.valueOf(66), "Day of Week");
    e.put(Integer.valueOf(67), "Moon Phase");
    e.put(Integer.valueOf(68), "Ambient Temperature Fahrenheit");
    e.put(Integer.valueOf(70), "Ambient Temperature");
    e.put(Integer.valueOf(72), "Flash");
    e.put(Integer.valueOf(73), "Battery Voltage");
    e.put(Integer.valueOf(75), "Serial Number");
    e.put(Integer.valueOf(80), "User Label");
  }
  
  public t0() {
    a(new s0(this));
  }
  
  public String a() {
    return "Reconyx UltraFire Makernote";
  }
  
  protected HashMap<Integer, String> b() {
    return e;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/o/a0/t0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */