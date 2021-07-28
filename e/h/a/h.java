package e.h.a;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

public class h extends b<h> {
  private boolean B;
  
  private boolean C;
  
  public h() {
    b(true);
  }
  
  private static boolean a(View paramView, MotionEvent paramMotionEvent) {
    return (paramView instanceof ViewGroup && ((ViewGroup)paramView).onInterceptTouchEvent(paramMotionEvent));
  }
  
  public boolean b(b paramb) {
    return this.C ^ true;
  }
  
  public h c(boolean paramBoolean) {
    this.C = paramBoolean;
    return this;
  }
  
  protected void c(MotionEvent paramMotionEvent) {
    View view = n();
    int i = l();
    if (paramMotionEvent.getActionMasked() == 1) {
      view.onTouchEvent(paramMotionEvent);
      if ((i == 0 || i == 2) && view.isPressed())
        a(); 
      d();
      return;
    } 
    if (i == 0 || i == 2) {
      if (this.B) {
        a(view, paramMotionEvent);
      } else {
        if (a(view, paramMotionEvent)) {
          view.onTouchEvent(paramMotionEvent);
          a();
          return;
        } 
        if (i != 2)
          b(); 
        return;
      } 
    } else {
      if (i == 4) {
        view.onTouchEvent(paramMotionEvent);
        return;
      } 
      return;
    } 
    view.onTouchEvent(paramMotionEvent);
    a();
  }
  
  public boolean c(b paramb) {
    boolean bool = paramb instanceof h;
    boolean bool1 = false;
    if (bool) {
      h h1 = (h)paramb;
      if (h1.l() == 4 && h1.C)
        return false; 
    } 
    int i = this.C ^ true;
    int j = l();
    int k = paramb.l();
    if (j == 4 && k == 4 && i != 0)
      return false; 
    bool = bool1;
    if (j == 4) {
      bool = bool1;
      if (i != 0)
        bool = true; 
    } 
    return bool;
  }
  
  public h d(boolean paramBoolean) {
    this.B = paramBoolean;
    return this;
  }
  
  public boolean d(b paramb) {
    return super.d(paramb);
  }
  
  protected void q() {
    long l = SystemClock.uptimeMillis();
    MotionEvent motionEvent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
    motionEvent.setAction(3);
    n().onTouchEvent(motionEvent);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/h/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */