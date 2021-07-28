package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug.ExportedProperty;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.o;

public class ActionMenuView extends i0 implements g.b, o {
  private int A;
  
  private int B;
  
  e C;
  
  private g r;
  
  private Context s;
  
  private int t;
  
  private boolean u;
  
  private c v;
  
  private n.a w;
  
  g.a x;
  
  private boolean y;
  
  private int z;
  
  public ActionMenuView(Context paramContext) {
    this(paramContext, null);
  }
  
  public ActionMenuView(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    setBaselineAligned(false);
    float f = (paramContext.getResources().getDisplayMetrics()).density;
    this.A = (int)(56.0F * f);
    this.B = (int)(f * 4.0F);
    this.s = paramContext;
    this.t = 0;
  }
  
  static int a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    ActionMenuItemView actionMenuItemView;
    c c1 = (c)paramView.getLayoutParams();
    int i = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt3) - paramInt4, View.MeasureSpec.getMode(paramInt3));
    if (paramView instanceof ActionMenuItemView) {
      actionMenuItemView = (ActionMenuItemView)paramView;
    } else {
      actionMenuItemView = null;
    } 
    boolean bool = true;
    if (actionMenuItemView != null && actionMenuItemView.d()) {
      paramInt3 = 1;
    } else {
      paramInt3 = 0;
    } 
    paramInt4 = 2;
    if (paramInt2 > 0 && (paramInt3 == 0 || paramInt2 >= 2)) {
      paramView.measure(View.MeasureSpec.makeMeasureSpec(paramInt2 * paramInt1, -2147483648), i);
      int k = paramView.getMeasuredWidth();
      int j = k / paramInt1;
      paramInt2 = j;
      if (k % paramInt1 != 0)
        paramInt2 = j + 1; 
      if (paramInt3 != 0 && paramInt2 < 2)
        paramInt2 = paramInt4; 
    } else {
      paramInt2 = 0;
    } 
    if (c1.c || paramInt3 == 0)
      bool = false; 
    c1.f = bool;
    c1.d = paramInt2;
    paramView.measure(View.MeasureSpec.makeMeasureSpec(paramInt1 * paramInt2, 1073741824), i);
    return paramInt2;
  }
  
  private void c(int paramInt1, int paramInt2) {
    int i3 = View.MeasureSpec.getMode(paramInt2);
    paramInt1 = View.MeasureSpec.getSize(paramInt1);
    int i = View.MeasureSpec.getSize(paramInt2);
    int j = getPaddingLeft();
    int k = getPaddingRight();
    int i4 = getPaddingTop() + getPaddingBottom();
    int i7 = ViewGroup.getChildMeasureSpec(paramInt2, i4, -2);
    int i6 = paramInt1 - j + k;
    paramInt2 = this.A;
    paramInt1 = i6 / paramInt2;
    if (paramInt1 == 0) {
      setMeasuredDimension(i6, 0);
      return;
    } 
    int i8 = paramInt2 + i6 % paramInt2 / paramInt1;
    int i9 = getChildCount();
    int i2 = 0;
    paramInt2 = 0;
    j = 0;
    int i1 = 0;
    int n = 0;
    k = 0;
    long l = 0L;
    while (i2 < i9) {
      View view = getChildAt(i2);
      if (view.getVisibility() != 8) {
        boolean bool = view instanceof ActionMenuItemView;
        i1++;
        if (bool) {
          i10 = this.B;
          view.setPadding(i10, 0, i10, 0);
        } 
        c c1 = (c)view.getLayoutParams();
        c1.h = false;
        c1.e = 0;
        c1.d = 0;
        c1.f = false;
        c1.leftMargin = 0;
        c1.rightMargin = 0;
        if (bool && ((ActionMenuItemView)view).d()) {
          bool = true;
        } else {
          bool = false;
        } 
        c1.g = bool;
        if (c1.c) {
          i10 = 1;
        } else {
          i10 = paramInt1;
        } 
        int i11 = a(view, i8, i10, i7, i4);
        n = Math.max(n, i11);
        int i10 = k;
        if (c1.f)
          i10 = k + 1; 
        if (c1.c)
          j = 1; 
        paramInt1 -= i11;
        paramInt2 = Math.max(paramInt2, view.getMeasuredHeight());
        if (i11 == 1)
          l |= (1 << i2); 
        k = i10;
      } 
      i2++;
    } 
    if (j != 0 && i1 == 2) {
      i4 = 1;
    } else {
      i4 = 0;
    } 
    int m = 0;
    int i5 = paramInt1;
    paramInt1 = m;
    i2 = i6;
    while (k > 0 && i5 > 0) {
      i6 = Integer.MAX_VALUE;
      int i10 = 0;
      int i11 = 0;
      long l1;
      for (l1 = 0L; i10 < i9; l1 = l2) {
        int i12;
        long l2;
        c c1 = (c)getChildAt(i10).getLayoutParams();
        if (!c1.f) {
          i12 = i6;
          m = i11;
          l2 = l1;
        } else {
          int i13 = c1.d;
          if (i13 < i6) {
            i12 = i13;
            l2 = 1L << i10;
            m = 1;
          } else {
            i12 = i6;
            m = i11;
            l2 = l1;
            if (i13 == i6) {
              l2 = l1 | 1L << i10;
              m = i11 + 1;
              i12 = i6;
            } 
          } 
        } 
        i10++;
        i6 = i12;
        i11 = m;
      } 
      m = paramInt1;
      paramInt1 = paramInt2;
      l |= l1;
      if (i11 > i5) {
        paramInt2 = paramInt1;
        paramInt1 = m;
        break;
      } 
      paramInt2 = i6 + 1;
      for (m = 0; m < i9; m++) {
        View view = getChildAt(m);
        c c1 = (c)view.getLayoutParams();
        long l2 = (1 << m);
        if ((l1 & l2) == 0L) {
          long l3 = l;
          if (c1.d == paramInt2)
            l3 = l | l2; 
          l = l3;
        } else {
          if (i4 != 0 && c1.g && i5 == 1) {
            i6 = this.B;
            view.setPadding(i6 + i8, 0, i6, 0);
          } 
          c1.d++;
          c1.h = true;
          i5--;
        } 
      } 
      paramInt2 = paramInt1;
      paramInt1 = 1;
    } 
    if (j == 0 && i1 == 1) {
      j = 1;
    } else {
      j = 0;
    } 
    if (i5 > 0 && l != 0L && (i5 < i1 - 1 || j != 0 || n > 1)) {
      float f = Long.bitCount(l);
      if (j == 0) {
        float f1 = f;
        if ((l & 0x1L) != 0L) {
          f1 = f;
          if (!((c)getChildAt(0).getLayoutParams()).g)
            f1 = f - 0.5F; 
        } 
        j = i9 - 1;
        f = f1;
        if ((l & (1 << j)) != 0L) {
          f = f1;
          if (!((c)getChildAt(j).getLayoutParams()).g)
            f = f1 - 0.5F; 
        } 
      } 
      if (f > 0.0F) {
        j = (int)((i5 * i8) / f);
      } else {
        j = 0;
      } 
      k = 0;
      while (true) {
        m = paramInt1;
        if (k < i9) {
          if ((l & (1 << k)) == 0L) {
            m = paramInt1;
          } else {
            View view = getChildAt(k);
            c c1 = (c)view.getLayoutParams();
            if (view instanceof ActionMenuItemView) {
              c1.e = j;
              c1.h = true;
              if (k == 0 && !c1.g)
                c1.leftMargin = -j / 2; 
            } else if (c1.c) {
              c1.e = j;
              c1.h = true;
              c1.rightMargin = -j / 2;
            } else {
              if (k != 0)
                c1.leftMargin = j / 2; 
              m = paramInt1;
              if (k != i9 - 1) {
                c1.rightMargin = j / 2;
                m = paramInt1;
              } 
              k++;
              paramInt1 = m;
            } 
            m = 1;
          } 
        } else {
          break;
        } 
        k++;
        paramInt1 = m;
      } 
    } else {
      m = paramInt1;
    } 
    paramInt1 = 0;
    if (m != 0)
      while (paramInt1 < i9) {
        View view = getChildAt(paramInt1);
        c c1 = (c)view.getLayoutParams();
        if (c1.h)
          view.measure(View.MeasureSpec.makeMeasureSpec(c1.d * i8 + c1.e, 1073741824), i7); 
        paramInt1++;
      }  
    if (i3 == 1073741824)
      paramInt2 = i; 
    setMeasuredDimension(i2, paramInt2);
  }
  
  public void a(g paramg) {
    this.r = paramg;
  }
  
  public void a(n.a parama, g.a parama1) {
    this.w = parama;
    this.x = parama1;
  }
  
  public boolean a(j paramj) {
    return this.r.a((MenuItem)paramj, 0);
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    return paramLayoutParams instanceof c;
  }
  
  public void d() {
    c c1 = this.v;
    if (c1 != null)
      c1.c(); 
  }
  
  protected boolean d(int paramInt) {
    boolean bool;
    int j = 0;
    if (paramInt == 0)
      return false; 
    View view1 = getChildAt(paramInt - 1);
    View view2 = getChildAt(paramInt);
    int i = j;
    if (paramInt < getChildCount()) {
      i = j;
      if (view1 instanceof a)
        i = false | ((a)view1).b(); 
    } 
    j = i;
    if (paramInt > 0) {
      j = i;
      if (view2 instanceof a)
        bool = i | ((a)view2).c(); 
    } 
    return bool;
  }
  
  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent) {
    return false;
  }
  
  public c e() {
    c c1 = generateDefaultLayoutParams();
    c1.c = true;
    return c1;
  }
  
  public boolean f() {
    c c1 = this.v;
    return (c1 != null && c1.e());
  }
  
  public boolean g() {
    c c1 = this.v;
    return (c1 != null && c1.g());
  }
  
  protected c generateDefaultLayoutParams() {
    c c1 = new c(-2, -2);
    c1.b = 16;
    return c1;
  }
  
  public c generateLayoutParams(AttributeSet paramAttributeSet) {
    return new c(getContext(), paramAttributeSet);
  }
  
  protected c generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    if (paramLayoutParams != null) {
      c c1;
      if (paramLayoutParams instanceof c) {
        c1 = new c((c)paramLayoutParams);
      } else {
        c1 = new c((ViewGroup.LayoutParams)c1);
      } 
      if (c1.b <= 0)
        c1.b = 16; 
      return c1;
    } 
    return generateDefaultLayoutParams();
  }
  
  public Menu getMenu() {
    if (this.r == null) {
      Context context = getContext();
      this.r = new g(context);
      this.r.a(new d(this));
      this.v = new c(context);
      this.v.c(true);
      c c1 = this.v;
      n.a a1 = this.w;
      if (a1 == null)
        a1 = new b(); 
      c1.a(a1);
      this.r.a((n)this.v, this.s);
      this.v.a(this);
    } 
    return (Menu)this.r;
  }
  
  public Drawable getOverflowIcon() {
    getMenu();
    return this.v.d();
  }
  
  public int getPopupTheme() {
    return this.t;
  }
  
  public int getWindowAnimations() {
    return 0;
  }
  
  public boolean h() {
    c c1 = this.v;
    return (c1 != null && c1.h());
  }
  
  public boolean i() {
    return this.u;
  }
  
  public g j() {
    return this.r;
  }
  
  public boolean k() {
    c c1 = this.v;
    return (c1 != null && c1.i());
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration) {
    super.onConfigurationChanged(paramConfiguration);
    c c1 = this.v;
    if (c1 != null) {
      c1.a(false);
      if (this.v.h()) {
        this.v.e();
        this.v.i();
      } 
    } 
  }
  
  public void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    d();
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (!this.y) {
      super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    } 
    int k = getChildCount();
    int j = (paramInt4 - paramInt2) / 2;
    int m = getDividerWidth();
    int n = paramInt3 - paramInt1;
    paramInt1 = getPaddingRight();
    paramInt2 = getPaddingLeft();
    paramBoolean = d1.a((View)this);
    paramInt1 = n - paramInt1 - paramInt2;
    paramInt2 = 0;
    paramInt4 = 0;
    paramInt3 = 0;
    while (paramInt2 < k) {
      View view = getChildAt(paramInt2);
      if (view.getVisibility() != 8) {
        c c1 = (c)view.getLayoutParams();
        if (c1.c) {
          int i2;
          int i1 = view.getMeasuredWidth();
          paramInt4 = i1;
          if (d(paramInt2))
            paramInt4 = i1 + m; 
          int i3 = view.getMeasuredHeight();
          if (paramBoolean) {
            i2 = getPaddingLeft() + c1.leftMargin;
            i1 = i2 + paramInt4;
          } else {
            i1 = getWidth() - getPaddingRight() - c1.rightMargin;
            i2 = i1 - paramInt4;
          } 
          int i4 = j - i3 / 2;
          view.layout(i2, i4, i1, i3 + i4);
          paramInt1 -= paramInt4;
          paramInt4 = 1;
        } else {
          paramInt1 -= view.getMeasuredWidth() + c1.leftMargin + c1.rightMargin;
          d(paramInt2);
          paramInt3++;
        } 
      } 
      paramInt2++;
    } 
    if (k == 1 && paramInt4 == 0) {
      View view = getChildAt(0);
      paramInt1 = view.getMeasuredWidth();
      paramInt2 = view.getMeasuredHeight();
      paramInt3 = n / 2 - paramInt1 / 2;
      paramInt4 = j - paramInt2 / 2;
      view.layout(paramInt3, paramInt4, paramInt1 + paramInt3, paramInt2 + paramInt4);
      return;
    } 
    paramInt2 = paramInt3 - (paramInt4 ^ 0x1);
    if (paramInt2 > 0) {
      paramInt1 /= paramInt2;
    } else {
      paramInt1 = 0;
    } 
    paramInt4 = 0;
    paramInt3 = 0;
    int i = Math.max(0, paramInt1);
    if (paramBoolean) {
      paramInt2 = getWidth() - getPaddingRight();
      paramInt1 = paramInt3;
      while (paramInt1 < k) {
        View view = getChildAt(paramInt1);
        c c1 = (c)view.getLayoutParams();
        paramInt3 = paramInt2;
        if (view.getVisibility() != 8)
          if (c1.c) {
            paramInt3 = paramInt2;
          } else {
            paramInt2 -= c1.rightMargin;
            paramInt3 = view.getMeasuredWidth();
            paramInt4 = view.getMeasuredHeight();
            int i1 = j - paramInt4 / 2;
            view.layout(paramInt2 - paramInt3, i1, paramInt2, paramInt4 + i1);
            paramInt3 = paramInt2 - paramInt3 + c1.leftMargin + i;
          }  
        paramInt1++;
        paramInt2 = paramInt3;
      } 
    } else {
      paramInt2 = getPaddingLeft();
      paramInt1 = paramInt4;
      while (paramInt1 < k) {
        View view = getChildAt(paramInt1);
        c c1 = (c)view.getLayoutParams();
        paramInt3 = paramInt2;
        if (view.getVisibility() != 8)
          if (c1.c) {
            paramInt3 = paramInt2;
          } else {
            paramInt2 += c1.leftMargin;
            paramInt3 = view.getMeasuredWidth();
            paramInt4 = view.getMeasuredHeight();
            int i1 = j - paramInt4 / 2;
            view.layout(paramInt2, i1, paramInt2 + paramInt3, paramInt4 + i1);
            paramInt3 = paramInt2 + paramInt3 + c1.rightMargin + i;
          }  
        paramInt1++;
        paramInt2 = paramInt3;
      } 
    } 
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    boolean bool;
    boolean bool1 = this.y;
    if (View.MeasureSpec.getMode(paramInt1) == 1073741824) {
      bool = true;
    } else {
      bool = false;
    } 
    this.y = bool;
    if (bool1 != this.y)
      this.z = 0; 
    int i = View.MeasureSpec.getSize(paramInt1);
    if (this.y) {
      g g1 = this.r;
      if (g1 != null && i != this.z) {
        this.z = i;
        g1.b(true);
      } 
    } 
    int j = getChildCount();
    if (this.y && j > 0) {
      c(paramInt1, paramInt2);
      return;
    } 
    for (i = 0; i < j; i++) {
      c c1 = (c)getChildAt(i).getLayoutParams();
      c1.rightMargin = 0;
      c1.leftMargin = 0;
    } 
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public void setExpandedActionViewsExclusive(boolean paramBoolean) {
    this.v.b(paramBoolean);
  }
  
  public void setOnMenuItemClickListener(e parame) {
    this.C = parame;
  }
  
  public void setOverflowIcon(Drawable paramDrawable) {
    getMenu();
    this.v.a(paramDrawable);
  }
  
  public void setOverflowReserved(boolean paramBoolean) {
    this.u = paramBoolean;
  }
  
  public void setPopupTheme(int paramInt) {
    if (this.t != paramInt) {
      this.t = paramInt;
      if (paramInt == 0) {
        this.s = getContext();
        return;
      } 
      this.s = (Context)new ContextThemeWrapper(getContext(), paramInt);
    } 
  }
  
  public void setPresenter(c paramc) {
    this.v = paramc;
    this.v.a(this);
  }
  
  public static interface a {
    boolean b();
    
    boolean c();
  }
  
  private static class b implements n.a {
    public void a(g param1g, boolean param1Boolean) {}
    
    public boolean a(g param1g) {
      return false;
    }
  }
  
  public static class c extends i0.a {
    @ExportedProperty
    public boolean c;
    
    @ExportedProperty
    public int d;
    
    @ExportedProperty
    public int e;
    
    @ExportedProperty
    public boolean f;
    
    @ExportedProperty
    public boolean g;
    
    boolean h;
    
    public c(int param1Int1, int param1Int2) {
      super(param1Int1, param1Int2);
      this.c = false;
    }
    
    public c(Context param1Context, AttributeSet param1AttributeSet) {
      super(param1Context, param1AttributeSet);
    }
    
    public c(ViewGroup.LayoutParams param1LayoutParams) {
      super(param1LayoutParams);
    }
    
    public c(c param1c) {
      super((ViewGroup.LayoutParams)param1c);
      this.c = param1c.c;
    }
  }
  
  private class d implements g.a {
    d(ActionMenuView this$0) {}
    
    public void a(g param1g) {
      g.a a1 = this.c.x;
      if (a1 != null)
        a1.a(param1g); 
    }
    
    public boolean a(g param1g, MenuItem param1MenuItem) {
      ActionMenuView.e e = this.c.C;
      return (e != null && e.onMenuItemClick(param1MenuItem));
    }
  }
  
  public static interface e {
    boolean onMenuItemClick(MenuItem param1MenuItem);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/widget/ActionMenuView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */