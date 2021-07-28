package net.time4j;

import java.util.Iterator;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import net.time4j.c1.d;
import net.time4j.e1.n;
import net.time4j.e1.r;
import net.time4j.e1.w;
import net.time4j.e1.y;

final class r0 {
  private static final ConcurrentMap<Locale, r0> b = new ConcurrentHashMap<Locale, r0>();
  
  private static final w[] c = new w[] { f.f, f.h, f.i, f.j, g.c, g.d, g.e, g.f, g.g, g.h };
  
  private static final y d;
  
  private static final y e = new b(null);
  
  private final String a;
  
  static {
    Iterator<y> iterator = d.c().a(y.class).iterator();
    if (iterator.hasNext())
      y1 = iterator.next(); 
    y y2 = y1;
    if (y1 == null)
      y2 = e; 
    d = y2;
  }
  
  private r0(Locale paramLocale) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: new java/util/HashMap
    //   7: dup
    //   8: bipush #10
    //   10: invokespecial <init> : (I)V
    //   13: astore #11
    //   15: new java/util/HashMap
    //   18: dup
    //   19: bipush #10
    //   21: invokespecial <init> : (I)V
    //   24: astore #12
    //   26: new java/util/HashMap
    //   29: dup
    //   30: bipush #10
    //   32: invokespecial <init> : (I)V
    //   35: astore #13
    //   37: new java/util/HashMap
    //   40: dup
    //   41: bipush #10
    //   43: invokespecial <init> : (I)V
    //   46: astore #14
    //   48: new java/util/HashMap
    //   51: dup
    //   52: bipush #10
    //   54: invokespecial <init> : (I)V
    //   57: astore #15
    //   59: new java/util/HashMap
    //   62: dup
    //   63: bipush #10
    //   65: invokespecial <init> : (I)V
    //   68: astore #16
    //   70: getstatic net/time4j/r0.c : [Lnet/time4j/w;
    //   73: astore #8
    //   75: aload #8
    //   77: arraylength
    //   78: istore_2
    //   79: iconst_0
    //   80: istore_3
    //   81: iload_3
    //   82: iload_2
    //   83: if_icmpge -> 584
    //   86: aload #8
    //   88: iload_3
    //   89: aaload
    //   90: astore #17
    //   92: new java/util/EnumMap
    //   95: dup
    //   96: ldc net/time4j/e1/w
    //   98: invokespecial <init> : (Ljava/lang/Class;)V
    //   101: astore #18
    //   103: invokestatic values : ()[Lnet/time4j/e1/w;
    //   106: astore #9
    //   108: aload #9
    //   110: arraylength
    //   111: istore #4
    //   113: iconst_0
    //   114: istore #5
    //   116: iload #5
    //   118: iload #4
    //   120: if_icmpge -> 221
    //   123: aload #9
    //   125: iload #5
    //   127: aaload
    //   128: astore #19
    //   130: new java/util/EnumMap
    //   133: dup
    //   134: ldc net/time4j/e1/n
    //   136: invokespecial <init> : (Ljava/lang/Class;)V
    //   139: astore #20
    //   141: invokestatic values : ()[Lnet/time4j/e1/n;
    //   144: astore #10
    //   146: aload #10
    //   148: arraylength
    //   149: istore #6
    //   151: iconst_0
    //   152: istore #7
    //   154: iload #7
    //   156: iload #6
    //   158: if_icmpge -> 197
    //   161: aload #10
    //   163: iload #7
    //   165: aaload
    //   166: astore #21
    //   168: aload #20
    //   170: aload #21
    //   172: aload_1
    //   173: aload #17
    //   175: aload #19
    //   177: aload #21
    //   179: invokestatic a : (Ljava/util/Locale;Lnet/time4j/w;Lnet/time4j/e1/w;Lnet/time4j/e1/n;)Ljava/lang/String;
    //   182: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   187: pop
    //   188: iload #7
    //   190: iconst_1
    //   191: iadd
    //   192: istore #7
    //   194: goto -> 154
    //   197: aload #18
    //   199: aload #19
    //   201: aload #20
    //   203: invokestatic unmodifiableMap : (Ljava/util/Map;)Ljava/util/Map;
    //   206: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   211: pop
    //   212: iload #5
    //   214: iconst_1
    //   215: iadd
    //   216: istore #5
    //   218: goto -> 116
    //   221: aload #11
    //   223: aload #17
    //   225: aload #18
    //   227: invokestatic unmodifiableMap : (Ljava/util/Map;)Ljava/util/Map;
    //   230: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   235: pop
    //   236: aload #17
    //   238: invokeinterface a : ()C
    //   243: invokestatic isDigit : (C)Z
    //   246: ifne -> 577
    //   249: new java/util/EnumMap
    //   252: dup
    //   253: ldc net/time4j/e1/n
    //   255: invokespecial <init> : (Ljava/lang/Class;)V
    //   258: astore #9
    //   260: invokestatic values : ()[Lnet/time4j/e1/n;
    //   263: astore #10
    //   265: aload #10
    //   267: arraylength
    //   268: istore #5
    //   270: iconst_0
    //   271: istore #4
    //   273: iload #4
    //   275: iload #5
    //   277: if_icmpge -> 316
    //   280: aload #10
    //   282: iload #4
    //   284: aaload
    //   285: astore #18
    //   287: aload #9
    //   289: aload #18
    //   291: aload_1
    //   292: aload #17
    //   294: iconst_0
    //   295: iconst_0
    //   296: aload #18
    //   298: invokestatic a : (Ljava/util/Locale;Lnet/time4j/w;ZZLnet/time4j/e1/n;)Ljava/lang/String;
    //   301: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   306: pop
    //   307: iload #4
    //   309: iconst_1
    //   310: iadd
    //   311: istore #4
    //   313: goto -> 273
    //   316: aload #12
    //   318: aload #17
    //   320: aload #9
    //   322: invokestatic unmodifiableMap : (Ljava/util/Map;)Ljava/util/Map;
    //   325: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   330: pop
    //   331: new java/util/EnumMap
    //   334: dup
    //   335: ldc net/time4j/e1/n
    //   337: invokespecial <init> : (Ljava/lang/Class;)V
    //   340: astore #9
    //   342: invokestatic values : ()[Lnet/time4j/e1/n;
    //   345: astore #10
    //   347: aload #10
    //   349: arraylength
    //   350: istore #5
    //   352: iconst_0
    //   353: istore #4
    //   355: iload #4
    //   357: iload #5
    //   359: if_icmpge -> 398
    //   362: aload #10
    //   364: iload #4
    //   366: aaload
    //   367: astore #18
    //   369: aload #9
    //   371: aload #18
    //   373: aload_1
    //   374: aload #17
    //   376: iconst_0
    //   377: iconst_1
    //   378: aload #18
    //   380: invokestatic a : (Ljava/util/Locale;Lnet/time4j/w;ZZLnet/time4j/e1/n;)Ljava/lang/String;
    //   383: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   388: pop
    //   389: iload #4
    //   391: iconst_1
    //   392: iadd
    //   393: istore #4
    //   395: goto -> 355
    //   398: aload #14
    //   400: aload #17
    //   402: aload #9
    //   404: invokestatic unmodifiableMap : (Ljava/util/Map;)Ljava/util/Map;
    //   407: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   412: pop
    //   413: new java/util/EnumMap
    //   416: dup
    //   417: ldc net/time4j/e1/n
    //   419: invokespecial <init> : (Ljava/lang/Class;)V
    //   422: astore #10
    //   424: invokestatic values : ()[Lnet/time4j/e1/n;
    //   427: astore #9
    //   429: aload #9
    //   431: arraylength
    //   432: istore #5
    //   434: iconst_0
    //   435: istore #4
    //   437: iload #4
    //   439: iload #5
    //   441: if_icmpge -> 480
    //   444: aload #9
    //   446: iload #4
    //   448: aaload
    //   449: astore #18
    //   451: aload #10
    //   453: aload #18
    //   455: aload_1
    //   456: aload #17
    //   458: iconst_1
    //   459: iconst_0
    //   460: aload #18
    //   462: invokestatic a : (Ljava/util/Locale;Lnet/time4j/w;ZZLnet/time4j/e1/n;)Ljava/lang/String;
    //   465: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   470: pop
    //   471: iload #4
    //   473: iconst_1
    //   474: iadd
    //   475: istore #4
    //   477: goto -> 437
    //   480: aload #13
    //   482: aload #17
    //   484: aload #10
    //   486: invokestatic unmodifiableMap : (Ljava/util/Map;)Ljava/util/Map;
    //   489: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   494: pop
    //   495: new java/util/EnumMap
    //   498: dup
    //   499: ldc net/time4j/e1/n
    //   501: invokespecial <init> : (Ljava/lang/Class;)V
    //   504: astore #9
    //   506: invokestatic values : ()[Lnet/time4j/e1/n;
    //   509: astore #10
    //   511: aload #10
    //   513: arraylength
    //   514: istore #5
    //   516: iconst_0
    //   517: istore #4
    //   519: iload #4
    //   521: iload #5
    //   523: if_icmpge -> 562
    //   526: aload #10
    //   528: iload #4
    //   530: aaload
    //   531: astore #18
    //   533: aload #9
    //   535: aload #18
    //   537: aload_1
    //   538: aload #17
    //   540: iconst_1
    //   541: iconst_1
    //   542: aload #18
    //   544: invokestatic a : (Ljava/util/Locale;Lnet/time4j/w;ZZLnet/time4j/e1/n;)Ljava/lang/String;
    //   547: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   552: pop
    //   553: iload #4
    //   555: iconst_1
    //   556: iadd
    //   557: istore #4
    //   559: goto -> 519
    //   562: aload #15
    //   564: aload #17
    //   566: aload #9
    //   568: invokestatic unmodifiableMap : (Ljava/util/Map;)Ljava/util/Map;
    //   571: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   576: pop
    //   577: iload_3
    //   578: iconst_1
    //   579: iadd
    //   580: istore_3
    //   581: goto -> 81
    //   584: iconst_2
    //   585: istore_2
    //   586: iload_2
    //   587: bipush #7
    //   589: if_icmpgt -> 683
    //   592: iload_2
    //   593: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   596: astore #8
    //   598: new java/util/EnumMap
    //   601: dup
    //   602: ldc net/time4j/e1/w
    //   604: invokespecial <init> : (Ljava/lang/Class;)V
    //   607: astore #9
    //   609: invokestatic values : ()[Lnet/time4j/e1/w;
    //   612: astore #10
    //   614: aload #10
    //   616: arraylength
    //   617: istore #4
    //   619: iconst_0
    //   620: istore_3
    //   621: iload_3
    //   622: iload #4
    //   624: if_icmpge -> 661
    //   627: aload #10
    //   629: iload_3
    //   630: aaload
    //   631: astore #17
    //   633: aload #9
    //   635: aload #17
    //   637: aload_1
    //   638: aload #17
    //   640: aload #8
    //   642: invokevirtual intValue : ()I
    //   645: invokestatic a : (Ljava/util/Locale;Lnet/time4j/e1/w;I)Ljava/lang/String;
    //   648: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   653: pop
    //   654: iload_3
    //   655: iconst_1
    //   656: iadd
    //   657: istore_3
    //   658: goto -> 621
    //   661: aload #16
    //   663: aload #8
    //   665: aload #9
    //   667: invokestatic unmodifiableMap : (Ljava/util/Map;)Ljava/util/Map;
    //   670: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   675: pop
    //   676: iload_2
    //   677: iconst_1
    //   678: iadd
    //   679: istore_2
    //   680: goto -> 586
    //   683: aload #11
    //   685: invokestatic unmodifiableMap : (Ljava/util/Map;)Ljava/util/Map;
    //   688: pop
    //   689: aload #12
    //   691: invokestatic unmodifiableMap : (Ljava/util/Map;)Ljava/util/Map;
    //   694: pop
    //   695: aload #13
    //   697: invokestatic unmodifiableMap : (Ljava/util/Map;)Ljava/util/Map;
    //   700: pop
    //   701: aload #14
    //   703: invokestatic unmodifiableMap : (Ljava/util/Map;)Ljava/util/Map;
    //   706: pop
    //   707: aload #15
    //   709: invokestatic unmodifiableMap : (Ljava/util/Map;)Ljava/util/Map;
    //   712: pop
    //   713: aload #16
    //   715: invokestatic unmodifiableMap : (Ljava/util/Map;)Ljava/util/Map;
    //   718: pop
    //   719: new java/util/EnumMap
    //   722: dup
    //   723: ldc net/time4j/w0
    //   725: invokespecial <init> : (Ljava/lang/Class;)V
    //   728: astore #11
    //   730: new java/util/EnumMap
    //   733: dup
    //   734: ldc net/time4j/w0
    //   736: invokespecial <init> : (Ljava/lang/Class;)V
    //   739: astore #12
    //   741: invokestatic values : ()[Lnet/time4j/w0;
    //   744: astore #8
    //   746: aload #8
    //   748: arraylength
    //   749: istore_3
    //   750: iconst_0
    //   751: istore_2
    //   752: ldc ''
    //   754: astore #10
    //   756: iload_2
    //   757: iload_3
    //   758: if_icmpge -> 798
    //   761: aload #8
    //   763: iload_2
    //   764: aaload
    //   765: astore #9
    //   767: aload #11
    //   769: aload #9
    //   771: ldc ''
    //   773: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   778: pop
    //   779: aload #12
    //   781: aload #9
    //   783: ldc ''
    //   785: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   790: pop
    //   791: iload_2
    //   792: iconst_1
    //   793: iadd
    //   794: istore_2
    //   795: goto -> 752
    //   798: aload #10
    //   800: astore #8
    //   802: getstatic net/time4j/r0.d : Lnet/time4j/e1/y;
    //   805: aload_1
    //   806: invokeinterface b : (Ljava/util/Locale;)Ljava/lang/String;
    //   811: pop
    //   812: aload #10
    //   814: astore #9
    //   816: aload #10
    //   818: astore #8
    //   820: getstatic net/time4j/r0.d : Lnet/time4j/e1/y;
    //   823: instanceof net/time4j/e1/r
    //   826: ifeq -> 989
    //   829: aload #10
    //   831: astore #8
    //   833: ldc net/time4j/e1/r
    //   835: getstatic net/time4j/r0.d : Lnet/time4j/e1/y;
    //   838: invokevirtual cast : (Ljava/lang/Object;)Ljava/lang/Object;
    //   841: checkcast net/time4j/e1/r
    //   844: astore #13
    //   846: aload #10
    //   848: astore #8
    //   850: aload #13
    //   852: aload_1
    //   853: invokeinterface a : (Ljava/util/Locale;)Ljava/lang/String;
    //   858: pop
    //   859: aload #10
    //   861: astore #8
    //   863: aload #13
    //   865: aload_1
    //   866: invokeinterface c : (Ljava/util/Locale;)Ljava/lang/String;
    //   871: astore #10
    //   873: aload #10
    //   875: astore #8
    //   877: aload #13
    //   879: aload_1
    //   880: invokeinterface d : (Ljava/util/Locale;)Ljava/lang/String;
    //   885: pop
    //   886: aload #10
    //   888: astore #8
    //   890: invokestatic values : ()[Lnet/time4j/w0;
    //   893: astore #14
    //   895: aload #10
    //   897: astore #8
    //   899: aload #14
    //   901: arraylength
    //   902: istore_3
    //   903: iconst_0
    //   904: istore_2
    //   905: aload #10
    //   907: astore #9
    //   909: iload_2
    //   910: iload_3
    //   911: if_icmpge -> 989
    //   914: aload #14
    //   916: iload_2
    //   917: aaload
    //   918: astore #9
    //   920: aload #10
    //   922: astore #8
    //   924: aload #11
    //   926: aload #9
    //   928: aload #13
    //   930: aload #9
    //   932: aload_1
    //   933: invokeinterface b : (Lnet/time4j/w0;Ljava/util/Locale;)Ljava/lang/String;
    //   938: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   943: pop
    //   944: aload #10
    //   946: astore #8
    //   948: aload #12
    //   950: aload #9
    //   952: aload #13
    //   954: aload #9
    //   956: aload_1
    //   957: invokeinterface a : (Lnet/time4j/w0;Ljava/util/Locale;)Ljava/lang/String;
    //   962: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   967: pop
    //   968: iload_2
    //   969: iconst_1
    //   970: iadd
    //   971: istore_2
    //   972: goto -> 905
    //   975: getstatic net/time4j/r0.e : Lnet/time4j/e1/y;
    //   978: aload_1
    //   979: invokeinterface b : (Ljava/util/Locale;)Ljava/lang/String;
    //   984: pop
    //   985: aload #8
    //   987: astore #9
    //   989: aload_0
    //   990: aload #9
    //   992: putfield a : Ljava/lang/String;
    //   995: aload #11
    //   997: invokestatic unmodifiableMap : (Ljava/util/Map;)Ljava/util/Map;
    //   1000: pop
    //   1001: aload #12
    //   1003: invokestatic unmodifiableMap : (Ljava/util/Map;)Ljava/util/Map;
    //   1006: pop
    //   1007: return
    //   1008: astore #9
    //   1010: goto -> 975
    // Exception table:
    //   from	to	target	type
    //   802	812	1008	java/util/MissingResourceException
    //   820	829	1008	java/util/MissingResourceException
    //   833	846	1008	java/util/MissingResourceException
    //   850	859	1008	java/util/MissingResourceException
    //   863	873	1008	java/util/MissingResourceException
    //   877	886	1008	java/util/MissingResourceException
    //   890	895	1008	java/util/MissingResourceException
    //   899	903	1008	java/util/MissingResourceException
    //   924	944	1008	java/util/MissingResourceException
    //   948	968	1008	java/util/MissingResourceException
  }
  
  private static char a(w paramw) {
    char c = paramw.a();
    return (paramw == g.d) ? 'N' : c;
  }
  
  private static String a(Locale paramLocale, w paramw, int paramInt) {
    try {
      return d.a(paramLocale, paramw, paramInt);
    } catch (MissingResourceException missingResourceException) {
      return e.a(paramLocale, paramw, paramInt);
    } 
  }
  
  private static String a(Locale paramLocale, w paramw, w paramw1, n paramn) {
    try {
      return a(d, paramLocale, a(paramw), paramw1, paramn);
    } catch (MissingResourceException missingResourceException) {
      return a(e, paramLocale, a(paramw), paramw1, paramn);
    } 
  }
  
  private static String a(Locale paramLocale, w paramw, boolean paramBoolean1, boolean paramBoolean2, n paramn) {
    try {
      return a(d, paramLocale, a(paramw), paramBoolean1, paramBoolean2, paramn);
    } catch (MissingResourceException missingResourceException) {
      return a(e, paramLocale, a(paramw), paramBoolean1, paramBoolean2, paramn);
    } 
  }
  
  private static String a(y paramy, Locale paramLocale, char paramChar, w paramw, n paramn) {
    StringBuilder stringBuilder;
    if (paramChar != '3') {
      if (paramChar != '6') {
        if (paramChar != '9') {
          if (paramChar != 'D') {
            if (paramChar != 'H') {
              if (paramChar != 'S') {
                if (paramChar != 'W') {
                  if (paramChar != 'Y') {
                    if (paramChar != 'M') {
                      if (paramChar == 'N')
                        return paramy.e(paramLocale, paramw, paramn); 
                      stringBuilder = new StringBuilder();
                      stringBuilder.append("Unit-ID: ");
                      stringBuilder.append(paramChar);
                      throw new UnsupportedOperationException(stringBuilder.toString());
                    } 
                    return stringBuilder.c(paramLocale, paramw, paramn);
                  } 
                  return stringBuilder.i(paramLocale, paramw, paramn);
                } 
                return stringBuilder.b(paramLocale, paramw, paramn);
              } 
              return stringBuilder.a(paramLocale, paramw, paramn);
            } 
            return stringBuilder.f(paramLocale, paramw, paramn);
          } 
          return stringBuilder.j(paramLocale, paramw, paramn);
        } 
        return stringBuilder.d(paramLocale, paramw, paramn);
      } 
      return stringBuilder.h(paramLocale, paramw, paramn);
    } 
    return stringBuilder.g(paramLocale, paramw, paramn);
  }
  
  private static String a(y paramy, Locale paramLocale, char paramChar, boolean paramBoolean1, boolean paramBoolean2, n paramn) {
    StringBuilder stringBuilder;
    if (paramBoolean2 && paramy instanceof r) {
      r r = r.class.cast(paramy);
      if (paramChar != 'D') {
        if (paramChar != 'H') {
          if (paramChar != 'S') {
            if (paramChar != 'W') {
              if (paramChar != 'Y') {
                if (paramChar != 'M') {
                  if (paramChar == 'N')
                    return r.n(paramLocale, paramBoolean1, paramn); 
                  stringBuilder = new StringBuilder();
                  stringBuilder.append("Unit-ID: ");
                  stringBuilder.append(paramChar);
                  throw new UnsupportedOperationException(stringBuilder.toString());
                } 
                return stringBuilder.k(paramLocale, paramBoolean1, paramn);
              } 
              return stringBuilder.l(paramLocale, paramBoolean1, paramn);
            } 
            return stringBuilder.g(paramLocale, paramBoolean1, paramn);
          } 
          return stringBuilder.h(paramLocale, paramBoolean1, paramn);
        } 
        return stringBuilder.b(paramLocale, paramBoolean1, paramn);
      } 
      return stringBuilder.e(paramLocale, paramBoolean1, paramn);
    } 
    if (paramChar != 'D') {
      if (paramChar != 'H') {
        if (paramChar != 'S') {
          if (paramChar != 'W') {
            if (paramChar != 'Y') {
              if (paramChar != 'M') {
                if (paramChar == 'N')
                  return stringBuilder.j(paramLocale, paramBoolean1, paramn); 
                stringBuilder = new StringBuilder();
                stringBuilder.append("Unit-ID: ");
                stringBuilder.append(paramChar);
                throw new UnsupportedOperationException(stringBuilder.toString());
              } 
              return stringBuilder.f(paramLocale, paramBoolean1, paramn);
            } 
            return stringBuilder.i(paramLocale, paramBoolean1, paramn);
          } 
          return stringBuilder.d(paramLocale, paramBoolean1, paramn);
        } 
        return stringBuilder.c(paramLocale, paramBoolean1, paramn);
      } 
      return stringBuilder.m(paramLocale, paramBoolean1, paramn);
    } 
    return stringBuilder.a(paramLocale, paramBoolean1, paramn);
  }
  
  static r0 a(Locale paramLocale) {
    if (paramLocale != null) {
      r0 r02 = b.get(paramLocale);
      r0 r01 = r02;
      if (r02 == null) {
        r01 = new r0(paramLocale);
        r0 r03 = b.putIfAbsent(paramLocale, r01);
        if (r03 != null)
          r01 = r03; 
      } 
      return r01;
    } 
    throw new NullPointerException("Missing language.");
  }
  
  String a() {
    return this.a;
  }
  
  static {
    y y1 = null;
  }
  
  private static class b implements y {
    private b() {}
    
    private static String a(String param1String) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{0} ");
      stringBuilder.append(param1String);
      return stringBuilder.toString();
    }
    
    private static String a(String param1String1, String param1String2, String param1String3, w param1w, n param1n) {
      StringBuilder stringBuilder;
      int i = r0.a.a[param1w.ordinal()];
      if (i != 1) {
        if (i != 2 && i != 3) {
          if (i == 4) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("{0}");
            stringBuilder.append(param1String3);
            return stringBuilder.toString();
          } 
          throw new UnsupportedOperationException(param1w.name());
        } 
        return a(param1String2, param1n);
      } 
      return a((String)stringBuilder, param1n);
    }
    
    private static String a(String param1String, n param1n) {
      String str;
      if (param1n == n.d) {
        str = "";
      } else {
        str = "s";
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{0} ");
      stringBuilder.append(param1String);
      stringBuilder.append(str);
      return stringBuilder.toString();
    }
    
    private static String a(String param1String, boolean param1Boolean) {
      String str;
      StringBuilder stringBuilder = new StringBuilder();
      if (param1Boolean) {
        str = "+";
      } else {
        str = "-";
      } 
      stringBuilder.append(str);
      stringBuilder.append("{0} ");
      stringBuilder.append(param1String);
      return stringBuilder.toString();
    }
    
    private static String a(String param1String, boolean param1Boolean, n param1n) {
      String str;
      if (param1n == n.d) {
        str = "";
      } else {
        str = "s";
      } 
      if (param1Boolean) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("in {0} ");
        stringBuilder.append(param1String);
        stringBuilder.append(str);
        stringBuilder1 = stringBuilder;
        return stringBuilder1.toString();
      } 
      StringBuilder stringBuilder2 = new StringBuilder();
      stringBuilder2.append("{0} ");
      stringBuilder2.append((String)stringBuilder1);
      stringBuilder2.append(str);
      stringBuilder2.append(" ago");
      StringBuilder stringBuilder1 = stringBuilder2;
      return stringBuilder1.toString();
    }
    
    public String a(Locale param1Locale, w param1w, int param1Int) {
      if (param1Int >= 2) {
        StringBuilder stringBuilder = new StringBuilder(param1Int * 5);
        int i;
        for (i = 0; i < param1Int; i++) {
          stringBuilder.append('{');
          stringBuilder.append(i);
          stringBuilder.append('}');
          if (i < param1Int - 1)
            stringBuilder.append(", "); 
        } 
        return stringBuilder.toString();
      } 
      IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Size must be greater than 1.");
      throw illegalArgumentException;
    }
    
    public String a(Locale param1Locale, w param1w, n param1n) {
      return param1Locale.getLanguage().equals("en") ? a("second", "sec", "s", param1w, param1n) : a("s");
    }
    
    public String a(Locale param1Locale, boolean param1Boolean, n param1n) {
      return param1Locale.getLanguage().equals("en") ? a("day", param1Boolean, param1n) : a("d", param1Boolean);
    }
    
    public String b(Locale param1Locale) {
      return "now";
    }
    
    public String b(Locale param1Locale, w param1w, n param1n) {
      return param1Locale.getLanguage().equals("en") ? a("week", "wk", "w", param1w, param1n) : a("w");
    }
    
    public String c(Locale param1Locale, w param1w, n param1n) {
      return param1Locale.getLanguage().equals("en") ? a("month", "mth", "m", param1w, param1n) : a("m");
    }
    
    public String c(Locale param1Locale, boolean param1Boolean, n param1n) {
      return param1Locale.getLanguage().equals("en") ? a("second", param1Boolean, param1n) : a("s", param1Boolean);
    }
    
    public String d(Locale param1Locale, w param1w, n param1n) {
      return param1Locale.getLanguage().equals("en") ? a("nanosecond", "nsec", "ns", param1w, param1n) : a("ns");
    }
    
    public String d(Locale param1Locale, boolean param1Boolean, n param1n) {
      return param1Locale.getLanguage().equals("en") ? a("week", param1Boolean, param1n) : a("w", param1Boolean);
    }
    
    public String e(Locale param1Locale, w param1w, n param1n) {
      return param1Locale.getLanguage().equals("en") ? a("minute", "min", "m", param1w, param1n) : a("min");
    }
    
    public String f(Locale param1Locale, w param1w, n param1n) {
      return param1Locale.getLanguage().equals("en") ? a("hour", "hr", "h", param1w, param1n) : a("h");
    }
    
    public String f(Locale param1Locale, boolean param1Boolean, n param1n) {
      return param1Locale.getLanguage().equals("en") ? a("month", param1Boolean, param1n) : a("m", param1Boolean);
    }
    
    public String g(Locale param1Locale, w param1w, n param1n) {
      return param1Locale.getLanguage().equals("en") ? a("millisecond", "msec", "ms", param1w, param1n) : a("ms");
    }
    
    public String h(Locale param1Locale, w param1w, n param1n) {
      return param1Locale.getLanguage().equals("en") ? a("microsecond", "µsec", "µs", param1w, param1n) : a("µs");
    }
    
    public String i(Locale param1Locale, w param1w, n param1n) {
      return param1Locale.getLanguage().equals("en") ? a("year", "yr", "y", param1w, param1n) : a("y");
    }
    
    public String i(Locale param1Locale, boolean param1Boolean, n param1n) {
      return param1Locale.getLanguage().equals("en") ? a("year", param1Boolean, param1n) : a("y", param1Boolean);
    }
    
    public String j(Locale param1Locale, w param1w, n param1n) {
      return param1Locale.getLanguage().equals("en") ? a("day", "day", "d", param1w, param1n) : a("d");
    }
    
    public String j(Locale param1Locale, boolean param1Boolean, n param1n) {
      return param1Locale.getLanguage().equals("en") ? a("minute", param1Boolean, param1n) : a("min", param1Boolean);
    }
    
    public String m(Locale param1Locale, boolean param1Boolean, n param1n) {
      return param1Locale.getLanguage().equals("en") ? a("hour", param1Boolean, param1n) : a("h", param1Boolean);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/r0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */