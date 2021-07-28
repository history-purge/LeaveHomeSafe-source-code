package com.facebook.react.uimanager;

import android.view.View;
import android.view.ViewParent;
import e.e.m.a.a;

public class g0 {
  public static f0 a(View paramView) {
    while (true) {
      if (paramView instanceof f0)
        return (f0)paramView; 
      ViewParent viewParent = paramView.getParent();
      if (viewParent == null)
        return null; 
      a.a(viewParent instanceof View);
      View view = (View)viewParent;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/g0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */