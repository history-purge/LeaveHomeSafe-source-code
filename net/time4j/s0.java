package net.time4j;

import net.time4j.d1.v;

final class s0<T> implements v<T> {
  private final v<T> c;
  
  private s0(v<T> paramv, Object paramObject) {
    this.c = paramv;
  }
  
  static <T> s0 a(v<T> paramv, Object paramObject) {
    return new s0<T>(paramv, paramObject);
  }
  
  public T a(T paramT) {
    return (T)this.c.a(paramT);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/s0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */