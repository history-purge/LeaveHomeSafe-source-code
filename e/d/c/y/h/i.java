package e.d.c.y.h;

import java.util.HashMap;

public class i extends d {
  protected static final HashMap<Integer, String> f = new HashMap<Integer, String>();
  
  static {
    d.a(f);
    f.put(Integer.valueOf(101), "Format");
    f.put(Integer.valueOf(102), "Number of Channels");
    f.put(Integer.valueOf(103), "Sample Size");
    f.put(Integer.valueOf(104), "Sample Rate");
    f.put(Integer.valueOf(105), "Balance");
  }
  
  public i() {
    a(new h(this));
  }
  
  public String a() {
    return "MP4 Sound";
  }
  
  protected HashMap<Integer, String> b() {
    return f;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/y/h/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */