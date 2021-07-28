package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.n;
import b.a.e;
import b.a.f;
import b.a.h;
import b.a.j;
import b.g.m.a0;
import b.g.m.b0;
import b.g.m.v;
import b.g.m.z;

public class y0 implements d0 {
  Toolbar a;
  
  private int b;
  
  private View c;
  
  private View d;
  
  private Drawable e;
  
  private Drawable f;
  
  private Drawable g;
  
  private boolean h;
  
  CharSequence i;
  
  private CharSequence j;
  
  private CharSequence k;
  
  Window.Callback l;
  
  boolean m;
  
  private c n;
  
  private int o;
  
  private int p;
  
  private Drawable q;
  
  public y0(Toolbar paramToolbar, boolean paramBoolean) {
    this(paramToolbar, paramBoolean, h.abc_action_bar_up_description, e.abc_ic_ab_back_material);
  }
  
  public y0(Toolbar paramToolbar, boolean paramBoolean, int paramInt1, int paramInt2) {
    boolean bool;
    this.o = 0;
    this.p = 0;
    this.a = paramToolbar;
    this.i = paramToolbar.getTitle();
    this.j = paramToolbar.getSubtitle();
    if (this.i != null) {
      bool = true;
    } else {
      bool = false;
    } 
    this.h = bool;
    this.g = paramToolbar.getNavigationIcon();
    x0 x0 = x0.a(paramToolbar.getContext(), null, j.ActionBar, b.a.a.actionBarStyle, 0);
    this.q = x0.b(j.ActionBar_homeAsUpIndicator);
    if (paramBoolean) {
      CharSequence charSequence = x0.e(j.ActionBar_title);
      if (!TextUtils.isEmpty(charSequence))
        setTitle(charSequence); 
      charSequence = x0.e(j.ActionBar_subtitle);
      if (!TextUtils.isEmpty(charSequence))
        b(charSequence); 
      Drawable drawable = x0.b(j.ActionBar_logo);
      if (drawable != null)
        b(drawable); 
      drawable = x0.b(j.ActionBar_icon);
      if (drawable != null)
        setIcon(drawable); 
      if (this.g == null) {
        drawable = this.q;
        if (drawable != null)
          a(drawable); 
      } 
      a(x0.d(j.ActionBar_displayOptions, 0));
      paramInt2 = x0.g(j.ActionBar_customNavigationLayout, 0);
      if (paramInt2 != 0) {
        a(LayoutInflater.from(this.a.getContext()).inflate(paramInt2, this.a, false));
        a(this.b | 0x10);
      } 
      paramInt2 = x0.f(j.ActionBar_height, 0);
      if (paramInt2 > 0) {
        ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
        layoutParams.height = paramInt2;
        this.a.setLayoutParams(layoutParams);
      } 
      paramInt2 = x0.b(j.ActionBar_contentInsetStart, -1);
      int i = x0.b(j.ActionBar_contentInsetEnd, -1);
      if (paramInt2 >= 0 || i >= 0)
        this.a.a(Math.max(paramInt2, 0), Math.max(i, 0)); 
      paramInt2 = x0.g(j.ActionBar_titleTextStyle, 0);
      if (paramInt2 != 0) {
        Toolbar toolbar = this.a;
        toolbar.b(toolbar.getContext(), paramInt2);
      } 
      paramInt2 = x0.g(j.ActionBar_subtitleTextStyle, 0);
      if (paramInt2 != 0) {
        Toolbar toolbar = this.a;
        toolbar.a(toolbar.getContext(), paramInt2);
      } 
      paramInt2 = x0.g(j.ActionBar_popupTheme, 0);
      if (paramInt2 != 0)
        this.a.setPopupTheme(paramInt2); 
    } else {
      this.b = p();
    } 
    x0.b();
    c(paramInt1);
    this.k = this.a.getNavigationContentDescription();
    this.a.setNavigationOnClickListener(new a(this));
  }
  
  private void c(CharSequence paramCharSequence) {
    this.i = paramCharSequence;
    if ((this.b & 0x8) != 0)
      this.a.setTitle(paramCharSequence); 
  }
  
  private int p() {
    if (this.a.getNavigationIcon() != null) {
      this.q = this.a.getNavigationIcon();
      return 15;
    } 
    return 11;
  }
  
  private void q() {
    if ((this.b & 0x4) != 0) {
      if (TextUtils.isEmpty(this.k)) {
        this.a.setNavigationContentDescription(this.p);
        return;
      } 
      this.a.setNavigationContentDescription(this.k);
    } 
  }
  
  private void r() {
    Drawable drawable;
    Toolbar toolbar;
    if ((this.b & 0x4) != 0) {
      toolbar = this.a;
      drawable = this.g;
      if (drawable == null)
        drawable = this.q; 
    } else {
      toolbar = this.a;
      drawable = null;
    } 
    toolbar.setNavigationIcon(drawable);
  }
  
  private void s() {
    Drawable drawable;
    int i = this.b;
    if ((i & 0x2) != 0) {
      if ((i & 0x1) != 0) {
        Drawable drawable1 = this.f;
        if (drawable1 != null) {
          this.a.setLogo(drawable1);
          return;
        } 
      } 
      drawable = this.e;
    } else {
      drawable = null;
    } 
    this.a.setLogo(drawable);
  }
  
  public z a(int paramInt, long paramLong) {
    float f;
    z z = v.a((View)this.a);
    if (paramInt == 0) {
      f = 1.0F;
    } else {
      f = 0.0F;
    } 
    z.a(f);
    z.a(paramLong);
    z.a((a0)new b(this, paramInt));
    return z;
  }
  
  public void a(int paramInt) {
    int i = this.b ^ paramInt;
    this.b = paramInt;
    if (i != 0) {
      if ((i & 0x4) != 0) {
        if ((paramInt & 0x4) != 0)
          q(); 
        r();
      } 
      if ((i & 0x3) != 0)
        s(); 
      if ((i & 0x8) != 0) {
        Toolbar toolbar;
        CharSequence charSequence;
        if ((paramInt & 0x8) != 0) {
          this.a.setTitle(this.i);
          toolbar = this.a;
          charSequence = this.j;
        } else {
          toolbar = this.a;
          charSequence = null;
          toolbar.setTitle((CharSequence)null);
          toolbar = this.a;
        } 
        toolbar.setSubtitle(charSequence);
      } 
      if ((i & 0x10) != 0) {
        View view = this.d;
        if (view != null) {
          if ((paramInt & 0x10) != 0) {
            this.a.addView(view);
            return;
          } 
          this.a.removeView(view);
        } 
      } 
    } 
  }
  
  public void a(Drawable paramDrawable) {
    this.g = paramDrawable;
    r();
  }
  
  public void a(Menu paramMenu, n.a parama) {
    if (this.n == null) {
      this.n = new c(this.a.getContext());
      this.n.a(f.action_menu_presenter);
    } 
    this.n.a(parama);
    this.a.a((g)paramMenu, this.n);
  }
  
  public void a(View paramView) {
    View view = this.d;
    if (view != null && (this.b & 0x10) != 0)
      this.a.removeView(view); 
    this.d = paramView;
    if (paramView != null && (this.b & 0x10) != 0)
      this.a.addView(this.d); 
  }
  
  public void a(n.a parama, g.a parama1) {
    this.a.a(parama, parama1);
  }
  
  public void a(p0 paramp0) {
    View view = this.c;
    if (view != null) {
      ViewParent viewParent = view.getParent();
      Toolbar toolbar = this.a;
      if (viewParent == toolbar)
        toolbar.removeView(this.c); 
    } 
    this.c = (View)paramp0;
    if (paramp0 != null && this.o == 2) {
      this.a.addView(this.c, 0);
      Toolbar.e e = (Toolbar.e)this.c.getLayoutParams();
      ((ViewGroup.MarginLayoutParams)e).width = -2;
      ((ViewGroup.MarginLayoutParams)e).height = -2;
      e.a = 8388691;
      paramp0.setAllowCollapse(true);
    } 
  }
  
  public void a(CharSequence paramCharSequence) {
    this.k = paramCharSequence;
    q();
  }
  
  public void a(boolean paramBoolean) {}
  
  public boolean a() {
    return this.a.i();
  }
  
  public void b() {
    this.m = true;
  }
  
  public void b(int paramInt) {
    Drawable drawable;
    if (paramInt != 0) {
      drawable = b.a.k.a.a.c(i(), paramInt);
    } else {
      drawable = null;
    } 
    b(drawable);
  }
  
  public void b(Drawable paramDrawable) {
    this.f = paramDrawable;
    s();
  }
  
  public void b(CharSequence paramCharSequence) {
    this.j = paramCharSequence;
    if ((this.b & 0x8) != 0)
      this.a.setSubtitle(paramCharSequence); 
  }
  
  public void b(boolean paramBoolean) {
    this.a.setCollapsible(paramBoolean);
  }
  
  public void c(int paramInt) {
    if (paramInt == this.p)
      return; 
    this.p = paramInt;
    if (TextUtils.isEmpty(this.a.getNavigationContentDescription()))
      d(this.p); 
  }
  
  public boolean c() {
    return this.a.h();
  }
  
  public void collapseActionView() {
    this.a.c();
  }
  
  public void d(int paramInt) {
    String str;
    if (paramInt == 0) {
      str = null;
    } else {
      str = i().getString(paramInt);
    } 
    a(str);
  }
  
  public boolean d() {
    return this.a.g();
  }
  
  public boolean e() {
    return this.a.k();
  }
  
  public boolean f() {
    return this.a.b();
  }
  
  public void g() {
    this.a.d();
  }
  
  public CharSequence getTitle() {
    return this.a.getTitle();
  }
  
  public ViewGroup h() {
    return this.a;
  }
  
  public Context i() {
    return this.a.getContext();
  }
  
  public boolean j() {
    return this.a.f();
  }
  
  public int k() {
    return this.b;
  }
  
  public Menu l() {
    return this.a.getMenu();
  }
  
  public int m() {
    return this.o;
  }
  
  public void n() {
    Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
  }
  
  public void o() {
    Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
  }
  
  public void setIcon(int paramInt) {
    Drawable drawable;
    if (paramInt != 0) {
      drawable = b.a.k.a.a.c(i(), paramInt);
    } else {
      drawable = null;
    } 
    setIcon(drawable);
  }
  
  public void setIcon(Drawable paramDrawable) {
    this.e = paramDrawable;
    s();
  }
  
  public void setTitle(CharSequence paramCharSequence) {
    this.h = true;
    c(paramCharSequence);
  }
  
  public void setVisibility(int paramInt) {
    this.a.setVisibility(paramInt);
  }
  
  public void setWindowCallback(Window.Callback paramCallback) {
    this.l = paramCallback;
  }
  
  public void setWindowTitle(CharSequence paramCharSequence) {
    if (!this.h)
      c(paramCharSequence); 
  }
  
  class a implements View.OnClickListener {
    final androidx.appcompat.view.menu.a c = new androidx.appcompat.view.menu.a(this.d.a.getContext(), 0, 16908332, 0, 0, this.d.i);
    
    a(y0 this$0) {}
    
    public void onClick(View param1View) {
      y0 y01 = this.d;
      Window.Callback callback = y01.l;
      if (callback != null && y01.m)
        callback.onMenuItemSelected(0, (MenuItem)this.c); 
    }
  }
  
  class b extends b0 {
    private boolean a = false;
    
    b(y0 this$0, int param1Int) {}
    
    public void a(View param1View) {
      this.a = true;
    }
    
    public void b(View param1View) {
      if (!this.a)
        this.c.a.setVisibility(this.b); 
    }
    
    public void c(View param1View) {
      this.c.a.setVisibility(0);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/widget/y0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */