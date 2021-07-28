package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.s;
import b.a.j;
import b.g.m.v;
import java.util.ArrayList;
import java.util.List;

public class Toolbar extends ViewGroup {
  private CharSequence A;
  
  private ColorStateList B;
  
  private ColorStateList C;
  
  private boolean D;
  
  private boolean E;
  
  private final ArrayList<View> F = new ArrayList<View>();
  
  private final ArrayList<View> G = new ArrayList<View>();
  
  private final int[] H = new int[2];
  
  f I;
  
  private final ActionMenuView.e J = new a(this);
  
  private y0 K;
  
  private c L;
  
  private d M;
  
  private n.a N;
  
  private androidx.appcompat.view.menu.g.a O;
  
  private boolean P;
  
  private final Runnable Q = new b(this);
  
  private ActionMenuView c;
  
  private TextView d;
  
  private TextView e;
  
  private ImageButton f;
  
  private ImageView g;
  
  private Drawable h;
  
  private CharSequence i;
  
  ImageButton j;
  
  View k;
  
  private Context l;
  
  private int m;
  
  private int n;
  
  private int o;
  
  int p;
  
  private int q;
  
  private int r;
  
  private int s;
  
  private int t;
  
  private int u;
  
  private o0 v;
  
  private int w;
  
  private int x;
  
  private int y = 8388627;
  
  private CharSequence z;
  
  public Toolbar(Context paramContext) {
    this(paramContext, null);
  }
  
  public Toolbar(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, b.a.a.toolbarStyle);
  }
  
  public Toolbar(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    x0 x0 = x0.a(getContext(), paramAttributeSet, j.Toolbar, paramInt, 0);
    v.a((View)this, paramContext, j.Toolbar, paramAttributeSet, x0.a(), paramInt, 0);
    this.n = x0.g(j.Toolbar_titleTextAppearance, 0);
    this.o = x0.g(j.Toolbar_subtitleTextAppearance, 0);
    this.y = x0.e(j.Toolbar_android_gravity, this.y);
    this.p = x0.e(j.Toolbar_buttonGravity, 48);
    int i = x0.b(j.Toolbar_titleMargin, 0);
    paramInt = i;
    if (x0.g(j.Toolbar_titleMargins))
      paramInt = x0.b(j.Toolbar_titleMargins, i); 
    this.u = paramInt;
    this.t = paramInt;
    this.s = paramInt;
    this.r = paramInt;
    paramInt = x0.b(j.Toolbar_titleMarginStart, -1);
    if (paramInt >= 0)
      this.r = paramInt; 
    paramInt = x0.b(j.Toolbar_titleMarginEnd, -1);
    if (paramInt >= 0)
      this.s = paramInt; 
    paramInt = x0.b(j.Toolbar_titleMarginTop, -1);
    if (paramInt >= 0)
      this.t = paramInt; 
    paramInt = x0.b(j.Toolbar_titleMarginBottom, -1);
    if (paramInt >= 0)
      this.u = paramInt; 
    this.q = x0.c(j.Toolbar_maxButtonHeight, -1);
    paramInt = x0.b(j.Toolbar_contentInsetStart, -2147483648);
    i = x0.b(j.Toolbar_contentInsetEnd, -2147483648);
    int j = x0.c(j.Toolbar_contentInsetLeft, 0);
    int k = x0.c(j.Toolbar_contentInsetRight, 0);
    l();
    this.v.a(j, k);
    if (paramInt != Integer.MIN_VALUE || i != Integer.MIN_VALUE)
      this.v.b(paramInt, i); 
    this.w = x0.b(j.Toolbar_contentInsetStartWithNavigation, -2147483648);
    this.x = x0.b(j.Toolbar_contentInsetEndWithActions, -2147483648);
    this.h = x0.b(j.Toolbar_collapseIcon);
    this.i = x0.e(j.Toolbar_collapseContentDescription);
    CharSequence charSequence3 = x0.e(j.Toolbar_title);
    if (!TextUtils.isEmpty(charSequence3))
      setTitle(charSequence3); 
    charSequence3 = x0.e(j.Toolbar_subtitle);
    if (!TextUtils.isEmpty(charSequence3))
      setSubtitle(charSequence3); 
    this.l = getContext();
    setPopupTheme(x0.g(j.Toolbar_popupTheme, 0));
    Drawable drawable2 = x0.b(j.Toolbar_navigationIcon);
    if (drawable2 != null)
      setNavigationIcon(drawable2); 
    CharSequence charSequence2 = x0.e(j.Toolbar_navigationContentDescription);
    if (!TextUtils.isEmpty(charSequence2))
      setNavigationContentDescription(charSequence2); 
    Drawable drawable1 = x0.b(j.Toolbar_logo);
    if (drawable1 != null)
      setLogo(drawable1); 
    CharSequence charSequence1 = x0.e(j.Toolbar_logoDescription);
    if (!TextUtils.isEmpty(charSequence1))
      setLogoDescription(charSequence1); 
    if (x0.g(j.Toolbar_titleTextColor))
      setTitleTextColor(x0.a(j.Toolbar_titleTextColor)); 
    if (x0.g(j.Toolbar_subtitleTextColor))
      setSubtitleTextColor(x0.a(j.Toolbar_subtitleTextColor)); 
    if (x0.g(j.Toolbar_menu))
      a(x0.g(j.Toolbar_menu, 0)); 
    x0.b();
  }
  
  private int a(View paramView) {
    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    return b.g.m.g.b(marginLayoutParams) + b.g.m.g.a(marginLayoutParams);
  }
  
  private int a(View paramView, int paramInt) {
    e e1 = (e)paramView.getLayoutParams();
    int j = paramView.getMeasuredHeight();
    if (paramInt > 0) {
      paramInt = (j - paramInt) / 2;
    } else {
      paramInt = 0;
    } 
    int i = c(e1.a);
    if (i != 48) {
      if (i != 80) {
        int k = getPaddingTop();
        int m = getPaddingBottom();
        int n = getHeight();
        i = (n - k - m - j) / 2;
        paramInt = ((ViewGroup.MarginLayoutParams)e1).topMargin;
        if (i >= paramInt) {
          j = n - m - j - i - k;
          m = ((ViewGroup.MarginLayoutParams)e1).bottomMargin;
          paramInt = i;
          if (j < m)
            paramInt = Math.max(0, i - m - j); 
        } 
        return k + paramInt;
      } 
      return getHeight() - getPaddingBottom() - j - ((ViewGroup.MarginLayoutParams)e1).bottomMargin - paramInt;
    } 
    return getPaddingTop() - paramInt;
  }
  
  private int a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfint) {
    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i = marginLayoutParams.leftMargin - paramArrayOfint[0];
    int j = marginLayoutParams.rightMargin - paramArrayOfint[1];
    int k = Math.max(0, i) + Math.max(0, j);
    paramArrayOfint[0] = Math.max(0, -i);
    paramArrayOfint[1] = Math.max(0, -j);
    paramView.measure(ViewGroup.getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight() + k + paramInt2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(paramInt3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + paramInt4, marginLayoutParams.height));
    return paramView.getMeasuredWidth() + k;
  }
  
  private int a(View paramView, int paramInt1, int[] paramArrayOfint, int paramInt2) {
    e e1 = (e)paramView.getLayoutParams();
    int i = ((ViewGroup.MarginLayoutParams)e1).leftMargin - paramArrayOfint[0];
    paramInt1 += Math.max(0, i);
    paramArrayOfint[0] = Math.max(0, -i);
    paramInt2 = a(paramView, paramInt2);
    i = paramView.getMeasuredWidth();
    paramView.layout(paramInt1, paramInt2, paramInt1 + i, paramView.getMeasuredHeight() + paramInt2);
    return paramInt1 + i + ((ViewGroup.MarginLayoutParams)e1).rightMargin;
  }
  
  private int a(List<View> paramList, int[] paramArrayOfint) {
    int m = paramArrayOfint[0];
    int k = paramArrayOfint[1];
    int n = paramList.size();
    int i = 0;
    int j = 0;
    while (i < n) {
      View view = paramList.get(i);
      e e1 = (e)view.getLayoutParams();
      m = ((ViewGroup.MarginLayoutParams)e1).leftMargin - m;
      k = ((ViewGroup.MarginLayoutParams)e1).rightMargin - k;
      int i1 = Math.max(0, m);
      int i2 = Math.max(0, k);
      m = Math.max(0, -m);
      k = Math.max(0, -k);
      j += i1 + view.getMeasuredWidth() + i2;
      i++;
    } 
    return j;
  }
  
  private void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i = ViewGroup.getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + paramInt2, marginLayoutParams.width);
    paramInt2 = ViewGroup.getChildMeasureSpec(paramInt3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + paramInt4, marginLayoutParams.height);
    paramInt3 = View.MeasureSpec.getMode(paramInt2);
    paramInt1 = paramInt2;
    if (paramInt3 != 1073741824) {
      paramInt1 = paramInt2;
      if (paramInt5 >= 0) {
        paramInt1 = paramInt5;
        if (paramInt3 != 0)
          paramInt1 = Math.min(View.MeasureSpec.getSize(paramInt2), paramInt5); 
        paramInt1 = View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824);
      } 
    } 
    paramView.measure(i, paramInt1);
  }
  
  private void a(View paramView, boolean paramBoolean) {
    e e1;
    ViewGroup.LayoutParams layoutParams = paramView.getLayoutParams();
    if (layoutParams == null) {
      e1 = generateDefaultLayoutParams();
    } else if (!checkLayoutParams((ViewGroup.LayoutParams)e1)) {
      e1 = generateLayoutParams((ViewGroup.LayoutParams)e1);
    } else {
      e1 = e1;
    } 
    e1.b = 1;
    if (paramBoolean && this.k != null) {
      paramView.setLayoutParams((ViewGroup.LayoutParams)e1);
      this.G.add(paramView);
      return;
    } 
    addView(paramView, (ViewGroup.LayoutParams)e1);
  }
  
  private void a(List<View> paramList, int paramInt) {
    int i = v.p((View)this);
    boolean bool = false;
    if (i == 1) {
      i = 1;
    } else {
      i = 0;
    } 
    int k = getChildCount();
    int j = b.g.m.d.a(paramInt, v.p((View)this));
    paramList.clear();
    paramInt = bool;
    if (i != 0) {
      for (paramInt = k - 1; paramInt >= 0; paramInt--) {
        View view = getChildAt(paramInt);
        e e1 = (e)view.getLayoutParams();
        if (e1.b == 0 && d(view) && b(e1.a) == j)
          paramList.add(view); 
      } 
    } else {
      while (paramInt < k) {
        View view = getChildAt(paramInt);
        e e1 = (e)view.getLayoutParams();
        if (e1.b == 0 && d(view) && b(e1.a) == j)
          paramList.add(view); 
        paramInt++;
      } 
    } 
  }
  
  private int b(int paramInt) {
    int i = v.p((View)this);
    int j = b.g.m.d.a(paramInt, i) & 0x7;
    if (j != 1) {
      paramInt = 3;
      if (j != 3 && j != 5) {
        if (i == 1)
          paramInt = 5; 
        return paramInt;
      } 
    } 
    return j;
  }
  
  private int b(View paramView) {
    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
  }
  
  private int b(View paramView, int paramInt1, int[] paramArrayOfint, int paramInt2) {
    e e1 = (e)paramView.getLayoutParams();
    int i = ((ViewGroup.MarginLayoutParams)e1).rightMargin - paramArrayOfint[1];
    paramInt1 -= Math.max(0, i);
    paramArrayOfint[1] = Math.max(0, -i);
    paramInt2 = a(paramView, paramInt2);
    i = paramView.getMeasuredWidth();
    paramView.layout(paramInt1 - i, paramInt2, paramInt1, paramView.getMeasuredHeight() + paramInt2);
    return paramInt1 - i + ((ViewGroup.MarginLayoutParams)e1).leftMargin;
  }
  
  private int c(int paramInt) {
    int i = paramInt & 0x70;
    paramInt = i;
    if (i != 16) {
      paramInt = i;
      if (i != 48) {
        paramInt = i;
        if (i != 80)
          paramInt = this.y & 0x70; 
      } 
    } 
    return paramInt;
  }
  
  private boolean c(View paramView) {
    return (paramView.getParent() == this || this.G.contains(paramView));
  }
  
  private boolean d(View paramView) {
    return (paramView != null && paramView.getParent() == this && paramView.getVisibility() != 8);
  }
  
  private MenuInflater getMenuInflater() {
    return (MenuInflater)new b.a.o.g(getContext());
  }
  
  private void l() {
    if (this.v == null)
      this.v = new o0(); 
  }
  
  private void m() {
    if (this.g == null)
      this.g = new o(getContext()); 
  }
  
  private void n() {
    o();
    if (this.c.j() == null) {
      androidx.appcompat.view.menu.g g = (androidx.appcompat.view.menu.g)this.c.getMenu();
      if (this.M == null)
        this.M = new d(this); 
      this.c.setExpandedActionViewsExclusive(true);
      g.a(this.M, this.l);
    } 
  }
  
  private void o() {
    if (this.c == null) {
      this.c = new ActionMenuView(getContext());
      this.c.setPopupTheme(this.m);
      this.c.setOnMenuItemClickListener(this.J);
      this.c.a(this.N, this.O);
      e e1 = generateDefaultLayoutParams();
      e1.a = 0x800005 | this.p & 0x70;
      this.c.setLayoutParams((ViewGroup.LayoutParams)e1);
      a((View)this.c, false);
    } 
  }
  
  private void p() {
    if (this.f == null) {
      this.f = new m(getContext(), null, b.a.a.toolbarNavigationButtonStyle);
      e e1 = generateDefaultLayoutParams();
      e1.a = 0x800003 | this.p & 0x70;
      this.f.setLayoutParams((ViewGroup.LayoutParams)e1);
    } 
  }
  
  private void q() {
    removeCallbacks(this.Q);
    post(this.Q);
  }
  
  private boolean r() {
    if (!this.P)
      return false; 
    int j = getChildCount();
    for (int i = 0; i < j; i++) {
      View view = getChildAt(i);
      if (d(view) && view.getMeasuredWidth() > 0 && view.getMeasuredHeight() > 0)
        return false; 
    } 
    return true;
  }
  
  void a() {
    for (int i = this.G.size() - 1; i >= 0; i--)
      addView(this.G.get(i)); 
    this.G.clear();
  }
  
  public void a(int paramInt) {
    getMenuInflater().inflate(paramInt, getMenu());
  }
  
  public void a(int paramInt1, int paramInt2) {
    l();
    this.v.b(paramInt1, paramInt2);
  }
  
  public void a(Context paramContext, int paramInt) {
    this.o = paramInt;
    TextView textView = this.e;
    if (textView != null)
      textView.setTextAppearance(paramContext, paramInt); 
  }
  
  public void a(androidx.appcompat.view.menu.g paramg, c paramc) {
    if (paramg == null && this.c == null)
      return; 
    o();
    androidx.appcompat.view.menu.g g1 = this.c.j();
    if (g1 == paramg)
      return; 
    if (g1 != null) {
      g1.b((n)this.L);
      g1.b(this.M);
    } 
    if (this.M == null)
      this.M = new d(this); 
    paramc.b(true);
    if (paramg != null) {
      paramg.a((n)paramc, this.l);
      paramg.a(this.M, this.l);
    } else {
      paramc.a(this.l, (androidx.appcompat.view.menu.g)null);
      this.M.a(this.l, (androidx.appcompat.view.menu.g)null);
      paramc.a(true);
      this.M.a(true);
    } 
    this.c.setPopupTheme(this.m);
    this.c.setPresenter(paramc);
    this.L = paramc;
  }
  
  public void a(n.a parama, androidx.appcompat.view.menu.g.a parama1) {
    this.N = parama;
    this.O = parama1;
    ActionMenuView actionMenuView = this.c;
    if (actionMenuView != null)
      actionMenuView.a(parama, parama1); 
  }
  
  public void b(Context paramContext, int paramInt) {
    this.n = paramInt;
    TextView textView = this.d;
    if (textView != null)
      textView.setTextAppearance(paramContext, paramInt); 
  }
  
  public boolean b() {
    if (getVisibility() == 0) {
      ActionMenuView actionMenuView = this.c;
      if (actionMenuView != null && actionMenuView.i())
        return true; 
    } 
    return false;
  }
  
  public void c() {
    j j;
    d d1 = this.M;
    if (d1 == null) {
      d1 = null;
    } else {
      j = d1.d;
    } 
    if (j != null)
      j.collapseActionView(); 
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    return (super.checkLayoutParams(paramLayoutParams) && paramLayoutParams instanceof e);
  }
  
  public void d() {
    ActionMenuView actionMenuView = this.c;
    if (actionMenuView != null)
      actionMenuView.d(); 
  }
  
  void e() {
    if (this.j == null) {
      this.j = new m(getContext(), null, b.a.a.toolbarNavigationButtonStyle);
      this.j.setImageDrawable(this.h);
      this.j.setContentDescription(this.i);
      e e1 = generateDefaultLayoutParams();
      e1.a = 0x800003 | this.p & 0x70;
      e1.b = 2;
      this.j.setLayoutParams((ViewGroup.LayoutParams)e1);
      this.j.setOnClickListener(new c(this));
    } 
  }
  
  public boolean f() {
    d d1 = this.M;
    return (d1 != null && d1.d != null);
  }
  
  public boolean g() {
    ActionMenuView actionMenuView = this.c;
    return (actionMenuView != null && actionMenuView.f());
  }
  
  protected e generateDefaultLayoutParams() {
    return new e(-2, -2);
  }
  
  public e generateLayoutParams(AttributeSet paramAttributeSet) {
    return new e(getContext(), paramAttributeSet);
  }
  
  protected e generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    return (paramLayoutParams instanceof e) ? new e((e)paramLayoutParams) : ((paramLayoutParams instanceof androidx.appcompat.app.a.a) ? new e((androidx.appcompat.app.a.a)paramLayoutParams) : ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams) ? new e((ViewGroup.MarginLayoutParams)paramLayoutParams) : new e(paramLayoutParams)));
  }
  
  public CharSequence getCollapseContentDescription() {
    ImageButton imageButton = this.j;
    return (imageButton != null) ? imageButton.getContentDescription() : null;
  }
  
  public Drawable getCollapseIcon() {
    ImageButton imageButton = this.j;
    return (imageButton != null) ? imageButton.getDrawable() : null;
  }
  
  public int getContentInsetEnd() {
    o0 o01 = this.v;
    return (o01 != null) ? o01.a() : 0;
  }
  
  public int getContentInsetEndWithActions() {
    int i = this.x;
    return (i != Integer.MIN_VALUE) ? i : getContentInsetEnd();
  }
  
  public int getContentInsetLeft() {
    o0 o01 = this.v;
    return (o01 != null) ? o01.b() : 0;
  }
  
  public int getContentInsetRight() {
    o0 o01 = this.v;
    return (o01 != null) ? o01.c() : 0;
  }
  
  public int getContentInsetStart() {
    o0 o01 = this.v;
    return (o01 != null) ? o01.d() : 0;
  }
  
  public int getContentInsetStartWithNavigation() {
    int i = this.w;
    return (i != Integer.MIN_VALUE) ? i : getContentInsetStart();
  }
  
  public int getCurrentContentInsetEnd() {
    // Byte code:
    //   0: aload_0
    //   1: getfield c : Landroidx/appcompat/widget/ActionMenuView;
    //   4: astore_2
    //   5: aload_2
    //   6: ifnull -> 30
    //   9: aload_2
    //   10: invokevirtual j : ()Landroidx/appcompat/view/menu/g;
    //   13: astore_2
    //   14: aload_2
    //   15: ifnull -> 30
    //   18: aload_2
    //   19: invokevirtual hasVisibleItems : ()Z
    //   22: ifeq -> 30
    //   25: iconst_1
    //   26: istore_1
    //   27: goto -> 32
    //   30: iconst_0
    //   31: istore_1
    //   32: iload_1
    //   33: ifeq -> 52
    //   36: aload_0
    //   37: invokevirtual getContentInsetEnd : ()I
    //   40: aload_0
    //   41: getfield x : I
    //   44: iconst_0
    //   45: invokestatic max : (II)I
    //   48: invokestatic max : (II)I
    //   51: ireturn
    //   52: aload_0
    //   53: invokevirtual getContentInsetEnd : ()I
    //   56: ireturn
  }
  
  public int getCurrentContentInsetLeft() {
    return (v.p((View)this) == 1) ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
  }
  
  public int getCurrentContentInsetRight() {
    return (v.p((View)this) == 1) ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
  }
  
  public int getCurrentContentInsetStart() {
    return (getNavigationIcon() != null) ? Math.max(getContentInsetStart(), Math.max(this.w, 0)) : getContentInsetStart();
  }
  
  public Drawable getLogo() {
    ImageView imageView = this.g;
    return (imageView != null) ? imageView.getDrawable() : null;
  }
  
  public CharSequence getLogoDescription() {
    ImageView imageView = this.g;
    return (imageView != null) ? imageView.getContentDescription() : null;
  }
  
  public Menu getMenu() {
    n();
    return this.c.getMenu();
  }
  
  public CharSequence getNavigationContentDescription() {
    ImageButton imageButton = this.f;
    return (imageButton != null) ? imageButton.getContentDescription() : null;
  }
  
  public Drawable getNavigationIcon() {
    ImageButton imageButton = this.f;
    return (imageButton != null) ? imageButton.getDrawable() : null;
  }
  
  c getOuterActionMenuPresenter() {
    return this.L;
  }
  
  public Drawable getOverflowIcon() {
    n();
    return this.c.getOverflowIcon();
  }
  
  Context getPopupContext() {
    return this.l;
  }
  
  public int getPopupTheme() {
    return this.m;
  }
  
  public CharSequence getSubtitle() {
    return this.A;
  }
  
  final TextView getSubtitleTextView() {
    return this.e;
  }
  
  public CharSequence getTitle() {
    return this.z;
  }
  
  public int getTitleMarginBottom() {
    return this.u;
  }
  
  public int getTitleMarginEnd() {
    return this.s;
  }
  
  public int getTitleMarginStart() {
    return this.r;
  }
  
  public int getTitleMarginTop() {
    return this.t;
  }
  
  final TextView getTitleTextView() {
    return this.d;
  }
  
  public d0 getWrapper() {
    if (this.K == null)
      this.K = new y0(this, true); 
    return this.K;
  }
  
  public boolean h() {
    ActionMenuView actionMenuView = this.c;
    return (actionMenuView != null && actionMenuView.g());
  }
  
  public boolean i() {
    ActionMenuView actionMenuView = this.c;
    return (actionMenuView != null && actionMenuView.h());
  }
  
  void j() {
    for (int i = getChildCount() - 1; i >= 0; i--) {
      View view = getChildAt(i);
      if (((e)view.getLayoutParams()).b != 2 && view != this.c) {
        removeViewAt(i);
        this.G.add(view);
      } 
    } 
  }
  
  public boolean k() {
    ActionMenuView actionMenuView = this.c;
    return (actionMenuView != null && actionMenuView.k());
  }
  
  protected void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    removeCallbacks(this.Q);
  }
  
  public boolean onHoverEvent(MotionEvent paramMotionEvent) {
    int i = paramMotionEvent.getActionMasked();
    if (i == 9)
      this.E = false; 
    if (!this.E) {
      boolean bool = super.onHoverEvent(paramMotionEvent);
      if (i == 9 && !bool)
        this.E = true; 
    } 
    if (i == 10 || i == 3)
      this.E = false; 
    return true;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (v.p((View)this) == 1) {
      k = 1;
    } else {
      k = 0;
    } 
    int n = getWidth();
    int i3 = getHeight();
    int i = getPaddingLeft();
    int i1 = getPaddingRight();
    int i2 = getPaddingTop();
    int i4 = getPaddingBottom();
    int m = n - i1;
    int[] arrayOfInt = this.H;
    arrayOfInt[1] = 0;
    arrayOfInt[0] = 0;
    paramInt1 = v.q((View)this);
    if (paramInt1 >= 0) {
      paramInt4 = Math.min(paramInt1, paramInt4 - paramInt2);
    } else {
      paramInt4 = 0;
    } 
    if (d((View)this.f)) {
      ImageButton imageButton = this.f;
      if (k) {
        j = b((View)imageButton, m, arrayOfInt, paramInt4);
        paramInt3 = i;
      } else {
        paramInt3 = a((View)imageButton, i, arrayOfInt, paramInt4);
        j = m;
      } 
    } else {
      paramInt3 = i;
      j = m;
    } 
    paramInt1 = paramInt3;
    paramInt2 = j;
    if (d((View)this.j)) {
      ImageButton imageButton = this.j;
      if (k) {
        paramInt2 = b((View)imageButton, j, arrayOfInt, paramInt4);
        paramInt1 = paramInt3;
      } else {
        paramInt1 = a((View)imageButton, paramInt3, arrayOfInt, paramInt4);
        paramInt2 = j;
      } 
    } 
    int j = paramInt1;
    paramInt3 = paramInt2;
    if (d((View)this.c)) {
      ActionMenuView actionMenuView = this.c;
      if (k) {
        j = a((View)actionMenuView, paramInt1, arrayOfInt, paramInt4);
        paramInt3 = paramInt2;
      } else {
        paramInt3 = b((View)actionMenuView, paramInt2, arrayOfInt, paramInt4);
        j = paramInt1;
      } 
    } 
    paramInt2 = getCurrentContentInsetLeft();
    paramInt1 = getCurrentContentInsetRight();
    arrayOfInt[0] = Math.max(0, paramInt2 - j);
    arrayOfInt[1] = Math.max(0, paramInt1 - m - paramInt3);
    paramInt2 = Math.max(j, paramInt2);
    paramInt3 = Math.min(paramInt3, m - paramInt1);
    paramInt1 = paramInt2;
    j = paramInt3;
    if (d(this.k)) {
      View view = this.k;
      if (k) {
        j = b(view, paramInt3, arrayOfInt, paramInt4);
        paramInt1 = paramInt2;
      } else {
        paramInt1 = a(view, paramInt2, arrayOfInt, paramInt4);
        j = paramInt3;
      } 
    } 
    paramInt3 = paramInt1;
    paramInt2 = j;
    if (d((View)this.g)) {
      ImageView imageView = this.g;
      if (k) {
        paramInt2 = b((View)imageView, j, arrayOfInt, paramInt4);
        paramInt3 = paramInt1;
      } else {
        paramInt3 = a((View)imageView, paramInt1, arrayOfInt, paramInt4);
        paramInt2 = j;
      } 
    } 
    boolean bool = d((View)this.d);
    paramBoolean = d((View)this.e);
    if (bool) {
      e e1 = (e)this.d.getLayoutParams();
      paramInt1 = ((ViewGroup.MarginLayoutParams)e1).topMargin + this.d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams)e1).bottomMargin + 0;
    } else {
      paramInt1 = 0;
    } 
    if (paramBoolean) {
      e e1 = (e)this.e.getLayoutParams();
      paramInt1 += ((ViewGroup.MarginLayoutParams)e1).topMargin + this.e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams)e1).bottomMargin;
    } 
    if (bool || paramBoolean) {
      TextView textView1;
      TextView textView2;
      if (bool) {
        textView1 = this.d;
      } else {
        textView1 = this.e;
      } 
      if (paramBoolean) {
        textView2 = this.e;
      } else {
        textView2 = this.d;
      } 
      e e1 = (e)textView1.getLayoutParams();
      e e2 = (e)textView2.getLayoutParams();
      if ((bool && this.d.getMeasuredWidth() > 0) || (paramBoolean && this.e.getMeasuredWidth() > 0)) {
        j = 1;
      } else {
        j = 0;
      } 
      m = this.y & 0x70;
      if (m != 48) {
        if (m != 80) {
          m = (i3 - i2 - i4 - paramInt1) / 2;
          int i5 = ((ViewGroup.MarginLayoutParams)e1).topMargin;
          int i6 = this.t;
          if (m < i5 + i6) {
            paramInt1 = i5 + i6;
          } else {
            i3 = i3 - i4 - paramInt1 - m - i2;
            i4 = ((ViewGroup.MarginLayoutParams)e1).bottomMargin;
            i5 = this.u;
            paramInt1 = m;
            if (i3 < i4 + i5)
              paramInt1 = Math.max(0, m - ((ViewGroup.MarginLayoutParams)e2).bottomMargin + i5 - i3); 
          } 
          paramInt1 = i2 + paramInt1;
        } else {
          paramInt1 = i3 - i4 - ((ViewGroup.MarginLayoutParams)e2).bottomMargin - this.u - paramInt1;
        } 
      } else {
        paramInt1 = getPaddingTop() + ((ViewGroup.MarginLayoutParams)e1).topMargin + this.t;
      } 
      if (k) {
        if (j != 0) {
          k = this.r;
        } else {
          k = 0;
        } 
        k -= arrayOfInt[1];
        paramInt2 -= Math.max(0, k);
        arrayOfInt[1] = Math.max(0, -k);
        if (bool) {
          e1 = (e)this.d.getLayoutParams();
          m = paramInt2 - this.d.getMeasuredWidth();
          k = this.d.getMeasuredHeight() + paramInt1;
          this.d.layout(m, paramInt1, paramInt2, k);
          paramInt1 = m - this.s;
          m = k + ((ViewGroup.MarginLayoutParams)e1).bottomMargin;
        } else {
          k = paramInt2;
          m = paramInt1;
          paramInt1 = k;
        } 
        if (paramBoolean) {
          e1 = (e)this.e.getLayoutParams();
          k = m + ((ViewGroup.MarginLayoutParams)e1).topMargin;
          m = this.e.getMeasuredWidth();
          i2 = this.e.getMeasuredHeight();
          this.e.layout(paramInt2 - m, k, paramInt2, i2 + k);
          k = paramInt2 - this.s;
          m = ((ViewGroup.MarginLayoutParams)e1).bottomMargin;
        } else {
          k = paramInt2;
        } 
        if (j != 0)
          paramInt2 = Math.min(paramInt1, k); 
        paramInt1 = paramInt3;
      } else {
        if (j != 0) {
          k = this.r;
        } else {
          k = 0;
        } 
        k -= arrayOfInt[0];
        paramInt3 += Math.max(0, k);
        arrayOfInt[0] = Math.max(0, -k);
        if (bool) {
          e1 = (e)this.d.getLayoutParams();
          k = this.d.getMeasuredWidth() + paramInt3;
          m = this.d.getMeasuredHeight() + paramInt1;
          this.d.layout(paramInt3, paramInt1, k, m);
          k += this.s;
          paramInt1 = m + ((ViewGroup.MarginLayoutParams)e1).bottomMargin;
        } else {
          k = paramInt3;
        } 
        if (paramBoolean) {
          e1 = (e)this.e.getLayoutParams();
          paramInt1 += ((ViewGroup.MarginLayoutParams)e1).topMargin;
          m = this.e.getMeasuredWidth() + paramInt3;
          i2 = this.e.getMeasuredHeight();
          this.e.layout(paramInt3, paramInt1, m, i2 + paramInt1);
          m += this.s;
          paramInt1 = ((ViewGroup.MarginLayoutParams)e1).bottomMargin;
        } else {
          m = paramInt3;
        } 
        paramInt1 = paramInt3;
        paramInt3 = paramInt2;
        if (j != 0) {
          paramInt1 = Math.max(k, m);
          paramInt3 = paramInt2;
        } 
        j = i;
        i = 0;
        a(this.F, 3);
        k = this.F.size();
        paramInt2 = 0;
      } 
    } else {
      paramInt1 = paramInt3;
    } 
    paramInt3 = paramInt2;
    j = i;
    i = 0;
    a(this.F, 3);
    int k = this.F.size();
    paramInt2 = 0;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    int[] arrayOfInt = this.H;
    if (d1.a((View)this)) {
      i1 = 1;
      n = 0;
    } else {
      i1 = 0;
      n = 1;
    } 
    if (d((View)this.f)) {
      a((View)this.f, paramInt1, 0, paramInt2, 0, this.q);
      i = this.f.getMeasuredWidth() + a((View)this.f);
      m = Math.max(0, this.f.getMeasuredHeight() + b((View)this.f));
      k = View.combineMeasuredStates(0, this.f.getMeasuredState());
    } else {
      i = 0;
      m = 0;
      k = 0;
    } 
    int i2 = i;
    int j = m;
    int i = k;
    if (d((View)this.j)) {
      a((View)this.j, paramInt1, 0, paramInt2, 0, this.q);
      i2 = this.j.getMeasuredWidth() + a((View)this.j);
      j = Math.max(m, this.j.getMeasuredHeight() + b((View)this.j));
      i = View.combineMeasuredStates(k, this.j.getMeasuredState());
    } 
    int k = getCurrentContentInsetStart();
    int m = 0 + Math.max(k, i2);
    arrayOfInt[i1] = Math.max(0, k - i2);
    if (d((View)this.c)) {
      a((View)this.c, paramInt1, m, paramInt2, 0, this.q);
      k = this.c.getMeasuredWidth() + a((View)this.c);
      j = Math.max(j, this.c.getMeasuredHeight() + b((View)this.c));
      i = View.combineMeasuredStates(i, this.c.getMeasuredState());
    } else {
      k = 0;
    } 
    i2 = getCurrentContentInsetEnd();
    int i1 = m + Math.max(i2, k);
    arrayOfInt[n] = Math.max(0, i2 - k);
    int n = i1;
    m = j;
    k = i;
    if (d(this.k)) {
      n = i1 + a(this.k, paramInt1, i1, paramInt2, 0, arrayOfInt);
      m = Math.max(j, this.k.getMeasuredHeight() + b(this.k));
      k = View.combineMeasuredStates(i, this.k.getMeasuredState());
    } 
    j = n;
    i1 = m;
    i = k;
    if (d((View)this.g)) {
      j = n + a((View)this.g, paramInt1, n, paramInt2, 0, arrayOfInt);
      i1 = Math.max(m, this.g.getMeasuredHeight() + b((View)this.g));
      i = View.combineMeasuredStates(k, this.g.getMeasuredState());
    } 
    int i3 = getChildCount();
    n = i1;
    k = 0;
    m = j;
    j = k;
    while (j < i3) {
      View view = getChildAt(j);
      i2 = m;
      i1 = i;
      k = n;
      if (((e)view.getLayoutParams()).b == 0)
        if (!d(view)) {
          i2 = m;
          i1 = i;
          k = n;
        } else {
          i2 = m + a(view, paramInt1, m, paramInt2, 0, arrayOfInt);
          k = Math.max(n, view.getMeasuredHeight() + b(view));
          i1 = View.combineMeasuredStates(i, view.getMeasuredState());
        }  
      j++;
      m = i2;
      i = i1;
      n = k;
    } 
    i1 = this.t + this.u;
    i2 = this.r + this.s;
    if (d((View)this.d)) {
      a((View)this.d, paramInt1, m + i2, paramInt2, i1, arrayOfInt);
      j = this.d.getMeasuredWidth();
      i3 = a((View)this.d);
      k = this.d.getMeasuredHeight();
      int i4 = b((View)this.d);
      i = View.combineMeasuredStates(i, this.d.getMeasuredState());
      k += i4;
      j += i3;
    } else {
      j = 0;
      k = 0;
    } 
    if (d((View)this.e)) {
      j = Math.max(j, a((View)this.e, paramInt1, m + i2, paramInt2, k + i1, arrayOfInt));
      k += this.e.getMeasuredHeight() + b((View)this.e);
      i = View.combineMeasuredStates(i, this.e.getMeasuredState());
    } 
    k = Math.max(n, k);
    i2 = getPaddingLeft();
    i3 = getPaddingRight();
    n = getPaddingTop();
    i1 = getPaddingBottom();
    j = View.resolveSizeAndState(Math.max(m + j + i2 + i3, getSuggestedMinimumWidth()), paramInt1, 0xFF000000 & i);
    paramInt1 = View.resolveSizeAndState(Math.max(k + n + i1, getSuggestedMinimumHeight()), paramInt2, i << 16);
    if (r())
      paramInt1 = 0; 
    setMeasuredDimension(j, paramInt1);
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable) {
    if (!(paramParcelable instanceof g)) {
      super.onRestoreInstanceState(paramParcelable);
      return;
    } 
    g g = (g)paramParcelable;
    super.onRestoreInstanceState(g.e());
    ActionMenuView actionMenuView = this.c;
    if (actionMenuView != null) {
      androidx.appcompat.view.menu.g g1 = actionMenuView.j();
    } else {
      actionMenuView = null;
    } 
    int i = g.e;
    if (i != 0 && this.M != null && actionMenuView != null) {
      MenuItem menuItem = actionMenuView.findItem(i);
      if (menuItem != null)
        menuItem.expandActionView(); 
    } 
    if (g.f)
      q(); 
  }
  
  public void onRtlPropertiesChanged(int paramInt) {
    if (Build.VERSION.SDK_INT >= 17)
      super.onRtlPropertiesChanged(paramInt); 
    l();
    o0 o01 = this.v;
    boolean bool = true;
    if (paramInt != 1)
      bool = false; 
    o01.a(bool);
  }
  
  protected Parcelable onSaveInstanceState() {
    g g = new g(super.onSaveInstanceState());
    d d1 = this.M;
    if (d1 != null) {
      j j = d1.d;
      if (j != null)
        g.e = j.getItemId(); 
    } 
    g.f = i();
    return (Parcelable)g;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    int i = paramMotionEvent.getActionMasked();
    if (i == 0)
      this.D = false; 
    if (!this.D) {
      boolean bool = super.onTouchEvent(paramMotionEvent);
      if (i == 0 && !bool)
        this.D = true; 
    } 
    if (i == 1 || i == 3)
      this.D = false; 
    return true;
  }
  
  public void setCollapseContentDescription(int paramInt) {
    CharSequence charSequence;
    if (paramInt != 0) {
      charSequence = getContext().getText(paramInt);
    } else {
      charSequence = null;
    } 
    setCollapseContentDescription(charSequence);
  }
  
  public void setCollapseContentDescription(CharSequence paramCharSequence) {
    if (!TextUtils.isEmpty(paramCharSequence))
      e(); 
    ImageButton imageButton = this.j;
    if (imageButton != null)
      imageButton.setContentDescription(paramCharSequence); 
  }
  
  public void setCollapseIcon(int paramInt) {
    setCollapseIcon(b.a.k.a.a.c(getContext(), paramInt));
  }
  
  public void setCollapseIcon(Drawable paramDrawable) {
    if (paramDrawable != null) {
      e();
      this.j.setImageDrawable(paramDrawable);
      return;
    } 
    ImageButton imageButton = this.j;
    if (imageButton != null)
      imageButton.setImageDrawable(this.h); 
  }
  
  public void setCollapsible(boolean paramBoolean) {
    this.P = paramBoolean;
    requestLayout();
  }
  
  public void setContentInsetEndWithActions(int paramInt) {
    int i = paramInt;
    if (paramInt < 0)
      i = Integer.MIN_VALUE; 
    if (i != this.x) {
      this.x = i;
      if (getNavigationIcon() != null)
        requestLayout(); 
    } 
  }
  
  public void setContentInsetStartWithNavigation(int paramInt) {
    int i = paramInt;
    if (paramInt < 0)
      i = Integer.MIN_VALUE; 
    if (i != this.w) {
      this.w = i;
      if (getNavigationIcon() != null)
        requestLayout(); 
    } 
  }
  
  public void setLogo(int paramInt) {
    setLogo(b.a.k.a.a.c(getContext(), paramInt));
  }
  
  public void setLogo(Drawable paramDrawable) {
    if (paramDrawable != null) {
      m();
      if (!c((View)this.g))
        a((View)this.g, true); 
    } else {
      ImageView imageView1 = this.g;
      if (imageView1 != null && c((View)imageView1)) {
        removeView((View)this.g);
        this.G.remove(this.g);
      } 
    } 
    ImageView imageView = this.g;
    if (imageView != null)
      imageView.setImageDrawable(paramDrawable); 
  }
  
  public void setLogoDescription(int paramInt) {
    setLogoDescription(getContext().getText(paramInt));
  }
  
  public void setLogoDescription(CharSequence paramCharSequence) {
    if (!TextUtils.isEmpty(paramCharSequence))
      m(); 
    ImageView imageView = this.g;
    if (imageView != null)
      imageView.setContentDescription(paramCharSequence); 
  }
  
  public void setNavigationContentDescription(int paramInt) {
    CharSequence charSequence;
    if (paramInt != 0) {
      charSequence = getContext().getText(paramInt);
    } else {
      charSequence = null;
    } 
    setNavigationContentDescription(charSequence);
  }
  
  public void setNavigationContentDescription(CharSequence paramCharSequence) {
    if (!TextUtils.isEmpty(paramCharSequence))
      p(); 
    ImageButton imageButton = this.f;
    if (imageButton != null)
      imageButton.setContentDescription(paramCharSequence); 
  }
  
  public void setNavigationIcon(int paramInt) {
    setNavigationIcon(b.a.k.a.a.c(getContext(), paramInt));
  }
  
  public void setNavigationIcon(Drawable paramDrawable) {
    if (paramDrawable != null) {
      p();
      if (!c((View)this.f))
        a((View)this.f, true); 
    } else {
      ImageButton imageButton1 = this.f;
      if (imageButton1 != null && c((View)imageButton1)) {
        removeView((View)this.f);
        this.G.remove(this.f);
      } 
    } 
    ImageButton imageButton = this.f;
    if (imageButton != null)
      imageButton.setImageDrawable(paramDrawable); 
  }
  
  public void setNavigationOnClickListener(View.OnClickListener paramOnClickListener) {
    p();
    this.f.setOnClickListener(paramOnClickListener);
  }
  
  public void setOnMenuItemClickListener(f paramf) {
    this.I = paramf;
  }
  
  public void setOverflowIcon(Drawable paramDrawable) {
    n();
    this.c.setOverflowIcon(paramDrawable);
  }
  
  public void setPopupTheme(int paramInt) {
    if (this.m != paramInt) {
      this.m = paramInt;
      if (paramInt == 0) {
        this.l = getContext();
        return;
      } 
      this.l = (Context)new ContextThemeWrapper(getContext(), paramInt);
    } 
  }
  
  public void setSubtitle(int paramInt) {
    setSubtitle(getContext().getText(paramInt));
  }
  
  public void setSubtitle(CharSequence paramCharSequence) {
    if (!TextUtils.isEmpty(paramCharSequence)) {
      if (this.e == null) {
        Context context = getContext();
        this.e = new z(context);
        this.e.setSingleLine();
        this.e.setEllipsize(TextUtils.TruncateAt.END);
        int i = this.o;
        if (i != 0)
          this.e.setTextAppearance(context, i); 
        ColorStateList colorStateList = this.C;
        if (colorStateList != null)
          this.e.setTextColor(colorStateList); 
      } 
      if (!c((View)this.e))
        a((View)this.e, true); 
    } else {
      TextView textView1 = this.e;
      if (textView1 != null && c((View)textView1)) {
        removeView((View)this.e);
        this.G.remove(this.e);
      } 
    } 
    TextView textView = this.e;
    if (textView != null)
      textView.setText(paramCharSequence); 
    this.A = paramCharSequence;
  }
  
  public void setSubtitleTextColor(int paramInt) {
    setSubtitleTextColor(ColorStateList.valueOf(paramInt));
  }
  
  public void setSubtitleTextColor(ColorStateList paramColorStateList) {
    this.C = paramColorStateList;
    TextView textView = this.e;
    if (textView != null)
      textView.setTextColor(paramColorStateList); 
  }
  
  public void setTitle(int paramInt) {
    setTitle(getContext().getText(paramInt));
  }
  
  public void setTitle(CharSequence paramCharSequence) {
    if (!TextUtils.isEmpty(paramCharSequence)) {
      if (this.d == null) {
        Context context = getContext();
        this.d = new z(context);
        this.d.setSingleLine();
        this.d.setEllipsize(TextUtils.TruncateAt.END);
        int i = this.n;
        if (i != 0)
          this.d.setTextAppearance(context, i); 
        ColorStateList colorStateList = this.B;
        if (colorStateList != null)
          this.d.setTextColor(colorStateList); 
      } 
      if (!c((View)this.d))
        a((View)this.d, true); 
    } else {
      TextView textView1 = this.d;
      if (textView1 != null && c((View)textView1)) {
        removeView((View)this.d);
        this.G.remove(this.d);
      } 
    } 
    TextView textView = this.d;
    if (textView != null)
      textView.setText(paramCharSequence); 
    this.z = paramCharSequence;
  }
  
  public void setTitleMarginBottom(int paramInt) {
    this.u = paramInt;
    requestLayout();
  }
  
  public void setTitleMarginEnd(int paramInt) {
    this.s = paramInt;
    requestLayout();
  }
  
  public void setTitleMarginStart(int paramInt) {
    this.r = paramInt;
    requestLayout();
  }
  
  public void setTitleMarginTop(int paramInt) {
    this.t = paramInt;
    requestLayout();
  }
  
  public void setTitleTextColor(int paramInt) {
    setTitleTextColor(ColorStateList.valueOf(paramInt));
  }
  
  public void setTitleTextColor(ColorStateList paramColorStateList) {
    this.B = paramColorStateList;
    TextView textView = this.d;
    if (textView != null)
      textView.setTextColor(paramColorStateList); 
  }
  
  class a implements ActionMenuView.e {
    a(Toolbar this$0) {}
    
    public boolean onMenuItemClick(MenuItem param1MenuItem) {
      Toolbar.f f = this.a.I;
      return (f != null) ? f.onMenuItemClick(param1MenuItem) : false;
    }
  }
  
  class b implements Runnable {
    b(Toolbar this$0) {}
    
    public void run() {
      this.c.k();
    }
  }
  
  class c implements View.OnClickListener {
    c(Toolbar this$0) {}
    
    public void onClick(View param1View) {
      this.c.c();
    }
  }
  
  private class d implements n {
    androidx.appcompat.view.menu.g c;
    
    j d;
    
    d(Toolbar this$0) {}
    
    public void a(Context param1Context, androidx.appcompat.view.menu.g param1g) {
      androidx.appcompat.view.menu.g g1 = this.c;
      if (g1 != null) {
        j j1 = this.d;
        if (j1 != null)
          g1.a(j1); 
      } 
      this.c = param1g;
    }
    
    public void a(androidx.appcompat.view.menu.g param1g, boolean param1Boolean) {}
    
    public void a(boolean param1Boolean) {
      if (this.d != null) {
        androidx.appcompat.view.menu.g g1 = this.c;
        boolean bool2 = false;
        boolean bool1 = bool2;
        if (g1 != null) {
          int k = g1.size();
          int i = 0;
          while (true) {
            bool1 = bool2;
            if (i < k) {
              if (this.c.getItem(i) == this.d) {
                bool1 = true;
                break;
              } 
              i++;
              continue;
            } 
            break;
          } 
        } 
        if (!bool1)
          a(this.c, this.d); 
      } 
    }
    
    public boolean a() {
      return false;
    }
    
    public boolean a(androidx.appcompat.view.menu.g param1g, j param1j) {
      View view = this.e.k;
      if (view instanceof b.a.o.c)
        ((b.a.o.c)view).c(); 
      Toolbar toolbar = this.e;
      toolbar.removeView(toolbar.k);
      toolbar = this.e;
      toolbar.removeView((View)toolbar.j);
      toolbar = this.e;
      toolbar.k = null;
      toolbar.a();
      this.d = null;
      this.e.requestLayout();
      param1j.a(false);
      return true;
    }
    
    public boolean a(s param1s) {
      return false;
    }
    
    public boolean b(androidx.appcompat.view.menu.g param1g, j param1j) {
      this.e.e();
      ViewParent viewParent = this.e.j.getParent();
      Toolbar toolbar = this.e;
      if (viewParent != toolbar) {
        if (viewParent instanceof ViewGroup)
          ((ViewGroup)viewParent).removeView((View)toolbar.j); 
        Toolbar toolbar1 = this.e;
        toolbar1.addView((View)toolbar1.j);
      } 
      this.e.k = param1j.getActionView();
      this.d = param1j;
      viewParent = this.e.k.getParent();
      toolbar = this.e;
      if (viewParent != toolbar) {
        if (viewParent instanceof ViewGroup)
          ((ViewGroup)viewParent).removeView(toolbar.k); 
        Toolbar.e e = this.e.generateDefaultLayoutParams();
        toolbar = this.e;
        e.a = 0x800003 | toolbar.p & 0x70;
        e.b = 2;
        toolbar.k.setLayoutParams((ViewGroup.LayoutParams)e);
        Toolbar toolbar1 = this.e;
        toolbar1.addView(toolbar1.k);
      } 
      this.e.j();
      this.e.requestLayout();
      param1j.a(true);
      View view = this.e.k;
      if (view instanceof b.a.o.c)
        ((b.a.o.c)view).b(); 
      return true;
    }
  }
  
  public static class e extends androidx.appcompat.app.a.a {
    int b = 0;
    
    public e(int param1Int1, int param1Int2) {
      super(param1Int1, param1Int2);
      this.a = 8388627;
    }
    
    public e(Context param1Context, AttributeSet param1AttributeSet) {
      super(param1Context, param1AttributeSet);
    }
    
    public e(ViewGroup.LayoutParams param1LayoutParams) {
      super(param1LayoutParams);
    }
    
    public e(ViewGroup.MarginLayoutParams param1MarginLayoutParams) {
      super((ViewGroup.LayoutParams)param1MarginLayoutParams);
      a(param1MarginLayoutParams);
    }
    
    public e(androidx.appcompat.app.a.a param1a) {
      super(param1a);
    }
    
    public e(e param1e) {
      super(param1e);
      this.b = param1e.b;
    }
    
    void a(ViewGroup.MarginLayoutParams param1MarginLayoutParams) {
      ((ViewGroup.MarginLayoutParams)this).leftMargin = param1MarginLayoutParams.leftMargin;
      ((ViewGroup.MarginLayoutParams)this).topMargin = param1MarginLayoutParams.topMargin;
      ((ViewGroup.MarginLayoutParams)this).rightMargin = param1MarginLayoutParams.rightMargin;
      ((ViewGroup.MarginLayoutParams)this).bottomMargin = param1MarginLayoutParams.bottomMargin;
    }
  }
  
  public static interface f {
    boolean onMenuItemClick(MenuItem param1MenuItem);
  }
  
  public static class g extends b.i.a.a {
    public static final Parcelable.Creator<g> CREATOR = (Parcelable.Creator<g>)new a();
    
    int e;
    
    boolean f;
    
    public g(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      super(param1Parcel, param1ClassLoader);
      boolean bool;
      this.e = param1Parcel.readInt();
      if (param1Parcel.readInt() != 0) {
        bool = true;
      } else {
        bool = false;
      } 
      this.f = bool;
    }
    
    public g(Parcelable param1Parcelable) {
      super(param1Parcelable);
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      throw new RuntimeException("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    class a implements Parcelable.ClassLoaderCreator<g> {
      public Toolbar.g createFromParcel(Parcel param2Parcel) {
        return new Toolbar.g(param2Parcel, null);
      }
      
      public Toolbar.g createFromParcel(Parcel param2Parcel, ClassLoader param2ClassLoader) {
        return new Toolbar.g(param2Parcel, param2ClassLoader);
      }
      
      public Toolbar.g[] newArray(int param2Int) {
        return new Toolbar.g[param2Int];
      }
    }
  }
  
  class a implements Parcelable.ClassLoaderCreator<g> {
    public Toolbar.g createFromParcel(Parcel param1Parcel) {
      return new Toolbar.g(param1Parcel, null);
    }
    
    public Toolbar.g createFromParcel(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      return new Toolbar.g(param1Parcel, param1ClassLoader);
    }
    
    public Toolbar.g[] newArray(int param1Int) {
      return new Toolbar.g[param1Int];
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/widget/Toolbar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */