package e.d.c.x.i;

import e.d.c.j;
import e.d.c.x.d;
import java.util.HashMap;

public class f extends d {
  protected static final HashMap<Integer, String> f = new HashMap<Integer, String>();
  
  static {
    a.a(f);
    f.put(Integer.valueOf(769), "Format");
    f.put(Integer.valueOf(770), "Number of Channels");
    f.put(Integer.valueOf(771), "Sample Size");
    f.put(Integer.valueOf(772), "Sample Rate");
    f.put(Integer.valueOf(773), "Balance");
  }
  
  public f() {
    a((j)new e(this));
  }
  
  public String a() {
    return "QuickTime Sound";
  }
  
  protected HashMap<Integer, String> b() {
    return f;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/x/i/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */