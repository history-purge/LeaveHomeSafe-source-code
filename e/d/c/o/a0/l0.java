package e.d.c.o.a0;

import e.d.c.b;
import java.util.HashMap;

public class l0 extends b {
  protected static final HashMap<Integer, String> e = new HashMap<Integer, String>();
  
  static {
    e.put(Integer.valueOf(0), "Raw Info Version");
    e.put(Integer.valueOf(256), "WB RB Levels Used");
    e.put(Integer.valueOf(272), "WB RB Levels Auto");
    e.put(Integer.valueOf(288), "WB RB Levels Shade");
    e.put(Integer.valueOf(289), "WB RB Levels Cloudy");
    e.put(Integer.valueOf(290), "WB RB Levels Fine Weather");
    e.put(Integer.valueOf(291), "WB RB Levels Tungsten");
    e.put(Integer.valueOf(292), "WB RB Levels Evening Sunlight");
    e.put(Integer.valueOf(304), "WB RB Levels Daylight Fluor");
    e.put(Integer.valueOf(305), "WB RB Levels Day White Fluor");
    e.put(Integer.valueOf(306), "WB RB Levels Cool White Fluor");
    e.put(Integer.valueOf(307), "WB RB Levels White Fluorescent");
    e.put(Integer.valueOf(512), "Color Matrix 2");
    e.put(Integer.valueOf(784), "Coring Filter");
    e.put(Integer.valueOf(785), "Coring Values");
    e.put(Integer.valueOf(1536), "Black Level 2");
    e.put(Integer.valueOf(1537), "YCbCrCoefficients");
    e.put(Integer.valueOf(1553), "Valid Pixel Depth");
    e.put(Integer.valueOf(1554), "Crop Left");
    e.put(Integer.valueOf(1555), "Crop Top");
    e.put(Integer.valueOf(1556), "Crop Width");
    e.put(Integer.valueOf(1557), "Crop Height");
    e.put(Integer.valueOf(4096), "Light Source");
    e.put(Integer.valueOf(4097), "White Balance Comp");
    e.put(Integer.valueOf(4112), "Saturation Setting");
    e.put(Integer.valueOf(4113), "Hue Setting");
    e.put(Integer.valueOf(4114), "Contrast Setting");
    e.put(Integer.valueOf(4115), "Sharpness Setting");
    e.put(Integer.valueOf(8192), "CM Exposure Compensation");
    e.put(Integer.valueOf(8193), "CM White Balance");
    e.put(Integer.valueOf(8194), "CM White Balance Comp");
    e.put(Integer.valueOf(8208), "CM White Balance Gray Point");
    e.put(Integer.valueOf(8224), "CM Saturation");
    e.put(Integer.valueOf(8225), "CM Hue");
    e.put(Integer.valueOf(8226), "CM Contrast");
    e.put(Integer.valueOf(8227), "CM Sharpness");
  }
  
  public l0() {
    a(new k0(this));
  }
  
  public String a() {
    return "Olympus Raw Info";
  }
  
  protected HashMap<Integer, String> b() {
    return e;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/o/a0/l0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */