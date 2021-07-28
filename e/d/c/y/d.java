package e.d.c.y;

import e.d.c.b;
import java.util.HashMap;

public class d extends b {
  protected static final HashMap<Integer, String> e = new HashMap<Integer, String>();
  
  static {
    e.put(Integer.valueOf(1), "Major Brand");
    e.put(Integer.valueOf(2), "Minor Version");
    e.put(Integer.valueOf(3), "Compatible Brands");
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
    e.put(Integer.valueOf(271), "Transformation Matrix");
    e.put(Integer.valueOf(774), "Media Time Scale");
  }
  
  public d() {
    a(new b<b>(this));
  }
  
  public String a() {
    return "MP4";
  }
  
  protected HashMap<Integer, String> b() {
    return e;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/y/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */