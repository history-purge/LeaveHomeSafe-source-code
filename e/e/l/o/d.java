package e.e.l.o;

import android.net.Uri;
import e.e.e.d.i;
import e.e.e.k.f;
import e.e.l.e.b;
import e.e.l.e.e;
import e.e.l.e.f;
import e.e.l.f.i;
import e.e.l.l.c;

public class d {
  private Uri a = null;
  
  private c.b b = c.b.c;
  
  private e c = null;
  
  private f d = null;
  
  private b e = b.a();
  
  private c.a f = c.a.d;
  
  private boolean g = i.C().a();
  
  private boolean h = false;
  
  private e.e.l.e.d i = e.e.l.e.d.e;
  
  private e j = null;
  
  private boolean k = true;
  
  private boolean l = true;
  
  private Boolean m = null;
  
  private c n;
  
  private e.e.l.e.a o = null;
  
  private Boolean p = null;
  
  public static d a(c paramc) {
    d d1 = b(paramc.p());
    d1.a(paramc.c());
    d1.a(paramc.a());
    d1.a(paramc.b());
    d1.b(paramc.d());
    d1.a(paramc.e());
    d1.a(paramc.f());
    d1.c(paramc.j());
    d1.a(paramc.i());
    d1.a(paramc.l());
    d1.a(paramc.k());
    d1.a(paramc.n());
    d1.a(paramc.t());
    return d1;
  }
  
  public static d b(Uri paramUri) {
    d d1 = new d();
    d1.a(paramUri);
    return d1;
  }
  
  public c a() {
    r();
    return new c(this);
  }
  
  public d a(Uri paramUri) {
    i.a(paramUri);
    this.a = paramUri;
    return this;
  }
  
  public d a(e.e.l.e.a parama) {
    this.o = parama;
    return this;
  }
  
  public d a(b paramb) {
    this.e = paramb;
    return this;
  }
  
  public d a(e.e.l.e.d paramd) {
    this.i = paramd;
    return this;
  }
  
  public d a(e parame) {
    this.c = parame;
    return this;
  }
  
  public d a(f paramf) {
    this.d = paramf;
    return this;
  }
  
  public d a(c paramc) {
    this.n = paramc;
    return this;
  }
  
  public d a(c.a parama) {
    this.f = parama;
    return this;
  }
  
  public d a(c.b paramb) {
    this.b = paramb;
    return this;
  }
  
  public d a(e parame) {
    this.j = parame;
    return this;
  }
  
  public d a(Boolean paramBoolean) {
    this.m = paramBoolean;
    return this;
  }
  
  @Deprecated
  public d a(boolean paramBoolean) {
    if (paramBoolean) {
      f f2 = f.e();
      a(f2);
      return this;
    } 
    f f1 = f.g();
    a(f1);
    return this;
  }
  
  public e.e.l.e.a b() {
    return this.o;
  }
  
  public d b(boolean paramBoolean) {
    this.h = paramBoolean;
    return this;
  }
  
  public c.a c() {
    return this.f;
  }
  
  public d c(boolean paramBoolean) {
    this.g = paramBoolean;
    return this;
  }
  
  public b d() {
    return this.e;
  }
  
  public c.b e() {
    return this.b;
  }
  
  public e f() {
    return this.j;
  }
  
  public c g() {
    return this.n;
  }
  
  public e.e.l.e.d h() {
    return this.i;
  }
  
  public e i() {
    return this.c;
  }
  
  public Boolean j() {
    return this.p;
  }
  
  public f k() {
    return this.d;
  }
  
  public Uri l() {
    return this.a;
  }
  
  public boolean m() {
    return (this.k && f.i(this.a));
  }
  
  public boolean n() {
    return this.h;
  }
  
  public boolean o() {
    return this.l;
  }
  
  public boolean p() {
    return this.g;
  }
  
  public Boolean q() {
    return this.m;
  }
  
  protected void r() {
    Uri uri = this.a;
    if (uri != null) {
      if (f.h(uri)) {
        if (this.a.isAbsolute()) {
          if (!this.a.getPath().isEmpty())
            try {
              Integer.parseInt(this.a.getPath().substring(1));
              if (f.c(this.a)) {
                if (this.a.isAbsolute())
                  return; 
                throw new a("Asset URI path must be absolute.");
              } 
              return;
            } catch (NumberFormatException numberFormatException) {
              throw new a("Resource URI path must be a resource id.");
            }  
          throw new a("Resource URI must not be empty");
        } 
        throw new a("Resource URI path must be absolute.");
      } 
    } else {
      throw new a("Source must be set!");
    } 
    if (f.c(this.a)) {
      if (this.a.isAbsolute())
        return; 
      throw new a("Asset URI path must be absolute.");
    } 
  }
  
  public static class a extends RuntimeException {
    public a(String param1String) {
      super(stringBuilder.toString());
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/o/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */