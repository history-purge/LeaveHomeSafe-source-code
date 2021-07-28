package com.google.firebase.components;

import com.google.firebase.n.c;
import com.google.firebase.p.b;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

final class e0 extends m {
  private final Set<Class<?>> a;
  
  private final Set<Class<?>> b;
  
  private final Set<Class<?>> c;
  
  private final Set<Class<?>> d;
  
  private final Set<Class<?>> e;
  
  private final o f;
  
  e0(n<?> paramn, o paramo) {
    HashSet<Class<?>> hashSet1 = new HashSet();
    HashSet<Class<?>> hashSet2 = new HashSet();
    HashSet<Class<?>> hashSet3 = new HashSet();
    HashSet<Class<?>> hashSet4 = new HashSet();
    HashSet<Class<?>> hashSet5 = new HashSet();
    for (u u : paramn.a()) {
      if (u.c()) {
        boolean bool1 = u.e();
        clazz = u.a();
        if (bool1) {
          hashSet4.add(clazz);
          continue;
        } 
        hashSet1.add(clazz);
        continue;
      } 
      if (clazz.b()) {
        hashSet3.add(clazz.a());
        continue;
      } 
      boolean bool = clazz.e();
      Class<?> clazz = clazz.a();
      if (bool) {
        hashSet5.add(clazz);
        continue;
      } 
      hashSet2.add(clazz);
    } 
    if (!paramn.d().isEmpty())
      hashSet1.add(c.class); 
    this.a = Collections.unmodifiableSet(hashSet1);
    this.b = Collections.unmodifiableSet(hashSet2);
    Collections.unmodifiableSet(hashSet3);
    this.c = Collections.unmodifiableSet(hashSet4);
    this.d = Collections.unmodifiableSet(hashSet5);
    this.e = paramn.d();
    this.f = paramo;
  }
  
  public <T> T a(Class<T> paramClass) {
    if (this.a.contains(paramClass)) {
      T t = (T)this.f.a((Class)paramClass);
      return (T)(!paramClass.equals(c.class) ? (Object)t : new a(this.e, (c)t));
    } 
    throw new w(String.format("Attempting to request an undeclared dependency %s.", new Object[] { paramClass }));
  }
  
  public <T> Set<T> b(Class<T> paramClass) {
    if (this.c.contains(paramClass))
      return this.f.b(paramClass); 
    throw new w(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[] { paramClass }));
  }
  
  public <T> b<T> c(Class<T> paramClass) {
    if (this.b.contains(paramClass))
      return this.f.c(paramClass); 
    throw new w(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[] { paramClass }));
  }
  
  public <T> b<Set<T>> d(Class<T> paramClass) {
    if (this.d.contains(paramClass))
      return this.f.d(paramClass); 
    throw new w(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", new Object[] { paramClass }));
  }
  
  private static class a implements c {
    private final Set<Class<?>> a;
    
    private final c b;
    
    public a(Set<Class<?>> param1Set, c param1c) {
      this.a = param1Set;
      this.b = param1c;
    }
    
    public void a(com.google.firebase.n.a<?> param1a) {
      if (this.a.contains(param1a.a())) {
        this.b.a(param1a);
        return;
      } 
      throw new w(String.format("Attempting to publish an undeclared event %s.", new Object[] { param1a }));
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/components/e0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */