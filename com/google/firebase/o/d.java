package com.google.firebase.o;

import android.content.Context;
import com.google.firebase.components.n;
import com.google.firebase.components.o;
import com.google.firebase.components.u;
import com.google.firebase.components.z;
import com.google.firebase.p.b;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class d implements f {
  private static final ThreadFactory b = a.a;
  
  private b<g> a;
  
  private d(Context paramContext, Set<e> paramSet) {
    this((b<g>)new z(new c(paramContext)), paramSet, new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), b));
  }
  
  d(b<g> paramb, Set<e> paramSet, Executor paramExecutor) {
    this.a = paramb;
  }
  
  public static n<f> a() {
    n.b b1 = n.a(f.class);
    b1.a(u.c(Context.class));
    b1.a(u.e(e.class));
    b1.a(b.a);
    return b1.b();
  }
  
  public f.a a(String paramString) {
    long l = System.currentTimeMillis();
    boolean bool1 = ((g)this.a.get()).a(paramString, l);
    boolean bool2 = ((g)this.a.get()).a(l);
    return (bool1 && bool2) ? f.a.f : (bool2 ? f.a.e : (bool1 ? f.a.d : f.a.c));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/o/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */