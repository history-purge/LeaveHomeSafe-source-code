package net.time4j.e1.a0;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import net.time4j.d1.p;
import net.time4j.d1.r;
import net.time4j.f0;
import net.time4j.g0;

class v extends t<v> {
  private static final Set<p<?>> m;
  
  private Object[] c;
  
  private Object[] d;
  
  private Map<p<?>, Object> e;
  
  private int[] f;
  
  private int g;
  
  private int h;
  
  private int i;
  
  private int j;
  
  private boolean k;
  
  private int l;
  
  static {
    HashSet<net.time4j.c> hashSet = new HashSet();
    hashSet.add(f0.r);
    hashSet.add(f0.v);
    hashSet.add(f0.w);
    hashSet.add(g0.w);
    hashSet.add(g0.y);
    hashSet.add(g0.A);
    hashSet.add(g0.E);
    m = Collections.unmodifiableSet(hashSet);
  }
  
  v(int paramInt, boolean paramBoolean) {
    boolean bool = false;
    this.k = false;
    this.l = -1;
    if (paramBoolean) {
      this.g = Integer.MIN_VALUE;
      this.h = Integer.MIN_VALUE;
      this.i = Integer.MIN_VALUE;
      this.j = Integer.MIN_VALUE;
      this.c = null;
      this.d = null;
      this.f = new int[3];
      for (paramInt = bool; paramInt < 3; paramInt++)
        this.f[paramInt] = Integer.MIN_VALUE; 
    } else {
      this.g = g(paramInt);
      paramInt = this.g;
      this.h = paramInt - 1;
      this.i = i(paramInt);
      paramInt = this.g;
      this.c = new Object[paramInt];
      this.d = null;
      this.f = new int[paramInt];
      this.j = 0;
    } 
    this.e = null;
  }
  
  private void b(Object paramObject) {
    Map<p<?>, Object> map1;
    Object[] arrayOfObject = this.c;
    if (arrayOfObject == null) {
      if (paramObject == f0.r) {
        this.f[0] = Integer.MIN_VALUE;
        return;
      } 
      if (paramObject == f0.v) {
        this.f[1] = Integer.MIN_VALUE;
        return;
      } 
      if (paramObject == f0.w) {
        this.f[2] = Integer.MIN_VALUE;
        return;
      } 
      if (paramObject == g0.w) {
        this.g = Integer.MIN_VALUE;
        return;
      } 
      if (paramObject == g0.y) {
        this.h = Integer.MIN_VALUE;
        return;
      } 
      if (paramObject == g0.A) {
        this.i = Integer.MIN_VALUE;
        return;
      } 
      if (paramObject == g0.E) {
        this.j = Integer.MIN_VALUE;
        return;
      } 
      map1 = this.e;
      if (map1 != null)
        map1.remove(paramObject); 
      return;
    } 
    int j = j(paramObject.hashCode()) & this.h;
    Map<p<?>, Object> map2 = map1[j];
    if (map2 == null)
      return; 
    int i = j;
    if (paramObject.equals(map2)) {
      m(j);
      return;
    } 
    while (true) {
      j = i + 1 & this.h;
      map2 = map1[j];
      if (map2 == null)
        return; 
      i = j;
      if (paramObject.equals(map2)) {
        m(j);
        return;
      } 
    } 
  }
  
  private static int g(int paramInt) {
    return Math.max(2, k((int)Math.ceil((paramInt / 0.75F))));
  }
  
  private int g(p<?> paramp) {
    Map<p<?>, Object> map1;
    Object[] arrayOfObject = this.c;
    if (arrayOfObject == null) {
      if (paramp == f0.r)
        return this.f[0]; 
      if (paramp == f0.v)
        return this.f[1]; 
      if (paramp == f0.w)
        return this.f[2]; 
      if (paramp == g0.w)
        return this.g; 
      if (paramp == g0.y)
        return this.h; 
      if (paramp == g0.A)
        return this.i; 
      if (paramp == g0.E)
        return this.j; 
      map1 = this.e;
      return (map1 != null && map1.containsKey(paramp)) ? ((Integer)Integer.class.cast(map1.get(paramp))).intValue() : Integer.MIN_VALUE;
    } 
    int j = j(paramp.hashCode()) & this.h;
    Map<p<?>, Object> map2 = map1[j];
    if (map2 == null)
      return Integer.MIN_VALUE; 
    int i = j;
    if (paramp.equals(map2))
      return this.f[j]; 
    while (true) {
      j = i + 1 & this.h;
      map2 = map1[j];
      if (map2 == null)
        return Integer.MIN_VALUE; 
      i = j;
      if (paramp.equals(map2))
        return this.f[j]; 
    } 
  }
  
  private static p<Integer> h(int paramInt) {
    StringBuilder stringBuilder;
    switch (paramInt) {
      default:
        stringBuilder = new StringBuilder();
        stringBuilder.append("No element index: ");
        stringBuilder.append(paramInt);
        throw new IllegalStateException(stringBuilder.toString());
      case 6:
        return (p<Integer>)g0.E;
      case 5:
        return (p<Integer>)g0.A;
      case 4:
        return (p<Integer>)g0.y;
      case 3:
        return (p<Integer>)g0.w;
      case 2:
        return (p<Integer>)f0.w;
      case 1:
        return (p<Integer>)f0.v;
      case 0:
        break;
    } 
    return (p<Integer>)f0.r;
  }
  
  static boolean h(p<?> paramp) {
    return m.contains(paramp);
  }
  
  private static int i(int paramInt) {
    return Math.min((int)Math.ceil((paramInt * 0.75F)), paramInt - 1);
  }
  
  private static int j(int paramInt) {
    paramInt *= -1640531527;
    return paramInt ^ paramInt >>> 16;
  }
  
  private static int k(int paramInt) {
    if (paramInt == 0)
      return 1; 
    paramInt = --paramInt | paramInt >> 1;
    paramInt |= paramInt >> 2;
    paramInt |= paramInt >> 4;
    paramInt |= paramInt >> 8;
    return (paramInt | paramInt >> 16) + 1;
  }
  
  private void l(int paramInt) {
    Object[] arrayOfObject1;
    Object[] arrayOfObject2 = this.c;
    Object[] arrayOfObject3 = this.d;
    int[] arrayOfInt1 = this.f;
    int k = paramInt - 1;
    Object[] arrayOfObject4 = new Object[paramInt];
    if (arrayOfObject3 == null) {
      arrayOfObject1 = null;
    } else {
      arrayOfObject1 = new Object[paramInt];
    } 
    int[] arrayOfInt2 = new int[paramInt];
    int i = this.g;
    int j = 0;
    int m = this.j;
    while (j < m) {
      int n;
      while (true) {
        if (arrayOfObject2[--i] == null)
          continue; 
        int i1 = j(arrayOfObject2[i].hashCode()) & k;
        n = i1;
        if (arrayOfObject4[i1] != null)
          while (true) {
            i1 = i1 + 1 & k;
            n = i1;
            if (arrayOfObject4[i1] != null)
              continue; 
            break;
          }  
        arrayOfObject4[n] = arrayOfObject2[i];
        if (arrayOfObject3 != null)
          arrayOfObject1[n] = arrayOfObject3[i]; 
        break;
      } 
      arrayOfInt2[n] = arrayOfInt1[i];
      j++;
    } 
    this.g = paramInt;
    this.h = k;
    this.i = i(paramInt);
    this.c = arrayOfObject4;
    this.d = arrayOfObject1;
    this.f = arrayOfInt2;
  }
  
  private void m(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: getfield j : I
    //   5: iconst_1
    //   6: isub
    //   7: putfield j : I
    //   10: aload_0
    //   11: getfield c : [Ljava/lang/Object;
    //   14: astore #4
    //   16: iload_1
    //   17: iconst_1
    //   18: iadd
    //   19: istore_2
    //   20: iload_2
    //   21: aload_0
    //   22: getfield h : I
    //   25: iand
    //   26: istore_2
    //   27: aload #4
    //   29: iload_2
    //   30: aaload
    //   31: astore #5
    //   33: aload #5
    //   35: ifnonnull -> 44
    //   38: aload #4
    //   40: iload_1
    //   41: aconst_null
    //   42: aastore
    //   43: return
    //   44: aload #5
    //   46: invokevirtual hashCode : ()I
    //   49: invokestatic j : (I)I
    //   52: aload_0
    //   53: getfield h : I
    //   56: iand
    //   57: istore_3
    //   58: iload_1
    //   59: iload_2
    //   60: if_icmpgt -> 76
    //   63: iload_1
    //   64: iload_3
    //   65: if_icmpge -> 86
    //   68: iload_3
    //   69: iload_2
    //   70: if_icmple -> 130
    //   73: goto -> 86
    //   76: iload_1
    //   77: iload_3
    //   78: if_icmplt -> 130
    //   81: iload_3
    //   82: iload_2
    //   83: if_icmple -> 130
    //   86: aload #4
    //   88: iload_1
    //   89: aload #5
    //   91: aastore
    //   92: aload_0
    //   93: getfield d : [Ljava/lang/Object;
    //   96: astore #5
    //   98: aload #5
    //   100: ifnull -> 111
    //   103: aload #5
    //   105: iload_1
    //   106: aload #5
    //   108: iload_2
    //   109: aaload
    //   110: aastore
    //   111: aload_0
    //   112: getfield f : [I
    //   115: astore #5
    //   117: aload #5
    //   119: iload_1
    //   120: aload #5
    //   122: iload_2
    //   123: iaload
    //   124: iastore
    //   125: iload_2
    //   126: istore_1
    //   127: goto -> 16
    //   130: iload_2
    //   131: iconst_1
    //   132: iadd
    //   133: istore_2
    //   134: goto -> 20
  }
  
  public int a(p<Integer> paramp) {
    return g(paramp);
  }
  
  void a(Object paramObject) {}
  
  void a(v paramv) {
    Map<p<?>, Object> map;
    Object[] arrayOfObject = this.c;
    int i = 0;
    int j = 0;
    if (arrayOfObject == null) {
      i = paramv.g;
      if (i != Integer.MIN_VALUE) {
        int m = this.g;
        if (m == Integer.MIN_VALUE || this.k || m == i) {
          this.g = i;
        } else {
          throw new a(g0.w);
        } 
      } 
      i = paramv.h;
      if (i != Integer.MIN_VALUE) {
        int m = this.h;
        if (m == Integer.MIN_VALUE || this.k || m == i) {
          this.h = i;
        } else {
          throw new a(g0.y);
        } 
      } 
      i = paramv.i;
      if (i != Integer.MIN_VALUE) {
        int m = this.i;
        if (m == Integer.MIN_VALUE || this.k || m == i) {
          this.i = i;
        } else {
          throw new a(g0.A);
        } 
      } 
      int k = paramv.j;
      i = j;
      if (k != Integer.MIN_VALUE) {
        i = this.j;
        if (i == Integer.MIN_VALUE || this.k || i == k) {
          this.j = k;
          i = j;
        } else {
          throw new a(g0.E);
        } 
      } 
      while (i < 3) {
        j = paramv.f[i];
        if (j != Integer.MIN_VALUE) {
          int[] arrayOfInt = this.f;
          if (arrayOfInt[i] == Integer.MIN_VALUE || this.k || arrayOfInt[i] == j) {
            this.f[i] = j;
          } else {
            throw new a(h(i));
          } 
        } 
        i++;
      } 
      map = paramv.e;
      if (map != null)
        for (p<?> p : map.keySet())
          c(p, map.get(p));  
      return;
    } 
    arrayOfObject = ((v)map).c;
    while (i < arrayOfObject.length) {
      Object object = arrayOfObject[i];
      if (object != null) {
        object = p.class.cast(object);
        if (object.getType() == Integer.class) {
          b((p<?>)object, ((v)map).f[i]);
        } else {
          c((p<?>)object, ((v)map).d[i]);
        } 
      } 
      i++;
    } 
  }
  
  void b(p<?> paramp, int paramInt) {
    Map<p<?>, Object> map1;
    Object[] arrayOfObject = this.c;
    if (arrayOfObject == null) {
      if (paramp == f0.r) {
        if (!this.k) {
          int[] arrayOfInt = this.f;
          if (arrayOfInt[0] != Integer.MIN_VALUE && arrayOfInt[0] != paramInt)
            throw new a(paramp); 
        } 
        this.f[0] = paramInt;
        return;
      } 
      if (paramp == f0.v) {
        if (!this.k) {
          int[] arrayOfInt = this.f;
          if (arrayOfInt[1] != Integer.MIN_VALUE && arrayOfInt[1] != paramInt)
            throw new a(paramp); 
        } 
        this.f[1] = paramInt;
        return;
      } 
      if (paramp == f0.w) {
        if (!this.k) {
          int[] arrayOfInt = this.f;
          if (arrayOfInt[2] != Integer.MIN_VALUE && arrayOfInt[2] != paramInt)
            throw new a(paramp); 
        } 
        this.f[2] = paramInt;
        return;
      } 
      if (paramp == g0.w) {
        if (!this.k) {
          int k = this.g;
          if (k != Integer.MIN_VALUE && k != paramInt)
            throw new a(paramp); 
        } 
        this.g = paramInt;
        return;
      } 
      if (paramp == g0.y) {
        if (!this.k) {
          int k = this.h;
          if (k != Integer.MIN_VALUE && k != paramInt)
            throw new a(paramp); 
        } 
        this.h = paramInt;
        return;
      } 
      if (paramp == g0.A) {
        if (!this.k) {
          int k = this.i;
          if (k != Integer.MIN_VALUE && k != paramInt)
            throw new a(paramp); 
        } 
        this.i = paramInt;
        return;
      } 
      if (paramp == g0.E) {
        if (!this.k) {
          int k = this.j;
          if (k != Integer.MIN_VALUE && k != paramInt)
            throw new a(paramp); 
        } 
        this.j = paramInt;
        return;
      } 
      Map<p<?>, Object> map = this.e;
      map1 = map;
      if (map == null) {
        map1 = new HashMap<p<?>, Object>();
        this.e = map1;
      } 
      Integer integer = Integer.valueOf(paramInt);
      if (this.k || !map1.containsKey(paramp) || integer.equals(map1.get(paramp))) {
        map1.put(paramp, integer);
        return;
      } 
      throw new a(paramp);
    } 
    int i = j(paramp.hashCode()) & this.h;
    Map<p<?>, Object> map2 = map1[i];
    int j = i;
    if (map2 != null) {
      j = i;
      if (map2.equals(paramp)) {
        if (this.k || this.f[i] == paramInt) {
          this.f[i] = paramInt;
          return;
        } 
        throw new a(paramp);
      } 
      while (true) {
        i = j + 1 & this.h;
        map2 = map1[i];
        j = i;
        if (map2 != null) {
          j = i;
          if (map2.equals(paramp)) {
            if (this.k || this.f[i] == paramInt) {
              this.f[i] = paramInt;
              return;
            } 
            throw new a(paramp);
          } 
          continue;
        } 
        break;
      } 
    } 
    map1[j] = (Map)paramp;
    this.f[j] = paramInt;
    paramInt = this.j;
    this.j = paramInt + 1;
    if (paramInt >= this.i)
      l(g(this.j)); 
  }
  
  void c(p<?> paramp, Object paramObject) {
    Map<p<?>, Object> map1;
    if (paramObject == null) {
      b(paramp);
      return;
    } 
    if (paramp.getType() == Integer.class) {
      b(paramp, ((Integer)Integer.class.cast(paramObject)).intValue());
      return;
    } 
    Object[] arrayOfObject = this.c;
    if (arrayOfObject == null) {
      Map<p<?>, Object> map = this.e;
      map1 = map;
      if (map == null) {
        map1 = new HashMap<p<?>, Object>();
        this.e = map1;
      } 
      if (this.k || !map1.containsKey(paramp) || paramObject.equals(map1.get(paramp))) {
        map1.put(paramp, paramObject);
        return;
      } 
      throw new a(paramp);
    } 
    if (this.d == null)
      this.d = new Object[this.g]; 
    int i = j(paramp.hashCode()) & this.h;
    Map<p<?>, Object> map2 = map1[i];
    int j = i;
    if (map2 != null) {
      j = i;
      if (map2.equals(paramp)) {
        if (this.k || paramObject.equals(this.d[i])) {
          this.d[i] = paramObject;
          return;
        } 
        throw new a(paramp);
      } 
      while (true) {
        i = j + 1 & this.h;
        map2 = map1[i];
        j = i;
        if (map2 != null) {
          j = i;
          if (map2.equals(paramp)) {
            if (this.k || paramObject.equals(this.d[i])) {
              this.d[i] = paramObject;
              return;
            } 
            throw new a(paramp);
          } 
          continue;
        } 
        break;
      } 
    } 
    map1[j] = (Map)paramp;
    this.d[j] = paramObject;
    i = this.j;
    this.j = i + 1;
    if (i >= this.i)
      l(g(this.j)); 
  }
  
  public boolean c(p<?> paramp) {
    Map<p<?>, Object> map1;
    boolean bool3 = false;
    boolean bool4 = false;
    boolean bool5 = false;
    boolean bool6 = false;
    boolean bool7 = false;
    boolean bool8 = false;
    boolean bool2 = false;
    boolean bool1 = false;
    if (paramp == null)
      return false; 
    Object[] arrayOfObject = this.c;
    if (arrayOfObject == null) {
      if (paramp == f0.r) {
        if (this.f[0] != Integer.MIN_VALUE)
          bool1 = true; 
        return bool1;
      } 
      if (paramp == f0.v) {
        bool1 = bool3;
        if (this.f[1] != Integer.MIN_VALUE)
          bool1 = true; 
        return bool1;
      } 
      if (paramp == f0.w) {
        bool1 = bool4;
        if (this.f[2] != Integer.MIN_VALUE)
          bool1 = true; 
        return bool1;
      } 
      if (paramp == g0.w) {
        bool1 = bool5;
        if (this.g != Integer.MIN_VALUE)
          bool1 = true; 
        return bool1;
      } 
      if (paramp == g0.y) {
        bool1 = bool6;
        if (this.h != Integer.MIN_VALUE)
          bool1 = true; 
        return bool1;
      } 
      if (paramp == g0.A) {
        bool1 = bool7;
        if (this.i != Integer.MIN_VALUE)
          bool1 = true; 
        return bool1;
      } 
      if (paramp == g0.E) {
        bool1 = bool8;
        if (this.j != Integer.MIN_VALUE)
          bool1 = true; 
        return bool1;
      } 
      map1 = this.e;
      bool1 = bool2;
      if (map1 != null) {
        bool1 = bool2;
        if (map1.containsKey(paramp))
          bool1 = true; 
      } 
      return bool1;
    } 
    int i = j(paramp.hashCode()) & this.h;
    Map<p<?>, Object> map2 = map1[i];
    if (map2 == null)
      return false; 
    if (paramp.equals(map2))
      return true; 
    while (true) {
      i = i + 1 & this.h;
      map2 = map1[i];
      if (map2 == null)
        return false; 
      if (paramp.equals(map2))
        return true; 
    } 
  }
  
  public <V> V e(p<V> paramp) {
    Class<Integer> clazz = paramp.getType();
    if (clazz == Integer.class) {
      int i = g(paramp);
      if (i != Integer.MIN_VALUE)
        return (V)clazz.cast(Integer.valueOf(i)); 
      stringBuilder = new StringBuilder();
      stringBuilder.append("No value found for: ");
      stringBuilder.append(paramp.name());
      throw new r(stringBuilder.toString());
    } 
    Object[] arrayOfObject = this.c;
    if (arrayOfObject == null) {
      Map<p<?>, Object> map = this.e;
      if (map != null && map.containsKey(paramp))
        return paramp.getType().cast(map.get(paramp)); 
      stringBuilder = new StringBuilder();
      stringBuilder.append("No value found for: ");
      stringBuilder.append(paramp.name());
      throw new r(stringBuilder.toString());
    } 
    if (this.d != null) {
      int i = j(paramp.hashCode()) & this.h;
      Object object = arrayOfObject[i];
      if (object != null) {
        int j = i;
        if (paramp.equals(object))
          return stringBuilder.cast(this.d[i]); 
        while (true) {
          i = j + 1 & this.h;
          object = arrayOfObject[i];
          if (object != null) {
            j = i;
            if (paramp.equals(object))
              return stringBuilder.cast(this.d[i]); 
            continue;
          } 
          stringBuilder = new StringBuilder();
          stringBuilder.append("No value found for: ");
          stringBuilder.append(paramp.name());
          throw new r(stringBuilder.toString());
        } 
      } 
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("No value found for: ");
    stringBuilder.append(paramp.name());
    r r = new r(stringBuilder.toString());
    throw r;
  }
  
  void f(int paramInt) {
    this.l = paramInt;
  }
  
  public Set<p<?>> u() {
    if (this.c == null) {
      HashSet<net.time4j.c> hashSet = new HashSet();
      if (this.f[0] != Integer.MIN_VALUE)
        hashSet.add(f0.r); 
      if (this.f[1] != Integer.MIN_VALUE)
        hashSet.add(f0.v); 
      if (this.f[2] != Integer.MIN_VALUE)
        hashSet.add(f0.w); 
      if (this.g != Integer.MIN_VALUE)
        hashSet.add(g0.w); 
      if (this.h != Integer.MIN_VALUE)
        hashSet.add(g0.y); 
      if (this.i != Integer.MIN_VALUE)
        hashSet.add(g0.A); 
      if (this.j != Integer.MIN_VALUE)
        hashSet.add(g0.E); 
      Map<p<?>, Object> map = this.e;
      if (map != null)
        hashSet.addAll((Collection)map.keySet()); 
      return (Set)Collections.unmodifiableSet(hashSet);
    } 
    return new c(null);
  }
  
  <E> E v() {
    return null;
  }
  
  int w() {
    return this.l;
  }
  
  void x() {
    Object[] arrayOfObject = this.c;
    if (arrayOfObject == null) {
      this.g = Integer.MIN_VALUE;
      this.h = Integer.MIN_VALUE;
      this.i = Integer.MIN_VALUE;
      this.j = Integer.MIN_VALUE;
      for (int i = 0; i < 3; i++)
        this.f[i] = Integer.MIN_VALUE; 
      this.e = null;
    } else {
      this.c = new Object[arrayOfObject.length];
    } 
    this.j = 0;
  }
  
  void y() {
    this.k = true;
  }
  
  private class b implements Iterator<p<?>> {
    int c = v.b(this.e);
    
    int d = v.c(this.e);
    
    private b(v this$0) {}
    
    public boolean hasNext() {
      return (this.d > 0);
    }
    
    public p<?> next() {
      if (this.d > 0) {
        Object[] arrayOfObject = v.d(this.e);
        while (true) {
          int i = this.c - 1;
          this.c = i;
          if (i >= 0) {
            i = this.c;
            if (arrayOfObject[i] != null) {
              this.d--;
              return p.class.cast(arrayOfObject[i]);
            } 
            continue;
          } 
          break;
        } 
      } 
      NoSuchElementException noSuchElementException = new NoSuchElementException();
      throw noSuchElementException;
    }
    
    public void remove() {
      throw new UnsupportedOperationException("remove");
    }
  }
  
  private class c extends AbstractSet<p<?>> {
    private c(v this$0) {}
    
    public Iterator<p<?>> iterator() {
      return new v.b(null);
    }
    
    public int size() {
      return v.c(this.c);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/e1/a0/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */