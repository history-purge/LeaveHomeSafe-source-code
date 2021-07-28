package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.facebook.react.bridge.ReactContext;

@SuppressLint({"ViewConstructor"})
class e extends d {
  public e(ReactContext paramReactContext) {
    super(paramReactContext);
  }
  
  void a(Canvas paramCanvas, Paint paramPaint, float paramFloat) {}
  
  void h() {
    for (int i = 0; i < getChildCount(); i++) {
      View view = getChildAt(i);
      if (view instanceof x0)
        ((x0)view).h(); 
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/horcrux/svg/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */