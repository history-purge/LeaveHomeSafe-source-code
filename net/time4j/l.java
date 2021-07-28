package net.time4j;

import java.io.InvalidObjectException;
import java.math.BigDecimal;
import net.time4j.d1.e;

final class l extends e<BigDecimal> implements b1<BigDecimal> {
  private static final long serialVersionUID = -4837430960549551204L;
  
  private final transient BigDecimal c;
  
  l(String paramString, BigDecimal paramBigDecimal) {
    super(paramString);
    this.c = paramBigDecimal;
  }
  
  private Object readResolve() {
    Object object = g0.a(name());
    if (object != null)
      return object; 
    throw new InvalidObjectException(name());
  }
  
  public BigDecimal b() {
    return this.c;
  }
  
  public boolean d() {
    return false;
  }
  
  protected boolean g() {
    return true;
  }
  
  public Class<BigDecimal> getType() {
    return BigDecimal.class;
  }
  
  public BigDecimal q() {
    return BigDecimal.ZERO;
  }
  
  public boolean s() {
    return true;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */