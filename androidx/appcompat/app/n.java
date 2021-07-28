package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.p0;
import b.a.f;
import b.a.j;
import b.a.o.g;
import b.a.o.h;
import b.g.m.a0;
import b.g.m.b0;
import b.g.m.c0;
import b.g.m.v;
import b.g.m.z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class n extends a implements ActionBarOverlayLayout.d {
  private static final Interpolator B = (Interpolator)new AccelerateInterpolator();
  
  private static final Interpolator C = (Interpolator)new DecelerateInterpolator();
  
  final c0 A;
  
  Context a;
  
  private Context b;
  
  ActionBarOverlayLayout c;
  
  ActionBarContainer d;
  
  d0 e;
  
  ActionBarContextView f;
  
  View g;
  
  p0 h;
  
  private boolean i;
  
  d j;
  
  b.a.o.b k;
  
  b.a.o.b.a l;
  
  private boolean m;
  
  private ArrayList<a.b> n;
  
  private boolean o;
  
  private int p;
  
  boolean q;
  
  boolean r;
  
  boolean s;
  
  private boolean t;
  
  private boolean u;
  
  h v;
  
  private boolean w;
  
  boolean x;
  
  final a0 y;
  
  final a0 z;
  
  public n(Activity paramActivity, boolean paramBoolean) {
    new ArrayList();
    this.n = new ArrayList<a.b>();
    this.p = 0;
    this.q = true;
    this.u = true;
    this.y = (a0)new a(this);
    this.z = (a0)new b(this);
    this.A = new c(this);
    View view = paramActivity.getWindow().getDecorView();
    b(view);
    if (!paramBoolean)
      this.g = view.findViewById(16908290); 
  }
  
  public n(Dialog paramDialog) {
    new ArrayList();
    this.n = new ArrayList<a.b>();
    this.p = 0;
    this.q = true;
    this.u = true;
    this.y = (a0)new a(this);
    this.z = (a0)new b(this);
    this.A = new c(this);
    b(paramDialog.getWindow().getDecorView());
  }
  
  private d0 a(View paramView) {
    String str;
    if (paramView instanceof d0)
      return (d0)paramView; 
    if (paramView instanceof Toolbar)
      return ((Toolbar)paramView).getWrapper(); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Can't make a decor toolbar out of ");
    if (paramView != null) {
      str = paramView.getClass().getSimpleName();
    } else {
      str = "null";
    } 
    stringBuilder.append(str);
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  static boolean a(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    return paramBoolean3 ? true : (!(paramBoolean1 || paramBoolean2));
  }
  
  private void b(View paramView) {
    this.c = (ActionBarOverlayLayout)paramView.findViewById(f.decor_content_parent);
    ActionBarOverlayLayout actionBarOverlayLayout = this.c;
    if (actionBarOverlayLayout != null)
      actionBarOverlayLayout.setActionBarVisibilityCallback(this); 
    this.e = a(paramView.findViewById(f.action_bar));
    this.f = (ActionBarContextView)paramView.findViewById(f.action_context_bar);
    this.d = (ActionBarContainer)paramView.findViewById(f.action_bar_container);
    d0 d01 = this.e;
    if (d01 != null && this.f != null && this.d != null) {
      boolean bool;
      this.a = d01.i();
      if ((this.e.k() & 0x4) != 0) {
        i = 1;
      } else {
        i = 0;
      } 
      if (i)
        this.i = true; 
      b.a.o.a a1 = b.a.o.a.a(this.a);
      if (a1.a() || i) {
        bool = true;
      } else {
        bool = false;
      } 
      j(bool);
      k(a1.f());
      TypedArray typedArray = this.a.obtainStyledAttributes(null, j.ActionBar, b.a.a.actionBarStyle, 0);
      if (typedArray.getBoolean(j.ActionBar_hideOnContentScroll, false))
        i(true); 
      int i = typedArray.getDimensionPixelSize(j.ActionBar_elevation, 0);
      if (i != 0)
        a(i); 
      typedArray.recycle();
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(n.class.getSimpleName());
    stringBuilder.append(" can only be used with a compatible window decor layout");
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  private void k(boolean paramBoolean) {
    this.o = paramBoolean;
    if (!this.o) {
      this.e.a(null);
      this.d.setTabContainer(this.h);
    } else {
      this.d.setTabContainer(null);
      this.e.a(this.h);
    } 
    int i = m();
    boolean bool = true;
    if (i == 2) {
      i = 1;
    } else {
      i = 0;
    } 
    p0 p01 = this.h;
    if (p01 != null) {
      ActionBarOverlayLayout actionBarOverlayLayout1;
      if (i != 0) {
        p01.setVisibility(0);
        actionBarOverlayLayout1 = this.c;
        if (actionBarOverlayLayout1 != null)
          v.N((View)actionBarOverlayLayout1); 
      } else {
        actionBarOverlayLayout1.setVisibility(8);
      } 
    } 
    d0 d01 = this.e;
    if (!this.o && i != 0) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    } 
    d01.b(paramBoolean);
    ActionBarOverlayLayout actionBarOverlayLayout = this.c;
    if (!this.o && i != 0) {
      paramBoolean = bool;
    } else {
      paramBoolean = false;
    } 
    actionBarOverlayLayout.setHasNonEmbeddedTabs(paramBoolean);
  }
  
  private void l(boolean paramBoolean) {
    if (a(this.r, this.s, this.t)) {
      if (!this.u) {
        this.u = true;
        h(paramBoolean);
        return;
      } 
    } else if (this.u) {
      this.u = false;
      g(paramBoolean);
    } 
  }
  
  private void n() {
    if (this.t) {
      this.t = false;
      ActionBarOverlayLayout actionBarOverlayLayout = this.c;
      if (actionBarOverlayLayout != null)
        actionBarOverlayLayout.setShowingForActionMode(false); 
      l(false);
    } 
  }
  
  private boolean o() {
    return v.I((View)this.d);
  }
  
  private void p() {
    if (!this.t) {
      this.t = true;
      ActionBarOverlayLayout actionBarOverlayLayout = this.c;
      if (actionBarOverlayLayout != null)
        actionBarOverlayLayout.setShowingForActionMode(true); 
      l(false);
    } 
  }
  
  public b.a.o.b a(b.a.o.b.a parama) {
    d d2 = this.j;
    if (d2 != null)
      d2.a(); 
    this.c.setHideOnContentScrollEnabled(false);
    this.f.c();
    d d1 = new d(this, this.f.getContext(), parama);
    if (d1.k()) {
      this.j = d1;
      d1.i();
      this.f.a(d1);
      f(true);
      this.f.sendAccessibilityEvent(32);
      return d1;
    } 
    return null;
  }
  
  public void a() {
    if (this.s) {
      this.s = false;
      l(true);
    } 
  }
  
  public void a(float paramFloat) {
    v.a((View)this.d, paramFloat);
  }
  
  public void a(int paramInt) {
    this.p = paramInt;
  }
  
  public void a(int paramInt1, int paramInt2) {
    int i = this.e.k();
    if ((paramInt2 & 0x4) != 0)
      this.i = true; 
    this.e.a(paramInt1 & paramInt2 | (paramInt2 ^ 0xFFFFFFFF) & i);
  }
  
  public void a(Configuration paramConfiguration) {
    k(b.a.o.a.a(this.a).f());
  }
  
  public void a(Drawable paramDrawable) {
    this.e.a(paramDrawable);
  }
  
  public void a(CharSequence paramCharSequence) {
    this.e.setTitle(paramCharSequence);
  }
  
  public void a(boolean paramBoolean) {
    this.q = paramBoolean;
  }
  
  public boolean a(int paramInt, KeyEvent paramKeyEvent) {
    d d1 = this.j;
    if (d1 == null)
      return false; 
    Menu menu = d1.c();
    if (menu != null) {
      if (paramKeyEvent != null) {
        i = paramKeyEvent.getDeviceId();
      } else {
        i = -1;
      } 
      int i = KeyCharacterMap.load(i).getKeyboardType();
      boolean bool = true;
      if (i == 1)
        bool = false; 
      menu.setQwertyMode(bool);
      return menu.performShortcut(paramInt, paramKeyEvent, 0);
    } 
    return false;
  }
  
  public void b() {
    h h1 = this.v;
    if (h1 != null) {
      h1.a();
      this.v = null;
    } 
  }
  
  public void b(CharSequence paramCharSequence) {
    this.e.setWindowTitle(paramCharSequence);
  }
  
  public void b(boolean paramBoolean) {
    if (paramBoolean == this.m)
      return; 
    this.m = paramBoolean;
    int j = this.n.size();
    for (int i = 0; i < j; i++)
      ((a.b)this.n.get(i)).a(paramBoolean); 
  }
  
  public void c() {}
  
  public void c(boolean paramBoolean) {
    if (!this.i)
      d(paramBoolean); 
  }
  
  public void d() {
    if (!this.s) {
      this.s = true;
      l(true);
    } 
  }
  
  public void d(boolean paramBoolean) {
    boolean bool;
    if (paramBoolean) {
      bool = true;
    } else {
      bool = false;
    } 
    a(bool, 4);
  }
  
  public void e(boolean paramBoolean) {
    this.w = paramBoolean;
    if (!paramBoolean) {
      h h1 = this.v;
      if (h1 != null)
        h1.a(); 
    } 
  }
  
  public void f(boolean paramBoolean) {
    if (paramBoolean) {
      p();
    } else {
      n();
    } 
    if (o()) {
      z z1;
      z z2;
      if (paramBoolean) {
        z2 = this.e.a(4, 100L);
        z1 = this.f.a(0, 200L);
      } else {
        z1 = this.e.a(0, 200L);
        z2 = this.f.a(8, 100L);
      } 
      h h1 = new h();
      h1.a(z2, z1);
      h1.c();
      return;
    } 
    if (paramBoolean) {
      this.e.setVisibility(4);
      this.f.setVisibility(0);
      return;
    } 
    this.e.setVisibility(0);
    this.f.setVisibility(8);
  }
  
  public boolean f() {
    d0 d01 = this.e;
    if (d01 != null && d01.j()) {
      this.e.collapseActionView();
      return true;
    } 
    return false;
  }
  
  public int g() {
    return this.e.k();
  }
  
  public void g(boolean paramBoolean) {
    h h1 = this.v;
    if (h1 != null)
      h1.a(); 
    if (this.p == 0 && (this.w || paramBoolean)) {
      this.d.setAlpha(1.0F);
      this.d.setTransitioning(true);
      h1 = new h();
      float f2 = -this.d.getHeight();
      float f1 = f2;
      if (paramBoolean) {
        int[] arrayOfInt = new int[2];
        arrayOfInt[0] = 0;
        arrayOfInt[1] = 0;
        this.d.getLocationInWindow(arrayOfInt);
        f1 = f2 - arrayOfInt[1];
      } 
      z z = v.a((View)this.d);
      z.b(f1);
      z.a(this.A);
      h1.a(z);
      if (this.q) {
        View view = this.g;
        if (view != null) {
          z z1 = v.a(view);
          z1.b(f1);
          h1.a(z1);
        } 
      } 
      h1.a(B);
      h1.a(250L);
      h1.a(this.y);
      this.v = h1;
      h1.c();
      return;
    } 
    this.y.b(null);
  }
  
  public Context h() {
    if (this.b == null) {
      TypedValue typedValue = new TypedValue();
      this.a.getTheme().resolveAttribute(b.a.a.actionBarWidgetTheme, typedValue, true);
      int i = typedValue.resourceId;
      if (i != 0) {
        this.b = (Context)new ContextThemeWrapper(this.a, i);
      } else {
        this.b = this.a;
      } 
    } 
    return this.b;
  }
  
  public void h(boolean paramBoolean) {
    h h1 = this.v;
    if (h1 != null)
      h1.a(); 
    this.d.setVisibility(0);
    if (this.p == 0 && (this.w || paramBoolean)) {
      this.d.setTranslationY(0.0F);
      float f2 = -this.d.getHeight();
      float f1 = f2;
      if (paramBoolean) {
        int[] arrayOfInt = new int[2];
        arrayOfInt[0] = 0;
        arrayOfInt[1] = 0;
        this.d.getLocationInWindow(arrayOfInt);
        f1 = f2 - arrayOfInt[1];
      } 
      this.d.setTranslationY(f1);
      h1 = new h();
      z z = v.a((View)this.d);
      z.b(0.0F);
      z.a(this.A);
      h1.a(z);
      if (this.q) {
        View view = this.g;
        if (view != null) {
          view.setTranslationY(f1);
          z z1 = v.a(this.g);
          z1.b(0.0F);
          h1.a(z1);
        } 
      } 
      h1.a(C);
      h1.a(250L);
      h1.a(this.z);
      this.v = h1;
      h1.c();
    } else {
      this.d.setAlpha(1.0F);
      this.d.setTranslationY(0.0F);
      if (this.q) {
        View view = this.g;
        if (view != null)
          view.setTranslationY(0.0F); 
      } 
      this.z.b(null);
    } 
    ActionBarOverlayLayout actionBarOverlayLayout = this.c;
    if (actionBarOverlayLayout != null)
      v.N((View)actionBarOverlayLayout); 
  }
  
  public void i(boolean paramBoolean) {
    if (!paramBoolean || this.c.i()) {
      this.x = paramBoolean;
      this.c.setHideOnContentScrollEnabled(paramBoolean);
      return;
    } 
    throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
  }
  
  public void j(boolean paramBoolean) {
    this.e.a(paramBoolean);
  }
  
  void l() {
    b.a.o.b.a a1 = this.l;
    if (a1 != null) {
      a1.a(this.k);
      this.k = null;
      this.l = null;
    } 
  }
  
  public int m() {
    return this.e.m();
  }
  
  class a extends b0 {
    a(n this$0) {}
    
    public void b(View param1View) {
      n n1 = this.a;
      if (n1.q) {
        View view = n1.g;
        if (view != null) {
          view.setTranslationY(0.0F);
          this.a.d.setTranslationY(0.0F);
        } 
      } 
      this.a.d.setVisibility(8);
      this.a.d.setTransitioning(false);
      n1 = this.a;
      n1.v = null;
      n1.l();
      ActionBarOverlayLayout actionBarOverlayLayout = this.a.c;
      if (actionBarOverlayLayout != null)
        v.N((View)actionBarOverlayLayout); 
    }
  }
  
  class b extends b0 {
    b(n this$0) {}
    
    public void b(View param1View) {
      n n1 = this.a;
      n1.v = null;
      n1.d.requestLayout();
    }
  }
  
  class c implements c0 {
    c(n this$0) {}
    
    public void a(View param1View) {
      ((View)this.a.d.getParent()).invalidate();
    }
  }
  
  public class d extends b.a.o.b implements g.a {
    private final Context e;
    
    private final g f;
    
    private b.a.o.b.a g;
    
    private WeakReference<View> h;
    
    public d(n this$0, Context param1Context, b.a.o.b.a param1a) {
      this.e = param1Context;
      this.g = param1a;
      g g1 = new g(param1Context);
      g1.c(1);
      this.f = g1;
      this.f.a(this);
    }
    
    public void a() {
      n n1 = this.i;
      if (n1.j != this)
        return; 
      if (!n.a(n1.r, n1.s, false)) {
        n1 = this.i;
        n1.k = this;
        n1.l = this.g;
      } else {
        this.g.a(this);
      } 
      this.g = null;
      this.i.f(false);
      this.i.f.a();
      this.i.e.h().sendAccessibilityEvent(32);
      n1 = this.i;
      n1.c.setHideOnContentScrollEnabled(n1.x);
      this.i.j = null;
    }
    
    public void a(int param1Int) {
      a(this.i.a.getResources().getString(param1Int));
    }
    
    public void a(View param1View) {
      this.i.f.setCustomView(param1View);
      this.h = new WeakReference<View>(param1View);
    }
    
    public void a(g param1g) {
      if (this.g == null)
        return; 
      i();
      this.i.f.d();
    }
    
    public void a(CharSequence param1CharSequence) {
      this.i.f.setSubtitle(param1CharSequence);
    }
    
    public void a(boolean param1Boolean) {
      super.a(param1Boolean);
      this.i.f.setTitleOptional(param1Boolean);
    }
    
    public boolean a(g param1g, MenuItem param1MenuItem) {
      b.a.o.b.a a1 = this.g;
      return (a1 != null) ? a1.a(this, param1MenuItem) : false;
    }
    
    public View b() {
      WeakReference<View> weakReference = this.h;
      return (weakReference != null) ? weakReference.get() : null;
    }
    
    public void b(int param1Int) {
      b(this.i.a.getResources().getString(param1Int));
    }
    
    public void b(CharSequence param1CharSequence) {
      this.i.f.setTitle(param1CharSequence);
    }
    
    public Menu c() {
      return (Menu)this.f;
    }
    
    public MenuInflater d() {
      return (MenuInflater)new g(this.e);
    }
    
    public CharSequence e() {
      return this.i.f.getSubtitle();
    }
    
    public CharSequence g() {
      return this.i.f.getTitle();
    }
    
    public void i() {
      if (this.i.j != this)
        return; 
      this.f.s();
      try {
        this.g.a(this, (Menu)this.f);
        return;
      } finally {
        this.f.r();
      } 
    }
    
    public boolean j() {
      return this.i.f.b();
    }
    
    public boolean k() {
      this.f.s();
      try {
        return this.g.b(this, (Menu)this.f);
      } finally {
        this.f.r();
      } 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/app/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */