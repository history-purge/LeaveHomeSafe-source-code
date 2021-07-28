package e.e.l.f;

import android.content.Context;
import android.os.Build;
import com.facebook.imagepipeline.platform.f;
import com.facebook.imagepipeline.platform.g;
import e.e.c.a.d;
import e.e.c.b.c;
import e.e.c.b.i;
import e.e.e.d.i;
import e.e.e.d.m;
import e.e.e.g.g;
import e.e.l.a.a.a;
import e.e.l.a.a.b;
import e.e.l.c.f;
import e.e.l.c.g;
import e.e.l.d.a;
import e.e.l.d.b;
import e.e.l.d.e;
import e.e.l.d.h;
import e.e.l.d.l;
import e.e.l.d.m;
import e.e.l.d.o;
import e.e.l.d.p;
import e.e.l.i.b;
import e.e.l.i.c;
import e.e.l.j.a;
import e.e.l.k.b;
import e.e.l.n.t0;
import e.e.l.p.b;
import e.e.l.q.d;
import e.e.l.q.f;
import e.e.l.q.h;

public class k {
  private static final Class<?> t = k.class;
  
  private static k u;
  
  private final t0 a;
  
  private final i b;
  
  private final a c;
  
  private h<d, b> d;
  
  private o<d, b> e;
  
  private h<d, g> f;
  
  private o<d, g> g;
  
  private e h;
  
  private i i;
  
  private c j;
  
  private h k;
  
  private d l;
  
  private m m;
  
  private n n;
  
  private e o;
  
  private i p;
  
  private f q;
  
  private f r;
  
  private a s;
  
  public k(i parami) {
    if (b.c())
      b.a("ImagePipelineConfig()"); 
    i.a(parami);
    this.b = parami;
    this.a = new t0(parami.i().b());
    this.c = new a(parami.f());
    if (b.c())
      b.a(); 
  }
  
  public static void a(i parami) {
    // Byte code:
    //   0: ldc e/e/l/f/k
    //   2: monitorenter
    //   3: getstatic e/e/l/f/k.u : Le/e/l/f/k;
    //   6: ifnull -> 17
    //   9: getstatic e/e/l/f/k.t : Ljava/lang/Class;
    //   12: ldc 'ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior.'
    //   14: invokestatic c : (Ljava/lang/Class;Ljava/lang/String;)V
    //   17: new e/e/l/f/k
    //   20: dup
    //   21: aload_0
    //   22: invokespecial <init> : (Le/e/l/f/i;)V
    //   25: putstatic e/e/l/f/k.u : Le/e/l/f/k;
    //   28: ldc e/e/l/f/k
    //   30: monitorexit
    //   31: return
    //   32: astore_0
    //   33: ldc e/e/l/f/k
    //   35: monitorexit
    //   36: aload_0
    //   37: athrow
    // Exception table:
    //   from	to	target	type
    //   3	17	32	finally
    //   17	28	32	finally
  }
  
  public static void b(Context paramContext) {
    // Byte code:
    //   0: ldc e/e/l/f/k
    //   2: monitorenter
    //   3: invokestatic c : ()Z
    //   6: ifeq -> 14
    //   9: ldc 'ImagePipelineFactory#initialize'
    //   11: invokestatic a : (Ljava/lang/String;)V
    //   14: aload_0
    //   15: invokestatic b : (Landroid/content/Context;)Le/e/l/f/i$b;
    //   18: invokevirtual a : ()Le/e/l/f/i;
    //   21: invokestatic a : (Le/e/l/f/i;)V
    //   24: invokestatic c : ()Z
    //   27: ifeq -> 33
    //   30: invokestatic a : ()V
    //   33: ldc e/e/l/f/k
    //   35: monitorexit
    //   36: return
    //   37: astore_0
    //   38: ldc e/e/l/f/k
    //   40: monitorexit
    //   41: aload_0
    //   42: athrow
    // Exception table:
    //   from	to	target	type
    //   3	14	37	finally
    //   14	33	37	finally
  }
  
  private a l() {
    if (this.s == null)
      this.s = b.a(i(), this.b.i(), a(), this.b.j().p()); 
    return this.s;
  }
  
  private c m() {
    if (this.j == null)
      if (this.b.m() != null) {
        this.j = this.b.m();
      } else {
        a a2;
        a a1 = l();
        if (a1 != null) {
          c c2 = a1.b(this.b.a());
          c c1 = a1.a(this.b.a());
        } else {
          a1 = null;
          a2 = a1;
        } 
        if (this.b.n() == null) {
          this.j = (c)new b((c)a2, (c)a1, j());
        } else {
          j();
          this.b.n().a();
          throw null;
        } 
      }  
    return this.j;
  }
  
  private d n() {
    if (this.l == null) {
      f f1;
      if (this.b.o() == null && this.b.p() == null && this.b.j().m()) {
        h h1 = new h(this.b.j().d());
      } else {
        f1 = new f(this.b.j().d(), this.b.j().g(), this.b.o(), this.b.p());
      } 
      this.l = (d)f1;
    } 
    return this.l;
  }
  
  public static k o() {
    k k1 = u;
    i.a(k1, "ImagePipelineFactory was not initialized!");
    return k1;
  }
  
  private m p() {
    if (this.m == null)
      this.m = this.b.j().e().a(this.b.g(), this.b.v().h(), m(), this.b.w(), this.b.A(), this.b.B(), this.b.j().j(), this.b.i(), this.b.v().a(this.b.s()), (p<d, b>)b(), (p<d, g>)e(), g(), r(), this.b.d(), i(), this.b.j().c(), this.b.j().b(), this.b.j().a(), this.b.j().d(), c()); 
    return this.m;
  }
  
  private n q() {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 24 && this.b.j().f()) {
      bool = true;
    } else {
      bool = false;
    } 
    if (this.n == null)
      this.n = new n(this.b.g().getApplicationContext().getContentResolver(), p(), this.b.u(), this.b.B(), this.b.j().o(), this.a, this.b.A(), bool, this.b.j().n(), this.b.z(), n()); 
    return this.n;
  }
  
  private e r() {
    if (this.o == null)
      this.o = new e(k(), this.b.v().a(this.b.s()), this.b.v().g(), this.b.i().c(), this.b.i().e(), this.b.l()); 
    return this.o;
  }
  
  public h<d, b> a() {
    if (this.d == null)
      this.d = a.a(this.b.b(), this.b.t(), this.b.c()); 
    return this.d;
  }
  
  public a a(Context paramContext) {
    a a1 = l();
    return (a1 == null) ? null : a1.a(paramContext);
  }
  
  public o<d, b> b() {
    if (this.e == null)
      this.e = b.a(a(), this.b.l()); 
    return this.e;
  }
  
  public a c() {
    return this.c;
  }
  
  public h<d, g> d() {
    if (this.f == null)
      this.f = l.a(this.b.h(), this.b.t()); 
    return this.f;
  }
  
  public o<d, g> e() {
    if (this.g == null)
      this.g = m.a(d(), this.b.l()); 
    return this.g;
  }
  
  public h f() {
    if (this.k == null)
      this.k = new h(q(), this.b.x(), this.b.q(), (p<d, b>)b(), (p<d, g>)e(), g(), r(), this.b.d(), this.a, m.a(Boolean.valueOf(false)), this.b.j().l(), this.b.e()); 
    return this.k;
  }
  
  public e g() {
    if (this.h == null)
      this.h = new e(h(), this.b.v().a(this.b.s()), this.b.v().g(), this.b.i().c(), this.b.i().e(), this.b.l()); 
    return this.h;
  }
  
  public i h() {
    if (this.i == null) {
      c c1 = this.b.r();
      this.i = this.b.k().a(c1);
    } 
    return this.i;
  }
  
  public f i() {
    if (this.q == null)
      this.q = g.a(this.b.v(), j(), c()); 
    return this.q;
  }
  
  public f j() {
    if (this.r == null)
      this.r = g.a(this.b.v(), this.b.j().k()); 
    return this.r;
  }
  
  public i k() {
    if (this.p == null) {
      c c1 = this.b.y();
      this.p = this.b.k().a(c1);
    } 
    return this.p;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/f/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */