package e.d.c.x;

import e.d.a.p.a;
import e.d.b.n;
import e.d.b.o;
import e.d.c.e;
import e.d.c.x.h.a;
import e.d.c.x.h.b;
import e.d.c.x.h.d;
import e.d.c.x.h.e;
import e.d.c.x.h.f;

public class a extends a<d> {
  private e c = new e(this);
  
  public a(e parame) {
    super(parame);
  }
  
  public a a(a parama, byte[] paramArrayOfbyte) {
    d d;
    if (paramArrayOfbyte != null) {
      n n = new n(paramArrayOfbyte);
      if (parama.b.equals("mvhd")) {
        (new f((o)n, parama)).a(this.b);
        return this;
      } 
      if (parama.b.equals("ftyp")) {
        (new b((o)n, parama)).a(this.b);
        return this;
      } 
      if (parama.b.equals("hdlr")) {
        d = new d((o)n, parama);
        return this.c.a(d.a(), this.a);
      } 
      if (((a)d).b.equals("mdhd")) {
        new e((o)n, (a)d);
        return this;
      } 
    } else if (((a)d).b.equals("cmov")) {
      this.b.a("Compressed QuickTime movies not supported");
    } 
    return this;
  }
  
  protected d a() {
    return new d();
  }
  
  public boolean b(a parama) {
    return (parama.b.equals("ftyp") || parama.b.equals("mvhd") || parama.b.equals("hdlr") || parama.b.equals("mdhd"));
  }
  
  public boolean c(a parama) {
    return (parama.b.equals("trak") || parama.b.equals("udta") || parama.b.equals("meta") || parama.b.equals("moov") || parama.b.equals("mdia"));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/x/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */