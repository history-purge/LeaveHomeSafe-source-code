package com.facebook.react.views.scroll;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.OverScroller;
import android.widget.ScrollView;
import b.g.m.v;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.events.f;
import com.facebook.react.uimanager.j0;
import com.facebook.react.uimanager.k;
import com.facebook.react.uimanager.q;
import com.facebook.react.uimanager.t;
import com.facebook.react.uimanager.u;
import java.lang.reflect.Field;
import java.util.List;

public class e extends ScrollView implements t, ViewGroup.OnHierarchyChangeListener, View.OnLayoutChangeListener {
  private static Field C;
  
  private static boolean D = false;
  
  private com.facebook.react.views.view.e A;
  
  private j0 B;
  
  private final b c = new b();
  
  private final OverScroller d;
  
  private final j e = new j();
  
  private final Rect f = new Rect();
  
  private boolean g;
  
  private Rect h;
  
  private String i = "hidden";
  
  private boolean j;
  
  private boolean k = false;
  
  private Runnable l;
  
  private boolean m;
  
  private boolean n = true;
  
  private boolean o;
  
  private a p = null;
  
  private String q;
  
  private Drawable r;
  
  private int s = 0;
  
  private boolean t = false;
  
  private int u = 0;
  
  private float v = 0.985F;
  
  private List<Integer> w;
  
  private boolean x = true;
  
  private boolean y = true;
  
  private View z;
  
  public e(ReactContext paramReactContext, a parama) {
    super((Context)paramReactContext);
    this.p = parama;
    this.A = new com.facebook.react.views.view.e((View)this);
    this.d = getOverScrollerFromParent();
    setOnHierarchyChangeListener(this);
    setScrollBarStyle(33554432);
  }
  
  private void a(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual getChildCount : ()I
    //   4: ifgt -> 8
    //   7: return
    //   8: aload_0
    //   9: getfield u : I
    //   12: ifne -> 28
    //   15: aload_0
    //   16: getfield w : Ljava/util/List;
    //   19: ifnonnull -> 28
    //   22: aload_0
    //   23: iload_1
    //   24: invokespecial c : (I)V
    //   27: return
    //   28: aload_0
    //   29: invokespecial getMaxScrollY : ()I
    //   32: istore #14
    //   34: aload_0
    //   35: iload_1
    //   36: invokespecial b : (I)I
    //   39: istore #10
    //   41: aload_0
    //   42: getfield t : Z
    //   45: ifeq -> 54
    //   48: aload_0
    //   49: invokevirtual getScrollY : ()I
    //   52: istore #10
    //   54: aload_0
    //   55: invokevirtual getHeight : ()I
    //   58: istore #18
    //   60: aload_0
    //   61: invokevirtual getPaddingBottom : ()I
    //   64: istore #19
    //   66: aload_0
    //   67: invokevirtual getPaddingTop : ()I
    //   70: istore #20
    //   72: aload_0
    //   73: getfield w : Ljava/util/List;
    //   76: astore #21
    //   78: aload #21
    //   80: ifnull -> 264
    //   83: aload #21
    //   85: iconst_0
    //   86: invokeinterface get : (I)Ljava/lang/Object;
    //   91: checkcast java/lang/Integer
    //   94: invokevirtual intValue : ()I
    //   97: istore #16
    //   99: aload_0
    //   100: getfield w : Ljava/util/List;
    //   103: astore #21
    //   105: aload #21
    //   107: aload #21
    //   109: invokeinterface size : ()I
    //   114: iconst_1
    //   115: isub
    //   116: invokeinterface get : (I)Ljava/lang/Object;
    //   121: checkcast java/lang/Integer
    //   124: invokevirtual intValue : ()I
    //   127: istore #17
    //   129: iload #14
    //   131: istore #9
    //   133: iconst_0
    //   134: istore #11
    //   136: iconst_0
    //   137: istore #8
    //   139: iload #11
    //   141: aload_0
    //   142: getfield w : Ljava/util/List;
    //   145: invokeinterface size : ()I
    //   150: if_icmpge -> 253
    //   153: aload_0
    //   154: getfield w : Ljava/util/List;
    //   157: iload #11
    //   159: invokeinterface get : (I)Ljava/lang/Object;
    //   164: checkcast java/lang/Integer
    //   167: invokevirtual intValue : ()I
    //   170: istore #13
    //   172: iload #8
    //   174: istore #12
    //   176: iload #13
    //   178: iload #10
    //   180: if_icmpgt -> 204
    //   183: iload #8
    //   185: istore #12
    //   187: iload #10
    //   189: iload #13
    //   191: isub
    //   192: iload #10
    //   194: iload #8
    //   196: isub
    //   197: if_icmpge -> 204
    //   200: iload #13
    //   202: istore #12
    //   204: iload #9
    //   206: istore #15
    //   208: iload #13
    //   210: iload #10
    //   212: if_icmplt -> 236
    //   215: iload #9
    //   217: istore #15
    //   219: iload #13
    //   221: iload #10
    //   223: isub
    //   224: iload #9
    //   226: iload #10
    //   228: isub
    //   229: if_icmpge -> 236
    //   232: iload #13
    //   234: istore #15
    //   236: iload #11
    //   238: iconst_1
    //   239: iadd
    //   240: istore #11
    //   242: iload #12
    //   244: istore #8
    //   246: iload #15
    //   248: istore #9
    //   250: goto -> 139
    //   253: iload #17
    //   255: istore #11
    //   257: iload #16
    //   259: istore #12
    //   261: goto -> 342
    //   264: aload_0
    //   265: invokespecial getSnapInterval : ()I
    //   268: i2d
    //   269: dstore_2
    //   270: iload #10
    //   272: i2d
    //   273: dstore #4
    //   275: dload #4
    //   277: invokestatic isNaN : (D)Z
    //   280: pop
    //   281: dload_2
    //   282: invokestatic isNaN : (D)Z
    //   285: pop
    //   286: dload #4
    //   288: dload_2
    //   289: ddiv
    //   290: dstore #4
    //   292: dload #4
    //   294: invokestatic floor : (D)D
    //   297: dstore #6
    //   299: dload_2
    //   300: invokestatic isNaN : (D)Z
    //   303: pop
    //   304: dload #6
    //   306: dload_2
    //   307: dmul
    //   308: d2i
    //   309: istore #8
    //   311: dload #4
    //   313: invokestatic ceil : (D)D
    //   316: dstore #4
    //   318: dload_2
    //   319: invokestatic isNaN : (D)Z
    //   322: pop
    //   323: dload #4
    //   325: dload_2
    //   326: dmul
    //   327: d2i
    //   328: iload #14
    //   330: invokestatic min : (II)I
    //   333: istore #9
    //   335: iload #14
    //   337: istore #11
    //   339: iconst_0
    //   340: istore #12
    //   342: iload #10
    //   344: iload #8
    //   346: isub
    //   347: istore #15
    //   349: iload #9
    //   351: iload #10
    //   353: isub
    //   354: istore #16
    //   356: iload #15
    //   358: iload #16
    //   360: if_icmpge -> 370
    //   363: iload #8
    //   365: istore #13
    //   367: goto -> 374
    //   370: iload #9
    //   372: istore #13
    //   374: aload_0
    //   375: getfield y : Z
    //   378: ifne -> 407
    //   381: iload #10
    //   383: iload #11
    //   385: if_icmplt -> 407
    //   388: aload_0
    //   389: invokevirtual getScrollY : ()I
    //   392: iload #11
    //   394: if_icmplt -> 400
    //   397: goto -> 430
    //   400: iload #11
    //   402: istore #8
    //   404: goto -> 502
    //   407: aload_0
    //   408: getfield x : Z
    //   411: ifne -> 444
    //   414: iload #10
    //   416: iload #12
    //   418: if_icmpgt -> 444
    //   421: aload_0
    //   422: invokevirtual getScrollY : ()I
    //   425: iload #12
    //   427: if_icmpgt -> 437
    //   430: iload #10
    //   432: istore #8
    //   434: goto -> 502
    //   437: iload #12
    //   439: istore #8
    //   441: goto -> 502
    //   444: iload_1
    //   445: ifle -> 473
    //   448: iload #16
    //   450: i2d
    //   451: dstore_2
    //   452: dload_2
    //   453: invokestatic isNaN : (D)Z
    //   456: pop
    //   457: iload_1
    //   458: dload_2
    //   459: ldc2_w 10.0
    //   462: dmul
    //   463: d2i
    //   464: iadd
    //   465: istore_1
    //   466: iload #9
    //   468: istore #8
    //   470: goto -> 502
    //   473: iload_1
    //   474: ifge -> 498
    //   477: iload #15
    //   479: i2d
    //   480: dstore_2
    //   481: dload_2
    //   482: invokestatic isNaN : (D)Z
    //   485: pop
    //   486: iload_1
    //   487: dload_2
    //   488: ldc2_w 10.0
    //   491: dmul
    //   492: d2i
    //   493: isub
    //   494: istore_1
    //   495: goto -> 502
    //   498: iload #13
    //   500: istore #8
    //   502: iconst_0
    //   503: iload #8
    //   505: invokestatic max : (II)I
    //   508: iload #14
    //   510: invokestatic min : (II)I
    //   513: istore #9
    //   515: aload_0
    //   516: getfield d : Landroid/widget/OverScroller;
    //   519: astore #21
    //   521: aload #21
    //   523: ifnull -> 616
    //   526: aload_0
    //   527: iconst_1
    //   528: putfield g : Z
    //   531: aload_0
    //   532: invokevirtual getScrollX : ()I
    //   535: istore #10
    //   537: aload_0
    //   538: invokevirtual getScrollY : ()I
    //   541: istore #11
    //   543: iload_1
    //   544: ifeq -> 550
    //   547: goto -> 558
    //   550: iload #9
    //   552: aload_0
    //   553: invokevirtual getScrollY : ()I
    //   556: isub
    //   557: istore_1
    //   558: iload #9
    //   560: ifeq -> 579
    //   563: iload #9
    //   565: iload #14
    //   567: if_icmpne -> 573
    //   570: goto -> 579
    //   573: iconst_0
    //   574: istore #8
    //   576: goto -> 591
    //   579: iload #18
    //   581: iload #19
    //   583: isub
    //   584: iload #20
    //   586: isub
    //   587: iconst_2
    //   588: idiv
    //   589: istore #8
    //   591: aload #21
    //   593: iload #10
    //   595: iload #11
    //   597: iconst_0
    //   598: iload_1
    //   599: iconst_0
    //   600: iconst_0
    //   601: iload #9
    //   603: iload #9
    //   605: iconst_0
    //   606: iload #8
    //   608: invokevirtual fling : (IIIIIIIIII)V
    //   611: aload_0
    //   612: invokevirtual postInvalidateOnAnimation : ()V
    //   615: return
    //   616: aload_0
    //   617: aload_0
    //   618: invokevirtual getScrollX : ()I
    //   621: iload #9
    //   623: invokevirtual b : (II)V
    //   626: return
  }
  
  private void a(View paramView) {
    Rect rect = new Rect();
    paramView.getDrawingRect(rect);
    offsetDescendantRectToMyCoords(paramView, rect);
    int i = computeScrollDeltaToGetChildRectOnScreen(rect);
    if (i != 0)
      scrollBy(0, i); 
  }
  
  private int b(int paramInt) {
    OverScroller overScroller = new OverScroller(getContext());
    overScroller.setFriction(1.0F - this.v);
    int i = getMaxScrollY();
    int k = getHeight();
    int m = getPaddingBottom();
    int n = getPaddingTop();
    overScroller.fling(getScrollX(), getScrollY(), 0, paramInt, 0, 0, 0, i, 0, (k - m - n) / 2);
    return overScroller.getFinalY();
  }
  
  private void c() {
    if (e()) {
      e.e.m.a.a.a(this.p);
      e.e.m.a.a.a(this.q);
      this.p.b(this.q);
    } 
  }
  
  private void c(int paramInt) {
    int i;
    int k;
    double d2 = getSnapInterval();
    double d1 = getScrollY();
    double d3 = b(paramInt);
    Double.isNaN(d1);
    Double.isNaN(d2);
    double d4 = d1 / d2;
    int m = (int)Math.floor(d4);
    int i1 = (int)Math.ceil(d4);
    int n = (int)Math.round(d4);
    Double.isNaN(d3);
    Double.isNaN(d2);
    int i2 = (int)Math.round(d3 / d2);
    if (paramInt > 0 && i1 == m) {
      k = i1 + 1;
      i = m;
    } else {
      i = m;
      k = i1;
      if (paramInt < 0) {
        i = m;
        k = i1;
        if (m == i1) {
          i = m - 1;
          k = i1;
        } 
      } 
    } 
    if (paramInt > 0 && n < k && i2 > i) {
      m = k;
    } else {
      m = n;
      if (paramInt < 0) {
        m = n;
        if (n > i) {
          m = n;
          if (i2 < k)
            m = i; 
        } 
      } 
    } 
    d3 = m;
    Double.isNaN(d3);
    Double.isNaN(d2);
    d2 = d3 * d2;
    if (d2 != d1) {
      this.g = true;
      b(getScrollX(), (int)d2);
    } 
  }
  
  private void c(int paramInt1, int paramInt2) {
    if (!this.o && !this.k && !e())
      return; 
    if (this.l != null)
      return; 
    if (this.o) {
      d();
      g.a((ViewGroup)this, paramInt1, paramInt2);
    } 
    this.g = false;
    this.l = new a(this);
    v.a((View)this, this.l, 20L);
  }
  
  private void d() {
    if (e()) {
      e.e.m.a.a.a(this.p);
      e.e.m.a.a.a(this.q);
      this.p.a(this.q);
    } 
  }
  
  private void d(int paramInt1, int paramInt2) {
    if (this.B == null)
      return; 
    WritableNativeMap writableNativeMap = new WritableNativeMap();
    writableNativeMap.putDouble("contentOffsetLeft", q.a(paramInt1));
    writableNativeMap.putDouble("contentOffsetTop", q.a(paramInt2));
    this.B.a((WritableMap)writableNativeMap);
  }
  
  private boolean e() {
    if (this.p != null) {
      String str = this.q;
      if (str != null && !str.isEmpty())
        return true; 
    } 
    return false;
  }
  
  private int getMaxScrollY() {
    return Math.max(0, this.z.getHeight() - getHeight() - getPaddingBottom() - getPaddingTop());
  }
  
  private OverScroller getOverScrollerFromParent() {
    if (!D) {
      D = true;
      try {
        C = ScrollView.class.getDeclaredField("mScroller");
        C.setAccessible(true);
      } catch (NoSuchFieldException noSuchFieldException) {
        e.e.e.e.a.e("ReactNative", "Failed to get mScroller field for ScrollView! This app will exhibit the bounce-back scrolling bug :(");
      } 
    } 
    Field field = C;
    if (field != null)
      try {
        Object object = field.get(this);
        if (object instanceof OverScroller)
          return (OverScroller)object; 
        e.e.e.e.a.e("ReactNative", "Failed to cast mScroller field in ScrollView (probably due to OEM changes to AOSP)! This app will exhibit the bounce-back scrolling bug :(");
        return null;
      } catch (IllegalAccessException illegalAccessException) {
        throw new RuntimeException("Failed to get mScroller from ScrollView!", illegalAccessException);
      }  
    return null;
  }
  
  private int getSnapInterval() {
    int i = this.u;
    return (i != 0) ? i : getHeight();
  }
  
  public void a() {
    if (!this.m)
      return; 
    e.e.m.a.a.a(this.h);
    u.a((View)this, this.h);
    View view = getChildAt(0);
    if (view instanceof t)
      ((t)view).a(); 
  }
  
  public void a(float paramFloat, int paramInt) {
    this.A.a(paramFloat, paramInt);
  }
  
  public void a(int paramInt, float paramFloat) {
    this.A.a(paramInt, paramFloat);
  }
  
  public void a(int paramInt, float paramFloat1, float paramFloat2) {
    this.A.a(paramInt, paramFloat1, paramFloat2);
  }
  
  public void a(int paramInt1, int paramInt2) {
    scrollTo(paramInt1, paramInt2);
    d(paramInt1, paramInt2);
  }
  
  public void a(Rect paramRect) {
    Rect rect = this.h;
    e.e.m.a.a.a(rect);
    paramRect.set(rect);
  }
  
  public void a(j0 paramj0) {
    this.B = paramj0;
  }
  
  public void b() {
    awakenScrollBars();
  }
  
  public void b(int paramInt1, int paramInt2) {
    smoothScrollTo(paramInt1, paramInt2);
    d(paramInt1, paramInt2);
  }
  
  public void draw(Canvas paramCanvas) {
    int i = this.s;
    byte b1 = 0;
    if (i != 0) {
      View view = getChildAt(0);
      if (this.r != null && view != null && view.getBottom() < getHeight()) {
        this.r.setBounds(0, view.getBottom(), getWidth(), getHeight());
        this.r.draw(paramCanvas);
      } 
    } 
    getDrawingRect(this.f);
    String str = this.i;
    if (str.hashCode() != 466743410 || !str.equals("visible"))
      b1 = -1; 
    if (b1 != 0)
      paramCanvas.clipRect(this.f); 
    super.draw(paramCanvas);
  }
  
  public boolean executeKeyEvent(KeyEvent paramKeyEvent) {
    int i = paramKeyEvent.getKeyCode();
    return (!this.n && (i == 19 || i == 20)) ? false : super.executeKeyEvent(paramKeyEvent);
  }
  
  public void fling(int paramInt) {
    float f2 = Math.signum(this.c.b());
    float f1 = f2;
    if (f2 == 0.0F)
      f1 = Math.signum(paramInt); 
    paramInt = (int)(Math.abs(paramInt) * f1);
    if (this.k) {
      a(paramInt);
    } else if (this.d != null) {
      int i = getHeight();
      int k = getPaddingBottom();
      int m = getPaddingTop();
      this.d.fling(getScrollX(), getScrollY(), 0, paramInt, 0, 0, 0, 2147483647, 0, (i - k - m) / 2);
      v.M((View)this);
    } else {
      super.fling(paramInt);
    } 
    c(0, paramInt);
  }
  
  public boolean getChildVisibleRect(View paramView, Rect paramRect, Point paramPoint) {
    return e.e.o.b0.a.g ? u.a(paramView, paramRect, paramPoint, (View)this, this.i) : super.getChildVisibleRect(paramView, paramRect, paramPoint);
  }
  
  public boolean getRemoveClippedSubviews() {
    return this.m;
  }
  
  protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    if (this.m)
      a(); 
  }
  
  public void onChildViewAdded(View paramView1, View paramView2) {
    this.z = paramView2;
    this.z.addOnLayoutChangeListener(this);
  }
  
  public void onChildViewRemoved(View paramView1, View paramView2) {
    this.z.removeOnLayoutChangeListener(this);
    this.z = null;
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent) {
    if (!this.n)
      return false; 
    try {
      if (super.onInterceptTouchEvent(paramMotionEvent)) {
        f.a((View)this, paramMotionEvent);
        g.a((ViewGroup)this);
        this.j = true;
        d();
        return true;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      e.e.e.e.a.c("ReactNative", "Error intercepting touch event.", illegalArgumentException);
    } 
    return false;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    a(getScrollX(), getScrollY());
  }
  
  public void onLayoutChange(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8) {
    if (this.z == null)
      return; 
    paramInt1 = getScrollY();
    paramInt2 = getMaxScrollY();
    if (paramInt1 > paramInt2)
      a(getScrollX(), paramInt2); 
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    k.a(paramInt1, paramInt2);
    setMeasuredDimension(View.MeasureSpec.getSize(paramInt1), View.MeasureSpec.getSize(paramInt2));
  }
  
  protected void onOverScrolled(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2) {
    OverScroller overScroller = this.d;
    int i = paramInt2;
    if (overScroller != null) {
      i = paramInt2;
      if (this.z != null) {
        i = paramInt2;
        if (!overScroller.isFinished()) {
          i = paramInt2;
          if (this.d.getCurrY() != this.d.getFinalY()) {
            int k = getMaxScrollY();
            i = paramInt2;
            if (paramInt2 >= k) {
              this.d.abortAnimation();
              i = k;
            } 
          } 
        } 
      } 
    } 
    super.onOverScrolled(paramInt1, i, paramBoolean1, paramBoolean2);
  }
  
  protected void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    this.g = true;
    if (this.c.a(paramInt1, paramInt2)) {
      if (this.m)
        a(); 
      g.b((ViewGroup)this, this.c.a(), this.c.b());
    } 
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.m)
      a(); 
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    if (!this.n)
      return false; 
    this.e.a(paramMotionEvent);
    if ((paramMotionEvent.getAction() & 0xFF) == 1 && this.j) {
      d(getScrollX(), getScrollY());
      float f1 = this.e.a();
      float f2 = this.e.b();
      g.a((ViewGroup)this, f1, f2);
      this.j = false;
      c(Math.round(f1), Math.round(f2));
    } 
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public void requestChildFocus(View paramView1, View paramView2) {
    if (paramView2 != null)
      a(paramView2); 
    super.requestChildFocus(paramView1, paramView2);
  }
  
  public void setBackgroundColor(int paramInt) {
    this.A.a(paramInt);
  }
  
  public void setBorderRadius(float paramFloat) {
    this.A.a(paramFloat);
  }
  
  public void setBorderStyle(String paramString) {
    this.A.a(paramString);
  }
  
  public void setDecelerationRate(float paramFloat) {
    this.v = paramFloat;
    OverScroller overScroller = this.d;
    if (overScroller != null)
      overScroller.setFriction(1.0F - this.v); 
  }
  
  public void setDisableIntervalMomentum(boolean paramBoolean) {
    this.t = paramBoolean;
  }
  
  public void setEndFillColor(int paramInt) {
    if (paramInt != this.s) {
      this.s = paramInt;
      this.r = (Drawable)new ColorDrawable(this.s);
    } 
  }
  
  public void setOverflow(String paramString) {
    this.i = paramString;
    invalidate();
  }
  
  public void setPagingEnabled(boolean paramBoolean) {
    this.k = paramBoolean;
  }
  
  public void setRemoveClippedSubviews(boolean paramBoolean) {
    if (paramBoolean && this.h == null)
      this.h = new Rect(); 
    this.m = paramBoolean;
    a();
  }
  
  public void setScrollEnabled(boolean paramBoolean) {
    this.n = paramBoolean;
  }
  
  public void setScrollPerfTag(String paramString) {
    this.q = paramString;
  }
  
  public void setSendMomentumEvents(boolean paramBoolean) {
    this.o = paramBoolean;
  }
  
  public void setSnapInterval(int paramInt) {
    this.u = paramInt;
  }
  
  public void setSnapOffsets(List<Integer> paramList) {
    this.w = paramList;
  }
  
  public void setSnapToEnd(boolean paramBoolean) {
    this.y = paramBoolean;
  }
  
  public void setSnapToStart(boolean paramBoolean) {
    this.x = paramBoolean;
  }
  
  class a implements Runnable {
    private boolean c = false;
    
    a(e this$0) {}
    
    public void run() {
      if (e.a(this.d)) {
        e.a(this.d, false);
      } else {
        e e1 = this.d;
        e.a(e1, e1.getScrollX(), this.d.getScrollY());
        if (e.b(this.d) && !this.c) {
          this.c = true;
          e.a(this.d, 0);
        } else {
          if (e.c(this.d))
            g.b((ViewGroup)this.d); 
          e.a(this.d, (Runnable)null);
          e.d(this.d);
          return;
        } 
      } 
      v.a((View)this.d, this, 20L);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/scroll/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */