package net.time4j;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import net.time4j.d1.a;
import net.time4j.d1.b;
import net.time4j.d1.k0;
import net.time4j.d1.m0;
import net.time4j.d1.w;
import net.time4j.e1.x;

public final class n<U extends w> extends a<U> implements Serializable {
  private static final char e;
  
  private static final n f = new n();
  
  private static final Comparator<m0.a<? extends w>> g = n0.e();
  
  private static final long serialVersionUID = -6321211763598951499L;
  
  private final transient List<m0.a<U>> c;
  
  private final transient boolean d;
  
  static {
    n0.h();
    n0.f();
    n0.g();
    a(new f[] { f.f, f.h, f.j });
    a(new g[] { g.c, g.d, g.e, g.h });
    a(new u[] { f.d(), f.i, f.j });
  }
  
  private n() {
    this.c = Collections.emptyList();
    this.d = false;
  }
  
  n(List<m0.a<U>> paramList, boolean paramBoolean) {
    boolean bool = paramList.isEmpty();
    if (bool) {
      paramList = Collections.emptyList();
    } else {
      Collections.sort(paramList, g);
      paramList = Collections.unmodifiableList(paramList);
    } 
    this.c = paramList;
    if (!bool && paramBoolean) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    } 
    this.d = paramBoolean;
  }
  
  private String a(int paramInt) {
    // Byte code:
    //   0: iload_1
    //   1: istore #4
    //   3: iload #4
    //   5: iconst_1
    //   6: if_icmpne -> 29
    //   9: aload_0
    //   10: invokevirtual c : ()Z
    //   13: ifne -> 19
    //   16: goto -> 29
    //   19: new net/time4j/d1/r
    //   22: dup
    //   23: ldc 'Negative sign not allowed in ISO-8601.'
    //   25: invokespecial <init> : (Ljava/lang/String;)V
    //   28: athrow
    //   29: aload_0
    //   30: invokevirtual b : ()Z
    //   33: ifeq -> 39
    //   36: ldc 'PT0S'
    //   38: areturn
    //   39: iload #4
    //   41: iconst_2
    //   42: if_icmpne -> 51
    //   45: iconst_1
    //   46: istore #6
    //   48: goto -> 54
    //   51: iconst_0
    //   52: istore #6
    //   54: new java/lang/StringBuilder
    //   57: dup
    //   58: invokespecial <init> : ()V
    //   61: astore #21
    //   63: aload_0
    //   64: invokevirtual c : ()Z
    //   67: ifeq -> 78
    //   70: aload #21
    //   72: bipush #45
    //   74: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   77: pop
    //   78: aload #21
    //   80: bipush #80
    //   82: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   85: pop
    //   86: aload_0
    //   87: invokespecial d : ()I
    //   90: istore #8
    //   92: lconst_0
    //   93: lstore #9
    //   95: iconst_0
    //   96: istore #7
    //   98: lconst_0
    //   99: lstore #11
    //   101: iconst_0
    //   102: istore #5
    //   104: lconst_0
    //   105: lstore #13
    //   107: iconst_0
    //   108: istore #4
    //   110: iload #7
    //   112: iload #8
    //   114: if_icmpge -> 630
    //   117: aload_0
    //   118: invokevirtual a : ()Ljava/util/List;
    //   121: iload #7
    //   123: invokeinterface get : (I)Ljava/lang/Object;
    //   128: checkcast net/time4j/d1/m0$a
    //   131: astore #22
    //   133: aload #22
    //   135: invokevirtual b : ()Ljava/lang/Object;
    //   138: checkcast net/time4j/w
    //   141: astore #23
    //   143: iload #5
    //   145: ifne -> 172
    //   148: aload #23
    //   150: invokeinterface c : ()Z
    //   155: ifne -> 172
    //   158: aload #21
    //   160: bipush #84
    //   162: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   165: pop
    //   166: iconst_1
    //   167: istore #5
    //   169: goto -> 172
    //   172: aload #22
    //   174: invokevirtual a : ()J
    //   177: lstore #15
    //   179: aload #23
    //   181: invokeinterface a : ()C
    //   186: istore_2
    //   187: aload #23
    //   189: getstatic net/time4j/v0.c : Lnet/time4j/v0;
    //   192: if_acmpne -> 201
    //   195: iconst_1
    //   196: istore #4
    //   198: goto -> 201
    //   201: iload_2
    //   202: bipush #48
    //   204: if_icmple -> 220
    //   207: iload_2
    //   208: bipush #57
    //   210: if_icmpgt -> 220
    //   213: lload #15
    //   215: lstore #11
    //   217: goto -> 621
    //   220: iload_2
    //   221: bipush #83
    //   223: if_icmpne -> 233
    //   226: lload #15
    //   228: lstore #13
    //   230: goto -> 621
    //   233: iload #6
    //   235: ifne -> 269
    //   238: lload #9
    //   240: lstore #17
    //   242: lload #15
    //   244: lstore #19
    //   246: iload_1
    //   247: iconst_1
    //   248: if_icmpne -> 254
    //   251: goto -> 269
    //   254: aload #21
    //   256: lload #19
    //   258: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   261: pop
    //   262: lload #17
    //   264: lstore #9
    //   266: goto -> 586
    //   269: iload_2
    //   270: bipush #72
    //   272: if_icmpeq -> 467
    //   275: iload_2
    //   276: bipush #73
    //   278: if_icmpeq -> 561
    //   281: iload_2
    //   282: bipush #77
    //   284: if_icmpeq -> 467
    //   287: iload_2
    //   288: bipush #81
    //   290: if_icmpeq -> 541
    //   293: iload_2
    //   294: bipush #87
    //   296: if_icmpeq -> 470
    //   299: iload_2
    //   300: bipush #89
    //   302: if_icmpeq -> 467
    //   305: iload_2
    //   306: tableswitch default -> 332, 67 -> 443, 68 -> 413, 69 -> 405
    //   332: iload #6
    //   334: ifeq -> 344
    //   337: ldc 'XML'
    //   339: astore #21
    //   341: goto -> 348
    //   344: ldc 'ISO'
    //   346: astore #21
    //   348: new java/lang/StringBuilder
    //   351: dup
    //   352: invokespecial <init> : ()V
    //   355: astore #22
    //   357: aload #22
    //   359: ldc 'Special units cannot be output in '
    //   361: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   364: pop
    //   365: aload #22
    //   367: aload #21
    //   369: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   372: pop
    //   373: aload #22
    //   375: ldc '-mode: '
    //   377: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   380: pop
    //   381: aload #22
    //   383: aload_0
    //   384: iconst_0
    //   385: invokespecial a : (I)Ljava/lang/String;
    //   388: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   391: pop
    //   392: new net/time4j/d1/r
    //   395: dup
    //   396: aload #22
    //   398: invokevirtual toString : ()Ljava/lang/String;
    //   401: invokespecial <init> : (Ljava/lang/String;)V
    //   404: athrow
    //   405: ldc2_w 10
    //   408: lstore #17
    //   410: goto -> 448
    //   413: lload #9
    //   415: lstore #17
    //   417: lload #15
    //   419: lstore #19
    //   421: lload #9
    //   423: lconst_0
    //   424: lcmp
    //   425: ifeq -> 254
    //   428: lload #15
    //   430: lload #9
    //   432: invokestatic a : (JJ)J
    //   435: lstore #19
    //   437: lconst_0
    //   438: lstore #17
    //   440: goto -> 254
    //   443: ldc2_w 100
    //   446: lstore #17
    //   448: aload #21
    //   450: lload #15
    //   452: lload #17
    //   454: invokestatic b : (JJ)J
    //   457: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   460: pop
    //   461: bipush #89
    //   463: istore_2
    //   464: goto -> 586
    //   467: goto -> 578
    //   470: iload #8
    //   472: iconst_1
    //   473: if_icmpne -> 501
    //   476: iload #6
    //   478: ifeq -> 578
    //   481: aload #21
    //   483: lload #15
    //   485: ldc2_w 7
    //   488: invokestatic b : (JJ)J
    //   491: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   494: pop
    //   495: bipush #68
    //   497: istore_2
    //   498: goto -> 586
    //   501: lload #15
    //   503: ldc2_w 7
    //   506: invokestatic b : (JJ)J
    //   509: lstore #9
    //   511: aload_0
    //   512: getstatic net/time4j/f.j : Lnet/time4j/f;
    //   515: invokevirtual a : (Lnet/time4j/w;)Z
    //   518: ifeq -> 524
    //   521: goto -> 217
    //   524: aload #21
    //   526: lload #9
    //   528: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   531: pop
    //   532: bipush #68
    //   534: istore_2
    //   535: lconst_0
    //   536: lstore #9
    //   538: goto -> 586
    //   541: aload #21
    //   543: lload #15
    //   545: ldc2_w 3
    //   548: invokestatic b : (JJ)J
    //   551: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   554: pop
    //   555: bipush #77
    //   557: istore_2
    //   558: goto -> 586
    //   561: aload #21
    //   563: lload #15
    //   565: ldc2_w 1000
    //   568: invokestatic b : (JJ)J
    //   571: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   574: pop
    //   575: goto -> 461
    //   578: aload #21
    //   580: lload #15
    //   582: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   585: pop
    //   586: iload_2
    //   587: istore_3
    //   588: iload_2
    //   589: ifne -> 611
    //   592: aload #21
    //   594: bipush #123
    //   596: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   599: pop
    //   600: aload #21
    //   602: aload #23
    //   604: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   607: pop
    //   608: bipush #125
    //   610: istore_3
    //   611: aload #21
    //   613: iload_3
    //   614: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   617: pop
    //   618: goto -> 217
    //   621: iload #7
    //   623: iconst_1
    //   624: iadd
    //   625: istore #7
    //   627: goto -> 110
    //   630: lload #11
    //   632: lconst_0
    //   633: lcmp
    //   634: ifeq -> 731
    //   637: aload #21
    //   639: lload #13
    //   641: lload #11
    //   643: ldc2_w 1000000000
    //   646: ldiv
    //   647: invokestatic a : (JJ)J
    //   650: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   653: pop
    //   654: iload #6
    //   656: ifeq -> 665
    //   659: bipush #46
    //   661: istore_2
    //   662: goto -> 669
    //   665: getstatic net/time4j/n.e : C
    //   668: istore_2
    //   669: aload #21
    //   671: iload_2
    //   672: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   675: pop
    //   676: lload #11
    //   678: ldc2_w 1000000000
    //   681: lrem
    //   682: invokestatic valueOf : (J)Ljava/lang/String;
    //   685: astore #22
    //   687: aload #22
    //   689: invokevirtual length : ()I
    //   692: istore #6
    //   694: iconst_0
    //   695: istore_1
    //   696: iload_1
    //   697: bipush #9
    //   699: iload #6
    //   701: isub
    //   702: if_icmpge -> 720
    //   705: aload #21
    //   707: bipush #48
    //   709: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   712: pop
    //   713: iload_1
    //   714: iconst_1
    //   715: iadd
    //   716: istore_1
    //   717: goto -> 696
    //   720: aload #21
    //   722: aload #22
    //   724: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   727: pop
    //   728: goto -> 746
    //   731: lload #13
    //   733: lconst_0
    //   734: lcmp
    //   735: ifeq -> 754
    //   738: aload #21
    //   740: lload #13
    //   742: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   745: pop
    //   746: aload #21
    //   748: bipush #83
    //   750: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   753: pop
    //   754: iload #4
    //   756: ifeq -> 872
    //   759: iload #5
    //   761: iconst_1
    //   762: ixor
    //   763: istore #5
    //   765: iload #5
    //   767: istore #4
    //   769: iload #5
    //   771: ifeq -> 847
    //   774: aload_0
    //   775: invokespecial d : ()I
    //   778: istore #6
    //   780: iconst_0
    //   781: istore_1
    //   782: iload #5
    //   784: istore #4
    //   786: iload_1
    //   787: iload #6
    //   789: if_icmpge -> 847
    //   792: aload_0
    //   793: invokevirtual a : ()Ljava/util/List;
    //   796: iload_1
    //   797: invokeinterface get : (I)Ljava/lang/Object;
    //   802: checkcast net/time4j/d1/m0$a
    //   805: invokevirtual b : ()Ljava/lang/Object;
    //   808: astore #22
    //   810: aload #22
    //   812: getstatic net/time4j/v0.c : Lnet/time4j/v0;
    //   815: if_acmpeq -> 840
    //   818: aload #22
    //   820: getstatic net/time4j/f.i : Lnet/time4j/f;
    //   823: if_acmpeq -> 840
    //   826: aload #22
    //   828: getstatic net/time4j/f.j : Lnet/time4j/f;
    //   831: if_acmpeq -> 840
    //   834: iconst_0
    //   835: istore #4
    //   837: goto -> 847
    //   840: iload_1
    //   841: iconst_1
    //   842: iadd
    //   843: istore_1
    //   844: goto -> 782
    //   847: iload #4
    //   849: ifne -> 872
    //   852: aload #21
    //   854: ldc 'Y'
    //   856: invokevirtual indexOf : (Ljava/lang/String;)I
    //   859: istore_1
    //   860: aload #21
    //   862: iload_1
    //   863: iload_1
    //   864: iconst_1
    //   865: iadd
    //   866: ldc '{WEEK_BASED_YEARS}'
    //   868: invokevirtual replace : (IILjava/lang/String;)Ljava/lang/StringBuilder;
    //   871: pop
    //   872: aload #21
    //   874: invokevirtual toString : ()Ljava/lang/String;
    //   877: areturn
  }
  
  public static <U extends w> k0<U, n<U>> a(U... paramVarArgs) {
    return (k0)new b<w>((w[])paramVarArgs, null);
  }
  
  private static a<g> a(boolean paramBoolean) {
    String str;
    if (paramBoolean) {
      str = "hh[:mm[:ss[,fffffffff]]]";
    } else {
      str = "hh[mm[ss[,fffffffff]]]";
    } 
    return a.a(g.class, str);
  }
  
  private static a<f> a(boolean paramBoolean1, boolean paramBoolean2) {
    String str;
    if (paramBoolean1) {
      if (paramBoolean2) {
        str = "YYYY-DDD";
      } else {
        str = "YYYY-MM-DD";
      } 
    } else if (paramBoolean2) {
      str = "YYYYDDD";
    } else {
      str = "YYYYMMDD";
    } 
    return a.a(f.class, str);
  }
  
  private boolean b(w paramw) {
    char c = paramw.a();
    return (c >= '1' && c <= '9');
  }
  
  private int d() {
    return a().size();
  }
  
  public static <U extends w> n<U> e() {
    return f;
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) {
    throw new InvalidObjectException("Serialization proxy required.");
  }
  
  private Object writeReplace() {
    return new SPX(this, 6);
  }
  
  public List<m0.a<U>> a() {
    return this.c;
  }
  
  public boolean a(w paramw) {
    boolean bool1;
    boolean bool2 = false;
    if (paramw == null)
      return false; 
    boolean bool = b(paramw);
    int j = this.c.size();
    int i = 0;
    while (true) {
      bool1 = bool2;
      if (i < j) {
        m0.a a1 = this.c.get(i);
        w w1 = (w)a1.b();
        if (w1.equals(paramw) || (bool && b(w1))) {
          bool1 = bool2;
          if (a1.a() > 0L)
            bool1 = true; 
          break;
        } 
        i++;
        continue;
      } 
      break;
    } 
    return bool1;
  }
  
  public boolean c() {
    return this.d;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof n) {
      paramObject = n.class.cast(paramObject);
      return (this.d == ((n)paramObject).d && a().equals(paramObject.a()));
    } 
    return false;
  }
  
  public int hashCode() {
    int j = a().hashCode();
    int i = j;
    if (this.d)
      i = j ^ j; 
    return i;
  }
  
  public String toString() {
    return a(0);
  }
  
  static {
    byte b;
    if (Boolean.getBoolean("net.time4j.format.iso.decimal.dot")) {
      b = 46;
    } else {
      b = 44;
    } 
    e = b;
  }
  
  static {
    a(true, false);
    a(true, true);
    a(false, false);
    a(false, true);
    a(true);
    a(false);
  }
  
  public static final class a<U extends w> extends x<U, n<U>> {
    private a(Class<U> param1Class, String param1String) {
      super(param1Class, param1String);
    }
    
    public static <U extends w> a<U> a(Class<U> param1Class, String param1String) {
      return new a<U>(param1Class, param1String);
    }
    
    protected U a(char param1Char) {
      if (param1Char != 'I') {
        if (param1Char != 'M') {
          if (param1Char != 'Q') {
            if (param1Char != 'W') {
              if (param1Char != 'Y') {
                if (param1Char != 'f') {
                  if (param1Char != 'h') {
                    if (param1Char != 'm') {
                      if (param1Char != 's') {
                        StringBuilder stringBuilder;
                        switch (param1Char) {
                          default:
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("Unsupported pattern symbol: ");
                            stringBuilder.append(param1Char);
                            throw new IllegalArgumentException(stringBuilder.toString());
                          case 'E':
                            return (U)f.e;
                          case 'D':
                            return (U)f.j;
                          case 'C':
                            break;
                        } 
                        return (U)f.d;
                      } 
                      return (U)g.e;
                    } 
                    return (U)g.d;
                  } 
                  return (U)g.c;
                } 
                return (U)g.h;
              } 
              return (U)f.f;
            } 
            return (U)f.i;
          } 
          return (U)f.g;
        } 
        return (U)f.h;
      } 
      return (U)f.c;
    }
  }
  
  private static class b<U extends w> extends b<U, n<U>> {
    private b(U... param1VarArgs) {
      super(bool, (w[])param1VarArgs);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */