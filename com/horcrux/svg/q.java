package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.e1.a;
import e.e.e.e.a;

@SuppressLint({"ViewConstructor"})
class q extends l {
  private static final float[] R0 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F };
  
  c0 M0;
  
  c0 N0;
  
  c0 O0;
  
  c0 P0;
  
  private Matrix Q0 = null;
  
  public q(ReactContext paramReactContext) {
    super(paramReactContext);
  }
  
  void h() {
    if (this.P != null)
      getSvgView().c(this, this.P); 
  }
  
  @a(name = "height")
  public void setHeight(Dynamic paramDynamic) {
    this.P0 = c0.b(paramDynamic);
    invalidate();
  }
  
  @a(name = "maskContentUnits")
  public void setMaskContentUnits(int paramInt) {
    if (paramInt != 0) {
      if (paramInt == 1)
        a.b b = a.b.d; 
    } else {
      a.b b = a.b.c;
    } 
    invalidate();
  }
  
  @a(name = "maskTransform")
  public void setMaskTransform(ReadableArray paramReadableArray) {
    if (paramReadableArray != null) {
      int i = w.a(paramReadableArray, R0, this.L);
      if (i == 6) {
        if (this.Q0 == null)
          this.Q0 = new Matrix(); 
        this.Q0.setValues(R0);
      } else if (i != -1) {
        a.e("ReactNative", "RNSVG: Transform matrices must be of size 6");
      } 
    } else {
      this.Q0 = null;
    } 
    invalidate();
  }
  
  @a(name = "maskUnits")
  public void setMaskUnits(int paramInt) {
    if (paramInt != 0) {
      if (paramInt == 1)
        a.b b = a.b.d; 
    } else {
      a.b b = a.b.c;
    } 
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


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/horcrux/svg/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */