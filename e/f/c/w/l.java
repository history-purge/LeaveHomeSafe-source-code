package e.f.c.w;

import e.f.c.a;
import e.f.c.c;
import e.f.c.e;
import e.f.c.f;
import e.f.c.n;
import e.f.c.s.a;
import java.util.Map;

public final class l extends p {
  private final p h = new e();
  
  private static n a(n paramn) {
    String str = paramn.e();
    if (str.charAt(0) == '0') {
      n n1 = new n(str.substring(1), null, paramn.d(), a.q);
      if (paramn.c() != null)
        n1.a(paramn.c()); 
      return n1;
    } 
    throw f.a();
  }
  
  protected int a(a parama, int[] paramArrayOfint, StringBuilder paramStringBuilder) {
    return this.h.a(parama, paramArrayOfint, paramStringBuilder);
  }
  
  public n a(int paramInt, a parama, Map<e, ?> paramMap) {
    return a(this.h.a(paramInt, parama, paramMap));
  }
  
  public n a(int paramInt, a parama, int[] paramArrayOfint, Map<e, ?> paramMap) {
    return a(this.h.a(paramInt, parama, paramArrayOfint, paramMap));
  }
  
  public n a(c paramc, Map<e, ?> paramMap) {
    return a(this.h.a(paramc, paramMap));
  }
  
  a b() {
    return a.q;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/w/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */