package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.i0;
import androidx.appcompat.widget.z0;
import androidx.core.widget.i;
import b.g.e.d.f;
import b.g.m.e0.c;
import b.g.m.v;
import e.f.a.f.d;
import e.f.a.f.e;
import e.f.a.f.f;
import e.f.a.f.h;

public class NavigationMenuItemView extends d implements o.a {
  private static final int[] H = new int[] { 16842912 };
  
  private final CheckedTextView A;
  
  private FrameLayout B;
  
  private j C;
  
  private ColorStateList D;
  
  private boolean E;
  
  private Drawable F;
  
  private final b.g.m.a G = new a(this);
  
  private int x;
  
  private boolean y;
  
  boolean z;
  
  public NavigationMenuItemView(Context paramContext) {
    this(paramContext, null);
  }
  
  public NavigationMenuItemView(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public NavigationMenuItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    setOrientation(0);
    LayoutInflater.from(paramContext).inflate(h.design_navigation_menu_item, (ViewGroup)this, true);
    setIconSize(paramContext.getResources().getDimensionPixelSize(d.design_navigation_icon_size));
    this.A = (CheckedTextView)findViewById(f.design_menu_item_text);
    this.A.setDuplicateParentStateEnabled(true);
    v.a((View)this.A, this.G);
  }
  
  private void d() {
    byte b;
    i0.a a1;
    if (f()) {
      this.A.setVisibility(8);
      FrameLayout frameLayout = this.B;
      if (frameLayout != null) {
        a1 = (i0.a)frameLayout.getLayoutParams();
        b = -1;
      } else {
        return;
      } 
    } else {
      this.A.setVisibility(0);
      FrameLayout frameLayout = this.B;
      if (frameLayout != null) {
        a1 = (i0.a)frameLayout.getLayoutParams();
        b = -2;
      } else {
        return;
      } 
    } 
    ((ViewGroup.MarginLayoutParams)a1).width = b;
    this.B.setLayoutParams((ViewGroup.LayoutParams)a1);
  }
  
  private StateListDrawable e() {
    TypedValue typedValue = new TypedValue();
    if (getContext().getTheme().resolveAttribute(b.a.a.colorControlHighlight, typedValue, true)) {
      StateListDrawable stateListDrawable = new StateListDrawable();
      stateListDrawable.addState(H, (Drawable)new ColorDrawable(typedValue.data));
      stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, (Drawable)new ColorDrawable(0));
      return stateListDrawable;
    } 
    return null;
  }
  
  private boolean f() {
    return (this.C.getTitle() == null && this.C.getIcon() == null && this.C.getActionView() != null);
  }
  
  private void setActionView(View paramView) {
    if (paramView != null) {
      if (this.B == null)
        this.B = (FrameLayout)((ViewStub)findViewById(f.design_menu_item_action_area_stub)).inflate(); 
      this.B.removeAllViews();
      this.B.addView(paramView);
    } 
  }
  
  public void a(j paramj, int paramInt) {
    this.C = paramj;
    if (paramj.isVisible()) {
      paramInt = 0;
    } else {
      paramInt = 8;
    } 
    setVisibility(paramInt);
    if (getBackground() == null)
      v.a((View)this, (Drawable)e()); 
    setCheckable(paramj.isCheckable());
    setChecked(paramj.isChecked());
    setEnabled(paramj.isEnabled());
    setTitle(paramj.getTitle());
    setIcon(paramj.getIcon());
    setActionView(paramj.getActionView());
    setContentDescription(paramj.getContentDescription());
    z0.a((View)this, paramj.getTooltipText());
    d();
  }
  
  public boolean a() {
    return false;
  }
  
  public j getItemData() {
    return this.C;
  }
  
  protected int[] onCreateDrawableState(int paramInt) {
    int[] arrayOfInt = super.onCreateDrawableState(paramInt + 1);
    j j1 = this.C;
    if (j1 != null && j1.isCheckable() && this.C.isChecked())
      ViewGroup.mergeDrawableStates(arrayOfInt, H); 
    return arrayOfInt;
  }
  
  public void setCheckable(boolean paramBoolean) {
    refreshDrawableState();
    if (this.z != paramBoolean) {
      this.z = paramBoolean;
      this.G.a((View)this.A, 2048);
    } 
  }
  
  public void setChecked(boolean paramBoolean) {
    refreshDrawableState();
    this.A.setChecked(paramBoolean);
  }
  
  public void setHorizontalPadding(int paramInt) {
    setPadding(paramInt, 0, paramInt, 0);
  }
  
  public void setIcon(Drawable paramDrawable) {
    if (paramDrawable != null) {
      Drawable drawable = paramDrawable;
      if (this.E) {
        Drawable.ConstantState constantState = paramDrawable.getConstantState();
        if (constantState != null)
          paramDrawable = constantState.newDrawable(); 
        drawable = androidx.core.graphics.drawable.a.i(paramDrawable).mutate();
        androidx.core.graphics.drawable.a.a(drawable, this.D);
      } 
      int i = this.x;
      drawable.setBounds(0, 0, i, i);
      paramDrawable = drawable;
    } else if (this.y) {
      if (this.F == null) {
        this.F = f.b(getResources(), e.navigation_empty_icon, getContext().getTheme());
        paramDrawable = this.F;
        if (paramDrawable != null) {
          int i = this.x;
          paramDrawable.setBounds(0, 0, i, i);
        } 
      } 
      paramDrawable = this.F;
    } 
    i.a((TextView)this.A, paramDrawable, null, null, null);
  }
  
  public void setIconPadding(int paramInt) {
    this.A.setCompoundDrawablePadding(paramInt);
  }
  
  public void setIconSize(int paramInt) {
    this.x = paramInt;
  }
  
  void setIconTintList(ColorStateList paramColorStateList) {
    boolean bool;
    this.D = paramColorStateList;
    if (this.D != null) {
      bool = true;
    } else {
      bool = false;
    } 
    this.E = bool;
    j j1 = this.C;
    if (j1 != null)
      setIcon(j1.getIcon()); 
  }
  
  public void setMaxLines(int paramInt) {
    this.A.setMaxLines(paramInt);
  }
  
  public void setNeedsEmptyIcon(boolean paramBoolean) {
    this.y = paramBoolean;
  }
  
  public void setTextAppearance(int paramInt) {
    i.d((TextView)this.A, paramInt);
  }
  
  public void setTextColor(ColorStateList paramColorStateList) {
    this.A.setTextColor(paramColorStateList);
  }
  
  public void setTitle(CharSequence paramCharSequence) {
    this.A.setText(paramCharSequence);
  }
  
  class a extends b.g.m.a {
    a(NavigationMenuItemView this$0) {}
    
    public void a(View param1View, c param1c) {
      super.a(param1View, param1c);
      param1c.b(this.d.z);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/internal/NavigationMenuItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */