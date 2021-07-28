package e.f.a.e.i.k;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

final class h<K, V> extends AbstractMap<K, V> implements Serializable {
  private static final Object l = new Object();
  
  private transient Object c;
  
  transient int[] d;
  
  transient Object[] e;
  
  transient Object[] f;
  
  private transient int g;
  
  private transient int h;
  
  private transient Set<K> i;
  
  private transient Set<Map.Entry<K, V>> j;
  
  private transient Collection<V> k;
  
  h(int paramInt) {
    a(12);
  }
  
  private final int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Object object1 = i.a(paramInt2);
    int i = paramInt2 - 1;
    if (paramInt4 != 0)
      i.a(object1, paramInt3 & i, paramInt4 + 1); 
    Object object2 = this.c;
    int[] arrayOfInt = this.d;
    for (paramInt2 = 0; paramInt2 <= paramInt1; paramInt2++) {
      for (paramInt3 = i.a(object2, paramInt2); paramInt3 != 0; paramInt3 = j & paramInt1) {
        paramInt4 = paramInt3 - 1;
        int j = arrayOfInt[paramInt4];
        int k = (paramInt1 ^ 0xFFFFFFFF) & j | paramInt2;
        int m = k & i;
        int n = i.a(object1, m);
        i.a(object1, m, paramInt3);
        arrayOfInt[paramInt4] = (i ^ 0xFFFFFFFF) & k | n & i;
      } 
    } 
    this.c = object1;
    c(i);
    return i;
  }
  
  private final int a(Object paramObject) {
    if (a())
      return -1; 
    int j = j.a(paramObject);
    int k = f();
    int i = i.a(this.c, j & k);
    if (i != 0) {
      int m = k ^ 0xFFFFFFFF;
      while (true) {
        int n = this.d[--i];
        if ((n & m) != (j & m) || !a0.a(paramObject, this.e[i])) {
          n &= k;
          i = n;
          if (n == 0)
            break; 
          continue;
        } 
        return i;
      } 
    } 
    return -1;
  }
  
  private final Object b(Object paramObject) {
    if (a())
      return l; 
    int i = f();
    int j = i.a(paramObject, null, i, this.c, this.d, this.e, null);
    if (j == -1)
      return l; 
    paramObject = this.f[j];
    a(j, i);
    this.h--;
    c();
    return paramObject;
  }
  
  private final void c(int paramInt) {
    this.g = 32 - Integer.numberOfLeadingZeros(paramInt) & 0x1F | this.g & 0xFFFFFFE0;
  }
  
  private final int f() {
    return (1 << (this.g & 0x1F)) - 1;
  }
  
  final void a(int paramInt) {
    this.g = j0.a(12, 1, 1073741823);
  }
  
  final void a(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual size : ()I
    //   4: iconst_1
    //   5: isub
    //   6: istore #4
    //   8: iload_1
    //   9: iload #4
    //   11: if_icmpge -> 175
    //   14: aload_0
    //   15: getfield e : [Ljava/lang/Object;
    //   18: astore #8
    //   20: aload #8
    //   22: iload #4
    //   24: aaload
    //   25: astore #7
    //   27: aload #8
    //   29: iload_1
    //   30: aload #7
    //   32: aastore
    //   33: aload_0
    //   34: getfield f : [Ljava/lang/Object;
    //   37: astore #9
    //   39: aload #9
    //   41: iload_1
    //   42: aload #9
    //   44: iload #4
    //   46: aaload
    //   47: aastore
    //   48: aload #8
    //   50: iload #4
    //   52: aconst_null
    //   53: aastore
    //   54: aload #9
    //   56: iload #4
    //   58: aconst_null
    //   59: aastore
    //   60: aload_0
    //   61: getfield d : [I
    //   64: astore #8
    //   66: aload #8
    //   68: iload_1
    //   69: aload #8
    //   71: iload #4
    //   73: iaload
    //   74: iastore
    //   75: aload #8
    //   77: iload #4
    //   79: iconst_0
    //   80: iastore
    //   81: aload #7
    //   83: invokestatic a : (Ljava/lang/Object;)I
    //   86: iload_2
    //   87: iand
    //   88: istore #5
    //   90: aload_0
    //   91: getfield c : Ljava/lang/Object;
    //   94: iload #5
    //   96: invokestatic a : (Ljava/lang/Object;I)I
    //   99: istore_3
    //   100: iload #4
    //   102: iconst_1
    //   103: iadd
    //   104: istore #4
    //   106: iload_3
    //   107: iload #4
    //   109: if_icmpeq -> 162
    //   112: iload_3
    //   113: iconst_1
    //   114: isub
    //   115: istore #5
    //   117: aload_0
    //   118: getfield d : [I
    //   121: astore #7
    //   123: aload #7
    //   125: iload #5
    //   127: iaload
    //   128: istore #6
    //   130: iload #6
    //   132: iload_2
    //   133: iand
    //   134: istore_3
    //   135: iload_3
    //   136: iload #4
    //   138: if_icmpeq -> 144
    //   141: goto -> 112
    //   144: aload #7
    //   146: iload #5
    //   148: iload_1
    //   149: iconst_1
    //   150: iadd
    //   151: iload_2
    //   152: iand
    //   153: iload_2
    //   154: iconst_m1
    //   155: ixor
    //   156: iload #6
    //   158: iand
    //   159: ior
    //   160: iastore
    //   161: return
    //   162: aload_0
    //   163: getfield c : Ljava/lang/Object;
    //   166: iload #5
    //   168: iload_1
    //   169: iconst_1
    //   170: iadd
    //   171: invokestatic a : (Ljava/lang/Object;II)V
    //   174: return
    //   175: aload_0
    //   176: getfield e : [Ljava/lang/Object;
    //   179: iload_1
    //   180: aconst_null
    //   181: aastore
    //   182: aload_0
    //   183: getfield f : [Ljava/lang/Object;
    //   186: iload_1
    //   187: aconst_null
    //   188: aastore
    //   189: aload_0
    //   190: getfield d : [I
    //   193: iload_1
    //   194: iconst_0
    //   195: iastore
    //   196: return
  }
  
  final boolean a() {
    return (this.c == null);
  }
  
  final int b(int paramInt) {
    return (++paramInt < this.h) ? paramInt : -1;
  }
  
  final Map<K, V> b() {
    Object object = this.c;
    return (object instanceof Map) ? (Map<K, V>)object : null;
  }
  
  final void c() {
    this.g += 32;
  }
  
  public final void clear() {
    if (a())
      return; 
    c();
    Map<K, V> map = b();
    if (map != null) {
      this.g = j0.a(size(), 3, 1073741823);
      map.clear();
      this.c = null;
    } else {
      Arrays.fill(this.e, 0, this.h, (Object)null);
      Arrays.fill(this.f, 0, this.h, (Object)null);
      Object object = this.c;
      if (object instanceof byte[]) {
        Arrays.fill((byte[])object, (byte)0);
      } else if (object instanceof short[]) {
        Arrays.fill((short[])object, (short)0);
      } else {
        Arrays.fill((int[])object, 0);
      } 
      Arrays.fill(this.d, 0, this.h, 0);
    } 
    this.h = 0;
  }
  
  public final boolean containsKey(Object paramObject) {
    Map<K, V> map = b();
    return (map != null) ? map.containsKey(paramObject) : (!(a(paramObject) == -1));
  }
  
  public final boolean containsValue(Object paramObject) {
    Map<K, V> map = b();
    if (map == null) {
      for (int i = 0; i < this.h; i++) {
        if (a0.a(paramObject, this.f[i]))
          return true; 
      } 
      return false;
    } 
    return map.containsValue(paramObject);
  }
  
  final int d() {
    return isEmpty() ? -1 : 0;
  }
  
  public final Set<Map.Entry<K, V>> entrySet() {
    Set<Map.Entry<K, V>> set2 = this.j;
    Set<Map.Entry<K, V>> set1 = set2;
    if (set2 == null) {
      set1 = new c(this);
      this.j = set1;
    } 
    return set1;
  }
  
  public final V get(Object paramObject) {
    Map<K, V> map = b();
    if (map != null)
      return map.get(paramObject); 
    int i = a(paramObject);
    return (V)((i == -1) ? null : this.f[i]);
  }
  
  public final boolean isEmpty() {
    return (size() == 0);
  }
  
  public final Set<K> keySet() {
    Set<K> set2 = this.i;
    Set<K> set1 = set2;
    if (set2 == null) {
      set1 = new e(this);
      this.i = set1;
    } 
    return set1;
  }
  
  public final V put(K paramK, V paramV) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual a : ()Z
    //   4: ifeq -> 116
    //   7: aload_0
    //   8: invokevirtual a : ()Z
    //   11: ldc 'Arrays already allocated'
    //   13: invokestatic a : (ZLjava/lang/Object;)V
    //   16: aload_0
    //   17: getfield g : I
    //   20: istore #5
    //   22: iload #5
    //   24: iconst_1
    //   25: iadd
    //   26: iconst_2
    //   27: invokestatic max : (II)I
    //   30: istore #6
    //   32: iload #6
    //   34: invokestatic highestOneBit : (I)I
    //   37: istore #4
    //   39: iload #4
    //   41: istore_3
    //   42: iload #6
    //   44: iload #4
    //   46: i2d
    //   47: d2i
    //   48: if_icmple -> 69
    //   51: iload #4
    //   53: iload #4
    //   55: iadd
    //   56: istore #4
    //   58: iload #4
    //   60: istore_3
    //   61: iload #4
    //   63: ifgt -> 69
    //   66: ldc 1073741824
    //   68: istore_3
    //   69: iconst_4
    //   70: iload_3
    //   71: invokestatic max : (II)I
    //   74: istore_3
    //   75: aload_0
    //   76: iload_3
    //   77: invokestatic a : (I)Ljava/lang/Object;
    //   80: putfield c : Ljava/lang/Object;
    //   83: aload_0
    //   84: iload_3
    //   85: iconst_1
    //   86: isub
    //   87: invokespecial c : (I)V
    //   90: aload_0
    //   91: iload #5
    //   93: newarray int
    //   95: putfield d : [I
    //   98: aload_0
    //   99: iload #5
    //   101: anewarray java/lang/Object
    //   104: putfield e : [Ljava/lang/Object;
    //   107: aload_0
    //   108: iload #5
    //   110: anewarray java/lang/Object
    //   113: putfield f : [Ljava/lang/Object;
    //   116: aload_0
    //   117: invokevirtual b : ()Ljava/util/Map;
    //   120: astore #12
    //   122: aload #12
    //   124: ifnull -> 137
    //   127: aload #12
    //   129: aload_1
    //   130: aload_2
    //   131: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   136: areturn
    //   137: aload_0
    //   138: getfield d : [I
    //   141: astore #13
    //   143: aload_0
    //   144: getfield e : [Ljava/lang/Object;
    //   147: astore #14
    //   149: aload_0
    //   150: getfield f : [Ljava/lang/Object;
    //   153: astore #12
    //   155: aload_0
    //   156: getfield h : I
    //   159: istore #6
    //   161: iload #6
    //   163: iconst_1
    //   164: iadd
    //   165: istore #7
    //   167: aload_1
    //   168: invokestatic a : (Ljava/lang/Object;)I
    //   171: istore #8
    //   173: aload_0
    //   174: invokespecial f : ()I
    //   177: istore #5
    //   179: iload #8
    //   181: iload #5
    //   183: iand
    //   184: istore_3
    //   185: aload_0
    //   186: getfield c : Ljava/lang/Object;
    //   189: iload_3
    //   190: invokestatic a : (Ljava/lang/Object;I)I
    //   193: istore #4
    //   195: iload #4
    //   197: ifne -> 242
    //   200: iload #7
    //   202: iload #5
    //   204: if_icmple -> 226
    //   207: aload_0
    //   208: iload #5
    //   210: iload #5
    //   212: invokestatic b : (I)I
    //   215: iload #8
    //   217: iload #6
    //   219: invokespecial a : (IIII)I
    //   222: istore_3
    //   223: goto -> 446
    //   226: aload_0
    //   227: getfield c : Ljava/lang/Object;
    //   230: iload_3
    //   231: iload #7
    //   233: invokestatic a : (Ljava/lang/Object;II)V
    //   236: iload #5
    //   238: istore_3
    //   239: goto -> 446
    //   242: iload #5
    //   244: iconst_m1
    //   245: ixor
    //   246: istore #9
    //   248: iconst_0
    //   249: istore_3
    //   250: iload #4
    //   252: iconst_1
    //   253: isub
    //   254: istore #10
    //   256: aload #13
    //   258: iload #10
    //   260: iaload
    //   261: istore #4
    //   263: iload #4
    //   265: iload #9
    //   267: iand
    //   268: istore #11
    //   270: iload #11
    //   272: iload #8
    //   274: iload #9
    //   276: iand
    //   277: if_icmpne -> 309
    //   280: aload_1
    //   281: aload #14
    //   283: iload #10
    //   285: aaload
    //   286: invokestatic a : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   289: ifne -> 295
    //   292: goto -> 309
    //   295: aload #12
    //   297: iload #10
    //   299: aaload
    //   300: astore_1
    //   301: aload #12
    //   303: iload #10
    //   305: aload_2
    //   306: aastore
    //   307: aload_1
    //   308: areturn
    //   309: iload #4
    //   311: iload #5
    //   313: iand
    //   314: istore #4
    //   316: iload_3
    //   317: iconst_1
    //   318: iadd
    //   319: istore_3
    //   320: iload #4
    //   322: ifne -> 567
    //   325: iload_3
    //   326: bipush #9
    //   328: if_icmplt -> 420
    //   331: new java/util/LinkedHashMap
    //   334: dup
    //   335: aload_0
    //   336: invokespecial f : ()I
    //   339: iconst_1
    //   340: iadd
    //   341: fconst_1
    //   342: invokespecial <init> : (IF)V
    //   345: astore #12
    //   347: aload_0
    //   348: invokevirtual d : ()I
    //   351: istore_3
    //   352: iload_3
    //   353: iflt -> 385
    //   356: aload #12
    //   358: aload_0
    //   359: getfield e : [Ljava/lang/Object;
    //   362: iload_3
    //   363: aaload
    //   364: aload_0
    //   365: getfield f : [Ljava/lang/Object;
    //   368: iload_3
    //   369: aaload
    //   370: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   375: pop
    //   376: aload_0
    //   377: iload_3
    //   378: invokevirtual b : (I)I
    //   381: istore_3
    //   382: goto -> 352
    //   385: aload_0
    //   386: aload #12
    //   388: putfield c : Ljava/lang/Object;
    //   391: aload_0
    //   392: aconst_null
    //   393: putfield d : [I
    //   396: aload_0
    //   397: aconst_null
    //   398: putfield e : [Ljava/lang/Object;
    //   401: aload_0
    //   402: aconst_null
    //   403: putfield f : [Ljava/lang/Object;
    //   406: aload_0
    //   407: invokevirtual c : ()V
    //   410: aload #12
    //   412: aload_1
    //   413: aload_2
    //   414: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   419: areturn
    //   420: iload #7
    //   422: iload #5
    //   424: if_icmple -> 430
    //   427: goto -> 207
    //   430: aload #13
    //   432: iload #10
    //   434: iload #7
    //   436: iload #5
    //   438: iand
    //   439: iload #11
    //   441: ior
    //   442: iastore
    //   443: iload #5
    //   445: istore_3
    //   446: aload_0
    //   447: getfield d : [I
    //   450: arraylength
    //   451: istore #4
    //   453: iload #7
    //   455: iload #4
    //   457: if_icmple -> 526
    //   460: ldc 1073741823
    //   462: iconst_1
    //   463: iload #4
    //   465: iconst_1
    //   466: iushr
    //   467: invokestatic max : (II)I
    //   470: iload #4
    //   472: iadd
    //   473: iconst_1
    //   474: ior
    //   475: invokestatic min : (II)I
    //   478: istore #5
    //   480: iload #5
    //   482: iload #4
    //   484: if_icmpeq -> 526
    //   487: aload_0
    //   488: aload_0
    //   489: getfield d : [I
    //   492: iload #5
    //   494: invokestatic copyOf : ([II)[I
    //   497: putfield d : [I
    //   500: aload_0
    //   501: aload_0
    //   502: getfield e : [Ljava/lang/Object;
    //   505: iload #5
    //   507: invokestatic copyOf : ([Ljava/lang/Object;I)[Ljava/lang/Object;
    //   510: putfield e : [Ljava/lang/Object;
    //   513: aload_0
    //   514: aload_0
    //   515: getfield f : [Ljava/lang/Object;
    //   518: iload #5
    //   520: invokestatic copyOf : ([Ljava/lang/Object;I)[Ljava/lang/Object;
    //   523: putfield f : [Ljava/lang/Object;
    //   526: aload_0
    //   527: getfield d : [I
    //   530: iload #6
    //   532: iload_3
    //   533: iconst_m1
    //   534: ixor
    //   535: iload #8
    //   537: iand
    //   538: iastore
    //   539: aload_0
    //   540: getfield e : [Ljava/lang/Object;
    //   543: iload #6
    //   545: aload_1
    //   546: aastore
    //   547: aload_0
    //   548: getfield f : [Ljava/lang/Object;
    //   551: iload #6
    //   553: aload_2
    //   554: aastore
    //   555: aload_0
    //   556: iload #7
    //   558: putfield h : I
    //   561: aload_0
    //   562: invokevirtual c : ()V
    //   565: aconst_null
    //   566: areturn
    //   567: goto -> 250
  }
  
  public final V remove(Object paramObject) {
    Map<K, V> map = b();
    if (map != null)
      return map.remove(paramObject); 
    Object object = b(paramObject);
    paramObject = object;
    if (object == l)
      paramObject = null; 
    return (V)paramObject;
  }
  
  public final int size() {
    Map<K, V> map = b();
    return (map != null) ? map.size() : this.h;
  }
  
  public final Collection<V> values() {
    Collection<V> collection2 = this.k;
    Collection<V> collection1 = collection2;
    if (collection2 == null) {
      collection1 = new g(this);
      this.k = collection1;
    } 
    return collection1;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/k/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */