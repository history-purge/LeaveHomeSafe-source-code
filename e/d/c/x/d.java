package e.d.c.x;

import e.d.c.b;
import java.util.HashMap;

public class d extends b {
  protected static final HashMap<Integer, String> e = new HashMap<Integer, String>();
  
  static {
    e.put(Integer.valueOf(4096), "Major Brand");
    e.put(Integer.valueOf(4097), "Minor Version");
    e.put(Integer.valueOf(4098), "Compatible Brands");
    e.put(Integer.valueOf(256), "Creation Time");
    e.put(Integer.valueOf(257), "Modification Time");
    e.put(Integer.valueOf(258), "Media Time Scale");
    e.put(Integer.valueOf(259), "Duration");
    e.put(Integer.valueOf(260), "Preferred Rate");
    e.put(Integer.valueOf(261), "Preferred Volume");
    e.put(Integer.valueOf(264), "Preview Time");
    e.put(Integer.valueOf(265), "Preview Duration");
    e.put(Integer.valueOf(266), "Poster Time");
    e.put(Integer.valueOf(267), "Selection Time");
    e.put(Integer.valueOf(268), "Selection Duration");
    e.put(Integer.valueOf(269), "Current Time");
    e.put(Integer.valueOf(270), "Next Track ID");
    e.put(Integer.valueOf(774), "Media Time Scale");
  }
  
  public d() {
    a(new b(this));
  }
  
  public String a() {
    return "QuickTime";
  }
  
  protected HashMap<Integer, String> b() {
    return e;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/x/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */