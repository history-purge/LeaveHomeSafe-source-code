package e.d.c.y;

import e.d.a.l.a;
import e.d.b.n;
import e.d.b.o;
import e.d.c.e;
import e.d.c.y.g.b;
import e.d.c.y.h.d;
import java.util.Calendar;
import java.util.Date;

public abstract class f<T extends d> extends a<T> {
  public f(e parame) {
    super(parame);
    if (e.c != null && e.d != null) {
      Calendar calendar = Calendar.getInstance();
      calendar.set(1904, 0, 1, 0, 0, 0);
      long l = calendar.getTime().getTime();
      String str1 = (new Date(e.c.longValue() * 1000L + l)).toString();
      String str2 = (new Date(e.d.longValue() * 1000L + l)).toString();
      String str3 = e.e;
      ((d)this.b).a(101, str1);
      ((d)this.b).a(102, str2);
      ((d)this.b).a(104, str3);
    } 
  }
  
  public a a(b paramb, byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte != null) {
      n n = new n(paramArrayOfbyte);
      if (paramb.b.equals(b())) {
        a((o)n, paramb);
        return this;
      } 
      if (paramb.b.equals("stsd")) {
        b((o)n, paramb);
        return this;
      } 
      if (paramb.b.equals("stts"))
        c((o)n, paramb); 
    } 
    return this;
  }
  
  protected abstract void a(o paramo, b paramb);
  
  protected abstract String b();
  
  protected abstract void b(o paramo, b paramb);
  
  public boolean b(b paramb) {
    return (paramb.b.equals(b()) || paramb.b.equals("stsd") || paramb.b.equals("stts"));
  }
  
  protected abstract void c(o paramo, b paramb);
  
  public boolean c(b paramb) {
    return (paramb.b.equals("stbl") || paramb.b.equals("minf"));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/y/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */