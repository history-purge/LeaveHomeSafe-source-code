package com.swmansion.gesturehandler.react;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.views.view.f;
import e.e.m.a.a;

public class h extends f {
  private boolean u;
  
  private g v;
  
  public h(Context paramContext) {
    super(paramContext);
  }
  
  private static boolean a(ViewGroup paramViewGroup) {
    UiThreadUtil.assertOnUiThread();
    for (ViewParent viewParent = paramViewGroup.getParent(); viewParent != null; viewParent = viewParent.getParent()) {
      if (viewParent instanceof a || viewParent instanceof h)
        return true; 
    } 
    return false;
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent) {
    if (this.u) {
      g g1 = this.v;
      a.a(g1);
      if (g1.a(paramMotionEvent))
        return true; 
    } 
    return super.dispatchTouchEvent(paramMotionEvent);
  }
  
  public void e() {
    g g1 = this.v;
    if (g1 != null)
      g1.b(); 
  }
  
  protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    this.u = a((ViewGroup)this) ^ true;
    if (!this.u)
      Log.i("ReactNative", "[GESTURE HANDLER] Gesture handler is already enabled for a parent view"); 
    if (this.u && this.v == null)
      this.v = new g((ReactContext)getContext(), (ViewGroup)this); 
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean) {
    if (this.u) {
      g g1 = this.v;
      a.a(g1);
      g1.a(paramBoolean);
    } 
    super.requestDisallowInterceptTouchEvent(paramBoolean);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/swmansion/gesturehandler/react/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */