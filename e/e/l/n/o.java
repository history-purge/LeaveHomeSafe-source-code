package e.e.l.n;

import c.d;
import c.f;
import e.e.c.a.d;
import e.e.e.d.f;
import e.e.l.d.e;
import e.e.l.d.f;
import e.e.l.k.d;
import e.e.l.o.c;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class o implements j0<d> {
  private final e a;
  
  private final e b;
  
  private final f c;
  
  private final j0<d> d;
  
  public o(e parame1, e parame2, f paramf, j0<d> paramj0) {
    this.a = parame1;
    this.b = parame2;
    this.c = paramf;
    this.d = paramj0;
  }
  
  static Map<String, String> a(m0 paramm0, String paramString, boolean paramBoolean, int paramInt) {
    if (!paramm0.a(paramString))
      return null; 
    String str = String.valueOf(paramBoolean);
    return paramBoolean ? f.of("cached_value_found", str, "encodedImageSize", String.valueOf(paramInt)) : f.of("cached_value_found", str);
  }
  
  private void a(AtomicBoolean paramAtomicBoolean, k0 paramk0) {
    paramk0.a(new b(this, paramAtomicBoolean));
  }
  
  private void b(k<d> paramk, k0 paramk0) {
    if (paramk0.h().a() >= c.b.d.a()) {
      paramk.a(null, 1);
      return;
    } 
    this.d.a(paramk, paramk0);
  }
  
  private static boolean b(f<?> paramf) {
    return (paramf.c() || (paramf.e() && paramf.a() instanceof java.util.concurrent.CancellationException));
  }
  
  private d<d, Void> c(k<d> paramk, k0 paramk0) {
    String str = paramk0.a();
    return new a(this, paramk0.e(), str, paramk, paramk0);
  }
  
  public void a(k<d> paramk, k0 paramk0) {
    boolean bool;
    e e1;
    c c = paramk0.f();
    if (!c.r()) {
      b(paramk, paramk0);
      return;
    } 
    paramk0.e().a(paramk0.a(), "DiskCacheProducer");
    d d = this.c.c(c, paramk0.b());
    if (c.b() == c.a.c) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool) {
      e1 = this.b;
    } else {
      e1 = this.a;
    } 
    AtomicBoolean atomicBoolean = new AtomicBoolean(false);
    e1.a(d, atomicBoolean).a(c(paramk, paramk0));
    a(atomicBoolean, paramk0);
  }
  
  class a implements d<d, Void> {
    a(o this$0, m0 param1m0, String param1String, k param1k, k0 param1k0) {}
    
    public Void a(f<d> param1f) {
      if (o.a(param1f)) {
        this.a.b(this.b, "DiskCacheProducer", null);
        this.c.a();
        return null;
      } 
      if (param1f.e()) {
        this.a.a(this.b, "DiskCacheProducer", param1f.a(), null);
        o.a(this.e).a(this.c, this.d);
        return null;
      } 
      d d1 = (d)param1f.b();
      if (d1 != null) {
        m0 m02 = this.a;
        String str1 = this.b;
        m02.a(str1, "DiskCacheProducer", o.a(m02, str1, true, d1.y()));
        this.a.a(this.b, "DiskCacheProducer", true);
        this.c.a(1.0F);
        this.c.a(d1, 1);
        d1.close();
        return null;
      } 
      m0 m01 = this.a;
      String str = this.b;
      m01.a(str, "DiskCacheProducer", o.a(m01, str, false, 0));
      o.a(this.e).a(this.c, this.d);
      return null;
    }
  }
  
  class b extends e {
    b(o this$0, AtomicBoolean param1AtomicBoolean) {}
    
    public void a() {
      this.a.set(true);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/n/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */