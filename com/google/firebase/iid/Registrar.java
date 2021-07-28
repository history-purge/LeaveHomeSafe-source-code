package com.google.firebase.iid;

import androidx.annotation.Keep;
import com.google.firebase.components.n;
import com.google.firebase.components.o;
import com.google.firebase.components.r;
import com.google.firebase.components.u;
import com.google.firebase.g;
import com.google.firebase.iid.w.a;
import com.google.firebase.installations.i;
import com.google.firebase.o.f;
import com.google.firebase.r.h;
import com.google.firebase.r.i;
import e.f.a.e.m.l;
import e.f.a.e.m.o;
import java.util.Arrays;
import java.util.List;

@Keep
public final class Registrar implements r {
  @Keep
  public List<n<?>> getComponents() {
    n.b b1 = n.a(FirebaseInstanceId.class);
    b1.a(u.c(g.class));
    b1.a(u.b(i.class));
    b1.a(u.b(f.class));
    b1.a(u.c(i.class));
    b1.a(o.a);
    b1.a();
    n n = b1.b();
    n.b b2 = n.a(a.class);
    b2.a(u.c(FirebaseInstanceId.class));
    b2.a(p.a);
    return Arrays.asList((n<?>[])new n[] { n, b2.b(), h.a("fire-iid", "21.1.0") });
  }
  
  private static class a implements a {
    final FirebaseInstanceId a;
    
    public a(FirebaseInstanceId param1FirebaseInstanceId) {
      this.a = param1FirebaseInstanceId;
    }
    
    public String a() {
      return this.a.f();
    }
    
    public void a(a.a param1a) {
      this.a.a(param1a);
    }
    
    public l<String> b() {
      String str = this.a.f();
      return (str != null) ? o.a(str) : this.a.e().a(q.a);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/iid/Registrar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */