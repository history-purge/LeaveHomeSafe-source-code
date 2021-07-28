package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;

public final class e {
  private final ArrayList<b> a = new ArrayList<b>();
  
  private b b = null;
  
  ValueAnimator c = null;
  
  private final Animator.AnimatorListener d = (Animator.AnimatorListener)new a(this);
  
  private void a(b paramb) {
    this.c = paramb.b;
    this.c.start();
  }
  
  private void b() {
    ValueAnimator valueAnimator = this.c;
    if (valueAnimator != null) {
      valueAnimator.cancel();
      this.c = null;
    } 
  }
  
  public void a() {
    ValueAnimator valueAnimator = this.c;
    if (valueAnimator != null) {
      valueAnimator.end();
      this.c = null;
    } 
  }
  
  public void a(int[] paramArrayOfint) {
    int j = this.a.size();
    int i = 0;
    while (true) {
      if (i < j) {
        b b2 = this.a.get(i);
        if (StateSet.stateSetMatches(b2.a, paramArrayOfint)) {
          b b3 = b2;
          break;
        } 
        i++;
        continue;
      } 
      paramArrayOfint = null;
      break;
    } 
    b b1 = this.b;
    if (paramArrayOfint == b1)
      return; 
    if (b1 != null)
      b(); 
    this.b = (b)paramArrayOfint;
    if (paramArrayOfint != null)
      a((b)paramArrayOfint); 
  }
  
  public void a(int[] paramArrayOfint, ValueAnimator paramValueAnimator) {
    b b1 = new b(paramArrayOfint, paramValueAnimator);
    paramValueAnimator.addListener(this.d);
    this.a.add(b1);
  }
  
  class a extends AnimatorListenerAdapter {
    a(e this$0) {}
    
    public void onAnimationEnd(Animator param1Animator) {
      e e1 = this.a;
      if (e1.c == param1Animator)
        e1.c = null; 
    }
  }
  
  static class b {
    final int[] a;
    
    final ValueAnimator b;
    
    b(int[] param1ArrayOfint, ValueAnimator param1ValueAnimator) {
      this.a = param1ArrayOfint;
      this.b = param1ValueAnimator;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/internal/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */