package e.d.c.o.a0;

import e.d.c.b;
import java.util.HashMap;

public class f1 extends b {
  protected static final HashMap<Integer, String> e = new HashMap<Integer, String>();
  
  static {
    e.put(Integer.valueOf(1299), "Makernote Thumb Offset");
    e.put(Integer.valueOf(1300), "Makernote Thumb Length");
    e.put(Integer.valueOf(8192), "Makernote Thumb Version");
  }
  
  public f1() {
    a(new e1(this));
  }
  
  public String a() {
    return "Sony Makernote";
  }
  
  protected HashMap<Integer, String> b() {
    return e;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/o/a0/f1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */