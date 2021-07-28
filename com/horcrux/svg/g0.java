package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.e1.a;

@SuppressLint({"ViewConstructor"})
class g0 extends l {
  private float M0;
  
  private float N0;
  
  private float O0;
  
  private float P0;
  
  private String Q0;
  
  private int R0;
  
  public g0(ReactContext paramReactContext) {
    super(paramReactContext);
  }
  
  void a(Canvas paramCanvas, Paint paramPaint, float paramFloat) {
    h();
  }
  
  void a(Canvas paramCanvas, Paint paramPaint, float paramFloat1, float paramFloat2, float paramFloat3) {
    if (this.Q0 != null) {
      float f1 = this.M0;
      float f2 = this.L;
      float f3 = this.N0;
      paramCanvas.concat(w0.a(new RectF(f1 * f2, f3 * f2, (f1 + this.O0) * f2, (f3 + this.P0) * f2), new RectF(0.0F, 0.0F, paramFloat2, paramFloat3), this.Q0, this.R0));
      super.a(paramCanvas, paramPaint, paramFloat1);
    } 
  }
  
  @a(name = "align")
  public void setAlign(String paramString) {
    this.Q0 = paramString;
    invalidate();
  }
  
  @a(name = "meetOrSlice")
  public void setMeetOrSlice(int paramInt) {
    this.R0 = paramInt;
    invalidate();
  }
  
  @a(name = "minX")
  public void setMinX(float paramFloat) {
    this.M0 = paramFloat;
    invalidate();
  }
  
  @a(name = "minY")
  public void setMinY(float paramFloat) {
    this.N0 = paramFloat;
    invalidate();
  }
  
  @a(name = "vbHeight")
  public void setVbHeight(float paramFloat) {
    this.P0 = paramFloat;
    invalidate();
  }
  
  @a(name = "vbWidth")
  public void setVbWidth(float paramFloat) {
    this.O0 = paramFloat;
    invalidate();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/horcrux/svg/g0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */