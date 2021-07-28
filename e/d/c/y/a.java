package e.d.c.y;

import e.d.a.l.a;
import e.d.b.n;
import e.d.b.o;
import e.d.c.e;
import e.d.c.y.g.b;
import e.d.c.y.g.c;
import e.d.c.y.g.e;
import e.d.c.y.g.g;
import e.d.c.y.g.h;

public class a extends a<d> {
  private e c = new e(this);
  
  public a(e parame) {
    super(parame);
  }
  
  private void a(o paramo, b paramb) {
    (new c(paramo, paramb)).a(this.b);
  }
  
  private void b(o paramo, b paramb) {
    new g(paramo, paramb);
  }
  
  private void c(o paramo, b paramb) {
    (new h(paramo, paramb)).a(this.b);
  }
  
  public a a(b paramb, byte[] paramArrayOfbyte) {
    e e1;
    if (paramArrayOfbyte != null) {
      n n = new n(paramArrayOfbyte);
      if (paramb.b.equals("mvhd")) {
        c((o)n, paramb);
        return this;
      } 
      if (paramb.b.equals("ftyp")) {
        a((o)n, paramb);
        return this;
      } 
      if (paramb.b.equals("hdlr")) {
        e1 = new e((o)n, paramb);
        return this.c.a(e1, this.a);
      } 
      if (((b)e1).b.equals("mdhd")) {
        b((o)n, (b)e1);
        return this;
      } 
    } else if (((b)e1).b.equals("cmov")) {
      this.b.a("Compressed MP4 movies not supported");
    } 
    return this;
  }
  
  protected d a() {
    return new d();
  }
  
  public boolean b(b paramb) {
    return (paramb.b.equals("ftyp") || paramb.b.equals("mvhd") || paramb.b.equals("hdlr") || paramb.b.equals("mdhd"));
  }
  
  public boolean c(b paramb) {
    return (paramb.b.equals("trak") || paramb.b.equals("meta") || paramb.b.equals("moov") || paramb.b.equals("mdia"));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/y/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */