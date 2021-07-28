package e.f.a.e.i.d;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class e3<K extends Comparable<K>, V> extends AbstractMap<K, V> {
  private final int c;
  
  private List<l3> d;
  
  private Map<K, V> e;
  
  private boolean f;
  
  private volatile n3 g;
  
  private Map<K, V> h;
  
  private volatile h3 i;
  
  private e3(int paramInt) {
    this.c = paramInt;
    this.d = Collections.emptyList();
    this.e = Collections.emptyMap();
    this.h = Collections.emptyMap();
  }
  
  private final int a(K paramK) {
    int j = this.d.size() - 1;
    if (j >= 0) {
      int k = paramK.compareTo((Comparable)((l3)this.d.get(j)).getKey());
      if (k > 0)
        return -(j + 2); 
      if (k == 0)
        return j; 
    } 
    int i = 0;
    while (i <= j) {
      int k = (i + j) / 2;
      int m = paramK.compareTo((Comparable)((l3)this.d.get(k)).getKey());
      if (m < 0) {
        j = k - 1;
        continue;
      } 
      if (m > 0) {
        i = k + 1;
        continue;
      } 
      return k;
    } 
    return -(i + 1);
  }
  
  static <FieldDescriptorType extends z0<FieldDescriptorType>> e3<FieldDescriptorType, Object> b(int paramInt) {
    return new f3(paramInt);
  }
  
  private final V c(int paramInt) {
    f();
    V v = ((l3)this.d.remove(paramInt)).getValue();
    if (!this.e.isEmpty()) {
      Iterator<Map.Entry<K, V>> iterator = g().entrySet().iterator();
      this.d.add(new l3(this, iterator.next()));
      iterator.remove();
    } 
    return v;
  }
  
  private final void f() {
    if (!this.f)
      return; 
    throw new UnsupportedOperationException();
  }
  
  private final SortedMap<K, V> g() {
    f();
    if (this.e.isEmpty() && !(this.e instanceof TreeMap)) {
      this.e = new TreeMap<K, V>();
      this.h = ((TreeMap<K, V>)this.e).descendingMap();
    } 
    return (SortedMap<K, V>)this.e;
  }
  
  public final V a(K paramK, V paramV) {
    f();
    int i = a(paramK);
    if (i >= 0)
      return ((l3)this.d.get(i)).setValue(paramV); 
    f();
    if (this.d.isEmpty() && !(this.d instanceof ArrayList))
      this.d = new ArrayList<l3>(this.c); 
    i = -(i + 1);
    if (i >= this.c)
      return g().put(paramK, paramV); 
    int j = this.d.size();
    int k = this.c;
    if (j == k) {
      l3 l3 = this.d.remove(k - 1);
      g().put((K)l3.getKey(), l3.getValue());
    } 
    this.d.add(i, new l3(this, paramK, paramV));
    return null;
  }
  
  public final Map.Entry<K, V> a(int paramInt) {
    return this.d.get(paramInt);
  }
  
  public final boolean a() {
    return this.f;
  }
  
  public final int b() {
    return this.d.size();
  }
  
  public final Iterable<Map.Entry<K, V>> c() {
    return this.e.isEmpty() ? i3.a() : this.e.entrySet();
  }
  
  public void clear() {
    f();
    if (!this.d.isEmpty())
      this.d.clear(); 
    if (!this.e.isEmpty())
      this.e.clear(); 
  }
  
  public boolean containsKey(Object paramObject) {
    paramObject = paramObject;
    return (a((K)paramObject) >= 0 || this.e.containsKey(paramObject));
  }
  
  final Set<Map.Entry<K, V>> d() {
    if (this.i == null)
      this.i = new h3(this, null); 
    return this.i;
  }
  
  public void e() {
    if (!this.f) {
      Map<?, ?> map;
      if (this.e.isEmpty()) {
        map = Collections.emptyMap();
      } else {
        map = Collections.unmodifiableMap(this.e);
      } 
      this.e = (Map)map;
      if (this.h.isEmpty()) {
        map = Collections.emptyMap();
      } else {
        map = Collections.unmodifiableMap(this.h);
      } 
      this.h = (Map)map;
      this.f = true;
    } 
  }
  
  public Set<Map.Entry<K, V>> entrySet() {
    if (this.g == null)
      this.g = new n3(this, null); 
    return this.g;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof e3))
      return super.equals(paramObject); 
    paramObject = paramObject;
    int j = size();
    if (j != paramObject.size())
      return false; 
    int k = b();
    if (k != paramObject.b())
      return entrySet().equals(paramObject.entrySet()); 
    for (int i = 0; i < k; i++) {
      if (!a(i).equals(paramObject.a(i)))
        return false; 
    } 
    return (k != j) ? this.e.equals(((e3)paramObject).e) : true;
  }
  
  public V get(Object paramObject) {
    paramObject = paramObject;
    int i = a((K)paramObject);
    return (i >= 0) ? ((l3)this.d.get(i)).getValue() : this.e.get(paramObject);
  }
  
  public int hashCode() {
    int k = b();
    int j = 0;
    int i = 0;
    while (j < k) {
      i += ((l3)this.d.get(j)).hashCode();
      j++;
    } 
    j = i;
    if (this.e.size() > 0)
      j = i + this.e.hashCode(); 
    return j;
  }
  
  public V remove(Object paramObject) {
    f();
    paramObject = paramObject;
    int i = a((K)paramObject);
    return (i >= 0) ? c(i) : (this.e.isEmpty() ? null : this.e.remove(paramObject));
  }
  
  public int size() {
    return this.d.size() + this.e.size();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/e3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */