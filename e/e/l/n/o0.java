package e.e.l.n;

import e.e.e.d.f;
import e.e.e.d.i;
import e.e.e.g.h;
import e.e.e.g.j;
import e.e.e.k.e;
import e.e.k.c;
import e.e.l.e.e;
import e.e.l.e.f;
import e.e.l.k.d;
import e.e.l.o.c;
import e.e.l.q.c;
import e.e.l.q.d;
import e.e.l.q.e;
import java.io.Closeable;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

public class o0 implements j0<d> {
  private final Executor a;
  
  private final h b;
  
  private final j0<d> c;
  
  private final boolean d;
  
  private final d e;
  
  public o0(Executor paramExecutor, h paramh, j0<d> paramj0, boolean paramBoolean, d paramd) {
    i.a(paramExecutor);
    this.a = paramExecutor;
    i.a(paramh);
    this.b = paramh;
    i.a(paramj0);
    this.c = paramj0;
    i.a(paramd);
    this.e = paramd;
    this.d = paramBoolean;
  }
  
  private static boolean a(f paramf, d paramd) {
    return (!paramf.a() && (e.b(paramf, paramd) != 0 || b(paramf, paramd)));
  }
  
  private static e b(c paramc, d paramd, c paramc1) {
    if (paramd == null || paramd.t() == c.b)
      return e.e; 
    if (!paramc1.a(paramd.t()))
      return e.d; 
    if (a(paramc.n(), paramd) || paramc1.a(paramd, paramc.n(), paramc.l())) {
      boolean bool1 = true;
      return e.a(bool1);
    } 
    boolean bool = false;
    return e.a(bool);
  }
  
  private static boolean b(f paramf, d paramd) {
    if (!paramf.c() || paramf.a()) {
      paramd.d(0);
      return false;
    } 
    return e.a.contains(Integer.valueOf(paramd.e()));
  }
  
  public void a(k<d> paramk, k0 paramk0) {
    this.c.a(new a(this, paramk, paramk0, this.d, this.e), paramk0);
  }
  
  private class a extends n<d, d> {
    private final boolean c;
    
    private final d d;
    
    private final k0 e;
    
    private boolean f = false;
    
    private final u g;
    
    a(o0 this$0, k<d> param1k, k0 param1k0, boolean param1Boolean, d param1d) {
      super(param1k);
      this.e = param1k0;
      Boolean bool = this.e.f().m();
      if (bool != null)
        param1Boolean = bool.booleanValue(); 
      this.c = param1Boolean;
      this.d = param1d;
      a a1 = new a(this, this$0);
      this.g = new u(o0.a(this$0), a1, 100);
      this.e.a(new b(this, this$0, param1k));
    }
    
    private d a(d param1d) {
      f f = this.e.f().n();
      d d1 = param1d;
      if (!f.d()) {
        d1 = param1d;
        if (f.c())
          d1 = b(param1d, f.b()); 
      } 
      return d1;
    }
    
    private Map<String, String> a(d param1d, e param1e, e.e.l.q.b param1b, String param1String) {
      String str1;
      if (!this.e.e().a(this.e.a()))
        return null; 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(param1d.z());
      stringBuilder.append("x");
      stringBuilder.append(param1d.r());
      String str2 = stringBuilder.toString();
      if (param1e != null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(param1e.a);
        stringBuilder1.append("x");
        stringBuilder1.append(param1e.b);
        str1 = stringBuilder1.toString();
      } else {
        str1 = "Unspecified";
      } 
      HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
      hashMap.put("Image format", String.valueOf(param1d.t()));
      hashMap.put("Original size", str2);
      hashMap.put("Requested size", str1);
      hashMap.put("queueTime", String.valueOf(this.g.b()));
      hashMap.put("Transcoder id", param1String);
      hashMap.put("Transcoding result", String.valueOf(param1b));
      return (Map<String, String>)f.a(hashMap);
    }
    
    private void a(d param1d, int param1Int, c param1c) {
      if (param1c == e.e.k.b.a || param1c == e.e.k.b.k) {
        param1d = b(param1d);
      } else {
        param1d = a(param1d);
      } 
      c().a((O)param1d, param1Int);
    }
    
    private void a(d param1d, int param1Int, c param1c) {
      this.e.e().a(this.e.a(), "ResizeAndRotateProducer");
      c c1 = this.e.f();
      j j = o0.b(this.h).a();
      Map<String, String> map2 = null;
      Map<String, String> map1 = map2;
      int i = param1Int;
      try {
        e.e.l.q.b b = param1c.a(param1d, (OutputStream)j, c1.n(), c1.l(), null, Integer.valueOf(85));
        map1 = map2;
        i = param1Int;
        if (b.a() != 2) {
          map1 = map2;
          i = param1Int;
          Map<String, String> map = a(param1d, c1.l(), b, param1c.a());
          map1 = map;
          i = param1Int;
          e.e.e.h.a a1 = e.e.e.h.a.a((Closeable)j.a());
          int k = param1Int;
          try {
          
          } finally {
            map1 = map;
            i = k;
            e.e.e.h.a.b(a1);
            map1 = map;
            i = k;
          } 
        } 
        map1 = map2;
        i = param1Int;
        throw new RuntimeException("Error while transcoding the image");
      } catch (Exception exception) {
        this.e.e().a(this.e.a(), "ResizeAndRotateProducer", exception, map1);
        if (b.a(i))
          c().a(exception); 
        j.close();
        return;
      } finally {}
      j.close();
      throw param1d;
    }
    
    private d b(d param1d) {
      d d1 = param1d;
      if (!this.e.f().n().a()) {
        d1 = param1d;
        if (param1d.v() != 0) {
          d1 = param1d;
          if (param1d.v() != -1)
            d1 = b(param1d, 0); 
        } 
      } 
      return d1;
    }
    
    private d b(d param1d, int param1Int) {
      d d1 = d.b(param1d);
      param1d.close();
      if (d1 != null)
        d1.f(param1Int); 
      return d1;
    }
    
    protected void a(d param1d, int param1Int) {
      if (this.f)
        return; 
      boolean bool = b.a(param1Int);
      if (param1d == null) {
        if (bool)
          c().a(null, 1); 
        return;
      } 
      c c = param1d.t();
      c c1 = this.e.f();
      c c2 = this.d.createImageTranscoder(c, this.c);
      i.a(c2);
      e e = o0.a(c1, param1d, c2);
      if (!bool && e == e.e)
        return; 
      if (e != e.c) {
        a(param1d, param1Int, c);
        return;
      } 
      if (!this.g.a(param1d, param1Int))
        return; 
      if (bool || this.e.g())
        this.g.c(); 
    }
    
    class a implements u.d {
      a(o0.a this$0, o0 param2o0) {}
      
      public void a(d param2d, int param2Int) {
        o0.a a1 = this.a;
        c c = o0.a.b(a1).createImageTranscoder(param2d.t(), o0.a.a(this.a));
        i.a(c);
        o0.a.a(a1, param2d, param2Int, c);
      }
    }
    
    class b extends e {
      b(o0.a this$0, o0 param2o0, k param2k) {}
      
      public void a() {
        o0.a.d(this.b).a();
        o0.a.a(this.b, true);
        this.a.a();
      }
      
      public void b() {
        if (o0.a.c(this.b).g())
          o0.a.d(this.b).c(); 
      }
    }
  }
  
  class a implements u.d {
    a(o0 this$0, o0 param1o0) {}
    
    public void a(d param1d, int param1Int) {
      o0.a a1 = this.a;
      c c = o0.a.b(a1).createImageTranscoder(param1d.t(), o0.a.a(this.a));
      i.a(c);
      o0.a.a(a1, param1d, param1Int, c);
    }
  }
  
  class b extends e {
    b(o0 this$0, o0 param1o0, k param1k) {}
    
    public void a() {
      o0.a.d(this.b).a();
      o0.a.a(this.b, true);
      this.a.a();
    }
    
    public void b() {
      if (o0.a.c(this.b).g())
        o0.a.d(this.b).c(); 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/n/o0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */