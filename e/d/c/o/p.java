package e.d.c.o;

import e.d.b.i;
import e.d.b.m;
import java.util.HashMap;

public class p extends b {
  protected static final HashMap<Integer, String> e = new HashMap<Integer, String>();
  
  static {
    b.a(e);
    e.put(Integer.valueOf(0), "GPS Version ID");
    e.put(Integer.valueOf(1), "GPS Latitude Ref");
    e.put(Integer.valueOf(2), "GPS Latitude");
    e.put(Integer.valueOf(3), "GPS Longitude Ref");
    e.put(Integer.valueOf(4), "GPS Longitude");
    e.put(Integer.valueOf(5), "GPS Altitude Ref");
    e.put(Integer.valueOf(6), "GPS Altitude");
    e.put(Integer.valueOf(7), "GPS Time-Stamp");
    e.put(Integer.valueOf(8), "GPS Satellites");
    e.put(Integer.valueOf(9), "GPS Status");
    e.put(Integer.valueOf(10), "GPS Measure Mode");
    e.put(Integer.valueOf(11), "GPS DOP");
    e.put(Integer.valueOf(12), "GPS Speed Ref");
    e.put(Integer.valueOf(13), "GPS Speed");
    e.put(Integer.valueOf(14), "GPS Track Ref");
    e.put(Integer.valueOf(15), "GPS Track");
    e.put(Integer.valueOf(16), "GPS Img Direction Ref");
    e.put(Integer.valueOf(17), "GPS Img Direction");
    e.put(Integer.valueOf(18), "GPS Map Datum");
    e.put(Integer.valueOf(19), "GPS Dest Latitude Ref");
    e.put(Integer.valueOf(20), "GPS Dest Latitude");
    e.put(Integer.valueOf(21), "GPS Dest Longitude Ref");
    e.put(Integer.valueOf(22), "GPS Dest Longitude");
    e.put(Integer.valueOf(23), "GPS Dest Bearing Ref");
    e.put(Integer.valueOf(24), "GPS Dest Bearing");
    e.put(Integer.valueOf(25), "GPS Dest Distance Ref");
    e.put(Integer.valueOf(26), "GPS Dest Distance");
    e.put(Integer.valueOf(27), "GPS Processing Method");
    e.put(Integer.valueOf(28), "GPS Area Information");
    e.put(Integer.valueOf(29), "GPS Date Stamp");
    e.put(Integer.valueOf(30), "GPS Differential");
  }
  
  public p() {
    a(new o(this));
  }
  
  public String a() {
    return "GPS";
  }
  
  protected HashMap<Integer, String> b() {
    return e;
  }
  
  public i f() {
    m[] arrayOfM2 = o(2);
    m[] arrayOfM1 = o(4);
    String str2 = p(1);
    String str1 = p(3);
    if (arrayOfM2 != null) {
      if (arrayOfM2.length != 3)
        return null; 
      if (arrayOfM1 != null) {
        if (arrayOfM1.length != 3)
          return null; 
        if (str2 != null) {
          if (str1 == null)
            return null; 
          Double double_2 = i.a(arrayOfM2[0], arrayOfM2[1], arrayOfM2[2], str2.equalsIgnoreCase("S"));
          Double double_1 = i.a(arrayOfM1[0], arrayOfM1[1], arrayOfM1[2], str1.equalsIgnoreCase("W"));
          if (double_2 != null)
            return (double_1 == null) ? null : new i(double_2.doubleValue(), double_1.doubleValue()); 
        } 
      } 
    } 
    return null;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/o/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */