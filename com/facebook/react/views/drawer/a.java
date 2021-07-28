package com.facebook.react.views.drawer;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import b.j.a.a;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.f;

class a extends a {
  private int Q = 8388611;
  
  private int R = -1;
  
  public a(ReactContext paramReactContext) {
    super((Context)paramReactContext);
  }
  
  void e() {
    a(this.Q);
  }
  
  void f() {
    e(this.Q);
  }
  
  void g() {
    if (getChildCount() == 2) {
      View view = getChildAt(1);
      a.e e = (a.e)view.getLayoutParams();
      e.a = this.Q;
      ((ViewGroup.MarginLayoutParams)e).width = this.R;
      view.setLayoutParams((ViewGroup.LayoutParams)e);
      view.setClickable(true);
    } 
  }
  
  void g(int paramInt) {
    this.Q = paramInt;
    g();
  }
  
  void h(int paramInt) {
    this.R = paramInt;
    g();
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent) {
    try {
      if (super.onInterceptTouchEvent(paramMotionEvent)) {
        f.a((View)this, paramMotionEvent);
        return true;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      e.e.e.e.a.c("ReactNative", "Error intercepting touch event.", illegalArgumentException);
    } 
    return false;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/drawer/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */