package e.g.a;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class a<E> extends AbstractCollection<E> implements k<E>, Cloneable, Serializable {
  private static final long serialVersionUID = 2340985798034038923L;
  
  private transient Object[] c = new Object[16];
  
  private transient int d;
  
  private transient int e;
  
  private void a() {}
  
  private void a(int paramInt) {
    int i = 8;
    if (paramInt >= 8) {
      paramInt |= paramInt >>> 1;
      paramInt |= paramInt >>> 2;
      paramInt |= paramInt >>> 4;
      paramInt |= paramInt >>> 8;
      paramInt = (paramInt | paramInt >>> 16) + 1;
      i = paramInt;
      if (paramInt < 0)
        i = paramInt >>> 1; 
    } 
    this.c = new Object[i];
  }
  
  private <T> T[] a(T[] paramArrayOfT) {
    int i = this.d;
    int j = this.e;
    if (i < j) {
      System.arraycopy(this.c, i, paramArrayOfT, 0, size());
      return paramArrayOfT;
    } 
    if (i > j) {
      Object[] arrayOfObject = this.c;
      j = arrayOfObject.length - i;
      System.arraycopy(arrayOfObject, i, paramArrayOfT, 0, j);
      System.arraycopy(this.c, 0, paramArrayOfT, j, this.e);
    } 
    return paramArrayOfT;
  }
  
  private void b() {
    int i = this.d;
    Object[] arrayOfObject = this.c;
    int j = arrayOfObject.length;
    int m = j - i;
    int n = j << 1;
    if (n >= 0) {
      Object[] arrayOfObject1 = new Object[n];
      System.arraycopy(arrayOfObject, i, arrayOfObject1, 0, m);
      System.arraycopy(this.c, 0, arrayOfObject1, m, i);
      this.c = arrayOfObject1;
      this.d = 0;
      this.e = j;
      return;
    } 
    throw new IllegalStateException("Sorry, deque too big");
  }
  
  private boolean b(int paramInt) {
    a();
    Object[] arrayOfObject = this.c;
    int i = arrayOfObject.length - 1;
    int j = this.d;
    int m = this.e;
    int n = paramInt - j & i;
    int i1 = m - paramInt & i;
    if (n < (m - j & i)) {
      if (n < i1) {
        if (j <= paramInt) {
          System.arraycopy(arrayOfObject, j, arrayOfObject, j + 1, n);
        } else {
          System.arraycopy(arrayOfObject, 0, arrayOfObject, 1, paramInt);
          arrayOfObject[0] = arrayOfObject[i];
          System.arraycopy(arrayOfObject, j, arrayOfObject, j + 1, i - j);
        } 
        arrayOfObject[j] = null;
        this.d = j + 1 & i;
        return false;
      } 
      if (paramInt < m) {
        System.arraycopy(arrayOfObject, paramInt + 1, arrayOfObject, paramInt, i1);
        this.e = m - 1;
        return true;
      } 
      System.arraycopy(arrayOfObject, paramInt + 1, arrayOfObject, paramInt, i - paramInt);
      arrayOfObject[i] = arrayOfObject[0];
      System.arraycopy(arrayOfObject, 1, arrayOfObject, 0, m);
      this.e = m - 1 & i;
      return true;
    } 
    throw new ConcurrentModificationException();
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) {
    paramObjectInputStream.defaultReadObject();
    int j = paramObjectInputStream.readInt();
    a(j);
    int i = 0;
    this.d = 0;
    this.e = j;
    while (i < j) {
      this.c[i] = paramObjectInputStream.readObject();
      i++;
    } 
  }
  
  private void writeObject(ObjectOutputStream paramObjectOutputStream) {
    paramObjectOutputStream.defaultWriteObject();
    paramObjectOutputStream.writeInt(size());
    int j = this.c.length;
    for (int i = this.d; i != this.e; i = i + 1 & j - 1)
      paramObjectOutputStream.writeObject(this.c[i]); 
  }
  
  public boolean add(E paramE) {
    addLast(paramE);
    return true;
  }
  
  public void addFirst(E paramE) {
    if (paramE != null) {
      Object[] arrayOfObject = this.c;
      int i = this.d - 1 & arrayOfObject.length - 1;
      this.d = i;
      arrayOfObject[i] = paramE;
      if (this.d == this.e)
        b(); 
      return;
    } 
    throw new NullPointerException("e == null");
  }
  
  public void addLast(E paramE) {
    if (paramE != null) {
      Object[] arrayOfObject = this.c;
      int i = this.e;
      arrayOfObject[i] = paramE;
      i = arrayOfObject.length - 1 & i + 1;
      this.e = i;
      if (i == this.d)
        b(); 
      return;
    } 
    throw new NullPointerException("e == null");
  }
  
  public void clear() {
    int i = this.d;
    int j = this.e;
    if (i != j) {
      int m;
      this.e = 0;
      this.d = 0;
      int n = this.c.length;
      do {
        this.c[i] = null;
        m = i + 1 & n - 1;
        i = m;
      } while (m != j);
    } 
  }
  
  public a<E> clone() {
    try {
      a<E> a1 = (a)super.clone();
      System.arraycopy(this.c, 0, a1.c, 0, this.c.length);
      return a1;
    } catch (CloneNotSupportedException cloneNotSupportedException) {
      throw new AssertionError();
    } 
  }
  
  public boolean contains(Object paramObject) {
    if (paramObject == null)
      return false; 
    int j = this.c.length;
    int i = this.d;
    while (true) {
      Object object = this.c[i];
      if (object != null) {
        if (paramObject.equals(object))
          return true; 
        i = i + 1 & j - 1;
        continue;
      } 
      return false;
    } 
  }
  
  public E element() {
    return getFirst();
  }
  
  public E getFirst() {
    Object object = this.c[this.d];
    if (object != null)
      return (E)object; 
    throw new NoSuchElementException();
  }
  
  public E getLast() {
    Object[] arrayOfObject = this.c;
    Object object = arrayOfObject[this.e - 1 & arrayOfObject.length - 1];
    if (object != null)
      return (E)object; 
    throw new NoSuchElementException();
  }
  
  public boolean isEmpty() {
    return (this.d == this.e);
  }
  
  public Iterator<E> iterator() {
    return new b(null);
  }
  
  public boolean offer(E paramE) {
    return offerLast(paramE);
  }
  
  public boolean offerLast(E paramE) {
    addLast(paramE);
    return true;
  }
  
  public E peek() {
    return peekFirst();
  }
  
  public E peekFirst() {
    return (E)this.c[this.d];
  }
  
  public E poll() {
    return pollFirst();
  }
  
  public E pollFirst() {
    int i = this.d;
    Object[] arrayOfObject = this.c;
    Object object = arrayOfObject[i];
    if (object == null)
      return null; 
    arrayOfObject[i] = null;
    this.d = i + 1 & arrayOfObject.length - 1;
    return (E)object;
  }
  
  public E remove() {
    return removeFirst();
  }
  
  public boolean remove(Object paramObject) {
    return removeFirstOccurrence(paramObject);
  }
  
  public E removeFirst() {
    E e = pollFirst();
    if (e != null)
      return e; 
    throw new NoSuchElementException();
  }
  
  public boolean removeFirstOccurrence(Object paramObject) {
    if (paramObject == null)
      return false; 
    int j = this.c.length;
    int i = this.d;
    while (true) {
      Object object = this.c[i];
      if (object != null) {
        if (paramObject.equals(object)) {
          b(i);
          return true;
        } 
        i = i + 1 & j - 1;
        continue;
      } 
      return false;
    } 
  }
  
  public int size() {
    return this.e - this.d & this.c.length - 1;
  }
  
  public Object[] toArray() {
    Object[] arrayOfObject = new Object[size()];
    a(arrayOfObject);
    return arrayOfObject;
  }
  
  public <T> T[] toArray(T[] paramArrayOfT) {
    int i = size();
    T[] arrayOfT = paramArrayOfT;
    if (paramArrayOfT.length < i)
      arrayOfT = (T[])Array.newInstance(paramArrayOfT.getClass().getComponentType(), i); 
    a(arrayOfT);
    if (arrayOfT.length > i)
      arrayOfT[i] = null; 
    return arrayOfT;
  }
  
  private class b implements Iterator<E> {
    private int c = a.a(this.f);
    
    private int d = a.b(this.f);
    
    private int e = -1;
    
    private b(a this$0) {}
    
    public boolean hasNext() {
      return (this.c != this.d);
    }
    
    public E next() {
      if (this.c != this.d) {
        Object object = a.c(this.f)[this.c];
        if (a.b(this.f) == this.d && object != null) {
          int i = this.c;
          this.e = i;
          this.c = i + 1 & (a.c(this.f)).length - 1;
          return (E)object;
        } 
        throw new ConcurrentModificationException();
      } 
      throw new NoSuchElementException();
    }
    
    public void remove() {
      int i = this.e;
      if (i >= 0) {
        if (a.a(this.f, i)) {
          this.c = this.c - 1 & (a.c(this.f)).length - 1;
          this.d = a.b(this.f);
        } 
        this.e = -1;
        return;
      } 
      throw new IllegalStateException();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/g/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */