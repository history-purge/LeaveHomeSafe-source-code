package com.facebook.react.views.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.facebook.react.uimanager.i0;
import com.facebook.yoga.g;
import java.util.Arrays;
import java.util.Locale;

public class d extends Drawable {
  private i0 a;
  
  private i0 b;
  
  private i0 c;
  
  private c d;
  
  private PathEffect e;
  
  private Path f;
  
  private Path g;
  
  private Path h;
  
  private Path i;
  
  private Path j;
  
  private RectF k;
  
  private RectF l;
  
  private RectF m;
  
  private RectF n;
  
  private PointF o;
  
  private PointF p;
  
  private PointF q;
  
  private PointF r;
  
  private boolean s = false;
  
  private float t = Float.NaN;
  
  private final Paint u = new Paint(1);
  
  private int v = 0;
  
  private int w = 255;
  
  private float[] x;
  
  private final Context y;
  
  private int z;
  
  public d(Context paramContext) {
    this.y = paramContext;
  }
  
  private static int a(float paramFloat1, float paramFloat2) {
    int i = (int)paramFloat2;
    return (int)paramFloat1 << 24 & 0xFF000000 | i & 0xFFFFFF;
  }
  
  private static int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8) {
    byte b1;
    byte b2;
    int j = -1;
    if (paramInt1 > 0) {
      i = paramInt5;
    } else {
      i = -1;
    } 
    if (paramInt2 > 0) {
      b1 = paramInt6;
    } else {
      b1 = -1;
    } 
    if (paramInt3 > 0) {
      b2 = paramInt7;
    } else {
      b2 = -1;
    } 
    if (paramInt4 > 0)
      j = paramInt8; 
    int i = j & i & b1 & b2;
    if (paramInt1 <= 0)
      paramInt5 = 0; 
    if (paramInt2 <= 0)
      paramInt6 = 0; 
    if (paramInt3 <= 0)
      paramInt7 = 0; 
    if (paramInt4 <= 0)
      paramInt8 = 0; 
    return (i == (paramInt5 | paramInt6 | paramInt7 | paramInt8)) ? i : 0;
  }
  
  private static void a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, PointF paramPointF) {
    double d2 = (paramDouble1 + paramDouble3) / 2.0D;
    double d1 = (paramDouble2 + paramDouble4) / 2.0D;
    paramDouble5 -= d2;
    paramDouble6 -= d1;
    paramDouble3 = Math.abs(paramDouble3 - paramDouble1) / 2.0D;
    paramDouble4 = Math.abs(paramDouble4 - paramDouble2) / 2.0D;
    paramDouble1 = (paramDouble8 - d1 - paramDouble6) / (paramDouble7 - d2 - paramDouble5);
    paramDouble2 = paramDouble6 - paramDouble5 * paramDouble1;
    paramDouble5 = paramDouble4 * paramDouble4;
    paramDouble6 = paramDouble3 * paramDouble3;
    paramDouble4 = paramDouble5 + paramDouble6 * paramDouble1 * paramDouble1;
    paramDouble3 = paramDouble3 * 2.0D * paramDouble3 * paramDouble2 * paramDouble1;
    paramDouble5 = -(paramDouble6 * (paramDouble2 * paramDouble2 - paramDouble5)) / paramDouble4;
    paramDouble4 *= 2.0D;
    paramDouble5 = Math.sqrt(paramDouble5 + Math.pow(paramDouble3 / paramDouble4, 2.0D));
    paramDouble3 = -paramDouble3 / paramDouble4 - paramDouble5;
    paramDouble4 = paramDouble3 + d2;
    paramDouble1 = paramDouble1 * paramDouble3 + paramDouble2 + d1;
    if (!Double.isNaN(paramDouble4) && !Double.isNaN(paramDouble1)) {
      paramPointF.x = (float)paramDouble4;
      paramPointF.y = (float)paramDouble1;
    } 
  }
  
  private void a(Canvas paramCanvas) {
    // Byte code:
    //   0: aload_0
    //   1: getfield u : Landroid/graphics/Paint;
    //   4: getstatic android/graphics/Paint$Style.FILL : Landroid/graphics/Paint$Style;
    //   7: invokevirtual setStyle : (Landroid/graphics/Paint$Style;)V
    //   10: aload_0
    //   11: getfield v : I
    //   14: aload_0
    //   15: getfield w : I
    //   18: invokestatic a : (II)I
    //   21: istore #7
    //   23: iload #7
    //   25: invokestatic alpha : (I)I
    //   28: ifeq -> 55
    //   31: aload_0
    //   32: getfield u : Landroid/graphics/Paint;
    //   35: iload #7
    //   37: invokevirtual setColor : (I)V
    //   40: aload_1
    //   41: aload_0
    //   42: invokevirtual getBounds : ()Landroid/graphics/Rect;
    //   45: aload_0
    //   46: getfield u : Landroid/graphics/Paint;
    //   49: invokevirtual drawRect : (Landroid/graphics/Rect;Landroid/graphics/Paint;)V
    //   52: goto -> 55
    //   55: aload_0
    //   56: invokevirtual b : ()Landroid/graphics/RectF;
    //   59: astore #23
    //   61: aload #23
    //   63: getfield left : F
    //   66: invokestatic round : (F)I
    //   69: istore #13
    //   71: aload #23
    //   73: getfield top : F
    //   76: invokestatic round : (F)I
    //   79: istore #16
    //   81: aload #23
    //   83: getfield right : F
    //   86: invokestatic round : (F)I
    //   89: istore #14
    //   91: aload #23
    //   93: getfield bottom : F
    //   96: invokestatic round : (F)I
    //   99: istore #15
    //   101: iload #13
    //   103: ifgt -> 121
    //   106: iload #14
    //   108: ifgt -> 121
    //   111: iload #16
    //   113: ifgt -> 121
    //   116: iload #15
    //   118: ifle -> 582
    //   121: aload_0
    //   122: invokevirtual getBounds : ()Landroid/graphics/Rect;
    //   125: astore #23
    //   127: aload_0
    //   128: iconst_0
    //   129: invokespecial d : (I)I
    //   132: istore #7
    //   134: aload_0
    //   135: iconst_1
    //   136: invokespecial d : (I)I
    //   139: istore #18
    //   141: aload_0
    //   142: iconst_2
    //   143: invokespecial d : (I)I
    //   146: istore #11
    //   148: aload_0
    //   149: iconst_3
    //   150: invokespecial d : (I)I
    //   153: istore #17
    //   155: iload #7
    //   157: istore #9
    //   159: getstatic android/os/Build$VERSION.SDK_INT : I
    //   162: bipush #17
    //   164: if_icmplt -> 379
    //   167: aload_0
    //   168: invokevirtual e : ()I
    //   171: iconst_1
    //   172: if_icmpne -> 181
    //   175: iconst_1
    //   176: istore #12
    //   178: goto -> 184
    //   181: iconst_0
    //   182: istore #12
    //   184: aload_0
    //   185: iconst_4
    //   186: invokespecial d : (I)I
    //   189: istore #10
    //   191: aload_0
    //   192: iconst_5
    //   193: invokespecial d : (I)I
    //   196: istore #8
    //   198: invokestatic a : ()Lcom/facebook/react/modules/i18nmanager/a;
    //   201: aload_0
    //   202: getfield y : Landroid/content/Context;
    //   205: invokevirtual a : (Landroid/content/Context;)Z
    //   208: ifeq -> 276
    //   211: aload_0
    //   212: iconst_4
    //   213: invokespecial e : (I)Z
    //   216: ifne -> 222
    //   219: goto -> 226
    //   222: iload #10
    //   224: istore #7
    //   226: aload_0
    //   227: iconst_5
    //   228: invokespecial e : (I)Z
    //   231: ifne -> 241
    //   234: iload #11
    //   236: istore #8
    //   238: goto -> 241
    //   241: iload #12
    //   243: ifeq -> 253
    //   246: iload #8
    //   248: istore #9
    //   250: goto -> 257
    //   253: iload #7
    //   255: istore #9
    //   257: iload #12
    //   259: ifeq -> 265
    //   262: goto -> 269
    //   265: iload #8
    //   267: istore #7
    //   269: iload #9
    //   271: istore #8
    //   273: goto -> 387
    //   276: iload #12
    //   278: ifeq -> 288
    //   281: iload #8
    //   283: istore #9
    //   285: goto -> 292
    //   288: iload #10
    //   290: istore #9
    //   292: iload #12
    //   294: ifeq -> 304
    //   297: iload #10
    //   299: istore #8
    //   301: goto -> 304
    //   304: aload_0
    //   305: iconst_4
    //   306: invokespecial e : (I)Z
    //   309: istore #20
    //   311: aload_0
    //   312: iconst_5
    //   313: invokespecial e : (I)Z
    //   316: istore #21
    //   318: iload #12
    //   320: ifeq -> 330
    //   323: iload #21
    //   325: istore #22
    //   327: goto -> 334
    //   330: iload #20
    //   332: istore #22
    //   334: iload #12
    //   336: ifeq -> 342
    //   339: goto -> 346
    //   342: iload #21
    //   344: istore #20
    //   346: iload #22
    //   348: ifeq -> 355
    //   351: iload #9
    //   353: istore #7
    //   355: iload #7
    //   357: istore #9
    //   359: iload #20
    //   361: ifeq -> 379
    //   364: iload #8
    //   366: istore #9
    //   368: iload #7
    //   370: istore #8
    //   372: iload #9
    //   374: istore #7
    //   376: goto -> 387
    //   379: iload #9
    //   381: istore #8
    //   383: iload #11
    //   385: istore #7
    //   387: aload #23
    //   389: getfield left : I
    //   392: istore #10
    //   394: aload #23
    //   396: getfield top : I
    //   399: istore #9
    //   401: iload #13
    //   403: iload #16
    //   405: iload #14
    //   407: iload #15
    //   409: iload #8
    //   411: iload #18
    //   413: iload #7
    //   415: iload #17
    //   417: invokestatic a : (IIIIIIII)I
    //   420: istore #11
    //   422: iload #11
    //   424: ifeq -> 583
    //   427: iload #11
    //   429: invokestatic alpha : (I)I
    //   432: ifeq -> 582
    //   435: aload #23
    //   437: getfield right : I
    //   440: istore #7
    //   442: aload #23
    //   444: getfield bottom : I
    //   447: istore #8
    //   449: aload_0
    //   450: getfield u : Landroid/graphics/Paint;
    //   453: iload #11
    //   455: invokevirtual setColor : (I)V
    //   458: iload #13
    //   460: ifle -> 489
    //   463: aload_1
    //   464: iload #10
    //   466: i2f
    //   467: iload #9
    //   469: i2f
    //   470: iload #10
    //   472: iload #13
    //   474: iadd
    //   475: i2f
    //   476: iload #8
    //   478: iload #15
    //   480: isub
    //   481: i2f
    //   482: aload_0
    //   483: getfield u : Landroid/graphics/Paint;
    //   486: invokevirtual drawRect : (FFFFLandroid/graphics/Paint;)V
    //   489: iload #16
    //   491: ifle -> 520
    //   494: aload_1
    //   495: iload #10
    //   497: iload #13
    //   499: iadd
    //   500: i2f
    //   501: iload #9
    //   503: i2f
    //   504: iload #7
    //   506: i2f
    //   507: iload #9
    //   509: iload #16
    //   511: iadd
    //   512: i2f
    //   513: aload_0
    //   514: getfield u : Landroid/graphics/Paint;
    //   517: invokevirtual drawRect : (FFFFLandroid/graphics/Paint;)V
    //   520: iload #14
    //   522: ifle -> 551
    //   525: aload_1
    //   526: iload #7
    //   528: iload #14
    //   530: isub
    //   531: i2f
    //   532: iload #9
    //   534: iload #16
    //   536: iadd
    //   537: i2f
    //   538: iload #7
    //   540: i2f
    //   541: iload #8
    //   543: i2f
    //   544: aload_0
    //   545: getfield u : Landroid/graphics/Paint;
    //   548: invokevirtual drawRect : (FFFFLandroid/graphics/Paint;)V
    //   551: iload #15
    //   553: ifle -> 582
    //   556: aload_1
    //   557: iload #10
    //   559: i2f
    //   560: iload #8
    //   562: iload #15
    //   564: isub
    //   565: i2f
    //   566: iload #7
    //   568: iload #14
    //   570: isub
    //   571: i2f
    //   572: iload #8
    //   574: i2f
    //   575: aload_0
    //   576: getfield u : Landroid/graphics/Paint;
    //   579: invokevirtual drawRect : (FFFFLandroid/graphics/Paint;)V
    //   582: return
    //   583: aload_0
    //   584: getfield u : Landroid/graphics/Paint;
    //   587: iconst_0
    //   588: invokevirtual setAntiAlias : (Z)V
    //   591: aload #23
    //   593: invokevirtual width : ()I
    //   596: istore #11
    //   598: aload #23
    //   600: invokevirtual height : ()I
    //   603: istore #12
    //   605: iload #13
    //   607: ifle -> 669
    //   610: iload #10
    //   612: i2f
    //   613: fstore_2
    //   614: iload #9
    //   616: i2f
    //   617: fstore_3
    //   618: iload #10
    //   620: iload #13
    //   622: iadd
    //   623: i2f
    //   624: fstore #4
    //   626: iload #9
    //   628: iload #16
    //   630: iadd
    //   631: i2f
    //   632: fstore #5
    //   634: iload #9
    //   636: iload #12
    //   638: iadd
    //   639: istore #19
    //   641: aload_0
    //   642: aload_1
    //   643: iload #8
    //   645: fload_2
    //   646: fload_3
    //   647: fload #4
    //   649: fload #5
    //   651: fload #4
    //   653: iload #19
    //   655: iload #15
    //   657: isub
    //   658: i2f
    //   659: fload_2
    //   660: iload #19
    //   662: i2f
    //   663: invokespecial a : (Landroid/graphics/Canvas;IFFFFFFFF)V
    //   666: goto -> 669
    //   669: iload #16
    //   671: ifle -> 730
    //   674: iload #10
    //   676: i2f
    //   677: fstore_2
    //   678: iload #9
    //   680: i2f
    //   681: fstore_3
    //   682: iload #10
    //   684: iload #13
    //   686: iadd
    //   687: i2f
    //   688: fstore #4
    //   690: iload #9
    //   692: iload #16
    //   694: iadd
    //   695: i2f
    //   696: fstore #5
    //   698: iload #10
    //   700: iload #11
    //   702: iadd
    //   703: istore #8
    //   705: aload_0
    //   706: aload_1
    //   707: iload #18
    //   709: fload_2
    //   710: fload_3
    //   711: fload #4
    //   713: fload #5
    //   715: iload #8
    //   717: iload #14
    //   719: isub
    //   720: i2f
    //   721: fload #5
    //   723: iload #8
    //   725: i2f
    //   726: fload_3
    //   727: invokespecial a : (Landroid/graphics/Canvas;IFFFFFFFF)V
    //   730: iload #14
    //   732: ifle -> 798
    //   735: iload #10
    //   737: iload #11
    //   739: iadd
    //   740: istore #8
    //   742: iload #8
    //   744: i2f
    //   745: fstore_2
    //   746: iload #9
    //   748: i2f
    //   749: fstore_3
    //   750: iload #9
    //   752: iload #12
    //   754: iadd
    //   755: istore #18
    //   757: iload #18
    //   759: i2f
    //   760: fstore #4
    //   762: iload #8
    //   764: iload #14
    //   766: isub
    //   767: i2f
    //   768: fstore #5
    //   770: aload_0
    //   771: aload_1
    //   772: iload #7
    //   774: fload_2
    //   775: fload_3
    //   776: fload_2
    //   777: fload #4
    //   779: fload #5
    //   781: iload #18
    //   783: iload #15
    //   785: isub
    //   786: i2f
    //   787: fload #5
    //   789: iload #9
    //   791: iload #16
    //   793: iadd
    //   794: i2f
    //   795: invokespecial a : (Landroid/graphics/Canvas;IFFFFFFFF)V
    //   798: iload #15
    //   800: ifle -> 873
    //   803: iload #10
    //   805: i2f
    //   806: fstore_2
    //   807: iload #9
    //   809: iload #12
    //   811: iadd
    //   812: istore #7
    //   814: iload #7
    //   816: i2f
    //   817: fstore_3
    //   818: iload #10
    //   820: iload #11
    //   822: iadd
    //   823: istore #8
    //   825: iload #8
    //   827: i2f
    //   828: fstore #4
    //   830: iload #8
    //   832: iload #14
    //   834: isub
    //   835: i2f
    //   836: fstore #5
    //   838: iload #7
    //   840: iload #15
    //   842: isub
    //   843: i2f
    //   844: fstore #6
    //   846: aload_0
    //   847: aload_1
    //   848: iload #17
    //   850: fload_2
    //   851: fload_3
    //   852: fload #4
    //   854: fload_3
    //   855: fload #5
    //   857: fload #6
    //   859: iload #10
    //   861: iload #13
    //   863: iadd
    //   864: i2f
    //   865: fload #6
    //   867: invokespecial a : (Landroid/graphics/Canvas;IFFFFFFFF)V
    //   870: goto -> 873
    //   873: aload_0
    //   874: getfield u : Landroid/graphics/Paint;
    //   877: iconst_1
    //   878: invokevirtual setAntiAlias : (Z)V
    //   881: return
  }
  
  private void a(Canvas paramCanvas, int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8) {
    if (paramInt == 0)
      return; 
    if (this.i == null)
      this.i = new Path(); 
    this.u.setColor(paramInt);
    this.i.reset();
    this.i.moveTo(paramFloat1, paramFloat2);
    this.i.lineTo(paramFloat3, paramFloat4);
    this.i.lineTo(paramFloat5, paramFloat6);
    this.i.lineTo(paramFloat7, paramFloat8);
    this.i.lineTo(paramFloat1, paramFloat2);
    paramCanvas.drawPath(this.i, this.u);
  }
  
  private void b(int paramInt, float paramFloat) {
    if (this.c == null)
      this.c = new i0(255.0F); 
    if (!com.facebook.react.uimanager.d.a(this.c.b(paramInt), paramFloat)) {
      this.c.a(paramInt, paramFloat);
      invalidateSelf();
    } 
  }
  
  private void b(Canvas paramCanvas) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial g : ()V
    //   4: aload_1
    //   5: invokevirtual save : ()I
    //   8: pop
    //   9: aload_0
    //   10: getfield v : I
    //   13: aload_0
    //   14: getfield w : I
    //   17: invokestatic a : (II)I
    //   20: istore #8
    //   22: iload #8
    //   24: invokestatic alpha : (I)I
    //   27: ifeq -> 61
    //   30: aload_0
    //   31: getfield u : Landroid/graphics/Paint;
    //   34: iload #8
    //   36: invokevirtual setColor : (I)V
    //   39: aload_0
    //   40: getfield u : Landroid/graphics/Paint;
    //   43: getstatic android/graphics/Paint$Style.FILL : Landroid/graphics/Paint$Style;
    //   46: invokevirtual setStyle : (Landroid/graphics/Paint$Style;)V
    //   49: aload_1
    //   50: aload_0
    //   51: getfield f : Landroid/graphics/Path;
    //   54: aload_0
    //   55: getfield u : Landroid/graphics/Paint;
    //   58: invokevirtual drawPath : (Landroid/graphics/Path;Landroid/graphics/Paint;)V
    //   61: aload_0
    //   62: invokevirtual b : ()Landroid/graphics/RectF;
    //   65: astore #19
    //   67: iconst_0
    //   68: istore #13
    //   70: aload_0
    //   71: iconst_0
    //   72: invokespecial d : (I)I
    //   75: istore #8
    //   77: aload_0
    //   78: iconst_1
    //   79: invokespecial d : (I)I
    //   82: istore #14
    //   84: aload_0
    //   85: iconst_2
    //   86: invokespecial d : (I)I
    //   89: istore #12
    //   91: aload_0
    //   92: iconst_3
    //   93: invokespecial d : (I)I
    //   96: istore #15
    //   98: aload #19
    //   100: getfield top : F
    //   103: fconst_0
    //   104: fcmpl
    //   105: ifgt -> 138
    //   108: aload #19
    //   110: getfield bottom : F
    //   113: fconst_0
    //   114: fcmpl
    //   115: ifgt -> 138
    //   118: aload #19
    //   120: getfield left : F
    //   123: fconst_0
    //   124: fcmpl
    //   125: ifgt -> 138
    //   128: aload #19
    //   130: getfield right : F
    //   133: fconst_0
    //   134: fcmpl
    //   135: ifle -> 809
    //   138: aload_0
    //   139: invokevirtual d : ()F
    //   142: fstore_2
    //   143: aload_0
    //   144: bipush #8
    //   146: invokespecial d : (I)I
    //   149: istore #9
    //   151: aload #19
    //   153: getfield top : F
    //   156: fload_2
    //   157: fcmpl
    //   158: ifne -> 274
    //   161: aload #19
    //   163: getfield bottom : F
    //   166: fload_2
    //   167: fcmpl
    //   168: ifne -> 274
    //   171: aload #19
    //   173: getfield left : F
    //   176: fload_2
    //   177: fcmpl
    //   178: ifne -> 274
    //   181: aload #19
    //   183: getfield right : F
    //   186: fload_2
    //   187: fcmpl
    //   188: ifne -> 274
    //   191: iload #8
    //   193: iload #9
    //   195: if_icmpne -> 274
    //   198: iload #14
    //   200: iload #9
    //   202: if_icmpne -> 274
    //   205: iload #12
    //   207: iload #9
    //   209: if_icmpne -> 274
    //   212: iload #15
    //   214: iload #9
    //   216: if_icmpne -> 274
    //   219: fload_2
    //   220: fconst_0
    //   221: fcmpl
    //   222: ifle -> 809
    //   225: aload_0
    //   226: getfield u : Landroid/graphics/Paint;
    //   229: iload #9
    //   231: aload_0
    //   232: getfield w : I
    //   235: invokestatic a : (II)I
    //   238: invokevirtual setColor : (I)V
    //   241: aload_0
    //   242: getfield u : Landroid/graphics/Paint;
    //   245: getstatic android/graphics/Paint$Style.STROKE : Landroid/graphics/Paint$Style;
    //   248: invokevirtual setStyle : (Landroid/graphics/Paint$Style;)V
    //   251: aload_0
    //   252: getfield u : Landroid/graphics/Paint;
    //   255: fload_2
    //   256: invokevirtual setStrokeWidth : (F)V
    //   259: aload_1
    //   260: aload_0
    //   261: getfield j : Landroid/graphics/Path;
    //   264: aload_0
    //   265: getfield u : Landroid/graphics/Paint;
    //   268: invokevirtual drawPath : (Landroid/graphics/Path;Landroid/graphics/Paint;)V
    //   271: goto -> 809
    //   274: aload_0
    //   275: getfield u : Landroid/graphics/Paint;
    //   278: getstatic android/graphics/Paint$Style.FILL : Landroid/graphics/Paint$Style;
    //   281: invokevirtual setStyle : (Landroid/graphics/Paint$Style;)V
    //   284: aload_1
    //   285: aload_0
    //   286: getfield g : Landroid/graphics/Path;
    //   289: getstatic android/graphics/Region$Op.INTERSECT : Landroid/graphics/Region$Op;
    //   292: invokevirtual clipPath : (Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z
    //   295: pop
    //   296: aload_1
    //   297: aload_0
    //   298: getfield f : Landroid/graphics/Path;
    //   301: getstatic android/graphics/Region$Op.DIFFERENCE : Landroid/graphics/Region$Op;
    //   304: invokevirtual clipPath : (Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z
    //   307: pop
    //   308: iload #8
    //   310: istore #10
    //   312: getstatic android/os/Build$VERSION.SDK_INT : I
    //   315: bipush #17
    //   317: if_icmplt -> 518
    //   320: aload_0
    //   321: invokevirtual e : ()I
    //   324: iconst_1
    //   325: if_icmpne -> 331
    //   328: iconst_1
    //   329: istore #13
    //   331: aload_0
    //   332: iconst_4
    //   333: invokespecial d : (I)I
    //   336: istore #11
    //   338: aload_0
    //   339: iconst_5
    //   340: invokespecial d : (I)I
    //   343: istore #9
    //   345: invokestatic a : ()Lcom/facebook/react/modules/i18nmanager/a;
    //   348: aload_0
    //   349: getfield y : Landroid/content/Context;
    //   352: invokevirtual a : (Landroid/content/Context;)Z
    //   355: ifeq -> 419
    //   358: aload_0
    //   359: iconst_4
    //   360: invokespecial e : (I)Z
    //   363: ifne -> 369
    //   366: goto -> 373
    //   369: iload #11
    //   371: istore #8
    //   373: aload_0
    //   374: iconst_5
    //   375: invokespecial e : (I)Z
    //   378: ifne -> 388
    //   381: iload #12
    //   383: istore #9
    //   385: goto -> 388
    //   388: iload #13
    //   390: ifeq -> 400
    //   393: iload #9
    //   395: istore #10
    //   397: goto -> 404
    //   400: iload #8
    //   402: istore #10
    //   404: iload #13
    //   406: ifeq -> 412
    //   409: goto -> 416
    //   412: iload #9
    //   414: istore #8
    //   416: goto -> 522
    //   419: iload #13
    //   421: ifeq -> 431
    //   424: iload #9
    //   426: istore #10
    //   428: goto -> 435
    //   431: iload #11
    //   433: istore #10
    //   435: iload #13
    //   437: ifeq -> 447
    //   440: iload #11
    //   442: istore #9
    //   444: goto -> 447
    //   447: aload_0
    //   448: iconst_4
    //   449: invokespecial e : (I)Z
    //   452: istore #16
    //   454: aload_0
    //   455: iconst_5
    //   456: invokespecial e : (I)Z
    //   459: istore #17
    //   461: iload #13
    //   463: ifeq -> 473
    //   466: iload #17
    //   468: istore #18
    //   470: goto -> 477
    //   473: iload #16
    //   475: istore #18
    //   477: iload #13
    //   479: ifeq -> 485
    //   482: goto -> 489
    //   485: iload #17
    //   487: istore #16
    //   489: iload #18
    //   491: ifeq -> 498
    //   494: iload #10
    //   496: istore #8
    //   498: iload #8
    //   500: istore #10
    //   502: iload #16
    //   504: ifeq -> 518
    //   507: iload #8
    //   509: istore #10
    //   511: iload #9
    //   513: istore #8
    //   515: goto -> 522
    //   518: iload #12
    //   520: istore #8
    //   522: aload_0
    //   523: getfield l : Landroid/graphics/RectF;
    //   526: astore #20
    //   528: aload #20
    //   530: getfield left : F
    //   533: fstore_2
    //   534: aload #20
    //   536: getfield right : F
    //   539: fstore #4
    //   541: aload #20
    //   543: getfield top : F
    //   546: fstore #5
    //   548: aload #20
    //   550: getfield bottom : F
    //   553: fstore_3
    //   554: aload #19
    //   556: getfield left : F
    //   559: fconst_0
    //   560: fcmpl
    //   561: ifle -> 619
    //   564: aload_0
    //   565: getfield o : Landroid/graphics/PointF;
    //   568: astore #20
    //   570: aload #20
    //   572: getfield x : F
    //   575: fstore #6
    //   577: aload #20
    //   579: getfield y : F
    //   582: fstore #7
    //   584: aload_0
    //   585: getfield r : Landroid/graphics/PointF;
    //   588: astore #20
    //   590: aload_0
    //   591: aload_1
    //   592: iload #10
    //   594: fload_2
    //   595: fload #5
    //   597: fload #6
    //   599: fload #7
    //   601: aload #20
    //   603: getfield x : F
    //   606: aload #20
    //   608: getfield y : F
    //   611: fload_2
    //   612: fload_3
    //   613: invokespecial a : (Landroid/graphics/Canvas;IFFFFFFFF)V
    //   616: goto -> 619
    //   619: aload #19
    //   621: getfield top : F
    //   624: fconst_0
    //   625: fcmpl
    //   626: ifle -> 683
    //   629: aload_0
    //   630: getfield o : Landroid/graphics/PointF;
    //   633: astore #20
    //   635: aload #20
    //   637: getfield x : F
    //   640: fstore #6
    //   642: aload #20
    //   644: getfield y : F
    //   647: fstore #7
    //   649: aload_0
    //   650: getfield p : Landroid/graphics/PointF;
    //   653: astore #20
    //   655: aload_0
    //   656: aload_1
    //   657: iload #14
    //   659: fload_2
    //   660: fload #5
    //   662: fload #6
    //   664: fload #7
    //   666: aload #20
    //   668: getfield x : F
    //   671: aload #20
    //   673: getfield y : F
    //   676: fload #4
    //   678: fload #5
    //   680: invokespecial a : (Landroid/graphics/Canvas;IFFFFFFFF)V
    //   683: aload #19
    //   685: getfield right : F
    //   688: fconst_0
    //   689: fcmpl
    //   690: ifle -> 747
    //   693: aload_0
    //   694: getfield p : Landroid/graphics/PointF;
    //   697: astore #20
    //   699: aload #20
    //   701: getfield x : F
    //   704: fstore #6
    //   706: aload #20
    //   708: getfield y : F
    //   711: fstore #7
    //   713: aload_0
    //   714: getfield q : Landroid/graphics/PointF;
    //   717: astore #20
    //   719: aload_0
    //   720: aload_1
    //   721: iload #8
    //   723: fload #4
    //   725: fload #5
    //   727: fload #6
    //   729: fload #7
    //   731: aload #20
    //   733: getfield x : F
    //   736: aload #20
    //   738: getfield y : F
    //   741: fload #4
    //   743: fload_3
    //   744: invokespecial a : (Landroid/graphics/Canvas;IFFFFFFFF)V
    //   747: aload #19
    //   749: getfield bottom : F
    //   752: fconst_0
    //   753: fcmpl
    //   754: ifle -> 809
    //   757: aload_0
    //   758: getfield r : Landroid/graphics/PointF;
    //   761: astore #19
    //   763: aload #19
    //   765: getfield x : F
    //   768: fstore #5
    //   770: aload #19
    //   772: getfield y : F
    //   775: fstore #6
    //   777: aload_0
    //   778: getfield q : Landroid/graphics/PointF;
    //   781: astore #19
    //   783: aload_0
    //   784: aload_1
    //   785: iload #15
    //   787: fload_2
    //   788: fload_3
    //   789: fload #5
    //   791: fload #6
    //   793: aload #19
    //   795: getfield x : F
    //   798: aload #19
    //   800: getfield y : F
    //   803: fload #4
    //   805: fload_3
    //   806: invokespecial a : (Landroid/graphics/Canvas;IFFFFFFFF)V
    //   809: aload_1
    //   810: invokevirtual restore : ()V
    //   813: return
  }
  
  private void c(int paramInt, float paramFloat) {
    if (this.b == null)
      this.b = new i0(0.0F); 
    if (!com.facebook.react.uimanager.d.a(this.b.b(paramInt), paramFloat)) {
      this.b.a(paramInt, paramFloat);
      invalidateSelf();
    } 
  }
  
  private int d(int paramInt) {
    float f1;
    float f2;
    i0 i01 = this.b;
    if (i01 != null) {
      f1 = i01.a(paramInt);
    } else {
      f1 = 0.0F;
    } 
    i01 = this.c;
    if (i01 != null) {
      f2 = i01.a(paramInt);
    } else {
      f2 = 255.0F;
    } 
    return a(f2, f1);
  }
  
  private boolean e(int paramInt) {
    float f1;
    i0 i01 = this.b;
    float f2 = Float.NaN;
    if (i01 != null) {
      f1 = i01.a(paramInt);
    } else {
      f1 = Float.NaN;
    } 
    i01 = this.c;
    if (i01 != null)
      f2 = i01.a(paramInt); 
    return (!g.a(f1) && !g.a(f2));
  }
  
  private void g() {
    if (!this.s)
      return; 
    this.s = false;
    if (this.f == null)
      this.f = new Path(); 
    if (this.g == null)
      this.g = new Path(); 
    if (this.h == null)
      this.h = new Path(); 
    if (this.j == null)
      this.j = new Path(); 
    if (this.k == null)
      this.k = new RectF(); 
    if (this.l == null)
      this.l = new RectF(); 
    if (this.m == null)
      this.m = new RectF(); 
    if (this.n == null)
      this.n = new RectF(); 
    this.f.reset();
    this.g.reset();
    this.h.reset();
    this.j.reset();
    this.k.set(getBounds());
    this.l.set(getBounds());
    this.m.set(getBounds());
    this.n.set(getBounds());
    RectF rectF1 = b();
    RectF rectF3 = this.k;
    rectF3.top += rectF1.top;
    rectF3.bottom -= rectF1.bottom;
    rectF3.left += rectF1.left;
    rectF3.right -= rectF1.right;
    rectF3 = this.n;
    rectF3.top += rectF1.top * 0.5F;
    rectF3.bottom -= rectF1.bottom * 0.5F;
    rectF3.left += rectF1.left * 0.5F;
    rectF3.right -= rectF1.right * 0.5F;
    float f1 = c();
    float f7 = a(f1, b.c);
    float f6 = a(f1, b.d);
    float f5 = a(f1, b.f);
    float f10 = a(f1, b.e);
    float f2 = f10;
    float f4 = f7;
    float f3 = f6;
    f1 = f5;
    if (Build.VERSION.SDK_INT >= 17) {
      boolean bool;
      if (e() == 1) {
        bool = true;
      } else {
        bool = false;
      } 
      float f = a(b.g);
      f3 = a(b.h);
      f2 = a(b.i);
      f4 = a(b.j);
      if (com.facebook.react.modules.i18nmanager.a.a().a(this.y)) {
        if (g.a(f)) {
          f1 = f7;
        } else {
          f1 = f;
        } 
        if (g.a(f3))
          f3 = f6; 
        if (g.a(f2))
          f2 = f5; 
        if (g.a(f4))
          f4 = f10; 
        if (bool) {
          f5 = f3;
        } else {
          f5 = f1;
        } 
        if (bool)
          f3 = f1; 
        if (bool) {
          f1 = f4;
        } else {
          f1 = f2;
        } 
        if (bool)
          f4 = f2; 
        f2 = f4;
        f4 = f5;
      } else {
        float f19;
        if (bool) {
          f1 = f3;
        } else {
          f1 = f;
        } 
        if (bool)
          f3 = f; 
        if (bool) {
          f19 = f4;
        } else {
          f19 = f2;
        } 
        if (bool) {
          f = f2;
        } else {
          f = f4;
        } 
        if (!g.a(f1))
          f7 = f1; 
        if (!g.a(f3))
          f6 = f3; 
        if (!g.a(f19))
          f5 = f19; 
        f2 = f10;
        f4 = f7;
        f3 = f6;
        f1 = f5;
        if (!g.a(f)) {
          f2 = f;
          f1 = f5;
          f3 = f6;
          f4 = f7;
        } 
      } 
    } 
    float f12 = Math.max(f4 - rectF1.left, 0.0F);
    float f13 = Math.max(f4 - rectF1.top, 0.0F);
    float f8 = Math.max(f3 - rectF1.right, 0.0F);
    float f9 = Math.max(f3 - rectF1.top, 0.0F);
    f6 = Math.max(f2 - rectF1.right, 0.0F);
    f7 = Math.max(f2 - rectF1.bottom, 0.0F);
    f10 = Math.max(f1 - rectF1.left, 0.0F);
    float f11 = Math.max(f1 - rectF1.bottom, 0.0F);
    Path path2 = this.f;
    RectF rectF4 = this.k;
    Path.Direction direction2 = Path.Direction.CW;
    path2.addRoundRect(rectF4, new float[] { f12, f13, f8, f9, f6, f7, f10, f11 }, direction2);
    path2 = this.g;
    rectF4 = this.l;
    direction2 = Path.Direction.CW;
    path2.addRoundRect(rectF4, new float[] { f4, f4, f3, f3, f2, f2, f1, f1 }, direction2);
    i0 i01 = this.a;
    if (i01 != null) {
      f5 = i01.a(8) / 2.0F;
    } else {
      f5 = 0.0F;
    } 
    Path path1 = this.h;
    rectF4 = this.m;
    float f14 = f4 + f5;
    float f15 = f3 + f5;
    float f16 = f2 + f5;
    f5 = f1 + f5;
    direction2 = Path.Direction.CW;
    path1.addRoundRect(rectF4, new float[] { f14, f14, f15, f15, f16, f16, f5, f5 }, direction2);
    path1 = this.j;
    rectF4 = this.n;
    f14 = rectF1.left;
    if (f14 > 0.0F) {
      f5 = f4 / f14;
    } else {
      f5 = 0.0F;
    } 
    f14 = Math.max(f4 - f14 * 0.5F, f5);
    f15 = rectF1.top;
    if (f15 > 0.0F) {
      f5 = f4 / f15;
    } else {
      f5 = 0.0F;
    } 
    f5 = Math.max(f4 - f15 * 0.5F, f5);
    f15 = rectF1.right;
    if (f15 > 0.0F) {
      f4 = f3 / f15;
    } else {
      f4 = 0.0F;
    } 
    f15 = Math.max(f3 - f15 * 0.5F, f4);
    f16 = rectF1.top;
    if (f16 > 0.0F) {
      f4 = f3 / f16;
    } else {
      f4 = 0.0F;
    } 
    f4 = Math.max(f3 - f16 * 0.5F, f4);
    f16 = rectF1.right;
    if (f16 > 0.0F) {
      f3 = f2 / f16;
    } else {
      f3 = 0.0F;
    } 
    f16 = Math.max(f2 - f16 * 0.5F, f3);
    float f17 = rectF1.bottom;
    if (f17 > 0.0F) {
      f3 = f2 / f17;
    } else {
      f3 = 0.0F;
    } 
    f3 = Math.max(f2 - f17 * 0.5F, f3);
    f17 = rectF1.left;
    if (f17 > 0.0F) {
      f2 = f1 / f17;
    } else {
      f2 = 0.0F;
    } 
    f17 = Math.max(f1 - f17 * 0.5F, f2);
    float f18 = rectF1.bottom;
    if (f18 > 0.0F) {
      f2 = f1 / f18;
    } else {
      f2 = 0.0F;
    } 
    f1 = Math.max(f1 - f18 * 0.5F, f2);
    Path.Direction direction1 = Path.Direction.CW;
    path1.addRoundRect(rectF4, new float[] { f14, f5, f15, f4, f16, f3, f17, f1 }, direction1);
    if (this.o == null)
      this.o = new PointF(); 
    PointF pointF = this.o;
    RectF rectF2 = this.k;
    f1 = rectF2.left;
    pointF.x = f1;
    f2 = rectF2.top;
    pointF.y = f2;
    double d1 = f1;
    double d2 = f2;
    double d3 = (f12 * 2.0F + f1);
    double d4 = (f13 * 2.0F + f2);
    rectF2 = this.l;
    a(d1, d2, d3, d4, rectF2.left, rectF2.top, f1, f2, pointF);
    if (this.r == null)
      this.r = new PointF(); 
    pointF = this.r;
    rectF2 = this.k;
    f1 = rectF2.left;
    pointF.x = f1;
    f2 = rectF2.bottom;
    pointF.y = f2;
    d1 = f1;
    d2 = (f2 - f11 * 2.0F);
    d3 = (f10 * 2.0F + f1);
    d4 = f2;
    rectF2 = this.l;
    a(d1, d2, d3, d4, rectF2.left, rectF2.bottom, f1, f2, pointF);
    if (this.p == null)
      this.p = new PointF(); 
    pointF = this.p;
    rectF2 = this.k;
    f1 = rectF2.right;
    pointF.x = f1;
    f2 = rectF2.top;
    pointF.y = f2;
    d1 = (f1 - f8 * 2.0F);
    d2 = f2;
    d3 = f1;
    d4 = (f9 * 2.0F + f2);
    rectF2 = this.l;
    a(d1, d2, d3, d4, rectF2.right, rectF2.top, f1, f2, pointF);
    if (this.q == null)
      this.q = new PointF(); 
    pointF = this.q;
    rectF2 = this.k;
    f1 = rectF2.right;
    pointF.x = f1;
    f2 = rectF2.bottom;
    pointF.y = f2;
    d1 = (f1 - f6 * 2.0F);
    d2 = (f2 - 2.0F * f7);
    d3 = f1;
    d4 = f2;
    rectF2 = this.l;
    a(d1, d2, d3, d4, rectF2.right, rectF2.bottom, f1, f2, pointF);
  }
  
  private void h() {
    c c1 = this.d;
    if (c1 != null) {
      PathEffect pathEffect = c.a(c1, d());
    } else {
      c1 = null;
    } 
    this.e = (PathEffect)c1;
    this.u.setPathEffect(this.e);
  }
  
  public float a(float paramFloat, int paramInt) {
    i0 i01 = this.a;
    if (i01 == null)
      return paramFloat; 
    float f = i01.b(paramInt);
    return g.a(f) ? paramFloat : f;
  }
  
  public float a(float paramFloat, b paramb) {
    float[] arrayOfFloat = this.x;
    if (arrayOfFloat == null)
      return paramFloat; 
    float f = arrayOfFloat[paramb.ordinal()];
    return g.a(f) ? paramFloat : f;
  }
  
  public float a(b paramb) {
    return a(Float.NaN, paramb);
  }
  
  public int a() {
    return this.v;
  }
  
  public void a(float paramFloat) {
    if (!com.facebook.react.uimanager.d.a(this.t, paramFloat)) {
      this.t = paramFloat;
      this.s = true;
      invalidateSelf();
    } 
  }
  
  public void a(int paramInt, float paramFloat) {
    if (this.a == null)
      this.a = new i0(); 
    if (!com.facebook.react.uimanager.d.a(this.a.b(paramInt), paramFloat)) {
      this.a.a(paramInt, paramFloat);
      if (paramInt == 0 || paramInt == 1 || paramInt == 2 || paramInt == 3 || paramInt == 4 || paramInt == 5 || paramInt == 8)
        this.s = true; 
      invalidateSelf();
    } 
  }
  
  public void a(int paramInt, float paramFloat1, float paramFloat2) {
    c(paramInt, paramFloat1);
    b(paramInt, paramFloat2);
  }
  
  public void a(String paramString) {
    c c1;
    if (paramString == null) {
      paramString = null;
    } else {
      c1 = c.valueOf(paramString.toUpperCase(Locale.US));
    } 
    if (this.d != c1) {
      this.d = c1;
      this.s = true;
      invalidateSelf();
    } 
  }
  
  public boolean a(int paramInt) {
    return false;
  }
  
  public RectF b() {
    float f4;
    float f1 = a(0.0F, 8);
    boolean bool = true;
    float f7 = a(f1, 1);
    float f8 = a(f1, 3);
    float f3 = a(f1, 0);
    float f6 = a(f1, 2);
    float f5 = f6;
    float f2 = f3;
    if (Build.VERSION.SDK_INT >= 17) {
      f5 = f6;
      f2 = f3;
      if (this.a != null) {
        if (e() != 1)
          bool = false; 
        f4 = this.a.b(4);
        f2 = this.a.b(5);
        if (com.facebook.react.modules.i18nmanager.a.a().a(this.y)) {
          f1 = f4;
          if (g.a(f4))
            f1 = f3; 
          if (g.a(f2))
            f2 = f6; 
          if (bool) {
            f3 = f2;
          } else {
            f3 = f1;
          } 
          f5 = f2;
          f2 = f3;
          if (bool) {
            f4 = f1;
            f1 = f3;
          } else {
            return new RectF(f2, f7, f5, f8);
          } 
        } else {
          if (bool) {
            f5 = f2;
          } else {
            f5 = f4;
          } 
          if (!bool)
            f4 = f2; 
          f1 = f3;
          if (!g.a(f5))
            f1 = f5; 
          f5 = f6;
          f2 = f1;
          if (!g.a(f4)) {
            f2 = f1;
            f5 = f4;
            return new RectF(f2, f7, f5, f8);
          } 
          return new RectF(f2, f7, f5, f8);
        } 
      } else {
        return new RectF(f2, f7, f5, f8);
      } 
    } else {
      return new RectF(f2, f7, f5, f8);
    } 
    f2 = f1;
    f5 = f4;
    return new RectF(f2, f7, f5, f8);
  }
  
  public void b(float paramFloat, int paramInt) {
    if (this.x == null) {
      this.x = new float[8];
      Arrays.fill(this.x, Float.NaN);
    } 
    if (!com.facebook.react.uimanager.d.a(this.x[paramInt], paramFloat)) {
      this.x[paramInt] = paramFloat;
      this.s = true;
      invalidateSelf();
    } 
  }
  
  public void b(int paramInt) {
    this.v = paramInt;
    invalidateSelf();
  }
  
  public float c() {
    return g.a(this.t) ? 0.0F : this.t;
  }
  
  public boolean c(int paramInt) {
    if (this.z != paramInt) {
      this.z = paramInt;
      return a(paramInt);
    } 
    return false;
  }
  
  public float d() {
    i0 i01 = this.a;
    return (i01 != null && !g.a(i01.b(8))) ? this.a.b(8) : 0.0F;
  }
  
  public void draw(Canvas paramCanvas) {
    h();
    if (!f()) {
      a(paramCanvas);
      return;
    } 
    b(paramCanvas);
  }
  
  public int e() {
    return this.z;
  }
  
  public boolean f() {
    if (!g.a(this.t) && this.t > 0.0F)
      return true; 
    float[] arrayOfFloat = this.x;
    if (arrayOfFloat != null) {
      int j = arrayOfFloat.length;
      for (int i = 0; i < j; i++) {
        float f = arrayOfFloat[i];
        if (!g.a(f) && f > 0.0F)
          return true; 
      } 
    } 
    return false;
  }
  
  public int getAlpha() {
    return this.w;
  }
  
  public int getOpacity() {
    return a.a(a.a(this.v, this.w));
  }
  
  public void getOutline(Outline paramOutline) {
    if (Build.VERSION.SDK_INT < 21) {
      super.getOutline(paramOutline);
      return;
    } 
    if ((!g.a(this.t) && this.t > 0.0F) || this.x != null) {
      g();
      paramOutline.setConvexPath(this.h);
      return;
    } 
    paramOutline.setRect(getBounds());
  }
  
  protected void onBoundsChange(Rect paramRect) {
    super.onBoundsChange(paramRect);
    this.s = true;
  }
  
  public void setAlpha(int paramInt) {
    if (paramInt != this.w) {
      this.w = paramInt;
      invalidateSelf();
    } 
  }
  
  public void setColorFilter(ColorFilter paramColorFilter) {}
  
  public enum b {
    c, d, e, f, g, h, i, j;
  }
  
  private enum c {
    c, d, e;
    
    public static PathEffect a(c param1c, float param1Float) {
      int i = d.a.a[param1c.ordinal()];
      if (i != 1) {
        if (i != 2)
          return (PathEffect)((i != 3) ? null : new DashPathEffect(new float[] { param1Float, param1Float, param1Float, param1Float }, 0.0F)); 
        param1Float *= 3.0F;
        return (PathEffect)new DashPathEffect(new float[] { param1Float, param1Float, param1Float, param1Float }, 0.0F);
      } 
      return null;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/view/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */