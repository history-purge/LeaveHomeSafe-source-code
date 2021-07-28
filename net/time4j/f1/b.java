package net.time4j.f1;

import java.util.Locale;
import java.util.Set;
import net.time4j.d1.d;
import net.time4j.d1.p;
import net.time4j.d1.q;
import net.time4j.d1.s;
import net.time4j.e1.a;
import net.time4j.e1.g;
import net.time4j.f0;
import net.time4j.history.d;
import net.time4j.history.h;
import net.time4j.history.j;
import net.time4j.history.p;
import net.time4j.history.q.a;
import net.time4j.history.q.c;

public class b implements s {
  private static d b(Locale paramLocale, d paramd) {
    return ((String)paramd.a(a.b, "iso8601")).equals("julian") ? d.t : (paramd.b(a.a) ? (d)paramd.a(a.a) : ((((String)paramd.a(a.b, "iso8601")).equals("historic") && paramd.b(a.t)) ? d.a((String)paramd.a(a.t)) : d.a(paramLocale)));
  }
  
  public Set<p<?>> a(Locale paramLocale, d paramd) {
    return b(paramLocale, paramd).g();
  }
  
  public q<?> a(q<?> paramq, Locale paramLocale, d paramd) {
    return a(paramq, b(paramLocale, paramd), paramd);
  }
  
  public q<?> a(q<?> paramq, d paramd, d paramd1) {
    j j;
    if (paramq.c(paramd.e())) {
      j = (j)paramq.e(paramd.e());
    } else if (((g)paramd1.a(a.f, g.d)).a()) {
      j = j.d;
    } else {
      j = null;
    } 
    q<?> q1 = paramq;
    if (j != null) {
      q1 = paramq;
      if (paramq.c((p)paramd.q())) {
        int i = paramq.a((p)paramd.q());
        if (paramq.c((p)paramd.p()) && paramq.c(paramd.c())) {
          p p = (p)paramd1.a(d.r, p.c);
          f0 f0 = paramd.b(h.a(j, i, paramq.a((p)paramd.p()), paramq.a(paramd.c()), p, paramd.l()));
          paramq.b(paramd.e(), null);
          paramq.b((p)paramd.q(), null);
          paramq.b((p)paramd.p(), null);
          paramq.b(paramd.c(), null);
          return paramq.b((p)f0.q, f0);
        } 
        q1 = paramq;
        if (paramq.c(paramd.d())) {
          int k = paramq.a(paramd.d());
          if (paramq.c(c.f))
            i = paramq.a(c.f); 
          f0 f0 = (f0)paramd.b(paramd.a(j, i)).a(paramd.d(), k);
          q1 = paramq.b((p)f0.q, f0);
        } 
      } 
    } 
    return q1;
  }
  
  public boolean a(Class<?> paramClass) {
    return (paramClass == f0.class);
  }
  
  public boolean a(p<?> paramp) {
    return paramp instanceof c;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/f1/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */