package net.time4j.tz.model;

import net.time4j.c1.a;
import net.time4j.e1.c;
import net.time4j.f0;
import net.time4j.g;
import net.time4j.g0;
import net.time4j.j;

public abstract class d {
  private final transient long c;
  
  private final transient g0 d;
  
  private final transient i e;
  
  private final transient int f;
  
  protected d(int paramInt1, i parami, int paramInt2) {
    if (parami != null) {
      if (paramInt2 == Integer.MAX_VALUE || (paramInt2 >= -64800 && paramInt2 <= 64800)) {
        g0 g01;
        if (paramInt1 == 86400) {
          this.c = 0L;
          g01 = g0.G();
        } else {
          j j = g0.H().a(paramInt1, g.e);
          this.c = j.a();
          g01 = j.b();
        } 
        this.d = g01;
        this.e = parami;
        paramInt1 = paramInt2;
        if (paramInt2 == Integer.MAX_VALUE)
          paramInt1 = 0; 
        this.f = paramInt1;
        return;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("DST out of range: ");
      stringBuilder.append(paramInt2);
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
    throw new NullPointerException("Missing offset indicator.");
  }
  
  protected abstract int a(long paramLong);
  
  protected abstract int a(a parama);
  
  protected String a() {
    c c = getClass().<c>getAnnotation(c.class);
    if (c != null)
      return c.value(); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Cannot find calendar type annotation: ");
    stringBuilder.append(getClass());
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public abstract f0 a(int paramInt);
  
  protected final long b() {
    return this.c;
  }
  
  public final i c() {
    return this.e;
  }
  
  public final int d() {
    return this.f;
  }
  
  public final g0 e() {
    return this.d;
  }
  
  int f() {
    return 0;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/tz/model/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */