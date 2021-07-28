package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.e1.a;

@SuppressLint({"ViewConstructor"})
class n extends b0 {
  private c0 K0;
  
  private c0 L0;
  
  private c0 M0;
  
  private c0 N0;
  
  public n(ReactContext paramReactContext) {
    super(paramReactContext);
  }
  
  Path c(Canvas paramCanvas, Paint paramPaint) {
    Path path = new Path();
    double d1 = c(this.K0);
    double d2 = a(this.L0);
    double d3 = c(this.M0);
    double d4 = a(this.N0);
    path.moveTo((float)d1, (float)d2);
    path.lineTo((float)d3, (float)d4);
    return path;
  }
  
  @a(name = "x1")
  public void setX1(Dynamic paramDynamic) {
    this.K0 = c0.b(paramDynamic);
    invalidate();
  }
  
  @a(name = "x2")
  public void setX2(Dynamic paramDynamic) {
    this.M0 = c0.b(paramDynamic);
    invalidate();
  }
  
  @a(name = "y1")
  public void setY1(Dynamic paramDynamic) {
    this.L0 = c0.b(paramDynamic);
    invalidate();
  }
  
  @a(name = "y2")
  public void setY2(Dynamic paramDynamic) {
    this.N0 = c0.b(paramDynamic);
    invalidate();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/horcrux/svg/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */