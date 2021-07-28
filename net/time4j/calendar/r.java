package net.time4j.calendar;

import net.time4j.c1.c;
import net.time4j.d1.g;
import net.time4j.d1.k;
import net.time4j.d1.p;
import net.time4j.d1.t;
import net.time4j.d1.z;
import net.time4j.w0;
import net.time4j.y0;

class r<D extends g> implements z<D, w0> {
  private final y0 c;
  
  private final t<D, k<D>> d;
  
  r(y0 paramy0, t<D, k<D>> paramt) {
    this.c = paramy0;
    this.d = paramt;
  }
  
  private static w0 a(long paramLong) {
    return w0.g(c.b(paramLong + 5L, 7) + 1);
  }
  
  public D a(D paramD, w0 paramw0, boolean paramBoolean) {
    if (paramw0 != null) {
      int i = e(paramD).a(this.c);
      int j = paramw0.a(this.c);
      long l = paramD.q() + j - i;
      k k = (k)this.d.a(paramD);
      if (l >= k.b() && l <= k.a())
        return (D)k.a(l); 
      throw new IllegalArgumentException("New day out of supported range.");
    } 
    throw new IllegalArgumentException("Missing weekday.");
  }
  
  public p<?> a(D paramD) {
    return null;
  }
  
  public boolean a(D paramD, w0 paramw0) {
    boolean bool2 = false;
    if (paramw0 == null)
      return false; 
    int i = e(paramD).a(this.c);
    int j = paramw0.a(this.c);
    long l = paramD.q() + j - i;
    k k = (k)this.d.a(paramD);
    boolean bool1 = bool2;
    if (l >= k.b()) {
      bool1 = bool2;
      if (l <= k.a())
        bool1 = true; 
    } 
    return bool1;
  }
  
  public p<?> b(D paramD) {
    return null;
  }
  
  public w0 c(D paramD) {
    k k = (k)this.d.a(paramD);
    int i = e(paramD).a(this.c);
    return (paramD.q() + 7L - i > k.a()) ? a(k.a()) : this.c.e().f(6);
  }
  
  public w0 d(D paramD) {
    k k = (k)this.d.a(paramD);
    int i = e(paramD).a(this.c);
    return (paramD.q() + 1L - i < k.b()) ? a(k.b()) : this.c.e();
  }
  
  public w0 e(D paramD) {
    return a(paramD.q());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/calendar/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */