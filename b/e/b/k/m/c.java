package b.e.b.k.m;

import b.e.b.k.e;
import b.e.b.k.f;
import java.util.ArrayList;
import java.util.Iterator;

public class c extends m {
  ArrayList<m> k = new ArrayList<m>();
  
  private int l;
  
  public c(e parame, int paramInt) {
    super(parame);
    this.f = paramInt;
    g();
  }
  
  private void g() {
    e e = this.b;
    while (true) {
      int i;
      e e1 = e.e(this.f);
      if (e1 != null) {
        e = e1;
        continue;
      } 
      this.b = e;
      this.k.add(e.f(this.f));
      for (e = e.d(this.f); e != null; e = e.d(this.f))
        this.k.add(e.f(this.f)); 
      for (m m1 : this.k) {
        i = this.f;
        if (i == 0) {
          m1.b.b = this;
          continue;
        } 
        if (i == 1)
          m1.b.c = this; 
      } 
      if (this.f == 0 && ((f)this.b.s()).O()) {
        i = 1;
      } else {
        i = 0;
      } 
      if (i && this.k.size() > 1) {
        ArrayList<m> arrayList = this.k;
        this.b = ((m)arrayList.get(arrayList.size() - 1)).b;
      } 
      if (this.f == 0) {
        i = this.b.l();
      } else {
        i = this.b.v();
      } 
      this.l = i;
      return;
    } 
  }
  
  private e h() {
    for (int i = 0; i < this.k.size(); i++) {
      m m1 = this.k.get(i);
      if (m1.b.y() != 8)
        return m1.b; 
    } 
    return null;
  }
  
  private e i() {
    for (int i = this.k.size() - 1; i >= 0; i--) {
      m m1 = this.k.get(i);
      if (m1.b.y() != 8)
        return m1.b; 
    } 
    return null;
  }
  
  void a() {
    // Byte code:
    //   0: aload_0
    //   1: getfield k : Ljava/util/ArrayList;
    //   4: invokevirtual iterator : ()Ljava/util/Iterator;
    //   7: astore_2
    //   8: aload_2
    //   9: invokeinterface hasNext : ()Z
    //   14: ifeq -> 32
    //   17: aload_2
    //   18: invokeinterface next : ()Ljava/lang/Object;
    //   23: checkcast b/e/b/k/m/m
    //   26: invokevirtual a : ()V
    //   29: goto -> 8
    //   32: aload_0
    //   33: getfield k : Ljava/util/ArrayList;
    //   36: invokevirtual size : ()I
    //   39: istore_1
    //   40: iload_1
    //   41: iconst_1
    //   42: if_icmpge -> 46
    //   45: return
    //   46: aload_0
    //   47: getfield k : Ljava/util/ArrayList;
    //   50: iconst_0
    //   51: invokevirtual get : (I)Ljava/lang/Object;
    //   54: checkcast b/e/b/k/m/m
    //   57: getfield b : Lb/e/b/k/e;
    //   60: astore_3
    //   61: aload_0
    //   62: getfield k : Ljava/util/ArrayList;
    //   65: iload_1
    //   66: iconst_1
    //   67: isub
    //   68: invokevirtual get : (I)Ljava/lang/Object;
    //   71: checkcast b/e/b/k/m/m
    //   74: getfield b : Lb/e/b/k/e;
    //   77: astore_2
    //   78: aload_0
    //   79: getfield f : I
    //   82: ifne -> 180
    //   85: aload_3
    //   86: getfield y : Lb/e/b/k/d;
    //   89: astore #4
    //   91: aload_2
    //   92: getfield A : Lb/e/b/k/d;
    //   95: astore_3
    //   96: aload_0
    //   97: aload #4
    //   99: iconst_0
    //   100: invokevirtual a : (Lb/e/b/k/d;I)Lb/e/b/k/m/f;
    //   103: astore_2
    //   104: aload #4
    //   106: invokevirtual a : ()I
    //   109: istore_1
    //   110: aload_0
    //   111: invokespecial h : ()Lb/e/b/k/e;
    //   114: astore #4
    //   116: aload #4
    //   118: ifnull -> 130
    //   121: aload #4
    //   123: getfield y : Lb/e/b/k/d;
    //   126: invokevirtual a : ()I
    //   129: istore_1
    //   130: aload_2
    //   131: ifnull -> 144
    //   134: aload_0
    //   135: aload_0
    //   136: getfield h : Lb/e/b/k/m/f;
    //   139: aload_2
    //   140: iload_1
    //   141: invokevirtual a : (Lb/e/b/k/m/f;Lb/e/b/k/m/f;I)V
    //   144: aload_0
    //   145: aload_3
    //   146: iconst_0
    //   147: invokevirtual a : (Lb/e/b/k/d;I)Lb/e/b/k/m/f;
    //   150: astore_2
    //   151: aload_3
    //   152: invokevirtual a : ()I
    //   155: istore_1
    //   156: aload_0
    //   157: invokespecial i : ()Lb/e/b/k/e;
    //   160: astore_3
    //   161: aload_3
    //   162: ifnull -> 173
    //   165: aload_3
    //   166: getfield A : Lb/e/b/k/d;
    //   169: invokevirtual a : ()I
    //   172: istore_1
    //   173: aload_2
    //   174: ifnull -> 283
    //   177: goto -> 272
    //   180: aload_3
    //   181: getfield z : Lb/e/b/k/d;
    //   184: astore #4
    //   186: aload_2
    //   187: getfield B : Lb/e/b/k/d;
    //   190: astore_3
    //   191: aload_0
    //   192: aload #4
    //   194: iconst_1
    //   195: invokevirtual a : (Lb/e/b/k/d;I)Lb/e/b/k/m/f;
    //   198: astore_2
    //   199: aload #4
    //   201: invokevirtual a : ()I
    //   204: istore_1
    //   205: aload_0
    //   206: invokespecial h : ()Lb/e/b/k/e;
    //   209: astore #4
    //   211: aload #4
    //   213: ifnull -> 225
    //   216: aload #4
    //   218: getfield z : Lb/e/b/k/d;
    //   221: invokevirtual a : ()I
    //   224: istore_1
    //   225: aload_2
    //   226: ifnull -> 239
    //   229: aload_0
    //   230: aload_0
    //   231: getfield h : Lb/e/b/k/m/f;
    //   234: aload_2
    //   235: iload_1
    //   236: invokevirtual a : (Lb/e/b/k/m/f;Lb/e/b/k/m/f;I)V
    //   239: aload_0
    //   240: aload_3
    //   241: iconst_1
    //   242: invokevirtual a : (Lb/e/b/k/d;I)Lb/e/b/k/m/f;
    //   245: astore_2
    //   246: aload_3
    //   247: invokevirtual a : ()I
    //   250: istore_1
    //   251: aload_0
    //   252: invokespecial i : ()Lb/e/b/k/e;
    //   255: astore_3
    //   256: aload_3
    //   257: ifnull -> 268
    //   260: aload_3
    //   261: getfield B : Lb/e/b/k/d;
    //   264: invokevirtual a : ()I
    //   267: istore_1
    //   268: aload_2
    //   269: ifnull -> 283
    //   272: aload_0
    //   273: aload_0
    //   274: getfield i : Lb/e/b/k/m/f;
    //   277: aload_2
    //   278: iload_1
    //   279: ineg
    //   280: invokevirtual a : (Lb/e/b/k/m/f;Lb/e/b/k/m/f;I)V
    //   283: aload_0
    //   284: getfield h : Lb/e/b/k/m/f;
    //   287: aload_0
    //   288: putfield a : Lb/e/b/k/m/d;
    //   291: aload_0
    //   292: getfield i : Lb/e/b/k/m/f;
    //   295: aload_0
    //   296: putfield a : Lb/e/b/k/m/d;
    //   299: return
  }
  
  public void a(d paramd) {
    // Byte code:
    //   0: aload_0
    //   1: getfield h : Lb/e/b/k/m/f;
    //   4: getfield j : Z
    //   7: ifeq -> 2544
    //   10: aload_0
    //   11: getfield i : Lb/e/b/k/m/f;
    //   14: getfield j : Z
    //   17: ifne -> 21
    //   20: return
    //   21: aload_0
    //   22: getfield b : Lb/e/b/k/e;
    //   25: invokevirtual s : ()Lb/e/b/k/e;
    //   28: astore_1
    //   29: aload_1
    //   30: ifnull -> 52
    //   33: aload_1
    //   34: instanceof b/e/b/k/f
    //   37: ifeq -> 52
    //   40: aload_1
    //   41: checkcast b/e/b/k/f
    //   44: invokevirtual O : ()Z
    //   47: istore #21
    //   49: goto -> 55
    //   52: iconst_0
    //   53: istore #21
    //   55: aload_0
    //   56: getfield i : Lb/e/b/k/m/f;
    //   59: getfield g : I
    //   62: aload_0
    //   63: getfield h : Lb/e/b/k/m/f;
    //   66: getfield g : I
    //   69: isub
    //   70: istore #20
    //   72: aload_0
    //   73: getfield k : Ljava/util/ArrayList;
    //   76: invokevirtual size : ()I
    //   79: istore #19
    //   81: iconst_0
    //   82: istore #5
    //   84: iconst_m1
    //   85: istore #6
    //   87: iload #5
    //   89: iload #19
    //   91: if_icmpge -> 130
    //   94: iload #5
    //   96: istore #13
    //   98: aload_0
    //   99: getfield k : Ljava/util/ArrayList;
    //   102: iload #5
    //   104: invokevirtual get : (I)Ljava/lang/Object;
    //   107: checkcast b/e/b/k/m/m
    //   110: getfield b : Lb/e/b/k/e;
    //   113: invokevirtual y : ()I
    //   116: bipush #8
    //   118: if_icmpne -> 133
    //   121: iload #5
    //   123: iconst_1
    //   124: iadd
    //   125: istore #5
    //   127: goto -> 84
    //   130: iconst_m1
    //   131: istore #13
    //   133: iload #19
    //   135: iconst_1
    //   136: isub
    //   137: istore #18
    //   139: iload #18
    //   141: istore #5
    //   143: iload #6
    //   145: istore #14
    //   147: iload #5
    //   149: iflt -> 188
    //   152: aload_0
    //   153: getfield k : Ljava/util/ArrayList;
    //   156: iload #5
    //   158: invokevirtual get : (I)Ljava/lang/Object;
    //   161: checkcast b/e/b/k/m/m
    //   164: getfield b : Lb/e/b/k/e;
    //   167: invokevirtual y : ()I
    //   170: bipush #8
    //   172: if_icmpne -> 184
    //   175: iload #5
    //   177: iconst_1
    //   178: isub
    //   179: istore #5
    //   181: goto -> 143
    //   184: iload #5
    //   186: istore #14
    //   188: iconst_0
    //   189: istore #9
    //   191: iload #9
    //   193: iconst_2
    //   194: if_icmpge -> 658
    //   197: iconst_0
    //   198: istore #10
    //   200: iconst_0
    //   201: istore #7
    //   203: iconst_0
    //   204: istore #5
    //   206: iconst_0
    //   207: istore #8
    //   209: fconst_0
    //   210: fstore_2
    //   211: iload #10
    //   213: iload #19
    //   215: if_icmpge -> 623
    //   218: aload_0
    //   219: getfield k : Ljava/util/ArrayList;
    //   222: iload #10
    //   224: invokevirtual get : (I)Ljava/lang/Object;
    //   227: checkcast b/e/b/k/m/m
    //   230: astore_1
    //   231: aload_1
    //   232: getfield b : Lb/e/b/k/e;
    //   235: invokevirtual y : ()I
    //   238: bipush #8
    //   240: if_icmpne -> 254
    //   243: iload #7
    //   245: istore #6
    //   247: iload #5
    //   249: istore #11
    //   251: goto -> 606
    //   254: iload #8
    //   256: iconst_1
    //   257: iadd
    //   258: istore #16
    //   260: iload #7
    //   262: istore #6
    //   264: iload #10
    //   266: ifle -> 292
    //   269: iload #7
    //   271: istore #6
    //   273: iload #10
    //   275: iload #13
    //   277: if_icmplt -> 292
    //   280: iload #7
    //   282: aload_1
    //   283: getfield h : Lb/e/b/k/m/f;
    //   286: getfield f : I
    //   289: iadd
    //   290: istore #6
    //   292: aload_1
    //   293: getfield e : Lb/e/b/k/m/g;
    //   296: getfield g : I
    //   299: istore #11
    //   301: aload_1
    //   302: getfield d : Lb/e/b/k/e$b;
    //   305: getstatic b/e/b/k/e$b.e : Lb/e/b/k/e$b;
    //   308: if_acmpeq -> 317
    //   311: iconst_1
    //   312: istore #8
    //   314: goto -> 320
    //   317: iconst_0
    //   318: istore #8
    //   320: iload #8
    //   322: ifeq -> 398
    //   325: aload_0
    //   326: getfield f : I
    //   329: ifne -> 349
    //   332: aload_1
    //   333: getfield b : Lb/e/b/k/e;
    //   336: getfield d : Lb/e/b/k/m/j;
    //   339: getfield e : Lb/e/b/k/m/g;
    //   342: getfield j : Z
    //   345: ifne -> 349
    //   348: return
    //   349: iload #8
    //   351: istore #15
    //   353: iload #11
    //   355: istore #12
    //   357: iload #5
    //   359: istore #7
    //   361: aload_0
    //   362: getfield f : I
    //   365: iconst_1
    //   366: if_icmpne -> 474
    //   369: iload #8
    //   371: istore #15
    //   373: iload #11
    //   375: istore #12
    //   377: iload #5
    //   379: istore #7
    //   381: aload_1
    //   382: getfield b : Lb/e/b/k/e;
    //   385: getfield e : Lb/e/b/k/m/l;
    //   388: getfield e : Lb/e/b/k/m/g;
    //   391: getfield j : Z
    //   394: ifne -> 474
    //   397: return
    //   398: aload_1
    //   399: getfield a : I
    //   402: iconst_1
    //   403: if_icmpne -> 437
    //   406: iload #9
    //   408: ifne -> 437
    //   411: aload_1
    //   412: getfield e : Lb/e/b/k/m/g;
    //   415: getfield m : I
    //   418: istore #7
    //   420: iload #5
    //   422: iconst_1
    //   423: iadd
    //   424: istore #8
    //   426: iload #7
    //   428: istore #5
    //   430: iload #8
    //   432: istore #7
    //   434: goto -> 467
    //   437: iload #8
    //   439: istore #15
    //   441: iload #11
    //   443: istore #12
    //   445: iload #5
    //   447: istore #7
    //   449: aload_1
    //   450: getfield e : Lb/e/b/k/m/g;
    //   453: getfield j : Z
    //   456: ifeq -> 474
    //   459: iload #5
    //   461: istore #7
    //   463: iload #11
    //   465: istore #5
    //   467: iconst_1
    //   468: istore #15
    //   470: iload #5
    //   472: istore #12
    //   474: iload #15
    //   476: ifne -> 532
    //   479: iload #7
    //   481: iconst_1
    //   482: iadd
    //   483: istore #8
    //   485: aload_1
    //   486: getfield b : Lb/e/b/k/e;
    //   489: getfield c0 : [F
    //   492: aload_0
    //   493: getfield f : I
    //   496: faload
    //   497: fstore #4
    //   499: iload #6
    //   501: istore #5
    //   503: iload #8
    //   505: istore #7
    //   507: fload_2
    //   508: fstore_3
    //   509: fload #4
    //   511: fconst_0
    //   512: fcmpl
    //   513: iflt -> 541
    //   516: fload_2
    //   517: fload #4
    //   519: fadd
    //   520: fstore_3
    //   521: iload #6
    //   523: istore #5
    //   525: iload #8
    //   527: istore #7
    //   529: goto -> 541
    //   532: iload #6
    //   534: iload #12
    //   536: iadd
    //   537: istore #5
    //   539: fload_2
    //   540: fstore_3
    //   541: iload #5
    //   543: istore #6
    //   545: iload #7
    //   547: istore #11
    //   549: iload #16
    //   551: istore #8
    //   553: fload_3
    //   554: fstore_2
    //   555: iload #10
    //   557: iload #18
    //   559: if_icmpge -> 606
    //   562: iload #5
    //   564: istore #6
    //   566: iload #7
    //   568: istore #11
    //   570: iload #16
    //   572: istore #8
    //   574: fload_3
    //   575: fstore_2
    //   576: iload #10
    //   578: iload #14
    //   580: if_icmpge -> 606
    //   583: iload #5
    //   585: aload_1
    //   586: getfield i : Lb/e/b/k/m/f;
    //   589: getfield f : I
    //   592: ineg
    //   593: iadd
    //   594: istore #6
    //   596: fload_3
    //   597: fstore_2
    //   598: iload #16
    //   600: istore #8
    //   602: iload #7
    //   604: istore #11
    //   606: iload #10
    //   608: iconst_1
    //   609: iadd
    //   610: istore #10
    //   612: iload #6
    //   614: istore #7
    //   616: iload #11
    //   618: istore #5
    //   620: goto -> 211
    //   623: iload #7
    //   625: iload #20
    //   627: if_icmplt -> 647
    //   630: iload #5
    //   632: ifne -> 638
    //   635: goto -> 647
    //   638: iload #9
    //   640: iconst_1
    //   641: iadd
    //   642: istore #9
    //   644: goto -> 191
    //   647: iload #8
    //   649: istore #15
    //   651: iload #5
    //   653: istore #6
    //   655: goto -> 669
    //   658: iconst_0
    //   659: istore #15
    //   661: iconst_0
    //   662: istore #7
    //   664: iconst_0
    //   665: istore #6
    //   667: fconst_0
    //   668: fstore_2
    //   669: aload_0
    //   670: getfield h : Lb/e/b/k/m/f;
    //   673: getfield g : I
    //   676: istore #8
    //   678: iload #21
    //   680: ifeq -> 692
    //   683: aload_0
    //   684: getfield i : Lb/e/b/k/m/f;
    //   687: getfield g : I
    //   690: istore #8
    //   692: iload #8
    //   694: istore #5
    //   696: iload #7
    //   698: iload #20
    //   700: if_icmple -> 739
    //   703: iload #7
    //   705: iload #20
    //   707: isub
    //   708: i2f
    //   709: fconst_2
    //   710: fdiv
    //   711: ldc 0.5
    //   713: fadd
    //   714: f2i
    //   715: istore #5
    //   717: iload #21
    //   719: ifeq -> 732
    //   722: iload #8
    //   724: iload #5
    //   726: iadd
    //   727: istore #5
    //   729: goto -> 739
    //   732: iload #8
    //   734: iload #5
    //   736: isub
    //   737: istore #5
    //   739: iload #6
    //   741: ifle -> 1289
    //   744: iload #20
    //   746: iload #7
    //   748: isub
    //   749: i2f
    //   750: fstore_3
    //   751: fload_3
    //   752: iload #6
    //   754: i2f
    //   755: fdiv
    //   756: ldc 0.5
    //   758: fadd
    //   759: f2i
    //   760: istore #10
    //   762: iconst_0
    //   763: istore #16
    //   765: iconst_0
    //   766: istore #8
    //   768: iload #5
    //   770: istore #9
    //   772: iload #16
    //   774: iload #19
    //   776: if_icmpge -> 1089
    //   779: aload_0
    //   780: getfield k : Ljava/util/ArrayList;
    //   783: iload #16
    //   785: invokevirtual get : (I)Ljava/lang/Object;
    //   788: checkcast b/e/b/k/m/m
    //   791: astore_1
    //   792: aload_1
    //   793: getfield b : Lb/e/b/k/e;
    //   796: invokevirtual y : ()I
    //   799: bipush #8
    //   801: if_icmpne -> 807
    //   804: goto -> 1080
    //   807: aload_1
    //   808: getfield d : Lb/e/b/k/e$b;
    //   811: getstatic b/e/b/k/e$b.e : Lb/e/b/k/e$b;
    //   814: if_acmpne -> 1080
    //   817: aload_1
    //   818: getfield e : Lb/e/b/k/m/g;
    //   821: getfield j : Z
    //   824: ifne -> 1080
    //   827: fload_2
    //   828: fconst_0
    //   829: fcmpl
    //   830: ifle -> 858
    //   833: aload_1
    //   834: getfield b : Lb/e/b/k/e;
    //   837: getfield c0 : [F
    //   840: aload_0
    //   841: getfield f : I
    //   844: faload
    //   845: fload_3
    //   846: fmul
    //   847: fload_2
    //   848: fdiv
    //   849: ldc 0.5
    //   851: fadd
    //   852: f2i
    //   853: istore #5
    //   855: goto -> 862
    //   858: iload #10
    //   860: istore #5
    //   862: aload_0
    //   863: getfield f : I
    //   866: ifne -> 963
    //   869: aload_1
    //   870: getfield b : Lb/e/b/k/e;
    //   873: astore #22
    //   875: aload #22
    //   877: getfield n : I
    //   880: istore #17
    //   882: aload #22
    //   884: getfield m : I
    //   887: istore #12
    //   889: aload_1
    //   890: getfield a : I
    //   893: iconst_1
    //   894: if_icmpne -> 914
    //   897: iload #5
    //   899: aload_1
    //   900: getfield e : Lb/e/b/k/m/g;
    //   903: getfield m : I
    //   906: invokestatic min : (II)I
    //   909: istore #11
    //   911: goto -> 918
    //   914: iload #5
    //   916: istore #11
    //   918: iload #12
    //   920: iload #11
    //   922: invokestatic max : (II)I
    //   925: istore #12
    //   927: iload #12
    //   929: istore #11
    //   931: iload #17
    //   933: ifle -> 945
    //   936: iload #17
    //   938: iload #12
    //   940: invokestatic min : (II)I
    //   943: istore #11
    //   945: iload #5
    //   947: istore #17
    //   949: iload #8
    //   951: istore #12
    //   953: iload #11
    //   955: iload #5
    //   957: if_icmpeq -> 1064
    //   960: goto -> 1054
    //   963: aload_1
    //   964: getfield b : Lb/e/b/k/e;
    //   967: astore #22
    //   969: aload #22
    //   971: getfield q : I
    //   974: istore #17
    //   976: aload #22
    //   978: getfield p : I
    //   981: istore #12
    //   983: aload_1
    //   984: getfield a : I
    //   987: iconst_1
    //   988: if_icmpne -> 1008
    //   991: iload #5
    //   993: aload_1
    //   994: getfield e : Lb/e/b/k/m/g;
    //   997: getfield m : I
    //   1000: invokestatic min : (II)I
    //   1003: istore #11
    //   1005: goto -> 1012
    //   1008: iload #5
    //   1010: istore #11
    //   1012: iload #12
    //   1014: iload #11
    //   1016: invokestatic max : (II)I
    //   1019: istore #12
    //   1021: iload #12
    //   1023: istore #11
    //   1025: iload #17
    //   1027: ifle -> 1039
    //   1030: iload #17
    //   1032: iload #12
    //   1034: invokestatic min : (II)I
    //   1037: istore #11
    //   1039: iload #5
    //   1041: istore #17
    //   1043: iload #8
    //   1045: istore #12
    //   1047: iload #11
    //   1049: iload #5
    //   1051: if_icmpeq -> 1064
    //   1054: iload #8
    //   1056: iconst_1
    //   1057: iadd
    //   1058: istore #12
    //   1060: iload #11
    //   1062: istore #17
    //   1064: aload_1
    //   1065: getfield e : Lb/e/b/k/m/g;
    //   1068: iload #17
    //   1070: invokevirtual a : (I)V
    //   1073: iload #12
    //   1075: istore #8
    //   1077: goto -> 1080
    //   1080: iload #16
    //   1082: iconst_1
    //   1083: iadd
    //   1084: istore #16
    //   1086: goto -> 772
    //   1089: iload #8
    //   1091: ifle -> 1237
    //   1094: iload #6
    //   1096: iload #8
    //   1098: isub
    //   1099: istore #10
    //   1101: iconst_0
    //   1102: istore #6
    //   1104: iconst_0
    //   1105: istore #5
    //   1107: iload #6
    //   1109: iload #19
    //   1111: if_icmpge -> 1230
    //   1114: aload_0
    //   1115: getfield k : Ljava/util/ArrayList;
    //   1118: iload #6
    //   1120: invokevirtual get : (I)Ljava/lang/Object;
    //   1123: checkcast b/e/b/k/m/m
    //   1126: astore_1
    //   1127: aload_1
    //   1128: getfield b : Lb/e/b/k/e;
    //   1131: invokevirtual y : ()I
    //   1134: bipush #8
    //   1136: if_icmpne -> 1142
    //   1139: goto -> 1221
    //   1142: iload #5
    //   1144: istore #7
    //   1146: iload #6
    //   1148: ifle -> 1174
    //   1151: iload #5
    //   1153: istore #7
    //   1155: iload #6
    //   1157: iload #13
    //   1159: if_icmplt -> 1174
    //   1162: iload #5
    //   1164: aload_1
    //   1165: getfield h : Lb/e/b/k/m/f;
    //   1168: getfield f : I
    //   1171: iadd
    //   1172: istore #7
    //   1174: iload #7
    //   1176: aload_1
    //   1177: getfield e : Lb/e/b/k/m/g;
    //   1180: getfield g : I
    //   1183: iadd
    //   1184: istore #7
    //   1186: iload #7
    //   1188: istore #5
    //   1190: iload #6
    //   1192: iload #18
    //   1194: if_icmpge -> 1221
    //   1197: iload #7
    //   1199: istore #5
    //   1201: iload #6
    //   1203: iload #14
    //   1205: if_icmpge -> 1221
    //   1208: iload #7
    //   1210: aload_1
    //   1211: getfield i : Lb/e/b/k/m/f;
    //   1214: getfield f : I
    //   1217: ineg
    //   1218: iadd
    //   1219: istore #5
    //   1221: iload #6
    //   1223: iconst_1
    //   1224: iadd
    //   1225: istore #6
    //   1227: goto -> 1107
    //   1230: iload #10
    //   1232: istore #6
    //   1234: goto -> 1241
    //   1237: iload #7
    //   1239: istore #5
    //   1241: aload_0
    //   1242: getfield l : I
    //   1245: iconst_2
    //   1246: if_icmpne -> 1274
    //   1249: iload #8
    //   1251: ifne -> 1274
    //   1254: aload_0
    //   1255: iconst_0
    //   1256: putfield l : I
    //   1259: iload #5
    //   1261: istore #7
    //   1263: iload #6
    //   1265: istore #10
    //   1267: iload #9
    //   1269: istore #5
    //   1271: goto -> 1293
    //   1274: iload #5
    //   1276: istore #7
    //   1278: iload #6
    //   1280: istore #10
    //   1282: iload #9
    //   1284: istore #5
    //   1286: goto -> 1293
    //   1289: iload #6
    //   1291: istore #10
    //   1293: iconst_0
    //   1294: istore #6
    //   1296: iconst_0
    //   1297: istore #8
    //   1299: iconst_0
    //   1300: istore #9
    //   1302: iload #7
    //   1304: iload #20
    //   1306: if_icmple -> 1314
    //   1309: aload_0
    //   1310: iconst_2
    //   1311: putfield l : I
    //   1314: iload #15
    //   1316: ifle -> 1336
    //   1319: iload #10
    //   1321: ifne -> 1336
    //   1324: iload #13
    //   1326: iload #14
    //   1328: if_icmpne -> 1336
    //   1331: aload_0
    //   1332: iconst_2
    //   1333: putfield l : I
    //   1336: aload_0
    //   1337: getfield l : I
    //   1340: istore #11
    //   1342: iload #11
    //   1344: iconst_1
    //   1345: if_icmpne -> 1769
    //   1348: iload #15
    //   1350: iconst_1
    //   1351: if_icmple -> 1369
    //   1354: iload #20
    //   1356: iload #7
    //   1358: isub
    //   1359: iload #15
    //   1361: iconst_1
    //   1362: isub
    //   1363: idiv
    //   1364: istore #6
    //   1366: goto -> 1390
    //   1369: iload #15
    //   1371: iconst_1
    //   1372: if_icmpne -> 1387
    //   1375: iload #20
    //   1377: iload #7
    //   1379: isub
    //   1380: iconst_2
    //   1381: idiv
    //   1382: istore #6
    //   1384: goto -> 1390
    //   1387: iconst_0
    //   1388: istore #6
    //   1390: iload #6
    //   1392: istore #8
    //   1394: iload #10
    //   1396: ifle -> 1402
    //   1399: iconst_0
    //   1400: istore #8
    //   1402: iload #9
    //   1404: istore #6
    //   1406: iload #5
    //   1408: istore #7
    //   1410: iload #6
    //   1412: iload #19
    //   1414: if_icmpge -> 2544
    //   1417: iload #21
    //   1419: ifeq -> 1434
    //   1422: iload #19
    //   1424: iload #6
    //   1426: iconst_1
    //   1427: iadd
    //   1428: isub
    //   1429: istore #5
    //   1431: goto -> 1438
    //   1434: iload #6
    //   1436: istore #5
    //   1438: aload_0
    //   1439: getfield k : Ljava/util/ArrayList;
    //   1442: iload #5
    //   1444: invokevirtual get : (I)Ljava/lang/Object;
    //   1447: checkcast b/e/b/k/m/m
    //   1450: astore #22
    //   1452: aload #22
    //   1454: getfield b : Lb/e/b/k/e;
    //   1457: invokevirtual y : ()I
    //   1460: bipush #8
    //   1462: if_icmpne -> 1492
    //   1465: aload #22
    //   1467: getfield h : Lb/e/b/k/m/f;
    //   1470: iload #7
    //   1472: invokevirtual a : (I)V
    //   1475: aload #22
    //   1477: getfield i : Lb/e/b/k/m/f;
    //   1480: iload #7
    //   1482: invokevirtual a : (I)V
    //   1485: iload #7
    //   1487: istore #5
    //   1489: goto -> 1756
    //   1492: iload #7
    //   1494: istore #5
    //   1496: iload #6
    //   1498: ifle -> 1523
    //   1501: iload #21
    //   1503: ifeq -> 1516
    //   1506: iload #7
    //   1508: iload #8
    //   1510: isub
    //   1511: istore #5
    //   1513: goto -> 1523
    //   1516: iload #7
    //   1518: iload #8
    //   1520: iadd
    //   1521: istore #5
    //   1523: iload #5
    //   1525: istore #7
    //   1527: iload #6
    //   1529: ifle -> 1575
    //   1532: iload #5
    //   1534: istore #7
    //   1536: iload #6
    //   1538: iload #13
    //   1540: if_icmplt -> 1575
    //   1543: aload #22
    //   1545: getfield h : Lb/e/b/k/m/f;
    //   1548: getfield f : I
    //   1551: istore #7
    //   1553: iload #21
    //   1555: ifeq -> 1568
    //   1558: iload #5
    //   1560: iload #7
    //   1562: isub
    //   1563: istore #7
    //   1565: goto -> 1575
    //   1568: iload #5
    //   1570: iload #7
    //   1572: iadd
    //   1573: istore #7
    //   1575: iload #21
    //   1577: ifeq -> 1589
    //   1580: aload #22
    //   1582: getfield i : Lb/e/b/k/m/f;
    //   1585: astore_1
    //   1586: goto -> 1595
    //   1589: aload #22
    //   1591: getfield h : Lb/e/b/k/m/f;
    //   1594: astore_1
    //   1595: aload_1
    //   1596: iload #7
    //   1598: invokevirtual a : (I)V
    //   1601: aload #22
    //   1603: getfield e : Lb/e/b/k/m/g;
    //   1606: astore_1
    //   1607: aload_1
    //   1608: getfield g : I
    //   1611: istore #9
    //   1613: iload #9
    //   1615: istore #5
    //   1617: aload #22
    //   1619: getfield d : Lb/e/b/k/e$b;
    //   1622: getstatic b/e/b/k/e$b.e : Lb/e/b/k/e$b;
    //   1625: if_acmpne -> 1647
    //   1628: iload #9
    //   1630: istore #5
    //   1632: aload #22
    //   1634: getfield a : I
    //   1637: iconst_1
    //   1638: if_icmpne -> 1647
    //   1641: aload_1
    //   1642: getfield m : I
    //   1645: istore #5
    //   1647: iload #21
    //   1649: ifeq -> 1662
    //   1652: iload #7
    //   1654: iload #5
    //   1656: isub
    //   1657: istore #7
    //   1659: goto -> 1669
    //   1662: iload #7
    //   1664: iload #5
    //   1666: iadd
    //   1667: istore #7
    //   1669: iload #21
    //   1671: ifeq -> 1683
    //   1674: aload #22
    //   1676: getfield h : Lb/e/b/k/m/f;
    //   1679: astore_1
    //   1680: goto -> 1689
    //   1683: aload #22
    //   1685: getfield i : Lb/e/b/k/m/f;
    //   1688: astore_1
    //   1689: aload_1
    //   1690: iload #7
    //   1692: invokevirtual a : (I)V
    //   1695: aload #22
    //   1697: iconst_1
    //   1698: putfield g : Z
    //   1701: iload #7
    //   1703: istore #5
    //   1705: iload #6
    //   1707: iload #18
    //   1709: if_icmpge -> 1756
    //   1712: iload #7
    //   1714: istore #5
    //   1716: iload #6
    //   1718: iload #14
    //   1720: if_icmpge -> 1756
    //   1723: aload #22
    //   1725: getfield i : Lb/e/b/k/m/f;
    //   1728: getfield f : I
    //   1731: ineg
    //   1732: istore #5
    //   1734: iload #21
    //   1736: ifeq -> 1749
    //   1739: iload #7
    //   1741: iload #5
    //   1743: isub
    //   1744: istore #5
    //   1746: goto -> 1756
    //   1749: iload #7
    //   1751: iload #5
    //   1753: iadd
    //   1754: istore #5
    //   1756: iload #6
    //   1758: iconst_1
    //   1759: iadd
    //   1760: istore #6
    //   1762: iload #5
    //   1764: istore #7
    //   1766: goto -> 1410
    //   1769: iload #11
    //   1771: ifne -> 2135
    //   1774: iload #20
    //   1776: iload #7
    //   1778: isub
    //   1779: iload #15
    //   1781: iconst_1
    //   1782: iadd
    //   1783: idiv
    //   1784: istore #8
    //   1786: iload #10
    //   1788: ifle -> 1794
    //   1791: iconst_0
    //   1792: istore #8
    //   1794: iload #6
    //   1796: iload #19
    //   1798: if_icmpge -> 2544
    //   1801: iload #21
    //   1803: ifeq -> 1818
    //   1806: iload #19
    //   1808: iload #6
    //   1810: iconst_1
    //   1811: iadd
    //   1812: isub
    //   1813: istore #7
    //   1815: goto -> 1822
    //   1818: iload #6
    //   1820: istore #7
    //   1822: aload_0
    //   1823: getfield k : Ljava/util/ArrayList;
    //   1826: iload #7
    //   1828: invokevirtual get : (I)Ljava/lang/Object;
    //   1831: checkcast b/e/b/k/m/m
    //   1834: astore #22
    //   1836: aload #22
    //   1838: getfield b : Lb/e/b/k/e;
    //   1841: invokevirtual y : ()I
    //   1844: bipush #8
    //   1846: if_icmpne -> 1872
    //   1849: aload #22
    //   1851: getfield h : Lb/e/b/k/m/f;
    //   1854: iload #5
    //   1856: invokevirtual a : (I)V
    //   1859: aload #22
    //   1861: getfield i : Lb/e/b/k/m/f;
    //   1864: iload #5
    //   1866: invokevirtual a : (I)V
    //   1869: goto -> 2126
    //   1872: iload #21
    //   1874: ifeq -> 1887
    //   1877: iload #5
    //   1879: iload #8
    //   1881: isub
    //   1882: istore #7
    //   1884: goto -> 1894
    //   1887: iload #5
    //   1889: iload #8
    //   1891: iadd
    //   1892: istore #7
    //   1894: iload #7
    //   1896: istore #5
    //   1898: iload #6
    //   1900: ifle -> 1946
    //   1903: iload #7
    //   1905: istore #5
    //   1907: iload #6
    //   1909: iload #13
    //   1911: if_icmplt -> 1946
    //   1914: aload #22
    //   1916: getfield h : Lb/e/b/k/m/f;
    //   1919: getfield f : I
    //   1922: istore #5
    //   1924: iload #21
    //   1926: ifeq -> 1939
    //   1929: iload #7
    //   1931: iload #5
    //   1933: isub
    //   1934: istore #5
    //   1936: goto -> 1946
    //   1939: iload #7
    //   1941: iload #5
    //   1943: iadd
    //   1944: istore #5
    //   1946: iload #21
    //   1948: ifeq -> 1960
    //   1951: aload #22
    //   1953: getfield i : Lb/e/b/k/m/f;
    //   1956: astore_1
    //   1957: goto -> 1966
    //   1960: aload #22
    //   1962: getfield h : Lb/e/b/k/m/f;
    //   1965: astore_1
    //   1966: aload_1
    //   1967: iload #5
    //   1969: invokevirtual a : (I)V
    //   1972: aload #22
    //   1974: getfield e : Lb/e/b/k/m/g;
    //   1977: astore_1
    //   1978: aload_1
    //   1979: getfield g : I
    //   1982: istore #9
    //   1984: iload #9
    //   1986: istore #7
    //   1988: aload #22
    //   1990: getfield d : Lb/e/b/k/e$b;
    //   1993: getstatic b/e/b/k/e$b.e : Lb/e/b/k/e$b;
    //   1996: if_acmpne -> 2023
    //   1999: iload #9
    //   2001: istore #7
    //   2003: aload #22
    //   2005: getfield a : I
    //   2008: iconst_1
    //   2009: if_icmpne -> 2023
    //   2012: iload #9
    //   2014: aload_1
    //   2015: getfield m : I
    //   2018: invokestatic min : (II)I
    //   2021: istore #7
    //   2023: iload #21
    //   2025: ifeq -> 2038
    //   2028: iload #5
    //   2030: iload #7
    //   2032: isub
    //   2033: istore #7
    //   2035: goto -> 2045
    //   2038: iload #5
    //   2040: iload #7
    //   2042: iadd
    //   2043: istore #7
    //   2045: iload #21
    //   2047: ifeq -> 2059
    //   2050: aload #22
    //   2052: getfield h : Lb/e/b/k/m/f;
    //   2055: astore_1
    //   2056: goto -> 2065
    //   2059: aload #22
    //   2061: getfield i : Lb/e/b/k/m/f;
    //   2064: astore_1
    //   2065: aload_1
    //   2066: iload #7
    //   2068: invokevirtual a : (I)V
    //   2071: iload #7
    //   2073: istore #5
    //   2075: iload #6
    //   2077: iload #18
    //   2079: if_icmpge -> 2126
    //   2082: iload #7
    //   2084: istore #5
    //   2086: iload #6
    //   2088: iload #14
    //   2090: if_icmpge -> 2126
    //   2093: aload #22
    //   2095: getfield i : Lb/e/b/k/m/f;
    //   2098: getfield f : I
    //   2101: ineg
    //   2102: istore #5
    //   2104: iload #21
    //   2106: ifeq -> 2119
    //   2109: iload #7
    //   2111: iload #5
    //   2113: isub
    //   2114: istore #5
    //   2116: goto -> 2126
    //   2119: iload #7
    //   2121: iload #5
    //   2123: iadd
    //   2124: istore #5
    //   2126: iload #6
    //   2128: iconst_1
    //   2129: iadd
    //   2130: istore #6
    //   2132: goto -> 1794
    //   2135: iload #11
    //   2137: iconst_2
    //   2138: if_icmpne -> 2544
    //   2141: aload_0
    //   2142: getfield f : I
    //   2145: ifne -> 2159
    //   2148: aload_0
    //   2149: getfield b : Lb/e/b/k/e;
    //   2152: invokevirtual k : ()F
    //   2155: fstore_2
    //   2156: goto -> 2167
    //   2159: aload_0
    //   2160: getfield b : Lb/e/b/k/e;
    //   2163: invokevirtual u : ()F
    //   2166: fstore_2
    //   2167: fload_2
    //   2168: fstore_3
    //   2169: iload #21
    //   2171: ifeq -> 2178
    //   2174: fconst_1
    //   2175: fload_2
    //   2176: fsub
    //   2177: fstore_3
    //   2178: iload #20
    //   2180: iload #7
    //   2182: isub
    //   2183: i2f
    //   2184: fload_3
    //   2185: fmul
    //   2186: ldc 0.5
    //   2188: fadd
    //   2189: f2i
    //   2190: istore #6
    //   2192: iload #6
    //   2194: iflt -> 2202
    //   2197: iload #10
    //   2199: ifle -> 2205
    //   2202: iconst_0
    //   2203: istore #6
    //   2205: iload #21
    //   2207: ifeq -> 2224
    //   2210: iload #5
    //   2212: iload #6
    //   2214: isub
    //   2215: istore #5
    //   2217: iload #8
    //   2219: istore #6
    //   2221: goto -> 2235
    //   2224: iload #5
    //   2226: iload #6
    //   2228: iadd
    //   2229: istore #5
    //   2231: iload #8
    //   2233: istore #6
    //   2235: iload #6
    //   2237: iload #19
    //   2239: if_icmpge -> 2544
    //   2242: iload #21
    //   2244: ifeq -> 2259
    //   2247: iload #19
    //   2249: iload #6
    //   2251: iconst_1
    //   2252: iadd
    //   2253: isub
    //   2254: istore #7
    //   2256: goto -> 2263
    //   2259: iload #6
    //   2261: istore #7
    //   2263: aload_0
    //   2264: getfield k : Ljava/util/ArrayList;
    //   2267: iload #7
    //   2269: invokevirtual get : (I)Ljava/lang/Object;
    //   2272: checkcast b/e/b/k/m/m
    //   2275: astore #22
    //   2277: aload #22
    //   2279: getfield b : Lb/e/b/k/e;
    //   2282: invokevirtual y : ()I
    //   2285: bipush #8
    //   2287: if_icmpne -> 2313
    //   2290: aload #22
    //   2292: getfield h : Lb/e/b/k/m/f;
    //   2295: iload #5
    //   2297: invokevirtual a : (I)V
    //   2300: aload #22
    //   2302: getfield i : Lb/e/b/k/m/f;
    //   2305: iload #5
    //   2307: invokevirtual a : (I)V
    //   2310: goto -> 2535
    //   2313: iload #5
    //   2315: istore #7
    //   2317: iload #6
    //   2319: ifle -> 2365
    //   2322: iload #5
    //   2324: istore #7
    //   2326: iload #6
    //   2328: iload #13
    //   2330: if_icmplt -> 2365
    //   2333: aload #22
    //   2335: getfield h : Lb/e/b/k/m/f;
    //   2338: getfield f : I
    //   2341: istore #7
    //   2343: iload #21
    //   2345: ifeq -> 2358
    //   2348: iload #5
    //   2350: iload #7
    //   2352: isub
    //   2353: istore #7
    //   2355: goto -> 2365
    //   2358: iload #5
    //   2360: iload #7
    //   2362: iadd
    //   2363: istore #7
    //   2365: iload #21
    //   2367: ifeq -> 2379
    //   2370: aload #22
    //   2372: getfield i : Lb/e/b/k/m/f;
    //   2375: astore_1
    //   2376: goto -> 2385
    //   2379: aload #22
    //   2381: getfield h : Lb/e/b/k/m/f;
    //   2384: astore_1
    //   2385: aload_1
    //   2386: iload #7
    //   2388: invokevirtual a : (I)V
    //   2391: aload #22
    //   2393: getfield e : Lb/e/b/k/m/g;
    //   2396: astore_1
    //   2397: aload_1
    //   2398: getfield g : I
    //   2401: istore #5
    //   2403: aload #22
    //   2405: getfield d : Lb/e/b/k/e$b;
    //   2408: getstatic b/e/b/k/e$b.e : Lb/e/b/k/e$b;
    //   2411: if_acmpne -> 2432
    //   2414: aload #22
    //   2416: getfield a : I
    //   2419: iconst_1
    //   2420: if_icmpne -> 2432
    //   2423: aload_1
    //   2424: getfield m : I
    //   2427: istore #5
    //   2429: goto -> 2432
    //   2432: iload #21
    //   2434: ifeq -> 2447
    //   2437: iload #7
    //   2439: iload #5
    //   2441: isub
    //   2442: istore #7
    //   2444: goto -> 2454
    //   2447: iload #7
    //   2449: iload #5
    //   2451: iadd
    //   2452: istore #7
    //   2454: iload #21
    //   2456: ifeq -> 2468
    //   2459: aload #22
    //   2461: getfield h : Lb/e/b/k/m/f;
    //   2464: astore_1
    //   2465: goto -> 2474
    //   2468: aload #22
    //   2470: getfield i : Lb/e/b/k/m/f;
    //   2473: astore_1
    //   2474: aload_1
    //   2475: iload #7
    //   2477: invokevirtual a : (I)V
    //   2480: iload #7
    //   2482: istore #5
    //   2484: iload #6
    //   2486: iload #18
    //   2488: if_icmpge -> 2535
    //   2491: iload #7
    //   2493: istore #5
    //   2495: iload #6
    //   2497: iload #14
    //   2499: if_icmpge -> 2535
    //   2502: aload #22
    //   2504: getfield i : Lb/e/b/k/m/f;
    //   2507: getfield f : I
    //   2510: ineg
    //   2511: istore #5
    //   2513: iload #21
    //   2515: ifeq -> 2528
    //   2518: iload #7
    //   2520: iload #5
    //   2522: isub
    //   2523: istore #5
    //   2525: goto -> 2535
    //   2528: iload #7
    //   2530: iload #5
    //   2532: iadd
    //   2533: istore #5
    //   2535: iload #6
    //   2537: iconst_1
    //   2538: iadd
    //   2539: istore #6
    //   2541: goto -> 2235
    //   2544: return
  }
  
  public void b() {
    for (int i = 0; i < this.k.size(); i++)
      ((m)this.k.get(i)).b(); 
  }
  
  void c() {
    this.c = null;
    Iterator<m> iterator = this.k.iterator();
    while (iterator.hasNext())
      ((m)iterator.next()).c(); 
  }
  
  public long d() {
    int j = this.k.size();
    long l = 0L;
    for (int i = 0; i < j; i++) {
      m m1 = this.k.get(i);
      l = l + m1.h.f + m1.d() + m1.i.f;
    } 
    return l;
  }
  
  boolean f() {
    int j = this.k.size();
    for (int i = 0; i < j; i++) {
      if (!((m)this.k.get(i)).f())
        return false; 
    } 
    return true;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("ChainRun ");
    if (this.f == 0) {
      str = "horizontal : ";
    } else {
      str = "vertical : ";
    } 
    stringBuilder.append(str);
    String str = stringBuilder.toString();
    for (m m1 : this.k) {
      StringBuilder stringBuilder2 = new StringBuilder();
      stringBuilder2.append(str);
      stringBuilder2.append("<");
      str = stringBuilder2.toString();
      stringBuilder2 = new StringBuilder();
      stringBuilder2.append(str);
      stringBuilder2.append(m1);
      str = stringBuilder2.toString();
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(str);
      stringBuilder1.append("> ");
      str = stringBuilder1.toString();
    } 
    return str;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/e/b/k/m/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */