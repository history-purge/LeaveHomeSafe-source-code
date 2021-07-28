package b.d;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class b<E> implements Collection<E>, Set<E> {
  private static final int[] g = new int[0];
  
  private static final Object[] h = new Object[0];
  
  private static Object[] i;
  
  private static int j;
  
  private static Object[] k;
  
  private static int l;
  
  private int[] c;
  
  Object[] d;
  
  int e;
  
  private f<E, E> f;
  
  public b() {
    this(0);
  }
  
  public b(int paramInt) {
    if (paramInt == 0) {
      this.c = g;
      this.d = h;
    } else {
      d(paramInt);
    } 
    this.e = 0;
  }
  
  private int a(Object paramObject, int paramInt) {
    int j = this.e;
    if (j == 0)
      return -1; 
    int k = c.a(this.c, j, paramInt);
    if (k < 0)
      return k; 
    if (paramObject.equals(this.d[k]))
      return k; 
    int i;
    for (i = k + 1; i < j && this.c[i] == paramInt; i++) {
      if (paramObject.equals(this.d[i]))
        return i; 
    } 
    for (j = k - 1; j >= 0 && this.c[j] == paramInt; j--) {
      if (paramObject.equals(this.d[j]))
        return j; 
    } 
    return i ^ 0xFFFFFFFF;
  }
  
  private f<E, E> a() {
    if (this.f == null)
      this.f = new a(this); 
    return this.f;
  }
  
  private static void a(int[] paramArrayOfint, Object[] paramArrayOfObject, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: arraylength
    //   2: bipush #8
    //   4: if_icmpne -> 57
    //   7: ldc b/d/b
    //   9: monitorenter
    //   10: getstatic b/d/b.l : I
    //   13: bipush #10
    //   15: if_icmpge -> 47
    //   18: aload_1
    //   19: iconst_0
    //   20: getstatic b/d/b.k : [Ljava/lang/Object;
    //   23: aastore
    //   24: aload_1
    //   25: iconst_1
    //   26: aload_0
    //   27: aastore
    //   28: iload_2
    //   29: iconst_1
    //   30: isub
    //   31: istore_2
    //   32: goto -> 114
    //   35: aload_1
    //   36: putstatic b/d/b.k : [Ljava/lang/Object;
    //   39: getstatic b/d/b.l : I
    //   42: iconst_1
    //   43: iadd
    //   44: putstatic b/d/b.l : I
    //   47: ldc b/d/b
    //   49: monitorexit
    //   50: return
    //   51: astore_0
    //   52: ldc b/d/b
    //   54: monitorexit
    //   55: aload_0
    //   56: athrow
    //   57: aload_0
    //   58: arraylength
    //   59: iconst_4
    //   60: if_icmpne -> 113
    //   63: ldc b/d/b
    //   65: monitorenter
    //   66: getstatic b/d/b.j : I
    //   69: bipush #10
    //   71: if_icmpge -> 103
    //   74: aload_1
    //   75: iconst_0
    //   76: getstatic b/d/b.i : [Ljava/lang/Object;
    //   79: aastore
    //   80: aload_1
    //   81: iconst_1
    //   82: aload_0
    //   83: aastore
    //   84: iload_2
    //   85: iconst_1
    //   86: isub
    //   87: istore_2
    //   88: goto -> 130
    //   91: aload_1
    //   92: putstatic b/d/b.i : [Ljava/lang/Object;
    //   95: getstatic b/d/b.j : I
    //   98: iconst_1
    //   99: iadd
    //   100: putstatic b/d/b.j : I
    //   103: ldc b/d/b
    //   105: monitorexit
    //   106: return
    //   107: astore_0
    //   108: ldc b/d/b
    //   110: monitorexit
    //   111: aload_0
    //   112: athrow
    //   113: return
    //   114: iload_2
    //   115: iconst_2
    //   116: if_icmplt -> 35
    //   119: aload_1
    //   120: iload_2
    //   121: aconst_null
    //   122: aastore
    //   123: iload_2
    //   124: iconst_1
    //   125: isub
    //   126: istore_2
    //   127: goto -> 114
    //   130: iload_2
    //   131: iconst_2
    //   132: if_icmplt -> 91
    //   135: aload_1
    //   136: iload_2
    //   137: aconst_null
    //   138: aastore
    //   139: iload_2
    //   140: iconst_1
    //   141: isub
    //   142: istore_2
    //   143: goto -> 130
    // Exception table:
    //   from	to	target	type
    //   10	24	51	finally
    //   35	47	51	finally
    //   47	50	51	finally
    //   52	55	51	finally
    //   66	80	107	finally
    //   91	103	107	finally
    //   103	106	107	finally
    //   108	111	107	finally
  }
  
  private int b() {
    int j = this.e;
    if (j == 0)
      return -1; 
    int k = c.a(this.c, j, 0);
    if (k < 0)
      return k; 
    if (this.d[k] == null)
      return k; 
    int i;
    for (i = k + 1; i < j && this.c[i] == 0; i++) {
      if (this.d[i] == null)
        return i; 
    } 
    for (j = k - 1; j >= 0 && this.c[j] == 0; j--) {
      if (this.d[j] == null)
        return j; 
    } 
    return i ^ 0xFFFFFFFF;
  }
  
  private void d(int paramInt) {
    // Byte code:
    //   0: iload_1
    //   1: bipush #8
    //   3: if_icmpne -> 75
    //   6: ldc b/d/b
    //   8: monitorenter
    //   9: getstatic b/d/b.k : [Ljava/lang/Object;
    //   12: ifnull -> 63
    //   15: getstatic b/d/b.k : [Ljava/lang/Object;
    //   18: astore_2
    //   19: aload_0
    //   20: aload_2
    //   21: putfield d : [Ljava/lang/Object;
    //   24: aload_2
    //   25: iconst_0
    //   26: aaload
    //   27: checkcast [Ljava/lang/Object;
    //   30: putstatic b/d/b.k : [Ljava/lang/Object;
    //   33: aload_0
    //   34: aload_2
    //   35: iconst_1
    //   36: aaload
    //   37: checkcast [I
    //   40: putfield c : [I
    //   43: aload_2
    //   44: iconst_1
    //   45: aconst_null
    //   46: aastore
    //   47: aload_2
    //   48: iconst_0
    //   49: aconst_null
    //   50: aastore
    //   51: getstatic b/d/b.l : I
    //   54: iconst_1
    //   55: isub
    //   56: putstatic b/d/b.l : I
    //   59: ldc b/d/b
    //   61: monitorexit
    //   62: return
    //   63: ldc b/d/b
    //   65: monitorexit
    //   66: goto -> 149
    //   69: astore_2
    //   70: ldc b/d/b
    //   72: monitorexit
    //   73: aload_2
    //   74: athrow
    //   75: iload_1
    //   76: iconst_4
    //   77: if_icmpne -> 149
    //   80: ldc b/d/b
    //   82: monitorenter
    //   83: getstatic b/d/b.i : [Ljava/lang/Object;
    //   86: ifnull -> 137
    //   89: getstatic b/d/b.i : [Ljava/lang/Object;
    //   92: astore_2
    //   93: aload_0
    //   94: aload_2
    //   95: putfield d : [Ljava/lang/Object;
    //   98: aload_2
    //   99: iconst_0
    //   100: aaload
    //   101: checkcast [Ljava/lang/Object;
    //   104: putstatic b/d/b.i : [Ljava/lang/Object;
    //   107: aload_0
    //   108: aload_2
    //   109: iconst_1
    //   110: aaload
    //   111: checkcast [I
    //   114: putfield c : [I
    //   117: aload_2
    //   118: iconst_1
    //   119: aconst_null
    //   120: aastore
    //   121: aload_2
    //   122: iconst_0
    //   123: aconst_null
    //   124: aastore
    //   125: getstatic b/d/b.j : I
    //   128: iconst_1
    //   129: isub
    //   130: putstatic b/d/b.j : I
    //   133: ldc b/d/b
    //   135: monitorexit
    //   136: return
    //   137: ldc b/d/b
    //   139: monitorexit
    //   140: goto -> 149
    //   143: astore_2
    //   144: ldc b/d/b
    //   146: monitorexit
    //   147: aload_2
    //   148: athrow
    //   149: aload_0
    //   150: iload_1
    //   151: newarray int
    //   153: putfield c : [I
    //   156: aload_0
    //   157: iload_1
    //   158: anewarray java/lang/Object
    //   161: putfield d : [Ljava/lang/Object;
    //   164: return
    // Exception table:
    //   from	to	target	type
    //   9	43	69	finally
    //   51	62	69	finally
    //   63	66	69	finally
    //   70	73	69	finally
    //   83	117	143	finally
    //   125	136	143	finally
    //   137	140	143	finally
    //   144	147	143	finally
  }
  
  public void a(int paramInt) {
    int[] arrayOfInt = this.c;
    if (arrayOfInt.length < paramInt) {
      Object[] arrayOfObject = this.d;
      d(paramInt);
      paramInt = this.e;
      if (paramInt > 0) {
        System.arraycopy(arrayOfInt, 0, this.c, 0, paramInt);
        System.arraycopy(arrayOfObject, 0, this.d, 0, this.e);
      } 
      a(arrayOfInt, arrayOfObject, this.e);
    } 
  }
  
  public boolean add(E paramE) {
    int j;
    if (paramE == null) {
      i = b();
      j = 0;
    } else {
      j = paramE.hashCode();
      i = a(paramE, j);
    } 
    if (i >= 0)
      return false; 
    int k = i ^ 0xFFFFFFFF;
    int m = this.e;
    if (m >= this.c.length) {
      i = 4;
      if (m >= 8) {
        i = (m >> 1) + m;
      } else if (m >= 4) {
        i = 8;
      } 
      int[] arrayOfInt1 = this.c;
      Object[] arrayOfObject = this.d;
      d(i);
      int[] arrayOfInt2 = this.c;
      if (arrayOfInt2.length > 0) {
        System.arraycopy(arrayOfInt1, 0, arrayOfInt2, 0, arrayOfInt1.length);
        System.arraycopy(arrayOfObject, 0, this.d, 0, arrayOfObject.length);
      } 
      a(arrayOfInt1, arrayOfObject, this.e);
    } 
    int i = this.e;
    if (k < i) {
      int[] arrayOfInt = this.c;
      m = k + 1;
      System.arraycopy(arrayOfInt, k, arrayOfInt, m, i - k);
      Object[] arrayOfObject = this.d;
      System.arraycopy(arrayOfObject, k, arrayOfObject, m, this.e - k);
    } 
    this.c[k] = j;
    this.d[k] = paramE;
    this.e++;
    return true;
  }
  
  public boolean addAll(Collection<? extends E> paramCollection) {
    a(this.e + paramCollection.size());
    Iterator<? extends E> iterator = paramCollection.iterator();
    boolean bool;
    for (bool = false; iterator.hasNext(); bool |= add(iterator.next()));
    return bool;
  }
  
  public E b(int paramInt) {
    Object[] arrayOfObject = this.d;
    Object object = arrayOfObject[paramInt];
    int j = this.e;
    if (j <= 1) {
      a(this.c, arrayOfObject, j);
      this.c = g;
      this.d = h;
      this.e = 0;
      return (E)object;
    } 
    int[] arrayOfInt = this.c;
    int k = arrayOfInt.length;
    int i = 8;
    if (k > 8 && j < arrayOfInt.length / 3) {
      if (j > 8)
        i = j + (j >> 1); 
      arrayOfInt = this.c;
      Object[] arrayOfObject1 = this.d;
      d(i);
      this.e--;
      if (paramInt > 0) {
        System.arraycopy(arrayOfInt, 0, this.c, 0, paramInt);
        System.arraycopy(arrayOfObject1, 0, this.d, 0, paramInt);
      } 
      i = this.e;
      if (paramInt < i) {
        j = paramInt + 1;
        System.arraycopy(arrayOfInt, j, this.c, paramInt, i - paramInt);
        System.arraycopy(arrayOfObject1, j, this.d, paramInt, this.e - paramInt);
        return (E)object;
      } 
    } else {
      i = --this.e;
      if (paramInt < i) {
        arrayOfInt = this.c;
        j = paramInt + 1;
        System.arraycopy(arrayOfInt, j, arrayOfInt, paramInt, i - paramInt);
        Object[] arrayOfObject1 = this.d;
        System.arraycopy(arrayOfObject1, j, arrayOfObject1, paramInt, this.e - paramInt);
      } 
      this.d[this.e] = null;
    } 
    return (E)object;
  }
  
  public E c(int paramInt) {
    return (E)this.d[paramInt];
  }
  
  public void clear() {
    int i = this.e;
    if (i != 0) {
      a(this.c, this.d, i);
      this.c = g;
      this.d = h;
      this.e = 0;
    } 
  }
  
  public boolean contains(Object paramObject) {
    return (indexOf(paramObject) >= 0);
  }
  
  public boolean containsAll(Collection<?> paramCollection) {
    Iterator<?> iterator = paramCollection.iterator();
    while (iterator.hasNext()) {
      if (!contains(iterator.next()))
        return false; 
    } 
    return true;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof Set) {
      paramObject = paramObject;
      if (size() != paramObject.size())
        return false; 
      int i = 0;
      try {
        while (i < this.e) {
          boolean bool = paramObject.contains(c(i));
          if (!bool)
            return false; 
          i++;
        } 
        return true;
      } catch (NullPointerException|ClassCastException nullPointerException) {
        return false;
      } 
    } 
    return false;
  }
  
  public int hashCode() {
    int[] arrayOfInt = this.c;
    int k = this.e;
    int i = 0;
    int j = 0;
    while (i < k) {
      j += arrayOfInt[i];
      i++;
    } 
    return j;
  }
  
  public int indexOf(Object paramObject) {
    return (paramObject == null) ? b() : a(paramObject, paramObject.hashCode());
  }
  
  public boolean isEmpty() {
    return (this.e <= 0);
  }
  
  public Iterator<E> iterator() {
    return a().e().iterator();
  }
  
  public boolean remove(Object paramObject) {
    int i = indexOf(paramObject);
    if (i >= 0) {
      b(i);
      return true;
    } 
    return false;
  }
  
  public boolean removeAll(Collection<?> paramCollection) {
    Iterator<?> iterator = paramCollection.iterator();
    boolean bool;
    for (bool = false; iterator.hasNext(); bool |= remove(iterator.next()));
    return bool;
  }
  
  public boolean retainAll(Collection<?> paramCollection) {
    int i = this.e - 1;
    boolean bool = false;
    while (i >= 0) {
      if (!paramCollection.contains(this.d[i])) {
        b(i);
        bool = true;
      } 
      i--;
    } 
    return bool;
  }
  
  public int size() {
    return this.e;
  }
  
  public Object[] toArray() {
    int i = this.e;
    Object[] arrayOfObject = new Object[i];
    System.arraycopy(this.d, 0, arrayOfObject, 0, i);
    return arrayOfObject;
  }
  
  public <T> T[] toArray(T[] paramArrayOfT) {
    T[] arrayOfT = paramArrayOfT;
    if (paramArrayOfT.length < this.e)
      arrayOfT = (T[])Array.newInstance(paramArrayOfT.getClass().getComponentType(), this.e); 
    System.arraycopy(this.d, 0, arrayOfT, 0, this.e);
    int i = arrayOfT.length;
    int j = this.e;
    if (i > j)
      arrayOfT[j] = null; 
    return arrayOfT;
  }
  
  public String toString() {
    if (isEmpty())
      return "{}"; 
    StringBuilder stringBuilder = new StringBuilder(this.e * 14);
    stringBuilder.append('{');
    for (int i = 0; i < this.e; i++) {
      if (i > 0)
        stringBuilder.append(", "); 
      E e = c(i);
      if (e != this) {
        stringBuilder.append(e);
      } else {
        stringBuilder.append("(this Set)");
      } 
    } 
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
  
  class a extends f<E, E> {
    a(b this$0) {}
    
    protected int a(Object param1Object) {
      return this.d.indexOf(param1Object);
    }
    
    protected Object a(int param1Int1, int param1Int2) {
      return this.d.d[param1Int1];
    }
    
    protected E a(int param1Int, E param1E) {
      throw new UnsupportedOperationException("not a map");
    }
    
    protected void a() {
      this.d.clear();
    }
    
    protected void a(int param1Int) {
      this.d.b(param1Int);
    }
    
    protected void a(E param1E1, E param1E2) {
      this.d.add(param1E1);
    }
    
    protected int b(Object param1Object) {
      return this.d.indexOf(param1Object);
    }
    
    protected Map<E, E> b() {
      throw new UnsupportedOperationException("not a map");
    }
    
    protected int c() {
      return this.d.e;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */