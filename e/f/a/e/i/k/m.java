package e.f.a.e.i.k;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

public abstract class m<E> extends AbstractCollection<E> implements Serializable {
  private static final Object[] c = new Object[0];
  
  abstract int a();
  
  abstract int a(Object[] paramArrayOfObject, int paramInt);
  
  @Deprecated
  public final boolean add(E paramE) {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final boolean addAll(Collection<? extends E> paramCollection) {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final void clear() {
    throw new UnsupportedOperationException();
  }
  
  abstract int f();
  
  @Deprecated
  public final boolean remove(Object paramObject) {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final boolean removeAll(Collection<?> paramCollection) {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final boolean retainAll(Collection<?> paramCollection) {
    throw new UnsupportedOperationException();
  }
  
  public final Object[] toArray() {
    return toArray(c);
  }
  
  public final <T> T[] toArray(T[] paramArrayOfT) {
    if (paramArrayOfT != null) {
      T[] arrayOfT;
      int i = size();
      int j = paramArrayOfT.length;
      if (j < i) {
        Object[] arrayOfObject = zzb();
        if (arrayOfObject == null) {
          arrayOfObject = (Object[])Array.newInstance(paramArrayOfT.getClass().getComponentType(), i);
        } else {
          return Arrays.copyOfRange(arrayOfObject, a(), f(), (Class)paramArrayOfT.getClass());
        } 
      } else {
        arrayOfT = paramArrayOfT;
        if (j > i) {
          paramArrayOfT[i] = null;
          arrayOfT = paramArrayOfT;
        } 
      } 
      a((Object[])arrayOfT, 0);
      return arrayOfT;
    } 
    throw null;
  }
  
  abstract Object[] zzb();
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/k/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */