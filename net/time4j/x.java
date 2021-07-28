package net.time4j;

import java.io.InvalidObjectException;
import net.time4j.d1.p;

final class x extends b<Long> implements j0<Long, g0> {
  static final p<Long> e = new x();
  
  private static final long serialVersionUID = 5930990958663061693L;
  
  private final transient Long c;
  
  private final transient Long d;
  
  private x() {
    this("DAY_OVERFLOW", Long.MIN_VALUE, Long.MAX_VALUE);
  }
  
  private x(String paramString, long paramLong1, long paramLong2) {
    super(paramString);
    this.c = Long.valueOf(paramLong1);
    this.d = Long.valueOf(paramLong2);
    new k0(this, true);
  }
  
  static x a(String paramString, long paramLong1, long paramLong2) {
    return new x(paramString, paramLong1, paramLong2);
  }
  
  private Object readResolve() {
    Object object = g0.a(name());
    if (object == null) {
      if (name().equals("DAY_OVERFLOW"))
        return e; 
      throw new InvalidObjectException(name());
    } 
    return object;
  }
  
  public Long b() {
    return this.d;
  }
  
  public boolean d() {
    return false;
  }
  
  public Class<Long> getType() {
    return Long.class;
  }
  
  public Long q() {
    return this.c;
  }
  
  public boolean s() {
    return true;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */