package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.l0;
import b.a.d;
import b.a.g;
import b.g.m.v;

final class r extends l implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, n, View.OnKeyListener {
  private static final int x = g.abc_popup_menu_item_layout;
  
  private final Context d;
  
  private final g e;
  
  private final f f;
  
  private final boolean g;
  
  private final int h;
  
  private final int i;
  
  private final int j;
  
  final l0 k;
  
  final ViewTreeObserver.OnGlobalLayoutListener l = new a(this);
  
  private final View.OnAttachStateChangeListener m = new b(this);
  
  private PopupWindow.OnDismissListener n;
  
  private View o;
  
  View p;
  
  private n.a q;
  
  ViewTreeObserver r;
  
  private boolean s;
  
  private boolean t;
  
  private int u;
  
  private int v = 0;
  
  private boolean w;
  
  public r(Context paramContext, g paramg, View paramView, int paramInt1, int paramInt2, boolean paramBoolean) {
    this.d = paramContext;
    this.e = paramg;
    this.g = paramBoolean;
    this.f = new f(paramg, LayoutInflater.from(paramContext), this.g, x);
    this.i = paramInt1;
    this.j = paramInt2;
    Resources resources = paramContext.getResources();
    this.h = Math.max((resources.getDisplayMetrics()).widthPixels / 2, resources.getDimensionPixelSize(d.abc_config_prefDialogWidth));
    this.o = paramView;
    this.k = new l0(this.d, null, this.i, this.j);
    paramg.a(this, paramContext);
  }
  
  private boolean g() {
    if (b())
      return true; 
    if (!this.s) {
      boolean bool;
      View view = this.o;
      if (view == null)
        return false; 
      this.p = view;
      this.k.a(this);
      this.k.a(this);
      this.k.a(true);
      view = this.p;
      if (this.r == null) {
        bool = true;
      } else {
        bool = false;
      } 
      this.r = view.getViewTreeObserver();
      if (bool)
        this.r.addOnGlobalLayoutListener(this.l); 
      view.addOnAttachStateChangeListener(this.m);
      this.k.a(view);
      this.k.f(this.v);
      if (!this.t) {
        this.u = l.a((ListAdapter)this.f, null, this.d, this.h);
        this.t = true;
      } 
      this.k.e(this.u);
      this.k.g(2);
      this.k.a(f());
      this.k.c();
      ListView listView = this.k.e();
      listView.setOnKeyListener(this);
      if (this.w && this.e.h() != null) {
        FrameLayout frameLayout = (FrameLayout)LayoutInflater.from(this.d).inflate(g.abc_popup_menu_header_item_layout, (ViewGroup)listView, false);
        TextView textView = (TextView)frameLayout.findViewById(16908310);
        if (textView != null)
          textView.setText(this.e.h()); 
        frameLayout.setEnabled(false);
        listView.addHeaderView((View)frameLayout, null, false);
      } 
      this.k.a((ListAdapter)this.f);
      this.k.c();
      return true;
    } 
    return false;
  }
  
  public void a(int paramInt) {
    this.v = paramInt;
  }
  
  public void a(View paramView) {
    this.o = paramView;
  }
  
  public void a(PopupWindow.OnDismissListener paramOnDismissListener) {
    this.n = paramOnDismissListener;
  }
  
  public void a(g paramg) {}
  
  public void a(g paramg, boolean paramBoolean) {
    if (paramg != this.e)
      return; 
    dismiss();
    n.a a1 = this.q;
    if (a1 != null)
      a1.a(paramg, paramBoolean); 
  }
  
  public void a(n.a parama) {
    this.q = parama;
  }
  
  public void a(boolean paramBoolean) {
    this.t = false;
    f f1 = this.f;
    if (f1 != null)
      f1.notifyDataSetChanged(); 
  }
  
  public boolean a() {
    return false;
  }
  
  public boolean a(s params) {
    if (params.hasVisibleItems()) {
      m m = new m(this.d, params, this.p, this.g, this.i, this.j);
      m.a(this.q);
      m.a(l.b(params));
      m.a(this.n);
      this.n = null;
      this.e.a(false);
      int j = this.k.a();
      int k = this.k.f();
      int i = j;
      if ((Gravity.getAbsoluteGravity(this.v, v.p(this.o)) & 0x7) == 5)
        i = j + this.o.getWidth(); 
      if (m.a(i, k)) {
        n.a a1 = this.q;
        if (a1 != null)
          a1.a(params); 
        return true;
      } 
    } 
    return false;
  }
  
  public void b(int paramInt) {
    this.k.c(paramInt);
  }
  
  public void b(boolean paramBoolean) {
    this.f.a(paramBoolean);
  }
  
  public boolean b() {
    return (!this.s && this.k.b());
  }
  
  public void c() {
    if (g())
      return; 
    throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
  }
  
  public void c(int paramInt) {
    this.k.a(paramInt);
  }
  
  public void c(boolean paramBoolean) {
    this.w = paramBoolean;
  }
  
  public void dismiss() {
    if (b())
      this.k.dismiss(); 
  }
  
  public ListView e() {
    return this.k.e();
  }
  
  public void onDismiss() {
    this.s = true;
    this.e.close();
    ViewTreeObserver viewTreeObserver = this.r;
    if (viewTreeObserver != null) {
      if (!viewTreeObserver.isAlive())
        this.r = this.p.getViewTreeObserver(); 
      this.r.removeGlobalOnLayoutListener(this.l);
      this.r = null;
    } 
    this.p.removeOnAttachStateChangeListener(this.m);
    PopupWindow.OnDismissListener onDismissListener = this.n;
    if (onDismissListener != null)
      onDismissListener.onDismiss(); 
  }
  
  public boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent) {
    if (paramKeyEvent.getAction() == 1 && paramInt == 82) {
      dismiss();
      return true;
    } 
    return false;
  }
  
  class a implements ViewTreeObserver.OnGlobalLayoutListener {
    a(r this$0) {}
    
    public void onGlobalLayout() {
      if (this.c.b() && !this.c.k.l()) {
        View view = this.c.p;
        if (view == null || !view.isShown()) {
          this.c.dismiss();
          return;
        } 
        this.c.k.c();
        return;
      } 
    }
  }
  
  class b implements View.OnAttachStateChangeListener {
    b(r this$0) {}
    
    public void onViewAttachedToWindow(View param1View) {}
    
    public void onViewDetachedFromWindow(View param1View) {
      ViewTreeObserver viewTreeObserver = this.c.r;
      if (viewTreeObserver != null) {
        if (!viewTreeObserver.isAlive())
          this.c.r = param1View.getViewTreeObserver(); 
        r r1 = this.c;
        r1.r.removeGlobalOnLayoutListener(r1.l);
      } 
      param1View.removeOnAttachStateChangeListener(this);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/view/menu/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */