package e.d.c.x.i;

import e.d.c.j;
import e.d.c.x.d;
import java.util.HashMap;

public class o extends d {
  protected static final HashMap<Integer, String> f = new HashMap<Integer, String>();
  
  static {
    a.a(f);
    f.put(Integer.valueOf(1), "Drop Frame");
    f.put(Integer.valueOf(2), "24 Hour Max");
    f.put(Integer.valueOf(3), "Negative Times OK");
    f.put(Integer.valueOf(4), "Counter");
    f.put(Integer.valueOf(5), "Text Font");
    f.put(Integer.valueOf(6), "Text Face");
    f.put(Integer.valueOf(7), "Text Size");
    f.put(Integer.valueOf(8), "Text Color");
    f.put(Integer.valueOf(9), "Background Color");
    f.put(Integer.valueOf(10), "Font Name");
  }
  
  public o() {
    a((j)new n(this));
  }
  
  public String a() {
    return "QuickTime Timecode";
  }
  
  protected HashMap<Integer, String> b() {
    return f;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/x/i/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */