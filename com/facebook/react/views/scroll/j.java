package com.facebook.react.views.scroll;

import android.view.MotionEvent;
import android.view.VelocityTracker;

public class j {
  private VelocityTracker a;
  
  private float b;
  
  private float c;
  
  public float a() {
    return this.b;
  }
  
  public void a(MotionEvent paramMotionEvent) {
    int i = paramMotionEvent.getAction() & 0xFF;
    if (this.a == null)
      this.a = VelocityTracker.obtain(); 
    this.a.addMovement(paramMotionEvent);
    if (i != 1 && i != 3)
      return; 
    this.a.computeCurrentVelocity(1);
    this.b = this.a.getXVelocity();
    this.c = this.a.getYVelocity();
    VelocityTracker velocityTracker = this.a;
    if (velocityTracker != null) {
      velocityTracker.recycle();
      this.a = null;
    } 
  }
  
  public float b() {
    return this.c;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/scroll/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */