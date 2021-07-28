package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.appcompat.view.menu.q;

public abstract class h0 implements View.OnTouchListener, View.OnAttachStateChangeListener {
  private final float c;
  
  private final int d;
  
  private final int e;
  
  final View f;
  
  private Runnable g;
  
  private Runnable h;
  
  private boolean i;
  
  private int j;
  
  private final int[] k = new int[2];
  
  public h0(View paramView) {
    this.f = paramView;
    paramView.setLongClickable(true);
    paramView.addOnAttachStateChangeListener(this);
    this.c = ViewConfiguration.get(paramView.getContext()).getScaledTouchSlop();
    this.d = ViewConfiguration.getTapTimeout();
    this.e = (this.d + ViewConfiguration.getLongPressTimeout()) / 2;
  }
  
  private boolean a(MotionEvent paramMotionEvent) {
    View view = this.f;
    q q = a();
    if (q != null) {
      if (!q.b())
        return false; 
      f0 f0 = (f0)q.e();
      if (f0 != null) {
        if (!f0.isShown())
          return false; 
        MotionEvent motionEvent = MotionEvent.obtainNoHistory(paramMotionEvent);
        a(view, motionEvent);
        b((View)f0, motionEvent);
        boolean bool = f0.a(motionEvent, this.j);
        motionEvent.recycle();
        int i = paramMotionEvent.getActionMasked();
        if (i != 1 && i != 3) {
          i = 1;
        } else {
          i = 0;
        } 
        return (bool && i != 0);
      } 
    } 
    return false;
  }
  
  private static boolean a(View paramView, float paramFloat1, float paramFloat2, float paramFloat3) {
    float f = -paramFloat3;
    return (paramFloat1 >= f && paramFloat2 >= f && paramFloat1 < (paramView.getRight() - paramView.getLeft()) + paramFloat3 && paramFloat2 < (paramView.getBottom() - paramView.getTop()) + paramFloat3);
  }
  
  private boolean a(View paramView, MotionEvent paramMotionEvent) {
    int[] arrayOfInt = this.k;
    paramView.getLocationOnScreen(arrayOfInt);
    paramMotionEvent.offsetLocation(arrayOfInt[0], arrayOfInt[1]);
    return true;
  }
  
  private boolean b(MotionEvent paramMotionEvent) {
    View view = this.f;
    if (!view.isEnabled())
      return false; 
    int i = paramMotionEvent.getActionMasked();
    if (i != 0) {
      if (i != 1)
        if (i != 2) {
          if (i != 3)
            return false; 
        } else {
          i = paramMotionEvent.findPointerIndex(this.j);
          if (i >= 0 && !a(view, paramMotionEvent.getX(i), paramMotionEvent.getY(i), this.c)) {
            e();
            view.getParent().requestDisallowInterceptTouchEvent(true);
            return true;
          } 
          return false;
        }  
      e();
      return false;
    } 
    this.j = paramMotionEvent.getPointerId(0);
    if (this.g == null)
      this.g = new a(this); 
    view.postDelayed(this.g, this.d);
    if (this.h == null)
      this.h = new b(this); 
    view.postDelayed(this.h, this.e);
    return false;
  }
  
  private boolean b(View paramView, MotionEvent paramMotionEvent) {
    int[] arrayOfInt = this.k;
    paramView.getLocationOnScreen(arrayOfInt);
    paramMotionEvent.offsetLocation(-arrayOfInt[0], -arrayOfInt[1]);
    return true;
  }
  
  private void e() {
    Runnable runnable = this.h;
    if (runnable != null)
      this.f.removeCallbacks(runnable); 
    runnable = this.g;
    if (runnable != null)
      this.f.removeCallbacks(runnable); 
  }
  
  public abstract q a();
  
  protected abstract boolean b();
  
  protected boolean c() {
    q q = a();
    if (q != null && q.b())
      q.dismiss(); 
    return true;
  }
  
  void d() {
    e();
    View view = this.f;
    if (view.isEnabled()) {
      if (view.isLongClickable())
        return; 
      if (!b())
        return; 
      view.getParent().requestDisallowInterceptTouchEvent(true);
      long l = SystemClock.uptimeMillis();
      MotionEvent motionEvent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
      view.onTouchEvent(motionEvent);
      motionEvent.recycle();
      this.i = true;
    } 
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent) {
    boolean bool1;
    boolean bool = this.i;
    boolean bool3 = true;
    if (bool) {
      if (a(paramMotionEvent) || !c()) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
    } else {
      boolean bool4;
      if (b(paramMotionEvent) && b()) {
        bool4 = true;
      } else {
        bool4 = false;
      } 
      bool1 = bool4;
      if (bool4) {
        long l = SystemClock.uptimeMillis();
        MotionEvent motionEvent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
        this.f.onTouchEvent(motionEvent);
        motionEvent.recycle();
        bool1 = bool4;
      } 
    } 
    this.i = bool1;
    boolean bool2 = bool3;
    if (!bool1) {
      if (bool)
        return true; 
      bool2 = false;
    } 
    return bool2;
  }
  
  public void onViewAttachedToWindow(View paramView) {}
  
  public void onViewDetachedFromWindow(View paramView) {
    this.i = false;
    this.j = -1;
    Runnable runnable = this.g;
    if (runnable != null)
      this.f.removeCallbacks(runnable); 
  }
  
  private class a implements Runnable {
    a(h0 this$0) {}
    
    public void run() {
      ViewParent viewParent = this.c.f.getParent();
      if (viewParent != null)
        viewParent.requestDisallowInterceptTouchEvent(true); 
    }
  }
  
  private class b implements Runnable {
    b(h0 this$0) {}
    
    public void run() {
      this.c.d();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/widget/h0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */