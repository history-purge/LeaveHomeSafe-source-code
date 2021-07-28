package e.e.l.o;

import android.net.Uri;
import e.e.c.a.d;
import e.e.e.d.h;
import e.e.e.k.f;
import e.e.l.e.d;
import e.e.l.e.e;
import e.e.l.e.f;
import java.io.File;

public class c {
  private final a a;
  
  private final Uri b;
  
  private final int c;
  
  private File d;
  
  private final boolean e;
  
  private final boolean f;
  
  private final e.e.l.e.b g;
  
  private final e h;
  
  private final f i;
  
  private final e.e.l.e.a j;
  
  private final d k;
  
  private final b l;
  
  private final boolean m;
  
  private final boolean n;
  
  private final Boolean o;
  
  private final e p;
  
  private final e.e.l.l.c q;
  
  private final Boolean r;
  
  protected c(d paramd) {
    f f1;
    this.a = paramd.c();
    this.b = paramd.l();
    this.c = b(this.b);
    this.e = paramd.p();
    this.f = paramd.n();
    this.g = paramd.d();
    this.h = paramd.i();
    if (paramd.k() == null) {
      f1 = f.e();
    } else {
      f1 = paramd.k();
    } 
    this.i = f1;
    this.j = paramd.b();
    this.k = paramd.h();
    this.l = paramd.e();
    this.m = paramd.m();
    this.n = paramd.o();
    this.o = paramd.q();
    this.p = paramd.f();
    this.q = paramd.g();
    this.r = paramd.j();
  }
  
  public static c a(Uri paramUri) {
    return (paramUri == null) ? null : d.b(paramUri).a();
  }
  
  private static int b(Uri paramUri) {
    return (paramUri == null) ? -1 : (f.i(paramUri) ? 0 : (f.g(paramUri) ? (e.e.e.f.a.c(e.e.e.f.a.b(paramUri.getPath())) ? 2 : 3) : (f.f(paramUri) ? 4 : (f.c(paramUri) ? 5 : (f.h(paramUri) ? 6 : (f.b(paramUri) ? 7 : (f.j(paramUri) ? 8 : -1)))))));
  }
  
  public e.e.l.e.a a() {
    return this.j;
  }
  
  public a b() {
    return this.a;
  }
  
  public e.e.l.e.b c() {
    return this.g;
  }
  
  public boolean d() {
    return this.f;
  }
  
  public b e() {
    return this.l;
  }
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof c))
      return false; 
    c c1 = (c)paramObject;
    if (h.a(this.b, c1.b) && h.a(this.a, c1.a) && h.a(this.d, c1.d) && h.a(this.j, c1.j) && h.a(this.g, c1.g) && h.a(this.h, c1.h)) {
      if (!h.a(this.i, c1.i))
        return false; 
      paramObject = this.p;
      d d1 = null;
      if (paramObject != null) {
        paramObject = paramObject.a();
      } else {
        paramObject = null;
      } 
      e e1 = c1.p;
      if (e1 != null)
        d1 = e1.a(); 
      return h.a(paramObject, d1);
    } 
    return false;
  }
  
  public e f() {
    return this.p;
  }
  
  public int g() {
    e e1 = this.h;
    return (e1 != null) ? e1.b : 2048;
  }
  
  public int h() {
    e e1 = this.h;
    return (e1 != null) ? e1.a : 2048;
  }
  
  public int hashCode() {
    e e1 = this.p;
    if (e1 != null) {
      d d1 = e1.a();
    } else {
      e1 = null;
    } 
    return h.a(new Object[] { this.a, this.b, this.d, this.j, this.g, this.h, this.i, e1, this.r });
  }
  
  public d i() {
    return this.k;
  }
  
  public boolean j() {
    return this.e;
  }
  
  public e.e.l.l.c k() {
    return this.q;
  }
  
  public e l() {
    return this.h;
  }
  
  public Boolean m() {
    return this.r;
  }
  
  public f n() {
    return this.i;
  }
  
  public File o() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield d : Ljava/io/File;
    //   6: ifnonnull -> 27
    //   9: aload_0
    //   10: new java/io/File
    //   13: dup
    //   14: aload_0
    //   15: getfield b : Landroid/net/Uri;
    //   18: invokevirtual getPath : ()Ljava/lang/String;
    //   21: invokespecial <init> : (Ljava/lang/String;)V
    //   24: putfield d : Ljava/io/File;
    //   27: aload_0
    //   28: getfield d : Ljava/io/File;
    //   31: astore_1
    //   32: aload_0
    //   33: monitorexit
    //   34: aload_1
    //   35: areturn
    //   36: astore_1
    //   37: aload_0
    //   38: monitorexit
    //   39: aload_1
    //   40: athrow
    // Exception table:
    //   from	to	target	type
    //   2	27	36	finally
    //   27	32	36	finally
  }
  
  public Uri p() {
    return this.b;
  }
  
  public int q() {
    return this.c;
  }
  
  public boolean r() {
    return this.m;
  }
  
  public boolean s() {
    return this.n;
  }
  
  public Boolean t() {
    return this.o;
  }
  
  public String toString() {
    h.b b1 = h.a(this);
    b1.a("uri", this.b);
    b1.a("cacheChoice", this.a);
    b1.a("decodeOptions", this.g);
    b1.a("postprocessor", this.p);
    b1.a("priority", this.k);
    b1.a("resizeOptions", this.h);
    b1.a("rotationOptions", this.i);
    b1.a("bytesRange", this.j);
    b1.a("resizingAllowedOverride", this.r);
    return b1.toString();
  }
  
  public enum a {
    c, d;
  }
  
  public enum b {
    c(1),
    d(2),
    e(3),
    f(4);
    
    private int mValue;
    
    b(int param1Int1) {
      this.mValue = param1Int1;
    }
    
    public static b a(b param1b1, b param1b2) {
      return (param1b1.a() > param1b2.a()) ? param1b1 : param1b2;
    }
    
    public int a() {
      return this.mValue;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/o/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */