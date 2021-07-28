package e.d.c.q;

import e.d.c.b;
import java.util.HashMap;

public class f extends b {
  protected static final HashMap<Integer, String> e = new HashMap<Integer, String>();
  
  static {
    e.put(Integer.valueOf(1), "Delay");
    e.put(Integer.valueOf(2), "Disposal Method");
    e.put(Integer.valueOf(3), "User Input Flag");
    e.put(Integer.valueOf(4), "Transparent Color Flag");
    e.put(Integer.valueOf(5), "Transparent Color Index");
  }
  
  public f() {
    a(new e(this));
  }
  
  public String a() {
    return "GIF Control";
  }
  
  protected HashMap<Integer, String> b() {
    return e;
  }
  
  public enum b {
    c, d, e, f, g, h;
    
    public static b f(int param1Int) {
      switch (param1Int) {
        default:
          return h;
        case 4:
        case 5:
        case 6:
        case 7:
          return g;
        case 3:
          return f;
        case 2:
          return e;
        case 1:
          return d;
        case 0:
          break;
      } 
      return c;
    }
    
    public String toString() {
      switch (f.a.a[ordinal()]) {
        default:
          return super.toString();
        case 6:
          return "To Be Defined";
        case 5:
          return "Restore to Previous";
        case 4:
          return "Restore to Background Color";
        case 3:
          return "Not Specified";
        case 2:
          return "Invalid value";
        case 1:
          break;
      } 
      return "Don't Dispose";
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/q/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */