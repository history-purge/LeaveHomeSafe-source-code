package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import b.g.m.v;
import b.g.m.w;

class a1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
  private static a1 l;
  
  private static a1 m;
  
  private final View c;
  
  private final CharSequence d;
  
  private final int e;
  
  private final Runnable f = new a(this);
  
  private final Runnable g = new b(this);
  
  private int h;
  
  private int i;
  
  private b1 j;
  
  private boolean k;
  
  private a1(View paramView, CharSequence paramCharSequence) {
    this.c = paramView;
    this.d = paramCharSequence;
    this.e = w.a(ViewConfiguration.get(this.c.getContext()));
    c();
    this.c.setOnLongClickListener(this);
    this.c.setOnHoverListener(this);
  }
  
  public static void a(View paramView, CharSequence paramCharSequence) {
    a1 a11;
    a1 a12 = l;
    if (a12 != null && a12.c == paramView)
      a((a1)null); 
    if (TextUtils.isEmpty(paramCharSequence)) {
      a11 = m;
      if (a11 != null && a11.c == paramView)
        a11.a(); 
      paramView.setOnLongClickListener(null);
      paramView.setLongClickable(false);
      paramView.setOnHoverListener(null);
      return;
    } 
    new a1(paramView, (CharSequence)a11);
  }
  
  private static void a(a1 parama1) {
    a1 a11 = l;
    if (a11 != null)
      a11.b(); 
    l = parama1;
    parama1 = l;
    if (parama1 != null)
      parama1.d(); 
  }
  
  private boolean a(MotionEvent paramMotionEvent) {
    int i = (int)paramMotionEvent.getX();
    int j = (int)paramMotionEvent.getY();
    if (Math.abs(i - this.h) <= this.e && Math.abs(j - this.i) <= this.e)
      return false; 
    this.h = i;
    this.i = j;
    return true;
  }
  
  private void b() {
    this.c.removeCallbacks(this.f);
  }
  
  private void c() {
    this.h = Integer.MAX_VALUE;
    this.i = Integer.MAX_VALUE;
  }
  
  private void d() {
    this.c.postDelayed(this.f, ViewConfiguration.getLongPressTimeout());
  }
  
  void a() {
    if (m == this) {
      m = null;
      b1 b11 = this.j;
      if (b11 != null) {
        b11.a();
        this.j = null;
        c();
        this.c.removeOnAttachStateChangeListener(this);
      } else {
        Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
      } 
    } 
    if (l == this)
      a((a1)null); 
    this.c.removeCallbacks(this.g);
  }
  
  void a(boolean paramBoolean) {
    long l;
    if (!v.G(this.c))
      return; 
    a((a1)null);
    a1 a11 = m;
    if (a11 != null)
      a11.a(); 
    m = this;
    this.k = paramBoolean;
    this.j = new b1(this.c.getContext());
    this.j.a(this.c, this.h, this.i, this.k, this.d);
    this.c.addOnAttachStateChangeListener(this);
    if (this.k) {
      l = 2500L;
    } else {
      if ((v.z(this.c) & 0x1) == 1) {
        l = 3000L;
      } else {
        l = 15000L;
      } 
      l -= ViewConfiguration.getLongPressTimeout();
    } 
    this.c.removeCallbacks(this.g);
    this.c.postDelayed(this.g, l);
  }
  
  public boolean onHover(View paramView, MotionEvent paramMotionEvent) {
    if (this.j != null && this.k)
      return false; 
    AccessibilityManager accessibilityManager = (AccessibilityManager)this.c.getContext().getSystemService("accessibility");
    if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled())
      return false; 
    int i = paramMotionEvent.getAction();
    if (i != 7) {
      if (i != 10)
        return false; 
      c();
      a();
      return false;
    } 
    if (this.c.isEnabled() && this.j == null && a(paramMotionEvent))
      a(this); 
    return false;
  }
  
  public boolean onLongClick(View paramView) {
    this.h = paramView.getWidth() / 2;
    this.i = paramView.getHeight() / 2;
    a(true);
    return true;
  }
  
  public void onViewAttachedToWindow(View paramView) {}
  
  public void onViewDetachedFromWindow(View paramView) {
    a();
  }
  
  class a implements Runnable {
    a(a1 this$0) {}
    
    public void run() {
      this.c.a(false);
    }
  }
  
  class b implements Runnable {
    b(a1 this$0) {}
    
    public void run() {
      this.c.a();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/widget/a1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */