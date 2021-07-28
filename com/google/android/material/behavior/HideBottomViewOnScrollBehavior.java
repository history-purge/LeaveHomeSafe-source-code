package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {
  private int a = 0;
  
  private int b = 2;
  
  private int c = 0;
  
  private ViewPropertyAnimator d;
  
  public HideBottomViewOnScrollBehavior() {}
  
  public HideBottomViewOnScrollBehavior(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
  }
  
  private void a(V paramV, int paramInt, long paramLong, TimeInterpolator paramTimeInterpolator) {
    this.d = paramV.animate().translationY(paramInt).setInterpolator(paramTimeInterpolator).setDuration(paramLong).setListener((Animator.AnimatorListener)new a(this));
  }
  
  public void a(V paramV) {
    if (this.b == 1)
      return; 
    ViewPropertyAnimator viewPropertyAnimator = this.d;
    if (viewPropertyAnimator != null) {
      viewPropertyAnimator.cancel();
      paramV.clearAnimation();
    } 
    this.b = 1;
    a(paramV, this.a + this.c, 175L, e.f.a.f.l.a.c);
  }
  
  public void a(V paramV, int paramInt) {
    this.c = paramInt;
    if (this.b == 1)
      paramV.setTranslationY((this.a + this.c)); 
  }
  
  public void a(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (paramInt2 > 0) {
      a(paramV);
      return;
    } 
    if (paramInt2 < 0)
      b(paramV); 
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, int paramInt) {
    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)paramV.getLayoutParams();
    this.a = paramV.getMeasuredHeight() + marginLayoutParams.bottomMargin;
    return super.a(paramCoordinatorLayout, (View)paramV, paramInt);
  }
  
  public void b(V paramV) {
    if (this.b == 2)
      return; 
    ViewPropertyAnimator viewPropertyAnimator = this.d;
    if (viewPropertyAnimator != null) {
      viewPropertyAnimator.cancel();
      paramV.clearAnimation();
    } 
    this.b = 2;
    a(paramV, 0, 225L, e.f.a.f.l.a.d);
  }
  
  public boolean b(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView1, View paramView2, int paramInt) {
    return (paramInt == 2);
  }
  
  class a extends AnimatorListenerAdapter {
    a(HideBottomViewOnScrollBehavior this$0) {}
    
    public void onAnimationEnd(Animator param1Animator) {
      HideBottomViewOnScrollBehavior.a(this.a, (ViewPropertyAnimator)null);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/behavior/HideBottomViewOnScrollBehavior.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */