package e.d.c.a0;

import e.d.b.b;
import e.d.c.j;
import java.io.IOException;
import java.text.DecimalFormat;

public class d extends j<e> {
  public d(e parame) {
    super(parame);
  }
  
  private String m(int paramInt) {
    byte[] arrayOfByte = ((e)this.a).d(paramInt);
    if (arrayOfByte == null)
      return null; 
    b b = new b(arrayOfByte);
    try {
      return String.format("%d", new Object[] { Integer.valueOf(b.g(0)) });
    } catch (IOException iOException) {
      return null;
    } 
  }
  
  private String n(int paramInt) {
    byte[] arrayOfByte = ((e)this.a).d(paramInt);
    return (arrayOfByte == null) ? null : String.format("%d bytes binary data", new Object[] { Integer.valueOf(arrayOfByte.length) });
  }
  
  private String o(int paramInt) {
    byte[] arrayOfByte = ((e)this.a).d(paramInt);
    return (arrayOfByte == null || arrayOfByte.length == 0) ? null : ((arrayOfByte[0] == 0) ? "No" : "Yes");
  }
  
  private String p(int paramInt) {
    byte[] arrayOfByte = ((e)this.a).d(paramInt);
    return (arrayOfByte == null) ? null : new String(arrayOfByte);
  }
  
  public String a() {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Le/d/c/b;
    //   4: checkcast e/d/c/a0/e
    //   7: sipush #1030
    //   10: invokevirtual d : (I)[B
    //   13: astore #5
    //   15: aload #5
    //   17: ifnonnull -> 34
    //   20: aload_0
    //   21: getfield a : Le/d/c/b;
    //   24: checkcast e/d/c/a0/e
    //   27: sipush #1030
    //   30: invokevirtual p : (I)Ljava/lang/String;
    //   33: areturn
    //   34: new e/d/b/b
    //   37: dup
    //   38: aload #5
    //   40: invokespecial <init> : ([B)V
    //   43: astore #5
    //   45: aload #5
    //   47: iconst_0
    //   48: invokevirtual k : (I)I
    //   51: istore_2
    //   52: aload #5
    //   54: iconst_2
    //   55: invokevirtual k : (I)I
    //   58: istore_3
    //   59: aload #5
    //   61: iconst_4
    //   62: invokevirtual k : (I)I
    //   65: istore #4
    //   67: iload_2
    //   68: ldc 65535
    //   70: if_icmpgt -> 226
    //   73: iload_2
    //   74: ldc 65533
    //   76: if_icmplt -> 226
    //   79: iload_2
    //   80: ldc 65532
    //   82: isub
    //   83: istore_1
    //   84: goto -> 241
    //   87: ldc 'Low'
    //   89: astore #5
    //   91: iload_3
    //   92: ifeq -> 362
    //   95: iload_3
    //   96: iconst_1
    //   97: if_icmpeq -> 355
    //   100: iload_3
    //   101: sipush #257
    //   104: if_icmpeq -> 348
    //   107: ldc 'Unknown 0x%04X'
    //   109: iconst_1
    //   110: anewarray java/lang/Object
    //   113: dup
    //   114: iconst_0
    //   115: iload_3
    //   116: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   119: aastore
    //   120: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   123: astore #6
    //   125: goto -> 128
    //   128: iload #4
    //   130: iconst_1
    //   131: if_icmplt -> 164
    //   134: iload #4
    //   136: iconst_3
    //   137: if_icmpgt -> 164
    //   140: ldc '%d'
    //   142: iconst_1
    //   143: anewarray java/lang/Object
    //   146: dup
    //   147: iconst_0
    //   148: iload #4
    //   150: iconst_2
    //   151: iadd
    //   152: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   155: aastore
    //   156: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   159: astore #7
    //   161: goto -> 183
    //   164: ldc 'Unknown 0x%04X'
    //   166: iconst_1
    //   167: anewarray java/lang/Object
    //   170: dup
    //   171: iconst_0
    //   172: iload #4
    //   174: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   177: aastore
    //   178: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   181: astore #7
    //   183: ldc '%d (%s), %s format, %s scans'
    //   185: iconst_4
    //   186: anewarray java/lang/Object
    //   189: dup
    //   190: iconst_0
    //   191: iload_1
    //   192: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   195: aastore
    //   196: dup
    //   197: iconst_1
    //   198: aload #5
    //   200: aastore
    //   201: dup
    //   202: iconst_2
    //   203: aload #6
    //   205: aastore
    //   206: dup
    //   207: iconst_3
    //   208: aload #7
    //   210: aastore
    //   211: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   214: astore #5
    //   216: aload #5
    //   218: areturn
    //   219: aconst_null
    //   220: areturn
    //   221: astore #5
    //   223: goto -> 219
    //   226: iload_2
    //   227: bipush #8
    //   229: if_icmpgt -> 239
    //   232: iload_2
    //   233: iconst_4
    //   234: iadd
    //   235: istore_1
    //   236: goto -> 241
    //   239: iload_2
    //   240: istore_1
    //   241: iload_2
    //   242: tableswitch default -> 292, 0 -> 87, 1 -> 341, 2 -> 341, 3 -> 341, 4 -> 334, 5 -> 334, 6 -> 327, 7 -> 327, 8 -> 327
    //   292: iload_2
    //   293: tableswitch default -> 320, 65533 -> 87, 65534 -> 87, 65535 -> 87
    //   320: ldc 'Unknown'
    //   322: astore #5
    //   324: goto -> 91
    //   327: ldc 'Maximum'
    //   329: astore #5
    //   331: goto -> 91
    //   334: ldc 'High'
    //   336: astore #5
    //   338: goto -> 91
    //   341: ldc 'Medium'
    //   343: astore #5
    //   345: goto -> 91
    //   348: ldc 'Progressive'
    //   350: astore #6
    //   352: goto -> 128
    //   355: ldc 'Optimised'
    //   357: astore #6
    //   359: goto -> 128
    //   362: ldc 'Standard'
    //   364: astore #6
    //   366: goto -> 128
    // Exception table:
    //   from	to	target	type
    //   0	15	221	java/io/IOException
    //   20	34	221	java/io/IOException
    //   34	67	221	java/io/IOException
    //   107	125	221	java/io/IOException
    //   140	161	221	java/io/IOException
    //   164	183	221	java/io/IOException
    //   183	216	221	java/io/IOException
  }
  
  public String b() {
    try {
      byte[] arrayOfByte = ((e)this.a).d(1064);
      return (arrayOfByte == null) ? null : Double.toString((new b(arrayOfByte)).c(4));
    } catch (Exception exception) {
      return null;
    } 
  }
  
  public String c() {
    try {
      byte[] arrayOfByte = ((e)this.a).d(1062);
      if (arrayOfByte == null)
        return null; 
      b b = new b(arrayOfByte);
      int i = b.g(0);
      float f1 = b.d(2);
      float f2 = b.d(6);
      float f3 = b.d(10);
      if (i != 0) {
        if (i != 1)
          return (i != 2) ? String.format("Unknown %04X, X:%s Y:%s, Scale:%s", new Object[] { Integer.valueOf(i), Float.valueOf(f1), Float.valueOf(f2), Float.valueOf(f3) }) : String.format("User defined, X:%s Y:%s, Scale:%s", new Object[] { Float.valueOf(f1), Float.valueOf(f2), Float.valueOf(f3) }); 
      } else {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Centered, Scale ");
        stringBuilder.append(f3);
        return stringBuilder.toString();
      } 
    } catch (Exception exception) {
      return null;
    } 
    return "Size to fit";
  }
  
  public String c(int paramInt) {
    if (paramInt != 1002) {
      if (paramInt != 1005) {
        if (paramInt != 1028) {
          if (paramInt != 1030)
            if (paramInt != 1044 && paramInt != 1054) {
              if (paramInt != 1057) {
                if (paramInt != 1062) {
                  if (paramInt != 1064) {
                    if (paramInt != 2999)
                      if (paramInt != 1049) {
                        if (paramInt != 1050) {
                          switch (paramInt) {
                            default:
                              return (paramInt >= 2000 && paramInt <= 2998) ? k(paramInt) : super.c(paramInt);
                            case 1034:
                              return o(paramInt);
                            case 1033:
                            case 1036:
                              return l(paramInt);
                            case 1037:
                              return m(paramInt);
                            case 1035:
                              break;
                          } 
                        } else {
                          return e();
                        } 
                        return p(paramInt);
                      }  
                    return j(paramInt);
                  } 
                  return b();
                } 
                return c();
              } 
              return f();
            }  
          return a();
        } 
        return n(paramInt);
      } 
      return d();
    } 
    return p(paramInt);
  }
  
  public String d() {
    try {
      byte[] arrayOfByte = ((e)this.a).d(1005);
      if (arrayOfByte == null)
        return null; 
      b b = new b(arrayOfByte);
      float f1 = b.j(0);
      float f2 = b.j(8);
      DecimalFormat decimalFormat = new DecimalFormat("0.##");
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(decimalFormat.format(f1));
      stringBuilder.append("x");
      stringBuilder.append(decimalFormat.format(f2));
      stringBuilder.append(" DPI");
      return stringBuilder.toString();
    } catch (Exception exception) {
      return null;
    } 
  }
  
  public String e() {
    try {
      byte[] arrayOfByte = ((e)this.a).d(1050);
      if (arrayOfByte == null)
        return null; 
      b b = new b(arrayOfByte);
      int i = b.g(20) * 2;
      String str = b.a(24, i, "UTF-16");
      i = b.g(i + 24);
      return String.format("%s (%d,%d,%d,%d) %d Slices", new Object[] { str, Integer.valueOf(b.g(4)), Integer.valueOf(b.g(8)), Integer.valueOf(b.g(12)), Integer.valueOf(b.g(16)), Integer.valueOf(i) });
    } catch (IOException iOException) {
      return null;
    } 
  }
  
  public String f() {
    try {
      byte[] arrayOfByte = ((e)this.a).d(1057);
      if (arrayOfByte == null)
        return null; 
      b b = new b(arrayOfByte);
      int i = b.g(0);
      int k = b.g(5) * 2;
      String str = b.a(9, k, "UTF-16");
      int m = 9 + k;
      k = b.g(m);
      m += 4;
      k *= 2;
      return String.format("%d (%s, %s) %d", new Object[] { Integer.valueOf(i), str, b.a(m, k, "UTF-16"), Integer.valueOf(b.g(m + k)) });
    } catch (IOException iOException) {
      return null;
    } 
  }
  
  public String j(int paramInt) {
    try {
      byte[] arrayOfByte = ((e)this.a).d(paramInt);
      if (arrayOfByte == null)
        return null; 
      b b = new b(arrayOfByte);
      return new String(b.a(1, b.b(0)), "UTF-8");
    } catch (Exception exception) {
      return null;
    } 
  }
  
  public String k(int paramInt) {
    // Byte code:
    //   0: ldc ')'
    //   2: astore #13
    //   4: ldc ','
    //   6: astore #12
    //   8: aload_0
    //   9: getfield a : Le/d/c/b;
    //   12: checkcast e/d/c/a0/e
    //   15: iload_1
    //   16: invokevirtual d : (I)[B
    //   19: astore #14
    //   21: aload #14
    //   23: ifnonnull -> 28
    //   26: aconst_null
    //   27: areturn
    //   28: new e/d/b/b
    //   31: dup
    //   32: aload #14
    //   34: invokespecial <init> : ([B)V
    //   37: astore #15
    //   39: aload #15
    //   41: invokevirtual a : ()J
    //   44: aload #15
    //   46: aload #15
    //   48: invokevirtual a : ()J
    //   51: l2i
    //   52: iconst_1
    //   53: isub
    //   54: invokevirtual b : (I)B
    //   57: i2l
    //   58: lsub
    //   59: lconst_1
    //   60: lsub
    //   61: l2i
    //   62: bipush #26
    //   64: idiv
    //   65: istore_1
    //   66: new e/d/c/a0/k
    //   69: dup
    //   70: invokespecial <init> : ()V
    //   73: astore #18
    //   75: new e/d/c/a0/k
    //   78: dup
    //   79: invokespecial <init> : ()V
    //   82: astore #17
    //   84: new java/util/ArrayList
    //   87: dup
    //   88: invokespecial <init> : ()V
    //   91: astore #14
    //   93: aconst_null
    //   94: astore #16
    //   96: iconst_0
    //   97: istore #8
    //   99: iload #8
    //   101: iload_1
    //   102: if_icmpge -> 686
    //   105: iload #8
    //   107: bipush #26
    //   109: imul
    //   110: istore #10
    //   112: aload #15
    //   114: iload #10
    //   116: invokevirtual e : (I)S
    //   119: istore #9
    //   121: iload #9
    //   123: tableswitch default -> 172, 0 -> 619, 1 -> 456, 2 -> 456, 3 -> 390, 4 -> 223, 5 -> 223, 6 -> 172, 7 -> 172, 8 -> 203
    //   172: aload #13
    //   174: astore #19
    //   176: aload #12
    //   178: astore #20
    //   180: aload #15
    //   182: astore #13
    //   184: aload #14
    //   186: astore #12
    //   188: aload #16
    //   190: astore #14
    //   192: aload #19
    //   194: astore #15
    //   196: aload #20
    //   198: astore #16
    //   200: goto -> 1247
    //   203: aload #15
    //   205: iload #10
    //   207: iconst_2
    //   208: iadd
    //   209: invokevirtual e : (I)S
    //   212: iconst_1
    //   213: if_icmpne -> 1200
    //   216: ldc 'with all pixels'
    //   218: astore #16
    //   220: goto -> 1205
    //   223: iload #9
    //   225: iconst_4
    //   226: if_icmpne -> 243
    //   229: new e/d/c/a0/c
    //   232: dup
    //   233: ldc 'Linked'
    //   235: invokespecial <init> : (Ljava/lang/String;)V
    //   238: astore #19
    //   240: goto -> 1232
    //   243: new e/d/c/a0/c
    //   246: dup
    //   247: ldc 'Unlinked'
    //   249: invokespecial <init> : (Ljava/lang/String;)V
    //   252: astore #19
    //   254: goto -> 1232
    //   257: iload #9
    //   259: bipush #6
    //   261: if_icmpge -> 348
    //   264: iload #9
    //   266: iconst_4
    //   267: imul
    //   268: istore #11
    //   270: aload #15
    //   272: iload #11
    //   274: iconst_2
    //   275: iadd
    //   276: iload #10
    //   278: iadd
    //   279: invokevirtual i : (I)B
    //   282: i2d
    //   283: dstore_2
    //   284: aload #15
    //   286: iload #11
    //   288: iconst_3
    //   289: iadd
    //   290: iload #10
    //   292: iadd
    //   293: invokevirtual f : (I)I
    //   296: i2d
    //   297: dstore #4
    //   299: ldc2_w 2.0
    //   302: ldc2_w 24.0
    //   305: invokestatic pow : (DD)D
    //   308: dstore #6
    //   310: dload #4
    //   312: invokestatic isNaN : (D)Z
    //   315: pop
    //   316: dload #4
    //   318: dload #6
    //   320: ddiv
    //   321: dstore #4
    //   323: dload_2
    //   324: invokestatic isNaN : (D)Z
    //   327: pop
    //   328: aload #19
    //   330: iload #9
    //   332: dload_2
    //   333: dload #4
    //   335: dadd
    //   336: invokevirtual a : (ID)V
    //   339: iload #9
    //   341: iconst_1
    //   342: iadd
    //   343: istore #9
    //   345: goto -> 257
    //   348: aload #13
    //   350: astore #20
    //   352: aload #12
    //   354: astore #21
    //   356: aload #16
    //   358: astore #22
    //   360: aload #17
    //   362: aload #19
    //   364: invokevirtual a : (Le/d/c/a0/c;)V
    //   367: aload #15
    //   369: astore #13
    //   371: aload #14
    //   373: astore #12
    //   375: aload #20
    //   377: astore #15
    //   379: aload #21
    //   381: astore #16
    //   383: aload #22
    //   385: astore #14
    //   387: goto -> 1247
    //   390: aload #13
    //   392: astore #19
    //   394: aload #12
    //   396: astore #20
    //   398: aload #16
    //   400: astore #21
    //   402: aload #17
    //   404: invokevirtual c : ()I
    //   407: ifeq -> 1238
    //   410: aload #14
    //   412: aload #17
    //   414: invokevirtual add : (Ljava/lang/Object;)Z
    //   417: pop
    //   418: goto -> 421
    //   421: aload #14
    //   423: astore #12
    //   425: new e/d/c/a0/k
    //   428: dup
    //   429: ldc_w 'Open Subpath'
    //   432: invokespecial <init> : (Ljava/lang/String;)V
    //   435: astore #14
    //   437: aload #15
    //   439: astore #13
    //   441: aload #19
    //   443: astore #15
    //   445: aload #20
    //   447: astore #16
    //   449: aload #21
    //   451: astore #17
    //   453: goto -> 1259
    //   456: aload #13
    //   458: astore #19
    //   460: aload #12
    //   462: astore #20
    //   464: aload #14
    //   466: astore #12
    //   468: aload #16
    //   470: astore #14
    //   472: iload #9
    //   474: iconst_1
    //   475: if_icmpne -> 492
    //   478: new e/d/c/a0/c
    //   481: dup
    //   482: ldc 'Linked'
    //   484: invokespecial <init> : (Ljava/lang/String;)V
    //   487: astore #13
    //   489: goto -> 1241
    //   492: new e/d/c/a0/c
    //   495: dup
    //   496: ldc 'Unlinked'
    //   498: invokespecial <init> : (Ljava/lang/String;)V
    //   501: astore #13
    //   503: goto -> 1241
    //   506: iload #9
    //   508: bipush #6
    //   510: if_icmpge -> 597
    //   513: iload #9
    //   515: iconst_4
    //   516: imul
    //   517: istore #11
    //   519: aload #15
    //   521: iload #11
    //   523: iconst_2
    //   524: iadd
    //   525: iload #10
    //   527: iadd
    //   528: invokevirtual i : (I)B
    //   531: i2d
    //   532: dstore_2
    //   533: aload #15
    //   535: iload #11
    //   537: iconst_3
    //   538: iadd
    //   539: iload #10
    //   541: iadd
    //   542: invokevirtual f : (I)I
    //   545: i2d
    //   546: dstore #4
    //   548: ldc2_w 2.0
    //   551: ldc2_w 24.0
    //   554: invokestatic pow : (DD)D
    //   557: dstore #6
    //   559: dload #4
    //   561: invokestatic isNaN : (D)Z
    //   564: pop
    //   565: dload #4
    //   567: dload #6
    //   569: ddiv
    //   570: dstore #4
    //   572: dload_2
    //   573: invokestatic isNaN : (D)Z
    //   576: pop
    //   577: aload #13
    //   579: iload #9
    //   581: dload_2
    //   582: dload #4
    //   584: dadd
    //   585: invokevirtual a : (ID)V
    //   588: iload #9
    //   590: iconst_1
    //   591: iadd
    //   592: istore #9
    //   594: goto -> 506
    //   597: aload #18
    //   599: aload #13
    //   601: invokevirtual a : (Le/d/c/a0/c;)V
    //   604: aload #15
    //   606: astore #13
    //   608: aload #19
    //   610: astore #15
    //   612: aload #20
    //   614: astore #16
    //   616: goto -> 1247
    //   619: aload #13
    //   621: astore #19
    //   623: aload #12
    //   625: astore #20
    //   627: aload #15
    //   629: astore #13
    //   631: aload #14
    //   633: astore #12
    //   635: aload #16
    //   637: astore #21
    //   639: aload #18
    //   641: invokevirtual c : ()I
    //   644: ifeq -> 655
    //   647: aload #12
    //   649: aload #18
    //   651: invokevirtual add : (Ljava/lang/Object;)Z
    //   654: pop
    //   655: new e/d/c/a0/k
    //   658: dup
    //   659: ldc_w 'Closed Subpath'
    //   662: invokespecial <init> : (Ljava/lang/String;)V
    //   665: astore #18
    //   667: aload #17
    //   669: astore #14
    //   671: aload #19
    //   673: astore #15
    //   675: aload #20
    //   677: astore #16
    //   679: aload #21
    //   681: astore #17
    //   683: goto -> 1259
    //   686: aload #18
    //   688: invokevirtual c : ()I
    //   691: ifeq -> 702
    //   694: aload #14
    //   696: aload #18
    //   698: invokevirtual add : (Ljava/lang/Object;)Z
    //   701: pop
    //   702: aload #17
    //   704: invokevirtual c : ()I
    //   707: ifeq -> 718
    //   710: aload #14
    //   712: aload #17
    //   714: invokevirtual add : (Ljava/lang/Object;)Z
    //   717: pop
    //   718: aload #15
    //   720: aload #15
    //   722: invokevirtual a : ()J
    //   725: l2i
    //   726: iconst_1
    //   727: isub
    //   728: invokevirtual b : (I)B
    //   731: istore_1
    //   732: aload #15
    //   734: aload #15
    //   736: invokevirtual a : ()J
    //   739: l2i
    //   740: iload_1
    //   741: isub
    //   742: iconst_1
    //   743: isub
    //   744: iload_1
    //   745: getstatic e/d/b/f.c : Ljava/nio/charset/Charset;
    //   748: invokevirtual c : (IILjava/nio/charset/Charset;)Ljava/lang/String;
    //   751: astore #15
    //   753: new java/lang/StringBuilder
    //   756: dup
    //   757: invokespecial <init> : ()V
    //   760: astore #17
    //   762: aload #17
    //   764: bipush #34
    //   766: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   769: pop
    //   770: aload #17
    //   772: aload #15
    //   774: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   777: pop
    //   778: aload #17
    //   780: bipush #34
    //   782: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   785: pop
    //   786: aload #17
    //   788: ldc_w ' having '
    //   791: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   794: pop
    //   795: aload #16
    //   797: ifnull -> 826
    //   800: aload #17
    //   802: ldc_w 'initial fill rule "'
    //   805: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   808: pop
    //   809: aload #17
    //   811: aload #16
    //   813: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   816: pop
    //   817: aload #17
    //   819: ldc_w '" and '
    //   822: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   825: pop
    //   826: aload #17
    //   828: aload #14
    //   830: invokevirtual size : ()I
    //   833: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   836: pop
    //   837: aload #14
    //   839: invokevirtual size : ()I
    //   842: iconst_1
    //   843: if_icmpne -> 1300
    //   846: ldc_w ' subpath:'
    //   849: astore #15
    //   851: goto -> 854
    //   854: aload #17
    //   856: aload #15
    //   858: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   861: pop
    //   862: aload #14
    //   864: invokevirtual iterator : ()Ljava/util/Iterator;
    //   867: astore #18
    //   869: aload #18
    //   871: invokeinterface hasNext : ()Z
    //   876: ifeq -> 1176
    //   879: aload #18
    //   881: invokeinterface next : ()Ljava/lang/Object;
    //   886: checkcast e/d/c/a0/k
    //   889: astore #16
    //   891: aload #17
    //   893: ldc_w '\\n- '
    //   896: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   899: pop
    //   900: aload #17
    //   902: aload #16
    //   904: invokevirtual b : ()Ljava/lang/String;
    //   907: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   910: pop
    //   911: aload #17
    //   913: ldc_w ' with '
    //   916: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   919: pop
    //   920: aload #17
    //   922: aload #14
    //   924: invokevirtual size : ()I
    //   927: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   930: pop
    //   931: aload #14
    //   933: invokevirtual size : ()I
    //   936: iconst_1
    //   937: if_icmpne -> 1308
    //   940: ldc_w ' knot:'
    //   943: astore #15
    //   945: goto -> 948
    //   948: aload #17
    //   950: aload #15
    //   952: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   955: pop
    //   956: aload #16
    //   958: invokevirtual a : ()Ljava/lang/Iterable;
    //   961: invokeinterface iterator : ()Ljava/util/Iterator;
    //   966: astore #19
    //   968: aload #12
    //   970: astore #16
    //   972: aload #13
    //   974: astore #15
    //   976: aload #15
    //   978: astore #13
    //   980: aload #16
    //   982: astore #12
    //   984: aload #19
    //   986: invokeinterface hasNext : ()Z
    //   991: ifeq -> 869
    //   994: aload #19
    //   996: invokeinterface next : ()Ljava/lang/Object;
    //   1001: checkcast e/d/c/a0/c
    //   1004: astore #12
    //   1006: aload #17
    //   1008: ldc_w '\\n  - '
    //   1011: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1014: pop
    //   1015: aload #17
    //   1017: aload #12
    //   1019: invokevirtual a : ()Ljava/lang/String;
    //   1022: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1025: pop
    //   1026: aload #17
    //   1028: ldc_w ' ('
    //   1031: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1034: pop
    //   1035: aload #17
    //   1037: aload #12
    //   1039: iconst_0
    //   1040: invokevirtual a : (I)D
    //   1043: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   1046: pop
    //   1047: aload #17
    //   1049: aload #16
    //   1051: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1054: pop
    //   1055: aload #17
    //   1057: aload #12
    //   1059: iconst_1
    //   1060: invokevirtual a : (I)D
    //   1063: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   1066: pop
    //   1067: aload #17
    //   1069: aload #15
    //   1071: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1074: pop
    //   1075: aload #17
    //   1077: ldc_w ' ('
    //   1080: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1083: pop
    //   1084: aload #17
    //   1086: aload #12
    //   1088: iconst_2
    //   1089: invokevirtual a : (I)D
    //   1092: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   1095: pop
    //   1096: aload #17
    //   1098: aload #16
    //   1100: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1103: pop
    //   1104: aload #17
    //   1106: aload #12
    //   1108: iconst_3
    //   1109: invokevirtual a : (I)D
    //   1112: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   1115: pop
    //   1116: aload #17
    //   1118: aload #15
    //   1120: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1123: pop
    //   1124: aload #17
    //   1126: ldc_w ' ('
    //   1129: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1132: pop
    //   1133: aload #17
    //   1135: aload #12
    //   1137: iconst_4
    //   1138: invokevirtual a : (I)D
    //   1141: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   1144: pop
    //   1145: aload #17
    //   1147: aload #16
    //   1149: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1152: pop
    //   1153: aload #17
    //   1155: aload #12
    //   1157: iconst_5
    //   1158: invokevirtual a : (I)D
    //   1161: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   1164: pop
    //   1165: aload #17
    //   1167: aload #15
    //   1169: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1172: pop
    //   1173: goto -> 976
    //   1176: aload #17
    //   1178: invokevirtual toString : ()Ljava/lang/String;
    //   1181: astore #12
    //   1183: aload #12
    //   1185: areturn
    //   1186: aconst_null
    //   1187: areturn
    //   1188: aconst_null
    //   1189: areturn
    //   1190: astore #12
    //   1192: goto -> 1188
    //   1195: astore #12
    //   1197: goto -> 1186
    //   1200: ldc_w 'without all pixels'
    //   1203: astore #16
    //   1205: aload #13
    //   1207: astore #19
    //   1209: aload #12
    //   1211: astore #20
    //   1213: aload #15
    //   1215: astore #13
    //   1217: aload #14
    //   1219: astore #12
    //   1221: aload #19
    //   1223: astore #15
    //   1225: aload #20
    //   1227: astore #19
    //   1229: goto -> 1271
    //   1232: iconst_0
    //   1233: istore #9
    //   1235: goto -> 257
    //   1238: goto -> 421
    //   1241: iconst_0
    //   1242: istore #9
    //   1244: goto -> 506
    //   1247: aload #17
    //   1249: astore #19
    //   1251: aload #14
    //   1253: astore #17
    //   1255: aload #19
    //   1257: astore #14
    //   1259: aload #16
    //   1261: astore #19
    //   1263: aload #17
    //   1265: astore #16
    //   1267: aload #14
    //   1269: astore #17
    //   1271: iload #8
    //   1273: iconst_1
    //   1274: iadd
    //   1275: istore #8
    //   1277: aload #12
    //   1279: astore #14
    //   1281: aload #13
    //   1283: astore #20
    //   1285: aload #15
    //   1287: astore #13
    //   1289: aload #19
    //   1291: astore #12
    //   1293: aload #20
    //   1295: astore #15
    //   1297: goto -> 99
    //   1300: ldc_w ' subpaths:'
    //   1303: astore #15
    //   1305: goto -> 854
    //   1308: ldc_w ' knots:'
    //   1311: astore #15
    //   1313: goto -> 948
    // Exception table:
    //   from	to	target	type
    //   8	21	1190	java/lang/Exception
    //   28	93	1190	java/lang/Exception
    //   112	121	1195	java/lang/Exception
    //   203	216	1195	java/lang/Exception
    //   229	240	1195	java/lang/Exception
    //   243	254	1195	java/lang/Exception
    //   270	310	1195	java/lang/Exception
    //   328	339	1195	java/lang/Exception
    //   360	367	1195	java/lang/Exception
    //   402	418	1195	java/lang/Exception
    //   425	437	1195	java/lang/Exception
    //   478	489	1195	java/lang/Exception
    //   492	503	1195	java/lang/Exception
    //   519	559	1195	java/lang/Exception
    //   577	588	1195	java/lang/Exception
    //   597	604	1195	java/lang/Exception
    //   639	655	1195	java/lang/Exception
    //   655	667	1195	java/lang/Exception
    //   686	702	1195	java/lang/Exception
    //   702	718	1195	java/lang/Exception
    //   718	795	1195	java/lang/Exception
    //   800	826	1195	java/lang/Exception
    //   826	846	1195	java/lang/Exception
    //   854	869	1195	java/lang/Exception
    //   869	940	1195	java/lang/Exception
    //   948	968	1195	java/lang/Exception
    //   984	1173	1195	java/lang/Exception
    //   1176	1183	1195	java/lang/Exception
  }
  
  public String l(int paramInt) {
    int i;
    int k;
    int m;
    int n;
    int i1;
    try {
      byte[] arrayOfByte = ((e)this.a).d(paramInt);
      if (arrayOfByte == null)
        return null; 
      b b = new b(arrayOfByte);
      paramInt = b.g(0);
      i = b.g(4);
      k = b.g(8);
      m = b.g(16);
      n = b.g(20);
      i1 = b.g(24);
      if (paramInt == 1) {
        null = "JpegRGB";
        return String.format("%s, %dx%d, Decomp %d bytes, %d bpp, %d bytes", new Object[] { null, Integer.valueOf(i), Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(i1), Integer.valueOf(n) });
      } 
    } catch (IOException iOException) {
      return null;
    } 
    null = "RawRGB";
    return String.format("%s, %dx%d, Decomp %d bytes, %d bpp, %d bytes", new Object[] { null, Integer.valueOf(i), Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(i1), Integer.valueOf(n) });
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/a0/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */