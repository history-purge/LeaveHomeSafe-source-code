package com.google.android.material.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import b.g.m.v;

public class h {
  public static float a(Context paramContext, int paramInt) {
    Resources resources = paramContext.getResources();
    return TypedValue.applyDimension(1, paramInt, resources.getDisplayMetrics());
  }
  
  public static float a(View paramView) {
    ViewParent viewParent = paramView.getParent();
    float f = 0.0F;
    while (viewParent instanceof View) {
      f += v.l((View)viewParent);
      viewParent = viewParent.getParent();
    } 
    return f;
  }
  
  public static PorterDuff.Mode a(int paramInt, PorterDuff.Mode paramMode) {
    if (paramInt != 3) {
      if (paramInt != 5) {
        if (paramInt != 9) {
          switch (paramInt) {
            default:
              return paramMode;
            case 16:
              return PorterDuff.Mode.ADD;
            case 15:
              return PorterDuff.Mode.SCREEN;
            case 14:
              break;
          } 
          return PorterDuff.Mode.MULTIPLY;
        } 
        return PorterDuff.Mode.SRC_ATOP;
      } 
      return PorterDuff.Mode.SRC_IN;
    } 
    return PorterDuff.Mode.SRC_OVER;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/internal/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */