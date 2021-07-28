package com.google.android.material.appbar;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.internal.g;
import e.f.a.f.b;
import e.f.a.f.g;

class e {
  private static final int[] a = new int[] { 16843848 };
  
  static void a(View paramView) {
    paramView.setOutlineProvider(ViewOutlineProvider.BOUNDS);
  }
  
  static void a(View paramView, float paramFloat) {
    int i = paramView.getResources().getInteger(g.app_bar_elevation_anim_duration);
    StateListAnimator stateListAnimator = new StateListAnimator();
    int j = b.state_liftable;
    int k = -b.state_lifted;
    ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(paramView, "elevation", new float[] { 0.0F });
    long l = i;
    objectAnimator = objectAnimator.setDuration(l);
    stateListAnimator.addState(new int[] { 16842766, j, k }, (Animator)objectAnimator);
    objectAnimator = ObjectAnimator.ofFloat(paramView, "elevation", new float[] { paramFloat }).setDuration(l);
    stateListAnimator.addState(new int[] { 16842766 }, (Animator)objectAnimator);
    objectAnimator = ObjectAnimator.ofFloat(paramView, "elevation", new float[] { 0.0F }).setDuration(0L);
    stateListAnimator.addState(new int[0], (Animator)objectAnimator);
    paramView.setStateListAnimator(stateListAnimator);
  }
  
  static void a(View paramView, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    Context context = paramView.getContext();
    TypedArray typedArray = g.c(context, paramAttributeSet, a, paramInt1, paramInt2, new int[0]);
    try {
      if (typedArray.hasValue(0))
        paramView.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, typedArray.getResourceId(0, 0))); 
      return;
    } finally {
      typedArray.recycle();
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/appbar/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */