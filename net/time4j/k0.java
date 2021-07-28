package net.time4j;

import java.math.BigDecimal;
import java.math.RoundingMode;
import net.time4j.d1.p;
import net.time4j.d1.q;
import net.time4j.d1.t;

final class k0 implements t<q<?>, BigDecimal> {
  private final p<? extends Number> a;
  
  private final boolean b;
  
  k0(p<? extends Number> paramp, boolean paramBoolean) {
    this.a = paramp;
    this.b = paramBoolean;
  }
  
  public BigDecimal a(q<?> paramq) {
    long l3 = ((Number)paramq.e(this.a)).longValue();
    long l4 = ((Number)paramq.d(this.a)).longValue();
    long l1 = ((Number)paramq.b(this.a)).longValue();
    long l2 = l3;
    if (l3 > l1)
      l2 = l1; 
    if (l2 == l4)
      return BigDecimal.ZERO; 
    l3 = l1;
    if (this.b) {
      l3 = l1;
      if (paramq instanceof g0) {
        l3 = l1;
        if (!((g0)g0.class.cast(paramq)).g(this.a)) {
          if (l2 == l1)
            return BigDecimal.ONE; 
          l3 = l1 - 1L;
        } 
      } 
    } 
    return (new BigDecimal(l2 - l4)).setScale(15).divide(new BigDecimal(l3 - l4 + 1L), RoundingMode.HALF_UP).stripTrailingZeros();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/k0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */