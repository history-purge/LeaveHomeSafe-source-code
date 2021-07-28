package i.a.a.i;

import i.a.a.e.d;
import i.a.a.e.f;
import i.a.a.e.l;
import i.a.a.e.m;
import i.a.a.h.e;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashMap;

public class a {
  private l a;
  
  public a(l paraml) {
    if (paraml != null) {
      this.a = paraml;
      return;
    } 
    throw new i.a.a.c.a("zip model is null in ZipEngine constructor");
  }
  
  private long a(ArrayList<File> paramArrayList, m paramm) {
    if (paramArrayList != null) {
      long l1 = 0L;
      int i = 0;
      while (i < paramArrayList.size()) {
        long l2 = l1;
        if (paramArrayList.get(i) instanceof File) {
          l2 = l1;
          if (((File)paramArrayList.get(i)).exists()) {
            if (paramm.l() && paramm.f() == 0) {
              l2 = e.b(paramArrayList.get(i)) * 2L;
            } else {
              l2 = e.b(paramArrayList.get(i));
            } 
            l1 += l2;
            l2 = l1;
            if (this.a.a() != null) {
              l2 = l1;
              if (this.a.a().a() != null) {
                l2 = l1;
                if (this.a.a().a().size() > 0) {
                  String str = e.a(((File)paramArrayList.get(i)).getAbsolutePath(), paramm.i(), paramm.d());
                  f f = e.a(this.a, str);
                  l2 = l1;
                  if (f != null)
                    l2 = l1 + e.b(new File(this.a.i())) - f.b(); 
                } 
              } 
            } 
          } 
        } 
        i++;
        l1 = l2;
      } 
      return l1;
    } 
    i.a.a.c.a a1 = new i.a.a.c.a("file list is null, cannot calculate total work");
    throw a1;
  }
  
  private d a() {
    d d = new d();
    d.b(101010256L);
    d.b(0);
    d.e(0);
    d.f(0);
    d.a(0L);
    return d;
  }
  
  private void a(m paramm) {
    if (paramm != null) {
      if (paramm.c() == 0 || paramm.c() == 8) {
        if (paramm.c() != 8 || paramm.b() >= 0 || paramm.b() <= 9) {
          if (paramm.l()) {
            if (paramm.f() == 0 || paramm.f() == 99) {
              if (paramm.h() != null && (paramm.h()).length > 0)
                return; 
              throw new i.a.a.c.a("input password is empty or null");
            } 
            throw new i.a.a.c.a("unsupported encryption method");
          } 
          paramm.a(-1);
          paramm.d(-1);
          return;
        } 
        throw new i.a.a.c.a("invalid compression level. compression level dor deflate should be in the range of 0-9");
      } 
      throw new i.a.a.c.a("unsupported compression type");
    } 
    throw new i.a.a.c.a("cannot validate zip parameters");
  }
  
  private void a(ArrayList paramArrayList, m paramm, i.a.a.f.a parama) {
    // Byte code:
    //   0: aload_1
    //   1: ifnull -> 721
    //   4: aload_2
    //   5: ifnull -> 721
    //   8: aload_1
    //   9: invokevirtual size : ()I
    //   12: ifle -> 711
    //   15: aload_0
    //   16: getfield a : Li/a/a/e/l;
    //   19: invokevirtual b : ()Li/a/a/e/d;
    //   22: ifnonnull -> 36
    //   25: aload_0
    //   26: getfield a : Li/a/a/e/l;
    //   29: aload_0
    //   30: invokespecial a : ()Li/a/a/e/d;
    //   33: invokevirtual a : (Li/a/a/e/d;)V
    //   36: aconst_null
    //   37: astore #9
    //   39: aconst_null
    //   40: astore #8
    //   42: aload_0
    //   43: aload_2
    //   44: invokespecial a : (Li/a/a/e/m;)V
    //   47: aload_0
    //   48: aload_1
    //   49: aload_2
    //   50: aload_3
    //   51: invokespecial b : (Ljava/util/ArrayList;Li/a/a/e/m;Li/a/a/f/a;)V
    //   54: aload_0
    //   55: getfield a : Li/a/a/e/l;
    //   58: invokevirtual i : ()Ljava/lang/String;
    //   61: invokestatic a : (Ljava/lang/String;)Z
    //   64: istore #6
    //   66: new i/a/a/d/g
    //   69: dup
    //   70: new java/io/File
    //   73: dup
    //   74: aload_0
    //   75: getfield a : Li/a/a/e/l;
    //   78: invokevirtual i : ()Ljava/lang/String;
    //   81: invokespecial <init> : (Ljava/lang/String;)V
    //   84: aload_0
    //   85: getfield a : Li/a/a/e/l;
    //   88: invokevirtual f : ()J
    //   91: invokespecial <init> : (Ljava/io/File;J)V
    //   94: astore #10
    //   96: new i/a/a/d/i
    //   99: dup
    //   100: aload #10
    //   102: aload_0
    //   103: getfield a : Li/a/a/e/l;
    //   106: invokespecial <init> : (Ljava/io/OutputStream;Li/a/a/e/l;)V
    //   109: astore #7
    //   111: iload #6
    //   113: ifeq -> 154
    //   116: aload_0
    //   117: getfield a : Li/a/a/e/l;
    //   120: invokevirtual b : ()Li/a/a/e/d;
    //   123: ifnull -> 144
    //   126: aload #10
    //   128: aload_0
    //   129: getfield a : Li/a/a/e/l;
    //   132: invokevirtual b : ()Li/a/a/e/d;
    //   135: invokevirtual f : ()J
    //   138: invokevirtual a : (J)V
    //   141: goto -> 154
    //   144: new i/a/a/c/a
    //   147: dup
    //   148: ldc 'invalid end of central directory record'
    //   150: invokespecial <init> : (Ljava/lang/String;)V
    //   153: athrow
    //   154: sipush #4096
    //   157: newarray byte
    //   159: astore #10
    //   161: aconst_null
    //   162: astore #8
    //   164: iconst_0
    //   165: istore #4
    //   167: iload #4
    //   169: aload_1
    //   170: invokevirtual size : ()I
    //   173: if_icmpge -> 534
    //   176: aload_3
    //   177: invokevirtual c : ()Z
    //   180: ifeq -> 209
    //   183: aload_3
    //   184: iconst_3
    //   185: invokevirtual c : (I)V
    //   188: aload_3
    //   189: iconst_0
    //   190: invokevirtual d : (I)V
    //   193: aload #8
    //   195: ifnull -> 203
    //   198: aload #8
    //   200: invokevirtual close : ()V
    //   203: aload #7
    //   205: invokevirtual close : ()V
    //   208: return
    //   209: aload_2
    //   210: invokevirtual clone : ()Ljava/lang/Object;
    //   213: checkcast i/a/a/e/m
    //   216: astore #9
    //   218: aload_3
    //   219: aload_1
    //   220: iload #4
    //   222: invokevirtual get : (I)Ljava/lang/Object;
    //   225: checkcast java/io/File
    //   228: invokevirtual getAbsolutePath : ()Ljava/lang/String;
    //   231: invokevirtual a : (Ljava/lang/String;)V
    //   234: aload_1
    //   235: iload #4
    //   237: invokevirtual get : (I)Ljava/lang/Object;
    //   240: checkcast java/io/File
    //   243: invokevirtual isDirectory : ()Z
    //   246: ifne -> 353
    //   249: aload #9
    //   251: invokevirtual l : ()Z
    //   254: ifeq -> 330
    //   257: aload #9
    //   259: invokevirtual f : ()I
    //   262: ifne -> 330
    //   265: aload_3
    //   266: iconst_3
    //   267: invokevirtual a : (I)V
    //   270: aload #9
    //   272: aload_1
    //   273: iload #4
    //   275: invokevirtual get : (I)Ljava/lang/Object;
    //   278: checkcast java/io/File
    //   281: invokevirtual getAbsolutePath : ()Ljava/lang/String;
    //   284: aload_3
    //   285: invokestatic a : (Ljava/lang/String;Li/a/a/f/a;)J
    //   288: l2i
    //   289: invokevirtual e : (I)V
    //   292: aload_3
    //   293: iconst_0
    //   294: invokevirtual a : (I)V
    //   297: aload_3
    //   298: invokevirtual c : ()Z
    //   301: ifeq -> 330
    //   304: aload_3
    //   305: iconst_3
    //   306: invokevirtual c : (I)V
    //   309: aload_3
    //   310: iconst_0
    //   311: invokevirtual d : (I)V
    //   314: aload #8
    //   316: ifnull -> 324
    //   319: aload #8
    //   321: invokevirtual close : ()V
    //   324: aload #7
    //   326: invokevirtual close : ()V
    //   329: return
    //   330: aload_1
    //   331: iload #4
    //   333: invokevirtual get : (I)Ljava/lang/Object;
    //   336: checkcast java/io/File
    //   339: invokestatic b : (Ljava/io/File;)J
    //   342: lconst_0
    //   343: lcmp
    //   344: ifne -> 353
    //   347: aload #9
    //   349: iconst_0
    //   350: invokevirtual c : (I)V
    //   353: aload #7
    //   355: aload_1
    //   356: iload #4
    //   358: invokevirtual get : (I)Ljava/lang/Object;
    //   361: checkcast java/io/File
    //   364: aload #9
    //   366: invokevirtual a : (Ljava/io/File;Li/a/a/e/m;)V
    //   369: aload_1
    //   370: iload #4
    //   372: invokevirtual get : (I)Ljava/lang/Object;
    //   375: checkcast java/io/File
    //   378: invokevirtual isDirectory : ()Z
    //   381: ifeq -> 392
    //   384: aload #7
    //   386: invokevirtual a : ()V
    //   389: goto -> 487
    //   392: new java/io/FileInputStream
    //   395: dup
    //   396: aload_1
    //   397: iload #4
    //   399: invokevirtual get : (I)Ljava/lang/Object;
    //   402: checkcast java/io/File
    //   405: invokespecial <init> : (Ljava/io/File;)V
    //   408: astore #9
    //   410: aload #9
    //   412: aload #10
    //   414: invokevirtual read : ([B)I
    //   417: istore #5
    //   419: iload #5
    //   421: iconst_m1
    //   422: if_icmpeq -> 473
    //   425: aload_3
    //   426: invokevirtual c : ()Z
    //   429: ifeq -> 453
    //   432: aload_3
    //   433: iconst_3
    //   434: invokevirtual c : (I)V
    //   437: aload_3
    //   438: iconst_0
    //   439: invokevirtual d : (I)V
    //   442: aload #9
    //   444: invokevirtual close : ()V
    //   447: aload #7
    //   449: invokevirtual close : ()V
    //   452: return
    //   453: aload #7
    //   455: aload #10
    //   457: iconst_0
    //   458: iload #5
    //   460: invokevirtual write : ([BII)V
    //   463: aload_3
    //   464: iload #5
    //   466: i2l
    //   467: invokevirtual b : (J)V
    //   470: goto -> 410
    //   473: aload #7
    //   475: invokevirtual a : ()V
    //   478: aload #9
    //   480: invokevirtual close : ()V
    //   483: aload #9
    //   485: astore #8
    //   487: iload #4
    //   489: iconst_1
    //   490: iadd
    //   491: istore #4
    //   493: goto -> 167
    //   496: astore_1
    //   497: aload #9
    //   499: astore #8
    //   501: goto -> 686
    //   504: astore #8
    //   506: aload #7
    //   508: astore_1
    //   509: aload #9
    //   511: astore_2
    //   512: aload #8
    //   514: astore #9
    //   516: goto -> 636
    //   519: astore #8
    //   521: aload #7
    //   523: astore_1
    //   524: aload #9
    //   526: astore_2
    //   527: aload #8
    //   529: astore #9
    //   531: goto -> 664
    //   534: aload #7
    //   536: invokevirtual b : ()V
    //   539: aload_3
    //   540: invokevirtual a : ()V
    //   543: aload #8
    //   545: ifnull -> 553
    //   548: aload #8
    //   550: invokevirtual close : ()V
    //   553: aload #7
    //   555: invokevirtual close : ()V
    //   558: return
    //   559: astore_1
    //   560: goto -> 686
    //   563: astore_1
    //   564: aload #8
    //   566: astore_2
    //   567: aload_1
    //   568: astore #8
    //   570: goto -> 594
    //   573: astore_1
    //   574: aload #8
    //   576: astore_2
    //   577: aload_1
    //   578: astore #8
    //   580: goto -> 608
    //   583: astore_1
    //   584: aconst_null
    //   585: astore #8
    //   587: goto -> 686
    //   590: astore #8
    //   592: aconst_null
    //   593: astore_2
    //   594: aload #7
    //   596: astore_1
    //   597: aload #8
    //   599: astore #9
    //   601: goto -> 636
    //   604: astore #8
    //   606: aconst_null
    //   607: astore_2
    //   608: aload #7
    //   610: astore_1
    //   611: aload #8
    //   613: astore #9
    //   615: goto -> 664
    //   618: astore_1
    //   619: aconst_null
    //   620: astore #7
    //   622: aload #7
    //   624: astore #8
    //   626: goto -> 686
    //   629: astore #9
    //   631: aconst_null
    //   632: astore_2
    //   633: aload #8
    //   635: astore_1
    //   636: aload_1
    //   637: astore #7
    //   639: aload_2
    //   640: astore #8
    //   642: aload_3
    //   643: aload #9
    //   645: invokevirtual a : (Ljava/lang/Throwable;)V
    //   648: aload_1
    //   649: astore #7
    //   651: aload_2
    //   652: astore #8
    //   654: new i/a/a/c/a
    //   657: dup
    //   658: aload #9
    //   660: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   663: athrow
    //   664: aload_1
    //   665: astore #7
    //   667: aload_2
    //   668: astore #8
    //   670: aload_3
    //   671: aload #9
    //   673: invokevirtual a : (Ljava/lang/Throwable;)V
    //   676: aload_1
    //   677: astore #7
    //   679: aload_2
    //   680: astore #8
    //   682: aload #9
    //   684: athrow
    //   685: astore_1
    //   686: aload #8
    //   688: ifnull -> 699
    //   691: aload #8
    //   693: invokevirtual close : ()V
    //   696: goto -> 699
    //   699: aload #7
    //   701: ifnull -> 709
    //   704: aload #7
    //   706: invokevirtual close : ()V
    //   709: aload_1
    //   710: athrow
    //   711: new i/a/a/c/a
    //   714: dup
    //   715: ldc 'no files to add'
    //   717: invokespecial <init> : (Ljava/lang/String;)V
    //   720: athrow
    //   721: new i/a/a/c/a
    //   724: dup
    //   725: ldc 'one of the input parameters is null when adding files'
    //   727: invokespecial <init> : (Ljava/lang/String;)V
    //   730: astore_1
    //   731: goto -> 736
    //   734: aload_1
    //   735: athrow
    //   736: goto -> 734
    //   739: astore_1
    //   740: goto -> 203
    //   743: astore_1
    //   744: return
    //   745: astore_1
    //   746: goto -> 324
    //   749: astore_1
    //   750: return
    //   751: astore_1
    //   752: goto -> 447
    //   755: astore_1
    //   756: return
    //   757: astore_1
    //   758: goto -> 553
    //   761: astore_1
    //   762: return
    //   763: astore_2
    //   764: goto -> 699
    //   767: astore_2
    //   768: goto -> 709
    //   771: astore #7
    //   773: aconst_null
    //   774: astore_2
    //   775: aload #9
    //   777: astore_1
    //   778: aload #7
    //   780: astore #9
    //   782: goto -> 664
    // Exception table:
    //   from	to	target	type
    //   42	111	771	i/a/a/c/a
    //   42	111	629	java/lang/Exception
    //   42	111	618	finally
    //   116	141	604	i/a/a/c/a
    //   116	141	590	java/lang/Exception
    //   116	141	583	finally
    //   144	154	604	i/a/a/c/a
    //   144	154	590	java/lang/Exception
    //   144	154	583	finally
    //   154	161	604	i/a/a/c/a
    //   154	161	590	java/lang/Exception
    //   154	161	583	finally
    //   167	193	573	i/a/a/c/a
    //   167	193	563	java/lang/Exception
    //   167	193	559	finally
    //   198	203	739	java/io/IOException
    //   203	208	743	java/io/IOException
    //   209	314	573	i/a/a/c/a
    //   209	314	563	java/lang/Exception
    //   209	314	559	finally
    //   319	324	745	java/io/IOException
    //   324	329	749	java/io/IOException
    //   330	353	573	i/a/a/c/a
    //   330	353	563	java/lang/Exception
    //   330	353	559	finally
    //   353	389	573	i/a/a/c/a
    //   353	389	563	java/lang/Exception
    //   353	389	559	finally
    //   392	410	573	i/a/a/c/a
    //   392	410	563	java/lang/Exception
    //   392	410	559	finally
    //   410	419	519	i/a/a/c/a
    //   410	419	504	java/lang/Exception
    //   410	419	496	finally
    //   425	442	519	i/a/a/c/a
    //   425	442	504	java/lang/Exception
    //   425	442	496	finally
    //   442	447	751	java/io/IOException
    //   447	452	755	java/io/IOException
    //   453	470	519	i/a/a/c/a
    //   453	470	504	java/lang/Exception
    //   453	470	496	finally
    //   473	483	519	i/a/a/c/a
    //   473	483	504	java/lang/Exception
    //   473	483	496	finally
    //   534	543	573	i/a/a/c/a
    //   534	543	563	java/lang/Exception
    //   534	543	559	finally
    //   548	553	757	java/io/IOException
    //   553	558	761	java/io/IOException
    //   642	648	685	finally
    //   654	664	685	finally
    //   670	676	685	finally
    //   682	685	685	finally
    //   691	696	763	java/io/IOException
    //   704	709	767	java/io/IOException
  }
  
  private RandomAccessFile b() {
    String str = this.a.i();
    if (e.h(str))
      try {
        File file = new File(str);
        if (!file.getParentFile().exists())
          file.getParentFile().mkdirs(); 
        return new RandomAccessFile(file, "rw");
      } catch (FileNotFoundException fileNotFoundException) {
        throw new i.a.a.c.a(fileNotFoundException);
      }  
    throw new i.a.a.c.a("invalid output path");
  }
  
  private void b(ArrayList<File> paramArrayList, m paramm, i.a.a.f.a parama) {
    l l1 = this.a;
    if (l1 != null && l1.a() != null && this.a.a().a() != null) {
      if (this.a.a().a().size() <= 0)
        return; 
      String str = null;
      int i = 0;
      while (true) {
        RandomAccessFile randomAccessFile1;
        RandomAccessFile randomAccessFile2;
        String str1 = str;
        String str2 = str;
        try {
          if (i < paramArrayList.size()) {
            str1 = str;
            str2 = str;
            String str3 = e.a(((File)paramArrayList.get(i)).getAbsolutePath(), paramm.i(), paramm.d());
            str1 = str;
            str2 = str;
            f f = e.a(this.a, str3);
            str1 = str;
            if (f != null) {
              str3 = str;
              if (str != null) {
                str1 = str;
                str2 = str;
                str.close();
                str3 = null;
              } 
              str1 = str3;
              str2 = str3;
              i.a.a.h.a a1 = new i.a.a.h.a();
              str1 = str3;
              str2 = str3;
              parama.a(2);
              str1 = str3;
              str2 = str3;
              HashMap hashMap = a1.a(this.a, f, parama);
              str1 = str3;
              str2 = str3;
              if (parama.c()) {
                str1 = str3;
                str2 = str3;
                parama.c(3);
                str1 = str3;
                str2 = str3;
                parama.d(0);
                if (str3 != null)
                  try {
                    str3.close();
                    return;
                  } catch (IOException iOException) {
                    return;
                  }  
                return;
              } 
              str1 = str3;
              str2 = str3;
              parama.a(0);
              str1 = str3;
              if (str3 == null) {
                str1 = str3;
                str2 = str3;
                RandomAccessFile randomAccessFile3 = b();
                randomAccessFile1 = randomAccessFile3;
                if (hashMap != null) {
                  randomAccessFile1 = randomAccessFile3;
                  randomAccessFile2 = randomAccessFile3;
                  f = (f)hashMap.get("offsetCentralDir");
                  randomAccessFile1 = randomAccessFile3;
                  if (f != null) {
                    randomAccessFile1 = randomAccessFile3;
                    try {
                      long l2 = Long.parseLong((String)hashMap.get("offsetCentralDir"));
                      randomAccessFile1 = randomAccessFile3;
                      if (l2 >= 0L) {
                        randomAccessFile1 = randomAccessFile3;
                        randomAccessFile2 = randomAccessFile3;
                        randomAccessFile3.seek(l2);
                        randomAccessFile1 = randomAccessFile3;
                      } 
                      i++;
                      randomAccessFile = randomAccessFile1;
                      continue;
                    } catch (NumberFormatException numberFormatException) {
                      randomAccessFile1 = randomAccessFile3;
                      randomAccessFile2 = randomAccessFile3;
                      throw new i.a.a.c.a("NumberFormatException while parsing offset central directory. Cannot update already existing file header");
                    } catch (Exception exception) {
                      randomAccessFile1 = randomAccessFile3;
                      randomAccessFile2 = randomAccessFile3;
                      throw new i.a.a.c.a("Error while parsing offset central directory. Cannot update already existing file header");
                    } 
                  } 
                } 
              } 
            } 
          } else {
            if (randomAccessFile != null)
              try {
                randomAccessFile.close();
                return;
              } catch (IOException iOException) {
                return;
              }  
            return;
          } 
          i++;
          RandomAccessFile randomAccessFile = randomAccessFile1;
          continue;
        } catch (IOException iOException) {
          randomAccessFile1 = randomAccessFile2;
          throw new i.a.a.c.a(iOException);
        } finally {}
        if (randomAccessFile1 != null)
          try {
            randomAccessFile1.close();
          } catch (IOException iOException) {} 
        throw paramArrayList;
      } 
    } 
  }
  
  public void a(File paramFile, m paramm, i.a.a.f.a parama, boolean paramBoolean) {
    // Byte code:
    //   0: aload_1
    //   1: ifnull -> 231
    //   4: aload_2
    //   5: ifnull -> 231
    //   8: aload_1
    //   9: invokevirtual getAbsolutePath : ()Ljava/lang/String;
    //   12: invokestatic a : (Ljava/lang/String;)Z
    //   15: ifeq -> 220
    //   18: aload_1
    //   19: invokevirtual isDirectory : ()Z
    //   22: ifeq -> 209
    //   25: aload_1
    //   26: invokevirtual getAbsolutePath : ()Ljava/lang/String;
    //   29: invokestatic b : (Ljava/lang/String;)Z
    //   32: ifeq -> 172
    //   35: aload_2
    //   36: invokevirtual m : ()Z
    //   39: ifeq -> 103
    //   42: aload_1
    //   43: invokevirtual getAbsolutePath : ()Ljava/lang/String;
    //   46: astore #6
    //   48: ldc_w ''
    //   51: astore #5
    //   53: aload #6
    //   55: ifnull -> 87
    //   58: aload_1
    //   59: invokevirtual getAbsoluteFile : ()Ljava/io/File;
    //   62: invokevirtual getParentFile : ()Ljava/io/File;
    //   65: ifnull -> 109
    //   68: aload_1
    //   69: invokevirtual getAbsoluteFile : ()Ljava/io/File;
    //   72: invokevirtual getParentFile : ()Ljava/io/File;
    //   75: astore #5
    //   77: aload #5
    //   79: invokevirtual getAbsolutePath : ()Ljava/lang/String;
    //   82: astore #5
    //   84: goto -> 109
    //   87: aload_1
    //   88: invokevirtual getParentFile : ()Ljava/io/File;
    //   91: ifnull -> 109
    //   94: aload_1
    //   95: invokevirtual getParentFile : ()Ljava/io/File;
    //   98: astore #5
    //   100: goto -> 77
    //   103: aload_1
    //   104: invokevirtual getAbsolutePath : ()Ljava/lang/String;
    //   107: astore #5
    //   109: aload_2
    //   110: aload #5
    //   112: invokevirtual a : (Ljava/lang/String;)V
    //   115: aload_1
    //   116: aload_2
    //   117: invokevirtual n : ()Z
    //   120: invokestatic a : (Ljava/io/File;Z)Ljava/util/ArrayList;
    //   123: astore #6
    //   125: aload #6
    //   127: astore #5
    //   129: aload_2
    //   130: invokevirtual m : ()Z
    //   133: ifeq -> 161
    //   136: aload #6
    //   138: astore #5
    //   140: aload #6
    //   142: ifnonnull -> 154
    //   145: new java/util/ArrayList
    //   148: dup
    //   149: invokespecial <init> : ()V
    //   152: astore #5
    //   154: aload #5
    //   156: aload_1
    //   157: invokevirtual add : (Ljava/lang/Object;)Z
    //   160: pop
    //   161: aload_0
    //   162: aload #5
    //   164: aload_2
    //   165: aload_3
    //   166: iload #4
    //   168: invokevirtual a : (Ljava/util/ArrayList;Li/a/a/e/m;Li/a/a/f/a;Z)V
    //   171: return
    //   172: new java/lang/StringBuilder
    //   175: dup
    //   176: invokespecial <init> : ()V
    //   179: astore_2
    //   180: aload_2
    //   181: ldc_w 'cannot read folder: '
    //   184: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   187: pop
    //   188: aload_2
    //   189: aload_1
    //   190: invokevirtual getAbsolutePath : ()Ljava/lang/String;
    //   193: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   196: pop
    //   197: new i/a/a/c/a
    //   200: dup
    //   201: aload_2
    //   202: invokevirtual toString : ()Ljava/lang/String;
    //   205: invokespecial <init> : (Ljava/lang/String;)V
    //   208: athrow
    //   209: new i/a/a/c/a
    //   212: dup
    //   213: ldc_w 'input file is not a folder, user addFileToZip method to add files'
    //   216: invokespecial <init> : (Ljava/lang/String;)V
    //   219: athrow
    //   220: new i/a/a/c/a
    //   223: dup
    //   224: ldc_w 'input folder does not exist'
    //   227: invokespecial <init> : (Ljava/lang/String;)V
    //   230: athrow
    //   231: new i/a/a/c/a
    //   234: dup
    //   235: ldc_w 'one of the input parameters is null, cannot add folder to zip'
    //   238: invokespecial <init> : (Ljava/lang/String;)V
    //   241: astore_1
    //   242: goto -> 247
    //   245: aload_1
    //   246: athrow
    //   247: goto -> 245
  }
  
  public void a(ArrayList<File> paramArrayList, m paramm, i.a.a.f.a parama, boolean paramBoolean) {
    if (paramArrayList != null && paramm != null) {
      if (paramArrayList.size() > 0) {
        parama.a(0);
        parama.d(1);
        parama.c(1);
        if (paramBoolean) {
          parama.a(a(paramArrayList, paramm));
          parama.a(((File)paramArrayList.get(0)).getAbsolutePath());
          (new a(this, "Zip4j", paramArrayList, paramm, parama)).start();
          return;
        } 
        a(paramArrayList, paramm, parama);
        return;
      } 
      throw new i.a.a.c.a("no files to add");
    } 
    throw new i.a.a.c.a("one of the input parameters is null when adding files");
  }
  
  class a extends Thread {
    a(a this$0, String param1String, ArrayList param1ArrayList, m param1m, i.a.a.f.a param1a) {
      super(param1String);
    }
    
    public void run() {
      try {
        a.a(this.f, this.c, this.d, this.e);
        return;
      } catch (i.a.a.c.a a1) {
        return;
      } 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/i/a/a/i/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */