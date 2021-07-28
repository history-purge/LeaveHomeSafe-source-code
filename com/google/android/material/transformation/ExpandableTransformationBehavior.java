package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {
  private AnimatorSet b;
  
  public ExpandableTransformationBehavior() {}
  
  public ExpandableTransformationBehavior(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
  }
  
  protected boolean a(View paramView1, View paramView2, boolean paramBoolean1, boolean paramBoolean2) {
    boolean bool;
    if (this.b != null) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool)
      this.b.cancel(); 
    this.b = b(paramView1, paramView2, paramBoolean1, bool);
    this.b.addListener((Animator.AnimatorListener)new a(this));
    this.b.start();
    if (!paramBoolean2)
      this.b.end(); 
    return true;
  }
  
  protected abstract AnimatorSet b(View paramView1, View paramView2, boolean paramBoolean1, boolean paramBoolean2);
  
  class a extends AnimatorListenerAdapter {
    a(ExpandableTransformationBehavior this$0) {}
    
    public void onAnimationEnd(Animator param1Animator) {
      ExpandableTransformationBehavior.a(this.a, null);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/transformation/ExpandableTransformationBehavior.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */