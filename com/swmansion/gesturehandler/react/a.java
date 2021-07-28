package com.swmansion.gesturehandler.react;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ViewGroup;
import e.e.o.r;
import e.e.o.y;

public class a extends y {
  private r u;
  
  private g v;
  
  public void a(r paramr, String paramString, Bundle paramBundle) {
    super.a(paramr, paramString, paramBundle);
    this.u = paramr;
  }
  
  public void d() {
    if (this.v == null) {
      this.v = new g(this.u.b(), (ViewGroup)this);
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("GestureHandler already initialized for root view ");
    stringBuilder.append(this);
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent) {
    g g1 = this.v;
    return (g1 != null && g1.a(paramMotionEvent)) ? true : super.dispatchTouchEvent(paramMotionEvent);
  }
  
  public void e() {
    g g1 = this.v;
    if (g1 != null) {
      g1.b();
      this.v = null;
    } 
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean) {
    g g1 = this.v;
    if (g1 != null)
      g1.a(paramBoolean); 
    super.requestDisallowInterceptTouchEvent(paramBoolean);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/swmansion/gesturehandler/react/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */