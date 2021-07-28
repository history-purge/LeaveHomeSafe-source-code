package e.f.c.w.r.g.e;

import e.f.c.s.a;

final class b extends f {
  b(a parama) {
    super(parama);
  }
  
  protected int a(int paramInt) {
    return (paramInt < 10000) ? paramInt : (paramInt - 10000);
  }
  
  protected void b(StringBuilder paramStringBuilder, int paramInt) {
    String str;
    if (paramInt < 10000) {
      str = "(3202)";
    } else {
      str = "(3203)";
    } 
    paramStringBuilder.append(str);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/w/r/g/e/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */