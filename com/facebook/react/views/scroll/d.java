package com.facebook.react.views.scroll;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.OverScroller;
import b.g.m.v;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.events.f;
import com.facebook.react.uimanager.j0;
import com.facebook.react.uimanager.k;
import com.facebook.react.uimanager.q;
import com.facebook.react.uimanager.t;
import com.facebook.react.uimanager.u;
import com.facebook.react.views.view.e;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class d extends HorizontalScrollView implements t {
  private static Field D;
  
  private static boolean E = false;
  
  private boolean A = false;
  
  private j0 B;
  
  private final Rect C = new Rect();
  
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
  
  private e z = new e((View)this);
  
  public d(Context paramContext, a parama) {
    super(paramContext);
    this.p = parama;
    this.d = getOverScrollerFromParent();
  }
  
  private int a(View paramView) {
    paramView.getDrawingRect(this.C);
    offsetDescendantRectToMyCoords(paramView, this.C);
    return computeScrollDeltaToGetChildRectOnScreen(this.C);
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
    //   28: iconst_0
    //   29: aload_0
    //   30: invokevirtual computeHorizontalScrollRange : ()I
    //   33: aload_0
    //   34: invokevirtual getWidth : ()I
    //   37: isub
    //   38: invokestatic max : (II)I
    //   41: istore #14
    //   43: aload_0
    //   44: iload_1
    //   45: invokespecial b : (I)I
    //   48: istore #9
    //   50: aload_0
    //   51: getfield t : Z
    //   54: ifeq -> 63
    //   57: aload_0
    //   58: invokevirtual getScrollX : ()I
    //   61: istore #9
    //   63: aload_0
    //   64: invokevirtual getWidth : ()I
    //   67: istore #19
    //   69: aload_0
    //   70: invokestatic u : (Landroid/view/View;)I
    //   73: istore #20
    //   75: aload_0
    //   76: invokestatic t : (Landroid/view/View;)I
    //   79: istore #21
    //   81: invokestatic getDefault : ()Ljava/util/Locale;
    //   84: invokestatic b : (Ljava/util/Locale;)I
    //   87: iconst_1
    //   88: if_icmpne -> 97
    //   91: iconst_1
    //   92: istore #15
    //   94: goto -> 100
    //   97: iconst_0
    //   98: istore #15
    //   100: iload #15
    //   102: ifeq -> 119
    //   105: iload #14
    //   107: iload #9
    //   109: isub
    //   110: istore #9
    //   112: iload_1
    //   113: ineg
    //   114: istore #10
    //   116: goto -> 122
    //   119: iload_1
    //   120: istore #10
    //   122: aload_0
    //   123: getfield w : Ljava/util/List;
    //   126: astore #23
    //   128: aload #23
    //   130: ifnull -> 309
    //   133: aload #23
    //   135: iconst_0
    //   136: invokeinterface get : (I)Ljava/lang/Object;
    //   141: checkcast java/lang/Integer
    //   144: invokevirtual intValue : ()I
    //   147: istore #18
    //   149: aload_0
    //   150: getfield w : Ljava/util/List;
    //   153: astore #23
    //   155: aload #23
    //   157: aload #23
    //   159: invokeinterface size : ()I
    //   164: iconst_1
    //   165: isub
    //   166: invokeinterface get : (I)Ljava/lang/Object;
    //   171: checkcast java/lang/Integer
    //   174: invokevirtual intValue : ()I
    //   177: istore #17
    //   179: iload #14
    //   181: istore_1
    //   182: iconst_0
    //   183: istore #11
    //   185: iconst_0
    //   186: istore #8
    //   188: iload #11
    //   190: aload_0
    //   191: getfield w : Ljava/util/List;
    //   194: invokeinterface size : ()I
    //   199: if_icmpge -> 298
    //   202: aload_0
    //   203: getfield w : Ljava/util/List;
    //   206: iload #11
    //   208: invokeinterface get : (I)Ljava/lang/Object;
    //   213: checkcast java/lang/Integer
    //   216: invokevirtual intValue : ()I
    //   219: istore #13
    //   221: iload #8
    //   223: istore #12
    //   225: iload #13
    //   227: iload #9
    //   229: if_icmpgt -> 253
    //   232: iload #8
    //   234: istore #12
    //   236: iload #9
    //   238: iload #13
    //   240: isub
    //   241: iload #9
    //   243: iload #8
    //   245: isub
    //   246: if_icmpge -> 253
    //   249: iload #13
    //   251: istore #12
    //   253: iload_1
    //   254: istore #16
    //   256: iload #13
    //   258: iload #9
    //   260: if_icmplt -> 282
    //   263: iload_1
    //   264: istore #16
    //   266: iload #13
    //   268: iload #9
    //   270: isub
    //   271: iload_1
    //   272: iload #9
    //   274: isub
    //   275: if_icmpge -> 282
    //   278: iload #13
    //   280: istore #16
    //   282: iload #11
    //   284: iconst_1
    //   285: iadd
    //   286: istore #11
    //   288: iload #12
    //   290: istore #8
    //   292: iload #16
    //   294: istore_1
    //   295: goto -> 188
    //   298: iload #18
    //   300: istore #12
    //   302: iload #17
    //   304: istore #11
    //   306: goto -> 386
    //   309: aload_0
    //   310: invokespecial getSnapInterval : ()I
    //   313: i2d
    //   314: dstore_2
    //   315: iload #9
    //   317: i2d
    //   318: dstore #4
    //   320: dload #4
    //   322: invokestatic isNaN : (D)Z
    //   325: pop
    //   326: dload_2
    //   327: invokestatic isNaN : (D)Z
    //   330: pop
    //   331: dload #4
    //   333: dload_2
    //   334: ddiv
    //   335: dstore #4
    //   337: dload #4
    //   339: invokestatic floor : (D)D
    //   342: dstore #6
    //   344: dload_2
    //   345: invokestatic isNaN : (D)Z
    //   348: pop
    //   349: dload #6
    //   351: dload_2
    //   352: dmul
    //   353: d2i
    //   354: istore #8
    //   356: dload #4
    //   358: invokestatic ceil : (D)D
    //   361: dstore #4
    //   363: dload_2
    //   364: invokestatic isNaN : (D)Z
    //   367: pop
    //   368: dload #4
    //   370: dload_2
    //   371: dmul
    //   372: d2i
    //   373: iload #14
    //   375: invokestatic min : (II)I
    //   378: istore_1
    //   379: iload #14
    //   381: istore #11
    //   383: iconst_0
    //   384: istore #12
    //   386: iload #9
    //   388: iload #8
    //   390: isub
    //   391: istore #18
    //   393: iload_1
    //   394: iload #9
    //   396: isub
    //   397: istore #22
    //   399: iload #18
    //   401: iload #22
    //   403: if_icmpge -> 413
    //   406: iload #8
    //   408: istore #13
    //   410: goto -> 416
    //   413: iload_1
    //   414: istore #13
    //   416: aload_0
    //   417: invokevirtual getScrollX : ()I
    //   420: istore #17
    //   422: iload #17
    //   424: istore #16
    //   426: iload #15
    //   428: ifeq -> 438
    //   431: iload #14
    //   433: iload #17
    //   435: isub
    //   436: istore #16
    //   438: aload_0
    //   439: getfield y : Z
    //   442: ifne -> 472
    //   445: iload #9
    //   447: iload #11
    //   449: if_icmplt -> 472
    //   452: iload #16
    //   454: iload #11
    //   456: if_icmplt -> 462
    //   459: goto -> 493
    //   462: iload #11
    //   464: istore_1
    //   465: iload #10
    //   467: istore #9
    //   469: goto -> 576
    //   472: aload_0
    //   473: getfield x : Z
    //   476: ifne -> 513
    //   479: iload #9
    //   481: iload #12
    //   483: if_icmpgt -> 513
    //   486: iload #16
    //   488: iload #12
    //   490: if_icmpgt -> 503
    //   493: iload #9
    //   495: istore_1
    //   496: iload #10
    //   498: istore #9
    //   500: goto -> 576
    //   503: iload #12
    //   505: istore_1
    //   506: iload #10
    //   508: istore #9
    //   510: goto -> 576
    //   513: iload #10
    //   515: ifle -> 541
    //   518: iload #22
    //   520: i2d
    //   521: dstore_2
    //   522: dload_2
    //   523: invokestatic isNaN : (D)Z
    //   526: pop
    //   527: iload #10
    //   529: dload_2
    //   530: ldc2_w 10.0
    //   533: dmul
    //   534: d2i
    //   535: iadd
    //   536: istore #9
    //   538: goto -> 576
    //   541: iload #10
    //   543: istore #9
    //   545: iload #13
    //   547: istore_1
    //   548: iload #10
    //   550: ifge -> 576
    //   553: iload #18
    //   555: i2d
    //   556: dstore_2
    //   557: dload_2
    //   558: invokestatic isNaN : (D)Z
    //   561: pop
    //   562: iload #10
    //   564: dload_2
    //   565: ldc2_w 10.0
    //   568: dmul
    //   569: d2i
    //   570: isub
    //   571: istore #9
    //   573: iload #8
    //   575: istore_1
    //   576: iconst_0
    //   577: iload_1
    //   578: invokestatic max : (II)I
    //   581: iload #14
    //   583: invokestatic min : (II)I
    //   586: istore #10
    //   588: iload #10
    //   590: istore #8
    //   592: iload #9
    //   594: istore_1
    //   595: iload #15
    //   597: ifeq -> 611
    //   600: iload #14
    //   602: iload #10
    //   604: isub
    //   605: istore #8
    //   607: iload #9
    //   609: ineg
    //   610: istore_1
    //   611: aload_0
    //   612: getfield d : Landroid/widget/OverScroller;
    //   615: astore #23
    //   617: aload #23
    //   619: ifnull -> 712
    //   622: aload_0
    //   623: iconst_1
    //   624: putfield g : Z
    //   627: aload_0
    //   628: invokevirtual getScrollX : ()I
    //   631: istore #10
    //   633: aload_0
    //   634: invokevirtual getScrollY : ()I
    //   637: istore #11
    //   639: iload_1
    //   640: ifeq -> 646
    //   643: goto -> 654
    //   646: iload #8
    //   648: aload_0
    //   649: invokevirtual getScrollX : ()I
    //   652: isub
    //   653: istore_1
    //   654: iload #8
    //   656: ifeq -> 675
    //   659: iload #8
    //   661: iload #14
    //   663: if_icmpne -> 669
    //   666: goto -> 675
    //   669: iconst_0
    //   670: istore #9
    //   672: goto -> 687
    //   675: iload #19
    //   677: iload #20
    //   679: isub
    //   680: iload #21
    //   682: isub
    //   683: iconst_2
    //   684: idiv
    //   685: istore #9
    //   687: aload #23
    //   689: iload #10
    //   691: iload #11
    //   693: iload_1
    //   694: iconst_0
    //   695: iload #8
    //   697: iload #8
    //   699: iconst_0
    //   700: iconst_0
    //   701: iload #9
    //   703: iconst_0
    //   704: invokevirtual fling : (IIIIIIIIII)V
    //   707: aload_0
    //   708: invokevirtual postInvalidateOnAnimation : ()V
    //   711: return
    //   712: aload_0
    //   713: iload #8
    //   715: aload_0
    //   716: invokevirtual getScrollY : ()I
    //   719: invokevirtual b : (II)V
    //   722: return
  }
  
  private int b(int paramInt) {
    OverScroller overScroller = new OverScroller(getContext());
    overScroller.setFriction(1.0F - this.v);
    int i = Math.max(0, computeHorizontalScrollRange() - getWidth());
    int k = getWidth();
    int m = v.u((View)this);
    int n = v.t((View)this);
    overScroller.fling(getScrollX(), getScrollY(), paramInt, 0, 0, i, 0, 0, (k - m - n) / 2, 0);
    return overScroller.getFinalX();
  }
  
  private boolean b(View paramView) {
    int i = a(paramView);
    paramView.getDrawingRect(this.C);
    return (i != 0 && Math.abs(i) < this.C.width() / 2);
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
    double d1 = getScrollX();
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
      b((int)d2, getScrollY());
    } 
  }
  
  private void c(int paramInt1, int paramInt2) {
    if (!this.o && !this.k && !e())
      return; 
    if (this.l != null)
      return; 
    if (this.o)
      g.a((ViewGroup)this, paramInt1, paramInt2); 
    this.g = false;
    this.l = new a(this);
    v.a((View)this, this.l, 20L);
  }
  
  private boolean c(View paramView) {
    int i = a(paramView);
    paramView.getDrawingRect(this.C);
    return (i != 0 && Math.abs(i) < this.C.width());
  }
  
  private void d() {
    if (e()) {
      e.e.m.a.a.a(this.p);
      e.e.m.a.a.a(this.q);
      this.p.a(this.q);
    } 
  }
  
  private void d(int paramInt) {
    int m = getWidth();
    int n = getScrollX();
    int k = n / m;
    int i = k;
    if (n % m != 0)
      i = k + 1; 
    if (paramInt == 17) {
      paramInt = i - 1;
    } else {
      paramInt = i + 1;
    } 
    i = paramInt;
    if (paramInt < 0)
      i = 0; 
    b(i * m, getScrollY());
    c(0, 0);
  }
  
  private void d(int paramInt1, int paramInt2) {
    if (this.B == null)
      return; 
    WritableNativeMap writableNativeMap = new WritableNativeMap();
    writableNativeMap.putDouble("contentOffsetLeft", q.a(paramInt1));
    writableNativeMap.putDouble("contentOffsetTop", q.a(paramInt2));
    this.B.a((WritableMap)writableNativeMap);
  }
  
  private boolean d(View paramView) {
    return (a(paramView) == 0);
  }
  
  private void e(View paramView) {
    int i = a(paramView);
    if (i != 0)
      scrollBy(i, 0); 
  }
  
  private boolean e() {
    if (this.p != null) {
      String str = this.q;
      if (str != null && !str.isEmpty())
        return true; 
    } 
    return false;
  }
  
  private OverScroller getOverScrollerFromParent() {
    if (!E) {
      E = true;
      try {
        D = HorizontalScrollView.class.getDeclaredField("mScroller");
        D.setAccessible(true);
      } catch (NoSuchFieldException noSuchFieldException) {
        e.e.e.e.a.e("ReactNative", "Failed to get mScroller field for HorizontalScrollView! This app will exhibit the bounce-back scrolling bug :(");
      } 
    } 
    Field field = D;
    if (field != null)
      try {
        Object object = field.get(this);
        if (object instanceof OverScroller)
          return (OverScroller)object; 
        e.e.e.e.a.e("ReactNative", "Failed to cast mScroller field in HorizontalScrollView (probably due to OEM changes to AOSP)! This app will exhibit the bounce-back scrolling bug :(");
        return null;
      } catch (IllegalAccessException illegalAccessException) {
        throw new RuntimeException("Failed to get mScroller from HorizontalScrollView!", illegalAccessException);
      }  
    return null;
  }
  
  private int getSnapInterval() {
    int i = this.u;
    return (i != 0) ? i : getWidth();
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
    this.z.a(paramFloat, paramInt);
  }
  
  public void a(int paramInt, float paramFloat) {
    this.z.a(paramInt, paramFloat);
  }
  
  public void a(int paramInt, float paramFloat1, float paramFloat2) {
    this.z.a(paramInt, paramFloat1, paramFloat2);
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
  
  public void addFocusables(ArrayList<View> paramArrayList, int paramInt1, int paramInt2) {
    if (this.k && !this.A) {
      ArrayList arrayList = new ArrayList();
      super.addFocusables(arrayList, paramInt1, paramInt2);
      for (View view : arrayList) {
        if (d(view) || c(view) || view.isFocused())
          paramArrayList.add(view); 
      } 
    } else {
      super.addFocusables(paramArrayList, paramInt1, paramInt2);
    } 
  }
  
  public boolean arrowScroll(int paramInt) {
    if (this.k) {
      boolean bool = true;
      this.A = true;
      if (getChildCount() > 0) {
        View view1 = findFocus();
        view1 = FocusFinder.getInstance().findNextFocus((ViewGroup)this, view1, paramInt);
        View view2 = getChildAt(0);
        if (view2 != null && view1 != null && view1.getParent() == view2) {
          if (!d(view1) && !b(view1))
            d(paramInt); 
          view1.requestFocus();
        } else {
          d(paramInt);
        } 
      } else {
        bool = false;
      } 
      this.A = false;
      return bool;
    } 
    return super.arrowScroll(paramInt);
  }
  
  public void b() {
    awakenScrollBars();
  }
  
  public void b(int paramInt1, int paramInt2) {
    smoothScrollTo(paramInt1, paramInt2);
    d(paramInt1, paramInt2);
  }
  
  public void draw(Canvas paramCanvas) {
    if (this.s != 0) {
      View view = getChildAt(0);
      if (this.r != null && view != null && view.getRight() < getWidth()) {
        this.r.setBounds(view.getRight(), 0, getWidth(), getHeight());
        this.r.draw(paramCanvas);
      } 
    } 
    super.draw(paramCanvas);
  }
  
  public boolean executeKeyEvent(KeyEvent paramKeyEvent) {
    int i = paramKeyEvent.getKeyCode();
    return (!this.n && (i == 21 || i == 22)) ? false : super.executeKeyEvent(paramKeyEvent);
  }
  
  public void fling(int paramInt) {
    paramInt = (int)(Math.abs(paramInt) * Math.signum(this.c.a()));
    if (this.k) {
      a(paramInt);
    } else if (this.d != null) {
      int i = getWidth();
      int k = v.u((View)this);
      int m = v.t((View)this);
      this.d.fling(getScrollX(), getScrollY(), paramInt, 0, 0, 2147483647, 0, 0, (i - k - m) / 2, 0);
      v.M((View)this);
    } else {
      super.fling(paramInt);
    } 
    c(paramInt, 0);
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
  
  protected void onDraw(Canvas paramCanvas) {
    byte b1;
    getDrawingRect(this.f);
    String str = this.i;
    if (str.hashCode() == 466743410 && str.equals("visible")) {
      b1 = 0;
    } else {
      b1 = -1;
    } 
    if (b1 != 0)
      paramCanvas.clipRect(this.f); 
    super.onDraw(paramCanvas);
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
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    k.a(paramInt1, paramInt2);
    setMeasuredDimension(View.MeasureSpec.getSize(paramInt1), View.MeasureSpec.getSize(paramInt2));
  }
  
  protected void onOverScrolled(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2) {
    OverScroller overScroller = this.d;
    int i = paramInt1;
    if (overScroller != null) {
      i = paramInt1;
      if (!overScroller.isFinished()) {
        i = paramInt1;
        if (this.d.getCurrX() != this.d.getFinalX()) {
          int k = computeHorizontalScrollRange() - getWidth();
          i = paramInt1;
          if (paramInt1 >= k) {
            this.d.abortAnimation();
            i = k;
          } 
        } 
      } 
    } 
    super.onOverScrolled(i, paramInt2, paramBoolean1, paramBoolean2);
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
  
  public boolean pageScroll(int paramInt) {
    boolean bool = super.pageScroll(paramInt);
    if (this.k && bool)
      c(0, 0); 
    return bool;
  }
  
  public void requestChildFocus(View paramView1, View paramView2) {
    if (paramView2 != null && !this.k)
      e(paramView2); 
    super.requestChildFocus(paramView1, paramView2);
  }
  
  public void setBackgroundColor(int paramInt) {
    this.z.a(paramInt);
  }
  
  public void setBorderRadius(float paramFloat) {
    this.z.a(paramFloat);
  }
  
  public void setBorderStyle(String paramString) {
    this.z.a(paramString);
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
    
    a(d this$0) {}
    
    public void run() {
      if (d.a(this.d)) {
        d.a(this.d, false);
      } else {
        d d1 = this.d;
        d.a(d1, d1.getScrollX(), this.d.getScrollY());
        if (d.b(this.d) && !this.c) {
          this.c = true;
          d.a(this.d, 0);
        } else {
          if (d.c(this.d))
            g.b((ViewGroup)this.d); 
          d.a(this.d, (Runnable)null);
          d.d(this.d);
          return;
        } 
      } 
      v.a((View)this.d, this, 20L);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/scroll/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */