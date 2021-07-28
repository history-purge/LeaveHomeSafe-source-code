package e.f.a.c.i;

import e.f.a.c.b;
import e.f.a.c.e;
import e.f.a.c.f;
import e.f.a.c.g;
import java.util.Set;

final class o implements g {
  private final Set<b> a;
  
  private final n b;
  
  private final q c;
  
  o(Set<b> paramSet, n paramn, q paramq) {
    this.a = paramSet;
    this.b = paramn;
    this.c = paramq;
  }
  
  public <T> f<T> a(String paramString, Class<T> paramClass, b paramb, e<T, byte[]> parame) {
    if (this.a.contains(paramb))
      return new p<T>(this.b, paramString, paramb, parame, this.c); 
    throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", new Object[] { paramb, this.a }));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/c/i/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */