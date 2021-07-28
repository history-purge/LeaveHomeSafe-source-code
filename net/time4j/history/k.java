package net.time4j.history;

import java.text.ParsePosition;
import java.util.Locale;
import net.time4j.d1.d;
import net.time4j.d1.e;
import net.time4j.d1.o;
import net.time4j.d1.p;
import net.time4j.d1.q;
import net.time4j.d1.r;
import net.time4j.d1.x;
import net.time4j.d1.z;
import net.time4j.e1.b;
import net.time4j.e1.d;
import net.time4j.e1.t;
import net.time4j.e1.u;
import net.time4j.e1.w;
import net.time4j.f0;
import net.time4j.history.q.a;

final class k extends d<j> implements u<j> {
  private static final Locale c = new Locale("la");
  
  private static final long serialVersionUID = 5200533417265981438L;
  
  private final d history;
  
  k(d paramd) {
    super("ERA");
    this.history = paramd;
  }
  
  private t a(d paramd) {
    b b1;
    w w = (w)paramd.a(net.time4j.e1.a.g, w.c);
    boolean bool = ((Boolean)paramd.a(a.c, Boolean.FALSE)).booleanValue();
    String str = "w";
    if (bool) {
      b1 = b.a("historic", c);
      if (w != w.c)
        str = "a"; 
      return b1.a((p)this, new String[] { str });
    } 
    b b2 = b.a((Locale)b1.a(net.time4j.e1.a.c, Locale.ROOT));
    if (((Boolean)b1.a(a.b, Boolean.FALSE)).booleanValue()) {
      if (w != w.c)
        str = "a"; 
      return b2.a((p)this, new String[] { str, "alt" });
    } 
    return b2.a(w);
  }
  
  private Object readResolve() {
    return this.history.e();
  }
  
  public char a() {
    return 'G';
  }
  
  protected <T extends q<T>> z<T, j> a(x<T> paramx) {
    return paramx.c((p)f0.q) ? new a<T>(this.history) : null;
  }
  
  public j a(CharSequence paramCharSequence, ParsePosition paramParsePosition, d paramd) {
    return (j)a(paramd).a(paramCharSequence, paramParsePosition, getType(), paramd);
  }
  
  public void a(o paramo, Appendable paramAppendable, d paramd) {
    paramAppendable.append(a(paramd).a((Enum)paramo.e((p)this)));
  }
  
  protected boolean a(e<?> parame) {
    return this.history.equals(((k)parame).history);
  }
  
  public j b() {
    return j.d;
  }
  
  public boolean d() {
    return true;
  }
  
  public Class<j> getType() {
    return j.class;
  }
  
  public j q() {
    return j.c;
  }
  
  public boolean s() {
    return false;
  }
  
  private static class a<C extends q<C>> implements z<C, j> {
    private final d c;
    
    a(d param1d) {
      this.c = param1d;
    }
    
    public p<?> a(C param1C) {
      throw new UnsupportedOperationException("Never called.");
    }
    
    public C a(C param1C, j param1j, boolean param1Boolean) {
      if (param1j != null) {
        if (this.c.a((f0)param1C.e((p)f0.q)).b() == param1j)
          return param1C; 
        throw new IllegalArgumentException(param1j.name());
      } 
      throw new IllegalArgumentException("Missing era value.");
    }
    
    public boolean a(C param1C, j param1j) {
      boolean bool = false;
      if (param1j == null)
        return false; 
      try {
        j j1 = this.c.a((f0)param1C.e((p)f0.q)).b();
        if (j1 == param1j)
          bool = true; 
        return bool;
      } catch (IllegalArgumentException illegalArgumentException) {
        return false;
      } 
    }
    
    public p<?> b(C param1C) {
      throw new UnsupportedOperationException("Never called.");
    }
    
    public j c(C param1C) {
      j j2 = e(param1C);
      j j1 = j2;
      if (j2 == j.c)
        j1 = j.d; 
      return j1;
    }
    
    public j d(C param1C) {
      j j2 = e(param1C);
      j j1 = j2;
      if (j2 == j.d)
        j1 = j.c; 
      return j1;
    }
    
    public j e(C param1C) {
      try {
        return this.c.a((f0)param1C.e((p)f0.q)).b();
      } catch (IllegalArgumentException illegalArgumentException) {
        throw new r(illegalArgumentException.getMessage(), illegalArgumentException);
      } 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/history/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */