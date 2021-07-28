package e.d.c.o;

import java.util.HashMap;

public class m extends b {
  protected static final HashMap<Integer, String> e = new HashMap<Integer, String>();
  
  static {
    b.a(e);
    e.put(Integer.valueOf(513), "Thumbnail Offset");
    e.put(Integer.valueOf(514), "Thumbnail Length");
  }
  
  public m() {
    a(new l(this));
  }
  
  public String a() {
    return "Exif Thumbnail";
  }
  
  protected HashMap<Integer, String> b() {
    return e;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/o/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */