package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.Shape;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.b;
import com.google.android.material.internal.f;
import e.f.a.f.a0.g;
import e.f.a.f.l.h;
import e.f.a.f.x.d;
import e.f.a.f.y.b;
import java.lang.ref.WeakReference;
import java.util.Arrays;

public class a extends g implements b, Drawable.Callback, f.b {
  private static final int[] H0 = new int[] { 16842910 };
  
  private static final ShapeDrawable I0 = new ShapeDrawable((Shape)new OvalShape());
  
  private float A;
  
  private boolean A0;
  
  private float B;
  
  private ColorStateList B0;
  
  private ColorStateList C;
  
  private WeakReference<a> C0 = new WeakReference<a>(null);
  
  private float D;
  
  private TextUtils.TruncateAt D0;
  
  private ColorStateList E;
  
  private boolean E0;
  
  private CharSequence F;
  
  private int F0;
  
  private boolean G;
  
  private boolean G0;
  
  private Drawable H;
  
  private ColorStateList I;
  
  private float J;
  
  private boolean K;
  
  private boolean L;
  
  private Drawable M;
  
  private Drawable N;
  
  private ColorStateList O;
  
  private float P;
  
  private CharSequence Q;
  
  private boolean R;
  
  private boolean S;
  
  private Drawable T;
  
  private h U;
  
  private h V;
  
  private float W;
  
  private float X;
  
  private float Y;
  
  private float Z;
  
  private float a0;
  
  private float b0;
  
  private float c0;
  
  private float d0;
  
  private final Context e0;
  
  private final Paint f0 = new Paint(1);
  
  private final Paint g0;
  
  private final Paint.FontMetrics h0 = new Paint.FontMetrics();
  
  private final RectF i0 = new RectF();
  
  private final PointF j0 = new PointF();
  
  private final Path k0 = new Path();
  
  private final f l0;
  
  private int m0;
  
  private int n0;
  
  private int o0;
  
  private int p0;
  
  private int q0;
  
  private int r0;
  
  private boolean s0;
  
  private int t0;
  
  private int u0 = 255;
  
  private ColorFilter v0;
  
  private PorterDuffColorFilter w0;
  
  private ColorStateList x0;
  
  private ColorStateList y;
  
  private PorterDuff.Mode y0 = PorterDuff.Mode.SRC_IN;
  
  private ColorStateList z;
  
  private int[] z0;
  
  private a(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    a(paramContext);
    this.e0 = paramContext;
    this.l0 = new f(this);
    this.F = "";
    (this.l0.b()).density = (paramContext.getResources().getDisplayMetrics()).density;
    this.g0 = null;
    Paint paint = this.g0;
    if (paint != null)
      paint.setStyle(Paint.Style.STROKE); 
    setState(H0);
    a(H0);
    this.E0 = true;
    if (b.a)
      I0.setTint(-1); 
  }
  
  public static a a(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    a a1 = new a(paramContext, paramAttributeSet, paramInt1, paramInt2);
    a1.a(paramAttributeSet, paramInt1, paramInt2);
    return a1;
  }
  
  private void a(Canvas paramCanvas, Rect paramRect) {
    if (f0()) {
      a(paramRect, this.i0);
      RectF rectF = this.i0;
      float f1 = rectF.left;
      float f2 = rectF.top;
      paramCanvas.translate(f1, f2);
      this.T.setBounds(0, 0, (int)this.i0.width(), (int)this.i0.height());
      this.T.draw(paramCanvas);
      paramCanvas.translate(-f1, -f2);
    } 
  }
  
  private void a(Rect paramRect, RectF paramRectF) {
    paramRectF.setEmpty();
    if (g0() || f0()) {
      float f1 = this.W + this.X;
      if (androidx.core.graphics.drawable.a.e((Drawable)this) == 0) {
        paramRectF.left = paramRect.left + f1;
        paramRectF.right = paramRectF.left + this.J;
      } else {
        paramRectF.right = paramRect.right - f1;
        paramRectF.left = paramRectF.right - this.J;
      } 
      f1 = paramRect.exactCenterY();
      float f2 = this.J;
      paramRectF.top = f1 - f2 / 2.0F;
      paramRectF.bottom = paramRectF.top + f2;
    } 
  }
  
  private void a(AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield e0 : Landroid/content/Context;
    //   4: aload_1
    //   5: getstatic e/f/a/f/k.Chip : [I
    //   8: iload_2
    //   9: iload_3
    //   10: iconst_0
    //   11: newarray int
    //   13: invokestatic c : (Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Landroid/content/res/TypedArray;
    //   16: astore #5
    //   18: aload_0
    //   19: aload #5
    //   21: getstatic e/f/a/f/k.Chip_shapeAppearance : I
    //   24: invokevirtual hasValue : (I)Z
    //   27: putfield G0 : Z
    //   30: aload_0
    //   31: aload_0
    //   32: getfield e0 : Landroid/content/Context;
    //   35: aload #5
    //   37: getstatic e/f/a/f/k.Chip_chipSurfaceColor : I
    //   40: invokestatic a : (Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;
    //   43: invokespecial i : (Landroid/content/res/ColorStateList;)V
    //   46: aload_0
    //   47: aload_0
    //   48: getfield e0 : Landroid/content/Context;
    //   51: aload #5
    //   53: getstatic e/f/a/f/k.Chip_chipBackgroundColor : I
    //   56: invokestatic a : (Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;
    //   59: invokevirtual c : (Landroid/content/res/ColorStateList;)V
    //   62: aload_0
    //   63: aload #5
    //   65: getstatic e/f/a/f/k.Chip_chipMinHeight : I
    //   68: fconst_0
    //   69: invokevirtual getDimension : (IF)F
    //   72: invokevirtual h : (F)V
    //   75: aload #5
    //   77: getstatic e/f/a/f/k.Chip_chipCornerRadius : I
    //   80: invokevirtual hasValue : (I)Z
    //   83: ifeq -> 99
    //   86: aload_0
    //   87: aload #5
    //   89: getstatic e/f/a/f/k.Chip_chipCornerRadius : I
    //   92: fconst_0
    //   93: invokevirtual getDimension : (IF)F
    //   96: invokevirtual e : (F)V
    //   99: aload_0
    //   100: aload_0
    //   101: getfield e0 : Landroid/content/Context;
    //   104: aload #5
    //   106: getstatic e/f/a/f/k.Chip_chipStrokeColor : I
    //   109: invokestatic a : (Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;
    //   112: invokevirtual e : (Landroid/content/res/ColorStateList;)V
    //   115: aload_0
    //   116: aload #5
    //   118: getstatic e/f/a/f/k.Chip_chipStrokeWidth : I
    //   121: fconst_0
    //   122: invokevirtual getDimension : (IF)F
    //   125: invokevirtual j : (F)V
    //   128: aload_0
    //   129: aload_0
    //   130: getfield e0 : Landroid/content/Context;
    //   133: aload #5
    //   135: getstatic e/f/a/f/k.Chip_rippleColor : I
    //   138: invokestatic a : (Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;
    //   141: invokevirtual g : (Landroid/content/res/ColorStateList;)V
    //   144: aload_0
    //   145: aload #5
    //   147: getstatic e/f/a/f/k.Chip_android_text : I
    //   150: invokevirtual getText : (I)Ljava/lang/CharSequence;
    //   153: invokevirtual b : (Ljava/lang/CharSequence;)V
    //   156: aload_0
    //   157: aload_0
    //   158: getfield e0 : Landroid/content/Context;
    //   161: aload #5
    //   163: getstatic e/f/a/f/k.Chip_android_textAppearance : I
    //   166: invokestatic c : (Landroid/content/Context;Landroid/content/res/TypedArray;I)Le/f/a/f/x/d;
    //   169: invokevirtual a : (Le/f/a/f/x/d;)V
    //   172: aload #5
    //   174: getstatic e/f/a/f/k.Chip_android_ellipsize : I
    //   177: iconst_0
    //   178: invokevirtual getInt : (II)I
    //   181: istore_2
    //   182: iload_2
    //   183: iconst_1
    //   184: if_icmpeq -> 216
    //   187: iload_2
    //   188: iconst_2
    //   189: if_icmpeq -> 208
    //   192: iload_2
    //   193: iconst_3
    //   194: if_icmpeq -> 200
    //   197: goto -> 227
    //   200: getstatic android/text/TextUtils$TruncateAt.END : Landroid/text/TextUtils$TruncateAt;
    //   203: astore #4
    //   205: goto -> 221
    //   208: getstatic android/text/TextUtils$TruncateAt.MIDDLE : Landroid/text/TextUtils$TruncateAt;
    //   211: astore #4
    //   213: goto -> 221
    //   216: getstatic android/text/TextUtils$TruncateAt.START : Landroid/text/TextUtils$TruncateAt;
    //   219: astore #4
    //   221: aload_0
    //   222: aload #4
    //   224: invokevirtual a : (Landroid/text/TextUtils$TruncateAt;)V
    //   227: aload_0
    //   228: aload #5
    //   230: getstatic e/f/a/f/k.Chip_chipIconVisible : I
    //   233: iconst_0
    //   234: invokevirtual getBoolean : (IZ)Z
    //   237: invokevirtual c : (Z)V
    //   240: aload_1
    //   241: ifnull -> 287
    //   244: aload_1
    //   245: ldc_w 'http://schemas.android.com/apk/res-auto'
    //   248: ldc_w 'chipIconEnabled'
    //   251: invokeinterface getAttributeValue : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   256: ifnull -> 287
    //   259: aload_1
    //   260: ldc_w 'http://schemas.android.com/apk/res-auto'
    //   263: ldc_w 'chipIconVisible'
    //   266: invokeinterface getAttributeValue : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   271: ifnonnull -> 287
    //   274: aload_0
    //   275: aload #5
    //   277: getstatic e/f/a/f/k.Chip_chipIconEnabled : I
    //   280: iconst_0
    //   281: invokevirtual getBoolean : (IZ)Z
    //   284: invokevirtual c : (Z)V
    //   287: aload_0
    //   288: aload_0
    //   289: getfield e0 : Landroid/content/Context;
    //   292: aload #5
    //   294: getstatic e/f/a/f/k.Chip_chipIcon : I
    //   297: invokestatic b : (Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;
    //   300: invokevirtual b : (Landroid/graphics/drawable/Drawable;)V
    //   303: aload #5
    //   305: getstatic e/f/a/f/k.Chip_chipIconTint : I
    //   308: invokevirtual hasValue : (I)Z
    //   311: ifeq -> 330
    //   314: aload_0
    //   315: aload_0
    //   316: getfield e0 : Landroid/content/Context;
    //   319: aload #5
    //   321: getstatic e/f/a/f/k.Chip_chipIconTint : I
    //   324: invokestatic a : (Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;
    //   327: invokevirtual d : (Landroid/content/res/ColorStateList;)V
    //   330: aload_0
    //   331: aload #5
    //   333: getstatic e/f/a/f/k.Chip_chipIconSize : I
    //   336: fconst_0
    //   337: invokevirtual getDimension : (IF)F
    //   340: invokevirtual g : (F)V
    //   343: aload_0
    //   344: aload #5
    //   346: getstatic e/f/a/f/k.Chip_closeIconVisible : I
    //   349: iconst_0
    //   350: invokevirtual getBoolean : (IZ)Z
    //   353: invokevirtual d : (Z)V
    //   356: aload_1
    //   357: ifnull -> 403
    //   360: aload_1
    //   361: ldc_w 'http://schemas.android.com/apk/res-auto'
    //   364: ldc_w 'closeIconEnabled'
    //   367: invokeinterface getAttributeValue : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   372: ifnull -> 403
    //   375: aload_1
    //   376: ldc_w 'http://schemas.android.com/apk/res-auto'
    //   379: ldc_w 'closeIconVisible'
    //   382: invokeinterface getAttributeValue : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   387: ifnonnull -> 403
    //   390: aload_0
    //   391: aload #5
    //   393: getstatic e/f/a/f/k.Chip_closeIconEnabled : I
    //   396: iconst_0
    //   397: invokevirtual getBoolean : (IZ)Z
    //   400: invokevirtual d : (Z)V
    //   403: aload_0
    //   404: aload_0
    //   405: getfield e0 : Landroid/content/Context;
    //   408: aload #5
    //   410: getstatic e/f/a/f/k.Chip_closeIcon : I
    //   413: invokestatic b : (Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;
    //   416: invokevirtual c : (Landroid/graphics/drawable/Drawable;)V
    //   419: aload_0
    //   420: aload_0
    //   421: getfield e0 : Landroid/content/Context;
    //   424: aload #5
    //   426: getstatic e/f/a/f/k.Chip_closeIconTint : I
    //   429: invokestatic a : (Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;
    //   432: invokevirtual f : (Landroid/content/res/ColorStateList;)V
    //   435: aload_0
    //   436: aload #5
    //   438: getstatic e/f/a/f/k.Chip_closeIconSize : I
    //   441: fconst_0
    //   442: invokevirtual getDimension : (IF)F
    //   445: invokevirtual l : (F)V
    //   448: aload_0
    //   449: aload #5
    //   451: getstatic e/f/a/f/k.Chip_android_checkable : I
    //   454: iconst_0
    //   455: invokevirtual getBoolean : (IZ)Z
    //   458: invokevirtual a : (Z)V
    //   461: aload_0
    //   462: aload #5
    //   464: getstatic e/f/a/f/k.Chip_checkedIconVisible : I
    //   467: iconst_0
    //   468: invokevirtual getBoolean : (IZ)Z
    //   471: invokevirtual b : (Z)V
    //   474: aload_1
    //   475: ifnull -> 521
    //   478: aload_1
    //   479: ldc_w 'http://schemas.android.com/apk/res-auto'
    //   482: ldc_w 'checkedIconEnabled'
    //   485: invokeinterface getAttributeValue : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   490: ifnull -> 521
    //   493: aload_1
    //   494: ldc_w 'http://schemas.android.com/apk/res-auto'
    //   497: ldc_w 'checkedIconVisible'
    //   500: invokeinterface getAttributeValue : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   505: ifnonnull -> 521
    //   508: aload_0
    //   509: aload #5
    //   511: getstatic e/f/a/f/k.Chip_checkedIconEnabled : I
    //   514: iconst_0
    //   515: invokevirtual getBoolean : (IZ)Z
    //   518: invokevirtual b : (Z)V
    //   521: aload_0
    //   522: aload_0
    //   523: getfield e0 : Landroid/content/Context;
    //   526: aload #5
    //   528: getstatic e/f/a/f/k.Chip_checkedIcon : I
    //   531: invokestatic b : (Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;
    //   534: invokevirtual a : (Landroid/graphics/drawable/Drawable;)V
    //   537: aload_0
    //   538: aload_0
    //   539: getfield e0 : Landroid/content/Context;
    //   542: aload #5
    //   544: getstatic e/f/a/f/k.Chip_showMotionSpec : I
    //   547: invokestatic a : (Landroid/content/Context;Landroid/content/res/TypedArray;I)Le/f/a/f/l/h;
    //   550: invokevirtual b : (Le/f/a/f/l/h;)V
    //   553: aload_0
    //   554: aload_0
    //   555: getfield e0 : Landroid/content/Context;
    //   558: aload #5
    //   560: getstatic e/f/a/f/k.Chip_hideMotionSpec : I
    //   563: invokestatic a : (Landroid/content/Context;Landroid/content/res/TypedArray;I)Le/f/a/f/l/h;
    //   566: invokevirtual a : (Le/f/a/f/l/h;)V
    //   569: aload_0
    //   570: aload #5
    //   572: getstatic e/f/a/f/k.Chip_chipStartPadding : I
    //   575: fconst_0
    //   576: invokevirtual getDimension : (IF)F
    //   579: invokevirtual i : (F)V
    //   582: aload_0
    //   583: aload #5
    //   585: getstatic e/f/a/f/k.Chip_iconStartPadding : I
    //   588: fconst_0
    //   589: invokevirtual getDimension : (IF)F
    //   592: invokevirtual o : (F)V
    //   595: aload_0
    //   596: aload #5
    //   598: getstatic e/f/a/f/k.Chip_iconEndPadding : I
    //   601: fconst_0
    //   602: invokevirtual getDimension : (IF)F
    //   605: invokevirtual n : (F)V
    //   608: aload_0
    //   609: aload #5
    //   611: getstatic e/f/a/f/k.Chip_textStartPadding : I
    //   614: fconst_0
    //   615: invokevirtual getDimension : (IF)F
    //   618: invokevirtual q : (F)V
    //   621: aload_0
    //   622: aload #5
    //   624: getstatic e/f/a/f/k.Chip_textEndPadding : I
    //   627: fconst_0
    //   628: invokevirtual getDimension : (IF)F
    //   631: invokevirtual p : (F)V
    //   634: aload_0
    //   635: aload #5
    //   637: getstatic e/f/a/f/k.Chip_closeIconStartPadding : I
    //   640: fconst_0
    //   641: invokevirtual getDimension : (IF)F
    //   644: invokevirtual m : (F)V
    //   647: aload_0
    //   648: aload #5
    //   650: getstatic e/f/a/f/k.Chip_closeIconEndPadding : I
    //   653: fconst_0
    //   654: invokevirtual getDimension : (IF)F
    //   657: invokevirtual k : (F)V
    //   660: aload_0
    //   661: aload #5
    //   663: getstatic e/f/a/f/k.Chip_chipEndPadding : I
    //   666: fconst_0
    //   667: invokevirtual getDimension : (IF)F
    //   670: invokevirtual f : (F)V
    //   673: aload_0
    //   674: aload #5
    //   676: getstatic e/f/a/f/k.Chip_android_maxWidth : I
    //   679: ldc_w 2147483647
    //   682: invokevirtual getDimensionPixelSize : (II)I
    //   685: invokevirtual x : (I)V
    //   688: aload #5
    //   690: invokevirtual recycle : ()V
    //   693: return
  }
  
  private static boolean a(int[] paramArrayOfint, int paramInt) {
    if (paramArrayOfint == null)
      return false; 
    int j = paramArrayOfint.length;
    for (int i = 0; i < j; i++) {
      if (paramArrayOfint[i] == paramInt)
        return true; 
    } 
    return false;
  }
  
  private boolean a(int[] paramArrayOfint1, int[] paramArrayOfint2) {
    int j;
    boolean bool3;
    boolean bool1 = super.onStateChange(paramArrayOfint1);
    ColorStateList colorStateList = this.y;
    if (colorStateList != null) {
      i = colorStateList.getColorForState(paramArrayOfint1, this.m0);
    } else {
      i = 0;
    } 
    if (this.m0 != i) {
      this.m0 = i;
      bool1 = true;
    } 
    colorStateList = this.z;
    if (colorStateList != null) {
      j = colorStateList.getColorForState(paramArrayOfint1, this.n0);
    } else {
      j = 0;
    } 
    if (this.n0 != j) {
      this.n0 = j;
      bool1 = true;
    } 
    int k = e.f.a.f.q.a.a(i, j);
    if (this.o0 != k) {
      i = 1;
    } else {
      i = 0;
    } 
    if (f() == null) {
      j = 1;
    } else {
      j = 0;
    } 
    if ((i | j) != 0) {
      this.o0 = k;
      a(ColorStateList.valueOf(this.o0));
      bool1 = true;
    } 
    colorStateList = this.C;
    if (colorStateList != null) {
      i = colorStateList.getColorForState(paramArrayOfint1, this.p0);
    } else {
      i = 0;
    } 
    if (this.p0 != i) {
      this.p0 = i;
      bool1 = true;
    } 
    if (this.B0 != null && b.a(paramArrayOfint1)) {
      i = this.B0.getColorForState(paramArrayOfint1, this.q0);
    } else {
      i = 0;
    } 
    boolean bool2 = bool1;
    if (this.q0 != i) {
      this.q0 = i;
      bool2 = bool1;
      if (this.A0)
        bool2 = true; 
    } 
    if (this.l0.a() != null && (this.l0.a()).b != null) {
      i = (this.l0.a()).b.getColorForState(paramArrayOfint1, this.r0);
    } else {
      i = 0;
    } 
    bool1 = bool2;
    if (this.r0 != i) {
      this.r0 = i;
      bool1 = true;
    } 
    if (a(getState(), 16842912) && this.R) {
      bool3 = true;
    } else {
      bool3 = false;
    } 
    bool2 = bool1;
    if (this.s0 != bool3) {
      bool2 = bool1;
      if (this.T != null) {
        float f1 = s();
        this.s0 = bool3;
        if (f1 != s()) {
          bool2 = true;
          i = 1;
        } else {
          bool2 = true;
          i = 0;
        } 
        colorStateList = this.x0;
        if (colorStateList != null) {
          j = colorStateList.getColorForState(paramArrayOfint1, this.t0);
        } else {
          j = 0;
        } 
        if (this.t0 != j) {
          this.t0 = j;
          this.w0 = e.f.a.f.s.a.a((Drawable)this, this.x0, this.y0);
          bool2 = true;
        } 
        bool1 = bool2;
        if (e(this.H))
          bool1 = bool2 | this.H.setState(paramArrayOfint1); 
        bool2 = bool1;
        if (e(this.T))
          bool2 = bool1 | this.T.setState(paramArrayOfint1); 
        bool1 = bool2;
        if (e(this.M)) {
          int[] arrayOfInt = new int[paramArrayOfint1.length + paramArrayOfint2.length];
          System.arraycopy(paramArrayOfint1, 0, arrayOfInt, 0, paramArrayOfint1.length);
          System.arraycopy(paramArrayOfint2, 0, arrayOfInt, paramArrayOfint1.length, paramArrayOfint2.length);
          bool1 = bool2 | this.M.setState(arrayOfInt);
        } 
        bool2 = bool1;
        if (b.a) {
          bool2 = bool1;
          if (e(this.N))
            bool2 = bool1 | this.N.setState(paramArrayOfint2); 
        } 
        if (bool2)
          invalidateSelf(); 
        if (i != 0)
          a0(); 
        return bool2;
      } 
    } 
    int i = 0;
  }
  
  private void b(Canvas paramCanvas, Rect paramRect) {
    if (!this.G0) {
      this.f0.setColor(this.n0);
      this.f0.setStyle(Paint.Style.FILL);
      this.f0.setColorFilter(e0());
      this.i0.set(paramRect);
      paramCanvas.drawRoundRect(this.i0, w(), w(), this.f0);
    } 
  }
  
  private void b(Rect paramRect, RectF paramRectF) {
    paramRectF.set(paramRect);
    if (h0()) {
      float f1 = this.d0 + this.c0 + this.P + this.b0 + this.a0;
      if (androidx.core.graphics.drawable.a.e((Drawable)this) == 0) {
        paramRectF.right = paramRect.right - f1;
        return;
      } 
      paramRectF.left = paramRect.left + f1;
    } 
  }
  
  private static boolean b(d paramd) {
    if (paramd != null) {
      ColorStateList colorStateList = paramd.b;
      if (colorStateList != null && colorStateList.isStateful())
        return true; 
    } 
    return false;
  }
  
  private void c(Canvas paramCanvas, Rect paramRect) {
    if (g0()) {
      a(paramRect, this.i0);
      RectF rectF = this.i0;
      float f1 = rectF.left;
      float f2 = rectF.top;
      paramCanvas.translate(f1, f2);
      this.H.setBounds(0, 0, (int)this.i0.width(), (int)this.i0.height());
      this.H.draw(paramCanvas);
      paramCanvas.translate(-f1, -f2);
    } 
  }
  
  private void c(Rect paramRect, RectF paramRectF) {
    paramRectF.setEmpty();
    if (h0()) {
      float f1 = this.d0 + this.c0;
      if (androidx.core.graphics.drawable.a.e((Drawable)this) == 0) {
        paramRectF.right = paramRect.right - f1;
        paramRectF.left = paramRectF.right - this.P;
      } else {
        paramRectF.left = paramRect.left + f1;
        paramRectF.right = paramRectF.left + this.P;
      } 
      f1 = paramRect.exactCenterY();
      float f2 = this.P;
      paramRectF.top = f1 - f2 / 2.0F;
      paramRectF.bottom = paramRectF.top + f2;
    } 
  }
  
  private float c0() {
    this.l0.b().getFontMetrics(this.h0);
    Paint.FontMetrics fontMetrics = this.h0;
    return (fontMetrics.descent + fontMetrics.ascent) / 2.0F;
  }
  
  private void d(Canvas paramCanvas, Rect paramRect) {
    if (this.D > 0.0F && !this.G0) {
      this.f0.setColor(this.p0);
      this.f0.setStyle(Paint.Style.STROKE);
      if (!this.G0)
        this.f0.setColorFilter(e0()); 
      RectF rectF = this.i0;
      float f1 = paramRect.left;
      float f2 = this.D;
      rectF.set(f1 + f2 / 2.0F, paramRect.top + f2 / 2.0F, paramRect.right - f2 / 2.0F, paramRect.bottom - f2 / 2.0F);
      f1 = this.B - this.D / 2.0F;
      paramCanvas.drawRoundRect(this.i0, f1, f1, this.f0);
    } 
  }
  
  private void d(Rect paramRect, RectF paramRectF) {
    paramRectF.setEmpty();
    if (h0()) {
      float f1 = this.d0 + this.c0 + this.P + this.b0 + this.a0;
      if (androidx.core.graphics.drawable.a.e((Drawable)this) == 0) {
        paramRectF.right = paramRect.right;
        paramRectF.left = paramRectF.right - f1;
      } else {
        int i = paramRect.left;
        paramRectF.left = i;
        paramRectF.right = i + f1;
      } 
      paramRectF.top = paramRect.top;
      paramRectF.bottom = paramRect.bottom;
    } 
  }
  
  private void d(Drawable paramDrawable) {
    if (paramDrawable == null)
      return; 
    paramDrawable.setCallback(this);
    androidx.core.graphics.drawable.a.a(paramDrawable, androidx.core.graphics.drawable.a.e((Drawable)this));
    paramDrawable.setLevel(getLevel());
    paramDrawable.setVisible(isVisible(), false);
    if (paramDrawable == this.M) {
      if (paramDrawable.isStateful())
        paramDrawable.setState(K()); 
      androidx.core.graphics.drawable.a.a(paramDrawable, this.O);
      return;
    } 
    if (paramDrawable.isStateful())
      paramDrawable.setState(getState()); 
    Drawable drawable = this.H;
    if (paramDrawable == drawable && this.K)
      androidx.core.graphics.drawable.a.a(drawable, this.I); 
  }
  
  private boolean d0() {
    return (this.S && this.T != null && this.R);
  }
  
  private void e(Canvas paramCanvas, Rect paramRect) {
    if (!this.G0) {
      this.f0.setColor(this.m0);
      this.f0.setStyle(Paint.Style.FILL);
      this.i0.set(paramRect);
      paramCanvas.drawRoundRect(this.i0, w(), w(), this.f0);
    } 
  }
  
  private void e(Rect paramRect, RectF paramRectF) {
    paramRectF.setEmpty();
    if (this.F != null) {
      float f1 = this.W + s() + this.Z;
      float f2 = this.d0 + t() + this.a0;
      if (androidx.core.graphics.drawable.a.e((Drawable)this) == 0) {
        paramRectF.left = paramRect.left + f1;
        paramRectF.right = paramRect.right - f2;
      } else {
        paramRectF.left = paramRect.left + f2;
        paramRectF.right = paramRect.right - f1;
      } 
      paramRectF.top = paramRect.top;
      paramRectF.bottom = paramRect.bottom;
    } 
  }
  
  private static boolean e(Drawable paramDrawable) {
    return (paramDrawable != null && paramDrawable.isStateful());
  }
  
  private ColorFilter e0() {
    ColorFilter colorFilter = this.v0;
    return (ColorFilter)((colorFilter != null) ? colorFilter : this.w0);
  }
  
  private void f(Canvas paramCanvas, Rect paramRect) {
    if (h0()) {
      Drawable drawable;
      c(paramRect, this.i0);
      RectF rectF = this.i0;
      float f1 = rectF.left;
      float f2 = rectF.top;
      paramCanvas.translate(f1, f2);
      this.M.setBounds(0, 0, (int)this.i0.width(), (int)this.i0.height());
      if (b.a) {
        this.N.setBounds(this.M.getBounds());
        this.N.jumpToCurrentState();
        drawable = this.N;
      } else {
        drawable = this.M;
      } 
      drawable.draw(paramCanvas);
      paramCanvas.translate(-f1, -f2);
    } 
  }
  
  private void f(Drawable paramDrawable) {
    if (paramDrawable != null)
      paramDrawable.setCallback(null); 
  }
  
  private boolean f0() {
    return (this.S && this.T != null && this.s0);
  }
  
  private void g(Canvas paramCanvas, Rect paramRect) {
    this.f0.setColor(this.q0);
    this.f0.setStyle(Paint.Style.FILL);
    this.i0.set(paramRect);
    if (!this.G0) {
      paramCanvas.drawRoundRect(this.i0, w(), w(), this.f0);
      return;
    } 
    a(new RectF(paramRect), this.k0);
    a(paramCanvas, this.f0, this.k0, d());
  }
  
  private boolean g0() {
    return (this.G && this.H != null);
  }
  
  private void h(Canvas paramCanvas, Rect paramRect) {
    Paint paint = this.g0;
    if (paint != null) {
      paint.setColor(b.g.f.a.c(-16777216, 127));
      paramCanvas.drawRect(paramRect, this.g0);
      if (g0() || f0()) {
        a(paramRect, this.i0);
        paramCanvas.drawRect(this.i0, this.g0);
      } 
      if (this.F != null)
        paramCanvas.drawLine(paramRect.left, paramRect.exactCenterY(), paramRect.right, paramRect.exactCenterY(), this.g0); 
      if (h0()) {
        c(paramRect, this.i0);
        paramCanvas.drawRect(this.i0, this.g0);
      } 
      this.g0.setColor(b.g.f.a.c(-65536, 127));
      b(paramRect, this.i0);
      paramCanvas.drawRect(this.i0, this.g0);
      this.g0.setColor(b.g.f.a.c(-16711936, 127));
      d(paramRect, this.i0);
      paramCanvas.drawRect(this.i0, this.g0);
    } 
  }
  
  private static boolean h(ColorStateList paramColorStateList) {
    return (paramColorStateList != null && paramColorStateList.isStateful());
  }
  
  private boolean h0() {
    return (this.L && this.M != null);
  }
  
  private void i(ColorStateList paramColorStateList) {
    if (this.y != paramColorStateList) {
      this.y = paramColorStateList;
      onStateChange(getState());
    } 
  }
  
  private void i(Canvas paramCanvas, Rect paramRect) {
    if (this.F != null) {
      Paint.Align align = a(paramRect, this.j0);
      e(paramRect, this.i0);
      if (this.l0.a() != null) {
        (this.l0.b()).drawableState = getState();
        this.l0.a(this.e0);
      } 
      this.l0.b().setTextAlign(align);
      int i = Math.round(this.l0.a(S().toString()));
      int k = Math.round(this.i0.width());
      int j = 0;
      if (i > k) {
        i = 1;
      } else {
        i = 0;
      } 
      if (i != 0) {
        j = paramCanvas.save();
        paramCanvas.clipRect(this.i0);
      } 
      CharSequence charSequence2 = this.F;
      CharSequence charSequence1 = charSequence2;
      if (i != 0) {
        charSequence1 = charSequence2;
        if (this.D0 != null)
          charSequence1 = TextUtils.ellipsize(charSequence2, this.l0.b(), this.i0.width(), this.D0); 
      } 
      k = charSequence1.length();
      PointF pointF = this.j0;
      paramCanvas.drawText(charSequence1, 0, k, pointF.x, pointF.y, (Paint)this.l0.b());
      if (i != 0)
        paramCanvas.restoreToCount(j); 
    } 
  }
  
  private void i0() {
    ColorStateList colorStateList;
    if (this.A0) {
      colorStateList = b.a(this.E);
    } else {
      colorStateList = null;
    } 
    this.B0 = colorStateList;
  }
  
  @TargetApi(21)
  private void j0() {
    this.N = (Drawable)new RippleDrawable(b.a(Q()), this.M, (Drawable)I0);
  }
  
  public ColorStateList A() {
    return this.I;
  }
  
  public void A(int paramInt) {
    a(new d(this.e0, paramInt));
  }
  
  public float B() {
    return this.A;
  }
  
  public void B(int paramInt) {
    p(this.e0.getResources().getDimension(paramInt));
  }
  
  public float C() {
    return this.W;
  }
  
  public void C(int paramInt) {
    q(this.e0.getResources().getDimension(paramInt));
  }
  
  public ColorStateList D() {
    return this.C;
  }
  
  public float E() {
    return this.D;
  }
  
  public Drawable F() {
    Drawable drawable = this.M;
    return (drawable != null) ? androidx.core.graphics.drawable.a.h(drawable) : null;
  }
  
  public CharSequence G() {
    return this.Q;
  }
  
  public float H() {
    return this.c0;
  }
  
  public float I() {
    return this.P;
  }
  
  public float J() {
    return this.b0;
  }
  
  public int[] K() {
    return this.z0;
  }
  
  public ColorStateList L() {
    return this.O;
  }
  
  public TextUtils.TruncateAt M() {
    return this.D0;
  }
  
  public h N() {
    return this.V;
  }
  
  public float O() {
    return this.Y;
  }
  
  public float P() {
    return this.X;
  }
  
  public ColorStateList Q() {
    return this.E;
  }
  
  public h R() {
    return this.U;
  }
  
  public CharSequence S() {
    return this.F;
  }
  
  public d T() {
    return this.l0.a();
  }
  
  public float U() {
    return this.a0;
  }
  
  public float V() {
    return this.Z;
  }
  
  public boolean W() {
    return this.A0;
  }
  
  public boolean X() {
    return this.R;
  }
  
  public boolean Y() {
    return e(this.M);
  }
  
  public boolean Z() {
    return this.L;
  }
  
  Paint.Align a(Rect paramRect, PointF paramPointF) {
    paramPointF.set(0.0F, 0.0F);
    Paint.Align align = Paint.Align.LEFT;
    if (this.F != null) {
      float f1 = this.W + s() + this.Z;
      if (androidx.core.graphics.drawable.a.e((Drawable)this) == 0) {
        paramPointF.x = paramRect.left + f1;
        align = Paint.Align.LEFT;
      } else {
        paramPointF.x = paramRect.right - f1;
        align = Paint.Align.RIGHT;
      } 
      paramPointF.y = paramRect.centerY() - c0();
    } 
    return align;
  }
  
  public void a() {
    a0();
    invalidateSelf();
  }
  
  public void a(RectF paramRectF) {
    d(getBounds(), paramRectF);
  }
  
  public void a(Drawable paramDrawable) {
    if (this.T != paramDrawable) {
      float f1 = s();
      this.T = paramDrawable;
      float f2 = s();
      f(this.T);
      d(this.T);
      invalidateSelf();
      if (f1 != f2)
        a0(); 
    } 
  }
  
  public void a(TextUtils.TruncateAt paramTruncateAt) {
    this.D0 = paramTruncateAt;
  }
  
  public void a(a parama) {
    this.C0 = new WeakReference<a>(parama);
  }
  
  public void a(h paramh) {
    this.V = paramh;
  }
  
  public void a(d paramd) {
    this.l0.a(paramd, this.e0);
  }
  
  public void a(CharSequence paramCharSequence) {
    if (this.Q != paramCharSequence) {
      this.Q = b.g.l.a.b().a(paramCharSequence);
      invalidateSelf();
    } 
  }
  
  public void a(boolean paramBoolean) {
    if (this.R != paramBoolean) {
      this.R = paramBoolean;
      float f1 = s();
      if (!paramBoolean && this.s0)
        this.s0 = false; 
      float f2 = s();
      invalidateSelf();
      if (f1 != f2)
        a0(); 
    } 
  }
  
  public boolean a(int[] paramArrayOfint) {
    if (!Arrays.equals(this.z0, paramArrayOfint)) {
      this.z0 = paramArrayOfint;
      if (h0())
        return a(getState(), paramArrayOfint); 
    } 
    return false;
  }
  
  protected void a0() {
    a a1 = this.C0.get();
    if (a1 != null)
      a1.a(); 
  }
  
  public void b(int paramInt) {
    a(this.e0.getResources().getBoolean(paramInt));
  }
  
  public void b(Drawable paramDrawable) {
    Drawable drawable = y();
    if (drawable != paramDrawable) {
      float f1 = s();
      if (paramDrawable != null) {
        paramDrawable = androidx.core.graphics.drawable.a.i(paramDrawable).mutate();
      } else {
        paramDrawable = null;
      } 
      this.H = paramDrawable;
      float f2 = s();
      f(drawable);
      if (g0())
        d(this.H); 
      invalidateSelf();
      if (f1 != f2)
        a0(); 
    } 
  }
  
  public void b(h paramh) {
    this.U = paramh;
  }
  
  public void b(CharSequence paramCharSequence) {
    CharSequence charSequence = paramCharSequence;
    if (paramCharSequence == null)
      charSequence = ""; 
    if (!TextUtils.equals(this.F, charSequence)) {
      this.F = charSequence;
      this.l0.a(true);
      invalidateSelf();
      a0();
    } 
  }
  
  public void b(boolean paramBoolean) {
    if (this.S != paramBoolean) {
      boolean bool;
      boolean bool1 = f0();
      this.S = paramBoolean;
      paramBoolean = f0();
      if (bool1 != paramBoolean) {
        bool = true;
      } else {
        bool = false;
      } 
      if (bool) {
        if (paramBoolean) {
          d(this.T);
        } else {
          f(this.T);
        } 
        invalidateSelf();
        a0();
      } 
    } 
  }
  
  boolean b0() {
    return this.E0;
  }
  
  public void c(int paramInt) {
    a(b.a.k.a.a.c(this.e0, paramInt));
  }
  
  public void c(ColorStateList paramColorStateList) {
    if (this.z != paramColorStateList) {
      this.z = paramColorStateList;
      onStateChange(getState());
    } 
  }
  
  public void c(Drawable paramDrawable) {
    Drawable drawable = F();
    if (drawable != paramDrawable) {
      float f1 = t();
      if (paramDrawable != null) {
        paramDrawable = androidx.core.graphics.drawable.a.i(paramDrawable).mutate();
      } else {
        paramDrawable = null;
      } 
      this.M = paramDrawable;
      if (b.a)
        j0(); 
      float f2 = t();
      f(drawable);
      if (h0())
        d(this.M); 
      invalidateSelf();
      if (f1 != f2)
        a0(); 
    } 
  }
  
  public void c(boolean paramBoolean) {
    if (this.G != paramBoolean) {
      boolean bool;
      boolean bool1 = g0();
      this.G = paramBoolean;
      paramBoolean = g0();
      if (bool1 != paramBoolean) {
        bool = true;
      } else {
        bool = false;
      } 
      if (bool) {
        if (paramBoolean) {
          d(this.H);
        } else {
          f(this.H);
        } 
        invalidateSelf();
        a0();
      } 
    } 
  }
  
  public void d(int paramInt) {
    b(this.e0.getResources().getBoolean(paramInt));
  }
  
  public void d(ColorStateList paramColorStateList) {
    this.K = true;
    if (this.I != paramColorStateList) {
      this.I = paramColorStateList;
      if (g0())
        androidx.core.graphics.drawable.a.a(this.H, paramColorStateList); 
      onStateChange(getState());
    } 
  }
  
  public void d(boolean paramBoolean) {
    if (this.L != paramBoolean) {
      boolean bool;
      boolean bool1 = h0();
      this.L = paramBoolean;
      paramBoolean = h0();
      if (bool1 != paramBoolean) {
        bool = true;
      } else {
        bool = false;
      } 
      if (bool) {
        if (paramBoolean) {
          d(this.M);
        } else {
          f(this.M);
        } 
        invalidateSelf();
        a0();
      } 
    } 
  }
  
  public void draw(Canvas paramCanvas) {
    Rect rect = getBounds();
    if (!rect.isEmpty()) {
      if (getAlpha() == 0)
        return; 
      int i = 0;
      int j = this.u0;
      if (j < 255)
        i = e.f.a.f.m.a.a(paramCanvas, rect.left, rect.top, rect.right, rect.bottom, j); 
      e(paramCanvas, rect);
      b(paramCanvas, rect);
      if (this.G0)
        super.draw(paramCanvas); 
      d(paramCanvas, rect);
      g(paramCanvas, rect);
      c(paramCanvas, rect);
      a(paramCanvas, rect);
      if (this.E0)
        i(paramCanvas, rect); 
      f(paramCanvas, rect);
      h(paramCanvas, rect);
      if (this.u0 < 255)
        paramCanvas.restoreToCount(i); 
    } 
  }
  
  @Deprecated
  public void e(float paramFloat) {
    if (this.B != paramFloat) {
      this.B = paramFloat;
      setShapeAppearanceModel(k().a(paramFloat));
    } 
  }
  
  public void e(int paramInt) {
    c(b.a.k.a.a.b(this.e0, paramInt));
  }
  
  public void e(ColorStateList paramColorStateList) {
    if (this.C != paramColorStateList) {
      this.C = paramColorStateList;
      if (this.G0)
        b(paramColorStateList); 
      onStateChange(getState());
    } 
  }
  
  void e(boolean paramBoolean) {
    this.E0 = paramBoolean;
  }
  
  public void f(float paramFloat) {
    if (this.d0 != paramFloat) {
      this.d0 = paramFloat;
      invalidateSelf();
      a0();
    } 
  }
  
  @Deprecated
  public void f(int paramInt) {
    e(this.e0.getResources().getDimension(paramInt));
  }
  
  public void f(ColorStateList paramColorStateList) {
    if (this.O != paramColorStateList) {
      this.O = paramColorStateList;
      if (h0())
        androidx.core.graphics.drawable.a.a(this.M, paramColorStateList); 
      onStateChange(getState());
    } 
  }
  
  public void f(boolean paramBoolean) {
    if (this.A0 != paramBoolean) {
      this.A0 = paramBoolean;
      i0();
      onStateChange(getState());
    } 
  }
  
  public void g(float paramFloat) {
    if (this.J != paramFloat) {
      float f1 = s();
      this.J = paramFloat;
      paramFloat = s();
      invalidateSelf();
      if (f1 != paramFloat)
        a0(); 
    } 
  }
  
  public void g(int paramInt) {
    f(this.e0.getResources().getDimension(paramInt));
  }
  
  public void g(ColorStateList paramColorStateList) {
    if (this.E != paramColorStateList) {
      this.E = paramColorStateList;
      i0();
      onStateChange(getState());
    } 
  }
  
  public int getAlpha() {
    return this.u0;
  }
  
  public ColorFilter getColorFilter() {
    return this.v0;
  }
  
  public int getIntrinsicHeight() {
    return (int)this.A;
  }
  
  public int getIntrinsicWidth() {
    return Math.min(Math.round(this.W + s() + this.Z + this.l0.a(S().toString()) + this.a0 + t() + this.d0), this.F0);
  }
  
  public int getOpacity() {
    return -3;
  }
  
  @TargetApi(21)
  public void getOutline(Outline paramOutline) {
    if (this.G0) {
      super.getOutline(paramOutline);
      return;
    } 
    Rect rect = getBounds();
    if (!rect.isEmpty()) {
      paramOutline.setRoundRect(rect, this.B);
    } else {
      paramOutline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.B);
    } 
    paramOutline.setAlpha(getAlpha() / 255.0F);
  }
  
  public void h(float paramFloat) {
    if (this.A != paramFloat) {
      this.A = paramFloat;
      invalidateSelf();
      a0();
    } 
  }
  
  public void h(int paramInt) {
    b(b.a.k.a.a.c(this.e0, paramInt));
  }
  
  public void i(float paramFloat) {
    if (this.W != paramFloat) {
      this.W = paramFloat;
      invalidateSelf();
      a0();
    } 
  }
  
  public void i(int paramInt) {
    g(this.e0.getResources().getDimension(paramInt));
  }
  
  public void invalidateDrawable(Drawable paramDrawable) {
    Drawable.Callback callback = getCallback();
    if (callback != null)
      callback.invalidateDrawable((Drawable)this); 
  }
  
  public boolean isStateful() {
    return (h(this.y) || h(this.z) || h(this.C) || (this.A0 && h(this.B0)) || b(this.l0.a()) || d0() || e(this.H) || e(this.T) || h(this.x0));
  }
  
  public void j(float paramFloat) {
    if (this.D != paramFloat) {
      this.D = paramFloat;
      this.f0.setStrokeWidth(paramFloat);
      if (this.G0)
        d(paramFloat); 
      invalidateSelf();
    } 
  }
  
  public void j(int paramInt) {
    d(b.a.k.a.a.b(this.e0, paramInt));
  }
  
  public void k(float paramFloat) {
    if (this.c0 != paramFloat) {
      this.c0 = paramFloat;
      invalidateSelf();
      if (h0())
        a0(); 
    } 
  }
  
  public void k(int paramInt) {
    c(this.e0.getResources().getBoolean(paramInt));
  }
  
  public void l(float paramFloat) {
    if (this.P != paramFloat) {
      this.P = paramFloat;
      invalidateSelf();
      if (h0())
        a0(); 
    } 
  }
  
  public void l(int paramInt) {
    h(this.e0.getResources().getDimension(paramInt));
  }
  
  public void m(float paramFloat) {
    if (this.b0 != paramFloat) {
      this.b0 = paramFloat;
      invalidateSelf();
      if (h0())
        a0(); 
    } 
  }
  
  public void m(int paramInt) {
    i(this.e0.getResources().getDimension(paramInt));
  }
  
  public void n(float paramFloat) {
    if (this.Y != paramFloat) {
      float f1 = s();
      this.Y = paramFloat;
      paramFloat = s();
      invalidateSelf();
      if (f1 != paramFloat)
        a0(); 
    } 
  }
  
  public void n(int paramInt) {
    e(b.a.k.a.a.b(this.e0, paramInt));
  }
  
  public void o(float paramFloat) {
    if (this.X != paramFloat) {
      float f1 = s();
      this.X = paramFloat;
      paramFloat = s();
      invalidateSelf();
      if (f1 != paramFloat)
        a0(); 
    } 
  }
  
  public void o(int paramInt) {
    j(this.e0.getResources().getDimension(paramInt));
  }
  
  public boolean onLayoutDirectionChanged(int paramInt) {
    boolean bool2 = super.onLayoutDirectionChanged(paramInt);
    boolean bool1 = bool2;
    if (g0())
      bool1 = bool2 | androidx.core.graphics.drawable.a.a(this.H, paramInt); 
    bool2 = bool1;
    if (f0())
      bool2 = bool1 | androidx.core.graphics.drawable.a.a(this.T, paramInt); 
    bool1 = bool2;
    if (h0())
      bool1 = bool2 | androidx.core.graphics.drawable.a.a(this.M, paramInt); 
    if (bool1)
      invalidateSelf(); 
    return true;
  }
  
  protected boolean onLevelChange(int paramInt) {
    boolean bool2 = super.onLevelChange(paramInt);
    boolean bool1 = bool2;
    if (g0())
      bool1 = bool2 | this.H.setLevel(paramInt); 
    bool2 = bool1;
    if (f0())
      bool2 = bool1 | this.T.setLevel(paramInt); 
    bool1 = bool2;
    if (h0())
      bool1 = bool2 | this.M.setLevel(paramInt); 
    if (bool1)
      invalidateSelf(); 
    return bool1;
  }
  
  public boolean onStateChange(int[] paramArrayOfint) {
    if (this.G0)
      super.onStateChange(paramArrayOfint); 
    return a(paramArrayOfint, K());
  }
  
  public void p(float paramFloat) {
    if (this.a0 != paramFloat) {
      this.a0 = paramFloat;
      invalidateSelf();
      a0();
    } 
  }
  
  public void p(int paramInt) {
    k(this.e0.getResources().getDimension(paramInt));
  }
  
  public void q(float paramFloat) {
    if (this.Z != paramFloat) {
      this.Z = paramFloat;
      invalidateSelf();
      a0();
    } 
  }
  
  public void q(int paramInt) {
    c(b.a.k.a.a.c(this.e0, paramInt));
  }
  
  public void r(int paramInt) {
    l(this.e0.getResources().getDimension(paramInt));
  }
  
  float s() {
    return (g0() || f0()) ? (this.X + this.J + this.Y) : 0.0F;
  }
  
  public void s(int paramInt) {
    m(this.e0.getResources().getDimension(paramInt));
  }
  
  public void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong) {
    Drawable.Callback callback = getCallback();
    if (callback != null)
      callback.scheduleDrawable((Drawable)this, paramRunnable, paramLong); 
  }
  
  public void setAlpha(int paramInt) {
    if (this.u0 != paramInt) {
      this.u0 = paramInt;
      invalidateSelf();
    } 
  }
  
  public void setColorFilter(ColorFilter paramColorFilter) {
    if (this.v0 != paramColorFilter) {
      this.v0 = paramColorFilter;
      invalidateSelf();
    } 
  }
  
  public void setTintList(ColorStateList paramColorStateList) {
    if (this.x0 != paramColorStateList) {
      this.x0 = paramColorStateList;
      onStateChange(getState());
    } 
  }
  
  public void setTintMode(PorterDuff.Mode paramMode) {
    if (this.y0 != paramMode) {
      this.y0 = paramMode;
      this.w0 = e.f.a.f.s.a.a((Drawable)this, this.x0, paramMode);
      invalidateSelf();
    } 
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2) {
    boolean bool2 = super.setVisible(paramBoolean1, paramBoolean2);
    boolean bool1 = bool2;
    if (g0())
      bool1 = bool2 | this.H.setVisible(paramBoolean1, paramBoolean2); 
    bool2 = bool1;
    if (f0())
      bool2 = bool1 | this.T.setVisible(paramBoolean1, paramBoolean2); 
    bool1 = bool2;
    if (h0())
      bool1 = bool2 | this.M.setVisible(paramBoolean1, paramBoolean2); 
    if (bool1)
      invalidateSelf(); 
    return bool1;
  }
  
  float t() {
    return h0() ? (this.b0 + this.P + this.c0) : 0.0F;
  }
  
  public void t(int paramInt) {
    f(b.a.k.a.a.b(this.e0, paramInt));
  }
  
  public Drawable u() {
    return this.T;
  }
  
  public void u(int paramInt) {
    a(h.a(this.e0, paramInt));
  }
  
  public void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable) {
    Drawable.Callback callback = getCallback();
    if (callback != null)
      callback.unscheduleDrawable((Drawable)this, paramRunnable); 
  }
  
  public ColorStateList v() {
    return this.z;
  }
  
  public void v(int paramInt) {
    n(this.e0.getResources().getDimension(paramInt));
  }
  
  public float w() {
    return this.G0 ? m() : this.B;
  }
  
  public void w(int paramInt) {
    o(this.e0.getResources().getDimension(paramInt));
  }
  
  public float x() {
    return this.d0;
  }
  
  public void x(int paramInt) {
    this.F0 = paramInt;
  }
  
  public Drawable y() {
    Drawable drawable = this.H;
    return (drawable != null) ? androidx.core.graphics.drawable.a.h(drawable) : null;
  }
  
  public void y(int paramInt) {
    g(b.a.k.a.a.b(this.e0, paramInt));
  }
  
  public float z() {
    return this.J;
  }
  
  public void z(int paramInt) {
    b(h.a(this.e0, paramInt));
  }
  
  public static interface a {
    void a();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/chip/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */