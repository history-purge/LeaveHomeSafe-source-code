package com.google.firebase.components;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class n<T> {
  private final Set<Class<? super T>> a;
  
  private final Set<u> b;
  
  private final int c;
  
  private final int d;
  
  private final q<T> e;
  
  private final Set<Class<?>> f;
  
  private n(Set<Class<? super T>> paramSet, Set<u> paramSet1, int paramInt1, int paramInt2, q<T> paramq, Set<Class<?>> paramSet2) {
    this.a = Collections.unmodifiableSet(paramSet);
    this.b = Collections.unmodifiableSet(paramSet1);
    this.c = paramInt1;
    this.d = paramInt2;
    this.e = paramq;
    this.f = Collections.unmodifiableSet(paramSet2);
  }
  
  public static <T> b<T> a(Class<T> paramClass) {
    return new b<T>(paramClass, new Class[0], null);
  }
  
  @SafeVarargs
  public static <T> b<T> a(Class<T> paramClass, Class<? super T>... paramVarArgs) {
    return new b<T>(paramClass, (Class[])paramVarArgs, null);
  }
  
  public static <T> n<T> a(T paramT, Class<T> paramClass) {
    b<T> b = b(paramClass);
    b.a(new b(paramT));
    return b.b();
  }
  
  @SafeVarargs
  public static <T> n<T> a(T paramT, Class<T> paramClass, Class<? super T>... paramVarArgs) {
    b<T> b = a(paramClass, paramVarArgs);
    b.a(new a(paramT));
    return b.b();
  }
  
  public static <T> b<T> b(Class<T> paramClass) {
    b<T> b = a(paramClass);
    b.a(b);
    return b;
  }
  
  public Set<u> a() {
    return this.b;
  }
  
  public q<T> b() {
    return this.e;
  }
  
  public Set<Class<? super T>> c() {
    return this.a;
  }
  
  public Set<Class<?>> d() {
    return this.f;
  }
  
  public boolean e() {
    return (this.c == 1);
  }
  
  public boolean f() {
    return (this.c == 2);
  }
  
  public boolean g() {
    return (this.d == 0);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder("Component<");
    stringBuilder.append(Arrays.toString(this.a.toArray()));
    stringBuilder.append(">{");
    stringBuilder.append(this.c);
    stringBuilder.append(", type=");
    stringBuilder.append(this.d);
    stringBuilder.append(", deps=");
    stringBuilder.append(Arrays.toString(this.b.toArray()));
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
  
  public static class b<T> {
    private final Set<Class<? super T>> a = new HashSet<Class<? super T>>();
    
    private final Set<u> b = new HashSet<u>();
    
    private int c;
    
    private int d;
    
    private q<T> e;
    
    private Set<Class<?>> f;
    
    @SafeVarargs
    private b(Class<T> param1Class, Class<? super T>... param1VarArgs) {
      int i = 0;
      this.c = 0;
      this.d = 0;
      this.f = new HashSet<Class<?>>();
      d0.a(param1Class, "Null interface");
      this.a.add(param1Class);
      int j = param1VarArgs.length;
      while (i < j) {
        d0.a(param1VarArgs[i], "Null interface");
        i++;
      } 
      Collections.addAll(this.a, param1VarArgs);
    }
    
    private b<T> a(int param1Int) {
      boolean bool;
      if (this.c == 0) {
        bool = true;
      } else {
        bool = false;
      } 
      d0.b(bool, "Instantiation type has already been set.");
      this.c = param1Int;
      return this;
    }
    
    private void a(Class<?> param1Class) {
      d0.a(this.a.contains(param1Class) ^ true, "Components are not allowed to depend on interfaces they themselves provide.");
    }
    
    private b<T> c() {
      this.d = 1;
      return this;
    }
    
    public b<T> a() {
      a(1);
      return this;
    }
    
    public b<T> a(q<T> param1q) {
      d0.a(param1q, "Null factory");
      this.e = param1q;
      return this;
    }
    
    public b<T> a(u param1u) {
      d0.a(param1u, "Null dependency");
      a(param1u.a());
      this.b.add(param1u);
      return this;
    }
    
    public n<T> b() {
      boolean bool;
      if (this.e != null) {
        bool = true;
      } else {
        bool = false;
      } 
      d0.b(bool, "Missing required property: factory.");
      return new n<T>(new HashSet<Class<? super T>>(this.a), new HashSet<u>(this.b), this.c, this.d, this.e, this.f, null);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/components/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */