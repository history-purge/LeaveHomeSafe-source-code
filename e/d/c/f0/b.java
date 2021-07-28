package e.d.c.f0;

import e.a.a.d;
import e.a.a.e;
import e.a.a.f;
import e.a.a.j.k;
import e.a.a.l.c;
import e.d.c.b;
import java.util.HashMap;

public class b extends b {
  protected static final HashMap<Integer, String> f = new HashMap<Integer, String>();
  
  private f e;
  
  static {
    f.put(Integer.valueOf(65535), "XMP Value Count");
  }
  
  public b() {
    a(new a(this));
  }
  
  public String a() {
    return "XMP";
  }
  
  public void a(f paramf) {
    this.e = paramf;
    int i = 0;
    try {
      e<c> e = this.e.iterator();
      while (e.hasNext()) {
        if (((c)e.next()).a() != null)
          i++; 
      } 
      a(65535, i);
      return;
    } catch (d d) {
      return;
    } 
  }
  
  protected HashMap<Integer, String> b() {
    return f;
  }
  
  public f f() {
    if (this.e == null)
      this.e = (f)new k(); 
    return this.e;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/f0/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */