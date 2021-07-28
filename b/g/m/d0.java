package b.g.m;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Objects;

public class d0 {
  public static final d0 b = (new a()).a().a().b().c();
  
  private final i a;
  
  private d0(WindowInsets paramWindowInsets) {
    e e;
    int j = Build.VERSION.SDK_INT;
    if (j >= 29) {
      e = new h(this, paramWindowInsets);
    } else {
      g g;
      if (j >= 28) {
        g = new g(this, (WindowInsets)e);
      } else {
        f f;
        if (j >= 21) {
          f = new f(this, (WindowInsets)g);
        } else if (j >= 20) {
          e = new e(this, (WindowInsets)f);
        } else {
          this.a = new i(this);
          return;
        } 
      } 
    } 
    this.a = e;
  }
  
  public d0(d0 paramd0) {
    if (paramd0 != null) {
      i i2 = paramd0.a;
      if (Build.VERSION.SDK_INT >= 29 && i2 instanceof h) {
        i2 = new h(this, (h)i2);
      } else if (Build.VERSION.SDK_INT >= 28 && i2 instanceof g) {
        i2 = new g(this, (g)i2);
      } else if (Build.VERSION.SDK_INT >= 21 && i2 instanceof f) {
        i2 = new f(this, (f)i2);
      } else if (Build.VERSION.SDK_INT >= 20 && i2 instanceof e) {
        i2 = new e(this, (e)i2);
      } else {
        i2 = new i(this);
        this.a = i2;
      } 
      this.a = i2;
      return;
    } 
    i i1 = new i(this);
    this.a = i1;
  }
  
  static b.g.f.b a(b.g.f.b paramb, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int j = Math.max(0, paramb.a - paramInt1);
    int k = Math.max(0, paramb.b - paramInt2);
    int m = Math.max(0, paramb.c - paramInt3);
    int n = Math.max(0, paramb.d - paramInt4);
    return (j == paramInt1 && k == paramInt2 && m == paramInt3 && n == paramInt4) ? paramb : b.g.f.b.a(j, k, m, n);
  }
  
  public static d0 a(WindowInsets paramWindowInsets) {
    androidx.core.util.f.a(paramWindowInsets);
    return new d0(paramWindowInsets);
  }
  
  public d0 a() {
    return this.a.a();
  }
  
  public d0 a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return this.a.a(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public d0 b() {
    return this.a.b();
  }
  
  @Deprecated
  public d0 b(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    a a = new a(this);
    a.b(b.g.f.b.a(paramInt1, paramInt2, paramInt3, paramInt4));
    return a.a();
  }
  
  public d0 c() {
    return this.a.c();
  }
  
  public int d() {
    return (h()).d;
  }
  
  public int e() {
    return (h()).a;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof d0))
      return false; 
    paramObject = paramObject;
    return androidx.core.util.b.a(this.a, ((d0)paramObject).a);
  }
  
  public int f() {
    return (h()).c;
  }
  
  public int g() {
    return (h()).b;
  }
  
  public b.g.f.b h() {
    return this.a.f();
  }
  
  public int hashCode() {
    i i1 = this.a;
    return (i1 == null) ? 0 : i1.hashCode();
  }
  
  public boolean i() {
    return this.a.g();
  }
  
  public WindowInsets j() {
    i i1 = this.a;
    return (i1 instanceof e) ? ((e)i1).b : null;
  }
  
  public static final class a {
    private final d0.d a;
    
    public a() {
      d0.d d1;
      int i = Build.VERSION.SDK_INT;
      if (i >= 29) {
        d1 = new d0.c();
      } else if (i >= 20) {
        d1 = new d0.b();
      } else {
        d1 = new d0.d();
      } 
      this.a = d1;
    }
    
    public a(d0 param1d0) {
      d0.d d1;
      int i = Build.VERSION.SDK_INT;
      if (i >= 29) {
        d1 = new d0.c(param1d0);
      } else {
        d0.b b;
        if (i >= 20) {
          b = new d0.b((d0)d1);
        } else {
          d1 = new d0.d((d0)b);
        } 
      } 
      this.a = d1;
    }
    
    public a a(b.g.f.b param1b) {
      this.a.a(param1b);
      return this;
    }
    
    public d0 a() {
      return this.a.a();
    }
    
    public a b(b.g.f.b param1b) {
      this.a.b(param1b);
      return this;
    }
  }
  
  private static class b extends d {
    private static Field c;
    
    private static boolean d = false;
    
    private static Constructor<WindowInsets> e;
    
    private static boolean f = false;
    
    private WindowInsets b = b();
    
    b() {}
    
    b(d0 param1d0) {}
    
    private static WindowInsets b() {
      if (!d) {
        try {
          c = WindowInsets.class.getDeclaredField("CONSUMED");
        } catch (ReflectiveOperationException reflectiveOperationException) {
          Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", reflectiveOperationException);
        } 
        d = true;
      } 
      Field field = c;
      if (field != null)
        try {
          WindowInsets windowInsets = (WindowInsets)field.get(null);
          if (windowInsets != null)
            return new WindowInsets(windowInsets); 
        } catch (ReflectiveOperationException reflectiveOperationException) {
          Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", reflectiveOperationException);
        }  
      if (!f) {
        try {
          e = WindowInsets.class.getConstructor(new Class[] { Rect.class });
        } catch (ReflectiveOperationException reflectiveOperationException) {
          Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", reflectiveOperationException);
        } 
        f = true;
      } 
      Constructor<WindowInsets> constructor = e;
      if (constructor != null)
        try {
          return constructor.newInstance(new Object[] { new Rect() });
        } catch (ReflectiveOperationException reflectiveOperationException) {
          Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", reflectiveOperationException);
        }  
      return null;
    }
    
    d0 a() {
      return d0.a(this.b);
    }
    
    void b(b.g.f.b param1b) {
      WindowInsets windowInsets = this.b;
      if (windowInsets != null)
        this.b = windowInsets.replaceSystemWindowInsets(param1b.a, param1b.b, param1b.c, param1b.d); 
    }
  }
  
  private static class c extends d {
    final WindowInsets.Builder b;
    
    c() {
      this.b = new WindowInsets.Builder();
    }
    
    c(d0 param1d0) {
      WindowInsets.Builder builder;
      WindowInsets windowInsets = param1d0.j();
      if (windowInsets != null) {
        builder = new WindowInsets.Builder(windowInsets);
      } else {
        builder = new WindowInsets.Builder();
      } 
      this.b = builder;
    }
    
    d0 a() {
      return d0.a(this.b.build());
    }
    
    void a(b.g.f.b param1b) {
      this.b.setStableInsets(param1b.a());
    }
    
    void b(b.g.f.b param1b) {
      this.b.setSystemWindowInsets(param1b.a());
    }
  }
  
  private static class d {
    private final d0 a;
    
    d() {
      this(new d0(null));
    }
    
    d(d0 param1d0) {
      this.a = param1d0;
    }
    
    d0 a() {
      return this.a;
    }
    
    void a(b.g.f.b param1b) {}
    
    void b(b.g.f.b param1b) {}
  }
  
  private static class e extends i {
    final WindowInsets b;
    
    private b.g.f.b c = null;
    
    e(d0 param1d0, WindowInsets param1WindowInsets) {
      super(param1d0);
      this.b = param1WindowInsets;
    }
    
    e(d0 param1d0, e param1e) {
      this(param1d0, new WindowInsets(param1e.b));
    }
    
    d0 a(int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      d0.a a = new d0.a(d0.a(this.b));
      a.b(d0.a(f(), param1Int1, param1Int2, param1Int3, param1Int4));
      a.a(d0.a(e(), param1Int1, param1Int2, param1Int3, param1Int4));
      return a.a();
    }
    
    final b.g.f.b f() {
      if (this.c == null)
        this.c = b.g.f.b.a(this.b.getSystemWindowInsetLeft(), this.b.getSystemWindowInsetTop(), this.b.getSystemWindowInsetRight(), this.b.getSystemWindowInsetBottom()); 
      return this.c;
    }
    
    boolean h() {
      return this.b.isRound();
    }
  }
  
  private static class f extends e {
    private b.g.f.b d = null;
    
    f(d0 param1d0, WindowInsets param1WindowInsets) {
      super(param1d0, param1WindowInsets);
    }
    
    f(d0 param1d0, f param1f) {
      super(param1d0, param1f);
    }
    
    d0 b() {
      return d0.a(this.b.consumeStableInsets());
    }
    
    d0 c() {
      return d0.a(this.b.consumeSystemWindowInsets());
    }
    
    final b.g.f.b e() {
      if (this.d == null)
        this.d = b.g.f.b.a(this.b.getStableInsetLeft(), this.b.getStableInsetTop(), this.b.getStableInsetRight(), this.b.getStableInsetBottom()); 
      return this.d;
    }
    
    boolean g() {
      return this.b.isConsumed();
    }
  }
  
  private static class g extends f {
    g(d0 param1d0, WindowInsets param1WindowInsets) {
      super(param1d0, param1WindowInsets);
    }
    
    g(d0 param1d0, g param1g) {
      super(param1d0, param1g);
    }
    
    d0 a() {
      return d0.a(this.b.consumeDisplayCutout());
    }
    
    c d() {
      return c.a(this.b.getDisplayCutout());
    }
    
    public boolean equals(Object param1Object) {
      if (this == param1Object)
        return true; 
      if (!(param1Object instanceof g))
        return false; 
      param1Object = param1Object;
      return Objects.equals(this.b, ((d0.e)param1Object).b);
    }
    
    public int hashCode() {
      return this.b.hashCode();
    }
  }
  
  private static class h extends g {
    h(d0 param1d0, WindowInsets param1WindowInsets) {
      super(param1d0, param1WindowInsets);
    }
    
    h(d0 param1d0, h param1h) {
      super(param1d0, param1h);
    }
    
    d0 a(int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      return d0.a(this.b.inset(param1Int1, param1Int2, param1Int3, param1Int4));
    }
  }
  
  private static class i {
    final d0 a;
    
    i(d0 param1d0) {
      this.a = param1d0;
    }
    
    d0 a() {
      return this.a;
    }
    
    d0 a(int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      return d0.b;
    }
    
    d0 b() {
      return this.a;
    }
    
    d0 c() {
      return this.a;
    }
    
    c d() {
      return null;
    }
    
    b.g.f.b e() {
      return b.g.f.b.e;
    }
    
    public boolean equals(Object param1Object) {
      if (this == param1Object)
        return true; 
      if (!(param1Object instanceof i))
        return false; 
      param1Object = param1Object;
      return (h() == param1Object.h() && g() == param1Object.g() && androidx.core.util.b.a(f(), param1Object.f()) && androidx.core.util.b.a(e(), param1Object.e()) && androidx.core.util.b.a(d(), param1Object.d()));
    }
    
    b.g.f.b f() {
      return b.g.f.b.e;
    }
    
    boolean g() {
      return false;
    }
    
    boolean h() {
      return false;
    }
    
    public int hashCode() {
      return androidx.core.util.b.a(new Object[] { Boolean.valueOf(h()), Boolean.valueOf(g()), f(), e(), d() });
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/g/m/d0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */