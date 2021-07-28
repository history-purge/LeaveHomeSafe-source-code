package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.e1.a;

@SuppressLint({"ViewConstructor"})
class i0 extends u0 {
  private String X0;
  
  private s0 Y0;
  
  private r0 Z0;
  
  private c0 a1;
  
  public i0(ReactContext paramReactContext) {
    super(paramReactContext);
    q0 q0 = q0.c;
    t0 t0 = t0.d;
  }
  
  void a(Canvas paramCanvas, Paint paramPaint, float paramFloat) {
    d(paramCanvas, paramPaint, paramFloat);
  }
  
  Path c(Canvas paramCanvas, Paint paramPaint) {
    return d(paramCanvas, paramPaint);
  }
  
  Path e(Canvas paramCanvas, Paint paramPaint) {
    x0 x0 = getSvgView().e(this.X0);
    return !(x0 instanceof b0) ? null : ((b0)x0).c(paramCanvas, paramPaint);
  }
  
  void m() {}
  
  void n() {}
  
  r0 s() {
    return this.Z0;
  }
  
  @a(name = "href")
  public void setHref(String paramString) {
    this.X0 = paramString;
    invalidate();
  }
  
  @a(name = "method")
  public void setMethod(String paramString) {
    q0.valueOf(paramString);
    invalidate();
  }
  
  @a(name = "midLine")
  public void setSharp(String paramString) {
    this.Z0 = r0.valueOf(paramString);
    invalidate();
  }
  
  @a(name = "side")
  public void setSide(String paramString) {
    this.Y0 = s0.valueOf(paramString);
    invalidate();
  }
  
  @a(name = "spacing")
  public void setSpacing(String paramString) {
    t0.valueOf(paramString);
    invalidate();
  }
  
  @a(name = "startOffset")
  public void setStartOffset(Dynamic paramDynamic) {
    this.a1 = c0.b(paramDynamic);
    invalidate();
  }
  
  s0 t() {
    return this.Y0;
  }
  
  c0 u() {
    return this.a1;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/horcrux/svg/i0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */