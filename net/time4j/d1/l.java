package net.time4j.d1;

import java.io.Serializable;
import net.time4j.c1.c;

public abstract class l<D extends l<D>> extends q<D> implements g, Comparable<D>, Serializable {
  private <T> T a(k<T> paramk, String paramString) {
    long l1 = q();
    if (paramk.b() <= l1 && paramk.a() >= l1)
      return paramk.a(l1); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Cannot transform <");
    stringBuilder.append(l1);
    stringBuilder.append("> to: ");
    stringBuilder.append(paramString);
    throw new ArithmeticException(stringBuilder.toString());
  }
  
  private k<D> w() {
    return s().a(v());
  }
  
  public int a(D paramD) {
    long l1 = q();
    long l2 = paramD.q();
    return (l1 < l2) ? -1 : ((l1 > l2) ? 1 : v().compareTo(paramD.v()));
  }
  
  public D a(h paramh) {
    long l1 = c.a(q(), paramh.a());
    try {
      return w().a(l1);
    } catch (IllegalArgumentException illegalArgumentException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Out of range: ");
      stringBuilder.append(l1);
      ArithmeticException arithmeticException = new ArithmeticException(stringBuilder.toString());
      arithmeticException.initCause(illegalArgumentException);
      throw arithmeticException;
    } 
  }
  
  public <T extends m<?, T>> T a(Class<T> paramClass) {
    String str = paramClass.getName();
    x<T> x = x.a(paramClass);
    if (x != null)
      return (T)a(x.d(), str); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Cannot find any chronology for given target type: ");
    stringBuilder.append(str);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public abstract boolean equals(Object paramObject);
  
  <V> z<D, V> f(p<V> paramp) {
    return (z<D, V>)((paramp instanceof a0) ? ((a0)a0.class.cast(paramp)).a((k)w()) : super.f(paramp));
  }
  
  public abstract int hashCode();
  
  public long q() {
    return w().a((D)t());
  }
  
  protected abstract j<D> s();
  
  public abstract String v();
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/d1/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */