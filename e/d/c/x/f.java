package e.d.c.x;

import e.d.a.p.a;
import e.d.b.n;
import e.d.b.o;
import e.d.c.e;
import e.d.c.x.h.a;
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
      this.b.a(20481, str1);
      this.b.a(20482, str2);
    } 
  }
  
  public f a(a parama, byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte != null) {
      n n = new n(paramArrayOfbyte);
      if (parama.b.equals(b())) {
        a((o)n, parama);
        return this;
      } 
      if (parama.b.equals("stsd")) {
        b((o)n, parama);
        return this;
      } 
      if (parama.b.equals("stts"))
        c((o)n, parama); 
    } 
    return this;
  }
  
  protected abstract void a(o paramo, a parama);
  
  protected abstract String b();
  
  protected abstract void b(o paramo, a parama);
  
  public boolean b(a parama) {
    return (parama.b.equals(b()) || parama.b.equals("stsd") || parama.b.equals("stts"));
  }
  
  protected abstract void c(o paramo, a parama);
  
  public boolean c(a parama) {
    return (parama.b.equals("stbl") || parama.b.equals("minf") || parama.b.equals("gmhd") || parama.b.equals("tmcd"));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/x/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */