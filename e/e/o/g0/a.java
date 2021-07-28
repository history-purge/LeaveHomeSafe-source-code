package e.e.o.g0;

import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;

public class a implements b {
  private volatile int a = -1;
  
  private ViewParent b;
  
  private void b() {
    ViewParent viewParent = this.b;
    if (viewParent != null) {
      viewParent.requestDisallowInterceptTouchEvent(false);
      this.b = null;
    } 
  }
  
  public void a() {
    this.a = -1;
    b();
  }
  
  public void a(int paramInt, ViewParent paramViewParent) {
    this.a = paramInt;
    b();
    if (paramViewParent != null) {
      paramViewParent.requestDisallowInterceptTouchEvent(true);
      this.b = paramViewParent;
    } 
  }
  
  public boolean a(ViewGroup paramViewGroup, MotionEvent paramMotionEvent) {
    int i = this.a;
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (i != -1) {
      bool1 = bool2;
      if (paramMotionEvent.getAction() != 1) {
        bool1 = bool2;
        if (paramViewGroup.getId() == i)
          bool1 = true; 
      } 
    } 
    return bool1;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/o/g0/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */