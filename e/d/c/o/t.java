package e.d.c.o;

import e.d.c.b;
import java.util.HashMap;

public class t extends b {
  protected static final HashMap<Integer, String> e = new HashMap<Integer, String>();
  
  static {
    e.put(Integer.valueOf(1), "Panasonic Raw Version");
    e.put(Integer.valueOf(2), "Sensor Width");
    e.put(Integer.valueOf(3), "Sensor Height");
    e.put(Integer.valueOf(4), "Sensor Top Border");
    e.put(Integer.valueOf(5), "Sensor Left Border");
    e.put(Integer.valueOf(6), "Sensor Bottom Border");
    e.put(Integer.valueOf(7), "Sensor Right Border");
    e.put(Integer.valueOf(8), "Black Level 1");
    e.put(Integer.valueOf(9), "Black Level 2");
    e.put(Integer.valueOf(10), "Black Level 3");
    e.put(Integer.valueOf(14), "Linearity Limit Red");
    e.put(Integer.valueOf(15), "Linearity Limit Green");
    e.put(Integer.valueOf(16), "Linearity Limit Blue");
    e.put(Integer.valueOf(17), "Red Balance");
    e.put(Integer.valueOf(18), "Blue Balance");
    e.put(Integer.valueOf(23), "ISO");
    e.put(Integer.valueOf(24), "High ISO Multiplier Red");
    e.put(Integer.valueOf(25), "High ISO Multiplier Green");
    e.put(Integer.valueOf(26), "High ISO Multiplier Blue");
    e.put(Integer.valueOf(28), "Black Level Red");
    e.put(Integer.valueOf(29), "Black Level Green");
    e.put(Integer.valueOf(30), "Black Level Blue");
    e.put(Integer.valueOf(36), "WB Red Level");
    e.put(Integer.valueOf(37), "WB Green Level");
    e.put(Integer.valueOf(38), "WB Blue Level");
    e.put(Integer.valueOf(46), "Jpg From Raw");
    e.put(Integer.valueOf(47), "Crop Top");
    e.put(Integer.valueOf(48), "Crop Left");
    e.put(Integer.valueOf(49), "Crop Bottom");
    e.put(Integer.valueOf(50), "Crop Right");
    e.put(Integer.valueOf(271), "Make");
    e.put(Integer.valueOf(272), "Model");
    e.put(Integer.valueOf(273), "Strip Offsets");
    e.put(Integer.valueOf(274), "Orientation");
    e.put(Integer.valueOf(278), "Rows Per Strip");
    e.put(Integer.valueOf(279), "Strip Byte Counts");
    e.put(Integer.valueOf(280), "Raw Data Offset");
  }
  
  public t() {
    a(new s(this));
  }
  
  public String a() {
    return "PanasonicRaw Exif IFD0";
  }
  
  protected HashMap<Integer, String> b() {
    return e;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/o/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */