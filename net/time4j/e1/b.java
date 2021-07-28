package net.time4j.e1;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.Normalizer;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import net.time4j.d1.p;
import net.time4j.d1.x;
import net.time4j.e1.b0.b;
import net.time4j.e1.b0.c;
import net.time4j.f1.e;

public final class b {
  private static final Set<String> l;
  
  private static final f m;
  
  private static final v n = new d(null);
  
  private static final v o = new b(null);
  
  private static final ConcurrentMap<String, b> p = new ConcurrentHashMap<String, b>();
  
  private final String a;
  
  private final Map<w, Map<m, t>> b;
  
  private final Map<w, Map<m, t>> c;
  
  private final Map<w, Map<m, t>> d;
  
  private final Map<w, Map<m, t>> e;
  
  private final Map<w, Map<m, t>> f;
  
  private final Map<w, t> g;
  
  private final Map<String, String> h;
  
  private final String i;
  
  private final Locale j;
  
  private final MissingResourceException k;
  
  private b(String paramString, Locale paramLocale, v paramv) {
    this.a = paramv.toString();
    this.b = Collections.unmodifiableMap(a(paramString, paramLocale, paramv, false));
    Map<w, Map<m, t>> map = a(paramString, paramLocale, paramv, true);
    if (map == null) {
      map = this.b;
    } else {
      map = Collections.unmodifiableMap(map);
    } 
    this.c = map;
    map = new EnumMap<w, Map<m, t>>(w.class);
    for (w w : w.values()) {
      EnumMap<m, Object> enumMap = new EnumMap<m, Object>(m.class);
      for (m m : m.values())
        enumMap.put(m, new t(paramv.a(paramString, paramLocale, w, m))); 
      map.put(w, enumMap);
    } 
    this.d = Collections.unmodifiableMap(map);
    map = new EnumMap<w, Map<m, t>>(w.class);
    for (w w : w.values()) {
      EnumMap<m, Object> enumMap = new EnumMap<m, Object>(m.class);
      for (m m : m.values())
        enumMap.put(m, new t(paramv.b(paramString, paramLocale, w, m))); 
      map.put(w, enumMap);
    } 
    this.e = Collections.unmodifiableMap(map);
    map = new EnumMap<w, Map<m, t>>(w.class);
    for (w w : w.values())
      map.put(w, new t(paramv.a(paramString, paramLocale, w))); 
    this.g = Collections.unmodifiableMap(map);
    map = new EnumMap<w, Map<m, t>>(w.class);
    for (w w : w.values()) {
      EnumMap<m, Object> enumMap = new EnumMap<m, Object>(m.class);
      for (m m : m.values())
        enumMap.put(m, new t(paramv.c(paramString, paramLocale, w, m))); 
      map.put(w, enumMap);
    } 
    this.f = Collections.unmodifiableMap(map);
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    map = null;
    try {
      String str;
      if (paramString.equals("iso8601")) {
        str = "i18n";
      } else {
        str = "calendar";
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(str);
      stringBuilder.append("/names/");
      stringBuilder.append(paramString);
      e e = e.a(stringBuilder.toString(), paramLocale);
      Iterator<String> iterator = e.c().iterator();
      while (true) {
        Map<w, Map<m, t>> map1 = map;
        if (iterator.hasNext()) {
          String str1 = iterator.next();
          hashMap.put(str1, e.b(str1));
          continue;
        } 
        break;
      } 
    } catch (MissingResourceException missingResourceException) {}
    this.h = Collections.unmodifiableMap(hashMap);
    this.i = paramString;
    this.j = paramLocale;
    this.k = missingResourceException;
  }
  
  private String a(String paramString) {
    String str = paramString;
    if (this.h.containsKey("useShortKeys")) {
      str = paramString;
      if ("true".equals(this.h.get("useShortKeys"))) {
        if (paramString.equals("MONTH_OF_YEAR") || paramString.equals("DAY_OF_WEEK") || paramString.equals("QUARTER_OF_YEAR") || paramString.equals("ERA"))
          return paramString.substring(0, 1); 
        if (paramString.equals("EVANGELIST"))
          return "EV"; 
        if (paramString.equals("SANSCULOTTIDES"))
          return "S"; 
        str = paramString;
        if (paramString.equals("DAY_OF_DECADE"))
          return "D"; 
      } 
    } 
    return str;
  }
  
  private static String a(String paramString, int paramInt1, int paramInt2) {
    StringBuilder stringBuilder = new StringBuilder(paramString);
    stringBuilder.append('_');
    stringBuilder.append(paramInt1 + paramInt2);
    return stringBuilder.toString();
  }
  
  private static String a(String paramString, int paramInt, String... paramVarArgs) {
    if (paramVarArgs != null && paramVarArgs.length > 0) {
      if (paramVarArgs.length < paramInt)
        return null; 
      StringBuilder stringBuilder = new StringBuilder(paramString);
      int i = 0;
      boolean bool = true;
      while (i < paramVarArgs.length - paramInt) {
        if (bool) {
          stringBuilder.append('(');
          bool = false;
        } else {
          stringBuilder.append('|');
        } 
        stringBuilder.append(paramVarArgs[i]);
        i++;
      } 
      if (!bool)
        stringBuilder.append(')'); 
      return stringBuilder.toString();
    } 
    if (paramInt > 0)
      paramString = null; 
    return paramString;
  }
  
  static String a(x<?> paramx) {
    c c = (c)paramx.e().getAnnotation(c.class);
    return (c == null) ? "iso8601" : c.value();
  }
  
  public static String a(e parame, Locale paramLocale) {
    return m.a(parame, paramLocale);
  }
  
  public static String a(e parame1, e parame2, Locale paramLocale) {
    return m.a(parame1, parame2, paramLocale);
  }
  
  private static Map<w, Map<m, t>> a(String paramString, Locale paramLocale, v paramv, boolean paramBoolean) {
    EnumMap<w, Object> enumMap2 = new EnumMap<w, Object>(w.class);
    w[] arrayOfW = w.values();
    int k = arrayOfW.length;
    int i = 0;
    int j;
    for (j = 0; j < k; j++) {
      w w = arrayOfW[j];
      EnumMap<m, Object> enumMap = new EnumMap<m, Object>(m.class);
      for (m m : m.values()) {
        String[] arrayOfString = paramv.a(paramString, paramLocale, w, m, paramBoolean);
        if (paramBoolean && !i)
          i = Arrays.equals((Object[])paramv.a(paramString, paramLocale, w, m, false), (Object[])arrayOfString) ^ true; 
        enumMap.put(m, new t(arrayOfString));
      } 
      enumMap2.put(w, enumMap);
    } 
    EnumMap<w, Object> enumMap1 = enumMap2;
    if (paramBoolean) {
      if (i != 0)
        return (Map)enumMap2; 
      enumMap1 = null;
    } 
    return (Map)enumMap1;
  }
  
  public static b a(String paramString, Locale paramLocale) {
    // Byte code:
    //   0: aload_0
    //   1: ifnull -> 258
    //   4: new java/lang/StringBuilder
    //   7: dup
    //   8: invokespecial <init> : ()V
    //   11: astore_2
    //   12: aload_2
    //   13: aload_0
    //   14: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   17: pop
    //   18: aload_2
    //   19: bipush #58
    //   21: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   24: pop
    //   25: aload_2
    //   26: aload_1
    //   27: invokevirtual getLanguage : ()Ljava/lang/String;
    //   30: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   33: pop
    //   34: aload_1
    //   35: invokevirtual getCountry : ()Ljava/lang/String;
    //   38: astore_3
    //   39: aload_3
    //   40: invokevirtual isEmpty : ()Z
    //   43: ifne -> 59
    //   46: aload_2
    //   47: bipush #45
    //   49: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   52: pop
    //   53: aload_2
    //   54: aload_3
    //   55: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   58: pop
    //   59: aload_2
    //   60: invokevirtual toString : ()Ljava/lang/String;
    //   63: astore #5
    //   65: getstatic net/time4j/e1/b.p : Ljava/util/concurrent/ConcurrentMap;
    //   68: aload #5
    //   70: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   75: checkcast net/time4j/e1/b
    //   78: astore_3
    //   79: aload_3
    //   80: astore_2
    //   81: aload_3
    //   82: ifnonnull -> 256
    //   85: aconst_null
    //   86: astore_3
    //   87: aload_1
    //   88: invokevirtual getLanguage : ()Ljava/lang/String;
    //   91: invokevirtual isEmpty : ()Z
    //   94: ifeq -> 114
    //   97: aload_0
    //   98: ldc 'iso8601'
    //   100: invokevirtual equals : (Ljava/lang/Object;)Z
    //   103: ifeq -> 114
    //   106: getstatic net/time4j/e1/b.o : Lnet/time4j/e1/v;
    //   109: astore #4
    //   111: goto -> 223
    //   114: invokestatic c : ()Lnet/time4j/c1/d;
    //   117: ldc net/time4j/e1/v
    //   119: invokevirtual a : (Ljava/lang/Class;)Ljava/lang/Iterable;
    //   122: invokeinterface iterator : ()Ljava/util/Iterator;
    //   127: astore #4
    //   129: aload_3
    //   130: astore_2
    //   131: aload #4
    //   133: invokeinterface hasNext : ()Z
    //   138: ifeq -> 172
    //   141: aload #4
    //   143: invokeinterface next : ()Ljava/lang/Object;
    //   148: checkcast net/time4j/e1/v
    //   151: astore_2
    //   152: aload_2
    //   153: aload_0
    //   154: invokeinterface a : (Ljava/lang/String;)Z
    //   159: ifeq -> 129
    //   162: aload_2
    //   163: aload_1
    //   164: invokeinterface a : (Ljava/util/Locale;)Z
    //   169: ifeq -> 129
    //   172: aload_2
    //   173: astore #4
    //   175: aload_2
    //   176: ifnonnull -> 223
    //   179: getstatic net/time4j/e1/b.n : Lnet/time4j/e1/v;
    //   182: astore #4
    //   184: aload_2
    //   185: astore_3
    //   186: aload #4
    //   188: aload_0
    //   189: invokeinterface a : (Ljava/lang/String;)Z
    //   194: ifeq -> 213
    //   197: aload_2
    //   198: astore_3
    //   199: aload #4
    //   201: aload_1
    //   202: invokeinterface a : (Ljava/util/Locale;)Z
    //   207: ifeq -> 213
    //   210: aload #4
    //   212: astore_3
    //   213: aload_3
    //   214: astore #4
    //   216: aload_3
    //   217: ifnonnull -> 223
    //   220: goto -> 106
    //   223: new net/time4j/e1/b
    //   226: dup
    //   227: aload_0
    //   228: aload_1
    //   229: aload #4
    //   231: invokespecial <init> : (Ljava/lang/String;Ljava/util/Locale;Lnet/time4j/e1/v;)V
    //   234: astore_2
    //   235: getstatic net/time4j/e1/b.p : Ljava/util/concurrent/ConcurrentMap;
    //   238: aload #5
    //   240: aload_2
    //   241: invokeinterface putIfAbsent : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   246: checkcast net/time4j/e1/b
    //   249: astore_0
    //   250: aload_0
    //   251: ifnull -> 256
    //   254: aload_0
    //   255: areturn
    //   256: aload_2
    //   257: areturn
    //   258: new java/lang/NullPointerException
    //   261: dup
    //   262: ldc_w 'Missing calendar type.'
    //   265: invokespecial <init> : (Ljava/lang/String;)V
    //   268: astore_0
    //   269: goto -> 274
    //   272: aload_0
    //   273: athrow
    //   274: goto -> 272
  }
  
  public static b a(Locale paramLocale) {
    return a("iso8601", paramLocale);
  }
  
  private t a(w paramw, m paramm, boolean paramBoolean) {
    if (paramBoolean) {
      Map<w, Map<m, t>> map1 = this.c;
      return (t)((Map)map1.get(paramw)).get(paramm);
    } 
    Map<w, Map<m, t>> map = this.b;
    return (t)((Map)map.get(paramw)).get(paramm);
  }
  
  public static String b(e parame, Locale paramLocale) {
    return m.b(parame, paramLocale);
  }
  
  public static String b(e parame1, e parame2, Locale paramLocale) {
    return c.a(m.a(parame1, parame2, paramLocale));
  }
  
  public static boolean b(Locale paramLocale) {
    return l.contains(paramLocale.getLanguage());
  }
  
  public Map<String, String> a() {
    return this.h;
  }
  
  public <V extends Enum<V>> t a(String paramString, Class<V> paramClass, String... paramVarArgs) {
    // Byte code:
    //   0: aload_0
    //   1: getfield k : Ljava/util/MissingResourceException;
    //   4: astore #8
    //   6: aload #8
    //   8: ifnonnull -> 177
    //   11: aload_2
    //   12: invokevirtual getEnumConstants : ()[Ljava/lang/Object;
    //   15: checkcast [Ljava/lang/Enum;
    //   18: astore #8
    //   20: aload #8
    //   22: arraylength
    //   23: istore #6
    //   25: iload #6
    //   27: anewarray java/lang/String
    //   30: astore #9
    //   32: aload_0
    //   33: aload_1
    //   34: invokespecial a : (Ljava/lang/String;)Ljava/lang/String;
    //   37: astore #10
    //   39: ldc_w net/time4j/d1/i
    //   42: aload_2
    //   43: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   46: istore #7
    //   48: iconst_0
    //   49: istore #4
    //   51: iload #4
    //   53: iload #6
    //   55: if_icmpge -> 167
    //   58: aload #10
    //   60: iconst_0
    //   61: aload_3
    //   62: invokestatic a : (Ljava/lang/String;I[Ljava/lang/String;)Ljava/lang/String;
    //   65: astore_1
    //   66: iconst_0
    //   67: istore #5
    //   69: aload_1
    //   70: ifnull -> 118
    //   73: aload_1
    //   74: iload #4
    //   76: iload #7
    //   78: iconst_1
    //   79: ixor
    //   80: invokestatic a : (Ljava/lang/String;II)Ljava/lang/String;
    //   83: astore_1
    //   84: aload_0
    //   85: getfield h : Ljava/util/Map;
    //   88: aload_1
    //   89: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   94: ifeq -> 100
    //   97: goto -> 120
    //   100: iload #5
    //   102: iconst_1
    //   103: iadd
    //   104: istore #5
    //   106: aload #10
    //   108: iload #5
    //   110: aload_3
    //   111: invokestatic a : (Ljava/lang/String;I[Ljava/lang/String;)Ljava/lang/String;
    //   114: astore_1
    //   115: goto -> 69
    //   118: aconst_null
    //   119: astore_1
    //   120: aload_1
    //   121: ifnonnull -> 140
    //   124: aload #9
    //   126: iload #4
    //   128: aload #8
    //   130: iload #4
    //   132: aaload
    //   133: invokevirtual name : ()Ljava/lang/String;
    //   136: aastore
    //   137: goto -> 158
    //   140: aload #9
    //   142: iload #4
    //   144: aload_0
    //   145: getfield h : Ljava/util/Map;
    //   148: aload_1
    //   149: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   154: checkcast java/lang/String
    //   157: aastore
    //   158: iload #4
    //   160: iconst_1
    //   161: iadd
    //   162: istore #4
    //   164: goto -> 51
    //   167: new net/time4j/e1/t
    //   170: dup
    //   171: aload #9
    //   173: invokespecial <init> : ([Ljava/lang/String;)V
    //   176: areturn
    //   177: new java/util/MissingResourceException
    //   180: dup
    //   181: aload #8
    //   183: invokevirtual getMessage : ()Ljava/lang/String;
    //   186: aload_0
    //   187: getfield k : Ljava/util/MissingResourceException;
    //   190: invokevirtual getClassName : ()Ljava/lang/String;
    //   193: aload_0
    //   194: getfield k : Ljava/util/MissingResourceException;
    //   197: invokevirtual getKey : ()Ljava/lang/String;
    //   200: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   203: astore_1
    //   204: goto -> 209
    //   207: aload_1
    //   208: athrow
    //   209: goto -> 207
  }
  
  public <V extends Enum<V>> t a(p<V> paramp, String... paramVarArgs) {
    return a(paramp.name(), paramp.getType(), paramVarArgs);
  }
  
  public t a(w paramw) {
    return this.g.get(paramw);
  }
  
  public t a(w paramw, m paramm) {
    return a(paramw, paramm, true);
  }
  
  public t b(w paramw, m paramm) {
    return (t)((Map)this.f.get(paramw)).get(paramm);
  }
  
  public t c(w paramw, m paramm) {
    return (t)((Map)this.d.get(paramw)).get(paramm);
  }
  
  public t d(w paramw, m paramm) {
    return a(paramw, paramm, false);
  }
  
  public t e(w paramw, m paramm) {
    return (t)((Map)this.e.get(paramw)).get(paramm);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.a);
    stringBuilder.append("(");
    stringBuilder.append(this.i);
    stringBuilder.append("/");
    stringBuilder.append(this.j);
    stringBuilder.append(")");
    return stringBuilder.toString();
  }
  
  static {
    HashSet<String> hashSet = new HashSet();
    hashSet.add("ar");
    hashSet.add("dv");
    hashSet.add("fa");
    hashSet.add("ha");
    hashSet.add("he");
    hashSet.add("iw");
    hashSet.add("ji");
    hashSet.add("ps");
    hashSet.add("sd");
    hashSet.add("ug");
    hashSet.add("ur");
    hashSet.add("yi");
    l = Collections.unmodifiableSet(hashSet);
    c c = new c(null);
    for (f f1 : net.time4j.c1.d.c().a(f.class)) {
      c = new c(f1);
      if (!f1.getClass().getName().startsWith("net.time4j."))
        break; 
    } 
    m = c;
  }
  
  private static class b implements v {
    private b() {}
    
    public boolean a(String param1String) {
      return true;
    }
    
    public boolean a(Locale param1Locale) {
      return true;
    }
    
    public String[] a(String param1String, Locale param1Locale, w param1w) {
      return (param1w == w.f) ? new String[] { "B", "A" } : new String[] { "BC", "AD" };
    }
    
    public String[] a(String param1String, Locale param1Locale, w param1w, m param1m) {
      return (param1w == w.f) ? new String[] { "1", "2", "3", "4" } : new String[] { "Q1", "Q2", "Q3", "Q4" };
    }
    
    public String[] a(String param1String, Locale param1Locale, w param1w, m param1m, boolean param1Boolean) {
      return (param1w == w.c) ? new String[] { 
          "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", 
          "11", "12", "13" } : new String[] { 
          "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", 
          "11", "12", "13" };
    }
    
    public String[] b(String param1String, Locale param1Locale, w param1w, m param1m) {
      return new String[] { "1", "2", "3", "4", "5", "6", "7" };
    }
    
    public String[] c(String param1String, Locale param1Locale, w param1w, m param1m) {
      return (param1w == w.f) ? new String[] { "A", "P" } : new String[] { "AM", "PM" };
    }
    
    public String toString() {
      return "FallbackProvider";
    }
  }
  
  private static class c implements f {
    private final f a;
    
    c(f param1f) {
      this.a = param1f;
    }
    
    private static int a(e param1e) {
      int i = b.a.b[param1e.ordinal()];
      if (i != 1) {
        if (i != 2) {
          if (i != 3) {
            if (i == 4)
              return 3; 
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown: ");
            stringBuilder.append(param1e);
            throw new UnsupportedOperationException(stringBuilder.toString());
          } 
          return 2;
        } 
        return 1;
      } 
      return 0;
    }
    
    private static String a(DateFormat param1DateFormat) {
      if (param1DateFormat instanceof SimpleDateFormat)
        return ((SimpleDateFormat)SimpleDateFormat.class.cast(param1DateFormat)).toPattern(); 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Cannot retrieve format pattern: ");
      stringBuilder.append(param1DateFormat);
      throw new IllegalStateException(stringBuilder.toString());
    }
    
    public String a(e param1e, Locale param1Locale) {
      f f1 = this.a;
      return (f1 == null) ? a(DateFormat.getDateInstance(a(param1e), param1Locale)) : f1.a(param1e, param1Locale);
    }
    
    public String a(e param1e1, e param1e2, Locale param1Locale) {
      f f1 = this.a;
      if (f1 == null)
        return a(DateFormat.getDateTimeInstance(a(param1e1), a(param1e2), param1Locale)); 
      String str1 = f1.b(param1e2, param1Locale);
      String str2 = this.a.a(param1e1, param1Locale);
      return this.a.a(param1e1, param1e2, param1Locale).replace("{1}", str2).replace("{0}", str1);
    }
    
    public String b(e param1e, Locale param1Locale) {
      String str;
      f f1 = this.a;
      if (f1 == null) {
        str = a(DateFormat.getTimeInstance(a(param1e), param1Locale));
      } else if (f1 instanceof b) {
        str = ((b)b.class.cast(f1)).a((e)str, param1Locale, true);
      } else {
        str = f1.b((e)str, param1Locale);
      } 
      return c.a(str);
    }
  }
  
  private static class d implements v {
    private d() {}
    
    private static String[] a(String[] param1ArrayOfString, int param1Int) {
      String[] arrayOfString = new String[param1Int];
      for (int i = 0; i < param1Int; i++) {
        if (!param1ArrayOfString[i].isEmpty()) {
          arrayOfString[i] = b(param1ArrayOfString[i]);
        } else {
          arrayOfString[i] = String.valueOf(i + 1);
        } 
      } 
      return arrayOfString;
    }
    
    private static String b(String param1String) {
      char c = Normalizer.normalize(param1String, Normalizer.Form.NFD).charAt(0);
      if (c >= 'A' && c <= 'Z')
        return String.valueOf(c); 
      if (c < 'a' || c > 'z') {
        if (c >= 'А' && c <= 'Я')
          return String.valueOf(c); 
        if (c < 'а' || c > 'я')
          return param1String; 
      } 
      return String.valueOf((char)(c - 32));
    }
    
    public boolean a(String param1String) {
      return "iso8601".equals(param1String);
    }
    
    public boolean a(Locale param1Locale) {
      String str = param1Locale.getLanguage();
      Locale[] arrayOfLocale = DateFormatSymbols.getAvailableLocales();
      int j = arrayOfLocale.length;
      for (int i = 0; i < j; i++) {
        if (arrayOfLocale[i].getLanguage().equals(str))
          return true; 
      } 
      return false;
    }
    
    public String[] a(String param1String, Locale param1Locale, w param1w) {
      DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(param1Locale);
      w w1 = w.f;
      String[] arrayOfString = dateFormatSymbols.getEras();
      if (param1w == w1) {
        String[] arrayOfString1 = new String[arrayOfString.length];
        int i = 0;
        int j = arrayOfString.length;
        while (i < j) {
          if (!arrayOfString[i].isEmpty()) {
            arrayOfString1[i] = b(arrayOfString[i]);
          } else if (i == 0 && arrayOfString.length == 2) {
            arrayOfString1[i] = "B";
          } else if (i == 1 && arrayOfString.length == 2) {
            arrayOfString1[i] = "A";
          } else {
            arrayOfString1[i] = String.valueOf(i);
          } 
          i++;
        } 
        return arrayOfString1;
      } 
      return arrayOfString;
    }
    
    public String[] a(String param1String, Locale param1Locale, w param1w, m param1m) {
      return new String[] { "Q1", "Q2", "Q3", "Q4" };
    }
    
    public String[] a(String param1String, Locale param1Locale, w param1w, m param1m, boolean param1Boolean) {
      DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(param1Locale);
      int i = b.a.a[param1w.ordinal()];
      if (i != 1) {
        if (i != 2 && i != 3) {
          if (i == 4)
            return a(dateFormatSymbols.getShortMonths(), 12); 
          throw new UnsupportedOperationException(param1w.name());
        } 
        return dateFormatSymbols.getShortMonths();
      } 
      return dateFormatSymbols.getMonths();
    }
    
    public String[] b(String param1String, Locale param1Locale, w param1w, m param1m) {
      String[] arrayOfString1;
      DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(param1Locale);
      int i = b.a.a[param1w.ordinal()];
      if (i != 1) {
        StringBuilder stringBuilder;
        if (i != 2 && i != 3) {
          if (i == 4) {
            arrayOfString1 = a(b("", param1Locale, w.e, param1m), 7);
          } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown text width: ");
            stringBuilder.append(param1w);
            throw new UnsupportedOperationException(stringBuilder.toString());
          } 
        } else {
          arrayOfString1 = stringBuilder.getShortWeekdays();
        } 
      } else {
        arrayOfString1 = arrayOfString1.getWeekdays();
      } 
      String[] arrayOfString2 = arrayOfString1;
      if (arrayOfString1.length > 7) {
        String str = arrayOfString1[1];
        arrayOfString2 = new String[7];
        System.arraycopy(arrayOfString1, 2, arrayOfString2, 0, 6);
        arrayOfString2[6] = str;
      } 
      return arrayOfString2;
    }
    
    public String[] c(String param1String, Locale param1Locale, w param1w, m param1m) {
      return (param1w == w.f) ? new String[] { "A", "P" } : DateFormatSymbols.getInstance(param1Locale).getAmPmStrings();
    }
    
    public String toString() {
      return "JDKTextProvider";
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/e1/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */