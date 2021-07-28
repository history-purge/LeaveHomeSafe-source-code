package e.d.c.x.i;

import e.d.c.j;
import java.util.HashMap;

public class r extends a {
  protected static final HashMap<Integer, String> f = new HashMap<Integer, String>();
  
  static {
    a.a(f);
    f.put(Integer.valueOf(1), "Vendor");
    f.put(Integer.valueOf(2), "Temporal Quality");
    f.put(Integer.valueOf(3), "Spatial Quality");
    f.put(Integer.valueOf(4), "Width");
    f.put(Integer.valueOf(5), "Height");
    f.put(Integer.valueOf(6), "Horizontal Resolution");
    f.put(Integer.valueOf(7), "Vertical Resolution");
    f.put(Integer.valueOf(8), "Compressor Name");
    f.put(Integer.valueOf(9), "Depth");
    f.put(Integer.valueOf(10), "Compression Type");
    f.put(Integer.valueOf(11), "Graphics Mode");
    f.put(Integer.valueOf(12), "Opcolor");
    f.put(Integer.valueOf(13), "Color Table");
    f.put(Integer.valueOf(14), "Frame Rate");
  }
  
  public r() {
    a((j)new q(this));
  }
  
  public String a() {
    return "QuickTime Video";
  }
  
  protected HashMap<Integer, String> b() {
    return f;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/x/i/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */