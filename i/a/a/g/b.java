package i.a.a.g;

import i.a.a.a.a;
import i.a.a.b.a;
import i.a.a.b.c;
import i.a.a.b.f;
import i.a.a.c.a;
import i.a.a.d.h;
import i.a.a.e.a;
import i.a.a.e.f;
import i.a.a.e.g;
import i.a.a.e.h;
import i.a.a.e.l;
import i.a.a.f.a;
import i.a.a.h.d;
import i.a.a.h.e;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.zip.CRC32;

public class b {
  private l a;
  
  private f b;
  
  private int c = 0;
  
  private g d;
  
  private c e;
  
  private CRC32 f;
  
  public b(l paraml, f paramf) {
    if (paraml != null && paramf != null) {
      this.a = paraml;
      this.b = paramf;
      this.f = new CRC32();
      return;
    } 
    throw new a("Invalid parameters passed to StoreUnzip. One or more of the parameters were null");
  }
  
  private int a(a parama) {
    if (parama != null) {
      int i = parama.a();
      if (i != 1) {
        if (i != 2) {
          if (i == 3)
            return 16; 
          throw new a("unable to determine salt length: invalid aes key strength");
        } 
        return 12;
      } 
      return 8;
    } 
    throw new a("unable to determine salt length: AESExtraDataRecord is null");
  }
  
  private RandomAccessFile a(String paramString) {
    l l1 = this.a;
    if (l1 != null && e.h(l1.i()))
      try {
        return this.a.j() ? i() : new RandomAccessFile(new File(this.a.i()), paramString);
      } catch (FileNotFoundException fileNotFoundException) {
        throw new a(fileNotFoundException);
      } catch (Exception exception) {
        throw new a(exception);
      }  
    throw new a("input parameter is null in getFilePointer");
  }
  
  private String a(String paramString1, String paramString2) {
    if (!e.h(paramString2))
      paramString2 = this.b.k(); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramString1);
    stringBuilder.append(System.getProperty("file.separator"));
    stringBuilder.append(paramString2);
    return stringBuilder.toString();
  }
  
  private void a(InputStream paramInputStream, OutputStream paramOutputStream) {
    // Byte code:
    //   0: aload_1
    //   1: ifnull -> 72
    //   4: aload_1
    //   5: invokevirtual close : ()V
    //   8: goto -> 72
    //   11: astore_1
    //   12: goto -> 62
    //   15: astore_1
    //   16: aload_1
    //   17: invokevirtual getMessage : ()Ljava/lang/String;
    //   20: invokestatic h : (Ljava/lang/String;)Z
    //   23: ifeq -> 53
    //   26: aload_1
    //   27: invokevirtual getMessage : ()Ljava/lang/String;
    //   30: ldc ' - Wrong Password?'
    //   32: invokevirtual indexOf : (Ljava/lang/String;)I
    //   35: ifge -> 41
    //   38: goto -> 53
    //   41: new i/a/a/c/a
    //   44: dup
    //   45: aload_1
    //   46: invokevirtual getMessage : ()Ljava/lang/String;
    //   49: invokespecial <init> : (Ljava/lang/String;)V
    //   52: athrow
    //   53: aload_2
    //   54: ifnull -> 79
    //   57: aload_2
    //   58: invokevirtual close : ()V
    //   61: return
    //   62: aload_2
    //   63: ifnull -> 70
    //   66: aload_2
    //   67: invokevirtual close : ()V
    //   70: aload_1
    //   71: athrow
    //   72: aload_2
    //   73: ifnull -> 79
    //   76: goto -> 57
    //   79: return
    //   80: astore_1
    //   81: return
    //   82: astore_2
    //   83: goto -> 70
    // Exception table:
    //   from	to	target	type
    //   4	8	15	java/io/IOException
    //   4	8	11	finally
    //   16	38	11	finally
    //   41	53	11	finally
    //   57	61	80	java/io/IOException
    //   66	70	82	java/io/IOException
  }
  
  private byte[] a(RandomAccessFile paramRandomAccessFile) {
    try {
      byte[] arrayOfByte = new byte[2];
      paramRandomAccessFile.read(arrayOfByte);
      return arrayOfByte;
    } catch (IOException iOException) {
      throw new a(iOException);
    } 
  }
  
  private FileOutputStream b(String paramString1, String paramString2) {
    if (e.h(paramString1))
      try {
        File file = new File(a(paramString1, paramString2));
        if (!file.getParentFile().exists())
          file.getParentFile().mkdirs(); 
        if (file.exists())
          file.delete(); 
        return new FileOutputStream(file);
      } catch (FileNotFoundException fileNotFoundException) {
        throw new a(fileNotFoundException);
      }  
    throw new a("invalid output path");
  }
  
  private byte[] b(RandomAccessFile paramRandomAccessFile) {
    if (this.d.a() == null)
      return null; 
    try {
      byte[] arrayOfByte = new byte[a(this.d.a())];
      paramRandomAccessFile.seek(this.d.l());
      paramRandomAccessFile.read(arrayOfByte);
      return arrayOfByte;
    } catch (IOException iOException) {
      throw new a(iOException);
    } 
  }
  
  private byte[] c(RandomAccessFile paramRandomAccessFile) {
    try {
      byte[] arrayOfByte = new byte[12];
      paramRandomAccessFile.seek(this.d.l());
      paramRandomAccessFile.read(arrayOfByte, 0, 12);
      return arrayOfByte;
    } catch (IOException iOException) {
      throw new a(iOException);
    } catch (Exception exception) {
      throw new a(exception);
    } 
  }
  
  private void d(RandomAccessFile paramRandomAccessFile) {
    if (this.d != null)
      try {
        e(paramRandomAccessFile);
        return;
      } catch (a a) {
        throw a;
      } catch (Exception exception) {
        throw new a(exception);
      }  
    throw new a("local file header is null, cannot initialize input stream");
  }
  
  private void e(RandomAccessFile paramRandomAccessFile) {
    g g1 = this.d;
    if (g1 != null) {
      if (g1.q()) {
        f f1;
        a a1;
        if (this.d.e() == 0) {
          f1 = new f(this.b, c(paramRandomAccessFile));
        } else if (this.d.e() == 99) {
          a1 = new a(this.d, b((RandomAccessFile)f1), a((RandomAccessFile)f1));
        } else {
          throw new a("unsupported encryption method");
        } 
        this.e = (c)a1;
        return;
      } 
      return;
    } 
    a a = new a("local file header is null, cannot init decrypter");
    throw a;
  }
  
  private boolean h() {
    RandomAccessFile randomAccessFile2 = null;
    RandomAccessFile randomAccessFile1 = null;
    try {
      RandomAccessFile randomAccessFile4 = i();
      RandomAccessFile randomAccessFile3 = randomAccessFile4;
      if (randomAccessFile4 == null) {
        randomAccessFile1 = randomAccessFile4;
        randomAccessFile2 = randomAccessFile4;
        randomAccessFile3 = new RandomAccessFile(new File(this.a.i()), "r");
      } 
      randomAccessFile1 = randomAccessFile3;
      randomAccessFile2 = randomAccessFile3;
      this.d = (new a(randomAccessFile3)).a(this.b);
      randomAccessFile1 = randomAccessFile3;
      randomAccessFile2 = randomAccessFile3;
      if (this.d != null) {
        randomAccessFile1 = randomAccessFile3;
        randomAccessFile2 = randomAccessFile3;
        int i = this.d.c();
        randomAccessFile1 = randomAccessFile3;
        randomAccessFile2 = randomAccessFile3;
        int j = this.b.c();
        if (i != j) {
          if (randomAccessFile3 != null)
            try {
              randomAccessFile3.close();
              return false;
            } catch (IOException|Exception iOException) {
              return false;
            }  
          return false;
        } 
        if (randomAccessFile3 != null)
          try {
            randomAccessFile3.close();
            return true;
          } catch (IOException|Exception iOException) {
            return true;
          }  
        return true;
      } 
      randomAccessFile1 = randomAccessFile3;
      randomAccessFile2 = randomAccessFile3;
      throw new a("error reading local file header. Is this a valid zip file?");
    } catch (FileNotFoundException fileNotFoundException) {
      randomAccessFile1 = randomAccessFile2;
      throw new a(fileNotFoundException);
    } finally {}
    if (randomAccessFile1 != null)
      try {
        randomAccessFile1.close();
      } catch (IOException|Exception iOException) {} 
    throw randomAccessFile2;
  }
  
  private RandomAccessFile i() {
    if (this.a.j()) {
      String str1;
      int i = this.b.f();
      int j = i + 1;
      this.c = j;
      String str2 = this.a.i();
      if (i == this.a.b().d()) {
        str1 = this.a.i();
      } else {
        StringBuilder stringBuilder;
        if (i >= 9) {
          stringBuilder = new StringBuilder();
          stringBuilder.append(str2.substring(0, str2.lastIndexOf(".")));
          str2 = ".z";
        } else {
          stringBuilder = new StringBuilder();
          stringBuilder.append(str2.substring(0, str2.lastIndexOf(".")));
          str2 = ".z0";
        } 
        stringBuilder.append(str2);
        stringBuilder.append(j);
        str1 = stringBuilder.toString();
      } 
      try {
        RandomAccessFile randomAccessFile = new RandomAccessFile(str1, "r");
        if (this.c == 1) {
          byte[] arrayOfByte = new byte[4];
          randomAccessFile.read(arrayOfByte);
          if (d.a(arrayOfByte, 0) == 134695760L)
            return randomAccessFile; 
          throw new a("invalid first part split file signature");
        } 
        return randomAccessFile;
      } catch (FileNotFoundException fileNotFoundException) {
        throw new a(fileNotFoundException);
      } catch (IOException iOException) {
        throw new a(iOException);
      } 
    } 
    return null;
  }
  
  public void a() {
    f f1 = this.b;
    if (f1 != null)
      if (f1.g() == 99) {
        c c1 = this.e;
        if (c1 != null && c1 instanceof a) {
          byte[] arrayOfByte1 = ((a)c1).a();
          byte[] arrayOfByte2 = ((a)this.e).d();
          byte[] arrayOfByte3 = new byte[10];
          if (arrayOfByte2 != null) {
            System.arraycopy(arrayOfByte1, 0, arrayOfByte3, 0, 10);
            if (Arrays.equals(arrayOfByte3, arrayOfByte2))
              return; 
            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder1.append("invalid CRC (MAC) for file: ");
            stringBuilder1.append(this.b.k());
            throw new a(stringBuilder1.toString());
          } 
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("CRC (MAC) check failed for ");
          stringBuilder.append(this.b.k());
          throw new a(stringBuilder.toString());
        } 
      } else if ((this.f.getValue() & 0xFFFFFFFFL) != this.b.d()) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("invalid CRC for file: ");
        stringBuilder.append(this.b.k());
        String str2 = stringBuilder.toString();
        String str1 = str2;
        if (this.d.q()) {
          str1 = str2;
          if (this.d.e() == 0) {
            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder1.append(str2);
            stringBuilder1.append(" - Wrong Password?");
            str1 = stringBuilder1.toString();
          } 
        } 
        throw new a(str1);
      }  
  }
  
  public void a(int paramInt) {
    this.f.update(paramInt);
  }
  
  public void a(a parama, String paramString1, String paramString2, h paramh) {
    if (this.a != null && this.b != null && e.h(paramString1)) {
      FileOutputStream fileOutputStream5 = null;
      FileOutputStream fileOutputStream3 = null;
      FileOutputStream fileOutputStream1 = null;
      FileOutputStream fileOutputStream2 = null;
      FileOutputStream fileOutputStream4 = null;
      FileOutputStream fileOutputStream6 = null;
      try {
        byte[] arrayOfByte = new byte[4096];
        h h1 = d();
      } catch (IOException null) {
      
      } catch (Exception exception) {
        Exception exception1;
        FileOutputStream fileOutputStream8;
        String str;
        paramString1 = null;
        FileOutputStream fileOutputStream7 = fileOutputStream1;
        try {
          throw new a(exception);
        } finally {
          exception = null;
          fileOutputStream8 = fileOutputStream7;
          exception1 = exception;
        } 
        a((InputStream)fileOutputStream8, (OutputStream)str);
        throw exception1;
      } finally {
        InputStream inputStream = null;
        fileOutputStream1 = fileOutputStream4;
        a(inputStream, fileOutputStream1);
      } 
      throw new a(exception);
    } 
    a a1 = new a("Invalid parameters passed during unzipping file. One or more of the parameters were null");
    throw a1;
  }
  
  public void a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (paramArrayOfbyte != null)
      this.f.update(paramArrayOfbyte, paramInt1, paramInt2); 
  }
  
  public c b() {
    return this.e;
  }
  
  public f c() {
    return this.b;
  }
  
  public h d() {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : Li/a/a/e/f;
    //   4: ifnull -> 645
    //   7: aconst_null
    //   8: astore #11
    //   10: aconst_null
    //   11: astore #10
    //   13: aload_0
    //   14: ldc 'r'
    //   16: invokespecial a : (Ljava/lang/String;)Ljava/io/RandomAccessFile;
    //   19: astore #12
    //   21: aload #12
    //   23: astore #10
    //   25: aload #12
    //   27: astore #11
    //   29: aload_0
    //   30: invokespecial h : ()Z
    //   33: ifeq -> 589
    //   36: aload #12
    //   38: astore #10
    //   40: aload #12
    //   42: astore #11
    //   44: aload_0
    //   45: aload #12
    //   47: invokespecial d : (Ljava/io/RandomAccessFile;)V
    //   50: aload #12
    //   52: astore #10
    //   54: aload #12
    //   56: astore #11
    //   58: aload_0
    //   59: getfield d : Li/a/a/e/g;
    //   62: invokevirtual b : ()J
    //   65: lstore #8
    //   67: aload #12
    //   69: astore #10
    //   71: aload #12
    //   73: astore #11
    //   75: aload_0
    //   76: getfield d : Li/a/a/e/g;
    //   79: invokevirtual l : ()J
    //   82: lstore #6
    //   84: lload #8
    //   86: lstore_2
    //   87: lload #6
    //   89: lstore #4
    //   91: aload #12
    //   93: astore #10
    //   95: aload #12
    //   97: astore #11
    //   99: aload_0
    //   100: getfield d : Li/a/a/e/g;
    //   103: invokevirtual q : ()Z
    //   106: ifeq -> 335
    //   109: aload #12
    //   111: astore #10
    //   113: aload #12
    //   115: astore #11
    //   117: aload_0
    //   118: getfield d : Li/a/a/e/g;
    //   121: invokevirtual e : ()I
    //   124: bipush #99
    //   126: if_icmpne -> 295
    //   129: aload #12
    //   131: astore #10
    //   133: aload #12
    //   135: astore #11
    //   137: aload_0
    //   138: getfield e : Li/a/a/b/c;
    //   141: instanceof i/a/a/b/a
    //   144: ifeq -> 219
    //   147: aload #12
    //   149: astore #10
    //   151: aload #12
    //   153: astore #11
    //   155: lload #8
    //   157: aload_0
    //   158: getfield e : Li/a/a/b/c;
    //   161: checkcast i/a/a/b/a
    //   164: invokevirtual c : ()I
    //   167: aload_0
    //   168: getfield e : Li/a/a/b/c;
    //   171: checkcast i/a/a/b/a
    //   174: invokevirtual b : ()I
    //   177: iadd
    //   178: bipush #10
    //   180: iadd
    //   181: i2l
    //   182: lsub
    //   183: lstore_2
    //   184: aload #12
    //   186: astore #10
    //   188: aload #12
    //   190: astore #11
    //   192: aload_0
    //   193: getfield e : Li/a/a/b/c;
    //   196: checkcast i/a/a/b/a
    //   199: invokevirtual c : ()I
    //   202: aload_0
    //   203: getfield e : Li/a/a/b/c;
    //   206: checkcast i/a/a/b/a
    //   209: invokevirtual b : ()I
    //   212: iadd
    //   213: i2l
    //   214: lstore #4
    //   216: goto -> 666
    //   219: aload #12
    //   221: astore #10
    //   223: aload #12
    //   225: astore #11
    //   227: new java/lang/StringBuilder
    //   230: dup
    //   231: invokespecial <init> : ()V
    //   234: astore #13
    //   236: aload #12
    //   238: astore #10
    //   240: aload #12
    //   242: astore #11
    //   244: aload #13
    //   246: ldc_w 'invalid decryptor when trying to calculate compressed size for AES encrypted file: '
    //   249: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   252: pop
    //   253: aload #12
    //   255: astore #10
    //   257: aload #12
    //   259: astore #11
    //   261: aload #13
    //   263: aload_0
    //   264: getfield b : Li/a/a/e/f;
    //   267: invokevirtual k : ()Ljava/lang/String;
    //   270: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   273: pop
    //   274: aload #12
    //   276: astore #10
    //   278: aload #12
    //   280: astore #11
    //   282: new i/a/a/c/a
    //   285: dup
    //   286: aload #13
    //   288: invokevirtual toString : ()Ljava/lang/String;
    //   291: invokespecial <init> : (Ljava/lang/String;)V
    //   294: athrow
    //   295: lload #8
    //   297: lstore_2
    //   298: lload #6
    //   300: lstore #4
    //   302: aload #12
    //   304: astore #10
    //   306: aload #12
    //   308: astore #11
    //   310: aload_0
    //   311: getfield d : Li/a/a/e/g;
    //   314: invokevirtual e : ()I
    //   317: ifne -> 335
    //   320: ldc2_w 12
    //   323: lstore #4
    //   325: lload #8
    //   327: ldc2_w 12
    //   330: lsub
    //   331: lstore_2
    //   332: goto -> 666
    //   335: aload #12
    //   337: astore #10
    //   339: aload #12
    //   341: astore #11
    //   343: aload_0
    //   344: getfield b : Li/a/a/e/f;
    //   347: invokevirtual c : ()I
    //   350: istore_1
    //   351: aload #12
    //   353: astore #10
    //   355: aload #12
    //   357: astore #11
    //   359: aload_0
    //   360: getfield b : Li/a/a/e/f;
    //   363: invokevirtual g : ()I
    //   366: bipush #99
    //   368: if_icmpne -> 487
    //   371: aload #12
    //   373: astore #10
    //   375: aload #12
    //   377: astore #11
    //   379: aload_0
    //   380: getfield b : Li/a/a/e/f;
    //   383: invokevirtual a : ()Li/a/a/e/a;
    //   386: ifnull -> 411
    //   389: aload #12
    //   391: astore #10
    //   393: aload #12
    //   395: astore #11
    //   397: aload_0
    //   398: getfield b : Li/a/a/e/f;
    //   401: invokevirtual a : ()Li/a/a/e/a;
    //   404: invokevirtual b : ()I
    //   407: istore_1
    //   408: goto -> 487
    //   411: aload #12
    //   413: astore #10
    //   415: aload #12
    //   417: astore #11
    //   419: new java/lang/StringBuilder
    //   422: dup
    //   423: invokespecial <init> : ()V
    //   426: astore #13
    //   428: aload #12
    //   430: astore #10
    //   432: aload #12
    //   434: astore #11
    //   436: aload #13
    //   438: ldc_w 'AESExtraDataRecord does not exist for AES encrypted file: '
    //   441: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   444: pop
    //   445: aload #12
    //   447: astore #10
    //   449: aload #12
    //   451: astore #11
    //   453: aload #13
    //   455: aload_0
    //   456: getfield b : Li/a/a/e/f;
    //   459: invokevirtual k : ()Ljava/lang/String;
    //   462: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   465: pop
    //   466: aload #12
    //   468: astore #10
    //   470: aload #12
    //   472: astore #11
    //   474: new i/a/a/c/a
    //   477: dup
    //   478: aload #13
    //   480: invokevirtual toString : ()Ljava/lang/String;
    //   483: invokespecial <init> : (Ljava/lang/String;)V
    //   486: athrow
    //   487: aload #12
    //   489: astore #10
    //   491: aload #12
    //   493: astore #11
    //   495: aload #12
    //   497: lload #4
    //   499: invokevirtual seek : (J)V
    //   502: iload_1
    //   503: ifeq -> 560
    //   506: iload_1
    //   507: bipush #8
    //   509: if_icmpne -> 541
    //   512: aload #12
    //   514: astore #10
    //   516: aload #12
    //   518: astore #11
    //   520: new i/a/a/d/h
    //   523: dup
    //   524: new i/a/a/d/e
    //   527: dup
    //   528: aload #12
    //   530: lload #4
    //   532: lload_2
    //   533: aload_0
    //   534: invokespecial <init> : (Ljava/io/RandomAccessFile;JJLi/a/a/g/b;)V
    //   537: invokespecial <init> : (Li/a/a/d/a;)V
    //   540: areturn
    //   541: aload #12
    //   543: astore #10
    //   545: aload #12
    //   547: astore #11
    //   549: new i/a/a/c/a
    //   552: dup
    //   553: ldc_w 'compression type not supported'
    //   556: invokespecial <init> : (Ljava/lang/String;)V
    //   559: athrow
    //   560: aload #12
    //   562: astore #10
    //   564: aload #12
    //   566: astore #11
    //   568: new i/a/a/d/h
    //   571: dup
    //   572: new i/a/a/d/f
    //   575: dup
    //   576: aload #12
    //   578: lload #4
    //   580: lload_2
    //   581: aload_0
    //   582: invokespecial <init> : (Ljava/io/RandomAccessFile;JJLi/a/a/g/b;)V
    //   585: invokespecial <init> : (Li/a/a/d/a;)V
    //   588: areturn
    //   589: aload #12
    //   591: astore #10
    //   593: aload #12
    //   595: astore #11
    //   597: new i/a/a/c/a
    //   600: dup
    //   601: ldc_w 'local header and file header do not match'
    //   604: invokespecial <init> : (Ljava/lang/String;)V
    //   607: athrow
    //   608: astore #11
    //   610: aload #10
    //   612: ifnull -> 620
    //   615: aload #10
    //   617: invokevirtual close : ()V
    //   620: new i/a/a/c/a
    //   623: dup
    //   624: aload #11
    //   626: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   629: athrow
    //   630: astore #10
    //   632: aload #11
    //   634: ifnull -> 642
    //   637: aload #11
    //   639: invokevirtual close : ()V
    //   642: aload #10
    //   644: athrow
    //   645: new i/a/a/c/a
    //   648: dup
    //   649: ldc_w 'file header is null, cannot get inputstream'
    //   652: invokespecial <init> : (Ljava/lang/String;)V
    //   655: athrow
    //   656: astore #10
    //   658: goto -> 620
    //   661: astore #11
    //   663: goto -> 642
    //   666: lload #6
    //   668: lload #4
    //   670: ladd
    //   671: lstore #4
    //   673: goto -> 335
    // Exception table:
    //   from	to	target	type
    //   13	21	630	i/a/a/c/a
    //   13	21	608	java/lang/Exception
    //   29	36	630	i/a/a/c/a
    //   29	36	608	java/lang/Exception
    //   44	50	630	i/a/a/c/a
    //   44	50	608	java/lang/Exception
    //   58	67	630	i/a/a/c/a
    //   58	67	608	java/lang/Exception
    //   75	84	630	i/a/a/c/a
    //   75	84	608	java/lang/Exception
    //   99	109	630	i/a/a/c/a
    //   99	109	608	java/lang/Exception
    //   117	129	630	i/a/a/c/a
    //   117	129	608	java/lang/Exception
    //   137	147	630	i/a/a/c/a
    //   137	147	608	java/lang/Exception
    //   155	184	630	i/a/a/c/a
    //   155	184	608	java/lang/Exception
    //   192	216	630	i/a/a/c/a
    //   192	216	608	java/lang/Exception
    //   227	236	630	i/a/a/c/a
    //   227	236	608	java/lang/Exception
    //   244	253	630	i/a/a/c/a
    //   244	253	608	java/lang/Exception
    //   261	274	630	i/a/a/c/a
    //   261	274	608	java/lang/Exception
    //   282	295	630	i/a/a/c/a
    //   282	295	608	java/lang/Exception
    //   310	320	630	i/a/a/c/a
    //   310	320	608	java/lang/Exception
    //   343	351	630	i/a/a/c/a
    //   343	351	608	java/lang/Exception
    //   359	371	630	i/a/a/c/a
    //   359	371	608	java/lang/Exception
    //   379	389	630	i/a/a/c/a
    //   379	389	608	java/lang/Exception
    //   397	408	630	i/a/a/c/a
    //   397	408	608	java/lang/Exception
    //   419	428	630	i/a/a/c/a
    //   419	428	608	java/lang/Exception
    //   436	445	630	i/a/a/c/a
    //   436	445	608	java/lang/Exception
    //   453	466	630	i/a/a/c/a
    //   453	466	608	java/lang/Exception
    //   474	487	630	i/a/a/c/a
    //   474	487	608	java/lang/Exception
    //   495	502	630	i/a/a/c/a
    //   495	502	608	java/lang/Exception
    //   520	541	630	i/a/a/c/a
    //   520	541	608	java/lang/Exception
    //   549	560	630	i/a/a/c/a
    //   549	560	608	java/lang/Exception
    //   568	589	630	i/a/a/c/a
    //   568	589	608	java/lang/Exception
    //   597	608	630	i/a/a/c/a
    //   597	608	608	java/lang/Exception
    //   615	620	656	java/io/IOException
    //   637	642	661	java/io/IOException
  }
  
  public g e() {
    return this.d;
  }
  
  public l f() {
    return this.a;
  }
  
  public RandomAccessFile g() {
    String str = this.a.i();
    if (this.c == this.a.b().d()) {
      str = this.a.i();
    } else {
      StringBuilder stringBuilder;
      if (this.c >= 9) {
        stringBuilder = new StringBuilder();
        stringBuilder.append(str.substring(0, str.lastIndexOf(".")));
        str = ".z";
      } else {
        stringBuilder = new StringBuilder();
        stringBuilder.append(str.substring(0, str.lastIndexOf(".")));
        str = ".z0";
      } 
      stringBuilder.append(str);
      stringBuilder.append(this.c + 1);
      str = stringBuilder.toString();
    } 
    this.c++;
    try {
      boolean bool = e.a(str);
      if (bool)
        return new RandomAccessFile(str, "r"); 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("zip split file does not exist: ");
      stringBuilder.append(str);
      throw new IOException(stringBuilder.toString());
    } catch (a a) {
      throw new IOException(a.getMessage());
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/i/a/a/g/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */