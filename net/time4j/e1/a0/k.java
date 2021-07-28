package net.time4j.e1.a0;

import java.math.BigDecimal;
import net.time4j.d1.o;
import net.time4j.d1.p;

enum k implements p<BigDecimal> {
  c;
  
  public char a() {
    return Character.MIN_VALUE;
  }
  
  public int a(o paramo1, o paramo2) {
    return ((BigDecimal)paramo1.e(this)).compareTo((BigDecimal)paramo2.e(this));
  }
  
  public BigDecimal b() {
    return BigDecimal.ONE;
  }
  
  public boolean c() {
    return false;
  }
  
  public boolean d() {
    return false;
  }
  
  public Class<BigDecimal> getType() {
    return BigDecimal.class;
  }
  
  public BigDecimal q() {
    return BigDecimal.ZERO;
  }
  
  public boolean s() {
    return false;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/e1/a0/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */