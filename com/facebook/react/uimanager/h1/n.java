package com.facebook.react.uimanager.h1;

import android.view.animation.Interpolator;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;

class n implements Interpolator {
  private final float a;
  
  public n(float paramFloat) {
    this.a = paramFloat;
  }
  
  public static float a(ReadableMap paramReadableMap) {
    return paramReadableMap.getType("springDamping").equals(ReadableType.Number) ? (float)paramReadableMap.getDouble("springDamping") : 0.5F;
  }
  
  public float getInterpolation(float paramFloat) {
    double d1 = Math.pow(2.0D, (-10.0F * paramFloat));
    float f = this.a;
    double d2 = (paramFloat - f / 4.0F);
    Double.isNaN(d2);
    double d3 = f;
    Double.isNaN(d3);
    return (float)(d1 * Math.sin(d2 * Math.PI * 2.0D / d3) + 1.0D);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/h1/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */