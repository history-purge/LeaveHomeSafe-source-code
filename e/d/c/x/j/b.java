package e.d.c.x.j;

import e.d.a.p.a;
import e.d.b.n;
import e.d.c.e;
import e.d.c.x.g;
import e.d.c.x.h.a;

public class b extends g {
  private String c;
  
  public b(e parame) {
    super(parame);
  }
  
  protected a a(a parama, byte[] paramArrayOfbyte) {
    String str;
    if (paramArrayOfbyte != null) {
      n n = new n(paramArrayOfbyte);
      if (parama.b.equals("data") && this.c != null) {
        a(paramArrayOfbyte, n);
        return (a)this;
      } 
      str = new String(n.a(4));
    } else if (d.g.containsKey(((a)str).b)) {
      str = ((a)str).b;
    } else {
      str = null;
    } 
    this.c = str;
    return (a)this;
  }
  
  protected void a(byte[] paramArrayOfbyte, n paramn) {
    paramn.a(8L);
    String str = new String(paramn.a(paramArrayOfbyte.length - 8));
    ((a)this).b.a(((Integer)d.g.get(this.c)).intValue(), str);
  }
  
  protected boolean b(a parama) {
    return parama.b.equals("data");
  }
  
  protected boolean c(a parama) {
    return (d.g.containsKey(parama.b) || parama.b.equals("ilst"));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/x/j/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */