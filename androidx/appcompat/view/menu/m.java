package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import b.a.d;
import b.g.m.d;
import b.g.m.v;

public class m implements i {
  private final Context a;
  
  private final g b;
  
  private final boolean c;
  
  private final int d;
  
  private final int e;
  
  private View f;
  
  private int g = 8388611;
  
  private boolean h;
  
  private n.a i;
  
  private l j;
  
  private PopupWindow.OnDismissListener k;
  
  private final PopupWindow.OnDismissListener l = new a(this);
  
  public m(Context paramContext, g paramg, View paramView, boolean paramBoolean, int paramInt) {
    this(paramContext, paramg, paramView, paramBoolean, paramInt, 0);
  }
  
  public m(Context paramContext, g paramg, View paramView, boolean paramBoolean, int paramInt1, int paramInt2) {
    this.a = paramContext;
    this.b = paramg;
    this.f = paramView;
    this.c = paramBoolean;
    this.d = paramInt1;
    this.e = paramInt2;
  }
  
  private void a(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2) {
    l l1 = b();
    l1.c(paramBoolean2);
    if (paramBoolean1) {
      int j = paramInt1;
      if ((d.a(this.g, v.p(this.f)) & 0x7) == 5)
        j = paramInt1 - this.f.getWidth(); 
      l1.b(j);
      l1.c(paramInt2);
      paramInt1 = (int)((this.a.getResources().getDisplayMetrics()).density * 48.0F / 2.0F);
      l1.a(new Rect(j - paramInt1, paramInt2 - paramInt1, j + paramInt1, paramInt2 + paramInt1));
    } 
    l1.c();
  }
  
  private l g() {
    boolean bool;
    r r;
    Display display = ((WindowManager)this.a.getSystemService("window")).getDefaultDisplay();
    Point point = new Point();
    if (Build.VERSION.SDK_INT >= 17) {
      display.getRealSize(point);
    } else {
      display.getSize(point);
    } 
    if (Math.min(point.x, point.y) >= this.a.getResources().getDimensionPixelSize(d.abc_cascading_menus_min_smallest_width)) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool) {
      d d = new d(this.a, this.f, this.d, this.e, this.c);
    } else {
      r = new r(this.a, this.b, this.f, this.d, this.e, this.c);
    } 
    r.a(this.b);
    r.a(this.l);
    r.a(this.f);
    r.a(this.i);
    r.b(this.h);
    r.a(this.g);
    return r;
  }
  
  public void a() {
    if (c())
      this.j.dismiss(); 
  }
  
  public void a(int paramInt) {
    this.g = paramInt;
  }
  
  public void a(View paramView) {
    this.f = paramView;
  }
  
  public void a(PopupWindow.OnDismissListener paramOnDismissListener) {
    this.k = paramOnDismissListener;
  }
  
  public void a(n.a parama) {
    this.i = parama;
    l l1 = this.j;
    if (l1 != null)
      l1.a(parama); 
  }
  
  public void a(boolean paramBoolean) {
    this.h = paramBoolean;
    l l1 = this.j;
    if (l1 != null)
      l1.b(paramBoolean); 
  }
  
  public boolean a(int paramInt1, int paramInt2) {
    if (c())
      return true; 
    if (this.f == null)
      return false; 
    a(paramInt1, paramInt2, true, true);
    return true;
  }
  
  public l b() {
    if (this.j == null)
      this.j = g(); 
    return this.j;
  }
  
  public boolean c() {
    l l1 = this.j;
    return (l1 != null && l1.b());
  }
  
  protected void d() {
    this.j = null;
    PopupWindow.OnDismissListener onDismissListener = this.k;
    if (onDismissListener != null)
      onDismissListener.onDismiss(); 
  }
  
  public void e() {
    if (f())
      return; 
    throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
  }
  
  public boolean f() {
    if (c())
      return true; 
    if (this.f == null)
      return false; 
    a(0, 0, false, false);
    return true;
  }
  
  class a implements PopupWindow.OnDismissListener {
    a(m this$0) {}
    
    public void onDismiss() {
      this.c.d();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/view/menu/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */