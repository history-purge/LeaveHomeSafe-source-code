package b.b.a.b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public class b<K, V> implements Iterable<Map.Entry<K, V>> {
  c<K, V> c;
  
  private c<K, V> d;
  
  private WeakHashMap<f<K, V>, Boolean> e = new WeakHashMap<f<K, V>, Boolean>();
  
  private int f = 0;
  
  protected c<K, V> a(K paramK) {
    c<K, V> c1;
    for (c1 = this.c; c1 != null; c1 = c1.e) {
      if (c1.c.equals(paramK))
        return c1; 
    } 
    return c1;
  }
  
  protected c<K, V> a(K paramK, V paramV) {
    c<K, V> c1 = new c<K, V>(paramK, paramV);
    this.f++;
    c<K, V> c2 = this.d;
    if (c2 == null) {
      this.c = c1;
      this.d = this.c;
      return c1;
    } 
    c2.e = c1;
    c1.f = c2;
    this.d = c1;
    return c1;
  }
  
  public Map.Entry<K, V> a() {
    return this.c;
  }
  
  public d b() {
    d d = new d(this);
    this.e.put(d, Boolean.valueOf(false));
    return d;
  }
  
  public V b(K paramK, V paramV) {
    c<K, V> c1 = a(paramK);
    if (c1 != null)
      return c1.d; 
    a(paramK, paramV);
    return null;
  }
  
  public Map.Entry<K, V> c() {
    return this.d;
  }
  
  public Iterator<Map.Entry<K, V>> descendingIterator() {
    b<K, V> b1 = new b<K, V>(this.d, this.c);
    this.e.put(b1, Boolean.valueOf(false));
    return b1;
  }
  
  public boolean equals(Object<Map.Entry<K, V>> paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof b))
      return false; 
    b b1 = (b)paramObject;
    if (size() != b1.size())
      return false; 
    paramObject = (Object<Map.Entry<K, V>>)iterator();
    Iterator<Object> iterator = b1.iterator();
    while (paramObject.hasNext() && iterator.hasNext()) {
      Map.Entry entry = paramObject.next();
      Object object = iterator.next();
      if ((entry == null && object != null) || (entry != null && !entry.equals(object)))
        return false; 
    } 
    return (!paramObject.hasNext() && !iterator.hasNext());
  }
  
  public int hashCode() {
    Iterator<Map.Entry<K, V>> iterator = iterator();
    int i;
    for (i = 0; iterator.hasNext(); i += ((Map.Entry)iterator.next()).hashCode());
    return i;
  }
  
  public Iterator<Map.Entry<K, V>> iterator() {
    a<K, V> a = new a<K, V>(this.c, this.d);
    this.e.put(a, Boolean.valueOf(false));
    return a;
  }
  
  public V remove(K paramK) {
    c<K, V> c1 = a(paramK);
    if (c1 == null)
      return null; 
    this.f--;
    if (!this.e.isEmpty()) {
      Iterator<f<K, V>> iterator = this.e.keySet().iterator();
      while (iterator.hasNext())
        ((f<K, V>)iterator.next()).a(c1); 
    } 
    c<K, V> c2 = c1.f;
    if (c2 != null) {
      c2.e = c1.e;
    } else {
      this.c = c1.e;
    } 
    c2 = c1.e;
    if (c2 != null) {
      c2.f = c1.f;
    } else {
      this.d = c1.f;
    } 
    c1.e = null;
    c1.f = null;
    return c1.d;
  }
  
  public int size() {
    return this.f;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("[");
    Iterator<Map.Entry<K, V>> iterator = iterator();
    while (iterator.hasNext()) {
      stringBuilder.append(((Map.Entry)iterator.next()).toString());
      if (iterator.hasNext())
        stringBuilder.append(", "); 
    } 
    stringBuilder.append("]");
    return stringBuilder.toString();
  }
  
  static class a<K, V> extends e<K, V> {
    a(b.c<K, V> param1c1, b.c<K, V> param1c2) {
      super(param1c1, param1c2);
    }
    
    b.c<K, V> b(b.c<K, V> param1c) {
      return param1c.f;
    }
    
    b.c<K, V> c(b.c<K, V> param1c) {
      return param1c.e;
    }
  }
  
  private static class b<K, V> extends e<K, V> {
    b(b.c<K, V> param1c1, b.c<K, V> param1c2) {
      super(param1c1, param1c2);
    }
    
    b.c<K, V> b(b.c<K, V> param1c) {
      return param1c.e;
    }
    
    b.c<K, V> c(b.c<K, V> param1c) {
      return param1c.f;
    }
  }
  
  static class c<K, V> implements Map.Entry<K, V> {
    final K c;
    
    final V d;
    
    c<K, V> e;
    
    c<K, V> f;
    
    c(K param1K, V param1V) {
      this.c = param1K;
      this.d = param1V;
    }
    
    public boolean equals(Object param1Object) {
      if (param1Object == this)
        return true; 
      if (!(param1Object instanceof c))
        return false; 
      param1Object = param1Object;
      return (this.c.equals(((c)param1Object).c) && this.d.equals(((c)param1Object).d));
    }
    
    public K getKey() {
      return this.c;
    }
    
    public V getValue() {
      return this.d;
    }
    
    public int hashCode() {
      return this.c.hashCode() ^ this.d.hashCode();
    }
    
    public V setValue(V param1V) {
      throw new UnsupportedOperationException("An entry modification is not supported");
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(this.c);
      stringBuilder.append("=");
      stringBuilder.append(this.d);
      return stringBuilder.toString();
    }
  }
  
  private class d implements Iterator<Map.Entry<K, V>>, f<K, V> {
    private b.c<K, V> c;
    
    private boolean d = true;
    
    d(b this$0) {}
    
    public void a(b.c<K, V> param1c) {
      b.c<K, V> c1 = this.c;
      if (param1c == c1) {
        boolean bool;
        this.c = c1.f;
        if (this.c == null) {
          bool = true;
        } else {
          bool = false;
        } 
        this.d = bool;
      } 
    }
    
    public boolean hasNext() {
      if (this.d)
        return (this.e.c != null); 
      b.c<K, V> c1 = this.c;
      return (c1 != null && c1.e != null);
    }
    
    public Map.Entry<K, V> next() {
      b.c<K, V> c1;
      if (this.d) {
        this.d = false;
        c1 = this.e.c;
      } else {
        c1 = this.c;
        if (c1 != null) {
          c1 = c1.e;
        } else {
          c1 = null;
        } 
      } 
      this.c = c1;
      return this.c;
    }
  }
  
  private static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {
    b.c<K, V> c;
    
    b.c<K, V> d;
    
    e(b.c<K, V> param1c1, b.c<K, V> param1c2) {
      this.c = param1c2;
      this.d = param1c1;
    }
    
    private b.c<K, V> a() {
      b.c<K, V> c1 = this.d;
      b.c<K, V> c2 = this.c;
      return (c1 == c2 || c2 == null) ? null : c(c1);
    }
    
    public void a(b.c<K, V> param1c) {
      if (this.c == param1c && param1c == this.d) {
        this.d = null;
        this.c = null;
      } 
      b.c<K, V> c1 = this.c;
      if (c1 == param1c)
        this.c = b(c1); 
      if (this.d == param1c)
        this.d = a(); 
    }
    
    abstract b.c<K, V> b(b.c<K, V> param1c);
    
    abstract b.c<K, V> c(b.c<K, V> param1c);
    
    public boolean hasNext() {
      return (this.d != null);
    }
    
    public Map.Entry<K, V> next() {
      b.c<K, V> c1 = this.d;
      this.d = a();
      return c1;
    }
  }
  
  static interface f<K, V> {
    void a(b.c<K, V> param1c);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/b/a/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */