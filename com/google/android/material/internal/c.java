package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import b.g.m.g;
import b.g.m.v;
import e.f.a.f.k;

public class c extends ViewGroup {
  private int c;
  
  private int d;
  
  private boolean e = false;
  
  public c(Context paramContext) {
    this(paramContext, null);
  }
  
  public c(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public c(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext, paramAttributeSet);
  }
  
  @TargetApi(21)
  public c(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    a(paramContext, paramAttributeSet);
  }
  
  private static int a(int paramInt1, int paramInt2, int paramInt3) {
    return (paramInt2 != Integer.MIN_VALUE) ? ((paramInt2 != 1073741824) ? paramInt3 : paramInt1) : Math.min(paramInt3, paramInt1);
  }
  
  private void a(Context paramContext, AttributeSet paramAttributeSet) {
    TypedArray typedArray = paramContext.getTheme().obtainStyledAttributes(paramAttributeSet, k.FlowLayout, 0, 0);
    this.c = typedArray.getDimensionPixelSize(k.FlowLayout_lineSpacing, 0);
    this.d = typedArray.getDimensionPixelSize(k.FlowLayout_itemSpacing, 0);
    typedArray.recycle();
  }
  
  public boolean a() {
    return this.e;
  }
  
  protected int getItemSpacing() {
    return this.d;
  }
  
  protected int getLineSpacing() {
    return this.c;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (getChildCount() == 0)
      return; 
    paramInt2 = v.p((View)this);
    boolean bool = true;
    if (paramInt2 != 1)
      bool = false; 
    if (bool) {
      paramInt2 = getPaddingRight();
    } else {
      paramInt2 = getPaddingLeft();
    } 
    if (bool) {
      paramInt4 = getPaddingLeft();
    } else {
      paramInt4 = getPaddingRight();
    } 
    int j = getPaddingTop();
    int k = paramInt3 - paramInt1 - paramInt4;
    paramInt4 = paramInt2;
    paramInt3 = j;
    int i = 0;
    while (i < getChildCount()) {
      View view = getChildAt(i);
      if (view.getVisibility() == 8) {
        paramInt1 = paramInt3;
      } else {
        byte b1;
        byte b2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
          ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)layoutParams;
          b2 = g.b(marginLayoutParams);
          b1 = g.a(marginLayoutParams);
        } else {
          b1 = 0;
          b2 = 0;
        } 
        int n = view.getMeasuredWidth();
        int m = paramInt4;
        paramInt1 = paramInt3;
        if (!this.e) {
          m = paramInt4;
          paramInt1 = paramInt3;
          if (paramInt4 + b2 + n > k) {
            paramInt1 = j + this.c;
            m = paramInt2;
          } 
        } 
        paramInt4 = m + b2;
        n = view.getMeasuredWidth() + paramInt4;
        j = view.getMeasuredHeight() + paramInt1;
        paramInt3 = n;
        if (bool) {
          paramInt4 = k - n;
          paramInt3 = k - m - b2;
        } 
        view.layout(paramInt4, paramInt1, paramInt3, j);
        paramInt4 = m + b2 + b1 + view.getMeasuredWidth() + this.d;
      } 
      i++;
      paramInt3 = paramInt1;
    } 
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    int n;
    int i3 = View.MeasureSpec.getSize(paramInt1);
    int i4 = View.MeasureSpec.getMode(paramInt1);
    int i5 = View.MeasureSpec.getSize(paramInt2);
    int i6 = View.MeasureSpec.getMode(paramInt2);
    if (i4 == Integer.MIN_VALUE || i4 == 1073741824) {
      n = i3;
    } else {
      n = Integer.MAX_VALUE;
    } 
    int k = getPaddingLeft();
    int i = getPaddingTop();
    int i7 = getPaddingRight();
    int j = i;
    int i1 = 0;
    int m = 0;
    int i2 = i;
    i = m;
    while (i1 < getChildCount()) {
      View view = getChildAt(i1);
      if (view.getVisibility() != 8) {
        byte b1;
        byte b2;
        measureChild(view, paramInt1, paramInt2);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
          ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)layoutParams;
          b1 = marginLayoutParams.leftMargin + 0;
          b2 = marginLayoutParams.rightMargin + 0;
        } else {
          b1 = 0;
          b2 = 0;
        } 
        int i10 = view.getMeasuredWidth();
        int i9 = k;
        m = j;
        int i8 = i9;
        if (k + b1 + i10 > n - i7) {
          m = j;
          i8 = i9;
          if (!a()) {
            i8 = getPaddingLeft();
            m = this.c + i2;
          } 
        } 
        k = i8 + b1 + view.getMeasuredWidth();
        i2 = view.getMeasuredHeight();
        j = i;
        if (k > i)
          j = k; 
        k = view.getMeasuredWidth();
        i9 = this.d;
        i = j;
        if (i1 == getChildCount() - 1)
          i = j + b2; 
        i2 += m;
        k = i8 + b1 + b2 + k + i9;
        j = m;
      } 
      i1++;
    } 
    paramInt1 = getPaddingRight();
    paramInt2 = getPaddingBottom();
    setMeasuredDimension(a(i3, i4, i + paramInt1), a(i5, i6, i2 + paramInt2));
  }
  
  protected void setItemSpacing(int paramInt) {
    this.d = paramInt;
  }
  
  protected void setLineSpacing(int paramInt) {
    this.c = paramInt;
  }
  
  public void setSingleLine(boolean paramBoolean) {
    this.e = paramBoolean;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/internal/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */