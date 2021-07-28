package e.d.c.y.h;

import java.util.HashMap;

public class o extends d {
  protected static final HashMap<Integer, String> f = new HashMap<Integer, String>();
  
  static {
    d.a(f);
    f.put(Integer.valueOf(101), "Vendor");
    f.put(Integer.valueOf(102), "Temporal Quality");
    f.put(Integer.valueOf(103), "Spatial Quality");
    f.put(Integer.valueOf(104), "Width");
    f.put(Integer.valueOf(105), "Height");
    f.put(Integer.valueOf(106), "Horizontal Resolution");
    f.put(Integer.valueOf(107), "Vertical Resolution");
    f.put(Integer.valueOf(108), "Compressor Name");
    f.put(Integer.valueOf(109), "Depth");
    f.put(Integer.valueOf(110), "Compression Type");
    f.put(Integer.valueOf(111), "Graphics Mode");
    f.put(Integer.valueOf(112), "Opcolor");
    f.put(Integer.valueOf(113), "Color Table");
    f.put(Integer.valueOf(114), "Frame Rate");
  }
  
  public o() {
    a(new n(this));
  }
  
  public String a() {
    return "MP4 Video";
  }
  
  protected HashMap<Integer, String> b() {
    return f;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/y/h/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */