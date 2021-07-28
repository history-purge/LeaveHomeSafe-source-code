package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.views.text.i;
import java.text.Bidi;
import java.util.ArrayList;

@SuppressLint({"ViewConstructor"})
class h0 extends u0 {
  private Path X0;
  
  String Y0;
  
  private i0 Z0;
  
  private final ArrayList<String> a1 = new ArrayList<String>();
  
  private final ArrayList<Matrix> b1 = new ArrayList<Matrix>();
  
  private final AssetManager c1 = this.u.getResources().getAssets();
  
  public h0(ReactContext paramReactContext) {
    super(paramReactContext);
  }
  
  private double a(c0 paramc0, double paramDouble1, double paramDouble2) {
    return w.a(paramc0, paramDouble1, 0.0D, this.L, paramDouble2);
  }
  
  private double a(n0 paramn0, double paramDouble) {
    int i = a.a[paramn0.ordinal()];
    return (i != 2) ? ((i != 3) ? 0.0D : -paramDouble) : (-paramDouble / 2.0D);
  }
  
  private Path a(String paramString, Paint paramPaint, Canvas paramCanvas) {
    // Byte code:
    //   0: aload_0
    //   1: astore #55
    //   3: aload_2
    //   4: astore #58
    //   6: aload_1
    //   7: invokevirtual length : ()I
    //   10: istore #47
    //   12: new android/graphics/Path
    //   15: dup
    //   16: invokespecial <init> : ()V
    //   19: astore #56
    //   21: aload #55
    //   23: getfield a1 : Ljava/util/ArrayList;
    //   26: invokevirtual clear : ()V
    //   29: aload #55
    //   31: getfield b1 : Ljava/util/ArrayList;
    //   34: invokevirtual clear : ()V
    //   37: iload #47
    //   39: ifne -> 45
    //   42: aload #56
    //   44: areturn
    //   45: aload #55
    //   47: getfield Z0 : Lcom/horcrux/svg/i0;
    //   50: ifnull -> 59
    //   53: iconst_1
    //   54: istore #48
    //   56: goto -> 62
    //   59: iconst_0
    //   60: istore #48
    //   62: iload #48
    //   64: ifeq -> 116
    //   67: new android/graphics/PathMeasure
    //   70: dup
    //   71: aload #55
    //   73: getfield Z0 : Lcom/horcrux/svg/i0;
    //   76: aload_3
    //   77: aload #58
    //   79: invokevirtual e : (Landroid/graphics/Canvas;Landroid/graphics/Paint;)Landroid/graphics/Path;
    //   82: iconst_0
    //   83: invokespecial <init> : (Landroid/graphics/Path;Z)V
    //   86: astore #54
    //   88: aload #54
    //   90: invokevirtual getLength : ()F
    //   93: f2d
    //   94: dstore #5
    //   96: aload #54
    //   98: invokevirtual isClosed : ()Z
    //   101: istore #52
    //   103: dload #5
    //   105: dconst_0
    //   106: dcmpl
    //   107: ifne -> 113
    //   110: aload #56
    //   112: areturn
    //   113: goto -> 125
    //   116: aconst_null
    //   117: astore #54
    //   119: dconst_0
    //   120: dstore #5
    //   122: iconst_0
    //   123: istore #52
    //   125: aload_0
    //   126: invokevirtual l : ()Lcom/horcrux/svg/j;
    //   129: astore #60
    //   131: aload #60
    //   133: invokevirtual a : ()Lcom/horcrux/svg/h;
    //   136: astore #61
    //   138: aload #55
    //   140: aload #58
    //   142: aload #61
    //   144: invokespecial b : (Landroid/graphics/Paint;Lcom/horcrux/svg/h;)V
    //   147: new com/horcrux/svg/k
    //   150: dup
    //   151: aload #58
    //   153: invokespecial <init> : (Landroid/graphics/Paint;)V
    //   156: astore #62
    //   158: iload #47
    //   160: newarray boolean
    //   162: astore #65
    //   164: aload_1
    //   165: invokevirtual toCharArray : ()[C
    //   168: astore #68
    //   170: aload #61
    //   172: getfield l : D
    //   175: dstore #21
    //   177: aload #61
    //   179: getfield m : D
    //   182: dstore #25
    //   184: aload #61
    //   186: getfield n : D
    //   189: dstore #15
    //   191: aload #61
    //   193: getfield o : Z
    //   196: istore #53
    //   198: dload #15
    //   200: dconst_0
    //   201: dcmpl
    //   202: ifne -> 222
    //   205: aload #61
    //   207: getfield i : Lcom/horcrux/svg/l0;
    //   210: getstatic com/horcrux/svg/l0.c : Lcom/horcrux/svg/l0;
    //   213: if_acmpne -> 222
    //   216: iconst_1
    //   217: istore #45
    //   219: goto -> 225
    //   222: iconst_0
    //   223: istore #45
    //   225: getstatic android/os/Build$VERSION.SDK_INT : I
    //   228: bipush #21
    //   230: if_icmplt -> 354
    //   233: iload #45
    //   235: ifeq -> 254
    //   238: new java/lang/StringBuilder
    //   241: dup
    //   242: invokespecial <init> : ()V
    //   245: astore #57
    //   247: ldc ''rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'hlig', 'cala', '
    //   249: astore #59
    //   251: goto -> 267
    //   254: new java/lang/StringBuilder
    //   257: dup
    //   258: invokespecial <init> : ()V
    //   261: astore #57
    //   263: ldc ''rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'liga' 0, 'clig' 0, 'dlig' 0, 'hlig' 0, 'cala' 0, '
    //   265: astore #59
    //   267: aload #57
    //   269: aload #59
    //   271: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   274: pop
    //   275: aload #57
    //   277: aload #61
    //   279: getfield g : Ljava/lang/String;
    //   282: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   285: pop
    //   286: aload #58
    //   288: aload #57
    //   290: invokevirtual toString : ()Ljava/lang/String;
    //   293: invokevirtual setFontFeatureSettings : (Ljava/lang/String;)V
    //   296: getstatic android/os/Build$VERSION.SDK_INT : I
    //   299: bipush #26
    //   301: if_icmplt -> 354
    //   304: new java/lang/StringBuilder
    //   307: dup
    //   308: invokespecial <init> : ()V
    //   311: astore #57
    //   313: aload #57
    //   315: ldc ''wght' '
    //   317: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   320: pop
    //   321: aload #57
    //   323: aload #61
    //   325: getfield f : I
    //   328: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   331: pop
    //   332: aload #57
    //   334: aload #61
    //   336: getfield h : Ljava/lang/String;
    //   339: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   342: pop
    //   343: aload #58
    //   345: aload #57
    //   347: invokevirtual toString : ()Ljava/lang/String;
    //   350: invokevirtual setFontVariationSettings : (Ljava/lang/String;)Z
    //   353: pop
    //   354: aload #61
    //   356: getfield d : Lcom/facebook/react/bridge/ReadableMap;
    //   359: astore #57
    //   361: iload #47
    //   363: newarray float
    //   365: astore #64
    //   367: aload #58
    //   369: aload_1
    //   370: aload #64
    //   372: invokevirtual getTextWidths : (Ljava/lang/String;[F)I
    //   375: pop
    //   376: aload #61
    //   378: getfield j : Lcom/horcrux/svg/n0;
    //   381: astore_1
    //   382: aload_0
    //   383: invokevirtual q : ()Lcom/horcrux/svg/u0;
    //   386: astore #59
    //   388: aload #59
    //   390: aload #58
    //   392: invokevirtual a : (Landroid/graphics/Paint;)D
    //   395: dstore #19
    //   397: aload #55
    //   399: aload_1
    //   400: dload #19
    //   402: invokespecial a : (Lcom/horcrux/svg/n0;D)D
    //   405: dstore #13
    //   407: aload #60
    //   409: invokevirtual b : ()D
    //   412: dstore #33
    //   414: iload #48
    //   416: ifeq -> 552
    //   419: aload #55
    //   421: getfield Z0 : Lcom/horcrux/svg/i0;
    //   424: invokevirtual s : ()Lcom/horcrux/svg/r0;
    //   427: getstatic com/horcrux/svg/r0.c : Lcom/horcrux/svg/r0;
    //   430: if_acmpne -> 439
    //   433: iconst_1
    //   434: istore #45
    //   436: goto -> 442
    //   439: iconst_0
    //   440: istore #45
    //   442: aload #55
    //   444: getfield Z0 : Lcom/horcrux/svg/i0;
    //   447: invokevirtual t : ()Lcom/horcrux/svg/s0;
    //   450: getstatic com/horcrux/svg/s0.d : Lcom/horcrux/svg/s0;
    //   453: if_acmpne -> 462
    //   456: iconst_m1
    //   457: istore #46
    //   459: goto -> 465
    //   462: iconst_1
    //   463: istore #46
    //   465: aload_0
    //   466: aload #55
    //   468: getfield Z0 : Lcom/horcrux/svg/i0;
    //   471: invokevirtual u : ()Lcom/horcrux/svg/c0;
    //   474: dload #5
    //   476: dload #33
    //   478: invokespecial a : (Lcom/horcrux/svg/c0;DD)D
    //   481: dstore #9
    //   483: dload #13
    //   485: dload #9
    //   487: dadd
    //   488: dstore #13
    //   490: iload #52
    //   492: ifeq -> 538
    //   495: dload #5
    //   497: ldc2_w 2.0
    //   500: ddiv
    //   501: dstore #7
    //   503: aload_1
    //   504: getstatic com/horcrux/svg/n0.d : Lcom/horcrux/svg/n0;
    //   507: if_acmpne -> 518
    //   510: dload #7
    //   512: dneg
    //   513: dstore #7
    //   515: goto -> 521
    //   518: dconst_0
    //   519: dstore #7
    //   521: dload #9
    //   523: dload #7
    //   525: dadd
    //   526: dstore #7
    //   528: dload #7
    //   530: dload #5
    //   532: dadd
    //   533: dstore #9
    //   535: goto -> 545
    //   538: dload #5
    //   540: dstore #9
    //   542: dconst_0
    //   543: dstore #7
    //   545: dload #7
    //   547: dstore #11
    //   549: goto -> 565
    //   552: dload #5
    //   554: dstore #9
    //   556: dconst_0
    //   557: dstore #11
    //   559: iconst_1
    //   560: istore #46
    //   562: iconst_0
    //   563: istore #45
    //   565: aload #60
    //   567: astore #59
    //   569: dconst_1
    //   570: dstore #17
    //   572: aload #55
    //   574: getfield N0 : Lcom/horcrux/svg/c0;
    //   577: astore_1
    //   578: aload_1
    //   579: ifnull -> 675
    //   582: aload_1
    //   583: aload_3
    //   584: invokevirtual getWidth : ()I
    //   587: i2d
    //   588: dconst_0
    //   589: aload #55
    //   591: getfield L : F
    //   594: f2d
    //   595: dload #33
    //   597: invokestatic a : (Lcom/horcrux/svg/c0;DDDD)D
    //   600: dstore #7
    //   602: dload #7
    //   604: dconst_0
    //   605: dcmpg
    //   606: iflt -> 664
    //   609: getstatic com/horcrux/svg/h0$a.b : [I
    //   612: aload #55
    //   614: getfield P0 : Lcom/horcrux/svg/p0;
    //   617: invokevirtual ordinal : ()I
    //   620: iaload
    //   621: iconst_2
    //   622: if_icmpeq -> 654
    //   625: iload #47
    //   627: iconst_1
    //   628: isub
    //   629: i2d
    //   630: dstore #23
    //   632: dload #23
    //   634: invokestatic isNaN : (D)Z
    //   637: pop
    //   638: dload #15
    //   640: dload #7
    //   642: dload #19
    //   644: dsub
    //   645: dload #23
    //   647: ddiv
    //   648: dadd
    //   649: dstore #15
    //   651: goto -> 675
    //   654: dload #7
    //   656: dload #19
    //   658: ddiv
    //   659: dstore #17
    //   661: goto -> 675
    //   664: new java/lang/IllegalArgumentException
    //   667: dup
    //   668: ldc_w 'Negative textLength value'
    //   671: invokespecial <init> : (Ljava/lang/String;)V
    //   674: athrow
    //   675: dload #5
    //   677: dstore #19
    //   679: iload #46
    //   681: i2d
    //   682: dstore #31
    //   684: dload #31
    //   686: invokestatic isNaN : (D)Z
    //   689: pop
    //   690: aload_2
    //   691: invokevirtual getFontMetrics : ()Landroid/graphics/Paint$FontMetrics;
    //   694: astore_1
    //   695: aload_1
    //   696: getfield descent : F
    //   699: f2d
    //   700: dstore #35
    //   702: aload_1
    //   703: getfield leading : F
    //   706: fstore #43
    //   708: dload #17
    //   710: dload #31
    //   712: dmul
    //   713: dstore #23
    //   715: fload #43
    //   717: f2d
    //   718: dstore #5
    //   720: dload #35
    //   722: invokestatic isNaN : (D)Z
    //   725: pop
    //   726: dload #5
    //   728: invokestatic isNaN : (D)Z
    //   731: pop
    //   732: dload #5
    //   734: dload #35
    //   736: dadd
    //   737: dstore #27
    //   739: aload_1
    //   740: getfield ascent : F
    //   743: fneg
    //   744: fstore #44
    //   746: iload #45
    //   748: istore #49
    //   750: fload #44
    //   752: fload #43
    //   754: fadd
    //   755: f2d
    //   756: dstore #7
    //   758: aload_1
    //   759: getfield top : F
    //   762: fneg
    //   763: f2d
    //   764: dstore #29
    //   766: dload #29
    //   768: invokestatic isNaN : (D)Z
    //   771: pop
    //   772: aload_0
    //   773: invokevirtual p : ()Ljava/lang/String;
    //   776: astore_1
    //   777: aload_0
    //   778: invokevirtual o : ()Lcom/horcrux/svg/j0;
    //   781: astore #60
    //   783: aload #60
    //   785: ifnull -> 1022
    //   788: dload #7
    //   790: dstore #5
    //   792: getstatic com/horcrux/svg/h0$a.c : [I
    //   795: aload #60
    //   797: invokevirtual ordinal : ()I
    //   800: iaload
    //   801: tableswitch default -> 876, 2 -> 1008, 3 -> 1008, 4 -> 1008, 5 -> 1022, 6 -> 1008, 7 -> 962, 8 -> 936, 9 -> 915, 10 -> 907, 11 -> 959, 12 -> 959, 13 -> 959, 14 -> 900, 15 -> 886, 16 -> 879
    //   876: goto -> 1022
    //   879: dload #29
    //   881: dstore #5
    //   883: goto -> 959
    //   886: dload #29
    //   888: dload #27
    //   890: dadd
    //   891: ldc2_w 2.0
    //   894: ddiv
    //   895: dstore #5
    //   897: goto -> 959
    //   900: dload #27
    //   902: dstore #5
    //   904: goto -> 959
    //   907: ldc2_w 0.8
    //   910: dstore #5
    //   912: goto -> 920
    //   915: ldc2_w 0.5
    //   918: dstore #5
    //   920: dload #7
    //   922: invokestatic isNaN : (D)Z
    //   925: pop
    //   926: dload #7
    //   928: dload #5
    //   930: dmul
    //   931: dstore #5
    //   933: goto -> 959
    //   936: dload #7
    //   938: invokestatic isNaN : (D)Z
    //   941: pop
    //   942: dload #35
    //   944: invokestatic isNaN : (D)Z
    //   947: pop
    //   948: dload #7
    //   950: dload #35
    //   952: dsub
    //   953: ldc2_w 2.0
    //   956: ddiv
    //   957: dstore #5
    //   959: goto -> 1025
    //   962: new android/graphics/Rect
    //   965: dup
    //   966: invokespecial <init> : ()V
    //   969: astore #61
    //   971: aload #58
    //   973: ldc_w 'x'
    //   976: iconst_0
    //   977: iconst_1
    //   978: aload #61
    //   980: invokevirtual getTextBounds : (Ljava/lang/String;IILandroid/graphics/Rect;)V
    //   983: aload #61
    //   985: invokevirtual height : ()I
    //   988: i2d
    //   989: dstore #5
    //   991: dload #5
    //   993: invokestatic isNaN : (D)Z
    //   996: pop
    //   997: dload #5
    //   999: ldc2_w 2.0
    //   1002: ddiv
    //   1003: dstore #5
    //   1005: goto -> 1025
    //   1008: dload #35
    //   1010: invokestatic isNaN : (D)Z
    //   1013: pop
    //   1014: dload #35
    //   1016: dneg
    //   1017: dstore #5
    //   1019: goto -> 1025
    //   1022: dconst_0
    //   1023: dstore #5
    //   1025: dload #5
    //   1027: dstore #7
    //   1029: aload_1
    //   1030: ifnull -> 1545
    //   1033: dload #5
    //   1035: dstore #7
    //   1037: aload_1
    //   1038: invokevirtual isEmpty : ()Z
    //   1041: ifne -> 1545
    //   1044: getstatic com/horcrux/svg/h0$a.c : [I
    //   1047: aload #60
    //   1049: invokevirtual ordinal : ()I
    //   1052: iaload
    //   1053: istore #45
    //   1055: dload #5
    //   1057: dstore #7
    //   1059: iload #45
    //   1061: bipush #14
    //   1063: if_icmpeq -> 1545
    //   1066: dload #5
    //   1068: dstore #7
    //   1070: iload #45
    //   1072: bipush #16
    //   1074: if_icmpeq -> 1545
    //   1077: aload_1
    //   1078: invokevirtual hashCode : ()I
    //   1081: istore #45
    //   1083: iload #45
    //   1085: ldc_w -1720785339
    //   1088: if_icmpeq -> 1142
    //   1091: iload #45
    //   1093: ldc_w 114240
    //   1096: if_icmpeq -> 1126
    //   1099: iload #45
    //   1101: ldc_w 109801339
    //   1104: if_icmpeq -> 1110
    //   1107: goto -> 1158
    //   1110: aload_1
    //   1111: ldc_w 'super'
    //   1114: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1117: ifeq -> 1158
    //   1120: iconst_1
    //   1121: istore #45
    //   1123: goto -> 1161
    //   1126: aload_1
    //   1127: ldc_w 'sub'
    //   1130: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1133: ifeq -> 1158
    //   1136: iconst_0
    //   1137: istore #45
    //   1139: goto -> 1161
    //   1142: aload_1
    //   1143: ldc_w 'baseline'
    //   1146: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1149: ifeq -> 1158
    //   1152: iconst_2
    //   1153: istore #45
    //   1155: goto -> 1161
    //   1158: iconst_m1
    //   1159: istore #45
    //   1161: iload #45
    //   1163: ifeq -> 1385
    //   1166: iload #45
    //   1168: iconst_1
    //   1169: if_icmpeq -> 1222
    //   1172: dload #5
    //   1174: dstore #7
    //   1176: iload #45
    //   1178: iconst_2
    //   1179: if_icmpeq -> 1545
    //   1182: aload #55
    //   1184: getfield L : F
    //   1187: fstore #43
    //   1189: fload #43
    //   1191: f2d
    //   1192: dstore #7
    //   1194: dload #7
    //   1196: invokestatic isNaN : (D)Z
    //   1199: pop
    //   1200: dload #5
    //   1202: aload_1
    //   1203: dload #7
    //   1205: dload #33
    //   1207: dmul
    //   1208: fload #43
    //   1210: f2d
    //   1211: dload #33
    //   1213: invokestatic a : (Ljava/lang/String;DDD)D
    //   1216: dsub
    //   1217: dstore #7
    //   1219: goto -> 1545
    //   1222: dload #5
    //   1224: dstore #7
    //   1226: aload #57
    //   1228: ifnull -> 1545
    //   1231: dload #5
    //   1233: dstore #7
    //   1235: aload #57
    //   1237: ldc_w 'tables'
    //   1240: invokeinterface hasKey : (Ljava/lang/String;)Z
    //   1245: ifeq -> 1545
    //   1248: dload #5
    //   1250: dstore #7
    //   1252: aload #57
    //   1254: ldc_w 'unitsPerEm'
    //   1257: invokeinterface hasKey : (Ljava/lang/String;)Z
    //   1262: ifeq -> 1545
    //   1265: aload #57
    //   1267: ldc_w 'unitsPerEm'
    //   1270: invokeinterface getInt : (Ljava/lang/String;)I
    //   1275: istore #45
    //   1277: aload #57
    //   1279: ldc_w 'tables'
    //   1282: invokeinterface getMap : (Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;
    //   1287: astore_1
    //   1288: dload #5
    //   1290: dstore #7
    //   1292: aload_1
    //   1293: ldc_w 'os2'
    //   1296: invokeinterface hasKey : (Ljava/lang/String;)Z
    //   1301: ifeq -> 1545
    //   1304: aload_1
    //   1305: ldc_w 'os2'
    //   1308: invokeinterface getMap : (Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;
    //   1313: astore_1
    //   1314: dload #5
    //   1316: dstore #7
    //   1318: aload_1
    //   1319: ldc_w 'ySuperscriptYOffset'
    //   1322: invokeinterface hasKey : (Ljava/lang/String;)Z
    //   1327: ifeq -> 1545
    //   1330: aload_1
    //   1331: ldc_w 'ySuperscriptYOffset'
    //   1334: invokeinterface getDouble : (Ljava/lang/String;)D
    //   1339: dstore #7
    //   1341: aload #55
    //   1343: getfield L : F
    //   1346: f2d
    //   1347: dstore #27
    //   1349: dload #27
    //   1351: invokestatic isNaN : (D)Z
    //   1354: pop
    //   1355: iload #45
    //   1357: i2d
    //   1358: dstore #29
    //   1360: dload #29
    //   1362: invokestatic isNaN : (D)Z
    //   1365: pop
    //   1366: dload #5
    //   1368: dload #27
    //   1370: dload #33
    //   1372: dmul
    //   1373: dload #7
    //   1375: dmul
    //   1376: dload #29
    //   1378: ddiv
    //   1379: dsub
    //   1380: dstore #7
    //   1382: goto -> 1545
    //   1385: dload #5
    //   1387: dstore #7
    //   1389: aload #57
    //   1391: ifnull -> 1545
    //   1394: dload #5
    //   1396: dstore #7
    //   1398: aload #57
    //   1400: ldc_w 'tables'
    //   1403: invokeinterface hasKey : (Ljava/lang/String;)Z
    //   1408: ifeq -> 1545
    //   1411: dload #5
    //   1413: dstore #7
    //   1415: aload #57
    //   1417: ldc_w 'unitsPerEm'
    //   1420: invokeinterface hasKey : (Ljava/lang/String;)Z
    //   1425: ifeq -> 1545
    //   1428: aload #57
    //   1430: ldc_w 'unitsPerEm'
    //   1433: invokeinterface getInt : (Ljava/lang/String;)I
    //   1438: istore #45
    //   1440: aload #57
    //   1442: ldc_w 'tables'
    //   1445: invokeinterface getMap : (Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;
    //   1450: astore_1
    //   1451: dload #5
    //   1453: dstore #7
    //   1455: aload_1
    //   1456: ldc_w 'os2'
    //   1459: invokeinterface hasKey : (Ljava/lang/String;)Z
    //   1464: ifeq -> 1545
    //   1467: aload_1
    //   1468: ldc_w 'os2'
    //   1471: invokeinterface getMap : (Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;
    //   1476: astore_1
    //   1477: dload #5
    //   1479: dstore #7
    //   1481: aload_1
    //   1482: ldc_w 'ySubscriptYOffset'
    //   1485: invokeinterface hasKey : (Ljava/lang/String;)Z
    //   1490: ifeq -> 1545
    //   1493: aload_1
    //   1494: ldc_w 'ySubscriptYOffset'
    //   1497: invokeinterface getDouble : (Ljava/lang/String;)D
    //   1502: dstore #7
    //   1504: aload #55
    //   1506: getfield L : F
    //   1509: f2d
    //   1510: dstore #27
    //   1512: dload #27
    //   1514: invokestatic isNaN : (D)Z
    //   1517: pop
    //   1518: iload #45
    //   1520: i2d
    //   1521: dstore #29
    //   1523: dload #29
    //   1525: invokestatic isNaN : (D)Z
    //   1528: pop
    //   1529: dload #5
    //   1531: dload #27
    //   1533: dload #33
    //   1535: dmul
    //   1536: dload #7
    //   1538: dmul
    //   1539: dload #29
    //   1541: ddiv
    //   1542: dadd
    //   1543: dstore #7
    //   1545: new android/graphics/Matrix
    //   1548: dup
    //   1549: invokespecial <init> : ()V
    //   1552: astore #61
    //   1554: new android/graphics/Matrix
    //   1557: dup
    //   1558: invokespecial <init> : ()V
    //   1561: astore_1
    //   1562: new android/graphics/Matrix
    //   1565: dup
    //   1566: invokespecial <init> : ()V
    //   1569: astore #67
    //   1571: bipush #9
    //   1573: newarray float
    //   1575: astore #66
    //   1577: bipush #9
    //   1579: newarray float
    //   1581: astore #60
    //   1583: iconst_0
    //   1584: istore #45
    //   1586: iload #46
    //   1588: istore #50
    //   1590: dload #19
    //   1592: dstore #5
    //   1594: aload #54
    //   1596: astore #57
    //   1598: dload #23
    //   1600: dstore #19
    //   1602: aload #58
    //   1604: astore #63
    //   1606: iload #47
    //   1608: istore #46
    //   1610: aload #67
    //   1612: astore #58
    //   1614: aload #66
    //   1616: astore #54
    //   1618: iload #45
    //   1620: iload #46
    //   1622: if_icmpge -> 2448
    //   1625: aload #68
    //   1627: iload #45
    //   1629: caload
    //   1630: istore #4
    //   1632: aload #65
    //   1634: iload #45
    //   1636: baload
    //   1637: istore #52
    //   1639: iload #52
    //   1641: ifeq -> 1655
    //   1644: ldc_w ''
    //   1647: astore #55
    //   1649: iconst_0
    //   1650: istore #47
    //   1652: goto -> 1742
    //   1655: iload #4
    //   1657: invokestatic valueOf : (C)Ljava/lang/String;
    //   1660: astore #55
    //   1662: iconst_0
    //   1663: istore #47
    //   1665: iload #45
    //   1667: istore #51
    //   1669: iload #51
    //   1671: iconst_1
    //   1672: iadd
    //   1673: istore #51
    //   1675: iload #51
    //   1677: iload #46
    //   1679: if_icmpge -> 1742
    //   1682: aload #64
    //   1684: iload #51
    //   1686: faload
    //   1687: fconst_0
    //   1688: fcmpl
    //   1689: ifle -> 1695
    //   1692: goto -> 1742
    //   1695: new java/lang/StringBuilder
    //   1698: dup
    //   1699: invokespecial <init> : ()V
    //   1702: astore #66
    //   1704: aload #66
    //   1706: aload #55
    //   1708: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1711: pop
    //   1712: aload #66
    //   1714: aload #68
    //   1716: iload #51
    //   1718: caload
    //   1719: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1722: pop
    //   1723: aload #66
    //   1725: invokevirtual toString : ()Ljava/lang/String;
    //   1728: astore #55
    //   1730: aload #65
    //   1732: iload #51
    //   1734: iconst_1
    //   1735: bastore
    //   1736: iconst_1
    //   1737: istore #47
    //   1739: goto -> 1669
    //   1742: aload #63
    //   1744: aload #55
    //   1746: invokevirtual measureText : (Ljava/lang/String;)F
    //   1749: f2d
    //   1750: dstore #23
    //   1752: dload #23
    //   1754: invokestatic isNaN : (D)Z
    //   1757: pop
    //   1758: dload #23
    //   1760: dload #17
    //   1762: dmul
    //   1763: dstore #35
    //   1765: iload #53
    //   1767: iconst_1
    //   1768: ixor
    //   1769: ifeq -> 1799
    //   1772: aload #64
    //   1774: iload #45
    //   1776: faload
    //   1777: f2d
    //   1778: dstore #21
    //   1780: dload #21
    //   1782: invokestatic isNaN : (D)Z
    //   1785: pop
    //   1786: dload #21
    //   1788: dload #17
    //   1790: dmul
    //   1791: dload #35
    //   1793: dsub
    //   1794: dstore #21
    //   1796: goto -> 1799
    //   1799: iload #4
    //   1801: bipush #32
    //   1803: if_icmpne -> 1812
    //   1806: iconst_1
    //   1807: istore #51
    //   1809: goto -> 1815
    //   1812: iconst_0
    //   1813: istore #51
    //   1815: iload #51
    //   1817: ifeq -> 1827
    //   1820: dload #25
    //   1822: dstore #23
    //   1824: goto -> 1830
    //   1827: dconst_0
    //   1828: dstore #23
    //   1830: dload #23
    //   1832: dload #15
    //   1834: dadd
    //   1835: dload #35
    //   1837: dadd
    //   1838: dstore #37
    //   1840: iload #52
    //   1842: ifeq -> 1851
    //   1845: dconst_0
    //   1846: dstore #23
    //   1848: goto -> 1858
    //   1851: dload #21
    //   1853: dload #37
    //   1855: dadd
    //   1856: dstore #23
    //   1858: aload #59
    //   1860: dload #23
    //   1862: invokevirtual a : (D)D
    //   1865: dstore #39
    //   1867: aload #59
    //   1869: invokevirtual h : ()D
    //   1872: dstore #29
    //   1874: aload #59
    //   1876: invokevirtual e : ()D
    //   1879: dstore #41
    //   1881: aload #59
    //   1883: invokevirtual f : ()D
    //   1886: dstore #33
    //   1888: aload #59
    //   1890: invokevirtual g : ()D
    //   1893: dstore #27
    //   1895: iload #52
    //   1897: ifne -> 2433
    //   1900: iload #51
    //   1902: ifeq -> 1908
    //   1905: goto -> 2433
    //   1908: dload #31
    //   1910: invokestatic isNaN : (D)Z
    //   1913: pop
    //   1914: dload #31
    //   1916: invokestatic isNaN : (D)Z
    //   1919: pop
    //   1920: dload #35
    //   1922: dload #31
    //   1924: dmul
    //   1925: dstore #23
    //   1927: dload #31
    //   1929: invokestatic isNaN : (D)Z
    //   1932: pop
    //   1933: dload #13
    //   1935: dload #39
    //   1937: dload #41
    //   1939: dadd
    //   1940: dload #31
    //   1942: dmul
    //   1943: dadd
    //   1944: dload #37
    //   1946: dload #31
    //   1948: dmul
    //   1949: dsub
    //   1950: dstore #39
    //   1952: iload #48
    //   1954: ifeq -> 2265
    //   1957: dload #39
    //   1959: dload #23
    //   1961: dadd
    //   1962: dstore #37
    //   1964: dload #23
    //   1966: ldc2_w 2.0
    //   1969: ddiv
    //   1970: dstore #35
    //   1972: dload #39
    //   1974: dload #35
    //   1976: dadd
    //   1977: dstore #23
    //   1979: dload #23
    //   1981: dload #9
    //   1983: dcmpl
    //   1984: ifle -> 1990
    //   1987: goto -> 2433
    //   1990: dload #23
    //   1992: dload #11
    //   1994: dcmpg
    //   1995: ifge -> 2001
    //   1998: goto -> 2433
    //   2001: iload #49
    //   2003: ifeq -> 2020
    //   2006: aload #57
    //   2008: dload #23
    //   2010: d2f
    //   2011: aload_1
    //   2012: iconst_3
    //   2013: invokevirtual getMatrix : (FLandroid/graphics/Matrix;I)Z
    //   2016: pop
    //   2017: goto -> 2227
    //   2020: dload #39
    //   2022: dconst_0
    //   2023: dcmpg
    //   2024: ifge -> 2050
    //   2027: aload #57
    //   2029: fconst_0
    //   2030: aload #61
    //   2032: iconst_3
    //   2033: invokevirtual getMatrix : (FLandroid/graphics/Matrix;I)Z
    //   2036: pop
    //   2037: aload #61
    //   2039: dload #39
    //   2041: d2f
    //   2042: fconst_0
    //   2043: invokevirtual preTranslate : (FF)Z
    //   2046: pop
    //   2047: goto -> 2062
    //   2050: aload #57
    //   2052: dload #39
    //   2054: d2f
    //   2055: aload #61
    //   2057: iconst_1
    //   2058: invokevirtual getMatrix : (FLandroid/graphics/Matrix;I)Z
    //   2061: pop
    //   2062: aload #57
    //   2064: dload #23
    //   2066: d2f
    //   2067: aload_1
    //   2068: iconst_1
    //   2069: invokevirtual getMatrix : (FLandroid/graphics/Matrix;I)Z
    //   2072: pop
    //   2073: dload #5
    //   2075: dstore #23
    //   2077: dload #37
    //   2079: dload #5
    //   2081: dcmpl
    //   2082: ifle -> 2113
    //   2085: aload #57
    //   2087: dload #23
    //   2089: d2f
    //   2090: aload #58
    //   2092: iconst_3
    //   2093: invokevirtual getMatrix : (FLandroid/graphics/Matrix;I)Z
    //   2096: pop
    //   2097: aload #58
    //   2099: dload #37
    //   2101: dload #23
    //   2103: dsub
    //   2104: d2f
    //   2105: fconst_0
    //   2106: invokevirtual preTranslate : (FF)Z
    //   2109: pop
    //   2110: goto -> 2125
    //   2113: aload #57
    //   2115: dload #37
    //   2117: d2f
    //   2118: aload #58
    //   2120: iconst_1
    //   2121: invokevirtual getMatrix : (FLandroid/graphics/Matrix;I)Z
    //   2124: pop
    //   2125: aload #61
    //   2127: aload #54
    //   2129: invokevirtual getValues : ([F)V
    //   2132: aload #58
    //   2134: aload #60
    //   2136: invokevirtual getValues : ([F)V
    //   2139: aload #54
    //   2141: iconst_2
    //   2142: faload
    //   2143: f2d
    //   2144: dstore #23
    //   2146: aload #54
    //   2148: iconst_5
    //   2149: faload
    //   2150: f2d
    //   2151: dstore #37
    //   2153: aload #60
    //   2155: iconst_2
    //   2156: faload
    //   2157: f2d
    //   2158: dstore #39
    //   2160: aload #60
    //   2162: iconst_5
    //   2163: faload
    //   2164: f2d
    //   2165: dstore #41
    //   2167: dload #39
    //   2169: invokestatic isNaN : (D)Z
    //   2172: pop
    //   2173: dload #23
    //   2175: invokestatic isNaN : (D)Z
    //   2178: pop
    //   2179: dload #41
    //   2181: invokestatic isNaN : (D)Z
    //   2184: pop
    //   2185: dload #37
    //   2187: invokestatic isNaN : (D)Z
    //   2190: pop
    //   2191: dload #41
    //   2193: dload #37
    //   2195: dsub
    //   2196: dload #39
    //   2198: dload #23
    //   2200: dsub
    //   2201: invokestatic atan2 : (DD)D
    //   2204: dstore #23
    //   2206: dload #31
    //   2208: invokestatic isNaN : (D)Z
    //   2211: pop
    //   2212: aload_1
    //   2213: dload #23
    //   2215: ldc2_w 57.29577951308232
    //   2218: dmul
    //   2219: dload #31
    //   2221: dmul
    //   2222: d2f
    //   2223: invokevirtual preRotate : (F)Z
    //   2226: pop
    //   2227: aload_1
    //   2228: dload #35
    //   2230: dneg
    //   2231: d2f
    //   2232: dload #33
    //   2234: dload #7
    //   2236: dadd
    //   2237: d2f
    //   2238: invokevirtual preTranslate : (FF)Z
    //   2241: pop
    //   2242: aload_1
    //   2243: dload #19
    //   2245: d2f
    //   2246: iload #50
    //   2248: i2f
    //   2249: invokevirtual preScale : (FF)Z
    //   2252: pop
    //   2253: aload_1
    //   2254: fconst_0
    //   2255: dload #29
    //   2257: d2f
    //   2258: invokevirtual postTranslate : (FF)Z
    //   2261: pop
    //   2262: goto -> 2281
    //   2265: aload_1
    //   2266: dload #39
    //   2268: d2f
    //   2269: dload #29
    //   2271: dload #33
    //   2273: dadd
    //   2274: dload #7
    //   2276: dadd
    //   2277: d2f
    //   2278: invokevirtual setTranslate : (FF)V
    //   2281: aload_1
    //   2282: dload #27
    //   2284: d2f
    //   2285: invokevirtual preRotate : (F)Z
    //   2288: pop
    //   2289: iload #47
    //   2291: ifeq -> 2322
    //   2294: new android/graphics/Path
    //   2297: dup
    //   2298: invokespecial <init> : ()V
    //   2301: astore #63
    //   2303: aload_2
    //   2304: aload #55
    //   2306: iconst_0
    //   2307: aload #55
    //   2309: invokevirtual length : ()I
    //   2312: fconst_0
    //   2313: fconst_0
    //   2314: aload #63
    //   2316: invokevirtual getTextPath : (Ljava/lang/String;IIFFLandroid/graphics/Path;)V
    //   2319: goto -> 2333
    //   2322: aload #62
    //   2324: iload #4
    //   2326: aload #55
    //   2328: invokevirtual a : (CLjava/lang/String;)Landroid/graphics/Path;
    //   2331: astore #63
    //   2333: new android/graphics/RectF
    //   2336: dup
    //   2337: invokespecial <init> : ()V
    //   2340: astore #66
    //   2342: aload #63
    //   2344: aload #66
    //   2346: iconst_1
    //   2347: invokevirtual computeBounds : (Landroid/graphics/RectF;Z)V
    //   2350: aload #66
    //   2352: invokevirtual width : ()F
    //   2355: fconst_0
    //   2356: fcmpl
    //   2357: ifne -> 2417
    //   2360: aload_3
    //   2361: invokevirtual save : ()I
    //   2364: pop
    //   2365: aload_3
    //   2366: aload_1
    //   2367: invokevirtual concat : (Landroid/graphics/Matrix;)V
    //   2370: aload_0
    //   2371: astore #63
    //   2373: aload #63
    //   2375: getfield a1 : Ljava/util/ArrayList;
    //   2378: aload #55
    //   2380: invokevirtual add : (Ljava/lang/Object;)Z
    //   2383: pop
    //   2384: aload #63
    //   2386: getfield b1 : Ljava/util/ArrayList;
    //   2389: new android/graphics/Matrix
    //   2392: dup
    //   2393: aload_1
    //   2394: invokespecial <init> : (Landroid/graphics/Matrix;)V
    //   2397: invokevirtual add : (Ljava/lang/Object;)Z
    //   2400: pop
    //   2401: aload_3
    //   2402: aload #55
    //   2404: fconst_0
    //   2405: fconst_0
    //   2406: aload_2
    //   2407: invokevirtual drawText : (Ljava/lang/String;FFLandroid/graphics/Paint;)V
    //   2410: aload_3
    //   2411: invokevirtual restore : ()V
    //   2414: goto -> 2433
    //   2417: aload #63
    //   2419: aload_1
    //   2420: invokevirtual transform : (Landroid/graphics/Matrix;)V
    //   2423: aload #56
    //   2425: aload #63
    //   2427: invokevirtual addPath : (Landroid/graphics/Path;)V
    //   2430: goto -> 2433
    //   2433: iload #45
    //   2435: iconst_1
    //   2436: iadd
    //   2437: istore #45
    //   2439: aload_0
    //   2440: astore #55
    //   2442: aload_2
    //   2443: astore #63
    //   2445: goto -> 1618
    //   2448: aload #56
    //   2450: areturn
  }
  
  private StaticLayout a(TextPaint paramTextPaint, Layout.Alignment paramAlignment, boolean paramBoolean, SpannableString paramSpannableString, int paramInt) {
    return (Build.VERSION.SDK_INT < 23) ? new StaticLayout((CharSequence)paramSpannableString, paramTextPaint, paramInt, paramAlignment, 1.0F, 0.0F, paramBoolean) : StaticLayout.Builder.obtain((CharSequence)paramSpannableString, 0, paramSpannableString.length(), paramTextPaint, paramInt).setAlignment(paramAlignment).setLineSpacing(0.0F, 1.0F).setIncludePad(paramBoolean).setBreakStrategy(1).setHyphenationFrequency(1).build();
  }
  
  public static String a(String paramString) {
    String str = paramString;
    if (paramString != null) {
      if (paramString.length() == 0)
        return paramString; 
      Bidi bidi = new Bidi(paramString, -2);
      if (bidi.isLeftToRight())
        return paramString; 
      int k = bidi.getRunCount();
      byte[] arrayOfByte = new byte[k];
      Integer[] arrayOfInteger = new Integer[k];
      int j = 0;
      int i;
      for (i = 0; i < k; i++) {
        arrayOfByte[i] = (byte)bidi.getRunLevel(i);
        arrayOfInteger[i] = Integer.valueOf(i);
      } 
      Bidi.reorderVisually(arrayOfByte, 0, (Object[])arrayOfInteger, 0, k);
      StringBuilder stringBuilder = new StringBuilder();
      for (i = j; i < k; i++) {
        int n = arrayOfInteger[i].intValue();
        int m = bidi.getRunStart(n);
        j = bidi.getRunLimit(n);
        if ((arrayOfByte[n] & 0x1) != 0) {
          while (true) {
            if (--j >= m) {
              stringBuilder.append(paramString.charAt(j));
              continue;
            } 
            break;
          } 
        } else {
          stringBuilder.append(paramString, m, j);
        } 
      } 
      str = stringBuilder.toString();
    } 
    return str;
  }
  
  private void a(Paint paramPaint, h paramh) {
    if (Build.VERSION.SDK_INT >= 21) {
      boolean bool;
      StringBuilder stringBuilder;
      String str;
      double d1 = paramh.n;
      double d2 = paramh.a;
      double d3 = this.L;
      Double.isNaN(d3);
      paramPaint.setLetterSpacing((float)(d1 / d2 * d3));
      if (d1 == 0.0D && paramh.i == l0.c) {
        bool = true;
      } else {
        bool = false;
      } 
      if (bool) {
        stringBuilder = new StringBuilder();
        str = "'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'hlig', 'cala', ";
      } else {
        stringBuilder = new StringBuilder();
        str = "'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'liga' 0, 'clig' 0, 'dlig' 0, 'hlig' 0, 'cala' 0, ";
      } 
      stringBuilder.append(str);
      stringBuilder.append(paramh.g);
      paramPaint.setFontFeatureSettings(stringBuilder.toString());
      if (Build.VERSION.SDK_INT >= 26) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("'wght' ");
        stringBuilder.append(paramh.f);
        stringBuilder.append(paramh.h);
        paramPaint.setFontVariationSettings(stringBuilder.toString());
      } 
    } 
  }
  
  private void b(Paint paramPaint, h paramh) {
    int i;
    boolean bool;
    m0 m01 = paramh.e;
    m0 m02 = m0.d;
    int j = 0;
    if (m01 == m02 || paramh.f >= 550) {
      i = 1;
    } else {
      i = 0;
    } 
    if (paramh.c == k0.d) {
      bool = true;
    } else {
      bool = false;
    } 
    if (i && bool) {
      i = 3;
    } else if (i != 0) {
      i = 1;
    } else {
      i = j;
      if (bool)
        i = 2; 
    } 
    m02 = null;
    m0 m03 = null;
    j = paramh.f;
    String str = paramh.b;
    m01 = m03;
    if (str != null) {
      m01 = m03;
      if (str.length() > 0) {
        StringBuilder stringBuilder2;
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("fonts/");
        stringBuilder1.append(str);
        stringBuilder1.append(".otf");
        String str2 = stringBuilder1.toString();
        stringBuilder1 = new StringBuilder();
        stringBuilder1.append("fonts/");
        stringBuilder1.append(str);
        stringBuilder1.append(".ttf");
        String str1 = stringBuilder1.toString();
        if (Build.VERSION.SDK_INT >= 26) {
          Typeface.Builder builder = new Typeface.Builder(this.c1, str2);
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("'wght' ");
          stringBuilder.append(j);
          stringBuilder.append(paramh.h);
          builder.setFontVariationSettings(stringBuilder.toString());
          builder.setWeight(j);
          builder.setItalic(bool);
          Typeface typeface = builder.build();
          typeface1 = typeface;
          if (typeface == null) {
            Typeface.Builder builder1 = new Typeface.Builder(this.c1, str1);
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("'wght' ");
            stringBuilder2.append(j);
            stringBuilder2.append(paramh.h);
            builder1.setFontVariationSettings(stringBuilder2.toString());
            builder1.setWeight(j);
            builder1.setItalic(bool);
            Typeface typeface3 = builder1.build();
          } 
        } else {
          stringBuilder1 = stringBuilder2;
          try {
            Typeface typeface = Typeface.createFromAsset(this.c1, str2);
            typeface1 = typeface;
            typeface = Typeface.create(typeface, i);
            typeface1 = typeface;
          } catch (Exception exception) {
            try {
              Typeface typeface = Typeface.createFromAsset(this.c1, str1);
              typeface1 = typeface;
              typeface = Typeface.create(typeface, i);
              typeface1 = typeface;
            } catch (Exception exception1) {}
          } 
        } 
      } 
    } 
    Typeface typeface2 = typeface1;
    if (typeface1 == null)
      try {
        typeface2 = i.a().a(str, i, this.c1);
      } catch (Exception exception) {
        typeface2 = typeface1;
      }  
    Typeface typeface1 = typeface2;
    if (Build.VERSION.SDK_INT >= 28)
      typeface1 = Typeface.create(typeface2, j, bool); 
    paramPaint.setLinearText(true);
    paramPaint.setSubpixelText(true);
    paramPaint.setTypeface(typeface1);
    double d1 = paramh.a;
    double d2 = this.L;
    Double.isNaN(d2);
    paramPaint.setTextSize((float)(d1 * d2));
    if (Build.VERSION.SDK_INT >= 21)
      paramPaint.setLetterSpacing(0.0F); 
  }
  
  private void e(Canvas paramCanvas, Paint paramPaint) {
    Layout.Alignment alignment;
    j j = l();
    n();
    h h = j.a();
    TextPaint textPaint = new TextPaint(paramPaint);
    b((Paint)textPaint, h);
    a((Paint)textPaint, h);
    double d1 = j.b();
    int i = a.a[h.j.ordinal()];
    if (i != 2) {
      if (i != 3) {
        alignment = Layout.Alignment.ALIGN_NORMAL;
      } else {
        alignment = Layout.Alignment.ALIGN_OPPOSITE;
      } 
    } else {
      alignment = Layout.Alignment.ALIGN_CENTER;
    } 
    StaticLayout staticLayout = a(textPaint, alignment, true, new SpannableString(this.Y0), (int)w.a(this.M0, paramCanvas.getWidth(), 0.0D, this.L, d1));
    i = staticLayout.getLineAscent(0);
    float f1 = (float)j.a(0.0D);
    d1 = j.h();
    double d2 = i;
    Double.isNaN(d2);
    float f2 = (float)(d1 + d2);
    m();
    paramCanvas.save();
    paramCanvas.translate(f1, f2);
    staticLayout.draw(paramCanvas);
    paramCanvas.restore();
  }
  
  private void s() {
    for (ViewParent viewParent = getParent(); viewParent != null; viewParent = viewParent.getParent()) {
      if (viewParent.getClass() == i0.class) {
        this.Z0 = (i0)viewParent;
        return;
      } 
      if (!(viewParent instanceof u0))
        return; 
    } 
  }
  
  double a(Paint paramPaint) {
    View view;
    if (!Double.isNaN(this.W0))
      return this.W0; 
    String str = this.Y0;
    double d = 0.0D;
    if (str == null) {
      int i = 0;
      while (i < getChildCount()) {
        view = getChildAt(i);
        double d1 = d;
        if (view instanceof u0)
          d1 = d + ((u0)view).a(paramPaint); 
        i++;
        d = d1;
      } 
      this.W0 = d;
      return d;
    } 
    if (view.length() == 0) {
      this.W0 = 0.0D;
      return 0.0D;
    } 
    h h = l().a();
    b(paramPaint, h);
    a(paramPaint, h);
    this.W0 = paramPaint.measureText((String)view);
    return this.W0;
  }
  
  int a(float[] paramArrayOffloat) {
    if (this.Y0 == null)
      return super.a(paramArrayOffloat); 
    if (this.b0 != null && this.C) {
      if (!this.D)
        return -1; 
      float[] arrayOfFloat = new float[2];
      this.A.mapPoints(arrayOfFloat, paramArrayOffloat);
      this.B.mapPoints(arrayOfFloat);
      int i = Math.round(arrayOfFloat[0]);
      int j = Math.round(arrayOfFloat[1]);
      i();
      Region region = this.l0;
      if (region == null || !region.contains(i, j)) {
        region = this.n0;
        if (region != null) {
          if (!region.contains(i, j))
            return -1; 
        } else {
          return -1;
        } 
      } 
      return (getClipPath() != null && !this.o0.contains(i, j)) ? -1 : getId();
    } 
    return -1;
  }
  
  void a(Canvas paramCanvas, Paint paramPaint, float paramFloat) {
    if (this.Y0 != null) {
      c0 c0 = this.M0;
      if (c0 != null && c0.a != 0.0D) {
        if (a(paramPaint, this.C0 * paramFloat))
          e(paramCanvas, paramPaint); 
        if (b(paramPaint, paramFloat * this.w0)) {
          e(paramCanvas, paramPaint);
          return;
        } 
      } else {
        int i = this.a1.size();
        if (i > 0) {
          b(paramPaint, l().a());
          int j;
          for (j = 0; j < i; j++) {
            String str = this.a1.get(j);
            Matrix matrix = this.b1.get(j);
            paramCanvas.save();
            paramCanvas.concat(matrix);
            paramCanvas.drawText(str, 0.0F, 0.0F, paramPaint);
            paramCanvas.restore();
          } 
        } 
        e(paramCanvas, paramPaint, paramFloat);
        return;
      } 
    } else {
      a(paramCanvas, paramPaint);
      d(paramCanvas, paramPaint, paramFloat);
    } 
  }
  
  Path c(Canvas paramCanvas, Paint paramPaint) {
    Path path = this.X0;
    if (path != null)
      return path; 
    if (this.Y0 == null) {
      this.X0 = d(paramCanvas, paramPaint);
      return this.X0;
    } 
    s();
    n();
    this.X0 = a(a(this.Y0), paramPaint, paramCanvas);
    m();
    return this.X0;
  }
  
  void e() {
    this.X0 = null;
    super.e();
  }
  
  public void invalidate() {
    this.X0 = null;
    super.invalidate();
  }
  
  @com.facebook.react.uimanager.e1.a(name = "content")
  public void setContent(String paramString) {
    this.Y0 = paramString;
    invalidate();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/horcrux/svg/h0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */