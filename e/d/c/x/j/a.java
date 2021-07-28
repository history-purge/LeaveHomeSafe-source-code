package e.d.c.x.j;

import e.d.b.e;
import e.d.b.n;
import e.d.c.e;
import e.d.c.x.g;
import java.util.ArrayList;

public class a extends g {
  private int c = 0;
  
  private ArrayList<String> d = new ArrayList<String>();
  
  public a(e parame) {
    super(parame);
  }
  
  protected e.d.a.p.a a(e.d.c.x.h.a parama, byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte != null) {
      n n = new n(paramArrayOfbyte);
      if (parama.b.equals("keys")) {
        a(n);
        return (e.d.a.p.a)this;
      } 
      if (parama.b.equals("data")) {
        a(paramArrayOfbyte, n);
        return (e.d.a.p.a)this;
      } 
    } else {
      int i = e.a(parama.b.getBytes(), 0, true);
      if (i > 0 && i < this.d.size() + 1)
        this.c = i - 1; 
    } 
    return (e.d.a.p.a)this;
  }
  
  protected void a(n paramn) {
    paramn.a(4L);
    int j = paramn.d();
    for (int i = 0; i < j; i++) {
      int k = paramn.d();
      paramn.a(4L);
      String str = new String(paramn.a(k - 8));
      this.d.add(str);
    } 
  }
  
  protected void a(byte[] paramArrayOfbyte, n paramn) {
    paramn.a(8L);
    String str = new String(paramn.a(paramArrayOfbyte.length - 8));
    ((e.d.a.p.a)this).b.a(((Integer)d.g.get(this.d.get(this.c))).intValue(), str);
  }
  
  protected boolean b(e.d.c.x.h.a parama) {
    return (parama.b.equals("hdlr") || parama.b.equals("keys") || parama.b.equals("data"));
  }
  
  protected boolean c(e.d.c.x.h.a parama) {
    boolean bool1 = parama.b.equals("ilst");
    boolean bool = false;
    if (bool1 || e.a(parama.b.getBytes(), 0, true) <= this.d.size())
      bool = true; 
    return bool;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/x/j/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */