package net.time4j.d1;

import net.time4j.c1.c;

public abstract class m<U, D extends m<U, D>> extends l0<U, D> implements g {
  private <T> T a(k<T> paramk, String paramString) {
    long l = q();
    if (paramk.b() <= l && paramk.a() >= l)
      return paramk.a(l); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Cannot transform <");
    stringBuilder.append(l);
    stringBuilder.append("> to: ");
    stringBuilder.append(paramString);
    throw new ArithmeticException(stringBuilder.toString());
  }
  
  private k<D> v() {
    return s().d();
  }
  
  protected int a(g paramg) {
    long l1 = q();
    long l2 = paramg.q();
    return (l1 < l2) ? -1 : ((l1 == l2) ? 0 : 1);
  }
  
  public int a(D paramD) {
    if (s().e() == paramD.s().e())
      return a((g)paramD); 
    throw new ClassCastException("Cannot compare different types of dates, use instance of EpochDays as comparator instead.");
  }
  
  public <T extends l<T>> T a(Class<T> paramClass, String paramString) {
    String str = paramClass.getName();
    x<T> x = x.a(paramClass);
    if (x != null)
      return (T)a(x.a(paramString), str); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Cannot find any chronology for given target type: ");
    stringBuilder.append(str);
    throw new IllegalArgumentException(stringBuilder.toString());
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
  
  public D a(h paramh) {
    return b(h.a(c.b(paramh.a())));
  }
  
  public D b(h paramh) {
    long l = c.a(q(), paramh.a());
    try {
      return v().a(l);
    } catch (IllegalArgumentException illegalArgumentException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Out of range: ");
      stringBuilder.append(l);
      ArithmeticException arithmeticException = new ArithmeticException(stringBuilder.toString());
      arithmeticException.initCause(illegalArgumentException);
      throw arithmeticException;
    } 
  }
  
  public boolean b(g paramg) {
    return (a(paramg) > 0);
  }
  
  public boolean c(g paramg) {
    return (a(paramg) < 0);
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null)
      return false; 
    if (paramObject instanceof m) {
      paramObject = paramObject;
      return (s().e() == paramObject.s().e() && q() == paramObject.q());
    } 
    return false;
  }
  
  public int hashCode() {
    long l = q();
    return (int)(l ^ l >>> 32L);
  }
  
  public long q() {
    return v().a((D)t());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/d1/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */