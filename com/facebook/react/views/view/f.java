package com.facebook.react.views.view;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.animation.Animation;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.e0;
import com.facebook.react.uimanager.f0;
import com.facebook.react.uimanager.g;
import com.facebook.react.uimanager.g0;
import com.facebook.react.uimanager.k;
import com.facebook.react.uimanager.r;
import com.facebook.react.uimanager.t;
import com.facebook.react.uimanager.u;
import com.facebook.react.uimanager.x;
import com.facebook.react.uimanager.x0;
import e.e.o.g0.c;
import e.e.o.g0.d;

public class f extends ViewGroup implements d, t, x, c, e0 {
  private static final ViewGroup.LayoutParams s = new ViewGroup.LayoutParams(0, 0);
  
  private static final Rect t = new Rect();
  
  private boolean c = false;
  
  private View[] d = null;
  
  private int e;
  
  private Rect f;
  
  private Rect g;
  
  private String h;
  
  private r i = r.f;
  
  private b j;
  
  private d k;
  
  private e.e.o.g0.b l;
  
  private boolean m = false;
  
  private final x0 n;
  
  private Path o;
  
  private int p;
  
  private float q = 1.0F;
  
  private String r = "visible";
  
  public f(Context paramContext) {
    super(paramContext);
    setClipChildren(false);
    this.n = new x0(this);
  }
  
  private void a(Canvas paramCanvas) {
    // Byte code:
    //   0: aload_0
    //   1: getfield h : Ljava/lang/String;
    //   4: astore #18
    //   6: aload #18
    //   8: ifnull -> 1004
    //   11: iconst_m1
    //   12: istore #16
    //   14: aload #18
    //   16: invokevirtual hashCode : ()I
    //   19: istore #17
    //   21: iload #17
    //   23: ldc -1217487446
    //   25: if_icmpeq -> 54
    //   28: iload #17
    //   30: ldc 466743410
    //   32: if_icmpeq -> 38
    //   35: goto -> 67
    //   38: aload #18
    //   40: ldc 'visible'
    //   42: invokevirtual equals : (Ljava/lang/Object;)Z
    //   45: ifeq -> 67
    //   48: iconst_0
    //   49: istore #16
    //   51: goto -> 67
    //   54: aload #18
    //   56: ldc 'hidden'
    //   58: invokevirtual equals : (Ljava/lang/Object;)Z
    //   61: ifeq -> 67
    //   64: iconst_1
    //   65: istore #16
    //   67: iload #16
    //   69: ifeq -> 991
    //   72: iload #16
    //   74: iconst_1
    //   75: if_icmpeq -> 79
    //   78: return
    //   79: aload_0
    //   80: invokevirtual getWidth : ()I
    //   83: i2f
    //   84: fstore #5
    //   86: aload_0
    //   87: invokevirtual getHeight : ()I
    //   90: i2f
    //   91: fstore #4
    //   93: aload_0
    //   94: getfield k : Lcom/facebook/react/views/view/d;
    //   97: astore #18
    //   99: aload #18
    //   101: ifnull -> 936
    //   104: aload #18
    //   106: invokevirtual b : ()Landroid/graphics/RectF;
    //   109: astore #18
    //   111: aload #18
    //   113: getfield top : F
    //   116: fconst_0
    //   117: fcmpl
    //   118: ifgt -> 161
    //   121: aload #18
    //   123: getfield left : F
    //   126: fconst_0
    //   127: fcmpl
    //   128: ifgt -> 161
    //   131: aload #18
    //   133: getfield bottom : F
    //   136: fconst_0
    //   137: fcmpl
    //   138: ifgt -> 161
    //   141: aload #18
    //   143: getfield right : F
    //   146: fconst_0
    //   147: fcmpl
    //   148: ifle -> 154
    //   151: goto -> 161
    //   154: fconst_0
    //   155: fstore_3
    //   156: fconst_0
    //   157: fstore_2
    //   158: goto -> 197
    //   161: aload #18
    //   163: getfield left : F
    //   166: fconst_0
    //   167: fadd
    //   168: fstore_3
    //   169: aload #18
    //   171: getfield top : F
    //   174: fconst_0
    //   175: fadd
    //   176: fstore_2
    //   177: fload #5
    //   179: aload #18
    //   181: getfield right : F
    //   184: fsub
    //   185: fstore #5
    //   187: fload #4
    //   189: aload #18
    //   191: getfield bottom : F
    //   194: fsub
    //   195: fstore #4
    //   197: aload_0
    //   198: getfield k : Lcom/facebook/react/views/view/d;
    //   201: invokevirtual c : ()F
    //   204: fstore #6
    //   206: aload_0
    //   207: getfield k : Lcom/facebook/react/views/view/d;
    //   210: fload #6
    //   212: getstatic com/facebook/react/views/view/d$b.c : Lcom/facebook/react/views/view/d$b;
    //   215: invokevirtual a : (FLcom/facebook/react/views/view/d$b;)F
    //   218: fstore #7
    //   220: aload_0
    //   221: getfield k : Lcom/facebook/react/views/view/d;
    //   224: fload #6
    //   226: getstatic com/facebook/react/views/view/d$b.d : Lcom/facebook/react/views/view/d$b;
    //   229: invokevirtual a : (FLcom/facebook/react/views/view/d$b;)F
    //   232: fstore #11
    //   234: aload_0
    //   235: getfield k : Lcom/facebook/react/views/view/d;
    //   238: fload #6
    //   240: getstatic com/facebook/react/views/view/d$b.f : Lcom/facebook/react/views/view/d$b;
    //   243: invokevirtual a : (FLcom/facebook/react/views/view/d$b;)F
    //   246: fstore #10
    //   248: aload_0
    //   249: getfield k : Lcom/facebook/react/views/view/d;
    //   252: fload #6
    //   254: getstatic com/facebook/react/views/view/d$b.e : Lcom/facebook/react/views/view/d$b;
    //   257: invokevirtual a : (FLcom/facebook/react/views/view/d$b;)F
    //   260: fstore #9
    //   262: getstatic android/os/Build$VERSION.SDK_INT : I
    //   265: bipush #17
    //   267: if_icmplt -> 653
    //   270: aload_0
    //   271: getfield p : I
    //   274: iconst_1
    //   275: if_icmpne -> 284
    //   278: iconst_1
    //   279: istore #16
    //   281: goto -> 287
    //   284: iconst_0
    //   285: istore #16
    //   287: aload_0
    //   288: getfield k : Lcom/facebook/react/views/view/d;
    //   291: getstatic com/facebook/react/views/view/d$b.g : Lcom/facebook/react/views/view/d$b;
    //   294: invokevirtual a : (Lcom/facebook/react/views/view/d$b;)F
    //   297: fstore #15
    //   299: aload_0
    //   300: getfield k : Lcom/facebook/react/views/view/d;
    //   303: getstatic com/facebook/react/views/view/d$b.h : Lcom/facebook/react/views/view/d$b;
    //   306: invokevirtual a : (Lcom/facebook/react/views/view/d$b;)F
    //   309: fstore #6
    //   311: aload_0
    //   312: getfield k : Lcom/facebook/react/views/view/d;
    //   315: getstatic com/facebook/react/views/view/d$b.i : Lcom/facebook/react/views/view/d$b;
    //   318: invokevirtual a : (Lcom/facebook/react/views/view/d$b;)F
    //   321: fstore #12
    //   323: aload_0
    //   324: getfield k : Lcom/facebook/react/views/view/d;
    //   327: astore #19
    //   329: aload #19
    //   331: getstatic com/facebook/react/views/view/d$b.j : Lcom/facebook/react/views/view/d$b;
    //   334: invokevirtual a : (Lcom/facebook/react/views/view/d$b;)F
    //   337: fstore #13
    //   339: invokestatic a : ()Lcom/facebook/react/modules/i18nmanager/a;
    //   342: astore #19
    //   344: aload #19
    //   346: aload_0
    //   347: invokevirtual getContext : ()Landroid/content/Context;
    //   350: invokevirtual a : (Landroid/content/Context;)Z
    //   353: ifeq -> 493
    //   356: fload #15
    //   358: invokestatic a : (F)Z
    //   361: ifeq -> 367
    //   364: goto -> 371
    //   367: fload #15
    //   369: fstore #7
    //   371: fload #6
    //   373: fstore #8
    //   375: fload #6
    //   377: invokestatic a : (F)Z
    //   380: ifeq -> 387
    //   383: fload #11
    //   385: fstore #8
    //   387: fload #12
    //   389: fstore #6
    //   391: fload #12
    //   393: invokestatic a : (F)Z
    //   396: ifeq -> 403
    //   399: fload #10
    //   401: fstore #6
    //   403: fload #13
    //   405: invokestatic a : (F)Z
    //   408: ifeq -> 414
    //   411: goto -> 418
    //   414: fload #13
    //   416: fstore #9
    //   418: iload #16
    //   420: ifeq -> 430
    //   423: fload #8
    //   425: fstore #10
    //   427: goto -> 434
    //   430: fload #7
    //   432: fstore #10
    //   434: iload #16
    //   436: ifeq -> 442
    //   439: goto -> 446
    //   442: fload #8
    //   444: fstore #7
    //   446: iload #16
    //   448: ifeq -> 458
    //   451: fload #9
    //   453: fstore #11
    //   455: goto -> 462
    //   458: fload #6
    //   460: fstore #11
    //   462: iload #16
    //   464: ifeq -> 478
    //   467: fload #10
    //   469: fstore #8
    //   471: fload #11
    //   473: fstore #10
    //   475: goto -> 630
    //   478: fload #9
    //   480: fstore #6
    //   482: fload #10
    //   484: fstore #8
    //   486: fload #11
    //   488: fstore #10
    //   490: goto -> 630
    //   493: iload #16
    //   495: ifeq -> 505
    //   498: fload #6
    //   500: fstore #14
    //   502: goto -> 509
    //   505: fload #15
    //   507: fstore #14
    //   509: fload #6
    //   511: fstore #8
    //   513: iload #16
    //   515: ifeq -> 522
    //   518: fload #15
    //   520: fstore #8
    //   522: iload #16
    //   524: ifeq -> 534
    //   527: fload #13
    //   529: fstore #15
    //   531: goto -> 538
    //   534: fload #12
    //   536: fstore #15
    //   538: iload #16
    //   540: ifeq -> 547
    //   543: fload #12
    //   545: fstore #13
    //   547: fload #14
    //   549: invokestatic a : (F)Z
    //   552: ifne -> 562
    //   555: fload #14
    //   557: fstore #6
    //   559: goto -> 566
    //   562: fload #7
    //   564: fstore #6
    //   566: fload #11
    //   568: fstore #7
    //   570: fload #8
    //   572: invokestatic a : (F)Z
    //   575: ifne -> 582
    //   578: fload #8
    //   580: fstore #7
    //   582: fload #10
    //   584: fstore #8
    //   586: fload #15
    //   588: invokestatic a : (F)Z
    //   591: ifne -> 598
    //   594: fload #15
    //   596: fstore #8
    //   598: fload #6
    //   600: fstore #12
    //   602: fload #7
    //   604: fstore #11
    //   606: fload #8
    //   608: fstore #10
    //   610: fload #13
    //   612: invokestatic a : (F)Z
    //   615: ifne -> 642
    //   618: fload #8
    //   620: fstore #10
    //   622: fload #6
    //   624: fstore #8
    //   626: fload #13
    //   628: fstore #6
    //   630: fload #6
    //   632: fstore #9
    //   634: fload #7
    //   636: fstore #11
    //   638: fload #8
    //   640: fstore #12
    //   642: fload #12
    //   644: fstore #13
    //   646: fload #9
    //   648: fstore #12
    //   650: goto -> 661
    //   653: fload #9
    //   655: fstore #12
    //   657: fload #7
    //   659: fstore #13
    //   661: fload #13
    //   663: fconst_0
    //   664: fcmpl
    //   665: ifgt -> 703
    //   668: fload #11
    //   670: fconst_0
    //   671: fcmpl
    //   672: ifgt -> 703
    //   675: fload #12
    //   677: fconst_0
    //   678: fcmpl
    //   679: ifgt -> 703
    //   682: fload #5
    //   684: fstore #6
    //   686: fload #4
    //   688: fstore #7
    //   690: fload_3
    //   691: fstore #8
    //   693: fload_2
    //   694: fstore #9
    //   696: fload #10
    //   698: fconst_0
    //   699: fcmpl
    //   700: ifle -> 950
    //   703: aload_0
    //   704: getfield o : Landroid/graphics/Path;
    //   707: ifnonnull -> 721
    //   710: aload_0
    //   711: new android/graphics/Path
    //   714: dup
    //   715: invokespecial <init> : ()V
    //   718: putfield o : Landroid/graphics/Path;
    //   721: aload_0
    //   722: getfield o : Landroid/graphics/Path;
    //   725: invokevirtual rewind : ()V
    //   728: aload_0
    //   729: getfield o : Landroid/graphics/Path;
    //   732: astore #19
    //   734: new android/graphics/RectF
    //   737: dup
    //   738: fload_3
    //   739: fload_2
    //   740: fload #5
    //   742: fload #4
    //   744: invokespecial <init> : (FFFF)V
    //   747: astore #20
    //   749: fload #13
    //   751: aload #18
    //   753: getfield left : F
    //   756: fsub
    //   757: fconst_0
    //   758: invokestatic max : (FF)F
    //   761: fstore #6
    //   763: fload #13
    //   765: aload #18
    //   767: getfield top : F
    //   770: fsub
    //   771: fconst_0
    //   772: invokestatic max : (FF)F
    //   775: fstore #7
    //   777: iconst_1
    //   778: istore #16
    //   780: fload #11
    //   782: aload #18
    //   784: getfield right : F
    //   787: fsub
    //   788: fconst_0
    //   789: invokestatic max : (FF)F
    //   792: fstore #8
    //   794: fload #11
    //   796: aload #18
    //   798: getfield top : F
    //   801: fsub
    //   802: fconst_0
    //   803: invokestatic max : (FF)F
    //   806: fstore #9
    //   808: fload #12
    //   810: aload #18
    //   812: getfield right : F
    //   815: fsub
    //   816: fconst_0
    //   817: invokestatic max : (FF)F
    //   820: fstore #11
    //   822: fload #12
    //   824: aload #18
    //   826: getfield bottom : F
    //   829: fsub
    //   830: fconst_0
    //   831: invokestatic max : (FF)F
    //   834: fstore #12
    //   836: fload #10
    //   838: aload #18
    //   840: getfield left : F
    //   843: fsub
    //   844: fconst_0
    //   845: invokestatic max : (FF)F
    //   848: fstore #13
    //   850: fload #10
    //   852: aload #18
    //   854: getfield bottom : F
    //   857: fsub
    //   858: fconst_0
    //   859: invokestatic max : (FF)F
    //   862: fstore #10
    //   864: getstatic android/graphics/Path$Direction.CW : Landroid/graphics/Path$Direction;
    //   867: astore #18
    //   869: aload #19
    //   871: aload #20
    //   873: bipush #8
    //   875: newarray float
    //   877: dup
    //   878: iconst_0
    //   879: fload #6
    //   881: fastore
    //   882: dup
    //   883: iconst_1
    //   884: fload #7
    //   886: fastore
    //   887: dup
    //   888: iconst_2
    //   889: fload #8
    //   891: fastore
    //   892: dup
    //   893: iconst_3
    //   894: fload #9
    //   896: fastore
    //   897: dup
    //   898: iconst_4
    //   899: fload #11
    //   901: fastore
    //   902: dup
    //   903: iconst_5
    //   904: fload #12
    //   906: fastore
    //   907: dup
    //   908: bipush #6
    //   910: fload #13
    //   912: fastore
    //   913: dup
    //   914: bipush #7
    //   916: fload #10
    //   918: fastore
    //   919: aload #18
    //   921: invokevirtual addRoundRect : (Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V
    //   924: aload_1
    //   925: aload_0
    //   926: getfield o : Landroid/graphics/Path;
    //   929: invokevirtual clipPath : (Landroid/graphics/Path;)Z
    //   932: pop
    //   933: goto -> 967
    //   936: fconst_0
    //   937: fstore #8
    //   939: fconst_0
    //   940: fstore #9
    //   942: fload #4
    //   944: fstore #7
    //   946: fload #5
    //   948: fstore #6
    //   950: iconst_0
    //   951: istore #16
    //   953: fload #9
    //   955: fstore_2
    //   956: fload #8
    //   958: fstore_3
    //   959: fload #7
    //   961: fstore #4
    //   963: fload #6
    //   965: fstore #5
    //   967: iload #16
    //   969: ifne -> 1004
    //   972: aload_1
    //   973: new android/graphics/RectF
    //   976: dup
    //   977: fload_3
    //   978: fload_2
    //   979: fload #5
    //   981: fload #4
    //   983: invokespecial <init> : (FFFF)V
    //   986: invokevirtual clipRect : (Landroid/graphics/RectF;)Z
    //   989: pop
    //   990: return
    //   991: aload_0
    //   992: getfield o : Landroid/graphics/Path;
    //   995: astore_1
    //   996: aload_1
    //   997: ifnull -> 1004
    //   1000: aload_1
    //   1001: invokevirtual rewind : ()V
    //   1004: return
  }
  
  private void a(Rect paramRect, int paramInt1, int paramInt2) {
    boolean bool1;
    UiThreadUtil.assertOnUiThread();
    View[] arrayOfView = this.d;
    e.e.m.a.a.a(arrayOfView);
    View view = arrayOfView[paramInt1];
    t.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    Rect rect = t;
    boolean bool = paramRect.intersects(rect.left, rect.top, rect.right, rect.bottom);
    Animation animation = view.getAnimation();
    boolean bool2 = true;
    if (animation != null && !animation.hasEnded()) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    if (!bool && view.getParent() != null && !bool1) {
      removeViewsInLayout(paramInt1 - paramInt2, 1);
      paramInt1 = bool2;
    } else if (bool && view.getParent() == null) {
      addViewInLayout(view, paramInt1 - paramInt2, s, true);
      invalidate();
      paramInt1 = bool2;
    } else if (bool) {
      paramInt1 = bool2;
    } else {
      paramInt1 = 0;
    } 
    if (paramInt1 != 0 && view instanceof t) {
      t t1 = (t)view;
      if (t1.getRemoveClippedSubviews())
        t1.a(); 
    } 
  }
  
  private void a(Drawable paramDrawable) {
    super.setBackground(paramDrawable);
  }
  
  private int b(View paramView) {
    int j = this.e;
    View[] arrayOfView = this.d;
    e.e.m.a.a.a(arrayOfView);
    arrayOfView = arrayOfView;
    for (int i = 0; i < j; i++) {
      if (arrayOfView[i] == paramView)
        return i; 
    } 
    return -1;
  }
  
  private void b(Rect paramRect) {
    e.e.m.a.a.a(this.d);
    int i = 0;
    for (int j = 0; i < this.e; j = k) {
      a(paramRect, i, j);
      int k = j;
      if (this.d[i].getParent() == null)
        k = j + 1; 
      i++;
    } 
  }
  
  private void b(View paramView, int paramInt) {
    View[] arrayOfView = this.d;
    e.e.m.a.a.a(arrayOfView);
    arrayOfView = arrayOfView;
    int i = this.e;
    int j = arrayOfView.length;
    if (paramInt == i) {
      View[] arrayOfView1 = arrayOfView;
      if (j == i) {
        this.d = new View[j + 12];
        System.arraycopy(arrayOfView, 0, this.d, 0, j);
        arrayOfView1 = this.d;
      } 
      paramInt = this.e;
      this.e = paramInt + 1;
      arrayOfView1[paramInt] = paramView;
      return;
    } 
    if (paramInt < i) {
      if (j == i) {
        this.d = new View[j + 12];
        System.arraycopy(arrayOfView, 0, this.d, 0, paramInt);
        System.arraycopy(arrayOfView, paramInt, this.d, paramInt + 1, i - paramInt);
        arrayOfView = this.d;
      } else {
        System.arraycopy(arrayOfView, paramInt, arrayOfView, paramInt + 1, i - paramInt);
      } 
      arrayOfView[paramInt] = paramView;
      this.e++;
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("index=");
    stringBuilder.append(paramInt);
    stringBuilder.append(" count=");
    stringBuilder.append(i);
    throw new IndexOutOfBoundsException(stringBuilder.toString());
  }
  
  private void c(int paramInt) {
    View[] arrayOfView = this.d;
    e.e.m.a.a.a(arrayOfView);
    arrayOfView = arrayOfView;
    int i = this.e;
    if (paramInt == i - 1) {
      paramInt = i - 1;
      this.e = paramInt;
      arrayOfView[paramInt] = null;
      return;
    } 
    if (paramInt >= 0 && paramInt < i) {
      System.arraycopy(arrayOfView, paramInt + 1, arrayOfView, paramInt, i - paramInt - 1);
      paramInt = this.e - 1;
      this.e = paramInt;
      arrayOfView[paramInt] = null;
      return;
    } 
    throw new IndexOutOfBoundsException();
  }
  
  private void c(View paramView) {
    if (this.c) {
      boolean bool1;
      if (getParent() == null)
        return; 
      e.e.m.a.a.a(this.f);
      e.e.m.a.a.a(this.d);
      t.set(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom());
      Rect rect1 = this.f;
      Rect rect2 = t;
      boolean bool2 = rect1.intersects(rect2.left, rect2.top, rect2.right, rect2.bottom);
      ViewParent viewParent = paramView.getParent();
      int i = 0;
      if (viewParent != null) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      if (bool2 != bool1)
        for (int j = 0; i < this.e; j = k) {
          View[] arrayOfView = this.d;
          if (arrayOfView[i] == paramView) {
            a(this.f, i, j);
            return;
          } 
          int k = j;
          if (arrayOfView[i].getParent() == null)
            k = j + 1; 
          i++;
        }  
    } 
  }
  
  private d getOrCreateReactViewBackground() {
    throw new RuntimeException("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public int a(int paramInt) {
    int i = paramInt;
    if (this.n.a())
      i = this.n.a(getChildCount(), paramInt); 
    return i;
  }
  
  public void a() {
    if (!this.c)
      return; 
    e.e.m.a.a.a(this.f);
    e.e.m.a.a.a(this.d);
    u.a((View)this, this.f);
    b(this.f);
  }
  
  public void a(float paramFloat, int paramInt) {
    d d1 = getOrCreateReactViewBackground();
    d1.b(paramFloat, paramInt);
    if (Build.VERSION.SDK_INT < 18) {
      if (d1.f()) {
        paramInt = 1;
      } else {
        paramInt = 2;
      } 
      if (paramInt != getLayerType())
        setLayerType(paramInt, null); 
    } 
  }
  
  public void a(int paramInt, float paramFloat) {
    getOrCreateReactViewBackground().a(paramInt, paramFloat);
  }
  
  public void a(int paramInt, float paramFloat1, float paramFloat2) {
    getOrCreateReactViewBackground().a(paramInt, paramFloat1, paramFloat2);
  }
  
  public void a(Rect paramRect) {
    paramRect.set(this.f);
  }
  
  void a(View paramView) {
    UiThreadUtil.assertOnUiThread();
    e.e.m.a.a.a(this.c);
    e.e.m.a.a.a(this.f);
    e.e.m.a.a.a(this.d);
    paramView.removeOnLayoutChangeListener(this.j);
    int i = b(paramView);
    if (this.d[i].getParent() != null) {
      int j = 0;
      int k;
      for (k = 0; j < i; k = m) {
        int m = k;
        if (this.d[j].getParent() == null)
          m = k + 1; 
        j++;
      } 
      removeViewsInLayout(i - k, 1);
    } 
    c(i);
  }
  
  void a(View paramView, int paramInt) {
    a(paramView, paramInt, s);
  }
  
  void a(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams) {
    e.e.m.a.a.a(this.c);
    e.e.m.a.a.a(this.f);
    e.e.m.a.a.a(this.d);
    b(paramView, paramInt);
    int i = 0;
    int j;
    for (j = 0; i < paramInt; j = k) {
      int k = j;
      if (this.d[i].getParent() == null)
        k = j + 1; 
      i++;
    } 
    a(this.f, paramInt, j);
    paramView.addOnLayoutChangeListener(this.j);
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams) {
    this.n.a(paramView);
    setChildrenDrawingOrderEnabled(this.n.a());
    super.addView(paramView, paramInt, paramLayoutParams);
  }
  
  View b(int paramInt) {
    View[] arrayOfView = this.d;
    e.e.m.a.a.a(arrayOfView);
    return arrayOfView[paramInt];
  }
  
  public void b() {
    this.n.b();
    setChildrenDrawingOrderEnabled(this.n.a());
    invalidate();
  }
  
  void c() {
    e.e.m.a.a.a(this.c);
    e.e.m.a.a.a(this.d);
    for (int i = 0; i < this.e; i++)
      this.d[i].removeOnLayoutChangeListener(this.j); 
    removeAllViewsInLayout();
    this.e = 0;
  }
  
  public void d() {
    // Byte code:
    //   0: aload_0
    //   1: getfield r : Ljava/lang/String;
    //   4: ldc 'visible'
    //   6: invokevirtual equals : (Ljava/lang/Object;)Z
    //   9: ifeq -> 23
    //   12: aload_0
    //   13: getfield q : F
    //   16: fstore_1
    //   17: aload_0
    //   18: fload_1
    //   19: invokevirtual setAlpha : (F)V
    //   22: return
    //   23: aload_0
    //   24: invokevirtual getRotationX : ()F
    //   27: fstore_1
    //   28: aload_0
    //   29: invokevirtual getRotationY : ()F
    //   32: fstore_2
    //   33: fload_1
    //   34: ldc_w -90.0
    //   37: fcmpl
    //   38: iflt -> 70
    //   41: fload_1
    //   42: ldc_w 90.0
    //   45: fcmpg
    //   46: ifge -> 70
    //   49: fload_2
    //   50: ldc_w -90.0
    //   53: fcmpl
    //   54: iflt -> 70
    //   57: fload_2
    //   58: ldc_w 90.0
    //   61: fcmpg
    //   62: ifge -> 70
    //   65: iconst_1
    //   66: istore_3
    //   67: goto -> 72
    //   70: iconst_0
    //   71: istore_3
    //   72: iload_3
    //   73: ifeq -> 79
    //   76: goto -> 12
    //   79: fconst_0
    //   80: fstore_1
    //   81: goto -> 17
  }
  
  protected void dispatchDraw(Canvas paramCanvas) {
    try {
      a(paramCanvas);
      super.dispatchDraw(paramCanvas);
      return;
    } catch (NullPointerException nullPointerException) {
      e.e.e.e.a.b("ReactNative", "NullPointerException when executing ViewGroup.dispatchDraw method", nullPointerException);
      return;
    } catch (StackOverflowError stackOverflowError) {
      f0 f0 = g0.a((View)this);
      if (f0 != null) {
        f0.a(stackOverflowError);
        return;
      } 
      if (getContext() instanceof ReactContext) {
        ((ReactContext)getContext()).handleException((Exception)new g("StackOverflowException", (View)this, stackOverflowError));
        return;
      } 
      throw stackOverflowError;
    } 
  }
  
  @TargetApi(23)
  public void dispatchProvideStructure(ViewStructure paramViewStructure) {
    try {
      super.dispatchProvideStructure(paramViewStructure);
      return;
    } catch (NullPointerException nullPointerException) {
      e.e.e.e.a.b("ReactNative", "NullPointerException when executing dispatchProvideStructure", nullPointerException);
      return;
    } 
  }
  
  protected void dispatchSetPressed(boolean paramBoolean) {}
  
  int getAllChildrenCount() {
    return this.e;
  }
  
  public int getBackgroundColor() {
    return (getBackground() != null) ? ((d)getBackground()).a() : 0;
  }
  
  protected int getChildDrawingOrder(int paramInt1, int paramInt2) {
    return this.n.a(paramInt1, paramInt2);
  }
  
  public boolean getChildVisibleRect(View paramView, Rect paramRect, Point paramPoint) {
    return e.e.o.b0.a.g ? u.a(paramView, paramRect, paramPoint, (View)this, this.h) : super.getChildVisibleRect(paramView, paramRect, paramPoint);
  }
  
  public Rect getHitSlopRect() {
    return this.g;
  }
  
  public String getOverflow() {
    return this.h;
  }
  
  public r getPointerEvents() {
    return this.i;
  }
  
  public boolean getRemoveClippedSubviews() {
    return this.c;
  }
  
  public boolean hasOverlappingRendering() {
    return this.m;
  }
  
  protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    if (this.c)
      a(); 
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent) {
    e.e.o.g0.b b1 = this.l;
    if (b1 != null && b1.a(this, paramMotionEvent))
      return true; 
    r r1 = this.i;
    return (r1 != r.c) ? ((r1 == r.e) ? true : super.onInterceptTouchEvent(paramMotionEvent)) : true;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    k.a(paramInt1, paramInt2);
    setMeasuredDimension(View.MeasureSpec.getSize(paramInt1), View.MeasureSpec.getSize(paramInt2));
  }
  
  public void onRtlPropertiesChanged(int paramInt) {
    if (Build.VERSION.SDK_INT >= 17) {
      d d1 = this.k;
      if (d1 != null)
        d1.c(this.p); 
    } 
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.c)
      a(); 
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    r r1 = this.i;
    return !(r1 == r.c || r1 == r.d);
  }
  
  public void removeView(View paramView) {
    UiThreadUtil.assertOnUiThread();
    this.n.b(paramView);
    setChildrenDrawingOrderEnabled(this.n.a());
    super.removeView(paramView);
  }
  
  public void removeViewAt(int paramInt) {
    UiThreadUtil.assertOnUiThread();
    this.n.b(getChildAt(paramInt));
    setChildrenDrawingOrderEnabled(this.n.a());
    super.removeViewAt(paramInt);
  }
  
  @SuppressLint({"MissingSuperCall"})
  public void requestLayout() {}
  
  public void setBackfaceVisibility(String paramString) {
    this.r = paramString;
    d();
  }
  
  public void setBackground(Drawable paramDrawable) {
    throw new UnsupportedOperationException("This method is not supported for ReactViewGroup instances");
  }
  
  public void setBackgroundColor(int paramInt) {
    if (paramInt == 0 && this.k == null)
      return; 
    getOrCreateReactViewBackground().b(paramInt);
  }
  
  public void setBorderRadius(float paramFloat) {
    d d1 = getOrCreateReactViewBackground();
    d1.a(paramFloat);
    if (Build.VERSION.SDK_INT < 18) {
      byte b1;
      if (d1.f()) {
        b1 = 1;
      } else {
        b1 = 2;
      } 
      if (b1 != getLayerType())
        setLayerType(b1, null); 
    } 
  }
  
  public void setBorderStyle(String paramString) {
    getOrCreateReactViewBackground().a(paramString);
  }
  
  public void setHitSlopRect(Rect paramRect) {
    this.g = paramRect;
  }
  
  public void setNeedsOffscreenAlphaCompositing(boolean paramBoolean) {
    this.m = paramBoolean;
  }
  
  public void setOnInterceptTouchEventListener(e.e.o.g0.b paramb) {
    this.l = paramb;
  }
  
  public void setOpacityIfPossible(float paramFloat) {
    this.q = paramFloat;
    d();
  }
  
  public void setOverflow(String paramString) {
    this.h = paramString;
    invalidate();
  }
  
  void setPointerEvents(r paramr) {
    this.i = paramr;
  }
  
  public void setRemoveClippedSubviews(boolean paramBoolean) {
    if (paramBoolean == this.c)
      return; 
    this.c = paramBoolean;
    int i = 0;
    if (paramBoolean) {
      this.f = new Rect();
      u.a((View)this, this.f);
      this.e = getChildCount();
      this.d = new View[Math.max(12, this.e)];
      this.j = new b(this, null);
      while (i < this.e) {
        View view = getChildAt(i);
        this.d[i] = view;
        view.addOnLayoutChangeListener(this.j);
        i++;
      } 
      a();
      return;
    } 
    e.e.m.a.a.a(this.f);
    e.e.m.a.a.a(this.d);
    e.e.m.a.a.a(this.j);
    for (i = 0; i < this.e; i++)
      this.d[i].removeOnLayoutChangeListener(this.j); 
    getDrawingRect(this.f);
    b(this.f);
    this.d = null;
    this.f = null;
    this.e = 0;
    this.j = null;
  }
  
  public void setTranslucentBackgroundDrawable(Drawable paramDrawable) {
    a((Drawable)null);
    d d1 = this.k;
    if (d1 != null && paramDrawable != null) {
      a((Drawable)new LayerDrawable(new Drawable[] { d1, paramDrawable }));
      return;
    } 
    if (paramDrawable != null)
      a(paramDrawable); 
  }
  
  private static final class b implements View.OnLayoutChangeListener {
    private final f c;
    
    private b(f param1f) {
      this.c = param1f;
    }
    
    public void onLayoutChange(View param1View, int param1Int1, int param1Int2, int param1Int3, int param1Int4, int param1Int5, int param1Int6, int param1Int7, int param1Int8) {
      if (this.c.getRemoveClippedSubviews())
        f.a(this.c, param1View); 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/view/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */