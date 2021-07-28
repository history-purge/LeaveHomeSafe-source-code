package c;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

public class f<TResult> {
  private static final Executor i = b.b();
  
  private static volatile d j;
  
  private static f<?> k = new f(null);
  
  private static f<Boolean> l = new f((TResult)Boolean.valueOf(true));
  
  private static f<Boolean> m = new f((TResult)Boolean.valueOf(false));
  
  private final Object a = new Object();
  
  private boolean b;
  
  private boolean c;
  
  private TResult d;
  
  private Exception e;
  
  private boolean f;
  
  private h g;
  
  private List<d<TResult, Void>> h = new ArrayList<d<TResult, Void>>();
  
  static {
    new f(true);
  }
  
  f() {}
  
  private f(TResult paramTResult) {
    a(paramTResult);
  }
  
  private f(boolean paramBoolean) {
    if (paramBoolean) {
      f();
      return;
    } 
    a((TResult)null);
  }
  
  public static <TResult> f<TResult> a(Callable<TResult> paramCallable, Executor paramExecutor) {
    return a(paramCallable, paramExecutor, (c)null);
  }
  
  public static <TResult> f<TResult> a(Callable<TResult> paramCallable, Executor paramExecutor, c paramc) {
    g<TResult> g = new g();
    try {
      paramExecutor.execute(new c(paramc, g, paramCallable));
    } catch (Exception exception) {
      g.a(new e(exception));
    } 
    return g.a();
  }
  
  public static <TResult> f<TResult> b(Exception paramException) {
    g<TResult> g = new g();
    g.a(paramException);
    return g.a();
  }
  
  public static <TResult> f<TResult> b(TResult paramTResult) {
    if (paramTResult == null)
      return (f)k; 
    if (paramTResult instanceof Boolean)
      return (f)(((Boolean)paramTResult).booleanValue() ? l : m); 
    g<TResult> g = new g();
    g.a(paramTResult);
    return g.a();
  }
  
  private static <TContinuationResult, TResult> void b(g<TContinuationResult> paramg, d<TResult, TContinuationResult> paramd, f<TResult> paramf, Executor paramExecutor, c paramc) {
    try {
      paramExecutor.execute(new b(paramc, paramg, paramd, paramf));
      return;
    } catch (Exception exception) {
      paramg.a(new e(exception));
      return;
    } 
  }
  
  public static d g() {
    return j;
  }
  
  private void h() {
    synchronized (this.a) {
      Iterator<d<TResult, Void>> iterator = this.h.iterator();
      while (iterator.hasNext()) {
        d d1 = iterator.next();
        try {
          d1.a(this);
        } catch (RuntimeException runtimeException) {
          throw runtimeException;
        } catch (Exception exception) {
          throw new RuntimeException(exception);
        } 
      } 
      this.h = null;
      return;
    } 
  }
  
  public <TContinuationResult> f<TContinuationResult> a(d<TResult, TContinuationResult> paramd) {
    return a(paramd, i, (c)null);
  }
  
  public <TContinuationResult> f<TContinuationResult> a(d<TResult, TContinuationResult> paramd, Executor paramExecutor, c paramc) {
    g<TContinuationResult> g = new g();
    synchronized (this.a) {
      boolean bool = d();
      if (!bool)
        this.h.add(new a(this, g, paramd, paramExecutor, paramc)); 
      if (bool)
        b(g, paramd, this, paramExecutor, paramc); 
      return g.a();
    } 
  }
  
  public Exception a() {
    synchronized (this.a) {
      if (this.e != null) {
        this.f = true;
        if (this.g != null) {
          this.g.a();
          this.g = null;
        } 
      } 
      return this.e;
    } 
  }
  
  boolean a(Exception paramException) {
    synchronized (this.a) {
      if (this.b)
        return false; 
      this.b = true;
      this.e = paramException;
      this.f = false;
      this.a.notifyAll();
      h();
      if (!this.f && g() != null)
        this.g = new h(this); 
      return true;
    } 
  }
  
  boolean a(TResult paramTResult) {
    synchronized (this.a) {
      if (this.b)
        return false; 
      this.b = true;
      this.d = paramTResult;
      this.a.notifyAll();
      h();
      return true;
    } 
  }
  
  public TResult b() {
    synchronized (this.a) {
      return this.d;
    } 
  }
  
  public boolean c() {
    synchronized (this.a) {
      return this.c;
    } 
  }
  
  public boolean d() {
    synchronized (this.a) {
      return this.b;
    } 
  }
  
  public boolean e() {
    synchronized (this.a) {
      if (a() != null)
        return true; 
    } 
    boolean bool = false;
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=SYNTHETIC_LOCAL_VARIABLE_2} */
    return bool;
  }
  
  boolean f() {
    synchronized (this.a) {
      if (this.b)
        return false; 
      this.b = true;
      this.c = true;
      this.a.notifyAll();
      h();
      return true;
    } 
  }
  
  static {
    b.a();
  }
  
  static {
    a.b();
  }
  
  class a implements d<TResult, Void> {
    a(f this$0, g param1g, d param1d, Executor param1Executor, c param1c) {}
    
    public Void a(f<TResult> param1f) {
      f.a(this.a, this.b, param1f, this.c, this.d);
      return null;
    }
  }
  
  static final class b implements Runnable {
    b(c param1c, g param1g, d param1d, f param1f) {}
    
    public void run() {
      c c1 = this.c;
      if (c1 == null)
        try {
          c1 = (c)this.e.a(this.f);
          this.d.a(c1);
          return;
        } catch (CancellationException null) {
          this.d.b();
          return;
        } catch (Exception exception) {
          this.d.a(exception);
          return;
        }  
      exception.a();
      throw null;
    }
  }
  
  static final class c implements Runnable {
    c(c param1c, g param1g, Callable param1Callable) {}
    
    public void run() {
      c c1 = this.c;
      if (c1 == null)
        try {
          this.d.a(this.e.call());
          return;
        } catch (CancellationException null) {
          this.d.b();
          return;
        } catch (Exception exception) {
          this.d.a(exception);
          return;
        }  
      exception.a();
      throw null;
    }
  }
  
  public static interface d {
    void a(f<?> param1f, i param1i);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/c/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */