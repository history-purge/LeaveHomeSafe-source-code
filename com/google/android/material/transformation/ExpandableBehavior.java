package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.g.m.v;
import e.f.a.f.u.b;
import java.util.List;

public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {
  private int a = 0;
  
  public ExpandableBehavior() {}
  
  public ExpandableBehavior(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
  }
  
  private boolean a(boolean paramBoolean) {
    boolean bool2 = false;
    boolean bool1 = false;
    if (paramBoolean) {
      int i = this.a;
      if (i != 0) {
        paramBoolean = bool1;
        return (i == 2) ? true : paramBoolean;
      } 
    } else {
      paramBoolean = bool2;
      if (this.a == 1)
        paramBoolean = true; 
      return paramBoolean;
    } 
    return true;
  }
  
  protected abstract boolean a(View paramView1, View paramView2, boolean paramBoolean1, boolean paramBoolean2);
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt) {
    if (!v.I(paramView)) {
      b b = e(paramCoordinatorLayout, paramView);
      if (b != null && a(b.a())) {
        if (b.a()) {
          paramInt = 1;
        } else {
          paramInt = 2;
        } 
        this.a = paramInt;
        paramInt = this.a;
        paramView.getViewTreeObserver().addOnPreDrawListener(new a(this, paramView, paramInt, b));
      } 
    } 
    return false;
  }
  
  public boolean b(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2) {
    b b = (b)paramView2;
    if (a(b.a())) {
      byte b1;
      if (b.a()) {
        b1 = 1;
      } else {
        b1 = 2;
      } 
      this.a = b1;
      return a((View)b, paramView1, b.a(), true);
    } 
    return false;
  }
  
  protected b e(CoordinatorLayout paramCoordinatorLayout, View paramView) {
    List<View> list = paramCoordinatorLayout.b(paramView);
    int j = list.size();
    for (int i = 0; i < j; i++) {
      View view = list.get(i);
      if (a(paramCoordinatorLayout, paramView, view))
        return (b)view; 
    } 
    return null;
  }
  
  class a implements ViewTreeObserver.OnPreDrawListener {
    a(ExpandableBehavior this$0, View param1View, int param1Int, b param1b) {}
    
    public boolean onPreDraw() {
      this.c.getViewTreeObserver().removeOnPreDrawListener(this);
      if (ExpandableBehavior.a(this.f) == this.d) {
        ExpandableBehavior expandableBehavior = this.f;
        b b1 = this.e;
        expandableBehavior.a((View)b1, this.c, b1.a(), false);
      } 
      return false;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/transformation/ExpandableBehavior.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */