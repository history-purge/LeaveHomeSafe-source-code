package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.e1.a;

@SuppressLint({"ViewConstructor"})
class g extends b0 {
  private c0 K0;
  
  private c0 L0;
  
  private c0 M0;
  
  private c0 N0;
  
  public g(ReactContext paramReactContext) {
    super(paramReactContext);
  }
  
  Path c(Canvas paramCanvas, Paint paramPaint) {
    Path path = new Path();
    double d1 = c(this.K0);
    double d2 = a(this.L0);
    double d3 = c(this.M0);
    double d4 = a(this.N0);
    path.addOval(new RectF((float)(d1 - d3), (float)(d2 - d4), (float)(d1 + d3), (float)(d2 + d4)), Path.Direction.CW);
    return path;
  }
  
  @a(name = "cx")
  public void setCx(Dynamic paramDynamic) {
    this.K0 = c0.b(paramDynamic);
    invalidate();
  }
  
  @a(name = "cy")
  public void setCy(Dynamic paramDynamic) {
    this.L0 = c0.b(paramDynamic);
    invalidate();
  }
  
  @a(name = "rx")
  public void setRx(Dynamic paramDynamic) {
    this.M0 = c0.b(paramDynamic);
    invalidate();
  }
  
  @a(name = "ry")
  public void setRy(Dynamic paramDynamic) {
    this.N0 = c0.b(paramDynamic);
    invalidate();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/horcrux/svg/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */