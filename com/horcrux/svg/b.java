package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.e1.a;

@SuppressLint({"ViewConstructor"})
class b extends b0 {
  private c0 K0;
  
  private c0 L0;
  
  private c0 M0;
  
  public b(ReactContext paramReactContext) {
    super(paramReactContext);
  }
  
  Path c(Canvas paramCanvas, Paint paramPaint) {
    Path path = new Path();
    double d1 = c(this.K0);
    double d2 = a(this.L0);
    double d3 = b(this.M0);
    path.addCircle((float)d1, (float)d2, (float)d3, Path.Direction.CW);
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
  
  @a(name = "r")
  public void setR(Dynamic paramDynamic) {
    this.M0 = c0.b(paramDynamic);
    invalidate();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/horcrux/svg/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */