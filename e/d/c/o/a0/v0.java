package e.d.c.o.a0;

import e.d.c.b;
import java.util.HashMap;

public class v0 extends b {
  protected static final HashMap<Integer, String> e = new HashMap<Integer, String>();
  
  static {
    e.put(Integer.valueOf(1), "Makernote Data Type");
    e.put(Integer.valueOf(2), "Version");
    e.put(Integer.valueOf(3584), "Print Image Matching (PIM) Info");
    e.put(Integer.valueOf(8193), "Ricoh Camera Info Makernote Sub-IFD");
  }
  
  public v0() {
    a(new u0(this));
  }
  
  public String a() {
    return "Ricoh Makernote";
  }
  
  protected HashMap<Integer, String> b() {
    return e;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/o/a0/v0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */