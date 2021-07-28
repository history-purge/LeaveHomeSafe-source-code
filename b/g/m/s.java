package b.g.m;

import android.view.View;
import android.view.ViewTreeObserver;

public final class s implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
  private final View c;
  
  private ViewTreeObserver d;
  
  private final Runnable e;
  
  private s(View paramView, Runnable paramRunnable) {
    this.c = paramView;
    this.d = paramView.getViewTreeObserver();
    this.e = paramRunnable;
  }
  
  public static s a(View paramView, Runnable paramRunnable) {
    if (paramView != null) {
      if (paramRunnable != null) {
        s s1 = new s(paramView, paramRunnable);
        paramView.getViewTreeObserver().addOnPreDrawListener(s1);
        paramView.addOnAttachStateChangeListener(s1);
        return s1;
      } 
      throw new NullPointerException("runnable == null");
    } 
    throw new NullPointerException("view == null");
  }
  
  public void a() {
    ViewTreeObserver viewTreeObserver;
    if (this.d.isAlive()) {
      viewTreeObserver = this.d;
    } else {
      viewTreeObserver = this.c.getViewTreeObserver();
    } 
    viewTreeObserver.removeOnPreDrawListener(this);
    this.c.removeOnAttachStateChangeListener(this);
  }
  
  public boolean onPreDraw() {
    a();
    this.e.run();
    return true;
  }
  
  public void onViewAttachedToWindow(View paramView) {
    this.d = paramView.getViewTreeObserver();
  }
  
  public void onViewDetachedFromWindow(View paramView) {
    a();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/g/m/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */