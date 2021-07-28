package com.facebook.react.views.view;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import b.g.m.v;

public class e {
  private d a;
  
  private View b;
  
  public e(View paramView) {
    this.b = paramView;
  }
  
  private d a() {
    if (this.a == null) {
      View view;
      LayerDrawable layerDrawable;
      this.a = new d(this.b.getContext());
      Drawable drawable = this.b.getBackground();
      v.a(this.b, null);
      if (drawable == null) {
        view = this.b;
        d d1 = this.a;
      } else {
        layerDrawable = new LayerDrawable(new Drawable[] { this.a, (Drawable)view });
        view = this.b;
      } 
      v.a(view, (Drawable)layerDrawable);
    } 
    return this.a;
  }
  
  public void a(float paramFloat) {
    a().a(paramFloat);
  }
  
  public void a(float paramFloat, int paramInt) {
    a().b(paramFloat, paramInt);
  }
  
  public void a(int paramInt) {
    if (paramInt == 0 && this.a == null)
      return; 
    a().b(paramInt);
  }
  
  public void a(int paramInt, float paramFloat) {
    a().a(paramInt, paramFloat);
  }
  
  public void a(int paramInt, float paramFloat1, float paramFloat2) {
    a().a(paramInt, paramFloat1, paramFloat2);
  }
  
  public void a(String paramString) {
    a().a(paramString);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/view/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */