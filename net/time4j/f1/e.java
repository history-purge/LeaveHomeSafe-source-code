package net.time4j.f1;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class e {
  private static final ConcurrentMap<b, a> e = new ConcurrentHashMap<b, a>(32);
  
  private static final ReferenceQueue<Object> f = new ReferenceQueue();
  
  private final e a;
  
  private final Map<String, String> b;
  
  private final String c;
  
  private final Locale d;
  
  private e(e parame1, e parame2) {
    this.a = parame2;
    this.c = parame1.c;
    this.d = parame1.d;
    this.b = parame1.b;
  }
  
  private e(g paramg, String paramString, Locale paramLocale) {
    this.a = null;
    this.c = paramString;
    this.d = paramLocale;
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    while (true) {
      String str = paramg.a();
      if (str != null) {
        str = str.trim();
        if (str.isEmpty() || str.charAt(0) == '#')
          continue; 
        int j = str.length();
        int i;
        for (i = 0; i < j; i++) {
          if (str.charAt(i) == '=') {
            int k = i + 1;
            if (k < j) {
              hashMap.put(str.substring(0, i), str.substring(k));
              break;
            } 
          } 
        } 
        continue;
      } 
      this.b = Collections.unmodifiableMap(hashMap);
      return;
    } 
  }
  
  public static List<Locale> a(Locale paramLocale) {
    String str2 = d.a(paramLocale);
    String str3 = paramLocale.getCountry();
    String str1 = paramLocale.getVariant();
    LinkedList<Locale> linkedList = new LinkedList();
    if (!str1.isEmpty())
      linkedList.add(new Locale(str2, str3, str1)); 
    if (!str3.isEmpty())
      linkedList.add(new Locale(str2, str3, "")); 
    if (!str2.isEmpty()) {
      linkedList.add(new Locale(str2, "", ""));
      if (str2.equals("nn"))
        linkedList.add(new Locale("nb", "", "")); 
    } 
    linkedList.add(Locale.ROOT);
    return linkedList;
  }
  
  public static e a(String paramString, Locale paramLocale) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual isEmpty : ()Z
    //   4: ifne -> 334
    //   7: aload_1
    //   8: ifnull -> 324
    //   11: new net/time4j/f1/e$b
    //   14: dup
    //   15: aload_0
    //   16: aload_1
    //   17: invokespecial <init> : (Ljava/lang/String;Ljava/util/Locale;)V
    //   20: astore #4
    //   22: getstatic net/time4j/f1/e.e : Ljava/util/concurrent/ConcurrentMap;
    //   25: aload #4
    //   27: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   32: checkcast net/time4j/f1/e$a
    //   35: astore #5
    //   37: aload #5
    //   39: ifnull -> 60
    //   42: aload #5
    //   44: invokevirtual get : ()Ljava/lang/Object;
    //   47: checkcast net/time4j/f1/e
    //   50: astore #5
    //   52: aload #5
    //   54: ifnull -> 60
    //   57: aload #5
    //   59: areturn
    //   60: getstatic net/time4j/f1/e.f : Ljava/lang/ref/ReferenceQueue;
    //   63: invokevirtual poll : ()Ljava/lang/ref/Reference;
    //   66: astore #5
    //   68: aload #5
    //   70: ifnull -> 93
    //   73: getstatic net/time4j/f1/e.e : Ljava/util/concurrent/ConcurrentMap;
    //   76: aload #5
    //   78: checkcast net/time4j/f1/e$a
    //   81: invokestatic a : (Lnet/time4j/f1/e$a;)Lnet/time4j/f1/e$b;
    //   84: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   89: pop
    //   90: goto -> 60
    //   93: new java/util/ArrayList
    //   96: dup
    //   97: invokespecial <init> : ()V
    //   100: astore #5
    //   102: aload_1
    //   103: invokestatic a : (Ljava/util/Locale;)Ljava/util/List;
    //   106: invokeinterface iterator : ()Ljava/util/Iterator;
    //   111: astore #6
    //   113: aload #6
    //   115: invokeinterface hasNext : ()Z
    //   120: ifeq -> 171
    //   123: aload #6
    //   125: invokeinterface next : ()Ljava/lang/Object;
    //   130: checkcast java/util/Locale
    //   133: astore #7
    //   135: aload_0
    //   136: aload #7
    //   138: invokestatic b : (Ljava/lang/String;Ljava/util/Locale;)Lnet/time4j/f1/e;
    //   141: astore #7
    //   143: aload #7
    //   145: ifnull -> 113
    //   148: aload #5
    //   150: aload #7
    //   152: invokeinterface add : (Ljava/lang/Object;)Z
    //   157: pop
    //   158: goto -> 113
    //   161: astore_0
    //   162: new java/lang/IllegalStateException
    //   165: dup
    //   166: aload_0
    //   167: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   170: athrow
    //   171: aload #5
    //   173: invokeinterface isEmpty : ()Z
    //   178: ifne -> 276
    //   181: aload #5
    //   183: invokeinterface size : ()I
    //   188: iconst_1
    //   189: isub
    //   190: istore_2
    //   191: iload_2
    //   192: iconst_1
    //   193: if_icmplt -> 241
    //   196: iload_2
    //   197: iconst_1
    //   198: isub
    //   199: istore_3
    //   200: aload #5
    //   202: iload_3
    //   203: aload #5
    //   205: iload_3
    //   206: invokeinterface get : (I)Ljava/lang/Object;
    //   211: checkcast net/time4j/f1/e
    //   214: aload #5
    //   216: iload_2
    //   217: invokeinterface get : (I)Ljava/lang/Object;
    //   222: checkcast net/time4j/f1/e
    //   225: invokespecial a : (Lnet/time4j/f1/e;)Lnet/time4j/f1/e;
    //   228: invokeinterface set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   233: pop
    //   234: iload_2
    //   235: iconst_1
    //   236: isub
    //   237: istore_2
    //   238: goto -> 191
    //   241: aload #5
    //   243: iconst_0
    //   244: invokeinterface get : (I)Ljava/lang/Object;
    //   249: checkcast net/time4j/f1/e
    //   252: astore_0
    //   253: getstatic net/time4j/f1/e.e : Ljava/util/concurrent/ConcurrentMap;
    //   256: aload #4
    //   258: new net/time4j/f1/e$a
    //   261: dup
    //   262: aload_0
    //   263: aload #4
    //   265: invokespecial <init> : (Lnet/time4j/f1/e;Lnet/time4j/f1/e$b;)V
    //   268: invokeinterface putIfAbsent : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   273: pop
    //   274: aload_0
    //   275: areturn
    //   276: new java/lang/StringBuilder
    //   279: dup
    //   280: invokespecial <init> : ()V
    //   283: astore #4
    //   285: aload #4
    //   287: ldc 'Cannot find resource bundle for: '
    //   289: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   292: pop
    //   293: aload #4
    //   295: aload_0
    //   296: aload_1
    //   297: invokestatic c : (Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;
    //   300: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   303: pop
    //   304: new java/util/MissingResourceException
    //   307: dup
    //   308: aload #4
    //   310: invokevirtual toString : ()Ljava/lang/String;
    //   313: ldc net/time4j/f1/e
    //   315: invokevirtual getName : ()Ljava/lang/String;
    //   318: ldc ''
    //   320: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   323: athrow
    //   324: new java/lang/NullPointerException
    //   327: dup
    //   328: ldc 'Missing locale.'
    //   330: invokespecial <init> : (Ljava/lang/String;)V
    //   333: athrow
    //   334: new java/lang/IllegalArgumentException
    //   337: dup
    //   338: ldc 'Base name must not be empty.'
    //   340: invokespecial <init> : (Ljava/lang/String;)V
    //   343: astore_0
    //   344: goto -> 349
    //   347: aload_0
    //   348: athrow
    //   349: goto -> 347
    // Exception table:
    //   from	to	target	type
    //   135	143	161	java/io/IOException
    //   148	158	161	java/io/IOException
  }
  
  private e a(e parame) {
    return (parame == null) ? this : new e(this, parame);
  }
  
  private static e b(String paramString, Locale paramLocale) {
    // Byte code:
    //   0: aload_0
    //   1: bipush #47
    //   3: invokevirtual indexOf : (I)I
    //   6: istore_2
    //   7: aload_0
    //   8: iconst_0
    //   9: iload_2
    //   10: invokevirtual substring : (II)Ljava/lang/String;
    //   13: astore_3
    //   14: aload_0
    //   15: iload_2
    //   16: iconst_1
    //   17: iadd
    //   18: invokevirtual substring : (I)Ljava/lang/String;
    //   21: aload_1
    //   22: invokestatic c : (Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;
    //   25: astore #5
    //   27: invokestatic c : ()Lnet/time4j/c1/d;
    //   30: aload_3
    //   31: ldc net/time4j/f1/e
    //   33: aload #5
    //   35: invokevirtual a : (Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)Ljava/net/URI;
    //   38: astore_3
    //   39: invokestatic c : ()Lnet/time4j/c1/d;
    //   42: aload_3
    //   43: iconst_1
    //   44: invokevirtual a : (Ljava/net/URI;Z)Ljava/io/InputStream;
    //   47: astore #4
    //   49: aload #4
    //   51: astore_3
    //   52: aload #4
    //   54: ifnonnull -> 72
    //   57: invokestatic c : ()Lnet/time4j/c1/d;
    //   60: ldc net/time4j/f1/e
    //   62: aload #5
    //   64: iconst_1
    //   65: invokevirtual a : (Ljava/lang/Class;Ljava/lang/String;Z)Ljava/io/InputStream;
    //   68: astore_3
    //   69: goto -> 72
    //   72: aload_3
    //   73: ifnull -> 121
    //   76: new net/time4j/f1/g
    //   79: dup
    //   80: aload_3
    //   81: invokespecial <init> : (Ljava/io/InputStream;)V
    //   84: astore_3
    //   85: new net/time4j/f1/e
    //   88: dup
    //   89: aload_3
    //   90: aload_0
    //   91: aload_1
    //   92: invokespecial <init> : (Lnet/time4j/f1/g;Ljava/lang/String;Ljava/util/Locale;)V
    //   95: astore_0
    //   96: aload_3
    //   97: invokevirtual close : ()V
    //   100: aload_0
    //   101: areturn
    //   102: astore_1
    //   103: aload_3
    //   104: astore_0
    //   105: goto -> 111
    //   108: astore_1
    //   109: aconst_null
    //   110: astore_0
    //   111: aload_0
    //   112: ifnull -> 119
    //   115: aload_0
    //   116: invokevirtual close : ()V
    //   119: aload_1
    //   120: athrow
    //   121: aconst_null
    //   122: areturn
    //   123: astore_0
    //   124: aconst_null
    //   125: areturn
    // Exception table:
    //   from	to	target	type
    //   57	69	123	java/io/IOException
    //   76	85	108	finally
    //   85	96	102	finally
  }
  
  private static String c(String paramString, Locale paramLocale) {
    String str2 = d.a(paramLocale);
    String str3 = paramLocale.getCountry();
    String str1 = paramLocale.getVariant();
    StringBuilder stringBuilder = new StringBuilder(paramString.length() + 20);
    stringBuilder.append(paramString.replace('.', '/'));
    if (!str2.isEmpty()) {
      stringBuilder.append('_');
      stringBuilder.append(str2);
      if (!str1.isEmpty()) {
        stringBuilder.append('_');
        stringBuilder.append(str3);
        stringBuilder.append('_');
        stringBuilder.append(str1);
      } else if (!str3.isEmpty()) {
        stringBuilder.append('_');
        stringBuilder.append(str3);
      } 
    } 
    stringBuilder.append(".properties");
    return stringBuilder.toString();
  }
  
  public Set<String> a() {
    return this.b.keySet();
  }
  
  public boolean a(String paramString) {
    if (paramString != null) {
      e e1 = this;
      while (true) {
        if ((String)e1.b.get(paramString) != null)
          return true; 
        e e2 = e1.a;
        e1 = e2;
        if (e2 == null)
          return false; 
      } 
    } 
    NullPointerException nullPointerException = new NullPointerException("Missing resource key.");
    throw nullPointerException;
  }
  
  public String b(String paramString) {
    if (paramString != null) {
      e e1 = this;
      while (true) {
        String str = e1.b.get(paramString);
        if (str != null)
          return str; 
        e1 = e1.a;
        if (e1 != null)
          continue; 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot find property resource for: ");
        stringBuilder.append(c(this.c, this.d));
        stringBuilder.append("=>");
        stringBuilder.append(paramString);
        throw new MissingResourceException(stringBuilder.toString(), e.class.getName(), paramString);
      } 
    } 
    NullPointerException nullPointerException = new NullPointerException("Missing resource key.");
    throw nullPointerException;
  }
  
  public Locale b() {
    return this.d;
  }
  
  public Set<String> c() {
    HashSet<? extends String> hashSet = new HashSet(this.b.keySet());
    e e1 = this;
    while (true) {
      e1 = e1.a;
      if (e1 != null) {
        hashSet.addAll(e1.b.keySet());
        continue;
      } 
      return Collections.unmodifiableSet(hashSet);
    } 
  }
  
  private static class a extends SoftReference<e> {
    private e.b a;
    
    a(e param1e, e.b param1b) {
      super(param1e, e.d());
      this.a = param1b;
    }
  }
  
  private static class b {
    private final String a;
    
    private final Locale b;
    
    b(String param1String, Locale param1Locale) {
      this.a = param1String;
      this.b = param1Locale;
    }
    
    public boolean equals(Object param1Object) {
      if (this == param1Object)
        return true; 
      if (param1Object instanceof b) {
        param1Object = param1Object;
        return (this.a.equals(((b)param1Object).a) && this.b.equals(((b)param1Object).b));
      } 
      return false;
    }
    
    public int hashCode() {
      return this.a.hashCode() << 3 ^ this.b.hashCode();
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(this.a);
      stringBuilder.append("/");
      stringBuilder.append(this.b);
      return stringBuilder.toString();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/f1/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */