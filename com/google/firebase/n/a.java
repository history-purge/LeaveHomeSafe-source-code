package com.google.firebase.n;

import com.google.firebase.components.d0;

public class a<T> {
  private final Class<T> a;
  
  private final T b;
  
  public a(Class<T> paramClass, T paramT) {
    d0.a(paramClass);
    this.a = paramClass;
    d0.a(paramT);
    this.b = paramT;
  }
  
  public Class<T> a() {
    return this.a;
  }
  
  public String toString() {
    return String.format("Event{type: %s, payload: %s}", new Object[] { this.a, this.b });
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/n/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */