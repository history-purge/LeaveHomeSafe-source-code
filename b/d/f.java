package b.d;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

abstract class f<K, V> {
  b a;
  
  c b;
  
  e c;
  
  public static <K, V> boolean a(Map<K, V> paramMap, Collection<?> paramCollection) {
    Iterator<?> iterator = paramCollection.iterator();
    while (iterator.hasNext()) {
      if (!paramMap.containsKey(iterator.next()))
        return false; 
    } 
    return true;
  }
  
  public static <T> boolean a(Set<T> paramSet, Object paramObject) {
    if (paramSet == paramObject)
      return true; 
    if (paramObject instanceof Set) {
      paramObject = paramObject;
      try {
        if (paramSet.size() == paramObject.size()) {
          boolean bool = paramSet.containsAll((Collection<?>)paramObject);
          if (bool)
            return true; 
        } 
        return false;
      } catch (NullPointerException|ClassCastException nullPointerException) {
        return false;
      } 
    } 
    return false;
  }
  
  public static <K, V> boolean b(Map<K, V> paramMap, Collection<?> paramCollection) {
    int i = paramMap.size();
    Iterator<?> iterator = paramCollection.iterator();
    while (iterator.hasNext())
      paramMap.remove(iterator.next()); 
    return (i != paramMap.size());
  }
  
  public static <K, V> boolean c(Map<K, V> paramMap, Collection<?> paramCollection) {
    int i = paramMap.size();
    Iterator iterator = paramMap.keySet().iterator();
    while (iterator.hasNext()) {
      if (!paramCollection.contains(iterator.next()))
        iterator.remove(); 
    } 
    return (i != paramMap.size());
  }
  
  protected abstract int a(Object paramObject);
  
  protected abstract Object a(int paramInt1, int paramInt2);
  
  protected abstract V a(int paramInt, V paramV);
  
  protected abstract void a();
  
  protected abstract void a(int paramInt);
  
  protected abstract void a(K paramK, V paramV);
  
  public <T> T[] a(T[] paramArrayOfT, int paramInt) {
    int j = c();
    T[] arrayOfT = paramArrayOfT;
    if (paramArrayOfT.length < j)
      arrayOfT = (T[])Array.newInstance(paramArrayOfT.getClass().getComponentType(), j); 
    for (int i = 0; i < j; i++)
      arrayOfT[i] = (T)a(i, paramInt); 
    if (arrayOfT.length > j)
      arrayOfT[j] = null; 
    return arrayOfT;
  }
  
  protected abstract int b(Object paramObject);
  
  protected abstract Map<K, V> b();
  
  public Object[] b(int paramInt) {
    int j = c();
    Object[] arrayOfObject = new Object[j];
    for (int i = 0; i < j; i++)
      arrayOfObject[i] = a(i, paramInt); 
    return arrayOfObject;
  }
  
  protected abstract int c();
  
  public Set<Map.Entry<K, V>> d() {
    if (this.a == null)
      this.a = new b(this); 
    return this.a;
  }
  
  public Set<K> e() {
    if (this.b == null)
      this.b = new c(this); 
    return this.b;
  }
  
  public Collection<V> f() {
    if (this.c == null)
      this.c = new e(this); 
    return this.c;
  }
  
  final class a<T> implements Iterator<T> {
    final int c;
    
    int d;
    
    int e;
    
    boolean f = false;
    
    a(f this$0, int param1Int) {
      this.c = param1Int;
      this.d = this$0.c();
    }
    
    public boolean hasNext() {
      return (this.e < this.d);
    }
    
    public T next() {
      if (hasNext()) {
        Object object = this.g.a(this.e, this.c);
        this.e++;
        this.f = true;
        return (T)object;
      } 
      throw new NoSuchElementException();
    }
    
    public void remove() {
      if (this.f) {
        this.e--;
        this.d--;
        this.f = false;
        this.g.a(this.e);
        return;
      } 
      throw new IllegalStateException();
    }
  }
  
  final class b implements Set<Map.Entry<K, V>> {
    b(f this$0) {}
    
    public boolean a(Map.Entry<K, V> param1Entry) {
      throw new UnsupportedOperationException();
    }
    
    public boolean addAll(Collection<? extends Map.Entry<K, V>> param1Collection) {
      int i = this.c.c();
      for (Map.Entry<K, V> entry : param1Collection)
        this.c.a(entry.getKey(), entry.getValue()); 
      return (i != this.c.c());
    }
    
    public void clear() {
      this.c.a();
    }
    
    public boolean contains(Object param1Object) {
      if (!(param1Object instanceof Map.Entry))
        return false; 
      param1Object = param1Object;
      int i = this.c.a(param1Object.getKey());
      return (i < 0) ? false : c.a(this.c.a(i, 1), param1Object.getValue());
    }
    
    public boolean containsAll(Collection<?> param1Collection) {
      Iterator<?> iterator = param1Collection.iterator();
      while (iterator.hasNext()) {
        if (!contains(iterator.next()))
          return false; 
      } 
      return true;
    }
    
    public boolean equals(Object param1Object) {
      return f.a(this, param1Object);
    }
    
    public int hashCode() {
      int i = this.c.c() - 1;
      int j = 0;
      while (i >= 0) {
        int k;
        int m;
        Object object1 = this.c.a(i, 0);
        Object object2 = this.c.a(i, 1);
        if (object1 == null) {
          k = 0;
        } else {
          k = object1.hashCode();
        } 
        if (object2 == null) {
          m = 0;
        } else {
          m = object2.hashCode();
        } 
        j += k ^ m;
        i--;
      } 
      return j;
    }
    
    public boolean isEmpty() {
      return (this.c.c() == 0);
    }
    
    public Iterator<Map.Entry<K, V>> iterator() {
      return new f.d(this.c);
    }
    
    public boolean remove(Object param1Object) {
      throw new UnsupportedOperationException();
    }
    
    public boolean removeAll(Collection<?> param1Collection) {
      throw new UnsupportedOperationException();
    }
    
    public boolean retainAll(Collection<?> param1Collection) {
      throw new UnsupportedOperationException();
    }
    
    public int size() {
      return this.c.c();
    }
    
    public Object[] toArray() {
      throw new UnsupportedOperationException();
    }
    
    public <T> T[] toArray(T[] param1ArrayOfT) {
      throw new UnsupportedOperationException();
    }
  }
  
  final class c implements Set<K> {
    c(f this$0) {}
    
    public boolean add(K param1K) {
      throw new UnsupportedOperationException();
    }
    
    public boolean addAll(Collection<? extends K> param1Collection) {
      throw new UnsupportedOperationException();
    }
    
    public void clear() {
      this.c.a();
    }
    
    public boolean contains(Object param1Object) {
      return (this.c.a(param1Object) >= 0);
    }
    
    public boolean containsAll(Collection<?> param1Collection) {
      return f.a(this.c.b(), param1Collection);
    }
    
    public boolean equals(Object param1Object) {
      return f.a(this, param1Object);
    }
    
    public int hashCode() {
      int i = this.c.c() - 1;
      int j = 0;
      while (i >= 0) {
        int k;
        Object object = this.c.a(i, 0);
        if (object == null) {
          k = 0;
        } else {
          k = object.hashCode();
        } 
        j += k;
        i--;
      } 
      return j;
    }
    
    public boolean isEmpty() {
      return (this.c.c() == 0);
    }
    
    public Iterator<K> iterator() {
      return new f.a<K>(this.c, 0);
    }
    
    public boolean remove(Object param1Object) {
      int i = this.c.a(param1Object);
      if (i >= 0) {
        this.c.a(i);
        return true;
      } 
      return false;
    }
    
    public boolean removeAll(Collection<?> param1Collection) {
      return f.b(this.c.b(), param1Collection);
    }
    
    public boolean retainAll(Collection<?> param1Collection) {
      return f.c(this.c.b(), param1Collection);
    }
    
    public int size() {
      return this.c.c();
    }
    
    public Object[] toArray() {
      return this.c.b(0);
    }
    
    public <T> T[] toArray(T[] param1ArrayOfT) {
      return (T[])this.c.a((Object[])param1ArrayOfT, 0);
    }
  }
  
  final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {
    int c;
    
    int d;
    
    boolean e = false;
    
    d(f this$0) {
      this.c = this$0.c() - 1;
      this.d = -1;
    }
    
    public boolean equals(Object param1Object) {
      if (this.e) {
        boolean bool = param1Object instanceof Map.Entry;
        boolean bool1 = false;
        if (!bool)
          return false; 
        param1Object = param1Object;
        bool = bool1;
        if (c.a(param1Object.getKey(), this.f.a(this.d, 0))) {
          bool = bool1;
          if (c.a(param1Object.getValue(), this.f.a(this.d, 1)))
            bool = true; 
        } 
        return bool;
      } 
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    
    public K getKey() {
      if (this.e)
        return (K)this.f.a(this.d, 0); 
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    
    public V getValue() {
      if (this.e)
        return (V)this.f.a(this.d, 1); 
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    
    public boolean hasNext() {
      return (this.d < this.c);
    }
    
    public int hashCode() {
      if (this.e) {
        f f1 = this.f;
        int i = this.d;
        int j = 0;
        Object object1 = f1.a(i, 0);
        Object object2 = this.f.a(this.d, 1);
        if (object1 == null) {
          i = 0;
        } else {
          i = object1.hashCode();
        } 
        if (object2 != null)
          j = object2.hashCode(); 
        return i ^ j;
      } 
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    
    public Map.Entry<K, V> next() {
      if (hasNext()) {
        this.d++;
        this.e = true;
        return this;
      } 
      throw new NoSuchElementException();
    }
    
    public void remove() {
      if (this.e) {
        this.f.a(this.d);
        this.d--;
        this.c--;
        this.e = false;
        return;
      } 
      throw new IllegalStateException();
    }
    
    public V setValue(V param1V) {
      if (this.e)
        return (V)this.f.a(this.d, param1V); 
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(getKey());
      stringBuilder.append("=");
      stringBuilder.append(getValue());
      return stringBuilder.toString();
    }
  }
  
  final class e implements Collection<V> {
    e(f this$0) {}
    
    public boolean add(V param1V) {
      throw new UnsupportedOperationException();
    }
    
    public boolean addAll(Collection<? extends V> param1Collection) {
      throw new UnsupportedOperationException();
    }
    
    public void clear() {
      this.c.a();
    }
    
    public boolean contains(Object param1Object) {
      return (this.c.b(param1Object) >= 0);
    }
    
    public boolean containsAll(Collection<?> param1Collection) {
      Iterator<?> iterator = param1Collection.iterator();
      while (iterator.hasNext()) {
        if (!contains(iterator.next()))
          return false; 
      } 
      return true;
    }
    
    public boolean isEmpty() {
      return (this.c.c() == 0);
    }
    
    public Iterator<V> iterator() {
      return new f.a<V>(this.c, 1);
    }
    
    public boolean remove(Object param1Object) {
      int i = this.c.b(param1Object);
      if (i >= 0) {
        this.c.a(i);
        return true;
      } 
      return false;
    }
    
    public boolean removeAll(Collection<?> param1Collection) {
      int j = this.c.c();
      int i = 0;
      boolean bool = false;
      while (i < j) {
        int k = j;
        int m = i;
        if (param1Collection.contains(this.c.a(i, 1))) {
          this.c.a(i);
          m = i - 1;
          k = j - 1;
          bool = true;
        } 
        i = m + 1;
        j = k;
      } 
      return bool;
    }
    
    public boolean retainAll(Collection<?> param1Collection) {
      int j = this.c.c();
      int i = 0;
      boolean bool = false;
      while (i < j) {
        int k = j;
        int m = i;
        if (!param1Collection.contains(this.c.a(i, 1))) {
          this.c.a(i);
          m = i - 1;
          k = j - 1;
          bool = true;
        } 
        i = m + 1;
        j = k;
      } 
      return bool;
    }
    
    public int size() {
      return this.c.c();
    }
    
    public Object[] toArray() {
      return this.c.b(1);
    }
    
    public <T> T[] toArray(T[] param1ArrayOfT) {
      return (T[])this.c.a((Object[])param1ArrayOfT, 1);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/d/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */