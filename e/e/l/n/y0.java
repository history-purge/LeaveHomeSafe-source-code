package e.e.l.n;

import com.facebook.imagepipeline.nativecode.e;
import com.facebook.imagepipeline.nativecode.f;
import e.e.e.d.i;
import e.e.e.g.h;
import e.e.e.g.j;
import e.e.e.k.e;
import e.e.k.c;
import e.e.k.d;
import e.e.l.k.d;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Executor;

public class y0 implements j0<d> {
  private final Executor a;
  
  private final h b;
  
  private final j0<d> c;
  
  public y0(Executor paramExecutor, h paramh, j0<d> paramj0) {
    i.a(paramExecutor);
    this.a = paramExecutor;
    i.a(paramh);
    this.b = paramh;
    i.a(paramj0);
    this.c = paramj0;
  }
  
  private void a(d paramd, k<d> paramk, k0 paramk0) {
    i.a(paramd);
    paramd = d.b(paramd);
    a a = new a(this, paramk, paramk0.e(), "WebpTranscodeProducer", paramk0.a(), paramd);
    this.a.execute((Runnable)a);
  }
  
  private static e b(d paramd) {
    i.a(paramd);
    c c = d.c(paramd.u());
    if (e.e.k.b.a(c)) {
      e e = f.a();
      return (e == null) ? e.d : e.a(e.a(c) ^ true);
    } 
    return (c == c.b) ? e.e : e.d;
  }
  
  private static void b(d paramd, j paramj) {
    c c1;
    InputStream inputStream = paramd.u();
    c c2 = d.c(inputStream);
    if (c2 == e.e.k.b.f || c2 == e.e.k.b.h) {
      f.a().a(inputStream, (OutputStream)paramj, 80);
      c1 = e.e.k.b.a;
    } else if (c2 == e.e.k.b.g || c2 == e.e.k.b.i) {
      f.a().a(inputStream, (OutputStream)c1);
      c1 = e.e.k.b.b;
    } else {
      throw new IllegalArgumentException("Wrong image format");
    } 
    paramd.a(c1);
  }
  
  public void a(k<d> paramk, k0 paramk0) {
    this.c.a(new b(this, paramk, paramk0), paramk0);
  }
  
  class a extends q0<d> {
    a(y0 this$0, k<d> param1k, m0 param1m0, String param1String1, String param1String2, d param1d) {
      super(param1k, param1m0, param1String1, param1String2);
    }
    
    protected void a(d param1d) {
      d.c(param1d);
    }
    
    protected void a(Exception param1Exception) {
      d.c(this.h);
      super.a(param1Exception);
    }
    
    protected d b() {
      j j = y0.a(this.i).a();
      try {
        y0.a(this.h, j);
        e.e.e.h.a a1 = e.e.e.h.a.a((Closeable)j.a());
      } finally {
        j.close();
      } 
    }
    
    protected void b(d param1d) {
      d.c(this.h);
      super.b(param1d);
    }
    
    protected void c() {
      d.c(this.h);
      super.c();
    }
  }
  
  private class b extends n<d, d> {
    private final k0 c;
    
    private e d;
    
    public b(y0 this$0, k<d> param1k, k0 param1k0) {
      super(param1k);
      this.c = param1k0;
      this.d = e.e;
    }
    
    protected void a(d param1d, int param1Int) {
      if (this.d == e.e && param1d != null)
        this.d = y0.a(param1d); 
      if (this.d == e.d) {
        c().a((O)param1d, param1Int);
        return;
      } 
      if (b.a(param1Int)) {
        if (this.d == e.c && param1d != null) {
          y0.a(this.e, param1d, c(), this.c);
          return;
        } 
        c().a((O)param1d, param1Int);
      } 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/n/y0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */