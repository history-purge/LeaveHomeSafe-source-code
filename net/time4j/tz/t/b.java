package net.time4j.tz.t;

import java.text.DateFormatSymbols;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import net.time4j.f1.e;
import net.time4j.tz.d;
import net.time4j.tz.s;

public class b implements s {
  private static final ConcurrentMap<Locale, Map<String, Map<d, String>>> a = new ConcurrentHashMap<Locale, Map<String, Map<d, String>>>();
  
  private static final Set<String> b;
  
  private static final Map<String, Set<String>> c;
  
  private static final Map<String, String> d;
  
  static {
    HashSet<String> hashSet = new HashSet();
    hashSet.add("Z");
    hashSet.add("GMT");
    hashSet.add("GMT0");
    hashSet.add("Greenwich");
    hashSet.add("UCT");
    hashSet.add("UTC");
    hashSet.add("UTC0");
    hashSet.add("Universal");
    hashSet.add("Zulu");
    b = Collections.unmodifiableSet(hashSet);
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    a((Map)hashMap, "data/zone1970.tab");
    c = Collections.unmodifiableMap(hashMap);
    hashMap = new HashMap<Object, Object>();
    a((Map)hashMap, "CL", "America/Santiago");
    a((Map)hashMap, "CN", "Asia/Shanghai");
    a((Map)hashMap, "DE", "Europe/Berlin");
    a((Map)hashMap, "EC", "America/Guayaquil");
    a((Map)hashMap, "ES", "Europe/Madrid");
    a((Map)hashMap, "MH", "Pacific/Majuro");
    a((Map)hashMap, "MY", "Asia/Kuala_Lumpur");
    a((Map)hashMap, "NZ", "Pacific/Auckland");
    a((Map)hashMap, "PT", "Europe/Lisbon");
    a((Map)hashMap, "UA", "Europe/Kiev");
    a((Map)hashMap, "UZ", "Asia/Tashkent");
    d = Collections.unmodifiableMap(hashMap);
  }
  
  private static e a(Locale paramLocale) {
    return e.a("olson/zones/tzname", paramLocale);
  }
  
  static void a(Map<String, Set<String>> paramMap, String paramString) {
    // Byte code:
    //   0: invokestatic c : ()Lnet/time4j/c1/d;
    //   3: ldc 'olson'
    //   5: ldc net/time4j/tz/t/b
    //   7: aload_1
    //   8: invokevirtual a : (Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)Ljava/net/URI;
    //   11: astore #4
    //   13: invokestatic c : ()Lnet/time4j/c1/d;
    //   16: aload #4
    //   18: iconst_1
    //   19: invokevirtual a : (Ljava/net/URI;Z)Ljava/io/InputStream;
    //   22: astore #5
    //   24: aload #5
    //   26: astore #4
    //   28: aload #5
    //   30: ifnonnull -> 44
    //   33: ldc net/time4j/tz/t/b
    //   35: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   38: aload_1
    //   39: invokevirtual getResourceAsStream : (Ljava/lang/String;)Ljava/io/InputStream;
    //   42: astore #4
    //   44: aload #4
    //   46: ifnull -> 214
    //   49: new java/io/BufferedReader
    //   52: dup
    //   53: new java/io/InputStreamReader
    //   56: dup
    //   57: aload #4
    //   59: ldc 'UTF-8'
    //   61: invokespecial <init> : (Ljava/io/InputStream;Ljava/lang/String;)V
    //   64: invokespecial <init> : (Ljava/io/Reader;)V
    //   67: astore_1
    //   68: aload_1
    //   69: invokevirtual readLine : ()Ljava/lang/String;
    //   72: astore #5
    //   74: aload #5
    //   76: ifnull -> 157
    //   79: aload #5
    //   81: ldc '#'
    //   83: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   86: ifne -> 68
    //   89: aload #5
    //   91: invokevirtual isEmpty : ()Z
    //   94: ifeq -> 100
    //   97: goto -> 68
    //   100: aload #5
    //   102: ldc '\\t'
    //   104: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   107: astore #5
    //   109: aload #5
    //   111: arraylength
    //   112: iconst_3
    //   113: if_icmplt -> 68
    //   116: iconst_0
    //   117: istore_2
    //   118: aload #5
    //   120: iconst_0
    //   121: aaload
    //   122: ldc ','
    //   124: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   127: astore #6
    //   129: aload #6
    //   131: arraylength
    //   132: istore_3
    //   133: iload_2
    //   134: iload_3
    //   135: if_icmpge -> 68
    //   138: aload_0
    //   139: aload #6
    //   141: iload_2
    //   142: aaload
    //   143: aload #5
    //   145: iconst_2
    //   146: aaload
    //   147: invokestatic b : (Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V
    //   150: iload_2
    //   151: iconst_1
    //   152: iadd
    //   153: istore_2
    //   154: goto -> 133
    //   157: aload #4
    //   159: invokevirtual close : ()V
    //   162: return
    //   163: astore_0
    //   164: aload_0
    //   165: getstatic java/lang/System.err : Ljava/io/PrintStream;
    //   168: invokevirtual printStackTrace : (Ljava/io/PrintStream;)V
    //   171: return
    //   172: astore_0
    //   173: goto -> 196
    //   176: astore_0
    //   177: new java/lang/IllegalStateException
    //   180: dup
    //   181: aload_0
    //   182: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   185: athrow
    //   186: astore_0
    //   187: new java/lang/AssertionError
    //   190: dup
    //   191: aload_0
    //   192: invokespecial <init> : (Ljava/lang/Object;)V
    //   195: athrow
    //   196: aload #4
    //   198: invokevirtual close : ()V
    //   201: goto -> 212
    //   204: astore_1
    //   205: aload_1
    //   206: getstatic java/lang/System.err : Ljava/io/PrintStream;
    //   209: invokevirtual printStackTrace : (Ljava/io/PrintStream;)V
    //   212: aload_0
    //   213: athrow
    //   214: getstatic java/lang/System.err : Ljava/io/PrintStream;
    //   217: astore_0
    //   218: new java/lang/StringBuilder
    //   221: dup
    //   222: invokespecial <init> : ()V
    //   225: astore #4
    //   227: aload #4
    //   229: ldc 'Warning: File "'
    //   231: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   234: pop
    //   235: aload #4
    //   237: aload_1
    //   238: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   241: pop
    //   242: aload #4
    //   244: ldc '" not found.'
    //   246: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   249: pop
    //   250: aload_0
    //   251: aload #4
    //   253: invokevirtual toString : ()Ljava/lang/String;
    //   256: invokevirtual println : (Ljava/lang/String;)V
    //   259: return
    // Exception table:
    //   from	to	target	type
    //   49	68	186	java/io/UnsupportedEncodingException
    //   49	68	176	java/io/IOException
    //   49	68	172	finally
    //   68	74	186	java/io/UnsupportedEncodingException
    //   68	74	176	java/io/IOException
    //   68	74	172	finally
    //   79	97	186	java/io/UnsupportedEncodingException
    //   79	97	176	java/io/IOException
    //   79	97	172	finally
    //   100	116	186	java/io/UnsupportedEncodingException
    //   100	116	176	java/io/IOException
    //   100	116	172	finally
    //   118	133	186	java/io/UnsupportedEncodingException
    //   118	133	176	java/io/IOException
    //   118	133	172	finally
    //   138	150	186	java/io/UnsupportedEncodingException
    //   138	150	176	java/io/IOException
    //   138	150	172	finally
    //   157	162	163	java/io/IOException
    //   177	186	172	finally
    //   187	196	172	finally
    //   196	201	204	java/io/IOException
  }
  
  private static void a(Map<String, String> paramMap, String paramString1, String paramString2) {
    paramMap.put(paramString1, paramString2);
  }
  
  private static void b(Map<String, Set<String>> paramMap, String paramString1, String paramString2) {
    Set<String> set2 = paramMap.get(paramString1);
    Set<String> set1 = set2;
    if (set2 == null) {
      set1 = new LinkedHashSet();
      paramMap.put(paramString1, set1);
    } 
    set1.add(paramString2);
  }
  
  public String a(String paramString, d paramd, Locale paramLocale) {
    if (b.contains(paramString))
      return ""; 
    Map<Object, Object> map2 = (Map)a.get(paramLocale);
    Map<Object, Object> map1 = map2;
    if (map2 == null) {
      String[][] arrayOfString = DateFormatSymbols.getInstance(paramLocale).getZoneStrings();
      map1 = new HashMap<Object, Object>();
      int j = arrayOfString.length;
      int i;
      for (i = 0; i < j; i++) {
        String[] arrayOfString1 = arrayOfString[i];
        EnumMap<d, Object> enumMap = new EnumMap<d, Object>(d.class);
        enumMap.put(d.d, arrayOfString1[1]);
        enumMap.put(d.c, arrayOfString1[2]);
        enumMap.put(d.f, arrayOfString1[3]);
        enumMap.put(d.e, arrayOfString1[4]);
        map1.put(arrayOfString1[0], enumMap);
      } 
      Map<Object, Object> map3 = (Map)a.putIfAbsent(paramLocale, map1);
      if (map3 != null)
        map1 = map3; 
    } 
    Map map = (Map)map1.get(paramString);
    return (map != null) ? (String)map.get(paramd) : "";
  }
  
  public String a(boolean paramBoolean, Locale paramLocale) {
    String str;
    e e = a(paramLocale);
    if (paramBoolean) {
      str = "utc-literal";
    } else {
      str = "offset-pattern";
    } 
    return e.b(str);
  }
  
  public Set<String> a(Locale paramLocale, boolean paramBoolean) {
    LinkedHashSet<String> linkedHashSet;
    String str = paramLocale.getCountry();
    if (paramBoolean) {
      if (str.equals("US")) {
        linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("America/New_York");
        linkedHashSet.add("America/Chicago");
        linkedHashSet.add("America/Denver");
        linkedHashSet.add("America/Los_Angeles");
        linkedHashSet.add("America/Anchorage");
        linkedHashSet.add("Pacific/Honolulu");
        linkedHashSet.add("America/Adak");
        return Collections.unmodifiableSet(linkedHashSet);
      } 
      String str1 = d.get(linkedHashSet);
      if (str1 != null)
        return Collections.singleton(str1); 
    } 
    Set<?> set2 = c.get(linkedHashSet);
    Set<?> set1 = set2;
    if (set2 == null)
      set1 = Collections.emptySet(); 
    return (Set)set1;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/tz/t/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */