package e.e.f;

import e.e.f.i.a;
import e.e.f.k.b;
import java.security.SecureRandom;

public abstract class b {
  public final b a;
  
  protected b(b paramb, SecureRandom paramSecureRandom) {
    this.a = paramb;
  }
  
  public c a(a parama) {
    return new c(parama, this.a, f.d);
  }
  
  public c b(a parama) {
    return a(parama);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/f/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */