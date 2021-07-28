package e.d.c.o.a0;

import e.d.c.b;
import java.util.HashMap;

public class b0 extends b {
  protected static final HashMap<Integer, String> e = new HashMap<Integer, String>();
  
  static {
    e.put(Integer.valueOf(0), "Focus Info Version");
    e.put(Integer.valueOf(521), "Auto Focus");
    e.put(Integer.valueOf(528), "Scene Detect");
    e.put(Integer.valueOf(529), "Scene Area");
    e.put(Integer.valueOf(530), "Scene Detect Data");
    e.put(Integer.valueOf(768), "Zoom Step Count");
    e.put(Integer.valueOf(769), "Focus Step Count");
    e.put(Integer.valueOf(771), "Focus Step Infinity");
    e.put(Integer.valueOf(772), "Focus Step Near");
    e.put(Integer.valueOf(773), "Focus Distance");
    e.put(Integer.valueOf(776), "AF Point");
    e.put(Integer.valueOf(808), "AF Info");
    e.put(Integer.valueOf(4609), "External Flash");
    e.put(Integer.valueOf(4611), "External Flash Guide Number");
    e.put(Integer.valueOf(4612), "External Flash Bounce");
    e.put(Integer.valueOf(4613), "External Flash Zoom");
    e.put(Integer.valueOf(4616), "Internal Flash");
    e.put(Integer.valueOf(4617), "Manual Flash");
    e.put(Integer.valueOf(4618), "Macro LED");
    e.put(Integer.valueOf(5376), "Sensor Temperature");
    e.put(Integer.valueOf(5632), "Image Stabilization");
  }
  
  public b0() {
    a(new a0(this));
  }
  
  public String a() {
    return "Olympus Focus Info";
  }
  
  protected HashMap<Integer, String> b() {
    return e;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/o/a0/b0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */