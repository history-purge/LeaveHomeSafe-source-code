package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.backends.e;
import com.google.android.datatransport.runtime.backends.f;
import com.google.android.datatransport.runtime.backends.g;
import com.google.android.datatransport.runtime.backends.m;
import e.f.a.c.i.i;
import e.f.a.c.i.n;
import e.f.a.c.i.v.a;
import e.f.a.c.i.x.j.e0;
import e.f.a.c.i.x.j.y;
import e.f.a.c.i.y.a;
import e.f.a.c.i.y.b;
import e.f.a.c.i.z.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

public class o {
  private final Context a;
  
  private final e b;
  
  private final y c;
  
  private final s d;
  
  private final Executor e;
  
  private final b f;
  
  private final a g;
  
  public o(Context paramContext, e parame, y paramy, s params, Executor paramExecutor, b paramb, a parama) {
    this.a = paramContext;
    this.b = parame;
    this.c = paramy;
    this.d = params;
    this.e = paramExecutor;
    this.f = paramb;
    this.g = parama;
  }
  
  boolean a() {
    NetworkInfo networkInfo = ((ConnectivityManager)this.a.getSystemService("connectivity")).getActiveNetworkInfo();
    return (networkInfo != null && networkInfo.isConnected());
  }
  
  void b(n paramn, int paramInt) {
    g g;
    m m = this.b.a(paramn.a());
    Iterable iterable = (Iterable)this.f.a(new e(this, paramn));
    if (!iterable.iterator().hasNext())
      return; 
    if (m == null) {
      a.a("Uploader", "Unknown backend for %s, deleting event batch for it...", paramn);
      g = g.c();
    } else {
      ArrayList<i> arrayList = new ArrayList();
      Iterator<e0> iterator = iterable.iterator();
      while (iterator.hasNext())
        arrayList.add(((e0)iterator.next()).a()); 
      f.a a1 = f.c();
      a1.a(arrayList);
      a1.a(paramn.b());
      g = g.a(a1.a());
    } 
    this.f.a(new g(this, g, iterable, paramn, paramInt));
  }
  
  public void b(n paramn, int paramInt, Runnable paramRunnable) {
    this.e.execute(new f(this, paramn, paramInt, paramRunnable));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/datatransport/runtime/scheduling/jobscheduling/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */