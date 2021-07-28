package e.f.a.e.i.k;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

class j8 extends AbstractCollection {
  final Object c;
  
  Collection d;
  
  final j8 e;
  
  final Collection f;
  
  j8(m8 paramm8, Object paramObject, Collection paramCollection, j8 paramj8) {
    Collection collection;
    this.c = paramObject;
    this.d = paramCollection;
    this.e = paramj8;
    if (paramj8 == null) {
      paramm8 = null;
    } else {
      collection = paramj8.d;
    } 
    this.f = collection;
  }
  
  final void a() {
    j8 j81 = this.e;
    if (j81 != null) {
      j81.a();
      return;
    } 
    m8.a(this.g).put(this.c, this.d);
  }
  
  public final boolean add(Object paramObject) {
    zza();
    boolean bool3 = this.d.isEmpty();
    boolean bool2 = this.d.add(paramObject);
    boolean bool1 = bool2;
    if (bool2) {
      m8.c(this.g);
      bool1 = bool2;
      if (bool3) {
        a();
        bool1 = true;
      } 
    } 
    return bool1;
  }
  
  public final boolean addAll(Collection paramCollection) {
    if (paramCollection.isEmpty())
      return false; 
    int i = size();
    boolean bool2 = this.d.addAll(paramCollection);
    boolean bool1 = bool2;
    if (bool2) {
      int j = this.d.size();
      m8.a(this.g, j - i);
      bool1 = bool2;
      if (i == 0) {
        a();
        bool1 = true;
      } 
    } 
    return bool1;
  }
  
  public final void clear() {
    int i = size();
    if (i == 0)
      return; 
    this.d.clear();
    m8.b(this.g, i);
    zzb();
  }
  
  public final boolean contains(Object paramObject) {
    zza();
    return this.d.contains(paramObject);
  }
  
  public final boolean containsAll(Collection<?> paramCollection) {
    zza();
    return this.d.containsAll(paramCollection);
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    zza();
    return this.d.equals(paramObject);
  }
  
  public final int hashCode() {
    zza();
    return this.d.hashCode();
  }
  
  public final Iterator iterator() {
    zza();
    return new i8(this);
  }
  
  public final boolean remove(Object paramObject) {
    zza();
    boolean bool = this.d.remove(paramObject);
    if (bool) {
      m8.b(this.g);
      zzb();
    } 
    return bool;
  }
  
  public final boolean removeAll(Collection<?> paramCollection) {
    if (paramCollection.isEmpty())
      return false; 
    int i = size();
    boolean bool = this.d.removeAll(paramCollection);
    if (bool) {
      int j = this.d.size();
      m8.a(this.g, j - i);
      zzb();
    } 
    return bool;
  }
  
  public final boolean retainAll(Collection<?> paramCollection) {
    if (paramCollection != null) {
      int i = size();
      boolean bool = this.d.retainAll(paramCollection);
      if (bool) {
        int j = this.d.size();
        m8.a(this.g, j - i);
        zzb();
      } 
      return bool;
    } 
    throw null;
  }
  
  public final int size() {
    zza();
    return this.d.size();
  }
  
  public final String toString() {
    zza();
    return this.d.toString();
  }
  
  final void zza() {
    j8 j81 = this.e;
    if (j81 != null) {
      j81.zza();
      if (this.e.d == this.f)
        return; 
      throw new ConcurrentModificationException();
    } 
    if (this.d.isEmpty()) {
      Collection collection = (Collection)m8.a(this.g).get(this.c);
      if (collection != null)
        this.d = collection; 
    } 
  }
  
  final void zzb() {
    j8 j81 = this.e;
    if (j81 != null) {
      j81.zzb();
      return;
    } 
    if (this.d.isEmpty())
      m8.a(this.g).remove(this.c); 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/k/j8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */