package b.d;

import java.util.ConcurrentModificationException;
import java.util.Map;

public class g<K, V> {
  static Object[] f;
  
  static int g;
  
  static Object[] h;
  
  static int i;
  
  int[] c;
  
  Object[] d;
  
  int e;
  
  public g() {
    this.c = c.a;
    this.d = c.c;
    this.e = 0;
  }
  
  public g(int paramInt) {
    if (paramInt == 0) {
      this.c = c.a;
      this.d = c.c;
    } else {
      e(paramInt);
    } 
    this.e = 0;
  }
  
  public g(g<K, V> paramg) {
    this();
    if (paramg != null)
      a(paramg); 
  }
  
  private static int a(int[] paramArrayOfint, int paramInt1, int paramInt2) {
    try {
      return c.a(paramArrayOfint, paramInt1, paramInt2);
    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
      throw new ConcurrentModificationException();
    } 
  }
  
  private static void a(int[] paramArrayOfint, Object[] paramArrayOfObject, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: arraylength
    //   2: bipush #8
    //   4: if_icmpne -> 59
    //   7: ldc b/d/g
    //   9: monitorenter
    //   10: getstatic b/d/g.i : I
    //   13: bipush #10
    //   15: if_icmpge -> 49
    //   18: aload_1
    //   19: iconst_0
    //   20: getstatic b/d/g.h : [Ljava/lang/Object;
    //   23: aastore
    //   24: aload_1
    //   25: iconst_1
    //   26: aload_0
    //   27: aastore
    //   28: iload_2
    //   29: iconst_1
    //   30: ishl
    //   31: iconst_1
    //   32: isub
    //   33: istore_2
    //   34: goto -> 118
    //   37: aload_1
    //   38: putstatic b/d/g.h : [Ljava/lang/Object;
    //   41: getstatic b/d/g.i : I
    //   44: iconst_1
    //   45: iadd
    //   46: putstatic b/d/g.i : I
    //   49: ldc b/d/g
    //   51: monitorexit
    //   52: return
    //   53: astore_0
    //   54: ldc b/d/g
    //   56: monitorexit
    //   57: aload_0
    //   58: athrow
    //   59: aload_0
    //   60: arraylength
    //   61: iconst_4
    //   62: if_icmpne -> 117
    //   65: ldc b/d/g
    //   67: monitorenter
    //   68: getstatic b/d/g.g : I
    //   71: bipush #10
    //   73: if_icmpge -> 107
    //   76: aload_1
    //   77: iconst_0
    //   78: getstatic b/d/g.f : [Ljava/lang/Object;
    //   81: aastore
    //   82: aload_1
    //   83: iconst_1
    //   84: aload_0
    //   85: aastore
    //   86: iload_2
    //   87: iconst_1
    //   88: ishl
    //   89: iconst_1
    //   90: isub
    //   91: istore_2
    //   92: goto -> 134
    //   95: aload_1
    //   96: putstatic b/d/g.f : [Ljava/lang/Object;
    //   99: getstatic b/d/g.g : I
    //   102: iconst_1
    //   103: iadd
    //   104: putstatic b/d/g.g : I
    //   107: ldc b/d/g
    //   109: monitorexit
    //   110: return
    //   111: astore_0
    //   112: ldc b/d/g
    //   114: monitorexit
    //   115: aload_0
    //   116: athrow
    //   117: return
    //   118: iload_2
    //   119: iconst_2
    //   120: if_icmplt -> 37
    //   123: aload_1
    //   124: iload_2
    //   125: aconst_null
    //   126: aastore
    //   127: iload_2
    //   128: iconst_1
    //   129: isub
    //   130: istore_2
    //   131: goto -> 118
    //   134: iload_2
    //   135: iconst_2
    //   136: if_icmplt -> 95
    //   139: aload_1
    //   140: iload_2
    //   141: aconst_null
    //   142: aastore
    //   143: iload_2
    //   144: iconst_1
    //   145: isub
    //   146: istore_2
    //   147: goto -> 134
    // Exception table:
    //   from	to	target	type
    //   10	24	53	finally
    //   37	49	53	finally
    //   49	52	53	finally
    //   54	57	53	finally
    //   68	82	111	finally
    //   95	107	111	finally
    //   107	110	111	finally
    //   112	115	111	finally
  }
  
  private void e(int paramInt) {
    // Byte code:
    //   0: iload_1
    //   1: bipush #8
    //   3: if_icmpne -> 75
    //   6: ldc b/d/g
    //   8: monitorenter
    //   9: getstatic b/d/g.h : [Ljava/lang/Object;
    //   12: ifnull -> 63
    //   15: getstatic b/d/g.h : [Ljava/lang/Object;
    //   18: astore_2
    //   19: aload_0
    //   20: aload_2
    //   21: putfield d : [Ljava/lang/Object;
    //   24: aload_2
    //   25: iconst_0
    //   26: aaload
    //   27: checkcast [Ljava/lang/Object;
    //   30: putstatic b/d/g.h : [Ljava/lang/Object;
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
    //   51: getstatic b/d/g.i : I
    //   54: iconst_1
    //   55: isub
    //   56: putstatic b/d/g.i : I
    //   59: ldc b/d/g
    //   61: monitorexit
    //   62: return
    //   63: ldc b/d/g
    //   65: monitorexit
    //   66: goto -> 149
    //   69: astore_2
    //   70: ldc b/d/g
    //   72: monitorexit
    //   73: aload_2
    //   74: athrow
    //   75: iload_1
    //   76: iconst_4
    //   77: if_icmpne -> 149
    //   80: ldc b/d/g
    //   82: monitorenter
    //   83: getstatic b/d/g.f : [Ljava/lang/Object;
    //   86: ifnull -> 137
    //   89: getstatic b/d/g.f : [Ljava/lang/Object;
    //   92: astore_2
    //   93: aload_0
    //   94: aload_2
    //   95: putfield d : [Ljava/lang/Object;
    //   98: aload_2
    //   99: iconst_0
    //   100: aaload
    //   101: checkcast [Ljava/lang/Object;
    //   104: putstatic b/d/g.f : [Ljava/lang/Object;
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
    //   125: getstatic b/d/g.g : I
    //   128: iconst_1
    //   129: isub
    //   130: putstatic b/d/g.g : I
    //   133: ldc b/d/g
    //   135: monitorexit
    //   136: return
    //   137: ldc b/d/g
    //   139: monitorexit
    //   140: goto -> 149
    //   143: astore_2
    //   144: ldc b/d/g
    //   146: monitorexit
    //   147: aload_2
    //   148: athrow
    //   149: aload_0
    //   150: iload_1
    //   151: newarray int
    //   153: putfield c : [I
    //   156: aload_0
    //   157: iload_1
    //   158: iconst_1
    //   159: ishl
    //   160: anewarray java/lang/Object
    //   163: putfield d : [Ljava/lang/Object;
    //   166: return
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
  
  int a() {
    int j = this.e;
    if (j == 0)
      return -1; 
    int k = a(this.c, j, 0);
    if (k < 0)
      return k; 
    if (this.d[k << 1] == null)
      return k; 
    int i;
    for (i = k + 1; i < j && this.c[i] == 0; i++) {
      if (this.d[i << 1] == null)
        return i; 
    } 
    for (j = k - 1; j >= 0 && this.c[j] == 0; j--) {
      if (this.d[j << 1] == null)
        return j; 
    } 
    return i ^ 0xFFFFFFFF;
  }
  
  public int a(Object paramObject) {
    return (paramObject == null) ? a() : a(paramObject, paramObject.hashCode());
  }
  
  int a(Object paramObject, int paramInt) {
    int j = this.e;
    if (j == 0)
      return -1; 
    int k = a(this.c, j, paramInt);
    if (k < 0)
      return k; 
    if (paramObject.equals(this.d[k << 1]))
      return k; 
    int i;
    for (i = k + 1; i < j && this.c[i] == paramInt; i++) {
      if (paramObject.equals(this.d[i << 1]))
        return i; 
    } 
    for (j = k - 1; j >= 0 && this.c[j] == paramInt; j--) {
      if (paramObject.equals(this.d[j << 1]))
        return j; 
    } 
    return i ^ 0xFFFFFFFF;
  }
  
  public V a(int paramInt, V paramV) {
    paramInt = (paramInt << 1) + 1;
    Object[] arrayOfObject = this.d;
    Object object = arrayOfObject[paramInt];
    arrayOfObject[paramInt] = paramV;
    return (V)object;
  }
  
  public void a(int paramInt) {
    int i = this.e;
    int[] arrayOfInt = this.c;
    if (arrayOfInt.length < paramInt) {
      Object[] arrayOfObject = this.d;
      e(paramInt);
      if (this.e > 0) {
        System.arraycopy(arrayOfInt, 0, this.c, 0, i);
        System.arraycopy(arrayOfObject, 0, this.d, 0, i << 1);
      } 
      a(arrayOfInt, arrayOfObject, i);
    } 
    if (this.e == i)
      return; 
    throw new ConcurrentModificationException();
  }
  
  public void a(g<? extends K, ? extends V> paramg) {
    int j = paramg.e;
    a(this.e + j);
    int k = this.e;
    int i = 0;
    if (k == 0) {
      if (j > 0) {
        System.arraycopy(paramg.c, 0, this.c, 0, j);
        System.arraycopy(paramg.d, 0, this.d, 0, j << 1);
        this.e = j;
        return;
      } 
    } else {
      while (i < j) {
        put(paramg.b(i), paramg.d(i));
        i++;
      } 
    } 
  }
  
  int b(Object paramObject) {
    int i = this.e * 2;
    Object[] arrayOfObject = this.d;
    if (paramObject == null) {
      for (int j = 1; j < i; j += 2) {
        if (arrayOfObject[j] == null)
          return j >> 1; 
      } 
    } else {
      for (int j = 1; j < i; j += 2) {
        if (paramObject.equals(arrayOfObject[j]))
          return j >> 1; 
      } 
    } 
    return -1;
  }
  
  public K b(int paramInt) {
    return (K)this.d[paramInt << 1];
  }
  
  public V c(int paramInt) {
    int i;
    Object[] arrayOfObject = this.d;
    int k = paramInt << 1;
    Object object = arrayOfObject[k + 1];
    int j = this.e;
    if (j <= 1) {
      a(this.c, arrayOfObject, j);
      this.c = c.a;
      this.d = c.c;
      i = 0;
    } else {
      int m = j - 1;
      int[] arrayOfInt = this.c;
      int n = arrayOfInt.length;
      i = 8;
      if (n > 8 && j < arrayOfInt.length / 3) {
        if (j > 8)
          i = j + (j >> 1); 
        arrayOfInt = this.c;
        Object[] arrayOfObject1 = this.d;
        e(i);
        if (j == this.e) {
          if (paramInt > 0) {
            System.arraycopy(arrayOfInt, 0, this.c, 0, paramInt);
            System.arraycopy(arrayOfObject1, 0, this.d, 0, k);
          } 
          i = m;
          if (paramInt < m) {
            i = paramInt + 1;
            int[] arrayOfInt1 = this.c;
            n = m - paramInt;
            System.arraycopy(arrayOfInt, i, arrayOfInt1, paramInt, n);
            System.arraycopy(arrayOfObject1, i << 1, this.d, k, n << 1);
            i = m;
          } 
        } else {
          throw new ConcurrentModificationException();
        } 
      } else {
        if (paramInt < m) {
          arrayOfInt = this.c;
          i = paramInt + 1;
          n = m - paramInt;
          System.arraycopy(arrayOfInt, i, arrayOfInt, paramInt, n);
          Object[] arrayOfObject2 = this.d;
          System.arraycopy(arrayOfObject2, i << 1, arrayOfObject2, k, n << 1);
        } 
        Object[] arrayOfObject1 = this.d;
        paramInt = m << 1;
        arrayOfObject1[paramInt] = null;
        arrayOfObject1[paramInt + 1] = null;
        i = m;
      } 
    } 
    if (j == this.e) {
      this.e = i;
      return (V)object;
    } 
    throw new ConcurrentModificationException();
  }
  
  public void clear() {
    int i = this.e;
    if (i > 0) {
      int[] arrayOfInt = this.c;
      Object[] arrayOfObject = this.d;
      this.c = c.a;
      this.d = c.c;
      this.e = 0;
      a(arrayOfInt, arrayOfObject, i);
    } 
    if (this.e <= 0)
      return; 
    throw new ConcurrentModificationException();
  }
  
  public boolean containsKey(Object paramObject) {
    return (a(paramObject) >= 0);
  }
  
  public boolean containsValue(Object paramObject) {
    return (b(paramObject) >= 0);
  }
  
  public V d(int paramInt) {
    return (V)this.d[(paramInt << 1) + 1];
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof g) {
      paramObject = paramObject;
      if (size() != paramObject.size())
        return false; 
      int i = 0;
      try {
        while (i < this.e) {
          K k = b(i);
          V v = d(i);
          Object object = paramObject.get(k);
          if (v == null) {
            if (object == null) {
              if (!paramObject.containsKey(k))
                return false; 
            } else {
              return false;
            } 
          } else {
            boolean bool = v.equals(object);
            if (!bool)
              return false; 
          } 
          i++;
        } 
        return true;
      } catch (NullPointerException|ClassCastException nullPointerException) {
        return false;
      } 
    } 
    if (nullPointerException instanceof Map) {
      Map map = (Map)nullPointerException;
      if (size() != map.size())
        return false; 
      int i = 0;
      try {
        while (i < this.e) {
          K k = b(i);
          V v = d(i);
          Object object = map.get(k);
          if (v == null) {
            if (object == null) {
              if (!map.containsKey(k))
                return false; 
            } else {
              return false;
            } 
          } else {
            boolean bool = v.equals(object);
            if (!bool)
              return false; 
          } 
          i++;
        } 
        return true;
      } catch (NullPointerException|ClassCastException nullPointerException1) {
        return false;
      } 
    } 
    return false;
  }
  
  public V get(Object paramObject) {
    return getOrDefault(paramObject, null);
  }
  
  public V getOrDefault(Object paramObject, V paramV) {
    int i = a(paramObject);
    if (i >= 0)
      paramV = (V)this.d[(i << 1) + 1]; 
    return paramV;
  }
  
  public int hashCode() {
    int[] arrayOfInt = this.c;
    Object[] arrayOfObject = this.d;
    int m = this.e;
    int j = 0;
    int k = 0;
    for (int i = 1; j < m; i += 2) {
      int n;
      Object object = arrayOfObject[i];
      int i1 = arrayOfInt[j];
      if (object == null) {
        n = 0;
      } else {
        n = object.hashCode();
      } 
      k += n ^ i1;
      j++;
    } 
    return k;
  }
  
  public boolean isEmpty() {
    return (this.e <= 0);
  }
  
  public V put(K paramK, V paramV) {
    Object[] arrayOfObject;
    int j;
    int k = this.e;
    if (paramK == null) {
      i = a();
      j = 0;
    } else {
      j = paramK.hashCode();
      i = a(paramK, j);
    } 
    if (i >= 0) {
      i = (i << 1) + 1;
      arrayOfObject = this.d;
      Object object = arrayOfObject[i];
      arrayOfObject[i] = paramV;
      return (V)object;
    } 
    int m = i ^ 0xFFFFFFFF;
    if (k >= this.c.length) {
      i = 4;
      if (k >= 8) {
        i = (k >> 1) + k;
      } else if (k >= 4) {
        i = 8;
      } 
      int[] arrayOfInt = this.c;
      Object[] arrayOfObject1 = this.d;
      e(i);
      if (k == this.e) {
        int[] arrayOfInt1 = this.c;
        if (arrayOfInt1.length > 0) {
          System.arraycopy(arrayOfInt, 0, arrayOfInt1, 0, arrayOfInt.length);
          System.arraycopy(arrayOfObject1, 0, this.d, 0, arrayOfObject1.length);
        } 
        a(arrayOfInt, arrayOfObject1, k);
      } else {
        throw new ConcurrentModificationException();
      } 
    } 
    if (m < k) {
      int[] arrayOfInt = this.c;
      i = m + 1;
      System.arraycopy(arrayOfInt, m, arrayOfInt, i, k - m);
      Object[] arrayOfObject1 = this.d;
      System.arraycopy(arrayOfObject1, m << 1, arrayOfObject1, i << 1, this.e - m << 1);
    } 
    int i = this.e;
    if (k == i) {
      int[] arrayOfInt = this.c;
      if (m < arrayOfInt.length) {
        arrayOfInt[m] = j;
        Object[] arrayOfObject1 = this.d;
        j = m << 1;
        arrayOfObject1[j] = arrayOfObject;
        arrayOfObject1[j + 1] = paramV;
        this.e = i + 1;
        return null;
      } 
    } 
    throw new ConcurrentModificationException();
  }
  
  public V putIfAbsent(K paramK, V paramV) {
    V v2 = get(paramK);
    V v1 = v2;
    if (v2 == null)
      v1 = put(paramK, paramV); 
    return v1;
  }
  
  public V remove(Object paramObject) {
    int i = a(paramObject);
    return (i >= 0) ? c(i) : null;
  }
  
  public boolean remove(Object paramObject1, Object paramObject2) {
    int i = a(paramObject1);
    if (i >= 0) {
      paramObject1 = d(i);
      if (paramObject2 == paramObject1 || (paramObject2 != null && paramObject2.equals(paramObject1))) {
        c(i);
        return true;
      } 
    } 
    return false;
  }
  
  public V replace(K paramK, V paramV) {
    int i = a(paramK);
    return (i >= 0) ? a(i, paramV) : null;
  }
  
  public boolean replace(K paramK, V paramV1, V paramV2) {
    int i = a(paramK);
    if (i >= 0) {
      paramK = (K)d(i);
      if (paramK == paramV1 || (paramV1 != null && paramV1.equals(paramK))) {
        a(i, paramV2);
        return true;
      } 
    } 
    return false;
  }
  
  public int size() {
    return this.e;
  }
  
  public String toString() {
    if (isEmpty())
      return "{}"; 
    StringBuilder stringBuilder = new StringBuilder(this.e * 28);
    stringBuilder.append('{');
    for (int i = 0; i < this.e; i++) {
      if (i > 0)
        stringBuilder.append(", "); 
      V v = (V)b(i);
      if (v != this) {
        stringBuilder.append(v);
      } else {
        stringBuilder.append("(this Map)");
      } 
      stringBuilder.append('=');
      v = d(i);
      if (v != this) {
        stringBuilder.append(v);
      } else {
        stringBuilder.append("(this Map)");
      } 
    } 
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/d/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */