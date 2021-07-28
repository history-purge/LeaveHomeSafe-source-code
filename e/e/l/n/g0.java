package e.e.l.n;

import android.net.Uri;
import c.d;
import c.f;
import e.e.c.a.d;
import e.e.e.d.f;
import e.e.e.g.h;
import e.e.e.g.j;
import e.e.l.d.e;
import e.e.l.d.f;
import e.e.l.k.d;
import e.e.l.o.d;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class g0 implements j0<d> {
  private final e a;
  
  private final f b;
  
  private final h c;
  
  private final e.e.e.g.a d;
  
  private final j0<d> e;
  
  public g0(e parame, f paramf, h paramh, e.e.e.g.a parama, j0<d> paramj0) {
    this.a = parame;
    this.b = paramf;
    this.c = paramh;
    this.d = parama;
    this.e = paramj0;
  }
  
  private static Uri a(e.e.l.o.c paramc) {
    return paramc.p().buildUpon().appendQueryParameter("fresco_partial", "true").build();
  }
  
  private d<d, Void> a(k<d> paramk, k0 paramk0, d paramd) {
    String str = paramk0.a();
    return new a(this, paramk0.e(), str, paramk, paramk0, paramd);
  }
  
  static Map<String, String> a(m0 paramm0, String paramString, boolean paramBoolean, int paramInt) {
    if (!paramm0.a(paramString))
      return null; 
    String str = String.valueOf(paramBoolean);
    return paramBoolean ? f.of("cached_value_found", str, "encodedImageSize", String.valueOf(paramInt)) : f.of("cached_value_found", str);
  }
  
  private void a(k<d> paramk, k0 paramk0, d paramd, d paramd1) {
    paramk = new c(paramk, this.a, paramd, this.c, this.d, paramd1, null);
    this.e.a(paramk, paramk0);
  }
  
  private void a(AtomicBoolean paramAtomicBoolean, k0 paramk0) {
    paramk0.a((l0)new b(this, paramAtomicBoolean));
  }
  
  private static boolean b(f<?> paramf) {
    return (paramf.c() || (paramf.e() && paramf.a() instanceof java.util.concurrent.CancellationException));
  }
  
  public void a(k<d> paramk, k0 paramk0) {
    e.e.l.o.c c = paramk0.f();
    if (!c.r()) {
      this.e.a(paramk, paramk0);
      return;
    } 
    paramk0.e().a(paramk0.a(), "PartialDiskCacheProducer");
    Uri uri = a(c);
    d d = this.b.a(c, uri, paramk0.b());
    AtomicBoolean atomicBoolean = new AtomicBoolean(false);
    this.a.a(d, atomicBoolean).a(a(paramk, paramk0, d));
    a(atomicBoolean, paramk0);
  }
  
  class a implements d<d, Void> {
    a(g0 this$0, m0 param1m0, String param1String, k param1k, k0 param1k0, d param1d) {}
    
    public Void a(f<d> param1f) {
      p0 p0;
      e.e.l.o.c c;
      if (g0.a(param1f)) {
        this.a.b(this.b, "PartialDiskCacheProducer", null);
        this.c.a();
        return null;
      } 
      if (param1f.e()) {
        this.a.a(this.b, "PartialDiskCacheProducer", param1f.a(), null);
        g0.a(this.f, this.c, this.d, this.e, null);
        return null;
      } 
      d d1 = (d)param1f.b();
      m0 m01 = this.a;
      String str = this.b;
      if (d1 != null) {
        m01.a(str, "PartialDiskCacheProducer", g0.a(m01, str, true, d1.y()));
        e.e.l.e.a a1 = e.e.l.e.a.b(d1.y() - 1);
        d1.a(a1);
        int i = d1.y();
        c = this.d.f();
        if (a1.a(c.a())) {
          this.a.a(this.b, "PartialDiskCacheProducer", true);
          this.c.a(d1, 9);
          return null;
        } 
        this.c.a(d1, 8);
        d d2 = d.a(c);
        d2.a(e.e.l.e.a.a(i - 1));
        p0 = new p0(d2.a(), this.d);
        g0.a(this.f, this.c, p0, this.e, d1);
        return null;
      } 
      p0.a((String)c, "PartialDiskCacheProducer", g0.a((m0)p0, (String)c, false, 0));
      g0.a(this.f, this.c, this.d, this.e, d1);
      return null;
    }
  }
  
  class b extends e {
    b(g0 this$0, AtomicBoolean param1AtomicBoolean) {}
    
    public void a() {
      this.a.set(true);
    }
  }
  
  private static class c extends n<d, d> {
    private final e c;
    
    private final d d;
    
    private final h e;
    
    private final e.e.e.g.a f;
    
    private final d g;
    
    private c(k<d> param1k, e param1e, d param1d, h param1h, e.e.e.g.a param1a, d param1d1) {
      super(param1k);
      this.c = param1e;
      this.d = param1d;
      this.e = param1h;
      this.f = param1a;
      this.g = param1d1;
    }
    
    private j a(d param1d1, d param1d2) {
      int i = param1d2.y();
      int j = (param1d2.c()).a;
      j j1 = this.e.a(i + j);
      i = (param1d2.c()).a;
      a(param1d1.u(), (OutputStream)j1, i);
      a(param1d2.u(), (OutputStream)j1, param1d2.y());
      return j1;
    }
    
    private void a(j param1j) {
      d d1;
      e.e.e.h.a a1 = e.e.e.h.a.a((Closeable)param1j.a());
      try {
        d1 = new d(a1);
      } finally {
        param1j = null;
      } 
      d.c(d1);
      e.e.e.h.a.b(a1);
      throw param1j;
    }
    
    private void a(InputStream param1InputStream, OutputStream param1OutputStream, int param1Int) {
      byte[] arrayOfByte = (byte[])this.f.get(16384);
      int i = param1Int;
      while (i > 0) {
        try {
          int j = param1InputStream.read(arrayOfByte, 0, Math.min(16384, i));
        } finally {
          this.f.a(arrayOfByte);
        } 
      } 
      this.f.a(arrayOfByte);
      if (i <= 0)
        return; 
      IOException iOException = new IOException(String.format(null, "Failed to read %d bytes - finished %d short", new Object[] { Integer.valueOf(param1Int), Integer.valueOf(i) }));
      throw iOException;
    }
    
    public void a(d param1d, int param1Int) {
      if (b.b(param1Int))
        return; 
      if (this.g != null && param1d.c() != null) {
        try {
          a(a(this.g, param1d));
          param1d.close();
          this.g.close();
        } catch (IOException iOException) {
          e.e.e.e.a.b("PartialDiskCacheProducer", "Error while merging image data", iOException);
          c().a(iOException);
          param1d.close();
          this.g.close();
        } finally {
          Exception exception;
        } 
        this.c.c(this.d);
        return;
      } 
      if (b.b(param1Int, 8) && b.a(param1Int) && param1d.t() != e.e.k.c.b)
        this.c.a(this.d, param1d); 
      c().a((O)param1d, param1Int);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/n/g0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */