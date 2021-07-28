package e.e.l.f;

import android.net.Uri;
import e.e.c.a.d;
import e.e.e.d.j;
import e.e.e.d.l;
import e.e.e.g.g;
import e.e.e.k.f;
import e.e.g.d;
import e.e.l.d.e;
import e.e.l.d.f;
import e.e.l.d.p;
import e.e.l.e.d;
import e.e.l.g.d;
import e.e.l.n.j0;
import e.e.l.n.m0;
import e.e.l.n.p0;
import e.e.l.n.t0;
import e.e.l.o.d;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;

public class h {
  private static final CancellationException k = new CancellationException("Prefetching is not enabled");
  
  private final n a;
  
  private final e.e.l.l.c b;
  
  private final l<Boolean> c;
  
  private final p<d, e.e.l.k.b> d;
  
  private final p<d, g> e;
  
  private final e f;
  
  private final e g;
  
  private final f h;
  
  private AtomicLong i = new AtomicLong();
  
  private final e.e.d.a j;
  
  public h(n paramn, Set<e.e.l.l.c> paramSet, l<Boolean> paraml1, p<d, e.e.l.k.b> paramp, p<d, g> paramp1, e parame1, e parame2, f paramf, t0 paramt0, l<Boolean> paraml2, l<Boolean> paraml3, e.e.d.a parama) {
    this.a = paramn;
    this.b = (e.e.l.l.c)new e.e.l.l.b(paramSet);
    this.c = paraml1;
    this.d = paramp;
    this.e = paramp1;
    this.f = parame1;
    this.g = parame2;
    this.h = paramf;
    this.j = parama;
  }
  
  private e.e.g.c<Void> a(j0<Void> paramj0, e.e.l.o.c paramc, e.e.l.o.c.b paramb, Object paramObject, d paramd) {
    e.e.l.l.c c1 = a(paramc, (e.e.l.l.c)null);
    e.e.d.a a1 = this.j;
    if (a1 != null)
      a1.a(paramObject); 
    try {
      paramb = e.e.l.o.c.b.a(paramc.e(), paramb);
      return d.a(paramj0, new p0(paramc, d(), (m0)c1, paramObject, paramb, true, false, paramd), c1);
    } catch (Exception exception) {
      return d.b(exception);
    } 
  }
  
  private <T> e.e.g.c<e.e.e.h.a<T>> a(j0<e.e.e.h.a<T>> paramj0, e.e.l.o.c paramc, e.e.l.o.c.b paramb, Object paramObject, e.e.l.l.c paramc1) {
    if (e.e.l.p.b.c())
      e.e.l.p.b.a("ImagePipeline#submitFetchRequest"); 
    paramc1 = a(paramc, paramc1);
    e.e.d.a a1 = this.j;
    if (a1 != null)
      a1.a(paramObject); 
    try {
      boolean bool;
      paramb = e.e.l.o.c.b.a(paramc.e(), paramb);
      String str = d();
      if (paramc.j() || !f.i(paramc.p())) {
        bool = true;
      } else {
        bool = false;
      } 
      e.e.g.c<e.e.e.h.a<T>> c1 = e.e.l.g.c.a(paramj0, new p0(paramc, str, (m0)paramc1, paramObject, paramb, false, bool, paramc.i()), paramc1);
      if (e.e.l.p.b.c())
        e.e.l.p.b.a(); 
      return c1;
    } catch (Exception exception) {
      e.e.g.c<e.e.e.h.a<T>> c1 = d.b(exception);
      if (e.e.l.p.b.c())
        e.e.l.p.b.a(); 
      return c1;
    } finally {}
    if (e.e.l.p.b.c())
      e.e.l.p.b.a(); 
    throw paramj0;
  }
  
  private j<d> c(Uri paramUri) {
    return new b(this, paramUri);
  }
  
  public e.e.g.c<e.e.e.h.a<e.e.l.k.b>> a(e.e.l.o.c paramc, Object paramObject) {
    return a(paramc, paramObject, e.e.l.o.c.b.c);
  }
  
  public e.e.g.c<Void> a(e.e.l.o.c paramc, Object paramObject, d paramd) {
    if (!((Boolean)this.c.get()).booleanValue())
      return d.b(k); 
    try {
      return a(this.a.b(paramc), paramc, e.e.l.o.c.b.c, paramObject, paramd);
    } catch (Exception exception) {
      return d.b(exception);
    } 
  }
  
  public e.e.g.c<e.e.e.h.a<e.e.l.k.b>> a(e.e.l.o.c paramc, Object paramObject, e.e.l.o.c.b paramb) {
    return a(paramc, paramObject, paramb, null);
  }
  
  public e.e.g.c<e.e.e.h.a<e.e.l.k.b>> a(e.e.l.o.c paramc, Object paramObject, e.e.l.o.c.b paramb, e.e.l.l.c paramc1) {
    try {
      return a(this.a.a(paramc), paramc, paramb, paramObject, paramc1);
    } catch (Exception exception) {
      return d.b(exception);
    } 
  }
  
  public e.e.l.l.c a(e.e.l.o.c paramc, e.e.l.l.c paramc1) {
    return (e.e.l.l.c)((paramc1 == null) ? ((paramc.k() == null) ? this.b : new e.e.l.l.b(new e.e.l.l.c[] { this.b, paramc.k() })) : ((paramc.k() == null) ? new e.e.l.l.b(new e.e.l.l.c[] { this.b, paramc1 }) : new e.e.l.l.b(new e.e.l.l.c[] { this.b, paramc1, paramc.k() })));
  }
  
  public void a() {
    c();
    b();
  }
  
  public boolean a(Uri paramUri) {
    if (paramUri == null)
      return false; 
    j<d> j = c(paramUri);
    return this.d.b(j);
  }
  
  public boolean a(Uri paramUri, e.e.l.o.c.a parama) {
    d d = d.b(paramUri);
    d.a(parama);
    return b(d.a());
  }
  
  public boolean a(e.e.l.o.c paramc) {
    if (paramc == null)
      return false; 
    d d = this.h.a(paramc, null);
    e.e.e.h.a a1 = this.d.get(d);
    try {
      return e.e.e.h.a.c(a1);
    } finally {
      e.e.e.h.a.b(a1);
    } 
  }
  
  public e.e.g.c<e.e.e.h.a<e.e.l.k.b>> b(e.e.l.o.c paramc, Object paramObject) {
    return a(paramc, paramObject, e.e.l.o.c.b.f);
  }
  
  public void b() {
    this.f.a();
    this.g.a();
  }
  
  public boolean b(Uri paramUri) {
    return (a(paramUri, e.e.l.o.c.a.c) || a(paramUri, e.e.l.o.c.a.d));
  }
  
  public boolean b(e.e.l.o.c paramc) {
    d d = this.h.c(paramc, null);
    e.e.l.o.c.a a1 = paramc.b();
    int i = c.a[a1.ordinal()];
    if (i != 1) {
      if (i != 2)
        return false; 
      e e2 = this.g;
      return e2.b(d);
    } 
    e e1 = this.f;
    return e1.b(d);
  }
  
  public e.e.g.c<Void> c(e.e.l.o.c paramc, Object paramObject) {
    return a(paramc, paramObject, d.d);
  }
  
  public void c() {
    a a1 = new a(this);
    this.d.a(a1);
    this.e.a(a1);
  }
  
  public String d() {
    return String.valueOf(this.i.getAndIncrement());
  }
  
  public p<d, e.e.l.k.b> e() {
    return this.d;
  }
  
  public f f() {
    return this.h;
  }
  
  class a implements j<d> {
    a(h this$0) {}
    
    public boolean a(d param1d) {
      return true;
    }
  }
  
  class b implements j<d> {
    b(h this$0, Uri param1Uri) {}
    
    public boolean a(d param1d) {
      return param1d.a(this.a);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/f/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */