package com.swmansion.reanimated.f;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import b.r.d0;
import b.r.v0;
import b.r.x;
import b.r.y;

public class b extends v0 {
  private Animator a(View paramView, float paramFloat1, float paramFloat2, d0 paramd0) {
    float f5 = paramView.getScaleX();
    float f6 = paramView.getScaleY();
    float f1 = f5 * paramFloat1;
    float f4 = paramFloat1 * f6;
    float f2 = f1;
    float f3 = f4;
    if (paramd0 != null) {
      Float float_2 = (Float)paramd0.a.get("scale:scaleX");
      Float float_1 = (Float)paramd0.a.get("scale:scaleY");
      paramFloat1 = f1;
      if (float_2 != null) {
        paramFloat1 = f1;
        if (float_2.floatValue() != f5)
          paramFloat1 = float_2.floatValue(); 
      } 
      f2 = paramFloat1;
      f3 = f4;
      if (float_1 != null) {
        f2 = paramFloat1;
        f3 = f4;
        if (float_1.floatValue() != f6) {
          f3 = float_1.floatValue();
          f2 = paramFloat1;
        } 
      } 
    } 
    paramView.setScaleX(f2);
    paramView.setScaleY(f3);
    AnimatorSet animatorSet = new AnimatorSet();
    animatorSet.playTogether(new Animator[] { (Animator)ObjectAnimator.ofFloat(paramView, View.SCALE_X, new float[] { f2, f5 * paramFloat2 }), (Animator)ObjectAnimator.ofFloat(paramView, View.SCALE_Y, new float[] { f3, paramFloat2 * f6 }) });
    a((x.f)new a(this, paramView, f5, f6));
    return (Animator)animatorSet;
  }
  
  public Animator a(ViewGroup paramViewGroup, View paramView, d0 paramd01, d0 paramd02) {
    return a(paramView, 0.0F, 1.0F, paramd01);
  }
  
  public Animator b(ViewGroup paramViewGroup, View paramView, d0 paramd01, d0 paramd02) {
    return a(paramView, 1.0F, 0.0F, paramd01);
  }
  
  public void c(d0 paramd0) {
    super.c(paramd0);
    paramd0.a.put("scale:scaleX", Float.valueOf(paramd0.b.getScaleX()));
    paramd0.a.put("scale:scaleY", Float.valueOf(paramd0.b.getScaleY()));
  }
  
  class a extends y {
    a(b this$0, View param1View, float param1Float1, float param1Float2) {}
    
    public void e(x param1x) {
      this.a.setScaleX(this.b);
      this.a.setScaleY(this.c);
      param1x.b((x.f)this);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/swmansion/reanimated/f/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */