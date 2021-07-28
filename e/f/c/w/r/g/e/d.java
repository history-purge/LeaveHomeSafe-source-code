package e.f.c.w.r.g.e;

import e.f.c.j;
import e.f.c.s.a;

final class d extends h {
  d(a parama) {
    super(parama);
  }
  
  public String c() {
    if (b().c() >= 48) {
      StringBuilder stringBuilder = new StringBuilder();
      a(stringBuilder, 8);
      int i = a().a(48, 2);
      stringBuilder.append("(393");
      stringBuilder.append(i);
      stringBuilder.append(')');
      i = a().a(50, 10);
      if (i / 100 == 0)
        stringBuilder.append('0'); 
      if (i / 10 == 0)
        stringBuilder.append('0'); 
      stringBuilder.append(i);
      stringBuilder.append(a().a(60, (String)null).b());
      return stringBuilder.toString();
    } 
    throw j.a();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/w/r/g/e/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */