package com.lwansbrough.RCTCamera;

import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Camera;
import android.view.MotionEvent;

public class c {
  protected static Camera.Area a(MotionEvent paramMotionEvent, int paramInt1, int paramInt2) {
    int i = paramMotionEvent.findPointerIndex(paramMotionEvent.getPointerId(0));
    float f1 = paramMotionEvent.getX(i);
    float f2 = paramMotionEvent.getY(i);
    RectF rectF = new RectF(f1 - 100.0F, f2 - 100.0F, f1 + 100.0F, f2 + 100.0F);
    f1 = paramInt1;
    f2 = paramInt2;
    if (rectF.intersect(new RectF(0.0F, 0.0F, f1, f2))) {
      rectF = new RectF(rectF.left / f1 * 2000.0F - 1000.0F, rectF.top / f2 * 2000.0F - 1000.0F, rectF.right / f1 * 2000.0F - 1000.0F, rectF.bottom / f2 * 2000.0F - 1000.0F);
      Rect rect = new Rect();
      rectF.round(rect);
      return new Camera.Area(rect, 1000);
    } 
    throw new RuntimeException("MotionEvent rect does not intersect with SurfaceTexture rect; unable to compute focus area");
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/lwansbrough/RCTCamera/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */