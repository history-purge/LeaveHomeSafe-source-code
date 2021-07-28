package e.f.a.e.i.j;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public abstract class o6<E> extends k6<E> implements List<E>, RandomAccess {
  private static final r6<Object> d = new m6(p6.g, 0);
  
  public static <E> o6<E> a(E paramE) {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramE;
    if (arrayOfObject[0] != null)
      return b(arrayOfObject, 1); 
    StringBuilder stringBuilder = new StringBuilder(20);
    stringBuilder.append("at index ");
    stringBuilder.append(0);
    throw new NullPointerException(stringBuilder.toString());
  }
  
  static <E> o6<E> b(Object[] paramArrayOfObject, int paramInt) {
    return (o6<E>)((paramInt == 0) ? p6.g : new p6<E>(paramArrayOfObject, paramInt));
  }
  
  int a(Object[] paramArrayOfObject, int paramInt) {
    int i = size();
    for (paramInt = 0; paramInt < i; paramInt++)
      paramArrayOfObject[paramInt] = get(paramInt); 
    return i;
  }
  
  public o6<E> a(int paramInt1, int paramInt2) {
    f4.a(paramInt1, paramInt2, size());
    paramInt2 -= paramInt1;
    return (paramInt2 == size()) ? this : ((paramInt2 == 0) ? p6.g : new n6(this, paramInt1, paramInt2));
  }
  
  @Deprecated
  public final void add(int paramInt, E paramE) {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final boolean addAll(int paramInt, Collection<? extends E> paramCollection) {
    throw new UnsupportedOperationException();
  }
  
  public final boolean contains(Object paramObject) {
    return (indexOf(paramObject) >= 0);
  }
  
  public final boolean equals(Object<E> paramObject) {
    if (paramObject != this) {
      if (!(paramObject instanceof List))
        return false; 
      List list = (List)paramObject;
      int i = size();
      if (i != list.size())
        return false; 
      if (list instanceof RandomAccess) {
        int j = 0;
        while (true) {
          if (j < i) {
            if (!b0.a(get(j), list.get(j)))
              return false; 
            j++;
            continue;
          } 
          return true;
        } 
      } 
      paramObject = (Object<E>)super.iterator();
      Iterator iterator = list.iterator();
      while (paramObject.hasNext()) {
        if (!iterator.hasNext())
          return false; 
        if (!b0.a(paramObject.next(), iterator.next()))
          return false; 
      } 
      if (iterator.hasNext())
        return false; 
    } 
    return true;
  }
  
  public final r6<E> h(int paramInt) {
    f4.b(paramInt, size(), "index");
    return (r6<E>)(isEmpty() ? d : new m6<E>(this, paramInt));
  }
  
  public final int hashCode() {
    int k = size();
    int j = 1;
    for (int i = 0; i < k; i++)
      j = j * 31 + get(i).hashCode(); 
    return j;
  }
  
  public final int indexOf(Object paramObject) {
    if (paramObject == null)
      return -1; 
    int j = size();
    for (int i = 0; i < j; i++) {
      if (paramObject.equals(get(i)))
        return i; 
    } 
    return -1;
  }
  
  public final int lastIndexOf(Object paramObject) {
    if (paramObject == null)
      return -1; 
    for (int i = size() - 1; i >= 0; i--) {
      if (paramObject.equals(get(i)))
        return i; 
    } 
    return -1;
  }
  
  @Deprecated
  public final E remove(int paramInt) {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final E set(int paramInt, E paramE) {
    throw new UnsupportedOperationException();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/j/o6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */