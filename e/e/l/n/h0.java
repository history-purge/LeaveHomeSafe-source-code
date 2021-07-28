package e.e.l.n;

import e.e.c.a.d;
import e.e.e.d.f;
import e.e.e.h.a;
import e.e.l.d.f;
import e.e.l.d.p;
import e.e.l.k.b;
import e.e.l.o.c;
import e.e.l.o.e;
import java.util.Map;

public class h0 implements j0<a<b>> {
  private final p<d, b> a;
  
  private final f b;
  
  private final j0<a<b>> c;
  
  public h0(p<d, b> paramp, f paramf, j0<a<b>> paramj0) {
    this.a = paramp;
    this.b = paramf;
    this.c = paramj0;
  }
  
  protected String a() {
    return "PostprocessedBitmapMemoryCacheProducer";
  }
  
  public void a(k<a<b>> paramk, k0 paramk0) {
    Map<String, String> map;
    Object object1;
    String str2;
    m0 m0 = paramk0.e();
    String str3 = paramk0.a();
    c c = paramk0.f();
    Object object2 = paramk0.b();
    e e = c.f();
    if (e == null || e.a() == null) {
      this.c.a(paramk, paramk0);
      return;
    } 
    m0.a(str3, a());
    d d = this.b.b(c, object2);
    a<b> a = this.a.get(d);
    c = null;
    object2 = null;
    if (a != null) {
      str2 = a();
      object1 = object2;
      if (m0.a(str3))
        object1 = f.of("cached_value_found", "true"); 
      m0.a(str3, str2, (Map<String, String>)object1);
      m0.a(str3, "PostprocessedBitmapMemoryCacheProducer", true);
      paramk.a(1.0F);
      paramk.a(a, 1);
      a.close();
      return;
    } 
    boolean bool1 = e instanceof e.e.l.o.f;
    boolean bool2 = object1.f().s();
    object2 = new a(paramk, d, bool1, this.a, bool2);
    String str4 = a();
    String str1 = str2;
    if (m0.a(str3))
      map = f.of("cached_value_found", "false"); 
    m0.a(str3, str4, map);
    this.c.a((k<a<b>>)object2, (k0)object1);
  }
  
  public static class a extends n<a<b>, a<b>> {
    private final d c;
    
    private final boolean d;
    
    private final p<d, b> e;
    
    private final boolean f;
    
    public a(k<a<b>> param1k, d param1d, boolean param1Boolean1, p<d, b> param1p, boolean param1Boolean2) {
      super(param1k);
      this.c = param1d;
      this.d = param1Boolean1;
      this.e = param1p;
      this.f = param1Boolean2;
    }
    
    protected void a(a<b> param1a, int param1Int) {
      a<b> a1 = null;
      if (param1a == null) {
        if (b.a(param1Int))
          c().a(null, param1Int); 
        return;
      } 
      if (b.b(param1Int) && !this.d)
        return; 
      if (this.f)
        a1 = this.e.a(this.c, param1a); 
      try {
        c().a(1.0F);
        k<O> k = c();
        if (a1 != null)
          param1a = a1; 
        k.a((O)param1a, param1Int);
        return;
      } finally {
        a.b(a1);
      } 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/n/h0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */