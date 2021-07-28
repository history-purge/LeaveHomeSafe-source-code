package com.facebook.react.uimanager.h1;

import android.view.View;
import android.view.animation.Animation;

class k extends a {
  boolean a() {
    return (this.d > 0);
  }
  
  Animation b(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    boolean bool1;
    float f1 = paramView.getX();
    float f2 = paramInt1;
    boolean bool2 = false;
    if (f1 != f2 || paramView.getY() != paramInt2) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    if (paramView.getWidth() != paramInt3 || paramView.getHeight() != paramInt4)
      bool2 = true; 
    return (!bool1 && !bool2) ? null : new m(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/h1/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */