package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.react.bridge.ReactContext;
import e.e.e.e.a;

@SuppressLint({"ViewConstructor"})
class c extends l {
  public c(ReactContext paramReactContext) {
    super(paramReactContext);
    this.F = 1;
  }
  
  int a(float[] paramArrayOffloat) {
    return -1;
  }
  
  void a(Canvas paramCanvas, Paint paramPaint, float paramFloat) {
    a.e("ReactNative", "RNSVG: ClipPath can't be drawn, it should be defined as a child component for `Defs` ");
  }
  
  void a(b0 paramb0) {}
  
  boolean g() {
    return false;
  }
  
  void h() {
    getSvgView().a(this, this.P);
  }
  
  void j() {}
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/horcrux/svg/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */