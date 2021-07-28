package com.facebook.react.uimanager.h1;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

class l extends Animation {
  private final View c;
  
  private final float d;
  
  private final float e;
  
  public l(View paramView, float paramFloat1, float paramFloat2) {
    this.c = paramView;
    this.d = paramFloat1;
    this.e = paramFloat2 - paramFloat1;
    setAnimationListener(new a(paramView));
  }
  
  protected void applyTransformation(float paramFloat, Transformation paramTransformation) {
    this.c.setAlpha(this.d + this.e * paramFloat);
  }
  
  public boolean willChangeBounds() {
    return false;
  }
  
  static class a implements Animation.AnimationListener {
    private final View a;
    
    private boolean b = false;
    
    public a(View param1View) {
      this.a = param1View;
    }
    
    public void onAnimationEnd(Animation param1Animation) {
      if (this.b)
        this.a.setLayerType(0, null); 
    }
    
    public void onAnimationRepeat(Animation param1Animation) {}
    
    public void onAnimationStart(Animation param1Animation) {
      if (this.a.hasOverlappingRendering() && this.a.getLayerType() == 0) {
        this.b = true;
        this.a.setLayerType(2, null);
      } 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/h1/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */