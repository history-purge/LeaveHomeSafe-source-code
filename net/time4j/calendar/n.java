package net.time4j.calendar;

import java.util.Collections;
import java.util.Map;
import net.time4j.c1.c;
import net.time4j.d1.a0;
import net.time4j.d1.k;
import net.time4j.d1.l;
import net.time4j.d1.p;
import net.time4j.d1.q;
import net.time4j.d1.z;

final class n<T extends q<T>> implements z<T, Integer> {
  private final Map<String, ? extends k<T>> c;
  
  private final p<Integer> d;
  
  n(k<T> paramk, p<Integer> paramp) {
    this.c = Collections.singletonMap("calendrical", paramk);
    this.d = paramp;
  }
  
  private static Integer a(long paramLong) {
    paramLong = c.a(a0.e.a(paramLong, a0.c), 678881L);
    long l = c.a(paramLong, 146097);
    int i = c.b(paramLong, 146097);
    if (i == 146096) {
      paramLong = (l + 1L) * 400L;
    } else {
      int j = i / 36524;
      int k = i % 36524;
      i = k / 1461;
      k %= 1461;
      if (k == 1460) {
        paramLong = l * 400L + (j * 100) + ((i + 1) * 4);
      } else {
        int m = k / 365;
        l = l * 400L + (j * 100) + (i * 4) + m;
        paramLong = l;
        if ((k % 365 + 31) * 5 / 153 + 2 > 12)
          paramLong = l + 1L; 
      } 
    } 
    return Integer.valueOf(c.a(paramLong));
  }
  
  private k<T> f(T paramT) {
    if (paramT instanceof l) {
      paramT = (T)this.c.get(((l)l.class.cast(paramT)).v());
      return (k<T>)paramT;
    } 
    paramT = (T)this.c.get("calendrical");
    return (k<T>)paramT;
  }
  
  public p<?> a(T paramT) {
    return null;
  }
  
  public T a(T paramT, Integer paramInteger, boolean paramBoolean) {
    if (a(paramT, paramInteger))
      return paramT; 
    throw new IllegalArgumentException("The related gregorian year is read-only.");
  }
  
  public boolean a(T paramT, Integer paramInteger) {
    return e(paramT).equals(paramInteger);
  }
  
  public p<?> b(T paramT) {
    return null;
  }
  
  public Integer c(T paramT) {
    k<T> k = f(paramT);
    return a(k.a(((q)k.a(k.a())).a(this.d, 1)));
  }
  
  public Integer d(T paramT) {
    k<T> k = f(paramT);
    return a(k.a(((q)k.a(k.b())).a(this.d, 1)));
  }
  
  public Integer e(T paramT) {
    return a(f(paramT).a(paramT.a(this.d, 1)));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/calendar/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */