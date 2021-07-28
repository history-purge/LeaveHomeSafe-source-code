package net.time4j;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.text.ParsePosition;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import net.time4j.d1.c;
import net.time4j.d1.d;
import net.time4j.d1.e;
import net.time4j.d1.o;
import net.time4j.d1.p;
import net.time4j.d1.q;
import net.time4j.d1.s;
import net.time4j.d1.t;
import net.time4j.d1.x;
import net.time4j.d1.z;
import net.time4j.e1.a;
import net.time4j.e1.b;
import net.time4j.e1.m;
import net.time4j.e1.u;
import net.time4j.e1.w;

public final class k {
  private static final SortedMap<g0, String> d;
  
  private static k e = new k(Locale.ROOT, "iso8601", d);
  
  private static final c<k> f = a.a("CUSTOM_DAY_PERIOD", k.class);
  
  private final transient Locale a;
  
  private final transient String b;
  
  private final transient SortedMap<g0, String> c;
  
  private k(Locale paramLocale, String paramString, SortedMap<g0, String> paramSortedMap) {
    this.a = paramLocale;
    this.b = paramString;
    this.c = Collections.unmodifiableSortedMap(paramSortedMap);
  }
  
  public static k a(Map<g0, String> paramMap) {
    if (!paramMap.isEmpty()) {
      StringBuilder stringBuilder;
      TreeMap<g0, String> treeMap = new TreeMap<g0, String>(paramMap);
      for (g0 g0 : paramMap.keySet()) {
        if (g0.getHour() == 24) {
          treeMap.put(g0.H(), paramMap.get(g0));
          treeMap.remove(g0);
          continue;
        } 
        if (!((String)paramMap.get(g0)).isEmpty())
          continue; 
        stringBuilder = new StringBuilder();
        stringBuilder.append("Map has empty label: ");
        stringBuilder.append(paramMap);
        throw new IllegalArgumentException(stringBuilder.toString());
      } 
      return new k(null, "", (SortedMap<g0, String>)stringBuilder);
    } 
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Label map is empty.");
    throw illegalArgumentException;
  }
  
  private static boolean a(String paramString) {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (paramString.charAt(0) == 'T') {
      bool1 = bool2;
      if (paramString.length() == 5) {
        bool1 = bool2;
        if (Character.isDigit(paramString.charAt(1)))
          bool1 = true; 
      } 
    } 
    return bool1;
  }
  
  private static String b(Map<String, String> paramMap, w paramw, m paramm, String paramString) {
    w w1 = paramw;
    if (paramw == w.e)
      w1 = w.d; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(c(w1, paramm));
    stringBuilder.append(paramString);
    String str2 = stringBuilder.toString();
    String str1 = str2;
    if (!paramMap.containsKey(str2)) {
      if (paramm == m.d) {
        w w3 = w.d;
        return (w1 == w3) ? b(paramMap, w1, m.c, paramString) : b(paramMap, w3, paramm, paramString);
      } 
      w w2 = w.d;
      str1 = str2;
      if (w1 != w2)
        str1 = b(paramMap, w2, paramm, paramString); 
    } 
    return str1;
  }
  
  private static Map<String, String> b(Locale paramLocale, String paramString) {
    Map<String, String> map2 = b.a(paramString, paramLocale).a();
    Map<String, String> map1 = map2;
    if (!paramString.equals("iso8601")) {
      map1 = map2;
      if (!"true".equals(map2.get("hasDayPeriods")))
        map1 = b.a(paramLocale).a(); 
    } 
    return map1;
  }
  
  private boolean b() {
    return (this.a != null);
  }
  
  private static String c(w paramw, m paramm) {
    char c1;
    int i = a.a[paramw.ordinal()];
    if (i != 1) {
      if (i != 2) {
        c1 = 'a';
      } else {
        c1 = 'n';
      } 
    } else {
      c1 = 'w';
    } 
    char c2 = c1;
    if (paramm == m.d)
      c2 = Character.toUpperCase(c1); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("P(");
    stringBuilder.append(c2);
    stringBuilder.append(")_");
    return stringBuilder.toString();
  }
  
  static k c(Locale paramLocale, String paramString) {
    StringBuilder stringBuilder;
    String str2 = paramLocale.getLanguage();
    if (str2.equals("nn"))
      paramLocale = new Locale("nb"); 
    Map<String, String> map = b(paramLocale, paramString);
    TreeMap<Object, Object> treeMap = new TreeMap<Object, Object>();
    for (String str : map.keySet()) {
      if (a(str)) {
        int i = Integer.parseInt(str.substring(1, 3));
        int j = Integer.parseInt(str.substring(3, 5));
        g0 g0 = g0.H();
        if (i == 24) {
          if (j != 0) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid time key: ");
            stringBuilder.append(str);
            throw new IllegalStateException(stringBuilder.toString());
          } 
        } else if (i >= 0 && i < 24 && j >= 0 && j < 60) {
          g0 = (g0)g0.b((i * 60 + j), g.d);
        } else {
          stringBuilder = new StringBuilder();
          stringBuilder.append("Invalid time key: ");
          stringBuilder.append(str);
          throw new IllegalStateException(stringBuilder.toString());
        } 
        treeMap.put(g0, map.get(str));
      } 
    } 
    if (treeMap.isEmpty() || str2.isEmpty())
      return e; 
    Iterator<g0> iterator = treeMap.keySet().iterator();
    for (String str1 = ""; iterator.hasNext(); str1 = str2) {
      str2 = (String)treeMap.get(iterator.next());
      if (str2.equals(str1)) {
        iterator.remove();
        continue;
      } 
    } 
    return new k((Locale)stringBuilder, paramString, (SortedMap)treeMap);
  }
  
  private static String d(g0 paramg0) {
    int i = ((Integer)paramg0.e(g0.z)).intValue();
    return (i == 0 || i == 1440) ? "midnight" : ((i < 720) ? "am" : ((i == 720) ? "noon" : "pm"));
  }
  
  public t<o, String> a(w paramw, m paramm) {
    return new d(this, false, paramw, paramm);
  }
  
  public g0 a(g0 paramg0) {
    g0 g01 = paramg0;
    if (paramg0.getHour() == 24)
      g01 = g0.H(); 
    for (g0 g02 : this.c.keySet()) {
      if (g01.c(g02))
        return g02; 
    } 
    return this.c.firstKey();
  }
  
  public t<o, String> b(w paramw, m paramm) {
    return new d(this, true, paramw, paramm);
  }
  
  public g0 b(g0 paramg0) {
    g0 g01 = paramg0;
    if (paramg0.getHour() == 24)
      g01 = g0.H(); 
    paramg0 = this.c.lastKey();
    for (g0 g02 : this.c.keySet()) {
      if (g01.d(g02))
        return g02; 
      if (g01.c(g02))
        return paramg0; 
      paramg0 = g02;
    } 
    return paramg0;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof k) {
      paramObject = paramObject;
      Locale locale = this.a;
      if (locale == null) {
        if (((k)paramObject).a != null)
          return false; 
      } else if (!locale.equals(((k)paramObject).a)) {
        return false;
      } 
      return (this.c.equals(((k)paramObject).c) && this.b.equals(((k)paramObject).b));
    } 
    return false;
  }
  
  public int hashCode() {
    return this.c.hashCode();
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(64);
    stringBuilder.append("DayPeriod[");
    if (b()) {
      stringBuilder.append("locale=");
      stringBuilder.append(this.a);
      stringBuilder.append(',');
      if (!this.b.equals("iso8601")) {
        stringBuilder.append(",calendar-type=");
        stringBuilder.append(this.b);
        stringBuilder.append(',');
      } 
    } 
    stringBuilder.append(this.c);
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
  
  static {
    TreeMap<Object, Object> treeMap = new TreeMap<Object, Object>();
    treeMap.put(g0.H(), "am");
    treeMap.put(g0.g(12), "pm");
    d = Collections.unmodifiableSortedMap(treeMap);
  }
  
  static class b extends e<String> implements u<String>, z<q<?>, String> {
    private static final long serialVersionUID = 5589976208326940032L;
    
    private final transient boolean c;
    
    private final transient k d;
    
    b(boolean param1Boolean, Locale param1Locale, String param1String) {
      this(param1Boolean, k.c(param1Locale, param1String));
    }
    
    b(boolean param1Boolean, k param1k) {
      super(str);
      String str;
      this.c = param1Boolean;
      this.d = param1k;
    }
    
    private String a(CharSequence param1CharSequence, ParsePosition param1ParsePosition, d param1d, m param1m) {
      // Byte code:
      //   0: new java/util/ArrayList
      //   3: dup
      //   4: invokespecial <init> : ()V
      //   7: astore #20
      //   9: aload_0
      //   10: getfield c : Z
      //   13: istore #14
      //   15: ldc 'pm'
      //   17: astore #17
      //   19: ldc 'am'
      //   21: astore #18
      //   23: iload #14
      //   25: ifeq -> 71
      //   28: aload #20
      //   30: ldc 'am'
      //   32: invokeinterface add : (Ljava/lang/Object;)Z
      //   37: pop
      //   38: aload #20
      //   40: ldc 'pm'
      //   42: invokeinterface add : (Ljava/lang/Object;)Z
      //   47: pop
      //   48: aload #20
      //   50: ldc 'midnight'
      //   52: invokeinterface add : (Ljava/lang/Object;)Z
      //   57: pop
      //   58: aload #20
      //   60: ldc 'noon'
      //   62: invokeinterface add : (Ljava/lang/Object;)Z
      //   67: pop
      //   68: goto -> 111
      //   71: aload #20
      //   73: new java/util/LinkedHashSet
      //   76: dup
      //   77: aload_0
      //   78: getfield d : Lnet/time4j/k;
      //   81: invokestatic b : (Lnet/time4j/k;)Ljava/util/SortedMap;
      //   84: invokeinterface values : ()Ljava/util/Collection;
      //   89: invokespecial <init> : (Ljava/util/Collection;)V
      //   92: invokeinterface addAll : (Ljava/util/Collection;)Z
      //   97: pop
      //   98: aload_0
      //   99: getfield d : Lnet/time4j/k;
      //   102: invokestatic a : (Lnet/time4j/k;)Z
      //   105: ifeq -> 111
      //   108: goto -> 48
      //   111: aload_0
      //   112: getfield d : Lnet/time4j/k;
      //   115: invokestatic a : (Lnet/time4j/k;)Z
      //   118: ifeq -> 137
      //   121: aload_0
      //   122: invokevirtual j : ()Ljava/util/Locale;
      //   125: aload_0
      //   126: invokevirtual h : ()Ljava/lang/String;
      //   129: invokestatic a : (Ljava/util/Locale;Ljava/lang/String;)Ljava/util/Map;
      //   132: astore #19
      //   134: goto -> 140
      //   137: aconst_null
      //   138: astore #19
      //   140: aload_3
      //   141: getstatic net/time4j/e1/a.g : Lnet/time4j/d1/c;
      //   144: getstatic net/time4j/e1/w.c : Lnet/time4j/e1/w;
      //   147: invokeinterface a : (Lnet/time4j/d1/c;Ljava/lang/Object;)Ljava/lang/Object;
      //   152: checkcast net/time4j/e1/w
      //   155: astore #25
      //   157: aload_3
      //   158: getstatic net/time4j/e1/a.i : Lnet/time4j/d1/c;
      //   161: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
      //   164: invokeinterface a : (Lnet/time4j/d1/c;Ljava/lang/Object;)Ljava/lang/Object;
      //   169: checkcast java/lang/Boolean
      //   172: invokevirtual booleanValue : ()Z
      //   175: istore #15
      //   177: aload_3
      //   178: getstatic net/time4j/e1/a.j : Lnet/time4j/d1/c;
      //   181: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
      //   184: invokeinterface a : (Lnet/time4j/d1/c;Ljava/lang/Object;)Ljava/lang/Object;
      //   189: checkcast java/lang/Boolean
      //   192: invokevirtual booleanValue : ()Z
      //   195: istore #16
      //   197: aload_2
      //   198: invokevirtual getIndex : ()I
      //   201: istore #12
      //   203: aload_1
      //   204: invokeinterface length : ()I
      //   209: istore #13
      //   211: aload #20
      //   213: invokeinterface iterator : ()Ljava/util/Iterator;
      //   218: astore_3
      //   219: aconst_null
      //   220: astore #21
      //   222: iconst_0
      //   223: istore #8
      //   225: aload #19
      //   227: astore #20
      //   229: aload_3
      //   230: astore #19
      //   232: aload #4
      //   234: astore #23
      //   236: aload #19
      //   238: invokeinterface hasNext : ()Z
      //   243: ifeq -> 833
      //   246: aload #19
      //   248: invokeinterface next : ()Ljava/lang/Object;
      //   253: checkcast java/lang/String
      //   256: astore #22
      //   258: aload_0
      //   259: getfield d : Lnet/time4j/k;
      //   262: invokestatic a : (Lnet/time4j/k;)Z
      //   265: ifeq -> 399
      //   268: aload_0
      //   269: getfield c : Z
      //   272: ifeq -> 356
      //   275: aload #20
      //   277: aload #25
      //   279: aload #23
      //   281: aload #22
      //   283: invokestatic a : (Ljava/util/Map;Lnet/time4j/e1/w;Lnet/time4j/e1/m;Ljava/lang/String;)Ljava/lang/String;
      //   286: astore #24
      //   288: aload #24
      //   290: astore_3
      //   291: aload #20
      //   293: aload #24
      //   295: invokeinterface containsKey : (Ljava/lang/Object;)Z
      //   300: ifne -> 368
      //   303: aload #22
      //   305: ldc 'midnight'
      //   307: invokevirtual equals : (Ljava/lang/Object;)Z
      //   310: ifeq -> 328
      //   313: aload #20
      //   315: aload #25
      //   317: aload #23
      //   319: aload #18
      //   321: invokestatic a : (Ljava/util/Map;Lnet/time4j/e1/w;Lnet/time4j/e1/m;Ljava/lang/String;)Ljava/lang/String;
      //   324: astore_3
      //   325: goto -> 368
      //   328: aload #24
      //   330: astore_3
      //   331: aload #22
      //   333: ldc 'noon'
      //   335: invokevirtual equals : (Ljava/lang/Object;)Z
      //   338: ifeq -> 368
      //   341: aload #20
      //   343: aload #25
      //   345: aload #23
      //   347: aload #17
      //   349: invokestatic a : (Ljava/util/Map;Lnet/time4j/e1/w;Lnet/time4j/e1/m;Ljava/lang/String;)Ljava/lang/String;
      //   352: astore_3
      //   353: goto -> 368
      //   356: aload #20
      //   358: aload #25
      //   360: aload #23
      //   362: aload #22
      //   364: invokestatic a : (Ljava/util/Map;Lnet/time4j/e1/w;Lnet/time4j/e1/m;Ljava/lang/String;)Ljava/lang/String;
      //   367: astore_3
      //   368: aload #20
      //   370: aload_3
      //   371: invokeinterface containsKey : (Ljava/lang/Object;)Z
      //   376: ifeq -> 394
      //   379: aload #20
      //   381: aload_3
      //   382: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
      //   387: checkcast java/lang/String
      //   390: astore_3
      //   391: goto -> 402
      //   394: aconst_null
      //   395: astore_3
      //   396: goto -> 402
      //   399: aload #22
      //   401: astore_3
      //   402: aload_3
      //   403: ifnull -> 794
      //   406: aload_3
      //   407: invokevirtual length : ()I
      //   410: istore #9
      //   412: iload #12
      //   414: istore #7
      //   416: iconst_0
      //   417: istore #11
      //   419: iconst_1
      //   420: istore #14
      //   422: iload #14
      //   424: ifeq -> 534
      //   427: iload #11
      //   429: iload #9
      //   431: if_icmpge -> 534
      //   434: iload #12
      //   436: iload #11
      //   438: iadd
      //   439: istore #10
      //   441: iload #10
      //   443: iload #13
      //   445: if_icmplt -> 454
      //   448: iconst_0
      //   449: istore #14
      //   451: goto -> 525
      //   454: aload_1
      //   455: iload #10
      //   457: invokeinterface charAt : (I)C
      //   462: istore #5
      //   464: aload_3
      //   465: iload #11
      //   467: invokevirtual charAt : (I)C
      //   470: istore #6
      //   472: iload #15
      //   474: ifeq -> 490
      //   477: aload_0
      //   478: iload #5
      //   480: iload #6
      //   482: invokespecial a : (CC)Z
      //   485: istore #14
      //   487: goto -> 506
      //   490: iload #5
      //   492: iload #6
      //   494: if_icmpne -> 503
      //   497: iconst_1
      //   498: istore #14
      //   500: goto -> 506
      //   503: iconst_0
      //   504: istore #14
      //   506: iload #7
      //   508: istore #10
      //   510: iload #14
      //   512: ifeq -> 521
      //   515: iload #7
      //   517: iconst_1
      //   518: iadd
      //   519: istore #10
      //   521: iload #10
      //   523: istore #7
      //   525: iload #11
      //   527: iconst_1
      //   528: iadd
      //   529: istore #11
      //   531: goto -> 422
      //   534: aload #17
      //   536: astore #23
      //   538: aload #18
      //   540: astore #24
      //   542: iload #16
      //   544: ifne -> 647
      //   547: iload #9
      //   549: iconst_1
      //   550: if_icmpne -> 556
      //   553: goto -> 647
      //   556: aload #21
      //   558: astore_3
      //   559: iload #8
      //   561: istore #7
      //   563: aload #23
      //   565: astore #18
      //   567: aload #24
      //   569: astore #17
      //   571: iload #14
      //   573: ifeq -> 811
      //   576: aload #21
      //   578: ifnonnull -> 584
      //   581: goto -> 661
      //   584: aload_0
      //   585: getfield c : Z
      //   588: ifeq -> 598
      //   591: iload #9
      //   593: istore #7
      //   595: goto -> 732
      //   598: new java/lang/StringBuilder
      //   601: dup
      //   602: invokespecial <init> : ()V
      //   605: astore_3
      //   606: aload_3
      //   607: aload #21
      //   609: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   612: pop
      //   613: aload_3
      //   614: ldc '|'
      //   616: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   619: pop
      //   620: aload_3
      //   621: aload #22
      //   623: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   626: pop
      //   627: aload_3
      //   628: invokevirtual toString : ()Ljava/lang/String;
      //   631: astore_3
      //   632: iload #9
      //   634: istore #7
      //   636: aload #23
      //   638: astore #18
      //   640: aload #24
      //   642: astore #17
      //   644: goto -> 811
      //   647: iload #7
      //   649: iload #12
      //   651: isub
      //   652: istore #9
      //   654: iload #8
      //   656: iload #9
      //   658: if_icmpge -> 679
      //   661: iload #9
      //   663: istore #7
      //   665: aload #22
      //   667: astore_3
      //   668: aload #23
      //   670: astore #18
      //   672: aload #24
      //   674: astore #17
      //   676: goto -> 811
      //   679: aload #21
      //   681: astore_3
      //   682: iload #8
      //   684: istore #7
      //   686: aload #23
      //   688: astore #18
      //   690: aload #24
      //   692: astore #17
      //   694: aload #21
      //   696: ifnull -> 811
      //   699: aload #21
      //   701: astore_3
      //   702: iload #8
      //   704: istore #7
      //   706: aload #23
      //   708: astore #18
      //   710: aload #24
      //   712: astore #17
      //   714: iload #8
      //   716: iload #9
      //   718: if_icmpne -> 811
      //   721: aload_0
      //   722: getfield c : Z
      //   725: ifeq -> 745
      //   728: iload #8
      //   730: istore #7
      //   732: aconst_null
      //   733: astore_3
      //   734: aload #23
      //   736: astore #18
      //   738: aload #24
      //   740: astore #17
      //   742: goto -> 811
      //   745: new java/lang/StringBuilder
      //   748: dup
      //   749: invokespecial <init> : ()V
      //   752: astore_3
      //   753: aload_3
      //   754: aload #21
      //   756: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   759: pop
      //   760: aload_3
      //   761: ldc '|'
      //   763: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   766: pop
      //   767: aload_3
      //   768: aload #22
      //   770: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   773: pop
      //   774: aload_3
      //   775: invokevirtual toString : ()Ljava/lang/String;
      //   778: astore_3
      //   779: iload #8
      //   781: istore #7
      //   783: aload #23
      //   785: astore #18
      //   787: aload #24
      //   789: astore #17
      //   791: goto -> 811
      //   794: aload #17
      //   796: astore_3
      //   797: aload #18
      //   799: astore #17
      //   801: aload_3
      //   802: astore #18
      //   804: iload #8
      //   806: istore #7
      //   808: aload #21
      //   810: astore_3
      //   811: aload #17
      //   813: astore #21
      //   815: aload #18
      //   817: astore #17
      //   819: aload #21
      //   821: astore #18
      //   823: aload_3
      //   824: astore #21
      //   826: iload #7
      //   828: istore #8
      //   830: goto -> 232
      //   833: aload #21
      //   835: ifnonnull -> 847
      //   838: aload_2
      //   839: iload #12
      //   841: invokevirtual setErrorIndex : (I)V
      //   844: aload #21
      //   846: areturn
      //   847: aload_2
      //   848: iload #12
      //   850: iload #8
      //   852: iadd
      //   853: invokevirtual setIndex : (I)V
      //   856: aload #21
      //   858: areturn
    }
    
    private boolean a(char param1Char1, char param1Char2) {
      char c = param1Char1;
      if (param1Char1 >= 'a') {
        c = param1Char1;
        if (param1Char1 <= 'z')
          c = (char)(param1Char1 - 97 + 65); 
      } 
      param1Char1 = param1Char2;
      if (param1Char2 >= 'a') {
        param1Char1 = param1Char2;
        if (param1Char2 <= 'z')
          param1Char1 = (char)(param1Char2 - 97 + 65); 
      } 
      if (c >= 'A' && c <= 'Z')
        return (c == param1Char1); 
      Locale locale = j();
      return String.valueOf(c).toUpperCase(locale).equals(String.valueOf(param1Char1).toUpperCase(locale));
    }
    
    private void readObject(ObjectInputStream param1ObjectInputStream) {
      throw new InvalidObjectException("Serialization proxy required.");
    }
    
    private Object writeReplace() {
      return new SPX(this, 7);
    }
    
    public char a() {
      return this.c ? 'b' : 'B';
    }
    
    public String a(CharSequence param1CharSequence, ParsePosition param1ParsePosition, d param1d) {
      int i = param1ParsePosition.getIndex();
      m m = (m)param1d.a(a.h, m.c);
      String str2 = a(param1CharSequence, param1ParsePosition, param1d, m);
      String str1 = str2;
      if (str2 == null) {
        str1 = str2;
        if (((Boolean)param1d.a(a.k, Boolean.TRUE)).booleanValue()) {
          param1ParsePosition.setErrorIndex(-1);
          param1ParsePosition.setIndex(i);
          m m2 = m.c;
          m m1 = m2;
          if (m == m2)
            m1 = m.d; 
          str1 = a(param1CharSequence, param1ParsePosition, param1d, m1);
        } 
      } 
      return str1;
    }
    
    public p<?> a(q<?> param1q) {
      return null;
    }
    
    public q<?> a(q<?> param1q, String param1String, boolean param1Boolean) {
      throw new IllegalArgumentException("Day period element cannot be set.");
    }
    
    protected <T extends q<T>> z<T, String> a(x<T> param1x) {
      return param1x.c(g0.r) ? this : null;
    }
    
    public void a(o param1o, Appendable param1Appendable, d param1d) {
      t<o, String> t;
      w w = (w)param1d.a(a.g, w.c);
      m m = (m)param1d.a(a.h, m.c);
      if (this.c) {
        t = this.d.b(w, m);
      } else {
        t = this.d.a(w, (m)t);
      } 
      param1Appendable.append((String)t.a(param1o));
    }
    
    protected boolean a(e<?> param1e) {
      param1e = param1e;
      return this.d.equals(((b)param1e).d);
    }
    
    public boolean a(q<?> param1q, String param1String) {
      return false;
    }
    
    public String b() {
      if (this.c)
        return "pm"; 
      g0 g0 = (g0)k.b(this.d).lastKey();
      return (String)k.b(this.d).get(g0);
    }
    
    public p<?> b(q<?> param1q) {
      return null;
    }
    
    public String c(q<?> param1q) {
      return b();
    }
    
    public String d(q<?> param1q) {
      return q();
    }
    
    public boolean d() {
      return false;
    }
    
    public String e(q<?> param1q) {
      g0 g02 = (g0)param1q.e(g0.r);
      if (this.c)
        return k.c(g02); 
      if (k.a(this.d)) {
        String str;
        Map map = k.a(j(), h());
        param1q = null;
        if (g02.v()) {
          str = "midnight";
        } else if (g02.d(g0.g(12))) {
          str = "noon";
        } 
        if (str != null && map.containsKey(k.a(map, w.d, m.c, str)))
          return str; 
      } 
      g0 g01 = this.d.b(g02);
      return (String)k.b(this.d).get(g01);
    }
    
    public Class<String> getType() {
      return String.class;
    }
    
    String h() {
      return k.d(this.d);
    }
    
    Object i() {
      return k.b(this.d);
    }
    
    Locale j() {
      return k.c(this.d);
    }
    
    boolean k() {
      return this.c;
    }
    
    public String q() {
      if (this.c)
        return "am"; 
      g0 g0 = (g0)k.b(this.d).firstKey();
      return (String)k.b(this.d).get(g0);
    }
    
    public boolean s() {
      return true;
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder(32);
      stringBuilder.append(name());
      stringBuilder.append('@');
      stringBuilder.append(this.d);
      return stringBuilder.toString();
    }
  }
  
  static class c implements s {
    private static int a(q<?> param1q) {
      byte b;
      if (param1q.c(g0.t)) {
        int i = ((Integer)param1q.e(g0.t)).intValue();
        b = i;
        if (i == 12)
          return 0; 
      } else {
        if (param1q.c(g0.v))
          return ((Integer)param1q.e(g0.v)).intValue(); 
        b = -1;
      } 
      return b;
    }
    
    private static k b(Locale param1Locale, d param1d) {
      return param1d.b(k.a()) ? (k)param1d.a(k.a()) : k.c(param1Locale, (String)param1d.a(a.b, "iso8601"));
    }
    
    public Set<p<?>> a(Locale param1Locale, d param1d) {
      k k = b(param1Locale, param1d);
      HashSet<k.b> hashSet = new HashSet();
      hashSet.add(new k.b(false, k));
      if (!param1d.b(k.a()))
        hashSet.add(new k.b(true, k)); 
      return (Set)Collections.unmodifiableSet(hashSet);
    }
    
    public q<?> a(q<?> param1q, Locale param1Locale, d param1d) {
      // Byte code:
      //   0: aload_1
      //   1: astore #8
      //   3: aload #8
      //   5: astore #7
      //   7: aload #8
      //   9: getstatic net/time4j/g0.r : Lnet/time4j/t0;
      //   12: invokevirtual c : (Lnet/time4j/d1/p;)Z
      //   15: ifne -> 642
      //   18: aload #8
      //   20: astore #7
      //   22: aload #8
      //   24: getstatic net/time4j/g0.x : Lnet/time4j/j0;
      //   27: invokevirtual c : (Lnet/time4j/d1/p;)Z
      //   30: ifne -> 642
      //   33: aload #8
      //   35: astore #7
      //   37: aload #8
      //   39: getstatic net/time4j/g0.w : Lnet/time4j/j0;
      //   42: invokevirtual c : (Lnet/time4j/d1/p;)Z
      //   45: ifne -> 642
      //   48: aload #8
      //   50: getstatic net/time4j/g0.u : Lnet/time4j/c;
      //   53: invokevirtual c : (Lnet/time4j/d1/p;)Z
      //   56: ifeq -> 62
      //   59: aload #8
      //   61: areturn
      //   62: aload_2
      //   63: aload_3
      //   64: invokestatic b : (Ljava/util/Locale;Lnet/time4j/d1/d;)Lnet/time4j/k;
      //   67: astore #11
      //   69: iconst_0
      //   70: istore #5
      //   72: new net/time4j/k$b
      //   75: dup
      //   76: iconst_0
      //   77: aload #11
      //   79: invokespecial <init> : (ZLnet/time4j/k;)V
      //   82: astore #10
      //   84: aload #8
      //   86: aload #10
      //   88: invokevirtual c : (Lnet/time4j/d1/p;)Z
      //   91: ifeq -> 547
      //   94: aload #8
      //   96: aload #10
      //   98: invokevirtual e : (Lnet/time4j/d1/p;)Ljava/lang/Object;
      //   101: checkcast java/lang/String
      //   104: astore #12
      //   106: iconst_0
      //   107: istore #4
      //   109: aconst_null
      //   110: astore_3
      //   111: aload #12
      //   113: bipush #124
      //   115: iload #5
      //   117: invokevirtual indexOf : (II)I
      //   120: istore #6
      //   122: iload #6
      //   124: iconst_m1
      //   125: if_icmpne -> 140
      //   128: aload #12
      //   130: iload #5
      //   132: invokevirtual substring : (I)Ljava/lang/String;
      //   135: astore #9
      //   137: goto -> 151
      //   140: aload #12
      //   142: iload #5
      //   144: iload #6
      //   146: invokevirtual substring : (II)Ljava/lang/String;
      //   149: astore #9
      //   151: iload #6
      //   153: iconst_1
      //   154: iadd
      //   155: istore #5
      //   157: iload #4
      //   159: iconst_1
      //   160: iadd
      //   161: istore #4
      //   163: aload #11
      //   165: invokestatic a : (Lnet/time4j/k;)Z
      //   168: ifeq -> 209
      //   171: aload_3
      //   172: ifnonnull -> 209
      //   175: aload #9
      //   177: ldc 'midnight'
      //   179: invokevirtual equals : (Ljava/lang/Object;)Z
      //   182: ifeq -> 192
      //   185: getstatic net/time4j/z.c : Lnet/time4j/z;
      //   188: astore_2
      //   189: goto -> 504
      //   192: aload #9
      //   194: ldc 'noon'
      //   196: invokevirtual equals : (Ljava/lang/Object;)Z
      //   199: ifeq -> 209
      //   202: getstatic net/time4j/z.d : Lnet/time4j/z;
      //   205: astore_2
      //   206: goto -> 189
      //   209: aload #11
      //   211: invokestatic b : (Lnet/time4j/k;)Ljava/util/SortedMap;
      //   214: invokeinterface keySet : ()Ljava/util/Set;
      //   219: invokeinterface iterator : ()Ljava/util/Iterator;
      //   224: astore #13
      //   226: aload_3
      //   227: astore_2
      //   228: aload #13
      //   230: invokeinterface hasNext : ()Z
      //   235: ifeq -> 504
      //   238: aload #13
      //   240: invokeinterface next : ()Ljava/lang/Object;
      //   245: checkcast net/time4j/g0
      //   248: astore_2
      //   249: aload_3
      //   250: astore #7
      //   252: aload #11
      //   254: invokestatic b : (Lnet/time4j/k;)Ljava/util/SortedMap;
      //   257: aload_2
      //   258: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
      //   263: checkcast java/lang/String
      //   266: aload #9
      //   268: invokevirtual equals : (Ljava/lang/Object;)Z
      //   271: ifeq -> 498
      //   274: aload_1
      //   275: invokestatic a : (Lnet/time4j/d1/q;)I
      //   278: istore #6
      //   280: aload #11
      //   282: aload_2
      //   283: invokevirtual a : (Lnet/time4j/g0;)Lnet/time4j/g0;
      //   286: astore #7
      //   288: aload_2
      //   289: invokevirtual getHour : ()I
      //   292: bipush #12
      //   294: if_icmplt -> 359
      //   297: aload #7
      //   299: aload_2
      //   300: invokevirtual b : (Lnet/time4j/g0;)Z
      //   303: ifne -> 352
      //   306: aload #7
      //   308: invokestatic H : ()Lnet/time4j/g0;
      //   311: invokevirtual d : (Lnet/time4j/g0;)Z
      //   314: ifeq -> 320
      //   317: goto -> 352
      //   320: iload #6
      //   322: iconst_m1
      //   323: if_icmpeq -> 397
      //   326: iload #6
      //   328: bipush #12
      //   330: iadd
      //   331: aload_2
      //   332: invokevirtual getHour : ()I
      //   335: if_icmplt -> 345
      //   338: getstatic net/time4j/z.d : Lnet/time4j/z;
      //   341: astore_2
      //   342: goto -> 349
      //   345: getstatic net/time4j/z.c : Lnet/time4j/z;
      //   348: astore_2
      //   349: goto -> 399
      //   352: getstatic net/time4j/z.d : Lnet/time4j/z;
      //   355: astore_2
      //   356: goto -> 399
      //   359: aload #7
      //   361: bipush #12
      //   363: invokestatic g : (I)Lnet/time4j/g0;
      //   366: invokevirtual b : (Lnet/time4j/g0;)Z
      //   369: ifne -> 379
      //   372: getstatic net/time4j/z.c : Lnet/time4j/z;
      //   375: astore_2
      //   376: goto -> 399
      //   379: iload #6
      //   381: iconst_m1
      //   382: if_icmpeq -> 397
      //   385: iload #6
      //   387: aload_2
      //   388: invokevirtual getHour : ()I
      //   391: if_icmplt -> 338
      //   394: goto -> 345
      //   397: aconst_null
      //   398: astore_2
      //   399: aload_3
      //   400: astore #7
      //   402: aload_2
      //   403: ifnull -> 498
      //   406: aload_2
      //   407: astore #7
      //   409: aload_3
      //   410: ifnull -> 498
      //   413: aload_2
      //   414: astore #7
      //   416: aload_3
      //   417: aload_2
      //   418: if_acmpeq -> 498
      //   421: iload #6
      //   423: iconst_m1
      //   424: if_icmpne -> 433
      //   427: aconst_null
      //   428: astore #7
      //   430: goto -> 498
      //   433: aload #9
      //   435: ldc 'night'
      //   437: invokevirtual startsWith : (Ljava/lang/String;)Z
      //   440: ifeq -> 467
      //   443: iload #6
      //   445: bipush #6
      //   447: if_icmpge -> 457
      //   450: getstatic net/time4j/z.c : Lnet/time4j/z;
      //   453: astore_2
      //   454: goto -> 461
      //   457: getstatic net/time4j/z.d : Lnet/time4j/z;
      //   460: astore_2
      //   461: aload_2
      //   462: astore #7
      //   464: goto -> 498
      //   467: aload #9
      //   469: ldc 'afternoon'
      //   471: invokevirtual startsWith : (Ljava/lang/String;)Z
      //   474: ifeq -> 427
      //   477: iload #6
      //   479: bipush #6
      //   481: if_icmpge -> 491
      //   484: getstatic net/time4j/z.d : Lnet/time4j/z;
      //   487: astore_2
      //   488: goto -> 461
      //   491: getstatic net/time4j/z.c : Lnet/time4j/z;
      //   494: astore_2
      //   495: goto -> 461
      //   498: aload #7
      //   500: astore_3
      //   501: goto -> 226
      //   504: iload #5
      //   506: ifgt -> 542
      //   509: aload #8
      //   511: astore #7
      //   513: aload_2
      //   514: ifnull -> 642
      //   517: aload #8
      //   519: getstatic net/time4j/g0.s : Lnet/time4j/b1;
      //   522: aload_2
      //   523: invokevirtual b : (Lnet/time4j/d1/p;Ljava/lang/Object;)Lnet/time4j/d1/q;
      //   526: astore_1
      //   527: aload_1
      //   528: astore #7
      //   530: iload #4
      //   532: iconst_1
      //   533: if_icmple -> 642
      //   536: aload #10
      //   538: astore_2
      //   539: goto -> 634
      //   542: aload_2
      //   543: astore_3
      //   544: goto -> 111
      //   547: new net/time4j/k$b
      //   550: dup
      //   551: iconst_1
      //   552: aload #11
      //   554: invokespecial <init> : (ZLnet/time4j/k;)V
      //   557: astore_3
      //   558: aload #8
      //   560: astore #7
      //   562: aload #8
      //   564: aload_3
      //   565: invokevirtual c : (Lnet/time4j/d1/p;)Z
      //   568: ifeq -> 642
      //   571: aload #8
      //   573: aload_3
      //   574: invokevirtual e : (Lnet/time4j/d1/p;)Ljava/lang/Object;
      //   577: checkcast java/lang/String
      //   580: astore_1
      //   581: aload_1
      //   582: ldc 'am'
      //   584: invokevirtual equals : (Ljava/lang/Object;)Z
      //   587: ifne -> 613
      //   590: aload_1
      //   591: ldc 'midnight'
      //   593: invokevirtual equals : (Ljava/lang/Object;)Z
      //   596: ifeq -> 602
      //   599: goto -> 613
      //   602: getstatic net/time4j/g0.s : Lnet/time4j/b1;
      //   605: astore_1
      //   606: getstatic net/time4j/z.d : Lnet/time4j/z;
      //   609: astore_2
      //   610: goto -> 621
      //   613: getstatic net/time4j/g0.s : Lnet/time4j/b1;
      //   616: astore_1
      //   617: getstatic net/time4j/z.c : Lnet/time4j/z;
      //   620: astore_2
      //   621: aload #8
      //   623: aload_1
      //   624: aload_2
      //   625: invokevirtual b : (Lnet/time4j/d1/p;Ljava/lang/Object;)Lnet/time4j/d1/q;
      //   628: astore_1
      //   629: aload_3
      //   630: astore_2
      //   631: goto -> 539
      //   634: aload_1
      //   635: aload_2
      //   636: aconst_null
      //   637: invokevirtual b : (Lnet/time4j/d1/p;Ljava/lang/Object;)Lnet/time4j/d1/q;
      //   640: astore #7
      //   642: aload #7
      //   644: areturn
    }
    
    public boolean a(Class<?> param1Class) {
      return g0.class.isAssignableFrom(param1Class);
    }
    
    public boolean a(p<?> param1p) {
      return param1p instanceof k.b;
    }
  }
  
  private class d implements t<o, String> {
    private final boolean a;
    
    private final w b;
    
    private final m c;
    
    d(k this$0, boolean param1Boolean, w param1w, m param1m) {
      if (param1w != null) {
        if (param1m != null) {
          this.a = param1Boolean;
          this.b = param1w;
          this.c = param1m;
          return;
        } 
        throw new NullPointerException("Missing output context.");
      } 
      throw new NullPointerException("Missing text width.");
    }
    
    public String a(o param1o) {
      // Byte code:
      //   0: aload_1
      //   1: getstatic net/time4j/g0.r : Lnet/time4j/t0;
      //   4: invokeinterface e : (Lnet/time4j/d1/p;)Ljava/lang/Object;
      //   9: checkcast net/time4j/g0
      //   12: astore #5
      //   14: aload_0
      //   15: getfield d : Lnet/time4j/k;
      //   18: astore_3
      //   19: aload_3
      //   20: invokestatic c : (Lnet/time4j/k;)Ljava/util/Locale;
      //   23: astore #4
      //   25: aload_0
      //   26: getfield a : Z
      //   29: ifeq -> 177
      //   32: aload #5
      //   34: invokestatic c : (Lnet/time4j/g0;)Ljava/lang/String;
      //   37: astore #7
      //   39: aload_3
      //   40: invokestatic a : (Lnet/time4j/k;)Z
      //   43: ifeq -> 174
      //   46: aload #4
      //   48: aload_3
      //   49: invokestatic d : (Lnet/time4j/k;)Ljava/lang/String;
      //   52: invokestatic a : (Ljava/util/Locale;Ljava/lang/String;)Ljava/util/Map;
      //   55: astore #6
      //   57: aload #6
      //   59: aload_0
      //   60: getfield b : Lnet/time4j/e1/w;
      //   63: aload_0
      //   64: getfield c : Lnet/time4j/e1/m;
      //   67: aload #7
      //   69: invokestatic a : (Ljava/util/Map;Lnet/time4j/e1/w;Lnet/time4j/e1/m;Ljava/lang/String;)Ljava/lang/String;
      //   72: astore_2
      //   73: aload_2
      //   74: astore_1
      //   75: aload #6
      //   77: aload_2
      //   78: invokeinterface containsKey : (Ljava/lang/Object;)Z
      //   83: ifne -> 149
      //   86: aload #7
      //   88: ldc 'midnight'
      //   90: invokevirtual equals : (Ljava/lang/Object;)Z
      //   93: ifeq -> 121
      //   96: aload_0
      //   97: getfield b : Lnet/time4j/e1/w;
      //   100: astore_1
      //   101: aload_0
      //   102: getfield c : Lnet/time4j/e1/m;
      //   105: astore_2
      //   106: ldc 'am'
      //   108: astore_3
      //   109: aload #6
      //   111: aload_1
      //   112: aload_2
      //   113: aload_3
      //   114: invokestatic a : (Ljava/util/Map;Lnet/time4j/e1/w;Lnet/time4j/e1/m;Ljava/lang/String;)Ljava/lang/String;
      //   117: astore_1
      //   118: goto -> 149
      //   121: aload_2
      //   122: astore_1
      //   123: aload #7
      //   125: ldc 'noon'
      //   127: invokevirtual equals : (Ljava/lang/Object;)Z
      //   130: ifeq -> 149
      //   133: aload_0
      //   134: getfield b : Lnet/time4j/e1/w;
      //   137: astore_1
      //   138: aload_0
      //   139: getfield c : Lnet/time4j/e1/m;
      //   142: astore_2
      //   143: ldc 'pm'
      //   145: astore_3
      //   146: goto -> 109
      //   149: aload #6
      //   151: aload_1
      //   152: invokeinterface containsKey : (Ljava/lang/Object;)Z
      //   157: ifeq -> 333
      //   160: aload #6
      //   162: aload_1
      //   163: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
      //   168: astore_1
      //   169: aload_1
      //   170: checkcast java/lang/String
      //   173: areturn
      //   174: aload #7
      //   176: areturn
      //   177: aload_3
      //   178: invokestatic a : (Lnet/time4j/k;)Z
      //   181: ifeq -> 363
      //   184: aload #4
      //   186: aload_3
      //   187: invokestatic d : (Lnet/time4j/k;)Ljava/lang/String;
      //   190: invokestatic a : (Ljava/util/Locale;Ljava/lang/String;)Ljava/util/Map;
      //   193: astore_2
      //   194: aload #5
      //   196: invokevirtual v : ()Z
      //   199: ifeq -> 238
      //   202: aload_2
      //   203: aload_0
      //   204: getfield b : Lnet/time4j/e1/w;
      //   207: aload_0
      //   208: getfield c : Lnet/time4j/e1/m;
      //   211: ldc 'midnight'
      //   213: invokestatic a : (Ljava/util/Map;Lnet/time4j/e1/w;Lnet/time4j/e1/m;Ljava/lang/String;)Ljava/lang/String;
      //   216: astore_1
      //   217: aload_2
      //   218: aload_1
      //   219: invokeinterface containsKey : (Ljava/lang/Object;)Z
      //   224: ifeq -> 279
      //   227: aload_2
      //   228: aload_1
      //   229: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
      //   234: astore_1
      //   235: goto -> 169
      //   238: aload #5
      //   240: bipush #12
      //   242: invokestatic g : (I)Lnet/time4j/g0;
      //   245: invokevirtual d : (Lnet/time4j/g0;)Z
      //   248: ifeq -> 279
      //   251: aload_2
      //   252: aload_0
      //   253: getfield b : Lnet/time4j/e1/w;
      //   256: aload_0
      //   257: getfield c : Lnet/time4j/e1/m;
      //   260: ldc 'noon'
      //   262: invokestatic a : (Ljava/util/Map;Lnet/time4j/e1/w;Lnet/time4j/e1/m;Ljava/lang/String;)Ljava/lang/String;
      //   265: astore_1
      //   266: aload_2
      //   267: aload_1
      //   268: invokeinterface containsKey : (Ljava/lang/Object;)Z
      //   273: ifeq -> 279
      //   276: goto -> 227
      //   279: aload_3
      //   280: invokestatic b : (Lnet/time4j/k;)Ljava/util/SortedMap;
      //   283: aload_3
      //   284: aload #5
      //   286: invokevirtual b : (Lnet/time4j/g0;)Lnet/time4j/g0;
      //   289: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
      //   294: checkcast java/lang/String
      //   297: astore_1
      //   298: aload_2
      //   299: aload_0
      //   300: getfield b : Lnet/time4j/e1/w;
      //   303: aload_0
      //   304: getfield c : Lnet/time4j/e1/m;
      //   307: aload_1
      //   308: invokestatic a : (Ljava/util/Map;Lnet/time4j/e1/w;Lnet/time4j/e1/m;Ljava/lang/String;)Ljava/lang/String;
      //   311: astore_1
      //   312: aload_2
      //   313: aload_1
      //   314: invokeinterface containsKey : (Ljava/lang/Object;)Z
      //   319: ifeq -> 333
      //   322: aload_2
      //   323: aload_1
      //   324: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
      //   329: astore_1
      //   330: goto -> 169
      //   333: aload #5
      //   335: getstatic net/time4j/g0.s : Lnet/time4j/b1;
      //   338: invokevirtual e : (Lnet/time4j/d1/p;)Ljava/lang/Object;
      //   341: checkcast net/time4j/z
      //   344: astore_2
      //   345: aload #4
      //   347: astore_1
      //   348: aload #4
      //   350: ifnonnull -> 357
      //   353: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
      //   356: astore_1
      //   357: aload_2
      //   358: aload_1
      //   359: invokevirtual a : (Ljava/util/Locale;)Ljava/lang/String;
      //   362: areturn
      //   363: aload_3
      //   364: invokestatic b : (Lnet/time4j/k;)Ljava/util/SortedMap;
      //   367: aload_3
      //   368: aload #5
      //   370: invokevirtual b : (Lnet/time4j/g0;)Lnet/time4j/g0;
      //   373: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
      //   378: astore_1
      //   379: goto -> 169
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */