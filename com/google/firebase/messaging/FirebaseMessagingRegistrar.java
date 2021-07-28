package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.components.n;
import com.google.firebase.components.o;
import com.google.firebase.components.r;
import com.google.firebase.components.u;
import com.google.firebase.g;
import com.google.firebase.iid.w.a;
import com.google.firebase.installations.i;
import com.google.firebase.n.d;
import com.google.firebase.o.f;
import com.google.firebase.r.h;
import com.google.firebase.r.i;
import e.f.a.c.g;
import java.util.Arrays;
import java.util.List;

@Keep
public class FirebaseMessagingRegistrar implements r {
  @Keep
  public List<n<?>> getComponents() {
    n.b b = n.a(FirebaseMessaging.class);
    b.a(u.c(g.class));
    b.a(u.a(a.class));
    b.a(u.b(i.class));
    b.a(u.b(f.class));
    b.a(u.a(g.class));
    b.a(u.c(i.class));
    b.a(u.c(d.class));
    b.a(z.a);
    b.a();
    return Arrays.asList((n<?>[])new n[] { b.b(), h.a("fire-fcm", "22.0.0") });
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/messaging/FirebaseMessagingRegistrar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */