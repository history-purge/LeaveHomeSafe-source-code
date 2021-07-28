package net.time4j.calendar.t;

import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Set;
import net.time4j.e1.m;
import net.time4j.e1.v;
import net.time4j.e1.w;
import net.time4j.f1.d;
import net.time4j.f1.e;

public final class b implements v {
  private static final String[] a = new String[0];
  
  private static final Set<String> b;
  
  private static final Set<String> c;
  
  static {
    String[] arrayOfString = e.a("calendar/names/generic", Locale.ROOT).b("languages").split(" ");
    HashSet<? super String> hashSet1 = new HashSet();
    Collections.addAll(hashSet1, arrayOfString);
    hashSet1.add("");
    c = Collections.unmodifiableSet((Set)hashSet1);
    HashSet<Locale> hashSet = new HashSet();
    for (String str : c) {
      if (str.isEmpty()) {
        hashSet.add(Locale.ROOT);
        continue;
      } 
      hashSet.add(new Locale(str));
    } 
    Collections.unmodifiableSet(hashSet);
    hashSet = new HashSet<Locale>();
    hashSet.add("buddhist");
    hashSet.add("chinese");
    hashSet.add("coptic");
    hashSet.add("dangi");
    hashSet.add("ethiopic");
    hashSet.add("extra/frenchrev");
    hashSet.add("generic");
    hashSet.add("hebrew");
    hashSet.add("indian");
    hashSet.add("islamic");
    hashSet.add("japanese");
    hashSet.add("juche");
    hashSet.add("persian");
    hashSet.add("roc");
    hashSet.add("vietnam");
    b = Collections.unmodifiableSet(hashSet);
  }
  
  private static String a(String paramString1, String paramString2, w paramw, m paramm) {
    StringBuilder stringBuilder;
    String str1;
    boolean bool = paramString2.equals("en");
    String str2 = "i";
    if (bool) {
      if (paramw == w.f) {
        stringBuilder = new StringBuilder();
        str1 = str2;
      } else {
        stringBuilder = new StringBuilder();
        str1 = "(leap) ";
        stringBuilder.append(str1);
      } 
    } else if (stringBuilder.equals("de") || stringBuilder.equals("es") || stringBuilder.equals("fr") || stringBuilder.equals("it") || stringBuilder.equals("pt") || stringBuilder.equals("ro")) {
      if (str1 == w.f) {
        stringBuilder = new StringBuilder();
        str1 = str2;
      } else {
        stringBuilder = new StringBuilder();
        str1 = "(i) ";
        stringBuilder.append(str1);
      } 
    } else {
      bool = stringBuilder.equals("ja");
      str2 = "閏";
      if (bool) {
        stringBuilder = new StringBuilder();
        str1 = str2;
      } else {
        if (stringBuilder.equals("ko")) {
          stringBuilder = new StringBuilder();
          str1 = "윤";
        } else {
          if (stringBuilder.equals("zh")) {
            stringBuilder = new StringBuilder();
            str1 = str2;
          } else {
            if (stringBuilder.equals("vi")) {
              if (str1 == w.f) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(paramString1);
                paramString1 = "n";
                stringBuilder.append(paramString1);
                return stringBuilder.toString();
              } 
              stringBuilder = new StringBuilder();
              stringBuilder.append(paramString1);
              if (paramm == m.d) {
                paramString1 = " Nhuận";
                stringBuilder.append(paramString1);
                return stringBuilder.toString();
              } 
              paramString1 = " nhuận";
              stringBuilder.append(paramString1);
              return stringBuilder.toString();
            } 
            stringBuilder = new StringBuilder();
            str1 = "*";
            stringBuilder.append(str1);
          } 
          stringBuilder.append(str1);
        } 
        stringBuilder.append(str1);
      } 
    } 
    stringBuilder.append(str1);
  }
  
  private static String a(e parame, String paramString) {
    return (parame.a("useShortKeys") && "true".equals(parame.b("useShortKeys"))) ? paramString.substring(0, 1) : paramString;
  }
  
  static e a(String paramString, Locale paramLocale) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("calendar/names/");
    stringBuilder.append(paramString);
    paramString = stringBuilder.toString();
    if (!c.contains(d.a(paramLocale)))
      paramLocale = Locale.ROOT; 
    return e.a(paramString, paramLocale);
  }
  
  private static String[] a(e parame, String paramString1, String paramString2, int paramInt1, String paramString3, w paramw, m paramm, boolean paramBoolean, int paramInt2) {
    String[] arrayOfString = new String[paramInt1];
    int i = paramString3.length();
    boolean bool = true;
    if (i != 1)
      bool = false; 
    i = 0;
    while (i < paramInt1) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(paramString3);
      stringBuilder.append('(');
      String str2 = paramw.name();
      if (bool) {
        char c1 = str2.charAt(0);
        char c = c1;
        if (paramm != m.d)
          c = Character.toLowerCase(c1); 
        stringBuilder.append(c);
      } else {
        stringBuilder.append(str2);
        if (paramm == m.d) {
          stringBuilder.append('|');
          stringBuilder.append(paramm.name());
        } 
        if (paramBoolean) {
          stringBuilder.append('|');
          stringBuilder.append("LEAP");
        } 
      } 
      stringBuilder.append(')');
      stringBuilder.append('_');
      stringBuilder.append(i + paramInt2);
      if (paramBoolean && i == 6 && paramString1.equals("hebrew"))
        stringBuilder.append('L'); 
      String str1 = stringBuilder.toString();
      if (parame.a(str1)) {
        str2 = parame.b(str1);
        str1 = str2;
        if (paramBoolean) {
          str1 = str2;
          if (paramString1.equals("chinese"))
            str1 = a(str2, paramString2, paramw, paramm); 
        } 
        arrayOfString[i] = str1;
        i++;
        continue;
      } 
      return null;
    } 
    return arrayOfString;
  }
  
  private static int b(String paramString) {
    return (paramString.equals("ethiopic") || paramString.equals("generic") || paramString.equals("roc") || paramString.equals("buddhist") || paramString.equals("korean")) ? 2 : 1;
  }
  
  private static int c(String paramString) {
    return (paramString.equals("coptic") || paramString.equals("ethiopic") || paramString.equals("generic") || paramString.equals("hebrew")) ? 13 : 12;
  }
  
  public boolean a(String paramString) {
    return b.contains(paramString);
  }
  
  public boolean a(Locale paramLocale) {
    return true;
  }
  
  public String[] a(String paramString, Locale paramLocale, w paramw) {
    String[] arrayOfString1;
    w w1 = paramw;
    if (paramString.equals("chinese") || paramString.equals("vietnam"))
      return a; 
    if (paramString.equals("japanese"))
      return (w1 == w.f) ? new String[] { "M", "T", "S", "H" } : new String[] { "Meiji", "Taishō", "Shōwa", "Heisei" }; 
    if (paramString.equals("dangi") || paramString.equals("juche")) {
      arrayOfString1 = a("korean", paramLocale, w1);
      if (paramString.equals("dangi")) {
        paramString = arrayOfString1[0];
      } else {
        paramString = arrayOfString1[1];
      } 
      return new String[] { paramString };
    } 
    e e = a(paramString, (Locale)arrayOfString1);
    paramw = w1;
    if (w1 == w.e)
      paramw = w.d; 
    String[] arrayOfString3 = a(e, paramString, arrayOfString1.getLanguage(), b(paramString), a(e, "ERA"), paramw, m.c, false, 0);
    String[] arrayOfString2 = arrayOfString3;
    if (arrayOfString3 == null) {
      w w2 = w.d;
      arrayOfString2 = arrayOfString3;
      if (paramw != w2)
        arrayOfString2 = a(paramString, (Locale)arrayOfString1, w2); 
    } 
    if (arrayOfString2 != null)
      return arrayOfString2; 
    throw new MissingResourceException("Cannot find calendar resource for era.", b.class.getName(), arrayOfString1.toString());
  }
  
  public String[] a(String paramString, Locale paramLocale, w paramw, m paramm) {
    return a;
  }
  
  public String[] a(String paramString, Locale paramLocale, w paramw, m paramm, boolean paramBoolean) {
    // Byte code:
    //   0: aload_1
    //   1: ldc 'roc'
    //   3: invokevirtual equals : (Ljava/lang/Object;)Z
    //   6: ifne -> 346
    //   9: aload_1
    //   10: ldc 'buddhist'
    //   12: invokevirtual equals : (Ljava/lang/Object;)Z
    //   15: ifeq -> 21
    //   18: goto -> 346
    //   21: aload_1
    //   22: ldc 'japanese'
    //   24: invokevirtual equals : (Ljava/lang/Object;)Z
    //   27: ifeq -> 121
    //   30: bipush #13
    //   32: anewarray java/lang/String
    //   35: dup
    //   36: iconst_0
    //   37: ldc_w '1'
    //   40: aastore
    //   41: dup
    //   42: iconst_1
    //   43: ldc_w '2'
    //   46: aastore
    //   47: dup
    //   48: iconst_2
    //   49: ldc_w '3'
    //   52: aastore
    //   53: dup
    //   54: iconst_3
    //   55: ldc_w '4'
    //   58: aastore
    //   59: dup
    //   60: iconst_4
    //   61: ldc_w '5'
    //   64: aastore
    //   65: dup
    //   66: iconst_5
    //   67: ldc_w '6'
    //   70: aastore
    //   71: dup
    //   72: bipush #6
    //   74: ldc_w '7'
    //   77: aastore
    //   78: dup
    //   79: bipush #7
    //   81: ldc_w '8'
    //   84: aastore
    //   85: dup
    //   86: bipush #8
    //   88: ldc_w '9'
    //   91: aastore
    //   92: dup
    //   93: bipush #9
    //   95: ldc_w '10'
    //   98: aastore
    //   99: dup
    //   100: bipush #10
    //   102: ldc_w '11'
    //   105: aastore
    //   106: dup
    //   107: bipush #11
    //   109: ldc_w '12'
    //   112: aastore
    //   113: dup
    //   114: bipush #12
    //   116: ldc_w '13'
    //   119: aastore
    //   120: areturn
    //   121: aload_1
    //   122: ldc 'dangi'
    //   124: invokevirtual equals : (Ljava/lang/Object;)Z
    //   127: ifne -> 181
    //   130: aload_1
    //   131: ldc 'vietnam'
    //   133: invokevirtual equals : (Ljava/lang/Object;)Z
    //   136: ifeq -> 142
    //   139: goto -> 181
    //   142: aload_1
    //   143: astore #6
    //   145: aload_1
    //   146: ldc 'juche'
    //   148: invokevirtual equals : (Ljava/lang/Object;)Z
    //   151: ifeq -> 185
    //   154: aload_2
    //   155: invokestatic a : (Ljava/util/Locale;)Lnet/time4j/e1/b;
    //   158: aload_3
    //   159: aload #4
    //   161: invokevirtual d : (Lnet/time4j/e1/w;Lnet/time4j/e1/m;)Lnet/time4j/e1/t;
    //   164: invokevirtual a : ()Ljava/util/List;
    //   167: bipush #12
    //   169: anewarray java/lang/String
    //   172: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   177: checkcast [Ljava/lang/String;
    //   180: areturn
    //   181: ldc 'chinese'
    //   183: astore #6
    //   185: aload #6
    //   187: aload_2
    //   188: invokestatic a : (Ljava/lang/String;Ljava/util/Locale;)Lnet/time4j/f1/e;
    //   191: astore #7
    //   193: aload_3
    //   194: astore_1
    //   195: aload_3
    //   196: getstatic net/time4j/e1/w.e : Lnet/time4j/e1/w;
    //   199: if_acmpne -> 206
    //   202: getstatic net/time4j/e1/w.d : Lnet/time4j/e1/w;
    //   205: astore_1
    //   206: aload #7
    //   208: ldc_w 'MONTH_OF_YEAR'
    //   211: invokestatic a : (Lnet/time4j/f1/e;Ljava/lang/String;)Ljava/lang/String;
    //   214: astore_3
    //   215: aload #7
    //   217: aload #6
    //   219: aload_2
    //   220: invokevirtual getLanguage : ()Ljava/lang/String;
    //   223: aload #6
    //   225: invokestatic c : (Ljava/lang/String;)I
    //   228: aload_3
    //   229: aload_1
    //   230: aload #4
    //   232: iload #5
    //   234: iconst_1
    //   235: invokestatic a : (Lnet/time4j/f1/e;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lnet/time4j/e1/w;Lnet/time4j/e1/m;ZI)[Ljava/lang/String;
    //   238: astore #7
    //   240: aload #7
    //   242: astore_3
    //   243: aload #7
    //   245: ifnonnull -> 320
    //   248: aload #4
    //   250: getstatic net/time4j/e1/m.d : Lnet/time4j/e1/m;
    //   253: if_acmpne -> 273
    //   256: aload #7
    //   258: astore_3
    //   259: aload_1
    //   260: getstatic net/time4j/e1/w.f : Lnet/time4j/e1/w;
    //   263: if_acmpeq -> 320
    //   266: getstatic net/time4j/e1/m.c : Lnet/time4j/e1/m;
    //   269: astore_3
    //   270: goto -> 288
    //   273: aload_1
    //   274: getstatic net/time4j/e1/w.d : Lnet/time4j/e1/w;
    //   277: if_acmpne -> 303
    //   280: getstatic net/time4j/e1/w.c : Lnet/time4j/e1/w;
    //   283: astore_1
    //   284: getstatic net/time4j/e1/m.c : Lnet/time4j/e1/m;
    //   287: astore_3
    //   288: aload_0
    //   289: aload #6
    //   291: aload_2
    //   292: aload_1
    //   293: aload_3
    //   294: iload #5
    //   296: invokevirtual a : (Ljava/lang/String;Ljava/util/Locale;Lnet/time4j/e1/w;Lnet/time4j/e1/m;Z)[Ljava/lang/String;
    //   299: astore_3
    //   300: goto -> 320
    //   303: aload #7
    //   305: astore_3
    //   306: aload_1
    //   307: getstatic net/time4j/e1/w.f : Lnet/time4j/e1/w;
    //   310: if_acmpne -> 320
    //   313: getstatic net/time4j/e1/m.d : Lnet/time4j/e1/m;
    //   316: astore_3
    //   317: goto -> 270
    //   320: aload_3
    //   321: ifnull -> 326
    //   324: aload_3
    //   325: areturn
    //   326: new java/util/MissingResourceException
    //   329: dup
    //   330: ldc_w 'Cannot find calendar month.'
    //   333: ldc net/time4j/calendar/t/b
    //   335: invokevirtual getName : ()Ljava/lang/String;
    //   338: aload_2
    //   339: invokevirtual toString : ()Ljava/lang/String;
    //   342: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   345: athrow
    //   346: aload_2
    //   347: invokestatic a : (Ljava/util/Locale;)Lnet/time4j/e1/b;
    //   350: aload_3
    //   351: aload #4
    //   353: invokevirtual d : (Lnet/time4j/e1/w;Lnet/time4j/e1/m;)Lnet/time4j/e1/t;
    //   356: invokevirtual a : ()Ljava/util/List;
    //   359: astore_1
    //   360: aload_1
    //   361: aload_1
    //   362: invokeinterface size : ()I
    //   367: anewarray java/lang/String
    //   370: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   375: checkcast [Ljava/lang/String;
    //   378: areturn
  }
  
  public String[] b(String paramString, Locale paramLocale, w paramw, m paramm) {
    return a;
  }
  
  public String[] c(String paramString, Locale paramLocale, w paramw, m paramm) {
    return a;
  }
  
  public String toString() {
    return "GenericTextProviderSPI";
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/calendar/t/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */