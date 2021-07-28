package b.e.b.k;

import b.e.b.c;
import b.e.b.d;
import b.e.b.i;
import b.e.b.k.m.c;
import b.e.b.k.m.j;
import b.e.b.k.m.l;
import b.e.b.k.m.m;
import java.util.ArrayList;

public class e {
  public static float f0 = 0.5F;
  
  public d A = new d(this, d.b.f);
  
  public d B = new d(this, d.b.g);
  
  d C = new d(this, d.b.h);
  
  d D = new d(this, d.b.j);
  
  d E = new d(this, d.b.k);
  
  d F = new d(this, d.b.i);
  
  public d[] G = new d[] { this.y, this.A, this.z, this.B, this.C, this.F };
  
  protected ArrayList<d> H = new ArrayList<d>();
  
  private boolean[] I = new boolean[2];
  
  public b[] J;
  
  public e K;
  
  int L;
  
  int M;
  
  public float N;
  
  protected int O;
  
  protected int P;
  
  protected int Q;
  
  int R;
  
  protected int S;
  
  protected int T;
  
  float U;
  
  float V;
  
  private Object W;
  
  private int X;
  
  private String Y;
  
  private String Z;
  
  public boolean a = false;
  
  int a0;
  
  public c b;
  
  int b0;
  
  public c c;
  
  public float[] c0;
  
  public j d = new j(this);
  
  protected e[] d0;
  
  public l e = new l(this);
  
  protected e[] e0;
  
  public boolean[] f = new boolean[] { true, true };
  
  public int[] g = new int[] { 0, 0, 0, 0 };
  
  public int h = -1;
  
  public int i = -1;
  
  public int j = 0;
  
  public int k = 0;
  
  public int[] l = new int[2];
  
  public int m = 0;
  
  public int n = 0;
  
  public float o = 1.0F;
  
  public int p = 0;
  
  public int q = 0;
  
  public float r = 1.0F;
  
  int s = -1;
  
  float t = 1.0F;
  
  private int[] u = new int[] { Integer.MAX_VALUE, Integer.MAX_VALUE };
  
  private float v = 0.0F;
  
  private boolean w = false;
  
  private boolean x;
  
  public d y = new d(this, d.b.d);
  
  public d z = new d(this, d.b.e);
  
  public e() {
    b b1 = b.c;
    this.J = new b[] { b1, b1 };
    this.K = null;
    this.L = 0;
    this.M = 0;
    this.N = 0.0F;
    this.O = -1;
    this.P = 0;
    this.Q = 0;
    this.R = 0;
    float f = f0;
    this.U = f;
    this.V = f;
    this.X = 0;
    this.Y = null;
    this.Z = null;
    this.a0 = 0;
    this.b0 = 0;
    this.c0 = new float[] { -1.0F, -1.0F };
    this.d0 = new e[] { null, null };
    this.e0 = new e[] { null, null };
    H();
  }
  
  private void H() {
    this.H.add(this.y);
    this.H.add(this.z);
    this.H.add(this.A);
    this.H.add(this.B);
    this.H.add(this.D);
    this.H.add(this.E);
    this.H.add(this.F);
    this.H.add(this.C);
  }
  
  private void a(d paramd, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, i parami1, i parami2, b paramb, boolean paramBoolean5, d paramd1, d paramd2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, boolean paramBoolean6, boolean paramBoolean7, boolean paramBoolean8, boolean paramBoolean9, int paramInt5, int paramInt6, int paramInt7, int paramInt8, float paramFloat2, boolean paramBoolean10) {
    // Byte code:
    //   0: iload #23
    //   2: istore #27
    //   4: aload_1
    //   5: aload #10
    //   7: invokevirtual a : (Ljava/lang/Object;)Lb/e/b/i;
    //   10: astore #38
    //   12: aload_1
    //   13: aload #11
    //   15: invokevirtual a : (Ljava/lang/Object;)Lb/e/b/i;
    //   18: astore #39
    //   20: aload_1
    //   21: aload #10
    //   23: invokevirtual e : ()Lb/e/b/k/d;
    //   26: invokevirtual a : (Ljava/lang/Object;)Lb/e/b/i;
    //   29: astore #40
    //   31: aload_1
    //   32: aload #11
    //   34: invokevirtual e : ()Lb/e/b/k/d;
    //   37: invokevirtual a : (Ljava/lang/Object;)Lb/e/b/i;
    //   40: astore #35
    //   42: invokestatic h : ()Lb/e/b/e;
    //   45: ifnull -> 65
    //   48: invokestatic h : ()Lb/e/b/e;
    //   51: astore #36
    //   53: aload #36
    //   55: aload #36
    //   57: getfield w : J
    //   60: lconst_1
    //   61: ladd
    //   62: putfield w : J
    //   65: aload #10
    //   67: invokevirtual h : ()Z
    //   70: istore #32
    //   72: aload #11
    //   74: invokevirtual h : ()Z
    //   77: istore #33
    //   79: aload_0
    //   80: getfield F : Lb/e/b/k/d;
    //   83: invokevirtual h : ()Z
    //   86: istore #34
    //   88: iload #32
    //   90: ifeq -> 99
    //   93: iconst_1
    //   94: istore #23
    //   96: goto -> 102
    //   99: iconst_0
    //   100: istore #23
    //   102: iload #23
    //   104: istore #28
    //   106: iload #33
    //   108: ifeq -> 117
    //   111: iload #23
    //   113: iconst_1
    //   114: iadd
    //   115: istore #28
    //   117: iload #28
    //   119: istore #23
    //   121: iload #34
    //   123: ifeq -> 132
    //   126: iload #28
    //   128: iconst_1
    //   129: iadd
    //   130: istore #23
    //   132: iload #17
    //   134: ifeq -> 143
    //   137: iconst_3
    //   138: istore #21
    //   140: goto -> 143
    //   143: getstatic b/e/b/k/e$a.b : [I
    //   146: aload #8
    //   148: invokevirtual ordinal : ()I
    //   151: iaload
    //   152: istore #28
    //   154: iload #28
    //   156: iconst_1
    //   157: if_icmpeq -> 178
    //   160: iload #28
    //   162: iconst_2
    //   163: if_icmpeq -> 178
    //   166: iload #28
    //   168: iconst_3
    //   169: if_icmpeq -> 178
    //   172: iload #28
    //   174: iconst_4
    //   175: if_icmpeq -> 184
    //   178: iconst_0
    //   179: istore #28
    //   181: goto -> 196
    //   184: iload #21
    //   186: iconst_4
    //   187: if_icmpne -> 193
    //   190: goto -> 178
    //   193: iconst_1
    //   194: istore #28
    //   196: iload #21
    //   198: istore #29
    //   200: aload_0
    //   201: getfield X : I
    //   204: bipush #8
    //   206: if_icmpne -> 218
    //   209: iconst_0
    //   210: istore #13
    //   212: iconst_0
    //   213: istore #21
    //   215: goto -> 222
    //   218: iload #28
    //   220: istore #21
    //   222: iload #26
    //   224: ifeq -> 282
    //   227: iload #32
    //   229: ifne -> 253
    //   232: iload #33
    //   234: ifne -> 253
    //   237: iload #34
    //   239: ifne -> 253
    //   242: aload_1
    //   243: aload #38
    //   245: iload #12
    //   247: invokevirtual a : (Lb/e/b/i;I)V
    //   250: goto -> 282
    //   253: iload #32
    //   255: ifeq -> 282
    //   258: iload #33
    //   260: ifne -> 282
    //   263: aload_1
    //   264: aload #38
    //   266: aload #40
    //   268: aload #10
    //   270: invokevirtual a : ()I
    //   273: bipush #8
    //   275: invokevirtual a : (Lb/e/b/i;Lb/e/b/i;II)Lb/e/b/b;
    //   278: pop
    //   279: goto -> 282
    //   282: aload #35
    //   284: astore #8
    //   286: iload #21
    //   288: ifne -> 378
    //   291: iload #9
    //   293: ifeq -> 346
    //   296: aload_1
    //   297: aload #39
    //   299: aload #38
    //   301: iconst_0
    //   302: iconst_3
    //   303: invokevirtual a : (Lb/e/b/i;Lb/e/b/i;II)Lb/e/b/b;
    //   306: pop
    //   307: iload #14
    //   309: ifle -> 324
    //   312: aload_1
    //   313: aload #39
    //   315: aload #38
    //   317: iload #14
    //   319: bipush #8
    //   321: invokevirtual b : (Lb/e/b/i;Lb/e/b/i;II)V
    //   324: iload #15
    //   326: ldc 2147483647
    //   328: if_icmpge -> 359
    //   331: aload_1
    //   332: aload #39
    //   334: aload #38
    //   336: iload #15
    //   338: bipush #8
    //   340: invokevirtual c : (Lb/e/b/i;Lb/e/b/i;II)V
    //   343: goto -> 359
    //   346: aload_1
    //   347: aload #39
    //   349: aload #38
    //   351: iload #13
    //   353: bipush #8
    //   355: invokevirtual a : (Lb/e/b/i;Lb/e/b/i;II)Lb/e/b/b;
    //   358: pop
    //   359: iload #27
    //   361: istore #12
    //   363: iload #12
    //   365: istore #27
    //   367: iload #24
    //   369: istore #12
    //   371: iload #21
    //   373: istore #24
    //   375: goto -> 806
    //   378: iload #23
    //   380: iconst_2
    //   381: if_icmpeq -> 450
    //   384: iload #17
    //   386: ifne -> 450
    //   389: iload #29
    //   391: iconst_1
    //   392: if_icmpeq -> 400
    //   395: iload #29
    //   397: ifne -> 450
    //   400: iload #27
    //   402: iload #13
    //   404: invokestatic max : (II)I
    //   407: istore #13
    //   409: iload #13
    //   411: istore #12
    //   413: iload #24
    //   415: ifle -> 427
    //   418: iload #24
    //   420: iload #13
    //   422: invokestatic min : (II)I
    //   425: istore #12
    //   427: aload_1
    //   428: aload #39
    //   430: aload #38
    //   432: iload #12
    //   434: bipush #8
    //   436: invokevirtual a : (Lb/e/b/i;Lb/e/b/i;II)Lb/e/b/b;
    //   439: pop
    //   440: iconst_0
    //   441: istore #21
    //   443: iload #27
    //   445: istore #12
    //   447: goto -> 363
    //   450: iload #27
    //   452: istore #12
    //   454: iload #27
    //   456: bipush #-2
    //   458: if_icmpne -> 465
    //   461: iload #13
    //   463: istore #12
    //   465: iload #24
    //   467: bipush #-2
    //   469: if_icmpne -> 479
    //   472: iload #13
    //   474: istore #15
    //   476: goto -> 483
    //   479: iload #24
    //   481: istore #15
    //   483: iload #13
    //   485: istore #24
    //   487: iload #13
    //   489: ifle -> 505
    //   492: iload #13
    //   494: istore #24
    //   496: iload #29
    //   498: iconst_1
    //   499: if_icmpeq -> 505
    //   502: iconst_0
    //   503: istore #24
    //   505: iload #24
    //   507: istore #13
    //   509: iload #12
    //   511: ifle -> 535
    //   514: aload_1
    //   515: aload #39
    //   517: aload #38
    //   519: iload #12
    //   521: bipush #8
    //   523: invokevirtual b : (Lb/e/b/i;Lb/e/b/i;II)V
    //   526: iload #24
    //   528: iload #12
    //   530: invokestatic max : (II)I
    //   533: istore #13
    //   535: iload #15
    //   537: ifle -> 591
    //   540: iload_3
    //   541: ifeq -> 556
    //   544: iload #29
    //   546: iconst_1
    //   547: if_icmpne -> 556
    //   550: iconst_0
    //   551: istore #24
    //   553: goto -> 559
    //   556: iconst_1
    //   557: istore #24
    //   559: iload #24
    //   561: ifeq -> 579
    //   564: aload_1
    //   565: aload #39
    //   567: aload #38
    //   569: iload #15
    //   571: bipush #8
    //   573: invokevirtual c : (Lb/e/b/i;Lb/e/b/i;II)V
    //   576: goto -> 579
    //   579: iload #13
    //   581: iload #15
    //   583: invokestatic min : (II)I
    //   586: istore #13
    //   588: goto -> 591
    //   591: iload #29
    //   593: iconst_1
    //   594: if_icmpne -> 648
    //   597: iload_3
    //   598: ifeq -> 617
    //   601: aload_1
    //   602: aload #39
    //   604: aload #38
    //   606: iload #13
    //   608: bipush #8
    //   610: invokevirtual a : (Lb/e/b/i;Lb/e/b/i;II)Lb/e/b/b;
    //   613: pop
    //   614: goto -> 641
    //   617: aload_1
    //   618: aload #39
    //   620: aload #38
    //   622: iload #13
    //   624: iconst_5
    //   625: invokevirtual a : (Lb/e/b/i;Lb/e/b/i;II)Lb/e/b/b;
    //   628: pop
    //   629: aload_1
    //   630: aload #39
    //   632: aload #38
    //   634: iload #13
    //   636: bipush #8
    //   638: invokevirtual c : (Lb/e/b/i;Lb/e/b/i;II)V
    //   641: iload #15
    //   643: istore #24
    //   645: goto -> 363
    //   648: iload #29
    //   650: iconst_2
    //   651: if_icmpne -> 791
    //   654: aload #10
    //   656: invokevirtual f : ()Lb/e/b/k/d$b;
    //   659: getstatic b/e/b/k/d$b.e : Lb/e/b/k/d$b;
    //   662: if_acmpeq -> 709
    //   665: aload #10
    //   667: invokevirtual f : ()Lb/e/b/k/d$b;
    //   670: getstatic b/e/b/k/d$b.g : Lb/e/b/k/d$b;
    //   673: if_acmpne -> 679
    //   676: goto -> 709
    //   679: aload_1
    //   680: aload_0
    //   681: getfield K : Lb/e/b/k/e;
    //   684: getstatic b/e/b/k/d$b.d : Lb/e/b/k/d$b;
    //   687: invokevirtual a : (Lb/e/b/k/d$b;)Lb/e/b/k/d;
    //   690: invokevirtual a : (Ljava/lang/Object;)Lb/e/b/i;
    //   693: astore #35
    //   695: aload_0
    //   696: getfield K : Lb/e/b/k/e;
    //   699: astore #36
    //   701: getstatic b/e/b/k/d$b.f : Lb/e/b/k/d$b;
    //   704: astore #37
    //   706: goto -> 736
    //   709: aload_1
    //   710: aload_0
    //   711: getfield K : Lb/e/b/k/e;
    //   714: getstatic b/e/b/k/d$b.e : Lb/e/b/k/d$b;
    //   717: invokevirtual a : (Lb/e/b/k/d$b;)Lb/e/b/k/d;
    //   720: invokevirtual a : (Ljava/lang/Object;)Lb/e/b/i;
    //   723: astore #35
    //   725: aload_0
    //   726: getfield K : Lb/e/b/k/e;
    //   729: astore #36
    //   731: getstatic b/e/b/k/d$b.g : Lb/e/b/k/d$b;
    //   734: astore #37
    //   736: aload_1
    //   737: aload #36
    //   739: aload #37
    //   741: invokevirtual a : (Lb/e/b/k/d$b;)Lb/e/b/k/d;
    //   744: invokevirtual a : (Ljava/lang/Object;)Lb/e/b/i;
    //   747: astore #36
    //   749: aload_1
    //   750: invokevirtual b : ()Lb/e/b/b;
    //   753: astore #37
    //   755: aload #37
    //   757: aload #39
    //   759: aload #38
    //   761: aload #36
    //   763: aload #35
    //   765: fload #25
    //   767: invokevirtual a : (Lb/e/b/i;Lb/e/b/i;Lb/e/b/i;Lb/e/b/i;F)Lb/e/b/b;
    //   770: pop
    //   771: aload_1
    //   772: aload #37
    //   774: invokevirtual a : (Lb/e/b/b;)V
    //   777: iload #12
    //   779: istore #27
    //   781: iconst_0
    //   782: istore #24
    //   784: iload #15
    //   786: istore #12
    //   788: goto -> 806
    //   791: iconst_1
    //   792: istore #5
    //   794: iload #12
    //   796: istore #27
    //   798: iload #21
    //   800: istore #24
    //   802: iload #15
    //   804: istore #12
    //   806: iload #26
    //   808: ifeq -> 1963
    //   811: iload #18
    //   813: ifeq -> 819
    //   816: goto -> 1963
    //   819: iload #32
    //   821: ifne -> 841
    //   824: iload #33
    //   826: ifne -> 841
    //   829: iload #34
    //   831: ifne -> 841
    //   834: aload #8
    //   836: astore #35
    //   838: goto -> 1910
    //   841: iload #32
    //   843: ifeq -> 858
    //   846: iload #33
    //   848: ifne -> 858
    //   851: aload #8
    //   853: astore #35
    //   855: goto -> 1910
    //   858: iload #32
    //   860: ifne -> 910
    //   863: iload #33
    //   865: ifeq -> 910
    //   868: aload_1
    //   869: aload #39
    //   871: aload #8
    //   873: aload #11
    //   875: invokevirtual a : ()I
    //   878: ineg
    //   879: bipush #8
    //   881: invokevirtual a : (Lb/e/b/i;Lb/e/b/i;II)Lb/e/b/b;
    //   884: pop
    //   885: aload #8
    //   887: astore #35
    //   889: iload_3
    //   890: ifeq -> 1910
    //   893: aload_1
    //   894: aload #38
    //   896: aload #6
    //   898: iconst_0
    //   899: iconst_5
    //   900: invokevirtual b : (Lb/e/b/i;Lb/e/b/i;II)V
    //   903: aload #8
    //   905: astore #35
    //   907: goto -> 1910
    //   910: iconst_0
    //   911: istore #31
    //   913: iconst_0
    //   914: istore #21
    //   916: aload #8
    //   918: astore #35
    //   920: iload #32
    //   922: ifeq -> 1910
    //   925: aload #8
    //   927: astore #35
    //   929: iload #33
    //   931: ifeq -> 1910
    //   934: aload #10
    //   936: getfield d : Lb/e/b/k/d;
    //   939: getfield b : Lb/e/b/k/e;
    //   942: astore #41
    //   944: aload #11
    //   946: getfield d : Lb/e/b/k/d;
    //   949: getfield b : Lb/e/b/k/e;
    //   952: astore #36
    //   954: aload_0
    //   955: invokevirtual s : ()Lb/e/b/k/e;
    //   958: astore #35
    //   960: bipush #6
    //   962: istore #30
    //   964: iload #24
    //   966: ifeq -> 1343
    //   969: iload #29
    //   971: ifne -> 1073
    //   974: iload #12
    //   976: ifne -> 1001
    //   979: iload #27
    //   981: ifne -> 1001
    //   984: iconst_1
    //   985: istore #15
    //   987: iconst_0
    //   988: istore #13
    //   990: bipush #8
    //   992: istore #12
    //   994: bipush #8
    //   996: istore #28
    //   998: goto -> 1013
    //   1001: iconst_0
    //   1002: istore #15
    //   1004: iconst_1
    //   1005: istore #13
    //   1007: iconst_5
    //   1008: istore #12
    //   1010: iconst_5
    //   1011: istore #28
    //   1013: aload #41
    //   1015: instanceof b/e/b/k/a
    //   1018: ifne -> 1055
    //   1021: aload #36
    //   1023: instanceof b/e/b/k/a
    //   1026: ifeq -> 1032
    //   1029: goto -> 1055
    //   1032: iload #15
    //   1034: istore #22
    //   1036: bipush #6
    //   1038: istore #15
    //   1040: iload #13
    //   1042: istore #23
    //   1044: iload #31
    //   1046: istore #21
    //   1048: iload #28
    //   1050: istore #13
    //   1052: goto -> 1362
    //   1055: iload #15
    //   1057: istore #22
    //   1059: iload #13
    //   1061: istore #23
    //   1063: bipush #6
    //   1065: istore #15
    //   1067: iconst_4
    //   1068: istore #13
    //   1070: goto -> 1362
    //   1073: iload #29
    //   1075: iconst_1
    //   1076: if_icmpne -> 1110
    //   1079: bipush #6
    //   1081: istore #12
    //   1083: iconst_0
    //   1084: istore #22
    //   1086: iconst_4
    //   1087: istore #13
    //   1089: iconst_1
    //   1090: istore #21
    //   1092: iconst_1
    //   1093: istore #23
    //   1095: bipush #8
    //   1097: istore #28
    //   1099: iload #12
    //   1101: istore #15
    //   1103: iload #28
    //   1105: istore #12
    //   1107: goto -> 1362
    //   1110: iload #29
    //   1112: iconst_3
    //   1113: if_icmpne -> 1334
    //   1116: aload_0
    //   1117: getfield s : I
    //   1120: iconst_m1
    //   1121: if_icmpne -> 1158
    //   1124: iload #19
    //   1126: ifeq -> 1145
    //   1129: iload_3
    //   1130: ifeq -> 1139
    //   1133: iconst_5
    //   1134: istore #12
    //   1136: goto -> 1149
    //   1139: iconst_4
    //   1140: istore #12
    //   1142: goto -> 1149
    //   1145: bipush #8
    //   1147: istore #12
    //   1149: iconst_1
    //   1150: istore #22
    //   1152: iconst_5
    //   1153: istore #13
    //   1155: goto -> 1089
    //   1158: iload #17
    //   1160: ifeq -> 1236
    //   1163: iload #22
    //   1165: iconst_2
    //   1166: if_icmpeq -> 1184
    //   1169: iload #22
    //   1171: iconst_1
    //   1172: if_icmpne -> 1178
    //   1175: goto -> 1184
    //   1178: iconst_0
    //   1179: istore #12
    //   1181: goto -> 1187
    //   1184: iconst_1
    //   1185: istore #12
    //   1187: iload #12
    //   1189: ifne -> 1202
    //   1192: bipush #8
    //   1194: istore #13
    //   1196: iconst_5
    //   1197: istore #12
    //   1199: goto -> 1208
    //   1202: iconst_5
    //   1203: istore #13
    //   1205: iconst_4
    //   1206: istore #12
    //   1208: iload #13
    //   1210: istore #28
    //   1212: iconst_1
    //   1213: istore #23
    //   1215: iconst_1
    //   1216: istore #21
    //   1218: bipush #6
    //   1220: istore #15
    //   1222: iconst_1
    //   1223: istore #22
    //   1225: iload #12
    //   1227: istore #13
    //   1229: iload #28
    //   1231: istore #12
    //   1233: goto -> 1362
    //   1236: iload #12
    //   1238: ifle -> 1256
    //   1241: iconst_1
    //   1242: istore #23
    //   1244: iconst_1
    //   1245: istore #21
    //   1247: iconst_1
    //   1248: istore #22
    //   1250: iconst_5
    //   1251: istore #13
    //   1253: goto -> 1355
    //   1256: iload #12
    //   1258: ifne -> 1322
    //   1261: iload #27
    //   1263: ifne -> 1322
    //   1266: iload #19
    //   1268: ifne -> 1287
    //   1271: iconst_1
    //   1272: istore #23
    //   1274: iconst_1
    //   1275: istore #21
    //   1277: iconst_1
    //   1278: istore #22
    //   1280: bipush #8
    //   1282: istore #13
    //   1284: goto -> 1355
    //   1287: aload #41
    //   1289: aload #35
    //   1291: if_acmpeq -> 1307
    //   1294: aload #36
    //   1296: aload #35
    //   1298: if_acmpeq -> 1307
    //   1301: iconst_4
    //   1302: istore #12
    //   1304: goto -> 1310
    //   1307: iconst_5
    //   1308: istore #12
    //   1310: iconst_1
    //   1311: istore #23
    //   1313: iconst_1
    //   1314: istore #21
    //   1316: iconst_1
    //   1317: istore #22
    //   1319: goto -> 1063
    //   1322: iconst_1
    //   1323: istore #23
    //   1325: iconst_1
    //   1326: istore #21
    //   1328: iconst_1
    //   1329: istore #22
    //   1331: goto -> 1352
    //   1334: iconst_0
    //   1335: istore #23
    //   1337: iconst_0
    //   1338: istore #21
    //   1340: goto -> 1349
    //   1343: iconst_1
    //   1344: istore #23
    //   1346: iconst_1
    //   1347: istore #21
    //   1349: iconst_0
    //   1350: istore #22
    //   1352: iconst_4
    //   1353: istore #13
    //   1355: bipush #6
    //   1357: istore #15
    //   1359: iconst_5
    //   1360: istore #12
    //   1362: iload #21
    //   1364: ifeq -> 1390
    //   1367: aload #40
    //   1369: aload #8
    //   1371: if_acmpne -> 1390
    //   1374: aload #41
    //   1376: aload #35
    //   1378: if_acmpeq -> 1390
    //   1381: iconst_0
    //   1382: istore #28
    //   1384: iconst_0
    //   1385: istore #21
    //   1387: goto -> 1397
    //   1390: iload #21
    //   1392: istore #28
    //   1394: iconst_1
    //   1395: istore #21
    //   1397: iload #23
    //   1399: ifeq -> 1446
    //   1402: aload_0
    //   1403: getfield X : I
    //   1406: bipush #8
    //   1408: if_icmpne -> 1417
    //   1411: iconst_4
    //   1412: istore #15
    //   1414: goto -> 1417
    //   1417: aload_1
    //   1418: aload #38
    //   1420: aload #40
    //   1422: aload #10
    //   1424: invokevirtual a : ()I
    //   1427: fload #16
    //   1429: aload #8
    //   1431: aload #39
    //   1433: aload #11
    //   1435: invokevirtual a : ()I
    //   1438: iload #15
    //   1440: invokevirtual a : (Lb/e/b/i;Lb/e/b/i;IFLb/e/b/i;Lb/e/b/i;II)V
    //   1443: goto -> 1446
    //   1446: aload #38
    //   1448: astore #37
    //   1450: aload_0
    //   1451: getfield X : I
    //   1454: bipush #8
    //   1456: if_icmpne -> 1460
    //   1459: return
    //   1460: iload #28
    //   1462: ifeq -> 1541
    //   1465: iload_3
    //   1466: ifeq -> 1507
    //   1469: aload #40
    //   1471: aload #8
    //   1473: if_acmpeq -> 1507
    //   1476: iload #24
    //   1478: ifne -> 1507
    //   1481: aload #41
    //   1483: instanceof b/e/b/k/a
    //   1486: ifne -> 1500
    //   1489: aload #36
    //   1491: instanceof b/e/b/k/a
    //   1494: ifeq -> 1507
    //   1497: goto -> 1500
    //   1500: bipush #6
    //   1502: istore #12
    //   1504: goto -> 1507
    //   1507: aload_1
    //   1508: aload #37
    //   1510: aload #40
    //   1512: aload #10
    //   1514: invokevirtual a : ()I
    //   1517: iload #12
    //   1519: invokevirtual b : (Lb/e/b/i;Lb/e/b/i;II)V
    //   1522: aload_1
    //   1523: aload #39
    //   1525: aload #8
    //   1527: aload #11
    //   1529: invokevirtual a : ()I
    //   1532: ineg
    //   1533: iload #12
    //   1535: invokevirtual c : (Lb/e/b/i;Lb/e/b/i;II)V
    //   1538: goto -> 1541
    //   1541: iload_3
    //   1542: ifeq -> 1580
    //   1545: iload #20
    //   1547: ifeq -> 1580
    //   1550: aload #41
    //   1552: instanceof b/e/b/k/a
    //   1555: ifne -> 1580
    //   1558: aload #36
    //   1560: instanceof b/e/b/k/a
    //   1563: ifne -> 1580
    //   1566: bipush #6
    //   1568: istore #12
    //   1570: bipush #6
    //   1572: istore #15
    //   1574: iconst_1
    //   1575: istore #21
    //   1577: goto -> 1588
    //   1580: iload #12
    //   1582: istore #15
    //   1584: iload #13
    //   1586: istore #12
    //   1588: iload #21
    //   1590: ifeq -> 1795
    //   1593: iload #22
    //   1595: ifeq -> 1702
    //   1598: iload #19
    //   1600: ifeq -> 1608
    //   1603: iload #4
    //   1605: ifeq -> 1702
    //   1608: aload #35
    //   1610: astore #38
    //   1612: iload #30
    //   1614: istore #13
    //   1616: aload #41
    //   1618: aload #38
    //   1620: if_acmpeq -> 1641
    //   1623: aload #36
    //   1625: aload #38
    //   1627: if_acmpne -> 1637
    //   1630: iload #30
    //   1632: istore #13
    //   1634: goto -> 1641
    //   1637: iload #12
    //   1639: istore #13
    //   1641: aload #41
    //   1643: instanceof b/e/b/k/g
    //   1646: ifne -> 1657
    //   1649: aload #36
    //   1651: instanceof b/e/b/k/g
    //   1654: ifeq -> 1660
    //   1657: iconst_5
    //   1658: istore #13
    //   1660: aload #41
    //   1662: instanceof b/e/b/k/a
    //   1665: ifne -> 1676
    //   1668: aload #36
    //   1670: instanceof b/e/b/k/a
    //   1673: ifeq -> 1679
    //   1676: iconst_5
    //   1677: istore #13
    //   1679: iload #19
    //   1681: ifeq -> 1690
    //   1684: iconst_5
    //   1685: istore #13
    //   1687: goto -> 1690
    //   1690: iload #13
    //   1692: iload #12
    //   1694: invokestatic max : (II)I
    //   1697: istore #13
    //   1699: goto -> 1706
    //   1702: iload #12
    //   1704: istore #13
    //   1706: iload #13
    //   1708: istore #12
    //   1710: iload_3
    //   1711: ifeq -> 1762
    //   1714: iload #15
    //   1716: iload #13
    //   1718: invokestatic min : (II)I
    //   1721: istore #13
    //   1723: iload #13
    //   1725: istore #12
    //   1727: iload #17
    //   1729: ifeq -> 1762
    //   1732: iload #13
    //   1734: istore #12
    //   1736: iload #19
    //   1738: ifne -> 1762
    //   1741: aload #41
    //   1743: aload #35
    //   1745: if_acmpeq -> 1759
    //   1748: iload #13
    //   1750: istore #12
    //   1752: aload #36
    //   1754: aload #35
    //   1756: if_acmpne -> 1762
    //   1759: iconst_4
    //   1760: istore #12
    //   1762: aload_1
    //   1763: aload #37
    //   1765: aload #40
    //   1767: aload #10
    //   1769: invokevirtual a : ()I
    //   1772: iload #12
    //   1774: invokevirtual a : (Lb/e/b/i;Lb/e/b/i;II)Lb/e/b/b;
    //   1777: pop
    //   1778: aload_1
    //   1779: aload #39
    //   1781: aload #8
    //   1783: aload #11
    //   1785: invokevirtual a : ()I
    //   1788: ineg
    //   1789: iload #12
    //   1791: invokevirtual a : (Lb/e/b/i;Lb/e/b/i;II)Lb/e/b/b;
    //   1794: pop
    //   1795: iload_3
    //   1796: ifeq -> 1837
    //   1799: aload #6
    //   1801: aload #40
    //   1803: if_acmpne -> 1816
    //   1806: aload #10
    //   1808: invokevirtual a : ()I
    //   1811: istore #12
    //   1813: goto -> 1819
    //   1816: iconst_0
    //   1817: istore #12
    //   1819: aload #40
    //   1821: aload #6
    //   1823: if_acmpeq -> 1837
    //   1826: aload_1
    //   1827: aload #37
    //   1829: aload #6
    //   1831: iload #12
    //   1833: iconst_5
    //   1834: invokevirtual b : (Lb/e/b/i;Lb/e/b/i;II)V
    //   1837: aload #8
    //   1839: astore #35
    //   1841: iload_3
    //   1842: ifeq -> 1910
    //   1845: aload #8
    //   1847: astore #35
    //   1849: iload #24
    //   1851: ifeq -> 1910
    //   1854: aload #8
    //   1856: astore #35
    //   1858: iload #14
    //   1860: ifne -> 1910
    //   1863: aload #8
    //   1865: astore #35
    //   1867: iload #27
    //   1869: ifne -> 1910
    //   1872: iload #24
    //   1874: ifeq -> 1897
    //   1877: iload #29
    //   1879: iconst_3
    //   1880: if_icmpne -> 1897
    //   1883: aload_1
    //   1884: aload #39
    //   1886: aload #37
    //   1888: iconst_0
    //   1889: bipush #8
    //   1891: invokevirtual b : (Lb/e/b/i;Lb/e/b/i;II)V
    //   1894: goto -> 1914
    //   1897: aload_1
    //   1898: aload #39
    //   1900: aload #37
    //   1902: iconst_0
    //   1903: iconst_5
    //   1904: invokevirtual b : (Lb/e/b/i;Lb/e/b/i;II)V
    //   1907: goto -> 1914
    //   1910: aload #35
    //   1912: astore #8
    //   1914: iload_3
    //   1915: ifeq -> 1962
    //   1918: iload #5
    //   1920: ifeq -> 1962
    //   1923: aload #11
    //   1925: getfield d : Lb/e/b/k/d;
    //   1928: ifnull -> 1941
    //   1931: aload #11
    //   1933: invokevirtual a : ()I
    //   1936: istore #12
    //   1938: goto -> 1944
    //   1941: iconst_0
    //   1942: istore #12
    //   1944: aload #8
    //   1946: aload #7
    //   1948: if_acmpeq -> 1962
    //   1951: aload_1
    //   1952: aload #7
    //   1954: aload #39
    //   1956: iload #12
    //   1958: iconst_5
    //   1959: invokevirtual b : (Lb/e/b/i;Lb/e/b/i;II)V
    //   1962: return
    //   1963: iload #23
    //   1965: iconst_2
    //   1966: if_icmpge -> 2117
    //   1969: iload_3
    //   1970: ifeq -> 2117
    //   1973: iload #5
    //   1975: ifeq -> 2117
    //   1978: aload_1
    //   1979: aload #38
    //   1981: aload #6
    //   1983: iconst_0
    //   1984: bipush #8
    //   1986: invokevirtual b : (Lb/e/b/i;Lb/e/b/i;II)V
    //   1989: iload_2
    //   1990: ifne -> 2012
    //   1993: aload_0
    //   1994: getfield C : Lb/e/b/k/d;
    //   1997: getfield d : Lb/e/b/k/d;
    //   2000: ifnonnull -> 2006
    //   2003: goto -> 2012
    //   2006: iconst_0
    //   2007: istore #12
    //   2009: goto -> 2015
    //   2012: iconst_1
    //   2013: istore #12
    //   2015: iload #12
    //   2017: istore #13
    //   2019: iload_2
    //   2020: ifne -> 2101
    //   2023: aload_0
    //   2024: getfield C : Lb/e/b/k/d;
    //   2027: getfield d : Lb/e/b/k/d;
    //   2030: astore #6
    //   2032: iload #12
    //   2034: istore #13
    //   2036: aload #6
    //   2038: ifnull -> 2101
    //   2041: aload #6
    //   2043: getfield b : Lb/e/b/k/e;
    //   2046: astore #6
    //   2048: aload #6
    //   2050: getfield N : F
    //   2053: fconst_0
    //   2054: fcmpl
    //   2055: ifeq -> 2098
    //   2058: aload #6
    //   2060: getfield J : [Lb/e/b/k/e$b;
    //   2063: astore #6
    //   2065: aload #6
    //   2067: iconst_0
    //   2068: aaload
    //   2069: astore #8
    //   2071: getstatic b/e/b/k/e$b.e : Lb/e/b/k/e$b;
    //   2074: astore #10
    //   2076: aload #8
    //   2078: aload #10
    //   2080: if_acmpne -> 2098
    //   2083: aload #6
    //   2085: iconst_1
    //   2086: aaload
    //   2087: aload #10
    //   2089: if_acmpne -> 2098
    //   2092: iconst_1
    //   2093: istore #13
    //   2095: goto -> 2101
    //   2098: iconst_0
    //   2099: istore #13
    //   2101: iload #13
    //   2103: ifeq -> 2117
    //   2106: aload_1
    //   2107: aload #7
    //   2109: aload #39
    //   2111: iconst_0
    //   2112: bipush #8
    //   2114: invokevirtual b : (Lb/e/b/i;Lb/e/b/i;II)V
    //   2117: return
  }
  
  private boolean s(int paramInt) {
    paramInt *= 2;
    d[] arrayOfD = this.G;
    if ((arrayOfD[paramInt]).d != null && (arrayOfD[paramInt]).d.d != arrayOfD[paramInt])
      if ((arrayOfD[++paramInt]).d != null && (arrayOfD[paramInt]).d.d == arrayOfD[paramInt])
        return true;  
    return false;
  }
  
  public int A() {
    e e1 = this.K;
    return (e1 != null && e1 instanceof f) ? (((f)e1).n0 + this.P) : this.P;
  }
  
  public int B() {
    e e1 = this.K;
    return (e1 != null && e1 instanceof f) ? (((f)e1).o0 + this.Q) : this.Q;
  }
  
  public boolean C() {
    return this.w;
  }
  
  public boolean D() {
    d d1 = this.y;
    d d2 = d1.d;
    if (d2 == null || d2.d != d1) {
      d1 = this.A;
      d2 = d1.d;
      if (d2 == null || d2.d != d1)
        return false; 
    } 
    return true;
  }
  
  public boolean E() {
    return this.x;
  }
  
  public boolean F() {
    d d1 = this.z;
    d d2 = d1.d;
    if (d2 == null || d2.d != d1) {
      d1 = this.B;
      d2 = d1.d;
      if (d2 == null || d2.d != d1)
        return false; 
    } 
    return true;
  }
  
  public void G() {
    this.y.i();
    this.z.i();
    this.A.i();
    this.B.i();
    this.C.i();
    this.D.i();
    this.E.i();
    this.F.i();
    this.K = null;
    this.v = 0.0F;
    this.L = 0;
    this.M = 0;
    this.N = 0.0F;
    this.O = -1;
    this.P = 0;
    this.Q = 0;
    this.R = 0;
    this.S = 0;
    this.T = 0;
    float f = f0;
    this.U = f;
    this.V = f;
    b[] arrayOfB = this.J;
    b b1 = b.c;
    arrayOfB[0] = b1;
    arrayOfB[1] = b1;
    this.W = null;
    this.X = 0;
    this.Z = null;
    this.a0 = 0;
    this.b0 = 0;
    float[] arrayOfFloat = this.c0;
    arrayOfFloat[0] = -1.0F;
    arrayOfFloat[1] = -1.0F;
    this.h = -1;
    this.i = -1;
    int[] arrayOfInt = this.u;
    arrayOfInt[0] = Integer.MAX_VALUE;
    arrayOfInt[1] = Integer.MAX_VALUE;
    this.j = 0;
    this.k = 0;
    this.o = 1.0F;
    this.r = 1.0F;
    this.n = Integer.MAX_VALUE;
    this.q = Integer.MAX_VALUE;
    this.m = 0;
    this.p = 0;
    this.s = -1;
    this.t = 1.0F;
    boolean[] arrayOfBoolean = this.f;
    arrayOfBoolean[0] = true;
    arrayOfBoolean[1] = true;
    arrayOfBoolean = this.I;
    arrayOfBoolean[0] = false;
    arrayOfBoolean[1] = false;
  }
  
  public float a(int paramInt) {
    return (paramInt == 0) ? this.U : ((paramInt == 1) ? this.V : -1.0F);
  }
  
  public d a(d.b paramb) {
    switch (a.a[paramb.ordinal()]) {
      default:
        throw new AssertionError(paramb.name());
      case 9:
        return null;
      case 8:
        return this.E;
      case 7:
        return this.D;
      case 6:
        return this.F;
      case 5:
        return this.C;
      case 4:
        return this.B;
      case 3:
        return this.A;
      case 2:
        return this.z;
      case 1:
        break;
    } 
    return this.y;
  }
  
  public void a(float paramFloat) {
    this.U = paramFloat;
  }
  
  public void a(int paramInt1, int paramInt2) {
    this.P = paramInt1;
    this.L = paramInt2 - paramInt1;
    paramInt1 = this.L;
    paramInt2 = this.S;
    if (paramInt1 < paramInt2)
      this.L = paramInt2; 
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, float paramFloat) {
    this.j = paramInt1;
    this.m = paramInt2;
    paramInt1 = paramInt3;
    if (paramInt3 == Integer.MAX_VALUE)
      paramInt1 = 0; 
    this.n = paramInt1;
    this.o = paramFloat;
    if (paramFloat > 0.0F && paramFloat < 1.0F && this.j == 0)
      this.j = 2; 
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    // Byte code:
    //   0: iload_3
    //   1: iload_1
    //   2: isub
    //   3: istore #5
    //   5: iload #4
    //   7: iload_2
    //   8: isub
    //   9: istore_3
    //   10: aload_0
    //   11: iload_1
    //   12: putfield P : I
    //   15: aload_0
    //   16: iload_2
    //   17: putfield Q : I
    //   20: aload_0
    //   21: getfield X : I
    //   24: bipush #8
    //   26: if_icmpne -> 40
    //   29: aload_0
    //   30: iconst_0
    //   31: putfield L : I
    //   34: aload_0
    //   35: iconst_0
    //   36: putfield M : I
    //   39: return
    //   40: aload_0
    //   41: getfield J : [Lb/e/b/k/e$b;
    //   44: iconst_0
    //   45: aaload
    //   46: getstatic b/e/b/k/e$b.c : Lb/e/b/k/e$b;
    //   49: if_acmpne -> 66
    //   52: aload_0
    //   53: getfield L : I
    //   56: istore_1
    //   57: iload #5
    //   59: iload_1
    //   60: if_icmpge -> 66
    //   63: goto -> 69
    //   66: iload #5
    //   68: istore_1
    //   69: aload_0
    //   70: getfield J : [Lb/e/b/k/e$b;
    //   73: iconst_1
    //   74: aaload
    //   75: getstatic b/e/b/k/e$b.c : Lb/e/b/k/e$b;
    //   78: if_acmpne -> 94
    //   81: aload_0
    //   82: getfield M : I
    //   85: istore_2
    //   86: iload_3
    //   87: iload_2
    //   88: if_icmpge -> 94
    //   91: goto -> 96
    //   94: iload_3
    //   95: istore_2
    //   96: aload_0
    //   97: iload_1
    //   98: putfield L : I
    //   101: aload_0
    //   102: iload_2
    //   103: putfield M : I
    //   106: aload_0
    //   107: getfield M : I
    //   110: istore_1
    //   111: aload_0
    //   112: getfield T : I
    //   115: istore_2
    //   116: iload_1
    //   117: iload_2
    //   118: if_icmpge -> 126
    //   121: aload_0
    //   122: iload_2
    //   123: putfield M : I
    //   126: aload_0
    //   127: getfield L : I
    //   130: istore_1
    //   131: aload_0
    //   132: getfield S : I
    //   135: istore_2
    //   136: iload_1
    //   137: iload_2
    //   138: if_icmpge -> 146
    //   141: aload_0
    //   142: iload_2
    //   143: putfield L : I
    //   146: return
  }
  
  protected void a(int paramInt, boolean paramBoolean) {
    this.I[paramInt] = paramBoolean;
  }
  
  public void a(c paramc) {
    this.y.a(paramc);
    this.z.a(paramc);
    this.A.a(paramc);
    this.B.a(paramc);
    this.C.a(paramc);
    this.F.a(paramc);
    this.D.a(paramc);
    this.E.a(paramc);
  }
  
  public void a(d paramd) {
    // Byte code:
    //   0: aload_0
    //   1: astore #23
    //   3: aload_1
    //   4: aload #23
    //   6: getfield y : Lb/e/b/k/d;
    //   9: invokevirtual a : (Ljava/lang/Object;)Lb/e/b/i;
    //   12: astore #22
    //   14: aload_1
    //   15: aload #23
    //   17: getfield A : Lb/e/b/k/d;
    //   20: invokevirtual a : (Ljava/lang/Object;)Lb/e/b/i;
    //   23: astore #26
    //   25: aload_1
    //   26: aload #23
    //   28: getfield z : Lb/e/b/k/d;
    //   31: invokevirtual a : (Ljava/lang/Object;)Lb/e/b/i;
    //   34: astore #27
    //   36: aload_1
    //   37: aload #23
    //   39: getfield B : Lb/e/b/k/d;
    //   42: invokevirtual a : (Ljava/lang/Object;)Lb/e/b/i;
    //   45: astore #24
    //   47: aload_1
    //   48: aload #23
    //   50: getfield C : Lb/e/b/k/d;
    //   53: invokevirtual a : (Ljava/lang/Object;)Lb/e/b/i;
    //   56: astore #20
    //   58: getstatic b/e/b/d.r : Lb/e/b/e;
    //   61: astore #19
    //   63: aload #19
    //   65: ifnull -> 80
    //   68: aload #19
    //   70: aload #19
    //   72: getfield y : J
    //   75: lconst_1
    //   76: ladd
    //   77: putfield y : J
    //   80: aload #23
    //   82: getfield d : Lb/e/b/k/m/j;
    //   85: astore #19
    //   87: aload #19
    //   89: getfield h : Lb/e/b/k/m/f;
    //   92: getfield j : Z
    //   95: ifeq -> 402
    //   98: aload #19
    //   100: getfield i : Lb/e/b/k/m/f;
    //   103: getfield j : Z
    //   106: ifeq -> 402
    //   109: aload #23
    //   111: getfield e : Lb/e/b/k/m/l;
    //   114: astore #19
    //   116: aload #19
    //   118: getfield h : Lb/e/b/k/m/f;
    //   121: getfield j : Z
    //   124: ifeq -> 402
    //   127: aload #19
    //   129: getfield i : Lb/e/b/k/m/f;
    //   132: getfield j : Z
    //   135: ifeq -> 402
    //   138: getstatic b/e/b/d.r : Lb/e/b/e;
    //   141: astore #19
    //   143: aload #19
    //   145: ifnull -> 160
    //   148: aload #19
    //   150: aload #19
    //   152: getfield r : J
    //   155: lconst_1
    //   156: ladd
    //   157: putfield r : J
    //   160: aload_1
    //   161: aload #22
    //   163: aload #23
    //   165: getfield d : Lb/e/b/k/m/j;
    //   168: getfield h : Lb/e/b/k/m/f;
    //   171: getfield g : I
    //   174: invokevirtual a : (Lb/e/b/i;I)V
    //   177: aload_1
    //   178: aload #26
    //   180: aload #23
    //   182: getfield d : Lb/e/b/k/m/j;
    //   185: getfield i : Lb/e/b/k/m/f;
    //   188: getfield g : I
    //   191: invokevirtual a : (Lb/e/b/i;I)V
    //   194: aload_1
    //   195: aload #27
    //   197: aload #23
    //   199: getfield e : Lb/e/b/k/m/l;
    //   202: getfield h : Lb/e/b/k/m/f;
    //   205: getfield g : I
    //   208: invokevirtual a : (Lb/e/b/i;I)V
    //   211: aload_1
    //   212: aload #24
    //   214: aload #23
    //   216: getfield e : Lb/e/b/k/m/l;
    //   219: getfield i : Lb/e/b/k/m/f;
    //   222: getfield g : I
    //   225: invokevirtual a : (Lb/e/b/i;I)V
    //   228: aload_1
    //   229: aload #20
    //   231: aload #23
    //   233: getfield e : Lb/e/b/k/m/l;
    //   236: getfield k : Lb/e/b/k/m/f;
    //   239: getfield g : I
    //   242: invokevirtual a : (Lb/e/b/i;I)V
    //   245: aload #23
    //   247: getfield K : Lb/e/b/k/e;
    //   250: astore #19
    //   252: aload #19
    //   254: ifnull -> 401
    //   257: aload #19
    //   259: ifnull -> 280
    //   262: aload #19
    //   264: getfield J : [Lb/e/b/k/e$b;
    //   267: iconst_0
    //   268: aaload
    //   269: getstatic b/e/b/k/e$b.d : Lb/e/b/k/e$b;
    //   272: if_acmpne -> 280
    //   275: iconst_1
    //   276: istore_3
    //   277: goto -> 282
    //   280: iconst_0
    //   281: istore_3
    //   282: aload #23
    //   284: getfield K : Lb/e/b/k/e;
    //   287: astore #19
    //   289: aload #19
    //   291: ifnull -> 313
    //   294: aload #19
    //   296: getfield J : [Lb/e/b/k/e$b;
    //   299: iconst_1
    //   300: aaload
    //   301: getstatic b/e/b/k/e$b.d : Lb/e/b/k/e$b;
    //   304: if_acmpne -> 313
    //   307: iconst_1
    //   308: istore #4
    //   310: goto -> 316
    //   313: iconst_0
    //   314: istore #4
    //   316: iload_3
    //   317: ifeq -> 358
    //   320: aload #23
    //   322: getfield f : [Z
    //   325: iconst_0
    //   326: baload
    //   327: ifeq -> 358
    //   330: aload_0
    //   331: invokevirtual D : ()Z
    //   334: ifne -> 358
    //   337: aload_1
    //   338: aload_1
    //   339: aload #23
    //   341: getfield K : Lb/e/b/k/e;
    //   344: getfield A : Lb/e/b/k/d;
    //   347: invokevirtual a : (Ljava/lang/Object;)Lb/e/b/i;
    //   350: aload #26
    //   352: iconst_0
    //   353: bipush #8
    //   355: invokevirtual b : (Lb/e/b/i;Lb/e/b/i;II)V
    //   358: iload #4
    //   360: ifeq -> 401
    //   363: aload #23
    //   365: getfield f : [Z
    //   368: iconst_1
    //   369: baload
    //   370: ifeq -> 401
    //   373: aload_0
    //   374: invokevirtual F : ()Z
    //   377: ifne -> 401
    //   380: aload_1
    //   381: aload_1
    //   382: aload #23
    //   384: getfield K : Lb/e/b/k/e;
    //   387: getfield B : Lb/e/b/k/d;
    //   390: invokevirtual a : (Ljava/lang/Object;)Lb/e/b/i;
    //   393: aload #24
    //   395: iconst_0
    //   396: bipush #8
    //   398: invokevirtual b : (Lb/e/b/i;Lb/e/b/i;II)V
    //   401: return
    //   402: getstatic b/e/b/d.r : Lb/e/b/e;
    //   405: astore #19
    //   407: aload #19
    //   409: ifnull -> 424
    //   412: aload #19
    //   414: aload #19
    //   416: getfield s : J
    //   419: lconst_1
    //   420: ladd
    //   421: putfield s : J
    //   424: aload #23
    //   426: getfield K : Lb/e/b/k/e;
    //   429: astore #19
    //   431: aload #19
    //   433: ifnull -> 714
    //   436: aload #19
    //   438: ifnull -> 460
    //   441: aload #19
    //   443: getfield J : [Lb/e/b/k/e$b;
    //   446: iconst_0
    //   447: aaload
    //   448: getstatic b/e/b/k/e$b.d : Lb/e/b/k/e$b;
    //   451: if_acmpne -> 460
    //   454: iconst_1
    //   455: istore #10
    //   457: goto -> 463
    //   460: iconst_0
    //   461: istore #10
    //   463: aload #23
    //   465: getfield K : Lb/e/b/k/e;
    //   468: astore #19
    //   470: aload #19
    //   472: ifnull -> 494
    //   475: aload #19
    //   477: getfield J : [Lb/e/b/k/e$b;
    //   480: iconst_1
    //   481: aaload
    //   482: getstatic b/e/b/k/e$b.d : Lb/e/b/k/e$b;
    //   485: if_acmpne -> 494
    //   488: iconst_1
    //   489: istore #11
    //   491: goto -> 497
    //   494: iconst_0
    //   495: istore #11
    //   497: aload #23
    //   499: iconst_0
    //   500: invokespecial s : (I)Z
    //   503: ifeq -> 526
    //   506: aload #23
    //   508: getfield K : Lb/e/b/k/e;
    //   511: checkcast b/e/b/k/f
    //   514: aload #23
    //   516: iconst_0
    //   517: invokevirtual a : (Lb/e/b/k/e;I)V
    //   520: iconst_1
    //   521: istore #12
    //   523: goto -> 532
    //   526: aload_0
    //   527: invokevirtual D : ()Z
    //   530: istore #12
    //   532: aload #23
    //   534: iconst_1
    //   535: invokespecial s : (I)Z
    //   538: ifeq -> 561
    //   541: aload #23
    //   543: getfield K : Lb/e/b/k/e;
    //   546: checkcast b/e/b/k/f
    //   549: aload #23
    //   551: iconst_1
    //   552: invokevirtual a : (Lb/e/b/k/e;I)V
    //   555: iconst_1
    //   556: istore #13
    //   558: goto -> 567
    //   561: aload_0
    //   562: invokevirtual F : ()Z
    //   565: istore #13
    //   567: iload #12
    //   569: ifne -> 629
    //   572: iload #10
    //   574: ifeq -> 629
    //   577: aload #23
    //   579: getfield X : I
    //   582: bipush #8
    //   584: if_icmpeq -> 629
    //   587: aload #23
    //   589: getfield y : Lb/e/b/k/d;
    //   592: getfield d : Lb/e/b/k/d;
    //   595: ifnonnull -> 629
    //   598: aload #23
    //   600: getfield A : Lb/e/b/k/d;
    //   603: getfield d : Lb/e/b/k/d;
    //   606: ifnonnull -> 629
    //   609: aload_1
    //   610: aload_1
    //   611: aload #23
    //   613: getfield K : Lb/e/b/k/e;
    //   616: getfield A : Lb/e/b/k/d;
    //   619: invokevirtual a : (Ljava/lang/Object;)Lb/e/b/i;
    //   622: aload #26
    //   624: iconst_0
    //   625: iconst_1
    //   626: invokevirtual b : (Lb/e/b/i;Lb/e/b/i;II)V
    //   629: iload #13
    //   631: ifne -> 699
    //   634: iload #11
    //   636: ifeq -> 699
    //   639: aload #23
    //   641: getfield X : I
    //   644: bipush #8
    //   646: if_icmpeq -> 699
    //   649: aload #23
    //   651: getfield z : Lb/e/b/k/d;
    //   654: getfield d : Lb/e/b/k/d;
    //   657: ifnonnull -> 699
    //   660: aload #23
    //   662: getfield B : Lb/e/b/k/d;
    //   665: getfield d : Lb/e/b/k/d;
    //   668: ifnonnull -> 699
    //   671: aload #23
    //   673: getfield C : Lb/e/b/k/d;
    //   676: ifnonnull -> 699
    //   679: aload_1
    //   680: aload_1
    //   681: aload #23
    //   683: getfield K : Lb/e/b/k/e;
    //   686: getfield B : Lb/e/b/k/d;
    //   689: invokevirtual a : (Ljava/lang/Object;)Lb/e/b/i;
    //   692: aload #24
    //   694: iconst_0
    //   695: iconst_1
    //   696: invokevirtual b : (Lb/e/b/i;Lb/e/b/i;II)V
    //   699: iload #11
    //   701: istore #14
    //   703: iload #10
    //   705: istore #11
    //   707: iload #14
    //   709: istore #10
    //   711: goto -> 726
    //   714: iconst_0
    //   715: istore #11
    //   717: iconst_0
    //   718: istore #10
    //   720: iconst_0
    //   721: istore #12
    //   723: iconst_0
    //   724: istore #13
    //   726: aload #23
    //   728: getfield L : I
    //   731: istore_3
    //   732: aload #23
    //   734: getfield S : I
    //   737: istore #4
    //   739: iload_3
    //   740: istore #6
    //   742: iload_3
    //   743: iload #4
    //   745: if_icmpge -> 752
    //   748: iload #4
    //   750: istore #6
    //   752: aload #23
    //   754: getfield M : I
    //   757: istore #4
    //   759: aload #23
    //   761: getfield T : I
    //   764: istore #5
    //   766: iload #4
    //   768: istore_3
    //   769: iload #4
    //   771: iload #5
    //   773: if_icmpge -> 779
    //   776: iload #5
    //   778: istore_3
    //   779: aload #23
    //   781: getfield J : [Lb/e/b/k/e$b;
    //   784: iconst_0
    //   785: aaload
    //   786: getstatic b/e/b/k/e$b.e : Lb/e/b/k/e$b;
    //   789: if_acmpeq -> 798
    //   792: iconst_1
    //   793: istore #14
    //   795: goto -> 801
    //   798: iconst_0
    //   799: istore #14
    //   801: aload #23
    //   803: getfield J : [Lb/e/b/k/e$b;
    //   806: iconst_1
    //   807: aaload
    //   808: getstatic b/e/b/k/e$b.e : Lb/e/b/k/e$b;
    //   811: if_acmpeq -> 820
    //   814: iconst_1
    //   815: istore #15
    //   817: goto -> 823
    //   820: iconst_0
    //   821: istore #15
    //   823: aload #23
    //   825: aload #23
    //   827: getfield O : I
    //   830: putfield s : I
    //   833: aload #23
    //   835: getfield N : F
    //   838: fstore_2
    //   839: aload #23
    //   841: fload_2
    //   842: putfield t : F
    //   845: aload #23
    //   847: getfield j : I
    //   850: istore #5
    //   852: aload #23
    //   854: getfield k : I
    //   857: istore #7
    //   859: fload_2
    //   860: fconst_0
    //   861: fcmpl
    //   862: ifle -> 1204
    //   865: aload #23
    //   867: getfield X : I
    //   870: bipush #8
    //   872: if_icmpeq -> 1204
    //   875: iload #5
    //   877: istore #4
    //   879: aload #23
    //   881: getfield J : [Lb/e/b/k/e$b;
    //   884: iconst_0
    //   885: aaload
    //   886: getstatic b/e/b/k/e$b.e : Lb/e/b/k/e$b;
    //   889: if_acmpne -> 904
    //   892: iload #5
    //   894: istore #4
    //   896: iload #5
    //   898: ifne -> 904
    //   901: iconst_3
    //   902: istore #4
    //   904: iload #7
    //   906: istore #5
    //   908: aload #23
    //   910: getfield J : [Lb/e/b/k/e$b;
    //   913: iconst_1
    //   914: aaload
    //   915: getstatic b/e/b/k/e$b.e : Lb/e/b/k/e$b;
    //   918: if_acmpne -> 933
    //   921: iload #7
    //   923: istore #5
    //   925: iload #7
    //   927: ifne -> 933
    //   930: iconst_3
    //   931: istore #5
    //   933: aload #23
    //   935: getfield J : [Lb/e/b/k/e$b;
    //   938: astore #19
    //   940: aload #19
    //   942: iconst_0
    //   943: aaload
    //   944: astore #21
    //   946: getstatic b/e/b/k/e$b.e : Lb/e/b/k/e$b;
    //   949: astore #25
    //   951: aload #21
    //   953: aload #25
    //   955: if_acmpne -> 998
    //   958: aload #19
    //   960: iconst_1
    //   961: aaload
    //   962: aload #25
    //   964: if_acmpne -> 998
    //   967: iload #4
    //   969: iconst_3
    //   970: if_icmpne -> 998
    //   973: iload #5
    //   975: iconst_3
    //   976: if_icmpne -> 998
    //   979: aload #23
    //   981: iload #11
    //   983: iload #10
    //   985: iload #14
    //   987: iload #15
    //   989: invokevirtual a : (ZZZZ)V
    //   992: iload_3
    //   993: istore #7
    //   995: goto -> 1188
    //   998: aload #23
    //   1000: getfield J : [Lb/e/b/k/e$b;
    //   1003: astore #21
    //   1005: aload #21
    //   1007: iconst_0
    //   1008: aaload
    //   1009: astore #25
    //   1011: getstatic b/e/b/k/e$b.e : Lb/e/b/k/e$b;
    //   1014: astore #19
    //   1016: aload #25
    //   1018: aload #19
    //   1020: if_acmpne -> 1094
    //   1023: iload #4
    //   1025: iconst_3
    //   1026: if_icmpne -> 1094
    //   1029: aload #23
    //   1031: iconst_0
    //   1032: putfield s : I
    //   1035: aload #23
    //   1037: getfield t : F
    //   1040: aload #23
    //   1042: getfield M : I
    //   1045: i2f
    //   1046: fmul
    //   1047: f2i
    //   1048: istore #8
    //   1050: aload #21
    //   1052: iconst_1
    //   1053: aaload
    //   1054: astore #21
    //   1056: iload_3
    //   1057: istore #7
    //   1059: iload #5
    //   1061: istore #9
    //   1063: iload #8
    //   1065: istore #6
    //   1067: iload #7
    //   1069: istore_3
    //   1070: aload #21
    //   1072: aload #19
    //   1074: if_acmpeq -> 1191
    //   1077: iconst_4
    //   1078: istore_3
    //   1079: iload #8
    //   1081: istore #6
    //   1083: iload #9
    //   1085: istore #4
    //   1087: iload #7
    //   1089: istore #5
    //   1091: goto -> 1218
    //   1094: iload_3
    //   1095: istore #7
    //   1097: aload #23
    //   1099: getfield J : [Lb/e/b/k/e$b;
    //   1102: iconst_1
    //   1103: aaload
    //   1104: getstatic b/e/b/k/e$b.e : Lb/e/b/k/e$b;
    //   1107: if_acmpne -> 1188
    //   1110: iload_3
    //   1111: istore #7
    //   1113: iload #5
    //   1115: iconst_3
    //   1116: if_icmpne -> 1188
    //   1119: aload #23
    //   1121: iconst_1
    //   1122: putfield s : I
    //   1125: aload #23
    //   1127: getfield O : I
    //   1130: iconst_m1
    //   1131: if_icmpne -> 1146
    //   1134: aload #23
    //   1136: fconst_1
    //   1137: aload #23
    //   1139: getfield t : F
    //   1142: fdiv
    //   1143: putfield t : F
    //   1146: aload #23
    //   1148: getfield t : F
    //   1151: aload #23
    //   1153: getfield L : I
    //   1156: i2f
    //   1157: fmul
    //   1158: f2i
    //   1159: istore_3
    //   1160: iload_3
    //   1161: istore #7
    //   1163: aload #23
    //   1165: getfield J : [Lb/e/b/k/e$b;
    //   1168: iconst_0
    //   1169: aaload
    //   1170: getstatic b/e/b/k/e$b.e : Lb/e/b/k/e$b;
    //   1173: if_acmpeq -> 1188
    //   1176: iload_3
    //   1177: istore #5
    //   1179: iload #4
    //   1181: istore_3
    //   1182: iconst_4
    //   1183: istore #4
    //   1185: goto -> 1218
    //   1188: iload #7
    //   1190: istore_3
    //   1191: iconst_1
    //   1192: istore #8
    //   1194: iload #5
    //   1196: istore #7
    //   1198: iload_3
    //   1199: istore #5
    //   1201: goto -> 1228
    //   1204: iload #7
    //   1206: istore #4
    //   1208: iload #5
    //   1210: istore #7
    //   1212: iload_3
    //   1213: istore #5
    //   1215: iload #7
    //   1217: istore_3
    //   1218: iconst_0
    //   1219: istore #8
    //   1221: iload #4
    //   1223: istore #7
    //   1225: iload_3
    //   1226: istore #4
    //   1228: aload #23
    //   1230: getfield l : [I
    //   1233: astore #19
    //   1235: aload #19
    //   1237: iconst_0
    //   1238: iload #4
    //   1240: iastore
    //   1241: aload #19
    //   1243: iconst_1
    //   1244: iload #7
    //   1246: iastore
    //   1247: iload #8
    //   1249: ifeq -> 1273
    //   1252: aload #23
    //   1254: getfield s : I
    //   1257: istore_3
    //   1258: iload_3
    //   1259: ifeq -> 1267
    //   1262: iload_3
    //   1263: iconst_m1
    //   1264: if_icmpne -> 1273
    //   1267: iconst_1
    //   1268: istore #14
    //   1270: goto -> 1276
    //   1273: iconst_0
    //   1274: istore #14
    //   1276: aload #23
    //   1278: getfield J : [Lb/e/b/k/e$b;
    //   1281: iconst_0
    //   1282: aaload
    //   1283: getstatic b/e/b/k/e$b.d : Lb/e/b/k/e$b;
    //   1286: if_acmpne -> 1303
    //   1289: aload #23
    //   1291: instanceof b/e/b/k/f
    //   1294: ifeq -> 1303
    //   1297: iconst_1
    //   1298: istore #15
    //   1300: goto -> 1306
    //   1303: iconst_0
    //   1304: istore #15
    //   1306: iload #15
    //   1308: ifeq -> 1314
    //   1311: iconst_0
    //   1312: istore #6
    //   1314: aload #23
    //   1316: getfield F : Lb/e/b/k/d;
    //   1319: invokevirtual h : ()Z
    //   1322: iconst_1
    //   1323: ixor
    //   1324: istore #16
    //   1326: aload #23
    //   1328: getfield I : [Z
    //   1331: astore #19
    //   1333: aload #19
    //   1335: iconst_0
    //   1336: baload
    //   1337: istore #17
    //   1339: aload #19
    //   1341: iconst_1
    //   1342: baload
    //   1343: istore #18
    //   1345: aload #23
    //   1347: getfield h : I
    //   1350: istore_3
    //   1351: aconst_null
    //   1352: astore #25
    //   1354: iload_3
    //   1355: iconst_2
    //   1356: if_icmpeq -> 1631
    //   1359: aload #23
    //   1361: getfield d : Lb/e/b/k/m/j;
    //   1364: astore #19
    //   1366: aload #19
    //   1368: getfield h : Lb/e/b/k/m/f;
    //   1371: astore #21
    //   1373: aload #21
    //   1375: getfield j : Z
    //   1378: ifeq -> 1477
    //   1381: aload #19
    //   1383: getfield i : Lb/e/b/k/m/f;
    //   1386: getfield j : Z
    //   1389: ifne -> 1395
    //   1392: goto -> 1477
    //   1395: aload_1
    //   1396: aload #22
    //   1398: aload #21
    //   1400: getfield g : I
    //   1403: invokevirtual a : (Lb/e/b/i;I)V
    //   1406: aload_1
    //   1407: aload #26
    //   1409: aload #23
    //   1411: getfield d : Lb/e/b/k/m/j;
    //   1414: getfield i : Lb/e/b/k/m/f;
    //   1417: getfield g : I
    //   1420: invokevirtual a : (Lb/e/b/i;I)V
    //   1423: aload #23
    //   1425: getfield K : Lb/e/b/k/e;
    //   1428: ifnull -> 1474
    //   1431: iload #11
    //   1433: ifeq -> 1474
    //   1436: aload #23
    //   1438: getfield f : [Z
    //   1441: iconst_0
    //   1442: baload
    //   1443: ifeq -> 1474
    //   1446: aload_0
    //   1447: invokevirtual D : ()Z
    //   1450: ifne -> 1474
    //   1453: aload_1
    //   1454: aload_1
    //   1455: aload #23
    //   1457: getfield K : Lb/e/b/k/e;
    //   1460: getfield A : Lb/e/b/k/d;
    //   1463: invokevirtual a : (Ljava/lang/Object;)Lb/e/b/i;
    //   1466: aload #26
    //   1468: iconst_0
    //   1469: bipush #8
    //   1471: invokevirtual b : (Lb/e/b/i;Lb/e/b/i;II)V
    //   1474: goto -> 1631
    //   1477: aload #23
    //   1479: getfield K : Lb/e/b/k/e;
    //   1482: astore #19
    //   1484: aload #19
    //   1486: ifnull -> 1503
    //   1489: aload_1
    //   1490: aload #19
    //   1492: getfield A : Lb/e/b/k/d;
    //   1495: invokevirtual a : (Ljava/lang/Object;)Lb/e/b/i;
    //   1498: astore #19
    //   1500: goto -> 1506
    //   1503: aconst_null
    //   1504: astore #19
    //   1506: aload #23
    //   1508: getfield K : Lb/e/b/k/e;
    //   1511: astore #21
    //   1513: aload #21
    //   1515: ifnull -> 1532
    //   1518: aload_1
    //   1519: aload #21
    //   1521: getfield y : Lb/e/b/k/d;
    //   1524: invokevirtual a : (Ljava/lang/Object;)Lb/e/b/i;
    //   1527: astore #21
    //   1529: goto -> 1535
    //   1532: aconst_null
    //   1533: astore #21
    //   1535: aload_0
    //   1536: aload_1
    //   1537: iconst_1
    //   1538: iload #11
    //   1540: iload #10
    //   1542: aload #23
    //   1544: getfield f : [Z
    //   1547: iconst_0
    //   1548: baload
    //   1549: aload #21
    //   1551: aload #19
    //   1553: aload #23
    //   1555: getfield J : [Lb/e/b/k/e$b;
    //   1558: iconst_0
    //   1559: aaload
    //   1560: iload #15
    //   1562: aload #23
    //   1564: getfield y : Lb/e/b/k/d;
    //   1567: aload #23
    //   1569: getfield A : Lb/e/b/k/d;
    //   1572: aload #23
    //   1574: getfield P : I
    //   1577: iload #6
    //   1579: aload #23
    //   1581: getfield S : I
    //   1584: aload #23
    //   1586: getfield u : [I
    //   1589: iconst_0
    //   1590: iaload
    //   1591: aload #23
    //   1593: getfield U : F
    //   1596: iload #14
    //   1598: iload #12
    //   1600: iload #13
    //   1602: iload #17
    //   1604: iload #4
    //   1606: iload #7
    //   1608: aload #23
    //   1610: getfield m : I
    //   1613: aload #23
    //   1615: getfield n : I
    //   1618: aload #23
    //   1620: getfield o : F
    //   1623: iload #16
    //   1625: invokespecial a : (Lb/e/b/d;ZZZZLb/e/b/i;Lb/e/b/i;Lb/e/b/k/e$b;ZLb/e/b/k/d;Lb/e/b/k/d;IIIIFZZZZIIIIFZ)V
    //   1628: goto -> 1631
    //   1631: aload #26
    //   1633: astore #19
    //   1635: aload #27
    //   1637: astore #23
    //   1639: aload #24
    //   1641: astore #21
    //   1643: aload #20
    //   1645: astore #24
    //   1647: iload #10
    //   1649: istore #17
    //   1651: aload #22
    //   1653: astore #20
    //   1655: aload_0
    //   1656: astore #26
    //   1658: aload #26
    //   1660: getfield e : Lb/e/b/k/m/l;
    //   1663: astore #22
    //   1665: aload #22
    //   1667: getfield h : Lb/e/b/k/m/f;
    //   1670: astore #27
    //   1672: aload #27
    //   1674: getfield j : Z
    //   1677: ifeq -> 1813
    //   1680: aload #22
    //   1682: getfield i : Lb/e/b/k/m/f;
    //   1685: getfield j : Z
    //   1688: ifeq -> 1813
    //   1691: aload #27
    //   1693: getfield g : I
    //   1696: istore_3
    //   1697: aload_1
    //   1698: astore #22
    //   1700: aload #22
    //   1702: aload #23
    //   1704: iload_3
    //   1705: invokevirtual a : (Lb/e/b/i;I)V
    //   1708: aload #26
    //   1710: getfield e : Lb/e/b/k/m/l;
    //   1713: getfield i : Lb/e/b/k/m/f;
    //   1716: getfield g : I
    //   1719: istore_3
    //   1720: aload #21
    //   1722: astore #27
    //   1724: aload #22
    //   1726: aload #27
    //   1728: iload_3
    //   1729: invokevirtual a : (Lb/e/b/i;I)V
    //   1732: aload #22
    //   1734: aload #24
    //   1736: aload #26
    //   1738: getfield e : Lb/e/b/k/m/l;
    //   1741: getfield k : Lb/e/b/k/m/f;
    //   1744: getfield g : I
    //   1747: invokevirtual a : (Lb/e/b/i;I)V
    //   1750: aload #26
    //   1752: getfield K : Lb/e/b/k/e;
    //   1755: astore #28
    //   1757: aload #28
    //   1759: ifnull -> 1808
    //   1762: iload #13
    //   1764: ifne -> 1808
    //   1767: iload #17
    //   1769: ifeq -> 1808
    //   1772: aload #26
    //   1774: getfield f : [Z
    //   1777: iconst_1
    //   1778: baload
    //   1779: ifeq -> 1805
    //   1782: aload #22
    //   1784: aload #22
    //   1786: aload #28
    //   1788: getfield B : Lb/e/b/k/d;
    //   1791: invokevirtual a : (Ljava/lang/Object;)Lb/e/b/i;
    //   1794: aload #27
    //   1796: iconst_0
    //   1797: bipush #8
    //   1799: invokevirtual b : (Lb/e/b/i;Lb/e/b/i;II)V
    //   1802: goto -> 1808
    //   1805: goto -> 1808
    //   1808: iconst_0
    //   1809: istore_3
    //   1810: goto -> 1815
    //   1813: iconst_1
    //   1814: istore_3
    //   1815: aload_1
    //   1816: astore #27
    //   1818: aload #21
    //   1820: astore #22
    //   1822: aload #24
    //   1824: astore #28
    //   1826: aload #26
    //   1828: getfield i : I
    //   1831: iconst_2
    //   1832: if_icmpne -> 1837
    //   1835: iconst_0
    //   1836: istore_3
    //   1837: iload_3
    //   1838: ifeq -> 2187
    //   1841: aload #26
    //   1843: getfield J : [Lb/e/b/k/e$b;
    //   1846: iconst_1
    //   1847: aaload
    //   1848: getstatic b/e/b/k/e$b.d : Lb/e/b/k/e$b;
    //   1851: if_acmpne -> 1868
    //   1854: aload #26
    //   1856: instanceof b/e/b/k/f
    //   1859: ifeq -> 1868
    //   1862: iconst_1
    //   1863: istore #10
    //   1865: goto -> 1871
    //   1868: iconst_0
    //   1869: istore #10
    //   1871: iload #10
    //   1873: ifeq -> 1879
    //   1876: iconst_0
    //   1877: istore #5
    //   1879: iload #8
    //   1881: ifeq -> 1906
    //   1884: aload #26
    //   1886: getfield s : I
    //   1889: istore_3
    //   1890: iload_3
    //   1891: iconst_1
    //   1892: if_icmpeq -> 1900
    //   1895: iload_3
    //   1896: iconst_m1
    //   1897: if_icmpne -> 1906
    //   1900: iconst_1
    //   1901: istore #14
    //   1903: goto -> 1909
    //   1906: iconst_0
    //   1907: istore #14
    //   1909: aload #26
    //   1911: getfield K : Lb/e/b/k/e;
    //   1914: astore #21
    //   1916: aload #21
    //   1918: ifnull -> 1936
    //   1921: aload #27
    //   1923: aload #21
    //   1925: getfield B : Lb/e/b/k/d;
    //   1928: invokevirtual a : (Ljava/lang/Object;)Lb/e/b/i;
    //   1931: astore #21
    //   1933: goto -> 1939
    //   1936: aconst_null
    //   1937: astore #21
    //   1939: aload #26
    //   1941: getfield K : Lb/e/b/k/e;
    //   1944: astore #29
    //   1946: aload #25
    //   1948: astore #24
    //   1950: aload #29
    //   1952: ifnull -> 1967
    //   1955: aload #27
    //   1957: aload #29
    //   1959: getfield z : Lb/e/b/k/d;
    //   1962: invokevirtual a : (Ljava/lang/Object;)Lb/e/b/i;
    //   1965: astore #24
    //   1967: aload #26
    //   1969: getfield R : I
    //   1972: ifgt -> 1985
    //   1975: aload #26
    //   1977: getfield X : I
    //   1980: bipush #8
    //   1982: if_icmpne -> 2087
    //   1985: aload #27
    //   1987: aload #28
    //   1989: aload #23
    //   1991: aload_0
    //   1992: invokevirtual d : ()I
    //   1995: bipush #8
    //   1997: invokevirtual a : (Lb/e/b/i;Lb/e/b/i;II)Lb/e/b/b;
    //   2000: pop
    //   2001: aload #26
    //   2003: getfield C : Lb/e/b/k/d;
    //   2006: getfield d : Lb/e/b/k/d;
    //   2009: astore #25
    //   2011: aload #25
    //   2013: ifnull -> 2064
    //   2016: aload #27
    //   2018: aload #28
    //   2020: aload #27
    //   2022: aload #25
    //   2024: invokevirtual a : (Ljava/lang/Object;)Lb/e/b/i;
    //   2027: iconst_0
    //   2028: bipush #8
    //   2030: invokevirtual a : (Lb/e/b/i;Lb/e/b/i;II)Lb/e/b/b;
    //   2033: pop
    //   2034: iload #17
    //   2036: ifeq -> 2058
    //   2039: aload #27
    //   2041: aload #21
    //   2043: aload #27
    //   2045: aload #26
    //   2047: getfield B : Lb/e/b/k/d;
    //   2050: invokevirtual a : (Ljava/lang/Object;)Lb/e/b/i;
    //   2053: iconst_0
    //   2054: iconst_5
    //   2055: invokevirtual b : (Lb/e/b/i;Lb/e/b/i;II)V
    //   2058: iconst_0
    //   2059: istore #15
    //   2061: goto -> 2091
    //   2064: aload #26
    //   2066: getfield X : I
    //   2069: bipush #8
    //   2071: if_icmpne -> 2087
    //   2074: aload #27
    //   2076: aload #28
    //   2078: aload #23
    //   2080: iconst_0
    //   2081: bipush #8
    //   2083: invokevirtual a : (Lb/e/b/i;Lb/e/b/i;II)Lb/e/b/b;
    //   2086: pop
    //   2087: iload #16
    //   2089: istore #15
    //   2091: aload_0
    //   2092: aload_1
    //   2093: iconst_0
    //   2094: iload #17
    //   2096: iload #11
    //   2098: aload #26
    //   2100: getfield f : [Z
    //   2103: iconst_1
    //   2104: baload
    //   2105: aload #24
    //   2107: aload #21
    //   2109: aload #26
    //   2111: getfield J : [Lb/e/b/k/e$b;
    //   2114: iconst_1
    //   2115: aaload
    //   2116: iload #10
    //   2118: aload #26
    //   2120: getfield z : Lb/e/b/k/d;
    //   2123: aload #26
    //   2125: getfield B : Lb/e/b/k/d;
    //   2128: aload #26
    //   2130: getfield Q : I
    //   2133: iload #5
    //   2135: aload #26
    //   2137: getfield T : I
    //   2140: aload #26
    //   2142: getfield u : [I
    //   2145: iconst_1
    //   2146: iaload
    //   2147: aload #26
    //   2149: getfield V : F
    //   2152: iload #14
    //   2154: iload #13
    //   2156: iload #12
    //   2158: iload #18
    //   2160: iload #7
    //   2162: iload #4
    //   2164: aload #26
    //   2166: getfield p : I
    //   2169: aload #26
    //   2171: getfield q : I
    //   2174: aload #26
    //   2176: getfield r : F
    //   2179: iload #15
    //   2181: invokespecial a : (Lb/e/b/d;ZZZZLb/e/b/i;Lb/e/b/i;Lb/e/b/k/e$b;ZLb/e/b/k/d;Lb/e/b/k/d;IIIIFZZZZIIIIFZ)V
    //   2184: goto -> 2187
    //   2187: aload #23
    //   2189: astore #21
    //   2191: iload #8
    //   2193: ifeq -> 2261
    //   2196: aload_0
    //   2197: astore #23
    //   2199: aload #23
    //   2201: getfield s : I
    //   2204: istore_3
    //   2205: aload #23
    //   2207: getfield t : F
    //   2210: fstore_2
    //   2211: iload_3
    //   2212: iconst_1
    //   2213: if_icmpne -> 2227
    //   2216: aload #19
    //   2218: astore #23
    //   2220: aload #20
    //   2222: astore #24
    //   2224: goto -> 2243
    //   2227: aload #21
    //   2229: astore #24
    //   2231: aload #22
    //   2233: astore #23
    //   2235: aload #20
    //   2237: astore #21
    //   2239: aload #19
    //   2241: astore #22
    //   2243: aload_1
    //   2244: aload #22
    //   2246: aload #21
    //   2248: aload #23
    //   2250: aload #24
    //   2252: fload_2
    //   2253: bipush #8
    //   2255: invokevirtual a : (Lb/e/b/i;Lb/e/b/i;Lb/e/b/i;Lb/e/b/i;FI)V
    //   2258: goto -> 2261
    //   2261: aload_0
    //   2262: astore #19
    //   2264: aload #19
    //   2266: getfield F : Lb/e/b/k/d;
    //   2269: invokevirtual h : ()Z
    //   2272: ifeq -> 2314
    //   2275: aload_1
    //   2276: aload #19
    //   2278: aload #19
    //   2280: getfield F : Lb/e/b/k/d;
    //   2283: invokevirtual e : ()Lb/e/b/k/d;
    //   2286: invokevirtual c : ()Lb/e/b/k/e;
    //   2289: aload #19
    //   2291: getfield v : F
    //   2294: ldc_w 90.0
    //   2297: fadd
    //   2298: f2d
    //   2299: invokestatic toRadians : (D)D
    //   2302: d2f
    //   2303: aload #19
    //   2305: getfield F : Lb/e/b/k/d;
    //   2308: invokevirtual a : ()I
    //   2311: invokevirtual a : (Lb/e/b/k/e;Lb/e/b/k/e;FI)V
    //   2314: return
  }
  
  public void a(d.b paramb1, e parame, d.b paramb2, int paramInt1, int paramInt2) {
    a(paramb1).a(parame.a(paramb2), paramInt1, paramInt2, true);
  }
  
  public void a(b paramb) {
    this.J[0] = paramb;
  }
  
  public void a(e parame, float paramFloat, int paramInt) {
    d.b b1 = d.b.i;
    a(b1, parame, b1, paramInt, 0);
    this.v = paramFloat;
  }
  
  public void a(Object paramObject) {
    this.W = paramObject;
  }
  
  public void a(String paramString) {
    this.Y = paramString;
  }
  
  public void a(boolean paramBoolean) {
    this.w = paramBoolean;
  }
  
  public void a(boolean paramBoolean1, boolean paramBoolean2) {
    // Byte code:
    //   0: iload_1
    //   1: aload_0
    //   2: getfield d : Lb/e/b/k/m/j;
    //   5: invokevirtual e : ()Z
    //   8: iand
    //   9: istore #9
    //   11: iload_2
    //   12: aload_0
    //   13: getfield e : Lb/e/b/k/m/l;
    //   16: invokevirtual e : ()Z
    //   19: iand
    //   20: istore #8
    //   22: aload_0
    //   23: getfield d : Lb/e/b/k/m/j;
    //   26: astore #10
    //   28: aload #10
    //   30: getfield h : Lb/e/b/k/m/f;
    //   33: getfield g : I
    //   36: istore #4
    //   38: aload_0
    //   39: getfield e : Lb/e/b/k/m/l;
    //   42: astore #11
    //   44: aload #11
    //   46: getfield h : Lb/e/b/k/m/f;
    //   49: getfield g : I
    //   52: istore_3
    //   53: aload #10
    //   55: getfield i : Lb/e/b/k/m/f;
    //   58: getfield g : I
    //   61: istore #6
    //   63: aload #11
    //   65: getfield i : Lb/e/b/k/m/f;
    //   68: getfield g : I
    //   71: istore #7
    //   73: iload #6
    //   75: iload #4
    //   77: isub
    //   78: iflt -> 150
    //   81: iload #7
    //   83: iload_3
    //   84: isub
    //   85: iflt -> 150
    //   88: iload #4
    //   90: ldc_w -2147483648
    //   93: if_icmpeq -> 150
    //   96: iload #4
    //   98: ldc 2147483647
    //   100: if_icmpeq -> 150
    //   103: iload_3
    //   104: ldc_w -2147483648
    //   107: if_icmpeq -> 150
    //   110: iload_3
    //   111: ldc 2147483647
    //   113: if_icmpeq -> 150
    //   116: iload #6
    //   118: ldc_w -2147483648
    //   121: if_icmpeq -> 150
    //   124: iload #6
    //   126: ldc 2147483647
    //   128: if_icmpeq -> 150
    //   131: iload #7
    //   133: ldc_w -2147483648
    //   136: if_icmpeq -> 150
    //   139: iload #7
    //   141: istore #5
    //   143: iload #7
    //   145: ldc 2147483647
    //   147: if_icmpne -> 161
    //   150: iconst_0
    //   151: istore #6
    //   153: iconst_0
    //   154: istore #4
    //   156: iconst_0
    //   157: istore #5
    //   159: iconst_0
    //   160: istore_3
    //   161: iload #6
    //   163: iload #4
    //   165: isub
    //   166: istore #6
    //   168: iload #5
    //   170: iload_3
    //   171: isub
    //   172: istore #5
    //   174: iload #9
    //   176: ifeq -> 185
    //   179: aload_0
    //   180: iload #4
    //   182: putfield P : I
    //   185: iload #8
    //   187: ifeq -> 195
    //   190: aload_0
    //   191: iload_3
    //   192: putfield Q : I
    //   195: aload_0
    //   196: getfield X : I
    //   199: bipush #8
    //   201: if_icmpne -> 215
    //   204: aload_0
    //   205: iconst_0
    //   206: putfield L : I
    //   209: aload_0
    //   210: iconst_0
    //   211: putfield M : I
    //   214: return
    //   215: iload #9
    //   217: ifeq -> 277
    //   220: aload_0
    //   221: getfield J : [Lb/e/b/k/e$b;
    //   224: iconst_0
    //   225: aaload
    //   226: getstatic b/e/b/k/e$b.c : Lb/e/b/k/e$b;
    //   229: if_acmpne -> 246
    //   232: aload_0
    //   233: getfield L : I
    //   236: istore_3
    //   237: iload #6
    //   239: iload_3
    //   240: if_icmpge -> 246
    //   243: goto -> 249
    //   246: iload #6
    //   248: istore_3
    //   249: aload_0
    //   250: iload_3
    //   251: putfield L : I
    //   254: aload_0
    //   255: getfield L : I
    //   258: istore_3
    //   259: aload_0
    //   260: getfield S : I
    //   263: istore #4
    //   265: iload_3
    //   266: iload #4
    //   268: if_icmpge -> 277
    //   271: aload_0
    //   272: iload #4
    //   274: putfield L : I
    //   277: iload #8
    //   279: ifeq -> 339
    //   282: aload_0
    //   283: getfield J : [Lb/e/b/k/e$b;
    //   286: iconst_1
    //   287: aaload
    //   288: getstatic b/e/b/k/e$b.c : Lb/e/b/k/e$b;
    //   291: if_acmpne -> 308
    //   294: aload_0
    //   295: getfield M : I
    //   298: istore_3
    //   299: iload #5
    //   301: iload_3
    //   302: if_icmpge -> 308
    //   305: goto -> 311
    //   308: iload #5
    //   310: istore_3
    //   311: aload_0
    //   312: iload_3
    //   313: putfield M : I
    //   316: aload_0
    //   317: getfield M : I
    //   320: istore_3
    //   321: aload_0
    //   322: getfield T : I
    //   325: istore #4
    //   327: iload_3
    //   328: iload #4
    //   330: if_icmpge -> 339
    //   333: aload_0
    //   334: iload #4
    //   336: putfield M : I
    //   339: return
  }
  
  public void a(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4) {
    if (this.s == -1)
      if (paramBoolean3 && !paramBoolean4) {
        this.s = 0;
      } else if (!paramBoolean3 && paramBoolean4) {
        this.s = 1;
        if (this.O == -1)
          this.t = 1.0F / this.t; 
      }  
    if (this.s == 0 && (!this.z.h() || !this.B.h())) {
      this.s = 1;
    } else if (this.s == 1 && (!this.y.h() || !this.A.h())) {
      this.s = 0;
    } 
    if (this.s == -1 && (!this.z.h() || !this.B.h() || !this.y.h() || !this.A.h()))
      if (this.z.h() && this.B.h()) {
        this.s = 0;
      } else if (this.y.h() && this.A.h()) {
        this.t = 1.0F / this.t;
        this.s = 1;
      }  
    if (this.s == -1) {
      if (this.m > 0 && this.p == 0) {
        this.s = 0;
        return;
      } 
      if (this.m == 0 && this.p > 0) {
        this.t = 1.0F / this.t;
        this.s = 1;
      } 
    } 
  }
  
  public b b(int paramInt) {
    return (paramInt == 0) ? m() : ((paramInt == 1) ? w() : null);
  }
  
  public void b(float paramFloat) {
    this.c0[0] = paramFloat;
  }
  
  public void b(int paramInt1, int paramInt2) {
    this.P = paramInt1;
    this.Q = paramInt2;
  }
  
  public void b(int paramInt1, int paramInt2, int paramInt3, float paramFloat) {
    this.k = paramInt1;
    this.p = paramInt2;
    paramInt1 = paramInt3;
    if (paramInt3 == Integer.MAX_VALUE)
      paramInt1 = 0; 
    this.q = paramInt1;
    this.r = paramFloat;
    if (paramFloat > 0.0F && paramFloat < 1.0F && this.k == 0)
      this.k = 2; 
  }
  
  public void b(d paramd) {
    paramd.a(this.y);
    paramd.a(this.z);
    paramd.a(this.A);
    paramd.a(this.B);
    if (this.R > 0)
      paramd.a(this.C); 
  }
  
  public void b(b paramb) {
    this.J[1] = paramb;
  }
  
  public void b(e parame) {
    this.K = parame;
  }
  
  public void b(String paramString) {
    // Byte code:
    //   0: aload_1
    //   1: ifnull -> 261
    //   4: aload_1
    //   5: invokevirtual length : ()I
    //   8: ifne -> 14
    //   11: goto -> 261
    //   14: iconst_m1
    //   15: istore #6
    //   17: aload_1
    //   18: invokevirtual length : ()I
    //   21: istore #8
    //   23: aload_1
    //   24: bipush #44
    //   26: invokevirtual indexOf : (I)I
    //   29: istore #9
    //   31: iconst_0
    //   32: istore #7
    //   34: iload #6
    //   36: istore #4
    //   38: iload #7
    //   40: istore #5
    //   42: iload #9
    //   44: ifle -> 114
    //   47: iload #6
    //   49: istore #4
    //   51: iload #7
    //   53: istore #5
    //   55: iload #9
    //   57: iload #8
    //   59: iconst_1
    //   60: isub
    //   61: if_icmpge -> 114
    //   64: aload_1
    //   65: iconst_0
    //   66: iload #9
    //   68: invokevirtual substring : (II)Ljava/lang/String;
    //   71: astore #10
    //   73: aload #10
    //   75: ldc_w 'W'
    //   78: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   81: ifeq -> 90
    //   84: iconst_0
    //   85: istore #4
    //   87: goto -> 108
    //   90: iload #6
    //   92: istore #4
    //   94: aload #10
    //   96: ldc_w 'H'
    //   99: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   102: ifeq -> 108
    //   105: iconst_1
    //   106: istore #4
    //   108: iload #9
    //   110: iconst_1
    //   111: iadd
    //   112: istore #5
    //   114: aload_1
    //   115: bipush #58
    //   117: invokevirtual indexOf : (I)I
    //   120: istore #6
    //   122: iload #6
    //   124: iflt -> 219
    //   127: iload #6
    //   129: iload #8
    //   131: iconst_1
    //   132: isub
    //   133: if_icmpge -> 219
    //   136: aload_1
    //   137: iload #5
    //   139: iload #6
    //   141: invokevirtual substring : (II)Ljava/lang/String;
    //   144: astore #10
    //   146: aload_1
    //   147: iload #6
    //   149: iconst_1
    //   150: iadd
    //   151: invokevirtual substring : (I)Ljava/lang/String;
    //   154: astore_1
    //   155: aload #10
    //   157: invokevirtual length : ()I
    //   160: ifle -> 241
    //   163: aload_1
    //   164: invokevirtual length : ()I
    //   167: ifle -> 241
    //   170: aload #10
    //   172: invokestatic parseFloat : (Ljava/lang/String;)F
    //   175: fstore_2
    //   176: aload_1
    //   177: invokestatic parseFloat : (Ljava/lang/String;)F
    //   180: fstore_3
    //   181: fload_2
    //   182: fconst_0
    //   183: fcmpl
    //   184: ifle -> 241
    //   187: fload_3
    //   188: fconst_0
    //   189: fcmpl
    //   190: ifle -> 241
    //   193: iload #4
    //   195: iconst_1
    //   196: if_icmpne -> 209
    //   199: fload_3
    //   200: fload_2
    //   201: fdiv
    //   202: invokestatic abs : (F)F
    //   205: fstore_2
    //   206: goto -> 243
    //   209: fload_2
    //   210: fload_3
    //   211: fdiv
    //   212: invokestatic abs : (F)F
    //   215: fstore_2
    //   216: goto -> 243
    //   219: aload_1
    //   220: iload #5
    //   222: invokevirtual substring : (I)Ljava/lang/String;
    //   225: astore_1
    //   226: aload_1
    //   227: invokevirtual length : ()I
    //   230: ifle -> 241
    //   233: aload_1
    //   234: invokestatic parseFloat : (Ljava/lang/String;)F
    //   237: fstore_2
    //   238: goto -> 243
    //   241: fconst_0
    //   242: fstore_2
    //   243: fload_2
    //   244: fconst_0
    //   245: fcmpl
    //   246: ifle -> 260
    //   249: aload_0
    //   250: fload_2
    //   251: putfield N : F
    //   254: aload_0
    //   255: iload #4
    //   257: putfield O : I
    //   260: return
    //   261: aload_0
    //   262: fconst_0
    //   263: putfield N : F
    //   266: return
    //   267: astore_1
    //   268: goto -> 241
    // Exception table:
    //   from	to	target	type
    //   170	181	267	java/lang/NumberFormatException
    //   199	206	267	java/lang/NumberFormatException
    //   209	216	267	java/lang/NumberFormatException
    //   233	238	267	java/lang/NumberFormatException
  }
  
  public void b(boolean paramBoolean) {
    this.x = paramBoolean;
  }
  
  boolean b() {
    return (this instanceof k || this instanceof g);
  }
  
  public int c(int paramInt) {
    return (paramInt == 0) ? z() : ((paramInt == 1) ? j() : 0);
  }
  
  public void c(float paramFloat) {
    this.V = paramFloat;
  }
  
  public void c(int paramInt1, int paramInt2) {
    this.Q = paramInt1;
    this.M = paramInt2 - paramInt1;
    paramInt1 = this.M;
    paramInt2 = this.T;
    if (paramInt1 < paramInt2)
      this.M = paramInt2; 
  }
  
  public void c(d paramd) {
    // Byte code:
    //   0: aload_1
    //   1: aload_0
    //   2: getfield y : Lb/e/b/k/d;
    //   5: invokevirtual b : (Ljava/lang/Object;)I
    //   8: istore_3
    //   9: aload_1
    //   10: aload_0
    //   11: getfield z : Lb/e/b/k/d;
    //   14: invokevirtual b : (Ljava/lang/Object;)I
    //   17: istore #6
    //   19: aload_1
    //   20: aload_0
    //   21: getfield A : Lb/e/b/k/d;
    //   24: invokevirtual b : (Ljava/lang/Object;)I
    //   27: istore #5
    //   29: aload_1
    //   30: aload_0
    //   31: getfield B : Lb/e/b/k/d;
    //   34: invokevirtual b : (Ljava/lang/Object;)I
    //   37: istore #7
    //   39: aload_0
    //   40: getfield d : Lb/e/b/k/m/j;
    //   43: astore #8
    //   45: aload #8
    //   47: getfield h : Lb/e/b/k/m/f;
    //   50: astore_1
    //   51: iload_3
    //   52: istore #4
    //   54: iload #5
    //   56: istore_2
    //   57: aload_1
    //   58: getfield j : Z
    //   61: ifeq -> 97
    //   64: aload #8
    //   66: getfield i : Lb/e/b/k/m/f;
    //   69: astore #8
    //   71: iload_3
    //   72: istore #4
    //   74: iload #5
    //   76: istore_2
    //   77: aload #8
    //   79: getfield j : Z
    //   82: ifeq -> 97
    //   85: aload_1
    //   86: getfield g : I
    //   89: istore #4
    //   91: aload #8
    //   93: getfield g : I
    //   96: istore_2
    //   97: aload_0
    //   98: getfield e : Lb/e/b/k/m/l;
    //   101: astore #8
    //   103: aload #8
    //   105: getfield h : Lb/e/b/k/m/f;
    //   108: astore_1
    //   109: iload #6
    //   111: istore #5
    //   113: iload #7
    //   115: istore_3
    //   116: aload_1
    //   117: getfield j : Z
    //   120: ifeq -> 157
    //   123: aload #8
    //   125: getfield i : Lb/e/b/k/m/f;
    //   128: astore #8
    //   130: iload #6
    //   132: istore #5
    //   134: iload #7
    //   136: istore_3
    //   137: aload #8
    //   139: getfield j : Z
    //   142: ifeq -> 157
    //   145: aload_1
    //   146: getfield g : I
    //   149: istore #5
    //   151: aload #8
    //   153: getfield g : I
    //   156: istore_3
    //   157: iload_2
    //   158: iload #4
    //   160: isub
    //   161: iflt -> 232
    //   164: iload_3
    //   165: iload #5
    //   167: isub
    //   168: iflt -> 232
    //   171: iload #4
    //   173: ldc_w -2147483648
    //   176: if_icmpeq -> 232
    //   179: iload #4
    //   181: ldc 2147483647
    //   183: if_icmpeq -> 232
    //   186: iload #5
    //   188: ldc_w -2147483648
    //   191: if_icmpeq -> 232
    //   194: iload #5
    //   196: ldc 2147483647
    //   198: if_icmpeq -> 232
    //   201: iload_2
    //   202: ldc_w -2147483648
    //   205: if_icmpeq -> 232
    //   208: iload_2
    //   209: ldc 2147483647
    //   211: if_icmpeq -> 232
    //   214: iload_3
    //   215: ldc_w -2147483648
    //   218: if_icmpeq -> 232
    //   221: iload_2
    //   222: istore #6
    //   224: iload_3
    //   225: istore_2
    //   226: iload_3
    //   227: ldc 2147483647
    //   229: if_icmpne -> 243
    //   232: iconst_0
    //   233: istore_2
    //   234: iconst_0
    //   235: istore #4
    //   237: iconst_0
    //   238: istore #5
    //   240: iconst_0
    //   241: istore #6
    //   243: aload_0
    //   244: iload #4
    //   246: iload #5
    //   248: iload #6
    //   250: iload_2
    //   251: invokevirtual a : (IIII)V
    //   254: return
  }
  
  public void c(boolean paramBoolean) {}
  
  public boolean c() {
    return (this.X != 8);
  }
  
  public int d() {
    return this.R;
  }
  
  public e d(int paramInt) {
    if (paramInt == 0) {
      d d1 = this.A;
      d d2 = d1.d;
      if (d2 != null && d2.d == d1)
        return d2.b; 
    } else if (paramInt == 1) {
      d d1 = this.B;
      d d2 = d1.d;
      if (d2 != null && d2.d == d1)
        return d2.b; 
    } 
    return null;
  }
  
  public void d(float paramFloat) {
    this.c0[1] = paramFloat;
  }
  
  public int e() {
    return B() + this.M;
  }
  
  public e e(int paramInt) {
    if (paramInt == 0) {
      d d1 = this.y;
      d d2 = d1.d;
      if (d2 != null && d2.d == d1)
        return d2.b; 
    } else if (paramInt == 1) {
      d d1 = this.z;
      d d2 = d1.d;
      if (d2 != null && d2.d == d1)
        return d2.b; 
    } 
    return null;
  }
  
  public m f(int paramInt) {
    return (m)((paramInt == 0) ? this.d : ((paramInt == 1) ? this.e : null));
  }
  
  public Object f() {
    return this.W;
  }
  
  public String g() {
    return this.Y;
  }
  
  public void g(int paramInt) {
    boolean bool;
    this.R = paramInt;
    if (paramInt > 0) {
      bool = true;
    } else {
      bool = false;
    } 
    this.w = bool;
  }
  
  public float h() {
    return this.N;
  }
  
  public void h(int paramInt) {
    this.M = paramInt;
    paramInt = this.M;
    int i = this.T;
    if (paramInt < i)
      this.M = i; 
  }
  
  public int i() {
    return this.O;
  }
  
  public void i(int paramInt) {
    this.a0 = paramInt;
  }
  
  public int j() {
    return (this.X == 8) ? 0 : this.M;
  }
  
  public void j(int paramInt) {
    this.u[1] = paramInt;
  }
  
  public float k() {
    return this.U;
  }
  
  public void k(int paramInt) {
    this.u[0] = paramInt;
  }
  
  public int l() {
    return this.a0;
  }
  
  public void l(int paramInt) {
    int i = paramInt;
    if (paramInt < 0)
      i = 0; 
    this.T = i;
  }
  
  public b m() {
    return this.J[0];
  }
  
  public void m(int paramInt) {
    int i = paramInt;
    if (paramInt < 0)
      i = 0; 
    this.S = i;
  }
  
  public int n() {
    d d1 = this.y;
    int i = 0;
    if (d1 != null)
      i = 0 + d1.e; 
    d1 = this.A;
    int k = i;
    if (d1 != null)
      k = i + d1.e; 
    return k;
  }
  
  public void n(int paramInt) {
    this.b0 = paramInt;
  }
  
  public int o() {
    return this.u[1];
  }
  
  public void o(int paramInt) {
    this.X = paramInt;
  }
  
  public int p() {
    return this.u[0];
  }
  
  public void p(int paramInt) {
    this.L = paramInt;
    paramInt = this.L;
    int i = this.S;
    if (paramInt < i)
      this.L = i; 
  }
  
  public int q() {
    return this.T;
  }
  
  public void q(int paramInt) {
    this.P = paramInt;
  }
  
  public int r() {
    return this.S;
  }
  
  public void r(int paramInt) {
    this.Q = paramInt;
  }
  
  public e s() {
    return this.K;
  }
  
  public int t() {
    return A() + this.L;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    String str1 = this.Z;
    String str2 = "";
    if (str1 != null) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("type: ");
      stringBuilder1.append(this.Z);
      stringBuilder1.append(" ");
      String str = stringBuilder1.toString();
    } else {
      str1 = "";
    } 
    stringBuilder.append(str1);
    str1 = str2;
    if (this.Y != null) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("id: ");
      stringBuilder1.append(this.Y);
      stringBuilder1.append(" ");
      str1 = stringBuilder1.toString();
    } 
    stringBuilder.append(str1);
    stringBuilder.append("(");
    stringBuilder.append(this.P);
    stringBuilder.append(", ");
    stringBuilder.append(this.Q);
    stringBuilder.append(") - (");
    stringBuilder.append(this.L);
    stringBuilder.append(" x ");
    stringBuilder.append(this.M);
    stringBuilder.append(")");
    return stringBuilder.toString();
  }
  
  public float u() {
    return this.V;
  }
  
  public int v() {
    return this.b0;
  }
  
  public b w() {
    return this.J[1];
  }
  
  public int x() {
    d d1 = this.y;
    int i = 0;
    if (d1 != null)
      i = 0 + this.z.e; 
    int k = i;
    if (this.A != null)
      k = i + this.B.e; 
    return k;
  }
  
  public int y() {
    return this.X;
  }
  
  public int z() {
    return (this.X == 8) ? 0 : this.L;
  }
  
  public enum b {
    c, d, e, f;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/e/b/k/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */