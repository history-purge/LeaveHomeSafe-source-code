package com.facebook.react.uimanager;

import android.util.DisplayMetrics;
import android.util.TypedValue;

public class q {
  public static float a(double paramDouble) {
    return b((float)paramDouble);
  }
  
  public static float a(float paramFloat) {
    return paramFloat / (c.b()).density;
  }
  
  public static float a(float paramFloat1, float paramFloat2) {
    DisplayMetrics displayMetrics = c.b();
    float f2 = displayMetrics.scaledDensity;
    float f3 = displayMetrics.density;
    float f4 = f2 / f3;
    float f1 = f2;
    if (paramFloat2 >= 1.0F) {
      f1 = f2;
      if (paramFloat2 < f4)
        f1 = f3 * paramFloat2; 
    } 
    return paramFloat1 * f1;
  }
  
  public static float b(double paramDouble) {
    return c((float)paramDouble);
  }
  
  public static float b(float paramFloat) {
    return TypedValue.applyDimension(1, paramFloat, c.b());
  }
  
  public static float c(float paramFloat) {
    return a(paramFloat, Float.NaN);
  }
  
  public static float d(float paramFloat) {
    return paramFloat / (c.a()).scaledDensity;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */