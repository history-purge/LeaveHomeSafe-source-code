package b.e.b.k.m;

import b.e.b.k.e;

public class j extends m {
  private static int[] k = new int[2];
  
  public j(e parame) {
    super(parame);
    this.h.e = f.a.f;
    this.i.e = f.a.g;
    this.f = 0;
  }
  
  private void a(int[] paramArrayOfint, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, int paramInt5) {
    paramInt1 = paramInt2 - paramInt1;
    paramInt2 = paramInt4 - paramInt3;
    if (paramInt5 != -1) {
      if (paramInt5 != 0) {
        if (paramInt5 != 1)
          return; 
        paramInt2 = (int)(paramInt1 * paramFloat + 0.5F);
        paramArrayOfint[0] = paramInt1;
        paramArrayOfint[1] = paramInt2;
        return;
      } 
      paramArrayOfint[0] = (int)(paramInt2 * paramFloat + 0.5F);
      paramArrayOfint[1] = paramInt2;
      return;
    } 
    paramInt3 = (int)(paramInt2 * paramFloat + 0.5F);
    paramInt4 = (int)(paramInt1 / paramFloat + 0.5F);
    if (paramInt3 <= paramInt1) {
      paramArrayOfint[0] = paramInt3;
      paramArrayOfint[1] = paramInt2;
      return;
    } 
    if (paramInt4 <= paramInt2) {
      paramArrayOfint[0] = paramInt1;
      paramArrayOfint[1] = paramInt4;
    } 
  }
  
  void a() {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : Lb/e/b/k/e;
    //   4: astore #5
    //   6: aload #5
    //   8: getfield a : Z
    //   11: ifeq -> 26
    //   14: aload_0
    //   15: getfield e : Lb/e/b/k/m/g;
    //   18: aload #5
    //   20: invokevirtual z : ()I
    //   23: invokevirtual a : (I)V
    //   26: aload_0
    //   27: getfield e : Lb/e/b/k/m/g;
    //   30: getfield j : Z
    //   33: ifne -> 226
    //   36: aload_0
    //   37: aload_0
    //   38: getfield b : Lb/e/b/k/e;
    //   41: invokevirtual m : ()Lb/e/b/k/e$b;
    //   44: putfield d : Lb/e/b/k/e$b;
    //   47: aload_0
    //   48: getfield d : Lb/e/b/k/e$b;
    //   51: astore #5
    //   53: aload #5
    //   55: getstatic b/e/b/k/e$b.e : Lb/e/b/k/e$b;
    //   58: if_acmpeq -> 326
    //   61: aload #5
    //   63: getstatic b/e/b/k/e$b.f : Lb/e/b/k/e$b;
    //   66: if_acmpne -> 199
    //   69: aload_0
    //   70: getfield b : Lb/e/b/k/e;
    //   73: invokevirtual s : ()Lb/e/b/k/e;
    //   76: astore #5
    //   78: aload #5
    //   80: ifnull -> 94
    //   83: aload #5
    //   85: invokevirtual m : ()Lb/e/b/k/e$b;
    //   88: getstatic b/e/b/k/e$b.c : Lb/e/b/k/e$b;
    //   91: if_acmpeq -> 105
    //   94: aload #5
    //   96: invokevirtual m : ()Lb/e/b/k/e$b;
    //   99: getstatic b/e/b/k/e$b.f : Lb/e/b/k/e$b;
    //   102: if_acmpne -> 199
    //   105: aload #5
    //   107: invokevirtual z : ()I
    //   110: istore_1
    //   111: aload_0
    //   112: getfield b : Lb/e/b/k/e;
    //   115: getfield y : Lb/e/b/k/d;
    //   118: invokevirtual a : ()I
    //   121: istore_2
    //   122: aload_0
    //   123: getfield b : Lb/e/b/k/e;
    //   126: getfield A : Lb/e/b/k/d;
    //   129: invokevirtual a : ()I
    //   132: istore_3
    //   133: aload_0
    //   134: aload_0
    //   135: getfield h : Lb/e/b/k/m/f;
    //   138: aload #5
    //   140: getfield d : Lb/e/b/k/m/j;
    //   143: getfield h : Lb/e/b/k/m/f;
    //   146: aload_0
    //   147: getfield b : Lb/e/b/k/e;
    //   150: getfield y : Lb/e/b/k/d;
    //   153: invokevirtual a : ()I
    //   156: invokevirtual a : (Lb/e/b/k/m/f;Lb/e/b/k/m/f;I)V
    //   159: aload_0
    //   160: aload_0
    //   161: getfield i : Lb/e/b/k/m/f;
    //   164: aload #5
    //   166: getfield d : Lb/e/b/k/m/j;
    //   169: getfield i : Lb/e/b/k/m/f;
    //   172: aload_0
    //   173: getfield b : Lb/e/b/k/e;
    //   176: getfield A : Lb/e/b/k/d;
    //   179: invokevirtual a : ()I
    //   182: ineg
    //   183: invokevirtual a : (Lb/e/b/k/m/f;Lb/e/b/k/m/f;I)V
    //   186: aload_0
    //   187: getfield e : Lb/e/b/k/m/g;
    //   190: iload_1
    //   191: iload_2
    //   192: isub
    //   193: iload_3
    //   194: isub
    //   195: invokevirtual a : (I)V
    //   198: return
    //   199: aload_0
    //   200: getfield d : Lb/e/b/k/e$b;
    //   203: getstatic b/e/b/k/e$b.c : Lb/e/b/k/e$b;
    //   206: if_acmpne -> 326
    //   209: aload_0
    //   210: getfield e : Lb/e/b/k/m/g;
    //   213: aload_0
    //   214: getfield b : Lb/e/b/k/e;
    //   217: invokevirtual z : ()I
    //   220: invokevirtual a : (I)V
    //   223: goto -> 326
    //   226: aload_0
    //   227: getfield d : Lb/e/b/k/e$b;
    //   230: getstatic b/e/b/k/e$b.f : Lb/e/b/k/e$b;
    //   233: if_acmpne -> 326
    //   236: aload_0
    //   237: getfield b : Lb/e/b/k/e;
    //   240: invokevirtual s : ()Lb/e/b/k/e;
    //   243: astore #5
    //   245: aload #5
    //   247: ifnull -> 261
    //   250: aload #5
    //   252: invokevirtual m : ()Lb/e/b/k/e$b;
    //   255: getstatic b/e/b/k/e$b.c : Lb/e/b/k/e$b;
    //   258: if_acmpeq -> 272
    //   261: aload #5
    //   263: invokevirtual m : ()Lb/e/b/k/e$b;
    //   266: getstatic b/e/b/k/e$b.f : Lb/e/b/k/e$b;
    //   269: if_acmpne -> 326
    //   272: aload_0
    //   273: aload_0
    //   274: getfield h : Lb/e/b/k/m/f;
    //   277: aload #5
    //   279: getfield d : Lb/e/b/k/m/j;
    //   282: getfield h : Lb/e/b/k/m/f;
    //   285: aload_0
    //   286: getfield b : Lb/e/b/k/e;
    //   289: getfield y : Lb/e/b/k/d;
    //   292: invokevirtual a : ()I
    //   295: invokevirtual a : (Lb/e/b/k/m/f;Lb/e/b/k/m/f;I)V
    //   298: aload_0
    //   299: aload_0
    //   300: getfield i : Lb/e/b/k/m/f;
    //   303: aload #5
    //   305: getfield d : Lb/e/b/k/m/j;
    //   308: getfield i : Lb/e/b/k/m/f;
    //   311: aload_0
    //   312: getfield b : Lb/e/b/k/e;
    //   315: getfield A : Lb/e/b/k/d;
    //   318: invokevirtual a : ()I
    //   321: ineg
    //   322: invokevirtual a : (Lb/e/b/k/m/f;Lb/e/b/k/m/f;I)V
    //   325: return
    //   326: aload_0
    //   327: getfield e : Lb/e/b/k/m/g;
    //   330: getfield j : Z
    //   333: istore #4
    //   335: iconst_1
    //   336: istore_1
    //   337: iload #4
    //   339: ifeq -> 761
    //   342: aload_0
    //   343: getfield b : Lb/e/b/k/e;
    //   346: astore #5
    //   348: aload #5
    //   350: getfield a : Z
    //   353: ifeq -> 761
    //   356: aload #5
    //   358: getfield G : [Lb/e/b/k/d;
    //   361: astore #6
    //   363: aload #6
    //   365: iconst_0
    //   366: aaload
    //   367: getfield d : Lb/e/b/k/d;
    //   370: ifnull -> 532
    //   373: aload #6
    //   375: iconst_1
    //   376: aaload
    //   377: getfield d : Lb/e/b/k/d;
    //   380: ifnull -> 532
    //   383: aload #5
    //   385: invokevirtual D : ()Z
    //   388: ifeq -> 430
    //   391: aload_0
    //   392: getfield h : Lb/e/b/k/m/f;
    //   395: aload_0
    //   396: getfield b : Lb/e/b/k/e;
    //   399: getfield G : [Lb/e/b/k/d;
    //   402: iconst_0
    //   403: aaload
    //   404: invokevirtual a : ()I
    //   407: putfield f : I
    //   410: aload_0
    //   411: getfield i : Lb/e/b/k/m/f;
    //   414: astore #5
    //   416: aload_0
    //   417: getfield b : Lb/e/b/k/e;
    //   420: getfield G : [Lb/e/b/k/d;
    //   423: iconst_1
    //   424: aaload
    //   425: astore #6
    //   427: goto -> 1433
    //   430: aload_0
    //   431: aload_0
    //   432: getfield b : Lb/e/b/k/e;
    //   435: getfield G : [Lb/e/b/k/d;
    //   438: iconst_0
    //   439: aaload
    //   440: invokevirtual a : (Lb/e/b/k/d;)Lb/e/b/k/m/f;
    //   443: astore #5
    //   445: aload #5
    //   447: ifnull -> 472
    //   450: aload_0
    //   451: aload_0
    //   452: getfield h : Lb/e/b/k/m/f;
    //   455: aload #5
    //   457: aload_0
    //   458: getfield b : Lb/e/b/k/e;
    //   461: getfield G : [Lb/e/b/k/d;
    //   464: iconst_0
    //   465: aaload
    //   466: invokevirtual a : ()I
    //   469: invokevirtual a : (Lb/e/b/k/m/f;Lb/e/b/k/m/f;I)V
    //   472: aload_0
    //   473: aload_0
    //   474: getfield b : Lb/e/b/k/e;
    //   477: getfield G : [Lb/e/b/k/d;
    //   480: iconst_1
    //   481: aaload
    //   482: invokevirtual a : (Lb/e/b/k/d;)Lb/e/b/k/m/f;
    //   485: astore #5
    //   487: aload #5
    //   489: ifnull -> 515
    //   492: aload_0
    //   493: aload_0
    //   494: getfield i : Lb/e/b/k/m/f;
    //   497: aload #5
    //   499: aload_0
    //   500: getfield b : Lb/e/b/k/e;
    //   503: getfield G : [Lb/e/b/k/d;
    //   506: iconst_1
    //   507: aaload
    //   508: invokevirtual a : ()I
    //   511: ineg
    //   512: invokevirtual a : (Lb/e/b/k/m/f;Lb/e/b/k/m/f;I)V
    //   515: aload_0
    //   516: getfield h : Lb/e/b/k/m/f;
    //   519: iconst_1
    //   520: putfield b : Z
    //   523: aload_0
    //   524: getfield i : Lb/e/b/k/m/f;
    //   527: iconst_1
    //   528: putfield b : Z
    //   531: return
    //   532: aload_0
    //   533: getfield b : Lb/e/b/k/e;
    //   536: astore #5
    //   538: aload #5
    //   540: getfield G : [Lb/e/b/k/d;
    //   543: astore #6
    //   545: aload #6
    //   547: iconst_0
    //   548: aaload
    //   549: getfield d : Lb/e/b/k/d;
    //   552: ifnull -> 595
    //   555: aload_0
    //   556: aload #6
    //   558: iconst_0
    //   559: aaload
    //   560: invokevirtual a : (Lb/e/b/k/d;)Lb/e/b/k/m/f;
    //   563: astore #5
    //   565: aload #5
    //   567: ifnull -> 1696
    //   570: aload_0
    //   571: aload_0
    //   572: getfield h : Lb/e/b/k/m/f;
    //   575: aload #5
    //   577: aload_0
    //   578: getfield b : Lb/e/b/k/e;
    //   581: getfield G : [Lb/e/b/k/d;
    //   584: iconst_0
    //   585: aaload
    //   586: invokevirtual a : ()I
    //   589: invokevirtual a : (Lb/e/b/k/m/f;Lb/e/b/k/m/f;I)V
    //   592: goto -> 731
    //   595: aload #6
    //   597: iconst_1
    //   598: aaload
    //   599: getfield d : Lb/e/b/k/d;
    //   602: ifnull -> 667
    //   605: aload_0
    //   606: aload #6
    //   608: iconst_1
    //   609: aaload
    //   610: invokevirtual a : (Lb/e/b/k/d;)Lb/e/b/k/m/f;
    //   613: astore #5
    //   615: aload #5
    //   617: ifnull -> 1696
    //   620: aload_0
    //   621: aload_0
    //   622: getfield i : Lb/e/b/k/m/f;
    //   625: aload #5
    //   627: aload_0
    //   628: getfield b : Lb/e/b/k/e;
    //   631: getfield G : [Lb/e/b/k/d;
    //   634: iconst_1
    //   635: aaload
    //   636: invokevirtual a : ()I
    //   639: ineg
    //   640: invokevirtual a : (Lb/e/b/k/m/f;Lb/e/b/k/m/f;I)V
    //   643: aload_0
    //   644: getfield h : Lb/e/b/k/m/f;
    //   647: astore #5
    //   649: aload_0
    //   650: getfield i : Lb/e/b/k/m/f;
    //   653: astore #6
    //   655: aload_0
    //   656: getfield e : Lb/e/b/k/m/g;
    //   659: getfield g : I
    //   662: ineg
    //   663: istore_1
    //   664: goto -> 751
    //   667: aload #5
    //   669: instanceof b/e/b/k/h
    //   672: ifne -> 1696
    //   675: aload #5
    //   677: invokevirtual s : ()Lb/e/b/k/e;
    //   680: ifnull -> 1696
    //   683: aload_0
    //   684: getfield b : Lb/e/b/k/e;
    //   687: getstatic b/e/b/k/d$b.i : Lb/e/b/k/d$b;
    //   690: invokevirtual a : (Lb/e/b/k/d$b;)Lb/e/b/k/d;
    //   693: getfield d : Lb/e/b/k/d;
    //   696: ifnonnull -> 1696
    //   699: aload_0
    //   700: getfield b : Lb/e/b/k/e;
    //   703: invokevirtual s : ()Lb/e/b/k/e;
    //   706: getfield d : Lb/e/b/k/m/j;
    //   709: getfield h : Lb/e/b/k/m/f;
    //   712: astore #5
    //   714: aload_0
    //   715: aload_0
    //   716: getfield h : Lb/e/b/k/m/f;
    //   719: aload #5
    //   721: aload_0
    //   722: getfield b : Lb/e/b/k/e;
    //   725: invokevirtual A : ()I
    //   728: invokevirtual a : (Lb/e/b/k/m/f;Lb/e/b/k/m/f;I)V
    //   731: aload_0
    //   732: getfield i : Lb/e/b/k/m/f;
    //   735: astore #5
    //   737: aload_0
    //   738: getfield h : Lb/e/b/k/m/f;
    //   741: astore #6
    //   743: aload_0
    //   744: getfield e : Lb/e/b/k/m/g;
    //   747: getfield g : I
    //   750: istore_1
    //   751: aload_0
    //   752: aload #5
    //   754: aload #6
    //   756: iload_1
    //   757: invokevirtual a : (Lb/e/b/k/m/f;Lb/e/b/k/m/f;I)V
    //   760: return
    //   761: aload_0
    //   762: getfield d : Lb/e/b/k/e$b;
    //   765: getstatic b/e/b/k/e$b.e : Lb/e/b/k/e$b;
    //   768: if_acmpne -> 1356
    //   771: aload_0
    //   772: getfield b : Lb/e/b/k/e;
    //   775: astore #5
    //   777: aload #5
    //   779: getfield j : I
    //   782: istore_2
    //   783: iload_2
    //   784: iconst_2
    //   785: if_icmpeq -> 1249
    //   788: iload_2
    //   789: iconst_3
    //   790: if_icmpeq -> 796
    //   793: goto -> 1356
    //   796: aload #5
    //   798: getfield k : I
    //   801: iconst_3
    //   802: if_icmpne -> 1080
    //   805: aload_0
    //   806: getfield h : Lb/e/b/k/m/f;
    //   809: aload_0
    //   810: putfield a : Lb/e/b/k/m/d;
    //   813: aload_0
    //   814: getfield i : Lb/e/b/k/m/f;
    //   817: aload_0
    //   818: putfield a : Lb/e/b/k/m/d;
    //   821: aload #5
    //   823: getfield e : Lb/e/b/k/m/l;
    //   826: astore #6
    //   828: aload #6
    //   830: getfield h : Lb/e/b/k/m/f;
    //   833: aload_0
    //   834: putfield a : Lb/e/b/k/m/d;
    //   837: aload #6
    //   839: getfield i : Lb/e/b/k/m/f;
    //   842: aload_0
    //   843: putfield a : Lb/e/b/k/m/d;
    //   846: aload_0
    //   847: getfield e : Lb/e/b/k/m/g;
    //   850: aload_0
    //   851: putfield a : Lb/e/b/k/m/d;
    //   854: aload #5
    //   856: invokevirtual F : ()Z
    //   859: ifeq -> 1008
    //   862: aload_0
    //   863: getfield e : Lb/e/b/k/m/g;
    //   866: getfield l : Ljava/util/List;
    //   869: aload_0
    //   870: getfield b : Lb/e/b/k/e;
    //   873: getfield e : Lb/e/b/k/m/l;
    //   876: getfield e : Lb/e/b/k/m/g;
    //   879: invokeinterface add : (Ljava/lang/Object;)Z
    //   884: pop
    //   885: aload_0
    //   886: getfield b : Lb/e/b/k/e;
    //   889: getfield e : Lb/e/b/k/m/l;
    //   892: getfield e : Lb/e/b/k/m/g;
    //   895: getfield k : Ljava/util/List;
    //   898: aload_0
    //   899: getfield e : Lb/e/b/k/m/g;
    //   902: invokeinterface add : (Ljava/lang/Object;)Z
    //   907: pop
    //   908: aload_0
    //   909: getfield b : Lb/e/b/k/e;
    //   912: getfield e : Lb/e/b/k/m/l;
    //   915: astore #5
    //   917: aload #5
    //   919: getfield e : Lb/e/b/k/m/g;
    //   922: aload_0
    //   923: putfield a : Lb/e/b/k/m/d;
    //   926: aload_0
    //   927: getfield e : Lb/e/b/k/m/g;
    //   930: getfield l : Ljava/util/List;
    //   933: aload #5
    //   935: getfield h : Lb/e/b/k/m/f;
    //   938: invokeinterface add : (Ljava/lang/Object;)Z
    //   943: pop
    //   944: aload_0
    //   945: getfield e : Lb/e/b/k/m/g;
    //   948: getfield l : Ljava/util/List;
    //   951: aload_0
    //   952: getfield b : Lb/e/b/k/e;
    //   955: getfield e : Lb/e/b/k/m/l;
    //   958: getfield i : Lb/e/b/k/m/f;
    //   961: invokeinterface add : (Ljava/lang/Object;)Z
    //   966: pop
    //   967: aload_0
    //   968: getfield b : Lb/e/b/k/e;
    //   971: getfield e : Lb/e/b/k/m/l;
    //   974: getfield h : Lb/e/b/k/m/f;
    //   977: getfield k : Ljava/util/List;
    //   980: aload_0
    //   981: getfield e : Lb/e/b/k/m/g;
    //   984: invokeinterface add : (Ljava/lang/Object;)Z
    //   989: pop
    //   990: aload_0
    //   991: getfield b : Lb/e/b/k/e;
    //   994: getfield e : Lb/e/b/k/m/l;
    //   997: getfield i : Lb/e/b/k/m/f;
    //   1000: getfield k : Ljava/util/List;
    //   1003: astore #5
    //   1005: goto -> 1240
    //   1008: aload_0
    //   1009: getfield b : Lb/e/b/k/e;
    //   1012: invokevirtual D : ()Z
    //   1015: ifeq -> 1065
    //   1018: aload_0
    //   1019: getfield b : Lb/e/b/k/e;
    //   1022: getfield e : Lb/e/b/k/m/l;
    //   1025: getfield e : Lb/e/b/k/m/g;
    //   1028: getfield l : Ljava/util/List;
    //   1031: aload_0
    //   1032: getfield e : Lb/e/b/k/m/g;
    //   1035: invokeinterface add : (Ljava/lang/Object;)Z
    //   1040: pop
    //   1041: aload_0
    //   1042: getfield e : Lb/e/b/k/m/g;
    //   1045: getfield k : Ljava/util/List;
    //   1048: astore #5
    //   1050: aload_0
    //   1051: getfield b : Lb/e/b/k/e;
    //   1054: getfield e : Lb/e/b/k/m/l;
    //   1057: getfield e : Lb/e/b/k/m/g;
    //   1060: astore #6
    //   1062: goto -> 1346
    //   1065: aload_0
    //   1066: getfield b : Lb/e/b/k/e;
    //   1069: getfield e : Lb/e/b/k/m/l;
    //   1072: getfield e : Lb/e/b/k/m/g;
    //   1075: astore #5
    //   1077: goto -> 1233
    //   1080: aload #5
    //   1082: getfield e : Lb/e/b/k/m/l;
    //   1085: getfield e : Lb/e/b/k/m/g;
    //   1088: astore #5
    //   1090: aload_0
    //   1091: getfield e : Lb/e/b/k/m/g;
    //   1094: getfield l : Ljava/util/List;
    //   1097: aload #5
    //   1099: invokeinterface add : (Ljava/lang/Object;)Z
    //   1104: pop
    //   1105: aload #5
    //   1107: getfield k : Ljava/util/List;
    //   1110: aload_0
    //   1111: getfield e : Lb/e/b/k/m/g;
    //   1114: invokeinterface add : (Ljava/lang/Object;)Z
    //   1119: pop
    //   1120: aload_0
    //   1121: getfield b : Lb/e/b/k/e;
    //   1124: getfield e : Lb/e/b/k/m/l;
    //   1127: getfield h : Lb/e/b/k/m/f;
    //   1130: getfield k : Ljava/util/List;
    //   1133: aload_0
    //   1134: getfield e : Lb/e/b/k/m/g;
    //   1137: invokeinterface add : (Ljava/lang/Object;)Z
    //   1142: pop
    //   1143: aload_0
    //   1144: getfield b : Lb/e/b/k/e;
    //   1147: getfield e : Lb/e/b/k/m/l;
    //   1150: getfield i : Lb/e/b/k/m/f;
    //   1153: getfield k : Ljava/util/List;
    //   1156: aload_0
    //   1157: getfield e : Lb/e/b/k/m/g;
    //   1160: invokeinterface add : (Ljava/lang/Object;)Z
    //   1165: pop
    //   1166: aload_0
    //   1167: getfield e : Lb/e/b/k/m/g;
    //   1170: astore #5
    //   1172: aload #5
    //   1174: iconst_1
    //   1175: putfield b : Z
    //   1178: aload #5
    //   1180: getfield k : Ljava/util/List;
    //   1183: aload_0
    //   1184: getfield h : Lb/e/b/k/m/f;
    //   1187: invokeinterface add : (Ljava/lang/Object;)Z
    //   1192: pop
    //   1193: aload_0
    //   1194: getfield e : Lb/e/b/k/m/g;
    //   1197: getfield k : Ljava/util/List;
    //   1200: aload_0
    //   1201: getfield i : Lb/e/b/k/m/f;
    //   1204: invokeinterface add : (Ljava/lang/Object;)Z
    //   1209: pop
    //   1210: aload_0
    //   1211: getfield h : Lb/e/b/k/m/f;
    //   1214: getfield l : Ljava/util/List;
    //   1217: aload_0
    //   1218: getfield e : Lb/e/b/k/m/g;
    //   1221: invokeinterface add : (Ljava/lang/Object;)Z
    //   1226: pop
    //   1227: aload_0
    //   1228: getfield i : Lb/e/b/k/m/f;
    //   1231: astore #5
    //   1233: aload #5
    //   1235: getfield l : Ljava/util/List;
    //   1238: astore #5
    //   1240: aload_0
    //   1241: getfield e : Lb/e/b/k/m/g;
    //   1244: astore #6
    //   1246: goto -> 1346
    //   1249: aload #5
    //   1251: invokevirtual s : ()Lb/e/b/k/e;
    //   1254: astore #5
    //   1256: aload #5
    //   1258: ifnonnull -> 1264
    //   1261: goto -> 1356
    //   1264: aload #5
    //   1266: getfield e : Lb/e/b/k/m/l;
    //   1269: getfield e : Lb/e/b/k/m/g;
    //   1272: astore #5
    //   1274: aload_0
    //   1275: getfield e : Lb/e/b/k/m/g;
    //   1278: getfield l : Ljava/util/List;
    //   1281: aload #5
    //   1283: invokeinterface add : (Ljava/lang/Object;)Z
    //   1288: pop
    //   1289: aload #5
    //   1291: getfield k : Ljava/util/List;
    //   1294: aload_0
    //   1295: getfield e : Lb/e/b/k/m/g;
    //   1298: invokeinterface add : (Ljava/lang/Object;)Z
    //   1303: pop
    //   1304: aload_0
    //   1305: getfield e : Lb/e/b/k/m/g;
    //   1308: astore #5
    //   1310: aload #5
    //   1312: iconst_1
    //   1313: putfield b : Z
    //   1316: aload #5
    //   1318: getfield k : Ljava/util/List;
    //   1321: aload_0
    //   1322: getfield h : Lb/e/b/k/m/f;
    //   1325: invokeinterface add : (Ljava/lang/Object;)Z
    //   1330: pop
    //   1331: aload_0
    //   1332: getfield e : Lb/e/b/k/m/g;
    //   1335: getfield k : Ljava/util/List;
    //   1338: astore #5
    //   1340: aload_0
    //   1341: getfield i : Lb/e/b/k/m/f;
    //   1344: astore #6
    //   1346: aload #5
    //   1348: aload #6
    //   1350: invokeinterface add : (Ljava/lang/Object;)Z
    //   1355: pop
    //   1356: aload_0
    //   1357: getfield b : Lb/e/b/k/e;
    //   1360: astore #5
    //   1362: aload #5
    //   1364: getfield G : [Lb/e/b/k/d;
    //   1367: astore #6
    //   1369: aload #6
    //   1371: iconst_0
    //   1372: aaload
    //   1373: getfield d : Lb/e/b/k/d;
    //   1376: ifnull -> 1495
    //   1379: aload #6
    //   1381: iconst_1
    //   1382: aaload
    //   1383: getfield d : Lb/e/b/k/d;
    //   1386: ifnull -> 1495
    //   1389: aload #5
    //   1391: invokevirtual D : ()Z
    //   1394: ifeq -> 1445
    //   1397: aload_0
    //   1398: getfield h : Lb/e/b/k/m/f;
    //   1401: aload_0
    //   1402: getfield b : Lb/e/b/k/e;
    //   1405: getfield G : [Lb/e/b/k/d;
    //   1408: iconst_0
    //   1409: aaload
    //   1410: invokevirtual a : ()I
    //   1413: putfield f : I
    //   1416: aload_0
    //   1417: getfield i : Lb/e/b/k/m/f;
    //   1420: astore #5
    //   1422: aload_0
    //   1423: getfield b : Lb/e/b/k/e;
    //   1426: getfield G : [Lb/e/b/k/d;
    //   1429: iconst_1
    //   1430: aaload
    //   1431: astore #6
    //   1433: aload #5
    //   1435: aload #6
    //   1437: invokevirtual a : ()I
    //   1440: ineg
    //   1441: putfield f : I
    //   1444: return
    //   1445: aload_0
    //   1446: aload_0
    //   1447: getfield b : Lb/e/b/k/e;
    //   1450: getfield G : [Lb/e/b/k/d;
    //   1453: iconst_0
    //   1454: aaload
    //   1455: invokevirtual a : (Lb/e/b/k/d;)Lb/e/b/k/m/f;
    //   1458: astore #5
    //   1460: aload_0
    //   1461: aload_0
    //   1462: getfield b : Lb/e/b/k/e;
    //   1465: getfield G : [Lb/e/b/k/d;
    //   1468: iconst_1
    //   1469: aaload
    //   1470: invokevirtual a : (Lb/e/b/k/d;)Lb/e/b/k/m/f;
    //   1473: astore #6
    //   1475: aload #5
    //   1477: aload_0
    //   1478: invokevirtual b : (Lb/e/b/k/m/d;)V
    //   1481: aload #6
    //   1483: aload_0
    //   1484: invokevirtual b : (Lb/e/b/k/m/d;)V
    //   1487: aload_0
    //   1488: getstatic b/e/b/k/m/m$b.f : Lb/e/b/k/m/m$b;
    //   1491: putfield j : Lb/e/b/k/m/m$b;
    //   1494: return
    //   1495: aload_0
    //   1496: getfield b : Lb/e/b/k/e;
    //   1499: astore #5
    //   1501: aload #5
    //   1503: getfield G : [Lb/e/b/k/d;
    //   1506: astore #6
    //   1508: aload #6
    //   1510: iconst_0
    //   1511: aaload
    //   1512: getfield d : Lb/e/b/k/d;
    //   1515: ifnull -> 1558
    //   1518: aload_0
    //   1519: aload #6
    //   1521: iconst_0
    //   1522: aaload
    //   1523: invokevirtual a : (Lb/e/b/k/d;)Lb/e/b/k/m/f;
    //   1526: astore #5
    //   1528: aload #5
    //   1530: ifnull -> 1696
    //   1533: aload_0
    //   1534: aload_0
    //   1535: getfield h : Lb/e/b/k/m/f;
    //   1538: aload #5
    //   1540: aload_0
    //   1541: getfield b : Lb/e/b/k/e;
    //   1544: getfield G : [Lb/e/b/k/d;
    //   1547: iconst_0
    //   1548: aaload
    //   1549: invokevirtual a : ()I
    //   1552: invokevirtual a : (Lb/e/b/k/m/f;Lb/e/b/k/m/f;I)V
    //   1555: goto -> 1671
    //   1558: aload #6
    //   1560: iconst_1
    //   1561: aaload
    //   1562: getfield d : Lb/e/b/k/d;
    //   1565: ifnull -> 1623
    //   1568: aload_0
    //   1569: aload #6
    //   1571: iconst_1
    //   1572: aaload
    //   1573: invokevirtual a : (Lb/e/b/k/d;)Lb/e/b/k/m/f;
    //   1576: astore #5
    //   1578: aload #5
    //   1580: ifnull -> 1696
    //   1583: aload_0
    //   1584: aload_0
    //   1585: getfield i : Lb/e/b/k/m/f;
    //   1588: aload #5
    //   1590: aload_0
    //   1591: getfield b : Lb/e/b/k/e;
    //   1594: getfield G : [Lb/e/b/k/d;
    //   1597: iconst_1
    //   1598: aaload
    //   1599: invokevirtual a : ()I
    //   1602: ineg
    //   1603: invokevirtual a : (Lb/e/b/k/m/f;Lb/e/b/k/m/f;I)V
    //   1606: aload_0
    //   1607: getfield h : Lb/e/b/k/m/f;
    //   1610: astore #5
    //   1612: aload_0
    //   1613: getfield i : Lb/e/b/k/m/f;
    //   1616: astore #6
    //   1618: iconst_m1
    //   1619: istore_1
    //   1620: goto -> 1683
    //   1623: aload #5
    //   1625: instanceof b/e/b/k/h
    //   1628: ifne -> 1696
    //   1631: aload #5
    //   1633: invokevirtual s : ()Lb/e/b/k/e;
    //   1636: ifnull -> 1696
    //   1639: aload_0
    //   1640: getfield b : Lb/e/b/k/e;
    //   1643: invokevirtual s : ()Lb/e/b/k/e;
    //   1646: getfield d : Lb/e/b/k/m/j;
    //   1649: getfield h : Lb/e/b/k/m/f;
    //   1652: astore #5
    //   1654: aload_0
    //   1655: aload_0
    //   1656: getfield h : Lb/e/b/k/m/f;
    //   1659: aload #5
    //   1661: aload_0
    //   1662: getfield b : Lb/e/b/k/e;
    //   1665: invokevirtual A : ()I
    //   1668: invokevirtual a : (Lb/e/b/k/m/f;Lb/e/b/k/m/f;I)V
    //   1671: aload_0
    //   1672: getfield i : Lb/e/b/k/m/f;
    //   1675: astore #5
    //   1677: aload_0
    //   1678: getfield h : Lb/e/b/k/m/f;
    //   1681: astore #6
    //   1683: aload_0
    //   1684: aload #5
    //   1686: aload #6
    //   1688: iload_1
    //   1689: aload_0
    //   1690: getfield e : Lb/e/b/k/m/g;
    //   1693: invokevirtual a : (Lb/e/b/k/m/f;Lb/e/b/k/m/f;ILb/e/b/k/m/g;)V
    //   1696: return
  }
  
  public void a(d paramd) {
    // Byte code:
    //   0: getstatic b/e/b/k/m/j$a.a : [I
    //   3: aload_0
    //   4: getfield j : Lb/e/b/k/m/m$b;
    //   7: invokevirtual ordinal : ()I
    //   10: iaload
    //   11: istore_3
    //   12: iload_3
    //   13: iconst_1
    //   14: if_icmpeq -> 61
    //   17: iload_3
    //   18: iconst_2
    //   19: if_icmpeq -> 53
    //   22: iload_3
    //   23: iconst_3
    //   24: if_icmpeq -> 30
    //   27: goto -> 66
    //   30: aload_0
    //   31: getfield b : Lb/e/b/k/e;
    //   34: astore #12
    //   36: aload_0
    //   37: aload_1
    //   38: aload #12
    //   40: getfield y : Lb/e/b/k/d;
    //   43: aload #12
    //   45: getfield A : Lb/e/b/k/d;
    //   48: iconst_0
    //   49: invokevirtual a : (Lb/e/b/k/m/d;Lb/e/b/k/d;Lb/e/b/k/d;I)V
    //   52: return
    //   53: aload_0
    //   54: aload_1
    //   55: invokevirtual b : (Lb/e/b/k/m/d;)V
    //   58: goto -> 66
    //   61: aload_0
    //   62: aload_1
    //   63: invokevirtual c : (Lb/e/b/k/m/d;)V
    //   66: aload_0
    //   67: getfield e : Lb/e/b/k/m/g;
    //   70: getfield j : Z
    //   73: ifne -> 1471
    //   76: aload_0
    //   77: getfield d : Lb/e/b/k/e$b;
    //   80: getstatic b/e/b/k/e$b.e : Lb/e/b/k/e$b;
    //   83: if_acmpne -> 1471
    //   86: aload_0
    //   87: getfield b : Lb/e/b/k/e;
    //   90: astore_1
    //   91: aload_1
    //   92: getfield j : I
    //   95: istore_3
    //   96: iload_3
    //   97: iconst_2
    //   98: if_icmpeq -> 1419
    //   101: iload_3
    //   102: iconst_3
    //   103: if_icmpeq -> 109
    //   106: goto -> 1471
    //   109: aload_1
    //   110: getfield k : I
    //   113: istore_3
    //   114: iload_3
    //   115: ifeq -> 206
    //   118: iload_3
    //   119: iconst_3
    //   120: if_icmpne -> 126
    //   123: goto -> 206
    //   126: aload_1
    //   127: invokevirtual i : ()I
    //   130: istore_3
    //   131: iload_3
    //   132: iconst_m1
    //   133: if_icmpeq -> 175
    //   136: iload_3
    //   137: ifeq -> 150
    //   140: iload_3
    //   141: iconst_1
    //   142: if_icmpeq -> 175
    //   145: iconst_0
    //   146: istore_3
    //   147: goto -> 1463
    //   150: aload_0
    //   151: getfield b : Lb/e/b/k/e;
    //   154: astore_1
    //   155: aload_1
    //   156: getfield e : Lb/e/b/k/m/l;
    //   159: getfield e : Lb/e/b/k/m/g;
    //   162: getfield g : I
    //   165: i2f
    //   166: aload_1
    //   167: invokevirtual h : ()F
    //   170: fdiv
    //   171: fstore_2
    //   172: goto -> 197
    //   175: aload_0
    //   176: getfield b : Lb/e/b/k/e;
    //   179: astore_1
    //   180: aload_1
    //   181: getfield e : Lb/e/b/k/m/l;
    //   184: getfield e : Lb/e/b/k/m/g;
    //   187: getfield g : I
    //   190: i2f
    //   191: aload_1
    //   192: invokevirtual h : ()F
    //   195: fmul
    //   196: fstore_2
    //   197: fload_2
    //   198: ldc 0.5
    //   200: fadd
    //   201: f2i
    //   202: istore_3
    //   203: goto -> 1463
    //   206: aload_0
    //   207: getfield b : Lb/e/b/k/e;
    //   210: astore #13
    //   212: aload #13
    //   214: getfield e : Lb/e/b/k/m/l;
    //   217: astore #12
    //   219: aload #12
    //   221: getfield h : Lb/e/b/k/m/f;
    //   224: astore_1
    //   225: aload #12
    //   227: getfield i : Lb/e/b/k/m/f;
    //   230: astore #12
    //   232: aload #13
    //   234: getfield y : Lb/e/b/k/d;
    //   237: getfield d : Lb/e/b/k/d;
    //   240: ifnull -> 248
    //   243: iconst_1
    //   244: istore_3
    //   245: goto -> 250
    //   248: iconst_0
    //   249: istore_3
    //   250: aload_0
    //   251: getfield b : Lb/e/b/k/e;
    //   254: getfield z : Lb/e/b/k/d;
    //   257: getfield d : Lb/e/b/k/d;
    //   260: ifnull -> 269
    //   263: iconst_1
    //   264: istore #4
    //   266: goto -> 272
    //   269: iconst_0
    //   270: istore #4
    //   272: aload_0
    //   273: getfield b : Lb/e/b/k/e;
    //   276: getfield A : Lb/e/b/k/d;
    //   279: getfield d : Lb/e/b/k/d;
    //   282: ifnull -> 291
    //   285: iconst_1
    //   286: istore #5
    //   288: goto -> 294
    //   291: iconst_0
    //   292: istore #5
    //   294: aload_0
    //   295: getfield b : Lb/e/b/k/e;
    //   298: getfield B : Lb/e/b/k/d;
    //   301: getfield d : Lb/e/b/k/d;
    //   304: ifnull -> 313
    //   307: iconst_1
    //   308: istore #6
    //   310: goto -> 316
    //   313: iconst_0
    //   314: istore #6
    //   316: aload_0
    //   317: getfield b : Lb/e/b/k/e;
    //   320: invokevirtual i : ()I
    //   323: istore #7
    //   325: iload_3
    //   326: ifeq -> 928
    //   329: iload #4
    //   331: ifeq -> 928
    //   334: iload #5
    //   336: ifeq -> 928
    //   339: iload #6
    //   341: ifeq -> 928
    //   344: aload_0
    //   345: getfield b : Lb/e/b/k/e;
    //   348: invokevirtual h : ()F
    //   351: fstore_2
    //   352: aload_1
    //   353: getfield j : Z
    //   356: ifeq -> 535
    //   359: aload #12
    //   361: getfield j : Z
    //   364: ifeq -> 535
    //   367: aload_0
    //   368: getfield h : Lb/e/b/k/m/f;
    //   371: astore #13
    //   373: aload #13
    //   375: getfield c : Z
    //   378: ifeq -> 534
    //   381: aload_0
    //   382: getfield i : Lb/e/b/k/m/f;
    //   385: getfield c : Z
    //   388: ifne -> 392
    //   391: return
    //   392: aload #13
    //   394: getfield l : Ljava/util/List;
    //   397: iconst_0
    //   398: invokeinterface get : (I)Ljava/lang/Object;
    //   403: checkcast b/e/b/k/m/f
    //   406: getfield g : I
    //   409: istore_3
    //   410: aload_0
    //   411: getfield h : Lb/e/b/k/m/f;
    //   414: getfield f : I
    //   417: istore #4
    //   419: aload_0
    //   420: getfield i : Lb/e/b/k/m/f;
    //   423: getfield l : Ljava/util/List;
    //   426: iconst_0
    //   427: invokeinterface get : (I)Ljava/lang/Object;
    //   432: checkcast b/e/b/k/m/f
    //   435: getfield g : I
    //   438: istore #5
    //   440: aload_0
    //   441: getfield i : Lb/e/b/k/m/f;
    //   444: getfield f : I
    //   447: istore #6
    //   449: aload_1
    //   450: getfield g : I
    //   453: istore #8
    //   455: aload_1
    //   456: getfield f : I
    //   459: istore #9
    //   461: aload #12
    //   463: getfield g : I
    //   466: istore #10
    //   468: aload #12
    //   470: getfield f : I
    //   473: istore #11
    //   475: aload_0
    //   476: getstatic b/e/b/k/m/j.k : [I
    //   479: iload_3
    //   480: iload #4
    //   482: iadd
    //   483: iload #5
    //   485: iload #6
    //   487: isub
    //   488: iload #8
    //   490: iload #9
    //   492: iadd
    //   493: iload #10
    //   495: iload #11
    //   497: isub
    //   498: fload_2
    //   499: iload #7
    //   501: invokespecial a : ([IIIIIFI)V
    //   504: aload_0
    //   505: getfield e : Lb/e/b/k/m/g;
    //   508: getstatic b/e/b/k/m/j.k : [I
    //   511: iconst_0
    //   512: iaload
    //   513: invokevirtual a : (I)V
    //   516: aload_0
    //   517: getfield b : Lb/e/b/k/e;
    //   520: getfield e : Lb/e/b/k/m/l;
    //   523: getfield e : Lb/e/b/k/m/g;
    //   526: getstatic b/e/b/k/m/j.k : [I
    //   529: iconst_1
    //   530: iaload
    //   531: invokevirtual a : (I)V
    //   534: return
    //   535: aload_0
    //   536: getfield h : Lb/e/b/k/m/f;
    //   539: astore #13
    //   541: aload #13
    //   543: getfield j : Z
    //   546: ifeq -> 719
    //   549: aload_0
    //   550: getfield i : Lb/e/b/k/m/f;
    //   553: astore #14
    //   555: aload #14
    //   557: getfield j : Z
    //   560: ifeq -> 719
    //   563: aload_1
    //   564: getfield c : Z
    //   567: ifeq -> 718
    //   570: aload #12
    //   572: getfield c : Z
    //   575: ifne -> 579
    //   578: return
    //   579: aload #13
    //   581: getfield g : I
    //   584: istore_3
    //   585: aload #13
    //   587: getfield f : I
    //   590: istore #4
    //   592: aload #14
    //   594: getfield g : I
    //   597: istore #5
    //   599: aload #14
    //   601: getfield f : I
    //   604: istore #6
    //   606: aload_1
    //   607: getfield l : Ljava/util/List;
    //   610: iconst_0
    //   611: invokeinterface get : (I)Ljava/lang/Object;
    //   616: checkcast b/e/b/k/m/f
    //   619: getfield g : I
    //   622: istore #8
    //   624: aload_1
    //   625: getfield f : I
    //   628: istore #9
    //   630: aload #12
    //   632: getfield l : Ljava/util/List;
    //   635: iconst_0
    //   636: invokeinterface get : (I)Ljava/lang/Object;
    //   641: checkcast b/e/b/k/m/f
    //   644: getfield g : I
    //   647: istore #10
    //   649: aload #12
    //   651: getfield f : I
    //   654: istore #11
    //   656: aload_0
    //   657: getstatic b/e/b/k/m/j.k : [I
    //   660: iload_3
    //   661: iload #4
    //   663: iadd
    //   664: iload #5
    //   666: iload #6
    //   668: isub
    //   669: iload #8
    //   671: iload #9
    //   673: iadd
    //   674: iload #10
    //   676: iload #11
    //   678: isub
    //   679: fload_2
    //   680: iload #7
    //   682: invokespecial a : ([IIIIIFI)V
    //   685: aload_0
    //   686: getfield e : Lb/e/b/k/m/g;
    //   689: getstatic b/e/b/k/m/j.k : [I
    //   692: iconst_0
    //   693: iaload
    //   694: invokevirtual a : (I)V
    //   697: aload_0
    //   698: getfield b : Lb/e/b/k/e;
    //   701: getfield e : Lb/e/b/k/m/l;
    //   704: getfield e : Lb/e/b/k/m/g;
    //   707: getstatic b/e/b/k/m/j.k : [I
    //   710: iconst_1
    //   711: iaload
    //   712: invokevirtual a : (I)V
    //   715: goto -> 719
    //   718: return
    //   719: aload_0
    //   720: getfield h : Lb/e/b/k/m/f;
    //   723: astore #13
    //   725: aload #13
    //   727: getfield c : Z
    //   730: ifeq -> 927
    //   733: aload_0
    //   734: getfield i : Lb/e/b/k/m/f;
    //   737: getfield c : Z
    //   740: ifeq -> 927
    //   743: aload_1
    //   744: getfield c : Z
    //   747: ifeq -> 927
    //   750: aload #12
    //   752: getfield c : Z
    //   755: ifne -> 759
    //   758: return
    //   759: aload #13
    //   761: getfield l : Ljava/util/List;
    //   764: iconst_0
    //   765: invokeinterface get : (I)Ljava/lang/Object;
    //   770: checkcast b/e/b/k/m/f
    //   773: getfield g : I
    //   776: istore_3
    //   777: aload_0
    //   778: getfield h : Lb/e/b/k/m/f;
    //   781: getfield f : I
    //   784: istore #4
    //   786: aload_0
    //   787: getfield i : Lb/e/b/k/m/f;
    //   790: getfield l : Ljava/util/List;
    //   793: iconst_0
    //   794: invokeinterface get : (I)Ljava/lang/Object;
    //   799: checkcast b/e/b/k/m/f
    //   802: getfield g : I
    //   805: istore #5
    //   807: aload_0
    //   808: getfield i : Lb/e/b/k/m/f;
    //   811: getfield f : I
    //   814: istore #6
    //   816: aload_1
    //   817: getfield l : Ljava/util/List;
    //   820: iconst_0
    //   821: invokeinterface get : (I)Ljava/lang/Object;
    //   826: checkcast b/e/b/k/m/f
    //   829: getfield g : I
    //   832: istore #8
    //   834: aload_1
    //   835: getfield f : I
    //   838: istore #9
    //   840: aload #12
    //   842: getfield l : Ljava/util/List;
    //   845: iconst_0
    //   846: invokeinterface get : (I)Ljava/lang/Object;
    //   851: checkcast b/e/b/k/m/f
    //   854: getfield g : I
    //   857: istore #10
    //   859: aload #12
    //   861: getfield f : I
    //   864: istore #11
    //   866: aload_0
    //   867: getstatic b/e/b/k/m/j.k : [I
    //   870: iload_3
    //   871: iload #4
    //   873: iadd
    //   874: iload #5
    //   876: iload #6
    //   878: isub
    //   879: iload #8
    //   881: iload #9
    //   883: iadd
    //   884: iload #10
    //   886: iload #11
    //   888: isub
    //   889: fload_2
    //   890: iload #7
    //   892: invokespecial a : ([IIIIIFI)V
    //   895: aload_0
    //   896: getfield e : Lb/e/b/k/m/g;
    //   899: getstatic b/e/b/k/m/j.k : [I
    //   902: iconst_0
    //   903: iaload
    //   904: invokevirtual a : (I)V
    //   907: aload_0
    //   908: getfield b : Lb/e/b/k/e;
    //   911: getfield e : Lb/e/b/k/m/l;
    //   914: getfield e : Lb/e/b/k/m/g;
    //   917: astore_1
    //   918: getstatic b/e/b/k/m/j.k : [I
    //   921: iconst_1
    //   922: iaload
    //   923: istore_3
    //   924: goto -> 1410
    //   927: return
    //   928: iload_3
    //   929: ifeq -> 1180
    //   932: iload #5
    //   934: ifeq -> 1180
    //   937: aload_0
    //   938: getfield h : Lb/e/b/k/m/f;
    //   941: getfield c : Z
    //   944: ifeq -> 1179
    //   947: aload_0
    //   948: getfield i : Lb/e/b/k/m/f;
    //   951: getfield c : Z
    //   954: ifne -> 958
    //   957: return
    //   958: aload_0
    //   959: getfield b : Lb/e/b/k/e;
    //   962: invokevirtual h : ()F
    //   965: fstore_2
    //   966: aload_0
    //   967: getfield h : Lb/e/b/k/m/f;
    //   970: getfield l : Ljava/util/List;
    //   973: iconst_0
    //   974: invokeinterface get : (I)Ljava/lang/Object;
    //   979: checkcast b/e/b/k/m/f
    //   982: getfield g : I
    //   985: aload_0
    //   986: getfield h : Lb/e/b/k/m/f;
    //   989: getfield f : I
    //   992: iadd
    //   993: istore_3
    //   994: aload_0
    //   995: getfield i : Lb/e/b/k/m/f;
    //   998: getfield l : Ljava/util/List;
    //   1001: iconst_0
    //   1002: invokeinterface get : (I)Ljava/lang/Object;
    //   1007: checkcast b/e/b/k/m/f
    //   1010: getfield g : I
    //   1013: aload_0
    //   1014: getfield i : Lb/e/b/k/m/f;
    //   1017: getfield f : I
    //   1020: isub
    //   1021: istore #4
    //   1023: iload #7
    //   1025: iconst_m1
    //   1026: if_icmpeq -> 1096
    //   1029: iload #7
    //   1031: ifeq -> 1096
    //   1034: iload #7
    //   1036: iconst_1
    //   1037: if_icmpeq -> 1043
    //   1040: goto -> 1471
    //   1043: aload_0
    //   1044: iload #4
    //   1046: iload_3
    //   1047: isub
    //   1048: iconst_0
    //   1049: invokevirtual a : (II)I
    //   1052: istore #4
    //   1054: iload #4
    //   1056: i2f
    //   1057: fload_2
    //   1058: fdiv
    //   1059: ldc 0.5
    //   1061: fadd
    //   1062: f2i
    //   1063: istore #6
    //   1065: aload_0
    //   1066: iload #6
    //   1068: iconst_1
    //   1069: invokevirtual a : (II)I
    //   1072: istore #5
    //   1074: iload #5
    //   1076: istore_3
    //   1077: iload #6
    //   1079: iload #5
    //   1081: if_icmpeq -> 1153
    //   1084: iload #5
    //   1086: i2f
    //   1087: fload_2
    //   1088: fmul
    //   1089: fstore_2
    //   1090: iload #5
    //   1092: istore_3
    //   1093: goto -> 1146
    //   1096: aload_0
    //   1097: iload #4
    //   1099: iload_3
    //   1100: isub
    //   1101: iconst_0
    //   1102: invokevirtual a : (II)I
    //   1105: istore #4
    //   1107: iload #4
    //   1109: i2f
    //   1110: fload_2
    //   1111: fmul
    //   1112: ldc 0.5
    //   1114: fadd
    //   1115: f2i
    //   1116: istore #6
    //   1118: aload_0
    //   1119: iload #6
    //   1121: iconst_1
    //   1122: invokevirtual a : (II)I
    //   1125: istore #5
    //   1127: iload #5
    //   1129: istore_3
    //   1130: iload #6
    //   1132: iload #5
    //   1134: if_icmpeq -> 1153
    //   1137: iload #5
    //   1139: i2f
    //   1140: fload_2
    //   1141: fdiv
    //   1142: fstore_2
    //   1143: iload #5
    //   1145: istore_3
    //   1146: fload_2
    //   1147: ldc 0.5
    //   1149: fadd
    //   1150: f2i
    //   1151: istore #4
    //   1153: aload_0
    //   1154: getfield e : Lb/e/b/k/m/g;
    //   1157: iload #4
    //   1159: invokevirtual a : (I)V
    //   1162: aload_0
    //   1163: getfield b : Lb/e/b/k/e;
    //   1166: getfield e : Lb/e/b/k/m/l;
    //   1169: getfield e : Lb/e/b/k/m/g;
    //   1172: iload_3
    //   1173: invokevirtual a : (I)V
    //   1176: goto -> 1471
    //   1179: return
    //   1180: iload #4
    //   1182: ifeq -> 1471
    //   1185: iload #6
    //   1187: ifeq -> 1471
    //   1190: aload_1
    //   1191: getfield c : Z
    //   1194: ifeq -> 1418
    //   1197: aload #12
    //   1199: getfield c : Z
    //   1202: ifne -> 1206
    //   1205: return
    //   1206: aload_0
    //   1207: getfield b : Lb/e/b/k/e;
    //   1210: invokevirtual h : ()F
    //   1213: fstore_2
    //   1214: aload_1
    //   1215: getfield l : Ljava/util/List;
    //   1218: iconst_0
    //   1219: invokeinterface get : (I)Ljava/lang/Object;
    //   1224: checkcast b/e/b/k/m/f
    //   1227: getfield g : I
    //   1230: aload_1
    //   1231: getfield f : I
    //   1234: iadd
    //   1235: istore_3
    //   1236: aload #12
    //   1238: getfield l : Ljava/util/List;
    //   1241: iconst_0
    //   1242: invokeinterface get : (I)Ljava/lang/Object;
    //   1247: checkcast b/e/b/k/m/f
    //   1250: getfield g : I
    //   1253: aload #12
    //   1255: getfield f : I
    //   1258: isub
    //   1259: istore #4
    //   1261: iload #7
    //   1263: iconst_m1
    //   1264: if_icmpeq -> 1334
    //   1267: iload #7
    //   1269: ifeq -> 1281
    //   1272: iload #7
    //   1274: iconst_1
    //   1275: if_icmpeq -> 1334
    //   1278: goto -> 1471
    //   1281: aload_0
    //   1282: iload #4
    //   1284: iload_3
    //   1285: isub
    //   1286: iconst_1
    //   1287: invokevirtual a : (II)I
    //   1290: istore_3
    //   1291: iload_3
    //   1292: i2f
    //   1293: fload_2
    //   1294: fmul
    //   1295: ldc 0.5
    //   1297: fadd
    //   1298: f2i
    //   1299: istore #6
    //   1301: aload_0
    //   1302: iload #6
    //   1304: iconst_0
    //   1305: invokevirtual a : (II)I
    //   1308: istore #5
    //   1310: iload #5
    //   1312: istore #4
    //   1314: iload #6
    //   1316: iload #5
    //   1318: if_icmpeq -> 1390
    //   1321: iload #5
    //   1323: i2f
    //   1324: fload_2
    //   1325: fdiv
    //   1326: fstore_2
    //   1327: iload #5
    //   1329: istore #4
    //   1331: goto -> 1384
    //   1334: aload_0
    //   1335: iload #4
    //   1337: iload_3
    //   1338: isub
    //   1339: iconst_1
    //   1340: invokevirtual a : (II)I
    //   1343: istore_3
    //   1344: iload_3
    //   1345: i2f
    //   1346: fload_2
    //   1347: fdiv
    //   1348: ldc 0.5
    //   1350: fadd
    //   1351: f2i
    //   1352: istore #6
    //   1354: aload_0
    //   1355: iload #6
    //   1357: iconst_0
    //   1358: invokevirtual a : (II)I
    //   1361: istore #5
    //   1363: iload #5
    //   1365: istore #4
    //   1367: iload #6
    //   1369: iload #5
    //   1371: if_icmpeq -> 1390
    //   1374: iload #5
    //   1376: i2f
    //   1377: fload_2
    //   1378: fmul
    //   1379: fstore_2
    //   1380: iload #5
    //   1382: istore #4
    //   1384: fload_2
    //   1385: ldc 0.5
    //   1387: fadd
    //   1388: f2i
    //   1389: istore_3
    //   1390: aload_0
    //   1391: getfield e : Lb/e/b/k/m/g;
    //   1394: iload #4
    //   1396: invokevirtual a : (I)V
    //   1399: aload_0
    //   1400: getfield b : Lb/e/b/k/e;
    //   1403: getfield e : Lb/e/b/k/m/l;
    //   1406: getfield e : Lb/e/b/k/m/g;
    //   1409: astore_1
    //   1410: aload_1
    //   1411: iload_3
    //   1412: invokevirtual a : (I)V
    //   1415: goto -> 1471
    //   1418: return
    //   1419: aload_1
    //   1420: invokevirtual s : ()Lb/e/b/k/e;
    //   1423: astore_1
    //   1424: aload_1
    //   1425: ifnull -> 1471
    //   1428: aload_1
    //   1429: getfield d : Lb/e/b/k/m/j;
    //   1432: getfield e : Lb/e/b/k/m/g;
    //   1435: astore_1
    //   1436: aload_1
    //   1437: getfield j : Z
    //   1440: ifeq -> 1471
    //   1443: aload_0
    //   1444: getfield b : Lb/e/b/k/e;
    //   1447: getfield o : F
    //   1450: fstore_2
    //   1451: aload_1
    //   1452: getfield g : I
    //   1455: i2f
    //   1456: fload_2
    //   1457: fmul
    //   1458: ldc 0.5
    //   1460: fadd
    //   1461: f2i
    //   1462: istore_3
    //   1463: aload_0
    //   1464: getfield e : Lb/e/b/k/m/g;
    //   1467: iload_3
    //   1468: invokevirtual a : (I)V
    //   1471: aload_0
    //   1472: getfield h : Lb/e/b/k/m/f;
    //   1475: astore_1
    //   1476: aload_1
    //   1477: getfield c : Z
    //   1480: ifeq -> 1998
    //   1483: aload_0
    //   1484: getfield i : Lb/e/b/k/m/f;
    //   1487: astore #12
    //   1489: aload #12
    //   1491: getfield c : Z
    //   1494: ifne -> 1498
    //   1497: return
    //   1498: aload_1
    //   1499: getfield j : Z
    //   1502: ifeq -> 1524
    //   1505: aload #12
    //   1507: getfield j : Z
    //   1510: ifeq -> 1524
    //   1513: aload_0
    //   1514: getfield e : Lb/e/b/k/m/g;
    //   1517: getfield j : Z
    //   1520: ifeq -> 1524
    //   1523: return
    //   1524: aload_0
    //   1525: getfield e : Lb/e/b/k/m/g;
    //   1528: getfield j : Z
    //   1531: ifne -> 1659
    //   1534: aload_0
    //   1535: getfield d : Lb/e/b/k/e$b;
    //   1538: getstatic b/e/b/k/e$b.e : Lb/e/b/k/e$b;
    //   1541: if_acmpne -> 1659
    //   1544: aload_0
    //   1545: getfield b : Lb/e/b/k/e;
    //   1548: astore_1
    //   1549: aload_1
    //   1550: getfield j : I
    //   1553: ifne -> 1659
    //   1556: aload_1
    //   1557: invokevirtual D : ()Z
    //   1560: ifne -> 1659
    //   1563: aload_0
    //   1564: getfield h : Lb/e/b/k/m/f;
    //   1567: getfield l : Ljava/util/List;
    //   1570: iconst_0
    //   1571: invokeinterface get : (I)Ljava/lang/Object;
    //   1576: checkcast b/e/b/k/m/f
    //   1579: astore #12
    //   1581: aload_0
    //   1582: getfield i : Lb/e/b/k/m/f;
    //   1585: getfield l : Ljava/util/List;
    //   1588: iconst_0
    //   1589: invokeinterface get : (I)Ljava/lang/Object;
    //   1594: checkcast b/e/b/k/m/f
    //   1597: astore_1
    //   1598: aload #12
    //   1600: getfield g : I
    //   1603: istore_3
    //   1604: aload_0
    //   1605: getfield h : Lb/e/b/k/m/f;
    //   1608: astore #12
    //   1610: iload_3
    //   1611: aload #12
    //   1613: getfield f : I
    //   1616: iadd
    //   1617: istore_3
    //   1618: aload_1
    //   1619: getfield g : I
    //   1622: aload_0
    //   1623: getfield i : Lb/e/b/k/m/f;
    //   1626: getfield f : I
    //   1629: iadd
    //   1630: istore #4
    //   1632: aload #12
    //   1634: iload_3
    //   1635: invokevirtual a : (I)V
    //   1638: aload_0
    //   1639: getfield i : Lb/e/b/k/m/f;
    //   1642: iload #4
    //   1644: invokevirtual a : (I)V
    //   1647: aload_0
    //   1648: getfield e : Lb/e/b/k/m/g;
    //   1651: iload #4
    //   1653: iload_3
    //   1654: isub
    //   1655: invokevirtual a : (I)V
    //   1658: return
    //   1659: aload_0
    //   1660: getfield e : Lb/e/b/k/m/g;
    //   1663: getfield j : Z
    //   1666: ifne -> 1840
    //   1669: aload_0
    //   1670: getfield d : Lb/e/b/k/e$b;
    //   1673: getstatic b/e/b/k/e$b.e : Lb/e/b/k/e$b;
    //   1676: if_acmpne -> 1840
    //   1679: aload_0
    //   1680: getfield a : I
    //   1683: iconst_1
    //   1684: if_icmpne -> 1840
    //   1687: aload_0
    //   1688: getfield h : Lb/e/b/k/m/f;
    //   1691: getfield l : Ljava/util/List;
    //   1694: invokeinterface size : ()I
    //   1699: ifle -> 1840
    //   1702: aload_0
    //   1703: getfield i : Lb/e/b/k/m/f;
    //   1706: getfield l : Ljava/util/List;
    //   1709: invokeinterface size : ()I
    //   1714: ifle -> 1840
    //   1717: aload_0
    //   1718: getfield h : Lb/e/b/k/m/f;
    //   1721: getfield l : Ljava/util/List;
    //   1724: iconst_0
    //   1725: invokeinterface get : (I)Ljava/lang/Object;
    //   1730: checkcast b/e/b/k/m/f
    //   1733: astore_1
    //   1734: aload_0
    //   1735: getfield i : Lb/e/b/k/m/f;
    //   1738: getfield l : Ljava/util/List;
    //   1741: iconst_0
    //   1742: invokeinterface get : (I)Ljava/lang/Object;
    //   1747: checkcast b/e/b/k/m/f
    //   1750: astore #12
    //   1752: aload_1
    //   1753: getfield g : I
    //   1756: istore_3
    //   1757: aload_0
    //   1758: getfield h : Lb/e/b/k/m/f;
    //   1761: getfield f : I
    //   1764: istore #4
    //   1766: aload #12
    //   1768: getfield g : I
    //   1771: aload_0
    //   1772: getfield i : Lb/e/b/k/m/f;
    //   1775: getfield f : I
    //   1778: iadd
    //   1779: iload_3
    //   1780: iload #4
    //   1782: iadd
    //   1783: isub
    //   1784: aload_0
    //   1785: getfield e : Lb/e/b/k/m/g;
    //   1788: getfield m : I
    //   1791: invokestatic min : (II)I
    //   1794: istore_3
    //   1795: aload_0
    //   1796: getfield b : Lb/e/b/k/e;
    //   1799: astore_1
    //   1800: aload_1
    //   1801: getfield n : I
    //   1804: istore #5
    //   1806: aload_1
    //   1807: getfield m : I
    //   1810: iload_3
    //   1811: invokestatic max : (II)I
    //   1814: istore #4
    //   1816: iload #4
    //   1818: istore_3
    //   1819: iload #5
    //   1821: ifle -> 1832
    //   1824: iload #5
    //   1826: iload #4
    //   1828: invokestatic min : (II)I
    //   1831: istore_3
    //   1832: aload_0
    //   1833: getfield e : Lb/e/b/k/m/g;
    //   1836: iload_3
    //   1837: invokevirtual a : (I)V
    //   1840: aload_0
    //   1841: getfield e : Lb/e/b/k/m/g;
    //   1844: getfield j : Z
    //   1847: ifne -> 1851
    //   1850: return
    //   1851: aload_0
    //   1852: getfield h : Lb/e/b/k/m/f;
    //   1855: getfield l : Ljava/util/List;
    //   1858: iconst_0
    //   1859: invokeinterface get : (I)Ljava/lang/Object;
    //   1864: checkcast b/e/b/k/m/f
    //   1867: astore_1
    //   1868: aload_0
    //   1869: getfield i : Lb/e/b/k/m/f;
    //   1872: getfield l : Ljava/util/List;
    //   1875: iconst_0
    //   1876: invokeinterface get : (I)Ljava/lang/Object;
    //   1881: checkcast b/e/b/k/m/f
    //   1884: astore #12
    //   1886: aload_1
    //   1887: getfield g : I
    //   1890: aload_0
    //   1891: getfield h : Lb/e/b/k/m/f;
    //   1894: getfield f : I
    //   1897: iadd
    //   1898: istore_3
    //   1899: aload #12
    //   1901: getfield g : I
    //   1904: aload_0
    //   1905: getfield i : Lb/e/b/k/m/f;
    //   1908: getfield f : I
    //   1911: iadd
    //   1912: istore #4
    //   1914: aload_0
    //   1915: getfield b : Lb/e/b/k/e;
    //   1918: invokevirtual k : ()F
    //   1921: fstore_2
    //   1922: aload_1
    //   1923: aload #12
    //   1925: if_acmpne -> 1943
    //   1928: aload_1
    //   1929: getfield g : I
    //   1932: istore_3
    //   1933: aload #12
    //   1935: getfield g : I
    //   1938: istore #4
    //   1940: ldc 0.5
    //   1942: fstore_2
    //   1943: aload_0
    //   1944: getfield e : Lb/e/b/k/m/g;
    //   1947: getfield g : I
    //   1950: istore #5
    //   1952: aload_0
    //   1953: getfield h : Lb/e/b/k/m/f;
    //   1956: iload_3
    //   1957: i2f
    //   1958: ldc 0.5
    //   1960: fadd
    //   1961: iload #4
    //   1963: iload_3
    //   1964: isub
    //   1965: iload #5
    //   1967: isub
    //   1968: i2f
    //   1969: fload_2
    //   1970: fmul
    //   1971: fadd
    //   1972: f2i
    //   1973: invokevirtual a : (I)V
    //   1976: aload_0
    //   1977: getfield i : Lb/e/b/k/m/f;
    //   1980: aload_0
    //   1981: getfield h : Lb/e/b/k/m/f;
    //   1984: getfield g : I
    //   1987: aload_0
    //   1988: getfield e : Lb/e/b/k/m/g;
    //   1991: getfield g : I
    //   1994: iadd
    //   1995: invokevirtual a : (I)V
    //   1998: return
  }
  
  public void b() {
    f f = this.h;
    if (f.j)
      this.b.q(f.g); 
  }
  
  void c() {
    this.c = null;
    this.h.a();
    this.i.a();
    this.e.a();
    this.g = false;
  }
  
  boolean f() {
    return (this.d == e.b.e) ? ((this.b.j == 0)) : true;
  }
  
  void g() {
    this.g = false;
    this.h.a();
    this.h.j = false;
    this.i.a();
    this.i.j = false;
    this.e.j = false;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("HorizontalRun ");
    stringBuilder.append(this.b.g());
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/e/b/k/m/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */