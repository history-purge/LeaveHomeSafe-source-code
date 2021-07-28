package e.f.a.f.p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewAnimationUtils;

public final class a {
  public static Animator.AnimatorListener a(d paramd) {
    return (Animator.AnimatorListener)new a(paramd);
  }
  
  public static Animator a(d paramd, float paramFloat1, float paramFloat2, float paramFloat3) {
    ObjectAnimator objectAnimator = ObjectAnimator.ofObject(paramd, d.c.a, d.b.b, (Object[])new d.e[] { new d.e(paramFloat1, paramFloat2, paramFloat3) });
    if (Build.VERSION.SDK_INT >= 21) {
      d.e e = paramd.getRevealInfo();
      if (e != null) {
        float f = e.c;
        Animator animator = ViewAnimationUtils.createCircularReveal((View)paramd, (int)paramFloat1, (int)paramFloat2, f, paramFloat3);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[] { (Animator)objectAnimator, animator });
        return (Animator)animatorSet;
      } 
      throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    } 
    return (Animator)objectAnimator;
  }
  
  static final class a extends AnimatorListenerAdapter {
    a(d param1d) {}
    
    public void onAnimationEnd(Animator param1Animator) {
      this.a.a();
    }
    
    public void onAnimationStart(Animator param1Animator) {
      this.a.b();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/f/p/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */