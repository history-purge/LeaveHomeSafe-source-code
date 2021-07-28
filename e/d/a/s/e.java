package e.d.a.s;

import e.d.b.k;
import e.d.b.m;
import java.util.HashSet;
import java.util.Set;

public class e {
  private static int a(int paramInt1, int paramInt2) {
    return paramInt1 + 2 + paramInt2 * 12;
  }
  
  private static void a(b paramb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, k paramk) {
    m m;
    double[] arrayOfDouble;
    float[] arrayOfFloat;
    int[] arrayOfInt2;
    short[] arrayOfShort2;
    byte[] arrayOfByte;
    long[] arrayOfLong;
    int[] arrayOfInt1;
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool4 = false;
    boolean bool5 = false;
    boolean bool6 = false;
    boolean bool7 = false;
    boolean bool8 = false;
    boolean bool9 = false;
    int i = 0;
    switch (paramInt4) {
      default:
        paramb.a(String.format("Invalid TIFF tag format code %d for tag 0x%04X", new Object[] { Integer.valueOf(paramInt4), Integer.valueOf(paramInt1) }));
        return;
      case 12:
        if (paramInt3 == 1) {
          paramb.a(paramInt1, paramk.c(paramInt2));
          return;
        } 
        arrayOfDouble = new double[paramInt3];
        for (paramInt4 = i; paramInt4 < paramInt3; paramInt4++)
          arrayOfDouble[paramInt4] = paramk.c(paramInt4 * 4 + paramInt2); 
        paramb.a(paramInt1, arrayOfDouble);
        return;
      case 11:
        if (paramInt3 == 1) {
          paramb.a(paramInt1, paramk.d(paramInt2));
          return;
        } 
        arrayOfFloat = new float[paramInt3];
        for (paramInt4 = bool1; paramInt4 < paramInt3; paramInt4++)
          arrayOfFloat[paramInt4] = paramk.d(paramInt4 * 4 + paramInt2); 
        paramb.a(paramInt1, arrayOfFloat);
        return;
      case 10:
        if (paramInt3 == 1) {
          m = new m(paramk.g(paramInt2), paramk.g(paramInt2 + 4));
        } else {
          if (paramInt3 > 1) {
            m[] arrayOfM = new m[paramInt3];
            for (paramInt4 = bool2; paramInt4 < paramInt3; paramInt4++) {
              i = paramInt4 * 8;
              arrayOfM[paramInt4] = new m(m.g(paramInt2 + i), m.g(paramInt2 + 4 + i));
            } 
            paramb.a(paramInt1, arrayOfM);
            return;
          } 
          return;
        } 
        paramb.a(paramInt1, m);
        return;
      case 9:
        if (paramInt3 == 1) {
          paramb.c(paramInt1, m.g(paramInt2));
          return;
        } 
        arrayOfInt2 = new int[paramInt3];
        for (paramInt4 = bool3; paramInt4 < paramInt3; paramInt4++)
          arrayOfInt2[paramInt4] = m.g(paramInt4 * 4 + paramInt2); 
        paramb.a(paramInt1, arrayOfInt2);
        return;
      case 8:
        if (paramInt3 == 1) {
          paramb.b(paramInt1, m.e(paramInt2));
          return;
        } 
        arrayOfShort2 = new short[paramInt3];
        for (paramInt4 = bool4; paramInt4 < paramInt3; paramInt4++)
          arrayOfShort2[paramInt4] = m.e(paramInt4 * 2 + paramInt2); 
        paramb.b(paramInt1, arrayOfShort2);
        return;
      case 7:
        paramb.a(paramInt1, m.a(paramInt2, paramInt3));
        return;
      case 6:
        if (paramInt3 == 1) {
          paramb.a(paramInt1, m.i(paramInt2));
          return;
        } 
        arrayOfByte = new byte[paramInt3];
        for (paramInt4 = bool5; paramInt4 < paramInt3; paramInt4++)
          arrayOfByte[paramInt4] = m.i(paramInt2 + paramInt4); 
        paramb.b(paramInt1, arrayOfByte);
        return;
      case 5:
        if (paramInt3 == 1) {
          m = new m(m.l(paramInt2), m.l(paramInt2 + 4));
        } else {
          if (paramInt3 > 1) {
            m[] arrayOfM = new m[paramInt3];
            for (paramInt4 = bool6; paramInt4 < paramInt3; paramInt4++) {
              i = paramInt4 * 8;
              arrayOfM[paramInt4] = new m(m.l(paramInt2 + i), m.l(paramInt2 + 4 + i));
            } 
            paramb.a(paramInt1, arrayOfM);
            return;
          } 
          return;
        } 
        paramb.a(paramInt1, m);
        return;
      case 4:
        if (paramInt3 == 1) {
          paramb.a(paramInt1, m.l(paramInt2));
          return;
        } 
        arrayOfLong = new long[paramInt3];
        for (paramInt4 = bool7; paramInt4 < paramInt3; paramInt4++)
          arrayOfLong[paramInt4] = m.l(paramInt4 * 4 + paramInt2); 
        paramb.a(paramInt1, arrayOfLong);
        return;
      case 3:
        if (paramInt3 == 1) {
          paramb.a(paramInt1, m.k(paramInt2));
          return;
        } 
        arrayOfInt1 = new int[paramInt3];
        for (paramInt4 = bool8; paramInt4 < paramInt3; paramInt4++)
          arrayOfInt1[paramInt4] = m.k(paramInt4 * 2 + paramInt2); 
        paramb.b(paramInt1, arrayOfInt1);
        return;
      case 2:
        paramb.a(paramInt1, m.b(paramInt2, paramInt3, null));
        return;
      case 1:
        break;
    } 
    if (paramInt3 == 1) {
      paramb.a(paramInt1, m.m(paramInt2));
      return;
    } 
    short[] arrayOfShort1 = new short[paramInt3];
    for (paramInt4 = bool9; paramInt4 < paramInt3; paramInt4++)
      arrayOfShort1[paramInt4] = m.m(paramInt2 + paramInt4); 
    paramb.a(paramInt1, arrayOfShort1);
  }
  
  public static void a(b paramb, k paramk, Set<Integer> paramSet, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aconst_null
    //   1: astore #22
    //   3: aconst_null
    //   4: astore #21
    //   6: aload #22
    //   8: astore #20
    //   10: aload_2
    //   11: iload_3
    //   12: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   15: invokeinterface contains : (Ljava/lang/Object;)Z
    //   20: istore #13
    //   22: iload #13
    //   24: ifeq -> 34
    //   27: aload_0
    //   28: invokeinterface b : ()V
    //   33: return
    //   34: aload #22
    //   36: astore #20
    //   38: aload_2
    //   39: iload_3
    //   40: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   43: invokeinterface add : (Ljava/lang/Object;)Z
    //   48: pop
    //   49: aload #22
    //   51: astore #20
    //   53: iload_3
    //   54: i2l
    //   55: aload_1
    //   56: invokevirtual a : ()J
    //   59: lcmp
    //   60: ifge -> 890
    //   63: iload_3
    //   64: ifge -> 70
    //   67: goto -> 890
    //   70: aload #22
    //   72: astore #20
    //   74: aload_1
    //   75: iload_3
    //   76: invokevirtual k : (I)I
    //   79: istore #6
    //   81: aload #21
    //   83: astore #20
    //   85: iload #6
    //   87: istore #5
    //   89: iload #6
    //   91: sipush #255
    //   94: if_icmple -> 165
    //   97: aload #21
    //   99: astore #20
    //   101: iload #6
    //   103: istore #5
    //   105: iload #6
    //   107: sipush #255
    //   110: iand
    //   111: ifne -> 165
    //   114: aload #22
    //   116: astore #20
    //   118: aload_1
    //   119: invokevirtual b : ()Z
    //   122: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   125: astore #21
    //   127: iload #6
    //   129: bipush #8
    //   131: ishr
    //   132: istore #5
    //   134: aload #21
    //   136: astore #20
    //   138: aload_1
    //   139: invokevirtual b : ()Z
    //   142: ifne -> 938
    //   145: iconst_1
    //   146: istore #13
    //   148: goto -> 151
    //   151: aload #21
    //   153: astore #20
    //   155: aload_1
    //   156: iload #13
    //   158: invokevirtual a : (Z)V
    //   161: aload #21
    //   163: astore #20
    //   165: iload #5
    //   167: istore #7
    //   169: iload #7
    //   171: bipush #12
    //   173: imul
    //   174: iconst_2
    //   175: iadd
    //   176: iconst_4
    //   177: iadd
    //   178: iload_3
    //   179: iadd
    //   180: i2l
    //   181: lstore #14
    //   183: aload #20
    //   185: astore #21
    //   187: lload #14
    //   189: aload_1
    //   190: invokevirtual a : ()J
    //   193: lcmp
    //   194: ifle -> 230
    //   197: aload #20
    //   199: astore #21
    //   201: aload_0
    //   202: ldc 'Illegally sized IFD'
    //   204: invokeinterface a : (Ljava/lang/String;)V
    //   209: aload_0
    //   210: invokeinterface b : ()V
    //   215: aload #20
    //   217: ifnull -> 229
    //   220: aload_1
    //   221: aload #20
    //   223: invokevirtual booleanValue : ()Z
    //   226: invokevirtual a : (Z)V
    //   229: return
    //   230: iconst_0
    //   231: istore #8
    //   233: iconst_0
    //   234: istore #5
    //   236: iload #8
    //   238: iload #7
    //   240: if_icmpge -> 743
    //   243: aload #20
    //   245: astore #21
    //   247: iload_3
    //   248: iload #8
    //   250: invokestatic a : (II)I
    //   253: istore #6
    //   255: aload #20
    //   257: astore #21
    //   259: aload_1
    //   260: iload #6
    //   262: invokevirtual k : (I)I
    //   265: istore #11
    //   267: aload #20
    //   269: astore #21
    //   271: aload_1
    //   272: iload #6
    //   274: iconst_2
    //   275: iadd
    //   276: invokevirtual k : (I)I
    //   279: istore #12
    //   281: aload #20
    //   283: astore #21
    //   285: iload #12
    //   287: invokestatic a : (I)Le/d/a/s/a;
    //   290: astore #22
    //   292: aload #20
    //   294: astore #21
    //   296: aload_1
    //   297: iload #6
    //   299: iconst_4
    //   300: iadd
    //   301: invokevirtual l : (I)J
    //   304: lstore #18
    //   306: aload #22
    //   308: ifnonnull -> 435
    //   311: aload #20
    //   313: astore #21
    //   315: aload_0
    //   316: iload #11
    //   318: iload #12
    //   320: lload #18
    //   322: invokeinterface a : (IIJ)Ljava/lang/Long;
    //   327: astore #22
    //   329: aload #22
    //   331: ifnonnull -> 421
    //   334: aload #20
    //   336: astore #21
    //   338: aload_0
    //   339: ldc 'Invalid TIFF tag format code %d for tag 0x%04X'
    //   341: iconst_2
    //   342: anewarray java/lang/Object
    //   345: dup
    //   346: iconst_0
    //   347: iload #12
    //   349: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   352: aastore
    //   353: dup
    //   354: iconst_1
    //   355: iload #11
    //   357: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   360: aastore
    //   361: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   364: invokeinterface a : (Ljava/lang/String;)V
    //   369: iload #5
    //   371: iconst_1
    //   372: iadd
    //   373: istore #5
    //   375: iload #5
    //   377: iconst_5
    //   378: if_icmple -> 414
    //   381: aload #20
    //   383: astore #21
    //   385: aload_0
    //   386: ldc 'Stopping processing as too many errors seen in TIFF IFD'
    //   388: invokeinterface a : (Ljava/lang/String;)V
    //   393: aload_0
    //   394: invokeinterface b : ()V
    //   399: aload #20
    //   401: ifnull -> 413
    //   404: aload_1
    //   405: aload #20
    //   407: invokevirtual booleanValue : ()Z
    //   410: invokevirtual a : (Z)V
    //   413: return
    //   414: iload #5
    //   416: istore #6
    //   418: goto -> 980
    //   421: aload #20
    //   423: astore #21
    //   425: aload #22
    //   427: invokevirtual longValue : ()J
    //   430: lstore #14
    //   432: goto -> 454
    //   435: aload #20
    //   437: astore #21
    //   439: aload #22
    //   441: invokevirtual a : ()I
    //   444: istore #9
    //   446: iload #9
    //   448: i2l
    //   449: lload #18
    //   451: lmul
    //   452: lstore #14
    //   454: lload #14
    //   456: ldc2_w 4
    //   459: lcmp
    //   460: ifle -> 521
    //   463: aload #20
    //   465: astore #21
    //   467: aload_1
    //   468: iload #6
    //   470: bipush #8
    //   472: iadd
    //   473: invokevirtual l : (I)J
    //   476: lstore #16
    //   478: aload #20
    //   480: astore #21
    //   482: lload #16
    //   484: lload #14
    //   486: ladd
    //   487: aload_1
    //   488: invokevirtual a : ()J
    //   491: lcmp
    //   492: ifle -> 510
    //   495: aload #20
    //   497: astore #21
    //   499: aload_0
    //   500: ldc 'Illegal TIFF tag pointer offset'
    //   502: invokeinterface a : (Ljava/lang/String;)V
    //   507: goto -> 414
    //   510: iload #4
    //   512: i2l
    //   513: lload #16
    //   515: ladd
    //   516: lstore #16
    //   518: goto -> 529
    //   521: iload #6
    //   523: bipush #8
    //   525: iadd
    //   526: i2l
    //   527: lstore #16
    //   529: lload #16
    //   531: lconst_0
    //   532: lcmp
    //   533: iflt -> 728
    //   536: lload #16
    //   538: aload_1
    //   539: invokevirtual a : ()J
    //   542: lcmp
    //   543: ifle -> 549
    //   546: goto -> 728
    //   549: lload #14
    //   551: lconst_0
    //   552: lcmp
    //   553: iflt -> 685
    //   556: lload #16
    //   558: lload #14
    //   560: ladd
    //   561: aload_1
    //   562: invokevirtual a : ()J
    //   565: lcmp
    //   566: ifle -> 944
    //   569: goto -> 685
    //   572: iload #6
    //   574: istore #10
    //   576: iload #9
    //   578: i2l
    //   579: lload #18
    //   581: lcmp
    //   582: ifge -> 626
    //   585: aload_0
    //   586: iload #11
    //   588: invokeinterface b : (I)Z
    //   593: ifeq -> 965
    //   596: aload_0
    //   597: aload_1
    //   598: aload_2
    //   599: aload_1
    //   600: iload #9
    //   602: iconst_4
    //   603: imul
    //   604: i2l
    //   605: lload #16
    //   607: ladd
    //   608: l2i
    //   609: invokevirtual g : (I)I
    //   612: iload #4
    //   614: iadd
    //   615: iload #4
    //   617: invokestatic a : (Le/d/a/s/b;Le/d/b/k;Ljava/util/Set;II)V
    //   620: iconst_1
    //   621: istore #6
    //   623: goto -> 965
    //   626: iload #5
    //   628: istore #6
    //   630: iload #10
    //   632: ifne -> 418
    //   635: lload #16
    //   637: l2i
    //   638: istore #9
    //   640: iload #5
    //   642: istore #6
    //   644: aload_0
    //   645: iload #9
    //   647: aload_2
    //   648: iload #4
    //   650: aload_1
    //   651: iload #11
    //   653: lload #14
    //   655: l2i
    //   656: invokeinterface a : (ILjava/util/Set;ILe/d/b/k;II)Z
    //   661: ifne -> 980
    //   664: aload_0
    //   665: iload #11
    //   667: iload #9
    //   669: lload #18
    //   671: l2i
    //   672: iload #12
    //   674: aload_1
    //   675: invokestatic a : (Le/d/a/s/b;IIIILe/d/b/k;)V
    //   678: iload #5
    //   680: istore #6
    //   682: goto -> 980
    //   685: new java/lang/StringBuilder
    //   688: dup
    //   689: invokespecial <init> : ()V
    //   692: astore #21
    //   694: aload #21
    //   696: ldc 'Illegal number of bytes for TIFF tag data: '
    //   698: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   701: pop
    //   702: aload #21
    //   704: lload #14
    //   706: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   709: pop
    //   710: aload_0
    //   711: aload #21
    //   713: invokevirtual toString : ()Ljava/lang/String;
    //   716: invokeinterface a : (Ljava/lang/String;)V
    //   721: iload #5
    //   723: istore #6
    //   725: goto -> 980
    //   728: aload_0
    //   729: ldc 'Illegal TIFF tag pointer offset'
    //   731: invokeinterface a : (Ljava/lang/String;)V
    //   736: iload #5
    //   738: istore #6
    //   740: goto -> 980
    //   743: aload #20
    //   745: astore #21
    //   747: aload_1
    //   748: iload_3
    //   749: iload #7
    //   751: invokestatic a : (II)I
    //   754: invokevirtual g : (I)I
    //   757: istore #5
    //   759: iload #5
    //   761: ifeq -> 857
    //   764: iload #5
    //   766: iload #4
    //   768: iadd
    //   769: istore #5
    //   771: iload #5
    //   773: i2l
    //   774: lstore #14
    //   776: aload_1
    //   777: invokevirtual a : ()J
    //   780: lstore #16
    //   782: lload #14
    //   784: lload #16
    //   786: lcmp
    //   787: iflt -> 811
    //   790: aload_0
    //   791: invokeinterface b : ()V
    //   796: aload #21
    //   798: ifnull -> 810
    //   801: aload_1
    //   802: aload #21
    //   804: invokevirtual booleanValue : ()Z
    //   807: invokevirtual a : (Z)V
    //   810: return
    //   811: iload #5
    //   813: iload_3
    //   814: if_icmpge -> 838
    //   817: aload_0
    //   818: invokeinterface b : ()V
    //   823: aload #21
    //   825: ifnull -> 837
    //   828: aload_1
    //   829: aload #21
    //   831: invokevirtual booleanValue : ()Z
    //   834: invokevirtual a : (Z)V
    //   837: return
    //   838: aload_0
    //   839: invokeinterface a : ()Z
    //   844: ifeq -> 857
    //   847: aload_0
    //   848: aload_1
    //   849: aload_2
    //   850: iload #5
    //   852: iload #4
    //   854: invokestatic a : (Le/d/a/s/b;Le/d/b/k;Ljava/util/Set;II)V
    //   857: aload_0
    //   858: invokeinterface b : ()V
    //   863: aload #21
    //   865: ifnull -> 877
    //   868: aload_1
    //   869: aload #21
    //   871: invokevirtual booleanValue : ()Z
    //   874: invokevirtual a : (Z)V
    //   877: return
    //   878: astore_2
    //   879: goto -> 910
    //   882: astore_2
    //   883: aload #21
    //   885: astore #20
    //   887: goto -> 910
    //   890: aload #22
    //   892: astore #20
    //   894: aload_0
    //   895: ldc 'Ignored IFD marked to start outside data segment'
    //   897: invokeinterface a : (Ljava/lang/String;)V
    //   902: aload_0
    //   903: invokeinterface b : ()V
    //   908: return
    //   909: astore_2
    //   910: aload_0
    //   911: invokeinterface b : ()V
    //   916: aload #20
    //   918: ifnull -> 930
    //   921: aload_1
    //   922: aload #20
    //   924: invokevirtual booleanValue : ()Z
    //   927: invokevirtual a : (Z)V
    //   930: goto -> 935
    //   933: aload_2
    //   934: athrow
    //   935: goto -> 933
    //   938: iconst_0
    //   939: istore #13
    //   941: goto -> 151
    //   944: lload #14
    //   946: ldc2_w 4
    //   949: lload #18
    //   951: lmul
    //   952: lcmp
    //   953: ifne -> 974
    //   956: iconst_0
    //   957: istore #9
    //   959: iconst_0
    //   960: istore #6
    //   962: goto -> 572
    //   965: iload #9
    //   967: iconst_1
    //   968: iadd
    //   969: istore #9
    //   971: goto -> 572
    //   974: iconst_0
    //   975: istore #10
    //   977: goto -> 626
    //   980: iload #8
    //   982: iconst_1
    //   983: iadd
    //   984: istore #8
    //   986: iload #6
    //   988: istore #5
    //   990: goto -> 236
    // Exception table:
    //   from	to	target	type
    //   10	22	909	finally
    //   38	49	909	finally
    //   53	63	909	finally
    //   74	81	909	finally
    //   118	127	909	finally
    //   138	145	909	finally
    //   155	161	909	finally
    //   187	197	882	finally
    //   201	209	882	finally
    //   247	255	882	finally
    //   259	267	882	finally
    //   271	281	882	finally
    //   285	292	882	finally
    //   296	306	882	finally
    //   315	329	882	finally
    //   338	369	882	finally
    //   385	393	882	finally
    //   425	432	882	finally
    //   439	446	882	finally
    //   467	478	882	finally
    //   482	495	882	finally
    //   499	507	882	finally
    //   536	546	878	finally
    //   556	569	878	finally
    //   585	620	878	finally
    //   644	678	878	finally
    //   685	721	878	finally
    //   728	736	878	finally
    //   747	759	878	finally
    //   776	782	878	finally
    //   838	857	878	finally
    //   894	902	909	finally
  }
  
  public void a(k paramk, b paramb, int paramInt) {
    d d;
    boolean bool;
    short s = paramk.e(paramInt);
    if (s == 19789) {
      bool = true;
    } else if (s == 18761) {
      bool = false;
    } else {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unclear distinction between Motorola/Intel byte ordering: ");
      stringBuilder.append(s);
      d = new d(stringBuilder.toString());
      throw d;
    } 
    d.a(bool);
    int m = paramInt + 2;
    paramb.a(d.k(m));
    int j = d.g(paramInt + 4) + paramInt;
    int i = j;
    if (j >= d.a() - 1L) {
      paramb.b("First IFD offset is beyond the end of the TIFF data segment -- trying default offset");
      i = m + 2 + 4;
    } 
    a(paramb, (k)d, new HashSet<Integer>(), i, paramInt);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/a/s/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */