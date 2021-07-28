package net.time4j;

import java.io.Serializable;
import net.time4j.d1.f;
import net.time4j.d1.n0;
import net.time4j.d1.x;

public final class v0 extends f implements u, Serializable {
  public static final v0 c = new v0();
  
  private static final long serialVersionUID = -4981215347844372171L;
  
  private Object readResolve() {
    return c;
  }
  
  public char a() {
    return 'Y';
  }
  
  protected <T extends net.time4j.d1.q<T>> n0<T> a(x<T> paramx) {
    return paramx.c(f0.p) ? z0.h() : null;
  }
  
  public double b() {
    return f.f.b();
  }
  
  public boolean c() {
    return true;
  }
  
  public String toString() {
    return "WEEK_BASED_YEARS";
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/v0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */