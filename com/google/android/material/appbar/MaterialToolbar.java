package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import b.g.m.v;
import com.google.android.material.internal.g;
import e.f.a.f.a0.g;
import e.f.a.f.a0.h;
import e.f.a.f.b;
import e.f.a.f.j;

public class MaterialToolbar extends Toolbar {
  private static final int R = j.Widget_MaterialComponents_Toolbar;
  
  public MaterialToolbar(Context paramContext) {
    this(paramContext, null);
  }
  
  public MaterialToolbar(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, b.toolbarStyle);
  }
  
  public MaterialToolbar(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(g.b(paramContext, paramAttributeSet, paramInt, R), paramAttributeSet, paramInt);
    a(getContext());
  }
  
  private void a(Context paramContext) {
    boolean bool;
    Drawable drawable = getBackground();
    if (drawable != null && !(drawable instanceof ColorDrawable))
      return; 
    g g = new g();
    if (drawable != null) {
      bool = ((ColorDrawable)drawable).getColor();
    } else {
      bool = false;
    } 
    g.a(ColorStateList.valueOf(bool));
    g.a(paramContext);
    g.a(v.l((View)this));
    v.a((View)this, (Drawable)g);
  }
  
  protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    h.a((View)this);
  }
  
  public void setElevation(float paramFloat) {
    super.setElevation(paramFloat);
    h.a((View)this, paramFloat);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/appbar/MaterialToolbar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */