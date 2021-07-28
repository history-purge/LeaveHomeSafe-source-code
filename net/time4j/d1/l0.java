package net.time4j.d1;

import java.io.Serializable;
import net.time4j.c1.c;

public abstract class l0<U, T extends l0<U, T>> extends q<T> implements Comparable<T>, Serializable {
  private n0<T> a(U paramU) {
    return s().a(paramU);
  }
  
  public abstract int a(T paramT);
  
  public long a(T paramT, U paramU) {
    return a(paramU).a(t(), paramT);
  }
  
  public T a(long paramLong, U paramU) {
    return b(c.b(paramLong), paramU);
  }
  
  public T b(long paramLong, U paramU) {
    if (paramLong == 0L)
      return t(); 
    try {
      return a(paramU).a(t(), paramLong);
    } catch (IllegalArgumentException illegalArgumentException) {
      ArithmeticException arithmeticException = new ArithmeticException("Result beyond boundaries of time axis.");
      arithmeticException.initCause(illegalArgumentException);
      throw arithmeticException;
    } 
  }
  
  protected abstract i0<U, T> s();
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/d1/l0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */