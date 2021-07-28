package net.time4j.e1.a0;

import java.util.Set;
import net.time4j.d1.d;
import net.time4j.d1.o;
import net.time4j.d1.p;
import net.time4j.e1.g;
import net.time4j.e1.j;

class r<V> implements h<V> {
  private static final int[] q = new int[] { 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, Integer.MAX_VALUE };
  
  private final p<V> c;
  
  private final boolean d;
  
  private final int e;
  
  private final int f;
  
  private final x g;
  
  private final boolean h;
  
  private final boolean i;
  
  private final g j;
  
  private final int k;
  
  private final char l;
  
  private final j m;
  
  private final int n;
  
  private final int o;
  
  private final boolean p;
  
  r(p<V> paramp, boolean paramBoolean1, int paramInt1, int paramInt2, x paramx, boolean paramBoolean2) {
    this(paramp, paramBoolean1, paramInt1, paramInt2, paramx, paramBoolean2, 0, '0', j.c, g.d, 0, false);
  }
  
  private r(p<V> paramp, boolean paramBoolean1, int paramInt1, int paramInt2, x paramx, boolean paramBoolean2, int paramInt3, char paramChar, j paramj, g paramg, int paramInt4, boolean paramBoolean3) {
    this.c = paramp;
    this.d = paramBoolean1;
    this.e = paramInt1;
    this.f = paramInt2;
    this.g = paramx;
    this.h = paramBoolean2;
    this.p = paramBoolean3;
    if (paramp != null) {
      if (paramx != null) {
        if (paramInt1 >= 1) {
          if (paramInt1 <= paramInt2) {
            if (!paramBoolean1 || paramInt1 == paramInt2) {
              if (!paramBoolean1 || paramx == x.c) {
                int i = a(paramj);
                if (paramj.b())
                  if (paramInt1 <= i) {
                    if (paramInt2 > i) {
                      StringBuilder stringBuilder3 = new StringBuilder();
                      stringBuilder3.append("Max digits out of range: ");
                      stringBuilder3.append(paramInt2);
                      throw new IllegalArgumentException(stringBuilder3.toString());
                    } 
                  } else {
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append("Min digits out of range: ");
                    stringBuilder3.append(paramInt1);
                    throw new IllegalArgumentException(stringBuilder3.toString());
                  }  
                this.i = this.c.name().equals("YEAR_OF_ERA");
                this.k = paramInt3;
                this.l = paramChar;
                this.m = paramj;
                this.j = paramg;
                this.n = paramInt4;
                this.o = i;
                return;
              } 
              throw new IllegalArgumentException("Sign policy must be SHOW_NEVER in fixed-width-mode.");
            } 
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Variable width in fixed-width-mode: ");
            stringBuilder2.append(paramInt2);
            stringBuilder2.append(" != ");
            stringBuilder2.append(paramInt1);
            throw new IllegalArgumentException(stringBuilder2.toString());
          } 
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Max smaller than min: ");
          stringBuilder1.append(paramInt2);
          stringBuilder1.append(" < ");
          stringBuilder1.append(paramInt1);
          throw new IllegalArgumentException(stringBuilder1.toString());
        } 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Not positive: ");
        stringBuilder.append(paramInt1);
        throw new IllegalArgumentException(stringBuilder.toString());
      } 
      throw new NullPointerException("Missing sign policy.");
    } 
    throw new NullPointerException("Missing element.");
  }
  
  private static int a(int paramInt) {
    int i = 0;
    while (true) {
      int m = q[i];
      int k = i + 1;
      i = k;
      if (paramInt <= m)
        return k; 
    } 
  }
  
  private int a(j paramj) {
    if (paramj.b()) {
      Class<Integer> clazz = this.c.getType();
      return (clazz == Integer.class) ? 10 : ((clazz == Long.class) ? 18 : 9);
    } 
    return 100;
  }
  
  private static void a(int paramInt, Appendable paramAppendable, char paramChar) {
    int i = paramInt * 103 >>> 10;
    paramAppendable.append((char)(i + paramChar));
    paramAppendable.append((char)(paramInt - (i << 3) + (i << 1) + paramChar));
  }
  
  public int a(o paramo, Appendable paramAppendable, d paramd, Set<g> paramSet, boolean paramBoolean) {
    // Byte code:
    //   0: aload_2
    //   1: instanceof java/lang/CharSequence
    //   4: ifeq -> 21
    //   7: aload_2
    //   8: checkcast java/lang/CharSequence
    //   11: invokeinterface length : ()I
    //   16: istore #7
    //   18: goto -> 24
    //   21: iconst_m1
    //   22: istore #7
    //   24: iload #5
    //   26: ifeq -> 44
    //   29: aload_0
    //   30: getfield m : Lnet/time4j/e1/j;
    //   33: astore #15
    //   35: aload_0
    //   36: getfield l : C
    //   39: istore #6
    //   41: goto -> 119
    //   44: aload_3
    //   45: getstatic net/time4j/e1/a.l : Lnet/time4j/d1/c;
    //   48: getstatic net/time4j/e1/j.c : Lnet/time4j/e1/j;
    //   51: invokeinterface a : (Lnet/time4j/d1/c;Ljava/lang/Object;)Ljava/lang/Object;
    //   56: checkcast net/time4j/e1/j
    //   59: astore #15
    //   61: aload_3
    //   62: getstatic net/time4j/e1/a.m : Lnet/time4j/d1/c;
    //   65: invokeinterface b : (Lnet/time4j/d1/c;)Z
    //   70: ifeq -> 93
    //   73: aload_3
    //   74: getstatic net/time4j/e1/a.m : Lnet/time4j/d1/c;
    //   77: invokeinterface a : (Lnet/time4j/d1/c;)Ljava/lang/Object;
    //   82: checkcast java/lang/Character
    //   85: invokevirtual charValue : ()C
    //   88: istore #6
    //   90: goto -> 119
    //   93: aload #15
    //   95: invokevirtual b : ()Z
    //   98: ifeq -> 115
    //   101: aload #15
    //   103: invokevirtual a : ()Ljava/lang/String;
    //   106: iconst_0
    //   107: invokevirtual charAt : (I)C
    //   110: istore #6
    //   112: goto -> 119
    //   115: bipush #48
    //   117: istore #6
    //   119: iload #5
    //   121: ifeq -> 462
    //   124: aload_0
    //   125: getfield p : Z
    //   128: ifeq -> 462
    //   131: aload_1
    //   132: aload_0
    //   133: getfield c : Lnet/time4j/d1/p;
    //   136: invokeinterface a : (Lnet/time4j/d1/p;)I
    //   141: istore #10
    //   143: iload #10
    //   145: ifge -> 167
    //   148: iload #10
    //   150: ldc -2147483648
    //   152: if_icmpne -> 157
    //   155: iconst_m1
    //   156: ireturn
    //   157: new java/lang/IllegalArgumentException
    //   160: dup
    //   161: ldc 'Negative value not allowed according to sign policy.'
    //   163: invokespecial <init> : (Ljava/lang/String;)V
    //   166: athrow
    //   167: iload #10
    //   169: invokestatic a : (I)I
    //   172: istore #11
    //   174: iload #11
    //   176: aload_0
    //   177: getfield f : I
    //   180: if_icmpgt -> 384
    //   183: aload_0
    //   184: getfield e : I
    //   187: istore #12
    //   189: iconst_0
    //   190: istore #8
    //   192: iconst_0
    //   193: istore #9
    //   195: iload #8
    //   197: iload #12
    //   199: iload #11
    //   201: isub
    //   202: if_icmpge -> 229
    //   205: aload_2
    //   206: bipush #48
    //   208: invokeinterface append : (C)Ljava/lang/Appendable;
    //   213: pop
    //   214: iload #9
    //   216: iconst_1
    //   217: iadd
    //   218: istore #9
    //   220: iload #8
    //   222: iconst_1
    //   223: iadd
    //   224: istore #8
    //   226: goto -> 195
    //   229: iload #11
    //   231: iconst_2
    //   232: if_icmpne -> 250
    //   235: iload #10
    //   237: istore #8
    //   239: iload #8
    //   241: aload_2
    //   242: bipush #48
    //   244: invokestatic a : (ILjava/lang/Appendable;C)V
    //   247: goto -> 374
    //   250: iload #11
    //   252: iconst_1
    //   253: if_icmpne -> 272
    //   256: aload_2
    //   257: iload #10
    //   259: bipush #48
    //   261: iadd
    //   262: i2c
    //   263: invokeinterface append : (C)Ljava/lang/Appendable;
    //   268: pop
    //   269: goto -> 374
    //   272: iload #10
    //   274: sipush #2000
    //   277: if_icmplt -> 317
    //   280: iload #10
    //   282: sipush #2100
    //   285: if_icmpge -> 317
    //   288: aload_2
    //   289: bipush #50
    //   291: invokeinterface append : (C)Ljava/lang/Appendable;
    //   296: pop
    //   297: aload_2
    //   298: bipush #48
    //   300: invokeinterface append : (C)Ljava/lang/Appendable;
    //   305: pop
    //   306: iload #10
    //   308: sipush #2000
    //   311: isub
    //   312: istore #8
    //   314: goto -> 239
    //   317: iload #10
    //   319: sipush #1900
    //   322: if_icmplt -> 362
    //   325: iload #10
    //   327: sipush #2000
    //   330: if_icmpge -> 362
    //   333: aload_2
    //   334: bipush #49
    //   336: invokeinterface append : (C)Ljava/lang/Appendable;
    //   341: pop
    //   342: aload_2
    //   343: bipush #57
    //   345: invokeinterface append : (C)Ljava/lang/Appendable;
    //   350: pop
    //   351: iload #10
    //   353: sipush #1900
    //   356: isub
    //   357: istore #8
    //   359: goto -> 239
    //   362: aload_2
    //   363: iload #10
    //   365: invokestatic toString : (I)Ljava/lang/String;
    //   368: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   373: pop
    //   374: iload #9
    //   376: iload #11
    //   378: iadd
    //   379: istore #8
    //   381: goto -> 546
    //   384: new java/lang/StringBuilder
    //   387: dup
    //   388: invokespecial <init> : ()V
    //   391: astore_1
    //   392: aload_1
    //   393: ldc 'Element '
    //   395: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   398: pop
    //   399: aload_1
    //   400: aload_0
    //   401: getfield c : Lnet/time4j/d1/p;
    //   404: invokeinterface name : ()Ljava/lang/String;
    //   409: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   412: pop
    //   413: aload_1
    //   414: ldc ' cannot be printed as the formatted value '
    //   416: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   419: pop
    //   420: aload_1
    //   421: iload #10
    //   423: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   426: pop
    //   427: aload_1
    //   428: ldc ' exceeds the maximum width of '
    //   430: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   433: pop
    //   434: aload_1
    //   435: aload_0
    //   436: getfield f : I
    //   439: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   442: pop
    //   443: aload_1
    //   444: ldc '.'
    //   446: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   449: pop
    //   450: new java/lang/IllegalArgumentException
    //   453: dup
    //   454: aload_1
    //   455: invokevirtual toString : ()Ljava/lang/String;
    //   458: invokespecial <init> : (Ljava/lang/String;)V
    //   461: athrow
    //   462: aload_0
    //   463: getfield i : Z
    //   466: ifeq -> 549
    //   469: aload_0
    //   470: getfield c : Lnet/time4j/d1/p;
    //   473: astore #16
    //   475: aload #16
    //   477: instanceof net/time4j/e1/b0/a
    //   480: ifeq -> 549
    //   483: ldc net/time4j/e1/b0/a
    //   485: aload #16
    //   487: invokevirtual cast : (Ljava/lang/Object;)Ljava/lang/Object;
    //   490: checkcast net/time4j/e1/b0/a
    //   493: astore #16
    //   495: new java/lang/StringBuilder
    //   498: dup
    //   499: invokespecial <init> : ()V
    //   502: astore #17
    //   504: aload #16
    //   506: aload_1
    //   507: aload #17
    //   509: aload_3
    //   510: aload #15
    //   512: iload #6
    //   514: aload_0
    //   515: getfield e : I
    //   518: aload_0
    //   519: getfield f : I
    //   522: invokeinterface a : (Lnet/time4j/d1/o;Ljava/lang/Appendable;Lnet/time4j/d1/d;Lnet/time4j/e1/j;CII)V
    //   527: aload_2
    //   528: aload #17
    //   530: invokevirtual toString : ()Ljava/lang/String;
    //   533: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   538: pop
    //   539: aload #17
    //   541: invokevirtual length : ()I
    //   544: istore #8
    //   546: goto -> 1364
    //   549: aload #15
    //   551: invokevirtual a : ()Ljava/lang/String;
    //   554: iconst_0
    //   555: invokevirtual charAt : (I)C
    //   558: istore #11
    //   560: aload_0
    //   561: getfield c : Lnet/time4j/d1/p;
    //   564: invokeinterface getType : ()Ljava/lang/Class;
    //   569: astore #17
    //   571: aload #15
    //   573: invokevirtual b : ()Z
    //   576: istore #5
    //   578: aconst_null
    //   579: astore #16
    //   581: aload #17
    //   583: ldc java/lang/Integer
    //   585: if_acmpne -> 643
    //   588: aload_1
    //   589: aload_0
    //   590: getfield c : Lnet/time4j/d1/p;
    //   593: invokeinterface a : (Lnet/time4j/d1/p;)I
    //   598: istore #9
    //   600: iload #9
    //   602: ldc -2147483648
    //   604: if_icmpne -> 609
    //   607: iconst_m1
    //   608: ireturn
    //   609: iload #9
    //   611: ifge -> 620
    //   614: iconst_1
    //   615: istore #8
    //   617: goto -> 623
    //   620: iconst_0
    //   621: istore #8
    //   623: iload #9
    //   625: invokestatic abs : (I)I
    //   628: istore #10
    //   630: iload #10
    //   632: invokestatic a : (I)I
    //   635: istore #9
    //   637: aload #16
    //   639: astore_1
    //   640: goto -> 825
    //   643: aload #17
    //   645: ldc java/lang/Long
    //   647: if_acmpne -> 731
    //   650: ldc java/lang/Long
    //   652: aload_1
    //   653: aload_0
    //   654: getfield c : Lnet/time4j/d1/p;
    //   657: invokeinterface e : (Lnet/time4j/d1/p;)Ljava/lang/Object;
    //   662: invokevirtual cast : (Ljava/lang/Object;)Ljava/lang/Object;
    //   665: checkcast java/lang/Long
    //   668: invokevirtual longValue : ()J
    //   671: lstore #13
    //   673: lload #13
    //   675: lconst_0
    //   676: lcmp
    //   677: ifge -> 686
    //   680: iconst_1
    //   681: istore #8
    //   683: goto -> 689
    //   686: iconst_0
    //   687: istore #8
    //   689: lload #13
    //   691: ldc2_w -9223372036854775808
    //   694: lcmp
    //   695: ifne -> 705
    //   698: ldc_w '9223372036854775808'
    //   701: astore_1
    //   702: goto -> 714
    //   705: lload #13
    //   707: invokestatic abs : (J)J
    //   710: invokestatic toString : (J)Ljava/lang/String;
    //   713: astore_1
    //   714: aload_1
    //   715: invokevirtual length : ()I
    //   718: istore #9
    //   720: bipush #48
    //   722: istore #11
    //   724: ldc -2147483648
    //   726: istore #10
    //   728: goto -> 825
    //   731: ldc_w java/lang/Enum
    //   734: aload #17
    //   736: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   739: ifeq -> 1446
    //   742: aload_0
    //   743: getfield c : Lnet/time4j/d1/p;
    //   746: astore #17
    //   748: aload #17
    //   750: instanceof net/time4j/e1/l
    //   753: ifeq -> 801
    //   756: aload_1
    //   757: aload #17
    //   759: invokeinterface e : (Lnet/time4j/d1/p;)Ljava/lang/Object;
    //   764: astore #17
    //   766: aload_0
    //   767: getfield c : Lnet/time4j/d1/p;
    //   770: checkcast net/time4j/e1/l
    //   773: aload #17
    //   775: aload_1
    //   776: aload_3
    //   777: invokeinterface a : (Ljava/lang/Object;Lnet/time4j/d1/o;Lnet/time4j/d1/d;)I
    //   782: istore #9
    //   784: iload #9
    //   786: ifge -> 795
    //   789: iconst_1
    //   790: istore #8
    //   792: goto -> 798
    //   795: iconst_0
    //   796: istore #8
    //   798: goto -> 808
    //   801: iconst_0
    //   802: istore #8
    //   804: ldc -2147483648
    //   806: istore #9
    //   808: iload #9
    //   810: ldc -2147483648
    //   812: if_icmpeq -> 1409
    //   815: iload #9
    //   817: invokestatic abs : (I)I
    //   820: istore #10
    //   822: goto -> 630
    //   825: iload #5
    //   827: ifeq -> 1004
    //   830: iload #6
    //   832: iload #11
    //   834: if_icmpeq -> 902
    //   837: aload_1
    //   838: astore_3
    //   839: aload_1
    //   840: ifnonnull -> 851
    //   843: aload #15
    //   845: iload #10
    //   847: invokevirtual f : (I)Ljava/lang/String;
    //   850: astore_3
    //   851: aload_3
    //   852: invokevirtual toCharArray : ()[C
    //   855: astore_1
    //   856: iconst_0
    //   857: istore #12
    //   859: iload #12
    //   861: aload_1
    //   862: arraylength
    //   863: if_icmpge -> 890
    //   866: aload_1
    //   867: iload #12
    //   869: aload_1
    //   870: iload #12
    //   872: caload
    //   873: iload #6
    //   875: iload #11
    //   877: isub
    //   878: iadd
    //   879: i2c
    //   880: castore
    //   881: iload #12
    //   883: iconst_1
    //   884: iadd
    //   885: istore #12
    //   887: goto -> 859
    //   890: new java/lang/String
    //   893: dup
    //   894: aload_1
    //   895: invokespecial <init> : ([C)V
    //   898: astore_1
    //   899: goto -> 902
    //   902: aload_1
    //   903: astore_3
    //   904: iload #9
    //   906: aload_0
    //   907: getfield f : I
    //   910: if_icmple -> 1006
    //   913: aload_1
    //   914: astore_2
    //   915: aload_1
    //   916: ifnonnull -> 927
    //   919: aload #15
    //   921: iload #10
    //   923: invokevirtual f : (I)Ljava/lang/String;
    //   926: astore_2
    //   927: new java/lang/StringBuilder
    //   930: dup
    //   931: invokespecial <init> : ()V
    //   934: astore_1
    //   935: aload_1
    //   936: ldc 'Element '
    //   938: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   941: pop
    //   942: aload_1
    //   943: aload_0
    //   944: getfield c : Lnet/time4j/d1/p;
    //   947: invokeinterface name : ()Ljava/lang/String;
    //   952: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   955: pop
    //   956: aload_1
    //   957: ldc ' cannot be printed as the formatted value '
    //   959: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   962: pop
    //   963: aload_1
    //   964: aload_2
    //   965: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   968: pop
    //   969: aload_1
    //   970: ldc ' exceeds the maximum width of '
    //   972: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   975: pop
    //   976: aload_1
    //   977: aload_0
    //   978: getfield f : I
    //   981: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   984: pop
    //   985: aload_1
    //   986: ldc '.'
    //   988: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   991: pop
    //   992: new java/lang/IllegalArgumentException
    //   995: dup
    //   996: aload_1
    //   997: invokevirtual toString : ()Ljava/lang/String;
    //   1000: invokespecial <init> : (Ljava/lang/String;)V
    //   1003: athrow
    //   1004: aload_1
    //   1005: astore_3
    //   1006: iload #8
    //   1008: ifeq -> 1043
    //   1011: aload_0
    //   1012: getfield g : Lnet/time4j/e1/a0/x;
    //   1015: getstatic net/time4j/e1/a0/x.c : Lnet/time4j/e1/a0/x;
    //   1018: if_acmpeq -> 1033
    //   1021: aload_2
    //   1022: bipush #45
    //   1024: invokeinterface append : (C)Ljava/lang/Appendable;
    //   1029: pop
    //   1030: goto -> 1103
    //   1033: new java/lang/IllegalArgumentException
    //   1036: dup
    //   1037: ldc 'Negative value not allowed according to sign policy.'
    //   1039: invokespecial <init> : (Ljava/lang/String;)V
    //   1042: athrow
    //   1043: getstatic net/time4j/e1/a0/r$a.a : [I
    //   1046: aload_0
    //   1047: getfield g : Lnet/time4j/e1/a0/x;
    //   1050: invokevirtual ordinal : ()I
    //   1053: iaload
    //   1054: istore #8
    //   1056: iload #8
    //   1058: iconst_1
    //   1059: if_icmpeq -> 1094
    //   1062: iload #8
    //   1064: iconst_2
    //   1065: if_icmpeq -> 1071
    //   1068: goto -> 1088
    //   1071: iload #5
    //   1073: ifeq -> 1088
    //   1076: iload #9
    //   1078: aload_0
    //   1079: getfield e : I
    //   1082: if_icmple -> 1088
    //   1085: goto -> 1094
    //   1088: iconst_0
    //   1089: istore #8
    //   1091: goto -> 1106
    //   1094: aload_2
    //   1095: bipush #43
    //   1097: invokeinterface append : (C)Ljava/lang/Appendable;
    //   1102: pop
    //   1103: iconst_1
    //   1104: istore #8
    //   1106: iload #8
    //   1108: istore #11
    //   1110: iload #5
    //   1112: ifeq -> 1162
    //   1115: aload_0
    //   1116: getfield e : I
    //   1119: istore #12
    //   1121: iconst_0
    //   1122: istore #11
    //   1124: iload #11
    //   1126: iload #12
    //   1128: iload #9
    //   1130: isub
    //   1131: if_icmpge -> 1158
    //   1134: aload_2
    //   1135: iload #6
    //   1137: invokeinterface append : (C)Ljava/lang/Appendable;
    //   1142: pop
    //   1143: iload #8
    //   1145: iconst_1
    //   1146: iadd
    //   1147: istore #8
    //   1149: iload #11
    //   1151: iconst_1
    //   1152: iadd
    //   1153: istore #11
    //   1155: goto -> 1124
    //   1158: iload #8
    //   1160: istore #11
    //   1162: aload_3
    //   1163: ifnonnull -> 1340
    //   1166: iload #5
    //   1168: ifeq -> 1327
    //   1171: iload #9
    //   1173: iconst_2
    //   1174: if_icmpne -> 1188
    //   1177: iload #10
    //   1179: aload_2
    //   1180: iload #6
    //   1182: invokestatic a : (ILjava/lang/Appendable;C)V
    //   1185: goto -> 1354
    //   1188: iload #9
    //   1190: iconst_1
    //   1191: if_icmpne -> 1210
    //   1194: aload_2
    //   1195: iload #10
    //   1197: iload #6
    //   1199: iadd
    //   1200: i2c
    //   1201: invokeinterface append : (C)Ljava/lang/Appendable;
    //   1206: pop
    //   1207: goto -> 1354
    //   1210: iload #10
    //   1212: sipush #2000
    //   1215: if_icmplt -> 1258
    //   1218: iload #10
    //   1220: sipush #2100
    //   1223: if_icmpge -> 1258
    //   1226: aload_2
    //   1227: iload #6
    //   1229: iconst_2
    //   1230: iadd
    //   1231: i2c
    //   1232: invokeinterface append : (C)Ljava/lang/Appendable;
    //   1237: pop
    //   1238: aload_2
    //   1239: iload #6
    //   1241: invokeinterface append : (C)Ljava/lang/Appendable;
    //   1246: pop
    //   1247: iload #10
    //   1249: sipush #2000
    //   1252: isub
    //   1253: istore #10
    //   1255: goto -> 1177
    //   1258: iload #10
    //   1260: sipush #1900
    //   1263: if_icmplt -> 1310
    //   1266: iload #10
    //   1268: sipush #2000
    //   1271: if_icmpge -> 1310
    //   1274: aload_2
    //   1275: iload #6
    //   1277: iconst_1
    //   1278: iadd
    //   1279: i2c
    //   1280: invokeinterface append : (C)Ljava/lang/Appendable;
    //   1285: pop
    //   1286: aload_2
    //   1287: iload #6
    //   1289: bipush #9
    //   1291: iadd
    //   1292: i2c
    //   1293: invokeinterface append : (C)Ljava/lang/Appendable;
    //   1298: pop
    //   1299: iload #10
    //   1301: sipush #1900
    //   1304: isub
    //   1305: istore #10
    //   1307: goto -> 1177
    //   1310: aload_2
    //   1311: aload #15
    //   1313: iload #10
    //   1315: invokevirtual f : (I)Ljava/lang/String;
    //   1318: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   1323: pop
    //   1324: goto -> 1354
    //   1327: aload #15
    //   1329: iload #10
    //   1331: aload_2
    //   1332: invokevirtual a : (ILjava/lang/Appendable;)I
    //   1335: istore #9
    //   1337: goto -> 1354
    //   1340: aload_2
    //   1341: aload_3
    //   1342: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   1347: pop
    //   1348: aload_3
    //   1349: invokevirtual length : ()I
    //   1352: istore #9
    //   1354: iload #11
    //   1356: iload #9
    //   1358: iadd
    //   1359: istore #8
    //   1361: goto -> 546
    //   1364: iload #7
    //   1366: iconst_m1
    //   1367: if_icmpeq -> 1406
    //   1370: iload #8
    //   1372: ifle -> 1406
    //   1375: aload #4
    //   1377: ifnull -> 1406
    //   1380: aload #4
    //   1382: new net/time4j/e1/a0/g
    //   1385: dup
    //   1386: aload_0
    //   1387: getfield c : Lnet/time4j/d1/p;
    //   1390: iload #7
    //   1392: iload #7
    //   1394: iload #8
    //   1396: iadd
    //   1397: invokespecial <init> : (Lnet/time4j/d1/p;II)V
    //   1400: invokeinterface add : (Ljava/lang/Object;)Z
    //   1405: pop
    //   1406: iload #8
    //   1408: ireturn
    //   1409: new java/lang/StringBuilder
    //   1412: dup
    //   1413: invokespecial <init> : ()V
    //   1416: astore_1
    //   1417: aload_1
    //   1418: ldc_w 'Cannot print: '
    //   1421: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1424: pop
    //   1425: aload_1
    //   1426: aload_0
    //   1427: getfield c : Lnet/time4j/d1/p;
    //   1430: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1433: pop
    //   1434: new java/lang/IllegalArgumentException
    //   1437: dup
    //   1438: aload_1
    //   1439: invokevirtual toString : ()Ljava/lang/String;
    //   1442: invokespecial <init> : (Ljava/lang/String;)V
    //   1445: athrow
    //   1446: new java/lang/StringBuilder
    //   1449: dup
    //   1450: invokespecial <init> : ()V
    //   1453: astore_1
    //   1454: aload_1
    //   1455: ldc_w 'Not formattable: '
    //   1458: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1461: pop
    //   1462: aload_1
    //   1463: aload_0
    //   1464: getfield c : Lnet/time4j/d1/p;
    //   1467: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1470: pop
    //   1471: new java/lang/IllegalArgumentException
    //   1474: dup
    //   1475: aload_1
    //   1476: invokevirtual toString : ()Ljava/lang/String;
    //   1479: invokespecial <init> : (Ljava/lang/String;)V
    //   1482: astore_1
    //   1483: goto -> 1488
    //   1486: aload_1
    //   1487: athrow
    //   1488: goto -> 1486
  }
  
  public h<V> a(p<V> paramp) {
    return !this.h ? ((this.c == paramp) ? this : new r(paramp, this.d, this.e, this.f, this.g, false)) : this;
  }
  
  public h<V> a(c<?> paramc, d paramd, int paramInt) {
    byte b;
    boolean bool;
    j j1 = (j)paramd.a(net.time4j.e1.a.l, j.c);
    if (paramd.b(net.time4j.e1.a.m)) {
      b = ((Character)paramd.a(net.time4j.e1.a.m)).charValue();
    } else if (j1.b()) {
      b = j1.a().charAt(0);
    } else {
      b = 48;
    } 
    int i = ((Integer)paramd.a(net.time4j.e1.a.s, Integer.valueOf(0))).intValue();
    if (j1 == j.c && b == 48 && this.d && i == 0 && this.c.getType() == Integer.class && !this.i) {
      bool = true;
    } else {
      bool = false;
    } 
    return new r(this.c, this.d, this.e, this.f, this.g, this.h, paramInt, b, j1, (g)paramd.a(net.time4j.e1.a.f, g.d), i, bool);
  }
  
  public void a(CharSequence paramCharSequence, s params, d paramd, t<?> paramt, boolean paramBoolean) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface length : ()I
    //   6: istore #6
    //   8: aload_2
    //   9: invokevirtual f : ()I
    //   12: istore #9
    //   14: iload #5
    //   16: ifeq -> 320
    //   19: aload_0
    //   20: getfield p : Z
    //   23: ifeq -> 320
    //   26: iload #9
    //   28: iload #6
    //   30: if_icmplt -> 78
    //   33: new java/lang/StringBuilder
    //   36: dup
    //   37: invokespecial <init> : ()V
    //   40: astore_1
    //   41: aload_1
    //   42: ldc_w 'Missing digits for: '
    //   45: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   48: pop
    //   49: aload_1
    //   50: aload_0
    //   51: getfield c : Lnet/time4j/d1/p;
    //   54: invokeinterface name : ()Ljava/lang/String;
    //   59: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   62: pop
    //   63: aload_2
    //   64: iload #9
    //   66: aload_1
    //   67: invokevirtual toString : ()Ljava/lang/String;
    //   70: invokevirtual a : (ILjava/lang/String;)V
    //   73: aload_2
    //   74: invokevirtual k : ()V
    //   77: return
    //   78: aload_1
    //   79: iload #9
    //   81: invokeinterface charAt : (I)C
    //   86: istore #7
    //   88: iload #7
    //   90: bipush #45
    //   92: if_icmpeq -> 310
    //   95: iload #7
    //   97: bipush #43
    //   99: if_icmpne -> 105
    //   102: goto -> 310
    //   105: aload_0
    //   106: getfield e : I
    //   109: iload #9
    //   111: iadd
    //   112: istore #8
    //   114: iload #6
    //   116: iload #8
    //   118: invokestatic min : (II)I
    //   121: istore #6
    //   123: iload #9
    //   125: istore #7
    //   127: lconst_0
    //   128: lstore #20
    //   130: iload #7
    //   132: iload #6
    //   134: if_icmpge -> 183
    //   137: aload_1
    //   138: iload #7
    //   140: invokeinterface charAt : (I)C
    //   145: bipush #48
    //   147: isub
    //   148: istore #10
    //   150: iload #10
    //   152: iflt -> 183
    //   155: iload #10
    //   157: bipush #9
    //   159: if_icmpgt -> 183
    //   162: lload #20
    //   164: ldc2_w 10
    //   167: lmul
    //   168: iload #10
    //   170: i2l
    //   171: ladd
    //   172: lstore #20
    //   174: iload #7
    //   176: iconst_1
    //   177: iadd
    //   178: istore #7
    //   180: goto -> 130
    //   183: lload #20
    //   185: ldc2_w 2147483647
    //   188: lcmp
    //   189: ifle -> 226
    //   192: new java/lang/StringBuilder
    //   195: dup
    //   196: invokespecial <init> : ()V
    //   199: astore_1
    //   200: aload_1
    //   201: ldc_w 'Parsed number does not fit into an integer: '
    //   204: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   207: pop
    //   208: aload_1
    //   209: lload #20
    //   211: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   214: pop
    //   215: aload_2
    //   216: iload #9
    //   218: aload_1
    //   219: invokevirtual toString : ()Ljava/lang/String;
    //   222: invokevirtual a : (ILjava/lang/String;)V
    //   225: return
    //   226: iload #7
    //   228: iload #8
    //   230: if_icmpge -> 291
    //   233: iload #7
    //   235: iload #9
    //   237: if_icmpne -> 250
    //   240: aload_2
    //   241: iload #9
    //   243: ldc_w 'Digit expected.'
    //   246: invokevirtual a : (ILjava/lang/String;)V
    //   249: return
    //   250: new java/lang/StringBuilder
    //   253: dup
    //   254: invokespecial <init> : ()V
    //   257: astore_1
    //   258: aload_1
    //   259: ldc_w 'Not enough digits found for: '
    //   262: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   265: pop
    //   266: aload_1
    //   267: aload_0
    //   268: getfield c : Lnet/time4j/d1/p;
    //   271: invokeinterface name : ()Ljava/lang/String;
    //   276: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   279: pop
    //   280: aload_2
    //   281: iload #9
    //   283: aload_1
    //   284: invokevirtual toString : ()Ljava/lang/String;
    //   287: invokevirtual a : (ILjava/lang/String;)V
    //   290: return
    //   291: aload #4
    //   293: aload_0
    //   294: getfield c : Lnet/time4j/d1/p;
    //   297: lload #20
    //   299: l2i
    //   300: invokevirtual b : (Lnet/time4j/d1/p;I)V
    //   303: aload_2
    //   304: iload #7
    //   306: invokevirtual a : (I)V
    //   309: return
    //   310: aload_2
    //   311: iload #9
    //   313: ldc_w 'Sign not allowed due to sign policy.'
    //   316: invokevirtual a : (ILjava/lang/String;)V
    //   319: return
    //   320: iload #5
    //   322: ifeq -> 334
    //   325: aload_0
    //   326: getfield n : I
    //   329: istore #10
    //   331: goto -> 355
    //   334: aload_3
    //   335: getstatic net/time4j/e1/a.s : Lnet/time4j/d1/c;
    //   338: iconst_0
    //   339: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   342: invokeinterface a : (Lnet/time4j/d1/c;Ljava/lang/Object;)Ljava/lang/Object;
    //   347: checkcast java/lang/Integer
    //   350: invokevirtual intValue : ()I
    //   353: istore #10
    //   355: iload #6
    //   357: istore #11
    //   359: iload #10
    //   361: ifle -> 371
    //   364: iload #6
    //   366: iload #10
    //   368: isub
    //   369: istore #11
    //   371: iload #9
    //   373: iload #11
    //   375: if_icmplt -> 423
    //   378: new java/lang/StringBuilder
    //   381: dup
    //   382: invokespecial <init> : ()V
    //   385: astore_1
    //   386: aload_1
    //   387: ldc_w 'Missing digits for: '
    //   390: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   393: pop
    //   394: aload_1
    //   395: aload_0
    //   396: getfield c : Lnet/time4j/d1/p;
    //   399: invokeinterface name : ()Ljava/lang/String;
    //   404: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   407: pop
    //   408: aload_2
    //   409: iload #9
    //   411: aload_1
    //   412: invokevirtual toString : ()Ljava/lang/String;
    //   415: invokevirtual a : (ILjava/lang/String;)V
    //   418: aload_2
    //   419: invokevirtual k : ()V
    //   422: return
    //   423: aload_0
    //   424: getfield i : Z
    //   427: ifeq -> 547
    //   430: aload_0
    //   431: getfield c : Lnet/time4j/d1/p;
    //   434: astore #24
    //   436: aload #24
    //   438: instanceof net/time4j/e1/b0/a
    //   441: ifeq -> 547
    //   444: ldc net/time4j/e1/b0/a
    //   446: aload #24
    //   448: invokevirtual cast : (Ljava/lang/Object;)Ljava/lang/Object;
    //   451: checkcast net/time4j/e1/b0/a
    //   454: aload_1
    //   455: aload_2
    //   456: invokevirtual e : ()Ljava/text/ParsePosition;
    //   459: aload_3
    //   460: aload #4
    //   462: invokeinterface a : (Ljava/lang/CharSequence;Ljava/text/ParsePosition;Lnet/time4j/d1/d;Lnet/time4j/d1/q;)Ljava/lang/Integer;
    //   467: astore_1
    //   468: aload_2
    //   469: invokevirtual i : ()Z
    //   472: ifeq -> 522
    //   475: aload_2
    //   476: invokevirtual c : ()I
    //   479: istore #6
    //   481: new java/lang/StringBuilder
    //   484: dup
    //   485: invokespecial <init> : ()V
    //   488: astore_1
    //   489: aload_1
    //   490: ldc_w 'Unparseable element: '
    //   493: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   496: pop
    //   497: aload_1
    //   498: aload_0
    //   499: getfield c : Lnet/time4j/d1/p;
    //   502: invokeinterface name : ()Ljava/lang/String;
    //   507: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   510: pop
    //   511: aload_2
    //   512: iload #6
    //   514: aload_1
    //   515: invokevirtual toString : ()Ljava/lang/String;
    //   518: invokevirtual a : (ILjava/lang/String;)V
    //   521: return
    //   522: aload_1
    //   523: ifnonnull -> 536
    //   526: aload_2
    //   527: iload #9
    //   529: ldc_w 'No interpretable value.'
    //   532: invokevirtual a : (ILjava/lang/String;)V
    //   535: return
    //   536: aload #4
    //   538: aload_0
    //   539: getfield c : Lnet/time4j/d1/p;
    //   542: aload_1
    //   543: invokevirtual c : (Lnet/time4j/d1/p;Ljava/lang/Object;)V
    //   546: return
    //   547: iload #5
    //   549: ifeq -> 580
    //   552: aload_0
    //   553: getfield m : Lnet/time4j/e1/j;
    //   556: astore #24
    //   558: aload #24
    //   560: invokevirtual b : ()Z
    //   563: istore #19
    //   565: aload_0
    //   566: getfield o : I
    //   569: istore #7
    //   571: aload_0
    //   572: getfield l : C
    //   575: istore #12
    //   577: goto -> 671
    //   580: aload_3
    //   581: getstatic net/time4j/e1/a.l : Lnet/time4j/d1/c;
    //   584: getstatic net/time4j/e1/j.c : Lnet/time4j/e1/j;
    //   587: invokeinterface a : (Lnet/time4j/d1/c;Ljava/lang/Object;)Ljava/lang/Object;
    //   592: checkcast net/time4j/e1/j
    //   595: astore #24
    //   597: aload #24
    //   599: invokevirtual b : ()Z
    //   602: istore #19
    //   604: aload_0
    //   605: aload #24
    //   607: invokespecial a : (Lnet/time4j/e1/j;)I
    //   610: istore #7
    //   612: aload_3
    //   613: getstatic net/time4j/e1/a.m : Lnet/time4j/d1/c;
    //   616: invokeinterface b : (Lnet/time4j/d1/c;)Z
    //   621: ifeq -> 644
    //   624: aload_3
    //   625: getstatic net/time4j/e1/a.m : Lnet/time4j/d1/c;
    //   628: invokeinterface a : (Lnet/time4j/d1/c;)Ljava/lang/Object;
    //   633: checkcast java/lang/Character
    //   636: invokevirtual charValue : ()C
    //   639: istore #6
    //   641: goto -> 667
    //   644: iload #19
    //   646: ifeq -> 663
    //   649: aload #24
    //   651: invokevirtual a : ()Ljava/lang/String;
    //   654: iconst_0
    //   655: invokevirtual charAt : (I)C
    //   658: istore #6
    //   660: goto -> 667
    //   663: bipush #48
    //   665: istore #6
    //   667: iload #6
    //   669: istore #12
    //   671: iload #5
    //   673: ifeq -> 684
    //   676: aload_0
    //   677: getfield j : Lnet/time4j/e1/g;
    //   680: astore_3
    //   681: goto -> 700
    //   684: aload_3
    //   685: getstatic net/time4j/e1/a.f : Lnet/time4j/d1/c;
    //   688: getstatic net/time4j/e1/g.d : Lnet/time4j/e1/g;
    //   691: invokeinterface a : (Lnet/time4j/d1/c;Ljava/lang/Object;)Ljava/lang/Object;
    //   696: checkcast net/time4j/e1/g
    //   699: astore_3
    //   700: iload #19
    //   702: ifeq -> 734
    //   705: aload_0
    //   706: getfield d : Z
    //   709: ifne -> 719
    //   712: aload_3
    //   713: invokevirtual a : ()Z
    //   716: ifne -> 734
    //   719: aload_0
    //   720: getfield e : I
    //   723: istore #15
    //   725: aload_0
    //   726: getfield f : I
    //   729: istore #8
    //   731: goto -> 741
    //   734: iconst_1
    //   735: istore #15
    //   737: iload #7
    //   739: istore #8
    //   741: aload_1
    //   742: iload #9
    //   744: invokeinterface charAt : (I)C
    //   749: istore #7
    //   751: iload #7
    //   753: bipush #45
    //   755: if_icmpeq -> 809
    //   758: iload #7
    //   760: bipush #43
    //   762: if_icmpne -> 768
    //   765: goto -> 809
    //   768: aload_0
    //   769: getfield g : Lnet/time4j/e1/a0/x;
    //   772: getstatic net/time4j/e1/a0/x.f : Lnet/time4j/e1/a0/x;
    //   775: if_acmpne -> 795
    //   778: aload_3
    //   779: invokevirtual c : ()Z
    //   782: ifeq -> 795
    //   785: aload_2
    //   786: iload #9
    //   788: ldc_w 'Missing sign of number.'
    //   791: invokevirtual a : (ILjava/lang/String;)V
    //   794: return
    //   795: iconst_0
    //   796: istore #14
    //   798: iload #9
    //   800: istore #6
    //   802: iload #6
    //   804: istore #13
    //   806: goto -> 910
    //   809: aload_0
    //   810: getfield g : Lnet/time4j/e1/a0/x;
    //   813: getstatic net/time4j/e1/a0/x.c : Lnet/time4j/e1/a0/x;
    //   816: if_acmpne -> 843
    //   819: aload_0
    //   820: getfield d : Z
    //   823: ifne -> 833
    //   826: aload_3
    //   827: invokevirtual c : ()Z
    //   830: ifeq -> 843
    //   833: aload_2
    //   834: iload #9
    //   836: ldc_w 'Sign not allowed due to sign policy.'
    //   839: invokevirtual a : (ILjava/lang/String;)V
    //   842: return
    //   843: aload_0
    //   844: getfield g : Lnet/time4j/e1/a0/x;
    //   847: getstatic net/time4j/e1/a0/x.d : Lnet/time4j/e1/a0/x;
    //   850: if_acmpne -> 877
    //   853: iload #7
    //   855: bipush #43
    //   857: if_icmpne -> 877
    //   860: aload_3
    //   861: invokevirtual c : ()Z
    //   864: ifeq -> 877
    //   867: aload_2
    //   868: iload #9
    //   870: ldc_w 'Positive sign not allowed due to sign policy.'
    //   873: invokevirtual a : (ILjava/lang/String;)V
    //   876: return
    //   877: iload #7
    //   879: bipush #45
    //   881: if_icmpne -> 890
    //   884: iconst_1
    //   885: istore #6
    //   887: goto -> 893
    //   890: iconst_0
    //   891: istore #6
    //   893: iload #9
    //   895: iconst_1
    //   896: iadd
    //   897: istore #9
    //   899: iload #6
    //   901: istore #14
    //   903: iload #9
    //   905: istore #6
    //   907: goto -> 802
    //   910: iload #6
    //   912: iload #11
    //   914: if_icmplt -> 958
    //   917: new java/lang/StringBuilder
    //   920: dup
    //   921: invokespecial <init> : ()V
    //   924: astore_1
    //   925: aload_1
    //   926: ldc_w 'Missing digits for: '
    //   929: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   932: pop
    //   933: aload_1
    //   934: aload_0
    //   935: getfield c : Lnet/time4j/d1/p;
    //   938: invokeinterface name : ()Ljava/lang/String;
    //   943: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   946: pop
    //   947: aload_2
    //   948: iload #13
    //   950: aload_1
    //   951: invokevirtual toString : ()Ljava/lang/String;
    //   954: invokevirtual a : (ILjava/lang/String;)V
    //   957: return
    //   958: aload_0
    //   959: getfield d : Z
    //   962: ifne -> 1141
    //   965: aload_0
    //   966: getfield k : I
    //   969: ifle -> 1141
    //   972: iload #10
    //   974: ifgt -> 1141
    //   977: iload #19
    //   979: ifeq -> 1059
    //   982: iload #6
    //   984: istore #17
    //   986: iconst_0
    //   987: istore #9
    //   989: iload #17
    //   991: iload #11
    //   993: if_icmpge -> 1052
    //   996: aload_1
    //   997: iload #17
    //   999: invokeinterface charAt : (I)C
    //   1004: iload #12
    //   1006: isub
    //   1007: istore #18
    //   1009: iload #18
    //   1011: iflt -> 1052
    //   1014: iload #7
    //   1016: istore #10
    //   1018: iload #9
    //   1020: istore #16
    //   1022: iload #10
    //   1024: istore #7
    //   1026: iload #18
    //   1028: bipush #9
    //   1030: if_icmpgt -> 1124
    //   1033: iload #9
    //   1035: iconst_1
    //   1036: iadd
    //   1037: istore #9
    //   1039: iload #17
    //   1041: iconst_1
    //   1042: iadd
    //   1043: istore #17
    //   1045: iload #10
    //   1047: istore #7
    //   1049: goto -> 989
    //   1052: iload #9
    //   1054: istore #16
    //   1056: goto -> 1124
    //   1059: iload #7
    //   1061: istore #10
    //   1063: iload #6
    //   1065: istore #17
    //   1067: iconst_0
    //   1068: istore #9
    //   1070: iload #9
    //   1072: istore #16
    //   1074: iload #10
    //   1076: istore #7
    //   1078: iload #17
    //   1080: iload #11
    //   1082: if_icmpge -> 1124
    //   1085: iload #9
    //   1087: istore #16
    //   1089: iload #10
    //   1091: istore #7
    //   1093: aload #24
    //   1095: aload_1
    //   1096: iload #17
    //   1098: invokeinterface charAt : (I)C
    //   1103: invokevirtual a : (C)Z
    //   1106: ifeq -> 1124
    //   1109: iload #9
    //   1111: iconst_1
    //   1112: iadd
    //   1113: istore #9
    //   1115: iload #17
    //   1117: iconst_1
    //   1118: iadd
    //   1119: istore #17
    //   1121: goto -> 1070
    //   1124: iload #8
    //   1126: iload #16
    //   1128: aload_0
    //   1129: getfield k : I
    //   1132: isub
    //   1133: invokestatic min : (II)I
    //   1136: istore #8
    //   1138: goto -> 1141
    //   1141: iload #6
    //   1143: iload #15
    //   1145: iadd
    //   1146: istore #9
    //   1148: iload #11
    //   1150: iload #8
    //   1152: iload #6
    //   1154: iadd
    //   1155: invokestatic min : (II)I
    //   1158: istore #10
    //   1160: iload #19
    //   1162: ifeq -> 1224
    //   1165: lconst_0
    //   1166: lstore #20
    //   1168: iload #6
    //   1170: iload #10
    //   1172: if_icmpge -> 1221
    //   1175: aload_1
    //   1176: iload #6
    //   1178: invokeinterface charAt : (I)C
    //   1183: iload #12
    //   1185: isub
    //   1186: istore #8
    //   1188: iload #8
    //   1190: iflt -> 1221
    //   1193: iload #8
    //   1195: bipush #9
    //   1197: if_icmpgt -> 1221
    //   1200: lload #20
    //   1202: ldc2_w 10
    //   1205: lmul
    //   1206: iload #8
    //   1208: i2l
    //   1209: ladd
    //   1210: lstore #20
    //   1212: iload #6
    //   1214: iconst_1
    //   1215: iadd
    //   1216: istore #6
    //   1218: goto -> 1168
    //   1221: goto -> 1319
    //   1224: iconst_0
    //   1225: istore #8
    //   1227: iload #6
    //   1229: iload #10
    //   1231: if_icmpge -> 1265
    //   1234: aload #24
    //   1236: aload_1
    //   1237: iload #6
    //   1239: invokeinterface charAt : (I)C
    //   1244: invokevirtual a : (C)Z
    //   1247: ifeq -> 1265
    //   1250: iload #8
    //   1252: iconst_1
    //   1253: iadd
    //   1254: istore #8
    //   1256: iload #6
    //   1258: iconst_1
    //   1259: iadd
    //   1260: istore #6
    //   1262: goto -> 1227
    //   1265: iload #8
    //   1267: ifle -> 1316
    //   1270: aload #24
    //   1272: aload_1
    //   1273: iload #6
    //   1275: iload #8
    //   1277: isub
    //   1278: iload #6
    //   1280: invokeinterface subSequence : (II)Ljava/lang/CharSequence;
    //   1285: invokeinterface toString : ()Ljava/lang/String;
    //   1290: aload_3
    //   1291: invokevirtual a : (Ljava/lang/String;Lnet/time4j/e1/g;)I
    //   1294: istore #8
    //   1296: iload #8
    //   1298: i2l
    //   1299: lstore #20
    //   1301: goto -> 1319
    //   1304: astore_1
    //   1305: aload_2
    //   1306: iload #13
    //   1308: aload_1
    //   1309: invokevirtual getMessage : ()Ljava/lang/String;
    //   1312: invokevirtual a : (ILjava/lang/String;)V
    //   1315: return
    //   1316: lconst_0
    //   1317: lstore #20
    //   1319: aload_0
    //   1320: getfield c : Lnet/time4j/d1/p;
    //   1323: invokeinterface getType : ()Ljava/lang/Class;
    //   1328: astore #24
    //   1330: lload #20
    //   1332: ldc2_w 2147483647
    //   1335: lcmp
    //   1336: ifle -> 1380
    //   1339: aload #24
    //   1341: ldc java/lang/Integer
    //   1343: if_acmpne -> 1380
    //   1346: new java/lang/StringBuilder
    //   1349: dup
    //   1350: invokespecial <init> : ()V
    //   1353: astore_1
    //   1354: aload_1
    //   1355: ldc_w 'Parsed number does not fit into an integer: '
    //   1358: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1361: pop
    //   1362: aload_1
    //   1363: lload #20
    //   1365: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   1368: pop
    //   1369: aload_2
    //   1370: iload #13
    //   1372: aload_1
    //   1373: invokevirtual toString : ()Ljava/lang/String;
    //   1376: invokevirtual a : (ILjava/lang/String;)V
    //   1379: return
    //   1380: iload #6
    //   1382: iload #9
    //   1384: if_icmpge -> 1459
    //   1387: iload #6
    //   1389: iload #13
    //   1391: if_icmpne -> 1404
    //   1394: aload_2
    //   1395: iload #13
    //   1397: ldc_w 'Digit expected.'
    //   1400: invokevirtual a : (ILjava/lang/String;)V
    //   1403: return
    //   1404: aload_0
    //   1405: getfield d : Z
    //   1408: ifne -> 1418
    //   1411: aload_3
    //   1412: invokevirtual a : ()Z
    //   1415: ifne -> 1459
    //   1418: new java/lang/StringBuilder
    //   1421: dup
    //   1422: invokespecial <init> : ()V
    //   1425: astore_1
    //   1426: aload_1
    //   1427: ldc_w 'Not enough digits found for: '
    //   1430: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1433: pop
    //   1434: aload_1
    //   1435: aload_0
    //   1436: getfield c : Lnet/time4j/d1/p;
    //   1439: invokeinterface name : ()Ljava/lang/String;
    //   1444: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1447: pop
    //   1448: aload_2
    //   1449: iload #13
    //   1451: aload_1
    //   1452: invokevirtual toString : ()Ljava/lang/String;
    //   1455: invokevirtual a : (ILjava/lang/String;)V
    //   1458: return
    //   1459: iload #14
    //   1461: ifeq -> 1498
    //   1464: lload #20
    //   1466: lconst_0
    //   1467: lcmp
    //   1468: ifne -> 1490
    //   1471: aload_3
    //   1472: invokevirtual c : ()Z
    //   1475: ifeq -> 1490
    //   1478: aload_2
    //   1479: iload #13
    //   1481: iconst_1
    //   1482: isub
    //   1483: ldc_w 'Negative zero is not allowed.'
    //   1486: invokevirtual a : (ILjava/lang/String;)V
    //   1489: return
    //   1490: lload #20
    //   1492: lneg
    //   1493: lstore #22
    //   1495: goto -> 1603
    //   1498: lload #20
    //   1500: lstore #22
    //   1502: aload_0
    //   1503: getfield g : Lnet/time4j/e1/a0/x;
    //   1506: getstatic net/time4j/e1/a0/x.e : Lnet/time4j/e1/a0/x;
    //   1509: if_acmpne -> 1495
    //   1512: lload #20
    //   1514: lstore #22
    //   1516: aload_3
    //   1517: invokevirtual c : ()Z
    //   1520: ifeq -> 1495
    //   1523: lload #20
    //   1525: lstore #22
    //   1527: iload #19
    //   1529: ifeq -> 1495
    //   1532: iload #7
    //   1534: istore #8
    //   1536: iload #8
    //   1538: bipush #43
    //   1540: if_icmpne -> 1568
    //   1543: iload #6
    //   1545: iload #9
    //   1547: if_icmpgt -> 1568
    //   1550: aload_2
    //   1551: iload #13
    //   1553: iconst_1
    //   1554: isub
    //   1555: ldc_w 'Positive sign only allowed for big number.'
    //   1558: invokevirtual a : (ILjava/lang/String;)V
    //   1561: lload #20
    //   1563: lstore #22
    //   1565: goto -> 1603
    //   1568: lload #20
    //   1570: lstore #22
    //   1572: iload #8
    //   1574: bipush #43
    //   1576: if_icmpeq -> 1603
    //   1579: lload #20
    //   1581: lstore #22
    //   1583: iload #6
    //   1585: iload #9
    //   1587: if_icmple -> 1603
    //   1590: aload_2
    //   1591: iload #13
    //   1593: ldc_w 'Positive sign must be present for big number.'
    //   1596: invokevirtual a : (ILjava/lang/String;)V
    //   1599: lload #20
    //   1601: lstore #22
    //   1603: aload #24
    //   1605: ldc java/lang/Integer
    //   1607: if_acmpne -> 1631
    //   1610: aload_0
    //   1611: getfield c : Lnet/time4j/d1/p;
    //   1614: astore_1
    //   1615: lload #22
    //   1617: l2i
    //   1618: istore #7
    //   1620: aload #4
    //   1622: aload_1
    //   1623: iload #7
    //   1625: invokevirtual b : (Lnet/time4j/d1/p;I)V
    //   1628: goto -> 1808
    //   1631: aload #4
    //   1633: astore_1
    //   1634: aload #24
    //   1636: ldc java/lang/Long
    //   1638: if_acmpne -> 1657
    //   1641: aload_1
    //   1642: aload_0
    //   1643: getfield c : Lnet/time4j/d1/p;
    //   1646: lload #22
    //   1648: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1651: invokevirtual c : (Lnet/time4j/d1/p;Ljava/lang/Object;)V
    //   1654: goto -> 1808
    //   1657: aload_0
    //   1658: getfield c : Lnet/time4j/d1/p;
    //   1661: getstatic net/time4j/f0.u : Lnet/time4j/c0;
    //   1664: if_acmpne -> 1679
    //   1667: getstatic net/time4j/f0.v : Lnet/time4j/j0;
    //   1670: astore_1
    //   1671: lload #22
    //   1673: l2i
    //   1674: istore #7
    //   1676: goto -> 1620
    //   1679: ldc_w java/lang/Enum
    //   1682: aload #24
    //   1684: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   1687: ifeq -> 1815
    //   1690: aload_0
    //   1691: getfield c : Lnet/time4j/d1/p;
    //   1694: astore_3
    //   1695: aload_3
    //   1696: instanceof net/time4j/e1/l
    //   1699: ifeq -> 1720
    //   1702: aload_3
    //   1703: checkcast net/time4j/e1/l
    //   1706: aload_1
    //   1707: lload #22
    //   1709: l2i
    //   1710: invokeinterface a : (Lnet/time4j/d1/q;I)Z
    //   1715: istore #5
    //   1717: goto -> 1723
    //   1720: iconst_0
    //   1721: istore #5
    //   1723: iload #5
    //   1725: ifne -> 1808
    //   1728: iload #7
    //   1730: bipush #45
    //   1732: if_icmpeq -> 1746
    //   1735: iload #13
    //   1737: istore #6
    //   1739: iload #7
    //   1741: bipush #43
    //   1743: if_icmpne -> 1752
    //   1746: iload #13
    //   1748: iconst_1
    //   1749: isub
    //   1750: istore #6
    //   1752: new java/lang/StringBuilder
    //   1755: dup
    //   1756: invokespecial <init> : ()V
    //   1759: astore_1
    //   1760: aload_1
    //   1761: ldc_w '['
    //   1764: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1767: pop
    //   1768: aload_1
    //   1769: aload_0
    //   1770: getfield c : Lnet/time4j/d1/p;
    //   1773: invokeinterface name : ()Ljava/lang/String;
    //   1778: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1781: pop
    //   1782: aload_1
    //   1783: ldc_w '] No enum found for value: '
    //   1786: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1789: pop
    //   1790: aload_1
    //   1791: lload #22
    //   1793: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   1796: pop
    //   1797: aload_2
    //   1798: iload #6
    //   1800: aload_1
    //   1801: invokevirtual toString : ()Ljava/lang/String;
    //   1804: invokevirtual a : (ILjava/lang/String;)V
    //   1807: return
    //   1808: aload_2
    //   1809: iload #6
    //   1811: invokevirtual a : (I)V
    //   1814: return
    //   1815: new java/lang/StringBuilder
    //   1818: dup
    //   1819: invokespecial <init> : ()V
    //   1822: astore_1
    //   1823: aload_1
    //   1824: ldc_w 'Not parseable: '
    //   1827: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1830: pop
    //   1831: aload_1
    //   1832: aload_0
    //   1833: getfield c : Lnet/time4j/d1/p;
    //   1836: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1839: pop
    //   1840: new java/lang/IllegalArgumentException
    //   1843: dup
    //   1844: aload_1
    //   1845: invokevirtual toString : ()Ljava/lang/String;
    //   1848: invokespecial <init> : (Ljava/lang/String;)V
    //   1851: astore_1
    //   1852: goto -> 1857
    //   1855: aload_1
    //   1856: athrow
    //   1857: goto -> 1855
    // Exception table:
    //   from	to	target	type
    //   1270	1296	1304	java/lang/NumberFormatException
  }
  
  public boolean a() {
    return true;
  }
  
  public p<V> b() {
    return this.c;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof r) {
      paramObject = paramObject;
      return (this.c.equals(((r)paramObject).c) && this.d == ((r)paramObject).d && this.e == ((r)paramObject).e && this.f == ((r)paramObject).f && this.g == ((r)paramObject).g && this.h == ((r)paramObject).h);
    } 
    return false;
  }
  
  public int hashCode() {
    return this.c.hashCode() * 7 + (this.e + this.f * 10) * 31;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(64);
    stringBuilder.append(r.class.getName());
    stringBuilder.append("[element=");
    stringBuilder.append(this.c.name());
    stringBuilder.append(", fixed-width-mode=");
    stringBuilder.append(this.d);
    stringBuilder.append(", min-digits=");
    stringBuilder.append(this.e);
    stringBuilder.append(", max-digits=");
    stringBuilder.append(this.f);
    stringBuilder.append(", sign-policy=");
    stringBuilder.append(this.g);
    stringBuilder.append(", protected-mode=");
    stringBuilder.append(this.h);
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/e1/a0/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */