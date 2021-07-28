package b.r;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import b.g.m.v;

public class f extends v0 {
  public f(int paramInt) {
    a(paramInt);
  }
  
  private static float a(d0 paramd0, float paramFloat) {
    float f1 = paramFloat;
    if (paramd0 != null) {
      Float float_ = (Float)paramd0.a.get("android:fade:transitionAlpha");
      f1 = paramFloat;
      if (float_ != null)
        f1 = float_.floatValue(); 
    } 
    return f1;
  }
  
  private Animator a(View paramView, float paramFloat1, float paramFloat2) {
    if (paramFloat1 == paramFloat2)
      return null; 
    o0.a(paramView, paramFloat1);
    ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(paramView, o0.b, new float[] { paramFloat2 });
    objectAnimator.addListener((Animator.AnimatorListener)new b(paramView));
    a(new a(this, paramView));
    return (Animator)objectAnimator;
  }
  
  public Animator a(ViewGroup paramViewGroup, View paramView, d0 paramd01, d0 paramd02) {
    float f1 = 0.0F;
    float f2 = a(paramd01, 0.0F);
    if (f2 != 1.0F)
      f1 = f2; 
    return a(paramView, f1, 1.0F);
  }
  
  public Animator b(ViewGroup paramViewGroup, View paramView, d0 paramd01, d0 paramd02) {
    o0.e(paramView);
    return a(paramView, a(paramd01, 1.0F), 0.0F);
  }
  
  public void c(d0 paramd0) {
    super.c(paramd0);
    paramd0.a.put("android:fade:transitionAlpha", Float.valueOf(o0.c(paramd0.b)));
  }
  
  class a extends y {
    a(f this$0, View param1View) {}
    
    public void e(x param1x) {
      o0.a(this.a, 1.0F);
      o0.a(this.a);
      param1x.b(this);
    }
  }
  
  private static class b extends AnimatorListenerAdapter {
    private final View a;
    
    private boolean b = false;
    
    b(View param1View) {
      this.a = param1View;
    }
    
    public void onAnimationEnd(Animator param1Animator) {
      o0.a(this.a, 1.0F);
      if (this.b)
        this.a.setLayerType(0, null); 
    }
    
    public void onAnimationStart(Animator param1Animator) {
      if (v.D(this.a) && this.a.getLayerType() == 0) {
        this.b = true;
        this.a.setLayerType(2, null);
      } 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/r/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */