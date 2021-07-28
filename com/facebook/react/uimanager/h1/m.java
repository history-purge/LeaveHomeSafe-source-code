package com.facebook.react.uimanager.h1;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

class m extends Animation implements j {
  private final View c;
  
  private float d;
  
  private float e;
  
  private float f;
  
  private float g;
  
  private int h;
  
  private int i;
  
  private int j;
  
  private int k;
  
  public m(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.c = paramView;
    b(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  private void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.d = this.c.getX() - this.c.getTranslationX();
    this.e = this.c.getY() - this.c.getTranslationY();
    this.h = this.c.getWidth();
    this.i = this.c.getHeight();
    this.f = paramInt1 - this.d;
    this.g = paramInt2 - this.e;
    this.j = paramInt3 - this.h;
    this.k = paramInt4 - this.i;
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    b(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  protected void applyTransformation(float paramFloat, Transformation paramTransformation) {
    float f1 = this.d + this.f * paramFloat;
    float f2 = this.e + this.g * paramFloat;
    float f3 = this.h;
    float f4 = this.j;
    float f5 = this.i;
    float f6 = this.k;
    this.c.layout(Math.round(f1), Math.round(f2), Math.round(f1 + f3 + f4 * paramFloat), Math.round(f2 + f5 + f6 * paramFloat));
  }
  
  public boolean willChangeBounds() {
    return true;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/h1/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */