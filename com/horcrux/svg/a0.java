package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.e1.a;

@SuppressLint({"ViewConstructor"})
class a0 extends b0 {
  private c0 K0;
  
  private c0 L0;
  
  private c0 M0;
  
  private c0 N0;
  
  private c0 O0;
  
  private c0 P0;
  
  public a0(ReactContext paramReactContext) {
    super(paramReactContext);
  }
  
  Path c(Canvas paramCanvas, Paint paramPaint) {
    double d1;
    Path path = new Path();
    double d4 = c(this.K0);
    double d5 = a(this.L0);
    double d6 = c(this.M0);
    double d7 = a(this.N0);
    if (this.O0 != null || this.P0 != null) {
      c0 c01 = this.O0;
      if (c01 == null) {
        d8 = a(this.P0);
      } else if (this.P0 == null) {
        d8 = c(c01);
      } else {
        double d10 = c(c01);
        d8 = a(this.P0);
        double d12 = d6 / 2.0D;
        double d11 = d10;
      } 
      double d9 = d8;
      d1 = d8;
      double d8 = d9;
    } else {
      path.addRect((float)d4, (float)d5, (float)(d4 + d6), (float)(d5 + d7), Path.Direction.CW);
      path.close();
      return path;
    } 
    double d3 = d6 / 2.0D;
    double d2 = d1;
  }
  
  @a(name = "height")
  public void setHeight(Dynamic paramDynamic) {
    this.N0 = c0.b(paramDynamic);
    invalidate();
  }
  
  @a(name = "rx")
  public void setRx(Dynamic paramDynamic) {
    this.O0 = c0.b(paramDynamic);
    invalidate();
  }
  
  @a(name = "ry")
  public void setRy(Dynamic paramDynamic) {
    this.P0 = c0.b(paramDynamic);
    invalidate();
  }
  
  @a(name = "width")
  public void setWidth(Dynamic paramDynamic) {
    this.M0 = c0.b(paramDynamic);
    invalidate();
  }
  
  @a(name = "x")
  public void setX(Dynamic paramDynamic) {
    this.K0 = c0.b(paramDynamic);
    invalidate();
  }
  
  @a(name = "y")
  public void setY(Dynamic paramDynamic) {
    this.L0 = c0.b(paramDynamic);
    invalidate();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/horcrux/svg/a0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */