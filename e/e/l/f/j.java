package e.e.l.f;

import android.content.Context;
import e.e.e.d.l;
import e.e.e.g.g;
import e.e.e.g.h;
import e.e.l.c.f;
import e.e.l.d.e;
import e.e.l.d.f;
import e.e.l.d.p;
import e.e.l.i.e;

public class j {
  private final boolean a;
  
  private final e.e.e.l.b.a b;
  
  private final boolean c;
  
  private final e.e.e.l.b d;
  
  private final boolean e;
  
  private final boolean f;
  
  private final int g;
  
  private final int h;
  
  private boolean i;
  
  private final int j;
  
  private final boolean k;
  
  private final boolean l;
  
  private final d m;
  
  private final l<Boolean> n;
  
  private final boolean o;
  
  private final boolean p;
  
  private j(b paramb) {
    d d1;
    this.a = b.a(paramb);
    this.b = b.b(paramb);
    this.c = b.e(paramb);
    this.d = b.f(paramb);
    this.e = b.g(paramb);
    this.f = b.h(paramb);
    this.g = b.i(paramb);
    this.h = b.j(paramb);
    this.i = paramb.i;
    this.j = b.k(paramb);
    this.k = b.l(paramb);
    this.l = b.c(paramb);
    if (b.d(paramb) == null) {
      d1 = new c();
    } else {
      d1 = b.d(paramb);
    } 
    this.m = d1;
    this.n = paramb.n;
    this.o = paramb.o;
    this.p = paramb.p;
  }
  
  public boolean a() {
    return this.i;
  }
  
  public int b() {
    return this.h;
  }
  
  public int c() {
    return this.g;
  }
  
  public int d() {
    return this.j;
  }
  
  public d e() {
    return this.m;
  }
  
  public boolean f() {
    return this.f;
  }
  
  public boolean g() {
    return this.e;
  }
  
  public e.e.e.l.b h() {
    return this.d;
  }
  
  public e.e.e.l.b.a i() {
    return this.b;
  }
  
  public boolean j() {
    return this.c;
  }
  
  public boolean k() {
    return this.o;
  }
  
  public l<Boolean> l() {
    return this.n;
  }
  
  public boolean m() {
    return this.k;
  }
  
  public boolean n() {
    return this.l;
  }
  
  public boolean o() {
    return this.a;
  }
  
  public boolean p() {
    return this.p;
  }
  
  public static class b {
    private boolean a = false;
    
    private e.e.e.l.b.a b;
    
    private boolean c = false;
    
    private e.e.e.l.b d;
    
    private boolean e = false;
    
    private boolean f = false;
    
    private int g = 0;
    
    private int h = 0;
    
    public boolean i = false;
    
    private int j = 2048;
    
    private boolean k = false;
    
    private boolean l = false;
    
    private j.d m;
    
    public l<Boolean> n;
    
    public boolean o;
    
    public boolean p;
    
    public b(i.b param1b) {}
    
    public j a() {
      return new j(this, null);
    }
  }
  
  public static class c implements d {
    public m a(Context param1Context, e.e.e.g.a param1a, e.e.l.i.c param1c, e param1e, boolean param1Boolean1, boolean param1Boolean2, boolean param1Boolean3, f param1f, h param1h, p<e.e.c.a.d, e.e.l.k.b> param1p, p<e.e.c.a.d, g> param1p1, e param1e1, e param1e2, f param1f1, f param1f2, int param1Int1, int param1Int2, boolean param1Boolean4, int param1Int3, a param1a1) {
      return new m(param1Context, param1a, param1c, param1e, param1Boolean1, param1Boolean2, param1Boolean3, param1f, param1h, param1p, param1p1, param1e1, param1e2, param1f1, param1f2, param1Int1, param1Int2, param1Boolean4, param1Int3, param1a1);
    }
  }
  
  public static interface d {
    m a(Context param1Context, e.e.e.g.a param1a, e.e.l.i.c param1c, e param1e, boolean param1Boolean1, boolean param1Boolean2, boolean param1Boolean3, f param1f, h param1h, p<e.e.c.a.d, e.e.l.k.b> param1p, p<e.e.c.a.d, g> param1p1, e param1e1, e param1e2, f param1f1, f param1f2, int param1Int1, int param1Int2, boolean param1Boolean4, int param1Int3, a param1a1);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/f/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */