package com.facebook.react.fabric.e;

import android.view.View;
import com.facebook.react.uimanager.q;
import com.facebook.yoga.n;

public class a {
  public static float a(int paramInt) {
    int i = View.MeasureSpec.getMode(paramInt);
    paramInt = View.MeasureSpec.getSize(paramInt);
    return (i == 0) ? Float.POSITIVE_INFINITY : paramInt;
  }
  
  public static n a(float paramFloat1, float paramFloat2) {
    return (paramFloat1 == paramFloat2) ? n.d : (Float.isInfinite(paramFloat2) ? n.c : n.e);
  }
  
  public static float b(float paramFloat1, float paramFloat2) {
    return (paramFloat1 == paramFloat2) ? q.b(paramFloat2) : (Float.isInfinite(paramFloat2) ? Float.POSITIVE_INFINITY : q.b(paramFloat2));
  }
  
  public static float b(int paramInt) {
    int i = View.MeasureSpec.getMode(paramInt);
    paramInt = View.MeasureSpec.getSize(paramInt);
    return (i == 1073741824) ? paramInt : 0.0F;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/fabric/e/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */