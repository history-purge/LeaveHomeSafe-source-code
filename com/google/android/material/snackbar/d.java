package com.google.android.material.snackbar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import b.g.m.v;
import com.google.android.material.internal.g;
import e.f.a.f.k;

public class d extends FrameLayout {
  private static final View.OnTouchListener h = new a();
  
  private c c;
  
  private b d;
  
  private int e;
  
  private final float f;
  
  private final float g;
  
  protected d(Context paramContext) {
    this(paramContext, null);
  }
  
  protected d(Context paramContext, AttributeSet paramAttributeSet) {
    super(g.b(paramContext, paramAttributeSet, 0, 0), paramAttributeSet);
    TypedArray typedArray = getContext().obtainStyledAttributes(paramAttributeSet, k.SnackbarLayout);
    if (typedArray.hasValue(k.SnackbarLayout_elevation))
      v.a((View)this, typedArray.getDimensionPixelSize(k.SnackbarLayout_elevation, 0)); 
    this.e = typedArray.getInt(k.SnackbarLayout_animationMode, 0);
    this.f = typedArray.getFloat(k.SnackbarLayout_backgroundOverlayColorAlpha, 1.0F);
    this.g = typedArray.getFloat(k.SnackbarLayout_actionTextColorAlpha, 1.0F);
    typedArray.recycle();
    setOnTouchListener(h);
    setFocusable(true);
  }
  
  float getActionTextColorAlpha() {
    return this.g;
  }
  
  int getAnimationMode() {
    return this.e;
  }
  
  float getBackgroundOverlayColorAlpha() {
    return this.f;
  }
  
  protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    b b1 = this.d;
    if (b1 != null)
      b1.onViewAttachedToWindow((View)this); 
    v.N((View)this);
  }
  
  protected void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    b b1 = this.d;
    if (b1 != null)
      b1.onViewDetachedFromWindow((View)this); 
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    c c1 = this.c;
    if (c1 != null)
      c1.a((View)this, paramInt1, paramInt2, paramInt3, paramInt4); 
  }
  
  void setAnimationMode(int paramInt) {
    this.e = paramInt;
  }
  
  void setOnAttachStateChangeListener(b paramb) {
    this.d = paramb;
  }
  
  public void setOnClickListener(View.OnClickListener paramOnClickListener) {
    View.OnTouchListener onTouchListener;
    if (paramOnClickListener != null) {
      onTouchListener = null;
    } else {
      onTouchListener = h;
    } 
    setOnTouchListener(onTouchListener);
    super.setOnClickListener(paramOnClickListener);
  }
  
  void setOnLayoutChangeListener(c paramc) {
    this.c = paramc;
  }
  
  static final class a implements View.OnTouchListener {
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View param1View, MotionEvent param1MotionEvent) {
      return true;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/snackbar/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */