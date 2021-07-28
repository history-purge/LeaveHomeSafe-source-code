package com.google.mlkit.common.internal;

import androidx.annotation.RecentlyNonNull;
import com.google.firebase.components.n;
import com.google.firebase.components.r;
import com.google.firebase.components.u;
import com.google.mlkit.common.internal.a.a;
import e.f.a.e.i.i.h;
import e.f.b.a.b.c;
import e.f.b.a.c.a;
import e.f.b.a.c.b;
import e.f.b.a.c.d;
import e.f.b.a.c.i;
import e.f.b.a.c.j;
import e.f.b.a.c.m;
import e.f.b.a.c.o.b;
import java.util.List;

public class CommonComponentRegistrar implements r {
  @RecentlyNonNull
  public final List<n<?>> getComponents() {
    n n1 = m.b;
    n.b b1 = n.a(b.class);
    b1.a(u.c(i.class));
    b1.a(b.a);
    n n2 = b1.b();
    n.b b2 = n.a(j.class);
    b2.a(c.a);
    n n3 = b2.b();
    n.b b3 = n.a(c.class);
    b3.a(u.e(c.a.class));
    b3.a(d.a);
    n n4 = b3.b();
    n.b b4 = n.a(d.class);
    b4.a(u.d(j.class));
    b4.a(e.a);
    n n5 = b4.b();
    n.b b5 = n.a(a.class);
    b5.a(f.a);
    n n6 = b5.b();
    n.b b6 = n.a(b.class);
    b6.a(u.c(a.class));
    b6.a(g.a);
    n n7 = b6.b();
    n.b b7 = n.a(a.class);
    b7.a(u.c(i.class));
    b7.a(h.a);
    n n8 = b7.b();
    n.b b8 = n.b(c.a.class);
    b8.a(u.d(a.class));
    b8.a(i.a);
    return (List<n<?>>)h.a(n1, n2, n3, n4, n5, n6, n7, n8, b8.b());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/mlkit/common/internal/CommonComponentRegistrar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */