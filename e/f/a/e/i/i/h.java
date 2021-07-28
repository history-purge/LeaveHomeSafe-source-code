package e.f.a.e.i.i;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public abstract class h<E> extends e<E> implements List<E>, RandomAccess {
  private static final k<Object> d = new f(i.g, 0);
  
  public static <E> h<E> a(E paramE1, E paramE2, E paramE3, E paramE4, E paramE5, E paramE6, E paramE7, E paramE8, E paramE9) {
    Object[] arrayOfObject = new Object[9];
    int i = 0;
    arrayOfObject[0] = paramE1;
    arrayOfObject[1] = paramE2;
    arrayOfObject[2] = paramE3;
    arrayOfObject[3] = paramE4;
    arrayOfObject[4] = paramE5;
    arrayOfObject[5] = paramE6;
    arrayOfObject[6] = paramE7;
    arrayOfObject[7] = paramE8;
    arrayOfObject[8] = paramE9;
    while (i < 9) {
      if (arrayOfObject[i] != null) {
        i++;
        continue;
      } 
      StringBuilder stringBuilder = new StringBuilder(20);
      stringBuilder.append("at index ");
      stringBuilder.append(i);
      throw new NullPointerException(stringBuilder.toString());
    } 
    return b(arrayOfObject, 9);
  }
  
  static <E> h<E> b(Object[] paramArrayOfObject, int paramInt) {
    return (h<E>)((paramInt == 0) ? i.g : new i<E>(paramArrayOfObject, paramInt));
  }
  
  int a(Object[] paramArrayOfObject, int paramInt) {
    int i = size();
    for (paramInt = 0; paramInt < i; paramInt++)
      paramArrayOfObject[paramInt] = get(paramInt); 
    return i;
  }
  
  public h<E> a(int paramInt1, int paramInt2) {
    k0.a(paramInt1, paramInt2, size());
    paramInt2 -= paramInt1;
    return (paramInt2 == size()) ? this : ((paramInt2 == 0) ? i.g : new g(this, paramInt1, paramInt2));
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
            if (!j0.a(get(j), list.get(j)))
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
        if (!j0.a(paramObject.next(), iterator.next()))
          return false; 
      } 
      if (iterator.hasNext())
        return false; 
    } 
    return true;
  }
  
  public final k<E> h(int paramInt) {
    k0.b(paramInt, size(), "index");
    return (k<E>)(isEmpty() ? d : new f<E>(this, paramInt));
  }
  
  public final int hashCode() {
    int m = size();
    int j = 1;
    for (int i = 0; i < m; i++)
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


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/i/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */