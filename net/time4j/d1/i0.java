package net.time4j.d1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class i0<U, T extends l0<U, T>> extends x<T> implements j0<T> {
  private final Map<U, n0<T>> j;
  
  private final Map<p<?>, U> k;
  
  private final T l;
  
  private final T m;
  
  private final k<T> n;
  
  private final p<T> o;
  
  private i0(Class<T> paramClass, Class<U> paramClass1, u<T> paramu, Map<p<?>, z<T, ?>> paramMap, Map<U, n0<T>> paramMap1, Map<U, Double> paramMap2, Map<U, Set<U>> paramMap3, List<s> paramList, Map<p<?>, U> paramMap4, T paramT1, T paramT2, k<T> paramk, j0<T> paramj0) {
    super(paramClass, paramu, paramMap, paramList);
    this.j = Collections.unmodifiableMap(paramMap1);
    Collections.unmodifiableMap(paramMap2);
    Collections.unmodifiableMap(paramMap3);
    this.k = Collections.unmodifiableMap(paramMap4);
    this.l = paramT1;
    this.m = paramT2;
    this.n = paramk;
    this.o = (p)new d<l0>(paramClass, (l0)paramT1, (l0)paramT2, null);
    if (paramj0 == null) {
      ArrayList<?> arrayList = new ArrayList(paramMap1.keySet());
      Collections.sort(arrayList, new a(this, paramMap2));
      new c<Object, T>(arrayList.get(0), paramT1, paramT2);
    } 
  }
  
  private static <U> double b(Map<U, Double> paramMap, U paramU) {
    Double double_ = paramMap.get(paramU);
    return (double_ == null) ? ((paramU instanceof w) ? ((w)w.class.cast(paramU)).b() : Double.NaN) : double_.doubleValue();
  }
  
  public int a(T paramT1, T paramT2) {
    return paramT1.a(paramT2);
  }
  
  public k<T> a(String paramString) {
    if (paramString.isEmpty())
      return d(); 
    super.a(paramString);
    throw null;
  }
  
  public T a(q<?> paramq, d paramd, boolean paramBoolean1, boolean paramBoolean2) {
    if (paramq.c(this.o)) {
      paramq = paramq.e((p)this.o);
      return (T)paramq;
    } 
    paramq = (q<?>)super.a(paramq, paramd, paramBoolean1, paramBoolean2);
    return (T)paramq;
  }
  
  n0<T> a(U paramU) {
    if (paramU != null) {
      if (b(paramU))
        return this.j.get(paramU); 
      if (paramU instanceof f) {
        n0<q> n0 = ((f)f.class.cast(paramU)).a(this);
        if (n0 != null)
          return (n0)n0; 
      } 
      throw new e0(this, paramU);
    } 
    throw new NullPointerException("Missing chronological unit.");
  }
  
  public boolean b(U paramU) {
    return this.j.containsKey(paramU);
  }
  
  public k<T> d() {
    k<T> k1 = this.n;
    if (k1 != null)
      return k1; 
    super.d();
    throw null;
  }
  
  public U e(p<?> paramp) {
    if (paramp != null) {
      p<?> p1;
      U u2 = this.k.get(paramp);
      U u1 = u2;
      if (u2 == null) {
        U u = u2;
        if (paramp instanceof e) {
          p1 = ((e)paramp).e();
          p1 = (p<?>)this.k.get(p1);
        } 
      } 
      if (p1 != null)
        return (U)p1; 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Base unit not found for: ");
      stringBuilder.append(paramp.name());
      throw new r(stringBuilder.toString());
    } 
    throw new NullPointerException("Missing element.");
  }
  
  public p<T> h() {
    return this.o;
  }
  
  public T i() {
    return this.m;
  }
  
  public T j() {
    return this.l;
  }
  
  class a implements Comparator<U> {
    a(i0 this$0, Map param1Map) {}
    
    public int compare(U param1U1, U param1U2) {
      return Double.compare(i0.a(this.c, param1U1), i0.a(this.c, param1U2));
    }
  }
  
  public static final class b<U, T extends l0<U, T>> extends x.a<T> {
    private final Class<U> f;
    
    private final Map<U, n0<T>> g;
    
    private final Map<U, Double> h;
    
    private final Map<U, Set<U>> i;
    
    private final Map<p<?>, U> j;
    
    private final T k;
    
    private final T l;
    
    private final k<T> m;
    
    private j0<T> n = null;
    
    private b(Class<U> param1Class, Class<T> param1Class1, u<T> param1u, T param1T1, T param1T2, k<T> param1k, j0<T> param1j0) {
      super(param1Class1, param1u);
      if (param1Class != null) {
        if (param1T1 != null) {
          if (param1T2 != null) {
            if (!m.class.isAssignableFrom(param1Class1) || param1k != null) {
              this.f = param1Class;
              this.g = new HashMap<U, n0<T>>();
              this.h = new HashMap<U, Double>();
              this.i = new HashMap<U, Set<U>>();
              this.j = new HashMap<p<?>, U>();
              this.k = param1T1;
              this.l = param1T2;
              this.m = param1k;
              this.n = param1j0;
              return;
            } 
            throw new NullPointerException("Missing calendar system.");
          } 
          throw new NullPointerException("Missing maximum of range.");
        } 
        throw new NullPointerException("Missing minimum of range.");
      } 
      throw new NullPointerException("Missing unit type.");
    }
    
    public static <U, D extends m<U, D>> b<U, D> a(Class<U> param1Class, Class<D> param1Class1, u<D> param1u, k<D> param1k) {
      b<U, D> b1 = new b<U, D>(param1Class, param1Class1, param1u, param1k.a(param1k.b()), param1k.a(param1k.a()), param1k, null);
      for (a0 a0 : a0.values())
        b1.a(a0, (z)a0.a((k)param1k)); 
      return b1;
    }
    
    public static <U, T extends l0<U, T>> b<U, T> a(Class<U> param1Class, Class<T> param1Class1, u<T> param1u, T param1T1, T param1T2) {
      return new b<U, T>(param1Class, param1Class1, param1u, param1T1, param1T2, null, null);
    }
    
    private void a(U param1U) {
      if (this.b)
        return; 
      Iterator<E> iterator = this.g.keySet().iterator();
      while (iterator.hasNext()) {
        if (!iterator.next().equals(param1U))
          continue; 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unit duplicate found: ");
        stringBuilder.append(param1U.toString());
        throw new IllegalArgumentException(stringBuilder.toString());
      } 
      if (param1U instanceof Enum) {
        String str = ((Enum)Enum.class.cast(param1U)).name();
        iterator = this.g.keySet().iterator();
        while (iterator.hasNext()) {
          E e = iterator.next();
          if (!(e instanceof Enum) || !((Enum)Enum.class.cast(e)).name().equals(str))
            continue; 
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Unit duplicate found: ");
          stringBuilder.append(str);
          throw new IllegalArgumentException(stringBuilder.toString());
        } 
      } 
    }
    
    public b<U, T> a(U param1U, n0<T> param1n0, double param1Double, Set<? extends U> param1Set) {
      if (param1U != null) {
        if (param1n0 != null) {
          a(param1U);
          if (!param1Set.contains(null)) {
            if (!Double.isNaN(param1Double)) {
              if (!Double.isInfinite(param1Double)) {
                this.g.put(param1U, param1n0);
                this.h.put(param1U, Double.valueOf(param1Double));
                HashSet<U> hashSet = new HashSet<U>(param1Set);
                hashSet.remove(param1U);
                this.i.put(param1U, hashSet);
                return this;
              } 
              StringBuilder stringBuilder1 = new StringBuilder();
              stringBuilder1.append("Infinite: ");
              stringBuilder1.append(param1Double);
              throw new IllegalArgumentException(stringBuilder1.toString());
            } 
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Not a number: ");
            stringBuilder.append(param1Double);
            throw new IllegalArgumentException(stringBuilder.toString());
          } 
          throw new NullPointerException("Found convertible unit which is null.");
        } 
        throw new NullPointerException("Missing unit rule.");
      } 
      throw new NullPointerException("Missing time unit.");
    }
    
    public b<U, T> a(j0<T> param1j0) {
      if (param1j0 != null) {
        this.n = param1j0;
        return this;
      } 
      throw new NullPointerException("Missing time line.");
    }
    
    public <V> b<U, T> a(p<V> param1p, z<T, V> param1z) {
      a(param1p, (z)param1z);
      return this;
    }
    
    public <V> b<U, T> a(p<V> param1p, z<T, V> param1z, U param1U) {
      if (param1U != null) {
        a(param1p, (z)param1z);
        this.j.put(param1p, param1U);
        return this;
      } 
      throw new NullPointerException("Missing base unit.");
    }
    
    public b<U, T> a(s param1s) {
      a(param1s);
      return this;
    }
    
    public i0<U, T> a() {
      if (!this.g.isEmpty()) {
        i0<Object, l0> i0 = new i0<Object, l0>(this.a, this.f, this.c, this.d, this.g, this.h, this.i, this.e, this.j, (l0)this.k, (l0)this.l, this.m, this.n, null);
        x.b(i0);
        return (i0)i0;
      } 
      throw new IllegalStateException("No time unit was registered.");
    }
  }
  
  private static class c<U, T extends l0<U, T>> implements j0<T> {
    c(U param1U, T param1T1, T param1T2) {}
    
    public int a(T param1T1, T param1T2) {
      return param1T1.a(param1T2);
    }
  }
  
  private static class d<T extends l0<?, T>> extends e<T> implements z<T, T> {
    private static final long serialVersionUID = 4777240530511579802L;
    
    private final T max;
    
    private final T min;
    
    private final Class<T> type;
    
    private d(Class<T> param1Class, T param1T1, T param1T2) {
      super(stringBuilder.toString());
      this.type = param1Class;
      this.min = param1T1;
      this.max = param1T2;
    }
    
    public T a(T param1T1, T param1T2, boolean param1Boolean) {
      if (param1T2 != null)
        return param1T2; 
      throw new IllegalArgumentException("Missing value.");
    }
    
    public p<?> a(T param1T) {
      throw new UnsupportedOperationException();
    }
    
    protected <X extends q<X>> z<X, T> a(x<X> param1x) {
      return param1x.e().equals(this.type) ? this : null;
    }
    
    public boolean a(T param1T1, T param1T2) {
      return (param1T2 != null);
    }
    
    protected String b(x<?> param1x) {
      return null;
    }
    
    public T b() {
      return this.max;
    }
    
    public p<?> b(T param1T) {
      throw new UnsupportedOperationException();
    }
    
    public T c(T param1T) {
      return b();
    }
    
    public T d(T param1T) {
      return q();
    }
    
    public boolean d() {
      return false;
    }
    
    public T e(T param1T) {
      return param1T;
    }
    
    protected boolean g() {
      return true;
    }
    
    public Class<T> getType() {
      return this.type;
    }
    
    public T q() {
      return this.min;
    }
    
    public boolean s() {
      return false;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/d1/i0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */