package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.g.i.a;
import b.g.m.d;
import b.g.m.d0;
import b.g.m.v;
import java.util.List;

abstract class b extends c<View> {
  final Rect d = new Rect();
  
  final Rect e = new Rect();
  
  private int f = 0;
  
  private int g;
  
  public b() {}
  
  public b(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
  }
  
  private static int c(int paramInt) {
    int i = paramInt;
    if (paramInt == 0)
      i = 8388659; 
    return i;
  }
  
  final int a(View paramView) {
    if (this.g == 0)
      return 0; 
    float f = b(paramView);
    int i = this.g;
    return a.a((int)(f * i), 0, i);
  }
  
  abstract View a(List<View> paramList);
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = (paramView.getLayoutParams()).height;
    if (i == -1 || i == -2) {
      View view = a(paramCoordinatorLayout.b(paramView));
      if (view != null) {
        int j = View.MeasureSpec.getSize(paramInt3);
        if (j > 0) {
          paramInt3 = j;
          if (v.m(view)) {
            d0 d0 = paramCoordinatorLayout.getLastWindowInsets();
            paramInt3 = j;
            if (d0 != null)
              paramInt3 = j + d0.g() + d0.d(); 
          } 
        } else {
          paramInt3 = paramCoordinatorLayout.getHeight();
        } 
        paramInt3 += c(view);
        j = view.getMeasuredHeight();
        if (e()) {
          paramView.setTranslationY(-j);
        } else {
          paramInt3 -= j;
        } 
        if (i == -1) {
          j = 1073741824;
        } else {
          j = Integer.MIN_VALUE;
        } 
        paramCoordinatorLayout.a(paramView, paramInt1, paramInt2, View.MeasureSpec.makeMeasureSpec(paramInt3, j), paramInt4);
        return true;
      } 
    } 
    return false;
  }
  
  abstract float b(View paramView);
  
  public final void b(int paramInt) {
    this.g = paramInt;
  }
  
  protected void b(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt) {
    Rect rect;
    View view = a(paramCoordinatorLayout.b(paramView));
    if (view != null) {
      CoordinatorLayout.f f = (CoordinatorLayout.f)paramView.getLayoutParams();
      Rect rect1 = this.d;
      rect1.set(paramCoordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams)f).leftMargin, view.getBottom() + ((ViewGroup.MarginLayoutParams)f).topMargin, paramCoordinatorLayout.getWidth() - paramCoordinatorLayout.getPaddingRight() - ((ViewGroup.MarginLayoutParams)f).rightMargin, paramCoordinatorLayout.getHeight() + view.getBottom() - paramCoordinatorLayout.getPaddingBottom() - ((ViewGroup.MarginLayoutParams)f).bottomMargin);
      d0 d0 = paramCoordinatorLayout.getLastWindowInsets();
      if (d0 != null && v.m((View)paramCoordinatorLayout) && !v.m(paramView)) {
        rect1.left += d0.e();
        rect1.right -= d0.f();
      } 
      rect = this.e;
      d.a(c(f.c), paramView.getMeasuredWidth(), paramView.getMeasuredHeight(), rect1, rect, paramInt);
      paramInt = a(view);
      paramView.layout(rect.left, rect.top - paramInt, rect.right, rect.bottom - paramInt);
      paramInt = rect.top - view.getBottom();
    } else {
      super.b((CoordinatorLayout)rect, paramView, paramInt);
      paramInt = 0;
    } 
    this.f = paramInt;
  }
  
  public final int c() {
    return this.g;
  }
  
  int c(View paramView) {
    return paramView.getMeasuredHeight();
  }
  
  final int d() {
    return this.f;
  }
  
  protected boolean e() {
    return false;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/appbar/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */