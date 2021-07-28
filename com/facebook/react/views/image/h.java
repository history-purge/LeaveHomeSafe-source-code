package com.facebook.react.views.image;

import android.graphics.Matrix;
import android.graphics.Rect;
import e.e.j.e.r;

public class h extends r.a {
  public static final r.b g = (r.b)new h();
  
  public void a(Matrix paramMatrix, Rect paramRect, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    paramFloat1 = Math.min(Math.min(paramFloat3, paramFloat4), 1.0F);
    paramFloat2 = paramRect.left;
    paramFloat3 = paramRect.top;
    paramMatrix.setScale(paramFloat1, paramFloat1);
    paramMatrix.postTranslate((int)(paramFloat2 + 0.5F), (int)(paramFloat3 + 0.5F));
  }
  
  public String toString() {
    return "start_inside";
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/image/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */