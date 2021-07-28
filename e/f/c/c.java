package e.f.c;

import e.f.c.s.a;
import e.f.c.s.b;

public final class c {
  private final b a;
  
  private b b;
  
  public c(b paramb) {
    if (paramb != null) {
      this.a = paramb;
      return;
    } 
    throw new IllegalArgumentException("Binarizer must be non-null.");
  }
  
  public a a(int paramInt, a parama) {
    return this.a.a(paramInt, parama);
  }
  
  public b a() {
    if (this.b == null)
      this.b = this.a.a(); 
    return this.b;
  }
  
  public int b() {
    return this.a.b();
  }
  
  public int c() {
    return this.a.d();
  }
  
  public boolean d() {
    return this.a.c().e();
  }
  
  public c e() {
    h h = this.a.c().f();
    return new c(this.a.a(h));
  }
  
  public String toString() {
    try {
      return a().toString();
    } catch (j j) {
      return "";
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */