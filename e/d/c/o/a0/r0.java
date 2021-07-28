package e.d.c.o.a0;

import e.d.c.b;
import java.util.HashMap;

public class r0 extends b {
  protected static final HashMap<Integer, String> e = new HashMap<Integer, String>();
  
  static {
    e.put(Integer.valueOf(0), "Makernote Version");
    e.put(Integer.valueOf(2), "Firmware Version");
    e.put(Integer.valueOf(12), "Trigger Mode");
    e.put(Integer.valueOf(14), "Sequence");
    e.put(Integer.valueOf(18), "Event Number");
    e.put(Integer.valueOf(22), "Date/Time Original");
    e.put(Integer.valueOf(36), "Moon Phase");
    e.put(Integer.valueOf(38), "Ambient Temperature Fahrenheit");
    e.put(Integer.valueOf(40), "Ambient Temperature");
    e.put(Integer.valueOf(42), "Serial Number");
    e.put(Integer.valueOf(72), "Contrast");
    e.put(Integer.valueOf(74), "Brightness");
    e.put(Integer.valueOf(76), "Sharpness");
    e.put(Integer.valueOf(78), "Saturation");
    e.put(Integer.valueOf(80), "Infrared Illuminator");
    e.put(Integer.valueOf(82), "Motion Sensitivity");
    e.put(Integer.valueOf(84), "Battery Voltage");
    e.put(Integer.valueOf(86), "User Label");
  }
  
  public r0() {
    a(new q0(this));
  }
  
  public String a() {
    return "Reconyx HyperFire Makernote";
  }
  
  protected HashMap<Integer, String> b() {
    return e;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/o/a0/r0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */