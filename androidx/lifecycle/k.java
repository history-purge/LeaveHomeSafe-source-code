package androidx.lifecycle;

import android.annotation.SuppressLint;
import b.b.a.b.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class k extends g {
  private b.b.a.b.a<i, a> a = new b.b.a.b.a();
  
  private g.c b;
  
  private final WeakReference<j> c;
  
  private int d = 0;
  
  private boolean e = false;
  
  private boolean f = false;
  
  private ArrayList<g.c> g = new ArrayList<g.c>();
  
  private final boolean h;
  
  public k(j paramj) {
    this(paramj, true);
  }
  
  private k(j paramj, boolean paramBoolean) {
    this.c = new WeakReference<j>(paramj);
    this.b = g.c.d;
    this.h = paramBoolean;
  }
  
  static g.c a(g.c paramc1, g.c paramc2) {
    g.c c1 = paramc1;
    if (paramc2 != null) {
      c1 = paramc1;
      if (paramc2.compareTo(paramc1) < 0)
        c1 = paramc2; 
    } 
    return c1;
  }
  
  private void a(j paramj) {
    Iterator<Map.Entry> iterator = this.a.descendingIterator();
    while (iterator.hasNext() && !this.f) {
      Map.Entry entry = iterator.next();
      a a1 = (a)entry.getValue();
      while (a1.a.compareTo(this.b) > 0 && !this.f && this.a.contains(entry.getKey())) {
        g.b b = g.b.a(a1.a);
        if (b != null) {
          d(b.a());
          a1.a(paramj, b);
          c();
          continue;
        } 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("no event down from ");
        stringBuilder.append(a1.a);
        throw new IllegalStateException(stringBuilder.toString());
      } 
    } 
  }
  
  @SuppressLint({"RestrictedApi"})
  private void a(String paramString) {
    if (this.h) {
      if (b.b.a.a.a.b().a())
        return; 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Method ");
      stringBuilder.append(paramString);
      stringBuilder.append(" must be called on the main thread");
      throw new IllegalStateException(stringBuilder.toString());
    } 
  }
  
  private void b(j paramj) {
    b.d<Map.Entry> d = this.a.b();
    while (d.hasNext() && !this.f) {
      Map.Entry entry = d.next();
      a a1 = (a)entry.getValue();
      while (a1.a.compareTo(this.b) < 0 && !this.f && this.a.contains(entry.getKey())) {
        d(a1.a);
        g.b b = g.b.b(a1.a);
        if (b != null) {
          a1.a(paramj, b);
          c();
          continue;
        } 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("no event up from ");
        stringBuilder.append(a1.a);
        throw new IllegalStateException(stringBuilder.toString());
      } 
    } 
  }
  
  private boolean b() {
    if (this.a.size() == 0)
      return true; 
    g.c c1 = ((a)this.a.a().getValue()).a;
    g.c c2 = ((a)this.a.c().getValue()).a;
    return (c1 == c2 && this.b == c2);
  }
  
  private g.c c(i parami) {
    g.c c1;
    Map.Entry entry = this.a.b(parami);
    ArrayList<g.c> arrayList = null;
    if (entry != null) {
      g.c c2 = ((a)entry.getValue()).a;
    } else {
      entry = null;
    } 
    if (!this.g.isEmpty()) {
      arrayList = this.g;
      c1 = arrayList.get(arrayList.size() - 1);
    } 
    return a(a(this.b, (g.c)entry), c1);
  }
  
  private void c() {
    ArrayList<g.c> arrayList = this.g;
    arrayList.remove(arrayList.size() - 1);
  }
  
  private void c(g.c paramc) {
    if (this.b == paramc)
      return; 
    this.b = paramc;
    if (this.e || this.d != 0) {
      this.f = true;
      return;
    } 
    this.e = true;
    d();
    this.e = false;
  }
  
  private void d() {
    j j = this.c.get();
    if (j != null) {
      while (true) {
        boolean bool = b();
        this.f = false;
        if (!bool) {
          if (this.b.compareTo(((a)this.a.a().getValue()).a) < 0)
            a(j); 
          Map.Entry entry = this.a.c();
          if (!this.f && entry != null && this.b.compareTo(((a)entry.getValue()).a) > 0)
            b(j); 
          continue;
        } 
        break;
      } 
      return;
    } 
    IllegalStateException illegalStateException = new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
    throw illegalStateException;
  }
  
  private void d(g.c paramc) {
    this.g.add(paramc);
  }
  
  public g.c a() {
    return this.b;
  }
  
  public void a(g.b paramb) {
    a("handleLifecycleEvent");
    c(paramb.a());
  }
  
  @Deprecated
  public void a(g.c paramc) {
    a("markState");
    b(paramc);
  }
  
  public void a(i parami) {
    boolean bool;
    a("addObserver");
    g.c c2 = this.b;
    g.c c1 = g.c.c;
    if (c2 != c1)
      c1 = g.c.d; 
    a a1 = new a(parami, c1);
    if ((a)this.a.b(parami, a1) != null)
      return; 
    j j = this.c.get();
    if (j == null)
      return; 
    if (this.d != 0 || this.e) {
      bool = true;
    } else {
      bool = false;
    } 
    c1 = c(parami);
    this.d++;
    while (a1.a.compareTo(c1) < 0 && this.a.contains(parami)) {
      d(a1.a);
      g.b b = g.b.b(a1.a);
      if (b != null) {
        a1.a(j, b);
        c();
        g.c c3 = c(parami);
        continue;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("no event up from ");
      stringBuilder.append(a1.a);
      throw new IllegalStateException(stringBuilder.toString());
    } 
    if (!bool)
      d(); 
    this.d--;
  }
  
  public void b(g.c paramc) {
    a("setCurrentState");
    c(paramc);
  }
  
  public void b(i parami) {
    a("removeObserver");
    this.a.remove(parami);
  }
  
  static class a {
    g.c a;
    
    h b;
    
    a(i param1i, g.c param1c) {
      this.b = m.a(param1i);
      this.a = param1c;
    }
    
    void a(j param1j, g.b param1b) {
      g.c c1 = param1b.a();
      this.a = k.a(this.a, c1);
      this.b.a(param1j, param1b);
      this.a = c1;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/lifecycle/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */