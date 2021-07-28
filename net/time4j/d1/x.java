package net.time4j.d1;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class x<T> implements u<T> {
  private static final List<b> h = new CopyOnWriteArrayList<b>();
  
  private static final ReferenceQueue<x<?>> i = new ReferenceQueue<x<?>>();
  
  private final Class<T> c;
  
  private final u<T> d;
  
  private final Map<p<?>, z<T, ?>> e;
  
  private final List<s> f;
  
  private final Map<p<?>, c0<T>> g;
  
  x(Class<T> paramClass, u<T> paramu, Map<p<?>, z<T, ?>> paramMap, List<s> paramList) {
    if (paramClass != null) {
      if (paramu != null) {
        this.c = paramClass;
        this.d = paramu;
        this.e = Collections.unmodifiableMap(paramMap);
        this.f = Collections.unmodifiableList(paramList);
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        for (p<Integer> p : this.e.keySet()) {
          if (p.getType() == Integer.class) {
            paramList = (List<s>)this.e.get(p);
            if (paramList instanceof c0)
              hashMap.put(p, paramList); 
          } 
        } 
        this.g = Collections.unmodifiableMap(hashMap);
        return;
      } 
      throw new NullPointerException("Missing chronological merger.");
    } 
    NullPointerException nullPointerException = new NullPointerException("Missing chronological type.");
    throw nullPointerException;
  }
  
  private static <T> T a(Object paramObject) {
    return (T)paramObject;
  }
  
  public static <T> x<T> a(Class<T> paramClass) {
    try {
      x<T> x1;
      Class.forName(paramClass.getName(), true, paramClass.getClassLoader());
      x<T> x2 = null;
      boolean bool = false;
      Iterator<b> iterator = h.iterator();
      while (true) {
        x1 = x2;
        if (iterator.hasNext()) {
          x1 = ((b<x>)iterator.next()).get();
          if (x1 == null) {
            bool = true;
            continue;
          } 
          if (x1.e() == paramClass)
            break; 
          continue;
        } 
        break;
      } 
      if (bool)
        h(); 
      a(x1);
      return x1;
    } catch (ClassNotFoundException classNotFoundException) {
      IllegalStateException illegalStateException = new IllegalStateException(classNotFoundException);
      throw illegalStateException;
    } 
  }
  
  private z<T, ?> a(p<?> paramp, boolean paramBoolean) {
    boolean bool = paramp instanceof e;
    p p1 = null;
    if (bool && q.class.isAssignableFrom(e())) {
      String str;
      z<T, ?> z;
      e e = e.class.cast(paramp);
      paramp = p1;
      if (paramBoolean)
        str = e.b(this); 
      if (str == null) {
        a(this);
        z = e.a(this);
        a(z);
        return z;
      } 
      throw new e0(z);
    } 
    return null;
  }
  
  static void b(x<?> paramx) {
    h.add(new b(paramx, i));
  }
  
  private static void h() {
    while (true) {
      b b = (b)i.poll();
      if (b != null) {
        for (b b1 : h) {
          if (b.a(b1).equals(b.a(b)))
            h.remove(b1); 
        } 
        continue;
      } 
      break;
    } 
  }
  
  public T a(q<?> paramq, d paramd, boolean paramBoolean1, boolean paramBoolean2) {
    return this.d.a(paramq, paramd, paramBoolean1, paramBoolean2);
  }
  
  public String a(y paramy, Locale paramLocale) {
    return this.d.a(paramy, paramLocale);
  }
  
  c0<T> a(p<Integer> paramp) {
    return this.g.get(paramp);
  }
  
  public f0 a() {
    return this.d.a();
  }
  
  public k<T> a(String paramString) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Calendar variant is not available: ");
    stringBuilder.append(paramString);
    throw new r(stringBuilder.toString());
  }
  
  public o a(T paramT, d paramd) {
    return this.d.a(paramT, paramd);
  }
  
  public x<?> b() {
    return this.d.b();
  }
  
  <V> z<T, V> b(p<V> paramp) {
    if (paramp != null) {
      z<T, ?> z2 = this.e.get(paramp);
      z<T, ?> z1 = z2;
      if (z2 == null) {
        z1 = a(paramp, true);
        if (z1 == null)
          throw new e0(this, paramp); 
      } 
      a(z1);
      return (z)z1;
    } 
    throw new NullPointerException("Missing chronological element.");
  }
  
  public int c() {
    return this.d.c();
  }
  
  public boolean c(p<?> paramp) {
    return (paramp != null && this.e.containsKey(paramp));
  }
  
  public k<T> d() {
    throw new r("Calendar system is not available.");
  }
  
  public boolean d(p<?> paramp) {
    boolean bool = false;
    if (paramp == null)
      return false; 
    if (c(paramp) || a(paramp, false) != null)
      bool = true; 
    return bool;
  }
  
  public Class<T> e() {
    return this.c;
  }
  
  public List<s> f() {
    return this.f;
  }
  
  public Set<p<?>> g() {
    return this.e.keySet();
  }
  
  public static class a<T extends q<T>> {
    final Class<T> a;
    
    final boolean b;
    
    final u<T> c;
    
    final Map<p<?>, z<T, ?>> d;
    
    final List<s> e;
    
    a(Class<T> param1Class, u<T> param1u) {
      if (param1u != null) {
        this.a = param1Class;
        this.b = param1Class.getName().startsWith("net.time4j.");
        this.c = param1u;
        this.d = new HashMap<p<?>, z<T, ?>>();
        this.e = new ArrayList<s>();
        return;
      } 
      throw new NullPointerException("Missing chronological merger.");
    }
    
    private void a(p<?> param1p) {
      if (this.b)
        return; 
      if (param1p != null) {
        String str = param1p.name();
        for (p<?> p1 : this.d.keySet()) {
          if (!p1.equals(param1p) && !p1.name().equals(str))
            continue; 
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Element duplicate found: ");
          stringBuilder.append(str);
          throw new IllegalArgumentException(stringBuilder.toString());
        } 
        return;
      } 
      NullPointerException nullPointerException = new NullPointerException("Static initialization problem: Check if given element statically refer to any chronology causing premature class loading.");
      throw nullPointerException;
    }
    
    public <V> a<T> a(p<V> param1p, z<T, V> param1z) {
      a(param1p);
      this.d.put(param1p, param1z);
      return this;
    }
    
    public a<T> a(s param1s) {
      if (param1s != null) {
        if (!this.e.contains(param1s))
          this.e.add(param1s); 
        return this;
      } 
      throw new NullPointerException("Missing chronological extension.");
    }
  }
  
  private static class b extends WeakReference<x<?>> {
    private final String a;
    
    b(x<?> param1x, ReferenceQueue<x<?>> param1ReferenceQueue) {
      super(param1x, param1ReferenceQueue);
      this.a = x.a(param1x).getName();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/d1/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */