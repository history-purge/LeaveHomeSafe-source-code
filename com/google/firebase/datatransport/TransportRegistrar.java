package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.datatransport.cct.c;
import com.google.firebase.components.n;
import com.google.firebase.components.o;
import com.google.firebase.components.r;
import com.google.firebase.components.u;
import e.f.a.c.g;
import e.f.a.c.i.f;
import e.f.a.c.i.r;
import java.util.Collections;
import java.util.List;

@Keep
public class TransportRegistrar implements r {
  public List<n<?>> getComponents() {
    n.b b = n.a(g.class);
    b.a(u.c(Context.class));
    b.a(a.a);
    return Collections.singletonList(b.b());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/datatransport/TransportRegistrar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */