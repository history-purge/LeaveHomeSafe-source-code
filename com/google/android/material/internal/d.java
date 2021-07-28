package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.i0;
import e.f.a.f.k;

public class d extends i0 {
  private Drawable r;
  
  private final Rect s = new Rect();
  
  private final Rect t = new Rect();
  
  private int u = 119;
  
  protected boolean v = true;
  
  boolean w = false;
  
  public d(Context paramContext) {
    this(paramContext, null);
  }
  
  public d(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public d(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    TypedArray typedArray = g.c(paramContext, paramAttributeSet, k.ForegroundLinearLayout, paramInt, 0, new int[0]);
    this.u = typedArray.getInt(k.ForegroundLinearLayout_android_foregroundGravity, this.u);
    Drawable drawable = typedArray.getDrawable(k.ForegroundLinearLayout_android_foreground);
    if (drawable != null)
      setForeground(drawable); 
    this.v = typedArray.getBoolean(k.ForegroundLinearLayout_foregroundInsidePadding, true);
    typedArray.recycle();
  }
  
  public void draw(Canvas paramCanvas) {
    super.draw(paramCanvas);
    Drawable drawable = this.r;
    if (drawable != null) {
      if (this.w) {
        this.w = false;
        Rect rect1 = this.s;
        Rect rect2 = this.t;
        int i = getRight() - getLeft();
        int j = getBottom() - getTop();
        if (this.v) {
          rect1.set(0, 0, i, j);
        } else {
          rect1.set(getPaddingLeft(), getPaddingTop(), i - getPaddingRight(), j - getPaddingBottom());
        } 
        Gravity.apply(this.u, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect1, rect2);
        drawable.setBounds(rect2);
      } 
      drawable.draw(paramCanvas);
    } 
  }
  
  @TargetApi(21)
  public void drawableHotspotChanged(float paramFloat1, float paramFloat2) {
    super.drawableHotspotChanged(paramFloat1, paramFloat2);
    Drawable drawable = this.r;
    if (drawable != null)
      drawable.setHotspot(paramFloat1, paramFloat2); 
  }
  
  protected void drawableStateChanged() {
    super.drawableStateChanged();
    Drawable drawable = this.r;
    if (drawable != null && drawable.isStateful())
      this.r.setState(getDrawableState()); 
  }
  
  public Drawable getForeground() {
    return this.r;
  }
  
  public int getForegroundGravity() {
    return this.u;
  }
  
  public void jumpDrawablesToCurrentState() {
    super.jumpDrawablesToCurrentState();
    Drawable drawable = this.r;
    if (drawable != null)
      drawable.jumpToCurrentState(); 
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    this.w = paramBoolean | this.w;
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    this.w = true;
  }
  
  public void setForeground(Drawable paramDrawable) {
    Drawable drawable = this.r;
    if (drawable != paramDrawable) {
      if (drawable != null) {
        drawable.setCallback(null);
        unscheduleDrawable(this.r);
      } 
      this.r = paramDrawable;
      if (paramDrawable != null) {
        setWillNotDraw(false);
        paramDrawable.setCallback((Drawable.Callback)this);
        if (paramDrawable.isStateful())
          paramDrawable.setState(getDrawableState()); 
        if (this.u == 119)
          paramDrawable.getPadding(new Rect()); 
      } else {
        setWillNotDraw(true);
      } 
      requestLayout();
      invalidate();
    } 
  }
  
  public void setForegroundGravity(int paramInt) {
    if (this.u != paramInt) {
      int i = paramInt;
      if ((0x800007 & paramInt) == 0)
        i = paramInt | 0x800003; 
      paramInt = i;
      if ((i & 0x70) == 0)
        paramInt = i | 0x30; 
      this.u = paramInt;
      if (this.u == 119 && this.r != null) {
        Rect rect = new Rect();
        this.r.getPadding(rect);
      } 
      requestLayout();
    } 
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable) {
    return (super.verifyDrawable(paramDrawable) || paramDrawable == this.r);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/internal/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */