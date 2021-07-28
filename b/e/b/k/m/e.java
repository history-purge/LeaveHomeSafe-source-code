package b.e.b.k.m;

import b.e.b.k.f;
import b.e.b.k.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class e {
  private f a;
  
  private boolean b = true;
  
  private boolean c = true;
  
  private f d;
  
  private ArrayList<m> e = new ArrayList<m>();
  
  private b.b f;
  
  private b.a g;
  
  ArrayList<k> h;
  
  public e(f paramf) {
    new ArrayList();
    this.f = null;
    this.g = new b.a();
    this.h = new ArrayList<k>();
    this.a = paramf;
    this.d = paramf;
  }
  
  private int a(f paramf, int paramInt) {
    int j = this.h.size();
    long l = 0L;
    for (int i = 0; i < j; i++)
      l = Math.max(l, ((k)this.h.get(i)).a(paramf, paramInt)); 
    return (int)l;
  }
  
  private void a(b.e.b.k.e parame, b.e.b.k.e.b paramb1, int paramInt1, b.e.b.k.e.b paramb2, int paramInt2) {
    b.a a1 = this.g;
    a1.a = paramb1;
    a1.b = paramb2;
    a1.c = paramInt1;
    a1.d = paramInt2;
    this.f.a(parame, a1);
    parame.p(this.g.e);
    parame.h(this.g.f);
    parame.a(this.g.h);
    parame.g(this.g.g);
  }
  
  private void a(f paramf1, int paramInt1, int paramInt2, f paramf2, ArrayList<k> paramArrayList, k paramk) {
    m m = paramf1.d;
    if (m.c == null) {
      f f1 = this.a;
      if (m != ((b.e.b.k.e)f1).d) {
        if (m == ((b.e.b.k.e)f1).e)
          return; 
        k k1 = paramk;
        if (paramk == null) {
          k1 = new k(m, paramInt2);
          paramArrayList.add(k1);
        } 
        m.c = k1;
        k1.a(m);
        for (d d : m.h.k) {
          if (d instanceof f)
            a((f)d, paramInt1, 0, paramf2, paramArrayList, k1); 
        } 
        for (d d : m.i.k) {
          if (d instanceof f)
            a((f)d, paramInt1, 1, paramf2, paramArrayList, k1); 
        } 
        if (paramInt1 == 1 && m instanceof l)
          for (d d : ((l)m).k.k) {
            if (d instanceof f)
              a((f)d, paramInt1, 2, paramf2, paramArrayList, k1); 
          }  
        for (f f2 : m.h.l) {
          if (f2 == paramf2)
            k1.a = true; 
          a(f2, paramInt1, 0, paramf2, paramArrayList, k1);
        } 
        for (f f2 : m.i.l) {
          if (f2 == paramf2)
            k1.a = true; 
          a(f2, paramInt1, 1, paramf2, paramArrayList, k1);
        } 
        if (paramInt1 == 1 && m instanceof l) {
          Iterator<f> iterator = ((l)m).k.l.iterator();
          while (true) {
            if (iterator.hasNext()) {
              f f2 = iterator.next();
              try {
                a(f2, paramInt1, 2, paramf2, paramArrayList, k1);
              } finally {}
              continue;
            } 
            return;
          } 
        } 
      } 
    } 
  }
  
  private void a(m paramm, int paramInt, ArrayList<k> paramArrayList) {
    for (d d : paramm.h.k) {
      if (d instanceof f) {
        a((f)d, paramInt, 0, paramm.i, paramArrayList, null);
        continue;
      } 
      if (d instanceof m)
        a(((m)d).h, paramInt, 0, paramm.i, paramArrayList, null); 
    } 
    for (d d : paramm.i.k) {
      if (d instanceof f) {
        a((f)d, paramInt, 1, paramm.h, paramArrayList, null);
        continue;
      } 
      if (d instanceof m)
        a(((m)d).i, paramInt, 1, paramm.h, paramArrayList, null); 
    } 
    if (paramInt == 1)
      for (d d : ((l)paramm).k.k) {
        if (d instanceof f)
          a((f)d, paramInt, 2, null, paramArrayList, null); 
      }  
  }
  
  private boolean a(f paramf) {
    // Byte code:
    //   0: aload_1
    //   1: getfield g0 : Ljava/util/ArrayList;
    //   4: invokevirtual iterator : ()Ljava/util/Iterator;
    //   7: astore #11
    //   9: aload #11
    //   11: invokeinterface hasNext : ()Z
    //   16: ifeq -> 1309
    //   19: aload #11
    //   21: invokeinterface next : ()Ljava/lang/Object;
    //   26: checkcast b/e/b/k/e
    //   29: astore #12
    //   31: aload #12
    //   33: getfield J : [Lb/e/b/k/e$b;
    //   36: astore #8
    //   38: aload #8
    //   40: iconst_0
    //   41: aaload
    //   42: astore #9
    //   44: aload #8
    //   46: iconst_1
    //   47: aaload
    //   48: astore #10
    //   50: aload #12
    //   52: invokevirtual y : ()I
    //   55: bipush #8
    //   57: if_icmpne -> 69
    //   60: aload #12
    //   62: iconst_1
    //   63: putfield a : Z
    //   66: goto -> 9
    //   69: aload #12
    //   71: getfield o : F
    //   74: fconst_1
    //   75: fcmpg
    //   76: ifge -> 93
    //   79: aload #9
    //   81: getstatic b/e/b/k/e$b.e : Lb/e/b/k/e$b;
    //   84: if_acmpne -> 93
    //   87: aload #12
    //   89: iconst_2
    //   90: putfield j : I
    //   93: aload #12
    //   95: getfield r : F
    //   98: fconst_1
    //   99: fcmpg
    //   100: ifge -> 117
    //   103: aload #10
    //   105: getstatic b/e/b/k/e$b.e : Lb/e/b/k/e$b;
    //   108: if_acmpne -> 117
    //   111: aload #12
    //   113: iconst_2
    //   114: putfield k : I
    //   117: aload #12
    //   119: invokevirtual h : ()F
    //   122: fconst_0
    //   123: fcmpl
    //   124: ifle -> 237
    //   127: aload #9
    //   129: getstatic b/e/b/k/e$b.e : Lb/e/b/k/e$b;
    //   132: if_acmpne -> 160
    //   135: aload #10
    //   137: getstatic b/e/b/k/e$b.d : Lb/e/b/k/e$b;
    //   140: if_acmpeq -> 151
    //   143: aload #10
    //   145: getstatic b/e/b/k/e$b.c : Lb/e/b/k/e$b;
    //   148: if_acmpne -> 160
    //   151: aload #12
    //   153: iconst_3
    //   154: putfield j : I
    //   157: goto -> 237
    //   160: aload #10
    //   162: getstatic b/e/b/k/e$b.e : Lb/e/b/k/e$b;
    //   165: if_acmpne -> 193
    //   168: aload #9
    //   170: getstatic b/e/b/k/e$b.d : Lb/e/b/k/e$b;
    //   173: if_acmpeq -> 184
    //   176: aload #9
    //   178: getstatic b/e/b/k/e$b.c : Lb/e/b/k/e$b;
    //   181: if_acmpne -> 193
    //   184: aload #12
    //   186: iconst_3
    //   187: putfield k : I
    //   190: goto -> 237
    //   193: getstatic b/e/b/k/e$b.e : Lb/e/b/k/e$b;
    //   196: astore #8
    //   198: aload #9
    //   200: aload #8
    //   202: if_acmpne -> 237
    //   205: aload #10
    //   207: aload #8
    //   209: if_acmpne -> 237
    //   212: aload #12
    //   214: getfield j : I
    //   217: ifne -> 226
    //   220: aload #12
    //   222: iconst_3
    //   223: putfield j : I
    //   226: aload #12
    //   228: getfield k : I
    //   231: ifne -> 237
    //   234: goto -> 184
    //   237: aload #9
    //   239: astore #8
    //   241: aload #9
    //   243: getstatic b/e/b/k/e$b.e : Lb/e/b/k/e$b;
    //   246: if_acmpne -> 293
    //   249: aload #9
    //   251: astore #8
    //   253: aload #12
    //   255: getfield j : I
    //   258: iconst_1
    //   259: if_icmpne -> 293
    //   262: aload #12
    //   264: getfield y : Lb/e/b/k/d;
    //   267: getfield d : Lb/e/b/k/d;
    //   270: ifnull -> 288
    //   273: aload #9
    //   275: astore #8
    //   277: aload #12
    //   279: getfield A : Lb/e/b/k/d;
    //   282: getfield d : Lb/e/b/k/d;
    //   285: ifnonnull -> 293
    //   288: getstatic b/e/b/k/e$b.d : Lb/e/b/k/e$b;
    //   291: astore #8
    //   293: aload #10
    //   295: astore #9
    //   297: aload #10
    //   299: getstatic b/e/b/k/e$b.e : Lb/e/b/k/e$b;
    //   302: if_acmpne -> 349
    //   305: aload #10
    //   307: astore #9
    //   309: aload #12
    //   311: getfield k : I
    //   314: iconst_1
    //   315: if_icmpne -> 349
    //   318: aload #12
    //   320: getfield z : Lb/e/b/k/d;
    //   323: getfield d : Lb/e/b/k/d;
    //   326: ifnull -> 344
    //   329: aload #10
    //   331: astore #9
    //   333: aload #12
    //   335: getfield B : Lb/e/b/k/d;
    //   338: getfield d : Lb/e/b/k/d;
    //   341: ifnonnull -> 349
    //   344: getstatic b/e/b/k/e$b.d : Lb/e/b/k/e$b;
    //   347: astore #9
    //   349: aload #12
    //   351: getfield d : Lb/e/b/k/m/j;
    //   354: astore #10
    //   356: aload #10
    //   358: aload #8
    //   360: putfield d : Lb/e/b/k/e$b;
    //   363: aload #10
    //   365: aload #12
    //   367: getfield j : I
    //   370: putfield a : I
    //   373: aload #12
    //   375: getfield e : Lb/e/b/k/m/l;
    //   378: astore #10
    //   380: aload #10
    //   382: aload #9
    //   384: putfield d : Lb/e/b/k/e$b;
    //   387: aload #10
    //   389: aload #12
    //   391: getfield k : I
    //   394: putfield a : I
    //   397: aload #8
    //   399: getstatic b/e/b/k/e$b.f : Lb/e/b/k/e$b;
    //   402: if_acmpeq -> 421
    //   405: aload #8
    //   407: getstatic b/e/b/k/e$b.c : Lb/e/b/k/e$b;
    //   410: if_acmpeq -> 421
    //   413: aload #8
    //   415: getstatic b/e/b/k/e$b.d : Lb/e/b/k/e$b;
    //   418: if_acmpne -> 448
    //   421: aload #9
    //   423: getstatic b/e/b/k/e$b.f : Lb/e/b/k/e$b;
    //   426: if_acmpeq -> 1134
    //   429: aload #9
    //   431: getstatic b/e/b/k/e$b.c : Lb/e/b/k/e$b;
    //   434: if_acmpeq -> 1134
    //   437: aload #9
    //   439: getstatic b/e/b/k/e$b.d : Lb/e/b/k/e$b;
    //   442: if_acmpne -> 448
    //   445: goto -> 1134
    //   448: aload #8
    //   450: getstatic b/e/b/k/e$b.e : Lb/e/b/k/e$b;
    //   453: if_acmpne -> 698
    //   456: aload #9
    //   458: getstatic b/e/b/k/e$b.d : Lb/e/b/k/e$b;
    //   461: if_acmpeq -> 472
    //   464: aload #9
    //   466: getstatic b/e/b/k/e$b.c : Lb/e/b/k/e$b;
    //   469: if_acmpne -> 698
    //   472: aload #12
    //   474: getfield j : I
    //   477: istore #4
    //   479: iload #4
    //   481: iconst_3
    //   482: if_icmpne -> 547
    //   485: getstatic b/e/b/k/e$b.d : Lb/e/b/k/e$b;
    //   488: astore #8
    //   490: aload #9
    //   492: aload #8
    //   494: if_acmpne -> 509
    //   497: aload_0
    //   498: aload #12
    //   500: aload #8
    //   502: iconst_0
    //   503: aload #8
    //   505: iconst_0
    //   506: invokespecial a : (Lb/e/b/k/e;Lb/e/b/k/e$b;ILb/e/b/k/e$b;I)V
    //   509: aload #12
    //   511: invokevirtual j : ()I
    //   514: istore #4
    //   516: iload #4
    //   518: i2f
    //   519: aload #12
    //   521: getfield N : F
    //   524: fmul
    //   525: ldc 0.5
    //   527: fadd
    //   528: f2i
    //   529: istore #5
    //   531: getstatic b/e/b/k/e$b.c : Lb/e/b/k/e$b;
    //   534: astore #8
    //   536: aload #8
    //   538: astore #9
    //   540: aload #8
    //   542: astore #10
    //   544: goto -> 1260
    //   547: iload #4
    //   549: iconst_1
    //   550: if_icmpne -> 593
    //   553: aload_0
    //   554: aload #12
    //   556: getstatic b/e/b/k/e$b.d : Lb/e/b/k/e$b;
    //   559: iconst_0
    //   560: aload #9
    //   562: iconst_0
    //   563: invokespecial a : (Lb/e/b/k/e;Lb/e/b/k/e$b;ILb/e/b/k/e$b;I)V
    //   566: aload #12
    //   568: getfield d : Lb/e/b/k/m/j;
    //   571: getfield e : Lb/e/b/k/m/g;
    //   574: astore #8
    //   576: aload #12
    //   578: invokevirtual z : ()I
    //   581: istore #4
    //   583: aload #8
    //   585: iload #4
    //   587: putfield m : I
    //   590: goto -> 9
    //   593: iload #4
    //   595: iconst_2
    //   596: if_icmpne -> 657
    //   599: aload_1
    //   600: getfield J : [Lb/e/b/k/e$b;
    //   603: astore #10
    //   605: aload #10
    //   607: iconst_0
    //   608: aaload
    //   609: getstatic b/e/b/k/e$b.c : Lb/e/b/k/e$b;
    //   612: if_acmpeq -> 625
    //   615: aload #10
    //   617: iconst_0
    //   618: aaload
    //   619: getstatic b/e/b/k/e$b.f : Lb/e/b/k/e$b;
    //   622: if_acmpne -> 698
    //   625: aload #12
    //   627: getfield o : F
    //   630: aload_1
    //   631: invokevirtual z : ()I
    //   634: i2f
    //   635: fmul
    //   636: ldc 0.5
    //   638: fadd
    //   639: f2i
    //   640: istore #5
    //   642: aload #12
    //   644: invokevirtual j : ()I
    //   647: istore #4
    //   649: getstatic b/e/b/k/e$b.c : Lb/e/b/k/e$b;
    //   652: astore #8
    //   654: goto -> 1252
    //   657: aload #12
    //   659: getfield G : [Lb/e/b/k/d;
    //   662: astore #10
    //   664: aload #10
    //   666: iconst_0
    //   667: aaload
    //   668: getfield d : Lb/e/b/k/d;
    //   671: ifnull -> 684
    //   674: aload #10
    //   676: iconst_1
    //   677: aaload
    //   678: getfield d : Lb/e/b/k/d;
    //   681: ifnonnull -> 698
    //   684: getstatic b/e/b/k/e$b.d : Lb/e/b/k/e$b;
    //   687: astore #8
    //   689: iconst_0
    //   690: istore #5
    //   692: iconst_0
    //   693: istore #4
    //   695: goto -> 1252
    //   698: aload #9
    //   700: getstatic b/e/b/k/e$b.e : Lb/e/b/k/e$b;
    //   703: if_acmpne -> 921
    //   706: aload #8
    //   708: getstatic b/e/b/k/e$b.d : Lb/e/b/k/e$b;
    //   711: if_acmpeq -> 722
    //   714: aload #8
    //   716: getstatic b/e/b/k/e$b.c : Lb/e/b/k/e$b;
    //   719: if_acmpne -> 921
    //   722: aload #12
    //   724: getfield k : I
    //   727: istore #4
    //   729: iload #4
    //   731: iconst_3
    //   732: if_icmpne -> 803
    //   735: getstatic b/e/b/k/e$b.d : Lb/e/b/k/e$b;
    //   738: astore #9
    //   740: aload #8
    //   742: aload #9
    //   744: if_acmpne -> 759
    //   747: aload_0
    //   748: aload #12
    //   750: aload #9
    //   752: iconst_0
    //   753: aload #9
    //   755: iconst_0
    //   756: invokespecial a : (Lb/e/b/k/e;Lb/e/b/k/e$b;ILb/e/b/k/e$b;I)V
    //   759: aload #12
    //   761: invokevirtual z : ()I
    //   764: istore #5
    //   766: aload #12
    //   768: getfield N : F
    //   771: fstore_3
    //   772: fload_3
    //   773: fstore_2
    //   774: aload #12
    //   776: invokevirtual i : ()I
    //   779: iconst_m1
    //   780: if_icmpne -> 787
    //   783: fconst_1
    //   784: fload_3
    //   785: fdiv
    //   786: fstore_2
    //   787: iload #5
    //   789: i2f
    //   790: fstore_3
    //   791: fload_3
    //   792: fload_2
    //   793: fmul
    //   794: ldc 0.5
    //   796: fadd
    //   797: f2i
    //   798: istore #4
    //   800: goto -> 531
    //   803: iload #4
    //   805: iconst_1
    //   806: if_icmpne -> 825
    //   809: aload_0
    //   810: aload #12
    //   812: aload #8
    //   814: iconst_0
    //   815: getstatic b/e/b/k/e$b.d : Lb/e/b/k/e$b;
    //   818: iconst_0
    //   819: invokespecial a : (Lb/e/b/k/e;Lb/e/b/k/e$b;ILb/e/b/k/e$b;I)V
    //   822: goto -> 1114
    //   825: iload #4
    //   827: iconst_2
    //   828: if_icmpne -> 891
    //   831: aload_1
    //   832: getfield J : [Lb/e/b/k/e$b;
    //   835: astore #10
    //   837: aload #10
    //   839: iconst_1
    //   840: aaload
    //   841: getstatic b/e/b/k/e$b.c : Lb/e/b/k/e$b;
    //   844: if_acmpeq -> 857
    //   847: aload #10
    //   849: iconst_1
    //   850: aaload
    //   851: getstatic b/e/b/k/e$b.f : Lb/e/b/k/e$b;
    //   854: if_acmpne -> 921
    //   857: aload #12
    //   859: getfield r : F
    //   862: fstore_2
    //   863: aload #12
    //   865: invokevirtual z : ()I
    //   868: istore #5
    //   870: fload_2
    //   871: aload_1
    //   872: invokevirtual j : ()I
    //   875: i2f
    //   876: fmul
    //   877: ldc 0.5
    //   879: fadd
    //   880: f2i
    //   881: istore #4
    //   883: getstatic b/e/b/k/e$b.c : Lb/e/b/k/e$b;
    //   886: astore #9
    //   888: goto -> 1252
    //   891: aload #12
    //   893: getfield G : [Lb/e/b/k/d;
    //   896: astore #10
    //   898: aload #10
    //   900: iconst_2
    //   901: aaload
    //   902: getfield d : Lb/e/b/k/d;
    //   905: ifnull -> 684
    //   908: aload #10
    //   910: iconst_3
    //   911: aaload
    //   912: getfield d : Lb/e/b/k/d;
    //   915: ifnonnull -> 921
    //   918: goto -> 684
    //   921: getstatic b/e/b/k/e$b.e : Lb/e/b/k/e$b;
    //   924: astore #10
    //   926: aload #8
    //   928: aload #10
    //   930: if_acmpne -> 9
    //   933: aload #9
    //   935: aload #10
    //   937: if_acmpne -> 9
    //   940: aload #12
    //   942: getfield j : I
    //   945: istore #4
    //   947: iload #4
    //   949: iconst_1
    //   950: if_icmpeq -> 1081
    //   953: aload #12
    //   955: getfield k : I
    //   958: istore #5
    //   960: iload #5
    //   962: iconst_1
    //   963: if_icmpne -> 969
    //   966: goto -> 1081
    //   969: iload #5
    //   971: iconst_2
    //   972: if_icmpne -> 9
    //   975: iload #4
    //   977: iconst_2
    //   978: if_icmpne -> 9
    //   981: aload_1
    //   982: getfield J : [Lb/e/b/k/e$b;
    //   985: astore #8
    //   987: aload #8
    //   989: iconst_0
    //   990: aaload
    //   991: astore #9
    //   993: getstatic b/e/b/k/e$b.c : Lb/e/b/k/e$b;
    //   996: astore #10
    //   998: aload #9
    //   1000: aload #10
    //   1002: if_acmpeq -> 1014
    //   1005: aload #8
    //   1007: iconst_0
    //   1008: aaload
    //   1009: aload #10
    //   1011: if_acmpne -> 9
    //   1014: aload_1
    //   1015: getfield J : [Lb/e/b/k/e$b;
    //   1018: astore #8
    //   1020: aload #8
    //   1022: iconst_1
    //   1023: aaload
    //   1024: astore #9
    //   1026: getstatic b/e/b/k/e$b.c : Lb/e/b/k/e$b;
    //   1029: astore #10
    //   1031: aload #9
    //   1033: aload #10
    //   1035: if_acmpeq -> 1047
    //   1038: aload #8
    //   1040: iconst_1
    //   1041: aaload
    //   1042: aload #10
    //   1044: if_acmpne -> 9
    //   1047: aload #12
    //   1049: getfield o : F
    //   1052: fstore_2
    //   1053: aload #12
    //   1055: getfield r : F
    //   1058: fstore_3
    //   1059: fload_2
    //   1060: aload_1
    //   1061: invokevirtual z : ()I
    //   1064: i2f
    //   1065: fmul
    //   1066: ldc 0.5
    //   1068: fadd
    //   1069: f2i
    //   1070: istore #5
    //   1072: aload_1
    //   1073: invokevirtual j : ()I
    //   1076: i2f
    //   1077: fstore_2
    //   1078: goto -> 791
    //   1081: getstatic b/e/b/k/e$b.d : Lb/e/b/k/e$b;
    //   1084: astore #8
    //   1086: aload_0
    //   1087: aload #12
    //   1089: aload #8
    //   1091: iconst_0
    //   1092: aload #8
    //   1094: iconst_0
    //   1095: invokespecial a : (Lb/e/b/k/e;Lb/e/b/k/e$b;ILb/e/b/k/e$b;I)V
    //   1098: aload #12
    //   1100: getfield d : Lb/e/b/k/m/j;
    //   1103: getfield e : Lb/e/b/k/m/g;
    //   1106: aload #12
    //   1108: invokevirtual z : ()I
    //   1111: putfield m : I
    //   1114: aload #12
    //   1116: getfield e : Lb/e/b/k/m/l;
    //   1119: getfield e : Lb/e/b/k/m/g;
    //   1122: astore #8
    //   1124: aload #12
    //   1126: invokevirtual j : ()I
    //   1129: istore #4
    //   1131: goto -> 583
    //   1134: aload #12
    //   1136: invokevirtual z : ()I
    //   1139: istore #5
    //   1141: aload #8
    //   1143: getstatic b/e/b/k/e$b.f : Lb/e/b/k/e$b;
    //   1146: if_acmpne -> 1193
    //   1149: aload_1
    //   1150: invokevirtual z : ()I
    //   1153: istore #4
    //   1155: aload #12
    //   1157: getfield y : Lb/e/b/k/d;
    //   1160: getfield e : I
    //   1163: istore #5
    //   1165: aload #12
    //   1167: getfield A : Lb/e/b/k/d;
    //   1170: getfield e : I
    //   1173: istore #6
    //   1175: getstatic b/e/b/k/e$b.c : Lb/e/b/k/e$b;
    //   1178: astore #8
    //   1180: iload #4
    //   1182: iload #5
    //   1184: isub
    //   1185: iload #6
    //   1187: isub
    //   1188: istore #5
    //   1190: goto -> 1193
    //   1193: aload #12
    //   1195: invokevirtual j : ()I
    //   1198: istore #4
    //   1200: aload #9
    //   1202: getstatic b/e/b/k/e$b.f : Lb/e/b/k/e$b;
    //   1205: if_acmpne -> 1252
    //   1208: aload_1
    //   1209: invokevirtual j : ()I
    //   1212: istore #4
    //   1214: aload #12
    //   1216: getfield z : Lb/e/b/k/d;
    //   1219: getfield e : I
    //   1222: istore #6
    //   1224: aload #12
    //   1226: getfield B : Lb/e/b/k/d;
    //   1229: getfield e : I
    //   1232: istore #7
    //   1234: getstatic b/e/b/k/e$b.c : Lb/e/b/k/e$b;
    //   1237: astore #9
    //   1239: iload #4
    //   1241: iload #6
    //   1243: isub
    //   1244: iload #7
    //   1246: isub
    //   1247: istore #4
    //   1249: goto -> 1252
    //   1252: aload #9
    //   1254: astore #10
    //   1256: aload #8
    //   1258: astore #9
    //   1260: aload_0
    //   1261: aload #12
    //   1263: aload #9
    //   1265: iload #5
    //   1267: aload #10
    //   1269: iload #4
    //   1271: invokespecial a : (Lb/e/b/k/e;Lb/e/b/k/e$b;ILb/e/b/k/e$b;I)V
    //   1274: aload #12
    //   1276: getfield d : Lb/e/b/k/m/j;
    //   1279: getfield e : Lb/e/b/k/m/g;
    //   1282: aload #12
    //   1284: invokevirtual z : ()I
    //   1287: invokevirtual a : (I)V
    //   1290: aload #12
    //   1292: getfield e : Lb/e/b/k/m/l;
    //   1295: getfield e : Lb/e/b/k/m/g;
    //   1298: aload #12
    //   1300: invokevirtual j : ()I
    //   1303: invokevirtual a : (I)V
    //   1306: goto -> 60
    //   1309: iconst_0
    //   1310: ireturn
  }
  
  public void a() {
    a(this.e);
    this.h.clear();
    k.d = 0;
    a(((b.e.b.k.e)this.a).d, 0, this.h);
    a(((b.e.b.k.e)this.a).e, 1, this.h);
    this.b = false;
  }
  
  public void a(b.b paramb) {
    this.f = paramb;
  }
  
  public void a(ArrayList<m> paramArrayList) {
    paramArrayList.clear();
    ((b.e.b.k.e)this.d).d.c();
    ((b.e.b.k.e)this.d).e.c();
    paramArrayList.add(((b.e.b.k.e)this.d).d);
    paramArrayList.add(((b.e.b.k.e)this.d).e);
    Iterator<b.e.b.k.e> iterator1 = ((l)this.d).g0.iterator();
    HashSet<c> hashSet = null;
    while (iterator1.hasNext()) {
      i i;
      b.e.b.k.e e1 = iterator1.next();
      if (e1 instanceof b.e.b.k.g) {
        h h = new h(e1);
      } else {
        HashSet<c> hashSet1;
        if (e1.D()) {
          if (e1.b == null)
            e1.b = new c(e1, 0); 
          hashSet1 = hashSet;
          if (hashSet == null)
            hashSet1 = new HashSet(); 
          hashSet1.add(e1.b);
          hashSet = hashSet1;
        } else {
          paramArrayList.add(e1.d);
        } 
        if (e1.F()) {
          if (e1.c == null)
            e1.c = new c(e1, 1); 
          hashSet1 = hashSet;
          if (hashSet == null)
            hashSet1 = new HashSet<c>(); 
          hashSet1.add(e1.c);
        } else {
          paramArrayList.add(e1.e);
          hashSet1 = hashSet;
        } 
        hashSet = hashSet1;
        if (e1 instanceof b.e.b.k.i) {
          i i1 = new i(e1);
          hashSet = hashSet1;
          i = i1;
        } else {
          continue;
        } 
      } 
      paramArrayList.add(i);
    } 
    if (hashSet != null)
      paramArrayList.addAll((Collection)hashSet); 
    Iterator<m> iterator = paramArrayList.iterator();
    while (iterator.hasNext())
      ((m)iterator.next()).c(); 
    for (m m : paramArrayList) {
      if (m.b == this.d)
        continue; 
      m.a();
    } 
  }
  
  public boolean a(boolean paramBoolean) {
    // Byte code:
    //   0: iload_1
    //   1: iconst_1
    //   2: iand
    //   3: istore_3
    //   4: aload_0
    //   5: getfield b : Z
    //   8: istore #6
    //   10: iconst_0
    //   11: istore_1
    //   12: iload #6
    //   14: ifne -> 24
    //   17: aload_0
    //   18: getfield c : Z
    //   21: ifeq -> 118
    //   24: aload_0
    //   25: getfield a : Lb/e/b/k/f;
    //   28: getfield g0 : Ljava/util/ArrayList;
    //   31: invokevirtual iterator : ()Ljava/util/Iterator;
    //   34: astore #7
    //   36: aload #7
    //   38: invokeinterface hasNext : ()Z
    //   43: ifeq -> 83
    //   46: aload #7
    //   48: invokeinterface next : ()Ljava/lang/Object;
    //   53: checkcast b/e/b/k/e
    //   56: astore #8
    //   58: aload #8
    //   60: iconst_0
    //   61: putfield a : Z
    //   64: aload #8
    //   66: getfield d : Lb/e/b/k/m/j;
    //   69: invokevirtual g : ()V
    //   72: aload #8
    //   74: getfield e : Lb/e/b/k/m/l;
    //   77: invokevirtual g : ()V
    //   80: goto -> 36
    //   83: aload_0
    //   84: getfield a : Lb/e/b/k/f;
    //   87: astore #7
    //   89: aload #7
    //   91: iconst_0
    //   92: putfield a : Z
    //   95: aload #7
    //   97: getfield d : Lb/e/b/k/m/j;
    //   100: invokevirtual g : ()V
    //   103: aload_0
    //   104: getfield a : Lb/e/b/k/f;
    //   107: getfield e : Lb/e/b/k/m/l;
    //   110: invokevirtual g : ()V
    //   113: aload_0
    //   114: iconst_0
    //   115: putfield c : Z
    //   118: aload_0
    //   119: aload_0
    //   120: getfield d : Lb/e/b/k/f;
    //   123: invokespecial a : (Lb/e/b/k/f;)Z
    //   126: ifeq -> 131
    //   129: iconst_0
    //   130: ireturn
    //   131: aload_0
    //   132: getfield a : Lb/e/b/k/f;
    //   135: iconst_0
    //   136: invokevirtual q : (I)V
    //   139: aload_0
    //   140: getfield a : Lb/e/b/k/f;
    //   143: iconst_0
    //   144: invokevirtual r : (I)V
    //   147: aload_0
    //   148: getfield a : Lb/e/b/k/f;
    //   151: iconst_0
    //   152: invokevirtual b : (I)Lb/e/b/k/e$b;
    //   155: astore #7
    //   157: aload_0
    //   158: getfield a : Lb/e/b/k/f;
    //   161: iconst_1
    //   162: invokevirtual b : (I)Lb/e/b/k/e$b;
    //   165: astore #8
    //   167: aload_0
    //   168: getfield b : Z
    //   171: ifeq -> 178
    //   174: aload_0
    //   175: invokevirtual a : ()V
    //   178: aload_0
    //   179: getfield a : Lb/e/b/k/f;
    //   182: invokevirtual A : ()I
    //   185: istore #5
    //   187: aload_0
    //   188: getfield a : Lb/e/b/k/f;
    //   191: invokevirtual B : ()I
    //   194: istore #4
    //   196: aload_0
    //   197: getfield a : Lb/e/b/k/f;
    //   200: getfield d : Lb/e/b/k/m/j;
    //   203: getfield h : Lb/e/b/k/m/f;
    //   206: iload #5
    //   208: invokevirtual a : (I)V
    //   211: aload_0
    //   212: getfield a : Lb/e/b/k/f;
    //   215: getfield e : Lb/e/b/k/m/l;
    //   218: getfield h : Lb/e/b/k/m/f;
    //   221: iload #4
    //   223: invokevirtual a : (I)V
    //   226: aload_0
    //   227: invokevirtual d : ()V
    //   230: getstatic b/e/b/k/e$b.d : Lb/e/b/k/e$b;
    //   233: astore #9
    //   235: aload #7
    //   237: aload #9
    //   239: if_acmpeq -> 249
    //   242: aload #8
    //   244: aload #9
    //   246: if_acmpne -> 418
    //   249: iload_3
    //   250: istore_2
    //   251: iload_3
    //   252: ifeq -> 294
    //   255: aload_0
    //   256: getfield e : Ljava/util/ArrayList;
    //   259: invokevirtual iterator : ()Ljava/util/Iterator;
    //   262: astore #9
    //   264: iload_3
    //   265: istore_2
    //   266: aload #9
    //   268: invokeinterface hasNext : ()Z
    //   273: ifeq -> 294
    //   276: aload #9
    //   278: invokeinterface next : ()Ljava/lang/Object;
    //   283: checkcast b/e/b/k/m/m
    //   286: invokevirtual f : ()Z
    //   289: ifne -> 264
    //   292: iconst_0
    //   293: istore_2
    //   294: iload_2
    //   295: ifeq -> 356
    //   298: aload #7
    //   300: getstatic b/e/b/k/e$b.d : Lb/e/b/k/e$b;
    //   303: if_acmpne -> 356
    //   306: aload_0
    //   307: getfield a : Lb/e/b/k/f;
    //   310: getstatic b/e/b/k/e$b.c : Lb/e/b/k/e$b;
    //   313: invokevirtual a : (Lb/e/b/k/e$b;)V
    //   316: aload_0
    //   317: getfield a : Lb/e/b/k/f;
    //   320: astore #9
    //   322: aload #9
    //   324: aload_0
    //   325: aload #9
    //   327: iconst_0
    //   328: invokespecial a : (Lb/e/b/k/f;I)I
    //   331: invokevirtual p : (I)V
    //   334: aload_0
    //   335: getfield a : Lb/e/b/k/f;
    //   338: astore #9
    //   340: aload #9
    //   342: getfield d : Lb/e/b/k/m/j;
    //   345: getfield e : Lb/e/b/k/m/g;
    //   348: aload #9
    //   350: invokevirtual z : ()I
    //   353: invokevirtual a : (I)V
    //   356: iload_2
    //   357: ifeq -> 418
    //   360: aload #8
    //   362: getstatic b/e/b/k/e$b.d : Lb/e/b/k/e$b;
    //   365: if_acmpne -> 418
    //   368: aload_0
    //   369: getfield a : Lb/e/b/k/f;
    //   372: getstatic b/e/b/k/e$b.c : Lb/e/b/k/e$b;
    //   375: invokevirtual b : (Lb/e/b/k/e$b;)V
    //   378: aload_0
    //   379: getfield a : Lb/e/b/k/f;
    //   382: astore #9
    //   384: aload #9
    //   386: aload_0
    //   387: aload #9
    //   389: iconst_1
    //   390: invokespecial a : (Lb/e/b/k/f;I)I
    //   393: invokevirtual h : (I)V
    //   396: aload_0
    //   397: getfield a : Lb/e/b/k/f;
    //   400: astore #9
    //   402: aload #9
    //   404: getfield e : Lb/e/b/k/m/l;
    //   407: getfield e : Lb/e/b/k/m/g;
    //   410: aload #9
    //   412: invokevirtual j : ()I
    //   415: invokevirtual a : (I)V
    //   418: aload_0
    //   419: getfield a : Lb/e/b/k/f;
    //   422: getfield J : [Lb/e/b/k/e$b;
    //   425: astore #9
    //   427: aload #9
    //   429: iconst_0
    //   430: aaload
    //   431: getstatic b/e/b/k/e$b.c : Lb/e/b/k/e$b;
    //   434: if_acmpeq -> 455
    //   437: aload #9
    //   439: iconst_0
    //   440: aaload
    //   441: getstatic b/e/b/k/e$b.f : Lb/e/b/k/e$b;
    //   444: if_acmpne -> 450
    //   447: goto -> 455
    //   450: iconst_0
    //   451: istore_2
    //   452: goto -> 578
    //   455: aload_0
    //   456: getfield a : Lb/e/b/k/f;
    //   459: invokevirtual z : ()I
    //   462: iload #5
    //   464: iadd
    //   465: istore_2
    //   466: aload_0
    //   467: getfield a : Lb/e/b/k/f;
    //   470: getfield d : Lb/e/b/k/m/j;
    //   473: getfield i : Lb/e/b/k/m/f;
    //   476: iload_2
    //   477: invokevirtual a : (I)V
    //   480: aload_0
    //   481: getfield a : Lb/e/b/k/f;
    //   484: getfield d : Lb/e/b/k/m/j;
    //   487: getfield e : Lb/e/b/k/m/g;
    //   490: iload_2
    //   491: iload #5
    //   493: isub
    //   494: invokevirtual a : (I)V
    //   497: aload_0
    //   498: invokevirtual d : ()V
    //   501: aload_0
    //   502: getfield a : Lb/e/b/k/f;
    //   505: getfield J : [Lb/e/b/k/e$b;
    //   508: astore #9
    //   510: aload #9
    //   512: iconst_1
    //   513: aaload
    //   514: getstatic b/e/b/k/e$b.c : Lb/e/b/k/e$b;
    //   517: if_acmpeq -> 530
    //   520: aload #9
    //   522: iconst_1
    //   523: aaload
    //   524: getstatic b/e/b/k/e$b.f : Lb/e/b/k/e$b;
    //   527: if_acmpne -> 572
    //   530: aload_0
    //   531: getfield a : Lb/e/b/k/f;
    //   534: invokevirtual j : ()I
    //   537: iload #4
    //   539: iadd
    //   540: istore_2
    //   541: aload_0
    //   542: getfield a : Lb/e/b/k/f;
    //   545: getfield e : Lb/e/b/k/m/l;
    //   548: getfield i : Lb/e/b/k/m/f;
    //   551: iload_2
    //   552: invokevirtual a : (I)V
    //   555: aload_0
    //   556: getfield a : Lb/e/b/k/f;
    //   559: getfield e : Lb/e/b/k/m/l;
    //   562: getfield e : Lb/e/b/k/m/g;
    //   565: iload_2
    //   566: iload #4
    //   568: isub
    //   569: invokevirtual a : (I)V
    //   572: aload_0
    //   573: invokevirtual d : ()V
    //   576: iconst_1
    //   577: istore_2
    //   578: aload_0
    //   579: getfield e : Ljava/util/ArrayList;
    //   582: invokevirtual iterator : ()Ljava/util/Iterator;
    //   585: astore #9
    //   587: aload #9
    //   589: invokeinterface hasNext : ()Z
    //   594: ifeq -> 640
    //   597: aload #9
    //   599: invokeinterface next : ()Ljava/lang/Object;
    //   604: checkcast b/e/b/k/m/m
    //   607: astore #10
    //   609: aload #10
    //   611: getfield b : Lb/e/b/k/e;
    //   614: aload_0
    //   615: getfield a : Lb/e/b/k/f;
    //   618: if_acmpne -> 632
    //   621: aload #10
    //   623: getfield g : Z
    //   626: ifne -> 632
    //   629: goto -> 587
    //   632: aload #10
    //   634: invokevirtual b : ()V
    //   637: goto -> 587
    //   640: aload_0
    //   641: getfield e : Ljava/util/ArrayList;
    //   644: invokevirtual iterator : ()Ljava/util/Iterator;
    //   647: astore #9
    //   649: aload #9
    //   651: invokeinterface hasNext : ()Z
    //   656: ifeq -> 756
    //   659: aload #9
    //   661: invokeinterface next : ()Ljava/lang/Object;
    //   666: checkcast b/e/b/k/m/m
    //   669: astore #10
    //   671: iload_2
    //   672: ifne -> 690
    //   675: aload #10
    //   677: getfield b : Lb/e/b/k/e;
    //   680: aload_0
    //   681: getfield a : Lb/e/b/k/f;
    //   684: if_acmpne -> 690
    //   687: goto -> 649
    //   690: aload #10
    //   692: getfield h : Lb/e/b/k/m/f;
    //   695: getfield j : Z
    //   698: ifne -> 704
    //   701: goto -> 758
    //   704: aload #10
    //   706: getfield i : Lb/e/b/k/m/f;
    //   709: getfield j : Z
    //   712: ifne -> 726
    //   715: aload #10
    //   717: instanceof b/e/b/k/m/h
    //   720: ifne -> 726
    //   723: goto -> 758
    //   726: aload #10
    //   728: getfield e : Lb/e/b/k/m/g;
    //   731: getfield j : Z
    //   734: ifne -> 649
    //   737: aload #10
    //   739: instanceof b/e/b/k/m/c
    //   742: ifne -> 649
    //   745: aload #10
    //   747: instanceof b/e/b/k/m/h
    //   750: ifne -> 649
    //   753: goto -> 758
    //   756: iconst_1
    //   757: istore_1
    //   758: aload_0
    //   759: getfield a : Lb/e/b/k/f;
    //   762: aload #7
    //   764: invokevirtual a : (Lb/e/b/k/e$b;)V
    //   767: aload_0
    //   768: getfield a : Lb/e/b/k/f;
    //   771: aload #8
    //   773: invokevirtual b : (Lb/e/b/k/e$b;)V
    //   776: iload_1
    //   777: ireturn
  }
  
  public boolean a(boolean paramBoolean, int paramInt) {
    // Byte code:
    //   0: iload_1
    //   1: iconst_1
    //   2: iand
    //   3: istore #4
    //   5: aload_0
    //   6: getfield a : Lb/e/b/k/f;
    //   9: astore #7
    //   11: iconst_0
    //   12: istore_1
    //   13: aload #7
    //   15: iconst_0
    //   16: invokevirtual b : (I)Lb/e/b/k/e$b;
    //   19: astore #8
    //   21: aload_0
    //   22: getfield a : Lb/e/b/k/f;
    //   25: iconst_1
    //   26: invokevirtual b : (I)Lb/e/b/k/e$b;
    //   29: astore #9
    //   31: aload_0
    //   32: getfield a : Lb/e/b/k/f;
    //   35: invokevirtual A : ()I
    //   38: istore #5
    //   40: aload_0
    //   41: getfield a : Lb/e/b/k/f;
    //   44: invokevirtual B : ()I
    //   47: istore #6
    //   49: iload #4
    //   51: ifeq -> 263
    //   54: getstatic b/e/b/k/e$b.d : Lb/e/b/k/e$b;
    //   57: astore #7
    //   59: aload #8
    //   61: aload #7
    //   63: if_acmpeq -> 73
    //   66: aload #9
    //   68: aload #7
    //   70: if_acmpne -> 263
    //   73: aload_0
    //   74: getfield e : Ljava/util/ArrayList;
    //   77: invokevirtual iterator : ()Ljava/util/Iterator;
    //   80: astore #7
    //   82: iload #4
    //   84: istore_3
    //   85: aload #7
    //   87: invokeinterface hasNext : ()Z
    //   92: ifeq -> 126
    //   95: aload #7
    //   97: invokeinterface next : ()Ljava/lang/Object;
    //   102: checkcast b/e/b/k/m/m
    //   105: astore #10
    //   107: aload #10
    //   109: getfield f : I
    //   112: iload_2
    //   113: if_icmpne -> 82
    //   116: aload #10
    //   118: invokevirtual f : ()Z
    //   121: ifne -> 82
    //   124: iconst_0
    //   125: istore_3
    //   126: iload_2
    //   127: ifne -> 195
    //   130: iload_3
    //   131: ifeq -> 263
    //   134: aload #8
    //   136: getstatic b/e/b/k/e$b.d : Lb/e/b/k/e$b;
    //   139: if_acmpne -> 263
    //   142: aload_0
    //   143: getfield a : Lb/e/b/k/f;
    //   146: getstatic b/e/b/k/e$b.c : Lb/e/b/k/e$b;
    //   149: invokevirtual a : (Lb/e/b/k/e$b;)V
    //   152: aload_0
    //   153: getfield a : Lb/e/b/k/f;
    //   156: astore #7
    //   158: aload #7
    //   160: aload_0
    //   161: aload #7
    //   163: iconst_0
    //   164: invokespecial a : (Lb/e/b/k/f;I)I
    //   167: invokevirtual p : (I)V
    //   170: aload_0
    //   171: getfield a : Lb/e/b/k/f;
    //   174: astore #10
    //   176: aload #10
    //   178: getfield d : Lb/e/b/k/m/j;
    //   181: getfield e : Lb/e/b/k/m/g;
    //   184: astore #7
    //   186: aload #10
    //   188: invokevirtual z : ()I
    //   191: istore_3
    //   192: goto -> 257
    //   195: iload_3
    //   196: ifeq -> 263
    //   199: aload #9
    //   201: getstatic b/e/b/k/e$b.d : Lb/e/b/k/e$b;
    //   204: if_acmpne -> 263
    //   207: aload_0
    //   208: getfield a : Lb/e/b/k/f;
    //   211: getstatic b/e/b/k/e$b.c : Lb/e/b/k/e$b;
    //   214: invokevirtual b : (Lb/e/b/k/e$b;)V
    //   217: aload_0
    //   218: getfield a : Lb/e/b/k/f;
    //   221: astore #7
    //   223: aload #7
    //   225: aload_0
    //   226: aload #7
    //   228: iconst_1
    //   229: invokespecial a : (Lb/e/b/k/f;I)I
    //   232: invokevirtual h : (I)V
    //   235: aload_0
    //   236: getfield a : Lb/e/b/k/f;
    //   239: astore #10
    //   241: aload #10
    //   243: getfield e : Lb/e/b/k/m/l;
    //   246: getfield e : Lb/e/b/k/m/g;
    //   249: astore #7
    //   251: aload #10
    //   253: invokevirtual j : ()I
    //   256: istore_3
    //   257: aload #7
    //   259: iload_3
    //   260: invokevirtual a : (I)V
    //   263: aload_0
    //   264: getfield a : Lb/e/b/k/f;
    //   267: getfield J : [Lb/e/b/k/e$b;
    //   270: astore #7
    //   272: iload_2
    //   273: ifne -> 341
    //   276: aload #7
    //   278: iconst_0
    //   279: aaload
    //   280: getstatic b/e/b/k/e$b.c : Lb/e/b/k/e$b;
    //   283: if_acmpeq -> 296
    //   286: aload #7
    //   288: iconst_0
    //   289: aaload
    //   290: getstatic b/e/b/k/e$b.f : Lb/e/b/k/e$b;
    //   293: if_acmpne -> 364
    //   296: aload_0
    //   297: getfield a : Lb/e/b/k/f;
    //   300: invokevirtual z : ()I
    //   303: iload #5
    //   305: iadd
    //   306: istore_3
    //   307: aload_0
    //   308: getfield a : Lb/e/b/k/f;
    //   311: getfield d : Lb/e/b/k/m/j;
    //   314: getfield i : Lb/e/b/k/m/f;
    //   317: iload_3
    //   318: invokevirtual a : (I)V
    //   321: aload_0
    //   322: getfield a : Lb/e/b/k/f;
    //   325: getfield d : Lb/e/b/k/m/j;
    //   328: getfield e : Lb/e/b/k/m/g;
    //   331: iload_3
    //   332: iload #5
    //   334: isub
    //   335: invokevirtual a : (I)V
    //   338: goto -> 411
    //   341: aload #7
    //   343: iconst_1
    //   344: aaload
    //   345: getstatic b/e/b/k/e$b.c : Lb/e/b/k/e$b;
    //   348: if_acmpeq -> 369
    //   351: aload #7
    //   353: iconst_1
    //   354: aaload
    //   355: getstatic b/e/b/k/e$b.f : Lb/e/b/k/e$b;
    //   358: if_acmpne -> 364
    //   361: goto -> 369
    //   364: iconst_0
    //   365: istore_3
    //   366: goto -> 413
    //   369: aload_0
    //   370: getfield a : Lb/e/b/k/f;
    //   373: invokevirtual j : ()I
    //   376: iload #6
    //   378: iadd
    //   379: istore_3
    //   380: aload_0
    //   381: getfield a : Lb/e/b/k/f;
    //   384: getfield e : Lb/e/b/k/m/l;
    //   387: getfield i : Lb/e/b/k/m/f;
    //   390: iload_3
    //   391: invokevirtual a : (I)V
    //   394: aload_0
    //   395: getfield a : Lb/e/b/k/f;
    //   398: getfield e : Lb/e/b/k/m/l;
    //   401: getfield e : Lb/e/b/k/m/g;
    //   404: iload_3
    //   405: iload #6
    //   407: isub
    //   408: invokevirtual a : (I)V
    //   411: iconst_1
    //   412: istore_3
    //   413: aload_0
    //   414: invokevirtual d : ()V
    //   417: aload_0
    //   418: getfield e : Ljava/util/ArrayList;
    //   421: invokevirtual iterator : ()Ljava/util/Iterator;
    //   424: astore #7
    //   426: aload #7
    //   428: invokeinterface hasNext : ()Z
    //   433: ifeq -> 491
    //   436: aload #7
    //   438: invokeinterface next : ()Ljava/lang/Object;
    //   443: checkcast b/e/b/k/m/m
    //   446: astore #10
    //   448: aload #10
    //   450: getfield f : I
    //   453: iload_2
    //   454: if_icmpeq -> 460
    //   457: goto -> 426
    //   460: aload #10
    //   462: getfield b : Lb/e/b/k/e;
    //   465: aload_0
    //   466: getfield a : Lb/e/b/k/f;
    //   469: if_acmpne -> 483
    //   472: aload #10
    //   474: getfield g : Z
    //   477: ifne -> 483
    //   480: goto -> 426
    //   483: aload #10
    //   485: invokevirtual b : ()V
    //   488: goto -> 426
    //   491: aload_0
    //   492: getfield e : Ljava/util/ArrayList;
    //   495: invokevirtual iterator : ()Ljava/util/Iterator;
    //   498: astore #7
    //   500: aload #7
    //   502: invokeinterface hasNext : ()Z
    //   507: ifeq -> 603
    //   510: aload #7
    //   512: invokeinterface next : ()Ljava/lang/Object;
    //   517: checkcast b/e/b/k/m/m
    //   520: astore #10
    //   522: aload #10
    //   524: getfield f : I
    //   527: iload_2
    //   528: if_icmpeq -> 534
    //   531: goto -> 500
    //   534: iload_3
    //   535: ifne -> 553
    //   538: aload #10
    //   540: getfield b : Lb/e/b/k/e;
    //   543: aload_0
    //   544: getfield a : Lb/e/b/k/f;
    //   547: if_acmpne -> 553
    //   550: goto -> 500
    //   553: aload #10
    //   555: getfield h : Lb/e/b/k/m/f;
    //   558: getfield j : Z
    //   561: ifne -> 567
    //   564: goto -> 605
    //   567: aload #10
    //   569: getfield i : Lb/e/b/k/m/f;
    //   572: getfield j : Z
    //   575: ifne -> 581
    //   578: goto -> 605
    //   581: aload #10
    //   583: instanceof b/e/b/k/m/c
    //   586: ifne -> 500
    //   589: aload #10
    //   591: getfield e : Lb/e/b/k/m/g;
    //   594: getfield j : Z
    //   597: ifne -> 500
    //   600: goto -> 605
    //   603: iconst_1
    //   604: istore_1
    //   605: aload_0
    //   606: getfield a : Lb/e/b/k/f;
    //   609: aload #8
    //   611: invokevirtual a : (Lb/e/b/k/e$b;)V
    //   614: aload_0
    //   615: getfield a : Lb/e/b/k/f;
    //   618: aload #9
    //   620: invokevirtual b : (Lb/e/b/k/e$b;)V
    //   623: iload_1
    //   624: ireturn
  }
  
  public void b() {
    this.b = true;
  }
  
  public boolean b(boolean paramBoolean) {
    if (this.b) {
      for (b.e.b.k.e e1 : ((l)this.a).g0) {
        e1.a = false;
        j j1 = e1.d;
        j1.e.j = false;
        j1.g = false;
        j1.g();
        l l1 = e1.e;
        l1.e.j = false;
        l1.g = false;
        l1.g();
      } 
      f f1 = this.a;
      ((b.e.b.k.e)f1).a = false;
      j j = ((b.e.b.k.e)f1).d;
      j.e.j = false;
      j.g = false;
      j.g();
      l l = ((b.e.b.k.e)this.a).e;
      l.e.j = false;
      l.g = false;
      l.g();
      a();
    } 
    if (a(this.d))
      return false; 
    this.a.q(0);
    this.a.r(0);
    ((b.e.b.k.e)this.a).d.h.a(0);
    ((b.e.b.k.e)this.a).e.h.a(0);
    return true;
  }
  
  public void c() {
    this.c = true;
  }
  
  public void d() {
    Iterator iterator = ((l)this.a).g0.iterator();
    while (true) {
      while (true)
        break; 
      if (((b.e.b.k.e)SYNTHETIC_LOCAL_VARIABLE_9).a) {
        g g = ((b.e.b.k.e)SYNTHETIC_LOCAL_VARIABLE_9).e.l;
        if (g != null)
          g.a(SYNTHETIC_LOCAL_VARIABLE_9.d()); 
      } 
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/e/b/k/m/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */