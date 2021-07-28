package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.e1.a;
import e.e.e.e.a;

@SuppressLint({"ViewConstructor"})
class z extends d {
  private static final float[] B0 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F };
  
  private Matrix A0 = null;
  
  private c0 s0;
  
  private c0 t0;
  
  private c0 u0;
  
  private c0 v0;
  
  private c0 w0;
  
  private c0 x0;
  
  private ReadableArray y0;
  
  private a.b z0;
  
  public z(ReactContext paramReactContext) {
    super(paramReactContext);
  }
  
  void h() {
    if (this.P != null) {
      c0 c01 = this.s0;
      c0 c02 = this.t0;
      c0 c03 = this.u0;
      c0 c04 = this.v0;
      c0 c05 = this.w0;
      c0 c06 = this.x0;
      a.a a1 = a.a.d;
      a.b b1 = this.z0;
      a a = new a(a1, new c0[] { c01, c02, c03, c04, c05, c06 }, b1);
      a.a(this.y0);
      Matrix matrix = this.A0;
      if (matrix != null)
        a.a(matrix); 
      f0 f0 = getSvgView();
      if (this.z0 == a.b.d)
        a.a(f0.getCanvasBounds()); 
      f0.a(a, this.P);
    } 
  }
  
  @a(name = "cx")
  public void setCx(Dynamic paramDynamic) {
    this.w0 = c0.b(paramDynamic);
    invalidate();
  }
  
  @a(name = "cy")
  public void setCy(Dynamic paramDynamic) {
    this.x0 = c0.b(paramDynamic);
    invalidate();
  }
  
  @a(name = "fx")
  public void setFx(Dynamic paramDynamic) {
    this.s0 = c0.b(paramDynamic);
    invalidate();
  }
  
  @a(name = "fy")
  public void setFy(Dynamic paramDynamic) {
    this.t0 = c0.b(paramDynamic);
    invalidate();
  }
  
  @a(name = "gradient")
  public void setGradient(ReadableArray paramReadableArray) {
    this.y0 = paramReadableArray;
    invalidate();
  }
  
  @a(name = "gradientTransform")
  public void setGradientTransform(ReadableArray paramReadableArray) {
    if (paramReadableArray != null) {
      int i = w.a(paramReadableArray, B0, this.L);
      if (i == 6) {
        if (this.A0 == null)
          this.A0 = new Matrix(); 
        this.A0.setValues(B0);
      } else if (i != -1) {
        a.e("ReactNative", "RNSVG: Transform matrices must be of size 6");
      } 
    } else {
      this.A0 = null;
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
    this.z0 = b1;
    invalidate();
  }
  
  @a(name = "rx")
  public void setRx(Dynamic paramDynamic) {
    this.u0 = c0.b(paramDynamic);
    invalidate();
  }
  
  @a(name = "ry")
  public void setRy(Dynamic paramDynamic) {
    this.v0 = c0.b(paramDynamic);
    invalidate();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/horcrux/svg/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */