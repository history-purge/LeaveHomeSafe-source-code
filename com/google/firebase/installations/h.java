package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.android.gms.common.internal.q;
import com.google.firebase.g;
import com.google.firebase.installations.q.a;
import com.google.firebase.installations.r.b;
import com.google.firebase.installations.r.c;
import com.google.firebase.installations.r.d;
import com.google.firebase.installations.s.c;
import com.google.firebase.installations.s.d;
import com.google.firebase.installations.s.f;
import com.google.firebase.o.f;
import com.google.firebase.r.i;
import e.f.a.e.m.l;
import e.f.a.e.m.m;
import e.f.a.e.m.o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class h implements i {
  private static final Object m = new Object();
  
  private static final ThreadFactory n = new a();
  
  private final g a;
  
  private final c b;
  
  private final c c;
  
  private final p d;
  
  private final b e;
  
  private final n f;
  
  private final Object g = new Object();
  
  private final ExecutorService h;
  
  private final ExecutorService i;
  
  private String j;
  
  private Set<a> k = new HashSet<a>();
  
  private final List<o> l = new ArrayList<o>();
  
  h(g paramg, com.google.firebase.p.b<i> paramb, com.google.firebase.p.b<f> paramb1) {
    this(new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), n), paramg, new c(paramg.b(), paramb, paramb1), new c(paramg), p.d(), new b(paramg), new n());
  }
  
  h(ExecutorService paramExecutorService, g paramg, c paramc, c paramc1, p paramp, b paramb, n paramn) {
    this.a = paramg;
    this.b = paramc;
    this.c = paramc1;
    this.d = paramp;
    this.e = paramb;
    this.f = paramn;
    this.h = paramExecutorService;
    this.i = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), n);
  }
  
  public static h a(g paramg) {
    boolean bool;
    if (paramg != null) {
      bool = true;
    } else {
      bool = false;
    } 
    q.a(bool, "Null is not a valid value of FirebaseApp.");
    return (h)paramg.a(i.class);
  }
  
  private d a(d paramd) {
    f f = this.b.b(c(), paramd.c(), e(), paramd.e());
    int j = b.b[f.a().ordinal()];
    if (j != 1) {
      if (j != 2) {
        if (j == 3) {
          a((String)null);
          return paramd.o();
        } 
        throw new j("Firebase Installations Service is unavailable. Please try again later.", j.a.d);
      } 
      return paramd.a("BAD CONFIG");
    } 
    return paramd.a(f.b(), f.c(), this.d.b());
  }
  
  private void a(o paramo) {
    synchronized (this.g) {
      this.l.add(paramo);
      return;
    } 
  }
  
  private void a(d paramd1, d paramd2) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield k : Ljava/util/Set;
    //   6: invokeinterface size : ()I
    //   11: ifeq -> 68
    //   14: aload_1
    //   15: invokevirtual c : ()Ljava/lang/String;
    //   18: aload_2
    //   19: invokevirtual c : ()Ljava/lang/String;
    //   22: invokevirtual equals : (Ljava/lang/Object;)Z
    //   25: ifne -> 68
    //   28: aload_0
    //   29: getfield k : Ljava/util/Set;
    //   32: invokeinterface iterator : ()Ljava/util/Iterator;
    //   37: astore_1
    //   38: aload_1
    //   39: invokeinterface hasNext : ()Z
    //   44: ifeq -> 68
    //   47: aload_1
    //   48: invokeinterface next : ()Ljava/lang/Object;
    //   53: checkcast com/google/firebase/installations/q/a
    //   56: aload_2
    //   57: invokevirtual c : ()Ljava/lang/String;
    //   60: invokeinterface a : (Ljava/lang/String;)V
    //   65: goto -> 38
    //   68: aload_0
    //   69: monitorexit
    //   70: return
    //   71: astore_1
    //   72: aload_0
    //   73: monitorexit
    //   74: goto -> 79
    //   77: aload_1
    //   78: athrow
    //   79: goto -> 77
    // Exception table:
    //   from	to	target	type
    //   2	38	71	finally
    //   38	65	71	finally
  }
  
  private void a(Exception paramException) {
    synchronized (this.g) {
      Iterator<o> iterator = this.l.iterator();
      while (iterator.hasNext()) {
        if (((o)iterator.next()).a(paramException))
          iterator.remove(); 
      } 
      return;
    } 
  }
  
  private void a(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: putfield j : Ljava/lang/String;
    //   7: aload_0
    //   8: monitorexit
    //   9: return
    //   10: astore_1
    //   11: aload_0
    //   12: monitorexit
    //   13: aload_1
    //   14: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	10	finally
  }
  
  private void b(d paramd) {
    synchronized (m) {
      g g1 = g.a(this.a.b(), "generatefid.lock");
      try {
        this.c.a(paramd);
        return;
      } finally {
        if (g1 != null)
          g1.a(); 
      } 
    } 
  }
  
  private String c(d paramd) {
    if ((!this.a.c().equals("CHIME_ANDROID_SDK") && !this.a.g()) || !paramd.l())
      return this.f.a(); 
    String str2 = this.e.a();
    String str1 = str2;
    if (TextUtils.isEmpty(str2))
      str1 = this.f.a(); 
    return str1;
  }
  
  private d d(d paramd) {
    if (paramd.c() != null && paramd.c().length() == 11) {
      d1 = (d)this.e.b();
    } else {
      d1 = null;
    } 
    d d1 = this.b.a(c(), paramd.c(), e(), d(), (String)d1);
    int j = b.a[d1.d().ordinal()];
    if (j != 1) {
      if (j == 2)
        return paramd.a("BAD CONFIG"); 
      throw new j("Firebase Installations Service is unavailable. Please try again later.", j.a.d);
    } 
    return paramd.a(d1.b(), d1.c(), this.d.b(), d1.a().b(), d1.a().c());
  }
  
  private void d(boolean paramBoolean) {
    d d = k();
    try {
      d d1;
      j j;
      IOException iOException;
      if (d.h() || d.k()) {
        d1 = d(d);
      } else if (paramBoolean || this.d.a(d)) {
        d1 = a(d);
      } else {
        return;
      } 
      b(d1);
      a(d, d1);
      if (d1.j())
        a(d1.c()); 
      if (d1.h()) {
        j = new j(j.a.c);
      } else if (j.i()) {
        iOException = new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request.");
      } else {
        e((d)iOException);
        return;
      } 
      a(iOException);
      return;
    } catch (j j) {
      a((Exception)j);
      return;
    } 
  }
  
  private void e(d paramd) {
    synchronized (this.g) {
      Iterator<o> iterator = this.l.iterator();
      while (iterator.hasNext()) {
        if (((o)iterator.next()).a(paramd))
          iterator.remove(); 
      } 
      return;
    } 
  }
  
  private final void e(boolean paramBoolean) {
    d d2 = l();
    d d1 = d2;
    if (paramBoolean)
      d1 = d2.n(); 
    e(d1);
    this.i.execute(new b(this, paramBoolean));
  }
  
  private l<m> g() {
    m<m> m = new m();
    a(new k(this.d, m));
    return m.a();
  }
  
  private l<String> h() {
    m<String> m = new m();
    a(new l(m));
    return m.a();
  }
  
  private Void i() {
    a((String)null);
    d d = k();
    if (d.j())
      this.b.a(c(), d.c(), e(), d.e()); 
    b(d.o());
    return null;
  }
  
  private String j() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield j : Ljava/lang/String;
    //   6: astore_1
    //   7: aload_0
    //   8: monitorexit
    //   9: aload_1
    //   10: areturn
    //   11: astore_1
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_1
    //   15: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	11	finally
  }
  
  private d k() {
    synchronized (m) {
      g g1 = g.a(this.a.b(), "generatefid.lock");
      try {
        return this.c.a();
      } finally {
        if (g1 != null)
          g1.a(); 
      } 
    } 
  }
  
  private d l() {
    synchronized (m) {
      g g1 = g.a(this.a.b(), "generatefid.lock");
      try {
        d d2 = this.c.a();
        d d1 = d2;
        if (d2.i()) {
          String str = c(d2);
          c c1 = this.c;
          d1 = d2.b(str);
          c1.a(d1);
        } 
        return d1;
      } finally {
        if (g1 != null)
          g1.a(); 
      } 
    } 
  }
  
  private void m() {
    q.a(d(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
    q.a(e(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
    q.a(c(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    q.a(p.b(d()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
    q.a(p.a(c()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
  }
  
  public l<String> a() {
    m();
    String str = j();
    if (str != null)
      return o.a(str); 
    l<String> l = h();
    this.h.execute(new d(this));
    return l;
  }
  
  public l<m> a(boolean paramBoolean) {
    m();
    l<m> l = g();
    this.h.execute(new c(this, paramBoolean));
    return l;
  }
  
  public l<Void> b() {
    return o.a(this.h, new a(this));
  }
  
  String c() {
    return this.a.d().a();
  }
  
  String d() {
    return this.a.d().b();
  }
  
  String e() {
    return this.a.d().f();
  }
  
  class a implements ThreadFactory {
    private final AtomicInteger a = new AtomicInteger(1);
    
    public Thread newThread(Runnable param1Runnable) {
      return new Thread(param1Runnable, String.format("firebase-installations-executor-%d", new Object[] { Integer.valueOf(this.a.getAndIncrement()) }));
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/installations/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */