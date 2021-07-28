package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.d;
import b.g.m.d0;
import b.g.m.r;
import b.g.m.v;
import com.google.android.material.internal.g;
import e.f.a.f.a0.g;
import e.f.a.f.a0.h;
import e.f.a.f.g;
import e.f.a.f.j;
import e.f.a.f.k;
import java.lang.ref.WeakReference;
import java.util.List;

@d(AppBarLayout.Behavior.class)
public class AppBarLayout extends LinearLayout {
  private int c;
  
  private int d = -1;
  
  private int e = -1;
  
  private int f = -1;
  
  private boolean g;
  
  private int h = 0;
  
  private d0 i;
  
  private List<c> j;
  
  private boolean k;
  
  private boolean l;
  
  private boolean m;
  
  private boolean n;
  
  private int o;
  
  private WeakReference<View> p;
  
  private ValueAnimator q;
  
  private int[] r;
  
  private Drawable s;
  
  public AppBarLayout(Context paramContext) {
    this(paramContext, null);
  }
  
  public AppBarLayout(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, e.f.a.f.b.appBarLayoutStyle);
  }
  
  public AppBarLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    setOrientation(1);
    if (Build.VERSION.SDK_INT >= 21) {
      e.a((View)this);
      e.a((View)this, paramAttributeSet, paramInt, j.Widget_Design_AppBarLayout);
    } 
    TypedArray typedArray = g.c(paramContext, paramAttributeSet, k.AppBarLayout, paramInt, j.Widget_Design_AppBarLayout, new int[0]);
    v.a((View)this, typedArray.getDrawable(k.AppBarLayout_android_background));
    if (getBackground() instanceof ColorDrawable) {
      ColorDrawable colorDrawable = (ColorDrawable)getBackground();
      g g = new g();
      g.a(ColorStateList.valueOf(colorDrawable.getColor()));
      g.a(paramContext);
      v.a((View)this, (Drawable)g);
    } 
    if (typedArray.hasValue(k.AppBarLayout_expanded))
      a(typedArray.getBoolean(k.AppBarLayout_expanded, false), false, false); 
    if (Build.VERSION.SDK_INT >= 21 && typedArray.hasValue(k.AppBarLayout_elevation))
      e.a((View)this, typedArray.getDimensionPixelSize(k.AppBarLayout_elevation, 0)); 
    if (Build.VERSION.SDK_INT >= 26) {
      if (typedArray.hasValue(k.AppBarLayout_android_keyboardNavigationCluster))
        setKeyboardNavigationCluster(typedArray.getBoolean(k.AppBarLayout_android_keyboardNavigationCluster, false)); 
      if (typedArray.hasValue(k.AppBarLayout_android_touchscreenBlocksFocus))
        setTouchscreenBlocksFocus(typedArray.getBoolean(k.AppBarLayout_android_touchscreenBlocksFocus, false)); 
    } 
    this.n = typedArray.getBoolean(k.AppBarLayout_liftOnScroll, false);
    this.o = typedArray.getResourceId(k.AppBarLayout_liftOnScrollTargetViewId, -1);
    setStatusBarForeground(typedArray.getDrawable(k.AppBarLayout_statusBarForeground));
    typedArray.recycle();
    v.a((View)this, new a(this));
  }
  
  private void a(g paramg, boolean paramBoolean) {
    float f2;
    float f1 = getResources().getDimension(e.f.a.f.d.design_appbar_elevation);
    if (paramBoolean) {
      f2 = 0.0F;
    } else {
      f2 = f1;
    } 
    if (!paramBoolean)
      f1 = 0.0F; 
    ValueAnimator valueAnimator = this.q;
    if (valueAnimator != null)
      valueAnimator.cancel(); 
    this.q = ValueAnimator.ofFloat(new float[] { f2, f1 });
    this.q.setDuration(getResources().getInteger(g.app_bar_elevation_anim_duration));
    this.q.setInterpolator(e.f.a.f.l.a.a);
    this.q.addUpdateListener(new b(this, paramg));
    this.q.start();
  }
  
  private void a(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    byte b1;
    byte b2;
    if (paramBoolean1) {
      b1 = 1;
    } else {
      b1 = 2;
    } 
    byte b3 = 0;
    if (paramBoolean2) {
      b2 = 4;
    } else {
      b2 = 0;
    } 
    if (paramBoolean3)
      b3 = 8; 
    this.h = b1 | b2 | b3;
    requestLayout();
  }
  
  private View b(View paramView) {
    WeakReference<View> weakReference = this.p;
    View view = null;
    if (weakReference == null) {
      int i = this.o;
      if (i != -1) {
        if (paramView != null) {
          paramView = paramView.findViewById(i);
        } else {
          paramView = null;
        } 
        View view1 = paramView;
        if (paramView == null) {
          view1 = paramView;
          if (getParent() instanceof ViewGroup)
            view1 = ((ViewGroup)getParent()).findViewById(this.o); 
        } 
        if (view1 != null)
          this.p = new WeakReference<View>(view1); 
      } 
    } 
    weakReference = this.p;
    paramView = view;
    if (weakReference != null)
      paramView = weakReference.get(); 
    return paramView;
  }
  
  private boolean b(boolean paramBoolean) {
    if (this.l != paramBoolean) {
      this.l = paramBoolean;
      refreshDrawableState();
      return true;
    } 
    return false;
  }
  
  private void e() {
    WeakReference<View> weakReference = this.p;
    if (weakReference != null)
      weakReference.clear(); 
    this.p = null;
  }
  
  private boolean f() {
    int j = getChildCount();
    for (int i = 0; i < j; i++) {
      if (((d)getChildAt(i).getLayoutParams()).c())
        return true; 
    } 
    return false;
  }
  
  private void g() {
    this.d = -1;
    this.e = -1;
    this.f = -1;
  }
  
  private boolean h() {
    return (this.s != null && getTopInset() > 0);
  }
  
  private boolean i() {
    int i = getChildCount();
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (i > 0) {
      View view = getChildAt(0);
      bool1 = bool2;
      if (view.getVisibility() != 8) {
        bool1 = bool2;
        if (!v.m(view))
          bool1 = true; 
      } 
    } 
    return bool1;
  }
  
  private void j() {
    setWillNotDraw(h() ^ true);
  }
  
  d0 a(d0 paramd0) {
    d0 d01;
    if (v.m((View)this)) {
      d01 = paramd0;
    } else {
      d01 = null;
    } 
    if (!androidx.core.util.b.a(this.i, d01)) {
      this.i = d01;
      j();
      requestLayout();
    } 
    return paramd0;
  }
  
  void a(int paramInt) {
    this.c = paramInt;
    if (!willNotDraw())
      v.M((View)this); 
    List<c> list = this.j;
    if (list != null) {
      int i = 0;
      int j = list.size();
      while (i < j) {
        c<AppBarLayout> c = this.j.get(i);
        if (c != null)
          c.a(this, paramInt); 
        i++;
      } 
    } 
  }
  
  public void a(boolean paramBoolean1, boolean paramBoolean2) {
    a(paramBoolean1, paramBoolean2, true);
  }
  
  boolean a() {
    return this.g;
  }
  
  boolean a(View paramView) {
    View view = b(paramView);
    if (view != null)
      paramView = view; 
    return (paramView != null && (paramView.canScrollVertically(-1) || paramView.getScrollY() > 0));
  }
  
  boolean a(boolean paramBoolean) {
    if (this.m != paramBoolean) {
      this.m = paramBoolean;
      refreshDrawableState();
      if (this.n && getBackground() instanceof g)
        a((g)getBackground(), paramBoolean); 
      return true;
    } 
    return false;
  }
  
  boolean b() {
    return (getTotalScrollRange() != 0);
  }
  
  public boolean c() {
    return this.n;
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    return paramLayoutParams instanceof d;
  }
  
  void d() {
    this.h = 0;
  }
  
  public void draw(Canvas paramCanvas) {
    super.draw(paramCanvas);
    if (h()) {
      int i = paramCanvas.save();
      paramCanvas.translate(0.0F, -this.c);
      this.s.draw(paramCanvas);
      paramCanvas.restoreToCount(i);
    } 
  }
  
  protected void drawableStateChanged() {
    super.drawableStateChanged();
    int[] arrayOfInt = getDrawableState();
    Drawable drawable = this.s;
    if (drawable != null && drawable.isStateful() && drawable.setState(arrayOfInt))
      invalidateDrawable(drawable); 
  }
  
  protected d generateDefaultLayoutParams() {
    return new d(-1, -2);
  }
  
  public d generateLayoutParams(AttributeSet paramAttributeSet) {
    return new d(getContext(), paramAttributeSet);
  }
  
  protected d generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    return (Build.VERSION.SDK_INT >= 19 && paramLayoutParams instanceof LinearLayout.LayoutParams) ? new d((LinearLayout.LayoutParams)paramLayoutParams) : ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams) ? new d((ViewGroup.MarginLayoutParams)paramLayoutParams) : new d(paramLayoutParams));
  }
  
  int getDownNestedPreScrollRange() {
    int i = this.e;
    if (i != -1)
      return i; 
    int j = getChildCount() - 1;
    int k = 0;
    while (true) {
      if (j >= 0) {
        View view = getChildAt(j);
        d d = (d)view.getLayoutParams();
        int n = view.getMeasuredHeight();
        i = d.a;
        if ((i & 0x5) == 5) {
          int i1 = d.topMargin + d.bottomMargin;
          if ((i & 0x8) != 0) {
            i = v.q(view);
          } else if ((i & 0x2) != 0) {
            i = n - v.q(view);
          } else {
            i = i1 + n;
            i1 = i;
          } 
          i = i1 + i;
        } else {
          i = k;
          if (k)
            break; 
          j--;
          k = i;
        } 
      } else {
        break;
      } 
      int m = i;
    } 
    i = Math.max(0, k);
    this.e = i;
    return i;
  }
  
  int getDownNestedScrollRange() {
    int k;
    int i = this.f;
    if (i != -1)
      return i; 
    int m = getChildCount();
    int j = 0;
    i = 0;
    while (true) {
      k = i;
      if (j < m) {
        View view = getChildAt(j);
        d d = (d)view.getLayoutParams();
        int i1 = view.getMeasuredHeight();
        int i2 = d.topMargin;
        int i3 = d.bottomMargin;
        int n = d.a;
        k = i;
        if ((n & 0x1) != 0) {
          i += i1 + i2 + i3;
          if ((n & 0x2) != 0) {
            k = i - v.q(view);
            break;
          } 
          j++;
          continue;
        } 
      } 
      break;
    } 
    i = Math.max(0, k);
    this.f = i;
    return i;
  }
  
  public int getLiftOnScrollTargetViewId() {
    return this.o;
  }
  
  public final int getMinimumHeightForVisibleOverlappingContent() {
    int j = getTopInset();
    int i = v.q((View)this);
    if (i == 0) {
      i = getChildCount();
      if (i >= 1) {
        i = v.q(getChildAt(i - 1));
      } else {
        i = 0;
      } 
      if (i == 0)
        return getHeight() / 3; 
    } 
    return i * 2 + j;
  }
  
  int getPendingAction() {
    return this.h;
  }
  
  public Drawable getStatusBarForeground() {
    return this.s;
  }
  
  @Deprecated
  public float getTargetElevation() {
    return 0.0F;
  }
  
  final int getTopInset() {
    d0 d01 = this.i;
    return (d01 != null) ? d01.g() : 0;
  }
  
  public final int getTotalScrollRange() {
    int k;
    int i = this.d;
    if (i != -1)
      return i; 
    int m = getChildCount();
    int j = 0;
    i = 0;
    while (true) {
      k = i;
      if (j < m) {
        View view = getChildAt(j);
        d d = (d)view.getLayoutParams();
        int i1 = view.getMeasuredHeight();
        int n = d.a;
        k = i;
        if ((n & 0x1) != 0) {
          k = i + i1 + d.topMargin + d.bottomMargin;
          i = k;
          if (j == 0) {
            i = k;
            if (v.m(view))
              i = k - getTopInset(); 
          } 
          if ((n & 0x2) != 0) {
            k = i - v.q(view);
            break;
          } 
          j++;
          continue;
        } 
      } 
      break;
    } 
    i = Math.max(0, k);
    this.d = i;
    return i;
  }
  
  int getUpNestedPreScrollRange() {
    return getTotalScrollRange();
  }
  
  protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    h.a((View)this);
  }
  
  protected int[] onCreateDrawableState(int paramInt) {
    if (this.r == null)
      this.r = new int[4]; 
    int[] arrayOfInt1 = this.r;
    int[] arrayOfInt2 = super.onCreateDrawableState(paramInt + arrayOfInt1.length);
    if (this.l) {
      paramInt = e.f.a.f.b.state_liftable;
    } else {
      paramInt = -e.f.a.f.b.state_liftable;
    } 
    arrayOfInt1[0] = paramInt;
    if (this.l && this.m) {
      paramInt = e.f.a.f.b.state_lifted;
    } else {
      paramInt = -e.f.a.f.b.state_lifted;
    } 
    arrayOfInt1[1] = paramInt;
    if (this.l) {
      paramInt = e.f.a.f.b.state_collapsible;
    } else {
      paramInt = -e.f.a.f.b.state_collapsible;
    } 
    arrayOfInt1[2] = paramInt;
    if (this.l && this.m) {
      paramInt = e.f.a.f.b.state_collapsed;
    } else {
      paramInt = -e.f.a.f.b.state_collapsed;
    } 
    arrayOfInt1[3] = paramInt;
    return LinearLayout.mergeDrawableStates(arrayOfInt2, arrayOfInt1);
  }
  
  protected void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    e();
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (v.m((View)this) && i()) {
      paramInt2 = getTopInset();
      for (paramInt1 = getChildCount() - 1; paramInt1 >= 0; paramInt1--)
        v.e(getChildAt(paramInt1), paramInt2); 
    } 
    g();
    paramBoolean = false;
    this.g = false;
    paramInt2 = getChildCount();
    for (paramInt1 = 0; paramInt1 < paramInt2; paramInt1++) {
      if (((d)getChildAt(paramInt1).getLayoutParams()).b() != null) {
        this.g = true;
        break;
      } 
    } 
    Drawable drawable = this.s;
    if (drawable != null)
      drawable.setBounds(0, 0, getWidth(), getTopInset()); 
    if (!this.k) {
      if (this.n || f())
        paramBoolean = true; 
      b(paramBoolean);
    } 
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    super.onMeasure(paramInt1, paramInt2);
    int i = View.MeasureSpec.getMode(paramInt2);
    if (i != 1073741824 && v.m((View)this) && i()) {
      paramInt1 = getMeasuredHeight();
      if (i != Integer.MIN_VALUE) {
        if (i == 0)
          paramInt1 += getTopInset(); 
      } else {
        paramInt1 = b.g.i.a.a(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(paramInt2));
      } 
      setMeasuredDimension(getMeasuredWidth(), paramInt1);
    } 
    g();
  }
  
  public void setElevation(float paramFloat) {
    super.setElevation(paramFloat);
    h.a((View)this, paramFloat);
  }
  
  public void setExpanded(boolean paramBoolean) {
    a(paramBoolean, v.I((View)this));
  }
  
  public void setLiftOnScroll(boolean paramBoolean) {
    this.n = paramBoolean;
  }
  
  public void setLiftOnScrollTargetViewId(int paramInt) {
    this.o = paramInt;
    e();
  }
  
  public void setOrientation(int paramInt) {
    if (paramInt == 1) {
      super.setOrientation(paramInt);
      return;
    } 
    throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
  }
  
  public void setStatusBarForeground(Drawable paramDrawable) {
    Drawable drawable = this.s;
    if (drawable != paramDrawable) {
      Drawable drawable1 = null;
      if (drawable != null)
        drawable.setCallback(null); 
      if (paramDrawable != null)
        drawable1 = paramDrawable.mutate(); 
      this.s = drawable1;
      paramDrawable = this.s;
      if (paramDrawable != null) {
        boolean bool;
        if (paramDrawable.isStateful())
          this.s.setState(getDrawableState()); 
        androidx.core.graphics.drawable.a.a(this.s, v.p((View)this));
        paramDrawable = this.s;
        if (getVisibility() == 0) {
          bool = true;
        } else {
          bool = false;
        } 
        paramDrawable.setVisible(bool, false);
        this.s.setCallback((Drawable.Callback)this);
      } 
      j();
      v.M((View)this);
    } 
  }
  
  public void setStatusBarForegroundColor(int paramInt) {
    setStatusBarForeground((Drawable)new ColorDrawable(paramInt));
  }
  
  public void setStatusBarForegroundResource(int paramInt) {
    setStatusBarForeground(b.a.k.a.a.c(getContext(), paramInt));
  }
  
  @Deprecated
  public void setTargetElevation(float paramFloat) {
    if (Build.VERSION.SDK_INT >= 21)
      e.a((View)this, paramFloat); 
  }
  
  public void setVisibility(int paramInt) {
    boolean bool;
    super.setVisibility(paramInt);
    if (paramInt == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    Drawable drawable = this.s;
    if (drawable != null)
      drawable.setVisible(bool, false); 
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable) {
    return (super.verifyDrawable(paramDrawable) || paramDrawable == this.s);
  }
  
  protected static class BaseBehavior<T extends AppBarLayout> extends a<T> {
    private int k;
    
    private int l;
    
    private ValueAnimator m;
    
    private int n = -1;
    
    private boolean o;
    
    private float p;
    
    private WeakReference<View> q;
    
    private b r;
    
    public BaseBehavior() {}
    
    public BaseBehavior(Context param1Context, AttributeSet param1AttributeSet) {
      super(param1Context, param1AttributeSet);
    }
    
    private View a(CoordinatorLayout param1CoordinatorLayout) {
      int j = param1CoordinatorLayout.getChildCount();
      int i = 0;
      while (i < j) {
        View view = param1CoordinatorLayout.getChildAt(i);
        if (!(view instanceof b.g.m.l) && !(view instanceof android.widget.ListView)) {
          if (view instanceof android.widget.ScrollView)
            return view; 
          i++;
          continue;
        } 
        return view;
      } 
      return null;
    }
    
    private static View a(AppBarLayout param1AppBarLayout, int param1Int) {
      int i = Math.abs(param1Int);
      int j = param1AppBarLayout.getChildCount();
      for (param1Int = 0; param1Int < j; param1Int++) {
        View view = param1AppBarLayout.getChildAt(param1Int);
        if (i >= view.getTop() && i <= view.getBottom())
          return view; 
      } 
      return null;
    }
    
    private void a(CoordinatorLayout param1CoordinatorLayout, T param1T, int param1Int, float param1Float) {
      int i = Math.abs(c() - param1Int);
      param1Float = Math.abs(param1Float);
      if (param1Float > 0.0F) {
        i = Math.round(i / param1Float * 1000.0F) * 3;
      } else {
        i = (int)((i / param1T.getHeight() + 1.0F) * 150.0F);
      } 
      a(param1CoordinatorLayout, param1T, param1Int, i);
    }
    
    private void a(CoordinatorLayout param1CoordinatorLayout, T param1T, int param1Int1, int param1Int2) {
      ValueAnimator valueAnimator1;
      int i = c();
      if (i == param1Int1) {
        valueAnimator1 = this.m;
        if (valueAnimator1 != null && valueAnimator1.isRunning())
          this.m.cancel(); 
        return;
      } 
      ValueAnimator valueAnimator2 = this.m;
      if (valueAnimator2 == null) {
        this.m = new ValueAnimator();
        this.m.setInterpolator(e.f.a.f.l.a.e);
        this.m.addUpdateListener(new a(this, (CoordinatorLayout)valueAnimator1, (AppBarLayout)param1T));
      } else {
        valueAnimator2.cancel();
      } 
      this.m.setDuration(Math.min(param1Int2, 600));
      this.m.setIntValues(new int[] { i, param1Int1 });
      this.m.start();
    }
    
    private void a(CoordinatorLayout param1CoordinatorLayout, T param1T, int param1Int1, int param1Int2, boolean param1Boolean) {
      // Byte code:
      //   0: aload_2
      //   1: iload_3
      //   2: invokestatic a : (Lcom/google/android/material/appbar/AppBarLayout;I)Landroid/view/View;
      //   5: astore #10
      //   7: aload #10
      //   9: ifnull -> 172
      //   12: aload #10
      //   14: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
      //   17: checkcast com/google/android/material/appbar/AppBarLayout$d
      //   20: invokevirtual a : ()I
      //   23: istore #6
      //   25: iconst_0
      //   26: istore #9
      //   28: iload #9
      //   30: istore #8
      //   32: iload #6
      //   34: iconst_1
      //   35: iand
      //   36: ifeq -> 123
      //   39: aload #10
      //   41: invokestatic q : (Landroid/view/View;)I
      //   44: istore #7
      //   46: iload #4
      //   48: ifle -> 87
      //   51: iload #6
      //   53: bipush #12
      //   55: iand
      //   56: ifeq -> 87
      //   59: iload #9
      //   61: istore #8
      //   63: iload_3
      //   64: ineg
      //   65: aload #10
      //   67: invokevirtual getBottom : ()I
      //   70: iload #7
      //   72: isub
      //   73: aload_2
      //   74: invokevirtual getTopInset : ()I
      //   77: isub
      //   78: if_icmplt -> 123
      //   81: iconst_1
      //   82: istore #8
      //   84: goto -> 123
      //   87: iload #9
      //   89: istore #8
      //   91: iload #6
      //   93: iconst_2
      //   94: iand
      //   95: ifeq -> 123
      //   98: iload #9
      //   100: istore #8
      //   102: iload_3
      //   103: ineg
      //   104: aload #10
      //   106: invokevirtual getBottom : ()I
      //   109: iload #7
      //   111: isub
      //   112: aload_2
      //   113: invokevirtual getTopInset : ()I
      //   116: isub
      //   117: if_icmplt -> 123
      //   120: goto -> 81
      //   123: aload_2
      //   124: invokevirtual c : ()Z
      //   127: ifeq -> 141
      //   130: aload_2
      //   131: aload_0
      //   132: aload_1
      //   133: invokespecial a : (Landroidx/coordinatorlayout/widget/CoordinatorLayout;)Landroid/view/View;
      //   136: invokevirtual a : (Landroid/view/View;)Z
      //   139: istore #8
      //   141: aload_2
      //   142: iload #8
      //   144: invokevirtual a : (Z)Z
      //   147: istore #8
      //   149: iload #5
      //   151: ifne -> 168
      //   154: iload #8
      //   156: ifeq -> 172
      //   159: aload_0
      //   160: aload_1
      //   161: aload_2
      //   162: invokespecial c : (Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/appbar/AppBarLayout;)Z
      //   165: ifeq -> 172
      //   168: aload_2
      //   169: invokevirtual jumpDrawablesToCurrentState : ()V
      //   172: return
    }
    
    private static boolean a(int param1Int1, int param1Int2) {
      return ((param1Int1 & param1Int2) == param1Int2);
    }
    
    private boolean a(CoordinatorLayout param1CoordinatorLayout, T param1T, View param1View) {
      return (param1T.b() && param1CoordinatorLayout.getHeight() - param1View.getHeight() <= param1T.getHeight());
    }
    
    private int b(T param1T, int param1Int) {
      int j = param1T.getChildCount();
      for (int i = 0; i < j; i++) {
        View view = param1T.getChildAt(i);
        int i1 = view.getTop();
        int n = view.getBottom();
        AppBarLayout.d d = (AppBarLayout.d)view.getLayoutParams();
        int m = i1;
        int k = n;
        if (a(d.a(), 32)) {
          m = i1 - d.topMargin;
          k = n + d.bottomMargin;
        } 
        n = -param1Int;
        if (m <= n && k >= n)
          return i; 
      } 
      return -1;
    }
    
    private int c(T param1T, int param1Int) {
      int k = Math.abs(param1Int);
      int m = param1T.getChildCount();
      int j = 0;
      int i;
      for (i = 0; i < m; i++) {
        View view = param1T.getChildAt(i);
        AppBarLayout.d d = (AppBarLayout.d)view.getLayoutParams();
        Interpolator interpolator = d.b();
        if (k >= view.getTop() && k <= view.getBottom()) {
          if (interpolator != null) {
            m = d.a();
            i = j;
            if ((m & 0x1) != 0) {
              j = 0 + view.getHeight() + d.topMargin + d.bottomMargin;
              i = j;
              if ((m & 0x2) != 0)
                i = j - v.q(view); 
            } 
            j = i;
            if (v.m(view))
              j = i - param1T.getTopInset(); 
            if (j > 0) {
              i = view.getTop();
              float f = j;
              i = Math.round(f * interpolator.getInterpolation((k - i) / f));
              return Integer.signum(param1Int) * (view.getTop() + i);
            } 
          } 
          break;
        } 
      } 
      return param1Int;
    }
    
    private boolean c(CoordinatorLayout param1CoordinatorLayout, T param1T) {
      List<View> list = param1CoordinatorLayout.c((View)param1T);
      int j = list.size();
      boolean bool = false;
      for (int i = 0; i < j; i++) {
        CoordinatorLayout.c c = ((CoordinatorLayout.f)((View)list.get(i)).getLayoutParams()).d();
        if (c instanceof AppBarLayout.ScrollingViewBehavior) {
          if (((AppBarLayout.ScrollingViewBehavior)c).c() != 0)
            bool = true; 
          return bool;
        } 
      } 
      return false;
    }
    
    private void d(CoordinatorLayout param1CoordinatorLayout, T param1T) {
      int j = c();
      int i = b(param1T, j);
      if (i >= 0) {
        View view = param1T.getChildAt(i);
        AppBarLayout.d d = (AppBarLayout.d)view.getLayoutParams();
        int k = d.a();
        if ((k & 0x11) == 17) {
          int i1 = -view.getTop();
          int m = -view.getBottom();
          int n = m;
          if (i == param1T.getChildCount() - 1)
            n = m + param1T.getTopInset(); 
          if (a(k, 2)) {
            m = n + v.q(view);
            i = i1;
          } else {
            i = i1;
            m = n;
            if (a(k, 5)) {
              m = v.q(view) + n;
              if (j < m) {
                i = m;
                m = n;
              } else {
                i = i1;
              } 
            } 
          } 
          i1 = i;
          n = m;
          if (a(k, 32)) {
            i1 = i + d.topMargin;
            n = m - d.bottomMargin;
          } 
          m = i1;
          if (j < (n + i1) / 2)
            m = n; 
          a(param1CoordinatorLayout, param1T, b.g.i.a.a(m, -param1T.getTotalScrollRange(), 0), 0.0F);
        } 
      } 
    }
    
    int a(CoordinatorLayout param1CoordinatorLayout, T param1T, int param1Int1, int param1Int2, int param1Int3) {
      int i = c();
      if (param1Int2 != 0 && i >= param1Int2 && i <= param1Int3) {
        param1Int2 = b.g.i.a.a(param1Int1, param1Int2, param1Int3);
        if (i != param1Int2) {
          if (param1T.a()) {
            param1Int1 = c(param1T, param1Int2);
          } else {
            param1Int1 = param1Int2;
          } 
          boolean bool = a(param1Int1);
          this.k = param1Int2 - param1Int1;
          if (!bool && param1T.a())
            param1CoordinatorLayout.a((View)param1T); 
          param1T.a(b());
          if (param1Int2 < i) {
            param1Int1 = -1;
          } else {
            param1Int1 = 1;
          } 
          a(param1CoordinatorLayout, param1T, param1Int2, param1Int1, false);
          return i - param1Int2;
        } 
      } else {
        this.k = 0;
      } 
      return 0;
    }
    
    void a(CoordinatorLayout param1CoordinatorLayout, T param1T) {
      d(param1CoordinatorLayout, param1T);
      if (param1T.c())
        param1T.a(param1T.a(a(param1CoordinatorLayout))); 
    }
    
    public void a(CoordinatorLayout param1CoordinatorLayout, T param1T, Parcelable param1Parcelable) {
      c c;
      if (param1Parcelable instanceof c) {
        c = (c)param1Parcelable;
        super.a(param1CoordinatorLayout, (View)param1T, c.e());
        this.n = c.e;
        this.p = c.f;
        this.o = c.g;
        return;
      } 
      super.a(param1CoordinatorLayout, (View)param1T, (Parcelable)c);
      this.n = -1;
    }
    
    public void a(CoordinatorLayout param1CoordinatorLayout, T param1T, View param1View, int param1Int) {
      if (this.l == 0 || param1Int == 1) {
        d(param1CoordinatorLayout, param1T);
        if (param1T.c())
          param1T.a(param1T.a(param1View)); 
      } 
      this.q = new WeakReference<View>(param1View);
    }
    
    public void a(CoordinatorLayout param1CoordinatorLayout, T param1T, View param1View, int param1Int1, int param1Int2, int param1Int3, int param1Int4, int param1Int5, int[] param1ArrayOfint) {
      if (param1Int4 < 0)
        param1ArrayOfint[1] = a(param1CoordinatorLayout, (V)param1T, param1Int4, -param1T.getDownNestedScrollRange(), 0); 
    }
    
    public void a(CoordinatorLayout param1CoordinatorLayout, T param1T, View param1View, int param1Int1, int param1Int2, int[] param1ArrayOfint, int param1Int3) {
      if (param1Int2 != 0) {
        if (param1Int2 < 0) {
          param1Int3 = -param1T.getTotalScrollRange();
          int i = param1T.getDownNestedPreScrollRange();
          param1Int1 = param1Int3;
          param1Int3 = i + param1Int3;
        } else {
          param1Int1 = -param1T.getUpNestedPreScrollRange();
          param1Int3 = 0;
        } 
        if (param1Int1 != param1Int3)
          param1ArrayOfint[1] = a(param1CoordinatorLayout, (V)param1T, param1Int2, param1Int1, param1Int3); 
      } 
      if (param1T.c())
        param1T.a(param1T.a(param1View)); 
    }
    
    public boolean a(CoordinatorLayout param1CoordinatorLayout, T param1T, int param1Int) {
      boolean bool = super.a(param1CoordinatorLayout, param1T, param1Int);
      int i = param1T.getPendingAction();
      param1Int = this.n;
      if (param1Int >= 0 && (i & 0x8) == 0) {
        View view = param1T.getChildAt(param1Int);
        i = -view.getBottom();
        if (this.o) {
          param1Int = v.q(view) + param1T.getTopInset();
        } else {
          param1Int = Math.round(view.getHeight() * this.p);
        } 
        c(param1CoordinatorLayout, (V)param1T, i + param1Int);
      } else if (i != 0) {
        if ((i & 0x4) != 0) {
          param1Int = 1;
        } else {
          param1Int = 0;
        } 
        if ((i & 0x2) != 0) {
          i = -param1T.getUpNestedPreScrollRange();
          if (param1Int != 0) {
            a(param1CoordinatorLayout, param1T, i, 0.0F);
          } else {
            c(param1CoordinatorLayout, (V)param1T, i);
          } 
        } else if ((i & 0x1) != 0) {
          if (param1Int != 0) {
            a(param1CoordinatorLayout, param1T, 0, 0.0F);
          } else {
            c(param1CoordinatorLayout, (V)param1T, 0);
          } 
        } 
      } 
      param1T.d();
      this.n = -1;
      a(b.g.i.a.a(b(), -param1T.getTotalScrollRange(), 0));
      a(param1CoordinatorLayout, param1T, b(), 0, true);
      param1T.a(b());
      return bool;
    }
    
    public boolean a(CoordinatorLayout param1CoordinatorLayout, T param1T, int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      if (((ViewGroup.MarginLayoutParams)param1T.getLayoutParams()).height == -2) {
        param1CoordinatorLayout.a((View)param1T, param1Int1, param1Int2, View.MeasureSpec.makeMeasureSpec(0, 0), param1Int4);
        return true;
      } 
      return super.a(param1CoordinatorLayout, (View)param1T, param1Int1, param1Int2, param1Int3, param1Int4);
    }
    
    public boolean a(CoordinatorLayout param1CoordinatorLayout, T param1T, View param1View1, View param1View2, int param1Int1, int param1Int2) {
      boolean bool;
      if ((param1Int1 & 0x2) != 0 && (param1T.c() || a(param1CoordinatorLayout, param1T, param1View1))) {
        bool = true;
      } else {
        bool = false;
      } 
      if (bool) {
        ValueAnimator valueAnimator = this.m;
        if (valueAnimator != null)
          valueAnimator.cancel(); 
      } 
      this.q = null;
      this.l = param1Int2;
      return bool;
    }
    
    boolean a(T param1T) {
      b<T> b1 = this.r;
      if (b1 != null)
        return b1.a(param1T); 
      WeakReference<View> weakReference = this.q;
      boolean bool = true;
      if (weakReference != null) {
        View view = weakReference.get();
        if (view != null && view.isShown() && !view.canScrollVertically(-1))
          return true; 
        bool = false;
      } 
      return bool;
    }
    
    int b(T param1T) {
      return -param1T.getDownNestedScrollRange();
    }
    
    public Parcelable b(CoordinatorLayout param1CoordinatorLayout, T param1T) {
      c c;
      Parcelable parcelable = super.d(param1CoordinatorLayout, (View)param1T);
      int j = b();
      int k = param1T.getChildCount();
      boolean bool = false;
      for (int i = 0; i < k; i++) {
        View view = param1T.getChildAt(i);
        int m = view.getBottom() + j;
        if (view.getTop() + j <= 0 && m >= 0) {
          c = new c(parcelable);
          c.e = i;
          if (m == v.q(view) + param1T.getTopInset())
            bool = true; 
          c.g = bool;
          c.f = m / view.getHeight();
          return (Parcelable)c;
        } 
      } 
      return (Parcelable)c;
    }
    
    int c() {
      return b() + this.k;
    }
    
    int c(T param1T) {
      return param1T.getTotalScrollRange();
    }
    
    class a implements ValueAnimator.AnimatorUpdateListener {
      a(AppBarLayout.BaseBehavior this$0, CoordinatorLayout param2CoordinatorLayout, AppBarLayout param2AppBarLayout) {}
      
      public void onAnimationUpdate(ValueAnimator param2ValueAnimator) {
        this.c.c(this.a, this.b, ((Integer)param2ValueAnimator.getAnimatedValue()).intValue());
      }
    }
    
    public static abstract class b<T extends AppBarLayout> {
      public abstract boolean a(T param2T);
    }
    
    protected static class c extends b.i.a.a {
      public static final Parcelable.Creator<c> CREATOR = (Parcelable.Creator<c>)new a();
      
      int e;
      
      float f;
      
      boolean g;
      
      public c(Parcel param2Parcel, ClassLoader param2ClassLoader) {
        super(param2Parcel, param2ClassLoader);
        boolean bool;
        this.e = param2Parcel.readInt();
        this.f = param2Parcel.readFloat();
        if (param2Parcel.readByte() != 0) {
          bool = true;
        } else {
          bool = false;
        } 
        this.g = bool;
      }
      
      public c(Parcelable param2Parcelable) {
        super(param2Parcelable);
      }
      
      public void writeToParcel(Parcel param2Parcel, int param2Int) {
        super.writeToParcel(param2Parcel, param2Int);
        param2Parcel.writeInt(this.e);
        param2Parcel.writeFloat(this.f);
        param2Parcel.writeByte((byte)this.g);
      }
      
      static final class a implements Parcelable.ClassLoaderCreator<c> {
        public AppBarLayout.BaseBehavior.c createFromParcel(Parcel param3Parcel) {
          return new AppBarLayout.BaseBehavior.c(param3Parcel, null);
        }
        
        public AppBarLayout.BaseBehavior.c createFromParcel(Parcel param3Parcel, ClassLoader param3ClassLoader) {
          return new AppBarLayout.BaseBehavior.c(param3Parcel, param3ClassLoader);
        }
        
        public AppBarLayout.BaseBehavior.c[] newArray(int param3Int) {
          return new AppBarLayout.BaseBehavior.c[param3Int];
        }
      }
    }
    
    static final class a implements Parcelable.ClassLoaderCreator<c> {
      public AppBarLayout.BaseBehavior.c createFromParcel(Parcel param2Parcel) {
        return new AppBarLayout.BaseBehavior.c(param2Parcel, null);
      }
      
      public AppBarLayout.BaseBehavior.c createFromParcel(Parcel param2Parcel, ClassLoader param2ClassLoader) {
        return new AppBarLayout.BaseBehavior.c(param2Parcel, param2ClassLoader);
      }
      
      public AppBarLayout.BaseBehavior.c[] newArray(int param2Int) {
        return new AppBarLayout.BaseBehavior.c[param2Int];
      }
    }
  }
  
  class a implements ValueAnimator.AnimatorUpdateListener {
    a(AppBarLayout this$0, CoordinatorLayout param1CoordinatorLayout, AppBarLayout param1AppBarLayout) {}
    
    public void onAnimationUpdate(ValueAnimator param1ValueAnimator) {
      this.c.c(this.a, this.b, ((Integer)param1ValueAnimator.getAnimatedValue()).intValue());
    }
  }
  
  public static abstract class b<T extends AppBarLayout> {
    public abstract boolean a(T param1T);
  }
  
  protected static class c extends b.i.a.a {
    public static final Parcelable.Creator<c> CREATOR = (Parcelable.Creator<c>)new a();
    
    int e;
    
    float f;
    
    boolean g;
    
    public c(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      super(param1Parcel, param1ClassLoader);
      boolean bool;
      this.e = param1Parcel.readInt();
      this.f = param1Parcel.readFloat();
      if (param1Parcel.readByte() != 0) {
        bool = true;
      } else {
        bool = false;
      } 
      this.g = bool;
    }
    
    public c(Parcelable param1Parcelable) {
      super(param1Parcelable);
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      super.writeToParcel(param1Parcel, param1Int);
      param1Parcel.writeInt(this.e);
      param1Parcel.writeFloat(this.f);
      param1Parcel.writeByte((byte)this.g);
    }
    
    static final class a implements Parcelable.ClassLoaderCreator<c> {
      public AppBarLayout.BaseBehavior.c createFromParcel(Parcel param3Parcel) {
        return new AppBarLayout.BaseBehavior.c(param3Parcel, null);
      }
      
      public AppBarLayout.BaseBehavior.c createFromParcel(Parcel param3Parcel, ClassLoader param3ClassLoader) {
        return new AppBarLayout.BaseBehavior.c(param3Parcel, param3ClassLoader);
      }
      
      public AppBarLayout.BaseBehavior.c[] newArray(int param3Int) {
        return new AppBarLayout.BaseBehavior.c[param3Int];
      }
    }
  }
  
  static final class a implements Parcelable.ClassLoaderCreator<BaseBehavior.c> {
    public AppBarLayout.BaseBehavior.c createFromParcel(Parcel param1Parcel) {
      return new AppBarLayout.BaseBehavior.c(param1Parcel, null);
    }
    
    public AppBarLayout.BaseBehavior.c createFromParcel(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      return new AppBarLayout.BaseBehavior.c(param1Parcel, param1ClassLoader);
    }
    
    public AppBarLayout.BaseBehavior.c[] newArray(int param1Int) {
      return new AppBarLayout.BaseBehavior.c[param1Int];
    }
  }
  
  public static class Behavior extends BaseBehavior<AppBarLayout> {
    public Behavior() {}
    
    public Behavior(Context param1Context, AttributeSet param1AttributeSet) {
      super(param1Context, param1AttributeSet);
    }
  }
  
  public static class ScrollingViewBehavior extends b {
    public ScrollingViewBehavior() {}
    
    public ScrollingViewBehavior(Context param1Context, AttributeSet param1AttributeSet) {
      super(param1Context, param1AttributeSet);
      TypedArray typedArray = param1Context.obtainStyledAttributes(param1AttributeSet, k.ScrollingViewBehavior_Layout);
      b(typedArray.getDimensionPixelSize(k.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
      typedArray.recycle();
    }
    
    private static int a(AppBarLayout param1AppBarLayout) {
      CoordinatorLayout.c c = ((CoordinatorLayout.f)param1AppBarLayout.getLayoutParams()).d();
      return (c instanceof AppBarLayout.BaseBehavior) ? ((AppBarLayout.BaseBehavior)c).c() : 0;
    }
    
    private void a(View param1View1, View param1View2) {
      CoordinatorLayout.c c = ((CoordinatorLayout.f)param1View2.getLayoutParams()).d();
      if (c instanceof AppBarLayout.BaseBehavior) {
        c = c;
        v.e(param1View1, param1View2.getBottom() - param1View1.getTop() + AppBarLayout.BaseBehavior.a((AppBarLayout.BaseBehavior)c) + d() - a(param1View2));
      } 
    }
    
    private void b(View param1View1, View param1View2) {
      if (param1View2 instanceof AppBarLayout) {
        AppBarLayout appBarLayout = (AppBarLayout)param1View2;
        if (appBarLayout.c())
          appBarLayout.a(appBarLayout.a(param1View1)); 
      } 
    }
    
    AppBarLayout a(List<View> param1List) {
      int j = param1List.size();
      for (int i = 0; i < j; i++) {
        View view = param1List.get(i);
        if (view instanceof AppBarLayout)
          return (AppBarLayout)view; 
      } 
      return null;
    }
    
    public boolean a(CoordinatorLayout param1CoordinatorLayout, View param1View, Rect param1Rect, boolean param1Boolean) {
      AppBarLayout appBarLayout = a(param1CoordinatorLayout.b(param1View));
      if (appBarLayout != null) {
        param1Rect.offset(param1View.getLeft(), param1View.getTop());
        Rect rect = this.d;
        rect.set(0, 0, param1CoordinatorLayout.getWidth(), param1CoordinatorLayout.getHeight());
        if (!rect.contains(param1Rect)) {
          appBarLayout.a(false, param1Boolean ^ true);
          return true;
        } 
      } 
      return false;
    }
    
    public boolean a(CoordinatorLayout param1CoordinatorLayout, View param1View1, View param1View2) {
      return param1View2 instanceof AppBarLayout;
    }
    
    float b(View param1View) {
      if (param1View instanceof AppBarLayout) {
        AppBarLayout appBarLayout = (AppBarLayout)param1View;
        int j = appBarLayout.getTotalScrollRange();
        int k = appBarLayout.getDownNestedPreScrollRange();
        int i = a(appBarLayout);
        if (k != 0 && j + i <= k)
          return 0.0F; 
        j -= k;
        if (j != 0)
          return i / j + 1.0F; 
      } 
      return 0.0F;
    }
    
    public boolean b(CoordinatorLayout param1CoordinatorLayout, View param1View1, View param1View2) {
      a(param1View1, param1View2);
      b(param1View1, param1View2);
      return false;
    }
    
    int c(View param1View) {
      return (param1View instanceof AppBarLayout) ? ((AppBarLayout)param1View).getTotalScrollRange() : super.c(param1View);
    }
  }
  
  class a implements r {
    a(AppBarLayout this$0) {}
    
    public d0 a(View param1View, d0 param1d0) {
      return this.a.a(param1d0);
    }
  }
  
  class b implements ValueAnimator.AnimatorUpdateListener {
    b(AppBarLayout this$0, g param1g) {}
    
    public void onAnimationUpdate(ValueAnimator param1ValueAnimator) {
      this.a.a(((Float)param1ValueAnimator.getAnimatedValue()).floatValue());
    }
  }
  
  public static interface c<T extends AppBarLayout> {
    void a(T param1T, int param1Int);
  }
  
  public static class d extends LinearLayout.LayoutParams {
    int a = 1;
    
    Interpolator b;
    
    public d(int param1Int1, int param1Int2) {
      super(param1Int1, param1Int2);
    }
    
    public d(Context param1Context, AttributeSet param1AttributeSet) {
      super(param1Context, param1AttributeSet);
      TypedArray typedArray = param1Context.obtainStyledAttributes(param1AttributeSet, k.AppBarLayout_Layout);
      this.a = typedArray.getInt(k.AppBarLayout_Layout_layout_scrollFlags, 0);
      if (typedArray.hasValue(k.AppBarLayout_Layout_layout_scrollInterpolator))
        this.b = AnimationUtils.loadInterpolator(param1Context, typedArray.getResourceId(k.AppBarLayout_Layout_layout_scrollInterpolator, 0)); 
      typedArray.recycle();
    }
    
    public d(ViewGroup.LayoutParams param1LayoutParams) {
      super(param1LayoutParams);
    }
    
    public d(ViewGroup.MarginLayoutParams param1MarginLayoutParams) {
      super(param1MarginLayoutParams);
    }
    
    public d(LinearLayout.LayoutParams param1LayoutParams) {
      super(param1LayoutParams);
    }
    
    public int a() {
      return this.a;
    }
    
    public void a(int param1Int) {
      this.a = param1Int;
    }
    
    public Interpolator b() {
      return this.b;
    }
    
    boolean c() {
      int i = this.a;
      return ((i & 0x1) == 1 && (i & 0xA) != 0);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/appbar/AppBarLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */