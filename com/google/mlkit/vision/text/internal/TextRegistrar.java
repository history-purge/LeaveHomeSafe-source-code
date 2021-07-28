package com.google.mlkit.vision.text.internal;

import androidx.annotation.RecentlyNonNull;
import com.google.firebase.components.n;
import com.google.firebase.components.r;
import com.google.firebase.components.u;
import e.f.a.e.i.k.r;
import e.f.b.a.c.d;
import e.f.b.a.c.i;
import java.util.List;

public class TextRegistrar implements r {
  @RecentlyNonNull
  public final List<n<?>> getComponents() {
    n.b b1 = n.a(e.class);
    b1.a(u.c(i.class));
    b1.a(f.a);
    n n = b1.b();
    n.b b2 = n.a(b.class);
    b2.a(u.c(e.class));
    b2.a(u.c(d.class));
    b2.a(g.a);
    return (List<n<?>>)r.a(n, b2.b());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/mlkit/vision/text/internal/TextRegistrar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */