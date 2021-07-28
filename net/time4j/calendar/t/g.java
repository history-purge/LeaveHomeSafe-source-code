package net.time4j.calendar.t;

import net.time4j.d1.o;
import net.time4j.d1.p;
import net.time4j.d1.q;
import net.time4j.w0;
import net.time4j.y0;

public final class g<T extends q<T>> extends e<w0, T> {
  private static final long serialVersionUID = -84764920511581480L;
  
  private final transient y0 f;
  
  public g(Class<T> paramClass, y0 paramy0) {
    super("DAY_OF_WEEK", paramClass, w0.class, 'E');
    this.f = paramy0;
  }
  
  public int a(o paramo1, o paramo2) {
    int i = ((w0)paramo1.e((p)this)).a(this.f);
    int j = ((w0)paramo2.e((p)this)).a(this.f);
    return (i < j) ? -1 : ((i == j) ? 0 : 1);
  }
  
  public int a(w0 paramw0) {
    return paramw0.a(this.f);
  }
  
  public w0 b() {
    return this.f.e().f(6);
  }
  
  public w0 q() {
    return this.f.e();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/calendar/t/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */