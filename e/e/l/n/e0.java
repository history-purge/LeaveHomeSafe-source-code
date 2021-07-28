package e.e.l.n;

import android.os.SystemClock;
import e.e.e.g.h;
import e.e.e.g.j;
import e.e.l.k.d;
import e.e.l.p.b;
import java.io.Closeable;
import java.io.InputStream;
import java.util.Map;

public class e0 implements j0<d> {
  private final h a;
  
  private final e.e.e.g.a b;
  
  private final f0 c;
  
  public e0(h paramh, e.e.e.g.a parama, f0 paramf0) {
    this.a = paramh;
    this.b = parama;
    this.c = paramf0;
  }
  
  protected static float a(int paramInt1, int paramInt2) {
    if (paramInt2 > 0)
      return paramInt1 / paramInt2; 
    double d = -paramInt1;
    Double.isNaN(d);
    return 1.0F - (float)Math.exp(d / 50000.0D);
  }
  
  private Map<String, String> a(s params, int paramInt) {
    return !params.e().a(params.c()) ? null : this.c.b(params, paramInt);
  }
  
  protected static void a(j paramj, int paramInt, e.e.l.e.a parama, k<d> paramk) {
    e.e.e.h.a a1 = e.e.e.h.a.a((Closeable)paramj.a());
    try {
      d d = new d(a1);
    } finally {
      parama = null;
    } 
    d.c((d)paramj);
    e.e.e.h.a.b(a1);
    throw parama;
  }
  
  private void a(s params) {
    params.e().b(params.c(), "NetworkFetchProducer", null);
    params.a().a();
  }
  
  private void a(s params, Throwable paramThrowable) {
    params.e().a(params.c(), "NetworkFetchProducer", paramThrowable, null);
    params.e().a(params.c(), "NetworkFetchProducer", false);
    params.a().a(paramThrowable);
  }
  
  private boolean b(s params) {
    return !params.b().g() ? false : this.c.a(params);
  }
  
  protected void a(j paramj, s params) {
    Map<String, String> map = a(params, paramj.size());
    m0 m0 = params.e();
    m0.a(params.c(), "NetworkFetchProducer", map);
    m0.a(params.c(), "NetworkFetchProducer", true);
    a(paramj, params.f() | 0x1, params.g(), params.a());
  }
  
  public void a(k<d> paramk, k0 paramk0) {
    paramk0.e().a(paramk0.a(), "NetworkFetchProducer");
    paramk = this.c.a(paramk, paramk0);
    this.c.a(paramk, new a(this, (s)paramk));
  }
  
  protected void a(s params, InputStream paramInputStream, int paramInt) {
    j j;
    h h1 = this.a;
    if (paramInt > 0) {
      j = h1.a(paramInt);
    } else {
      j = j.a();
    } 
    byte[] arrayOfByte = (byte[])this.b.get(16384);
    try {
      while (true) {
        int i = paramInputStream.read(arrayOfByte);
        if (i >= 0) {
          if (i > 0) {
            j.write(arrayOfByte, 0, i);
            b(j, params);
            float f = a(j.size(), paramInt);
            params.a().a(f);
          } 
          continue;
        } 
        this.c.a(params, j.size());
        a(j, params);
        return;
      } 
    } finally {
      this.b.a(arrayOfByte);
      j.close();
    } 
  }
  
  protected void b(j paramj, s params) {
    long l = SystemClock.uptimeMillis();
    if (b(params) && l - params.d() >= 100L) {
      params.a(l);
      params.e().a(params.c(), "NetworkFetchProducer", "intermediate_result");
      a(paramj, params.f(), params.g(), params.a());
    } 
  }
  
  class a implements f0.a {
    a(e0 this$0, s param1s) {}
    
    public void a() {
      e0.a(this.b, this.a);
    }
    
    public void a(InputStream param1InputStream, int param1Int) {
      if (b.c())
        b.a("NetworkFetcher->onResponse"); 
      this.b.a(this.a, param1InputStream, param1Int);
      if (b.c())
        b.a(); 
    }
    
    public void a(Throwable param1Throwable) {
      e0.a(this.b, this.a, param1Throwable);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/n/e0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */