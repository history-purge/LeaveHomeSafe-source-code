package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import e.f.a.f.l.b;
import e.f.a.f.l.i;
import java.util.ArrayList;
import java.util.List;

public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {
  private final i c = new i(75L, 150L);
  
  private final i d = new i(0L, 150L);
  
  public FabTransformationScrimBehavior() {}
  
  public FabTransformationScrimBehavior(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
  }
  
  private void a(View paramView, boolean paramBoolean1, boolean paramBoolean2, List<Animator> paramList, List<Animator.AnimatorListener> paramList1) {
    ObjectAnimator objectAnimator;
    i i1;
    if (paramBoolean1) {
      i1 = this.c;
    } else {
      i1 = this.d;
    } 
    if (paramBoolean1) {
      if (!paramBoolean2)
        paramView.setAlpha(0.0F); 
      objectAnimator = ObjectAnimator.ofFloat(paramView, View.ALPHA, new float[] { 1.0F });
    } else {
      objectAnimator = ObjectAnimator.ofFloat(objectAnimator, View.ALPHA, new float[] { 0.0F });
    } 
    i1.a((Animator)objectAnimator);
    paramList.add(objectAnimator);
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2) {
    return paramView2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton;
  }
  
  protected AnimatorSet b(View paramView1, View paramView2, boolean paramBoolean1, boolean paramBoolean2) {
    ArrayList<Animator> arrayList = new ArrayList();
    a(paramView2, paramBoolean1, paramBoolean2, arrayList, new ArrayList<Animator.AnimatorListener>());
    AnimatorSet animatorSet = new AnimatorSet();
    b.a(animatorSet, arrayList);
    animatorSet.addListener((Animator.AnimatorListener)new a(this, paramBoolean1, paramView2));
    return animatorSet;
  }
  
  public boolean b(CoordinatorLayout paramCoordinatorLayout, View paramView, MotionEvent paramMotionEvent) {
    return super.b(paramCoordinatorLayout, paramView, paramMotionEvent);
  }
  
  class a extends AnimatorListenerAdapter {
    a(FabTransformationScrimBehavior this$0, boolean param1Boolean, View param1View) {}
    
    public void onAnimationEnd(Animator param1Animator) {
      if (!this.a)
        this.b.setVisibility(4); 
    }
    
    public void onAnimationStart(Animator param1Animator) {
      if (this.a)
        this.b.setVisibility(0); 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/transformation/FabTransformationScrimBehavior.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */