package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.e1.a;
import e.e.e.e.a;

@SuppressLint({"ViewConstructor"})
class u extends l {
  private static final float[] Z0 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F };
  
  private c0 M0;
  
  private c0 N0;
  
  private c0 O0;
  
  private c0 P0;
  
  private a.b Q0;
  
  private a.b R0;
  
  private float S0;
  
  private float T0;
  
  private float U0;
  
  private float V0;
  
  String W0;
  
  int X0;
  
  private Matrix Y0 = null;
  
  public u(ReactContext paramReactContext) {
    super(paramReactContext);
  }
  
  RectF getViewBox() {
    float f1 = this.S0;
    float f2 = this.L;
    float f3 = this.T0;
    return new RectF(f1 * f2, f3 * f2, (f1 + this.U0) * f2, (f3 + this.V0) * f2);
  }
  
  void h() {
    if (this.P != null) {
      c0 c01 = this.M0;
      c0 c02 = this.N0;
      c0 c03 = this.O0;
      c0 c04 = this.P0;
      a.a a1 = a.a.e;
      a.b b3 = this.Q0;
      a a = new a(a1, new c0[] { c01, c02, c03, c04 }, b3);
      a.a(this.R0);
      a.a(this);
      Matrix matrix = this.Y0;
      if (matrix != null)
        a.a(matrix); 
      f0 f0 = getSvgView();
      a.b b1 = this.Q0;
      a.b b2 = a.b.d;
      if (b1 == b2 || this.R0 == b2)
        a.a(f0.getCanvasBounds()); 
      f0.a(a, this.P);
    } 
  }
  
  @a(name = "align")
  public void setAlign(String paramString) {
    this.W0 = paramString;
    invalidate();
  }
  
  @a(name = "height")
  public void setHeight(Dynamic paramDynamic) {
    this.P0 = c0.b(paramDynamic);
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
  
  @a(name = "patternContentUnits")
  public void setPatternContentUnits(int paramInt) {
    a.b b1;
    if (paramInt != 0) {
      if (paramInt != 1) {
        invalidate();
        return;
      } 
      b1 = a.b.d;
    } else {
      b1 = a.b.c;
    } 
    this.R0 = b1;
    invalidate();
  }
  
  @a(name = "patternTransform")
  public void setPatternTransform(ReadableArray paramReadableArray) {
    if (paramReadableArray != null) {
      int i = w.a(paramReadableArray, Z0, this.L);
      if (i == 6) {
        if (this.Y0 == null)
          this.Y0 = new Matrix(); 
        this.Y0.setValues(Z0);
      } else if (i != -1) {
        a.e("ReactNative", "RNSVG: Transform matrices must be of size 6");
      } 
    } else {
      this.Y0 = null;
    } 
    invalidate();
  }
  
  @a(name = "patternUnits")
  public void setPatternUnits(int paramInt) {
    a.b b1;
    if (paramInt != 0) {
      if (paramInt != 1) {
        invalidate();
        return;
      } 
      b1 = a.b.d;
    } else {
      b1 = a.b.c;
    } 
    this.Q0 = b1;
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
  
  @a(name = "width")
  public void setWidth(Dynamic paramDynamic) {
    this.O0 = c0.b(paramDynamic);
    invalidate();
  }
  
  @a(name = "x")
  public void setX(Dynamic paramDynamic) {
    this.M0 = c0.b(paramDynamic);
    invalidate();
  }
  
  @a(name = "y")
  public void setY(Dynamic paramDynamic) {
    this.N0 = c0.b(paramDynamic);
    invalidate();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/horcrux/svg/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */