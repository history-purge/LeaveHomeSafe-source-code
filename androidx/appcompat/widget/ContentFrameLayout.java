package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import b.g.m.v;

public class ContentFrameLayout extends FrameLayout {
  private TypedValue c;
  
  private TypedValue d;
  
  private TypedValue e;
  
  private TypedValue f;
  
  private TypedValue g;
  
  private TypedValue h;
  
  private final Rect i = new Rect();
  
  private a j;
  
  public ContentFrameLayout(Context paramContext) {
    this(paramContext, null);
  }
  
  public ContentFrameLayout(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ContentFrameLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.i.set(paramInt1, paramInt2, paramInt3, paramInt4);
    if (v.I((View)this))
      requestLayout(); 
  }
  
  public void a(Rect paramRect) {
    fitSystemWindows(paramRect);
  }
  
  public TypedValue getFixedHeightMajor() {
    if (this.g == null)
      this.g = new TypedValue(); 
    return this.g;
  }
  
  public TypedValue getFixedHeightMinor() {
    if (this.h == null)
      this.h = new TypedValue(); 
    return this.h;
  }
  
  public TypedValue getFixedWidthMajor() {
    if (this.e == null)
      this.e = new TypedValue(); 
    return this.e;
  }
  
  public TypedValue getFixedWidthMinor() {
    if (this.f == null)
      this.f = new TypedValue(); 
    return this.f;
  }
  
  public TypedValue getMinWidthMajor() {
    if (this.c == null)
      this.c = new TypedValue(); 
    return this.c;
  }
  
  public TypedValue getMinWidthMinor() {
    if (this.d == null)
      this.d = new TypedValue(); 
    return this.d;
  }
  
  protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    a a1 = this.j;
    if (a1 != null)
      a1.a(); 
  }
  
  protected void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    a a1 = this.j;
    if (a1 != null)
      a1.onDetachedFromWindow(); 
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual getContext : ()Landroid/content/Context;
    //   4: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   7: invokevirtual getDisplayMetrics : ()Landroid/util/DisplayMetrics;
    //   10: astore #11
    //   12: aload #11
    //   14: getfield widthPixels : I
    //   17: istore #4
    //   19: aload #11
    //   21: getfield heightPixels : I
    //   24: istore #5
    //   26: iconst_1
    //   27: istore #8
    //   29: iload #4
    //   31: iload #5
    //   33: if_icmpge -> 42
    //   36: iconst_1
    //   37: istore #4
    //   39: goto -> 45
    //   42: iconst_0
    //   43: istore #4
    //   45: iload_1
    //   46: invokestatic getMode : (I)I
    //   49: istore #9
    //   51: iload_2
    //   52: invokestatic getMode : (I)I
    //   55: istore #7
    //   57: iload #9
    //   59: ldc -2147483648
    //   61: if_icmpne -> 198
    //   64: iload #4
    //   66: ifeq -> 78
    //   69: aload_0
    //   70: getfield f : Landroid/util/TypedValue;
    //   73: astore #10
    //   75: goto -> 84
    //   78: aload_0
    //   79: getfield e : Landroid/util/TypedValue;
    //   82: astore #10
    //   84: aload #10
    //   86: ifnull -> 198
    //   89: aload #10
    //   91: getfield type : I
    //   94: istore #5
    //   96: iload #5
    //   98: ifeq -> 198
    //   101: iload #5
    //   103: iconst_5
    //   104: if_icmpne -> 122
    //   107: aload #10
    //   109: aload #11
    //   111: invokevirtual getDimension : (Landroid/util/DisplayMetrics;)F
    //   114: fstore_3
    //   115: fload_3
    //   116: f2i
    //   117: istore #5
    //   119: goto -> 154
    //   122: iload #5
    //   124: bipush #6
    //   126: if_icmpne -> 151
    //   129: aload #11
    //   131: getfield widthPixels : I
    //   134: istore #5
    //   136: aload #10
    //   138: iload #5
    //   140: i2f
    //   141: iload #5
    //   143: i2f
    //   144: invokevirtual getFraction : (FF)F
    //   147: fstore_3
    //   148: goto -> 115
    //   151: iconst_0
    //   152: istore #5
    //   154: iload #5
    //   156: ifle -> 198
    //   159: aload_0
    //   160: getfield i : Landroid/graphics/Rect;
    //   163: astore #10
    //   165: iload #5
    //   167: aload #10
    //   169: getfield left : I
    //   172: aload #10
    //   174: getfield right : I
    //   177: iadd
    //   178: isub
    //   179: iload_1
    //   180: invokestatic getSize : (I)I
    //   183: invokestatic min : (II)I
    //   186: ldc 1073741824
    //   188: invokestatic makeMeasureSpec : (II)I
    //   191: istore #6
    //   193: iconst_1
    //   194: istore_1
    //   195: goto -> 203
    //   198: iload_1
    //   199: istore #6
    //   201: iconst_0
    //   202: istore_1
    //   203: iload_2
    //   204: istore #5
    //   206: iload #7
    //   208: ldc -2147483648
    //   210: if_icmpne -> 351
    //   213: iload #4
    //   215: ifeq -> 227
    //   218: aload_0
    //   219: getfield g : Landroid/util/TypedValue;
    //   222: astore #10
    //   224: goto -> 233
    //   227: aload_0
    //   228: getfield h : Landroid/util/TypedValue;
    //   231: astore #10
    //   233: iload_2
    //   234: istore #5
    //   236: aload #10
    //   238: ifnull -> 351
    //   241: aload #10
    //   243: getfield type : I
    //   246: istore #7
    //   248: iload_2
    //   249: istore #5
    //   251: iload #7
    //   253: ifeq -> 351
    //   256: iload #7
    //   258: iconst_5
    //   259: if_icmpne -> 277
    //   262: aload #10
    //   264: aload #11
    //   266: invokevirtual getDimension : (Landroid/util/DisplayMetrics;)F
    //   269: fstore_3
    //   270: fload_3
    //   271: f2i
    //   272: istore #7
    //   274: goto -> 309
    //   277: iload #7
    //   279: bipush #6
    //   281: if_icmpne -> 306
    //   284: aload #11
    //   286: getfield heightPixels : I
    //   289: istore #5
    //   291: aload #10
    //   293: iload #5
    //   295: i2f
    //   296: iload #5
    //   298: i2f
    //   299: invokevirtual getFraction : (FF)F
    //   302: fstore_3
    //   303: goto -> 270
    //   306: iconst_0
    //   307: istore #7
    //   309: iload_2
    //   310: istore #5
    //   312: iload #7
    //   314: ifle -> 351
    //   317: aload_0
    //   318: getfield i : Landroid/graphics/Rect;
    //   321: astore #10
    //   323: iload #7
    //   325: aload #10
    //   327: getfield top : I
    //   330: aload #10
    //   332: getfield bottom : I
    //   335: iadd
    //   336: isub
    //   337: iload_2
    //   338: invokestatic getSize : (I)I
    //   341: invokestatic min : (II)I
    //   344: ldc 1073741824
    //   346: invokestatic makeMeasureSpec : (II)I
    //   349: istore #5
    //   351: aload_0
    //   352: iload #6
    //   354: iload #5
    //   356: invokespecial onMeasure : (II)V
    //   359: aload_0
    //   360: invokevirtual getMeasuredWidth : ()I
    //   363: istore #7
    //   365: iload #7
    //   367: ldc 1073741824
    //   369: invokestatic makeMeasureSpec : (II)I
    //   372: istore #6
    //   374: iload_1
    //   375: ifne -> 511
    //   378: iload #9
    //   380: ldc -2147483648
    //   382: if_icmpne -> 511
    //   385: iload #4
    //   387: ifeq -> 399
    //   390: aload_0
    //   391: getfield d : Landroid/util/TypedValue;
    //   394: astore #10
    //   396: goto -> 405
    //   399: aload_0
    //   400: getfield c : Landroid/util/TypedValue;
    //   403: astore #10
    //   405: aload #10
    //   407: ifnull -> 511
    //   410: aload #10
    //   412: getfield type : I
    //   415: istore_1
    //   416: iload_1
    //   417: ifeq -> 511
    //   420: iload_1
    //   421: iconst_5
    //   422: if_icmpne -> 439
    //   425: aload #10
    //   427: aload #11
    //   429: invokevirtual getDimension : (Landroid/util/DisplayMetrics;)F
    //   432: fstore_3
    //   433: fload_3
    //   434: f2i
    //   435: istore_1
    //   436: goto -> 466
    //   439: iload_1
    //   440: bipush #6
    //   442: if_icmpne -> 464
    //   445: aload #11
    //   447: getfield widthPixels : I
    //   450: istore_1
    //   451: aload #10
    //   453: iload_1
    //   454: i2f
    //   455: iload_1
    //   456: i2f
    //   457: invokevirtual getFraction : (FF)F
    //   460: fstore_3
    //   461: goto -> 433
    //   464: iconst_0
    //   465: istore_1
    //   466: iload_1
    //   467: istore_2
    //   468: iload_1
    //   469: ifle -> 492
    //   472: aload_0
    //   473: getfield i : Landroid/graphics/Rect;
    //   476: astore #10
    //   478: iload_1
    //   479: aload #10
    //   481: getfield left : I
    //   484: aload #10
    //   486: getfield right : I
    //   489: iadd
    //   490: isub
    //   491: istore_2
    //   492: iload #7
    //   494: iload_2
    //   495: if_icmpge -> 511
    //   498: iload_2
    //   499: ldc 1073741824
    //   501: invokestatic makeMeasureSpec : (II)I
    //   504: istore_2
    //   505: iload #8
    //   507: istore_1
    //   508: goto -> 516
    //   511: iconst_0
    //   512: istore_1
    //   513: iload #6
    //   515: istore_2
    //   516: iload_1
    //   517: ifeq -> 527
    //   520: aload_0
    //   521: iload_2
    //   522: iload #5
    //   524: invokespecial onMeasure : (II)V
    //   527: return
  }
  
  public void setAttachListener(a parama) {
    this.j = parama;
  }
  
  public static interface a {
    void a();
    
    void onDetachedFromWindow();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/widget/ContentFrameLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */