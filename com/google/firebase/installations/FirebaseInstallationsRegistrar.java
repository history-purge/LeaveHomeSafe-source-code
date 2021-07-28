package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.n;
import com.google.firebase.components.o;
import com.google.firebase.components.r;
import com.google.firebase.components.u;
import com.google.firebase.g;
import com.google.firebase.o.f;
import com.google.firebase.r.h;
import com.google.firebase.r.i;
import java.util.Arrays;
import java.util.List;

@Keep
public class FirebaseInstallationsRegistrar implements r {
  public List<n<?>> getComponents() {
    n.b b = n.a(i.class);
    b.a(u.c(g.class));
    b.a(u.b(f.class));
    b.a(u.b(i.class));
    b.a(e.a);
    return Arrays.asList((n<?>[])new n[] { b.b(), h.a("fire-installations", "17.0.0") });
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/installations/FirebaseInstallationsRegistrar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */