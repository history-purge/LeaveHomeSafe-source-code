package net.time4j;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import net.time4j.c1.b;
import net.time4j.c1.c;
import net.time4j.c1.f;
import net.time4j.d1.a0;
import net.time4j.d1.b0;
import net.time4j.d1.d;
import net.time4j.d1.f0;
import net.time4j.d1.g;
import net.time4j.d1.h0;
import net.time4j.d1.i0;
import net.time4j.d1.j;
import net.time4j.d1.j0;
import net.time4j.d1.l0;
import net.time4j.d1.n0;
import net.time4j.d1.o;
import net.time4j.d1.p;
import net.time4j.d1.q;
import net.time4j.d1.r;
import net.time4j.d1.u;
import net.time4j.d1.v;
import net.time4j.d1.x;
import net.time4j.d1.y;
import net.time4j.d1.z;
import net.time4j.e1.a;
import net.time4j.e1.b;
import net.time4j.e1.c;
import net.time4j.e1.e;
import net.time4j.g1.b;
import net.time4j.g1.d;
import net.time4j.g1.f;
import net.time4j.g1.g;
import net.time4j.tz.g;
import net.time4j.tz.k;
import net.time4j.tz.l;
import net.time4j.tz.o;

@c("iso8601")
public final class a0 extends l0<TimeUnit, a0> implements g, h0<g> {
  private static final long e;
  
  private static final long f;
  
  private static final a0 g = new a0(e, 0, f.c);
  
  private static final a0 h = new a0(f, 999999999, f.c);
  
  private static final Map<TimeUnit, Double> i;
  
  private static final i0<TimeUnit, a0> j;
  
  public static final a0 k = new a0(0L, 0, f.c);
  
  public static final p<TimeUnit> l = i0.g;
  
  private static final long serialVersionUID = -3192884724477742274L;
  
  private final transient long c;
  
  private final transient int d;
  
  static {
    new f(null);
  }
  
  private a0(int paramInt, long paramLong) {
    a(paramLong);
    this.c = paramLong;
    this.d = paramInt;
  }
  
  private a0(long paramLong, int paramInt, f paramf) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload #4
    //   6: getstatic net/time4j/g1/f.c : Lnet/time4j/g1/f;
    //   9: if_acmpne -> 25
    //   12: aload_0
    //   13: lload_1
    //   14: putfield c : J
    //   17: aload_0
    //   18: iload_3
    //   19: putfield d : I
    //   22: goto -> 631
    //   25: invokestatic k : ()Lnet/time4j/g1/d;
    //   28: astore #14
    //   30: aload #14
    //   32: invokevirtual h : ()Z
    //   35: ifeq -> 685
    //   38: aload #4
    //   40: getstatic net/time4j/g1/f.d : Lnet/time4j/g1/f;
    //   43: if_acmpne -> 49
    //   46: goto -> 442
    //   49: aload #4
    //   51: getstatic net/time4j/g1/f.e : Lnet/time4j/g1/f;
    //   54: if_acmpne -> 183
    //   57: lload_1
    //   58: lconst_0
    //   59: lcmp
    //   60: iflt -> 145
    //   63: lload_1
    //   64: ldc2_w 441763200
    //   67: lcmp
    //   68: ifge -> 127
    //   71: lload_1
    //   72: ldc2_w -441763168
    //   75: invokestatic a : (JJ)J
    //   78: lstore #12
    //   80: iload_3
    //   81: ldc_w 184000000
    //   84: invokestatic c : (II)I
    //   87: istore #9
    //   89: iload #9
    //   91: istore_3
    //   92: lload #12
    //   94: lstore #10
    //   96: iload #9
    //   98: ldc 1000000000
    //   100: if_icmplt -> 119
    //   103: lload #12
    //   105: lconst_1
    //   106: invokestatic a : (JJ)J
    //   109: lstore #10
    //   111: iload #9
    //   113: ldc 1000000000
    //   115: invokestatic e : (II)I
    //   118: istore_3
    //   119: lload #10
    //   121: l2d
    //   122: dstore #5
    //   124: goto -> 341
    //   127: lload_1
    //   128: ldc2_w 441763210
    //   131: invokestatic c : (JJ)J
    //   134: lstore #12
    //   136: lload_1
    //   137: lstore #10
    //   139: lload #12
    //   141: lstore_1
    //   142: goto -> 518
    //   145: new java/lang/StringBuilder
    //   148: dup
    //   149: invokespecial <init> : ()V
    //   152: astore #4
    //   154: aload #4
    //   156: ldc_w 'TAI not supported before 1958-01-01: '
    //   159: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   162: pop
    //   163: aload #4
    //   165: lload_1
    //   166: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   169: pop
    //   170: new java/lang/IllegalArgumentException
    //   173: dup
    //   174: aload #4
    //   176: invokevirtual toString : ()Ljava/lang/String;
    //   179: invokespecial <init> : (Ljava/lang/String;)V
    //   182: athrow
    //   183: aload #4
    //   185: getstatic net/time4j/g1/f.f : Lnet/time4j/g1/f;
    //   188: if_acmpne -> 256
    //   191: lload_1
    //   192: ldc2_w 252892809
    //   195: invokestatic a : (JJ)J
    //   198: lstore #12
    //   200: lload #12
    //   202: ldc2_w 252892809
    //   205: lcmp
    //   206: iflt -> 218
    //   209: lload_1
    //   210: lstore #10
    //   212: lload #12
    //   214: lstore_1
    //   215: goto -> 518
    //   218: new java/lang/StringBuilder
    //   221: dup
    //   222: invokespecial <init> : ()V
    //   225: astore #4
    //   227: aload #4
    //   229: ldc_w 'GPS not supported before 1980-01-06: '
    //   232: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   235: pop
    //   236: aload #4
    //   238: lload_1
    //   239: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   242: pop
    //   243: new java/lang/IllegalArgumentException
    //   246: dup
    //   247: aload #4
    //   249: invokevirtual toString : ()Ljava/lang/String;
    //   252: invokespecial <init> : (Ljava/lang/String;)V
    //   255: athrow
    //   256: aload #4
    //   258: getstatic net/time4j/g1/f.g : Lnet/time4j/g1/f;
    //   261: if_acmpne -> 428
    //   264: lload_1
    //   265: ldc2_w 42
    //   268: lcmp
    //   269: iflt -> 337
    //   272: lload_1
    //   273: ldc2_w 42
    //   276: lcmp
    //   277: ifne -> 290
    //   280: iload_3
    //   281: ldc_w 184000000
    //   284: if_icmpge -> 290
    //   287: goto -> 337
    //   290: lload_1
    //   291: ldc2_w 42
    //   294: invokestatic c : (JJ)J
    //   297: lstore #10
    //   299: iload_3
    //   300: ldc_w 184000000
    //   303: invokestatic e : (II)I
    //   306: istore #9
    //   308: lload #10
    //   310: lstore_1
    //   311: iload #9
    //   313: istore_3
    //   314: iload #9
    //   316: ifge -> 442
    //   319: lload #10
    //   321: lconst_1
    //   322: invokestatic c : (JJ)J
    //   325: lstore_1
    //   326: iload #9
    //   328: ldc 1000000000
    //   330: invokestatic c : (II)I
    //   333: istore_3
    //   334: goto -> 442
    //   337: lload_1
    //   338: l2d
    //   339: dstore #5
    //   341: iload_3
    //   342: i2d
    //   343: dstore #7
    //   345: dload #7
    //   347: invokestatic isNaN : (D)Z
    //   350: pop
    //   351: dload #7
    //   353: ldc2_w 1.0E9
    //   356: ddiv
    //   357: dstore #7
    //   359: dload #5
    //   361: invokestatic isNaN : (D)Z
    //   364: pop
    //   365: dload #5
    //   367: dload #7
    //   369: dadd
    //   370: dstore #7
    //   372: dload #7
    //   374: ldc2_w 42.184
    //   377: dsub
    //   378: d2l
    //   379: ldc_w 86400
    //   382: invokestatic a : (JI)J
    //   385: getstatic net/time4j/d1/a0.c : Lnet/time4j/d1/a0;
    //   388: invokestatic a : (JLnet/time4j/d1/a0;)Lnet/time4j/f0;
    //   391: invokestatic a : (Lnet/time4j/c1/a;)D
    //   394: dstore #5
    //   396: dload #7
    //   398: dload #5
    //   400: dsub
    //   401: dstore #5
    //   403: dload #5
    //   405: invokestatic floor : (D)D
    //   408: d2l
    //   409: lstore #12
    //   411: dload #5
    //   413: lload #12
    //   415: invokestatic a : (DJ)I
    //   418: istore_3
    //   419: lload_1
    //   420: lstore #10
    //   422: lload #12
    //   424: lstore_1
    //   425: goto -> 518
    //   428: aload #4
    //   430: getstatic net/time4j/g1/f.h : Lnet/time4j/g1/f;
    //   433: if_acmpne -> 643
    //   436: lload_1
    //   437: lconst_0
    //   438: lcmp
    //   439: ifge -> 454
    //   442: lload_1
    //   443: lstore #12
    //   445: lload_1
    //   446: lstore #10
    //   448: lload #12
    //   450: lstore_1
    //   451: goto -> 518
    //   454: lload_1
    //   455: ldc_w 86400
    //   458: invokestatic a : (JI)J
    //   461: getstatic net/time4j/d1/a0.c : Lnet/time4j/d1/a0;
    //   464: invokestatic a : (JLnet/time4j/d1/a0;)Lnet/time4j/f0;
    //   467: astore #4
    //   469: lload_1
    //   470: l2d
    //   471: dstore #5
    //   473: iload_3
    //   474: i2d
    //   475: dstore #7
    //   477: dload #7
    //   479: invokestatic isNaN : (D)Z
    //   482: pop
    //   483: dload #7
    //   485: ldc2_w 1.0E9
    //   488: ddiv
    //   489: dstore #7
    //   491: dload #5
    //   493: invokestatic isNaN : (D)Z
    //   496: pop
    //   497: dload #5
    //   499: dload #7
    //   501: dadd
    //   502: aload #4
    //   504: invokestatic a : (Lnet/time4j/c1/a;)D
    //   507: dadd
    //   508: dstore #7
    //   510: ldc2_w 42.184
    //   513: dstore #5
    //   515: goto -> 396
    //   518: aload #14
    //   520: lload_1
    //   521: invokevirtual e : (J)J
    //   524: lstore #12
    //   526: lload_1
    //   527: aload #14
    //   529: lload #12
    //   531: invokevirtual a : (J)J
    //   534: lsub
    //   535: lstore_1
    //   536: aload_0
    //   537: lload #12
    //   539: putfield c : J
    //   542: lload_1
    //   543: lconst_0
    //   544: lcmp
    //   545: ifeq -> 626
    //   548: lload #12
    //   550: getstatic net/time4j/a0.f : J
    //   553: lcmp
    //   554: ifne -> 560
    //   557: goto -> 626
    //   560: lload_1
    //   561: lconst_1
    //   562: lcmp
    //   563: ifne -> 578
    //   566: aload_0
    //   567: ldc_w 1073741824
    //   570: iload_3
    //   571: ior
    //   572: putfield d : I
    //   575: goto -> 631
    //   578: new java/lang/StringBuilder
    //   581: dup
    //   582: invokespecial <init> : ()V
    //   585: astore #4
    //   587: aload #4
    //   589: ldc_w 'Cannot handle leap shift of '
    //   592: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   595: pop
    //   596: aload #4
    //   598: lload #10
    //   600: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   603: pop
    //   604: aload #4
    //   606: ldc_w '.'
    //   609: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   612: pop
    //   613: new java/lang/IllegalStateException
    //   616: dup
    //   617: aload #4
    //   619: invokevirtual toString : ()Ljava/lang/String;
    //   622: invokespecial <init> : (Ljava/lang/String;)V
    //   625: athrow
    //   626: aload_0
    //   627: iload_3
    //   628: putfield d : I
    //   631: aload_0
    //   632: getfield c : J
    //   635: invokestatic a : (J)V
    //   638: iload_3
    //   639: invokestatic f : (I)V
    //   642: return
    //   643: new java/lang/StringBuilder
    //   646: dup
    //   647: invokespecial <init> : ()V
    //   650: astore #14
    //   652: aload #14
    //   654: ldc_w 'Not yet implemented: '
    //   657: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   660: pop
    //   661: aload #14
    //   663: aload #4
    //   665: invokevirtual name : ()Ljava/lang/String;
    //   668: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   671: pop
    //   672: new java/lang/UnsupportedOperationException
    //   675: dup
    //   676: aload #14
    //   678: invokevirtual toString : ()Ljava/lang/String;
    //   681: invokespecial <init> : (Ljava/lang/String;)V
    //   684: athrow
    //   685: new java/lang/IllegalStateException
    //   688: dup
    //   689: ldc_w 'Leap seconds are not supported by configuration.'
    //   692: invokespecial <init> : (Ljava/lang/String;)V
    //   695: astore #4
    //   697: goto -> 703
    //   700: aload #4
    //   702: athrow
    //   703: goto -> 700
  }
  
  private long A() {
    if (d.k().h()) {
      long l2 = d.k().a(this.c);
      long l1 = l2;
      if (C())
        l1 = l2 + 1L; 
      return l1;
    } 
    return this.c - 63072000L;
  }
  
  private double B() {
    f0 f0 = z();
    double d1 = A();
    Double.isNaN(d1);
    double d2 = a();
    Double.isNaN(d2);
    d1 = d1 + 42.184D + d2 / 1.0E9D - f.a(f0);
    long l = (long)Math.floor(d1);
    d2 = l;
    Double.isNaN(d2);
    return (Double.compare(1.0E9D - (d1 - d2) * 1.0E9D, 1.0D) < 0) ? (l + 1L) : d1;
  }
  
  private boolean C() {
    return (this.d >>> 30 != 0);
  }
  
  private static int a(double paramDouble, long paramLong) {
    try {
      long l = c.b(paramLong, 1000000000L);
      double d = l;
      Double.isNaN(d);
      return (int)(paramDouble * 1.0E9D - d);
    } catch (ArithmeticException arithmeticException) {
      double d = paramLong;
      Double.isNaN(d);
      return (int)((paramDouble - d) * 1.0E9D);
    } 
  }
  
  private String a(boolean paramBoolean) {
    f0 f0 = z();
    int k = f(this);
    int j = k / 60;
    int i = j / 60;
    j %= 60;
    k = k % 60 + d.k().c(A());
    int m = a();
    StringBuilder stringBuilder = new StringBuilder(50);
    stringBuilder.append(f0);
    stringBuilder.append('T');
    a(i, 2, stringBuilder);
    if (paramBoolean || (j | k | m) != 0) {
      stringBuilder.append(':');
      a(j, 2, stringBuilder);
      if (paramBoolean || (k | m) != 0) {
        stringBuilder.append(':');
        a(k, 2, stringBuilder);
        if (m > 0) {
          stringBuilder.append(',');
          a(m, 9, stringBuilder);
        } 
      } 
    } 
    stringBuilder.append('Z');
    return stringBuilder.toString();
  }
  
  public static a0 a(long paramLong, int paramInt, f paramf) {
    return (paramLong == 0L && paramInt == 0 && paramf == f.c) ? k : new a0(paramLong, paramInt, paramf);
  }
  
  public static a0 a(long paramLong, f paramf) {
    return a(paramLong, 0, paramf);
  }
  
  static a0 a(DataInput paramDataInput, boolean paramBoolean1, boolean paramBoolean2) {
    int i;
    long l = paramDataInput.readLong();
    if (paramBoolean2) {
      i = paramDataInput.readInt();
    } else {
      i = 0;
    } 
    if (l == 0L)
      if (!paramBoolean1) {
        if (!i)
          return k; 
      } else {
        throw new InvalidObjectException("UTC epoch is no leap second.");
      }  
    if (l == e && !i) {
      if (!paramBoolean1)
        return g; 
      throw new InvalidObjectException("Minimum is no leap second.");
    } 
    if (l == f && i == 999999999) {
      if (!paramBoolean1)
        return h; 
      throw new InvalidObjectException("Maximum is no leap second.");
    } 
    f(i);
    int j = i;
    if (paramBoolean1) {
      String str1;
      d d = d.k();
      if (!d.h() || d.d(d.a(l) + 1L)) {
        j = i | 0x40000000;
        return new a0(j, l);
      } 
      l = b.d(l);
      i = b.b(l);
      j = b.a(l);
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Not registered as leap second event: ");
      stringBuilder.append(b.c(l));
      stringBuilder.append("-");
      String str2 = "0";
      if (i < 10) {
        str1 = "0";
      } else {
        str1 = "";
      } 
      stringBuilder.append(str1);
      stringBuilder.append(i);
      if (j < 10) {
        str1 = str2;
      } else {
        str1 = "";
      } 
      stringBuilder.append(str1);
      stringBuilder.append(j);
      stringBuilder.append(" [Please check leap second configurations ");
      stringBuilder.append("either of emitter vm or this target vm]");
      throw new InvalidObjectException(stringBuilder.toString());
    } 
    return new a0(j, l);
  }
  
  public static a0 a(f paramf) {
    g g1;
    if (paramf instanceof a0)
      return a0.class.cast(paramf); 
    if (paramf instanceof g && d.k().h()) {
      g1 = g.class.cast(paramf);
      return a(g1.a(f.d), g1.b(f.d), f.d);
    } 
    return a(g1.b(), g1.a(), f.c);
  }
  
  private h0 a(l paraml) {
    return h0.a((f)this, paraml.b((f)this));
  }
  
  private static void a(int paramInt1, int paramInt2, StringBuilder paramStringBuilder) {
    int k;
    int j = 0;
    int i = 1;
    while (true) {
      k = i;
      if (j < paramInt2 - 1) {
        i *= 10;
        j++;
        continue;
      } 
      break;
    } 
    while (paramInt1 < k && k >= 10) {
      paramStringBuilder.append('0');
      k /= 10;
    } 
    paramStringBuilder.append(String.valueOf(paramInt1));
  }
  
  private static void a(long paramLong) {
    if (paramLong <= f && paramLong >= e)
      return; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("UNIX time (UT) out of supported range: ");
    stringBuilder.append(paramLong);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  static void a(long paramLong, h0 paramh0) {
    d d = d.k();
    if (d.i()) {
      if (d.e(d.a(paramLong)) <= paramLong)
        return; 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Illegal local timestamp due to negative leap second: ");
      stringBuilder.append(paramh0);
      throw new r(stringBuilder.toString());
    } 
  }
  
  private a0 c(f paramf) {
    if (paramf == f.d)
      return this; 
    if (!v()) {
      int i = a.a[paramf.ordinal()];
      if (i != 1) {
        if (i != 3) {
          if (i != 4) {
            if (i == 5 || i == 6)
              return new a0(c.c(this.c, 63072000L), a(), paramf); 
            throw new UnsupportedOperationException(paramf.name());
          } 
          return new a0(c.c(this.c, 315964800L), a(), paramf);
        } 
        return new a0(c.c(this.c, -378691200L), a(), paramf);
      } 
      return this;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Leap seconds do not exist on continuous time scale: ");
    stringBuilder.append(paramf);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  private a0 d(f paramf) {
    switch (a.a[paramf.ordinal()]) {
      default:
        throw new UnsupportedOperationException(paramf.name());
      case 5:
      case 6:
        return new a0(b(paramf), c.a(a(paramf), 63072000L));
      case 4:
        return new a0(a(), c.a(a(f.f), 315964800L));
      case 3:
        return new a0(b(paramf), c.a(a(paramf), -378691200L));
      case 2:
        return this;
      case 1:
        break;
    } 
    return v() ? new a0(a(), this.c) : this;
  }
  
  static void e(a0 parama0) {
    if (parama0.c >= 63072000L)
      return; 
    throw new UnsupportedOperationException("Cannot calculate SI-duration before 1972-01-01.");
  }
  
  private static int f(a0 parama0) {
    return c.b(parama0.c, 86400);
  }
  
  private static void f(int paramInt) {
    if (paramInt < 1000000000 && paramInt >= 0)
      return; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Nanosecond out of range: ");
    stringBuilder.append(paramInt);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) {
    throw new InvalidObjectException("Serialization proxy required.");
  }
  
  private Object writeReplace() {
    return new SPX(this, 4);
  }
  
  public static i0<TimeUnit, a0> y() {
    return j;
  }
  
  private f0 z() {
    return f0.a(c.a(this.c, 86400), a0.d);
  }
  
  public int a() {
    return this.d & 0xBFFFFFFF;
  }
  
  public int a(a0 parama0) {
    long l1 = A();
    long l2 = parama0.A();
    if (l1 < l2)
      return -1; 
    if (l1 > l2)
      return 1; 
    int i = a() - parama0.a();
    return (i > 0) ? 1 : ((i < 0) ? -1 : 0);
  }
  
  public long a(f paramf) {
    StringBuilder stringBuilder1;
    long l1;
    long l2;
    StringBuilder stringBuilder2;
    switch (a.a[paramf.ordinal()]) {
      default:
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Not yet implemented: ");
        stringBuilder2.append(paramf);
        throw new UnsupportedOperationException(stringBuilder2.toString());
      case 6:
        l1 = this.c;
        return (l1 < 63072000L) ? (l1 - 63072000L) : (long)Math.floor(B());
      case 5:
        if (this.c < 63072000L) {
          double d1 = f.a(z());
          double d2 = (this.c - 63072000L);
          Double.isNaN(d2);
          double d3 = a();
          Double.isNaN(d3);
          d1 = d1 + d2 + d3 / 1.0E9D;
          long l = (long)Math.floor(d1);
          d2 = l;
          Double.isNaN(d2);
          l1 = l;
          if (Double.compare(1.0E9D - (d1 - d2) * 1.0E9D, 1.0D) < 0)
            l1 = l + 1L; 
          return l1;
        } 
        l2 = A() + 42L;
        l1 = l2;
        if (a() + 184000000 >= 1000000000)
          l1 = l2 + 1L; 
        return l1;
      case 4:
        l1 = A();
        if (d.k().e(l1) >= 315964800L) {
          if (!d.k().h())
            l1 += 9L; 
          return l1 - 252892809L;
        } 
        stringBuilder1 = new StringBuilder();
        stringBuilder1.append("GPS not supported before 1980-01-06: ");
        stringBuilder1.append(this);
        throw new IllegalArgumentException(stringBuilder1.toString());
      case 3:
        if (A() < 0L) {
          int i;
          double d1 = f.a(z());
          double d2 = (this.c - 63072000L);
          Double.isNaN(d2);
          double d3 = a();
          Double.isNaN(d3);
          d1 = d1 + d2 + d3 / 1.0E9D;
          l1 = (long)Math.floor(d1);
          d2 = l1;
          Double.isNaN(d2);
          if (Double.compare(1.0E9D - (d1 - d2) * 1.0E9D, 1.0D) < 0) {
            l1++;
            i = 0;
          } else {
            i = a(d1, l1);
          } 
          l2 = l1 - 32L + 441763200L;
          l1 = l2;
          if (i - 184000000 < 0)
            l1 = l2 - 1L; 
        } else {
          l1 = A() + 441763200L + 10L;
        } 
        if (l1 >= 0L)
          return l1; 
        stringBuilder1 = new StringBuilder();
        stringBuilder1.append("TAI not supported before 1958-01-01: ");
        stringBuilder1.append(this);
        throw new IllegalArgumentException(stringBuilder1.toString());
      case 2:
        return A();
      case 1:
        break;
    } 
    return this.c;
  }
  
  public a0 a(long paramLong, m0 paramm0) {
    e(this);
    if (paramLong == 0L)
      return this; 
    try {
      a0 a01;
      int i = a.b[paramm0.ordinal()];
      if (i != 1) {
        if (i == 2) {
          long l = c.a(a(), paramLong);
          i = c.b(l, 1000000000);
          l = c.a(l, 1000000000);
          if (d.k().h()) {
            a01 = new a0(c.a(A(), l), i, f.d);
          } else {
            a01 = a(c.a(this.c, l), i, f.c);
          } 
        } else {
          throw new UnsupportedOperationException();
        } 
      } else if (d.k().h()) {
        a01 = new a0(c.a(A(), paramLong), a(), f.d);
      } else {
        a01 = a(c.a(this.c, paramLong), a(), f.c);
      } 
      if (paramLong < 0L)
        e(a01); 
      return a01;
    } catch (IllegalArgumentException illegalArgumentException) {
      ArithmeticException arithmeticException = new ArithmeticException("Result beyond boundaries of time axis.");
      arithmeticException.initCause(illegalArgumentException);
      throw arithmeticException;
    } 
  }
  
  public a1 a(k paramk) {
    return a1.a(this, l.a(paramk));
  }
  
  public <C extends net.time4j.d1.l<C>> r<C> a(j<C> paramj, String paramString, k paramk, f0 paramf0) {
    h0 h01 = b(paramk);
    g0 g0 = h01.x();
    return r.a((C)((h0)h01.a(paramf0.a((g)h01.w(), paramk), g.e)).w().a(paramj.e(), paramString), g0);
  }
  
  public <C extends net.time4j.d1.m<?, C>> r<C> a(x<C> paramx, k paramk, f0 paramf0) {
    h0 h01 = b(paramk);
    g0 g0 = h01.x();
    return r.a((C)((h0)h01.a(paramf0.a((g)h01.w(), paramk), g.e)).w().a(paramx.e()), g0);
  }
  
  void a(DataOutput paramDataOutput) {
    byte b;
    if (C()) {
      b = 65;
    } else {
      b = 64;
    } 
    int j = a();
    int i = b;
    if (j > 0)
      i = b | 0x2; 
    paramDataOutput.writeByte(i);
    paramDataOutput.writeLong(this.c);
    if (j > 0)
      paramDataOutput.writeInt(j); 
  }
  
  public boolean a(g paramg) {
    return (a(a((f)paramg)) < 0);
  }
  
  public int b(f paramf) {
    StringBuilder stringBuilder1;
    double d;
    int i;
    int j;
    long l;
    StringBuilder stringBuilder2;
    switch (a.a[paramf.ordinal()]) {
      default:
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Not yet implemented: ");
        stringBuilder2.append(paramf);
        throw new UnsupportedOperationException(stringBuilder2.toString());
      case 6:
        if (this.c < 63072000L)
          return a(); 
        d = B();
        return a(d, (long)Math.floor(d));
      case 5:
        if (this.c < 63072000L) {
          d = f.a(z());
          double d1 = (this.c - 63072000L);
          Double.isNaN(d1);
          double d2 = a();
          Double.isNaN(d2);
          d = d + d1 + d2 / 1.0E9D;
          long l1 = (long)Math.floor(d);
          d1 = l1;
          Double.isNaN(d1);
          return (Double.compare(1.0E9D - (d - d1) * 1.0E9D, 1.0D) < 0) ? 0 : a(d, l1);
        } 
        j = a() + 184000000;
        i = j;
        if (j >= 1000000000)
          i = j - 1000000000; 
        return i;
      case 4:
        l = A();
        if (d.k().e(l) >= 315964800L)
          return a(); 
        stringBuilder1 = new StringBuilder();
        stringBuilder1.append("GPS not supported before 1980-01-06: ");
        stringBuilder1.append(this);
        throw new IllegalArgumentException(stringBuilder1.toString());
      case 3:
        if (A() < 0L) {
          d = f.a(z());
          double d1 = (this.c - 63072000L);
          Double.isNaN(d1);
          double d2 = a();
          Double.isNaN(d2);
          d = d + d1 + d2 / 1.0E9D;
          l = (long)Math.floor(d);
          d1 = l;
          Double.isNaN(d1);
          if (Double.compare(1.0E9D - (d - d1) * 1.0E9D, 1.0D) < 0) {
            l++;
            i = 0;
          } else {
            i = a(d, l);
          } 
          long l1 = l - 32L + 441763200L;
          j = i - 184000000;
          i = j;
          l = l1;
          if (j < 0) {
            l = l1 - 1L;
            i = j + 1000000000;
          } 
        } else {
          l = A() + 441763200L;
          i = a();
        } 
        if (l >= 0L)
          return i; 
        stringBuilder1 = new StringBuilder();
        stringBuilder1.append("TAI not supported before 1958-01-01: ");
        stringBuilder1.append(this);
        throw new IllegalArgumentException(stringBuilder1.toString());
      case 1:
      case 2:
        break;
    } 
    return a();
  }
  
  public long b() {
    return this.c;
  }
  
  public h0 b(k paramk) {
    return a(l.a(paramk));
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof a0) {
      paramObject = paramObject;
      return (this.c != ((a0)paramObject).c) ? false : (d.k().h() ? ((this.d == ((a0)paramObject).d)) : ((a() == paramObject.a())));
    } 
    return false;
  }
  
  public int hashCode() {
    long l = this.c;
    return (int)(l ^ l >>> 32L) * 19 + a() * 37;
  }
  
  protected i0<TimeUnit, a0> s() {
    return j;
  }
  
  protected a0 t() {
    return this;
  }
  
  public String toString() {
    return a(true);
  }
  
  public boolean v() {
    return (C() && d.k().h());
  }
  
  static {
    Integer integer1 = Integer.valueOf(1);
    long l1 = b.d(-999999999, 1, 1);
    long l2 = b.d(999999999, 12, 31);
    e = a0.d.a(l1, a0.e) * 86400L;
    f = a0.d.a(l2, a0.e) * 86400L + 86399L;
  }
  
  static {
    new a0(63158400L, 0, f.c);
    HashSet<j0<Integer, g0>> hashSet = new HashSet();
    hashSet.add(g0.x);
    hashSet.add(g0.w);
    hashSet.add(g0.v);
    hashSet.add(g0.u);
    hashSet.add(g0.t);
    hashSet.add(g0.s);
    hashSet.add(g0.y);
    hashSet.add(g0.z);
    Collections.unmodifiableSet(hashSet);
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    hashMap.put(g0.A, integer1);
    hashMap.put(g0.B, integer1);
    j0<Integer, g0> j0 = g0.C;
    Integer integer2 = Integer.valueOf(1000);
    hashMap.put(j0, integer2);
    hashMap.put(g0.F, integer2);
    j0 = g0.D;
    integer2 = Integer.valueOf(1000000);
    hashMap.put(j0, integer2);
    hashMap.put(g0.G, integer2);
    j0 = g0.E;
    integer2 = Integer.valueOf(1000000000);
    hashMap.put(j0, integer2);
    hashMap.put(g0.H, integer2);
    Collections.unmodifiableMap(hashMap);
    EnumMap<TimeUnit, Object> enumMap = new EnumMap<TimeUnit, Object>(TimeUnit.class);
    enumMap.put(TimeUnit.DAYS, Double.valueOf(86400.0D));
    enumMap.put(TimeUnit.HOURS, Double.valueOf(3600.0D));
    enumMap.put(TimeUnit.MINUTES, Double.valueOf(60.0D));
    enumMap.put(TimeUnit.SECONDS, Double.valueOf(1.0D));
    enumMap.put(TimeUnit.MILLISECONDS, Double.valueOf(0.001D));
    enumMap.put(TimeUnit.MICROSECONDS, Double.valueOf(1.0E-6D));
    enumMap.put(TimeUnit.NANOSECONDS, Double.valueOf(1.0E-9D));
    i = Collections.unmodifiableMap(enumMap);
    i0.b b = i0.b.a(TimeUnit.class, a0.class, new e(null), g, h);
    for (TimeUnit timeUnit : TimeUnit.values())
      b.a(timeUnit, new h(timeUnit), ((Double)i.get(timeUnit)).doubleValue(), i.keySet()); 
    d d2 = d.c;
    b.a(d2, d2, TimeUnit.SECONDS);
    c c2 = c.c;
    b.a(c2, c2, TimeUnit.NANOSECONDS);
    b.a(i0.g, new g(null));
    b.a(new b(null));
    j = b.a();
  }
  
  static {
    d d1 = d.c;
    c c1 = c.c;
  }
  
  private static class b implements j0<a0> {
    private b() {}
    
    public int a(a0 param1a01, a0 param1a02) {
      return param1a01.a(param1a02);
    }
  }
  
  private enum c implements p<Integer>, z<a0, Integer> {
    c;
    
    public char a() {
      return Character.MIN_VALUE;
    }
    
    public int a(o param1o1, o param1o2) {
      return ((Integer)param1o1.e(this)).compareTo((Integer)param1o2.e(this));
    }
    
    public a0 a(a0 param1a0, Integer param1Integer, boolean param1Boolean) {
      if (param1Integer != null) {
        if (d.k().h()) {
          long l1 = param1a0.a(f.d);
          int j = param1Integer.intValue();
          f = f.d;
          return a0.a(l1, j, f);
        } 
        long l = f.b();
        int i = param1Integer.intValue();
        f f = f.c;
        return a0.a(l, i, f);
      } 
      IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Missing fraction value.");
      throw illegalArgumentException;
    }
    
    public p<?> a(a0 param1a0) {
      return null;
    }
    
    public boolean a(a0 param1a0, Integer param1Integer) {
      boolean bool2 = false;
      if (param1Integer == null)
        return false; 
      int i = param1Integer.intValue();
      boolean bool1 = bool2;
      if (i >= 0) {
        bool1 = bool2;
        if (i < 1000000000)
          bool1 = true; 
      } 
      return bool1;
    }
    
    public Integer b() {
      return Integer.valueOf(999999999);
    }
    
    public p<?> b(a0 param1a0) {
      return null;
    }
    
    public Integer c(a0 param1a0) {
      return b();
    }
    
    public boolean c() {
      return false;
    }
    
    public Integer d(a0 param1a0) {
      return q();
    }
    
    public boolean d() {
      return false;
    }
    
    public Integer e(a0 param1a0) {
      return Integer.valueOf(param1a0.a());
    }
    
    public Class<Integer> getType() {
      return Integer.class;
    }
    
    public Integer q() {
      return Integer.valueOf(0);
    }
    
    public boolean s() {
      return false;
    }
  }
  
  private enum d implements p<Long>, z<a0, Long> {
    c;
    
    public char a() {
      return Character.MIN_VALUE;
    }
    
    public int a(o param1o1, o param1o2) {
      return ((Long)param1o1.e(this)).compareTo((Long)param1o2.e(this));
    }
    
    public a0 a(a0 param1a0, Long param1Long, boolean param1Boolean) {
      if (param1Long != null)
        return a0.a(param1Long.longValue(), param1a0.a(), f.c); 
      throw new IllegalArgumentException("Missing elapsed seconds.");
    }
    
    public p<?> a(a0 param1a0) {
      return a0.c.c;
    }
    
    public boolean a(a0 param1a0, Long param1Long) {
      boolean bool2 = false;
      if (param1Long == null)
        return false; 
      long l = param1Long.longValue();
      boolean bool1 = bool2;
      if (l >= a0.w()) {
        bool1 = bool2;
        if (l <= a0.x())
          bool1 = true; 
      } 
      return bool1;
    }
    
    public Long b() {
      return Long.valueOf(a0.x());
    }
    
    public p<?> b(a0 param1a0) {
      return a0.c.c;
    }
    
    public Long c(a0 param1a0) {
      return Long.valueOf(a0.x());
    }
    
    public boolean c() {
      return false;
    }
    
    public Long d(a0 param1a0) {
      return Long.valueOf(a0.w());
    }
    
    public boolean d() {
      return false;
    }
    
    public Long e(a0 param1a0) {
      return Long.valueOf(param1a0.b());
    }
    
    public Class<Long> getType() {
      return Long.class;
    }
    
    public Long q() {
      return Long.valueOf(a0.w());
    }
    
    public boolean s() {
      return false;
    }
  }
  
  private static class e implements u<a0> {
    private e() {}
    
    public String a(y param1y, Locale param1Locale) {
      e e1 = e.f(param1y.a());
      return b.a(e1, e1, param1Locale);
    }
    
    public a0 a(q<?> param1q, d param1d, boolean param1Boolean1, boolean param1Boolean2) {
      a0 a0;
      Object object;
      f f = (f)param1d.a(a.w, f.d);
      if (param1q instanceof f) {
        a0 = a0.a(f.class.cast(param1q));
        return a0.a(a0, f);
      } 
      boolean bool1 = a0.c(a0.d.c);
      boolean bool = false;
      int i = 0;
      if (bool1) {
        long l = ((Long)a0.e(a0.d.c)).longValue();
        if (a0.c(a0.c.c))
          i = ((Integer)a0.e(a0.c.c)).intValue(); 
        a0 = a0.a(l, i, f.c);
        return a0.a(a0, f);
      } 
      i = bool;
      if (a0.c((p)b0.c)) {
        i = 1;
        a0.a(g0.A, 60);
      } 
      p p = h0.B().h();
      if (a0.c(p)) {
        object = a0.e(p);
      } else {
        object = h0.B().a((q)a0, param1d, param1Boolean1, param1Boolean2);
      } 
      h0 h0 = (h0)object;
      if (h0 == null)
        return null; 
      if (a0.d()) {
        object = a0.c();
      } else if (param1d.b(a.d)) {
        object = param1d.a(a.d);
      } else {
        object = null;
      } 
      if (object != null) {
        o o;
        if (a0.c((p)b0.d)) {
          g g;
          param1Boolean2 = ((Boolean)a0.e((p)b0.d)).booleanValue();
          o = (o)param1d.a(a.e, l.e);
          if (param1Boolean2) {
            g = g.c;
          } else {
            g = g.d;
          } 
          o o1 = o.a(g);
        } else if (o.b(a.e)) {
          o o1 = (o)o.a(a.e);
        } else {
          a0 = h0.a((k)object);
          if (a0 == null)
            return null; 
        } 
        a0 = h0.a(l.a((k)object).a((o)a0));
      } else {
        a0 = null;
      } 
      if (a0 == null)
        return null; 
    }
    
    public f0 a() {
      return f0.a;
    }
    
    public o a(a0 param1a0, d param1d) {
      if (param1d.b(a.d)) {
        k k = (k)param1d.a(a.d);
        return a0.b(param1a0, (f)param1d.a(a.w, f.d)).a(k);
      } 
      throw new IllegalArgumentException("Cannot print moment without timezone.");
    }
    
    public x<?> b() {
      return (x<?>)h0.B();
    }
    
    public int c() {
      return f0.I().c();
    }
  }
  
  private static class f implements v<a0> {
    private f() {}
    
    public a0 a(a0 param1a0) {
      d d = d.k();
      if (d.h()) {
        b b = d.b(param1a0.a(f.d));
        if (b != null)
          return f0.a(b.d()).a(23, 59, 59).v().a(b.b(), m0.c); 
      } 
      return null;
    }
  }
  
  private static class g implements z<a0, TimeUnit> {
    private g() {}
    
    public a0 a(a0 param1a0, TimeUnit param1TimeUnit, boolean param1Boolean) {
      // Byte code:
      //   0: aload_2
      //   1: ifnull -> 215
      //   4: getstatic net/time4j/a0$a.c : [I
      //   7: aload_2
      //   8: invokevirtual ordinal : ()I
      //   11: iaload
      //   12: tableswitch default -> 56, 1 -> 195, 2 -> 174, 3 -> 154, 4 -> 115, 5 -> 87, 6 -> 70, 7 -> 68
      //   56: new java/lang/UnsupportedOperationException
      //   59: dup
      //   60: aload_2
      //   61: invokevirtual name : ()Ljava/lang/String;
      //   64: invokespecial <init> : (Ljava/lang/String;)V
      //   67: athrow
      //   68: aload_1
      //   69: areturn
      //   70: aload_1
      //   71: invokevirtual a : ()I
      //   74: sipush #1000
      //   77: idiv
      //   78: sipush #1000
      //   81: imul
      //   82: istore #4
      //   84: goto -> 99
      //   87: aload_1
      //   88: invokevirtual a : ()I
      //   91: ldc 1000000
      //   93: idiv
      //   94: ldc 1000000
      //   96: imul
      //   97: istore #4
      //   99: aload_1
      //   100: invokestatic d : (Lnet/time4j/a0;)J
      //   103: iload #4
      //   105: getstatic net/time4j/g1/f.c : Lnet/time4j/g1/f;
      //   108: invokestatic a : (JILnet/time4j/g1/f;)Lnet/time4j/a0;
      //   111: astore_2
      //   112: goto -> 127
      //   115: aload_1
      //   116: invokestatic d : (Lnet/time4j/a0;)J
      //   119: iconst_0
      //   120: getstatic net/time4j/g1/f.c : Lnet/time4j/g1/f;
      //   123: invokestatic a : (JILnet/time4j/g1/f;)Lnet/time4j/a0;
      //   126: astore_2
      //   127: aload_1
      //   128: invokevirtual v : ()Z
      //   131: ifeq -> 152
      //   134: invokestatic k : ()Lnet/time4j/g1/d;
      //   137: invokevirtual h : ()Z
      //   140: ifeq -> 152
      //   143: aload_2
      //   144: lconst_1
      //   145: getstatic net/time4j/m0.c : Lnet/time4j/m0;
      //   148: invokevirtual a : (JLnet/time4j/m0;)Lnet/time4j/a0;
      //   151: areturn
      //   152: aload_2
      //   153: areturn
      //   154: aload_1
      //   155: invokestatic d : (Lnet/time4j/a0;)J
      //   158: bipush #60
      //   160: invokestatic a : (JI)J
      //   163: ldc2_w 60
      //   166: lmul
      //   167: getstatic net/time4j/g1/f.c : Lnet/time4j/g1/f;
      //   170: invokestatic a : (JLnet/time4j/g1/f;)Lnet/time4j/a0;
      //   173: areturn
      //   174: aload_1
      //   175: invokestatic d : (Lnet/time4j/a0;)J
      //   178: sipush #3600
      //   181: invokestatic a : (JI)J
      //   184: ldc2_w 3600
      //   187: lmul
      //   188: getstatic net/time4j/g1/f.c : Lnet/time4j/g1/f;
      //   191: invokestatic a : (JLnet/time4j/g1/f;)Lnet/time4j/a0;
      //   194: areturn
      //   195: aload_1
      //   196: invokestatic d : (Lnet/time4j/a0;)J
      //   199: ldc 86400
      //   201: invokestatic a : (JI)J
      //   204: ldc2_w 86400
      //   207: lmul
      //   208: getstatic net/time4j/g1/f.c : Lnet/time4j/g1/f;
      //   211: invokestatic a : (JLnet/time4j/g1/f;)Lnet/time4j/a0;
      //   214: areturn
      //   215: new java/lang/IllegalArgumentException
      //   218: dup
      //   219: ldc 'Missing precision.'
      //   221: invokespecial <init> : (Ljava/lang/String;)V
      //   224: athrow
    }
    
    public p<?> a(a0 param1a0) {
      return null;
    }
    
    public boolean a(a0 param1a0, TimeUnit param1TimeUnit) {
      return (param1TimeUnit != null);
    }
    
    public p<?> b(a0 param1a0) {
      return null;
    }
    
    public TimeUnit c(a0 param1a0) {
      return TimeUnit.NANOSECONDS;
    }
    
    public TimeUnit d(a0 param1a0) {
      return TimeUnit.DAYS;
    }
    
    public TimeUnit e(a0 param1a0) {
      int i = param1a0.a();
      if (i != 0)
        return (i % 1000000 == 0) ? TimeUnit.MILLISECONDS : ((i % 1000 == 0) ? TimeUnit.MICROSECONDS : TimeUnit.NANOSECONDS); 
      long l = a0.d(param1a0);
      return (c.b(l, 86400) == 0) ? TimeUnit.DAYS : ((c.b(l, 3600) == 0) ? TimeUnit.HOURS : ((c.b(l, 60) == 0) ? TimeUnit.MINUTES : TimeUnit.SECONDS));
    }
  }
  
  private static class h implements n0<a0> {
    private final TimeUnit a;
    
    h(TimeUnit param1TimeUnit) {
      this.a = param1TimeUnit;
    }
    
    public long a(a0 param1a01, a0 param1a02) {
      long l1;
      if (this.a.compareTo(TimeUnit.SECONDS) >= 0) {
        long l = param1a02.b() - param1a01.b();
        if (l < 0L) {
          l1 = l;
          if (param1a02.a() > param1a01.a())
            l1 = l + 1L; 
        } else {
          l1 = l;
          if (l > 0L) {
            l1 = l;
            if (param1a02.a() < param1a01.a())
              l1 = l - 1L; 
          } 
        } 
      } else {
        l1 = c.a(c.b(c.c(param1a02.b(), param1a01.b()), 1000000000L), (param1a02.a() - param1a01.a()));
      } 
      long l2 = l1;
      switch (a0.a.c[this.a.ordinal()]) {
        default:
          throw new UnsupportedOperationException(this.a.name());
        case 6:
          l2 = 1000L;
          l2 = l1 / l2;
          break;
        case 5:
          l2 = 1000000L;
          l2 = l1 / l2;
          break;
        case 3:
          l2 = 60L;
          l2 = l1 / l2;
          break;
        case 2:
          l2 = 3600L;
          l2 = l1 / l2;
          break;
        case 1:
          l2 = 86400L;
          l2 = l1 / l2;
          break;
        case 4:
        case 7:
          break;
      } 
      return l2;
    }
    
    public a0 a(a0 param1a0, long param1Long) {
      if (this.a.compareTo(TimeUnit.SECONDS) >= 0) {
        param1Long = c.b(param1Long, this.a.toSeconds(1L));
        return a0.a(c.a(param1a0.b(), param1Long), param1a0.a(), f.c);
      } 
      param1Long = c.b(param1Long, this.a.toNanos(1L));
      param1Long = c.a(param1a0.a(), param1Long);
      int i = c.b(param1Long, 1000000000);
      param1Long = c.a(param1Long, 1000000000);
      return a0.a(c.a(param1a0.b(), param1Long), i, f.c);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/a0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */