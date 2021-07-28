package com.google.firebase.components;

import com.google.firebase.p.b;
import java.util.Set;

abstract class m implements o {
  public <T> T a(Class<T> paramClass) {
    b<T> b = c(paramClass);
    return (T)((b == null) ? null : b.get());
  }
  
  public <T> Set<T> b(Class<T> paramClass) {
    return (Set<T>)d(paramClass).get();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/components/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */