package e.d.c.l;

import e.d.c.b;
import java.util.HashMap;

public class b extends b {
  protected static final HashMap<Integer, String> e = new HashMap<Integer, String>();
  
  static {
    e.put(Integer.valueOf(1), "Frames Per Second");
    e.put(Integer.valueOf(2), "Samples Per Second");
    e.put(Integer.valueOf(3), "Duration");
    e.put(Integer.valueOf(4), "Video Codec");
    e.put(Integer.valueOf(5), "Audio Codec");
    e.put(Integer.valueOf(6), "Width");
    e.put(Integer.valueOf(7), "Height");
    e.put(Integer.valueOf(8), "Stream Count");
  }
  
  public b() {
    a(new a(this));
  }
  
  public String a() {
    return "AVI";
  }
  
  protected HashMap<Integer, String> b() {
    return e;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/l/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */