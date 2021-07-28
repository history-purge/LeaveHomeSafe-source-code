package net.time4j.d1;

import net.time4j.c1.c;

public enum a0 implements p<Long> {
  c(2441317),
  d(2440587),
  e(2400000),
  f(2415019),
  g(2305812),
  h(1721424),
  i(-1),
  j(2299159);
  
  private final int offset;
  
  a0(int paramInt1) {
    this.offset = paramInt1 - 2440587 - 730;
  }
  
  public char a() {
    return (this == e) ? 'g' : Character.MIN_VALUE;
  }
  
  public int a(o paramo1, o paramo2) {
    return ((Long)paramo1.<Long>e(this)).compareTo(paramo2.<Long>e(this));
  }
  
  public long a(long paramLong, a0 parama0) {
    try {
      return c.a(paramLong, (parama0.offset - this.offset));
    } catch (ArithmeticException arithmeticException) {
      throw new IllegalArgumentException(arithmeticException);
    } 
  }
  
  <D extends q<D>> z<D, Long> a(k<D> paramk) {
    return new a<D>(this, paramk);
  }
  
  public Long b() {
    return Long.valueOf(365241779741L - this.offset);
  }
  
  public boolean c() {
    return false;
  }
  
  public boolean d() {
    return true;
  }
  
  public Class<Long> getType() {
    return Long.class;
  }
  
  public Long q() {
    return Long.valueOf(-365243219892L - this.offset);
  }
  
  public boolean s() {
    return false;
  }
  
  private static class a<D extends q<D>> implements z<D, Long> {
    private final a0 c;
    
    private final k<D> d;
    
    a(a0 param1a0, k<D> param1k) {
      this.c = param1a0;
      this.d = param1k;
    }
    
    public p<?> a(D param1D) {
      return null;
    }
    
    public D a(D param1D, Long param1Long, boolean param1Boolean) {
      if (param1Long != null) {
        long l = c.c(a0.d.a(param1Long.longValue(), this.c), 730L);
        return this.d.a(l);
      } 
      throw new IllegalArgumentException("Missing epoch day value.");
    }
    
    public boolean a(D param1D, Long param1Long) {
      boolean bool = false;
      if (param1Long == null)
        return false; 
      try {
        long l = c.c(a0.d.a(param1Long.longValue(), this.c), 730L);
        boolean bool1 = bool;
        if (l <= this.d.a()) {
          long l1 = this.d.b();
          bool1 = bool;
          if (l >= l1)
            bool1 = true; 
        } 
        return bool1;
      } catch (ArithmeticException|IllegalArgumentException arithmeticException) {
        return false;
      } 
    }
    
    public p<?> b(D param1D) {
      return null;
    }
    
    public Long c(D param1D) {
      return Long.valueOf(this.c.a(this.d.a() + 730L, a0.d));
    }
    
    public Long d(D param1D) {
      return Long.valueOf(this.c.a(this.d.b() + 730L, a0.d));
    }
    
    public Long e(D param1D) {
      return Long.valueOf(this.c.a(this.d.a(param1D) + 730L, a0.d));
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/d1/a0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */