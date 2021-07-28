package e.e.c.b;

import android.content.Context;
import e.e.c.a.g;
import e.e.c.a.h;
import e.e.e.d.i;
import e.e.e.d.l;
import java.io.File;

public class c {
  private final int a;
  
  private final String b;
  
  private final l<File> c;
  
  private final long d;
  
  private final long e;
  
  private final long f;
  
  private final h g;
  
  private final e.e.c.a.a h;
  
  private final e.e.c.a.c i;
  
  private final e.e.e.a.b j;
  
  private final Context k;
  
  private final boolean l;
  
  private c(b paramb) {
    e.e.c.a.a a1;
    e.e.c.a.c c1;
    e.e.e.a.b b1;
    this.a = b.a(paramb);
    String str = b.b(paramb);
    i.a(str);
    this.b = str;
    l<File> l1 = b.e(paramb);
    i.a(l1);
    this.c = l1;
    this.d = b.f(paramb);
    this.e = b.g(paramb);
    this.f = b.h(paramb);
    h h1 = b.i(paramb);
    i.a(h1);
    this.g = h1;
    if (b.j(paramb) == null) {
      g g = g.a();
    } else {
      a1 = b.j(paramb);
    } 
    this.h = a1;
    if (b.k(paramb) == null) {
      h h2 = h.b();
    } else {
      c1 = b.k(paramb);
    } 
    this.i = c1;
    if (b.l(paramb) == null) {
      e.e.e.a.c c2 = e.e.e.a.c.a();
    } else {
      b1 = b.l(paramb);
    } 
    this.j = b1;
    this.k = b.c(paramb);
    this.l = b.d(paramb);
  }
  
  public static b a(Context paramContext) {
    return new b(paramContext, null);
  }
  
  public String a() {
    return this.b;
  }
  
  public l<File> b() {
    return this.c;
  }
  
  public e.e.c.a.a c() {
    return this.h;
  }
  
  public e.e.c.a.c d() {
    return this.i;
  }
  
  public Context e() {
    return this.k;
  }
  
  public long f() {
    return this.d;
  }
  
  public e.e.e.a.b g() {
    return this.j;
  }
  
  public h h() {
    return this.g;
  }
  
  public boolean i() {
    return this.l;
  }
  
  public long j() {
    return this.e;
  }
  
  public long k() {
    return this.f;
  }
  
  public int l() {
    return this.a;
  }
  
  public static class b {
    private int a = 1;
    
    private String b = "image_cache";
    
    private l<File> c;
    
    private long d = 41943040L;
    
    private long e = 10485760L;
    
    private long f = 2097152L;
    
    private h g = new b();
    
    private e.e.c.a.a h;
    
    private e.e.c.a.c i;
    
    private e.e.e.a.b j;
    
    private boolean k;
    
    private final Context l;
    
    private b(Context param1Context) {
      this.l = param1Context;
    }
    
    public c a() {
      boolean bool;
      if (this.c != null || this.l != null) {
        bool = true;
      } else {
        bool = false;
      } 
      i.b(bool, "Either a non-null context or a base directory path or supplier must be provided.");
      if (this.c == null && this.l != null)
        this.c = new a(this); 
      return new c(this, null);
    }
    
    class a implements l<File> {
      a(c.b this$0) {}
      
      public File get() {
        return c.b.c(this.a).getApplicationContext().getCacheDir();
      }
    }
  }
  
  class a implements l<File> {
    a(c this$0) {}
    
    public File get() {
      return c.b.c(this.a).getApplicationContext().getCacheDir();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/c/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */