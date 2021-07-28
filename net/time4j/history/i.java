package net.time4j.history;

import net.time4j.d1.e;
import net.time4j.d1.p;
import net.time4j.d1.q;
import net.time4j.d1.r;
import net.time4j.d1.x;
import net.time4j.d1.z;
import net.time4j.f0;

final class i extends e<h> {
  private static final long serialVersionUID = -5386613740709845550L;
  
  private final d history;
  
  i(d paramd) {
    super("HISTORIC_DATE");
    this.history = paramd;
  }
  
  private Object readResolve() {
    return this.history.b();
  }
  
  protected <T extends q<T>> z<T, h> a(x<T> paramx) {
    return paramx.c((p)f0.q) ? new a<T>(this.history) : null;
  }
  
  protected boolean a(e<?> parame) {
    return this.history.equals(((i)parame).history);
  }
  
  public h b() {
    return h.a(j.d, 9999, 12, 31);
  }
  
  public boolean d() {
    return true;
  }
  
  public Class<h> getType() {
    return h.class;
  }
  
  public h q() {
    return h.a(j.c, 45, 1, 1);
  }
  
  public boolean s() {
    return false;
  }
  
  private static class a<C extends q<C>> implements z<C, h> {
    private final d c;
    
    a(d param1d) {
      this.c = param1d;
    }
    
    public p<?> a(C param1C) {
      throw new UnsupportedOperationException("Never called.");
    }
    
    public C a(C param1C, h param1h, boolean param1Boolean) {
      if (param1h != null) {
        f0 f0 = this.c.b(param1h);
        return (C)param1C.b((p)f0.q, f0);
      } 
      throw new IllegalArgumentException("Missing historic date.");
    }
    
    public boolean a(C param1C, h param1h) {
      return this.c.d(param1h);
    }
    
    public p<?> b(C param1C) {
      throw new UnsupportedOperationException("Never called.");
    }
    
    public h c(C param1C) {
      d d1 = this.c;
      if (d1 == d.u) {
        j = j.f;
        int i = 999984973;
        byte b1 = 8;
        return h.a(j, i, b1, 31);
      } 
      d d2 = d.t;
      byte b = 12;
      if (j == d2) {
        j = j.d;
        int i = 999979465;
        return h.a(j, i, b, 31);
      } 
      if (j == d.s) {
        j = j.d;
        int i = 999999999;
        return h.a(j, i, b, 31);
      } 
      j j = j.d;
      char c = '✏';
      return h.a(j, c, b, 31);
    }
    
    public h d(C param1C) {
      d d1 = this.c;
      return (d1 == d.u) ? h.a(j.f, 0, 9, 1) : ((d1 == d.t) ? h.a(j.c, 999979466, 1, 1) : ((d1 == d.s) ? h.a(j.c, 1000000000, 1, 1) : h.a(j.c, 45, 1, 1)));
    }
    
    public h e(C param1C) {
      try {
        return this.c.a((f0)param1C.e((p)f0.q));
      } catch (IllegalArgumentException illegalArgumentException) {
        throw new r(illegalArgumentException.getMessage(), illegalArgumentException);
      } 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/history/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */