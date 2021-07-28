package i.a.a.h;

import i.a.a.e.f;
import i.a.a.e.l;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.util.HashMap;

public class a {
  private RandomAccessFile a(l paraml, String paramString) {
    if (paraml != null && e.h(paraml.i()))
      try {
        return new RandomAccessFile(new File(paraml.i()), paramString);
      } catch (FileNotFoundException fileNotFoundException) {
        throw new i.a.a.c.a(fileNotFoundException);
      }  
    throw new i.a.a.c.a("input parameter is null in getFilePointer, cannot create file handler to remove file");
  }
  
  private void a(File paramFile, String paramString) {
    if (paramFile.delete()) {
      if ((new File(paramString)).renameTo(paramFile))
        return; 
      throw new i.a.a.c.a("cannot rename modified zip file");
    } 
    throw new i.a.a.c.a("cannot delete old zip file");
  }
  
  private void a(RandomAccessFile paramRandomAccessFile, OutputStream paramOutputStream, long paramLong1, long paramLong2, i.a.a.f.a parama) {
    if (paramRandomAccessFile != null && paramOutputStream != null) {
      long l = 0L;
      if (paramLong1 >= 0L) {
        if (paramLong2 >= 0L) {
          if (paramLong1 <= paramLong2) {
            if (paramLong1 == paramLong2)
              return; 
            if (parama.c()) {
              parama.c(3);
              parama.d(0);
              return;
            } 
            try {
              byte[] arrayOfByte;
              paramRandomAccessFile.seek(paramLong1);
              long l1 = paramLong2 - paramLong1;
              if (l1 < 4096L) {
                arrayOfByte = new byte[(int)l1];
                paramLong1 = l;
              } else {
                arrayOfByte = new byte[4096];
                paramLong1 = l;
              } 
              while (true) {
                int i = paramRandomAccessFile.read(arrayOfByte);
                if (i != -1) {
                  paramOutputStream.write(arrayOfByte, 0, i);
                  paramLong2 = i;
                  parama.b(paramLong2);
                  if (parama.c()) {
                    parama.c(3);
                    return;
                  } 
                } else {
                  return;
                } 
                paramLong2 = paramLong1 + paramLong2;
                if (paramLong2 == l1)
                  break; 
                paramLong1 = paramLong2;
                if (arrayOfByte.length + paramLong2 > l1) {
                  arrayOfByte = new byte[(int)(l1 - paramLong2)];
                  paramLong1 = paramLong2;
                } 
              } 
            } catch (IOException iOException) {
              throw new i.a.a.c.a(iOException);
            } catch (Exception exception) {
              throw new i.a.a.c.a(exception);
            } 
          } else {
            throw new i.a.a.c.a("start offset is greater than end offset, cannot copy file");
          } 
        } else {
          throw new i.a.a.c.a("end offset is negative, cannot copy file");
        } 
      } else {
        throw new i.a.a.c.a("starting offset is negative, cannot copy file");
      } 
    } else {
      i.a.a.c.a a1 = new i.a.a.c.a("input or output stream is null, cannot copy file");
      throw a1;
    } 
  }
  
  public HashMap a(l paraml, f paramf, i.a.a.f.a parama) {
    // Byte code:
    //   0: aload_2
    //   1: ifnull -> 1737
    //   4: aload_1
    //   5: ifnull -> 1737
    //   8: new java/util/HashMap
    //   11: dup
    //   12: invokespecial <init> : ()V
    //   15: astore #22
    //   17: aload_1
    //   18: aload_2
    //   19: invokestatic a : (Li/a/a/e/l;Li/a/a/e/f;)I
    //   22: istore #4
    //   24: iload #4
    //   26: iflt -> 1503
    //   29: aload_1
    //   30: invokevirtual j : ()Z
    //   33: ifne -> 1493
    //   36: invokestatic currentTimeMillis : ()J
    //   39: lstore #6
    //   41: new java/lang/StringBuilder
    //   44: dup
    //   45: invokespecial <init> : ()V
    //   48: astore #15
    //   50: aload #15
    //   52: aload_1
    //   53: invokevirtual i : ()Ljava/lang/String;
    //   56: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   59: pop
    //   60: aload #15
    //   62: lload #6
    //   64: ldc2_w 1000
    //   67: lrem
    //   68: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   71: pop
    //   72: aload #15
    //   74: invokevirtual toString : ()Ljava/lang/String;
    //   77: astore #15
    //   79: new java/io/File
    //   82: dup
    //   83: aload #15
    //   85: invokespecial <init> : (Ljava/lang/String;)V
    //   88: astore #16
    //   90: aload #16
    //   92: invokevirtual exists : ()Z
    //   95: istore #14
    //   97: iload #14
    //   99: ifeq -> 291
    //   102: aload #15
    //   104: astore #16
    //   106: aload #15
    //   108: astore #17
    //   110: aload #15
    //   112: astore #18
    //   114: invokestatic currentTimeMillis : ()J
    //   117: lstore #6
    //   119: aload #15
    //   121: astore #16
    //   123: aload #15
    //   125: astore #17
    //   127: aload #15
    //   129: astore #18
    //   131: new java/lang/StringBuilder
    //   134: dup
    //   135: invokespecial <init> : ()V
    //   138: astore #19
    //   140: aload #15
    //   142: astore #16
    //   144: aload #15
    //   146: astore #17
    //   148: aload #15
    //   150: astore #18
    //   152: aload #19
    //   154: aload_1
    //   155: invokevirtual i : ()Ljava/lang/String;
    //   158: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   161: pop
    //   162: aload #15
    //   164: astore #16
    //   166: aload #15
    //   168: astore #17
    //   170: aload #15
    //   172: astore #18
    //   174: aload #19
    //   176: lload #6
    //   178: ldc2_w 1000
    //   181: lrem
    //   182: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   185: pop
    //   186: aload #15
    //   188: astore #16
    //   190: aload #15
    //   192: astore #17
    //   194: aload #15
    //   196: astore #18
    //   198: aload #19
    //   200: invokevirtual toString : ()Ljava/lang/String;
    //   203: astore #15
    //   205: aload #15
    //   207: astore #16
    //   209: aload #15
    //   211: astore #17
    //   213: aload #15
    //   215: astore #18
    //   217: new java/io/File
    //   220: dup
    //   221: aload #15
    //   223: invokespecial <init> : (Ljava/lang/String;)V
    //   226: astore #19
    //   228: aload #19
    //   230: astore #16
    //   232: goto -> 90
    //   235: astore_1
    //   236: aload #16
    //   238: astore_2
    //   239: iconst_0
    //   240: istore #4
    //   242: aconst_null
    //   243: astore_3
    //   244: aconst_null
    //   245: astore #18
    //   247: aconst_null
    //   248: astore #15
    //   250: goto -> 1676
    //   253: astore_1
    //   254: aload #17
    //   256: astore_2
    //   257: aconst_null
    //   258: astore #15
    //   260: iconst_0
    //   261: istore #4
    //   263: aconst_null
    //   264: astore #18
    //   266: aconst_null
    //   267: astore #16
    //   269: goto -> 1560
    //   272: astore_1
    //   273: aload #18
    //   275: astore_2
    //   276: aconst_null
    //   277: astore #15
    //   279: iconst_0
    //   280: istore #4
    //   282: aconst_null
    //   283: astore #18
    //   285: aconst_null
    //   286: astore #16
    //   288: goto -> 1612
    //   291: new i/a/a/d/g
    //   294: dup
    //   295: new java/io/File
    //   298: dup
    //   299: aload #15
    //   301: invokespecial <init> : (Ljava/lang/String;)V
    //   304: invokespecial <init> : (Ljava/io/File;)V
    //   307: astore #18
    //   309: new java/io/File
    //   312: dup
    //   313: aload_1
    //   314: invokevirtual i : ()Ljava/lang/String;
    //   317: invokespecial <init> : (Ljava/lang/String;)V
    //   320: astore #16
    //   322: aload_0
    //   323: aload_1
    //   324: ldc 'r'
    //   326: invokespecial a : (Li/a/a/e/l;Ljava/lang/String;)Ljava/io/RandomAccessFile;
    //   329: astore #17
    //   331: new i/a/a/a/a
    //   334: dup
    //   335: aload #17
    //   337: invokespecial <init> : (Ljava/io/RandomAccessFile;)V
    //   340: aload_2
    //   341: invokevirtual a : (Li/a/a/e/f;)Li/a/a/e/g;
    //   344: ifnull -> 1213
    //   347: aload_2
    //   348: invokevirtual o : ()J
    //   351: lstore #8
    //   353: aload_2
    //   354: invokevirtual u : ()Li/a/a/e/k;
    //   357: astore #19
    //   359: aload #19
    //   361: ifnull -> 420
    //   364: aload_2
    //   365: invokevirtual u : ()Li/a/a/e/k;
    //   368: invokevirtual c : ()J
    //   371: ldc2_w -1
    //   374: lcmp
    //   375: ifeq -> 420
    //   378: aload_2
    //   379: invokevirtual u : ()Li/a/a/e/k;
    //   382: invokevirtual c : ()J
    //   385: lstore #8
    //   387: goto -> 420
    //   390: astore_1
    //   391: aload #15
    //   393: astore_2
    //   394: aload #16
    //   396: astore #15
    //   398: aload #17
    //   400: astore #16
    //   402: goto -> 1557
    //   405: astore_1
    //   406: aload #15
    //   408: astore_2
    //   409: aload #16
    //   411: astore #15
    //   413: aload #17
    //   415: astore #16
    //   417: goto -> 1785
    //   420: aload_1
    //   421: invokevirtual b : ()Li/a/a/e/d;
    //   424: invokevirtual f : ()J
    //   427: lstore #6
    //   429: aload_1
    //   430: invokevirtual k : ()Z
    //   433: istore #14
    //   435: lload #6
    //   437: lstore #10
    //   439: iload #14
    //   441: ifeq -> 464
    //   444: lload #6
    //   446: lstore #10
    //   448: aload_1
    //   449: invokevirtual h : ()Li/a/a/e/j;
    //   452: ifnull -> 464
    //   455: aload_1
    //   456: invokevirtual h : ()Li/a/a/e/j;
    //   459: invokevirtual b : ()J
    //   462: lstore #10
    //   464: aload_1
    //   465: invokevirtual a : ()Li/a/a/e/b;
    //   468: invokevirtual a : ()Ljava/util/ArrayList;
    //   471: astore #19
    //   473: iload #4
    //   475: aload #19
    //   477: invokevirtual size : ()I
    //   480: iconst_1
    //   481: isub
    //   482: if_icmpne -> 494
    //   485: lload #10
    //   487: lconst_1
    //   488: lsub
    //   489: lstore #6
    //   491: goto -> 1768
    //   494: aload #19
    //   496: iload #4
    //   498: iconst_1
    //   499: iadd
    //   500: invokevirtual get : (I)Ljava/lang/Object;
    //   503: checkcast i/a/a/e/f
    //   506: astore_2
    //   507: aload_2
    //   508: ifnull -> 566
    //   511: aload_2
    //   512: invokevirtual o : ()J
    //   515: lconst_1
    //   516: lsub
    //   517: lstore #12
    //   519: lload #12
    //   521: lstore #6
    //   523: aload_2
    //   524: invokevirtual u : ()Li/a/a/e/k;
    //   527: ifnull -> 571
    //   530: lload #12
    //   532: lstore #6
    //   534: aload_2
    //   535: invokevirtual u : ()Li/a/a/e/k;
    //   538: invokevirtual c : ()J
    //   541: ldc2_w -1
    //   544: lcmp
    //   545: ifeq -> 571
    //   548: aload_2
    //   549: invokevirtual u : ()Li/a/a/e/k;
    //   552: invokevirtual c : ()J
    //   555: lstore #6
    //   557: lload #6
    //   559: lconst_1
    //   560: lsub
    //   561: lstore #6
    //   563: goto -> 1768
    //   566: ldc2_w -1
    //   569: lstore #6
    //   571: lload #8
    //   573: lconst_0
    //   574: lcmp
    //   575: iflt -> 1203
    //   578: lload #6
    //   580: lconst_0
    //   581: lcmp
    //   582: iflt -> 1203
    //   585: iload #4
    //   587: ifne -> 663
    //   590: aload_1
    //   591: invokevirtual a : ()Li/a/a/e/b;
    //   594: invokevirtual a : ()Ljava/util/ArrayList;
    //   597: invokevirtual size : ()I
    //   600: istore #5
    //   602: iload #5
    //   604: iconst_1
    //   605: if_icmple -> 626
    //   608: aload_0
    //   609: aload #17
    //   611: aload #18
    //   613: lload #6
    //   615: lconst_1
    //   616: ladd
    //   617: lload #10
    //   619: aload_3
    //   620: invokespecial a : (Ljava/io/RandomAccessFile;Ljava/io/OutputStream;JJLi/a/a/f/a;)V
    //   623: goto -> 729
    //   626: goto -> 729
    //   629: astore_1
    //   630: goto -> 1172
    //   633: astore_1
    //   634: aload #15
    //   636: astore_2
    //   637: aload #16
    //   639: astore #15
    //   641: aload #17
    //   643: astore #16
    //   645: goto -> 1557
    //   648: astore_1
    //   649: aload #15
    //   651: astore_2
    //   652: aload #16
    //   654: astore #15
    //   656: aload #17
    //   658: astore #16
    //   660: goto -> 1785
    //   663: aload #17
    //   665: astore_2
    //   666: aload #19
    //   668: invokevirtual size : ()I
    //   671: istore #5
    //   673: iload #4
    //   675: iload #5
    //   677: iconst_1
    //   678: isub
    //   679: if_icmpne -> 704
    //   682: aload_0
    //   683: aload_2
    //   684: aload #18
    //   686: lconst_0
    //   687: lload #8
    //   689: aload_3
    //   690: invokespecial a : (Ljava/io/RandomAccessFile;Ljava/io/OutputStream;JJLi/a/a/f/a;)V
    //   693: goto -> 729
    //   696: astore_1
    //   697: goto -> 634
    //   700: astore_1
    //   701: goto -> 649
    //   704: aload_0
    //   705: aload_2
    //   706: aload #18
    //   708: lconst_0
    //   709: lload #8
    //   711: aload_3
    //   712: invokespecial a : (Ljava/io/RandomAccessFile;Ljava/io/OutputStream;JJLi/a/a/f/a;)V
    //   715: aload_0
    //   716: aload_2
    //   717: aload #18
    //   719: lload #6
    //   721: lconst_1
    //   722: ladd
    //   723: lload #10
    //   725: aload_3
    //   726: invokespecial a : (Ljava/io/RandomAccessFile;Ljava/io/OutputStream;JJLi/a/a/f/a;)V
    //   729: aload #16
    //   731: astore #19
    //   733: aload #15
    //   735: astore #20
    //   737: aload #17
    //   739: astore #21
    //   741: aload_3
    //   742: invokevirtual c : ()Z
    //   745: istore #14
    //   747: iload #14
    //   749: ifeq -> 824
    //   752: aload_3
    //   753: iconst_3
    //   754: invokevirtual c : (I)V
    //   757: aload_3
    //   758: iconst_0
    //   759: invokevirtual d : (I)V
    //   762: aload #21
    //   764: ifnull -> 772
    //   767: aload #21
    //   769: invokevirtual close : ()V
    //   772: aload #18
    //   774: invokevirtual close : ()V
    //   777: new java/io/File
    //   780: dup
    //   781: aload #20
    //   783: invokespecial <init> : (Ljava/lang/String;)V
    //   786: invokevirtual delete : ()Z
    //   789: pop
    //   790: aconst_null
    //   791: areturn
    //   792: new i/a/a/c/a
    //   795: dup
    //   796: ldc 'cannot close input stream or output stream when trying to delete a file from zip file'
    //   798: invokespecial <init> : (Ljava/lang/String;)V
    //   801: athrow
    //   802: astore_1
    //   803: goto -> 1147
    //   806: astore_1
    //   807: goto -> 1147
    //   810: astore_1
    //   811: aload #20
    //   813: astore_2
    //   814: goto -> 637
    //   817: astore_1
    //   818: aload #20
    //   820: astore_2
    //   821: goto -> 652
    //   824: aload #20
    //   826: astore_2
    //   827: aload_1
    //   828: invokevirtual b : ()Li/a/a/e/d;
    //   831: aload #18
    //   833: invokevirtual b : ()J
    //   836: invokevirtual a : (J)V
    //   839: aload_1
    //   840: invokevirtual b : ()Li/a/a/e/d;
    //   843: aload_1
    //   844: invokevirtual b : ()Li/a/a/e/d;
    //   847: invokevirtual h : ()I
    //   850: iconst_1
    //   851: isub
    //   852: invokevirtual e : (I)V
    //   855: aload_1
    //   856: invokevirtual b : ()Li/a/a/e/d;
    //   859: aload_1
    //   860: invokevirtual b : ()Li/a/a/e/d;
    //   863: invokevirtual i : ()I
    //   866: iconst_1
    //   867: isub
    //   868: invokevirtual f : (I)V
    //   871: aload_1
    //   872: invokevirtual a : ()Li/a/a/e/b;
    //   875: invokevirtual a : ()Ljava/util/ArrayList;
    //   878: iload #4
    //   880: invokevirtual remove : (I)Ljava/lang/Object;
    //   883: pop
    //   884: iload #4
    //   886: aload_1
    //   887: invokevirtual a : ()Li/a/a/e/b;
    //   890: invokevirtual a : ()Ljava/util/ArrayList;
    //   893: invokevirtual size : ()I
    //   896: if_icmpge -> 1036
    //   899: aload_1
    //   900: invokevirtual a : ()Li/a/a/e/b;
    //   903: invokevirtual a : ()Ljava/util/ArrayList;
    //   906: iload #4
    //   908: invokevirtual get : (I)Ljava/lang/Object;
    //   911: checkcast i/a/a/e/f
    //   914: invokevirtual o : ()J
    //   917: lstore #12
    //   919: lload #12
    //   921: lstore #10
    //   923: aload_1
    //   924: invokevirtual a : ()Li/a/a/e/b;
    //   927: invokevirtual a : ()Ljava/util/ArrayList;
    //   930: iload #4
    //   932: invokevirtual get : (I)Ljava/lang/Object;
    //   935: checkcast i/a/a/e/f
    //   938: invokevirtual u : ()Li/a/a/e/k;
    //   941: ifnull -> 999
    //   944: lload #12
    //   946: lstore #10
    //   948: aload_1
    //   949: invokevirtual a : ()Li/a/a/e/b;
    //   952: invokevirtual a : ()Ljava/util/ArrayList;
    //   955: iload #4
    //   957: invokevirtual get : (I)Ljava/lang/Object;
    //   960: checkcast i/a/a/e/f
    //   963: invokevirtual u : ()Li/a/a/e/k;
    //   966: invokevirtual c : ()J
    //   969: ldc2_w -1
    //   972: lcmp
    //   973: ifeq -> 999
    //   976: aload_1
    //   977: invokevirtual a : ()Li/a/a/e/b;
    //   980: invokevirtual a : ()Ljava/util/ArrayList;
    //   983: iload #4
    //   985: invokevirtual get : (I)Ljava/lang/Object;
    //   988: checkcast i/a/a/e/f
    //   991: invokevirtual u : ()Li/a/a/e/k;
    //   994: invokevirtual c : ()J
    //   997: lstore #10
    //   999: aload_1
    //   1000: invokevirtual a : ()Li/a/a/e/b;
    //   1003: invokevirtual a : ()Ljava/util/ArrayList;
    //   1006: iload #4
    //   1008: invokevirtual get : (I)Ljava/lang/Object;
    //   1011: checkcast i/a/a/e/f
    //   1014: lload #10
    //   1016: lload #6
    //   1018: lload #8
    //   1020: lsub
    //   1021: lsub
    //   1022: lconst_1
    //   1023: lsub
    //   1024: invokevirtual c : (J)V
    //   1027: iload #4
    //   1029: iconst_1
    //   1030: iadd
    //   1031: istore #4
    //   1033: goto -> 884
    //   1036: new i/a/a/a/b
    //   1039: dup
    //   1040: invokespecial <init> : ()V
    //   1043: aload_1
    //   1044: aload #18
    //   1046: invokevirtual a : (Li/a/a/e/l;Ljava/io/OutputStream;)V
    //   1049: aload #22
    //   1051: ldc 'offsetCentralDir'
    //   1053: aload_1
    //   1054: invokevirtual b : ()Li/a/a/e/d;
    //   1057: invokevirtual f : ()J
    //   1060: invokestatic toString : (J)Ljava/lang/String;
    //   1063: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1066: pop
    //   1067: aload #21
    //   1069: ifnull -> 1077
    //   1072: aload #21
    //   1074: invokevirtual close : ()V
    //   1077: aload #18
    //   1079: invokevirtual close : ()V
    //   1082: aload_0
    //   1083: aload #19
    //   1085: aload_2
    //   1086: invokespecial a : (Ljava/io/File;Ljava/lang/String;)V
    //   1089: aload #22
    //   1091: areturn
    //   1092: new i/a/a/c/a
    //   1095: dup
    //   1096: ldc 'cannot close input stream or output stream when trying to delete a file from zip file'
    //   1098: invokespecial <init> : (Ljava/lang/String;)V
    //   1101: athrow
    //   1102: astore_1
    //   1103: aload #19
    //   1105: astore_3
    //   1106: iconst_1
    //   1107: istore #4
    //   1109: aload #21
    //   1111: astore #15
    //   1113: goto -> 1676
    //   1116: astore_1
    //   1117: aload #19
    //   1119: astore #15
    //   1121: iconst_1
    //   1122: istore #4
    //   1124: aload #21
    //   1126: astore #16
    //   1128: goto -> 1560
    //   1131: astore_1
    //   1132: aload #19
    //   1134: astore #15
    //   1136: iconst_1
    //   1137: istore #4
    //   1139: aload #21
    //   1141: astore #16
    //   1143: goto -> 1612
    //   1146: astore_1
    //   1147: aload #20
    //   1149: astore_2
    //   1150: iconst_0
    //   1151: istore #4
    //   1153: aload #19
    //   1155: astore_3
    //   1156: aload #21
    //   1158: astore #15
    //   1160: goto -> 1676
    //   1163: astore_1
    //   1164: goto -> 637
    //   1167: astore_1
    //   1168: goto -> 652
    //   1171: astore_1
    //   1172: aload #15
    //   1174: astore_2
    //   1175: aload #16
    //   1177: astore_3
    //   1178: goto -> 1277
    //   1181: astore_1
    //   1182: aload #15
    //   1184: astore_2
    //   1185: aload #16
    //   1187: astore #15
    //   1189: goto -> 1295
    //   1192: astore_1
    //   1193: aload #15
    //   1195: astore_2
    //   1196: aload #16
    //   1198: astore #15
    //   1200: goto -> 1310
    //   1203: new i/a/a/c/a
    //   1206: dup
    //   1207: ldc 'invalid offset for start and end of local file, cannot remove file'
    //   1209: invokespecial <init> : (Ljava/lang/String;)V
    //   1212: athrow
    //   1213: new i/a/a/c/a
    //   1216: dup
    //   1217: ldc 'invalid local file header, cannot remove file from archive'
    //   1219: invokespecial <init> : (Ljava/lang/String;)V
    //   1222: athrow
    //   1223: aload #16
    //   1225: astore_3
    //   1226: aload #15
    //   1228: astore_2
    //   1229: iconst_0
    //   1230: istore #4
    //   1232: astore_1
    //   1233: aload #17
    //   1235: astore #15
    //   1237: goto -> 1676
    //   1240: aload #15
    //   1242: astore_2
    //   1243: astore_1
    //   1244: aload #16
    //   1246: astore #15
    //   1248: aload #17
    //   1250: astore #16
    //   1252: goto -> 1557
    //   1255: aload #15
    //   1257: astore_2
    //   1258: astore_1
    //   1259: aload #16
    //   1261: astore #15
    //   1263: aload #17
    //   1265: astore #16
    //   1267: goto -> 1785
    //   1270: astore_1
    //   1271: aload #16
    //   1273: astore_3
    //   1274: aload #15
    //   1276: astore_2
    //   1277: aload #17
    //   1279: astore #15
    //   1281: iconst_0
    //   1282: istore #4
    //   1284: goto -> 1676
    //   1287: astore_1
    //   1288: aload #15
    //   1290: astore_2
    //   1291: aload #16
    //   1293: astore #15
    //   1295: aload #17
    //   1297: astore #16
    //   1299: goto -> 1557
    //   1302: astore_1
    //   1303: aload #15
    //   1305: astore_2
    //   1306: aload #16
    //   1308: astore #15
    //   1310: aload #17
    //   1312: astore #16
    //   1314: goto -> 1785
    //   1317: astore_1
    //   1318: aload #16
    //   1320: astore_3
    //   1321: aload #15
    //   1323: astore_2
    //   1324: iconst_0
    //   1325: istore #4
    //   1327: aconst_null
    //   1328: astore #15
    //   1330: goto -> 1676
    //   1333: astore_1
    //   1334: aload #15
    //   1336: astore_2
    //   1337: aconst_null
    //   1338: astore #17
    //   1340: aload #16
    //   1342: astore #15
    //   1344: aload #17
    //   1346: astore #16
    //   1348: goto -> 1557
    //   1351: astore_1
    //   1352: aload #15
    //   1354: astore_2
    //   1355: aconst_null
    //   1356: astore #17
    //   1358: aload #16
    //   1360: astore #15
    //   1362: aload #17
    //   1364: astore #16
    //   1366: goto -> 1785
    //   1369: astore_1
    //   1370: aload #15
    //   1372: astore_2
    //   1373: iconst_0
    //   1374: istore #4
    //   1376: aconst_null
    //   1377: astore_3
    //   1378: aload_3
    //   1379: astore #15
    //   1381: goto -> 1676
    //   1384: astore_1
    //   1385: aload #15
    //   1387: astore_2
    //   1388: aconst_null
    //   1389: astore #15
    //   1391: aload #15
    //   1393: astore #16
    //   1395: goto -> 1557
    //   1398: astore_1
    //   1399: aload #15
    //   1401: astore_2
    //   1402: aconst_null
    //   1403: astore #15
    //   1405: aload #15
    //   1407: astore #16
    //   1409: goto -> 1785
    //   1412: astore_1
    //   1413: new i/a/a/c/a
    //   1416: dup
    //   1417: aload_1
    //   1418: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   1421: athrow
    //   1422: astore_1
    //   1423: aload #15
    //   1425: astore_2
    //   1426: goto -> 1468
    //   1429: astore_1
    //   1430: aload #15
    //   1432: astore_2
    //   1433: goto -> 1477
    //   1436: astore_1
    //   1437: aload #15
    //   1439: astore_2
    //   1440: goto -> 1487
    //   1443: astore_1
    //   1444: aload #15
    //   1446: astore_2
    //   1447: goto -> 1468
    //   1450: astore_1
    //   1451: aload #15
    //   1453: astore_2
    //   1454: goto -> 1477
    //   1457: astore_1
    //   1458: aload #15
    //   1460: astore_2
    //   1461: goto -> 1487
    //   1464: astore_1
    //   1465: aload #15
    //   1467: astore_2
    //   1468: aconst_null
    //   1469: astore_3
    //   1470: goto -> 1530
    //   1473: astore_1
    //   1474: aload #15
    //   1476: astore_2
    //   1477: aconst_null
    //   1478: astore #15
    //   1480: goto -> 1549
    //   1483: astore_1
    //   1484: aload #15
    //   1486: astore_2
    //   1487: aconst_null
    //   1488: astore #15
    //   1490: goto -> 1777
    //   1493: new i/a/a/c/a
    //   1496: dup
    //   1497: ldc 'This is a split archive. Zip file format does not allow updating split/spanned files'
    //   1499: invokespecial <init> : (Ljava/lang/String;)V
    //   1502: athrow
    //   1503: new i/a/a/c/a
    //   1506: dup
    //   1507: ldc 'file header not found in zip model, cannot remove file'
    //   1509: invokespecial <init> : (Ljava/lang/String;)V
    //   1512: athrow
    //   1513: astore_1
    //   1514: goto -> 1526
    //   1517: astore_1
    //   1518: goto -> 1544
    //   1521: astore_1
    //   1522: goto -> 1772
    //   1525: astore_1
    //   1526: aconst_null
    //   1527: astore_2
    //   1528: aload_2
    //   1529: astore_3
    //   1530: iconst_0
    //   1531: istore #4
    //   1533: aload_3
    //   1534: astore #18
    //   1536: aload #18
    //   1538: astore #15
    //   1540: goto -> 1676
    //   1543: astore_1
    //   1544: aconst_null
    //   1545: astore_2
    //   1546: aload_2
    //   1547: astore #15
    //   1549: aload #15
    //   1551: astore #18
    //   1553: aload #18
    //   1555: astore #16
    //   1557: iconst_0
    //   1558: istore #4
    //   1560: aload_2
    //   1561: astore #17
    //   1563: aload #15
    //   1565: astore #19
    //   1567: iload #4
    //   1569: istore #5
    //   1571: aload #18
    //   1573: astore #20
    //   1575: aload #16
    //   1577: astore #21
    //   1579: aload_3
    //   1580: aload_1
    //   1581: invokevirtual a : (Ljava/lang/Throwable;)V
    //   1584: aload_2
    //   1585: astore #17
    //   1587: aload #15
    //   1589: astore #19
    //   1591: iload #4
    //   1593: istore #5
    //   1595: aload #18
    //   1597: astore #20
    //   1599: aload #16
    //   1601: astore #21
    //   1603: new i/a/a/c/a
    //   1606: dup
    //   1607: aload_1
    //   1608: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   1611: athrow
    //   1612: aload_2
    //   1613: astore #17
    //   1615: aload #15
    //   1617: astore #19
    //   1619: iload #4
    //   1621: istore #5
    //   1623: aload #18
    //   1625: astore #20
    //   1627: aload #16
    //   1629: astore #21
    //   1631: aload_3
    //   1632: aload_1
    //   1633: invokevirtual a : (Ljava/lang/Throwable;)V
    //   1636: aload_2
    //   1637: astore #17
    //   1639: aload #15
    //   1641: astore #19
    //   1643: iload #4
    //   1645: istore #5
    //   1647: aload #18
    //   1649: astore #20
    //   1651: aload #16
    //   1653: astore #21
    //   1655: aload_1
    //   1656: athrow
    //   1657: astore_1
    //   1658: iload #5
    //   1660: istore #4
    //   1662: aload #21
    //   1664: astore #15
    //   1666: aload #20
    //   1668: astore #18
    //   1670: aload #19
    //   1672: astore_3
    //   1673: aload #17
    //   1675: astore_2
    //   1676: aload #15
    //   1678: ifnull -> 1686
    //   1681: aload #15
    //   1683: invokevirtual close : ()V
    //   1686: aload #18
    //   1688: ifnull -> 1709
    //   1691: aload #18
    //   1693: invokevirtual close : ()V
    //   1696: goto -> 1709
    //   1699: new i/a/a/c/a
    //   1702: dup
    //   1703: ldc 'cannot close input stream or output stream when trying to delete a file from zip file'
    //   1705: invokespecial <init> : (Ljava/lang/String;)V
    //   1708: athrow
    //   1709: iload #4
    //   1711: ifeq -> 1723
    //   1714: aload_0
    //   1715: aload_3
    //   1716: aload_2
    //   1717: invokespecial a : (Ljava/io/File;Ljava/lang/String;)V
    //   1720: goto -> 1735
    //   1723: new java/io/File
    //   1726: dup
    //   1727: aload_2
    //   1728: invokespecial <init> : (Ljava/lang/String;)V
    //   1731: invokevirtual delete : ()Z
    //   1734: pop
    //   1735: aload_1
    //   1736: athrow
    //   1737: new i/a/a/c/a
    //   1740: dup
    //   1741: ldc_w 'input parameters is null in maintain zip file, cannot remove file from archive'
    //   1744: invokespecial <init> : (Ljava/lang/String;)V
    //   1747: astore_1
    //   1748: goto -> 1753
    //   1751: aload_1
    //   1752: athrow
    //   1753: goto -> 1751
    //   1756: astore_1
    //   1757: goto -> 792
    //   1760: astore_1
    //   1761: goto -> 1092
    //   1764: astore_1
    //   1765: goto -> 1699
    //   1768: goto -> 571
    //   1771: astore_1
    //   1772: aconst_null
    //   1773: astore_2
    //   1774: aload_2
    //   1775: astore #15
    //   1777: aload #15
    //   1779: astore #18
    //   1781: aload #18
    //   1783: astore #16
    //   1785: iconst_0
    //   1786: istore #4
    //   1788: goto -> 1612
    // Exception table:
    //   from	to	target	type
    //   17	24	1771	i/a/a/c/a
    //   17	24	1543	java/lang/Exception
    //   17	24	1525	finally
    //   29	79	1771	i/a/a/c/a
    //   29	79	1543	java/lang/Exception
    //   29	79	1525	finally
    //   79	90	1483	i/a/a/c/a
    //   79	90	1473	java/lang/Exception
    //   79	90	1464	finally
    //   90	97	1457	i/a/a/c/a
    //   90	97	1450	java/lang/Exception
    //   90	97	1443	finally
    //   114	119	272	i/a/a/c/a
    //   114	119	253	java/lang/Exception
    //   114	119	235	finally
    //   131	140	272	i/a/a/c/a
    //   131	140	253	java/lang/Exception
    //   131	140	235	finally
    //   152	162	272	i/a/a/c/a
    //   152	162	253	java/lang/Exception
    //   152	162	235	finally
    //   174	186	272	i/a/a/c/a
    //   174	186	253	java/lang/Exception
    //   174	186	235	finally
    //   198	205	272	i/a/a/c/a
    //   198	205	253	java/lang/Exception
    //   198	205	235	finally
    //   217	228	272	i/a/a/c/a
    //   217	228	253	java/lang/Exception
    //   217	228	235	finally
    //   291	309	1412	java/io/FileNotFoundException
    //   291	309	1457	i/a/a/c/a
    //   291	309	1450	java/lang/Exception
    //   291	309	1443	finally
    //   309	322	1398	i/a/a/c/a
    //   309	322	1384	java/lang/Exception
    //   309	322	1369	finally
    //   322	331	1351	i/a/a/c/a
    //   322	331	1333	java/lang/Exception
    //   322	331	1317	finally
    //   331	359	1302	i/a/a/c/a
    //   331	359	1287	java/lang/Exception
    //   331	359	1270	finally
    //   364	387	405	i/a/a/c/a
    //   364	387	390	java/lang/Exception
    //   364	387	1270	finally
    //   420	435	1302	i/a/a/c/a
    //   420	435	1287	java/lang/Exception
    //   420	435	1270	finally
    //   448	464	405	i/a/a/c/a
    //   448	464	390	java/lang/Exception
    //   448	464	1270	finally
    //   464	485	1302	i/a/a/c/a
    //   464	485	1287	java/lang/Exception
    //   464	485	1270	finally
    //   494	507	1302	i/a/a/c/a
    //   494	507	1287	java/lang/Exception
    //   494	507	1270	finally
    //   511	519	405	i/a/a/c/a
    //   511	519	390	java/lang/Exception
    //   511	519	1270	finally
    //   523	530	405	i/a/a/c/a
    //   523	530	390	java/lang/Exception
    //   523	530	1270	finally
    //   534	557	405	i/a/a/c/a
    //   534	557	390	java/lang/Exception
    //   534	557	1270	finally
    //   590	602	648	i/a/a/c/a
    //   590	602	633	java/lang/Exception
    //   590	602	629	finally
    //   608	623	700	i/a/a/c/a
    //   608	623	696	java/lang/Exception
    //   608	623	1171	finally
    //   666	673	1192	i/a/a/c/a
    //   666	673	1181	java/lang/Exception
    //   666	673	1171	finally
    //   682	693	700	i/a/a/c/a
    //   682	693	696	java/lang/Exception
    //   682	693	1171	finally
    //   704	729	1192	i/a/a/c/a
    //   704	729	1181	java/lang/Exception
    //   704	729	1171	finally
    //   741	747	1192	i/a/a/c/a
    //   741	747	1181	java/lang/Exception
    //   741	747	1171	finally
    //   752	757	817	i/a/a/c/a
    //   752	757	810	java/lang/Exception
    //   752	757	806	finally
    //   757	762	700	i/a/a/c/a
    //   757	762	696	java/lang/Exception
    //   757	762	802	finally
    //   767	772	1756	java/io/IOException
    //   772	777	1756	java/io/IOException
    //   827	884	1167	i/a/a/c/a
    //   827	884	1163	java/lang/Exception
    //   827	884	1146	finally
    //   884	919	1167	i/a/a/c/a
    //   884	919	1163	java/lang/Exception
    //   884	919	1146	finally
    //   923	944	1167	i/a/a/c/a
    //   923	944	1163	java/lang/Exception
    //   923	944	1146	finally
    //   948	999	1167	i/a/a/c/a
    //   948	999	1163	java/lang/Exception
    //   948	999	1146	finally
    //   999	1027	1167	i/a/a/c/a
    //   999	1027	1163	java/lang/Exception
    //   999	1027	1146	finally
    //   1036	1049	1167	i/a/a/c/a
    //   1036	1049	1163	java/lang/Exception
    //   1036	1049	1146	finally
    //   1049	1067	1131	i/a/a/c/a
    //   1049	1067	1116	java/lang/Exception
    //   1049	1067	1102	finally
    //   1072	1077	1760	java/io/IOException
    //   1077	1082	1760	java/io/IOException
    //   1203	1213	1255	i/a/a/c/a
    //   1203	1213	1240	java/lang/Exception
    //   1203	1213	1223	finally
    //   1213	1223	1255	i/a/a/c/a
    //   1213	1223	1240	java/lang/Exception
    //   1213	1223	1223	finally
    //   1413	1422	1436	i/a/a/c/a
    //   1413	1422	1429	java/lang/Exception
    //   1413	1422	1422	finally
    //   1493	1503	1521	i/a/a/c/a
    //   1493	1503	1517	java/lang/Exception
    //   1493	1503	1513	finally
    //   1503	1513	1521	i/a/a/c/a
    //   1503	1513	1517	java/lang/Exception
    //   1503	1513	1513	finally
    //   1579	1584	1657	finally
    //   1603	1612	1657	finally
    //   1631	1636	1657	finally
    //   1655	1657	1657	finally
    //   1681	1686	1764	java/io/IOException
    //   1691	1696	1764	java/io/IOException
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/i/a/a/h/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */