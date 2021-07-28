package net.time4j.tz;

import java.io.Serializable;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import net.time4j.c1.f;
import net.time4j.c1.g;

public abstract class l implements Serializable {
  private static final String c = System.getProperty("net.time4j.tz.repository.version");
  
  private static final Comparator<k> d = new a();
  
  public static final o e = b.c.a(g.d);
  
  public static final o f = b.e.a(g.d);
  
  private static final boolean g = "Dalvik".equalsIgnoreCase(System.getProperty("java.vm.name"));
  
  private static final boolean h;
  
  private static volatile e i = null;
  
  private static volatile l j = null;
  
  private static volatile boolean k = true;
  
  private static int l = 11;
  
  private static final Map<String, k> m;
  
  private static final r n;
  
  private static final r o;
  
  private static final ConcurrentMap<String, c> p = new ConcurrentHashMap<String, c>();
  
  private static final ReferenceQueue<l> q;
  
  private static final LinkedList<l> r;
  
  private static final ConcurrentMap<String, r> s = new ConcurrentHashMap<String, r>();
  
  static final s t;
  
  private static final l u;
  
  static {
    q = new ReferenceQueue<l>();
    r = new LinkedList<l>();
    try {
      list = a(l.class.getClassLoader(), new String[] { 
            "AFRICA", "AMERICA", "AMERICA$ARGENTINA", "AMERICA$INDIANA", "AMERICA$KENTUCKY", "AMERICA$NORTH_DAKOTA", "ANTARCTICA", "ASIA", "ATLANTIC", "AUSTRALIA", 
            "EUROPE", "INDIAN", "PACIFIC" });
    } catch (ClassNotFoundException classNotFoundException) {
      list = Collections.emptyList();
    } 
    HashMap<Object, Object> hashMap2 = new HashMap<Object, Object>();
    hashMap2.put("Z", p.m);
    hashMap2.put("UT", p.m);
    hashMap2.put("UTC", p.m);
    hashMap2.put("GMT", p.m);
    hashMap2.put("UTC0", p.m);
    hashMap2.put("GMT0", p.m);
    Iterator<?> iterator1 = list.iterator();
    while (iterator1.hasNext()) {
      for (k k : (k[])((Class<k>)iterator1.next()).getEnumConstants())
        hashMap2.put(k.a(), k); 
    } 
    m = Collections.unmodifiableMap(hashMap2);
    HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>();
    a((Map)hashMap1);
    Collections.unmodifiableMap(hashMap1);
    Iterator<r> iterator = net.time4j.c1.d.c().a(r.class).iterator();
    hashMap2 = null;
    while (iterator.hasNext()) {
      r r2 = iterator.next();
      String str = r2.getName();
      if (str.equals("TZDB")) {
        r1 = a(r2, (r)hashMap2);
        continue;
      } 
      if (!str.isEmpty() && !str.equals("DEFAULT"))
        s.put(str, r2); 
    } 
    Iterator<s> iterator2 = net.time4j.c1.d.c().a(s.class).iterator();
    iterator = null;
    while (iterator2.hasNext())
      s1 = iterator2.next(); 
    n = new d(null);
    s s3 = s1;
    if (s1 == null)
      s3 = n.c(); 
    t = s3;
    s.put("java.util.TimeZone", n);
    if (r1 == null) {
      o = n;
    } else {
      s.put("TZDB", r1);
      o = r1;
    } 
    try {
      String str = System.getProperty("user.timezone");
      if ("Z".equals(str) || "UTC".equals(str)) {
        j j = p.m.s();
      } else {
        s1 = s4;
        if (str != null)
          l l2 = a(e(str), str, false); 
      } 
    } catch (SecurityException securityException) {
      s1 = s4;
    } 
    s s2 = s1;
    if (s1 == null)
      l1 = q(); 
    u = l1;
    if (h)
      j = u; 
    i = new e();
  }
  
  public static String a(k paramk, d paramd, Locale paramLocale) {
    String str1;
    String str4 = paramk.a();
    int i = str4.indexOf('~');
    r r1 = o;
    if (i >= 0) {
      str1 = str4.substring(0, i);
      if (!str1.equals("DEFAULT")) {
        r r2 = s.get(str1);
        r1 = r2;
        if (r2 == null)
          return str4; 
      } 
      str1 = str4.substring(i + 1);
    } else {
      str1 = str4;
    } 
    s s2 = r1.c();
    s s1 = s2;
    if (s2 == null)
      s1 = t; 
    String str2 = s1.a(str1, paramd, paramLocale);
    String str3 = str2;
    if (str2.isEmpty()) {
      String str;
      s s3 = t;
      if (s1 != s3) {
        str = s3.a(str1, paramd, paramLocale);
      } else {
        str = str2;
      } 
      if (str.isEmpty())
        return str4; 
      str3 = str;
    } 
    return str3;
  }
  
  private static List<Class<? extends k>> a(ClassLoader paramClassLoader, String... paramVarArgs) {
    ArrayList<Class<?>> arrayList = new ArrayList();
    int j = paramVarArgs.length;
    for (int i = 0; i < j; i++) {
      String str = paramVarArgs[i];
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("net.time4j.tz.olson.");
      stringBuilder.append(str);
      Class<?> clazz = Class.forName(stringBuilder.toString(), true, paramClassLoader);
      if (k.class.isAssignableFrom(clazz))
        arrayList.add(clazz); 
    } 
    return (List)Collections.unmodifiableList(arrayList);
  }
  
  public static Set<k> a(Locale paramLocale, boolean paramBoolean, String paramString) {
    r r1 = c(paramString);
    if (r1 == null)
      return Collections.emptySet(); 
    s s2 = r1.c();
    s s1 = s2;
    if (s2 == null)
      s1 = t; 
    HashSet<k> hashSet = new HashSet();
    Iterator<String> iterator = s1.a(paramLocale, paramBoolean).iterator();
    while (iterator.hasNext())
      hashSet.add(e(iterator.next())); 
    return Collections.unmodifiableSet(hashSet);
  }
  
  public static l a(k paramk) {
    return a(paramk, true);
  }
  
  private static l a(k paramk, String paramString, boolean paramBoolean) {
    // Byte code:
    //   0: getstatic net/time4j/tz/l.p : Ljava/util/concurrent/ConcurrentMap;
    //   3: aload_1
    //   4: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   9: checkcast net/time4j/tz/l$c
    //   12: astore #8
    //   14: aload #8
    //   16: ifnull -> 59
    //   19: aload #8
    //   21: invokevirtual get : ()Ljava/lang/Object;
    //   24: checkcast net/time4j/tz/l
    //   27: astore #7
    //   29: aload #7
    //   31: astore #6
    //   33: aload #7
    //   35: ifnonnull -> 62
    //   38: getstatic net/time4j/tz/l.p : Ljava/util/concurrent/ConcurrentMap;
    //   41: aload #8
    //   43: invokestatic a : (Lnet/time4j/tz/l$c;)Ljava/lang/String;
    //   46: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   51: pop
    //   52: aload #7
    //   54: astore #6
    //   56: goto -> 62
    //   59: aconst_null
    //   60: astore #6
    //   62: aload #6
    //   64: ifnull -> 70
    //   67: aload #6
    //   69: areturn
    //   70: aload_1
    //   71: invokevirtual length : ()I
    //   74: istore #5
    //   76: iconst_0
    //   77: istore #4
    //   79: iconst_0
    //   80: istore_3
    //   81: iload_3
    //   82: iload #5
    //   84: if_icmpge -> 124
    //   87: aload_1
    //   88: iload_3
    //   89: invokevirtual charAt : (I)C
    //   92: bipush #126
    //   94: if_icmpne -> 117
    //   97: aload_1
    //   98: iconst_0
    //   99: iload_3
    //   100: invokevirtual substring : (II)Ljava/lang/String;
    //   103: astore #7
    //   105: aload_1
    //   106: iload_3
    //   107: iconst_1
    //   108: iadd
    //   109: invokevirtual substring : (I)Ljava/lang/String;
    //   112: astore #8
    //   114: goto -> 132
    //   117: iload_3
    //   118: iconst_1
    //   119: iadd
    //   120: istore_3
    //   121: goto -> 81
    //   124: ldc_w ''
    //   127: astore #7
    //   129: aload_1
    //   130: astore #8
    //   132: aload #8
    //   134: invokevirtual isEmpty : ()Z
    //   137: ifeq -> 157
    //   140: iload_2
    //   141: ifne -> 146
    //   144: aconst_null
    //   145: areturn
    //   146: new java/lang/IllegalArgumentException
    //   149: dup
    //   150: ldc_w 'Timezone key is empty.'
    //   153: invokespecial <init> : (Ljava/lang/String;)V
    //   156: athrow
    //   157: getstatic net/time4j/tz/l.o : Lnet/time4j/tz/r;
    //   160: astore #9
    //   162: aload #7
    //   164: invokevirtual isEmpty : ()Z
    //   167: ifne -> 184
    //   170: iload #4
    //   172: istore_3
    //   173: aload #7
    //   175: ldc_w 'DEFAULT'
    //   178: invokevirtual equals : (Ljava/lang/Object;)Z
    //   181: ifeq -> 186
    //   184: iconst_1
    //   185: istore_3
    //   186: iload_3
    //   187: ifne -> 278
    //   190: getstatic net/time4j/tz/l.s : Ljava/util/concurrent/ConcurrentMap;
    //   193: aload #7
    //   195: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   200: checkcast net/time4j/tz/r
    //   203: astore #10
    //   205: aload #10
    //   207: astore #9
    //   209: aload #10
    //   211: ifnonnull -> 278
    //   214: iload_2
    //   215: ifeq -> 276
    //   218: aload #7
    //   220: ldc_w 'TZDB'
    //   223: invokevirtual equals : (Ljava/lang/Object;)Z
    //   226: ifeq -> 236
    //   229: ldc_w 'TZDB provider not available: '
    //   232: astore_0
    //   233: goto -> 240
    //   236: ldc_w 'Timezone model provider not registered: '
    //   239: astore_0
    //   240: new java/lang/StringBuilder
    //   243: dup
    //   244: invokespecial <init> : ()V
    //   247: astore #6
    //   249: aload #6
    //   251: aload_0
    //   252: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   255: pop
    //   256: aload #6
    //   258: aload_1
    //   259: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   262: pop
    //   263: new java/lang/IllegalArgumentException
    //   266: dup
    //   267: aload #6
    //   269: invokevirtual toString : ()Ljava/lang/String;
    //   272: invokespecial <init> : (Ljava/lang/String;)V
    //   275: athrow
    //   276: aconst_null
    //   277: areturn
    //   278: aload_0
    //   279: astore #7
    //   281: aload_0
    //   282: ifnonnull -> 323
    //   285: iload_3
    //   286: ifeq -> 313
    //   289: aload #8
    //   291: invokestatic e : (Ljava/lang/String;)Lnet/time4j/tz/k;
    //   294: astore_0
    //   295: aload_0
    //   296: astore #7
    //   298: aload_0
    //   299: instanceof net/time4j/tz/p
    //   302: ifeq -> 323
    //   305: aload_0
    //   306: checkcast net/time4j/tz/p
    //   309: invokevirtual s : ()Lnet/time4j/tz/j;
    //   312: areturn
    //   313: new net/time4j/tz/e
    //   316: dup
    //   317: aload_1
    //   318: invokespecial <init> : (Ljava/lang/String;)V
    //   321: astore #7
    //   323: aload #9
    //   325: getstatic net/time4j/tz/l.n : Lnet/time4j/tz/r;
    //   328: if_acmpne -> 397
    //   331: new net/time4j/tz/h
    //   334: dup
    //   335: aload #7
    //   337: aload #8
    //   339: invokespecial <init> : (Lnet/time4j/tz/k;Ljava/lang/String;)V
    //   342: astore #7
    //   344: aload #7
    //   346: astore_0
    //   347: aload #7
    //   349: invokevirtual q : ()Z
    //   352: ifeq -> 439
    //   355: aload #7
    //   357: astore_0
    //   358: aload #8
    //   360: ldc 'GMT'
    //   362: invokevirtual equals : (Ljava/lang/Object;)Z
    //   365: ifne -> 439
    //   368: aload #7
    //   370: astore_0
    //   371: aload #8
    //   373: ldc 'UT'
    //   375: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   378: ifne -> 439
    //   381: aload #8
    //   383: ldc 'Z'
    //   385: invokevirtual equals : (Ljava/lang/Object;)Z
    //   388: ifeq -> 436
    //   391: aload #7
    //   393: astore_0
    //   394: goto -> 439
    //   397: aload #9
    //   399: aload #8
    //   401: invokeinterface a : (Ljava/lang/String;)Lnet/time4j/tz/m;
    //   406: astore_0
    //   407: aload_0
    //   408: ifnonnull -> 424
    //   411: aload #9
    //   413: aload #7
    //   415: aload #8
    //   417: invokestatic a : (Lnet/time4j/tz/r;Lnet/time4j/tz/k;Ljava/lang/String;)Lnet/time4j/tz/l;
    //   420: astore_0
    //   421: goto -> 439
    //   424: new net/time4j/tz/c
    //   427: dup
    //   428: aload #7
    //   430: aload_0
    //   431: invokespecial <init> : (Lnet/time4j/tz/k;Lnet/time4j/tz/m;)V
    //   434: astore #6
    //   436: aload #6
    //   438: astore_0
    //   439: aload_0
    //   440: ifnonnull -> 512
    //   443: iload_2
    //   444: ifne -> 449
    //   447: aconst_null
    //   448: areturn
    //   449: invokestatic getDefault : ()Ljava/util/TimeZone;
    //   452: invokevirtual getID : ()Ljava/lang/String;
    //   455: aload_1
    //   456: invokevirtual equals : (Ljava/lang/Object;)Z
    //   459: ifeq -> 478
    //   462: new net/time4j/tz/h
    //   465: dup
    //   466: new net/time4j/tz/e
    //   469: dup
    //   470: aload_1
    //   471: invokespecial <init> : (Ljava/lang/String;)V
    //   474: invokespecial <init> : (Lnet/time4j/tz/k;)V
    //   477: areturn
    //   478: new java/lang/StringBuilder
    //   481: dup
    //   482: invokespecial <init> : ()V
    //   485: astore_0
    //   486: aload_0
    //   487: ldc_w 'Unknown timezone: '
    //   490: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   493: pop
    //   494: aload_0
    //   495: aload_1
    //   496: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   499: pop
    //   500: new java/lang/IllegalArgumentException
    //   503: dup
    //   504: aload_0
    //   505: invokevirtual toString : ()Ljava/lang/String;
    //   508: invokespecial <init> : (Ljava/lang/String;)V
    //   511: athrow
    //   512: getstatic net/time4j/tz/l.k : Z
    //   515: ifeq -> 604
    //   518: getstatic net/time4j/tz/l.p : Ljava/util/concurrent/ConcurrentMap;
    //   521: aload_1
    //   522: new net/time4j/tz/l$c
    //   525: dup
    //   526: aload_0
    //   527: getstatic net/time4j/tz/l.q : Ljava/lang/ref/ReferenceQueue;
    //   530: invokespecial <init> : (Lnet/time4j/tz/l;Ljava/lang/ref/ReferenceQueue;)V
    //   533: invokeinterface putIfAbsent : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   538: checkcast net/time4j/tz/l$c
    //   541: astore_1
    //   542: aload_1
    //   543: ifnonnull -> 590
    //   546: ldc net/time4j/tz/l
    //   548: monitorenter
    //   549: getstatic net/time4j/tz/l.r : Ljava/util/LinkedList;
    //   552: aload_0
    //   553: invokevirtual addFirst : (Ljava/lang/Object;)V
    //   556: getstatic net/time4j/tz/l.r : Ljava/util/LinkedList;
    //   559: invokevirtual size : ()I
    //   562: getstatic net/time4j/tz/l.l : I
    //   565: if_icmplt -> 578
    //   568: getstatic net/time4j/tz/l.r : Ljava/util/LinkedList;
    //   571: invokevirtual removeLast : ()Ljava/lang/Object;
    //   574: pop
    //   575: goto -> 556
    //   578: ldc net/time4j/tz/l
    //   580: monitorexit
    //   581: goto -> 604
    //   584: astore_0
    //   585: ldc net/time4j/tz/l
    //   587: monitorexit
    //   588: aload_0
    //   589: athrow
    //   590: aload_1
    //   591: invokevirtual get : ()Ljava/lang/Object;
    //   594: checkcast net/time4j/tz/l
    //   597: astore_1
    //   598: aload_1
    //   599: ifnull -> 604
    //   602: aload_1
    //   603: areturn
    //   604: aload_0
    //   605: areturn
    // Exception table:
    //   from	to	target	type
    //   549	556	584	finally
    //   556	575	584	finally
    //   578	581	584	finally
    //   585	588	584	finally
  }
  
  private static l a(k paramk, boolean paramBoolean) {
    return (paramk instanceof p) ? ((p)paramk).s() : a(paramk, paramk.a(), paramBoolean);
  }
  
  private static l a(r paramr, k paramk, String paramString) {
    StringBuilder stringBuilder;
    String str1;
    Map<String, String> map = paramr.d();
    String str2 = paramString;
    m m = null;
    while (m == null) {
      str2 = map.get(str2);
      if (str2 != null)
        m = paramr.a(str2); 
    } 
    if (m == null) {
      StringBuilder stringBuilder1;
      str1 = paramr.b();
      if (str1.isEmpty())
        return null; 
      if (!str1.equals(paramr.getName())) {
        stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str1);
        stringBuilder1.append("~");
        stringBuilder1.append(paramString);
        return new a(paramk, d(stringBuilder1.toString()));
      } 
      stringBuilder = new StringBuilder();
      stringBuilder.append("Circular zone model provider fallback: ");
      stringBuilder.append(stringBuilder1.getName());
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
    return new c((k)stringBuilder, (m)str1);
  }
  
  private static r a(r paramr1, r paramr2) {
    String str = paramr1.e();
    if (!str.isEmpty()) {
      if (str.equals(c))
        return paramr1; 
      if (c == null) {
        r r1 = paramr1;
        if (paramr2 != null) {
          if (str.compareTo(paramr2.e()) > 0)
            return paramr1; 
          if (str.compareTo(paramr2.e()) == 0 && !paramr1.f().contains("{java.home}"))
            return paramr1; 
        } else {
          return r1;
        } 
      } 
    } 
    return paramr2;
  }
  
  private static void a(Map<String, k> paramMap) {
    paramMap.put("Etc/GMT", p.m);
    paramMap.put("Etc/Greenwich", p.m);
    paramMap.put("Etc/Universal", p.m);
    paramMap.put("Etc/Zulu", p.m);
    paramMap.put("Etc/GMT+0", p.m);
    paramMap.put("Etc/GMT-0", p.m);
    paramMap.put("Etc/GMT0", p.m);
    paramMap.put("Etc/UTC", p.m);
    paramMap.put("Etc/UCT", p.m);
    paramMap.put("Etc/GMT-14", p.f(50400));
    paramMap.put("Etc/GMT-13", p.f(46800));
    paramMap.put("Etc/GMT-12", p.f(43200));
    paramMap.put("Etc/GMT-11", p.f(39600));
    paramMap.put("Etc/GMT-10", p.f(36000));
    paramMap.put("Etc/GMT-9", p.f(32400));
    paramMap.put("Etc/GMT-8", p.f(28800));
    paramMap.put("Etc/GMT-7", p.f(25200));
    paramMap.put("Etc/GMT-6", p.f(21600));
    paramMap.put("Etc/GMT-5", p.f(18000));
    paramMap.put("Etc/GMT-4", p.f(14400));
    paramMap.put("Etc/GMT-3", p.f(10800));
    paramMap.put("Etc/GMT-2", p.f(7200));
    paramMap.put("Etc/GMT-1", p.f(3600));
    paramMap.put("Etc/GMT+1", p.f(-3600));
    paramMap.put("Etc/GMT+2", p.f(-7200));
    paramMap.put("Etc/GMT+3", p.f(-10800));
    paramMap.put("Etc/GMT+4", p.f(-14400));
    paramMap.put("Etc/GMT+5", p.f(-18000));
    paramMap.put("Etc/GMT+6", p.f(-21600));
    paramMap.put("Etc/GMT+7", p.f(-25200));
    paramMap.put("Etc/GMT+8", p.f(-28800));
    paramMap.put("Etc/GMT+9", p.f(-32400));
    paramMap.put("Etc/GMT+10", p.f(-36000));
    paramMap.put("Etc/GMT+11", p.f(-39600));
    paramMap.put("Etc/GMT+12", p.f(-43200));
  }
  
  public static List<k> b(String paramString) {
    if (paramString.equals("INCLUDE_ALIAS"))
      return e.b(i); 
    r r1 = c(paramString);
    if (r1 == null)
      return Collections.emptyList(); 
    ArrayList<k> arrayList = new ArrayList();
    Iterator<String> iterator = r1.a().iterator();
    while (iterator.hasNext())
      arrayList.add(e(iterator.next())); 
    Collections.sort(arrayList, d);
    return Collections.unmodifiableList(arrayList);
  }
  
  private static r c(String paramString) {
    if (!paramString.isEmpty())
      return paramString.equals("DEFAULT") ? o : s.get(paramString); 
    throw new IllegalArgumentException("Missing zone model provider.");
  }
  
  public static l d(String paramString) {
    return a((k)null, paramString, true);
  }
  
  private static k e(String paramString) {
    k k2 = m.get(paramString);
    k k1 = k2;
    if (k2 == null) {
      String str = paramString;
      if (paramString.startsWith("GMT")) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UTC");
        stringBuilder.append(paramString.substring(3));
        str = stringBuilder.toString();
      } 
      p p = p.a(str, false);
      k1 = p;
      if (p == null)
        k1 = new e(str); 
    } 
    return k1;
  }
  
  public static List<k> p() {
    return e.a(i);
  }
  
  private static l q() {
    String str = TimeZone.getDefault().getID();
    l l2 = a((k)null, str, false);
    l l1 = l2;
    if (l2 == null)
      l1 = new h(new e(str)); 
    return l1;
  }
  
  public static l r() {
    return (h && j != null) ? j : u;
  }
  
  public String a(d paramd, Locale paramLocale) {
    return a(d(), paramd, paramLocale);
  }
  
  public abstract l a(o paramo);
  
  public abstract p b(f paramf);
  
  public abstract m c();
  
  public abstract p c(net.time4j.c1.a parama, g paramg);
  
  public abstract boolean c(f paramf);
  
  public abstract k d();
  
  public abstract boolean d(net.time4j.c1.a parama, g paramg);
  
  public abstract o e();
  
  public abstract boolean f();
  
  static {
    boolean bool;
    List<?> list;
    s s1;
    r r1;
    l l1;
    System.getProperty("line.separator");
  }
  
  static {
    if (g || Boolean.getBoolean("net.time4j.allow.system.tz.override")) {
      bool = true;
    } else {
      bool = false;
    } 
    h = bool;
    s s4 = null;
  }
  
  static final class a implements Comparator<k> {
    public int a(k param1k1, k param1k2) {
      return param1k1.a().compareTo(param1k2.a());
    }
  }
  
  public static class b {
    public static void a() {
      // Byte code:
      //   0: ldc net/time4j/tz/l
      //   2: monitorenter
      //   3: invokestatic l : ()Ljava/lang/ref/ReferenceQueue;
      //   6: invokevirtual poll : ()Ljava/lang/ref/Reference;
      //   9: ifnull -> 15
      //   12: goto -> 3
      //   15: invokestatic m : ()Ljava/util/LinkedList;
      //   18: invokevirtual clear : ()V
      //   21: ldc net/time4j/tz/l
      //   23: monitorexit
      //   24: new net/time4j/tz/l$e
      //   27: dup
      //   28: invokespecial <init> : ()V
      //   31: invokestatic a : (Lnet/time4j/tz/l$e;)Lnet/time4j/tz/l$e;
      //   34: pop
      //   35: invokestatic n : ()Ljava/util/concurrent/ConcurrentMap;
      //   38: invokeinterface clear : ()V
      //   43: invokestatic o : ()Z
      //   46: ifeq -> 56
      //   49: invokestatic g : ()Lnet/time4j/tz/l;
      //   52: invokestatic a : (Lnet/time4j/tz/l;)Lnet/time4j/tz/l;
      //   55: pop
      //   56: return
      //   57: astore_0
      //   58: ldc net/time4j/tz/l
      //   60: monitorexit
      //   61: goto -> 66
      //   64: aload_0
      //   65: athrow
      //   66: goto -> 64
      // Exception table:
      //   from	to	target	type
      //   3	12	57	finally
      //   15	24	57	finally
      //   58	61	57	finally
    }
  }
  
  private static class c extends SoftReference<l> {
    private final String a;
    
    c(l param1l, ReferenceQueue<l> param1ReferenceQueue) {
      super(param1l, param1ReferenceQueue);
      this.a = param1l.d().a();
    }
  }
  
  private static class d implements r, s {
    private d() {}
    
    public String a(String param1String, d param1d, Locale param1Locale) {
      if (param1Locale != null) {
        if (param1String.isEmpty())
          return ""; 
        TimeZone timeZone = h.c(param1String);
        return timeZone.getID().equals(param1String) ? timeZone.getDisplayName(param1d.b(), param1d.a() ^ true, param1Locale) : "";
      } 
      throw new NullPointerException("Missing locale.");
    }
    
    public String a(boolean param1Boolean, Locale param1Locale) {
      return param1Boolean ? "GMT" : "GMT±hh:mm";
    }
    
    public Set<String> a() {
      HashSet<String> hashSet = new HashSet();
      hashSet.addAll(Arrays.asList(TimeZone.getAvailableIDs()));
      return hashSet;
    }
    
    public Set<String> a(Locale param1Locale, boolean param1Boolean) {
      return Collections.emptySet();
    }
    
    public m a(String param1String) {
      return null;
    }
    
    public String b() {
      return "";
    }
    
    public s c() {
      return this;
    }
    
    public Map<String, String> d() {
      return Collections.emptyMap();
    }
    
    public String e() {
      return "";
    }
    
    public String f() {
      return "";
    }
    
    public String getName() {
      return "java.util.TimeZone";
    }
  }
  
  private static class e {
    private final List<k> a;
    
    private final List<k> b;
    
    e() {
      ArrayList<p> arrayList1 = new ArrayList(1024);
      ArrayList<p> arrayList2 = new ArrayList(1024);
      arrayList1.add(p.m);
      Iterator<Map.Entry> iterator = l.h().entrySet().iterator();
      while (iterator.hasNext()) {
        r r = (r)((Map.Entry)iterator.next()).getValue();
        if (r == l.i() && l.j() != l.i())
          continue; 
        Iterator<String> iterator2 = r.a().iterator();
        while (iterator2.hasNext()) {
          k k = l.a(iterator2.next());
          if (!arrayList1.contains(k))
            arrayList1.add(k); 
        } 
        arrayList2.addAll(arrayList1);
        Iterator<String> iterator1 = r.d().keySet().iterator();
        while (iterator1.hasNext()) {
          k k = l.a(iterator1.next());
          if (!arrayList2.contains(k))
            arrayList2.add(k); 
        } 
      } 
      Collections.sort(arrayList1, l.k());
      Collections.sort(arrayList2, l.k());
      this.a = Collections.unmodifiableList((List)arrayList1);
      this.b = Collections.unmodifiableList((List)arrayList2);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/tz/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */