package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.e1.a;

@SuppressLint({"ViewConstructor"})
class t extends b0 {
  private Path K0;
  
  public t(ReactContext paramReactContext) {
    super(paramReactContext);
    s.a = this.L;
    this.K0 = new Path();
  }
  
  Path c(Canvas paramCanvas, Paint paramPaint) {
    return this.K0;
  }
  
  @a(name = "d")
  public void setD(String paramString) {
    this.K0 = s.a(paramString);
    this.p0 = s.f;
    invalidate();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/horcrux/svg/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */