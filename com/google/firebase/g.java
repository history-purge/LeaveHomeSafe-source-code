package com.google.firebase;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import b.g.j.k;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.util.k;
import com.google.android.gms.common.util.l;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.n;
import com.google.firebase.components.p;
import com.google.firebase.components.s;
import com.google.firebase.components.z;
import com.google.firebase.n.c;
import com.google.firebase.q.a;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class g {
  private static final Object j = new Object();
  
  private static final Executor k = new d(null);
  
  static final Map<String, g> l = (Map<String, g>)new b.d.a();
  
  private final Context a;
  
  private final String b;
  
  private final j c;
  
  private final s d;
  
  private final AtomicBoolean e = new AtomicBoolean(false);
  
  private final AtomicBoolean f = new AtomicBoolean();
  
  private final z<a> g;
  
  private final List<b> h = new CopyOnWriteArrayList<b>();
  
  private final List<h> i = new CopyOnWriteArrayList<h>();
  
  protected g(Context paramContext, String paramString, j paramj) {
    q.a(paramContext);
    this.a = paramContext;
    q.b(paramString);
    this.b = paramString;
    q.a(paramj);
    this.c = paramj;
    List list = p.a(paramContext, ComponentDiscoveryService.class).b();
    s.b b = s.a(k);
    b.a(list);
    b.a(new FirebaseCommonRegistrar());
    b.a(n.a(paramContext, Context.class, new Class[0]));
    b.a(n.a(this, g.class, new Class[0]));
    b.a(n.a(paramj, j.class, new Class[0]));
    this.d = b.a();
    this.g = new z(new a(this, paramContext));
  }
  
  public static g a(Context paramContext, j paramj) {
    return a(paramContext, paramj, "[DEFAULT]");
  }
  
  public static g a(Context paramContext, j paramj, String paramString) {
    c.a(paramContext);
    paramString = b(paramString);
    if (paramContext.getApplicationContext() != null)
      paramContext = paramContext.getApplicationContext(); 
    synchronized (j) {
      if (!l.containsKey(paramString)) {
        boolean bool1 = true;
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("FirebaseApp name ");
        stringBuilder1.append(paramString);
        stringBuilder1.append(" already exists!");
        q.b(bool1, stringBuilder1.toString());
        q.a(paramContext, "Application context cannot be null.");
        g g2 = new g(paramContext, paramString, paramj);
        l.put(paramString, g2);
        g2.l();
        return g2;
      } 
    } 
    boolean bool = false;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("FirebaseApp name ");
    stringBuilder.append(paramString);
    stringBuilder.append(" already exists!");
    q.b(bool, stringBuilder.toString());
    q.a(paramContext, "Application context cannot be null.");
    g g1 = new g(paramContext, paramString, paramj);
    l.put(paramString, g1);
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=SYNTHETIC_LOCAL_VARIABLE_4} */
    g1.l();
    return g1;
  }
  
  public static g a(String paramString) {
    synchronized (j) {
      String str;
      g g1 = l.get(b(paramString));
      if (g1 != null)
        return g1; 
      List<String> list = j();
      if (list.isEmpty()) {
        str = "";
      } else {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Available app names: ");
        stringBuilder.append(TextUtils.join(", ", (Iterable)str));
        str = stringBuilder.toString();
      } 
      throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", new Object[] { paramString, str }));
    } 
  }
  
  private static String b(String paramString) {
    return paramString.trim();
  }
  
  public static List<g> b(Context paramContext) {
    synchronized (j) {
      return new ArrayList(l.values());
    } 
  }
  
  public static g c(Context paramContext) {
    synchronized (j) {
      if (l.containsKey("[DEFAULT]")) {
        g1 = k();
        return g1;
      } 
      j j1 = j.a((Context)g1);
      if (j1 == null) {
        Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
        return null;
      } 
      g g1 = a((Context)g1, j1);
      return g1;
    } 
  }
  
  private void c(boolean paramBoolean) {
    Log.d("FirebaseApp", "Notifying background state change listeners.");
    Iterator<b> iterator = this.h.iterator();
    while (iterator.hasNext())
      ((b)iterator.next()).a(paramBoolean); 
  }
  
  private void i() {
    q.b(this.f.get() ^ true, "FirebaseApp was deleted");
  }
  
  private static List<String> j() {
    null = new ArrayList();
    synchronized (j) {
      Iterator<g> iterator = l.values().iterator();
      while (iterator.hasNext())
        null.add(((g)iterator.next()).c()); 
      Collections.sort(null);
      return null;
    } 
  }
  
  public static g k() {
    synchronized (j) {
      g g1 = l.get("[DEFAULT]");
      if (g1 != null)
        return g1; 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Default FirebaseApp is not initialized in this process ");
      stringBuilder.append(l.a());
      stringBuilder.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
      throw new IllegalStateException(stringBuilder.toString());
    } 
  }
  
  private void l() {
    if ((k.a(this.a) ^ true) != 0) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
      stringBuilder1.append(c());
      Log.i("FirebaseApp", stringBuilder1.toString());
      e.a(this.a);
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Device unlocked: initializing all Firebase APIs for app ");
    stringBuilder.append(c());
    Log.i("FirebaseApp", stringBuilder.toString());
    this.d.a(g());
  }
  
  private void m() {
    Iterator<h> iterator = this.i.iterator();
    while (iterator.hasNext())
      ((h)iterator.next()).a(this.b, this.c); 
  }
  
  public <T> T a(Class<T> paramClass) {
    i();
    return (T)this.d.a(paramClass);
  }
  
  public void a() {
    if (!this.f.compareAndSet(false, true))
      return; 
    synchronized (j) {
      l.remove(this.b);
      m();
      return;
    } 
  }
  
  public void a(Boolean paramBoolean) {
    i();
    ((a)this.g.get()).a(paramBoolean);
  }
  
  public void a(boolean paramBoolean) {
    i();
    if (this.e.compareAndSet(paramBoolean ^ true, paramBoolean)) {
      boolean bool = com.google.android.gms.common.api.internal.c.b().a();
      if (paramBoolean && bool) {
        paramBoolean = true;
      } else if (!paramBoolean && bool) {
        paramBoolean = false;
      } else {
        return;
      } 
      c(paramBoolean);
      return;
    } 
  }
  
  public Context b() {
    i();
    return this.a;
  }
  
  @Deprecated
  public void b(boolean paramBoolean) {
    a(Boolean.valueOf(paramBoolean));
  }
  
  public String c() {
    i();
    return this.b;
  }
  
  public j d() {
    i();
    return this.c;
  }
  
  public String e() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(com.google.android.gms.common.util.c.a(c().getBytes(Charset.defaultCharset())));
    stringBuilder.append("+");
    stringBuilder.append(com.google.android.gms.common.util.c.a(d().b().getBytes(Charset.defaultCharset())));
    return stringBuilder.toString();
  }
  
  public boolean equals(Object paramObject) {
    return !(paramObject instanceof g) ? false : this.b.equals(((g)paramObject).c());
  }
  
  public boolean f() {
    i();
    return ((a)this.g.get()).a();
  }
  
  public boolean g() {
    return "[DEFAULT]".equals(c());
  }
  
  public int hashCode() {
    return this.b.hashCode();
  }
  
  public String toString() {
    o.a a = o.a(this);
    a.a("name", this.b);
    a.a("options", this.c);
    return a.toString();
  }
  
  public static interface b {
    void a(boolean param1Boolean);
  }
  
  @TargetApi(14)
  private static class c implements com.google.android.gms.common.api.internal.c.a {
    private static AtomicReference<c> a = new AtomicReference<c>();
    
    private static void b(Context param1Context) {
      if (k.a()) {
        if (!(param1Context.getApplicationContext() instanceof Application))
          return; 
        Application application = (Application)param1Context.getApplicationContext();
        if (a.get() == null) {
          c c1 = new c();
          if (a.compareAndSet(null, c1)) {
            com.google.android.gms.common.api.internal.c.a(application);
            com.google.android.gms.common.api.internal.c.b().a(c1);
          } 
        } 
      } 
    }
    
    public void a(boolean param1Boolean) {
      synchronized (g.h()) {
        for (g g : new ArrayList(g.l.values())) {
          if (g.b(g).get())
            g.a(g, param1Boolean); 
        } 
        return;
      } 
    }
  }
  
  private static class d implements Executor {
    private static final Handler c = new Handler(Looper.getMainLooper());
    
    private d() {}
    
    public void execute(Runnable param1Runnable) {
      c.post(param1Runnable);
    }
  }
  
  @TargetApi(24)
  private static class e extends BroadcastReceiver {
    private static AtomicReference<e> b = new AtomicReference<e>();
    
    private final Context a;
    
    public e(Context param1Context) {
      this.a = param1Context;
    }
    
    private static void b(Context param1Context) {
      if (b.get() == null) {
        e e1 = new e(param1Context);
        if (b.compareAndSet(null, e1))
          param1Context.registerReceiver(e1, new IntentFilter("android.intent.action.USER_UNLOCKED")); 
      } 
    }
    
    public void a() {
      this.a.unregisterReceiver(this);
    }
    
    public void onReceive(Context param1Context, Intent param1Intent) {
      synchronized (g.h()) {
        Iterator<g> iterator = g.l.values().iterator();
        while (iterator.hasNext())
          g.a(iterator.next()); 
        a();
        return;
      } 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */