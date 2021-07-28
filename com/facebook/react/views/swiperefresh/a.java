package com.facebook.react.views.swiperefresh;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import b.p.a.c;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.f;
import com.facebook.react.uimanager.q;

public class a extends c {
  private boolean S = false;
  
  private boolean T = false;
  
  private float U = 0.0F;
  
  private int V;
  
  private float W;
  
  private boolean a0;
  
  public a(ReactContext paramReactContext) {
    super((Context)paramReactContext);
    this.V = ViewConfiguration.get((Context)paramReactContext).getScaledTouchSlop();
  }
  
  private boolean a(MotionEvent paramMotionEvent) {
    int i = paramMotionEvent.getAction();
    if (i != 0) {
      if (i != 2)
        return true; 
      float f = Math.abs(paramMotionEvent.getX() - this.W);
      if (this.a0 || f > this.V) {
        this.a0 = true;
        return false;
      } 
    } else {
      this.W = paramMotionEvent.getX();
      this.a0 = false;
    } 
    return true;
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent) {
    if (a(paramMotionEvent) && super.onInterceptTouchEvent(paramMotionEvent)) {
      f.a((View)this, paramMotionEvent);
      if (getParent() != null)
        getParent().requestDisallowInterceptTouchEvent(true); 
      return true;
    } 
    return false;
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (!this.S) {
      this.S = true;
      setProgressViewOffset(this.U);
      setRefreshing(this.T);
    } 
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean) {
    if (getParent() != null)
      getParent().requestDisallowInterceptTouchEvent(paramBoolean); 
  }
  
  public void setProgressViewOffset(float paramFloat) {
    this.U = paramFloat;
    if (this.S) {
      int i = getProgressCircleDiameter();
      a(false, Math.round(q.b(paramFloat)) - i, Math.round(q.b(paramFloat + 64.0F) - i));
    } 
  }
  
  public void setRefreshing(boolean paramBoolean) {
    this.T = paramBoolean;
    if (this.S)
      super.setRefreshing(paramBoolean); 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/swiperefresh/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */