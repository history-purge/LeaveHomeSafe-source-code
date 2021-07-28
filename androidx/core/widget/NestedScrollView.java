package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import b.g.m.e0.e;
import b.g.m.k;
import b.g.m.m;
import b.g.m.o;
import b.g.m.q;
import b.g.m.t;
import b.g.m.v;

public class NestedScrollView extends FrameLayout implements o, k, t {
  private static final a C = new a();
  
  private static final int[] D = new int[] { 16843130 };
  
  private float A;
  
  private b B;
  
  private long c;
  
  private final Rect d = new Rect();
  
  private OverScroller e;
  
  private EdgeEffect f;
  
  private EdgeEffect g;
  
  private int h;
  
  private boolean i = true;
  
  private boolean j = false;
  
  private View k = null;
  
  private boolean l = false;
  
  private VelocityTracker m;
  
  private boolean n;
  
  private boolean o = true;
  
  private int p;
  
  private int q;
  
  private int r;
  
  private int s = -1;
  
  private final int[] t = new int[2];
  
  private final int[] u = new int[2];
  
  private int v;
  
  private int w;
  
  private c x;
  
  private final q y;
  
  private final m z;
  
  public NestedScrollView(Context paramContext) {
    this(paramContext, null);
  }
  
  public NestedScrollView(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public NestedScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    f();
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, D, paramInt, 0);
    setFillViewport(typedArray.getBoolean(0, false));
    typedArray.recycle();
    this.y = new q((ViewGroup)this);
    this.z = new m((View)this);
    setNestedScrollingEnabled(true);
    v.a((View)this, C);
  }
  
  private static int a(int paramInt1, int paramInt2, int paramInt3) {
    return (paramInt2 >= paramInt3 || paramInt1 < 0) ? 0 : ((paramInt2 + paramInt1 > paramInt3) ? (paramInt3 - paramInt2) : paramInt1);
  }
  
  private View a(boolean paramBoolean, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: iconst_2
    //   2: invokevirtual getFocusables : (I)Ljava/util/ArrayList;
    //   5: astore #14
    //   7: aload #14
    //   9: invokeinterface size : ()I
    //   14: istore #9
    //   16: aconst_null
    //   17: astore #13
    //   19: iconst_0
    //   20: istore #6
    //   22: iconst_0
    //   23: istore #7
    //   25: iload #6
    //   27: iload #9
    //   29: if_icmpge -> 249
    //   32: aload #14
    //   34: iload #6
    //   36: invokeinterface get : (I)Ljava/lang/Object;
    //   41: checkcast android/view/View
    //   44: astore #12
    //   46: aload #12
    //   48: invokevirtual getTop : ()I
    //   51: istore #8
    //   53: aload #12
    //   55: invokevirtual getBottom : ()I
    //   58: istore #10
    //   60: aload #13
    //   62: astore #11
    //   64: iload #7
    //   66: istore #5
    //   68: iload_2
    //   69: iload #10
    //   71: if_icmpge -> 232
    //   74: aload #13
    //   76: astore #11
    //   78: iload #7
    //   80: istore #5
    //   82: iload #8
    //   84: iload_3
    //   85: if_icmpge -> 232
    //   88: iload_2
    //   89: iload #8
    //   91: if_icmpge -> 106
    //   94: iload #10
    //   96: iload_3
    //   97: if_icmpge -> 106
    //   100: iconst_1
    //   101: istore #4
    //   103: goto -> 109
    //   106: iconst_0
    //   107: istore #4
    //   109: aload #13
    //   111: ifnonnull -> 125
    //   114: aload #12
    //   116: astore #11
    //   118: iload #4
    //   120: istore #5
    //   122: goto -> 232
    //   125: iload_1
    //   126: ifeq -> 139
    //   129: iload #8
    //   131: aload #13
    //   133: invokevirtual getTop : ()I
    //   136: if_icmplt -> 153
    //   139: iload_1
    //   140: ifne -> 159
    //   143: iload #10
    //   145: aload #13
    //   147: invokevirtual getBottom : ()I
    //   150: if_icmple -> 159
    //   153: iconst_1
    //   154: istore #8
    //   156: goto -> 162
    //   159: iconst_0
    //   160: istore #8
    //   162: iload #7
    //   164: ifeq -> 196
    //   167: aload #13
    //   169: astore #11
    //   171: iload #7
    //   173: istore #5
    //   175: iload #4
    //   177: ifeq -> 232
    //   180: aload #13
    //   182: astore #11
    //   184: iload #7
    //   186: istore #5
    //   188: iload #8
    //   190: ifeq -> 232
    //   193: goto -> 224
    //   196: iload #4
    //   198: ifeq -> 211
    //   201: aload #12
    //   203: astore #11
    //   205: iconst_1
    //   206: istore #5
    //   208: goto -> 232
    //   211: aload #13
    //   213: astore #11
    //   215: iload #7
    //   217: istore #5
    //   219: iload #8
    //   221: ifeq -> 232
    //   224: aload #12
    //   226: astore #11
    //   228: iload #7
    //   230: istore #5
    //   232: iload #6
    //   234: iconst_1
    //   235: iadd
    //   236: istore #6
    //   238: aload #11
    //   240: astore #13
    //   242: iload #5
    //   244: istore #7
    //   246: goto -> 25
    //   249: aload #13
    //   251: areturn
  }
  
  private void a() {
    this.e.abortAnimation();
    f(1);
  }
  
  private void a(int paramInt1, int paramInt2, int[] paramArrayOfint) {
    int i = getScrollY();
    scrollBy(0, paramInt1);
    i = getScrollY() - i;
    if (paramArrayOfint != null)
      paramArrayOfint[1] = paramArrayOfint[1] + i; 
    this.z.a(0, i, 0, paramInt1 - i, null, paramInt2, paramArrayOfint);
  }
  
  private void a(MotionEvent paramMotionEvent) {
    int i = paramMotionEvent.getActionIndex();
    if (paramMotionEvent.getPointerId(i) == this.s) {
      if (i == 0) {
        i = 1;
      } else {
        i = 0;
      } 
      this.h = (int)paramMotionEvent.getY(i);
      this.s = paramMotionEvent.getPointerId(i);
      VelocityTracker velocityTracker = this.m;
      if (velocityTracker != null)
        velocityTracker.clear(); 
    } 
  }
  
  private void a(boolean paramBoolean) {
    if (paramBoolean) {
      b(2, 1);
    } else {
      f(1);
    } 
    this.w = getScrollY();
    v.M((View)this);
  }
  
  private boolean a(Rect paramRect, boolean paramBoolean) {
    boolean bool;
    int i = a(paramRect);
    if (i != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool) {
      if (paramBoolean) {
        scrollBy(0, i);
        return bool;
      } 
      a(0, i);
    } 
    return bool;
  }
  
  private boolean a(View paramView) {
    return a(paramView, 0, getHeight()) ^ true;
  }
  
  private boolean a(View paramView, int paramInt1, int paramInt2) {
    paramView.getDrawingRect(this.d);
    offsetDescendantRectToMyCoords(paramView, this.d);
    return (this.d.bottom + paramInt1 >= getScrollY() && this.d.top - paramInt1 <= getScrollY() + paramInt2);
  }
  
  private static boolean a(View paramView1, View paramView2) {
    if (paramView1 == paramView2)
      return true; 
    ViewParent viewParent = paramView1.getParent();
    return (viewParent instanceof ViewGroup && a((View)viewParent, paramView2));
  }
  
  private void b(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    if (getChildCount() == 0)
      return; 
    if (AnimationUtils.currentAnimationTimeMillis() - this.c > 250L) {
      View view = getChildAt(0);
      FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
      int i = view.getHeight();
      int j = layoutParams.topMargin;
      int n = layoutParams.bottomMargin;
      int i1 = getHeight();
      int i2 = getPaddingTop();
      int i3 = getPaddingBottom();
      paramInt1 = getScrollY();
      paramInt2 = Math.max(0, Math.min(paramInt2 + paramInt1, Math.max(0, i + j + n - i1 - i2 - i3)));
      this.e.startScroll(getScrollX(), paramInt1, 0, paramInt2 - paramInt1, paramInt3);
      a(paramBoolean);
    } else {
      if (!this.e.isFinished())
        a(); 
      scrollBy(paramInt1, paramInt2);
    } 
    this.c = AnimationUtils.currentAnimationTimeMillis();
  }
  
  private void b(View paramView) {
    paramView.getDrawingRect(this.d);
    offsetDescendantRectToMyCoords(paramView, this.d);
    int i = a(this.d);
    if (i != 0)
      scrollBy(0, i); 
  }
  
  private boolean b() {
    int i = getChildCount();
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (i > 0) {
      View view = getChildAt(0);
      FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
      bool1 = bool2;
      if (view.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > getHeight() - getPaddingTop() - getPaddingBottom())
        bool1 = true; 
    } 
    return bool1;
  }
  
  private boolean b(int paramInt1, int paramInt2, int paramInt3) {
    boolean bool1;
    NestedScrollView nestedScrollView;
    int j = getHeight();
    int i = getScrollY();
    j += i;
    boolean bool2 = false;
    if (paramInt1 == 33) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    View view2 = a(bool1, paramInt2, paramInt3);
    View view1 = view2;
    if (view2 == null)
      nestedScrollView = this; 
    if (paramInt2 >= i && paramInt3 <= j) {
      bool1 = bool2;
    } else {
      if (bool1) {
        paramInt2 -= i;
      } else {
        paramInt2 = paramInt3 - j;
      } 
      g(paramInt2);
      bool1 = true;
    } 
    if (nestedScrollView != findFocus())
      nestedScrollView.requestFocus(paramInt1); 
    return bool1;
  }
  
  private void c() {
    this.l = false;
    h();
    f(0);
    EdgeEffect edgeEffect = this.f;
    if (edgeEffect != null) {
      edgeEffect.onRelease();
      this.g.onRelease();
    } 
  }
  
  private boolean c(int paramInt1, int paramInt2) {
    int i = getChildCount();
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (i > 0) {
      i = getScrollY();
      View view = getChildAt(0);
      bool1 = bool2;
      if (paramInt2 >= view.getTop() - i) {
        bool1 = bool2;
        if (paramInt2 < view.getBottom() - i) {
          bool1 = bool2;
          if (paramInt1 >= view.getLeft()) {
            bool1 = bool2;
            if (paramInt1 < view.getRight())
              bool1 = true; 
          } 
        } 
      } 
    } 
    return bool1;
  }
  
  private void d() {
    if (getOverScrollMode() != 2) {
      if (this.f == null) {
        Context context = getContext();
        this.f = new EdgeEffect(context);
        this.g = new EdgeEffect(context);
        return;
      } 
    } else {
      this.f = null;
      this.g = null;
    } 
  }
  
  private void e() {
    VelocityTracker velocityTracker = this.m;
    if (velocityTracker == null) {
      this.m = VelocityTracker.obtain();
      return;
    } 
    velocityTracker.clear();
  }
  
  private void f() {
    this.e = new OverScroller(getContext());
    setFocusable(true);
    setDescendantFocusability(262144);
    setWillNotDraw(false);
    ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
    this.p = viewConfiguration.getScaledTouchSlop();
    this.q = viewConfiguration.getScaledMinimumFlingVelocity();
    this.r = viewConfiguration.getScaledMaximumFlingVelocity();
  }
  
  private void g() {
    if (this.m == null)
      this.m = VelocityTracker.obtain(); 
  }
  
  private void g(int paramInt) {
    if (paramInt != 0) {
      if (this.o) {
        a(0, paramInt);
        return;
      } 
      scrollBy(0, paramInt);
    } 
  }
  
  private float getVerticalScrollFactorCompat() {
    if (this.A == 0.0F) {
      TypedValue typedValue = new TypedValue();
      Context context = getContext();
      if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
        this.A = typedValue.getDimension(context.getResources().getDisplayMetrics());
      } else {
        throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
      } 
    } 
    return this.A;
  }
  
  private void h() {
    VelocityTracker velocityTracker = this.m;
    if (velocityTracker != null) {
      velocityTracker.recycle();
      this.m = null;
    } 
  }
  
  protected int a(Rect paramRect) {
    int i = getChildCount();
    boolean bool = false;
    if (i == 0)
      return 0; 
    int i1 = getHeight();
    int j = getScrollY();
    int n = j + i1;
    int i2 = getVerticalFadingEdgeLength();
    i = j;
    if (paramRect.top > 0)
      i = j + i2; 
    View view = getChildAt(0);
    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
    if (paramRect.bottom < view.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin) {
      j = n - i2;
    } else {
      j = n;
    } 
    if (paramRect.bottom > j && paramRect.top > i) {
      if (paramRect.height() > i1) {
        i = paramRect.top - i;
      } else {
        i = paramRect.bottom - j;
      } 
      return Math.min(i + 0, view.getBottom() + layoutParams.bottomMargin - n);
    } 
    n = bool;
    if (paramRect.top < i) {
      n = bool;
      if (paramRect.bottom < j) {
        if (paramRect.height() > i1) {
          i = 0 - j - paramRect.bottom;
        } else {
          i = 0 - i - paramRect.top;
        } 
        n = Math.max(i, -getScrollY());
      } 
    } 
    return n;
  }
  
  public final void a(int paramInt1, int paramInt2) {
    b(paramInt1, paramInt2, 250, false);
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfint1, int paramInt5, int[] paramArrayOfint2) {
    this.z.a(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfint1, paramInt5, paramArrayOfint2);
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    b(paramInt1 - getScrollX(), paramInt2 - getScrollY(), paramInt3, paramBoolean);
  }
  
  void a(int paramInt1, int paramInt2, boolean paramBoolean) {
    a(paramInt1, paramInt2, 250, paramBoolean);
  }
  
  public void a(View paramView, int paramInt) {
    this.y.a(paramView, paramInt);
    f(paramInt);
  }
  
  public void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    a(paramInt4, paramInt5, (int[])null);
  }
  
  public void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int[] paramArrayOfint) {
    a(paramInt4, paramInt5, paramArrayOfint);
  }
  
  public void a(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfint, int paramInt3) {
    a(paramInt1, paramInt2, paramArrayOfint, (int[])null, paramInt3);
  }
  
  public void a(View paramView1, View paramView2, int paramInt1, int paramInt2) {
    this.y.a(paramView1, paramView2, paramInt1, paramInt2);
    b(2, paramInt2);
  }
  
  public boolean a(int paramInt) {
    View view2 = findFocus();
    View view1 = view2;
    if (view2 == this)
      view1 = null; 
    view2 = FocusFinder.getInstance().findNextFocus((ViewGroup)this, view1, paramInt);
    int i = getMaxScrollAmount();
    if (view2 != null && a(view2, i, getHeight())) {
      view2.getDrawingRect(this.d);
      offsetDescendantRectToMyCoords(view2, this.d);
      g(a(this.d));
      view2.requestFocus(paramInt);
    } else {
      int j;
      if (paramInt == 33 && getScrollY() < i) {
        j = getScrollY();
      } else {
        j = i;
        if (paramInt == 130) {
          j = i;
          if (getChildCount() > 0) {
            view2 = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view2.getLayoutParams();
            j = Math.min(view2.getBottom() + layoutParams.bottomMargin - getScrollY() + getHeight() - getPaddingBottom(), i);
          } 
        } 
      } 
      if (j == 0)
        return false; 
      if (paramInt != 130)
        j = -j; 
      g(j);
    } 
    if (view1 != null && view1.isFocused() && a(view1)) {
      paramInt = getDescendantFocusability();
      setDescendantFocusability(131072);
      requestFocus();
      setDescendantFocusability(paramInt);
    } 
    return true;
  }
  
  boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual getOverScrollMode : ()I
    //   4: istore #12
    //   6: aload_0
    //   7: invokevirtual computeHorizontalScrollRange : ()I
    //   10: istore #10
    //   12: aload_0
    //   13: invokevirtual computeHorizontalScrollExtent : ()I
    //   16: istore #11
    //   18: iconst_0
    //   19: istore #14
    //   21: iload #10
    //   23: iload #11
    //   25: if_icmple -> 34
    //   28: iconst_1
    //   29: istore #10
    //   31: goto -> 37
    //   34: iconst_0
    //   35: istore #10
    //   37: aload_0
    //   38: invokevirtual computeVerticalScrollRange : ()I
    //   41: aload_0
    //   42: invokevirtual computeVerticalScrollExtent : ()I
    //   45: if_icmple -> 54
    //   48: iconst_1
    //   49: istore #11
    //   51: goto -> 57
    //   54: iconst_0
    //   55: istore #11
    //   57: iload #12
    //   59: ifeq -> 82
    //   62: iload #12
    //   64: iconst_1
    //   65: if_icmpne -> 76
    //   68: iload #10
    //   70: ifeq -> 76
    //   73: goto -> 82
    //   76: iconst_0
    //   77: istore #10
    //   79: goto -> 85
    //   82: iconst_1
    //   83: istore #10
    //   85: iload #12
    //   87: ifeq -> 110
    //   90: iload #12
    //   92: iconst_1
    //   93: if_icmpne -> 104
    //   96: iload #11
    //   98: ifeq -> 104
    //   101: goto -> 110
    //   104: iconst_0
    //   105: istore #11
    //   107: goto -> 113
    //   110: iconst_1
    //   111: istore #11
    //   113: iload_3
    //   114: iload_1
    //   115: iadd
    //   116: istore_3
    //   117: iload #10
    //   119: ifne -> 127
    //   122: iconst_0
    //   123: istore_1
    //   124: goto -> 130
    //   127: iload #7
    //   129: istore_1
    //   130: iload #4
    //   132: iload_2
    //   133: iadd
    //   134: istore #4
    //   136: iload #11
    //   138: ifne -> 146
    //   141: iconst_0
    //   142: istore_2
    //   143: goto -> 149
    //   146: iload #8
    //   148: istore_2
    //   149: iload_1
    //   150: ineg
    //   151: istore #7
    //   153: iload_1
    //   154: iload #5
    //   156: iadd
    //   157: istore_1
    //   158: iload_2
    //   159: ineg
    //   160: istore #5
    //   162: iload_2
    //   163: iload #6
    //   165: iadd
    //   166: istore #6
    //   168: iload_3
    //   169: iload_1
    //   170: if_icmple -> 181
    //   173: iconst_1
    //   174: istore #9
    //   176: iload_1
    //   177: istore_2
    //   178: goto -> 198
    //   181: iload_3
    //   182: iload #7
    //   184: if_icmpge -> 193
    //   187: iload #7
    //   189: istore_1
    //   190: goto -> 173
    //   193: iload_3
    //   194: istore_2
    //   195: iconst_0
    //   196: istore #9
    //   198: iload #4
    //   200: iload #6
    //   202: if_icmple -> 214
    //   205: iload #6
    //   207: istore_1
    //   208: iconst_1
    //   209: istore #13
    //   211: goto -> 233
    //   214: iload #4
    //   216: iload #5
    //   218: if_icmpge -> 227
    //   221: iload #5
    //   223: istore_1
    //   224: goto -> 208
    //   227: iconst_0
    //   228: istore #13
    //   230: iload #4
    //   232: istore_1
    //   233: iload #13
    //   235: ifeq -> 263
    //   238: aload_0
    //   239: iconst_1
    //   240: invokevirtual d : (I)Z
    //   243: ifne -> 263
    //   246: aload_0
    //   247: getfield e : Landroid/widget/OverScroller;
    //   250: iload_2
    //   251: iload_1
    //   252: iconst_0
    //   253: iconst_0
    //   254: iconst_0
    //   255: aload_0
    //   256: invokevirtual getScrollRange : ()I
    //   259: invokevirtual springBack : (IIIIII)Z
    //   262: pop
    //   263: aload_0
    //   264: iload_2
    //   265: iload_1
    //   266: iload #9
    //   268: iload #13
    //   270: invokevirtual onOverScrolled : (IIZZ)V
    //   273: iload #9
    //   275: ifne -> 287
    //   278: iload #14
    //   280: istore #9
    //   282: iload #13
    //   284: ifeq -> 290
    //   287: iconst_1
    //   288: istore #9
    //   290: iload #9
    //   292: ireturn
  }
  
  public boolean a(int paramInt1, int paramInt2, int[] paramArrayOfint1, int[] paramArrayOfint2, int paramInt3) {
    return this.z.a(paramInt1, paramInt2, paramArrayOfint1, paramArrayOfint2, paramInt3);
  }
  
  public boolean a(KeyEvent paramKeyEvent) {
    View view;
    this.d.setEmpty();
    boolean bool3 = b();
    boolean bool1 = false;
    boolean bool2 = false;
    char c1 = '';
    if (!bool3) {
      bool1 = bool2;
      if (isFocused()) {
        bool1 = bool2;
        if (paramKeyEvent.getKeyCode() != 4) {
          View view1 = findFocus();
          view = view1;
          if (view1 == this)
            view = null; 
          view = FocusFinder.getInstance().findNextFocus((ViewGroup)this, view, 130);
          bool1 = bool2;
          if (view != null) {
            bool1 = bool2;
            if (view != this) {
              bool1 = bool2;
              if (view.requestFocus(130))
                bool1 = true; 
            } 
          } 
        } 
      } 
      return bool1;
    } 
    if (view.getAction() == 0) {
      int i = view.getKeyCode();
      if (i != 19) {
        if (i != 20) {
          if (i != 62)
            return false; 
          if (view.isShiftPressed())
            c1 = '!'; 
          e(c1);
          return false;
        } 
        return !view.isAltPressed() ? a(130) : c(130);
      } 
      if (!view.isAltPressed())
        return a(33); 
      bool1 = c(33);
    } 
    return bool1;
  }
  
  public void addView(View paramView) {
    if (getChildCount() <= 0) {
      super.addView(paramView);
      return;
    } 
    throw new IllegalStateException("ScrollView can host only one direct child");
  }
  
  public void addView(View paramView, int paramInt) {
    if (getChildCount() <= 0) {
      super.addView(paramView, paramInt);
      return;
    } 
    throw new IllegalStateException("ScrollView can host only one direct child");
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams) {
    if (getChildCount() <= 0) {
      super.addView(paramView, paramInt, paramLayoutParams);
      return;
    } 
    throw new IllegalStateException("ScrollView can host only one direct child");
  }
  
  public void addView(View paramView, ViewGroup.LayoutParams paramLayoutParams) {
    if (getChildCount() <= 0) {
      super.addView(paramView, paramLayoutParams);
      return;
    } 
    throw new IllegalStateException("ScrollView can host only one direct child");
  }
  
  public void b(int paramInt) {
    if (getChildCount() > 0) {
      this.e.fling(getScrollX(), getScrollY(), 0, paramInt, 0, 0, -2147483648, 2147483647, 0, 0);
      a(true);
    } 
  }
  
  public boolean b(int paramInt1, int paramInt2) {
    return this.z.a(paramInt1, paramInt2);
  }
  
  public boolean b(View paramView1, View paramView2, int paramInt1, int paramInt2) {
    return ((paramInt1 & 0x2) != 0);
  }
  
  public boolean c(int paramInt) {
    int i;
    if (paramInt == 130) {
      i = 1;
    } else {
      i = 0;
    } 
    int j = getHeight();
    Rect rect = this.d;
    rect.top = 0;
    rect.bottom = j;
    if (i) {
      i = getChildCount();
      if (i > 0) {
        View view = getChildAt(i - 1);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
        this.d.bottom = view.getBottom() + layoutParams.bottomMargin + getPaddingBottom();
        Rect rect1 = this.d;
        rect1.top = rect1.bottom - j;
      } 
    } 
    rect = this.d;
    return b(paramInt, rect.top, rect.bottom);
  }
  
  public int computeHorizontalScrollExtent() {
    return super.computeHorizontalScrollExtent();
  }
  
  public int computeHorizontalScrollOffset() {
    return super.computeHorizontalScrollOffset();
  }
  
  public int computeHorizontalScrollRange() {
    return super.computeHorizontalScrollRange();
  }
  
  public void computeScroll() {
    // Byte code:
    //   0: aload_0
    //   1: getfield e : Landroid/widget/OverScroller;
    //   4: invokevirtual isFinished : ()Z
    //   7: ifeq -> 11
    //   10: return
    //   11: aload_0
    //   12: getfield e : Landroid/widget/OverScroller;
    //   15: invokevirtual computeScrollOffset : ()Z
    //   18: pop
    //   19: aload_0
    //   20: getfield e : Landroid/widget/OverScroller;
    //   23: invokevirtual getCurrY : ()I
    //   26: istore_2
    //   27: iload_2
    //   28: aload_0
    //   29: getfield w : I
    //   32: isub
    //   33: istore_1
    //   34: aload_0
    //   35: iload_2
    //   36: putfield w : I
    //   39: aload_0
    //   40: getfield u : [I
    //   43: astore #6
    //   45: iconst_0
    //   46: istore_3
    //   47: aload #6
    //   49: iconst_1
    //   50: iconst_0
    //   51: iastore
    //   52: aload_0
    //   53: iconst_0
    //   54: iload_1
    //   55: aload #6
    //   57: aconst_null
    //   58: iconst_1
    //   59: invokevirtual a : (II[I[II)Z
    //   62: pop
    //   63: iload_1
    //   64: aload_0
    //   65: getfield u : [I
    //   68: iconst_1
    //   69: iaload
    //   70: isub
    //   71: istore_2
    //   72: aload_0
    //   73: invokevirtual getScrollRange : ()I
    //   76: istore #4
    //   78: iload_2
    //   79: istore_1
    //   80: iload_2
    //   81: ifeq -> 153
    //   84: aload_0
    //   85: invokevirtual getScrollY : ()I
    //   88: istore_1
    //   89: aload_0
    //   90: iconst_0
    //   91: iload_2
    //   92: aload_0
    //   93: invokevirtual getScrollX : ()I
    //   96: iload_1
    //   97: iconst_0
    //   98: iload #4
    //   100: iconst_0
    //   101: iconst_0
    //   102: iconst_0
    //   103: invokevirtual a : (IIIIIIIIZ)Z
    //   106: pop
    //   107: aload_0
    //   108: invokevirtual getScrollY : ()I
    //   111: iload_1
    //   112: isub
    //   113: istore_1
    //   114: iload_2
    //   115: iload_1
    //   116: isub
    //   117: istore_2
    //   118: aload_0
    //   119: getfield u : [I
    //   122: astore #6
    //   124: aload #6
    //   126: iconst_1
    //   127: iconst_0
    //   128: iastore
    //   129: aload_0
    //   130: iconst_0
    //   131: iload_1
    //   132: iconst_0
    //   133: iload_2
    //   134: aload_0
    //   135: getfield t : [I
    //   138: iconst_1
    //   139: aload #6
    //   141: invokevirtual a : (IIII[II[I)V
    //   144: iload_2
    //   145: aload_0
    //   146: getfield u : [I
    //   149: iconst_1
    //   150: iaload
    //   151: isub
    //   152: istore_1
    //   153: iload_1
    //   154: ifeq -> 249
    //   157: aload_0
    //   158: invokevirtual getOverScrollMode : ()I
    //   161: istore #5
    //   163: iload #5
    //   165: ifeq -> 183
    //   168: iload_3
    //   169: istore_2
    //   170: iload #5
    //   172: iconst_1
    //   173: if_icmpne -> 185
    //   176: iload_3
    //   177: istore_2
    //   178: iload #4
    //   180: ifle -> 185
    //   183: iconst_1
    //   184: istore_2
    //   185: iload_2
    //   186: ifeq -> 245
    //   189: aload_0
    //   190: invokespecial d : ()V
    //   193: iload_1
    //   194: ifge -> 216
    //   197: aload_0
    //   198: getfield f : Landroid/widget/EdgeEffect;
    //   201: invokevirtual isFinished : ()Z
    //   204: ifeq -> 245
    //   207: aload_0
    //   208: getfield f : Landroid/widget/EdgeEffect;
    //   211: astore #6
    //   213: goto -> 232
    //   216: aload_0
    //   217: getfield g : Landroid/widget/EdgeEffect;
    //   220: invokevirtual isFinished : ()Z
    //   223: ifeq -> 245
    //   226: aload_0
    //   227: getfield g : Landroid/widget/EdgeEffect;
    //   230: astore #6
    //   232: aload #6
    //   234: aload_0
    //   235: getfield e : Landroid/widget/OverScroller;
    //   238: invokevirtual getCurrVelocity : ()F
    //   241: f2i
    //   242: invokevirtual onAbsorb : (I)V
    //   245: aload_0
    //   246: invokespecial a : ()V
    //   249: aload_0
    //   250: getfield e : Landroid/widget/OverScroller;
    //   253: invokevirtual isFinished : ()Z
    //   256: ifne -> 264
    //   259: aload_0
    //   260: invokestatic M : (Landroid/view/View;)V
    //   263: return
    //   264: aload_0
    //   265: iconst_1
    //   266: invokevirtual f : (I)V
    //   269: return
  }
  
  public int computeVerticalScrollExtent() {
    return super.computeVerticalScrollExtent();
  }
  
  public int computeVerticalScrollOffset() {
    return Math.max(0, super.computeVerticalScrollOffset());
  }
  
  public int computeVerticalScrollRange() {
    int j = getChildCount();
    int i = getHeight() - getPaddingBottom() - getPaddingTop();
    if (j == 0)
      return i; 
    View view = getChildAt(0);
    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
    j = view.getBottom() + layoutParams.bottomMargin;
    int n = getScrollY();
    int i1 = Math.max(0, j - i);
    if (n < 0)
      return j - n; 
    i = j;
    if (n > i1)
      i = j + n - i1; 
    return i;
  }
  
  public boolean d(int paramInt) {
    return this.z.a(paramInt);
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent) {
    return (super.dispatchKeyEvent(paramKeyEvent) || a(paramKeyEvent));
  }
  
  public boolean dispatchNestedFling(float paramFloat1, float paramFloat2, boolean paramBoolean) {
    return this.z.a(paramFloat1, paramFloat2, paramBoolean);
  }
  
  public boolean dispatchNestedPreFling(float paramFloat1, float paramFloat2) {
    return this.z.a(paramFloat1, paramFloat2);
  }
  
  public boolean dispatchNestedPreScroll(int paramInt1, int paramInt2, int[] paramArrayOfint1, int[] paramArrayOfint2) {
    return a(paramInt1, paramInt2, paramArrayOfint1, paramArrayOfint2, 0);
  }
  
  public boolean dispatchNestedScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfint) {
    return this.z.a(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfint);
  }
  
  public void draw(Canvas paramCanvas) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial draw : (Landroid/graphics/Canvas;)V
    //   5: aload_0
    //   6: getfield f : Landroid/widget/EdgeEffect;
    //   9: ifnull -> 385
    //   12: aload_0
    //   13: invokevirtual getScrollY : ()I
    //   16: istore #9
    //   18: aload_0
    //   19: getfield f : Landroid/widget/EdgeEffect;
    //   22: invokevirtual isFinished : ()Z
    //   25: istore #11
    //   27: iconst_0
    //   28: istore #6
    //   30: iload #11
    //   32: ifne -> 196
    //   35: aload_1
    //   36: invokevirtual save : ()I
    //   39: istore #10
    //   41: aload_0
    //   42: invokevirtual getWidth : ()I
    //   45: istore_2
    //   46: aload_0
    //   47: invokevirtual getHeight : ()I
    //   50: istore #8
    //   52: iconst_0
    //   53: iload #9
    //   55: invokestatic min : (II)I
    //   58: istore #7
    //   60: getstatic android/os/Build$VERSION.SDK_INT : I
    //   63: bipush #21
    //   65: if_icmplt -> 83
    //   68: aload_0
    //   69: invokevirtual getClipToPadding : ()Z
    //   72: ifeq -> 78
    //   75: goto -> 83
    //   78: iconst_0
    //   79: istore_3
    //   80: goto -> 102
    //   83: iload_2
    //   84: aload_0
    //   85: invokevirtual getPaddingLeft : ()I
    //   88: aload_0
    //   89: invokevirtual getPaddingRight : ()I
    //   92: iadd
    //   93: isub
    //   94: istore_2
    //   95: aload_0
    //   96: invokevirtual getPaddingLeft : ()I
    //   99: iconst_0
    //   100: iadd
    //   101: istore_3
    //   102: iload #8
    //   104: istore #5
    //   106: iload #7
    //   108: istore #4
    //   110: getstatic android/os/Build$VERSION.SDK_INT : I
    //   113: bipush #21
    //   115: if_icmplt -> 156
    //   118: iload #8
    //   120: istore #5
    //   122: iload #7
    //   124: istore #4
    //   126: aload_0
    //   127: invokevirtual getClipToPadding : ()Z
    //   130: ifeq -> 156
    //   133: iload #8
    //   135: aload_0
    //   136: invokevirtual getPaddingTop : ()I
    //   139: aload_0
    //   140: invokevirtual getPaddingBottom : ()I
    //   143: iadd
    //   144: isub
    //   145: istore #5
    //   147: iload #7
    //   149: aload_0
    //   150: invokevirtual getPaddingTop : ()I
    //   153: iadd
    //   154: istore #4
    //   156: aload_1
    //   157: iload_3
    //   158: i2f
    //   159: iload #4
    //   161: i2f
    //   162: invokevirtual translate : (FF)V
    //   165: aload_0
    //   166: getfield f : Landroid/widget/EdgeEffect;
    //   169: iload_2
    //   170: iload #5
    //   172: invokevirtual setSize : (II)V
    //   175: aload_0
    //   176: getfield f : Landroid/widget/EdgeEffect;
    //   179: aload_1
    //   180: invokevirtual draw : (Landroid/graphics/Canvas;)Z
    //   183: ifeq -> 190
    //   186: aload_0
    //   187: invokestatic M : (Landroid/view/View;)V
    //   190: aload_1
    //   191: iload #10
    //   193: invokevirtual restoreToCount : (I)V
    //   196: aload_0
    //   197: getfield g : Landroid/widget/EdgeEffect;
    //   200: invokevirtual isFinished : ()Z
    //   203: ifne -> 385
    //   206: aload_1
    //   207: invokevirtual save : ()I
    //   210: istore #10
    //   212: aload_0
    //   213: invokevirtual getWidth : ()I
    //   216: istore #4
    //   218: aload_0
    //   219: invokevirtual getHeight : ()I
    //   222: istore #7
    //   224: aload_0
    //   225: invokevirtual getScrollRange : ()I
    //   228: iload #9
    //   230: invokestatic max : (II)I
    //   233: iload #7
    //   235: iadd
    //   236: istore #8
    //   238: getstatic android/os/Build$VERSION.SDK_INT : I
    //   241: bipush #21
    //   243: if_icmplt -> 259
    //   246: iload #6
    //   248: istore_3
    //   249: iload #4
    //   251: istore_2
    //   252: aload_0
    //   253: invokevirtual getClipToPadding : ()Z
    //   256: ifeq -> 279
    //   259: iload #4
    //   261: aload_0
    //   262: invokevirtual getPaddingLeft : ()I
    //   265: aload_0
    //   266: invokevirtual getPaddingRight : ()I
    //   269: iadd
    //   270: isub
    //   271: istore_2
    //   272: iconst_0
    //   273: aload_0
    //   274: invokevirtual getPaddingLeft : ()I
    //   277: iadd
    //   278: istore_3
    //   279: iload #8
    //   281: istore #5
    //   283: iload #7
    //   285: istore #4
    //   287: getstatic android/os/Build$VERSION.SDK_INT : I
    //   290: bipush #21
    //   292: if_icmplt -> 333
    //   295: iload #8
    //   297: istore #5
    //   299: iload #7
    //   301: istore #4
    //   303: aload_0
    //   304: invokevirtual getClipToPadding : ()Z
    //   307: ifeq -> 333
    //   310: iload #7
    //   312: aload_0
    //   313: invokevirtual getPaddingTop : ()I
    //   316: aload_0
    //   317: invokevirtual getPaddingBottom : ()I
    //   320: iadd
    //   321: isub
    //   322: istore #4
    //   324: iload #8
    //   326: aload_0
    //   327: invokevirtual getPaddingBottom : ()I
    //   330: isub
    //   331: istore #5
    //   333: aload_1
    //   334: iload_3
    //   335: iload_2
    //   336: isub
    //   337: i2f
    //   338: iload #5
    //   340: i2f
    //   341: invokevirtual translate : (FF)V
    //   344: aload_1
    //   345: ldc_w 180.0
    //   348: iload_2
    //   349: i2f
    //   350: fconst_0
    //   351: invokevirtual rotate : (FFF)V
    //   354: aload_0
    //   355: getfield g : Landroid/widget/EdgeEffect;
    //   358: iload_2
    //   359: iload #4
    //   361: invokevirtual setSize : (II)V
    //   364: aload_0
    //   365: getfield g : Landroid/widget/EdgeEffect;
    //   368: aload_1
    //   369: invokevirtual draw : (Landroid/graphics/Canvas;)Z
    //   372: ifeq -> 379
    //   375: aload_0
    //   376: invokestatic M : (Landroid/view/View;)V
    //   379: aload_1
    //   380: iload #10
    //   382: invokevirtual restoreToCount : (I)V
    //   385: return
  }
  
  public boolean e(int paramInt) {
    if (paramInt == 130) {
      i = 1;
    } else {
      i = 0;
    } 
    int j = getHeight();
    if (i) {
      this.d.top = getScrollY() + j;
      i = getChildCount();
      if (i > 0) {
        View view = getChildAt(i - 1);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
        i = view.getBottom() + layoutParams.bottomMargin + getPaddingBottom();
        Rect rect1 = this.d;
        if (rect1.top + j > i)
          rect1.top = i - j; 
      } 
    } else {
      this.d.top = getScrollY() - j;
      Rect rect1 = this.d;
      if (rect1.top < 0)
        rect1.top = 0; 
    } 
    Rect rect = this.d;
    int i = rect.top;
    rect.bottom = j + i;
    return b(paramInt, i, rect.bottom);
  }
  
  public void f(int paramInt) {
    this.z.c(paramInt);
  }
  
  protected float getBottomFadingEdgeStrength() {
    if (getChildCount() == 0)
      return 0.0F; 
    View view = getChildAt(0);
    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
    int i = getVerticalFadingEdgeLength();
    int j = getHeight();
    int n = getPaddingBottom();
    j = view.getBottom() + layoutParams.bottomMargin - getScrollY() - j - n;
    return (j < i) ? (j / i) : 1.0F;
  }
  
  public int getMaxScrollAmount() {
    return (int)(getHeight() * 0.5F);
  }
  
  public int getNestedScrollAxes() {
    return this.y.a();
  }
  
  int getScrollRange() {
    int j = getChildCount();
    int i = 0;
    if (j > 0) {
      View view = getChildAt(0);
      FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
      i = Math.max(0, view.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin - getHeight() - getPaddingTop() - getPaddingBottom());
    } 
    return i;
  }
  
  protected float getTopFadingEdgeStrength() {
    if (getChildCount() == 0)
      return 0.0F; 
    int i = getVerticalFadingEdgeLength();
    int j = getScrollY();
    return (j < i) ? (j / i) : 1.0F;
  }
  
  public boolean hasNestedScrollingParent() {
    return d(0);
  }
  
  public boolean isNestedScrollingEnabled() {
    return this.z.b();
  }
  
  protected void measureChild(View paramView, int paramInt1, int paramInt2) {
    ViewGroup.LayoutParams layoutParams = paramView.getLayoutParams();
    paramView.measure(FrameLayout.getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
  }
  
  protected void measureChildWithMargins(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    paramView.measure(FrameLayout.getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + paramInt2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
  }
  
  public void onAttachedToWindow() {
    super.onAttachedToWindow();
    this.j = false;
  }
  
  public boolean onGenericMotionEvent(MotionEvent paramMotionEvent) {
    if ((paramMotionEvent.getSource() & 0x2) != 0) {
      if (paramMotionEvent.getAction() != 8)
        return false; 
      if (!this.l) {
        float f = paramMotionEvent.getAxisValue(9);
        if (f != 0.0F) {
          int i = (int)(f * getVerticalScrollFactorCompat());
          int j = getScrollRange();
          int i1 = getScrollY();
          int n = i1 - i;
          if (n < 0) {
            i = 0;
          } else {
            i = n;
            if (n > j)
              i = j; 
          } 
          if (i != i1) {
            super.scrollTo(getScrollX(), i);
            return true;
          } 
        } 
      } 
    } 
    return false;
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent) {
    ViewParent viewParent;
    int i = paramMotionEvent.getAction();
    if (i == 2 && this.l)
      return true; 
    i &= 0xFF;
    if (i != 0) {
      if (i != 1)
        if (i != 2) {
          if (i != 3) {
            if (i == 6)
              a(paramMotionEvent); 
            return this.l;
          } 
        } else {
          i = this.s;
          if (i != -1) {
            StringBuilder stringBuilder;
            int j = paramMotionEvent.findPointerIndex(i);
            if (j == -1) {
              stringBuilder = new StringBuilder();
              stringBuilder.append("Invalid pointerId=");
              stringBuilder.append(i);
              stringBuilder.append(" in onInterceptTouchEvent");
              Log.e("NestedScrollView", stringBuilder.toString());
            } else {
              i = (int)stringBuilder.getY(j);
              if (Math.abs(i - this.h) > this.p && (0x2 & getNestedScrollAxes()) == 0) {
                this.l = true;
                this.h = i;
                g();
                this.m.addMovement((MotionEvent)stringBuilder);
                this.v = 0;
                viewParent = getParent();
                if (viewParent != null)
                  viewParent.requestDisallowInterceptTouchEvent(true); 
              } 
            } 
          } 
          return this.l;
        }  
      this.l = false;
      this.s = -1;
      h();
      if (this.e.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()))
        v.M((View)this); 
      f(0);
    } else {
      i = (int)viewParent.getY();
      if (!c((int)viewParent.getX(), i)) {
        this.l = false;
        h();
      } else {
        this.h = i;
        this.s = viewParent.getPointerId(0);
        e();
        this.m.addMovement((MotionEvent)viewParent);
        this.e.computeScrollOffset();
        this.l = this.e.isFinished() ^ true;
        b(2, 0);
      } 
    } 
    return this.l;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    paramInt1 = 0;
    this.i = false;
    View view = this.k;
    if (view != null && a(view, (View)this))
      b(this.k); 
    this.k = null;
    if (!this.j) {
      if (this.x != null) {
        scrollTo(getScrollX(), this.x.c);
        this.x = null;
      } 
      if (getChildCount() > 0) {
        view = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
        paramInt1 = view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
      } 
      int i = getPaddingTop();
      int j = getPaddingBottom();
      paramInt3 = getScrollY();
      paramInt1 = a(paramInt3, paramInt4 - paramInt2 - i - j, paramInt1);
      if (paramInt1 != paramInt3)
        scrollTo(getScrollX(), paramInt1); 
    } 
    scrollTo(getScrollX(), getScrollY());
    this.j = true;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    super.onMeasure(paramInt1, paramInt2);
    if (!this.n)
      return; 
    if (View.MeasureSpec.getMode(paramInt2) == 0)
      return; 
    if (getChildCount() > 0) {
      View view = getChildAt(0);
      FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
      paramInt2 = view.getMeasuredHeight();
      int i = getMeasuredHeight() - getPaddingTop() - getPaddingBottom() - layoutParams.topMargin - layoutParams.bottomMargin;
      if (paramInt2 < i)
        view.measure(FrameLayout.getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(i, 1073741824)); 
    } 
  }
  
  public boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean) {
    if (!paramBoolean) {
      dispatchNestedFling(0.0F, paramFloat2, true);
      b((int)paramFloat2);
      return true;
    } 
    return false;
  }
  
  public boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2) {
    return dispatchNestedPreFling(paramFloat1, paramFloat2);
  }
  
  public void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfint) {
    a(paramView, paramInt1, paramInt2, paramArrayOfint, 0);
  }
  
  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    a(paramInt4, 0, (int[])null);
  }
  
  public void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt) {
    a(paramView1, paramView2, paramInt, 0);
  }
  
  protected void onOverScrolled(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2) {
    super.scrollTo(paramInt1, paramInt2);
  }
  
  protected boolean onRequestFocusInDescendants(int paramInt, Rect paramRect) {
    int i;
    View view;
    if (paramInt == 2) {
      i = 130;
    } else {
      i = paramInt;
      if (paramInt == 1)
        i = 33; 
    } 
    FocusFinder focusFinder = FocusFinder.getInstance();
    if (paramRect == null) {
      view = focusFinder.findNextFocus((ViewGroup)this, null, i);
    } else {
      view = view.findNextFocusFromRect((ViewGroup)this, paramRect, i);
    } 
    return (view == null) ? false : (a(view) ? false : view.requestFocus(i, paramRect));
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable) {
    if (!(paramParcelable instanceof c)) {
      super.onRestoreInstanceState(paramParcelable);
      return;
    } 
    c c1 = (c)paramParcelable;
    super.onRestoreInstanceState(c1.getSuperState());
    this.x = c1;
    requestLayout();
  }
  
  protected Parcelable onSaveInstanceState() {
    c c1 = new c(super.onSaveInstanceState());
    c1.c = getScrollY();
    return (Parcelable)c1;
  }
  
  protected void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    b b1 = this.B;
    if (b1 != null)
      b1.a(this, paramInt1, paramInt2, paramInt3, paramInt4); 
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    View view = findFocus();
    if (view != null) {
      if (this == view)
        return; 
      if (a(view, 0, paramInt4)) {
        view.getDrawingRect(this.d);
        offsetDescendantRectToMyCoords(view, this.d);
        g(a(this.d));
      } 
    } 
  }
  
  public boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt) {
    return b(paramView1, paramView2, paramInt, 0);
  }
  
  public void onStopNestedScroll(View paramView) {
    a(paramView, 0);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial g : ()V
    //   4: aload_1
    //   5: invokevirtual getActionMasked : ()I
    //   8: istore_3
    //   9: iload_3
    //   10: ifne -> 18
    //   13: aload_0
    //   14: iconst_0
    //   15: putfield v : I
    //   18: aload_1
    //   19: invokestatic obtain : (Landroid/view/MotionEvent;)Landroid/view/MotionEvent;
    //   22: astore #10
    //   24: aload #10
    //   26: fconst_0
    //   27: aload_0
    //   28: getfield v : I
    //   31: i2f
    //   32: invokevirtual offsetLocation : (FF)V
    //   35: iload_3
    //   36: ifeq -> 816
    //   39: iload_3
    //   40: iconst_1
    //   41: if_icmpeq -> 719
    //   44: iload_3
    //   45: iconst_2
    //   46: if_icmpeq -> 175
    //   49: iload_3
    //   50: iconst_3
    //   51: if_icmpeq -> 120
    //   54: iload_3
    //   55: iconst_5
    //   56: if_icmpeq -> 93
    //   59: iload_3
    //   60: bipush #6
    //   62: if_icmpeq -> 68
    //   65: goto -> 905
    //   68: aload_0
    //   69: aload_1
    //   70: invokespecial a : (Landroid/view/MotionEvent;)V
    //   73: aload_0
    //   74: aload_1
    //   75: aload_1
    //   76: aload_0
    //   77: getfield s : I
    //   80: invokevirtual findPointerIndex : (I)I
    //   83: invokevirtual getY : (I)F
    //   86: f2i
    //   87: putfield h : I
    //   90: goto -> 905
    //   93: aload_1
    //   94: invokevirtual getActionIndex : ()I
    //   97: istore_3
    //   98: aload_0
    //   99: aload_1
    //   100: iload_3
    //   101: invokevirtual getY : (I)F
    //   104: f2i
    //   105: putfield h : I
    //   108: aload_0
    //   109: aload_1
    //   110: iload_3
    //   111: invokevirtual getPointerId : (I)I
    //   114: putfield s : I
    //   117: goto -> 905
    //   120: aload_0
    //   121: getfield l : Z
    //   124: ifeq -> 163
    //   127: aload_0
    //   128: invokevirtual getChildCount : ()I
    //   131: ifle -> 163
    //   134: aload_0
    //   135: getfield e : Landroid/widget/OverScroller;
    //   138: aload_0
    //   139: invokevirtual getScrollX : ()I
    //   142: aload_0
    //   143: invokevirtual getScrollY : ()I
    //   146: iconst_0
    //   147: iconst_0
    //   148: iconst_0
    //   149: aload_0
    //   150: invokevirtual getScrollRange : ()I
    //   153: invokevirtual springBack : (IIIIII)Z
    //   156: ifeq -> 163
    //   159: aload_0
    //   160: invokestatic M : (Landroid/view/View;)V
    //   163: aload_0
    //   164: iconst_m1
    //   165: putfield s : I
    //   168: aload_0
    //   169: invokespecial c : ()V
    //   172: goto -> 905
    //   175: aload_1
    //   176: aload_0
    //   177: getfield s : I
    //   180: invokevirtual findPointerIndex : (I)I
    //   183: istore #5
    //   185: iload #5
    //   187: iconst_m1
    //   188: if_icmpne -> 238
    //   191: new java/lang/StringBuilder
    //   194: dup
    //   195: invokespecial <init> : ()V
    //   198: astore_1
    //   199: aload_1
    //   200: ldc_w 'Invalid pointerId='
    //   203: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   206: pop
    //   207: aload_1
    //   208: aload_0
    //   209: getfield s : I
    //   212: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   215: pop
    //   216: aload_1
    //   217: ldc_w ' in onTouchEvent'
    //   220: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   223: pop
    //   224: ldc_w 'NestedScrollView'
    //   227: aload_1
    //   228: invokevirtual toString : ()Ljava/lang/String;
    //   231: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   234: pop
    //   235: goto -> 905
    //   238: aload_1
    //   239: iload #5
    //   241: invokevirtual getY : (I)F
    //   244: f2i
    //   245: istore #6
    //   247: aload_0
    //   248: getfield h : I
    //   251: iload #6
    //   253: isub
    //   254: istore #4
    //   256: iload #4
    //   258: istore_3
    //   259: aload_0
    //   260: getfield l : Z
    //   263: ifne -> 328
    //   266: iload #4
    //   268: istore_3
    //   269: iload #4
    //   271: invokestatic abs : (I)I
    //   274: aload_0
    //   275: getfield p : I
    //   278: if_icmple -> 328
    //   281: aload_0
    //   282: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   285: astore #11
    //   287: aload #11
    //   289: ifnull -> 300
    //   292: aload #11
    //   294: iconst_1
    //   295: invokeinterface requestDisallowInterceptTouchEvent : (Z)V
    //   300: aload_0
    //   301: iconst_1
    //   302: putfield l : Z
    //   305: aload_0
    //   306: getfield p : I
    //   309: istore_3
    //   310: iload #4
    //   312: ifle -> 323
    //   315: iload #4
    //   317: iload_3
    //   318: isub
    //   319: istore_3
    //   320: goto -> 328
    //   323: iload #4
    //   325: iload_3
    //   326: iadd
    //   327: istore_3
    //   328: iload_3
    //   329: istore #4
    //   331: aload_0
    //   332: getfield l : Z
    //   335: ifeq -> 905
    //   338: iload #4
    //   340: istore_3
    //   341: aload_0
    //   342: iconst_0
    //   343: iload #4
    //   345: aload_0
    //   346: getfield u : [I
    //   349: aload_0
    //   350: getfield t : [I
    //   353: iconst_0
    //   354: invokevirtual a : (II[I[II)Z
    //   357: ifeq -> 385
    //   360: iload #4
    //   362: aload_0
    //   363: getfield u : [I
    //   366: iconst_1
    //   367: iaload
    //   368: isub
    //   369: istore_3
    //   370: aload_0
    //   371: aload_0
    //   372: getfield v : I
    //   375: aload_0
    //   376: getfield t : [I
    //   379: iconst_1
    //   380: iaload
    //   381: iadd
    //   382: putfield v : I
    //   385: aload_0
    //   386: iload #6
    //   388: aload_0
    //   389: getfield t : [I
    //   392: iconst_1
    //   393: iaload
    //   394: isub
    //   395: putfield h : I
    //   398: aload_0
    //   399: invokevirtual getScrollY : ()I
    //   402: istore #7
    //   404: aload_0
    //   405: invokevirtual getScrollRange : ()I
    //   408: istore #6
    //   410: aload_0
    //   411: invokevirtual getOverScrollMode : ()I
    //   414: istore #4
    //   416: iload #4
    //   418: ifeq -> 441
    //   421: iload #4
    //   423: iconst_1
    //   424: if_icmpne -> 435
    //   427: iload #6
    //   429: ifle -> 435
    //   432: goto -> 441
    //   435: iconst_0
    //   436: istore #4
    //   438: goto -> 444
    //   441: iconst_1
    //   442: istore #4
    //   444: aload_0
    //   445: iconst_0
    //   446: iload_3
    //   447: iconst_0
    //   448: aload_0
    //   449: invokevirtual getScrollY : ()I
    //   452: iconst_0
    //   453: iload #6
    //   455: iconst_0
    //   456: iconst_0
    //   457: iconst_1
    //   458: invokevirtual a : (IIIIIIIIZ)Z
    //   461: ifeq -> 479
    //   464: aload_0
    //   465: iconst_0
    //   466: invokevirtual d : (I)Z
    //   469: ifne -> 479
    //   472: aload_0
    //   473: getfield m : Landroid/view/VelocityTracker;
    //   476: invokevirtual clear : ()V
    //   479: aload_0
    //   480: invokevirtual getScrollY : ()I
    //   483: iload #7
    //   485: isub
    //   486: istore #8
    //   488: aload_0
    //   489: getfield u : [I
    //   492: astore #11
    //   494: aload #11
    //   496: iconst_1
    //   497: iconst_0
    //   498: iastore
    //   499: aload_0
    //   500: iconst_0
    //   501: iload #8
    //   503: iconst_0
    //   504: iload_3
    //   505: iload #8
    //   507: isub
    //   508: aload_0
    //   509: getfield t : [I
    //   512: iconst_0
    //   513: aload #11
    //   515: invokevirtual a : (IIII[II[I)V
    //   518: aload_0
    //   519: getfield h : I
    //   522: istore #8
    //   524: aload_0
    //   525: getfield t : [I
    //   528: astore #11
    //   530: aload_0
    //   531: iload #8
    //   533: aload #11
    //   535: iconst_1
    //   536: iaload
    //   537: isub
    //   538: putfield h : I
    //   541: aload_0
    //   542: aload_0
    //   543: getfield v : I
    //   546: aload #11
    //   548: iconst_1
    //   549: iaload
    //   550: iadd
    //   551: putfield v : I
    //   554: iload #4
    //   556: ifeq -> 905
    //   559: iload_3
    //   560: aload_0
    //   561: getfield u : [I
    //   564: iconst_1
    //   565: iaload
    //   566: isub
    //   567: istore_3
    //   568: aload_0
    //   569: invokespecial d : ()V
    //   572: iload #7
    //   574: iload_3
    //   575: iadd
    //   576: istore #4
    //   578: iload #4
    //   580: ifge -> 632
    //   583: aload_0
    //   584: getfield f : Landroid/widget/EdgeEffect;
    //   587: iload_3
    //   588: i2f
    //   589: aload_0
    //   590: invokevirtual getHeight : ()I
    //   593: i2f
    //   594: fdiv
    //   595: aload_1
    //   596: iload #5
    //   598: invokevirtual getX : (I)F
    //   601: aload_0
    //   602: invokevirtual getWidth : ()I
    //   605: i2f
    //   606: fdiv
    //   607: invokestatic a : (Landroid/widget/EdgeEffect;FF)V
    //   610: aload_0
    //   611: getfield g : Landroid/widget/EdgeEffect;
    //   614: invokevirtual isFinished : ()Z
    //   617: ifne -> 686
    //   620: aload_0
    //   621: getfield g : Landroid/widget/EdgeEffect;
    //   624: astore_1
    //   625: aload_1
    //   626: invokevirtual onRelease : ()V
    //   629: goto -> 686
    //   632: iload #4
    //   634: iload #6
    //   636: if_icmple -> 686
    //   639: aload_0
    //   640: getfield g : Landroid/widget/EdgeEffect;
    //   643: iload_3
    //   644: i2f
    //   645: aload_0
    //   646: invokevirtual getHeight : ()I
    //   649: i2f
    //   650: fdiv
    //   651: fconst_1
    //   652: aload_1
    //   653: iload #5
    //   655: invokevirtual getX : (I)F
    //   658: aload_0
    //   659: invokevirtual getWidth : ()I
    //   662: i2f
    //   663: fdiv
    //   664: fsub
    //   665: invokestatic a : (Landroid/widget/EdgeEffect;FF)V
    //   668: aload_0
    //   669: getfield f : Landroid/widget/EdgeEffect;
    //   672: invokevirtual isFinished : ()Z
    //   675: ifne -> 686
    //   678: aload_0
    //   679: getfield f : Landroid/widget/EdgeEffect;
    //   682: astore_1
    //   683: goto -> 625
    //   686: aload_0
    //   687: getfield f : Landroid/widget/EdgeEffect;
    //   690: astore_1
    //   691: aload_1
    //   692: ifnull -> 905
    //   695: aload_1
    //   696: invokevirtual isFinished : ()Z
    //   699: ifeq -> 712
    //   702: aload_0
    //   703: getfield g : Landroid/widget/EdgeEffect;
    //   706: invokevirtual isFinished : ()Z
    //   709: ifne -> 905
    //   712: aload_0
    //   713: invokestatic M : (Landroid/view/View;)V
    //   716: goto -> 905
    //   719: aload_0
    //   720: getfield m : Landroid/view/VelocityTracker;
    //   723: astore_1
    //   724: aload_1
    //   725: sipush #1000
    //   728: aload_0
    //   729: getfield r : I
    //   732: i2f
    //   733: invokevirtual computeCurrentVelocity : (IF)V
    //   736: aload_1
    //   737: aload_0
    //   738: getfield s : I
    //   741: invokevirtual getYVelocity : (I)F
    //   744: f2i
    //   745: istore_3
    //   746: iload_3
    //   747: invokestatic abs : (I)I
    //   750: aload_0
    //   751: getfield q : I
    //   754: if_icmplt -> 788
    //   757: iload_3
    //   758: ineg
    //   759: istore_3
    //   760: iload_3
    //   761: i2f
    //   762: fstore_2
    //   763: aload_0
    //   764: fconst_0
    //   765: fload_2
    //   766: invokevirtual dispatchNestedPreFling : (FF)Z
    //   769: ifne -> 163
    //   772: aload_0
    //   773: fconst_0
    //   774: fload_2
    //   775: iconst_1
    //   776: invokevirtual dispatchNestedFling : (FFZ)Z
    //   779: pop
    //   780: aload_0
    //   781: iload_3
    //   782: invokevirtual b : (I)V
    //   785: goto -> 163
    //   788: aload_0
    //   789: getfield e : Landroid/widget/OverScroller;
    //   792: aload_0
    //   793: invokevirtual getScrollX : ()I
    //   796: aload_0
    //   797: invokevirtual getScrollY : ()I
    //   800: iconst_0
    //   801: iconst_0
    //   802: iconst_0
    //   803: aload_0
    //   804: invokevirtual getScrollRange : ()I
    //   807: invokevirtual springBack : (IIIIII)Z
    //   810: ifeq -> 163
    //   813: goto -> 159
    //   816: aload_0
    //   817: invokevirtual getChildCount : ()I
    //   820: ifne -> 825
    //   823: iconst_0
    //   824: ireturn
    //   825: aload_0
    //   826: getfield e : Landroid/widget/OverScroller;
    //   829: invokevirtual isFinished : ()Z
    //   832: iconst_1
    //   833: ixor
    //   834: istore #9
    //   836: aload_0
    //   837: iload #9
    //   839: putfield l : Z
    //   842: iload #9
    //   844: ifeq -> 866
    //   847: aload_0
    //   848: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   851: astore #11
    //   853: aload #11
    //   855: ifnull -> 866
    //   858: aload #11
    //   860: iconst_1
    //   861: invokeinterface requestDisallowInterceptTouchEvent : (Z)V
    //   866: aload_0
    //   867: getfield e : Landroid/widget/OverScroller;
    //   870: invokevirtual isFinished : ()Z
    //   873: ifne -> 880
    //   876: aload_0
    //   877: invokespecial a : ()V
    //   880: aload_0
    //   881: aload_1
    //   882: invokevirtual getY : ()F
    //   885: f2i
    //   886: putfield h : I
    //   889: aload_0
    //   890: aload_1
    //   891: iconst_0
    //   892: invokevirtual getPointerId : (I)I
    //   895: putfield s : I
    //   898: aload_0
    //   899: iconst_2
    //   900: iconst_0
    //   901: invokevirtual b : (II)Z
    //   904: pop
    //   905: aload_0
    //   906: getfield m : Landroid/view/VelocityTracker;
    //   909: astore_1
    //   910: aload_1
    //   911: ifnull -> 920
    //   914: aload_1
    //   915: aload #10
    //   917: invokevirtual addMovement : (Landroid/view/MotionEvent;)V
    //   920: aload #10
    //   922: invokevirtual recycle : ()V
    //   925: iconst_1
    //   926: ireturn
  }
  
  public void requestChildFocus(View paramView1, View paramView2) {
    if (!this.i) {
      b(paramView2);
    } else {
      this.k = paramView2;
    } 
    super.requestChildFocus(paramView1, paramView2);
  }
  
  public boolean requestChildRectangleOnScreen(View paramView, Rect paramRect, boolean paramBoolean) {
    paramRect.offset(paramView.getLeft() - paramView.getScrollX(), paramView.getTop() - paramView.getScrollY());
    return a(paramRect, paramBoolean);
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean) {
    if (paramBoolean)
      h(); 
    super.requestDisallowInterceptTouchEvent(paramBoolean);
  }
  
  public void requestLayout() {
    this.i = true;
    super.requestLayout();
  }
  
  public void scrollTo(int paramInt1, int paramInt2) {
    if (getChildCount() > 0) {
      View view = getChildAt(0);
      FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
      int i4 = getWidth();
      int i5 = getPaddingLeft();
      int i6 = getPaddingRight();
      int i7 = view.getWidth();
      int i8 = layoutParams.leftMargin;
      int i9 = layoutParams.rightMargin;
      int i = getHeight();
      int j = getPaddingTop();
      int n = getPaddingBottom();
      int i1 = view.getHeight();
      int i2 = layoutParams.topMargin;
      int i3 = layoutParams.bottomMargin;
      paramInt1 = a(paramInt1, i4 - i5 - i6, i7 + i8 + i9);
      paramInt2 = a(paramInt2, i - j - n, i1 + i2 + i3);
      if (paramInt1 != getScrollX() || paramInt2 != getScrollY())
        super.scrollTo(paramInt1, paramInt2); 
    } 
  }
  
  public void setFillViewport(boolean paramBoolean) {
    if (paramBoolean != this.n) {
      this.n = paramBoolean;
      requestLayout();
    } 
  }
  
  public void setNestedScrollingEnabled(boolean paramBoolean) {
    this.z.a(paramBoolean);
  }
  
  public void setOnScrollChangeListener(b paramb) {
    this.B = paramb;
  }
  
  public void setSmoothScrollingEnabled(boolean paramBoolean) {
    this.o = paramBoolean;
  }
  
  public boolean shouldDelayChildPressedState() {
    return true;
  }
  
  public boolean startNestedScroll(int paramInt) {
    return b(paramInt, 0);
  }
  
  public void stopNestedScroll() {
    f(0);
  }
  
  static class a extends b.g.m.a {
    public void a(View param1View, b.g.m.e0.c param1c) {
      super.a(param1View, param1c);
      NestedScrollView nestedScrollView = (NestedScrollView)param1View;
      param1c.a(ScrollView.class.getName());
      if (nestedScrollView.isEnabled()) {
        int i = nestedScrollView.getScrollRange();
        if (i > 0) {
          param1c.l(true);
          if (nestedScrollView.getScrollY() > 0) {
            param1c.a(b.g.m.e0.c.a.j);
            param1c.a(b.g.m.e0.c.a.n);
          } 
          if (nestedScrollView.getScrollY() < i) {
            param1c.a(b.g.m.e0.c.a.i);
            param1c.a(b.g.m.e0.c.a.o);
          } 
        } 
      } 
    }
    
    public boolean a(View param1View, int param1Int, Bundle param1Bundle) {
      if (super.a(param1View, param1Int, param1Bundle))
        return true; 
      NestedScrollView nestedScrollView = (NestedScrollView)param1View;
      if (!nestedScrollView.isEnabled())
        return false; 
      if (param1Int != 4096)
        if (param1Int != 8192 && param1Int != 16908344) {
          if (param1Int != 16908346)
            return false; 
        } else {
          param1Int = nestedScrollView.getHeight();
          int k = nestedScrollView.getPaddingBottom();
          int m = nestedScrollView.getPaddingTop();
          param1Int = Math.max(nestedScrollView.getScrollY() - param1Int - k - m, 0);
          if (param1Int != nestedScrollView.getScrollY()) {
            nestedScrollView.a(0, param1Int, true);
            return true;
          } 
          return false;
        }  
      param1Int = nestedScrollView.getHeight();
      int i = nestedScrollView.getPaddingBottom();
      int j = nestedScrollView.getPaddingTop();
      param1Int = Math.min(nestedScrollView.getScrollY() + param1Int - i - j, nestedScrollView.getScrollRange());
      if (param1Int != nestedScrollView.getScrollY()) {
        nestedScrollView.a(0, param1Int, true);
        return true;
      } 
      return false;
    }
    
    public void b(View param1View, AccessibilityEvent param1AccessibilityEvent) {
      boolean bool;
      super.b(param1View, param1AccessibilityEvent);
      NestedScrollView nestedScrollView = (NestedScrollView)param1View;
      param1AccessibilityEvent.setClassName(ScrollView.class.getName());
      if (nestedScrollView.getScrollRange() > 0) {
        bool = true;
      } else {
        bool = false;
      } 
      param1AccessibilityEvent.setScrollable(bool);
      param1AccessibilityEvent.setScrollX(nestedScrollView.getScrollX());
      param1AccessibilityEvent.setScrollY(nestedScrollView.getScrollY());
      e.a((AccessibilityRecord)param1AccessibilityEvent, nestedScrollView.getScrollX());
      e.b((AccessibilityRecord)param1AccessibilityEvent, nestedScrollView.getScrollRange());
    }
  }
  
  public static interface b {
    void a(NestedScrollView param1NestedScrollView, int param1Int1, int param1Int2, int param1Int3, int param1Int4);
  }
  
  static class c extends View.BaseSavedState {
    public static final Parcelable.Creator<c> CREATOR = new a();
    
    public int c;
    
    c(Parcel param1Parcel) {
      super(param1Parcel);
      this.c = param1Parcel.readInt();
    }
    
    c(Parcelable param1Parcelable) {
      super(param1Parcelable);
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("HorizontalScrollView.SavedState{");
      stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
      stringBuilder.append(" scrollPosition=");
      stringBuilder.append(this.c);
      stringBuilder.append("}");
      return stringBuilder.toString();
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      super.writeToParcel(param1Parcel, param1Int);
      param1Parcel.writeInt(this.c);
    }
    
    class a implements Parcelable.Creator<c> {
      public NestedScrollView.c createFromParcel(Parcel param2Parcel) {
        return new NestedScrollView.c(param2Parcel);
      }
      
      public NestedScrollView.c[] newArray(int param2Int) {
        return new NestedScrollView.c[param2Int];
      }
    }
  }
  
  class a implements Parcelable.Creator<c> {
    public NestedScrollView.c createFromParcel(Parcel param1Parcel) {
      return new NestedScrollView.c(param1Parcel);
    }
    
    public NestedScrollView.c[] newArray(int param1Int) {
      return new NestedScrollView.c[param1Int];
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/core/widget/NestedScrollView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */