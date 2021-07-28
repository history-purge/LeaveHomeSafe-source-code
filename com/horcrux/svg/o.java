package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.e1.a;
import e.e.e.e.a;

@SuppressLint({"ViewConstructor"})
class o extends d {
  private static final float[] z0 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F };
  
  private c0 s0;
  
  private c0 t0;
  
  private c0 u0;
  
  private c0 v0;
  
  private ReadableArray w0;
  
  private a.b x0;
  
  private Matrix y0 = null;
  
  public o(ReactContext paramReactContext) {
    super(paramReactContext);
  }
  
  void h() {
    if (this.P != null) {
      c0 c01 = this.s0;
      c0 c02 = this.t0;
      c0 c03 = this.u0;
      c0 c04 = this.v0;
      a.a a1 = a.a.c;
      a.b b1 = this.x0;
      a a = new a(a1, new c0[] { c01, c02, c03, c04 }, b1);
      a.a(this.w0);
      Matrix matrix = this.y0;
      if (matrix != null)
        a.a(matrix); 
      f0 f0 = getSvgView();
      if (this.x0 == a.b.d)
        a.a(f0.getCanvasBounds()); 
      f0.a(a, this.P);
    } 
  }
  
  @a(name = "gradient")
  public void setGradient(ReadableArray paramReadableArray) {
    this.w0 = paramReadableArray;
    invalidate();
  }
  
  @a(name = "gradientTransform")
  public void setGradientTransform(ReadableArray paramReadableArray) {
    if (paramReadableArray != null) {
      int i = w.a(paramReadableArray, z0, this.L);
      if (i == 6) {
        if (this.y0 == null)
          this.y0 = new Matrix(); 
        this.y0.setValues(z0);
      } else if (i != -1) {
        a.e("ReactNative", "RNSVG: Transform matrices must be of size 6");
      } 
    } else {
      this.y0 = null;
    } 
    invalidate();
  }
  
  @a(name = "gradientUnits")
  public void setGradientUnits(int paramInt) {
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
    this.x0 = b1;
    invalidate();
  }
  
  @a(name = "x1")
  public void setX1(Dynamic paramDynamic) {
    this.s0 = c0.b(paramDynamic);
    invalidate();
  }
  
  @a(name = "x2")
  public void setX2(Dynamic paramDynamic) {
    this.u0 = c0.b(paramDynamic);
    invalidate();
  }
  
  @a(name = "y1")
  public void setY1(Dynamic paramDynamic) {
    this.t0 = c0.b(paramDynamic);
    invalidate();
  }
  
  @a(name = "y2")
  public void setY2(Dynamic paramDynamic) {
    this.v0 = c0.b(paramDynamic);
    invalidate();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/horcrux/svg/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */