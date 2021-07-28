package net.time4j.e1.a0;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import net.time4j.c;
import net.time4j.d1.c;
import net.time4j.d1.d;
import net.time4j.d1.l;
import net.time4j.d1.m;
import net.time4j.d1.p;
import net.time4j.d1.s;
import net.time4j.d1.x;
import net.time4j.e1.c;
import net.time4j.e1.u;
import net.time4j.f0;
import net.time4j.g0;
import net.time4j.j0;
import net.time4j.y0;

public enum w {
  c, d, e, f, g;
  
  private static <T> T a(Object paramObject) {
    return (T)paramObject;
  }
  
  private Map<p<?>, p<?>> a(c.d<?> paramd, char paramChar, int paramInt, Locale paramLocale) {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic a : (Lnet/time4j/e1/a0/c$d;)Lnet/time4j/d1/x;
    //   4: astore #7
    //   6: aload #7
    //   8: invokevirtual g : ()Ljava/util/Set;
    //   11: invokeinterface iterator : ()Ljava/util/Iterator;
    //   16: astore #6
    //   18: aload #6
    //   20: invokeinterface hasNext : ()Z
    //   25: ifeq -> 54
    //   28: aload #6
    //   30: invokeinterface next : ()Ljava/lang/Object;
    //   35: checkcast net/time4j/d1/p
    //   38: astore #5
    //   40: aload #5
    //   42: invokeinterface a : ()C
    //   47: iload_2
    //   48: if_icmpne -> 18
    //   51: goto -> 57
    //   54: aconst_null
    //   55: astore #5
    //   57: aload #5
    //   59: astore #6
    //   61: aload #5
    //   63: ifnonnull -> 165
    //   66: aload #7
    //   68: invokevirtual f : ()Ljava/util/List;
    //   71: invokeinterface iterator : ()Ljava/util/Iterator;
    //   76: astore #7
    //   78: aload #5
    //   80: astore #6
    //   82: aload #7
    //   84: invokeinterface hasNext : ()Z
    //   89: ifeq -> 165
    //   92: aload #7
    //   94: invokeinterface next : ()Ljava/lang/Object;
    //   99: checkcast net/time4j/d1/s
    //   102: aload #4
    //   104: invokestatic a : ()Lnet/time4j/e1/a;
    //   107: invokeinterface a : (Ljava/util/Locale;Lnet/time4j/d1/d;)Ljava/util/Set;
    //   112: invokeinterface iterator : ()Ljava/util/Iterator;
    //   117: astore #8
    //   119: aload #5
    //   121: astore #6
    //   123: aload #8
    //   125: invokeinterface hasNext : ()Z
    //   130: ifeq -> 156
    //   133: aload #8
    //   135: invokeinterface next : ()Ljava/lang/Object;
    //   140: checkcast net/time4j/d1/p
    //   143: astore #6
    //   145: aload #6
    //   147: invokeinterface a : ()C
    //   152: iload_2
    //   153: if_icmpne -> 119
    //   156: aload #6
    //   158: astore #5
    //   160: aload #6
    //   162: ifnull -> 78
    //   165: aload #6
    //   167: ifnull -> 382
    //   170: aload #6
    //   172: instanceof net/time4j/e1/u
    //   175: ifeq -> 313
    //   178: iload_3
    //   179: iconst_1
    //   180: if_icmpeq -> 270
    //   183: iload_3
    //   184: iconst_2
    //   185: if_icmpeq -> 257
    //   188: iload_3
    //   189: iconst_3
    //   190: if_icmpeq -> 244
    //   193: iload_3
    //   194: iconst_4
    //   195: if_icmpne -> 211
    //   198: getstatic net/time4j/e1/a.g : Lnet/time4j/d1/c;
    //   201: astore #4
    //   203: getstatic net/time4j/e1/w.c : Lnet/time4j/e1/w;
    //   206: astore #5
    //   208: goto -> 280
    //   211: new java/lang/StringBuilder
    //   214: dup
    //   215: invokespecial <init> : ()V
    //   218: astore_1
    //   219: aload_1
    //   220: ldc 'Illegal count of symbols: '
    //   222: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   225: pop
    //   226: aload_1
    //   227: iload_2
    //   228: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   231: pop
    //   232: new java/lang/IllegalArgumentException
    //   235: dup
    //   236: aload_1
    //   237: invokevirtual toString : ()Ljava/lang/String;
    //   240: invokespecial <init> : (Ljava/lang/String;)V
    //   243: athrow
    //   244: getstatic net/time4j/e1/a.g : Lnet/time4j/d1/c;
    //   247: astore #4
    //   249: getstatic net/time4j/e1/w.d : Lnet/time4j/e1/w;
    //   252: astore #5
    //   254: goto -> 280
    //   257: getstatic net/time4j/e1/a.g : Lnet/time4j/d1/c;
    //   260: astore #4
    //   262: getstatic net/time4j/e1/w.e : Lnet/time4j/e1/w;
    //   265: astore #5
    //   267: goto -> 280
    //   270: getstatic net/time4j/e1/a.g : Lnet/time4j/d1/c;
    //   273: astore #4
    //   275: getstatic net/time4j/e1/w.f : Lnet/time4j/e1/w;
    //   278: astore #5
    //   280: aload_1
    //   281: aload #4
    //   283: aload #5
    //   285: invokevirtual a : (Lnet/time4j/d1/c;Ljava/lang/Enum;)Lnet/time4j/e1/a0/c$d;
    //   288: pop
    //   289: aload #6
    //   291: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   294: pop
    //   295: aload_1
    //   296: aload #6
    //   298: checkcast net/time4j/e1/u
    //   301: invokevirtual a : (Lnet/time4j/e1/u;)Lnet/time4j/e1/a0/c$d;
    //   304: pop
    //   305: aload_1
    //   306: invokevirtual i : ()Lnet/time4j/e1/a0/c$d;
    //   309: pop
    //   310: goto -> 344
    //   313: aload #6
    //   315: invokeinterface getType : ()Ljava/lang/Class;
    //   320: ldc java/lang/Integer
    //   322: if_acmpne -> 348
    //   325: aload #6
    //   327: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   330: pop
    //   331: aload_1
    //   332: aload #6
    //   334: checkcast net/time4j/d1/p
    //   337: iload_3
    //   338: bipush #9
    //   340: invokevirtual a : (Lnet/time4j/d1/p;II)Lnet/time4j/e1/a0/c$d;
    //   343: pop
    //   344: invokestatic emptyMap : ()Ljava/util/Map;
    //   347: areturn
    //   348: new java/lang/StringBuilder
    //   351: dup
    //   352: invokespecial <init> : ()V
    //   355: astore_1
    //   356: aload_1
    //   357: ldc 'Can only handle integer or text elements: '
    //   359: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   362: pop
    //   363: aload_1
    //   364: aload #6
    //   366: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   369: pop
    //   370: new java/lang/IllegalArgumentException
    //   373: dup
    //   374: aload_1
    //   375: invokevirtual toString : ()Ljava/lang/String;
    //   378: invokespecial <init> : (Ljava/lang/String;)V
    //   381: athrow
    //   382: new java/lang/StringBuilder
    //   385: dup
    //   386: invokespecial <init> : ()V
    //   389: astore_1
    //   390: aload_1
    //   391: ldc 'Cannot resolve symbol: '
    //   393: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   396: pop
    //   397: aload_1
    //   398: iload_2
    //   399: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   402: pop
    //   403: new java/lang/IllegalArgumentException
    //   406: dup
    //   407: aload_1
    //   408: invokevirtual toString : ()Ljava/lang/String;
    //   411: invokespecial <init> : (Ljava/lang/String;)V
    //   414: astore_1
    //   415: goto -> 420
    //   418: aload_1
    //   419: athrow
    //   420: goto -> 418
  }
  
  private Map<p<?>, p<?>> a(c.d<?> paramd, x<?> paramx, char paramChar, int paramInt, Locale paramLocale) {
    // Byte code:
    //   0: iload_3
    //   1: bipush #103
    //   3: if_icmpne -> 25
    //   6: aload_1
    //   7: getstatic net/time4j/d1/a0.e : Lnet/time4j/d1/a0;
    //   10: iload #4
    //   12: bipush #18
    //   14: getstatic net/time4j/e1/a0/x.d : Lnet/time4j/e1/a0/x;
    //   17: invokevirtual b : (Lnet/time4j/d1/p;IILnet/time4j/e1/a0/x;)Lnet/time4j/e1/a0/c$d;
    //   20: pop
    //   21: invokestatic emptyMap : ()Ljava/util/Map;
    //   24: areturn
    //   25: aload_2
    //   26: iload_3
    //   27: aload #5
    //   29: invokestatic a : (Lnet/time4j/d1/x;CLjava/util/Locale;)Ljava/util/Set;
    //   32: astore #8
    //   34: aload_1
    //   35: invokevirtual j : ()Lnet/time4j/d1/x;
    //   38: invokevirtual e : ()Ljava/lang/Class;
    //   41: invokevirtual getName : ()Ljava/lang/String;
    //   44: astore #10
    //   46: aload #8
    //   48: iload_3
    //   49: aload #10
    //   51: invokestatic a : (Ljava/util/Set;CLjava/lang/String;)Lnet/time4j/d1/p;
    //   54: astore #11
    //   56: ldc java/lang/Integer
    //   58: aload #11
    //   60: invokeinterface getType : ()Ljava/lang/Class;
    //   65: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   68: istore #7
    //   70: aconst_null
    //   71: astore #8
    //   73: iload #7
    //   75: ifeq -> 115
    //   78: aload #11
    //   80: instanceof net/time4j/e1/b0/a
    //   83: ifeq -> 99
    //   86: aload #11
    //   88: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   91: pop
    //   92: aload #11
    //   94: checkcast net/time4j/e1/u
    //   97: astore #8
    //   99: aload #11
    //   101: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   104: pop
    //   105: aload #11
    //   107: checkcast net/time4j/d1/p
    //   110: astore #9
    //   112: goto -> 139
    //   115: aload #11
    //   117: instanceof net/time4j/e1/u
    //   120: ifeq -> 1012
    //   123: aload #11
    //   125: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   128: pop
    //   129: aload #11
    //   131: checkcast net/time4j/e1/u
    //   134: astore #8
    //   136: aconst_null
    //   137: astore #9
    //   139: iload_3
    //   140: bipush #76
    //   142: if_icmpeq -> 984
    //   145: iload_3
    //   146: bipush #77
    //   148: if_icmpeq -> 973
    //   151: iload_3
    //   152: bipush #85
    //   154: if_icmpeq -> 848
    //   157: iconst_1
    //   158: istore #6
    //   160: iload_3
    //   161: bipush #87
    //   163: if_icmpeq -> 796
    //   166: iload_3
    //   167: bipush #114
    //   169: if_icmpeq -> 757
    //   172: iload_3
    //   173: bipush #119
    //   175: if_icmpeq -> 320
    //   178: iload_3
    //   179: bipush #121
    //   181: if_icmpeq -> 680
    //   184: iload_3
    //   185: tableswitch default -> 216, 68 -> 618, 69 -> 515, 70 -> 463, 71 -> 402
    //   216: iload_3
    //   217: tableswitch default -> 244, 99 -> 333, 100 -> 320, 101 -> 277
    //   244: new java/lang/StringBuilder
    //   247: dup
    //   248: invokespecial <init> : ()V
    //   251: astore_1
    //   252: aload_1
    //   253: ldc 'Unsupported pattern symbol: '
    //   255: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   258: pop
    //   259: aload_1
    //   260: iload_3
    //   261: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   264: pop
    //   265: new java/lang/IllegalArgumentException
    //   268: dup
    //   269: aload_1
    //   270: invokevirtual toString : ()Ljava/lang/String;
    //   273: invokespecial <init> : (Ljava/lang/String;)V
    //   276: athrow
    //   277: iload #4
    //   279: iconst_2
    //   280: if_icmpgt -> 304
    //   283: aload #11
    //   285: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   288: pop
    //   289: aload_1
    //   290: aload #11
    //   292: checkcast net/time4j/d1/p
    //   295: iload #4
    //   297: invokevirtual b : (Lnet/time4j/d1/p;I)Lnet/time4j/e1/a0/c$d;
    //   300: pop
    //   301: goto -> 1008
    //   304: aload_0
    //   305: aload_1
    //   306: aload_2
    //   307: bipush #69
    //   309: iload #4
    //   311: aload #5
    //   313: invokespecial a : (Lnet/time4j/e1/a0/c$d;Lnet/time4j/d1/x;CILjava/util/Locale;)Ljava/util/Map;
    //   316: pop
    //   317: goto -> 1008
    //   320: aload #9
    //   322: iload_3
    //   323: aload_1
    //   324: iload #4
    //   326: iconst_0
    //   327: invokestatic a : (Lnet/time4j/d1/p;CLnet/time4j/e1/a0/c$d;IZ)V
    //   330: goto -> 1008
    //   333: iload #4
    //   335: iconst_2
    //   336: if_icmpeq -> 392
    //   339: aload_1
    //   340: getstatic net/time4j/e1/a.h : Lnet/time4j/d1/c;
    //   343: getstatic net/time4j/e1/m.d : Lnet/time4j/e1/m;
    //   346: invokevirtual a : (Lnet/time4j/d1/c;Ljava/lang/Enum;)Lnet/time4j/e1/a0/c$d;
    //   349: pop
    //   350: iload #4
    //   352: iconst_1
    //   353: if_icmpne -> 376
    //   356: aload #11
    //   358: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   361: pop
    //   362: aload_1
    //   363: aload #11
    //   365: checkcast net/time4j/d1/p
    //   368: iconst_1
    //   369: invokevirtual b : (Lnet/time4j/d1/p;I)Lnet/time4j/e1/a0/c$d;
    //   372: pop
    //   373: goto -> 1003
    //   376: aload_0
    //   377: aload_1
    //   378: aload_2
    //   379: bipush #69
    //   381: iload #4
    //   383: aload #5
    //   385: invokespecial a : (Lnet/time4j/e1/a0/c$d;Lnet/time4j/d1/x;CILjava/util/Locale;)Ljava/util/Map;
    //   388: pop
    //   389: goto -> 1003
    //   392: new java/lang/IllegalArgumentException
    //   395: dup
    //   396: ldc 'Invalid pattern count of 2 for symbol 'c'.'
    //   398: invokespecial <init> : (Ljava/lang/String;)V
    //   401: athrow
    //   402: iload #4
    //   404: iconst_3
    //   405: if_icmpgt -> 411
    //   408: goto -> 521
    //   411: iload #4
    //   413: iconst_4
    //   414: if_icmpne -> 420
    //   417: goto -> 534
    //   420: iload #4
    //   422: iconst_5
    //   423: if_icmpne -> 429
    //   426: goto -> 547
    //   429: new java/lang/StringBuilder
    //   432: dup
    //   433: invokespecial <init> : ()V
    //   436: astore_1
    //   437: aload_1
    //   438: ldc 'Too many pattern letters (G): '
    //   440: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   443: pop
    //   444: aload_1
    //   445: iload #4
    //   447: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   450: pop
    //   451: new java/lang/IllegalArgumentException
    //   454: dup
    //   455: aload_1
    //   456: invokevirtual toString : ()Ljava/lang/String;
    //   459: invokespecial <init> : (Ljava/lang/String;)V
    //   462: athrow
    //   463: iload #4
    //   465: iconst_1
    //   466: if_icmpne -> 481
    //   469: aload_1
    //   470: aload #9
    //   472: iload #4
    //   474: invokevirtual a : (Lnet/time4j/d1/p;I)Lnet/time4j/e1/a0/c$d;
    //   477: pop
    //   478: goto -> 1008
    //   481: new java/lang/StringBuilder
    //   484: dup
    //   485: invokespecial <init> : ()V
    //   488: astore_1
    //   489: aload_1
    //   490: ldc 'Too many pattern letters (F): '
    //   492: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   495: pop
    //   496: aload_1
    //   497: iload #4
    //   499: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   502: pop
    //   503: new java/lang/IllegalArgumentException
    //   506: dup
    //   507: aload_1
    //   508: invokevirtual toString : ()Ljava/lang/String;
    //   511: invokespecial <init> : (Ljava/lang/String;)V
    //   514: athrow
    //   515: iload #4
    //   517: iconst_3
    //   518: if_icmpgt -> 528
    //   521: getstatic net/time4j/e1/w.d : Lnet/time4j/e1/w;
    //   524: astore_2
    //   525: goto -> 565
    //   528: iload #4
    //   530: iconst_4
    //   531: if_icmpne -> 541
    //   534: getstatic net/time4j/e1/w.c : Lnet/time4j/e1/w;
    //   537: astore_2
    //   538: goto -> 565
    //   541: iload #4
    //   543: iconst_5
    //   544: if_icmpne -> 554
    //   547: getstatic net/time4j/e1/w.f : Lnet/time4j/e1/w;
    //   550: astore_2
    //   551: goto -> 565
    //   554: iload #4
    //   556: bipush #6
    //   558: if_icmpne -> 584
    //   561: getstatic net/time4j/e1/w.e : Lnet/time4j/e1/w;
    //   564: astore_2
    //   565: aload_1
    //   566: getstatic net/time4j/e1/a.g : Lnet/time4j/d1/c;
    //   569: aload_2
    //   570: invokevirtual a : (Lnet/time4j/d1/c;Ljava/lang/Enum;)Lnet/time4j/e1/a0/c$d;
    //   573: pop
    //   574: aload_1
    //   575: aload #8
    //   577: invokevirtual a : (Lnet/time4j/e1/u;)Lnet/time4j/e1/a0/c$d;
    //   580: pop
    //   581: goto -> 1003
    //   584: new java/lang/StringBuilder
    //   587: dup
    //   588: invokespecial <init> : ()V
    //   591: astore_1
    //   592: aload_1
    //   593: ldc 'Too many pattern letters (E): '
    //   595: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   598: pop
    //   599: aload_1
    //   600: iload #4
    //   602: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   605: pop
    //   606: new java/lang/IllegalArgumentException
    //   609: dup
    //   610: aload_1
    //   611: invokevirtual toString : ()Ljava/lang/String;
    //   614: invokespecial <init> : (Ljava/lang/String;)V
    //   617: athrow
    //   618: iload #4
    //   620: iconst_3
    //   621: if_icmpge -> 637
    //   624: aload_1
    //   625: aload #9
    //   627: iload #4
    //   629: iconst_3
    //   630: invokevirtual a : (Lnet/time4j/d1/p;II)Lnet/time4j/e1/a0/c$d;
    //   633: pop
    //   634: goto -> 1008
    //   637: iload #4
    //   639: iconst_3
    //   640: if_icmpne -> 646
    //   643: goto -> 469
    //   646: new java/lang/StringBuilder
    //   649: dup
    //   650: invokespecial <init> : ()V
    //   653: astore_1
    //   654: aload_1
    //   655: ldc 'Too many pattern letters (D): '
    //   657: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   660: pop
    //   661: aload_1
    //   662: iload #4
    //   664: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   667: pop
    //   668: new java/lang/IllegalArgumentException
    //   671: dup
    //   672: aload_1
    //   673: invokevirtual toString : ()Ljava/lang/String;
    //   676: invokespecial <init> : (Ljava/lang/String;)V
    //   679: athrow
    //   680: aload #5
    //   682: invokevirtual getLanguage : ()Ljava/lang/String;
    //   685: ldc 'am'
    //   687: invokevirtual equals : (Ljava/lang/Object;)Z
    //   690: ifeq -> 720
    //   693: aload_2
    //   694: invokestatic b : (Lnet/time4j/d1/x;)Ljava/lang/String;
    //   697: ldc_w 'ethiopic'
    //   700: invokevirtual equals : (Ljava/lang/Object;)Z
    //   703: ifeq -> 720
    //   706: aload_1
    //   707: getstatic net/time4j/e1/a.l : Lnet/time4j/d1/c;
    //   710: getstatic net/time4j/e1/j.i : Lnet/time4j/e1/j;
    //   713: invokevirtual a : (Lnet/time4j/d1/c;Ljava/lang/Enum;)Lnet/time4j/e1/a0/c$d;
    //   716: pop
    //   717: goto -> 723
    //   720: iconst_0
    //   721: istore #6
    //   723: iload #4
    //   725: iconst_2
    //   726: if_icmpne -> 739
    //   729: aload_1
    //   730: aload #9
    //   732: invokevirtual b : (Lnet/time4j/d1/p;)Lnet/time4j/e1/a0/c$d;
    //   735: pop
    //   736: goto -> 749
    //   739: aload_1
    //   740: aload #9
    //   742: iload #4
    //   744: iconst_0
    //   745: invokevirtual a : (Lnet/time4j/d1/p;IZ)Lnet/time4j/e1/a0/c$d;
    //   748: pop
    //   749: iload #6
    //   751: ifeq -> 1008
    //   754: goto -> 1003
    //   757: aload_1
    //   758: getstatic net/time4j/e1/a.l : Lnet/time4j/d1/c;
    //   761: getstatic net/time4j/e1/j.c : Lnet/time4j/e1/j;
    //   764: invokevirtual a : (Lnet/time4j/d1/c;Ljava/lang/Enum;)Lnet/time4j/e1/a0/c$d;
    //   767: pop
    //   768: aload_1
    //   769: getstatic net/time4j/e1/a.m : Lnet/time4j/d1/c;
    //   772: bipush #48
    //   774: invokevirtual a : (Lnet/time4j/d1/c;C)Lnet/time4j/e1/a0/c$d;
    //   777: pop
    //   778: aload_1
    //   779: aload #9
    //   781: iload #4
    //   783: iconst_1
    //   784: invokevirtual a : (Lnet/time4j/d1/p;IZ)Lnet/time4j/e1/a0/c$d;
    //   787: pop
    //   788: aload_1
    //   789: invokevirtual i : ()Lnet/time4j/e1/a0/c$d;
    //   792: pop
    //   793: goto -> 1003
    //   796: iload #4
    //   798: iconst_1
    //   799: if_icmpne -> 813
    //   802: aload_1
    //   803: aload #9
    //   805: iconst_1
    //   806: invokevirtual a : (Lnet/time4j/d1/p;I)Lnet/time4j/e1/a0/c$d;
    //   809: pop
    //   810: goto -> 1008
    //   813: new java/lang/StringBuilder
    //   816: dup
    //   817: invokespecial <init> : ()V
    //   820: astore_1
    //   821: aload_1
    //   822: ldc_w 'Too many pattern letters (W): '
    //   825: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   828: pop
    //   829: aload_1
    //   830: iload #4
    //   832: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   835: pop
    //   836: new java/lang/IllegalArgumentException
    //   839: dup
    //   840: aload_1
    //   841: invokevirtual toString : ()Ljava/lang/String;
    //   844: invokespecial <init> : (Ljava/lang/String;)V
    //   847: athrow
    //   848: aload #8
    //   850: ifnull -> 915
    //   853: iload #4
    //   855: iconst_3
    //   856: if_icmpgt -> 862
    //   859: goto -> 521
    //   862: iload #4
    //   864: iconst_4
    //   865: if_icmpne -> 871
    //   868: goto -> 534
    //   871: iload #4
    //   873: iconst_5
    //   874: if_icmpne -> 880
    //   877: goto -> 547
    //   880: new java/lang/StringBuilder
    //   883: dup
    //   884: invokespecial <init> : ()V
    //   887: astore_1
    //   888: aload_1
    //   889: ldc_w 'Too many pattern letters (U): '
    //   892: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   895: pop
    //   896: aload_1
    //   897: iload #4
    //   899: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   902: pop
    //   903: new java/lang/IllegalArgumentException
    //   906: dup
    //   907: aload_1
    //   908: invokevirtual toString : ()Ljava/lang/String;
    //   911: invokespecial <init> : (Ljava/lang/String;)V
    //   914: athrow
    //   915: new java/lang/StringBuilder
    //   918: dup
    //   919: invokespecial <init> : ()V
    //   922: astore_1
    //   923: aload_1
    //   924: ldc_w 'Implementation error: '
    //   927: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   930: pop
    //   931: aload_1
    //   932: aload #11
    //   934: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   937: pop
    //   938: aload_1
    //   939: ldc_w ' in "'
    //   942: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   945: pop
    //   946: aload_1
    //   947: aload #10
    //   949: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   952: pop
    //   953: aload_1
    //   954: ldc_w '"'
    //   957: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   960: pop
    //   961: new java/lang/IllegalStateException
    //   964: dup
    //   965: aload_1
    //   966: invokevirtual toString : ()Ljava/lang/String;
    //   969: invokespecial <init> : (Ljava/lang/String;)V
    //   972: athrow
    //   973: aload_1
    //   974: iload #4
    //   976: aload #8
    //   978: invokestatic a : (Lnet/time4j/e1/a0/c$d;ILnet/time4j/e1/u;)V
    //   981: goto -> 1008
    //   984: aload_1
    //   985: getstatic net/time4j/e1/a.h : Lnet/time4j/d1/c;
    //   988: getstatic net/time4j/e1/m.d : Lnet/time4j/e1/m;
    //   991: invokevirtual a : (Lnet/time4j/d1/c;Ljava/lang/Enum;)Lnet/time4j/e1/a0/c$d;
    //   994: pop
    //   995: aload_1
    //   996: iload #4
    //   998: aload #8
    //   1000: invokestatic a : (Lnet/time4j/e1/a0/c$d;ILnet/time4j/e1/u;)V
    //   1003: aload_1
    //   1004: invokevirtual i : ()Lnet/time4j/e1/a0/c$d;
    //   1007: pop
    //   1008: invokestatic emptyMap : ()Ljava/util/Map;
    //   1011: areturn
    //   1012: new java/lang/StringBuilder
    //   1015: dup
    //   1016: invokespecial <init> : ()V
    //   1019: astore_1
    //   1020: aload_1
    //   1021: ldc_w 'Implementation error: '
    //   1024: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1027: pop
    //   1028: aload_1
    //   1029: aload #11
    //   1031: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1034: pop
    //   1035: aload_1
    //   1036: ldc_w ' in "'
    //   1039: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1042: pop
    //   1043: aload_1
    //   1044: aload #10
    //   1046: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1049: pop
    //   1050: aload_1
    //   1051: ldc_w '"'
    //   1054: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1057: pop
    //   1058: new java/lang/IllegalStateException
    //   1061: dup
    //   1062: aload_1
    //   1063: invokevirtual toString : ()Ljava/lang/String;
    //   1066: invokespecial <init> : (Ljava/lang/String;)V
    //   1069: astore_1
    //   1070: goto -> 1075
    //   1073: aload_1
    //   1074: athrow
    //   1075: goto -> 1073
  }
  
  private Map<p<?>, p<?>> a(c.d<?> paramd, x<?> paramx, Locale paramLocale, char paramChar, int paramInt) {
    if (paramChar != 'B' && paramChar != 'O' && paramChar != 'Q') {
      StringBuilder stringBuilder1;
      if (paramChar != 'S') {
        if (paramChar != 'Z') {
          if (paramChar != 'e' && paramChar != 'g')
            if (paramChar != 'u') {
              if (paramChar != 'x' && paramChar != 'b' && paramChar != 'c' && paramChar != 'q' && paramChar != 'r') {
                c c;
                switch (paramChar) {
                  default:
                    return a(paramd, paramx, paramLocale, paramChar, paramInt, true);
                  case 'X':
                    if (paramInt < 4)
                      return a(paramd, paramx, paramLocale, 'X', paramInt, true); 
                    stringBuilder1 = new StringBuilder();
                    stringBuilder1.append("Too many pattern letters (X): ");
                    stringBuilder1.append(paramInt);
                    throw new IllegalArgumentException(stringBuilder1.toString());
                  case 'W':
                    c = y0.a(paramLocale).a();
                    stringBuilder1.a((p<Integer>)c, paramInt);
                  case 'U':
                  case 'V':
                    break;
                } 
              } 
            } else {
              stringBuilder1.b((p)f0.x, paramInt);
              return Collections.emptyMap();
            }  
        } else {
          a((c.d<?>)stringBuilder1, paramChar, 2, false);
          return Collections.emptyMap();
        } 
      } else {
        j0 j0 = g0.C;
        stringBuilder1.a((p<Integer>)j0, paramInt);
      } 
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("CLDR pattern symbol not supported in SimpleDateFormat-style: ");
    stringBuilder.append(paramChar);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  private Map<p<?>, p<?>> a(c.d<?> paramd, x<?> paramx, Locale paramLocale, char paramChar, int paramInt, boolean paramBoolean) {
    // Byte code:
    //   0: iconst_4
    //   1: istore #7
    //   3: iload #4
    //   5: tableswitch default -> 252, 65 -> 1753, 66 -> 1725, 67 -> 252, 68 -> 1650, 69 -> 1538, 70 -> 1475, 71 -> 1281, 72 -> 1263, 73 -> 252, 74 -> 252, 75 -> 1256, 76 -> 1219, 77 -> 1193, 78 -> 252, 79 -> 1130, 80 -> 252, 81 -> 1121, 82 -> 252, 83 -> 1105, 84 -> 252, 85 -> 252, 86 -> 1043, 87 -> 986, 88 -> 974, 89 -> 941, 90 -> 849, 91 -> 252, 92 -> 252, 93 -> 252, 94 -> 252, 95 -> 252, 96 -> 252, 97 -> 755, 98 -> 732, 99 -> 666, 100 -> 659, 101 -> 619, 102 -> 252, 103 -> 601, 104 -> 594, 105 -> 252, 106 -> 252, 107 -> 587, 108 -> 252, 109 -> 580, 110 -> 252, 111 -> 252, 112 -> 252, 113 -> 560, 114 -> 520, 115 -> 513, 116 -> 252, 117 -> 499, 118 -> 252, 119 -> 382, 120 -> 370, 121 -> 355, 122 -> 286
    //   252: new java/lang/StringBuilder
    //   255: dup
    //   256: invokespecial <init> : ()V
    //   259: astore_1
    //   260: aload_1
    //   261: ldc 'Unsupported pattern symbol: '
    //   263: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   266: pop
    //   267: aload_1
    //   268: iload #4
    //   270: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   273: pop
    //   274: new java/lang/IllegalArgumentException
    //   277: dup
    //   278: aload_1
    //   279: invokevirtual toString : ()Ljava/lang/String;
    //   282: invokespecial <init> : (Ljava/lang/String;)V
    //   285: athrow
    //   286: iload #5
    //   288: iconst_4
    //   289: if_icmpge -> 1773
    //   292: aload_1
    //   293: invokevirtual f : ()Lnet/time4j/e1/a0/c$d;
    //   296: pop
    //   297: goto -> 1765
    //   300: new java/lang/StringBuilder
    //   303: dup
    //   304: invokespecial <init> : ()V
    //   307: astore_1
    //   308: aload_1
    //   309: ldc_w 'Too many pattern letters (z): '
    //   312: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   315: pop
    //   316: aload_1
    //   317: iload #5
    //   319: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   322: pop
    //   323: new java/lang/IllegalArgumentException
    //   326: dup
    //   327: aload_1
    //   328: invokevirtual toString : ()Ljava/lang/String;
    //   331: invokespecial <init> : (Ljava/lang/String;)V
    //   334: athrow
    //   335: aload_1
    //   336: invokevirtual d : ()Lnet/time4j/e1/a0/c$d;
    //   339: pop
    //   340: goto -> 1765
    //   343: new java/lang/IllegalArgumentException
    //   346: dup
    //   347: aload_1
    //   348: invokevirtual getMessage : ()Ljava/lang/String;
    //   351: invokespecial <init> : (Ljava/lang/String;)V
    //   354: athrow
    //   355: getstatic net/time4j/f0.r : Lnet/time4j/c;
    //   358: astore_3
    //   359: aload_3
    //   360: astore_2
    //   361: iload #5
    //   363: iconst_2
    //   364: if_icmpne -> 962
    //   367: goto -> 953
    //   370: aload_1
    //   371: iload #4
    //   373: iload #5
    //   375: iconst_0
    //   376: invokestatic a : (Lnet/time4j/e1/a0/c$d;CIZ)V
    //   379: goto -> 1765
    //   382: iload #5
    //   384: iconst_2
    //   385: if_icmpgt -> 464
    //   388: aload_3
    //   389: invokestatic a : (Ljava/util/Locale;)Lnet/time4j/y0;
    //   392: invokevirtual j : ()Lnet/time4j/c;
    //   395: astore_3
    //   396: aload_2
    //   397: invokevirtual g : ()Ljava/util/Set;
    //   400: invokeinterface iterator : ()Ljava/util/Iterator;
    //   405: astore #8
    //   407: aload_3
    //   408: astore_2
    //   409: aload #8
    //   411: invokeinterface hasNext : ()Z
    //   416: ifeq -> 1267
    //   419: aload #8
    //   421: invokeinterface next : ()Ljava/lang/Object;
    //   426: checkcast net/time4j/d1/p
    //   429: astore_2
    //   430: aload_2
    //   431: invokeinterface a : ()C
    //   436: iload #4
    //   438: if_icmpne -> 407
    //   441: aload_2
    //   442: getstatic net/time4j/y0.n : Lnet/time4j/y0;
    //   445: invokevirtual j : ()Lnet/time4j/c;
    //   448: invokevirtual equals : (Ljava/lang/Object;)Z
    //   451: ifeq -> 407
    //   454: getstatic net/time4j/y0.n : Lnet/time4j/y0;
    //   457: invokevirtual j : ()Lnet/time4j/c;
    //   460: astore_2
    //   461: goto -> 1267
    //   464: new java/lang/StringBuilder
    //   467: dup
    //   468: invokespecial <init> : ()V
    //   471: astore_1
    //   472: aload_1
    //   473: ldc_w 'Too many pattern letters (w): '
    //   476: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   479: pop
    //   480: aload_1
    //   481: iload #5
    //   483: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   486: pop
    //   487: new java/lang/IllegalArgumentException
    //   490: dup
    //   491: aload_1
    //   492: invokevirtual toString : ()Ljava/lang/String;
    //   495: invokespecial <init> : (Ljava/lang/String;)V
    //   498: athrow
    //   499: aload_1
    //   500: getstatic net/time4j/f0.r : Lnet/time4j/c;
    //   503: iload #5
    //   505: iconst_1
    //   506: invokevirtual a : (Lnet/time4j/d1/p;IZ)Lnet/time4j/e1/a0/c$d;
    //   509: pop
    //   510: goto -> 1765
    //   513: getstatic net/time4j/g0.A : Lnet/time4j/j0;
    //   516: astore_2
    //   517: goto -> 1267
    //   520: aload_1
    //   521: getstatic net/time4j/e1/a.l : Lnet/time4j/d1/c;
    //   524: getstatic net/time4j/e1/j.c : Lnet/time4j/e1/j;
    //   527: invokevirtual a : (Lnet/time4j/d1/c;Ljava/lang/Enum;)Lnet/time4j/e1/a0/c$d;
    //   530: pop
    //   531: aload_1
    //   532: getstatic net/time4j/e1/a.m : Lnet/time4j/d1/c;
    //   535: bipush #48
    //   537: invokevirtual a : (Lnet/time4j/d1/c;C)Lnet/time4j/e1/a0/c$d;
    //   540: pop
    //   541: aload_1
    //   542: getstatic net/time4j/f0.r : Lnet/time4j/c;
    //   545: iload #5
    //   547: iconst_1
    //   548: invokevirtual a : (Lnet/time4j/d1/p;IZ)Lnet/time4j/e1/a0/c$d;
    //   551: pop
    //   552: aload_1
    //   553: invokevirtual i : ()Lnet/time4j/e1/a0/c$d;
    //   556: pop
    //   557: goto -> 1745
    //   560: aload_1
    //   561: getstatic net/time4j/e1/a.h : Lnet/time4j/d1/c;
    //   564: getstatic net/time4j/e1/m.d : Lnet/time4j/e1/m;
    //   567: invokevirtual a : (Lnet/time4j/d1/c;Ljava/lang/Enum;)Lnet/time4j/e1/a0/c$d;
    //   570: pop
    //   571: aload_1
    //   572: iload #5
    //   574: invokestatic b : (Lnet/time4j/e1/a0/c$d;I)V
    //   577: goto -> 1745
    //   580: getstatic net/time4j/g0.y : Lnet/time4j/j0;
    //   583: astore_2
    //   584: goto -> 1267
    //   587: getstatic net/time4j/g0.u : Lnet/time4j/c;
    //   590: astore_2
    //   591: goto -> 1267
    //   594: getstatic net/time4j/g0.t : Lnet/time4j/c;
    //   597: astore_2
    //   598: goto -> 1267
    //   601: aload_1
    //   602: getstatic net/time4j/d1/a0.e : Lnet/time4j/d1/a0;
    //   605: iload #5
    //   607: bipush #18
    //   609: getstatic net/time4j/e1/a0/x.d : Lnet/time4j/e1/a0/x;
    //   612: invokevirtual b : (Lnet/time4j/d1/p;IILnet/time4j/e1/a0/x;)Lnet/time4j/e1/a0/c$d;
    //   615: pop
    //   616: goto -> 1765
    //   619: iload #5
    //   621: iconst_2
    //   622: if_icmpgt -> 642
    //   625: aload_1
    //   626: aload_3
    //   627: invokestatic a : (Ljava/util/Locale;)Lnet/time4j/y0;
    //   630: invokevirtual h : ()Lnet/time4j/c0;
    //   633: iload #5
    //   635: invokevirtual b : (Lnet/time4j/d1/p;I)Lnet/time4j/e1/a0/c$d;
    //   638: pop
    //   639: goto -> 1765
    //   642: aload_0
    //   643: aload_1
    //   644: aload_2
    //   645: aload_3
    //   646: bipush #69
    //   648: iload #5
    //   650: iload #6
    //   652: invokespecial a : (Lnet/time4j/e1/a0/c$d;Lnet/time4j/d1/x;Ljava/util/Locale;CIZ)Ljava/util/Map;
    //   655: pop
    //   656: goto -> 1765
    //   659: getstatic net/time4j/f0.w : Lnet/time4j/j0;
    //   662: astore_2
    //   663: goto -> 1267
    //   666: iload #5
    //   668: iconst_2
    //   669: if_icmpeq -> 722
    //   672: aload_1
    //   673: getstatic net/time4j/e1/a.h : Lnet/time4j/d1/c;
    //   676: getstatic net/time4j/e1/m.d : Lnet/time4j/e1/m;
    //   679: invokevirtual a : (Lnet/time4j/d1/c;Ljava/lang/Enum;)Lnet/time4j/e1/a0/c$d;
    //   682: pop
    //   683: iload #5
    //   685: iconst_1
    //   686: if_icmpne -> 705
    //   689: aload_1
    //   690: aload_3
    //   691: invokestatic a : (Ljava/util/Locale;)Lnet/time4j/y0;
    //   694: invokevirtual h : ()Lnet/time4j/c0;
    //   697: iconst_1
    //   698: invokevirtual b : (Lnet/time4j/d1/p;I)Lnet/time4j/e1/a0/c$d;
    //   701: pop
    //   702: goto -> 1745
    //   705: aload_0
    //   706: aload_1
    //   707: aload_2
    //   708: aload_3
    //   709: bipush #69
    //   711: iload #5
    //   713: iload #6
    //   715: invokespecial a : (Lnet/time4j/e1/a0/c$d;Lnet/time4j/d1/x;Ljava/util/Locale;CIZ)Ljava/util/Map;
    //   718: pop
    //   719: goto -> 1745
    //   722: new java/lang/IllegalArgumentException
    //   725: dup
    //   726: ldc 'Invalid pattern count of 2 for symbol 'c'.'
    //   728: invokespecial <init> : (Ljava/lang/String;)V
    //   731: athrow
    //   732: iload #5
    //   734: invokestatic f : (I)Lnet/time4j/e1/w;
    //   737: astore_2
    //   738: aload_1
    //   739: getstatic net/time4j/e1/a.g : Lnet/time4j/d1/c;
    //   742: aload_2
    //   743: invokevirtual a : (Lnet/time4j/d1/c;Ljava/lang/Enum;)Lnet/time4j/e1/a0/c$d;
    //   746: pop
    //   747: aload_1
    //   748: invokevirtual b : ()Lnet/time4j/e1/a0/c$d;
    //   751: pop
    //   752: goto -> 1745
    //   755: iload #6
    //   757: ifeq -> 767
    //   760: getstatic net/time4j/e1/w.d : Lnet/time4j/e1/w;
    //   763: astore_3
    //   764: goto -> 773
    //   767: iload #5
    //   769: invokestatic f : (I)Lnet/time4j/e1/w;
    //   772: astore_3
    //   773: aload_1
    //   774: getstatic net/time4j/e1/a.g : Lnet/time4j/d1/c;
    //   777: aload_3
    //   778: invokevirtual a : (Lnet/time4j/d1/c;Ljava/lang/Enum;)Lnet/time4j/e1/a0/c$d;
    //   781: pop
    //   782: aload_1
    //   783: getstatic net/time4j/g0.s : Lnet/time4j/b1;
    //   786: invokevirtual a : (Lnet/time4j/d1/p;)Lnet/time4j/e1/a0/c$d;
    //   789: pop
    //   790: aload_1
    //   791: invokevirtual i : ()Lnet/time4j/e1/a0/c$d;
    //   794: pop
    //   795: aload_2
    //   796: invokestatic b : (Lnet/time4j/d1/x;)Ljava/lang/String;
    //   799: ldc_w 'ethiopic'
    //   802: invokevirtual equals : (Ljava/lang/Object;)Z
    //   805: ifeq -> 1765
    //   808: aload_2
    //   809: invokestatic a : (Lnet/time4j/d1/x;)Lnet/time4j/d1/p;
    //   812: astore_1
    //   813: aload_1
    //   814: ifnull -> 838
    //   817: new java/util/HashMap
    //   820: dup
    //   821: invokespecial <init> : ()V
    //   824: astore_2
    //   825: aload_2
    //   826: aload_1
    //   827: getstatic net/time4j/g0.t : Lnet/time4j/c;
    //   830: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   835: pop
    //   836: aload_2
    //   837: areturn
    //   838: new java/lang/IllegalArgumentException
    //   841: dup
    //   842: ldc_w 'Ethiopian time not available.'
    //   845: invokespecial <init> : (Ljava/lang/String;)V
    //   848: athrow
    //   849: iload #5
    //   851: iconst_4
    //   852: if_icmpge -> 873
    //   855: aload_1
    //   856: getstatic net/time4j/e1/e.e : Lnet/time4j/e1/e;
    //   859: iconst_0
    //   860: ldc_w '+0000'
    //   863: invokestatic singletonList : (Ljava/lang/Object;)Ljava/util/List;
    //   866: invokevirtual a : (Lnet/time4j/e1/e;ZLjava/util/List;)Lnet/time4j/e1/a0/c$d;
    //   869: pop
    //   870: goto -> 1765
    //   873: iload #5
    //   875: iconst_4
    //   876: if_icmpne -> 882
    //   879: goto -> 1150
    //   882: iload #5
    //   884: iconst_5
    //   885: if_icmpne -> 906
    //   888: aload_1
    //   889: getstatic net/time4j/e1/e.e : Lnet/time4j/e1/e;
    //   892: iconst_1
    //   893: ldc_w 'Z'
    //   896: invokestatic singletonList : (Ljava/lang/Object;)Ljava/util/List;
    //   899: invokevirtual a : (Lnet/time4j/e1/e;ZLjava/util/List;)Lnet/time4j/e1/a0/c$d;
    //   902: pop
    //   903: goto -> 1765
    //   906: new java/lang/StringBuilder
    //   909: dup
    //   910: invokespecial <init> : ()V
    //   913: astore_1
    //   914: aload_1
    //   915: ldc_w 'Too many pattern letters (Z): '
    //   918: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   921: pop
    //   922: aload_1
    //   923: iload #5
    //   925: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   928: pop
    //   929: new java/lang/IllegalArgumentException
    //   932: dup
    //   933: aload_1
    //   934: invokevirtual toString : ()Ljava/lang/String;
    //   937: invokespecial <init> : (Ljava/lang/String;)V
    //   940: athrow
    //   941: getstatic net/time4j/f0.s : Lnet/time4j/c;
    //   944: astore_3
    //   945: aload_3
    //   946: astore_2
    //   947: iload #5
    //   949: iconst_2
    //   950: if_icmpne -> 962
    //   953: aload_1
    //   954: aload_3
    //   955: invokevirtual b : (Lnet/time4j/d1/p;)Lnet/time4j/e1/a0/c$d;
    //   958: pop
    //   959: goto -> 1765
    //   962: aload_1
    //   963: aload_2
    //   964: iload #5
    //   966: iconst_0
    //   967: invokevirtual a : (Lnet/time4j/d1/p;IZ)Lnet/time4j/e1/a0/c$d;
    //   970: pop
    //   971: goto -> 1765
    //   974: aload_1
    //   975: iload #4
    //   977: iload #5
    //   979: iconst_1
    //   980: invokestatic a : (Lnet/time4j/e1/a0/c$d;CIZ)V
    //   983: goto -> 1765
    //   986: iload #5
    //   988: iconst_1
    //   989: if_icmpne -> 1008
    //   992: aload_1
    //   993: aload_3
    //   994: invokestatic a : (Ljava/util/Locale;)Lnet/time4j/y0;
    //   997: invokevirtual i : ()Lnet/time4j/c;
    //   1000: iconst_1
    //   1001: invokevirtual a : (Lnet/time4j/d1/p;I)Lnet/time4j/e1/a0/c$d;
    //   1004: pop
    //   1005: goto -> 1765
    //   1008: new java/lang/StringBuilder
    //   1011: dup
    //   1012: invokespecial <init> : ()V
    //   1015: astore_1
    //   1016: aload_1
    //   1017: ldc_w 'Too many pattern letters (W): '
    //   1020: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1023: pop
    //   1024: aload_1
    //   1025: iload #5
    //   1027: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1030: pop
    //   1031: new java/lang/IllegalArgumentException
    //   1034: dup
    //   1035: aload_1
    //   1036: invokevirtual toString : ()Ljava/lang/String;
    //   1039: invokespecial <init> : (Ljava/lang/String;)V
    //   1042: athrow
    //   1043: iload #5
    //   1045: iconst_2
    //   1046: if_icmpne -> 1070
    //   1049: aload_1
    //   1050: invokevirtual g : ()Lnet/time4j/e1/a0/c$d;
    //   1053: pop
    //   1054: goto -> 1765
    //   1057: astore_1
    //   1058: new java/lang/IllegalArgumentException
    //   1061: dup
    //   1062: aload_1
    //   1063: invokevirtual getMessage : ()Ljava/lang/String;
    //   1066: invokespecial <init> : (Ljava/lang/String;)V
    //   1069: athrow
    //   1070: new java/lang/StringBuilder
    //   1073: dup
    //   1074: invokespecial <init> : ()V
    //   1077: astore_1
    //   1078: aload_1
    //   1079: ldc_w 'Count of pattern letters is not 2: '
    //   1082: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1085: pop
    //   1086: aload_1
    //   1087: iload #5
    //   1089: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1092: pop
    //   1093: new java/lang/IllegalArgumentException
    //   1096: dup
    //   1097: aload_1
    //   1098: invokevirtual toString : ()Ljava/lang/String;
    //   1101: invokespecial <init> : (Ljava/lang/String;)V
    //   1104: athrow
    //   1105: aload_1
    //   1106: getstatic net/time4j/g0.E : Lnet/time4j/j0;
    //   1109: iload #5
    //   1111: iload #5
    //   1113: iconst_0
    //   1114: invokevirtual a : (Lnet/time4j/d1/p;IIZ)Lnet/time4j/e1/a0/c$d;
    //   1117: pop
    //   1118: goto -> 1765
    //   1121: aload_1
    //   1122: iload #5
    //   1124: invokestatic b : (Lnet/time4j/e1/a0/c$d;I)V
    //   1127: goto -> 1765
    //   1130: iload #5
    //   1132: iconst_1
    //   1133: if_icmpne -> 1144
    //   1136: aload_1
    //   1137: invokevirtual e : ()Lnet/time4j/e1/a0/c$d;
    //   1140: pop
    //   1141: goto -> 1765
    //   1144: iload #5
    //   1146: iconst_4
    //   1147: if_icmpne -> 1158
    //   1150: aload_1
    //   1151: invokevirtual c : ()Lnet/time4j/e1/a0/c$d;
    //   1154: pop
    //   1155: goto -> 1765
    //   1158: new java/lang/StringBuilder
    //   1161: dup
    //   1162: invokespecial <init> : ()V
    //   1165: astore_1
    //   1166: aload_1
    //   1167: ldc_w 'Count of pattern letters is not 1 or 4: '
    //   1170: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1173: pop
    //   1174: aload_1
    //   1175: iload #5
    //   1177: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1180: pop
    //   1181: new java/lang/IllegalArgumentException
    //   1184: dup
    //   1185: aload_1
    //   1186: invokevirtual toString : ()Ljava/lang/String;
    //   1189: invokespecial <init> : (Ljava/lang/String;)V
    //   1192: athrow
    //   1193: iload #6
    //   1195: ifeq -> 1201
    //   1198: goto -> 1205
    //   1201: iload #5
    //   1203: istore #7
    //   1205: aload_1
    //   1206: iload #5
    //   1208: iload #7
    //   1210: invokestatic min : (II)I
    //   1213: invokestatic a : (Lnet/time4j/e1/a0/c$d;I)V
    //   1216: goto -> 1765
    //   1219: aload_1
    //   1220: getstatic net/time4j/e1/a.h : Lnet/time4j/d1/c;
    //   1223: getstatic net/time4j/e1/m.d : Lnet/time4j/e1/m;
    //   1226: invokevirtual a : (Lnet/time4j/d1/c;Ljava/lang/Enum;)Lnet/time4j/e1/a0/c$d;
    //   1229: pop
    //   1230: iload #6
    //   1232: ifeq -> 1238
    //   1235: goto -> 1242
    //   1238: iload #5
    //   1240: istore #7
    //   1242: aload_1
    //   1243: iload #5
    //   1245: iload #7
    //   1247: invokestatic min : (II)I
    //   1250: invokestatic a : (Lnet/time4j/e1/a0/c$d;I)V
    //   1253: goto -> 1745
    //   1256: getstatic net/time4j/g0.v : Lnet/time4j/j0;
    //   1259: astore_2
    //   1260: goto -> 1267
    //   1263: getstatic net/time4j/g0.w : Lnet/time4j/j0;
    //   1266: astore_2
    //   1267: aload_2
    //   1268: iload #4
    //   1270: aload_1
    //   1271: iload #5
    //   1273: iload #6
    //   1275: invokestatic a : (Lnet/time4j/d1/p;CLnet/time4j/e1/a0/c$d;IZ)V
    //   1278: goto -> 1765
    //   1281: iload #5
    //   1283: iconst_3
    //   1284: if_icmpgt -> 1294
    //   1287: getstatic net/time4j/e1/w.d : Lnet/time4j/e1/w;
    //   1290: astore_2
    //   1291: goto -> 1359
    //   1294: iload #5
    //   1296: iconst_4
    //   1297: if_icmpeq -> 1355
    //   1300: iload #6
    //   1302: ifeq -> 1308
    //   1305: goto -> 1355
    //   1308: iload #5
    //   1310: iconst_5
    //   1311: if_icmpne -> 1321
    //   1314: getstatic net/time4j/e1/w.f : Lnet/time4j/e1/w;
    //   1317: astore_2
    //   1318: goto -> 1359
    //   1321: new java/lang/StringBuilder
    //   1324: dup
    //   1325: invokespecial <init> : ()V
    //   1328: astore_1
    //   1329: aload_1
    //   1330: ldc 'Too many pattern letters (G): '
    //   1332: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1335: pop
    //   1336: aload_1
    //   1337: iload #5
    //   1339: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1342: pop
    //   1343: new java/lang/IllegalArgumentException
    //   1346: dup
    //   1347: aload_1
    //   1348: invokevirtual toString : ()Ljava/lang/String;
    //   1351: invokespecial <init> : (Ljava/lang/String;)V
    //   1354: athrow
    //   1355: getstatic net/time4j/e1/w.c : Lnet/time4j/e1/w;
    //   1358: astore_2
    //   1359: aload_1
    //   1360: getstatic net/time4j/e1/a.g : Lnet/time4j/d1/c;
    //   1363: aload_2
    //   1364: invokevirtual a : (Lnet/time4j/d1/c;Ljava/lang/Enum;)Lnet/time4j/e1/a0/c$d;
    //   1367: pop
    //   1368: aload_3
    //   1369: invokestatic a : (Ljava/util/Locale;)Lnet/time4j/history/d;
    //   1372: astore_2
    //   1373: aload_1
    //   1374: ldc net/time4j/e1/u
    //   1376: aload_2
    //   1377: invokevirtual e : ()Lnet/time4j/d1/p;
    //   1380: invokevirtual cast : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1383: checkcast net/time4j/e1/u
    //   1386: invokevirtual a : (Lnet/time4j/e1/u;)Lnet/time4j/e1/a0/c$d;
    //   1389: pop
    //   1390: aload_1
    //   1391: invokevirtual i : ()Lnet/time4j/e1/a0/c$d;
    //   1394: pop
    //   1395: new java/util/HashMap
    //   1398: dup
    //   1399: invokespecial <init> : ()V
    //   1402: astore_1
    //   1403: aload_1
    //   1404: getstatic net/time4j/f0.r : Lnet/time4j/c;
    //   1407: aload_2
    //   1408: invokevirtual q : ()Lnet/time4j/e1/u;
    //   1411: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1416: pop
    //   1417: aload_1
    //   1418: getstatic net/time4j/f0.u : Lnet/time4j/c0;
    //   1421: aload_2
    //   1422: invokevirtual p : ()Lnet/time4j/e1/u;
    //   1425: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1430: pop
    //   1431: aload_1
    //   1432: getstatic net/time4j/f0.v : Lnet/time4j/j0;
    //   1435: aload_2
    //   1436: invokevirtual p : ()Lnet/time4j/e1/u;
    //   1439: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1444: pop
    //   1445: aload_1
    //   1446: getstatic net/time4j/f0.w : Lnet/time4j/j0;
    //   1449: aload_2
    //   1450: invokevirtual c : ()Lnet/time4j/d1/p;
    //   1453: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1458: pop
    //   1459: aload_1
    //   1460: getstatic net/time4j/f0.y : Lnet/time4j/j0;
    //   1463: aload_2
    //   1464: invokevirtual d : ()Lnet/time4j/d1/p;
    //   1467: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1472: pop
    //   1473: aload_1
    //   1474: areturn
    //   1475: iload #5
    //   1477: iconst_1
    //   1478: if_icmpeq -> 1523
    //   1481: iload #6
    //   1483: ifeq -> 1489
    //   1486: goto -> 1523
    //   1489: new java/lang/StringBuilder
    //   1492: dup
    //   1493: invokespecial <init> : ()V
    //   1496: astore_1
    //   1497: aload_1
    //   1498: ldc 'Too many pattern letters (F): '
    //   1500: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1503: pop
    //   1504: aload_1
    //   1505: iload #5
    //   1507: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1510: pop
    //   1511: new java/lang/IllegalArgumentException
    //   1514: dup
    //   1515: aload_1
    //   1516: invokevirtual toString : ()Ljava/lang/String;
    //   1519: invokespecial <init> : (Ljava/lang/String;)V
    //   1522: athrow
    //   1523: getstatic net/time4j/f0.A : Lnet/time4j/d0;
    //   1526: astore_2
    //   1527: aload_1
    //   1528: aload_2
    //   1529: iload #5
    //   1531: invokevirtual a : (Lnet/time4j/d1/p;I)Lnet/time4j/e1/a0/c$d;
    //   1534: pop
    //   1535: goto -> 1765
    //   1538: iload #5
    //   1540: iconst_3
    //   1541: if_icmpgt -> 1551
    //   1544: getstatic net/time4j/e1/w.d : Lnet/time4j/e1/w;
    //   1547: astore_2
    //   1548: goto -> 1630
    //   1551: iload #5
    //   1553: iconst_4
    //   1554: if_icmpeq -> 1626
    //   1557: iload #6
    //   1559: ifeq -> 1565
    //   1562: goto -> 1626
    //   1565: iload #5
    //   1567: iconst_5
    //   1568: if_icmpne -> 1578
    //   1571: getstatic net/time4j/e1/w.f : Lnet/time4j/e1/w;
    //   1574: astore_2
    //   1575: goto -> 1630
    //   1578: iload #5
    //   1580: bipush #6
    //   1582: if_icmpne -> 1592
    //   1585: getstatic net/time4j/e1/w.e : Lnet/time4j/e1/w;
    //   1588: astore_2
    //   1589: goto -> 1630
    //   1592: new java/lang/StringBuilder
    //   1595: dup
    //   1596: invokespecial <init> : ()V
    //   1599: astore_1
    //   1600: aload_1
    //   1601: ldc 'Too many pattern letters (E): '
    //   1603: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1606: pop
    //   1607: aload_1
    //   1608: iload #5
    //   1610: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1613: pop
    //   1614: new java/lang/IllegalArgumentException
    //   1617: dup
    //   1618: aload_1
    //   1619: invokevirtual toString : ()Ljava/lang/String;
    //   1622: invokespecial <init> : (Ljava/lang/String;)V
    //   1625: athrow
    //   1626: getstatic net/time4j/e1/w.c : Lnet/time4j/e1/w;
    //   1629: astore_2
    //   1630: aload_1
    //   1631: getstatic net/time4j/e1/a.g : Lnet/time4j/d1/c;
    //   1634: aload_2
    //   1635: invokevirtual a : (Lnet/time4j/d1/c;Ljava/lang/Enum;)Lnet/time4j/e1/a0/c$d;
    //   1638: pop
    //   1639: aload_1
    //   1640: getstatic net/time4j/f0.x : Lnet/time4j/c0;
    //   1643: invokevirtual a : (Lnet/time4j/d1/p;)Lnet/time4j/e1/a0/c$d;
    //   1646: pop
    //   1647: goto -> 1745
    //   1650: iload #5
    //   1652: iconst_3
    //   1653: if_icmpge -> 1670
    //   1656: aload_1
    //   1657: getstatic net/time4j/f0.y : Lnet/time4j/j0;
    //   1660: iload #5
    //   1662: iconst_3
    //   1663: invokevirtual a : (Lnet/time4j/d1/p;II)Lnet/time4j/e1/a0/c$d;
    //   1666: pop
    //   1667: goto -> 1765
    //   1670: iload #5
    //   1672: iconst_3
    //   1673: if_icmpeq -> 1718
    //   1676: iload #6
    //   1678: ifeq -> 1684
    //   1681: goto -> 1718
    //   1684: new java/lang/StringBuilder
    //   1687: dup
    //   1688: invokespecial <init> : ()V
    //   1691: astore_1
    //   1692: aload_1
    //   1693: ldc 'Too many pattern letters (D): '
    //   1695: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1698: pop
    //   1699: aload_1
    //   1700: iload #5
    //   1702: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1705: pop
    //   1706: new java/lang/IllegalArgumentException
    //   1709: dup
    //   1710: aload_1
    //   1711: invokevirtual toString : ()Ljava/lang/String;
    //   1714: invokespecial <init> : (Ljava/lang/String;)V
    //   1717: athrow
    //   1718: getstatic net/time4j/f0.y : Lnet/time4j/j0;
    //   1721: astore_2
    //   1722: goto -> 1527
    //   1725: iload #5
    //   1727: invokestatic f : (I)Lnet/time4j/e1/w;
    //   1730: astore_2
    //   1731: aload_1
    //   1732: getstatic net/time4j/e1/a.g : Lnet/time4j/d1/c;
    //   1735: aload_2
    //   1736: invokevirtual a : (Lnet/time4j/d1/c;Ljava/lang/Enum;)Lnet/time4j/e1/a0/c$d;
    //   1739: pop
    //   1740: aload_1
    //   1741: invokevirtual a : ()Lnet/time4j/e1/a0/c$d;
    //   1744: pop
    //   1745: aload_1
    //   1746: invokevirtual i : ()Lnet/time4j/e1/a0/c$d;
    //   1749: pop
    //   1750: goto -> 1765
    //   1753: aload_1
    //   1754: getstatic net/time4j/g0.F : Lnet/time4j/j0;
    //   1757: iload #5
    //   1759: bipush #8
    //   1761: invokevirtual a : (Lnet/time4j/d1/p;II)Lnet/time4j/e1/a0/c$d;
    //   1764: pop
    //   1765: invokestatic emptyMap : ()Ljava/util/Map;
    //   1768: areturn
    //   1769: astore_1
    //   1770: goto -> 343
    //   1773: iload #5
    //   1775: iconst_4
    //   1776: if_icmpeq -> 335
    //   1779: iload #6
    //   1781: ifeq -> 300
    //   1784: goto -> 335
    // Exception table:
    //   from	to	target	type
    //   292	297	1769	java/lang/IllegalStateException
    //   300	335	1769	java/lang/IllegalStateException
    //   335	340	1769	java/lang/IllegalStateException
    //   1049	1054	1057	java/lang/IllegalStateException
  }
  
  private static Set<p<?>> a(x<?> paramx, char paramChar, Locale paramLocale) {
    if (paramChar == 'w' || paramChar == 'W' || paramChar == 'e' || paramChar == 'c') {
      Iterator<s> iterator = paramx.f().iterator();
      while (iterator.hasNext()) {
        for (p p : ((s)iterator.next()).a(paramLocale, (d)net.time4j.e1.a.a())) {
          if (((paramChar == 'e' || paramChar == 'c') && p.name().equals("LOCAL_DAY_OF_WEEK")) || (paramChar == 'w' && p.name().equals("WEEK_OF_YEAR")) || (paramChar == 'W' && p.name().equals("WEEK_OF_MONTH"))) {
            HashSet<p> hashSet = new HashSet();
            hashSet.add(p);
            return (Set)hashSet;
          } 
        } 
      } 
      return Collections.emptySet();
    } 
    return p.g();
  }
  
  private static p<?> a(Set<p<?>> paramSet, char paramChar, String paramString) {
    char c;
    if (paramChar == 'L') {
      c = 'M';
    } else if (paramChar == 'c') {
      c = 'e';
    } else {
      c = paramChar;
    } 
    for (p<?> p : paramSet) {
      if (p.d() && p.a() == c)
        return p; 
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Cannot find any chronological date element for symbol ");
    stringBuilder.append(paramChar);
    stringBuilder.append(" in \"");
    stringBuilder.append(paramString);
    stringBuilder.append("\".");
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
    throw illegalArgumentException;
  }
  
  private static p<Integer> a(x<?> paramx) {
    Iterator<s> iterator = paramx.f().iterator();
    while (iterator.hasNext()) {
      for (p<Integer> p : (Iterable<p<Integer>>)((s)iterator.next()).a(Locale.ROOT, (d)net.time4j.e1.a.a())) {
        if (p.name().equals("ETHIOPIAN_HOUR")) {
          a(p);
          return p;
        } 
      } 
    } 
    return null;
  }
  
  private static x<?> a(c.d<?> paramd) {
    return paramd.j();
  }
  
  private static void a(p<Integer> paramp, char paramChar, c.d<?> paramd, int paramInt, boolean paramBoolean) {
    if (paramInt == 1) {
      paramd.a(paramp, 1, 2);
      return;
    } 
    if (paramInt == 2 || paramBoolean) {
      paramd.a(paramp, paramInt);
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Too many pattern letters (");
    stringBuilder.append(paramChar);
    stringBuilder.append("): ");
    stringBuilder.append(paramInt);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  private static void a(c.d<?> paramd, char paramChar, int paramInt, boolean paramBoolean) {
    // Byte code:
    //   0: ldc_w 'Z'
    //   3: astore #5
    //   5: iload_2
    //   6: iconst_1
    //   7: if_icmpeq -> 185
    //   10: iload_2
    //   11: iconst_2
    //   12: if_icmpeq -> 165
    //   15: iload_2
    //   16: iconst_3
    //   17: if_icmpeq -> 126
    //   20: iload_2
    //   21: iconst_4
    //   22: if_icmpeq -> 98
    //   25: iload_2
    //   26: iconst_5
    //   27: if_icmpne -> 50
    //   30: getstatic net/time4j/e1/e.e : Lnet/time4j/e1/e;
    //   33: astore #6
    //   35: aload #6
    //   37: astore #4
    //   39: iload_3
    //   40: ifeq -> 146
    //   43: aload #6
    //   45: astore #4
    //   47: goto -> 151
    //   50: new java/lang/StringBuilder
    //   53: dup
    //   54: invokespecial <init> : ()V
    //   57: astore_0
    //   58: aload_0
    //   59: ldc_w 'Too many pattern letters ('
    //   62: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   65: pop
    //   66: aload_0
    //   67: iload_1
    //   68: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   71: pop
    //   72: aload_0
    //   73: ldc_w '): '
    //   76: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   79: pop
    //   80: aload_0
    //   81: iload_2
    //   82: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   85: pop
    //   86: new java/lang/IllegalArgumentException
    //   89: dup
    //   90: aload_0
    //   91: invokevirtual toString : ()Ljava/lang/String;
    //   94: invokespecial <init> : (Ljava/lang/String;)V
    //   97: athrow
    //   98: getstatic net/time4j/e1/e.e : Lnet/time4j/e1/e;
    //   101: astore #6
    //   103: aload #6
    //   105: astore #4
    //   107: iload_3
    //   108: ifeq -> 118
    //   111: aload #6
    //   113: astore #4
    //   115: goto -> 202
    //   118: ldc_w '+0000'
    //   121: astore #5
    //   123: goto -> 202
    //   126: getstatic net/time4j/e1/e.f : Lnet/time4j/e1/e;
    //   129: astore #6
    //   131: aload #6
    //   133: astore #4
    //   135: iload_3
    //   136: ifeq -> 146
    //   139: aload #6
    //   141: astore #4
    //   143: goto -> 151
    //   146: ldc_w '+00:00'
    //   149: astore #5
    //   151: aload_0
    //   152: aload #4
    //   154: iconst_1
    //   155: aload #5
    //   157: invokestatic singletonList : (Ljava/lang/Object;)Ljava/util/List;
    //   160: invokevirtual a : (Lnet/time4j/e1/e;ZLjava/util/List;)Lnet/time4j/e1/a0/c$d;
    //   163: pop
    //   164: return
    //   165: getstatic net/time4j/e1/e.f : Lnet/time4j/e1/e;
    //   168: astore #6
    //   170: aload #6
    //   172: astore #4
    //   174: iload_3
    //   175: ifeq -> 118
    //   178: aload #6
    //   180: astore #4
    //   182: goto -> 202
    //   185: getstatic net/time4j/e1/e.g : Lnet/time4j/e1/e;
    //   188: astore #4
    //   190: iload_3
    //   191: ifeq -> 197
    //   194: goto -> 202
    //   197: ldc_w '+00'
    //   200: astore #5
    //   202: aload_0
    //   203: aload #4
    //   205: iconst_0
    //   206: aload #5
    //   208: invokestatic singletonList : (Ljava/lang/Object;)Ljava/util/List;
    //   211: invokevirtual a : (Lnet/time4j/e1/e;ZLjava/util/List;)Lnet/time4j/e1/a0/c$d;
    //   214: pop
    //   215: return
  }
  
  private static void a(c.d<?> paramd, int paramInt) {
    StringBuilder stringBuilder;
    if (paramInt != 1) {
      if (paramInt != 2) {
        net.time4j.e1.w w1;
        c c;
        if (paramInt != 3) {
          if (paramInt != 4) {
            if (paramInt == 5) {
              c = net.time4j.e1.a.g;
              w1 = net.time4j.e1.w.f;
            } else {
              stringBuilder = new StringBuilder();
              stringBuilder.append("Too many pattern letters for month: ");
              stringBuilder.append(paramInt);
              throw new IllegalArgumentException(stringBuilder.toString());
            } 
          } else {
            c = net.time4j.e1.a.g;
            w1 = net.time4j.e1.w.c;
          } 
        } else {
          c = net.time4j.e1.a.g;
          w1 = net.time4j.e1.w.d;
        } 
        stringBuilder.a(c, w1);
        stringBuilder.a((p)f0.u);
        stringBuilder.i();
        return;
      } 
      stringBuilder.a((p<Integer>)f0.v, 2);
      return;
    } 
    stringBuilder.a((p<Integer>)f0.v, 1, 2);
  }
  
  private static <V extends Enum<V>> void a(c.d<?> paramd, int paramInt, u<?> paramu) {
    StringBuilder stringBuilder;
    p p;
    if (paramInt != 1 && paramInt != 2) {
      net.time4j.e1.w w1;
      c c;
      if (paramInt != 3) {
        if (paramInt != 4) {
          if (paramInt == 5) {
            c = net.time4j.e1.a.g;
            w1 = net.time4j.e1.w.f;
          } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Too many pattern letters for month: ");
            stringBuilder.append(paramInt);
            throw new IllegalArgumentException(stringBuilder.toString());
          } 
        } else {
          c = net.time4j.e1.a.g;
          w1 = net.time4j.e1.w.c;
        } 
      } else {
        c = net.time4j.e1.a.g;
        w1 = net.time4j.e1.w.d;
      } 
      stringBuilder.a(c, w1);
    } else {
      if (Enum.class.isAssignableFrom(paramu.getType())) {
        a(paramu);
        p = (p)paramu;
        if (paramInt == 1) {
          stringBuilder.b(p, 1, 2);
          return;
        } 
        if (paramInt == 2) {
          stringBuilder.b(p, 2);
          return;
        } 
      } else {
        stringBuilder.a(net.time4j.e1.b0.a.b, paramInt);
        stringBuilder.a((u<?>)p);
        stringBuilder.i();
      } 
      return;
    } 
    stringBuilder.a((u<?>)p);
    stringBuilder.i();
  }
  
  private static boolean a(char paramChar) {
    if (paramChar != 'L' && paramChar != 'M' && paramChar != 'U' && paramChar != 'W' && paramChar != 'g' && paramChar != 'r' && paramChar != 'w' && paramChar != 'y')
      switch (paramChar) {
        default:
          switch (paramChar) {
            default:
              return false;
            case 'c':
            case 'd':
            case 'e':
              break;
          } 
          break;
        case 'D':
        case 'E':
        case 'F':
        case 'G':
          break;
      }  
    return true;
  }
  
  private static String b(x<?> paramx) {
    c c = (c)paramx.e().getAnnotation(c.class);
    return (c == null) ? "iso8601" : c.value();
  }
  
  private Map<p<?>, p<?>> b(c.d<?> paramd, Locale paramLocale, char paramChar, int paramInt) {
    p<Integer> p;
    x<?> x = a(paramd);
    if (a(paramChar) && !c(x))
      return a(paramd, x, paramChar, paramInt, paramLocale); 
    if (paramChar == 'h' && b(x).equals("ethiopic")) {
      p = a(x);
      if (p != null) {
        a(p, paramChar, paramd, paramInt, false);
        return Collections.emptyMap();
      } 
      throw new IllegalArgumentException("Ethiopian time not available.");
    } 
    return a(paramd, x, (Locale)p, paramChar, paramInt, false);
  }
  
  private static void b(c.d<?> paramd, int paramInt) {
    StringBuilder stringBuilder;
    if (paramInt != 1 && paramInt != 2) {
      net.time4j.e1.w w1;
      c c;
      if (paramInt != 3) {
        if (paramInt != 4) {
          if (paramInt == 5) {
            c = net.time4j.e1.a.g;
            w1 = net.time4j.e1.w.f;
          } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Too many pattern letters for quarter-of-year: ");
            stringBuilder.append(paramInt);
            throw new IllegalArgumentException(stringBuilder.toString());
          } 
        } else {
          c = net.time4j.e1.a.g;
          w1 = net.time4j.e1.w.c;
        } 
      } else {
        c = net.time4j.e1.a.g;
        w1 = net.time4j.e1.w.d;
      } 
      stringBuilder.a(c, w1);
      stringBuilder.a((p)f0.t);
      stringBuilder.i();
      return;
    } 
    stringBuilder.b((p)f0.t, paramInt);
  }
  
  private Map<p<?>, p<?>> c(c.d<?> paramd, Locale paramLocale, char paramChar, int paramInt) {
    if (paramChar == 'H') {
      a((p<Integer>)g0.x, paramChar, paramd, paramInt, false);
      return Collections.emptyMap();
    } 
    return b(paramd, paramLocale, paramChar, paramInt);
  }
  
  private static boolean c(x<?> paramx) {
    return b(paramx).equals("iso8601");
  }
  
  private static net.time4j.e1.w f(int paramInt) {
    if (paramInt <= 3)
      return net.time4j.e1.w.d; 
    if (paramInt == 4)
      return net.time4j.e1.w.c; 
    if (paramInt == 5)
      return net.time4j.e1.w.f; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Too many pattern letters: ");
    stringBuilder.append(paramInt);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  Map<p<?>, p<?>> a(c.d<?> paramd, Locale paramLocale, char paramChar, int paramInt) {
    x<?> x = a(paramd);
    int i = a.a[ordinal()];
    if (i != 1) {
      if (i != 2) {
        if (i != 3) {
          if (i != 4) {
            if (i == 5)
              return a(paramd, paramChar, paramInt, paramLocale); 
            throw new UnsupportedOperationException(name());
          } 
          Class<?> clazz = x.e();
          if (m.class.isAssignableFrom(clazz) || l.class.isAssignableFrom(clazz))
            return a(paramd, x, paramChar, paramInt, paramLocale); 
          throw new IllegalArgumentException("No calendar chronology.");
        } 
        return c(paramd, paramLocale, paramChar, paramInt);
      } 
      return a(paramd, x, paramLocale, paramChar, paramInt);
    } 
    return b(paramd, paramLocale, paramChar, paramInt);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/e1/a0/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */