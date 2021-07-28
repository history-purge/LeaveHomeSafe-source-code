package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.e1.a;

@SuppressLint({"ViewConstructor"})
class p extends l {
  private c0 M0;
  
  private c0 N0;
  
  private c0 O0;
  
  private c0 P0;
  
  private String Q0;
  
  private String R0;
  
  private float S0;
  
  private float T0;
  
  private float U0;
  
  private float V0;
  
  String W0;
  
  int X0;
  
  Matrix Y0 = new Matrix();
  
  public p(ReactContext paramReactContext) {
    super(paramReactContext);
  }
  
  void a(Canvas paramCanvas, Paint paramPaint, float paramFloat1, x paramx, float paramFloat2) {
    int i = a(paramCanvas, this.w);
    this.Y0.reset();
    v v = paramx.b;
    Matrix matrix = this.Y0;
    float f1 = (float)v.a;
    float f2 = this.L;
    matrix.setTranslate(f1 * f2, (float)v.b * f2);
    if ("auto".equals(this.R0)) {
      d1 = -1.0D;
    } else {
      d1 = Double.parseDouble(this.R0);
    } 
    double d2 = d1;
    if (d1 == -1.0D)
      d2 = paramx.c; 
    f1 = (float)d2;
    this.Y0.preRotate(f1 + 180.0F);
    if ("strokeWidth".equals(this.Q0))
      this.Y0.preScale(paramFloat2, paramFloat2); 
    double d1 = c(this.O0);
    d2 = this.L;
    Double.isNaN(d2);
    d1 /= d2;
    d2 = a(this.P0);
    double d3 = this.L;
    Double.isNaN(d3);
    d2 /= d3;
    RectF rectF = new RectF(0.0F, 0.0F, (float)d1, (float)d2);
    if (this.W0 != null) {
      paramFloat2 = this.S0;
      f1 = this.L;
      f2 = this.T0;
      Matrix matrix1 = w0.a(new RectF(paramFloat2 * f1, f2 * f1, (paramFloat2 + this.U0) * f1, (f2 + this.V0) * f1), rectF, this.W0, this.X0);
      float[] arrayOfFloat = new float[9];
      matrix1.getValues(arrayOfFloat);
      this.Y0.preScale(arrayOfFloat[0], arrayOfFloat[4]);
    } 
    d1 = c(this.M0);
    d2 = a(this.N0);
    this.Y0.preTranslate((float)-d1, (float)-d2);
    paramCanvas.concat(this.Y0);
    d(paramCanvas, paramPaint, paramFloat1);
    a(paramCanvas, i);
  }
  
  void h() {
    if (this.P != null) {
      getSvgView().b(this, this.P);
      for (int i = 0; i < getChildCount(); i++) {
        View view = getChildAt(i);
        if (view instanceof x0)
          ((x0)view).h(); 
      } 
    } 
  }
  
  @a(name = "align")
  public void setAlign(String paramString) {
    this.W0 = paramString;
    invalidate();
  }
  
  @a(name = "markerHeight")
  public void setMarkerHeight(Dynamic paramDynamic) {
    this.P0 = c0.b(paramDynamic);
    invalidate();
  }
  
  @a(name = "markerUnits")
  public void setMarkerUnits(String paramString) {
    this.Q0 = paramString;
    invalidate();
  }
  
  @a(name = "markerWidth")
  public void setMarkerWidth(Dynamic paramDynamic) {
    this.O0 = c0.b(paramDynamic);
    invalidate();
  }
  
  @a(name = "meetOrSlice")
  public void setMeetOrSlice(int paramInt) {
    this.X0 = paramInt;
    invalidate();
  }
  
  @a(name = "minX")
  public void setMinX(float paramFloat) {
    this.S0 = paramFloat;
    invalidate();
  }
  
  @a(name = "minY")
  public void setMinY(float paramFloat) {
    this.T0 = paramFloat;
    invalidate();
  }
  
  @a(name = "orient")
  public void setOrient(String paramString) {
    this.R0 = paramString;
    invalidate();
  }
  
  @a(name = "refX")
  public void setRefX(Dynamic paramDynamic) {
    this.M0 = c0.b(paramDynamic);
    invalidate();
  }
  
  @a(name = "refY")
  public void setRefY(Dynamic paramDynamic) {
    this.N0 = c0.b(paramDynamic);
    invalidate();
  }
  
  @a(name = "vbHeight")
  public void setVbHeight(float paramFloat) {
    this.V0 = paramFloat;
    invalidate();
  }
  
  @a(name = "vbWidth")
  public void setVbWidth(float paramFloat) {
    this.U0 = paramFloat;
    invalidate();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/horcrux/svg/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */