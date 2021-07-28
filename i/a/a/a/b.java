package i.a.a.a;

import i.a.a.c.a;
import i.a.a.d.g;
import i.a.a.e.a;
import i.a.a.e.f;
import i.a.a.e.g;
import i.a.a.e.i;
import i.a.a.e.j;
import i.a.a.e.l;
import i.a.a.h.d;
import i.a.a.h.e;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class b {
  private int a(l paraml, f paramf, OutputStream paramOutputStream, List paramList) {
    // Byte code:
    //   0: aload_2
    //   1: ifnull -> 830
    //   4: aload_3
    //   5: ifnull -> 830
    //   8: iconst_2
    //   9: newarray byte
    //   11: astore_3
    //   12: iconst_4
    //   13: istore #6
    //   15: iconst_4
    //   16: newarray byte
    //   18: astore #12
    //   20: bipush #8
    //   22: newarray byte
    //   24: astore #10
    //   26: iconst_2
    //   27: newarray byte
    //   29: astore #11
    //   31: aload #11
    //   33: iconst_0
    //   34: iconst_0
    //   35: bastore
    //   36: aload #11
    //   38: iconst_1
    //   39: iconst_0
    //   40: bastore
    //   41: aload #12
    //   43: iconst_0
    //   44: aload_2
    //   45: invokevirtual q : ()I
    //   48: invokestatic b : ([BII)V
    //   51: aload_0
    //   52: aload #12
    //   54: aload #4
    //   56: invokespecial a : ([BLjava/util/List;)V
    //   59: aload_3
    //   60: iconst_0
    //   61: aload_2
    //   62: invokevirtual s : ()I
    //   65: i2s
    //   66: invokestatic a : ([BIS)V
    //   69: aload_0
    //   70: aload_3
    //   71: aload #4
    //   73: invokespecial a : ([BLjava/util/List;)V
    //   76: aload_3
    //   77: iconst_0
    //   78: aload_2
    //   79: invokevirtual t : ()I
    //   82: i2s
    //   83: invokestatic a : ([BIS)V
    //   86: aload_0
    //   87: aload_3
    //   88: aload #4
    //   90: invokespecial a : ([BLjava/util/List;)V
    //   93: aload_0
    //   94: aload_2
    //   95: invokevirtual m : ()[B
    //   98: aload #4
    //   100: invokespecial a : ([BLjava/util/List;)V
    //   103: aload_3
    //   104: iconst_0
    //   105: aload_2
    //   106: invokevirtual c : ()I
    //   109: i2s
    //   110: invokestatic a : ([BIS)V
    //   113: aload_0
    //   114: aload_3
    //   115: aload #4
    //   117: invokespecial a : ([BLjava/util/List;)V
    //   120: aload #12
    //   122: iconst_0
    //   123: aload_2
    //   124: invokevirtual n : ()I
    //   127: invokestatic b : ([BII)V
    //   130: aload_0
    //   131: aload #12
    //   133: aload #4
    //   135: invokespecial a : ([BLjava/util/List;)V
    //   138: aload #12
    //   140: iconst_0
    //   141: aload_2
    //   142: invokevirtual d : ()J
    //   145: l2i
    //   146: invokestatic b : ([BII)V
    //   149: aload_0
    //   150: aload #12
    //   152: aload #4
    //   154: invokespecial a : ([BLjava/util/List;)V
    //   157: aload_2
    //   158: invokevirtual b : ()J
    //   161: ldc2_w 4294967295
    //   164: lcmp
    //   165: ifge -> 248
    //   168: aload_2
    //   169: invokevirtual r : ()J
    //   172: ldc2_w 50
    //   175: ladd
    //   176: ldc2_w 4294967295
    //   179: lcmp
    //   180: iflt -> 186
    //   183: goto -> 248
    //   186: aload #10
    //   188: iconst_0
    //   189: aload_2
    //   190: invokevirtual b : ()J
    //   193: invokestatic a : ([BIJ)V
    //   196: aload #10
    //   198: iconst_0
    //   199: aload #12
    //   201: iconst_0
    //   202: iconst_4
    //   203: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   206: aload_0
    //   207: aload #12
    //   209: aload #4
    //   211: invokespecial a : ([BLjava/util/List;)V
    //   214: aload #10
    //   216: iconst_0
    //   217: aload_2
    //   218: invokevirtual r : ()J
    //   221: invokestatic a : ([BIJ)V
    //   224: aload #10
    //   226: iconst_0
    //   227: aload #12
    //   229: iconst_0
    //   230: iconst_4
    //   231: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   234: aload_0
    //   235: aload #12
    //   237: aload #4
    //   239: invokespecial a : ([BLjava/util/List;)V
    //   242: iconst_0
    //   243: istore #7
    //   245: goto -> 286
    //   248: aload #10
    //   250: iconst_0
    //   251: ldc2_w 4294967295
    //   254: invokestatic a : ([BIJ)V
    //   257: aload #10
    //   259: iconst_0
    //   260: aload #12
    //   262: iconst_0
    //   263: iconst_4
    //   264: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   267: aload_0
    //   268: aload #12
    //   270: aload #4
    //   272: invokespecial a : ([BLjava/util/List;)V
    //   275: aload_0
    //   276: aload #12
    //   278: aload #4
    //   280: invokespecial a : ([BLjava/util/List;)V
    //   283: iconst_1
    //   284: istore #7
    //   286: aload_3
    //   287: iconst_0
    //   288: aload_2
    //   289: invokevirtual l : ()I
    //   292: i2s
    //   293: invokestatic a : ([BIS)V
    //   296: aload_0
    //   297: aload_3
    //   298: aload #4
    //   300: invokespecial a : ([BLjava/util/List;)V
    //   303: iconst_4
    //   304: newarray byte
    //   306: astore #12
    //   308: aload_2
    //   309: invokevirtual o : ()J
    //   312: ldc2_w 4294967295
    //   315: lcmp
    //   316: ifle -> 344
    //   319: aload #10
    //   321: iconst_0
    //   322: ldc2_w 4294967295
    //   325: invokestatic a : ([BIJ)V
    //   328: aload #10
    //   330: iconst_0
    //   331: aload #12
    //   333: iconst_0
    //   334: iconst_4
    //   335: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   338: iconst_1
    //   339: istore #8
    //   341: goto -> 840
    //   344: aload #10
    //   346: iconst_0
    //   347: aload_2
    //   348: invokevirtual o : ()J
    //   351: invokestatic a : ([BIJ)V
    //   354: aload #10
    //   356: iconst_0
    //   357: aload #12
    //   359: iconst_0
    //   360: iconst_4
    //   361: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   364: iconst_0
    //   365: istore #8
    //   367: goto -> 840
    //   370: iload #5
    //   372: istore #6
    //   374: aload_2
    //   375: invokevirtual a : ()Li/a/a/e/a;
    //   378: ifnull -> 388
    //   381: iload #5
    //   383: bipush #11
    //   385: iadd
    //   386: istore #6
    //   388: aload_3
    //   389: iconst_0
    //   390: iload #6
    //   392: i2s
    //   393: invokestatic a : ([BIS)V
    //   396: aload_0
    //   397: aload_3
    //   398: aload #4
    //   400: invokespecial a : ([BLjava/util/List;)V
    //   403: aload_0
    //   404: aload #11
    //   406: aload #4
    //   408: invokespecial a : ([BLjava/util/List;)V
    //   411: aload_3
    //   412: iconst_0
    //   413: aload_2
    //   414: invokevirtual f : ()I
    //   417: i2s
    //   418: invokestatic a : ([BIS)V
    //   421: aload_0
    //   422: aload_3
    //   423: aload #4
    //   425: invokespecial a : ([BLjava/util/List;)V
    //   428: aload_0
    //   429: aload #11
    //   431: aload #4
    //   433: invokespecial a : ([BLjava/util/List;)V
    //   436: aload_2
    //   437: invokevirtual h : ()[B
    //   440: ifnull -> 456
    //   443: aload_0
    //   444: aload_2
    //   445: invokevirtual h : ()[B
    //   448: aload #4
    //   450: invokespecial a : ([BLjava/util/List;)V
    //   453: goto -> 481
    //   456: aload_0
    //   457: iconst_4
    //   458: newarray byte
    //   460: dup
    //   461: iconst_0
    //   462: iconst_0
    //   463: bastore
    //   464: dup
    //   465: iconst_1
    //   466: iconst_0
    //   467: bastore
    //   468: dup
    //   469: iconst_2
    //   470: iconst_0
    //   471: bastore
    //   472: dup
    //   473: iconst_3
    //   474: iconst_0
    //   475: bastore
    //   476: aload #4
    //   478: invokespecial a : ([BLjava/util/List;)V
    //   481: aload_0
    //   482: aload #12
    //   484: aload #4
    //   486: invokespecial a : ([BLjava/util/List;)V
    //   489: aload_1
    //   490: invokevirtual c : ()Ljava/lang/String;
    //   493: invokestatic h : (Ljava/lang/String;)Z
    //   496: ifeq -> 528
    //   499: aload_2
    //   500: invokevirtual k : ()Ljava/lang/String;
    //   503: aload_1
    //   504: invokevirtual c : ()Ljava/lang/String;
    //   507: invokevirtual getBytes : (Ljava/lang/String;)[B
    //   510: astore #11
    //   512: aload_0
    //   513: aload #11
    //   515: aload #4
    //   517: invokespecial a : ([BLjava/util/List;)V
    //   520: aload #11
    //   522: arraylength
    //   523: istore #5
    //   525: goto -> 887
    //   528: aload_0
    //   529: aload_2
    //   530: invokevirtual k : ()Ljava/lang/String;
    //   533: invokestatic d : (Ljava/lang/String;)[B
    //   536: aload #4
    //   538: invokespecial a : ([BLjava/util/List;)V
    //   541: aload_2
    //   542: invokevirtual k : ()Ljava/lang/String;
    //   545: invokestatic f : (Ljava/lang/String;)I
    //   548: istore #5
    //   550: goto -> 887
    //   553: aload_1
    //   554: iconst_1
    //   555: invokevirtual b : (Z)V
    //   558: aload_3
    //   559: iconst_0
    //   560: iconst_1
    //   561: invokestatic a : ([BIS)V
    //   564: aload_0
    //   565: aload_3
    //   566: aload #4
    //   568: invokespecial a : ([BLjava/util/List;)V
    //   571: iload #7
    //   573: ifeq -> 911
    //   576: bipush #16
    //   578: istore #5
    //   580: goto -> 914
    //   583: aload_3
    //   584: iconst_0
    //   585: iload #6
    //   587: i2s
    //   588: invokestatic a : ([BIS)V
    //   591: aload_0
    //   592: aload_3
    //   593: aload #4
    //   595: invokespecial a : ([BLjava/util/List;)V
    //   598: iload #9
    //   600: iconst_2
    //   601: iadd
    //   602: iconst_2
    //   603: iadd
    //   604: istore #5
    //   606: iload #5
    //   608: istore #6
    //   610: iload #7
    //   612: ifeq -> 661
    //   615: aload #10
    //   617: iconst_0
    //   618: aload_2
    //   619: invokevirtual r : ()J
    //   622: invokestatic a : ([BIJ)V
    //   625: aload_0
    //   626: aload #10
    //   628: aload #4
    //   630: invokespecial a : ([BLjava/util/List;)V
    //   633: aload #10
    //   635: iconst_0
    //   636: aload_2
    //   637: invokevirtual b : ()J
    //   640: invokestatic a : ([BIJ)V
    //   643: aload_0
    //   644: aload #10
    //   646: aload #4
    //   648: invokespecial a : ([BLjava/util/List;)V
    //   651: iload #5
    //   653: bipush #8
    //   655: iadd
    //   656: bipush #8
    //   658: iadd
    //   659: istore #6
    //   661: iload #6
    //   663: istore #5
    //   665: iload #8
    //   667: ifeq -> 695
    //   670: aload #10
    //   672: iconst_0
    //   673: aload_2
    //   674: invokevirtual o : ()J
    //   677: invokestatic a : ([BIJ)V
    //   680: aload_0
    //   681: aload #10
    //   683: aload #4
    //   685: invokespecial a : ([BLjava/util/List;)V
    //   688: iload #6
    //   690: bipush #8
    //   692: iadd
    //   693: istore #5
    //   695: iload #5
    //   697: istore #6
    //   699: aload_2
    //   700: invokevirtual a : ()Li/a/a/e/a;
    //   703: ifnull -> 817
    //   706: aload_2
    //   707: invokevirtual a : ()Li/a/a/e/a;
    //   710: astore_1
    //   711: aload_3
    //   712: iconst_0
    //   713: aload_1
    //   714: invokevirtual d : ()J
    //   717: l2i
    //   718: i2s
    //   719: invokestatic a : ([BIS)V
    //   722: aload_0
    //   723: aload_3
    //   724: aload #4
    //   726: invokespecial a : ([BLjava/util/List;)V
    //   729: aload_3
    //   730: iconst_0
    //   731: aload_1
    //   732: invokevirtual c : ()I
    //   735: i2s
    //   736: invokestatic a : ([BIS)V
    //   739: aload_0
    //   740: aload_3
    //   741: aload #4
    //   743: invokespecial a : ([BLjava/util/List;)V
    //   746: aload_3
    //   747: iconst_0
    //   748: aload_1
    //   749: invokevirtual f : ()I
    //   752: i2s
    //   753: invokestatic a : ([BIS)V
    //   756: aload_0
    //   757: aload_3
    //   758: aload #4
    //   760: invokespecial a : ([BLjava/util/List;)V
    //   763: aload_0
    //   764: aload_1
    //   765: invokevirtual e : ()Ljava/lang/String;
    //   768: invokevirtual getBytes : ()[B
    //   771: aload #4
    //   773: invokespecial a : ([BLjava/util/List;)V
    //   776: aload_0
    //   777: iconst_1
    //   778: newarray byte
    //   780: dup
    //   781: iconst_0
    //   782: aload_1
    //   783: invokevirtual a : ()I
    //   786: i2b
    //   787: bastore
    //   788: aload #4
    //   790: invokespecial a : ([BLjava/util/List;)V
    //   793: aload_3
    //   794: iconst_0
    //   795: aload_1
    //   796: invokevirtual b : ()I
    //   799: i2s
    //   800: invokestatic a : ([BIS)V
    //   803: aload_0
    //   804: aload_3
    //   805: aload #4
    //   807: invokespecial a : ([BLjava/util/List;)V
    //   810: iload #5
    //   812: bipush #11
    //   814: iadd
    //   815: istore #6
    //   817: iload #6
    //   819: ireturn
    //   820: astore_1
    //   821: new i/a/a/c/a
    //   824: dup
    //   825: aload_1
    //   826: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   829: athrow
    //   830: new i/a/a/c/a
    //   833: dup
    //   834: ldc 'input parameters is null, cannot write local file header'
    //   836: invokespecial <init> : (Ljava/lang/String;)V
    //   839: athrow
    //   840: iload #7
    //   842: ifne -> 859
    //   845: iload #8
    //   847: ifeq -> 853
    //   850: goto -> 859
    //   853: iconst_0
    //   854: istore #5
    //   856: goto -> 370
    //   859: iload #7
    //   861: ifeq -> 868
    //   864: bipush #20
    //   866: istore #6
    //   868: iload #6
    //   870: istore #5
    //   872: iload #8
    //   874: ifeq -> 370
    //   877: iload #6
    //   879: bipush #8
    //   881: iadd
    //   882: istore #5
    //   884: goto -> 370
    //   887: bipush #46
    //   889: iload #5
    //   891: iadd
    //   892: istore #9
    //   894: iload #7
    //   896: ifne -> 553
    //   899: iload #9
    //   901: istore #5
    //   903: iload #8
    //   905: ifeq -> 695
    //   908: goto -> 553
    //   911: iconst_0
    //   912: istore #5
    //   914: iload #5
    //   916: istore #6
    //   918: iload #8
    //   920: ifeq -> 583
    //   923: iload #5
    //   925: bipush #8
    //   927: iadd
    //   928: istore #6
    //   930: goto -> 583
    // Exception table:
    //   from	to	target	type
    //   8	12	820	java/lang/Exception
    //   15	31	820	java/lang/Exception
    //   41	183	820	java/lang/Exception
    //   186	242	820	java/lang/Exception
    //   248	283	820	java/lang/Exception
    //   286	338	820	java/lang/Exception
    //   344	364	820	java/lang/Exception
    //   374	381	820	java/lang/Exception
    //   388	453	820	java/lang/Exception
    //   456	481	820	java/lang/Exception
    //   481	525	820	java/lang/Exception
    //   528	550	820	java/lang/Exception
    //   553	571	820	java/lang/Exception
    //   583	598	820	java/lang/Exception
    //   615	651	820	java/lang/Exception
    //   670	688	820	java/lang/Exception
    //   699	810	820	java/lang/Exception
  }
  
  private int a(l paraml, OutputStream paramOutputStream, List paramList) {
    if (paraml != null && paramOutputStream != null) {
      i.a.a.e.b b1 = paraml.a();
      int i = 0;
      if (b1 != null && paraml.a().a() != null) {
        if (paraml.a().a().size() <= 0)
          return 0; 
        int j = 0;
        while (i < paraml.a().a().size()) {
          j += a(paraml, paraml.a().a().get(i), paramOutputStream, paramList);
          i++;
        } 
        return j;
      } 
      return 0;
    } 
    a a = new a("input parameters is null, cannot write central directory");
    throw a;
  }
  
  private int a(ArrayList<f> paramArrayList, int paramInt) {
    if (paramArrayList != null) {
      int i = 0;
      int j;
      for (j = 0; i < paramArrayList.size(); j = k) {
        int k = j;
        if (((f)paramArrayList.get(i)).f() == paramInt)
          k = j + 1; 
        i++;
      } 
      return j;
    } 
    a a = new a("file headers are null, cannot calculate number of entries on this disk");
    throw a;
  }
  
  private void a(l paraml, OutputStream paramOutputStream, int paramInt, long paramLong, List paramList) {
    if (paraml != null && paramOutputStream != null) {
      try {
        byte[] arrayOfByte1 = new byte[2];
        byte[] arrayOfByte2 = new byte[4];
        byte[] arrayOfByte3 = new byte[8];
        d.b(arrayOfByte2, 0, (int)paraml.b().g());
        a(arrayOfByte2, paramList);
        d.a(arrayOfByte1, 0, (short)paraml.b().d());
        a(arrayOfByte1, paramList);
        d.a(arrayOfByte1, 0, (short)paraml.b().e());
        a(arrayOfByte1, paramList);
        if (paraml.a() != null && paraml.a().a() != null) {
          int i;
          int j = paraml.a().a().size();
          if (paraml.j()) {
            i = a(paraml.a().a(), paraml.b().d());
          } else {
            i = j;
          } 
          d.a(arrayOfByte1, 0, (short)i);
          a(arrayOfByte1, paramList);
          d.a(arrayOfByte1, 0, (short)j);
          a(arrayOfByte1, paramList);
          d.b(arrayOfByte2, 0, paramInt);
          a(arrayOfByte2, paramList);
          if (paramLong > 4294967295L) {
            d.a(arrayOfByte3, 0, 4294967295L);
            System.arraycopy(arrayOfByte3, 0, arrayOfByte2, 0, 4);
          } else {
            d.a(arrayOfByte3, 0, paramLong);
            System.arraycopy(arrayOfByte3, 0, arrayOfByte2, 0, 4);
          } 
          a(arrayOfByte2, paramList);
          if (paraml.b().a() != null) {
            paramInt = paraml.b().c();
          } else {
            paramInt = 0;
          } 
          d.a(arrayOfByte1, 0, (short)paramInt);
          a(arrayOfByte1, paramList);
          if (paramInt > 0) {
            a(paraml.b().b(), paramList);
            return;
          } 
        } else {
          throw new a("invalid central directory/file headers, cannot write end of central directory record");
        } 
      } catch (Exception exception) {
        throw new a(exception);
      } 
    } else {
      a a = new a("zip model or output stream is null, cannot write end of central directory record");
      throw a;
    } 
  }
  
  private void a(l paraml, OutputStream paramOutputStream, byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte != null)
      try {
        if (paramOutputStream instanceof g && ((g)paramOutputStream).b(paramArrayOfbyte.length)) {
          a(paraml, paramOutputStream);
          return;
        } 
        paramOutputStream.write(paramArrayOfbyte);
        return;
      } catch (IOException iOException) {
        throw new a(iOException);
      }  
    throw new a("invalid buff to write as zip headers");
  }
  
  private void a(byte[] paramArrayOfbyte, List<String> paramList) {
    if (paramList != null && paramArrayOfbyte != null) {
      for (int i = 0; i < paramArrayOfbyte.length; i++)
        paramList.add(Byte.toString(paramArrayOfbyte[i])); 
      return;
    } 
    a a = new a("one of the input parameters is null, cannot copy byte array to array list");
    throw a;
  }
  
  private byte[] a(List paramList) {
    if (paramList != null) {
      if (paramList.size() <= 0)
        return null; 
      byte[] arrayOfByte = new byte[paramList.size()];
      for (int i = 0; i < paramList.size(); i++)
        arrayOfByte[i] = Byte.parseByte((String)paramList.get(i)); 
      return arrayOfByte;
    } 
    a a = new a("input byte array list is null, cannot conver to byte array");
    throw a;
  }
  
  private void b(l paraml, OutputStream paramOutputStream) {
    int i = 0;
    try {
      if (paramOutputStream instanceof g) {
        paraml.b().a(((g)paramOutputStream).b());
        i = ((g)paramOutputStream).a();
      } 
      if (paraml.k()) {
        if (paraml.h() == null)
          paraml.a(new j()); 
        if (paraml.g() == null)
          paraml.a(new i()); 
        paraml.g().a(i);
        paraml.g().b(i + 1);
      } 
      paraml.b().b(i);
      paraml.b().c(i);
      return;
    } catch (IOException iOException) {
      throw new a(iOException);
    } 
  }
  
  private void b(l paraml, OutputStream paramOutputStream, int paramInt, long paramLong, List paramList) {
    if (paraml != null && paramOutputStream != null)
      try {
        byte[] arrayOfByte1 = new byte[2];
        byte[] arrayOfByte2 = new byte[2];
        arrayOfByte2[0] = 0;
        arrayOfByte2[1] = 0;
        byte[] arrayOfByte3 = new byte[4];
        byte[] arrayOfByte4 = new byte[8];
        d.b(arrayOfByte3, 0, 101075792);
        a(arrayOfByte3, paramList);
        d.a(arrayOfByte4, 0, 44L);
        a(arrayOfByte4, paramList);
        if (paraml.a() != null && paraml.a().a() != null && paraml.a().a().size() > 0) {
          d.a(arrayOfByte1, 0, (short)((f)paraml.a().a().get(0)).s());
          a(arrayOfByte1, paramList);
          d.a(arrayOfByte1, 0, (short)((f)paraml.a().a().get(0)).t());
          a(arrayOfByte1, paramList);
        } else {
          a(arrayOfByte2, paramList);
          a(arrayOfByte2, paramList);
        } 
        d.b(arrayOfByte3, 0, paraml.b().d());
        a(arrayOfByte3, paramList);
        d.b(arrayOfByte3, 0, paraml.b().e());
        a(arrayOfByte3, paramList);
        if (paraml.a() != null && paraml.a().a() != null) {
          int i;
          int j = paraml.a().a().size();
          if (paraml.j()) {
            a(paraml.a().a(), paraml.b().d());
            i = 0;
          } else {
            i = j;
          } 
          d.a(arrayOfByte4, 0, i);
          a(arrayOfByte4, paramList);
          d.a(arrayOfByte4, 0, j);
          a(arrayOfByte4, paramList);
          d.a(arrayOfByte4, 0, paramInt);
          a(arrayOfByte4, paramList);
          d.a(arrayOfByte4, 0, paramLong);
          a(arrayOfByte4, paramList);
          return;
        } 
        throw new a("invalid central directory/file headers, cannot write end of central directory record");
      } catch (a a) {
        throw a;
      } catch (Exception exception) {
        throw new a(exception);
      }  
    throw new a("zip model or output stream is null, cannot write zip64 end of central directory record");
  }
  
  private void b(l paraml, OutputStream paramOutputStream, List paramList) {
    if (paraml != null && paramOutputStream != null)
      try {
        byte[] arrayOfByte1 = new byte[4];
        byte[] arrayOfByte2 = new byte[8];
        d.b(arrayOfByte1, 0, 117853008);
        a(arrayOfByte1, paramList);
        d.b(arrayOfByte1, 0, paraml.g().a());
        a(arrayOfByte1, paramList);
        d.a(arrayOfByte2, 0, paraml.g().b());
        a(arrayOfByte2, paramList);
        d.b(arrayOfByte1, 0, paraml.g().c());
        a(arrayOfByte1, paramList);
        return;
      } catch (a a) {
        throw a;
      } catch (Exception exception) {
        throw new a(exception);
      }  
    throw new a("zip model or output stream is null, cannot write zip64 end of central directory locator");
  }
  
  public int a(g paramg, OutputStream paramOutputStream) {
    if (paramg != null && paramOutputStream != null) {
      ArrayList arrayList = new ArrayList();
      byte[] arrayOfByte2 = new byte[4];
      d.b(arrayOfByte2, 0, 134695760);
      a(arrayOfByte2, arrayList);
      d.b(arrayOfByte2, 0, (int)paramg.d());
      a(arrayOfByte2, arrayList);
      long l2 = paramg.b();
      long l1 = l2;
      if (l2 >= 2147483647L)
        l1 = 2147483647L; 
      d.b(arrayOfByte2, 0, (int)l1);
      a(arrayOfByte2, arrayList);
      l2 = paramg.o();
      l1 = l2;
      if (l2 >= 2147483647L)
        l1 = 2147483647L; 
      d.b(arrayOfByte2, 0, (int)l1);
      a(arrayOfByte2, arrayList);
      byte[] arrayOfByte1 = a(arrayList);
      paramOutputStream.write(arrayOfByte1);
      return arrayOfByte1.length;
    } 
    throw new a("input parameters is null, cannot write extended local header");
  }
  
  public int a(l paraml, g paramg, OutputStream paramOutputStream) {
    if (paramg != null)
      try {
        boolean bool;
        ArrayList arrayList = new ArrayList();
        byte[] arrayOfByte2 = new byte[2];
        byte[] arrayOfByte3 = new byte[4];
        byte[] arrayOfByte4 = new byte[8];
        d.b(arrayOfByte3, 0, paramg.n());
        a(arrayOfByte3, arrayList);
        d.a(arrayOfByte2, 0, (short)paramg.p());
        a(arrayOfByte2, arrayList);
        a(paramg.j(), arrayList);
        d.a(arrayOfByte2, 0, (short)paramg.c());
        a(arrayOfByte2, arrayList);
        d.b(arrayOfByte3, 0, paramg.k());
        a(arrayOfByte3, arrayList);
        d.b(arrayOfByte3, 0, (int)paramg.d());
        a(arrayOfByte3, arrayList);
        if (paramg.o() + 50L >= 4294967295L) {
          d.a(arrayOfByte4, 0, 4294967295L);
          System.arraycopy(arrayOfByte4, 0, arrayOfByte3, 0, 4);
          a(arrayOfByte3, arrayList);
          a(arrayOfByte3, arrayList);
          paraml.b(true);
          paramg.d(true);
          bool = true;
        } else {
          d.a(arrayOfByte4, 0, paramg.b());
          System.arraycopy(arrayOfByte4, 0, arrayOfByte3, 0, 4);
          a(arrayOfByte3, arrayList);
          d.a(arrayOfByte4, 0, paramg.o());
          System.arraycopy(arrayOfByte4, 0, arrayOfByte3, 0, 4);
          a(arrayOfByte3, arrayList);
          paramg.d(false);
          bool = false;
        } 
        d.a(arrayOfByte2, 0, (short)paramg.i());
        a(arrayOfByte2, arrayList);
        if (bool) {
          null = 20;
        } else {
          null = 0;
        } 
        int i = null;
        if (paramg.a() != null)
          i = null + 11; 
        d.a(arrayOfByte2, 0, (short)i);
        a(arrayOfByte2, arrayList);
        if (e.h(paraml.c())) {
          a(paramg.h().getBytes(paraml.c()), arrayList);
        } else {
          a(e.d(paramg.h()), arrayList);
        } 
        if (bool) {
          d.a(arrayOfByte2, 0, (short)1);
          a(arrayOfByte2, arrayList);
          d.a(arrayOfByte2, 0, (short)16);
          a(arrayOfByte2, arrayList);
          d.a(arrayOfByte4, 0, paramg.o());
          a(arrayOfByte4, arrayList);
          a(new byte[] { 0, 0, 0, 0, 0, 0, 0, 0 }, arrayList);
        } 
        if (paramg.a() != null) {
          a a = paramg.a();
          d.a(arrayOfByte2, 0, (short)(int)a.d());
          a(arrayOfByte2, arrayList);
          d.a(arrayOfByte2, 0, (short)a.c());
          a(arrayOfByte2, arrayList);
          d.a(arrayOfByte2, 0, (short)a.f());
          a(arrayOfByte2, arrayList);
          a(a.e().getBytes(), arrayList);
          a(new byte[] { (byte)a.a() }, arrayList);
          d.a(arrayOfByte2, 0, (short)a.b());
          a(arrayOfByte2, arrayList);
        } 
        byte[] arrayOfByte1 = a(arrayList);
        paramOutputStream.write(arrayOfByte1);
        return arrayOfByte1.length;
      } catch (a a) {
        throw a;
      } catch (Exception exception) {
        throw new a(exception);
      }  
    throw new a("input parameters are null, cannot write local file header");
  }
  
  public void a(l paraml, OutputStream paramOutputStream) {
    if (paraml != null && paramOutputStream != null)
      try {
        b(paraml, paramOutputStream);
        long l1 = paraml.b().f();
        ArrayList arrayList = new ArrayList();
        int i = a(paraml, paramOutputStream, arrayList);
        if (paraml.k()) {
          if (paraml.h() == null)
            paraml.a(new j()); 
          if (paraml.g() == null)
            paraml.a(new i()); 
          paraml.g().a(i + l1);
          if (paramOutputStream instanceof g) {
            paraml.g().a(((g)paramOutputStream).a());
            paraml.g().b(((g)paramOutputStream).a() + 1);
          } else {
            paraml.g().a(0);
            paraml.g().b(1);
          } 
          b(paraml, paramOutputStream, i, l1, arrayList);
          b(paraml, paramOutputStream, arrayList);
        } 
        a(paraml, paramOutputStream, i, l1, arrayList);
        a(paraml, paramOutputStream, a(arrayList));
        return;
      } catch (a a) {
        throw a;
      } catch (Exception exception) {
        throw new a(exception);
      }  
    throw new a("input parameters is null, cannot finalize zip file");
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/i/a/a/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */