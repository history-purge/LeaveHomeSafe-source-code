package b.r;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import b.g.m.v;

public class d extends x {
  private static final String[] O = new String[] { "android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY" };
  
  private static final Property<Drawable, PointF> P = new b(PointF.class, "boundsOrigin");
  
  private static final Property<k, PointF> Q = new c(PointF.class, "topLeft");
  
  private static final Property<k, PointF> R = new d(PointF.class, "bottomRight");
  
  private static final Property<View, PointF> S = new e(PointF.class, "bottomRight");
  
  private static final Property<View, PointF> T = new f(PointF.class, "topLeft");
  
  private static final Property<View, PointF> U = new g(PointF.class, "position");
  
  private static t V = new t();
  
  private int[] L = new int[2];
  
  private boolean M = false;
  
  private boolean N = false;
  
  private boolean a(View paramView1, View paramView2) {
    if (this.N) {
      d0 d0 = a(paramView1, true);
      return (d0 == null) ? ((paramView1 == paramView2)) : ((paramView2 == d0.b));
    } 
    return true;
  }
  
  private void d(d0 paramd0) {
    View view = paramd0.b;
    if (v.I(view) || view.getWidth() != 0 || view.getHeight() != 0) {
      paramd0.a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
      paramd0.a.put("android:changeBounds:parent", paramd0.b.getParent());
      if (this.N) {
        paramd0.b.getLocationInWindow(this.L);
        paramd0.a.put("android:changeBounds:windowX", Integer.valueOf(this.L[0]));
        paramd0.a.put("android:changeBounds:windowY", Integer.valueOf(this.L[1]));
      } 
      if (this.M)
        paramd0.a.put("android:changeBounds:clip", v.j(view)); 
    } 
  }
  
  public Animator a(ViewGroup paramViewGroup, d0 paramd01, d0 paramd02) {
    // Byte code:
    //   0: aload_2
    //   1: ifnull -> 1094
    //   4: aload_3
    //   5: ifnonnull -> 11
    //   8: goto -> 1094
    //   11: aload_2
    //   12: getfield a : Ljava/util/Map;
    //   15: astore #20
    //   17: aload_3
    //   18: getfield a : Ljava/util/Map;
    //   21: astore #19
    //   23: aload #20
    //   25: ldc 'android:changeBounds:parent'
    //   27: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   32: checkcast android/view/ViewGroup
    //   35: astore #20
    //   37: aload #19
    //   39: ldc 'android:changeBounds:parent'
    //   41: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   46: checkcast android/view/ViewGroup
    //   49: astore #21
    //   51: aload #20
    //   53: ifnull -> 1092
    //   56: aload #21
    //   58: ifnonnull -> 64
    //   61: goto -> 1092
    //   64: aload_3
    //   65: getfield b : Landroid/view/View;
    //   68: astore #19
    //   70: aload_0
    //   71: aload #20
    //   73: aload #21
    //   75: invokespecial a : (Landroid/view/View;Landroid/view/View;)Z
    //   78: ifeq -> 840
    //   81: aload_2
    //   82: getfield a : Ljava/util/Map;
    //   85: ldc 'android:changeBounds:bounds'
    //   87: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   92: checkcast android/graphics/Rect
    //   95: astore_1
    //   96: aload_3
    //   97: getfield a : Ljava/util/Map;
    //   100: ldc 'android:changeBounds:bounds'
    //   102: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   107: checkcast android/graphics/Rect
    //   110: astore #20
    //   112: aload_1
    //   113: getfield left : I
    //   116: istore #7
    //   118: aload #20
    //   120: getfield left : I
    //   123: istore #8
    //   125: aload_1
    //   126: getfield top : I
    //   129: istore #9
    //   131: aload #20
    //   133: getfield top : I
    //   136: istore #10
    //   138: aload_1
    //   139: getfield right : I
    //   142: istore #11
    //   144: aload #20
    //   146: getfield right : I
    //   149: istore #12
    //   151: aload_1
    //   152: getfield bottom : I
    //   155: istore #13
    //   157: aload #20
    //   159: getfield bottom : I
    //   162: istore #14
    //   164: iload #11
    //   166: iload #7
    //   168: isub
    //   169: istore #15
    //   171: iload #13
    //   173: iload #9
    //   175: isub
    //   176: istore #16
    //   178: iload #12
    //   180: iload #8
    //   182: isub
    //   183: istore #17
    //   185: iload #14
    //   187: iload #10
    //   189: isub
    //   190: istore #18
    //   192: aload_2
    //   193: getfield a : Ljava/util/Map;
    //   196: ldc 'android:changeBounds:clip'
    //   198: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   203: checkcast android/graphics/Rect
    //   206: astore_2
    //   207: aload_3
    //   208: getfield a : Ljava/util/Map;
    //   211: ldc 'android:changeBounds:clip'
    //   213: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   218: checkcast android/graphics/Rect
    //   221: astore #20
    //   223: iload #15
    //   225: ifeq -> 233
    //   228: iload #16
    //   230: ifne -> 243
    //   233: iload #17
    //   235: ifeq -> 296
    //   238: iload #18
    //   240: ifeq -> 296
    //   243: iload #7
    //   245: iload #8
    //   247: if_icmpne -> 266
    //   250: iload #9
    //   252: iload #10
    //   254: if_icmpeq -> 260
    //   257: goto -> 266
    //   260: iconst_0
    //   261: istore #6
    //   263: goto -> 269
    //   266: iconst_1
    //   267: istore #6
    //   269: iload #11
    //   271: iload #12
    //   273: if_icmpne -> 287
    //   276: iload #6
    //   278: istore #5
    //   280: iload #13
    //   282: iload #14
    //   284: if_icmpeq -> 299
    //   287: iload #6
    //   289: iconst_1
    //   290: iadd
    //   291: istore #5
    //   293: goto -> 299
    //   296: iconst_0
    //   297: istore #5
    //   299: aload_2
    //   300: ifnull -> 312
    //   303: aload_2
    //   304: aload #20
    //   306: invokevirtual equals : (Ljava/lang/Object;)Z
    //   309: ifeq -> 329
    //   312: iload #5
    //   314: istore #6
    //   316: aload_2
    //   317: ifnonnull -> 335
    //   320: iload #5
    //   322: istore #6
    //   324: aload #20
    //   326: ifnull -> 335
    //   329: iload #5
    //   331: iconst_1
    //   332: iadd
    //   333: istore #6
    //   335: iload #6
    //   337: ifle -> 933
    //   340: aload_0
    //   341: getfield M : Z
    //   344: ifne -> 596
    //   347: aload #19
    //   349: astore_3
    //   350: aload_3
    //   351: iload #7
    //   353: iload #9
    //   355: iload #11
    //   357: iload #13
    //   359: invokestatic a : (Landroid/view/View;IIII)V
    //   362: iload #6
    //   364: iconst_2
    //   365: if_icmpne -> 518
    //   368: iload #15
    //   370: iload #17
    //   372: if_icmpne -> 409
    //   375: iload #16
    //   377: iload #18
    //   379: if_icmpne -> 409
    //   382: aload_0
    //   383: invokevirtual h : ()Lb/r/p;
    //   386: iload #7
    //   388: i2f
    //   389: iload #9
    //   391: i2f
    //   392: iload #8
    //   394: i2f
    //   395: iload #10
    //   397: i2f
    //   398: invokevirtual a : (FFFF)Landroid/graphics/Path;
    //   401: astore_1
    //   402: getstatic b/r/d.U : Landroid/util/Property;
    //   405: astore_2
    //   406: goto -> 586
    //   409: new b/r/d$k
    //   412: dup
    //   413: aload_3
    //   414: invokespecial <init> : (Landroid/view/View;)V
    //   417: astore_2
    //   418: aload_0
    //   419: invokevirtual h : ()Lb/r/p;
    //   422: iload #7
    //   424: i2f
    //   425: iload #9
    //   427: i2f
    //   428: iload #8
    //   430: i2f
    //   431: iload #10
    //   433: i2f
    //   434: invokevirtual a : (FFFF)Landroid/graphics/Path;
    //   437: astore_1
    //   438: aload_2
    //   439: getstatic b/r/d.Q : Landroid/util/Property;
    //   442: aload_1
    //   443: invokestatic a : (Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;
    //   446: astore_3
    //   447: aload_0
    //   448: invokevirtual h : ()Lb/r/p;
    //   451: iload #11
    //   453: i2f
    //   454: iload #13
    //   456: i2f
    //   457: iload #12
    //   459: i2f
    //   460: iload #14
    //   462: i2f
    //   463: invokevirtual a : (FFFF)Landroid/graphics/Path;
    //   466: astore_1
    //   467: aload_2
    //   468: getstatic b/r/d.R : Landroid/util/Property;
    //   471: aload_1
    //   472: invokestatic a : (Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;
    //   475: astore #20
    //   477: new android/animation/AnimatorSet
    //   480: dup
    //   481: invokespecial <init> : ()V
    //   484: astore_1
    //   485: aload_1
    //   486: iconst_2
    //   487: anewarray android/animation/Animator
    //   490: dup
    //   491: iconst_0
    //   492: aload_3
    //   493: aastore
    //   494: dup
    //   495: iconst_1
    //   496: aload #20
    //   498: aastore
    //   499: invokevirtual playTogether : ([Landroid/animation/Animator;)V
    //   502: aload_1
    //   503: new b/r/d$h
    //   506: dup
    //   507: aload_0
    //   508: aload_2
    //   509: invokespecial <init> : (Lb/r/d;Lb/r/d$k;)V
    //   512: invokevirtual addListener : (Landroid/animation/Animator$AnimatorListener;)V
    //   515: goto -> 799
    //   518: iload #7
    //   520: iload #8
    //   522: if_icmpne -> 562
    //   525: iload #9
    //   527: iload #10
    //   529: if_icmpeq -> 535
    //   532: goto -> 562
    //   535: aload_0
    //   536: invokevirtual h : ()Lb/r/p;
    //   539: iload #11
    //   541: i2f
    //   542: iload #13
    //   544: i2f
    //   545: iload #12
    //   547: i2f
    //   548: iload #14
    //   550: i2f
    //   551: invokevirtual a : (FFFF)Landroid/graphics/Path;
    //   554: astore_1
    //   555: getstatic b/r/d.S : Landroid/util/Property;
    //   558: astore_2
    //   559: goto -> 586
    //   562: aload_0
    //   563: invokevirtual h : ()Lb/r/p;
    //   566: iload #7
    //   568: i2f
    //   569: iload #9
    //   571: i2f
    //   572: iload #8
    //   574: i2f
    //   575: iload #10
    //   577: i2f
    //   578: invokevirtual a : (FFFF)Landroid/graphics/Path;
    //   581: astore_1
    //   582: getstatic b/r/d.T : Landroid/util/Property;
    //   585: astore_2
    //   586: aload_3
    //   587: aload_2
    //   588: aload_1
    //   589: invokestatic a : (Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;
    //   592: astore_1
    //   593: goto -> 799
    //   596: aload #19
    //   598: astore #21
    //   600: aload #21
    //   602: iload #7
    //   604: iload #9
    //   606: iload #15
    //   608: iload #17
    //   610: invokestatic max : (II)I
    //   613: iload #7
    //   615: iadd
    //   616: iload #16
    //   618: iload #18
    //   620: invokestatic max : (II)I
    //   623: iload #9
    //   625: iadd
    //   626: invokestatic a : (Landroid/view/View;IIII)V
    //   629: iload #7
    //   631: iload #8
    //   633: if_icmpne -> 651
    //   636: iload #9
    //   638: iload #10
    //   640: if_icmpeq -> 646
    //   643: goto -> 651
    //   646: aconst_null
    //   647: astore_1
    //   648: goto -> 681
    //   651: aload_0
    //   652: invokevirtual h : ()Lb/r/p;
    //   655: iload #7
    //   657: i2f
    //   658: iload #9
    //   660: i2f
    //   661: iload #8
    //   663: i2f
    //   664: iload #10
    //   666: i2f
    //   667: invokevirtual a : (FFFF)Landroid/graphics/Path;
    //   670: astore_1
    //   671: aload #21
    //   673: getstatic b/r/d.U : Landroid/util/Property;
    //   676: aload_1
    //   677: invokestatic a : (Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;
    //   680: astore_1
    //   681: aload_2
    //   682: ifnonnull -> 702
    //   685: new android/graphics/Rect
    //   688: dup
    //   689: iconst_0
    //   690: iconst_0
    //   691: iload #15
    //   693: iload #16
    //   695: invokespecial <init> : (IIII)V
    //   698: astore_2
    //   699: goto -> 702
    //   702: aload #20
    //   704: ifnonnull -> 724
    //   707: new android/graphics/Rect
    //   710: dup
    //   711: iconst_0
    //   712: iconst_0
    //   713: iload #17
    //   715: iload #18
    //   717: invokespecial <init> : (IIII)V
    //   720: astore_3
    //   721: goto -> 727
    //   724: aload #20
    //   726: astore_3
    //   727: aload_2
    //   728: aload_3
    //   729: invokevirtual equals : (Ljava/lang/Object;)Z
    //   732: ifne -> 791
    //   735: aload #21
    //   737: aload_2
    //   738: invokestatic a : (Landroid/view/View;Landroid/graphics/Rect;)V
    //   741: aload #21
    //   743: ldc 'clipBounds'
    //   745: getstatic b/r/d.V : Lb/r/t;
    //   748: iconst_2
    //   749: anewarray java/lang/Object
    //   752: dup
    //   753: iconst_0
    //   754: aload_2
    //   755: aastore
    //   756: dup
    //   757: iconst_1
    //   758: aload_3
    //   759: aastore
    //   760: invokestatic ofObject : (Ljava/lang/Object;Ljava/lang/String;Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/ObjectAnimator;
    //   763: astore_2
    //   764: aload_2
    //   765: new b/r/d$i
    //   768: dup
    //   769: aload_0
    //   770: aload #21
    //   772: aload #20
    //   774: iload #8
    //   776: iload #10
    //   778: iload #12
    //   780: iload #14
    //   782: invokespecial <init> : (Lb/r/d;Landroid/view/View;Landroid/graphics/Rect;IIII)V
    //   785: invokevirtual addListener : (Landroid/animation/Animator$AnimatorListener;)V
    //   788: goto -> 793
    //   791: aconst_null
    //   792: astore_2
    //   793: aload_1
    //   794: aload_2
    //   795: invokestatic a : (Landroid/animation/Animator;Landroid/animation/Animator;)Landroid/animation/Animator;
    //   798: astore_1
    //   799: aload #19
    //   801: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   804: instanceof android/view/ViewGroup
    //   807: ifeq -> 838
    //   810: aload #19
    //   812: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   815: checkcast android/view/ViewGroup
    //   818: astore_2
    //   819: aload_2
    //   820: iconst_1
    //   821: invokestatic b : (Landroid/view/ViewGroup;Z)V
    //   824: aload_0
    //   825: new b/r/d$j
    //   828: dup
    //   829: aload_0
    //   830: aload_2
    //   831: invokespecial <init> : (Lb/r/d;Landroid/view/ViewGroup;)V
    //   834: invokevirtual a : (Lb/r/x$f;)Lb/r/x;
    //   837: pop
    //   838: aload_1
    //   839: areturn
    //   840: aload_2
    //   841: getfield a : Ljava/util/Map;
    //   844: ldc 'android:changeBounds:windowX'
    //   846: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   851: checkcast java/lang/Integer
    //   854: invokevirtual intValue : ()I
    //   857: istore #5
    //   859: aload_2
    //   860: getfield a : Ljava/util/Map;
    //   863: ldc 'android:changeBounds:windowY'
    //   865: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   870: checkcast java/lang/Integer
    //   873: invokevirtual intValue : ()I
    //   876: istore #6
    //   878: aload_3
    //   879: getfield a : Ljava/util/Map;
    //   882: ldc 'android:changeBounds:windowX'
    //   884: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   889: checkcast java/lang/Integer
    //   892: invokevirtual intValue : ()I
    //   895: istore #7
    //   897: aload_3
    //   898: getfield a : Ljava/util/Map;
    //   901: ldc 'android:changeBounds:windowY'
    //   903: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   908: checkcast java/lang/Integer
    //   911: invokevirtual intValue : ()I
    //   914: istore #8
    //   916: iload #5
    //   918: iload #7
    //   920: if_icmpne -> 935
    //   923: iload #6
    //   925: iload #8
    //   927: if_icmpeq -> 933
    //   930: goto -> 935
    //   933: aconst_null
    //   934: areturn
    //   935: aload_1
    //   936: aload_0
    //   937: getfield L : [I
    //   940: invokevirtual getLocationInWindow : ([I)V
    //   943: aload #19
    //   945: invokevirtual getWidth : ()I
    //   948: aload #19
    //   950: invokevirtual getHeight : ()I
    //   953: getstatic android/graphics/Bitmap$Config.ARGB_8888 : Landroid/graphics/Bitmap$Config;
    //   956: invokestatic createBitmap : (IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    //   959: astore_2
    //   960: aload #19
    //   962: new android/graphics/Canvas
    //   965: dup
    //   966: aload_2
    //   967: invokespecial <init> : (Landroid/graphics/Bitmap;)V
    //   970: invokevirtual draw : (Landroid/graphics/Canvas;)V
    //   973: new android/graphics/drawable/BitmapDrawable
    //   976: dup
    //   977: aload_2
    //   978: invokespecial <init> : (Landroid/graphics/Bitmap;)V
    //   981: astore_2
    //   982: aload #19
    //   984: invokestatic c : (Landroid/view/View;)F
    //   987: fstore #4
    //   989: aload #19
    //   991: fconst_0
    //   992: invokestatic a : (Landroid/view/View;F)V
    //   995: aload_1
    //   996: invokestatic b : (Landroid/view/View;)Lb/r/n0;
    //   999: aload_2
    //   1000: invokeinterface a : (Landroid/graphics/drawable/Drawable;)V
    //   1005: aload_0
    //   1006: invokevirtual h : ()Lb/r/p;
    //   1009: astore_3
    //   1010: aload_0
    //   1011: getfield L : [I
    //   1014: astore #20
    //   1016: aload_3
    //   1017: iload #5
    //   1019: aload #20
    //   1021: iconst_0
    //   1022: iaload
    //   1023: isub
    //   1024: i2f
    //   1025: iload #6
    //   1027: aload #20
    //   1029: iconst_1
    //   1030: iaload
    //   1031: isub
    //   1032: i2f
    //   1033: iload #7
    //   1035: aload #20
    //   1037: iconst_0
    //   1038: iaload
    //   1039: isub
    //   1040: i2f
    //   1041: iload #8
    //   1043: aload #20
    //   1045: iconst_1
    //   1046: iaload
    //   1047: isub
    //   1048: i2f
    //   1049: invokevirtual a : (FFFF)Landroid/graphics/Path;
    //   1052: astore_3
    //   1053: aload_2
    //   1054: iconst_1
    //   1055: anewarray android/animation/PropertyValuesHolder
    //   1058: dup
    //   1059: iconst_0
    //   1060: getstatic b/r/d.P : Landroid/util/Property;
    //   1063: aload_3
    //   1064: invokestatic a : (Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/PropertyValuesHolder;
    //   1067: aastore
    //   1068: invokestatic ofPropertyValuesHolder : (Ljava/lang/Object;[Landroid/animation/PropertyValuesHolder;)Landroid/animation/ObjectAnimator;
    //   1071: astore_3
    //   1072: aload_3
    //   1073: new b/r/d$a
    //   1076: dup
    //   1077: aload_0
    //   1078: aload_1
    //   1079: aload_2
    //   1080: aload #19
    //   1082: fload #4
    //   1084: invokespecial <init> : (Lb/r/d;Landroid/view/ViewGroup;Landroid/graphics/drawable/BitmapDrawable;Landroid/view/View;F)V
    //   1087: invokevirtual addListener : (Landroid/animation/Animator$AnimatorListener;)V
    //   1090: aload_3
    //   1091: areturn
    //   1092: aconst_null
    //   1093: areturn
    //   1094: aconst_null
    //   1095: areturn
  }
  
  public void a(d0 paramd0) {
    d(paramd0);
  }
  
  public void c(d0 paramd0) {
    d(paramd0);
  }
  
  public String[] o() {
    return O;
  }
  
  class a extends AnimatorListenerAdapter {
    a(d this$0, ViewGroup param1ViewGroup, BitmapDrawable param1BitmapDrawable, View param1View, float param1Float) {}
    
    public void onAnimationEnd(Animator param1Animator) {
      o0.b((View)this.a).b((Drawable)this.b);
      o0.a(this.c, this.d);
    }
  }
  
  static final class b extends Property<Drawable, PointF> {
    private Rect a = new Rect();
    
    b(Class param1Class, String param1String) {
      super(param1Class, param1String);
    }
    
    public PointF a(Drawable param1Drawable) {
      param1Drawable.copyBounds(this.a);
      Rect rect = this.a;
      return new PointF(rect.left, rect.top);
    }
    
    public void a(Drawable param1Drawable, PointF param1PointF) {
      param1Drawable.copyBounds(this.a);
      this.a.offsetTo(Math.round(param1PointF.x), Math.round(param1PointF.y));
      param1Drawable.setBounds(this.a);
    }
  }
  
  static final class c extends Property<k, PointF> {
    c(Class param1Class, String param1String) {
      super(param1Class, param1String);
    }
    
    public PointF a(d.k param1k) {
      return null;
    }
    
    public void a(d.k param1k, PointF param1PointF) {
      param1k.b(param1PointF);
    }
  }
  
  static final class d extends Property<k, PointF> {
    d(Class param1Class, String param1String) {
      super(param1Class, param1String);
    }
    
    public PointF a(d.k param1k) {
      return null;
    }
    
    public void a(d.k param1k, PointF param1PointF) {
      param1k.a(param1PointF);
    }
  }
  
  static final class e extends Property<View, PointF> {
    e(Class param1Class, String param1String) {
      super(param1Class, param1String);
    }
    
    public PointF a(View param1View) {
      return null;
    }
    
    public void a(View param1View, PointF param1PointF) {
      o0.a(param1View, param1View.getLeft(), param1View.getTop(), Math.round(param1PointF.x), Math.round(param1PointF.y));
    }
  }
  
  static final class f extends Property<View, PointF> {
    f(Class param1Class, String param1String) {
      super(param1Class, param1String);
    }
    
    public PointF a(View param1View) {
      return null;
    }
    
    public void a(View param1View, PointF param1PointF) {
      o0.a(param1View, Math.round(param1PointF.x), Math.round(param1PointF.y), param1View.getRight(), param1View.getBottom());
    }
  }
  
  static final class g extends Property<View, PointF> {
    g(Class param1Class, String param1String) {
      super(param1Class, param1String);
    }
    
    public PointF a(View param1View) {
      return null;
    }
    
    public void a(View param1View, PointF param1PointF) {
      int i = Math.round(param1PointF.x);
      int j = Math.round(param1PointF.y);
      o0.a(param1View, i, j, param1View.getWidth() + i, param1View.getHeight() + j);
    }
  }
  
  class h extends AnimatorListenerAdapter {
    private d.k mViewBounds = this.a;
    
    h(d this$0, d.k param1k) {}
  }
  
  class i extends AnimatorListenerAdapter {
    private boolean a;
    
    i(d this$0, View param1View, Rect param1Rect, int param1Int1, int param1Int2, int param1Int3, int param1Int4) {}
    
    public void onAnimationCancel(Animator param1Animator) {
      this.a = true;
    }
    
    public void onAnimationEnd(Animator param1Animator) {
      if (!this.a) {
        v.a(this.b, this.c);
        o0.a(this.b, this.d, this.e, this.f, this.g);
      } 
    }
  }
  
  class j extends y {
    boolean a = false;
    
    j(d this$0, ViewGroup param1ViewGroup) {}
    
    public void b(x param1x) {
      j0.b(this.b, false);
      this.a = true;
    }
    
    public void c(x param1x) {
      j0.b(this.b, false);
    }
    
    public void d(x param1x) {
      j0.b(this.b, true);
    }
    
    public void e(x param1x) {
      if (!this.a)
        j0.b(this.b, false); 
      param1x.b(this);
    }
  }
  
  private static class k {
    private int a;
    
    private int b;
    
    private int c;
    
    private int d;
    
    private View e;
    
    private int f;
    
    private int g;
    
    k(View param1View) {
      this.e = param1View;
    }
    
    private void a() {
      o0.a(this.e, this.a, this.b, this.c, this.d);
      this.f = 0;
      this.g = 0;
    }
    
    void a(PointF param1PointF) {
      this.c = Math.round(param1PointF.x);
      this.d = Math.round(param1PointF.y);
      this.g++;
      if (this.f == this.g)
        a(); 
    }
    
    void b(PointF param1PointF) {
      this.a = Math.round(param1PointF.x);
      this.b = Math.round(param1PointF.y);
      this.f++;
      if (this.f == this.g)
        a(); 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/r/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */