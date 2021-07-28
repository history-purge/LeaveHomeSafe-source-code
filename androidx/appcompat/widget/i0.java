package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import b.a.j;
import b.g.m.d;
import b.g.m.v;

public class i0 extends ViewGroup {
  private boolean c = true;
  
  private int d = -1;
  
  private int e = 0;
  
  private int f;
  
  private int g = 8388659;
  
  private int h;
  
  private float i;
  
  private boolean j;
  
  private int[] k;
  
  private int[] l;
  
  private Drawable m;
  
  private int n;
  
  private int o;
  
  private int p;
  
  private int q;
  
  public i0(Context paramContext) {
    this(paramContext, null);
  }
  
  public i0(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public i0(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    x0 x0 = x0.a(paramContext, paramAttributeSet, j.LinearLayoutCompat, paramInt, 0);
    v.a((View)this, paramContext, j.LinearLayoutCompat, paramAttributeSet, x0.a(), paramInt, 0);
    paramInt = x0.d(j.LinearLayoutCompat_android_orientation, -1);
    if (paramInt >= 0)
      setOrientation(paramInt); 
    paramInt = x0.d(j.LinearLayoutCompat_android_gravity, -1);
    if (paramInt >= 0)
      setGravity(paramInt); 
    boolean bool = x0.a(j.LinearLayoutCompat_android_baselineAligned, true);
    if (!bool)
      setBaselineAligned(bool); 
    this.i = x0.b(j.LinearLayoutCompat_android_weightSum, -1.0F);
    this.d = x0.d(j.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
    this.j = x0.a(j.LinearLayoutCompat_measureWithLargestChild, false);
    setDividerDrawable(x0.b(j.LinearLayoutCompat_divider));
    this.p = x0.d(j.LinearLayoutCompat_showDividers, 0);
    this.q = x0.c(j.LinearLayoutCompat_dividerPadding, 0);
    x0.b();
  }
  
  private void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramView.layout(paramInt1, paramInt2, paramInt3 + paramInt1, paramInt4 + paramInt2);
  }
  
  private void c(int paramInt1, int paramInt2) {
    int j = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
    for (int i = 0; i < paramInt1; i++) {
      View view = a(i);
      if (view.getVisibility() != 8) {
        a a = (a)view.getLayoutParams();
        if (a.height == -1) {
          int k = a.width;
          a.width = view.getMeasuredWidth();
          measureChildWithMargins(view, paramInt2, 0, j, 0);
          a.width = k;
        } 
      } 
    } 
  }
  
  private void d(int paramInt1, int paramInt2) {
    int j = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
    for (int i = 0; i < paramInt1; i++) {
      View view = a(i);
      if (view.getVisibility() != 8) {
        a a = (a)view.getLayoutParams();
        if (a.width == -1) {
          int k = a.height;
          a.height = view.getMeasuredHeight();
          measureChildWithMargins(view, j, 0, paramInt2, 0);
          a.height = k;
        } 
      } 
    } 
  }
  
  int a(View paramView) {
    return 0;
  }
  
  int a(View paramView, int paramInt) {
    return 0;
  }
  
  View a(int paramInt) {
    return getChildAt(paramInt);
  }
  
  void a(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: iconst_0
    //   2: putfield h : I
    //   5: aload_0
    //   6: invokevirtual getVirtualChildCount : ()I
    //   9: istore #16
    //   11: iload_1
    //   12: invokestatic getMode : (I)I
    //   15: istore #22
    //   17: iload_2
    //   18: invokestatic getMode : (I)I
    //   21: istore #21
    //   23: aload_0
    //   24: getfield k : [I
    //   27: ifnull -> 37
    //   30: aload_0
    //   31: getfield l : [I
    //   34: ifnonnull -> 51
    //   37: aload_0
    //   38: iconst_4
    //   39: newarray int
    //   41: putfield k : [I
    //   44: aload_0
    //   45: iconst_4
    //   46: newarray int
    //   48: putfield l : [I
    //   51: aload_0
    //   52: getfield k : [I
    //   55: astore #28
    //   57: aload_0
    //   58: getfield l : [I
    //   61: astore #26
    //   63: aload #28
    //   65: iconst_3
    //   66: iconst_m1
    //   67: iastore
    //   68: aload #28
    //   70: iconst_2
    //   71: iconst_m1
    //   72: iastore
    //   73: aload #28
    //   75: iconst_1
    //   76: iconst_m1
    //   77: iastore
    //   78: aload #28
    //   80: iconst_0
    //   81: iconst_m1
    //   82: iastore
    //   83: aload #26
    //   85: iconst_3
    //   86: iconst_m1
    //   87: iastore
    //   88: aload #26
    //   90: iconst_2
    //   91: iconst_m1
    //   92: iastore
    //   93: aload #26
    //   95: iconst_1
    //   96: iconst_m1
    //   97: iastore
    //   98: aload #26
    //   100: iconst_0
    //   101: iconst_m1
    //   102: iastore
    //   103: aload_0
    //   104: getfield c : Z
    //   107: istore #24
    //   109: aload_0
    //   110: getfield j : Z
    //   113: istore #25
    //   115: iload #22
    //   117: ldc 1073741824
    //   119: if_icmpne -> 128
    //   122: iconst_1
    //   123: istore #15
    //   125: goto -> 131
    //   128: iconst_0
    //   129: istore #15
    //   131: fconst_0
    //   132: fstore_3
    //   133: iconst_0
    //   134: istore #8
    //   136: iconst_0
    //   137: istore #7
    //   139: iconst_0
    //   140: istore #13
    //   142: iconst_0
    //   143: istore #6
    //   145: iconst_0
    //   146: istore #11
    //   148: iconst_0
    //   149: istore #12
    //   151: iconst_0
    //   152: istore #9
    //   154: iconst_1
    //   155: istore #5
    //   157: iconst_0
    //   158: istore #10
    //   160: iload #8
    //   162: iload #16
    //   164: if_icmpge -> 848
    //   167: aload_0
    //   168: iload #8
    //   170: invokevirtual a : (I)Landroid/view/View;
    //   173: astore #27
    //   175: aload #27
    //   177: ifnonnull -> 198
    //   180: aload_0
    //   181: aload_0
    //   182: getfield h : I
    //   185: aload_0
    //   186: iload #8
    //   188: invokevirtual c : (I)I
    //   191: iadd
    //   192: putfield h : I
    //   195: goto -> 839
    //   198: aload #27
    //   200: invokevirtual getVisibility : ()I
    //   203: bipush #8
    //   205: if_icmpne -> 224
    //   208: iload #8
    //   210: aload_0
    //   211: aload #27
    //   213: iload #8
    //   215: invokevirtual a : (Landroid/view/View;I)I
    //   218: iadd
    //   219: istore #8
    //   221: goto -> 195
    //   224: aload_0
    //   225: iload #8
    //   227: invokevirtual b : (I)Z
    //   230: ifeq -> 246
    //   233: aload_0
    //   234: aload_0
    //   235: getfield h : I
    //   238: aload_0
    //   239: getfield n : I
    //   242: iadd
    //   243: putfield h : I
    //   246: aload #27
    //   248: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   251: checkcast androidx/appcompat/widget/i0$a
    //   254: astore #29
    //   256: fload_3
    //   257: aload #29
    //   259: getfield a : F
    //   262: fadd
    //   263: fstore_3
    //   264: iload #22
    //   266: ldc 1073741824
    //   268: if_icmpne -> 380
    //   271: aload #29
    //   273: getfield width : I
    //   276: ifne -> 380
    //   279: aload #29
    //   281: getfield a : F
    //   284: fconst_0
    //   285: fcmpl
    //   286: ifle -> 380
    //   289: aload_0
    //   290: getfield h : I
    //   293: istore #14
    //   295: iload #15
    //   297: ifeq -> 319
    //   300: iload #14
    //   302: aload #29
    //   304: getfield leftMargin : I
    //   307: aload #29
    //   309: getfield rightMargin : I
    //   312: iadd
    //   313: iadd
    //   314: istore #14
    //   316: goto -> 340
    //   319: iload #14
    //   321: aload #29
    //   323: getfield leftMargin : I
    //   326: iload #14
    //   328: iadd
    //   329: aload #29
    //   331: getfield rightMargin : I
    //   334: iadd
    //   335: invokestatic max : (II)I
    //   338: istore #14
    //   340: aload_0
    //   341: iload #14
    //   343: putfield h : I
    //   346: iload #24
    //   348: ifeq -> 374
    //   351: iconst_0
    //   352: iconst_0
    //   353: invokestatic makeMeasureSpec : (II)I
    //   356: istore #14
    //   358: aload #27
    //   360: iload #14
    //   362: iload #14
    //   364: invokevirtual measure : (II)V
    //   367: iload #7
    //   369: istore #14
    //   371: goto -> 564
    //   374: iconst_1
    //   375: istore #12
    //   377: goto -> 568
    //   380: aload #29
    //   382: getfield width : I
    //   385: ifne -> 411
    //   388: aload #29
    //   390: getfield a : F
    //   393: fconst_0
    //   394: fcmpl
    //   395: ifle -> 411
    //   398: aload #29
    //   400: bipush #-2
    //   402: putfield width : I
    //   405: iconst_0
    //   406: istore #14
    //   408: goto -> 415
    //   411: ldc -2147483648
    //   413: istore #14
    //   415: fload_3
    //   416: fconst_0
    //   417: fcmpl
    //   418: ifne -> 430
    //   421: aload_0
    //   422: getfield h : I
    //   425: istore #17
    //   427: goto -> 433
    //   430: iconst_0
    //   431: istore #17
    //   433: aload_0
    //   434: aload #27
    //   436: iload #8
    //   438: iload_1
    //   439: iload #17
    //   441: iload_2
    //   442: iconst_0
    //   443: invokevirtual a : (Landroid/view/View;IIIII)V
    //   446: iload #14
    //   448: ldc -2147483648
    //   450: if_icmpeq -> 460
    //   453: aload #29
    //   455: iload #14
    //   457: putfield width : I
    //   460: aload #27
    //   462: invokevirtual getMeasuredWidth : ()I
    //   465: istore #17
    //   467: iload #15
    //   469: ifeq -> 503
    //   472: aload_0
    //   473: getfield h : I
    //   476: aload #29
    //   478: getfield leftMargin : I
    //   481: iload #17
    //   483: iadd
    //   484: aload #29
    //   486: getfield rightMargin : I
    //   489: iadd
    //   490: aload_0
    //   491: aload #27
    //   493: invokevirtual b : (Landroid/view/View;)I
    //   496: iadd
    //   497: iadd
    //   498: istore #14
    //   500: goto -> 540
    //   503: aload_0
    //   504: getfield h : I
    //   507: istore #14
    //   509: iload #14
    //   511: iload #14
    //   513: iload #17
    //   515: iadd
    //   516: aload #29
    //   518: getfield leftMargin : I
    //   521: iadd
    //   522: aload #29
    //   524: getfield rightMargin : I
    //   527: iadd
    //   528: aload_0
    //   529: aload #27
    //   531: invokevirtual b : (Landroid/view/View;)I
    //   534: iadd
    //   535: invokestatic max : (II)I
    //   538: istore #14
    //   540: aload_0
    //   541: iload #14
    //   543: putfield h : I
    //   546: iload #7
    //   548: istore #14
    //   550: iload #25
    //   552: ifeq -> 564
    //   555: iload #17
    //   557: iload #7
    //   559: invokestatic max : (II)I
    //   562: istore #14
    //   564: iload #14
    //   566: istore #7
    //   568: iload #8
    //   570: istore #18
    //   572: iload #21
    //   574: ldc 1073741824
    //   576: if_icmpeq -> 597
    //   579: aload #29
    //   581: getfield height : I
    //   584: iconst_m1
    //   585: if_icmpne -> 597
    //   588: iconst_1
    //   589: istore #8
    //   591: iconst_1
    //   592: istore #10
    //   594: goto -> 600
    //   597: iconst_0
    //   598: istore #8
    //   600: aload #29
    //   602: getfield topMargin : I
    //   605: aload #29
    //   607: getfield bottomMargin : I
    //   610: iadd
    //   611: istore #14
    //   613: aload #27
    //   615: invokevirtual getMeasuredHeight : ()I
    //   618: iload #14
    //   620: iadd
    //   621: istore #17
    //   623: iload #9
    //   625: aload #27
    //   627: invokevirtual getMeasuredState : ()I
    //   630: invokestatic combineMeasuredStates : (II)I
    //   633: istore #19
    //   635: iload #24
    //   637: ifeq -> 722
    //   640: aload #27
    //   642: invokevirtual getBaseline : ()I
    //   645: istore #23
    //   647: iload #23
    //   649: iconst_m1
    //   650: if_icmpeq -> 722
    //   653: aload #29
    //   655: getfield b : I
    //   658: istore #20
    //   660: iload #20
    //   662: istore #9
    //   664: iload #20
    //   666: ifge -> 675
    //   669: aload_0
    //   670: getfield g : I
    //   673: istore #9
    //   675: iload #9
    //   677: bipush #112
    //   679: iand
    //   680: iconst_4
    //   681: ishr
    //   682: bipush #-2
    //   684: iand
    //   685: iconst_1
    //   686: ishr
    //   687: istore #9
    //   689: aload #28
    //   691: iload #9
    //   693: aload #28
    //   695: iload #9
    //   697: iaload
    //   698: iload #23
    //   700: invokestatic max : (II)I
    //   703: iastore
    //   704: aload #26
    //   706: iload #9
    //   708: aload #26
    //   710: iload #9
    //   712: iaload
    //   713: iload #17
    //   715: iload #23
    //   717: isub
    //   718: invokestatic max : (II)I
    //   721: iastore
    //   722: iload #13
    //   724: iload #17
    //   726: invokestatic max : (II)I
    //   729: istore #13
    //   731: iload #5
    //   733: ifeq -> 751
    //   736: aload #29
    //   738: getfield height : I
    //   741: iconst_m1
    //   742: if_icmpne -> 751
    //   745: iconst_1
    //   746: istore #5
    //   748: goto -> 754
    //   751: iconst_0
    //   752: istore #5
    //   754: aload #29
    //   756: getfield a : F
    //   759: fconst_0
    //   760: fcmpl
    //   761: ifle -> 788
    //   764: iload #8
    //   766: ifeq -> 772
    //   769: goto -> 776
    //   772: iload #17
    //   774: istore #14
    //   776: iload #11
    //   778: iload #14
    //   780: invokestatic max : (II)I
    //   783: istore #8
    //   785: goto -> 810
    //   788: iload #8
    //   790: ifeq -> 797
    //   793: iload #14
    //   795: istore #17
    //   797: iload #6
    //   799: iload #17
    //   801: invokestatic max : (II)I
    //   804: istore #6
    //   806: iload #11
    //   808: istore #8
    //   810: aload_0
    //   811: aload #27
    //   813: iload #18
    //   815: invokevirtual a : (Landroid/view/View;I)I
    //   818: istore #11
    //   820: iload #19
    //   822: istore #9
    //   824: iload #11
    //   826: iload #18
    //   828: iadd
    //   829: istore #14
    //   831: iload #8
    //   833: istore #11
    //   835: iload #14
    //   837: istore #8
    //   839: iload #8
    //   841: iconst_1
    //   842: iadd
    //   843: istore #8
    //   845: goto -> 160
    //   848: iload #13
    //   850: istore #8
    //   852: aload_0
    //   853: getfield h : I
    //   856: ifle -> 881
    //   859: aload_0
    //   860: iload #16
    //   862: invokevirtual b : (I)Z
    //   865: ifeq -> 881
    //   868: aload_0
    //   869: aload_0
    //   870: getfield h : I
    //   873: aload_0
    //   874: getfield n : I
    //   877: iadd
    //   878: putfield h : I
    //   881: aload #28
    //   883: iconst_1
    //   884: iaload
    //   885: iconst_m1
    //   886: if_icmpne -> 919
    //   889: aload #28
    //   891: iconst_0
    //   892: iaload
    //   893: iconst_m1
    //   894: if_icmpne -> 919
    //   897: aload #28
    //   899: iconst_2
    //   900: iaload
    //   901: iconst_m1
    //   902: if_icmpne -> 919
    //   905: aload #28
    //   907: iconst_3
    //   908: iaload
    //   909: iconst_m1
    //   910: if_icmpeq -> 916
    //   913: goto -> 919
    //   916: goto -> 977
    //   919: iload #8
    //   921: aload #28
    //   923: iconst_3
    //   924: iaload
    //   925: aload #28
    //   927: iconst_0
    //   928: iaload
    //   929: aload #28
    //   931: iconst_1
    //   932: iaload
    //   933: aload #28
    //   935: iconst_2
    //   936: iaload
    //   937: invokestatic max : (II)I
    //   940: invokestatic max : (II)I
    //   943: invokestatic max : (II)I
    //   946: aload #26
    //   948: iconst_3
    //   949: iaload
    //   950: aload #26
    //   952: iconst_0
    //   953: iaload
    //   954: aload #26
    //   956: iconst_1
    //   957: iaload
    //   958: aload #26
    //   960: iconst_2
    //   961: iaload
    //   962: invokestatic max : (II)I
    //   965: invokestatic max : (II)I
    //   968: invokestatic max : (II)I
    //   971: iadd
    //   972: invokestatic max : (II)I
    //   975: istore #8
    //   977: iload #9
    //   979: istore #13
    //   981: iload #8
    //   983: istore #14
    //   985: iload #25
    //   987: ifeq -> 1176
    //   990: iload #22
    //   992: ldc -2147483648
    //   994: if_icmpeq -> 1006
    //   997: iload #8
    //   999: istore #14
    //   1001: iload #22
    //   1003: ifne -> 1176
    //   1006: aload_0
    //   1007: iconst_0
    //   1008: putfield h : I
    //   1011: iconst_0
    //   1012: istore #9
    //   1014: iload #8
    //   1016: istore #14
    //   1018: iload #9
    //   1020: iload #16
    //   1022: if_icmpge -> 1176
    //   1025: aload_0
    //   1026: iload #9
    //   1028: invokevirtual a : (I)Landroid/view/View;
    //   1031: astore #27
    //   1033: aload #27
    //   1035: ifnonnull -> 1056
    //   1038: aload_0
    //   1039: aload_0
    //   1040: getfield h : I
    //   1043: aload_0
    //   1044: iload #9
    //   1046: invokevirtual c : (I)I
    //   1049: iadd
    //   1050: putfield h : I
    //   1053: goto -> 1079
    //   1056: aload #27
    //   1058: invokevirtual getVisibility : ()I
    //   1061: bipush #8
    //   1063: if_icmpne -> 1082
    //   1066: iload #9
    //   1068: aload_0
    //   1069: aload #27
    //   1071: iload #9
    //   1073: invokevirtual a : (Landroid/view/View;I)I
    //   1076: iadd
    //   1077: istore #9
    //   1079: goto -> 1167
    //   1082: aload #27
    //   1084: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   1087: checkcast androidx/appcompat/widget/i0$a
    //   1090: astore #29
    //   1092: aload_0
    //   1093: getfield h : I
    //   1096: istore #14
    //   1098: iload #15
    //   1100: ifeq -> 1134
    //   1103: aload_0
    //   1104: iload #14
    //   1106: aload #29
    //   1108: getfield leftMargin : I
    //   1111: iload #7
    //   1113: iadd
    //   1114: aload #29
    //   1116: getfield rightMargin : I
    //   1119: iadd
    //   1120: aload_0
    //   1121: aload #27
    //   1123: invokevirtual b : (Landroid/view/View;)I
    //   1126: iadd
    //   1127: iadd
    //   1128: putfield h : I
    //   1131: goto -> 1079
    //   1134: aload_0
    //   1135: iload #14
    //   1137: iload #14
    //   1139: iload #7
    //   1141: iadd
    //   1142: aload #29
    //   1144: getfield leftMargin : I
    //   1147: iadd
    //   1148: aload #29
    //   1150: getfield rightMargin : I
    //   1153: iadd
    //   1154: aload_0
    //   1155: aload #27
    //   1157: invokevirtual b : (Landroid/view/View;)I
    //   1160: iadd
    //   1161: invokestatic max : (II)I
    //   1164: putfield h : I
    //   1167: iload #9
    //   1169: iconst_1
    //   1170: iadd
    //   1171: istore #9
    //   1173: goto -> 1014
    //   1176: aload_0
    //   1177: aload_0
    //   1178: getfield h : I
    //   1181: aload_0
    //   1182: invokevirtual getPaddingLeft : ()I
    //   1185: aload_0
    //   1186: invokevirtual getPaddingRight : ()I
    //   1189: iadd
    //   1190: iadd
    //   1191: putfield h : I
    //   1194: aload_0
    //   1195: getfield h : I
    //   1198: aload_0
    //   1199: invokevirtual getSuggestedMinimumWidth : ()I
    //   1202: invokestatic max : (II)I
    //   1205: iload_1
    //   1206: iconst_0
    //   1207: invokestatic resolveSizeAndState : (III)I
    //   1210: istore #18
    //   1212: ldc_w 16777215
    //   1215: iload #18
    //   1217: iand
    //   1218: aload_0
    //   1219: getfield h : I
    //   1222: isub
    //   1223: istore #17
    //   1225: iload #12
    //   1227: ifne -> 1363
    //   1230: iload #17
    //   1232: ifeq -> 1244
    //   1235: fload_3
    //   1236: fconst_0
    //   1237: fcmpl
    //   1238: ifle -> 1244
    //   1241: goto -> 1363
    //   1244: iload #6
    //   1246: iload #11
    //   1248: invokestatic max : (II)I
    //   1251: istore #9
    //   1253: iload #25
    //   1255: ifeq -> 1348
    //   1258: iload #22
    //   1260: ldc 1073741824
    //   1262: if_icmpeq -> 1348
    //   1265: iconst_0
    //   1266: istore #6
    //   1268: iload #6
    //   1270: iload #16
    //   1272: if_icmpge -> 1348
    //   1275: aload_0
    //   1276: iload #6
    //   1278: invokevirtual a : (I)Landroid/view/View;
    //   1281: astore #26
    //   1283: aload #26
    //   1285: ifnull -> 1339
    //   1288: aload #26
    //   1290: invokevirtual getVisibility : ()I
    //   1293: bipush #8
    //   1295: if_icmpne -> 1301
    //   1298: goto -> 1339
    //   1301: aload #26
    //   1303: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   1306: checkcast androidx/appcompat/widget/i0$a
    //   1309: getfield a : F
    //   1312: fconst_0
    //   1313: fcmpl
    //   1314: ifle -> 1339
    //   1317: aload #26
    //   1319: iload #7
    //   1321: ldc 1073741824
    //   1323: invokestatic makeMeasureSpec : (II)I
    //   1326: aload #26
    //   1328: invokevirtual getMeasuredHeight : ()I
    //   1331: ldc 1073741824
    //   1333: invokestatic makeMeasureSpec : (II)I
    //   1336: invokevirtual measure : (II)V
    //   1339: iload #6
    //   1341: iconst_1
    //   1342: iadd
    //   1343: istore #6
    //   1345: goto -> 1268
    //   1348: iload #16
    //   1350: istore #8
    //   1352: iload #14
    //   1354: istore #7
    //   1356: iload #9
    //   1358: istore #6
    //   1360: goto -> 2077
    //   1363: aload_0
    //   1364: getfield i : F
    //   1367: fstore #4
    //   1369: fload #4
    //   1371: fconst_0
    //   1372: fcmpl
    //   1373: ifle -> 1379
    //   1376: fload #4
    //   1378: fstore_3
    //   1379: aload #28
    //   1381: iconst_3
    //   1382: iconst_m1
    //   1383: iastore
    //   1384: aload #28
    //   1386: iconst_2
    //   1387: iconst_m1
    //   1388: iastore
    //   1389: aload #28
    //   1391: iconst_1
    //   1392: iconst_m1
    //   1393: iastore
    //   1394: aload #28
    //   1396: iconst_0
    //   1397: iconst_m1
    //   1398: iastore
    //   1399: aload #26
    //   1401: iconst_3
    //   1402: iconst_m1
    //   1403: iastore
    //   1404: aload #26
    //   1406: iconst_2
    //   1407: iconst_m1
    //   1408: iastore
    //   1409: aload #26
    //   1411: iconst_1
    //   1412: iconst_m1
    //   1413: iastore
    //   1414: aload #26
    //   1416: iconst_0
    //   1417: iconst_m1
    //   1418: iastore
    //   1419: aload_0
    //   1420: iconst_0
    //   1421: putfield h : I
    //   1424: iconst_m1
    //   1425: istore #12
    //   1427: iconst_0
    //   1428: istore #7
    //   1430: iload #5
    //   1432: istore #9
    //   1434: iload #16
    //   1436: istore #8
    //   1438: iload #6
    //   1440: istore #11
    //   1442: iload #13
    //   1444: istore #5
    //   1446: iload #17
    //   1448: istore #6
    //   1450: iload #7
    //   1452: istore #13
    //   1454: iload #13
    //   1456: iload #8
    //   1458: if_icmpge -> 1943
    //   1461: aload_0
    //   1462: iload #13
    //   1464: invokevirtual a : (I)Landroid/view/View;
    //   1467: astore #27
    //   1469: aload #27
    //   1471: ifnull -> 1934
    //   1474: aload #27
    //   1476: invokevirtual getVisibility : ()I
    //   1479: bipush #8
    //   1481: if_icmpne -> 1487
    //   1484: goto -> 1934
    //   1487: aload #27
    //   1489: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   1492: checkcast androidx/appcompat/widget/i0$a
    //   1495: astore #29
    //   1497: aload #29
    //   1499: getfield a : F
    //   1502: fstore #4
    //   1504: fload #4
    //   1506: fconst_0
    //   1507: fcmpl
    //   1508: ifle -> 1651
    //   1511: iload #6
    //   1513: i2f
    //   1514: fload #4
    //   1516: fmul
    //   1517: fload_3
    //   1518: fdiv
    //   1519: f2i
    //   1520: istore #14
    //   1522: iload_2
    //   1523: aload_0
    //   1524: invokevirtual getPaddingTop : ()I
    //   1527: aload_0
    //   1528: invokevirtual getPaddingBottom : ()I
    //   1531: iadd
    //   1532: aload #29
    //   1534: getfield topMargin : I
    //   1537: iadd
    //   1538: aload #29
    //   1540: getfield bottomMargin : I
    //   1543: iadd
    //   1544: aload #29
    //   1546: getfield height : I
    //   1549: invokestatic getChildMeasureSpec : (III)I
    //   1552: istore #17
    //   1554: aload #29
    //   1556: getfield width : I
    //   1559: ifne -> 1584
    //   1562: iload #22
    //   1564: ldc 1073741824
    //   1566: if_icmpeq -> 1572
    //   1569: goto -> 1584
    //   1572: iload #14
    //   1574: ifle -> 1603
    //   1577: iload #14
    //   1579: istore #7
    //   1581: goto -> 1606
    //   1584: aload #27
    //   1586: invokevirtual getMeasuredWidth : ()I
    //   1589: iload #14
    //   1591: iadd
    //   1592: istore #16
    //   1594: iload #16
    //   1596: istore #7
    //   1598: iload #16
    //   1600: ifge -> 1606
    //   1603: iconst_0
    //   1604: istore #7
    //   1606: aload #27
    //   1608: iload #7
    //   1610: ldc 1073741824
    //   1612: invokestatic makeMeasureSpec : (II)I
    //   1615: iload #17
    //   1617: invokevirtual measure : (II)V
    //   1620: iload #5
    //   1622: aload #27
    //   1624: invokevirtual getMeasuredState : ()I
    //   1627: ldc_w -16777216
    //   1630: iand
    //   1631: invokestatic combineMeasuredStates : (II)I
    //   1634: istore #5
    //   1636: fload_3
    //   1637: fload #4
    //   1639: fsub
    //   1640: fstore_3
    //   1641: iload #6
    //   1643: iload #14
    //   1645: isub
    //   1646: istore #6
    //   1648: goto -> 1651
    //   1651: aload_0
    //   1652: getfield h : I
    //   1655: istore #7
    //   1657: iload #15
    //   1659: ifeq -> 1696
    //   1662: aload_0
    //   1663: iload #7
    //   1665: aload #27
    //   1667: invokevirtual getMeasuredWidth : ()I
    //   1670: aload #29
    //   1672: getfield leftMargin : I
    //   1675: iadd
    //   1676: aload #29
    //   1678: getfield rightMargin : I
    //   1681: iadd
    //   1682: aload_0
    //   1683: aload #27
    //   1685: invokevirtual b : (Landroid/view/View;)I
    //   1688: iadd
    //   1689: iadd
    //   1690: putfield h : I
    //   1693: goto -> 1732
    //   1696: aload_0
    //   1697: iload #7
    //   1699: aload #27
    //   1701: invokevirtual getMeasuredWidth : ()I
    //   1704: iload #7
    //   1706: iadd
    //   1707: aload #29
    //   1709: getfield leftMargin : I
    //   1712: iadd
    //   1713: aload #29
    //   1715: getfield rightMargin : I
    //   1718: iadd
    //   1719: aload_0
    //   1720: aload #27
    //   1722: invokevirtual b : (Landroid/view/View;)I
    //   1725: iadd
    //   1726: invokestatic max : (II)I
    //   1729: putfield h : I
    //   1732: iload #21
    //   1734: ldc 1073741824
    //   1736: if_icmpeq -> 1754
    //   1739: aload #29
    //   1741: getfield height : I
    //   1744: iconst_m1
    //   1745: if_icmpne -> 1754
    //   1748: iconst_1
    //   1749: istore #7
    //   1751: goto -> 1757
    //   1754: iconst_0
    //   1755: istore #7
    //   1757: aload #29
    //   1759: getfield topMargin : I
    //   1762: aload #29
    //   1764: getfield bottomMargin : I
    //   1767: iadd
    //   1768: istore #16
    //   1770: aload #27
    //   1772: invokevirtual getMeasuredHeight : ()I
    //   1775: iload #16
    //   1777: iadd
    //   1778: istore #14
    //   1780: iload #12
    //   1782: iload #14
    //   1784: invokestatic max : (II)I
    //   1787: istore #12
    //   1789: iload #7
    //   1791: ifeq -> 1801
    //   1794: iload #16
    //   1796: istore #7
    //   1798: goto -> 1805
    //   1801: iload #14
    //   1803: istore #7
    //   1805: iload #11
    //   1807: iload #7
    //   1809: invokestatic max : (II)I
    //   1812: istore #11
    //   1814: iload #9
    //   1816: ifeq -> 1834
    //   1819: aload #29
    //   1821: getfield height : I
    //   1824: iconst_m1
    //   1825: if_icmpne -> 1834
    //   1828: iconst_1
    //   1829: istore #7
    //   1831: goto -> 1837
    //   1834: iconst_0
    //   1835: istore #7
    //   1837: iload #24
    //   1839: ifeq -> 1927
    //   1842: aload #27
    //   1844: invokevirtual getBaseline : ()I
    //   1847: istore #17
    //   1849: iload #17
    //   1851: iconst_m1
    //   1852: if_icmpeq -> 1927
    //   1855: aload #29
    //   1857: getfield b : I
    //   1860: istore #16
    //   1862: iload #16
    //   1864: istore #9
    //   1866: iload #16
    //   1868: ifge -> 1877
    //   1871: aload_0
    //   1872: getfield g : I
    //   1875: istore #9
    //   1877: iload #9
    //   1879: bipush #112
    //   1881: iand
    //   1882: iconst_4
    //   1883: ishr
    //   1884: bipush #-2
    //   1886: iand
    //   1887: iconst_1
    //   1888: ishr
    //   1889: istore #9
    //   1891: aload #28
    //   1893: iload #9
    //   1895: aload #28
    //   1897: iload #9
    //   1899: iaload
    //   1900: iload #17
    //   1902: invokestatic max : (II)I
    //   1905: iastore
    //   1906: aload #26
    //   1908: iload #9
    //   1910: aload #26
    //   1912: iload #9
    //   1914: iaload
    //   1915: iload #14
    //   1917: iload #17
    //   1919: isub
    //   1920: invokestatic max : (II)I
    //   1923: iastore
    //   1924: goto -> 1927
    //   1927: iload #7
    //   1929: istore #9
    //   1931: goto -> 1934
    //   1934: iload #13
    //   1936: iconst_1
    //   1937: iadd
    //   1938: istore #13
    //   1940: goto -> 1454
    //   1943: aload_0
    //   1944: aload_0
    //   1945: getfield h : I
    //   1948: aload_0
    //   1949: invokevirtual getPaddingLeft : ()I
    //   1952: aload_0
    //   1953: invokevirtual getPaddingRight : ()I
    //   1956: iadd
    //   1957: iadd
    //   1958: putfield h : I
    //   1961: aload #28
    //   1963: iconst_1
    //   1964: iaload
    //   1965: iconst_m1
    //   1966: if_icmpne -> 2003
    //   1969: aload #28
    //   1971: iconst_0
    //   1972: iaload
    //   1973: iconst_m1
    //   1974: if_icmpne -> 2003
    //   1977: aload #28
    //   1979: iconst_2
    //   1980: iaload
    //   1981: iconst_m1
    //   1982: if_icmpne -> 2003
    //   1985: aload #28
    //   1987: iconst_3
    //   1988: iaload
    //   1989: iconst_m1
    //   1990: if_icmpeq -> 1996
    //   1993: goto -> 2003
    //   1996: iload #12
    //   1998: istore #6
    //   2000: goto -> 2061
    //   2003: iload #12
    //   2005: aload #28
    //   2007: iconst_3
    //   2008: iaload
    //   2009: aload #28
    //   2011: iconst_0
    //   2012: iaload
    //   2013: aload #28
    //   2015: iconst_1
    //   2016: iaload
    //   2017: aload #28
    //   2019: iconst_2
    //   2020: iaload
    //   2021: invokestatic max : (II)I
    //   2024: invokestatic max : (II)I
    //   2027: invokestatic max : (II)I
    //   2030: aload #26
    //   2032: iconst_3
    //   2033: iaload
    //   2034: aload #26
    //   2036: iconst_0
    //   2037: iaload
    //   2038: aload #26
    //   2040: iconst_1
    //   2041: iaload
    //   2042: aload #26
    //   2044: iconst_2
    //   2045: iaload
    //   2046: invokestatic max : (II)I
    //   2049: invokestatic max : (II)I
    //   2052: invokestatic max : (II)I
    //   2055: iadd
    //   2056: invokestatic max : (II)I
    //   2059: istore #6
    //   2061: iload #5
    //   2063: istore #13
    //   2065: iload #9
    //   2067: istore #5
    //   2069: iload #6
    //   2071: istore #7
    //   2073: iload #11
    //   2075: istore #6
    //   2077: iload #5
    //   2079: ifne -> 2092
    //   2082: iload #21
    //   2084: ldc 1073741824
    //   2086: if_icmpeq -> 2092
    //   2089: goto -> 2096
    //   2092: iload #7
    //   2094: istore #6
    //   2096: aload_0
    //   2097: iload #18
    //   2099: iload #13
    //   2101: ldc_w -16777216
    //   2104: iand
    //   2105: ior
    //   2106: iload #6
    //   2108: aload_0
    //   2109: invokevirtual getPaddingTop : ()I
    //   2112: aload_0
    //   2113: invokevirtual getPaddingBottom : ()I
    //   2116: iadd
    //   2117: iadd
    //   2118: aload_0
    //   2119: invokevirtual getSuggestedMinimumHeight : ()I
    //   2122: invokestatic max : (II)I
    //   2125: iload_2
    //   2126: iload #13
    //   2128: bipush #16
    //   2130: ishl
    //   2131: invokestatic resolveSizeAndState : (III)I
    //   2134: invokevirtual setMeasuredDimension : (II)V
    //   2137: iload #10
    //   2139: ifeq -> 2149
    //   2142: aload_0
    //   2143: iload #8
    //   2145: iload_1
    //   2146: invokespecial c : (II)V
    //   2149: return
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    byte b1;
    byte b2;
    boolean bool1 = d1.a((View)this);
    int j = getPaddingTop();
    int k = paramInt4 - paramInt2;
    int m = getPaddingBottom();
    int n = getPaddingBottom();
    int i = getVirtualChildCount();
    paramInt4 = this.g;
    paramInt2 = paramInt4 & 0x70;
    boolean bool2 = this.c;
    int[] arrayOfInt1 = this.k;
    int[] arrayOfInt2 = this.l;
    paramInt4 = d.a(0x800007 & paramInt4, v.p((View)this));
    if (paramInt4 != 1) {
      if (paramInt4 != 5) {
        paramInt1 = getPaddingLeft();
      } else {
        paramInt1 = getPaddingLeft() + paramInt3 - paramInt1 - this.h;
      } 
    } else {
      paramInt1 = getPaddingLeft() + (paramInt3 - paramInt1 - this.h) / 2;
    } 
    if (bool1) {
      b1 = i - 1;
      b2 = -1;
    } else {
      b1 = 0;
      b2 = 1;
    } 
    paramInt4 = 0;
    paramInt3 = j;
    while (paramInt4 < i) {
      int i1 = b1 + b2 * paramInt4;
      View view = a(i1);
      if (view == null) {
        paramInt1 += c(i1);
      } else if (view.getVisibility() != 8) {
        int i5 = view.getMeasuredWidth();
        int i6 = view.getMeasuredHeight();
        a a = (a)view.getLayoutParams();
        if (bool2 && a.height != -1) {
          i3 = view.getBaseline();
        } else {
          i3 = -1;
        } 
        int i4 = a.b;
        int i2 = i4;
        if (i4 < 0)
          i2 = paramInt2; 
        i2 &= 0x70;
        if (i2 != 16) {
          if (i2 != 48) {
            if (i2 != 80) {
              i2 = paramInt3;
            } else {
              i4 = k - m - i6 - a.bottomMargin;
              i2 = i4;
              if (i3 != -1) {
                i2 = view.getMeasuredHeight();
                i2 = i4 - arrayOfInt2[2] - i2 - i3;
              } 
            } 
          } else {
            i4 = a.topMargin + paramInt3;
            i2 = i4;
            if (i3 != -1)
              i2 = i4 + arrayOfInt1[1] - i3; 
          } 
        } else {
          i2 = (k - j - n - i6) / 2 + paramInt3 + a.topMargin - a.bottomMargin;
        } 
        int i3 = paramInt1;
        if (b(i1))
          i3 = paramInt1 + this.n; 
        paramInt1 = a.leftMargin + i3;
        a(view, paramInt1 + a(view), i2, i5, i6);
        i2 = a.rightMargin;
        i3 = b(view);
        paramInt4 += a(view, i1);
        paramInt1 += i5 + i2 + i3;
      } 
      paramInt4++;
    } 
  }
  
  void a(Canvas paramCanvas) {
    int j = getVirtualChildCount();
    boolean bool = d1.a((View)this);
    int i;
    for (i = 0; i < j; i++) {
      View view = a(i);
      if (view != null && view.getVisibility() != 8 && b(i)) {
        int k;
        a a = (a)view.getLayoutParams();
        if (bool) {
          k = view.getRight() + a.rightMargin;
        } else {
          k = view.getLeft() - a.leftMargin - this.n;
        } 
        b(paramCanvas, k);
      } 
    } 
    if (b(j)) {
      View view = a(j - 1);
      if (view == null) {
        if (bool) {
          i = getPaddingLeft();
        } else {
          i = getWidth();
          int k = getPaddingRight();
          i = i - k - this.n;
        } 
      } else {
        int k;
        a a = (a)view.getLayoutParams();
        if (bool) {
          i = view.getLeft();
          k = a.leftMargin;
        } else {
          i = view.getRight() + a.rightMargin;
          b(paramCanvas, i);
        } 
        i = i - k - this.n;
      } 
    } else {
      return;
    } 
    b(paramCanvas, i);
  }
  
  void a(Canvas paramCanvas, int paramInt) {
    this.m.setBounds(getPaddingLeft() + this.q, paramInt, getWidth() - getPaddingRight() - this.q, this.o + paramInt);
    this.m.draw(paramCanvas);
  }
  
  void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    measureChildWithMargins(paramView, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  int b(View paramView) {
    return 0;
  }
  
  void b(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: iconst_0
    //   2: putfield h : I
    //   5: aload_0
    //   6: invokevirtual getVirtualChildCount : ()I
    //   9: istore #12
    //   11: iload_1
    //   12: invokestatic getMode : (I)I
    //   15: istore #20
    //   17: iload_2
    //   18: invokestatic getMode : (I)I
    //   21: istore #15
    //   23: aload_0
    //   24: getfield d : I
    //   27: istore #21
    //   29: aload_0
    //   30: getfield j : Z
    //   33: istore #22
    //   35: fconst_0
    //   36: fstore_3
    //   37: iconst_0
    //   38: istore #5
    //   40: iconst_0
    //   41: istore #14
    //   43: iconst_0
    //   44: istore #8
    //   46: iconst_0
    //   47: istore #9
    //   49: iconst_0
    //   50: istore #7
    //   52: iconst_0
    //   53: istore #10
    //   55: iconst_0
    //   56: istore #13
    //   58: iconst_1
    //   59: istore #6
    //   61: iconst_0
    //   62: istore #11
    //   64: iload #10
    //   66: iload #12
    //   68: if_icmpge -> 640
    //   71: aload_0
    //   72: iload #10
    //   74: invokevirtual a : (I)Landroid/view/View;
    //   77: astore #23
    //   79: aload #23
    //   81: ifnonnull -> 102
    //   84: aload_0
    //   85: aload_0
    //   86: getfield h : I
    //   89: aload_0
    //   90: iload #10
    //   92: invokevirtual c : (I)I
    //   95: iadd
    //   96: putfield h : I
    //   99: goto -> 631
    //   102: aload #23
    //   104: invokevirtual getVisibility : ()I
    //   107: bipush #8
    //   109: if_icmpne -> 128
    //   112: iload #10
    //   114: aload_0
    //   115: aload #23
    //   117: iload #10
    //   119: invokevirtual a : (Landroid/view/View;I)I
    //   122: iadd
    //   123: istore #10
    //   125: goto -> 99
    //   128: aload_0
    //   129: iload #10
    //   131: invokevirtual b : (I)Z
    //   134: ifeq -> 150
    //   137: aload_0
    //   138: aload_0
    //   139: getfield h : I
    //   142: aload_0
    //   143: getfield o : I
    //   146: iadd
    //   147: putfield h : I
    //   150: aload #23
    //   152: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   155: checkcast androidx/appcompat/widget/i0$a
    //   158: astore #24
    //   160: fload_3
    //   161: aload #24
    //   163: getfield a : F
    //   166: fadd
    //   167: fstore_3
    //   168: iload #15
    //   170: ldc 1073741824
    //   172: if_icmpne -> 228
    //   175: aload #24
    //   177: getfield height : I
    //   180: ifne -> 228
    //   183: aload #24
    //   185: getfield a : F
    //   188: fconst_0
    //   189: fcmpl
    //   190: ifle -> 228
    //   193: aload_0
    //   194: getfield h : I
    //   197: istore #13
    //   199: aload_0
    //   200: iload #13
    //   202: aload #24
    //   204: getfield topMargin : I
    //   207: iload #13
    //   209: iadd
    //   210: aload #24
    //   212: getfield bottomMargin : I
    //   215: iadd
    //   216: invokestatic max : (II)I
    //   219: putfield h : I
    //   222: iconst_1
    //   223: istore #13
    //   225: goto -> 371
    //   228: aload #24
    //   230: getfield height : I
    //   233: ifne -> 259
    //   236: aload #24
    //   238: getfield a : F
    //   241: fconst_0
    //   242: fcmpl
    //   243: ifle -> 259
    //   246: aload #24
    //   248: bipush #-2
    //   250: putfield height : I
    //   253: iconst_0
    //   254: istore #16
    //   256: goto -> 263
    //   259: ldc -2147483648
    //   261: istore #16
    //   263: fload_3
    //   264: fconst_0
    //   265: fcmpl
    //   266: ifne -> 278
    //   269: aload_0
    //   270: getfield h : I
    //   273: istore #17
    //   275: goto -> 281
    //   278: iconst_0
    //   279: istore #17
    //   281: aload_0
    //   282: aload #23
    //   284: iload #10
    //   286: iload_1
    //   287: iconst_0
    //   288: iload_2
    //   289: iload #17
    //   291: invokevirtual a : (Landroid/view/View;IIIII)V
    //   294: iload #16
    //   296: ldc -2147483648
    //   298: if_icmpeq -> 308
    //   301: aload #24
    //   303: iload #16
    //   305: putfield height : I
    //   308: aload #23
    //   310: invokevirtual getMeasuredHeight : ()I
    //   313: istore #16
    //   315: aload_0
    //   316: getfield h : I
    //   319: istore #17
    //   321: aload_0
    //   322: iload #17
    //   324: iload #17
    //   326: iload #16
    //   328: iadd
    //   329: aload #24
    //   331: getfield topMargin : I
    //   334: iadd
    //   335: aload #24
    //   337: getfield bottomMargin : I
    //   340: iadd
    //   341: aload_0
    //   342: aload #23
    //   344: invokevirtual b : (Landroid/view/View;)I
    //   347: iadd
    //   348: invokestatic max : (II)I
    //   351: putfield h : I
    //   354: iload #22
    //   356: ifeq -> 371
    //   359: iload #16
    //   361: iload #8
    //   363: invokestatic max : (II)I
    //   366: istore #8
    //   368: goto -> 371
    //   371: iload #10
    //   373: istore #18
    //   375: iload #21
    //   377: iflt -> 397
    //   380: iload #21
    //   382: iload #18
    //   384: iconst_1
    //   385: iadd
    //   386: if_icmpne -> 397
    //   389: aload_0
    //   390: aload_0
    //   391: getfield h : I
    //   394: putfield e : I
    //   397: iload #18
    //   399: iload #21
    //   401: if_icmpge -> 428
    //   404: aload #24
    //   406: getfield a : F
    //   409: fconst_0
    //   410: fcmpl
    //   411: ifgt -> 417
    //   414: goto -> 428
    //   417: new java/lang/RuntimeException
    //   420: dup
    //   421: ldc_w 'A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.'
    //   424: invokespecial <init> : (Ljava/lang/String;)V
    //   427: athrow
    //   428: iload #20
    //   430: ldc 1073741824
    //   432: if_icmpeq -> 453
    //   435: aload #24
    //   437: getfield width : I
    //   440: iconst_m1
    //   441: if_icmpne -> 453
    //   444: iconst_1
    //   445: istore #10
    //   447: iconst_1
    //   448: istore #11
    //   450: goto -> 456
    //   453: iconst_0
    //   454: istore #10
    //   456: aload #24
    //   458: getfield leftMargin : I
    //   461: aload #24
    //   463: getfield rightMargin : I
    //   466: iadd
    //   467: istore #16
    //   469: aload #23
    //   471: invokevirtual getMeasuredWidth : ()I
    //   474: iload #16
    //   476: iadd
    //   477: istore #17
    //   479: iload #14
    //   481: iload #17
    //   483: invokestatic max : (II)I
    //   486: istore #14
    //   488: iload #5
    //   490: aload #23
    //   492: invokevirtual getMeasuredState : ()I
    //   495: invokestatic combineMeasuredStates : (II)I
    //   498: istore #19
    //   500: iload #6
    //   502: ifeq -> 520
    //   505: aload #24
    //   507: getfield width : I
    //   510: iconst_m1
    //   511: if_icmpne -> 520
    //   514: iconst_1
    //   515: istore #5
    //   517: goto -> 523
    //   520: iconst_0
    //   521: istore #5
    //   523: aload #24
    //   525: getfield a : F
    //   528: fconst_0
    //   529: fcmpl
    //   530: ifle -> 565
    //   533: iload #10
    //   535: ifeq -> 541
    //   538: goto -> 545
    //   541: iload #17
    //   543: istore #16
    //   545: iload #9
    //   547: iload #16
    //   549: invokestatic max : (II)I
    //   552: istore #9
    //   554: iload #7
    //   556: istore #6
    //   558: iload #9
    //   560: istore #7
    //   562: goto -> 590
    //   565: iload #10
    //   567: ifeq -> 573
    //   570: goto -> 577
    //   573: iload #17
    //   575: istore #16
    //   577: iload #7
    //   579: iload #16
    //   581: invokestatic max : (II)I
    //   584: istore #6
    //   586: iload #9
    //   588: istore #7
    //   590: aload_0
    //   591: aload #23
    //   593: iload #18
    //   595: invokevirtual a : (Landroid/view/View;I)I
    //   598: istore #16
    //   600: iload #5
    //   602: istore #10
    //   604: iload #7
    //   606: istore #9
    //   608: iload #6
    //   610: istore #7
    //   612: iload #19
    //   614: istore #5
    //   616: iload #16
    //   618: iload #18
    //   620: iadd
    //   621: istore #16
    //   623: iload #10
    //   625: istore #6
    //   627: iload #16
    //   629: istore #10
    //   631: iload #10
    //   633: iconst_1
    //   634: iadd
    //   635: istore #10
    //   637: goto -> 64
    //   640: aload_0
    //   641: getfield h : I
    //   644: ifle -> 672
    //   647: aload_0
    //   648: iload #12
    //   650: invokevirtual b : (I)Z
    //   653: ifeq -> 672
    //   656: aload_0
    //   657: aload_0
    //   658: getfield h : I
    //   661: aload_0
    //   662: getfield o : I
    //   665: iadd
    //   666: putfield h : I
    //   669: goto -> 672
    //   672: iload #12
    //   674: istore #16
    //   676: iload #22
    //   678: ifeq -> 828
    //   681: iload #15
    //   683: ldc -2147483648
    //   685: if_icmpeq -> 693
    //   688: iload #15
    //   690: ifne -> 828
    //   693: aload_0
    //   694: iconst_0
    //   695: putfield h : I
    //   698: iconst_0
    //   699: istore #10
    //   701: iload #10
    //   703: iload #16
    //   705: if_icmpge -> 828
    //   708: aload_0
    //   709: iload #10
    //   711: invokevirtual a : (I)Landroid/view/View;
    //   714: astore #23
    //   716: aload #23
    //   718: ifnonnull -> 743
    //   721: aload_0
    //   722: getfield h : I
    //   725: aload_0
    //   726: iload #10
    //   728: invokevirtual c : (I)I
    //   731: iadd
    //   732: istore #12
    //   734: aload_0
    //   735: iload #12
    //   737: putfield h : I
    //   740: goto -> 819
    //   743: aload #23
    //   745: invokevirtual getVisibility : ()I
    //   748: bipush #8
    //   750: if_icmpne -> 769
    //   753: iload #10
    //   755: aload_0
    //   756: aload #23
    //   758: iload #10
    //   760: invokevirtual a : (Landroid/view/View;I)I
    //   763: iadd
    //   764: istore #10
    //   766: goto -> 819
    //   769: aload #23
    //   771: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   774: checkcast androidx/appcompat/widget/i0$a
    //   777: astore #24
    //   779: aload_0
    //   780: getfield h : I
    //   783: istore #12
    //   785: iload #12
    //   787: iload #12
    //   789: iload #8
    //   791: iadd
    //   792: aload #24
    //   794: getfield topMargin : I
    //   797: iadd
    //   798: aload #24
    //   800: getfield bottomMargin : I
    //   803: iadd
    //   804: aload_0
    //   805: aload #23
    //   807: invokevirtual b : (Landroid/view/View;)I
    //   810: iadd
    //   811: invokestatic max : (II)I
    //   814: istore #12
    //   816: goto -> 734
    //   819: iload #10
    //   821: iconst_1
    //   822: iadd
    //   823: istore #10
    //   825: goto -> 701
    //   828: aload_0
    //   829: aload_0
    //   830: getfield h : I
    //   833: aload_0
    //   834: invokevirtual getPaddingTop : ()I
    //   837: aload_0
    //   838: invokevirtual getPaddingBottom : ()I
    //   841: iadd
    //   842: iadd
    //   843: putfield h : I
    //   846: aload_0
    //   847: getfield h : I
    //   850: aload_0
    //   851: invokevirtual getSuggestedMinimumHeight : ()I
    //   854: invokestatic max : (II)I
    //   857: iload_2
    //   858: iconst_0
    //   859: invokestatic resolveSizeAndState : (III)I
    //   862: istore #17
    //   864: ldc_w 16777215
    //   867: iload #17
    //   869: iand
    //   870: aload_0
    //   871: getfield h : I
    //   874: isub
    //   875: istore #10
    //   877: iload #13
    //   879: ifne -> 1011
    //   882: iload #10
    //   884: ifeq -> 896
    //   887: fload_3
    //   888: fconst_0
    //   889: fcmpl
    //   890: ifle -> 896
    //   893: goto -> 1011
    //   896: iload #7
    //   898: iload #9
    //   900: invokestatic max : (II)I
    //   903: istore #9
    //   905: iload #22
    //   907: ifeq -> 1000
    //   910: iload #15
    //   912: ldc 1073741824
    //   914: if_icmpeq -> 1000
    //   917: iconst_0
    //   918: istore #7
    //   920: iload #7
    //   922: iload #16
    //   924: if_icmpge -> 1000
    //   927: aload_0
    //   928: iload #7
    //   930: invokevirtual a : (I)Landroid/view/View;
    //   933: astore #23
    //   935: aload #23
    //   937: ifnull -> 991
    //   940: aload #23
    //   942: invokevirtual getVisibility : ()I
    //   945: bipush #8
    //   947: if_icmpne -> 953
    //   950: goto -> 991
    //   953: aload #23
    //   955: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   958: checkcast androidx/appcompat/widget/i0$a
    //   961: getfield a : F
    //   964: fconst_0
    //   965: fcmpl
    //   966: ifle -> 991
    //   969: aload #23
    //   971: aload #23
    //   973: invokevirtual getMeasuredWidth : ()I
    //   976: ldc 1073741824
    //   978: invokestatic makeMeasureSpec : (II)I
    //   981: iload #8
    //   983: ldc 1073741824
    //   985: invokestatic makeMeasureSpec : (II)I
    //   988: invokevirtual measure : (II)V
    //   991: iload #7
    //   993: iconst_1
    //   994: iadd
    //   995: istore #7
    //   997: goto -> 920
    //   1000: iload #5
    //   1002: istore #7
    //   1004: iload #9
    //   1006: istore #5
    //   1008: goto -> 1441
    //   1011: aload_0
    //   1012: getfield i : F
    //   1015: fstore #4
    //   1017: fload #4
    //   1019: fconst_0
    //   1020: fcmpl
    //   1021: ifle -> 1027
    //   1024: fload #4
    //   1026: fstore_3
    //   1027: aload_0
    //   1028: iconst_0
    //   1029: putfield h : I
    //   1032: iconst_0
    //   1033: istore #9
    //   1035: iload #10
    //   1037: istore #8
    //   1039: iload #9
    //   1041: iload #16
    //   1043: if_icmpge -> 1411
    //   1046: aload_0
    //   1047: iload #9
    //   1049: invokevirtual a : (I)Landroid/view/View;
    //   1052: astore #23
    //   1054: aload #23
    //   1056: invokevirtual getVisibility : ()I
    //   1059: bipush #8
    //   1061: if_icmpne -> 1067
    //   1064: goto -> 1402
    //   1067: aload #23
    //   1069: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   1072: checkcast androidx/appcompat/widget/i0$a
    //   1075: astore #24
    //   1077: aload #24
    //   1079: getfield a : F
    //   1082: fstore #4
    //   1084: fload #4
    //   1086: fconst_0
    //   1087: fcmpl
    //   1088: ifle -> 1255
    //   1091: iload #8
    //   1093: i2f
    //   1094: fload #4
    //   1096: fmul
    //   1097: fload_3
    //   1098: fdiv
    //   1099: f2i
    //   1100: istore #12
    //   1102: aload_0
    //   1103: invokevirtual getPaddingLeft : ()I
    //   1106: istore #13
    //   1108: aload_0
    //   1109: invokevirtual getPaddingRight : ()I
    //   1112: istore #18
    //   1114: iload #8
    //   1116: iload #12
    //   1118: isub
    //   1119: istore #10
    //   1121: aload #24
    //   1123: getfield leftMargin : I
    //   1126: istore #8
    //   1128: aload #24
    //   1130: getfield rightMargin : I
    //   1133: istore #19
    //   1135: aload #24
    //   1137: getfield width : I
    //   1140: istore #21
    //   1142: fload_3
    //   1143: fload #4
    //   1145: fsub
    //   1146: fstore_3
    //   1147: iload_1
    //   1148: iload #13
    //   1150: iload #18
    //   1152: iadd
    //   1153: iload #8
    //   1155: iadd
    //   1156: iload #19
    //   1158: iadd
    //   1159: iload #21
    //   1161: invokestatic getChildMeasureSpec : (III)I
    //   1164: istore #13
    //   1166: aload #24
    //   1168: getfield height : I
    //   1171: ifne -> 1196
    //   1174: iload #15
    //   1176: ldc 1073741824
    //   1178: if_icmpeq -> 1184
    //   1181: goto -> 1196
    //   1184: iload #12
    //   1186: ifle -> 1215
    //   1189: iload #12
    //   1191: istore #8
    //   1193: goto -> 1218
    //   1196: aload #23
    //   1198: invokevirtual getMeasuredHeight : ()I
    //   1201: iload #12
    //   1203: iadd
    //   1204: istore #12
    //   1206: iload #12
    //   1208: istore #8
    //   1210: iload #12
    //   1212: ifge -> 1218
    //   1215: iconst_0
    //   1216: istore #8
    //   1218: aload #23
    //   1220: iload #13
    //   1222: iload #8
    //   1224: ldc 1073741824
    //   1226: invokestatic makeMeasureSpec : (II)I
    //   1229: invokevirtual measure : (II)V
    //   1232: iload #5
    //   1234: aload #23
    //   1236: invokevirtual getMeasuredState : ()I
    //   1239: sipush #-256
    //   1242: iand
    //   1243: invokestatic combineMeasuredStates : (II)I
    //   1246: istore #5
    //   1248: iload #10
    //   1250: istore #8
    //   1252: goto -> 1255
    //   1255: aload #24
    //   1257: getfield leftMargin : I
    //   1260: aload #24
    //   1262: getfield rightMargin : I
    //   1265: iadd
    //   1266: istore #12
    //   1268: aload #23
    //   1270: invokevirtual getMeasuredWidth : ()I
    //   1273: iload #12
    //   1275: iadd
    //   1276: istore #13
    //   1278: iload #14
    //   1280: iload #13
    //   1282: invokestatic max : (II)I
    //   1285: istore #14
    //   1287: iload #20
    //   1289: ldc 1073741824
    //   1291: if_icmpeq -> 1309
    //   1294: aload #24
    //   1296: getfield width : I
    //   1299: iconst_m1
    //   1300: if_icmpne -> 1309
    //   1303: iconst_1
    //   1304: istore #10
    //   1306: goto -> 1312
    //   1309: iconst_0
    //   1310: istore #10
    //   1312: iload #10
    //   1314: ifeq -> 1324
    //   1317: iload #12
    //   1319: istore #10
    //   1321: goto -> 1328
    //   1324: iload #13
    //   1326: istore #10
    //   1328: iload #7
    //   1330: iload #10
    //   1332: invokestatic max : (II)I
    //   1335: istore #7
    //   1337: iload #6
    //   1339: ifeq -> 1357
    //   1342: aload #24
    //   1344: getfield width : I
    //   1347: iconst_m1
    //   1348: if_icmpne -> 1357
    //   1351: iconst_1
    //   1352: istore #6
    //   1354: goto -> 1360
    //   1357: iconst_0
    //   1358: istore #6
    //   1360: aload_0
    //   1361: getfield h : I
    //   1364: istore #10
    //   1366: aload_0
    //   1367: iload #10
    //   1369: aload #23
    //   1371: invokevirtual getMeasuredHeight : ()I
    //   1374: iload #10
    //   1376: iadd
    //   1377: aload #24
    //   1379: getfield topMargin : I
    //   1382: iadd
    //   1383: aload #24
    //   1385: getfield bottomMargin : I
    //   1388: iadd
    //   1389: aload_0
    //   1390: aload #23
    //   1392: invokevirtual b : (Landroid/view/View;)I
    //   1395: iadd
    //   1396: invokestatic max : (II)I
    //   1399: putfield h : I
    //   1402: iload #9
    //   1404: iconst_1
    //   1405: iadd
    //   1406: istore #9
    //   1408: goto -> 1039
    //   1411: aload_0
    //   1412: aload_0
    //   1413: getfield h : I
    //   1416: aload_0
    //   1417: invokevirtual getPaddingTop : ()I
    //   1420: aload_0
    //   1421: invokevirtual getPaddingBottom : ()I
    //   1424: iadd
    //   1425: iadd
    //   1426: putfield h : I
    //   1429: iload #7
    //   1431: istore #8
    //   1433: iload #5
    //   1435: istore #7
    //   1437: iload #8
    //   1439: istore #5
    //   1441: iload #6
    //   1443: ifne -> 1456
    //   1446: iload #20
    //   1448: ldc 1073741824
    //   1450: if_icmpeq -> 1456
    //   1453: goto -> 1460
    //   1456: iload #14
    //   1458: istore #5
    //   1460: aload_0
    //   1461: iload #5
    //   1463: aload_0
    //   1464: invokevirtual getPaddingLeft : ()I
    //   1467: aload_0
    //   1468: invokevirtual getPaddingRight : ()I
    //   1471: iadd
    //   1472: iadd
    //   1473: aload_0
    //   1474: invokevirtual getSuggestedMinimumWidth : ()I
    //   1477: invokestatic max : (II)I
    //   1480: iload_1
    //   1481: iload #7
    //   1483: invokestatic resolveSizeAndState : (III)I
    //   1486: iload #17
    //   1488: invokevirtual setMeasuredDimension : (II)V
    //   1491: iload #11
    //   1493: ifeq -> 1503
    //   1496: aload_0
    //   1497: iload #16
    //   1499: iload_2
    //   1500: invokespecial d : (II)V
    //   1503: return
  }
  
  void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = getPaddingLeft();
    int j = paramInt3 - paramInt1;
    int k = getPaddingRight();
    int m = getPaddingRight();
    int n = getVirtualChildCount();
    int i1 = this.g;
    paramInt1 = i1 & 0x70;
    if (paramInt1 != 16) {
      if (paramInt1 != 80) {
        paramInt1 = getPaddingTop();
      } else {
        paramInt1 = getPaddingTop() + paramInt4 - paramInt2 - this.h;
      } 
    } else {
      paramInt1 = getPaddingTop() + (paramInt4 - paramInt2 - this.h) / 2;
    } 
    paramInt2 = 0;
    while (paramInt2 < n) {
      View view = a(paramInt2);
      if (view == null) {
        paramInt3 = paramInt1 + c(paramInt2);
        paramInt4 = paramInt2;
      } else {
        paramInt3 = paramInt1;
        paramInt4 = paramInt2;
        if (view.getVisibility() != 8) {
          int i3 = view.getMeasuredWidth();
          int i2 = view.getMeasuredHeight();
          a a = (a)view.getLayoutParams();
          paramInt4 = a.b;
          paramInt3 = paramInt4;
          if (paramInt4 < 0)
            paramInt3 = i1 & 0x800007; 
          paramInt3 = d.a(paramInt3, v.p((View)this)) & 0x7;
          if (paramInt3 != 1) {
            if (paramInt3 != 5) {
              paramInt3 = a.leftMargin + i;
            } else {
              paramInt3 = j - k - i3;
              paramInt3 -= a.rightMargin;
            } 
          } else {
            paramInt3 = (j - i - m - i3) / 2 + i + a.leftMargin;
            paramInt3 -= a.rightMargin;
          } 
          paramInt4 = paramInt1;
          if (b(paramInt2))
            paramInt4 = paramInt1 + this.o; 
          paramInt1 = paramInt4 + a.topMargin;
          a(view, paramInt3, paramInt1 + a(view), i3, i2);
          paramInt3 = a.bottomMargin;
          i3 = b(view);
          paramInt4 = paramInt2 + a(view, paramInt2);
          paramInt3 = paramInt1 + i2 + paramInt3 + i3;
        } 
      } 
      paramInt2 = paramInt4 + 1;
      paramInt1 = paramInt3;
    } 
  }
  
  void b(Canvas paramCanvas) {
    int j = getVirtualChildCount();
    int i;
    for (i = 0; i < j; i++) {
      View view = a(i);
      if (view != null && view.getVisibility() != 8 && b(i)) {
        a a = (a)view.getLayoutParams();
        a(paramCanvas, view.getTop() - a.topMargin - this.o);
      } 
    } 
    if (b(j)) {
      View view = a(j - 1);
      if (view == null) {
        i = getHeight() - getPaddingBottom() - this.o;
      } else {
        a a = (a)view.getLayoutParams();
        i = view.getBottom() + a.bottomMargin;
      } 
      a(paramCanvas, i);
    } 
  }
  
  void b(Canvas paramCanvas, int paramInt) {
    this.m.setBounds(paramInt, getPaddingTop() + this.q, this.n + paramInt, getHeight() - getPaddingBottom() - this.q);
    this.m.draw(paramCanvas);
  }
  
  protected boolean b(int paramInt) {
    boolean bool2 = false;
    boolean bool1 = false;
    if (paramInt == 0) {
      if ((this.p & 0x1) != 0)
        bool1 = true; 
      return bool1;
    } 
    if (paramInt == getChildCount()) {
      bool1 = bool2;
      if ((this.p & 0x4) != 0)
        bool1 = true; 
      return bool1;
    } 
    if ((this.p & 0x2) != 0)
      while (--paramInt >= 0) {
        if (getChildAt(paramInt).getVisibility() != 8)
          return true; 
        paramInt--;
      }  
    return false;
  }
  
  int c(int paramInt) {
    return 0;
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    return paramLayoutParams instanceof a;
  }
  
  protected a generateDefaultLayoutParams() {
    int i = this.f;
    return (i == 0) ? new a(-2, -2) : ((i == 1) ? new a(-1, -2) : null);
  }
  
  public a generateLayoutParams(AttributeSet paramAttributeSet) {
    return new a(getContext(), paramAttributeSet);
  }
  
  protected a generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    return new a(paramLayoutParams);
  }
  
  public int getBaseline() {
    if (this.d < 0)
      return super.getBaseline(); 
    int i = getChildCount();
    int j = this.d;
    if (i > j) {
      View view = getChildAt(j);
      int k = view.getBaseline();
      if (k == -1) {
        if (this.d == 0)
          return -1; 
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
      } 
      j = this.e;
      i = j;
      if (this.f == 1) {
        int m = this.g & 0x70;
        i = j;
        if (m != 48)
          if (m != 16) {
            if (m != 80) {
              i = j;
            } else {
              i = getBottom() - getTop() - getPaddingBottom() - this.h;
            } 
          } else {
            i = j + (getBottom() - getTop() - getPaddingTop() - getPaddingBottom() - this.h) / 2;
          }  
      } 
      return i + ((a)view.getLayoutParams()).topMargin + k;
    } 
    throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
  }
  
  public int getBaselineAlignedChildIndex() {
    return this.d;
  }
  
  public Drawable getDividerDrawable() {
    return this.m;
  }
  
  public int getDividerPadding() {
    return this.q;
  }
  
  public int getDividerWidth() {
    return this.n;
  }
  
  public int getGravity() {
    return this.g;
  }
  
  public int getOrientation() {
    return this.f;
  }
  
  public int getShowDividers() {
    return this.p;
  }
  
  int getVirtualChildCount() {
    return getChildCount();
  }
  
  public float getWeightSum() {
    return this.i;
  }
  
  protected void onDraw(Canvas paramCanvas) {
    if (this.m == null)
      return; 
    if (this.f == 1) {
      b(paramCanvas);
      return;
    } 
    a(paramCanvas);
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent) {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo) {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    paramAccessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (this.f == 1) {
      b(paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    } 
    a(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    if (this.f == 1) {
      b(paramInt1, paramInt2);
      return;
    } 
    a(paramInt1, paramInt2);
  }
  
  public void setBaselineAligned(boolean paramBoolean) {
    this.c = paramBoolean;
  }
  
  public void setBaselineAlignedChildIndex(int paramInt) {
    if (paramInt >= 0 && paramInt < getChildCount()) {
      this.d = paramInt;
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("base aligned child index out of range (0, ");
    stringBuilder.append(getChildCount());
    stringBuilder.append(")");
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public void setDividerDrawable(Drawable paramDrawable) {
    if (paramDrawable == this.m)
      return; 
    this.m = paramDrawable;
    boolean bool = false;
    if (paramDrawable != null) {
      this.n = paramDrawable.getIntrinsicWidth();
      this.o = paramDrawable.getIntrinsicHeight();
    } else {
      this.n = 0;
      this.o = 0;
    } 
    if (paramDrawable == null)
      bool = true; 
    setWillNotDraw(bool);
    requestLayout();
  }
  
  public void setDividerPadding(int paramInt) {
    this.q = paramInt;
  }
  
  public void setGravity(int paramInt) {
    if (this.g != paramInt) {
      int i = paramInt;
      if ((0x800007 & paramInt) == 0)
        i = paramInt | 0x800003; 
      paramInt = i;
      if ((i & 0x70) == 0)
        paramInt = i | 0x30; 
      this.g = paramInt;
      requestLayout();
    } 
  }
  
  public void setHorizontalGravity(int paramInt) {
    paramInt &= 0x800007;
    int i = this.g;
    if ((0x800007 & i) != paramInt) {
      this.g = paramInt | 0xFF7FFFF8 & i;
      requestLayout();
    } 
  }
  
  public void setMeasureWithLargestChildEnabled(boolean paramBoolean) {
    this.j = paramBoolean;
  }
  
  public void setOrientation(int paramInt) {
    if (this.f != paramInt) {
      this.f = paramInt;
      requestLayout();
    } 
  }
  
  public void setShowDividers(int paramInt) {
    if (paramInt != this.p)
      requestLayout(); 
    this.p = paramInt;
  }
  
  public void setVerticalGravity(int paramInt) {
    paramInt &= 0x70;
    int i = this.g;
    if ((i & 0x70) != paramInt) {
      this.g = paramInt | i & 0xFFFFFF8F;
      requestLayout();
    } 
  }
  
  public void setWeightSum(float paramFloat) {
    this.i = Math.max(0.0F, paramFloat);
  }
  
  public boolean shouldDelayChildPressedState() {
    return false;
  }
  
  public static class a extends ViewGroup.MarginLayoutParams {
    public float a;
    
    public int b = -1;
    
    public a(int param1Int1, int param1Int2) {
      super(param1Int1, param1Int2);
      this.a = 0.0F;
    }
    
    public a(Context param1Context, AttributeSet param1AttributeSet) {
      super(param1Context, param1AttributeSet);
      TypedArray typedArray = param1Context.obtainStyledAttributes(param1AttributeSet, j.LinearLayoutCompat_Layout);
      this.a = typedArray.getFloat(j.LinearLayoutCompat_Layout_android_layout_weight, 0.0F);
      this.b = typedArray.getInt(j.LinearLayoutCompat_Layout_android_layout_gravity, -1);
      typedArray.recycle();
    }
    
    public a(ViewGroup.LayoutParams param1LayoutParams) {
      super(param1LayoutParams);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/widget/i0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */