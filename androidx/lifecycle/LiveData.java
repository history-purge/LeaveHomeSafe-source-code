package androidx.lifecycle;

import java.util.Map;

public abstract class LiveData<T> {
  static final Object k = new Object();
  
  final Object a = new Object();
  
  private b.b.a.b.b<p<? super T>, c> b = new b.b.a.b.b();
  
  int c = 0;
  
  private boolean d;
  
  private volatile Object e = k;
  
  volatile Object f = k;
  
  private int g = -1;
  
  private boolean h;
  
  private boolean i;
  
  private final Runnable j = new a(this);
  
  static void a(String paramString) {
    if (b.b.a.a.a.b().a())
      return; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Cannot invoke ");
    stringBuilder.append(paramString);
    stringBuilder.append(" on a background thread");
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  private void b(c paramc) {
    if (!paramc.d)
      return; 
    if (!paramc.b()) {
      paramc.a(false);
      return;
    } 
    int i = paramc.e;
    int j = this.g;
    if (i >= j)
      return; 
    paramc.e = j;
    paramc.c.a((T)this.e);
  }
  
  public T a() {
    Object object = this.e;
    return (T)((object != k) ? object : null);
  }
  
  void a(int paramInt) {
    int i = this.c;
    this.c = paramInt + i;
    if (this.d)
      return; 
    this.d = true;
    while (true) {
      try {
        if (i != this.c) {
          if (i == 0 && this.c > 0) {
            paramInt = 1;
          } else {
            paramInt = 0;
          } 
          if (i > 0 && this.c == 0) {
            i = 1;
          } else {
            i = 0;
          } 
          int j = this.c;
          if (paramInt != 0) {
            c();
          } else if (i != 0) {
            d();
          } 
          i = j;
          continue;
        } 
        return;
      } finally {
        this.d = false;
      } 
    } 
  }
  
  void a(c paramc) {
    if (this.h) {
      this.i = true;
      return;
    } 
    this.h = true;
    while (true) {
      c c1;
      this.i = false;
      if (paramc != null) {
        b(paramc);
        c1 = null;
      } else {
        b.b.a.b.b.d<Map.Entry> d = this.b.b();
        while (true) {
          c1 = paramc;
          if (d.hasNext()) {
            b((c)((Map.Entry)d.next()).getValue());
            if (this.i) {
              c1 = paramc;
              break;
            } 
            continue;
          } 
          break;
        } 
      } 
      paramc = c1;
      if (!this.i) {
        this.h = false;
        return;
      } 
    } 
  }
  
  public void a(j paramj, p<? super T> paramp) {
    a("observe");
    if (paramj.a().a() == g.c.c)
      return; 
    LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(this, paramj, paramp);
    c c = (c)this.b.b(paramp, lifecycleBoundObserver);
    if (c == null || c.a(paramj)) {
      if (c != null)
        return; 
      paramj.a().a(lifecycleBoundObserver);
      return;
    } 
    throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
  }
  
  public void a(p<? super T> paramp) {
    a("observeForever");
    b b1 = new b(this, paramp);
    c c = (c)this.b.b(paramp, b1);
    if (!(c instanceof LifecycleBoundObserver)) {
      if (c != null)
        return; 
      b1.a(true);
      return;
    } 
    throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
  }
  
  protected void a(T paramT) {
    synchronized (this.a) {
      boolean bool;
      if (this.f == k) {
        bool = true;
      } else {
        bool = false;
      } 
      this.f = paramT;
      if (!bool)
        return; 
      b.b.a.a.a.b().b(this.j);
      return;
    } 
  }
  
  public void b(p<? super T> paramp) {
    a("removeObserver");
    c c = (c)this.b.remove(paramp);
    if (c == null)
      return; 
    c.a();
    c.a(false);
  }
  
  protected void b(T paramT) {
    a("setValue");
    this.g++;
    this.e = paramT;
    a((c)null);
  }
  
  public boolean b() {
    return (this.c > 0);
  }
  
  protected void c() {}
  
  protected void d() {}
  
  class LifecycleBoundObserver extends c implements h {
    final j g;
    
    LifecycleBoundObserver(LiveData this$0, j param1j, p<? super T> param1p) {
      super(this$0, param1p);
      this.g = param1j;
    }
    
    void a() {
      this.g.a().b(this);
    }
    
    public void a(j param1j, g.b param1b) {
      g.c c1 = this.g.a().a();
      if (c1 == g.c.c) {
        this.h.b(this.c);
        return;
      } 
      param1b = null;
      while (param1b != c1) {
        a(b());
        g.c c3 = this.g.a().a();
        g.c c2 = c1;
        c1 = c3;
      } 
    }
    
    boolean a(j param1j) {
      return (this.g == param1j);
    }
    
    boolean b() {
      return this.g.a().a().a(g.c.f);
    }
  }
  
  class a implements Runnable {
    a(LiveData this$0) {}
    
    public void run() {
      synchronized (this.c.a) {
        Object object = this.c.f;
        this.c.f = LiveData.k;
        this.c.b(object);
        return;
      } 
    }
  }
  
  private class b extends c {
    b(LiveData this$0, p<? super T> param1p) {
      super(this$0, param1p);
    }
    
    boolean b() {
      return true;
    }
  }
  
  private abstract class c {
    final p<? super T> c;
    
    boolean d;
    
    int e = -1;
    
    c(LiveData this$0, p<? super T> param1p) {
      this.c = param1p;
    }
    
    void a() {}
    
    void a(boolean param1Boolean) {
      byte b;
      if (param1Boolean == this.d)
        return; 
      this.d = param1Boolean;
      LiveData liveData = this.f;
      if (this.d) {
        b = 1;
      } else {
        b = -1;
      } 
      liveData.a(b);
      if (this.d)
        this.f.a(this); 
    }
    
    boolean a(j param1j) {
      return false;
    }
    
    abstract boolean b();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/lifecycle/LiveData.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */