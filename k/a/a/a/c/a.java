package k.a.a.a.c;

import java.util.Calendar;

public class a {
  private static final int[][] a;
  
  static {
    int[] arrayOfInt1 = { 14 };
    int[] arrayOfInt2 = { 13 };
    int[] arrayOfInt3 = { 12 };
    int[] arrayOfInt4 = { 5, 5, 9 };
    int[] arrayOfInt5 = { 2, 1001 };
    int[] arrayOfInt6 = { 0 };
    a = new int[][] { arrayOfInt1, arrayOfInt2, arrayOfInt3, { 11, 10 }, arrayOfInt4, arrayOfInt5, { 1 }, arrayOfInt6 };
  }
  
  public static Calendar a(Calendar paramCalendar, int paramInt) {
    if (paramCalendar != null) {
      paramCalendar = (Calendar)paramCalendar.clone();
      a(paramCalendar, paramInt, a.c);
      return paramCalendar;
    } 
    throw new IllegalArgumentException("The date must not be null");
  }
  
  private static void a(Calendar paramCalendar, int paramInt, a parama) {
    // Byte code:
    //   0: aload_0
    //   1: iconst_1
    //   2: invokevirtual get : (I)I
    //   5: ldc 280000000
    //   7: if_icmpgt -> 641
    //   10: iload_1
    //   11: bipush #14
    //   13: if_icmpne -> 17
    //   16: return
    //   17: aload_0
    //   18: invokevirtual getTime : ()Ljava/util/Date;
    //   21: astore #13
    //   23: aload #13
    //   25: invokevirtual getTime : ()J
    //   28: lstore #11
    //   30: aload_0
    //   31: bipush #14
    //   33: invokevirtual get : (I)I
    //   36: istore_3
    //   37: getstatic k/a/a/a/c/a$a.c : Lk/a/a/a/c/a$a;
    //   40: aload_2
    //   41: if_acmpeq -> 55
    //   44: lload #11
    //   46: lstore #9
    //   48: iload_3
    //   49: sipush #500
    //   52: if_icmpge -> 62
    //   55: lload #11
    //   57: iload_3
    //   58: i2l
    //   59: lsub
    //   60: lstore #9
    //   62: iload_1
    //   63: bipush #13
    //   65: if_icmpne -> 73
    //   68: iconst_1
    //   69: istore_3
    //   70: goto -> 75
    //   73: iconst_0
    //   74: istore_3
    //   75: aload_0
    //   76: bipush #13
    //   78: invokevirtual get : (I)I
    //   81: istore #4
    //   83: lload #9
    //   85: lstore #11
    //   87: iload_3
    //   88: ifne -> 121
    //   91: getstatic k/a/a/a/c/a$a.c : Lk/a/a/a/c/a$a;
    //   94: aload_2
    //   95: if_acmpeq -> 109
    //   98: lload #9
    //   100: lstore #11
    //   102: iload #4
    //   104: bipush #30
    //   106: if_icmpge -> 121
    //   109: lload #9
    //   111: iload #4
    //   113: i2l
    //   114: ldc2_w 1000
    //   117: lmul
    //   118: lsub
    //   119: lstore #11
    //   121: iload_1
    //   122: bipush #12
    //   124: if_icmpne -> 129
    //   127: iconst_1
    //   128: istore_3
    //   129: aload_0
    //   130: bipush #12
    //   132: invokevirtual get : (I)I
    //   135: istore #4
    //   137: lload #11
    //   139: lstore #9
    //   141: iload_3
    //   142: ifne -> 175
    //   145: getstatic k/a/a/a/c/a$a.c : Lk/a/a/a/c/a$a;
    //   148: aload_2
    //   149: if_acmpeq -> 163
    //   152: lload #11
    //   154: lstore #9
    //   156: iload #4
    //   158: bipush #30
    //   160: if_icmpge -> 175
    //   163: lload #11
    //   165: iload #4
    //   167: i2l
    //   168: ldc2_w 60000
    //   171: lmul
    //   172: lsub
    //   173: lstore #9
    //   175: aload #13
    //   177: invokevirtual getTime : ()J
    //   180: lload #9
    //   182: lcmp
    //   183: ifeq -> 199
    //   186: aload #13
    //   188: lload #9
    //   190: invokevirtual setTime : (J)V
    //   193: aload_0
    //   194: aload #13
    //   196: invokevirtual setTime : (Ljava/util/Date;)V
    //   199: getstatic k/a/a/a/c/a.a : [[I
    //   202: astore #13
    //   204: aload #13
    //   206: arraylength
    //   207: istore #8
    //   209: iconst_0
    //   210: istore #6
    //   212: iconst_0
    //   213: istore_3
    //   214: iload #6
    //   216: iload #8
    //   218: if_icmpge -> 601
    //   221: aload #13
    //   223: iload #6
    //   225: aaload
    //   226: astore #14
    //   228: aload #14
    //   230: arraylength
    //   231: istore #5
    //   233: iconst_0
    //   234: istore #4
    //   236: iload #4
    //   238: iload #5
    //   240: if_icmpge -> 366
    //   243: aload #14
    //   245: iload #4
    //   247: iaload
    //   248: iload_1
    //   249: if_icmpne -> 357
    //   252: aload_2
    //   253: getstatic k/a/a/a/c/a$a.e : Lk/a/a/a/c/a$a;
    //   256: if_acmpeq -> 270
    //   259: aload_2
    //   260: getstatic k/a/a/a/c/a$a.d : Lk/a/a/a/c/a$a;
    //   263: if_acmpne -> 356
    //   266: iload_3
    //   267: ifeq -> 356
    //   270: iload_1
    //   271: sipush #1001
    //   274: if_icmpne -> 308
    //   277: aload_0
    //   278: iconst_5
    //   279: invokevirtual get : (I)I
    //   282: iconst_1
    //   283: if_icmpne -> 294
    //   286: aload_0
    //   287: iconst_5
    //   288: bipush #15
    //   290: invokevirtual add : (II)V
    //   293: return
    //   294: aload_0
    //   295: iconst_5
    //   296: bipush #-15
    //   298: invokevirtual add : (II)V
    //   301: aload_0
    //   302: iconst_2
    //   303: iconst_1
    //   304: invokevirtual add : (II)V
    //   307: return
    //   308: iload_1
    //   309: bipush #9
    //   311: if_icmpne -> 347
    //   314: aload_0
    //   315: bipush #11
    //   317: invokevirtual get : (I)I
    //   320: ifne -> 332
    //   323: aload_0
    //   324: bipush #11
    //   326: bipush #12
    //   328: invokevirtual add : (II)V
    //   331: return
    //   332: aload_0
    //   333: bipush #11
    //   335: bipush #-12
    //   337: invokevirtual add : (II)V
    //   340: aload_0
    //   341: iconst_5
    //   342: iconst_1
    //   343: invokevirtual add : (II)V
    //   346: return
    //   347: aload_0
    //   348: aload #14
    //   350: iconst_0
    //   351: iaload
    //   352: iconst_1
    //   353: invokevirtual add : (II)V
    //   356: return
    //   357: iload #4
    //   359: iconst_1
    //   360: iadd
    //   361: istore #4
    //   363: goto -> 236
    //   366: iload_1
    //   367: bipush #9
    //   369: if_icmpeq -> 436
    //   372: iload_1
    //   373: sipush #1001
    //   376: if_icmpeq -> 382
    //   379: goto -> 490
    //   382: aload #14
    //   384: iconst_0
    //   385: iaload
    //   386: iconst_5
    //   387: if_icmpne -> 379
    //   390: aload_0
    //   391: iconst_5
    //   392: invokevirtual get : (I)I
    //   395: iconst_1
    //   396: isub
    //   397: istore #4
    //   399: iload #4
    //   401: istore_3
    //   402: iload #4
    //   404: bipush #15
    //   406: if_icmplt -> 415
    //   409: iload #4
    //   411: bipush #15
    //   413: isub
    //   414: istore_3
    //   415: iload_3
    //   416: bipush #7
    //   418: if_icmple -> 427
    //   421: iconst_1
    //   422: istore #4
    //   424: goto -> 430
    //   427: iconst_0
    //   428: istore #4
    //   430: iconst_1
    //   431: istore #5
    //   433: goto -> 502
    //   436: aload #14
    //   438: iconst_0
    //   439: iaload
    //   440: bipush #11
    //   442: if_icmpne -> 379
    //   445: aload_0
    //   446: bipush #11
    //   448: invokevirtual get : (I)I
    //   451: istore #4
    //   453: iload #4
    //   455: istore_3
    //   456: iload #4
    //   458: bipush #12
    //   460: if_icmplt -> 469
    //   463: iload #4
    //   465: bipush #12
    //   467: isub
    //   468: istore_3
    //   469: iload_3
    //   470: bipush #6
    //   472: if_icmplt -> 481
    //   475: iconst_1
    //   476: istore #4
    //   478: goto -> 484
    //   481: iconst_0
    //   482: istore #4
    //   484: iconst_1
    //   485: istore #5
    //   487: goto -> 502
    //   490: iconst_0
    //   491: istore #5
    //   493: iconst_0
    //   494: istore #7
    //   496: iload_3
    //   497: istore #4
    //   499: iload #7
    //   501: istore_3
    //   502: iload #5
    //   504: ifne -> 562
    //   507: aload_0
    //   508: aload #14
    //   510: iconst_0
    //   511: iaload
    //   512: invokevirtual getActualMinimum : (I)I
    //   515: istore_3
    //   516: aload_0
    //   517: aload #14
    //   519: iconst_0
    //   520: iaload
    //   521: invokevirtual getActualMaximum : (I)I
    //   524: istore #4
    //   526: aload_0
    //   527: aload #14
    //   529: iconst_0
    //   530: iaload
    //   531: invokevirtual get : (I)I
    //   534: iload_3
    //   535: isub
    //   536: istore #5
    //   538: iload #5
    //   540: iload #4
    //   542: iload_3
    //   543: isub
    //   544: iconst_2
    //   545: idiv
    //   546: if_icmple -> 554
    //   549: iconst_1
    //   550: istore_3
    //   551: goto -> 556
    //   554: iconst_0
    //   555: istore_3
    //   556: iload_3
    //   557: istore #4
    //   559: goto -> 565
    //   562: iload_3
    //   563: istore #5
    //   565: iload #5
    //   567: ifeq -> 589
    //   570: aload_0
    //   571: aload #14
    //   573: iconst_0
    //   574: iaload
    //   575: aload_0
    //   576: aload #14
    //   578: iconst_0
    //   579: iaload
    //   580: invokevirtual get : (I)I
    //   583: iload #5
    //   585: isub
    //   586: invokevirtual set : (II)V
    //   589: iload #6
    //   591: iconst_1
    //   592: iadd
    //   593: istore #6
    //   595: iload #4
    //   597: istore_3
    //   598: goto -> 214
    //   601: new java/lang/StringBuilder
    //   604: dup
    //   605: invokespecial <init> : ()V
    //   608: astore_0
    //   609: aload_0
    //   610: ldc 'The field '
    //   612: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   615: pop
    //   616: aload_0
    //   617: iload_1
    //   618: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   621: pop
    //   622: aload_0
    //   623: ldc ' is not supported'
    //   625: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   628: pop
    //   629: new java/lang/IllegalArgumentException
    //   632: dup
    //   633: aload_0
    //   634: invokevirtual toString : ()Ljava/lang/String;
    //   637: invokespecial <init> : (Ljava/lang/String;)V
    //   640: athrow
    //   641: new java/lang/ArithmeticException
    //   644: dup
    //   645: ldc 'Calendar value too large for accurate calculations'
    //   647: invokespecial <init> : (Ljava/lang/String;)V
    //   650: astore_0
    //   651: goto -> 656
    //   654: aload_0
    //   655: athrow
    //   656: goto -> 654
  }
  
  private enum a {
    c, d, e;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/k/a/a/a/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */