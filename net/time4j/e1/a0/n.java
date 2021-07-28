package net.time4j.e1.a0;

import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import net.time4j.d1.d;
import net.time4j.d1.o;
import net.time4j.d1.p;
import net.time4j.e1.g;
import net.time4j.tz.k;
import net.time4j.tz.p;

final class n implements h<k> {
  private static final p k = p.f(64800);
  
  private static final ConcurrentMap<Locale, String> l = new ConcurrentHashMap<Locale, String>();
  
  private static final ConcurrentMap<Locale, a> m = new ConcurrentHashMap<Locale, a>();
  
  private final boolean c;
  
  private final boolean d;
  
  private final boolean e;
  
  private final Locale f;
  
  private final String g;
  
  private final String h;
  
  private final char i;
  
  private final g j;
  
  n(boolean paramBoolean) {
    this(paramBoolean, true, false, Locale.ROOT, "+", "-", '0', g.d);
  }
  
  private n(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, Locale paramLocale, String paramString1, String paramString2, char paramChar, g paramg) {
    this.c = paramBoolean1;
    this.d = paramBoolean2;
    this.e = paramBoolean3;
    this.f = paramLocale;
    this.g = paramString1;
    this.h = paramString2;
    this.i = paramChar;
    this.j = paramg;
  }
  
  private static int a(CharSequence paramCharSequence, int paramInt, char paramChar) {
    int i = 0;
    int j = 0;
    while (i < 2) {
      int k = paramInt + i;
      if (k >= paramCharSequence.length())
        return (i == 0) ? -1000 : (j ^ 0xFFFFFFFF); 
      k = paramCharSequence.charAt(k) - paramChar;
      if (k >= 0 && k <= 9) {
        j = j * 10 + k;
        i++;
        continue;
      } 
      return (i == 0) ? -1000 : (j ^ 0xFFFFFFFF);
    } 
    return j;
  }
  
  private static int a(CharSequence paramCharSequence, int paramInt1, int paramInt2, Locale paramLocale, boolean paramBoolean) {
    String str = a(paramLocale);
    String[] arrayOfString = new String[4];
    arrayOfString[0] = "GMT";
    arrayOfString[1] = str;
    arrayOfString[2] = "UTC";
    arrayOfString[3] = "UT";
    int j = arrayOfString.length;
    int i;
    for (i = 0; i < j; i++) {
      str = arrayOfString[i];
      int k = str.length();
      if (paramInt1 - paramInt2 >= k) {
        String str1 = paramCharSequence.subSequence(paramInt2, paramInt2 + k).toString();
        if ((paramBoolean && str1.equalsIgnoreCase(str)) || (!paramBoolean && str1.equals(str)))
          return k; 
      } 
    } 
    return 0;
  }
  
  private static String a(Locale paramLocale) {
    String str2 = l.get(paramLocale);
    String str1 = str2;
    if (str2 == null) {
      str1 = p.m.a(paramLocale);
      String str = l.putIfAbsent(paramLocale, str1);
      if (str != null)
        str1 = str; 
    } 
    return str1;
  }
  
  private static p a(o paramo, d paramd) {
    if (paramd.b(net.time4j.e1.a.d)) {
      k k = (k)paramd.a(net.time4j.e1.a.d);
      if (k instanceof p)
        return (p)k; 
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Cannot extract timezone offset from format attributes for: ");
    stringBuilder.append(paramo);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  private static boolean a(char paramChar1, char paramChar2) {
    return (paramChar1 == paramChar2 || Character.toUpperCase(paramChar1) == Character.toUpperCase(paramChar2) || Character.toLowerCase(paramChar1) == Character.toLowerCase(paramChar2));
  }
  
  private static int b(CharSequence paramCharSequence, int paramInt, char paramChar) {
    int i = 0;
    int j = 0;
    while (i < 2) {
      int k = paramInt + i;
      if (k >= paramCharSequence.length())
        return -1000; 
      k = paramCharSequence.charAt(k) - paramChar;
      if (k >= 0 && k <= 9) {
        j = j * 10 + k;
        i++;
        continue;
      } 
      return -1000;
    } 
    return j;
  }
  
  private static a b(Locale paramLocale) {
    a a = m.get(paramLocale);
    if (a == null) {
      String str = k.a(paramLocale);
      int i = 0;
      int j = str.length();
      while (i < j) {
        if (str.charAt(i) == '±') {
          j = str.indexOf("hh", i) + 2;
          int k = str.indexOf("mm", j);
          a = new a(str, str.substring(j, k), i, k + 2);
          a a1 = m.putIfAbsent(paramLocale, a);
          return (a1 != null) ? a1 : a;
        } 
        i++;
      } 
    } 
    return a;
  }
  
  public int a(o paramo, Appendable paramAppendable, d paramd, Set<g> paramSet, boolean paramBoolean) {
    // Byte code:
    //   0: aload_2
    //   1: instanceof java/lang/CharSequence
    //   4: ifeq -> 21
    //   7: aload_2
    //   8: checkcast java/lang/CharSequence
    //   11: invokeinterface length : ()I
    //   16: istore #11
    //   18: goto -> 24
    //   21: iconst_m1
    //   22: istore #11
    //   24: aconst_null
    //   25: astore #15
    //   27: aload_1
    //   28: invokeinterface d : ()Z
    //   33: ifeq -> 44
    //   36: aload_1
    //   37: invokeinterface c : ()Lnet/time4j/tz/k;
    //   42: astore #15
    //   44: aload #15
    //   46: ifnonnull -> 58
    //   49: aload_1
    //   50: aload_3
    //   51: invokestatic a : (Lnet/time4j/d1/o;Lnet/time4j/d1/d;)Lnet/time4j/tz/p;
    //   54: astore_1
    //   55: goto -> 95
    //   58: aload #15
    //   60: instanceof net/time4j/tz/p
    //   63: ifeq -> 75
    //   66: aload #15
    //   68: checkcast net/time4j/tz/p
    //   71: astore_1
    //   72: goto -> 95
    //   75: aload_1
    //   76: instanceof net/time4j/c1/f
    //   79: ifeq -> 907
    //   82: aload #15
    //   84: invokestatic a : (Lnet/time4j/tz/k;)Lnet/time4j/tz/l;
    //   87: aload_1
    //   88: checkcast net/time4j/c1/f
    //   91: invokevirtual b : (Lnet/time4j/c1/f;)Lnet/time4j/tz/p;
    //   94: astore_1
    //   95: iload #5
    //   97: ifeq -> 109
    //   100: aload_0
    //   101: getfield f : Ljava/util/Locale;
    //   104: astore #17
    //   106: goto -> 126
    //   109: aload_3
    //   110: getstatic net/time4j/e1/a.c : Lnet/time4j/d1/c;
    //   113: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
    //   116: invokeinterface a : (Lnet/time4j/d1/c;Ljava/lang/Object;)Ljava/lang/Object;
    //   121: checkcast java/util/Locale
    //   124: astore #17
    //   126: iload #5
    //   128: ifeq -> 140
    //   131: aload_0
    //   132: getfield i : C
    //   135: istore #6
    //   137: goto -> 162
    //   140: aload_3
    //   141: getstatic net/time4j/e1/a.m : Lnet/time4j/d1/c;
    //   144: bipush #48
    //   146: invokestatic valueOf : (C)Ljava/lang/Character;
    //   149: invokeinterface a : (Lnet/time4j/d1/c;Ljava/lang/Object;)Ljava/lang/Object;
    //   154: checkcast java/lang/Character
    //   157: invokevirtual charValue : ()C
    //   160: istore #6
    //   162: iload #5
    //   164: ifeq -> 176
    //   167: aload_0
    //   168: getfield g : Ljava/lang/String;
    //   171: astore #15
    //   173: goto -> 192
    //   176: aload_3
    //   177: getstatic net/time4j/e1/a0/b.g : Lnet/time4j/d1/c;
    //   180: ldc '+'
    //   182: invokeinterface a : (Lnet/time4j/d1/c;Ljava/lang/Object;)Ljava/lang/Object;
    //   187: checkcast java/lang/String
    //   190: astore #15
    //   192: iload #5
    //   194: ifeq -> 206
    //   197: aload_0
    //   198: getfield h : Ljava/lang/String;
    //   201: astore #16
    //   203: goto -> 222
    //   206: aload_3
    //   207: getstatic net/time4j/e1/a0/b.h : Lnet/time4j/d1/c;
    //   210: ldc '-'
    //   212: invokeinterface a : (Lnet/time4j/d1/c;Ljava/lang/Object;)Ljava/lang/Object;
    //   217: checkcast java/lang/String
    //   220: astore #16
    //   222: iload #5
    //   224: ifeq -> 236
    //   227: aload_0
    //   228: getfield e : Z
    //   231: istore #5
    //   233: goto -> 256
    //   236: aload_3
    //   237: getstatic net/time4j/e1/a.n : Lnet/time4j/d1/c;
    //   240: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   243: invokeinterface a : (Lnet/time4j/d1/c;Ljava/lang/Object;)Ljava/lang/Object;
    //   248: checkcast java/lang/Boolean
    //   251: invokevirtual booleanValue : ()Z
    //   254: istore #5
    //   256: aload_1
    //   257: invokevirtual r : ()I
    //   260: istore #8
    //   262: aload_1
    //   263: invokevirtual q : ()I
    //   266: istore #9
    //   268: iload #5
    //   270: ifne -> 306
    //   273: iload #8
    //   275: ifne -> 306
    //   278: iload #9
    //   280: ifne -> 306
    //   283: aload #17
    //   285: invokestatic a : (Ljava/util/Locale;)Ljava/lang/String;
    //   288: astore_1
    //   289: aload_2
    //   290: aload_1
    //   291: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   296: pop
    //   297: aload_1
    //   298: invokevirtual length : ()I
    //   301: istore #10
    //   303: goto -> 863
    //   306: aload #17
    //   308: invokestatic b : (Ljava/util/Locale;)Lnet/time4j/e1/a0/n$a;
    //   311: astore_3
    //   312: aload_3
    //   313: invokestatic a : (Lnet/time4j/e1/a0/n$a;)Ljava/lang/String;
    //   316: invokevirtual length : ()I
    //   319: istore #13
    //   321: iconst_0
    //   322: istore #9
    //   324: iconst_0
    //   325: istore #8
    //   327: iload #8
    //   329: istore #10
    //   331: iload #9
    //   333: iload #13
    //   335: if_icmpge -> 863
    //   338: aload_3
    //   339: invokestatic a : (Lnet/time4j/e1/a0/n$a;)Ljava/lang/String;
    //   342: iload #9
    //   344: invokevirtual charAt : (I)C
    //   347: istore #7
    //   349: aload_3
    //   350: invokestatic b : (Lnet/time4j/e1/a0/n$a;)I
    //   353: iload #9
    //   355: if_icmpgt -> 818
    //   358: aload_3
    //   359: invokestatic c : (Lnet/time4j/e1/a0/n$a;)I
    //   362: iload #9
    //   364: if_icmpgt -> 370
    //   367: goto -> 818
    //   370: aload_1
    //   371: invokevirtual t : ()Lnet/time4j/tz/f;
    //   374: getstatic net/time4j/tz/f.c : Lnet/time4j/tz/f;
    //   377: if_acmpne -> 399
    //   380: aload_2
    //   381: aload #16
    //   383: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   388: pop
    //   389: aload #16
    //   391: invokevirtual length : ()I
    //   394: istore #9
    //   396: goto -> 415
    //   399: aload_2
    //   400: aload #15
    //   402: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   407: pop
    //   408: aload #15
    //   410: invokevirtual length : ()I
    //   413: istore #9
    //   415: iload #8
    //   417: iload #9
    //   419: iadd
    //   420: istore #9
    //   422: aload_1
    //   423: invokevirtual b : ()I
    //   426: istore #10
    //   428: aload_1
    //   429: invokevirtual c : ()I
    //   432: istore #14
    //   434: aload_1
    //   435: invokevirtual d : ()I
    //   438: istore #12
    //   440: iload #9
    //   442: istore #8
    //   444: iload #10
    //   446: bipush #10
    //   448: if_icmpge -> 477
    //   451: iload #9
    //   453: istore #8
    //   455: aload_0
    //   456: getfield c : Z
    //   459: ifne -> 477
    //   462: aload_2
    //   463: iload #6
    //   465: invokeinterface append : (C)Ljava/lang/Appendable;
    //   470: pop
    //   471: iload #9
    //   473: iconst_1
    //   474: iadd
    //   475: istore #8
    //   477: iload #10
    //   479: invokestatic valueOf : (I)Ljava/lang/String;
    //   482: astore #17
    //   484: iconst_0
    //   485: istore #10
    //   487: iload #8
    //   489: istore #9
    //   491: iload #10
    //   493: istore #8
    //   495: iload #8
    //   497: aload #17
    //   499: invokevirtual length : ()I
    //   502: if_icmpge -> 541
    //   505: aload_2
    //   506: aload #17
    //   508: iload #8
    //   510: invokevirtual charAt : (I)C
    //   513: bipush #48
    //   515: isub
    //   516: iload #6
    //   518: iadd
    //   519: i2c
    //   520: invokeinterface append : (C)Ljava/lang/Appendable;
    //   525: pop
    //   526: iload #9
    //   528: iconst_1
    //   529: iadd
    //   530: istore #9
    //   532: iload #8
    //   534: iconst_1
    //   535: iadd
    //   536: istore #8
    //   538: goto -> 495
    //   541: iload #14
    //   543: ifne -> 568
    //   546: iload #12
    //   548: ifne -> 568
    //   551: iload #9
    //   553: istore #8
    //   555: aload_0
    //   556: getfield c : Z
    //   559: ifne -> 565
    //   562: goto -> 568
    //   565: goto -> 803
    //   568: aload_2
    //   569: aload_3
    //   570: invokestatic d : (Lnet/time4j/e1/a0/n$a;)Ljava/lang/String;
    //   573: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   578: pop
    //   579: iload #9
    //   581: aload_3
    //   582: invokestatic d : (Lnet/time4j/e1/a0/n$a;)Ljava/lang/String;
    //   585: invokevirtual length : ()I
    //   588: iadd
    //   589: istore #9
    //   591: iload #9
    //   593: istore #8
    //   595: iload #14
    //   597: bipush #10
    //   599: if_icmpge -> 617
    //   602: aload_2
    //   603: iload #6
    //   605: invokeinterface append : (C)Ljava/lang/Appendable;
    //   610: pop
    //   611: iload #9
    //   613: iconst_1
    //   614: iadd
    //   615: istore #8
    //   617: iload #14
    //   619: invokestatic valueOf : (I)Ljava/lang/String;
    //   622: astore #17
    //   624: iconst_0
    //   625: istore #10
    //   627: iload #8
    //   629: istore #9
    //   631: iload #10
    //   633: istore #8
    //   635: iload #8
    //   637: aload #17
    //   639: invokevirtual length : ()I
    //   642: if_icmpge -> 681
    //   645: aload_2
    //   646: aload #17
    //   648: iload #8
    //   650: invokevirtual charAt : (I)C
    //   653: bipush #48
    //   655: isub
    //   656: iload #6
    //   658: iadd
    //   659: i2c
    //   660: invokeinterface append : (C)Ljava/lang/Appendable;
    //   665: pop
    //   666: iload #9
    //   668: iconst_1
    //   669: iadd
    //   670: istore #9
    //   672: iload #8
    //   674: iconst_1
    //   675: iadd
    //   676: istore #8
    //   678: goto -> 635
    //   681: iload #9
    //   683: istore #8
    //   685: iload #12
    //   687: ifeq -> 565
    //   690: aload_2
    //   691: aload_3
    //   692: invokestatic d : (Lnet/time4j/e1/a0/n$a;)Ljava/lang/String;
    //   695: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   700: pop
    //   701: iload #9
    //   703: aload_3
    //   704: invokestatic d : (Lnet/time4j/e1/a0/n$a;)Ljava/lang/String;
    //   707: invokevirtual length : ()I
    //   710: iadd
    //   711: istore #9
    //   713: iload #9
    //   715: istore #8
    //   717: iload #12
    //   719: bipush #10
    //   721: if_icmpge -> 739
    //   724: aload_2
    //   725: iload #6
    //   727: invokeinterface append : (C)Ljava/lang/Appendable;
    //   732: pop
    //   733: iload #9
    //   735: iconst_1
    //   736: iadd
    //   737: istore #8
    //   739: iload #12
    //   741: invokestatic valueOf : (I)Ljava/lang/String;
    //   744: astore #17
    //   746: iconst_0
    //   747: istore #10
    //   749: iload #8
    //   751: istore #9
    //   753: iload #9
    //   755: istore #8
    //   757: iload #10
    //   759: aload #17
    //   761: invokevirtual length : ()I
    //   764: if_icmpge -> 565
    //   767: aload_2
    //   768: aload #17
    //   770: iload #10
    //   772: invokevirtual charAt : (I)C
    //   775: bipush #48
    //   777: isub
    //   778: iload #6
    //   780: iadd
    //   781: i2c
    //   782: invokeinterface append : (C)Ljava/lang/Appendable;
    //   787: pop
    //   788: iload #9
    //   790: iconst_1
    //   791: iadd
    //   792: istore #9
    //   794: iload #10
    //   796: iconst_1
    //   797: iadd
    //   798: istore #10
    //   800: goto -> 753
    //   803: aload_3
    //   804: invokestatic c : (Lnet/time4j/e1/a0/n$a;)I
    //   807: iconst_1
    //   808: isub
    //   809: istore #12
    //   811: iload #8
    //   813: istore #10
    //   815: goto -> 850
    //   818: iload #9
    //   820: istore #12
    //   822: iload #8
    //   824: istore #10
    //   826: iload #5
    //   828: ifne -> 850
    //   831: aload_2
    //   832: iload #7
    //   834: invokeinterface append : (C)Ljava/lang/Appendable;
    //   839: pop
    //   840: iload #8
    //   842: iconst_1
    //   843: iadd
    //   844: istore #10
    //   846: iload #9
    //   848: istore #12
    //   850: iload #12
    //   852: iconst_1
    //   853: iadd
    //   854: istore #9
    //   856: iload #10
    //   858: istore #8
    //   860: goto -> 327
    //   863: iload #11
    //   865: iconst_m1
    //   866: if_icmpeq -> 904
    //   869: iload #10
    //   871: ifle -> 904
    //   874: aload #4
    //   876: ifnull -> 904
    //   879: aload #4
    //   881: new net/time4j/e1/a0/g
    //   884: dup
    //   885: getstatic net/time4j/e1/a0/b0.c : Lnet/time4j/e1/a0/b0;
    //   888: iload #11
    //   890: iload #11
    //   892: iload #10
    //   894: iadd
    //   895: invokespecial <init> : (Lnet/time4j/d1/p;II)V
    //   898: invokeinterface add : (Ljava/lang/Object;)Z
    //   903: pop
    //   904: iload #10
    //   906: ireturn
    //   907: new java/lang/StringBuilder
    //   910: dup
    //   911: invokespecial <init> : ()V
    //   914: astore_2
    //   915: aload_2
    //   916: ldc_w 'Cannot extract timezone offset from: '
    //   919: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   922: pop
    //   923: aload_2
    //   924: aload_1
    //   925: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   928: pop
    //   929: new java/lang/IllegalArgumentException
    //   932: dup
    //   933: aload_2
    //   934: invokevirtual toString : ()Ljava/lang/String;
    //   937: invokespecial <init> : (Ljava/lang/String;)V
    //   940: astore_1
    //   941: goto -> 946
    //   944: aload_1
    //   945: athrow
    //   946: goto -> 944
  }
  
  public h<k> a(p<k> paramp) {
    return this;
  }
  
  public h<k> a(c<?> paramc, d paramd, int paramInt) {
    return new n(this.c, ((Boolean)paramd.a(net.time4j.e1.a.i, Boolean.TRUE)).booleanValue(), ((Boolean)paramd.a(net.time4j.e1.a.n, Boolean.FALSE)).booleanValue(), (Locale)paramd.a(net.time4j.e1.a.c, Locale.ROOT), (String)paramd.a(b.g, "+"), (String)paramd.a(b.h, "-"), ((Character)paramd.a(net.time4j.e1.a.m, Character.valueOf('0'))).charValue(), (g)paramd.a(net.time4j.e1.a.f, g.d));
  }
  
  public void a(CharSequence paramCharSequence, s params, d paramd, t<?> paramt, boolean paramBoolean) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface length : ()I
    //   6: istore #16
    //   8: aload_2
    //   9: invokevirtual f : ()I
    //   12: istore #9
    //   14: iload #9
    //   16: iload #16
    //   18: if_icmplt -> 31
    //   21: aload_2
    //   22: iload #9
    //   24: ldc_w 'Missing localized time zone offset.'
    //   27: invokevirtual a : (ILjava/lang/String;)V
    //   30: return
    //   31: iload #5
    //   33: ifeq -> 45
    //   36: aload_0
    //   37: getfield f : Ljava/util/Locale;
    //   40: astore #21
    //   42: goto -> 62
    //   45: aload_3
    //   46: getstatic net/time4j/e1/a.c : Lnet/time4j/d1/c;
    //   49: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
    //   52: invokeinterface a : (Lnet/time4j/d1/c;Ljava/lang/Object;)Ljava/lang/Object;
    //   57: checkcast java/util/Locale
    //   60: astore #21
    //   62: aload #21
    //   64: invokestatic b : (Ljava/util/Locale;)Z
    //   67: istore #20
    //   69: iload #5
    //   71: ifeq -> 83
    //   74: aload_0
    //   75: getfield e : Z
    //   78: istore #18
    //   80: goto -> 103
    //   83: aload_3
    //   84: getstatic net/time4j/e1/a.n : Lnet/time4j/d1/c;
    //   87: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   90: invokeinterface a : (Lnet/time4j/d1/c;Ljava/lang/Object;)Ljava/lang/Object;
    //   95: checkcast java/lang/Boolean
    //   98: invokevirtual booleanValue : ()Z
    //   101: istore #18
    //   103: iload #5
    //   105: ifeq -> 117
    //   108: aload_0
    //   109: getfield d : Z
    //   112: istore #19
    //   114: goto -> 137
    //   117: aload_3
    //   118: getstatic net/time4j/e1/a.i : Lnet/time4j/d1/c;
    //   121: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   124: invokeinterface a : (Lnet/time4j/d1/c;Ljava/lang/Object;)Ljava/lang/Object;
    //   129: checkcast java/lang/Boolean
    //   132: invokevirtual booleanValue : ()Z
    //   135: istore #19
    //   137: iload #5
    //   139: ifeq -> 151
    //   142: aload_0
    //   143: getfield i : C
    //   146: istore #6
    //   148: goto -> 173
    //   151: aload_3
    //   152: getstatic net/time4j/e1/a.m : Lnet/time4j/d1/c;
    //   155: bipush #48
    //   157: invokestatic valueOf : (C)Ljava/lang/Character;
    //   160: invokeinterface a : (Lnet/time4j/d1/c;Ljava/lang/Object;)Ljava/lang/Object;
    //   165: checkcast java/lang/Character
    //   168: invokevirtual charValue : ()C
    //   171: istore #6
    //   173: iload #5
    //   175: ifeq -> 187
    //   178: aload_0
    //   179: getfield g : Ljava/lang/String;
    //   182: astore #22
    //   184: goto -> 203
    //   187: aload_3
    //   188: getstatic net/time4j/e1/a0/b.g : Lnet/time4j/d1/c;
    //   191: ldc '+'
    //   193: invokeinterface a : (Lnet/time4j/d1/c;Ljava/lang/Object;)Ljava/lang/Object;
    //   198: checkcast java/lang/String
    //   201: astore #22
    //   203: iload #5
    //   205: ifeq -> 217
    //   208: aload_0
    //   209: getfield h : Ljava/lang/String;
    //   212: astore #23
    //   214: goto -> 233
    //   217: aload_3
    //   218: getstatic net/time4j/e1/a0/b.h : Lnet/time4j/d1/c;
    //   221: ldc '-'
    //   223: invokeinterface a : (Lnet/time4j/d1/c;Ljava/lang/Object;)Ljava/lang/Object;
    //   228: checkcast java/lang/String
    //   231: astore #23
    //   233: aload #21
    //   235: invokestatic b : (Ljava/util/Locale;)Lnet/time4j/e1/a0/n$a;
    //   238: astore #26
    //   240: aload #26
    //   242: invokestatic a : (Lnet/time4j/e1/a0/n$a;)Ljava/lang/String;
    //   245: invokevirtual length : ()I
    //   248: istore #12
    //   250: iconst_0
    //   251: istore #15
    //   253: iload #9
    //   255: istore #11
    //   257: aconst_null
    //   258: astore #25
    //   260: iconst_0
    //   261: istore #10
    //   263: aload #22
    //   265: astore #24
    //   267: iload #10
    //   269: iload #12
    //   271: if_icmpge -> 1031
    //   274: aload #26
    //   276: invokestatic a : (Lnet/time4j/e1/a0/n$a;)Ljava/lang/String;
    //   279: iload #10
    //   281: invokevirtual charAt : (I)C
    //   284: istore #8
    //   286: aload #26
    //   288: invokestatic b : (Lnet/time4j/e1/a0/n$a;)I
    //   291: iload #10
    //   293: if_icmpgt -> 860
    //   296: aload #26
    //   298: invokestatic c : (Lnet/time4j/e1/a0/n$a;)I
    //   301: iload #10
    //   303: if_icmpgt -> 309
    //   306: goto -> 860
    //   309: aload_1
    //   310: iload #11
    //   312: aload #24
    //   314: iload #19
    //   316: iload #20
    //   318: invokestatic a : (Ljava/lang/CharSequence;ILjava/lang/CharSequence;ZZ)I
    //   321: istore #10
    //   323: iload #10
    //   325: iconst_m1
    //   326: if_icmpne -> 419
    //   329: aload_1
    //   330: iload #11
    //   332: aload #23
    //   334: iload #19
    //   336: iload #20
    //   338: invokestatic a : (Ljava/lang/CharSequence;ILjava/lang/CharSequence;ZZ)I
    //   341: istore #10
    //   343: iload #10
    //   345: iconst_m1
    //   346: if_icmpne -> 411
    //   349: iload #18
    //   351: ifeq -> 361
    //   354: iload #15
    //   356: istore #10
    //   358: goto -> 375
    //   361: aload_1
    //   362: iload #16
    //   364: iload #9
    //   366: aload #21
    //   368: iload #19
    //   370: invokestatic a : (Ljava/lang/CharSequence;IILjava/util/Locale;Z)I
    //   373: istore #10
    //   375: iload #10
    //   377: ifle -> 401
    //   380: aload #4
    //   382: getstatic net/time4j/e1/a0/b0.d : Lnet/time4j/e1/a0/b0;
    //   385: getstatic net/time4j/tz/p.m : Lnet/time4j/tz/p;
    //   388: invokevirtual c : (Lnet/time4j/d1/p;Ljava/lang/Object;)V
    //   391: aload_2
    //   392: iload #9
    //   394: iload #10
    //   396: iadd
    //   397: invokevirtual a : (I)V
    //   400: return
    //   401: aload_2
    //   402: iload #9
    //   404: ldc_w 'Missing sign in localized time zone offset.'
    //   407: invokevirtual a : (ILjava/lang/String;)V
    //   410: return
    //   411: getstatic net/time4j/tz/f.c : Lnet/time4j/tz/f;
    //   414: astore #22
    //   416: goto -> 424
    //   419: getstatic net/time4j/tz/f.d : Lnet/time4j/tz/f;
    //   422: astore #22
    //   424: iload #11
    //   426: iload #10
    //   428: iadd
    //   429: istore #10
    //   431: aload_1
    //   432: iload #10
    //   434: iload #6
    //   436: invokestatic a : (Ljava/lang/CharSequence;IC)I
    //   439: istore #11
    //   441: iload #11
    //   443: sipush #-1000
    //   446: if_icmpne -> 459
    //   449: aload_2
    //   450: iload #10
    //   452: ldc_w 'Missing hour part in localized time zone offset.'
    //   455: invokevirtual a : (ILjava/lang/String;)V
    //   458: return
    //   459: iload #11
    //   461: ifge -> 479
    //   464: iload #11
    //   466: iconst_m1
    //   467: ixor
    //   468: istore #11
    //   470: iload #10
    //   472: iconst_1
    //   473: iadd
    //   474: istore #10
    //   476: goto -> 485
    //   479: iload #10
    //   481: iconst_2
    //   482: iadd
    //   483: istore #10
    //   485: iload #10
    //   487: iload #16
    //   489: if_icmplt -> 531
    //   492: aload_0
    //   493: getfield c : Z
    //   496: ifeq -> 521
    //   499: aload #4
    //   501: getstatic net/time4j/e1/a0/b0.d : Lnet/time4j/e1/a0/b0;
    //   504: aload #22
    //   506: iload #11
    //   508: invokestatic a : (Lnet/time4j/tz/f;I)Lnet/time4j/tz/p;
    //   511: invokevirtual c : (Lnet/time4j/d1/p;Ljava/lang/Object;)V
    //   514: aload_2
    //   515: iload #10
    //   517: invokevirtual a : (I)V
    //   520: return
    //   521: aload_2
    //   522: iload #10
    //   524: ldc_w 'Missing minute part in localized time zone offset.'
    //   527: invokevirtual a : (ILjava/lang/String;)V
    //   530: return
    //   531: iload #5
    //   533: ifeq -> 545
    //   536: aload_0
    //   537: getfield j : Lnet/time4j/e1/g;
    //   540: astore #25
    //   542: goto -> 562
    //   545: aload_3
    //   546: getstatic net/time4j/e1/a.f : Lnet/time4j/d1/c;
    //   549: getstatic net/time4j/e1/g.d : Lnet/time4j/e1/g;
    //   552: invokeinterface a : (Lnet/time4j/d1/c;Ljava/lang/Object;)Ljava/lang/Object;
    //   557: checkcast net/time4j/e1/g
    //   560: astore #25
    //   562: aload_1
    //   563: iload #10
    //   565: aload #26
    //   567: invokestatic d : (Lnet/time4j/e1/a0/n$a;)Ljava/lang/String;
    //   570: iload #19
    //   572: iload #20
    //   574: invokestatic a : (Ljava/lang/CharSequence;ILjava/lang/CharSequence;ZZ)I
    //   577: istore #13
    //   579: iload #13
    //   581: iconst_m1
    //   582: if_icmpeq -> 595
    //   585: iload #10
    //   587: iload #13
    //   589: iadd
    //   590: istore #13
    //   592: goto -> 646
    //   595: aload_0
    //   596: getfield c : Z
    //   599: ifeq -> 624
    //   602: aload #4
    //   604: getstatic net/time4j/e1/a0/b0.d : Lnet/time4j/e1/a0/b0;
    //   607: aload #22
    //   609: iload #11
    //   611: invokestatic a : (Lnet/time4j/tz/f;I)Lnet/time4j/tz/p;
    //   614: invokevirtual c : (Lnet/time4j/d1/p;Ljava/lang/Object;)V
    //   617: aload_2
    //   618: iload #10
    //   620: invokevirtual a : (I)V
    //   623: return
    //   624: iload #10
    //   626: istore #13
    //   628: aload #25
    //   630: invokevirtual c : ()Z
    //   633: ifeq -> 646
    //   636: aload_2
    //   637: iload #10
    //   639: ldc_w 'Mismatch of localized time zone offset separator.'
    //   642: invokevirtual a : (ILjava/lang/String;)V
    //   645: return
    //   646: aload_1
    //   647: iload #13
    //   649: iload #6
    //   651: invokestatic b : (Ljava/lang/CharSequence;IC)I
    //   654: istore #14
    //   656: iload #14
    //   658: sipush #-1000
    //   661: if_icmpne -> 674
    //   664: aload_2
    //   665: iload #13
    //   667: ldc_w 'Minute part in localized time zone offset does not match expected pattern mm.'
    //   670: invokevirtual a : (ILjava/lang/String;)V
    //   673: return
    //   674: iload #13
    //   676: iconst_2
    //   677: iadd
    //   678: istore #10
    //   680: iload #10
    //   682: iload #16
    //   684: if_icmpge -> 754
    //   687: aload_1
    //   688: iload #10
    //   690: aload #26
    //   692: invokestatic d : (Lnet/time4j/e1/a0/n$a;)Ljava/lang/String;
    //   695: iload #19
    //   697: iload #20
    //   699: invokestatic a : (Ljava/lang/CharSequence;ILjava/lang/CharSequence;ZZ)I
    //   702: istore #17
    //   704: iload #17
    //   706: iconst_m1
    //   707: if_icmpeq -> 754
    //   710: iload #10
    //   712: iload #17
    //   714: iadd
    //   715: istore #10
    //   717: aload_1
    //   718: iload #10
    //   720: iload #6
    //   722: invokestatic b : (Ljava/lang/CharSequence;IC)I
    //   725: istore #13
    //   727: iload #13
    //   729: sipush #-1000
    //   732: if_icmpne -> 745
    //   735: iload #10
    //   737: iload #17
    //   739: isub
    //   740: istore #10
    //   742: goto -> 757
    //   745: iload #10
    //   747: iconst_2
    //   748: iadd
    //   749: istore #10
    //   751: goto -> 757
    //   754: iconst_0
    //   755: istore #13
    //   757: iload #13
    //   759: ifeq -> 817
    //   762: iload #13
    //   764: sipush #-1000
    //   767: if_icmpne -> 773
    //   770: goto -> 817
    //   773: iload #11
    //   775: sipush #3600
    //   778: imul
    //   779: iload #14
    //   781: bipush #60
    //   783: imul
    //   784: iadd
    //   785: iload #13
    //   787: iadd
    //   788: istore #13
    //   790: iload #13
    //   792: istore #11
    //   794: aload #22
    //   796: getstatic net/time4j/tz/f.c : Lnet/time4j/tz/f;
    //   799: if_acmpne -> 807
    //   802: iload #13
    //   804: ineg
    //   805: istore #11
    //   807: iload #11
    //   809: invokestatic f : (I)Lnet/time4j/tz/p;
    //   812: astore #22
    //   814: goto -> 828
    //   817: aload #22
    //   819: iload #11
    //   821: iload #14
    //   823: invokestatic a : (Lnet/time4j/tz/f;II)Lnet/time4j/tz/p;
    //   826: astore #22
    //   828: aload #26
    //   830: invokestatic c : (Lnet/time4j/e1/a0/n$a;)I
    //   833: istore #11
    //   835: iload #11
    //   837: iconst_1
    //   838: isub
    //   839: istore #14
    //   841: iload #10
    //   843: istore #11
    //   845: iload #9
    //   847: istore #10
    //   849: iload #11
    //   851: istore #9
    //   853: aload #22
    //   855: astore #25
    //   857: goto -> 998
    //   860: iload #11
    //   862: istore #13
    //   864: iload #13
    //   866: istore #11
    //   868: iload #18
    //   870: ifne -> 982
    //   873: iload #13
    //   875: iload #16
    //   877: if_icmpge -> 893
    //   880: aload_1
    //   881: iload #13
    //   883: invokeinterface charAt : (I)C
    //   888: istore #7
    //   890: goto -> 896
    //   893: iconst_0
    //   894: istore #7
    //   896: iload #19
    //   898: ifne -> 908
    //   901: iload #8
    //   903: iload #7
    //   905: if_icmpeq -> 923
    //   908: iload #19
    //   910: ifeq -> 932
    //   913: iload #8
    //   915: iload #7
    //   917: invokestatic a : (CC)Z
    //   920: ifeq -> 932
    //   923: iload #13
    //   925: iconst_1
    //   926: iadd
    //   927: istore #11
    //   929: goto -> 982
    //   932: aload_1
    //   933: iload #16
    //   935: iload #9
    //   937: aload #21
    //   939: iload #19
    //   941: invokestatic a : (Ljava/lang/CharSequence;IILjava/util/Locale;Z)I
    //   944: istore #10
    //   946: iload #10
    //   948: ifle -> 972
    //   951: aload #4
    //   953: getstatic net/time4j/e1/a0/b0.d : Lnet/time4j/e1/a0/b0;
    //   956: getstatic net/time4j/tz/p.m : Lnet/time4j/tz/p;
    //   959: invokevirtual c : (Lnet/time4j/d1/p;Ljava/lang/Object;)V
    //   962: aload_2
    //   963: iload #9
    //   965: iload #10
    //   967: iadd
    //   968: invokevirtual a : (I)V
    //   971: return
    //   972: aload_2
    //   973: iload #9
    //   975: ldc_w 'Literal mismatched in localized time zone offset.'
    //   978: invokevirtual a : (ILjava/lang/String;)V
    //   981: return
    //   982: iload #9
    //   984: istore #13
    //   986: iload #11
    //   988: istore #9
    //   990: iload #10
    //   992: istore #14
    //   994: iload #13
    //   996: istore #10
    //   998: iload #14
    //   1000: iconst_1
    //   1001: iadd
    //   1002: istore #14
    //   1004: iload #12
    //   1006: istore #13
    //   1008: iload #10
    //   1010: istore #12
    //   1012: iload #9
    //   1014: istore #11
    //   1016: iload #14
    //   1018: istore #10
    //   1020: iload #12
    //   1022: istore #9
    //   1024: iload #13
    //   1026: istore #12
    //   1028: goto -> 267
    //   1031: aload #25
    //   1033: ifnonnull -> 1046
    //   1036: aload_2
    //   1037: iload #11
    //   1039: ldc_w 'Unable to determine localized time zone offset.'
    //   1042: invokevirtual a : (ILjava/lang/String;)V
    //   1045: return
    //   1046: aload #4
    //   1048: getstatic net/time4j/e1/a0/b0.d : Lnet/time4j/e1/a0/b0;
    //   1051: aload #25
    //   1053: invokevirtual c : (Lnet/time4j/d1/p;Ljava/lang/Object;)V
    //   1056: aload_2
    //   1057: iload #11
    //   1059: invokevirtual a : (I)V
    //   1062: return
  }
  
  public boolean a() {
    return false;
  }
  
  public p<k> b() {
    return b0.d;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof n) {
      paramObject = paramObject;
      return (this.c == ((n)paramObject).c);
    } 
    return false;
  }
  
  public int hashCode() {
    throw new RuntimeException("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(64);
    stringBuilder.append(n.class.getName());
    stringBuilder.append("[abbreviated=");
    stringBuilder.append(this.c);
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
  
  private static class a {
    private final String a;
    
    private final String b;
    
    private final int c;
    
    private final int d;
    
    a(String param1String1, String param1String2, int param1Int1, int param1Int2) {
      this.a = param1String1;
      this.b = param1String2;
      this.c = param1Int1;
      this.d = param1Int2;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/e1/a0/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */