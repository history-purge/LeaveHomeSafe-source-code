package e.f.a.e.i.n;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class z2<T extends b3<T>> {
  private static final z2 d = new z2(true);
  
  final n5<T, Object> a = n5.b(16);
  
  private boolean b;
  
  private boolean c;
  
  private z2() {}
  
  private z2(n5<T, Object> paramn5) {
    a();
  }
  
  private z2(boolean paramBoolean) {
    this(n5.b(0));
    a();
  }
  
  static int a(s6 params6, int paramInt, Object paramObject) {
    int i = o2.e(paramInt);
    paramInt = i;
    if (params6 == s6.l) {
      l3.a((r4)paramObject);
      paramInt = i << 1;
    } 
    return paramInt + a(params6, paramObject);
  }
  
  private static int a(s6 params6, Object paramObject) {
    switch (y2.b[params6.ordinal()]) {
      default:
        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
      case 18:
        return (paramObject instanceof k3) ? o2.k(((k3)paramObject).zza()) : o2.k(((Integer)paramObject).intValue());
      case 17:
        return o2.f(((Long)paramObject).longValue());
      case 16:
        return o2.h(((Integer)paramObject).intValue());
      case 15:
        return o2.h(((Long)paramObject).longValue());
      case 14:
        return o2.j(((Integer)paramObject).intValue());
      case 13:
        return o2.g(((Integer)paramObject).intValue());
      case 12:
        return (paramObject instanceof z1) ? o2.a((z1)paramObject) : o2.b((byte[])paramObject);
      case 11:
        return (paramObject instanceof z1) ? o2.a((z1)paramObject) : o2.a((String)paramObject);
      case 10:
        return (paramObject instanceof v3) ? o2.a((v3)paramObject) : o2.a((r4)paramObject);
      case 9:
        return o2.b((r4)paramObject);
      case 8:
        return o2.b(((Boolean)paramObject).booleanValue());
      case 7:
        return o2.i(((Integer)paramObject).intValue());
      case 6:
        return o2.g(((Long)paramObject).longValue());
      case 5:
        return o2.f(((Integer)paramObject).intValue());
      case 4:
        return o2.e(((Long)paramObject).longValue());
      case 3:
        return o2.d(((Long)paramObject).longValue());
      case 2:
        return o2.b(((Float)paramObject).floatValue());
      case 1:
        break;
    } 
    return o2.b(((Double)paramObject).doubleValue());
  }
  
  private static Object a(Object paramObject) {
    if (paramObject instanceof z4)
      return ((z4)paramObject).zza(); 
    if (paramObject instanceof byte[]) {
      paramObject = paramObject;
      byte[] arrayOfByte = new byte[paramObject.length];
      System.arraycopy(paramObject, 0, arrayOfByte, 0, paramObject.length);
      return arrayOfByte;
    } 
    return paramObject;
  }
  
  private static <T extends b3<T>> boolean a(Map.Entry<T, Object> paramEntry) {
    b3 b3 = (b3)paramEntry.getKey();
    if (b3.g() == v6.k) {
      Iterator<r4> iterator;
      boolean bool = b3.f();
      paramEntry = (Map.Entry<T, Object>)paramEntry.getValue();
      if (bool) {
        iterator = ((List)paramEntry).iterator();
        while (iterator.hasNext()) {
          if (!((r4)iterator.next()).d())
            return false; 
        } 
      } else if (iterator instanceof r4) {
        if (!((r4)iterator).d())
          return false; 
      } else {
        if (iterator instanceof v3)
          return true; 
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
      } 
    } 
    return true;
  }
  
  private final void b(Map.Entry<T, Object> paramEntry) {
    b3 b3 = (b3)paramEntry.getKey();
    object = paramEntry.getValue();
    if (!(object instanceof v3)) {
      if (b3.f()) {
        null = a((T)b3);
        Object object1 = null;
        if (null == null)
          object1 = new ArrayList(); 
        for (Object object : object)
          ((List<Object>)object1).add(a(object)); 
        this.a.a((T)b3, object1);
        return;
      } 
      if (b3.g() == v6.k) {
        Object object1 = a((T)b3);
        if (object1 == null) {
          this.a.a((T)b3, a(object));
          return;
        } 
        if (!(object1 instanceof z4)) {
          object1 = b3.a(((r4)object1).a(), (r4)object).u();
          this.a.a((T)b3, object1);
          return;
        } 
        b3.a((z4)object1, (z4)object);
        throw null;
      } 
      this.a.a((T)b3, a(object));
      return;
    } 
    v3 v3 = (v3)object;
    v3.c();
    throw null;
  }
  
  public static int c(b3<?> paramb3, Object paramObject) {
    s6 s6 = paramb3.zzb();
    int i = paramb3.zza();
    if (paramb3.f()) {
      boolean bool1 = paramb3.e();
      boolean bool = false;
      int j = 0;
      List list = (List)paramObject;
      if (bool1) {
        iterator = list.iterator();
        while (iterator.hasNext())
          j += a(s6, iterator.next()); 
        return o2.e(i) + j + o2.l(j);
      } 
      Iterator iterator = iterator.iterator();
      for (j = bool; iterator.hasNext(); j += a(s6, i, iterator.next()));
      return j;
    } 
    return a(s6, i, paramObject);
  }
  
  private static int c(Map.Entry<T, Object> paramEntry) {
    b3<?> b3 = (b3)paramEntry.getKey();
    Object object = paramEntry.getValue();
    if (b3.g() == v6.k && !b3.f() && !b3.e()) {
      boolean bool = object instanceof v3;
      int i = ((b3)paramEntry.getKey()).zza();
      return bool ? o2.b(i, (v3)object) : o2.b(i, (r4)object);
    } 
    return c(b3, object);
  }
  
  private static void d(T paramT, Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: invokeinterface zzb : ()Le/f/a/e/i/n/s6;
    //   6: astore_3
    //   7: aload_1
    //   8: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   11: pop
    //   12: getstatic e/f/a/e/i/n/y2.a : [I
    //   15: aload_3
    //   16: invokevirtual zza : ()Le/f/a/e/i/n/v6;
    //   19: invokevirtual ordinal : ()I
    //   22: iaload
    //   23: tableswitch default -> 72, 1 -> 170, 2 -> 162, 3 -> 154, 4 -> 146, 5 -> 138, 6 -> 130, 7 -> 111, 8 -> 94, 9 -> 77
    //   72: iconst_0
    //   73: istore_2
    //   74: goto -> 175
    //   77: aload_1
    //   78: instanceof e/f/a/e/i/n/r4
    //   81: ifne -> 125
    //   84: aload_1
    //   85: instanceof e/f/a/e/i/n/v3
    //   88: ifeq -> 72
    //   91: goto -> 125
    //   94: aload_1
    //   95: instanceof java/lang/Integer
    //   98: ifne -> 125
    //   101: aload_1
    //   102: instanceof e/f/a/e/i/n/k3
    //   105: ifeq -> 72
    //   108: goto -> 125
    //   111: aload_1
    //   112: instanceof e/f/a/e/i/n/z1
    //   115: ifne -> 125
    //   118: aload_1
    //   119: instanceof [B
    //   122: ifeq -> 72
    //   125: iconst_1
    //   126: istore_2
    //   127: goto -> 175
    //   130: aload_1
    //   131: instanceof java/lang/String
    //   134: istore_2
    //   135: goto -> 175
    //   138: aload_1
    //   139: instanceof java/lang/Boolean
    //   142: istore_2
    //   143: goto -> 175
    //   146: aload_1
    //   147: instanceof java/lang/Double
    //   150: istore_2
    //   151: goto -> 175
    //   154: aload_1
    //   155: instanceof java/lang/Float
    //   158: istore_2
    //   159: goto -> 175
    //   162: aload_1
    //   163: instanceof java/lang/Long
    //   166: istore_2
    //   167: goto -> 175
    //   170: aload_1
    //   171: instanceof java/lang/Integer
    //   174: istore_2
    //   175: iload_2
    //   176: ifeq -> 180
    //   179: return
    //   180: new java/lang/IllegalArgumentException
    //   183: dup
    //   184: ldc_w 'Wrong object type used with protocol message reflection.\\nField number: %d, field java type: %s, value type: %s\\n'
    //   187: iconst_3
    //   188: anewarray java/lang/Object
    //   191: dup
    //   192: iconst_0
    //   193: aload_0
    //   194: invokeinterface zza : ()I
    //   199: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   202: aastore
    //   203: dup
    //   204: iconst_1
    //   205: aload_0
    //   206: invokeinterface zzb : ()Le/f/a/e/i/n/s6;
    //   211: invokevirtual zza : ()Le/f/a/e/i/n/v6;
    //   214: aastore
    //   215: dup
    //   216: iconst_2
    //   217: aload_1
    //   218: invokevirtual getClass : ()Ljava/lang/Class;
    //   221: invokevirtual getName : ()Ljava/lang/String;
    //   224: aastore
    //   225: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   228: invokespecial <init> : (Ljava/lang/String;)V
    //   231: astore_0
    //   232: goto -> 237
    //   235: aload_0
    //   236: athrow
    //   237: goto -> 235
  }
  
  public static <T extends b3<T>> z2<T> g() {
    return d;
  }
  
  public final Object a(T paramT) {
    paramT = (T)this.a.get(paramT);
    if (!(paramT instanceof v3))
      return paramT; 
    v3 v3 = (v3)paramT;
    v3.c();
    throw null;
  }
  
  public final void a() {
    if (this.b)
      return; 
    this.a.a();
    this.b = true;
  }
  
  public final void a(T paramT, Object paramObject) {
    if (paramT.f()) {
      if (paramObject instanceof List) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll((List)paramObject);
        int j = arrayList.size();
        int i = 0;
        while (i < j) {
          paramObject = arrayList.get(i);
          i++;
          d(paramT, paramObject);
        } 
        paramObject = arrayList;
      } else {
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
      } 
    } else {
      d(paramT, paramObject);
    } 
    if (paramObject instanceof v3)
      this.c = true; 
    this.a.a(paramT, paramObject);
  }
  
  public final void a(z2<T> paramz2) {
    for (int i = 0; i < paramz2.a.c(); i++)
      b(paramz2.a.a(i)); 
    Iterator<Map.Entry<T, Object>> iterator = paramz2.a.d().iterator();
    while (iterator.hasNext())
      b(iterator.next()); 
  }
  
  public final void b(T paramT, Object paramObject) {
    if (paramT.f()) {
      List<Object> list;
      d(paramT, paramObject);
      Object object = a(paramT);
      if (object == null) {
        object = new ArrayList();
        this.a.a(paramT, object);
        paramT = (T)object;
      } else {
        list = (List)object;
      } 
      list.add(paramObject);
      return;
    } 
    throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
  }
  
  public final boolean b() {
    return this.b;
  }
  
  public final Iterator<Map.Entry<T, Object>> c() {
    return this.c ? new w3<T>(this.a.entrySet().iterator()) : this.a.entrySet().iterator();
  }
  
  final Iterator<Map.Entry<T, Object>> d() {
    return this.c ? new w3<T>(this.a.e().iterator()) : this.a.e().iterator();
  }
  
  public final boolean e() {
    for (int i = 0; i < this.a.c(); i++) {
      if (!a(this.a.a(i)))
        return false; 
    } 
    Iterator<Map.Entry<b3, Object>> iterator = this.a.d().iterator();
    while (iterator.hasNext()) {
      if (!a(iterator.next()))
        return false; 
    } 
    return true;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof z2))
      return false; 
    paramObject = paramObject;
    return this.a.equals(((z2)paramObject).a);
  }
  
  public final int f() {
    int j = 0;
    int i = 0;
    while (j < this.a.c()) {
      i += c(this.a.a(j));
      j++;
    } 
    Iterator<Map.Entry<T, Object>> iterator = this.a.d().iterator();
    while (iterator.hasNext())
      i += c(iterator.next()); 
    return i;
  }
  
  public final int hashCode() {
    return this.a.hashCode();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/z2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */