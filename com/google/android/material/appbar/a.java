package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.g.m.v;

abstract class a<V extends View> extends c<V> {
  private Runnable d;
  
  OverScroller e;
  
  private boolean f;
  
  private int g = -1;
  
  private int h;
  
  private int i = -1;
  
  private VelocityTracker j;
  
  public a() {}
  
  public a(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
  }
  
  private void d() {
    if (this.j == null)
      this.j = VelocityTracker.obtain(); 
  }
  
  final int a(CoordinatorLayout paramCoordinatorLayout, V paramV, int paramInt1, int paramInt2, int paramInt3) {
    return b(paramCoordinatorLayout, paramV, c() - paramInt1, paramInt2, paramInt3);
  }
  
  abstract boolean a(V paramV);
  
  final boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, int paramInt1, int paramInt2, float paramFloat) {
    Runnable runnable = this.d;
    if (runnable != null) {
      paramV.removeCallbacks(runnable);
      this.d = null;
    } 
    if (this.e == null)
      this.e = new OverScroller(paramV.getContext()); 
    this.e.fling(0, b(), 0, Math.round(paramFloat), 0, 0, paramInt1, paramInt2);
    if (this.e.computeScrollOffset()) {
      this.d = new a(this, paramCoordinatorLayout, paramV);
      v.a((View)paramV, this.d);
      return true;
    } 
    e(paramCoordinatorLayout, paramV);
    return false;
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, MotionEvent paramMotionEvent) {
    if (this.i < 0)
      this.i = ViewConfiguration.get(paramCoordinatorLayout.getContext()).getScaledTouchSlop(); 
    if (paramMotionEvent.getAction() == 2 && this.f)
      return true; 
    int i = paramMotionEvent.getActionMasked();
    if (i != 0) {
      if (i != 1)
        if (i != 2) {
          if (i != 3)
            VelocityTracker velocityTracker1 = this.j; 
        } else {
          i = this.g;
          if (i != -1) {
            i = paramMotionEvent.findPointerIndex(i);
            if (i != -1) {
              i = (int)paramMotionEvent.getY(i);
              if (Math.abs(i - this.h) > this.i) {
                this.f = true;
                this.h = i;
              } 
            } 
          } 
          VelocityTracker velocityTracker1 = this.j;
        }  
      this.f = false;
      this.g = -1;
      velocityTracker = this.j;
      if (velocityTracker != null) {
        velocityTracker.recycle();
        this.j = null;
      } 
    } else {
      this.f = false;
      i = (int)paramMotionEvent.getX();
      int j = (int)paramMotionEvent.getY();
      if (a(paramV) && velocityTracker.a((View)paramV, i, j)) {
        this.h = j;
        this.g = paramMotionEvent.getPointerId(0);
        d();
      } 
    } 
    VelocityTracker velocityTracker = this.j;
  }
  
  abstract int b(V paramV);
  
  abstract int b(CoordinatorLayout paramCoordinatorLayout, V paramV, int paramInt1, int paramInt2, int paramInt3);
  
  public boolean b(CoordinatorLayout paramCoordinatorLayout, V paramV, MotionEvent paramMotionEvent) {
    if (this.i < 0)
      this.i = ViewConfiguration.get(paramCoordinatorLayout.getContext()).getScaledTouchSlop(); 
    int i = paramMotionEvent.getActionMasked();
    if (i != 0) {
      if (i != 1) {
        if (i != 2) {
          if (i != 3)
            velocityTracker = this.j; 
        } else {
          i = paramMotionEvent.findPointerIndex(this.g);
          if (i == -1)
            return false; 
          int k = (int)paramMotionEvent.getY(i);
          int j = this.h - k;
          i = j;
          if (!this.f) {
            int m = Math.abs(j);
            int n = this.i;
            i = j;
            if (m > n) {
              this.f = true;
              if (j > 0) {
                i = j - n;
              } else {
                i = j + n;
              } 
            } 
          } 
          if (this.f) {
            this.h = k;
            a((CoordinatorLayout)velocityTracker, paramV, i, b(paramV), 0);
          } 
          velocityTracker = this.j;
        } 
      } else {
        VelocityTracker velocityTracker1 = this.j;
        if (velocityTracker1 != null) {
          velocityTracker1.addMovement(paramMotionEvent);
          this.j.computeCurrentVelocity(1000);
          float f = this.j.getYVelocity(this.g);
          a((CoordinatorLayout)velocityTracker, paramV, -c(paramV), 0, f);
        } 
      } 
      this.f = false;
      this.g = -1;
      velocityTracker = this.j;
      if (velocityTracker != null) {
        velocityTracker.recycle();
        this.j = null;
      } 
    } else {
      i = (int)paramMotionEvent.getX();
      int j = (int)paramMotionEvent.getY();
      if (velocityTracker.a((View)paramV, i, j) && a(paramV)) {
        this.h = j;
        this.g = paramMotionEvent.getPointerId(0);
        d();
      } else {
        return false;
      } 
    } 
    VelocityTracker velocityTracker = this.j;
  }
  
  abstract int c();
  
  abstract int c(V paramV);
  
  int c(CoordinatorLayout paramCoordinatorLayout, V paramV, int paramInt) {
    return b(paramCoordinatorLayout, paramV, paramInt, -2147483648, 2147483647);
  }
  
  abstract void e(CoordinatorLayout paramCoordinatorLayout, V paramV);
  
  private class a implements Runnable {
    private final CoordinatorLayout c;
    
    private final V d;
    
    a(a this$0, CoordinatorLayout param1CoordinatorLayout, V param1V) {
      this.c = param1CoordinatorLayout;
      this.d = param1V;
    }
    
    public void run() {
      if (this.d != null) {
        OverScroller overScroller = this.e.e;
        if (overScroller != null) {
          if (overScroller.computeScrollOffset()) {
            a<V> a1 = this.e;
            a1.c(this.c, this.d, a1.e.getCurrY());
            v.a((View)this.d, this);
            return;
          } 
          this.e.e(this.c, this.d);
        } 
      } 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/appbar/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */