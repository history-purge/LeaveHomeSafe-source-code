package com.google.firebase.r;

import android.content.Context;
import com.google.firebase.components.n;
import com.google.firebase.components.o;
import com.google.firebase.components.u;

public class h {
  public static n<?> a(String paramString, a<Context> parama) {
    n.b b = n.b(g.class);
    b.a(u.c(Context.class));
    b.a(new b(paramString, parama));
    return b.b();
  }
  
  public static n<?> a(String paramString1, String paramString2) {
    return n.a(g.a(paramString1, paramString2), g.class);
  }
  
  public static interface a<T> {
    String a(T param1T);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/r/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */