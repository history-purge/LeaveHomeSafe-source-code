package e.d.c.p;

import e.d.a.a;
import e.d.c.b;
import java.util.HashMap;

public class b extends b {
  protected static final HashMap<Integer, String> e = new HashMap<Integer, String>();
  
  static {
    e.put(Integer.valueOf(1), "Detected File Type Name");
    e.put(Integer.valueOf(2), "Detected File Type Long Name");
    e.put(Integer.valueOf(3), "Detected MIME Type");
    e.put(Integer.valueOf(4), "Expected File Name Extension");
  }
  
  public b(a parama) {
    a(new a(this));
    a(1, parama.d());
    a(2, parama.b());
    if (parama.c() != null)
      a(3, parama.c()); 
    if (parama.a() != null)
      a(4, parama.a()); 
  }
  
  public String a() {
    return "File Type";
  }
  
  protected HashMap<Integer, String> b() {
    return e;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/p/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */