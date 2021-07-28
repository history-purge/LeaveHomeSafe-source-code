package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.n;
import b.a.f;
import b.g.m.d0;
import b.g.m.n;
import b.g.m.o;
import b.g.m.p;
import b.g.m.q;
import b.g.m.v;

@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements c0, p, n, o {
  static final int[] H = new int[] { b.a.a.actionBarSize, 16842841 };
  
  private d A;
  
  private OverScroller B;
  
  ViewPropertyAnimator C;
  
  final AnimatorListenerAdapter D;
  
  private final Runnable E;
  
  private final Runnable F;
  
  private final q G;
  
  private int c;
  
  private int d = 0;
  
  private ContentFrameLayout e;
  
  ActionBarContainer f;
  
  private d0 g;
  
  private Drawable h;
  
  private boolean i;
  
  private boolean j;
  
  private boolean k;
  
  private boolean l;
  
  boolean m;
  
  private int n;
  
  private int o;
  
  private final Rect p = new Rect();
  
  private final Rect q = new Rect();
  
  private final Rect r = new Rect();
  
  private final Rect s = new Rect();
  
  private final Rect t = new Rect();
  
  private final Rect u = new Rect();
  
  private final Rect v = new Rect();
  
  private d0 w;
  
  private d0 x;
  
  private d0 y;
  
  private d0 z;
  
  public ActionBarOverlayLayout(Context paramContext) {
    this(paramContext, null);
  }
  
  public ActionBarOverlayLayout(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    d0 d01 = d0.b;
    this.w = d01;
    this.x = d01;
    this.y = d01;
    this.z = d01;
    this.D = new a(this);
    this.E = new b(this);
    this.F = new c(this);
    a(paramContext);
    this.G = new q(this);
  }
  
  private d0 a(View paramView) {
    if (paramView instanceof d0)
      return (d0)paramView; 
    if (paramView instanceof Toolbar)
      return ((Toolbar)paramView).getWrapper(); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Can't make a decor toolbar out of ");
    stringBuilder.append(paramView.getClass().getSimpleName());
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  private void a(Context paramContext) {
    TypedArray typedArray = getContext().getTheme().obtainStyledAttributes(H);
    boolean bool2 = false;
    this.c = typedArray.getDimensionPixelSize(0, 0);
    this.h = typedArray.getDrawable(1);
    if (this.h == null) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    setWillNotDraw(bool1);
    typedArray.recycle();
    boolean bool1 = bool2;
    if ((paramContext.getApplicationInfo()).targetSdkVersion < 19)
      bool1 = true; 
    this.i = bool1;
    this.B = new OverScroller(paramContext);
  }
  
  private boolean a(float paramFloat) {
    this.B.fling(0, 0, 0, (int)paramFloat, 0, 0, -2147483648, 2147483647);
    return (this.B.getFinalY() > this.f.getHeight());
  }
  
  private boolean a(View paramView, Rect paramRect, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   4: checkcast androidx/appcompat/widget/ActionBarOverlayLayout$e
    //   7: astore_1
    //   8: iload_3
    //   9: ifeq -> 43
    //   12: aload_1
    //   13: getfield leftMargin : I
    //   16: istore #7
    //   18: aload_2
    //   19: getfield left : I
    //   22: istore #8
    //   24: iload #7
    //   26: iload #8
    //   28: if_icmpeq -> 43
    //   31: aload_1
    //   32: iload #8
    //   34: putfield leftMargin : I
    //   37: iconst_1
    //   38: istore #9
    //   40: goto -> 46
    //   43: iconst_0
    //   44: istore #9
    //   46: iload #9
    //   48: istore_3
    //   49: iload #4
    //   51: ifeq -> 84
    //   54: aload_1
    //   55: getfield topMargin : I
    //   58: istore #7
    //   60: aload_2
    //   61: getfield top : I
    //   64: istore #8
    //   66: iload #9
    //   68: istore_3
    //   69: iload #7
    //   71: iload #8
    //   73: if_icmpeq -> 84
    //   76: aload_1
    //   77: iload #8
    //   79: putfield topMargin : I
    //   82: iconst_1
    //   83: istore_3
    //   84: iload_3
    //   85: istore #4
    //   87: iload #6
    //   89: ifeq -> 123
    //   92: aload_1
    //   93: getfield rightMargin : I
    //   96: istore #7
    //   98: aload_2
    //   99: getfield right : I
    //   102: istore #8
    //   104: iload_3
    //   105: istore #4
    //   107: iload #7
    //   109: iload #8
    //   111: if_icmpeq -> 123
    //   114: aload_1
    //   115: iload #8
    //   117: putfield rightMargin : I
    //   120: iconst_1
    //   121: istore #4
    //   123: iload #4
    //   125: istore_3
    //   126: iload #5
    //   128: ifeq -> 161
    //   131: aload_1
    //   132: getfield bottomMargin : I
    //   135: istore #7
    //   137: aload_2
    //   138: getfield bottom : I
    //   141: istore #8
    //   143: iload #4
    //   145: istore_3
    //   146: iload #7
    //   148: iload #8
    //   150: if_icmpeq -> 161
    //   153: aload_1
    //   154: iload #8
    //   156: putfield bottomMargin : I
    //   159: iconst_1
    //   160: istore_3
    //   161: iload_3
    //   162: ireturn
  }
  
  private void k() {
    h();
    this.F.run();
  }
  
  private void l() {
    h();
    postDelayed(this.F, 600L);
  }
  
  private void m() {
    h();
    postDelayed(this.E, 600L);
  }
  
  private void n() {
    h();
    this.E.run();
  }
  
  public void a(int paramInt) {
    j();
    if (paramInt != 2) {
      if (paramInt != 5) {
        if (paramInt != 109)
          return; 
        setOverlayMode(true);
        return;
      } 
      this.g.o();
      return;
    } 
    this.g.n();
  }
  
  public void a(Menu paramMenu, n.a parama) {
    j();
    this.g.a(paramMenu, parama);
  }
  
  public void a(View paramView, int paramInt) {
    if (paramInt == 0)
      onStopNestedScroll(paramView); 
  }
  
  public void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    if (paramInt5 == 0)
      onNestedScroll(paramView, paramInt1, paramInt2, paramInt3, paramInt4); 
  }
  
  public void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int[] paramArrayOfint) {
    a(paramView, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  public void a(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfint, int paramInt3) {
    if (paramInt3 == 0)
      onNestedPreScroll(paramView, paramInt1, paramInt2, paramArrayOfint); 
  }
  
  public void a(View paramView1, View paramView2, int paramInt1, int paramInt2) {
    if (paramInt2 == 0)
      onNestedScrollAccepted(paramView1, paramView2, paramInt1); 
  }
  
  public boolean a() {
    j();
    return this.g.a();
  }
  
  public void b() {
    j();
    this.g.b();
  }
  
  public boolean b(View paramView1, View paramView2, int paramInt1, int paramInt2) {
    return (paramInt2 == 0 && onStartNestedScroll(paramView1, paramView2, paramInt1));
  }
  
  public boolean c() {
    j();
    return this.g.c();
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    return paramLayoutParams instanceof e;
  }
  
  public boolean d() {
    j();
    return this.g.d();
  }
  
  public void draw(Canvas paramCanvas) {
    super.draw(paramCanvas);
    if (this.h != null && !this.i) {
      byte b;
      if (this.f.getVisibility() == 0) {
        b = (int)(this.f.getBottom() + this.f.getTranslationY() + 0.5F);
      } else {
        b = 0;
      } 
      this.h.setBounds(0, b, getWidth(), this.h.getIntrinsicHeight() + b);
      this.h.draw(paramCanvas);
    } 
  }
  
  public boolean e() {
    j();
    return this.g.e();
  }
  
  public boolean f() {
    j();
    return this.g.f();
  }
  
  protected boolean fitSystemWindows(Rect paramRect) {
    if (Build.VERSION.SDK_INT >= 21)
      return super.fitSystemWindows(paramRect); 
    j();
    boolean bool = a((View)this.f, paramRect, true, true, false, true);
    this.s.set(paramRect);
    d1.a((View)this, this.s, this.p);
    if (!this.t.equals(this.s)) {
      this.t.set(this.s);
      bool = true;
    } 
    if (!this.q.equals(this.p)) {
      this.q.set(this.p);
      bool = true;
    } 
    if (bool)
      requestLayout(); 
    return true;
  }
  
  public void g() {
    j();
    this.g.g();
  }
  
  protected e generateDefaultLayoutParams() {
    return new e(-1, -1);
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    return (ViewGroup.LayoutParams)new e(paramLayoutParams);
  }
  
  public e generateLayoutParams(AttributeSet paramAttributeSet) {
    return new e(getContext(), paramAttributeSet);
  }
  
  public int getActionBarHideOffset() {
    ActionBarContainer actionBarContainer = this.f;
    return (actionBarContainer != null) ? -((int)actionBarContainer.getTranslationY()) : 0;
  }
  
  public int getNestedScrollAxes() {
    return this.G.a();
  }
  
  public CharSequence getTitle() {
    j();
    return this.g.getTitle();
  }
  
  void h() {
    removeCallbacks(this.E);
    removeCallbacks(this.F);
    ViewPropertyAnimator viewPropertyAnimator = this.C;
    if (viewPropertyAnimator != null)
      viewPropertyAnimator.cancel(); 
  }
  
  public boolean i() {
    return this.j;
  }
  
  void j() {
    if (this.e == null) {
      this.e = (ContentFrameLayout)findViewById(f.action_bar_activity_content);
      this.f = (ActionBarContainer)findViewById(f.action_bar_container);
      this.g = a(findViewById(f.action_bar));
    } 
  }
  
  public WindowInsets onApplyWindowInsets(WindowInsets paramWindowInsets) {
    j();
    d0 d01 = d0.a(paramWindowInsets);
    Rect rect = new Rect(d01.e(), d01.g(), d01.f(), d01.d());
    boolean bool = a((View)this.f, rect, true, true, false, true);
    v.a((View)this, d01, this.p);
    rect = this.p;
    this.w = d01.a(rect.left, rect.top, rect.right, rect.bottom);
    if (!this.x.equals(this.w)) {
      this.x = this.w;
      bool = true;
    } 
    if (!this.q.equals(this.p)) {
      this.q.set(this.p);
      bool = true;
    } 
    if (bool)
      requestLayout(); 
    return d01.a().c().b().j();
  }
  
  protected void onConfigurationChanged(Configuration paramConfiguration) {
    super.onConfigurationChanged(paramConfiguration);
    a(getContext());
    v.N((View)this);
  }
  
  protected void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    h();
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramInt2 = getChildCount();
    paramInt3 = getPaddingLeft();
    paramInt4 = getPaddingTop();
    for (paramInt1 = 0; paramInt1 < paramInt2; paramInt1++) {
      View view = getChildAt(paramInt1);
      if (view.getVisibility() != 8) {
        e e = (e)view.getLayoutParams();
        int i = view.getMeasuredWidth();
        int j = view.getMeasuredHeight();
        int k = e.leftMargin + paramInt3;
        int m = e.topMargin + paramInt4;
        view.layout(k, m, i + k, j + m);
      } 
    } 
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual j : ()V
    //   4: aload_0
    //   5: aload_0
    //   6: getfield f : Landroidx/appcompat/widget/ActionBarContainer;
    //   9: iload_1
    //   10: iconst_0
    //   11: iload_2
    //   12: iconst_0
    //   13: invokevirtual measureChildWithMargins : (Landroid/view/View;IIII)V
    //   16: aload_0
    //   17: getfield f : Landroidx/appcompat/widget/ActionBarContainer;
    //   20: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   23: checkcast androidx/appcompat/widget/ActionBarOverlayLayout$e
    //   26: astore #9
    //   28: iconst_0
    //   29: aload_0
    //   30: getfield f : Landroidx/appcompat/widget/ActionBarContainer;
    //   33: invokevirtual getMeasuredWidth : ()I
    //   36: aload #9
    //   38: getfield leftMargin : I
    //   41: iadd
    //   42: aload #9
    //   44: getfield rightMargin : I
    //   47: iadd
    //   48: invokestatic max : (II)I
    //   51: istore #8
    //   53: iconst_0
    //   54: aload_0
    //   55: getfield f : Landroidx/appcompat/widget/ActionBarContainer;
    //   58: invokevirtual getMeasuredHeight : ()I
    //   61: aload #9
    //   63: getfield topMargin : I
    //   66: iadd
    //   67: aload #9
    //   69: getfield bottomMargin : I
    //   72: iadd
    //   73: invokestatic max : (II)I
    //   76: istore #7
    //   78: iconst_0
    //   79: aload_0
    //   80: getfield f : Landroidx/appcompat/widget/ActionBarContainer;
    //   83: invokevirtual getMeasuredState : ()I
    //   86: invokestatic combineMeasuredStates : (II)I
    //   89: istore #6
    //   91: aload_0
    //   92: invokestatic z : (Landroid/view/View;)I
    //   95: sipush #256
    //   98: iand
    //   99: ifeq -> 108
    //   102: iconst_1
    //   103: istore #4
    //   105: goto -> 111
    //   108: iconst_0
    //   109: istore #4
    //   111: iload #4
    //   113: ifeq -> 156
    //   116: aload_0
    //   117: getfield c : I
    //   120: istore #5
    //   122: iload #5
    //   124: istore_3
    //   125: aload_0
    //   126: getfield k : Z
    //   129: ifeq -> 181
    //   132: iload #5
    //   134: istore_3
    //   135: aload_0
    //   136: getfield f : Landroidx/appcompat/widget/ActionBarContainer;
    //   139: invokevirtual getTabContainer : ()Landroid/view/View;
    //   142: ifnull -> 181
    //   145: iload #5
    //   147: aload_0
    //   148: getfield c : I
    //   151: iadd
    //   152: istore_3
    //   153: goto -> 181
    //   156: aload_0
    //   157: getfield f : Landroidx/appcompat/widget/ActionBarContainer;
    //   160: invokevirtual getVisibility : ()I
    //   163: bipush #8
    //   165: if_icmpeq -> 179
    //   168: aload_0
    //   169: getfield f : Landroidx/appcompat/widget/ActionBarContainer;
    //   172: invokevirtual getMeasuredHeight : ()I
    //   175: istore_3
    //   176: goto -> 181
    //   179: iconst_0
    //   180: istore_3
    //   181: aload_0
    //   182: getfield r : Landroid/graphics/Rect;
    //   185: aload_0
    //   186: getfield p : Landroid/graphics/Rect;
    //   189: invokevirtual set : (Landroid/graphics/Rect;)V
    //   192: getstatic android/os/Build$VERSION.SDK_INT : I
    //   195: bipush #21
    //   197: if_icmplt -> 211
    //   200: aload_0
    //   201: aload_0
    //   202: getfield w : Lb/g/m/d0;
    //   205: putfield y : Lb/g/m/d0;
    //   208: goto -> 222
    //   211: aload_0
    //   212: getfield u : Landroid/graphics/Rect;
    //   215: aload_0
    //   216: getfield s : Landroid/graphics/Rect;
    //   219: invokevirtual set : (Landroid/graphics/Rect;)V
    //   222: aload_0
    //   223: getfield j : Z
    //   226: ifne -> 288
    //   229: iload #4
    //   231: ifne -> 288
    //   234: aload_0
    //   235: getfield r : Landroid/graphics/Rect;
    //   238: astore #9
    //   240: aload #9
    //   242: aload #9
    //   244: getfield top : I
    //   247: iload_3
    //   248: iadd
    //   249: putfield top : I
    //   252: aload #9
    //   254: aload #9
    //   256: getfield bottom : I
    //   259: iconst_0
    //   260: iadd
    //   261: putfield bottom : I
    //   264: getstatic android/os/Build$VERSION.SDK_INT : I
    //   267: bipush #21
    //   269: if_icmplt -> 400
    //   272: aload_0
    //   273: getfield y : Lb/g/m/d0;
    //   276: iconst_0
    //   277: iload_3
    //   278: iconst_0
    //   279: iconst_0
    //   280: invokevirtual a : (IIII)Lb/g/m/d0;
    //   283: astore #9
    //   285: goto -> 361
    //   288: getstatic android/os/Build$VERSION.SDK_INT : I
    //   291: bipush #21
    //   293: if_icmplt -> 370
    //   296: aload_0
    //   297: getfield y : Lb/g/m/d0;
    //   300: invokevirtual e : ()I
    //   303: aload_0
    //   304: getfield y : Lb/g/m/d0;
    //   307: invokevirtual g : ()I
    //   310: iload_3
    //   311: iadd
    //   312: aload_0
    //   313: getfield y : Lb/g/m/d0;
    //   316: invokevirtual f : ()I
    //   319: aload_0
    //   320: getfield y : Lb/g/m/d0;
    //   323: invokevirtual d : ()I
    //   326: iconst_0
    //   327: iadd
    //   328: invokestatic a : (IIII)Lb/g/f/b;
    //   331: astore #9
    //   333: new b/g/m/d0$a
    //   336: dup
    //   337: aload_0
    //   338: getfield y : Lb/g/m/d0;
    //   341: invokespecial <init> : (Lb/g/m/d0;)V
    //   344: astore #10
    //   346: aload #10
    //   348: aload #9
    //   350: invokevirtual b : (Lb/g/f/b;)Lb/g/m/d0$a;
    //   353: pop
    //   354: aload #10
    //   356: invokevirtual a : ()Lb/g/m/d0;
    //   359: astore #9
    //   361: aload_0
    //   362: aload #9
    //   364: putfield y : Lb/g/m/d0;
    //   367: goto -> 400
    //   370: aload_0
    //   371: getfield u : Landroid/graphics/Rect;
    //   374: astore #9
    //   376: aload #9
    //   378: aload #9
    //   380: getfield top : I
    //   383: iload_3
    //   384: iadd
    //   385: putfield top : I
    //   388: aload #9
    //   390: aload #9
    //   392: getfield bottom : I
    //   395: iconst_0
    //   396: iadd
    //   397: putfield bottom : I
    //   400: aload_0
    //   401: aload_0
    //   402: getfield e : Landroidx/appcompat/widget/ContentFrameLayout;
    //   405: aload_0
    //   406: getfield r : Landroid/graphics/Rect;
    //   409: iconst_1
    //   410: iconst_1
    //   411: iconst_1
    //   412: iconst_1
    //   413: invokespecial a : (Landroid/view/View;Landroid/graphics/Rect;ZZZZ)Z
    //   416: pop
    //   417: getstatic android/os/Build$VERSION.SDK_INT : I
    //   420: bipush #21
    //   422: if_icmplt -> 464
    //   425: aload_0
    //   426: getfield z : Lb/g/m/d0;
    //   429: aload_0
    //   430: getfield y : Lb/g/m/d0;
    //   433: invokevirtual equals : (Ljava/lang/Object;)Z
    //   436: ifne -> 464
    //   439: aload_0
    //   440: getfield y : Lb/g/m/d0;
    //   443: astore #9
    //   445: aload_0
    //   446: aload #9
    //   448: putfield z : Lb/g/m/d0;
    //   451: aload_0
    //   452: getfield e : Landroidx/appcompat/widget/ContentFrameLayout;
    //   455: aload #9
    //   457: invokestatic a : (Landroid/view/View;Lb/g/m/d0;)Lb/g/m/d0;
    //   460: pop
    //   461: goto -> 508
    //   464: getstatic android/os/Build$VERSION.SDK_INT : I
    //   467: bipush #21
    //   469: if_icmpge -> 508
    //   472: aload_0
    //   473: getfield v : Landroid/graphics/Rect;
    //   476: aload_0
    //   477: getfield u : Landroid/graphics/Rect;
    //   480: invokevirtual equals : (Ljava/lang/Object;)Z
    //   483: ifne -> 508
    //   486: aload_0
    //   487: getfield v : Landroid/graphics/Rect;
    //   490: aload_0
    //   491: getfield u : Landroid/graphics/Rect;
    //   494: invokevirtual set : (Landroid/graphics/Rect;)V
    //   497: aload_0
    //   498: getfield e : Landroidx/appcompat/widget/ContentFrameLayout;
    //   501: aload_0
    //   502: getfield u : Landroid/graphics/Rect;
    //   505: invokevirtual a : (Landroid/graphics/Rect;)V
    //   508: aload_0
    //   509: aload_0
    //   510: getfield e : Landroidx/appcompat/widget/ContentFrameLayout;
    //   513: iload_1
    //   514: iconst_0
    //   515: iload_2
    //   516: iconst_0
    //   517: invokevirtual measureChildWithMargins : (Landroid/view/View;IIII)V
    //   520: aload_0
    //   521: getfield e : Landroidx/appcompat/widget/ContentFrameLayout;
    //   524: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   527: checkcast androidx/appcompat/widget/ActionBarOverlayLayout$e
    //   530: astore #9
    //   532: iload #8
    //   534: aload_0
    //   535: getfield e : Landroidx/appcompat/widget/ContentFrameLayout;
    //   538: invokevirtual getMeasuredWidth : ()I
    //   541: aload #9
    //   543: getfield leftMargin : I
    //   546: iadd
    //   547: aload #9
    //   549: getfield rightMargin : I
    //   552: iadd
    //   553: invokestatic max : (II)I
    //   556: istore_3
    //   557: iload #7
    //   559: aload_0
    //   560: getfield e : Landroidx/appcompat/widget/ContentFrameLayout;
    //   563: invokevirtual getMeasuredHeight : ()I
    //   566: aload #9
    //   568: getfield topMargin : I
    //   571: iadd
    //   572: aload #9
    //   574: getfield bottomMargin : I
    //   577: iadd
    //   578: invokestatic max : (II)I
    //   581: istore #4
    //   583: iload #6
    //   585: aload_0
    //   586: getfield e : Landroidx/appcompat/widget/ContentFrameLayout;
    //   589: invokevirtual getMeasuredState : ()I
    //   592: invokestatic combineMeasuredStates : (II)I
    //   595: istore #5
    //   597: aload_0
    //   598: invokevirtual getPaddingLeft : ()I
    //   601: istore #6
    //   603: aload_0
    //   604: invokevirtual getPaddingRight : ()I
    //   607: istore #7
    //   609: iload #4
    //   611: aload_0
    //   612: invokevirtual getPaddingTop : ()I
    //   615: aload_0
    //   616: invokevirtual getPaddingBottom : ()I
    //   619: iadd
    //   620: iadd
    //   621: aload_0
    //   622: invokevirtual getSuggestedMinimumHeight : ()I
    //   625: invokestatic max : (II)I
    //   628: istore #4
    //   630: aload_0
    //   631: iload_3
    //   632: iload #6
    //   634: iload #7
    //   636: iadd
    //   637: iadd
    //   638: aload_0
    //   639: invokevirtual getSuggestedMinimumWidth : ()I
    //   642: invokestatic max : (II)I
    //   645: iload_1
    //   646: iload #5
    //   648: invokestatic resolveSizeAndState : (III)I
    //   651: iload #4
    //   653: iload_2
    //   654: iload #5
    //   656: bipush #16
    //   658: ishl
    //   659: invokestatic resolveSizeAndState : (III)I
    //   662: invokevirtual setMeasuredDimension : (II)V
    //   665: return
  }
  
  public boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean) {
    if (!this.l || !paramBoolean)
      return false; 
    if (a(paramFloat2)) {
      k();
    } else {
      n();
    } 
    this.m = true;
    return true;
  }
  
  public boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2) {
    return false;
  }
  
  public void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfint) {}
  
  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.n += paramInt2;
    setActionBarHideOffset(this.n);
  }
  
  public void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt) {
    this.G.a(paramView1, paramView2, paramInt);
    this.n = getActionBarHideOffset();
    h();
    d d1 = this.A;
    if (d1 != null)
      d1.b(); 
  }
  
  public boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt) {
    return ((paramInt & 0x2) == 0 || this.f.getVisibility() != 0) ? false : this.l;
  }
  
  public void onStopNestedScroll(View paramView) {
    if (this.l && !this.m)
      if (this.n <= this.f.getHeight()) {
        m();
      } else {
        l();
      }  
    d d1 = this.A;
    if (d1 != null)
      d1.c(); 
  }
  
  public void onWindowSystemUiVisibilityChanged(int paramInt) {
    boolean bool1;
    if (Build.VERSION.SDK_INT >= 16)
      super.onWindowSystemUiVisibilityChanged(paramInt); 
    j();
    int i = this.o;
    this.o = paramInt;
    boolean bool2 = false;
    if ((paramInt & 0x4) == 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    if ((paramInt & 0x100) != 0)
      bool2 = true; 
    d d1 = this.A;
    if (d1 != null) {
      d1.a(bool2 ^ true);
      if (bool1 || !bool2) {
        this.A.a();
      } else {
        this.A.d();
      } 
    } 
    if (((i ^ paramInt) & 0x100) != 0 && this.A != null)
      v.N((View)this); 
  }
  
  protected void onWindowVisibilityChanged(int paramInt) {
    super.onWindowVisibilityChanged(paramInt);
    this.d = paramInt;
    d d1 = this.A;
    if (d1 != null)
      d1.a(paramInt); 
  }
  
  public void setActionBarHideOffset(int paramInt) {
    h();
    paramInt = Math.max(0, Math.min(paramInt, this.f.getHeight()));
    this.f.setTranslationY(-paramInt);
  }
  
  public void setActionBarVisibilityCallback(d paramd) {
    this.A = paramd;
    if (getWindowToken() != null) {
      this.A.a(this.d);
      int i = this.o;
      if (i != 0) {
        onWindowSystemUiVisibilityChanged(i);
        v.N((View)this);
      } 
    } 
  }
  
  public void setHasNonEmbeddedTabs(boolean paramBoolean) {
    this.k = paramBoolean;
  }
  
  public void setHideOnContentScrollEnabled(boolean paramBoolean) {
    if (paramBoolean != this.l) {
      this.l = paramBoolean;
      if (!paramBoolean) {
        h();
        setActionBarHideOffset(0);
      } 
    } 
  }
  
  public void setIcon(int paramInt) {
    j();
    this.g.setIcon(paramInt);
  }
  
  public void setIcon(Drawable paramDrawable) {
    j();
    this.g.setIcon(paramDrawable);
  }
  
  public void setLogo(int paramInt) {
    j();
    this.g.b(paramInt);
  }
  
  public void setOverlayMode(boolean paramBoolean) {
    this.j = paramBoolean;
    if (paramBoolean && (getContext().getApplicationInfo()).targetSdkVersion < 19) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    } 
    this.i = paramBoolean;
  }
  
  public void setShowingForActionMode(boolean paramBoolean) {}
  
  public void setUiOptions(int paramInt) {}
  
  public void setWindowCallback(Window.Callback paramCallback) {
    j();
    this.g.setWindowCallback(paramCallback);
  }
  
  public void setWindowTitle(CharSequence paramCharSequence) {
    j();
    this.g.setWindowTitle(paramCharSequence);
  }
  
  public boolean shouldDelayChildPressedState() {
    return false;
  }
  
  class a extends AnimatorListenerAdapter {
    a(ActionBarOverlayLayout this$0) {}
    
    public void onAnimationCancel(Animator param1Animator) {
      ActionBarOverlayLayout actionBarOverlayLayout = this.a;
      actionBarOverlayLayout.C = null;
      actionBarOverlayLayout.m = false;
    }
    
    public void onAnimationEnd(Animator param1Animator) {
      ActionBarOverlayLayout actionBarOverlayLayout = this.a;
      actionBarOverlayLayout.C = null;
      actionBarOverlayLayout.m = false;
    }
  }
  
  class b implements Runnable {
    b(ActionBarOverlayLayout this$0) {}
    
    public void run() {
      this.c.h();
      ActionBarOverlayLayout actionBarOverlayLayout = this.c;
      actionBarOverlayLayout.C = actionBarOverlayLayout.f.animate().translationY(0.0F).setListener((Animator.AnimatorListener)this.c.D);
    }
  }
  
  class c implements Runnable {
    c(ActionBarOverlayLayout this$0) {}
    
    public void run() {
      this.c.h();
      ActionBarOverlayLayout actionBarOverlayLayout = this.c;
      actionBarOverlayLayout.C = actionBarOverlayLayout.f.animate().translationY(-this.c.f.getHeight()).setListener((Animator.AnimatorListener)this.c.D);
    }
  }
  
  public static interface d {
    void a();
    
    void a(int param1Int);
    
    void a(boolean param1Boolean);
    
    void b();
    
    void c();
    
    void d();
  }
  
  public static class e extends ViewGroup.MarginLayoutParams {
    public e(int param1Int1, int param1Int2) {
      super(param1Int1, param1Int2);
    }
    
    public e(Context param1Context, AttributeSet param1AttributeSet) {
      super(param1Context, param1AttributeSet);
    }
    
    public e(ViewGroup.LayoutParams param1LayoutParams) {
      super(param1LayoutParams);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/widget/ActionBarOverlayLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */