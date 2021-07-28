package e.f.a.e.i.k;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

class l8 extends j8 implements List {
  l8(m8 paramm8, Object paramObject, List paramList, j8 paramj8) {
    super(paramm8, paramObject, paramList, paramj8);
  }
  
  public final void add(int paramInt, Object paramObject) {
    zza();
    boolean bool = this.d.isEmpty();
    ((List<Object>)this.d).add(paramInt, paramObject);
    m8.c(this.h);
    if (bool)
      a(); 
  }
  
  public final boolean addAll(int paramInt, Collection paramCollection) {
    if (paramCollection.isEmpty())
      return false; 
    int i = size();
    boolean bool2 = ((List)this.d).addAll(paramInt, paramCollection);
    boolean bool1 = bool2;
    if (bool2) {
      paramInt = this.d.size();
      m8.a(this.h, paramInt - i);
      bool1 = bool2;
      if (i == 0) {
        a();
        bool1 = true;
      } 
    } 
    return bool1;
  }
  
  public final Object get(int paramInt) {
    zza();
    return ((List)this.d).get(paramInt);
  }
  
  public final int indexOf(Object paramObject) {
    zza();
    return ((List)this.d).indexOf(paramObject);
  }
  
  public final int lastIndexOf(Object paramObject) {
    zza();
    return ((List)this.d).lastIndexOf(paramObject);
  }
  
  public final ListIterator listIterator() {
    zza();
    return new k8(this);
  }
  
  public final ListIterator listIterator(int paramInt) {
    zza();
    return new k8(this, paramInt);
  }
  
  public final Object remove(int paramInt) {
    zza();
    Object object = ((List<Object>)this.d).remove(paramInt);
    m8.b(this.h);
    zzb();
    return object;
  }
  
  public final Object set(int paramInt, Object paramObject) {
    zza();
    return ((List<Object>)this.d).set(paramInt, paramObject);
  }
  
  public final List subList(int paramInt1, int paramInt2) {
    zza();
    m8 m81 = this.h;
    Object object = this.c;
    List list = ((List)this.d).subList(paramInt1, paramInt2);
    j8 j81 = this.e;
    if (j81 == null)
      j81 = this; 
    return m81.a(object, list, j81);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/k/l8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */