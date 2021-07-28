package e.e.l.n;

import android.graphics.Bitmap;
import e.e.e.d.f;
import e.e.e.d.i;
import e.e.e.h.a;
import e.e.l.c.f;
import e.e.l.k.b;
import e.e.l.o.e;
import e.e.l.o.f;
import e.e.l.o.g;
import java.io.Closeable;
import java.util.Map;
import java.util.concurrent.Executor;

public class i0 implements j0<a<b>> {
  private final j0<a<b>> a;
  
  private final f b;
  
  private final Executor c;
  
  public i0(j0<a<b>> paramj0, f paramf, Executor paramExecutor) {
    i.a(paramj0);
    this.a = paramj0;
    this.b = paramf;
    i.a(paramExecutor);
    this.c = paramExecutor;
  }
  
  public void a(k<a<b>> paramk, k0 paramk0) {
    m0 m0 = paramk0.e();
    e e = paramk0.f().f();
    paramk = new b(this, paramk, m0, paramk0.a(), e, paramk0);
    if (e instanceof f) {
      paramk = new c((b)paramk, (f)e, paramk0, null);
    } else {
      paramk = new d((b)paramk, null);
    } 
    this.a.a(paramk, paramk0);
  }
  
  private class b extends n<a<b>, a<b>> {
    private final m0 c;
    
    private final String d;
    
    private final e e;
    
    private boolean f;
    
    private a<b> g = null;
    
    private int h = 0;
    
    private boolean i = false;
    
    private boolean j = false;
    
    public b(i0 this$0, k<a<b>> param1k, m0 param1m0, String param1String, e param1e, k0 param1k0) {
      super(param1k);
      this.c = param1m0;
      this.d = param1String;
      this.e = param1e;
      param1k0.a(new a(this, this$0));
    }
    
    private a<b> a(b param1b) {
      e.e.l.k.c c = (e.e.l.k.c)param1b;
      Bitmap bitmap = c.r();
      a a1 = this.e.a(bitmap, i0.b(this.k));
      int i = c.u();
      int j = c.t();
      try {
        return a.a((Closeable)new e.e.l.k.c(a1, param1b.c(), i, j));
      } finally {
        a.b(a1);
      } 
    }
    
    private Map<String, String> a(m0 param1m0, String param1String, e param1e) {
      return !param1m0.a(param1String) ? null : f.of("Postprocessor", param1e.getName());
    }
    
    private void b(a<b> param1a, int param1Int) {
      i.a(a.c(param1a));
      if (!b((b)param1a.b())) {
        c(param1a, param1Int);
        return;
      } 
      this.c.a(this.d, "PostprocessorProducer");
      a<b> a2 = null;
      a<b> a1 = a2;
      try {
        param1a = a((b)param1a.b());
        a1 = param1a;
        this.c.a(this.d, "PostprocessorProducer", a(this.c, this.d, this.e));
        a1 = param1a;
        c(param1a, param1Int);
        a.b(param1a);
        return;
      } catch (Exception exception) {
        a1 = a2;
        this.c.a(this.d, "PostprocessorProducer", exception, a(this.c, this.d, this.e));
        a1 = a2;
        c(exception);
        a.b(null);
        return;
      } finally {}
      a.b(a1);
      throw param1a;
    }
    
    private boolean b(b param1b) {
      return param1b instanceof e.e.l.k.c;
    }
    
    private void c(a<b> param1a, int param1Int) {
      boolean bool = b.a(param1Int);
      if ((!bool && !f()) || (bool && e()))
        c().a((O)param1a, param1Int); 
    }
    
    private void c(Throwable param1Throwable) {
      if (e())
        c().a(param1Throwable); 
    }
    
    private void d() {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: iconst_0
      //   4: putfield j : Z
      //   7: aload_0
      //   8: invokespecial h : ()Z
      //   11: istore_1
      //   12: aload_0
      //   13: monitorexit
      //   14: iload_1
      //   15: ifeq -> 22
      //   18: aload_0
      //   19: invokespecial i : ()V
      //   22: return
      //   23: astore_2
      //   24: aload_0
      //   25: monitorexit
      //   26: aload_2
      //   27: athrow
      // Exception table:
      //   from	to	target	type
      //   2	14	23	finally
      //   24	26	23	finally
    }
    
    private void d(a<b> param1a, int param1Int) {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield f : Z
      //   6: ifeq -> 12
      //   9: aload_0
      //   10: monitorexit
      //   11: return
      //   12: aload_0
      //   13: getfield g : Le/e/e/h/a;
      //   16: astore #4
      //   18: aload_0
      //   19: aload_1
      //   20: invokestatic a : (Le/e/e/h/a;)Le/e/e/h/a;
      //   23: putfield g : Le/e/e/h/a;
      //   26: aload_0
      //   27: iload_2
      //   28: putfield h : I
      //   31: aload_0
      //   32: iconst_1
      //   33: putfield i : Z
      //   36: aload_0
      //   37: invokespecial h : ()Z
      //   40: istore_3
      //   41: aload_0
      //   42: monitorexit
      //   43: aload #4
      //   45: invokestatic b : (Le/e/e/h/a;)V
      //   48: iload_3
      //   49: ifeq -> 56
      //   52: aload_0
      //   53: invokespecial i : ()V
      //   56: return
      //   57: astore_1
      //   58: aload_0
      //   59: monitorexit
      //   60: aload_1
      //   61: athrow
      // Exception table:
      //   from	to	target	type
      //   2	11	57	finally
      //   12	43	57	finally
      //   58	60	57	finally
    }
    
    private boolean e() {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield f : Z
      //   6: ifeq -> 13
      //   9: aload_0
      //   10: monitorexit
      //   11: iconst_0
      //   12: ireturn
      //   13: aload_0
      //   14: getfield g : Le/e/e/h/a;
      //   17: astore_1
      //   18: aload_0
      //   19: aconst_null
      //   20: putfield g : Le/e/e/h/a;
      //   23: aload_0
      //   24: iconst_1
      //   25: putfield f : Z
      //   28: aload_0
      //   29: monitorexit
      //   30: aload_1
      //   31: invokestatic b : (Le/e/e/h/a;)V
      //   34: iconst_1
      //   35: ireturn
      //   36: astore_1
      //   37: aload_0
      //   38: monitorexit
      //   39: aload_1
      //   40: athrow
      // Exception table:
      //   from	to	target	type
      //   2	11	36	finally
      //   13	30	36	finally
      //   37	39	36	finally
    }
    
    private boolean f() {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield f : Z
      //   6: istore_1
      //   7: aload_0
      //   8: monitorexit
      //   9: iload_1
      //   10: ireturn
      //   11: astore_2
      //   12: aload_0
      //   13: monitorexit
      //   14: aload_2
      //   15: athrow
      // Exception table:
      //   from	to	target	type
      //   2	7	11	finally
    }
    
    private void g() {
      if (e())
        c().a(); 
    }
    
    private boolean h() {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield f : Z
      //   6: ifne -> 42
      //   9: aload_0
      //   10: getfield i : Z
      //   13: ifeq -> 42
      //   16: aload_0
      //   17: getfield j : Z
      //   20: ifne -> 42
      //   23: aload_0
      //   24: getfield g : Le/e/e/h/a;
      //   27: invokestatic c : (Le/e/e/h/a;)Z
      //   30: ifeq -> 42
      //   33: aload_0
      //   34: iconst_1
      //   35: putfield j : Z
      //   38: aload_0
      //   39: monitorexit
      //   40: iconst_1
      //   41: ireturn
      //   42: aload_0
      //   43: monitorexit
      //   44: iconst_0
      //   45: ireturn
      //   46: astore_1
      //   47: aload_0
      //   48: monitorexit
      //   49: aload_1
      //   50: athrow
      // Exception table:
      //   from	to	target	type
      //   2	38	46	finally
    }
    
    private void i() {
      i0.a(this.k).execute(new b(this));
    }
    
    protected void a(a<b> param1a, int param1Int) {
      if (!a.c(param1a)) {
        if (b.a(param1Int))
          c(null, param1Int); 
        return;
      } 
      d(param1a, param1Int);
    }
    
    protected void b() {
      g();
    }
    
    protected void b(Throwable param1Throwable) {
      c(param1Throwable);
    }
    
    class a extends e {
      a(i0.b this$0, i0 param2i0) {}
      
      public void a() {
        i0.b.a(this.a);
      }
    }
    
    class b implements Runnable {
      b(i0.b this$0) {}
      
      public void run() {
        synchronized (this.c) {
          a a = i0.b.b(this.c);
          int i = i0.b.c(this.c);
          i0.b.a(this.c, (a)null);
          i0.b.a(this.c, false);
          if (a.c(a))
            try {
              i0.b.a(this.c, a, i);
            } finally {
              a.b(a);
            }  
          i0.b.d(this.c);
          return;
        } 
      }
    }
  }
  
  class a extends e {
    a(i0 this$0, i0 param1i0) {}
    
    public void a() {
      i0.b.a(this.a);
    }
  }
  
  class b implements Runnable {
    b(i0 this$0) {}
    
    public void run() {
      synchronized (this.c) {
        a a = i0.b.b(this.c);
        int i = i0.b.c(this.c);
        i0.b.a(this.c, (a)null);
        i0.b.a(this.c, false);
        if (a.c(a))
          try {
            i0.b.a(this.c, a, i);
          } finally {
            a.b(a);
          }  
        i0.b.d(this.c);
        return;
      } 
    }
  }
  
  class c extends n<a<b>, a<b>> implements g {
    private boolean c = false;
    
    private a<b> d = null;
    
    private c(i0 this$0, i0.b param1b, f param1f, k0 param1k0) {
      super(param1b);
      param1f.a(this);
      param1k0.a(new a(this, i0.this));
    }
    
    private void a(a<b> param1a) {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield c : Z
      //   6: ifeq -> 12
      //   9: aload_0
      //   10: monitorexit
      //   11: return
      //   12: aload_0
      //   13: getfield d : Le/e/e/h/a;
      //   16: astore_2
      //   17: aload_0
      //   18: aload_1
      //   19: invokestatic a : (Le/e/e/h/a;)Le/e/e/h/a;
      //   22: putfield d : Le/e/e/h/a;
      //   25: aload_0
      //   26: monitorexit
      //   27: aload_2
      //   28: invokestatic b : (Le/e/e/h/a;)V
      //   31: return
      //   32: astore_1
      //   33: aload_0
      //   34: monitorexit
      //   35: aload_1
      //   36: athrow
      // Exception table:
      //   from	to	target	type
      //   2	11	32	finally
      //   12	27	32	finally
      //   33	35	32	finally
    }
    
    private boolean d() {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield c : Z
      //   6: ifeq -> 13
      //   9: aload_0
      //   10: monitorexit
      //   11: iconst_0
      //   12: ireturn
      //   13: aload_0
      //   14: getfield d : Le/e/e/h/a;
      //   17: astore_1
      //   18: aload_0
      //   19: aconst_null
      //   20: putfield d : Le/e/e/h/a;
      //   23: aload_0
      //   24: iconst_1
      //   25: putfield c : Z
      //   28: aload_0
      //   29: monitorexit
      //   30: aload_1
      //   31: invokestatic b : (Le/e/e/h/a;)V
      //   34: iconst_1
      //   35: ireturn
      //   36: astore_1
      //   37: aload_0
      //   38: monitorexit
      //   39: aload_1
      //   40: athrow
      // Exception table:
      //   from	to	target	type
      //   2	11	36	finally
      //   13	30	36	finally
      //   37	39	36	finally
    }
    
    private void e() {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield c : Z
      //   6: ifeq -> 12
      //   9: aload_0
      //   10: monitorexit
      //   11: return
      //   12: aload_0
      //   13: getfield d : Le/e/e/h/a;
      //   16: invokestatic a : (Le/e/e/h/a;)Le/e/e/h/a;
      //   19: astore_1
      //   20: aload_0
      //   21: monitorexit
      //   22: aload_0
      //   23: invokevirtual c : ()Le/e/l/n/k;
      //   26: aload_1
      //   27: iconst_0
      //   28: invokeinterface a : (Ljava/lang/Object;I)V
      //   33: aload_1
      //   34: invokestatic b : (Le/e/e/h/a;)V
      //   37: return
      //   38: astore_2
      //   39: aload_1
      //   40: invokestatic b : (Le/e/e/h/a;)V
      //   43: aload_2
      //   44: athrow
      //   45: astore_1
      //   46: aload_0
      //   47: monitorexit
      //   48: aload_1
      //   49: athrow
      // Exception table:
      //   from	to	target	type
      //   2	11	45	finally
      //   12	22	45	finally
      //   22	33	38	finally
      //   46	48	45	finally
    }
    
    protected void a(a<b> param1a, int param1Int) {
      if (b.b(param1Int))
        return; 
      a(param1a);
      e();
    }
    
    protected void b() {
      if (d())
        c().a(); 
    }
    
    protected void b(Throwable param1Throwable) {
      if (d())
        c().a(param1Throwable); 
    }
    
    class a extends e {
      a(i0.c this$0, i0 param2i0) {}
      
      public void a() {
        if (i0.c.a(this.a))
          this.a.c().a(); 
      }
    }
  }
  
  class a extends e {
    a(i0 this$0, i0 param1i0) {}
    
    public void a() {
      if (i0.c.a(this.a))
        this.a.c().a(); 
    }
  }
  
  class d extends n<a<b>, a<b>> {
    private d(i0 this$0, i0.b param1b) {
      super(param1b);
    }
    
    protected void a(a<b> param1a, int param1Int) {
      if (b.b(param1Int))
        return; 
      c().a((O)param1a, param1Int);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/n/i0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */