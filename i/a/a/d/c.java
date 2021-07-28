package i.a.a.d;

import i.a.a.a.b;
import i.a.a.b.b;
import i.a.a.b.d;
import i.a.a.b.g;
import i.a.a.c.a;
import i.a.a.e.a;
import i.a.a.e.b;
import i.a.a.e.d;
import i.a.a.e.f;
import i.a.a.e.g;
import i.a.a.e.l;
import i.a.a.e.m;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.zip.CRC32;

public class c extends b {
  protected OutputStream c;
  
  private File d;
  
  protected f e;
  
  protected g f;
  
  private d g;
  
  protected m h;
  
  protected l i;
  
  private long j;
  
  protected CRC32 k;
  
  private long l;
  
  private byte[] m;
  
  private int n;
  
  private long o;
  
  public c(OutputStream paramOutputStream, l paraml) {
    this.c = paramOutputStream;
    a(paraml);
    this.k = new CRC32();
    this.j = 0L;
    this.l = 0L;
    this.m = new byte[16];
    this.n = 0;
    this.o = 0L;
  }
  
  private int a(File paramFile) {
    if (paramFile != null)
      return !paramFile.exists() ? 0 : (paramFile.isDirectory() ? (paramFile.isHidden() ? 18 : 16) : ((!paramFile.canWrite() && paramFile.isHidden()) ? 3 : (!paramFile.canWrite() ? 1 : (paramFile.isHidden() ? 2 : 0)))); 
    throw new a("input file is null, cannot get file attributes");
  }
  
  private a a(m paramm) {
    if (paramm != null) {
      a a1 = new a();
      a1.a(39169L);
      a1.c(7);
      a1.a("AE");
      a1.d(2);
      int i = paramm.a();
      byte b1 = 1;
      if (i != 1) {
        i = paramm.a();
        b1 = 3;
        if (i != 3)
          throw new a("invalid AES key strength, cannot generate AES Extra data record"); 
      } 
      a1.a(b1);
      a1.b(paramm.c());
      return a1;
    } 
    a a = new a("zip parameters are null, cannot generate AES Extra Data record");
    throw a;
  }
  
  private void a(l paraml) {
    l l1 = paraml;
    if (paraml == null)
      l1 = new l(); 
    this.i = l1;
    if (this.i.b() == null)
      this.i.a(new d()); 
    if (this.i.a() == null)
      this.i.a(new b()); 
    if (this.i.a().a() == null)
      this.i.a().a(new ArrayList()); 
    if (this.i.d() == null)
      this.i.a(new ArrayList()); 
    OutputStream outputStream = this.c;
    if (outputStream instanceof g && ((g)outputStream).d()) {
      this.i.a(true);
      this.i.a(((g)this.c).c());
    } 
    this.i.b().b(101010256L);
  }
  
  private void a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    d d1 = this.g;
    if (d1 != null)
      try {
        d1.a(paramArrayOfbyte, paramInt1, paramInt2);
      } catch (a a) {
        throw new IOException(a.getMessage());
      }  
    this.c.write((byte[])a, paramInt1, paramInt2);
    long l1 = this.j;
    long l2 = paramInt2;
    this.j = l1 + l2;
    this.l += l2;
  }
  
  private int[] a(boolean paramBoolean, int paramInt) {
    int[] arrayOfInt = new int[8];
    if (paramBoolean) {
      arrayOfInt[0] = 1;
    } else {
      arrayOfInt[0] = 0;
    } 
    if (paramInt != 8) {
      arrayOfInt[1] = 0;
      arrayOfInt[2] = 0;
    } 
    arrayOfInt[3] = 1;
    return arrayOfInt;
  }
  
  private void c() {
    // Byte code:
    //   0: aload_0
    //   1: new i/a/a/e/f
    //   4: dup
    //   5: invokespecial <init> : ()V
    //   8: putfield e : Li/a/a/e/f;
    //   11: aload_0
    //   12: getfield e : Li/a/a/e/f;
    //   15: ldc 33639248
    //   17: invokevirtual g : (I)V
    //   20: aload_0
    //   21: getfield e : Li/a/a/e/f;
    //   24: bipush #20
    //   26: invokevirtual h : (I)V
    //   29: aload_0
    //   30: getfield e : Li/a/a/e/f;
    //   33: bipush #20
    //   35: invokevirtual i : (I)V
    //   38: aload_0
    //   39: getfield h : Li/a/a/e/m;
    //   42: invokevirtual l : ()Z
    //   45: ifeq -> 87
    //   48: aload_0
    //   49: getfield h : Li/a/a/e/m;
    //   52: invokevirtual f : ()I
    //   55: bipush #99
    //   57: if_icmpne -> 87
    //   60: aload_0
    //   61: getfield e : Li/a/a/e/f;
    //   64: bipush #99
    //   66: invokevirtual a : (I)V
    //   69: aload_0
    //   70: getfield e : Li/a/a/e/f;
    //   73: aload_0
    //   74: aload_0
    //   75: getfield h : Li/a/a/e/m;
    //   78: invokespecial a : (Li/a/a/e/m;)Li/a/a/e/a;
    //   81: invokevirtual a : (Li/a/a/e/a;)V
    //   84: goto -> 101
    //   87: aload_0
    //   88: getfield e : Li/a/a/e/f;
    //   91: aload_0
    //   92: getfield h : Li/a/a/e/m;
    //   95: invokevirtual c : ()I
    //   98: invokevirtual a : (I)V
    //   101: aload_0
    //   102: getfield h : Li/a/a/e/m;
    //   105: invokevirtual l : ()Z
    //   108: ifeq -> 133
    //   111: aload_0
    //   112: getfield e : Li/a/a/e/f;
    //   115: iconst_1
    //   116: invokevirtual c : (Z)V
    //   119: aload_0
    //   120: getfield e : Li/a/a/e/f;
    //   123: aload_0
    //   124: getfield h : Li/a/a/e/m;
    //   127: invokevirtual f : ()I
    //   130: invokevirtual c : (I)V
    //   133: aload_0
    //   134: getfield h : Li/a/a/e/m;
    //   137: invokevirtual o : ()Z
    //   140: ifeq -> 192
    //   143: aload_0
    //   144: getfield e : Li/a/a/e/f;
    //   147: invokestatic currentTimeMillis : ()J
    //   150: invokestatic a : (J)J
    //   153: l2i
    //   154: invokevirtual f : (I)V
    //   157: aload_0
    //   158: getfield h : Li/a/a/e/m;
    //   161: invokevirtual g : ()Ljava/lang/String;
    //   164: invokestatic h : (Ljava/lang/String;)Z
    //   167: ifeq -> 182
    //   170: aload_0
    //   171: getfield h : Li/a/a/e/m;
    //   174: invokevirtual g : ()Ljava/lang/String;
    //   177: astore #6
    //   179: goto -> 257
    //   182: new i/a/a/c/a
    //   185: dup
    //   186: ldc 'fileNameInZip is null or empty'
    //   188: invokespecial <init> : (Ljava/lang/String;)V
    //   191: athrow
    //   192: aload_0
    //   193: getfield e : Li/a/a/e/f;
    //   196: aload_0
    //   197: getfield d : Ljava/io/File;
    //   200: aload_0
    //   201: getfield h : Li/a/a/e/m;
    //   204: invokevirtual k : ()Ljava/util/TimeZone;
    //   207: invokestatic a : (Ljava/io/File;Ljava/util/TimeZone;)J
    //   210: invokestatic a : (J)J
    //   213: l2i
    //   214: invokevirtual f : (I)V
    //   217: aload_0
    //   218: getfield e : Li/a/a/e/f;
    //   221: aload_0
    //   222: getfield d : Ljava/io/File;
    //   225: invokevirtual length : ()J
    //   228: invokevirtual d : (J)V
    //   231: aload_0
    //   232: getfield d : Ljava/io/File;
    //   235: invokevirtual getAbsolutePath : ()Ljava/lang/String;
    //   238: aload_0
    //   239: getfield h : Li/a/a/e/m;
    //   242: invokevirtual i : ()Ljava/lang/String;
    //   245: aload_0
    //   246: getfield h : Li/a/a/e/m;
    //   249: invokevirtual d : ()Ljava/lang/String;
    //   252: invokestatic a : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   255: astore #6
    //   257: aload #6
    //   259: invokestatic h : (Ljava/lang/String;)Z
    //   262: ifeq -> 808
    //   265: aload_0
    //   266: getfield e : Li/a/a/e/f;
    //   269: aload #6
    //   271: invokevirtual b : (Ljava/lang/String;)V
    //   274: aload_0
    //   275: getfield i : Li/a/a/e/l;
    //   278: invokevirtual c : ()Ljava/lang/String;
    //   281: invokestatic h : (Ljava/lang/String;)Z
    //   284: ifeq -> 309
    //   287: aload_0
    //   288: getfield e : Li/a/a/e/f;
    //   291: astore #7
    //   293: aload #6
    //   295: aload_0
    //   296: getfield i : Li/a/a/e/l;
    //   299: invokevirtual c : ()Ljava/lang/String;
    //   302: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)I
    //   305: istore_2
    //   306: goto -> 321
    //   309: aload_0
    //   310: getfield e : Li/a/a/e/f;
    //   313: astore #7
    //   315: aload #6
    //   317: invokestatic f : (Ljava/lang/String;)I
    //   320: istore_2
    //   321: aload #7
    //   323: iload_2
    //   324: invokevirtual e : (I)V
    //   327: aload_0
    //   328: getfield c : Ljava/io/OutputStream;
    //   331: astore #7
    //   333: aload #7
    //   335: instanceof i/a/a/d/g
    //   338: ifeq -> 359
    //   341: aload_0
    //   342: getfield e : Li/a/a/e/f;
    //   345: aload #7
    //   347: checkcast i/a/a/d/g
    //   350: invokevirtual a : ()I
    //   353: invokevirtual b : (I)V
    //   356: goto -> 367
    //   359: aload_0
    //   360: getfield e : Li/a/a/e/f;
    //   363: iconst_0
    //   364: invokevirtual b : (I)V
    //   367: aload_0
    //   368: getfield h : Li/a/a/e/m;
    //   371: invokevirtual o : ()Z
    //   374: ifne -> 389
    //   377: aload_0
    //   378: aload_0
    //   379: getfield d : Ljava/io/File;
    //   382: invokespecial a : (Ljava/io/File;)I
    //   385: istore_2
    //   386: goto -> 391
    //   389: iconst_0
    //   390: istore_2
    //   391: iload_2
    //   392: i2b
    //   393: istore_1
    //   394: aload_0
    //   395: getfield e : Li/a/a/e/f;
    //   398: iconst_4
    //   399: newarray byte
    //   401: dup
    //   402: iconst_0
    //   403: iload_1
    //   404: bastore
    //   405: dup
    //   406: iconst_1
    //   407: iconst_0
    //   408: bastore
    //   409: dup
    //   410: iconst_2
    //   411: iconst_0
    //   412: bastore
    //   413: dup
    //   414: iconst_3
    //   415: iconst_0
    //   416: bastore
    //   417: invokevirtual b : ([B)V
    //   420: aload_0
    //   421: getfield h : Li/a/a/e/m;
    //   424: invokevirtual o : ()Z
    //   427: ifeq -> 477
    //   430: aload_0
    //   431: getfield e : Li/a/a/e/f;
    //   434: astore #7
    //   436: aload #6
    //   438: ldc_w '/'
    //   441: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   444: ifne -> 466
    //   447: aload #6
    //   449: ldc_w '\'
    //   452: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   455: ifeq -> 461
    //   458: goto -> 466
    //   461: iconst_0
    //   462: istore_3
    //   463: goto -> 468
    //   466: iconst_1
    //   467: istore_3
    //   468: aload #7
    //   470: iload_3
    //   471: invokevirtual b : (Z)V
    //   474: goto -> 491
    //   477: aload_0
    //   478: getfield e : Li/a/a/e/f;
    //   481: aload_0
    //   482: getfield d : Ljava/io/File;
    //   485: invokevirtual isDirectory : ()Z
    //   488: invokevirtual b : (Z)V
    //   491: aload_0
    //   492: getfield e : Li/a/a/e/f;
    //   495: invokevirtual v : ()Z
    //   498: ifeq -> 520
    //   501: aload_0
    //   502: getfield e : Li/a/a/e/f;
    //   505: lconst_0
    //   506: invokevirtual a : (J)V
    //   509: aload_0
    //   510: getfield e : Li/a/a/e/f;
    //   513: lconst_0
    //   514: invokevirtual d : (J)V
    //   517: goto -> 665
    //   520: aload_0
    //   521: getfield h : Li/a/a/e/m;
    //   524: invokevirtual o : ()Z
    //   527: ifne -> 665
    //   530: aload_0
    //   531: getfield d : Ljava/io/File;
    //   534: invokestatic b : (Ljava/io/File;)J
    //   537: lstore #4
    //   539: aload_0
    //   540: getfield h : Li/a/a/e/m;
    //   543: invokevirtual c : ()I
    //   546: ifne -> 648
    //   549: aload_0
    //   550: getfield h : Li/a/a/e/m;
    //   553: invokevirtual f : ()I
    //   556: ifne -> 575
    //   559: aload_0
    //   560: getfield e : Li/a/a/e/f;
    //   563: ldc2_w 12
    //   566: lload #4
    //   568: ladd
    //   569: invokevirtual a : (J)V
    //   572: goto -> 656
    //   575: aload_0
    //   576: getfield h : Li/a/a/e/m;
    //   579: invokevirtual f : ()I
    //   582: bipush #99
    //   584: if_icmpne -> 648
    //   587: aload_0
    //   588: getfield h : Li/a/a/e/m;
    //   591: invokevirtual a : ()I
    //   594: istore_2
    //   595: iload_2
    //   596: iconst_1
    //   597: if_icmpeq -> 622
    //   600: iload_2
    //   601: iconst_3
    //   602: if_icmpne -> 611
    //   605: bipush #16
    //   607: istore_2
    //   608: goto -> 625
    //   611: new i/a/a/c/a
    //   614: dup
    //   615: ldc_w 'invalid aes key strength, cannot determine key sizes'
    //   618: invokespecial <init> : (Ljava/lang/String;)V
    //   621: athrow
    //   622: bipush #8
    //   624: istore_2
    //   625: aload_0
    //   626: getfield e : Li/a/a/e/f;
    //   629: iload_2
    //   630: i2l
    //   631: lload #4
    //   633: ladd
    //   634: ldc2_w 10
    //   637: ladd
    //   638: ldc2_w 2
    //   641: ladd
    //   642: invokevirtual a : (J)V
    //   645: goto -> 656
    //   648: aload_0
    //   649: getfield e : Li/a/a/e/f;
    //   652: lconst_0
    //   653: invokevirtual a : (J)V
    //   656: aload_0
    //   657: getfield e : Li/a/a/e/f;
    //   660: lload #4
    //   662: invokevirtual d : (J)V
    //   665: aload_0
    //   666: getfield h : Li/a/a/e/m;
    //   669: invokevirtual l : ()Z
    //   672: ifeq -> 700
    //   675: aload_0
    //   676: getfield h : Li/a/a/e/m;
    //   679: invokevirtual f : ()I
    //   682: ifne -> 700
    //   685: aload_0
    //   686: getfield e : Li/a/a/e/f;
    //   689: aload_0
    //   690: getfield h : Li/a/a/e/m;
    //   693: invokevirtual j : ()I
    //   696: i2l
    //   697: invokevirtual b : (J)V
    //   700: iconst_2
    //   701: newarray byte
    //   703: astore #6
    //   705: aload #6
    //   707: iconst_0
    //   708: aload_0
    //   709: aload_0
    //   710: getfield e : Li/a/a/e/f;
    //   713: invokevirtual w : ()Z
    //   716: aload_0
    //   717: getfield h : Li/a/a/e/m;
    //   720: invokevirtual c : ()I
    //   723: invokespecial a : (ZI)[I
    //   726: invokestatic a : ([I)B
    //   729: bastore
    //   730: aload_0
    //   731: getfield i : Li/a/a/e/l;
    //   734: invokevirtual c : ()Ljava/lang/String;
    //   737: invokestatic h : (Ljava/lang/String;)Z
    //   740: istore_3
    //   741: iload_3
    //   742: ifeq -> 761
    //   745: aload_0
    //   746: getfield i : Li/a/a/e/l;
    //   749: invokevirtual c : ()Ljava/lang/String;
    //   752: ldc_w 'UTF8'
    //   755: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   758: ifne -> 784
    //   761: iload_3
    //   762: ifne -> 793
    //   765: aload_0
    //   766: getfield e : Li/a/a/e/f;
    //   769: invokevirtual k : ()Ljava/lang/String;
    //   772: invokestatic e : (Ljava/lang/String;)Ljava/lang/String;
    //   775: ldc_w 'UTF8'
    //   778: invokevirtual equals : (Ljava/lang/Object;)Z
    //   781: ifeq -> 793
    //   784: aload #6
    //   786: iconst_1
    //   787: bipush #8
    //   789: bastore
    //   790: goto -> 798
    //   793: aload #6
    //   795: iconst_1
    //   796: iconst_0
    //   797: bastore
    //   798: aload_0
    //   799: getfield e : Li/a/a/e/f;
    //   802: aload #6
    //   804: invokevirtual c : ([B)V
    //   807: return
    //   808: new i/a/a/c/a
    //   811: dup
    //   812: ldc_w 'fileName is null or empty. unable to create file header'
    //   815: invokespecial <init> : (Ljava/lang/String;)V
    //   818: athrow
  }
  
  private void d() {
    if (this.e != null) {
      this.f = new g();
      this.f.f(67324752);
      this.f.g(this.e.t());
      this.f.a(this.e.c());
      this.f.e(this.e.n());
      this.f.d(this.e.r());
      this.f.d(this.e.l());
      this.f.a(this.e.k());
      this.f.b(this.e.w());
      this.f.b(this.e.g());
      this.f.a(this.e.a());
      this.f.b(this.e.d());
      this.f.a(this.e.b());
      this.f.b((byte[])this.e.m().clone());
      return;
    } 
    throw new a("file header is null, cannot create local file header");
  }
  
  private void e() {
    g g1;
    if (!this.h.l()) {
      this.g = null;
      return;
    } 
    int i = this.h.f();
    if (i != 0) {
      if (i == 99) {
        b b1 = new b(this.h.h(), this.h.a());
      } else {
        throw new a("invalid encprytion method");
      } 
    } else {
      g1 = new g(this.h.h(), (this.f.k() & 0xFFFF) << 16);
    } 
    this.g = (d)g1;
  }
  
  public void a() {
    int i = this.n;
    if (i != 0) {
      a(this.m, 0, i);
      this.n = 0;
    } 
    if (this.h.l() && this.h.f() == 99) {
      d d1 = this.g;
      if (d1 instanceof b) {
        this.c.write(((b)d1).b());
        this.l += 10L;
        this.j += 10L;
      } else {
        throw new a("invalid encrypter for AES encrypted file");
      } 
    } 
    this.e.a(this.l);
    this.f.a(this.l);
    if (this.h.o()) {
      this.e.d(this.o);
      long l3 = this.f.o();
      long l4 = this.o;
      if (l3 != l4)
        this.f.d(l4); 
    } 
    long l2 = this.k.getValue();
    long l1 = l2;
    if (this.e.w()) {
      l1 = l2;
      if (this.e.g() == 99)
        l1 = 0L; 
    } 
    if (this.h.l() && this.h.f() == 99) {
      this.e.b(0L);
      this.f.b(0L);
    } else {
      this.e.b(l1);
      this.f.b(l1);
    } 
    this.i.d().add(this.f);
    this.i.a().a().add(this.e);
    b b1 = new b();
    this.j += b1.a(this.f, this.c);
    this.k.reset();
    this.l = 0L;
    this.g = null;
    this.o = 0L;
  }
  
  public void a(File paramFile, m paramm) {
    // Byte code:
    //   0: aload_2
    //   1: invokevirtual o : ()Z
    //   4: ifne -> 25
    //   7: aload_1
    //   8: ifnull -> 14
    //   11: goto -> 25
    //   14: new i/a/a/c/a
    //   17: dup
    //   18: ldc_w 'input file is null'
    //   21: invokespecial <init> : (Ljava/lang/String;)V
    //   24: athrow
    //   25: aload_2
    //   26: invokevirtual o : ()Z
    //   29: ifne -> 53
    //   32: aload_1
    //   33: invokestatic a : (Ljava/io/File;)Z
    //   36: ifeq -> 42
    //   39: goto -> 53
    //   42: new i/a/a/c/a
    //   45: dup
    //   46: ldc_w 'input file does not exist'
    //   49: invokespecial <init> : (Ljava/lang/String;)V
    //   52: athrow
    //   53: aload_0
    //   54: aload_1
    //   55: putfield d : Ljava/io/File;
    //   58: aload_0
    //   59: aload_2
    //   60: invokevirtual clone : ()Ljava/lang/Object;
    //   63: checkcast i/a/a/e/m
    //   66: putfield h : Li/a/a/e/m;
    //   69: aload_2
    //   70: invokevirtual o : ()Z
    //   73: ifne -> 115
    //   76: aload_0
    //   77: getfield d : Ljava/io/File;
    //   80: invokevirtual isDirectory : ()Z
    //   83: ifeq -> 184
    //   86: aload_0
    //   87: getfield h : Li/a/a/e/m;
    //   90: iconst_0
    //   91: invokevirtual a : (Z)V
    //   94: aload_0
    //   95: getfield h : Li/a/a/e/m;
    //   98: iconst_m1
    //   99: invokevirtual d : (I)V
    //   102: aload_0
    //   103: getfield h : Li/a/a/e/m;
    //   106: astore_1
    //   107: aload_1
    //   108: iconst_0
    //   109: invokevirtual c : (I)V
    //   112: goto -> 184
    //   115: aload_0
    //   116: getfield h : Li/a/a/e/m;
    //   119: invokevirtual g : ()Ljava/lang/String;
    //   122: invokestatic h : (Ljava/lang/String;)Z
    //   125: ifeq -> 558
    //   128: aload_0
    //   129: getfield h : Li/a/a/e/m;
    //   132: invokevirtual g : ()Ljava/lang/String;
    //   135: ldc_w '/'
    //   138: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   141: ifne -> 160
    //   144: aload_0
    //   145: getfield h : Li/a/a/e/m;
    //   148: invokevirtual g : ()Ljava/lang/String;
    //   151: ldc_w '\'
    //   154: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   157: ifeq -> 184
    //   160: aload_0
    //   161: getfield h : Li/a/a/e/m;
    //   164: iconst_0
    //   165: invokevirtual a : (Z)V
    //   168: aload_0
    //   169: getfield h : Li/a/a/e/m;
    //   172: iconst_m1
    //   173: invokevirtual d : (I)V
    //   176: aload_0
    //   177: getfield h : Li/a/a/e/m;
    //   180: astore_1
    //   181: goto -> 107
    //   184: aload_0
    //   185: invokespecial c : ()V
    //   188: aload_0
    //   189: invokespecial d : ()V
    //   192: aload_0
    //   193: getfield i : Li/a/a/e/l;
    //   196: invokevirtual j : ()Z
    //   199: ifeq -> 273
    //   202: aload_0
    //   203: getfield i : Li/a/a/e/l;
    //   206: invokevirtual a : ()Li/a/a/e/b;
    //   209: ifnull -> 241
    //   212: aload_0
    //   213: getfield i : Li/a/a/e/l;
    //   216: invokevirtual a : ()Li/a/a/e/b;
    //   219: invokevirtual a : ()Ljava/util/ArrayList;
    //   222: ifnull -> 241
    //   225: aload_0
    //   226: getfield i : Li/a/a/e/l;
    //   229: invokevirtual a : ()Li/a/a/e/b;
    //   232: invokevirtual a : ()Ljava/util/ArrayList;
    //   235: invokevirtual size : ()I
    //   238: ifne -> 273
    //   241: iconst_4
    //   242: newarray byte
    //   244: astore_1
    //   245: aload_1
    //   246: iconst_0
    //   247: ldc_w 134695760
    //   250: invokestatic b : ([BII)V
    //   253: aload_0
    //   254: getfield c : Ljava/io/OutputStream;
    //   257: aload_1
    //   258: invokevirtual write : ([B)V
    //   261: aload_0
    //   262: aload_0
    //   263: getfield j : J
    //   266: ldc2_w 4
    //   269: ladd
    //   270: putfield j : J
    //   273: aload_0
    //   274: getfield c : Ljava/io/OutputStream;
    //   277: instanceof i/a/a/d/g
    //   280: ifeq -> 333
    //   283: aload_0
    //   284: getfield j : J
    //   287: ldc2_w 4
    //   290: lcmp
    //   291: ifne -> 309
    //   294: aload_0
    //   295: getfield e : Li/a/a/e/f;
    //   298: astore_1
    //   299: aload_1
    //   300: ldc2_w 4
    //   303: invokevirtual c : (J)V
    //   306: goto -> 365
    //   309: aload_0
    //   310: getfield e : Li/a/a/e/f;
    //   313: astore_1
    //   314: aload_0
    //   315: getfield c : Ljava/io/OutputStream;
    //   318: checkcast i/a/a/d/g
    //   321: invokevirtual b : ()J
    //   324: lstore_3
    //   325: aload_1
    //   326: lload_3
    //   327: invokevirtual c : (J)V
    //   330: goto -> 365
    //   333: aload_0
    //   334: getfield j : J
    //   337: ldc2_w 4
    //   340: lcmp
    //   341: ifne -> 352
    //   344: aload_0
    //   345: getfield e : Li/a/a/e/f;
    //   348: astore_1
    //   349: goto -> 299
    //   352: aload_0
    //   353: getfield e : Li/a/a/e/f;
    //   356: astore_1
    //   357: aload_0
    //   358: getfield j : J
    //   361: lstore_3
    //   362: goto -> 325
    //   365: new i/a/a/a/b
    //   368: dup
    //   369: invokespecial <init> : ()V
    //   372: astore_1
    //   373: aload_0
    //   374: aload_0
    //   375: getfield j : J
    //   378: aload_1
    //   379: aload_0
    //   380: getfield i : Li/a/a/e/l;
    //   383: aload_0
    //   384: getfield f : Li/a/a/e/g;
    //   387: aload_0
    //   388: getfield c : Ljava/io/OutputStream;
    //   391: invokevirtual a : (Li/a/a/e/l;Li/a/a/e/g;Ljava/io/OutputStream;)I
    //   394: i2l
    //   395: ladd
    //   396: putfield j : J
    //   399: aload_0
    //   400: getfield h : Li/a/a/e/m;
    //   403: invokevirtual l : ()Z
    //   406: ifeq -> 550
    //   409: aload_0
    //   410: invokespecial e : ()V
    //   413: aload_0
    //   414: getfield g : Li/a/a/b/d;
    //   417: ifnull -> 550
    //   420: aload_2
    //   421: invokevirtual f : ()I
    //   424: ifne -> 473
    //   427: aload_0
    //   428: getfield g : Li/a/a/b/d;
    //   431: checkcast i/a/a/b/g
    //   434: invokevirtual a : ()[B
    //   437: astore_1
    //   438: aload_0
    //   439: getfield c : Ljava/io/OutputStream;
    //   442: aload_1
    //   443: invokevirtual write : ([B)V
    //   446: aload_0
    //   447: aload_0
    //   448: getfield j : J
    //   451: aload_1
    //   452: arraylength
    //   453: i2l
    //   454: ladd
    //   455: putfield j : J
    //   458: aload_0
    //   459: aload_0
    //   460: getfield l : J
    //   463: aload_1
    //   464: arraylength
    //   465: i2l
    //   466: ladd
    //   467: putfield l : J
    //   470: goto -> 550
    //   473: aload_2
    //   474: invokevirtual f : ()I
    //   477: bipush #99
    //   479: if_icmpne -> 550
    //   482: aload_0
    //   483: getfield g : Li/a/a/b/d;
    //   486: checkcast i/a/a/b/b
    //   489: invokevirtual c : ()[B
    //   492: astore_1
    //   493: aload_0
    //   494: getfield g : Li/a/a/b/d;
    //   497: checkcast i/a/a/b/b
    //   500: invokevirtual a : ()[B
    //   503: astore_2
    //   504: aload_0
    //   505: getfield c : Ljava/io/OutputStream;
    //   508: aload_1
    //   509: invokevirtual write : ([B)V
    //   512: aload_0
    //   513: getfield c : Ljava/io/OutputStream;
    //   516: aload_2
    //   517: invokevirtual write : ([B)V
    //   520: aload_0
    //   521: aload_0
    //   522: getfield j : J
    //   525: aload_1
    //   526: arraylength
    //   527: aload_2
    //   528: arraylength
    //   529: iadd
    //   530: i2l
    //   531: ladd
    //   532: putfield j : J
    //   535: aload_0
    //   536: aload_0
    //   537: getfield l : J
    //   540: aload_1
    //   541: arraylength
    //   542: aload_2
    //   543: arraylength
    //   544: iadd
    //   545: i2l
    //   546: ladd
    //   547: putfield l : J
    //   550: aload_0
    //   551: getfield k : Ljava/util/zip/CRC32;
    //   554: invokevirtual reset : ()V
    //   557: return
    //   558: new i/a/a/c/a
    //   561: dup
    //   562: ldc_w 'file name is empty for external stream'
    //   565: invokespecial <init> : (Ljava/lang/String;)V
    //   568: athrow
    //   569: astore_1
    //   570: new i/a/a/c/a
    //   573: dup
    //   574: aload_1
    //   575: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   578: athrow
    //   579: astore_1
    //   580: aload_1
    //   581: athrow
    //   582: astore_1
    //   583: new i/a/a/c/a
    //   586: dup
    //   587: aload_1
    //   588: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   591: astore_1
    //   592: goto -> 597
    //   595: aload_1
    //   596: athrow
    //   597: goto -> 595
    // Exception table:
    //   from	to	target	type
    //   53	107	582	java/lang/CloneNotSupportedException
    //   53	107	579	i/a/a/c/a
    //   53	107	569	java/lang/Exception
    //   107	112	582	java/lang/CloneNotSupportedException
    //   107	112	579	i/a/a/c/a
    //   107	112	569	java/lang/Exception
    //   115	160	582	java/lang/CloneNotSupportedException
    //   115	160	579	i/a/a/c/a
    //   115	160	569	java/lang/Exception
    //   160	181	582	java/lang/CloneNotSupportedException
    //   160	181	579	i/a/a/c/a
    //   160	181	569	java/lang/Exception
    //   184	241	582	java/lang/CloneNotSupportedException
    //   184	241	579	i/a/a/c/a
    //   184	241	569	java/lang/Exception
    //   241	273	582	java/lang/CloneNotSupportedException
    //   241	273	579	i/a/a/c/a
    //   241	273	569	java/lang/Exception
    //   273	299	582	java/lang/CloneNotSupportedException
    //   273	299	579	i/a/a/c/a
    //   273	299	569	java/lang/Exception
    //   299	306	582	java/lang/CloneNotSupportedException
    //   299	306	579	i/a/a/c/a
    //   299	306	569	java/lang/Exception
    //   309	325	582	java/lang/CloneNotSupportedException
    //   309	325	579	i/a/a/c/a
    //   309	325	569	java/lang/Exception
    //   325	330	582	java/lang/CloneNotSupportedException
    //   325	330	579	i/a/a/c/a
    //   325	330	569	java/lang/Exception
    //   333	349	582	java/lang/CloneNotSupportedException
    //   333	349	579	i/a/a/c/a
    //   333	349	569	java/lang/Exception
    //   352	362	582	java/lang/CloneNotSupportedException
    //   352	362	579	i/a/a/c/a
    //   352	362	569	java/lang/Exception
    //   365	470	582	java/lang/CloneNotSupportedException
    //   365	470	579	i/a/a/c/a
    //   365	470	569	java/lang/Exception
    //   473	550	582	java/lang/CloneNotSupportedException
    //   473	550	579	i/a/a/c/a
    //   473	550	569	java/lang/Exception
    //   550	557	582	java/lang/CloneNotSupportedException
    //   550	557	579	i/a/a/c/a
    //   550	557	569	java/lang/Exception
    //   558	569	582	java/lang/CloneNotSupportedException
    //   558	569	579	i/a/a/c/a
    //   558	569	569	java/lang/Exception
  }
  
  public void b() {
    this.i.b().a(this.j);
    (new b()).a(this.i, this.c);
  }
  
  public void b(int paramInt) {
    if (paramInt <= 0)
      return; 
    long l1 = paramInt;
    long l2 = this.l;
    if (l1 <= l2)
      this.l = l2 - l1; 
  }
  
  protected void c(int paramInt) {
    if (paramInt > 0)
      this.o += paramInt; 
  }
  
  public void close() {
    OutputStream outputStream = this.c;
    if (outputStream != null)
      outputStream.close(); 
  }
  
  public void write(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (paramInt2 == 0)
      return; 
    int j = paramInt1;
    int i = paramInt2;
    if (this.h.l()) {
      j = paramInt1;
      i = paramInt2;
      if (this.h.f() == 99) {
        i = this.n;
        int k = paramInt1;
        int n = paramInt2;
        if (i != 0)
          if (paramInt2 >= 16 - i) {
            System.arraycopy(paramArrayOfbyte, paramInt1, this.m, i, 16 - i);
            byte[] arrayOfByte = this.m;
            a(arrayOfByte, 0, arrayOfByte.length);
            k = 16 - this.n;
            n = paramInt2 - k;
            this.n = 0;
          } else {
            System.arraycopy(paramArrayOfbyte, paramInt1, this.m, i, paramInt2);
            this.n += paramInt2;
            return;
          }  
        j = k;
        i = n;
        if (n != 0) {
          paramInt1 = n % 16;
          j = k;
          i = n;
          if (paramInt1 != 0) {
            System.arraycopy(paramArrayOfbyte, n + k - paramInt1, this.m, 0, paramInt1);
            this.n = paramInt1;
            i = n - this.n;
            j = k;
          } 
        } 
      } 
    } 
    if (i != 0)
      a(paramArrayOfbyte, j, i); 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/i/a/a/d/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */