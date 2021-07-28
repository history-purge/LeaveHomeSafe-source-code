package e.f.a.e.i.d;

import java.util.AbstractList;
import java.util.Collection;

abstract class t<E> extends AbstractList<E> implements k1<E> {
  private boolean c = true;
  
  protected final void a() {
    if (this.c)
      return; 
    throw new UnsupportedOperationException();
  }
  
  public boolean add(E paramE) {
    a();
    return super.add(paramE);
  }
  
  public boolean addAll(int paramInt, Collection<? extends E> paramCollection) {
    a();
    return super.addAll(paramInt, paramCollection);
  }
  
  public boolean addAll(Collection<? extends E> paramCollection) {
    a();
    return super.addAll(paramCollection);
  }
  
  public void clear() {
    a();
    super.clear();
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof java.util.List))
      return false; 
    if (!(paramObject instanceof java.util.RandomAccess))
      return super.equals(paramObject); 
    paramObject = paramObject;
    int j = size();
    if (j != paramObject.size())
      return false; 
    for (int i = 0; i < j; i++) {
      if (!get(i).equals(paramObject.get(i)))
        return false; 
    } 
    return true;
  }
  
  public int hashCode() {
    int k = size();
    int j = 1;
    for (int i = 0; i < k; i++)
      j = j * 31 + get(i).hashCode(); 
    return j;
  }
  
  public boolean remove(Object paramObject) {
    a();
    return super.remove(paramObject);
  }
  
  public boolean removeAll(Collection<?> paramCollection) {
    a();
    return super.removeAll(paramCollection);
  }
  
  public boolean retainAll(Collection<?> paramCollection) {
    a();
    return super.retainAll(paramCollection);
  }
  
  public boolean w() {
    return this.c;
  }
  
  public final void x() {
    this.c = false;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */