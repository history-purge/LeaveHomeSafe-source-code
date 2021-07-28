package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.google.android.material.internal.c;
import com.google.android.material.internal.g;
import e.f.a.f.j;
import e.f.a.f.k;

public class ChipGroup extends c {
  private int f;
  
  private int g;
  
  private boolean h;
  
  private d i;
  
  private final b j = new b(null);
  
  private e k = new e(null);
  
  private int l = -1;
  
  private boolean m = false;
  
  public ChipGroup(Context paramContext) {
    this(paramContext, null);
  }
  
  public ChipGroup(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, e.f.a.f.b.chipGroupStyle);
  }
  
  public ChipGroup(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    TypedArray typedArray = g.c(paramContext, paramAttributeSet, k.ChipGroup, paramInt, j.Widget_MaterialComponents_ChipGroup, new int[0]);
    paramInt = typedArray.getDimensionPixelOffset(k.ChipGroup_chipSpacing, 0);
    setChipSpacingHorizontal(typedArray.getDimensionPixelOffset(k.ChipGroup_chipSpacingHorizontal, paramInt));
    setChipSpacingVertical(typedArray.getDimensionPixelOffset(k.ChipGroup_chipSpacingVertical, paramInt));
    setSingleLine(typedArray.getBoolean(k.ChipGroup_singleLine, false));
    setSingleSelection(typedArray.getBoolean(k.ChipGroup_singleSelection, false));
    paramInt = typedArray.getResourceId(k.ChipGroup_checkedChip, -1);
    if (paramInt != -1)
      this.l = paramInt; 
    typedArray.recycle();
    super.setOnHierarchyChangeListener(this.k);
  }
  
  private void a(int paramInt, boolean paramBoolean) {
    View view = findViewById(paramInt);
    if (view instanceof Chip) {
      this.m = true;
      ((Chip)view).setChecked(paramBoolean);
      this.m = false;
    } 
  }
  
  private void setCheckedId(int paramInt) {
    this.l = paramInt;
    d d1 = this.i;
    if (d1 != null && this.h)
      d1.a(this, paramInt); 
  }
  
  public boolean a() {
    return super.a();
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams) {
    if (paramView instanceof Chip) {
      Chip chip = (Chip)paramView;
      if (chip.isChecked()) {
        int i = this.l;
        if (i != -1 && this.h)
          a(i, false); 
        setCheckedId(chip.getId());
      } 
    } 
    super.addView(paramView, paramInt, paramLayoutParams);
  }
  
  public void b() {
    this.m = true;
    for (int i = 0; i < getChildCount(); i++) {
      View view = getChildAt(i);
      if (view instanceof Chip)
        ((Chip)view).setChecked(false); 
    } 
    this.m = false;
    setCheckedId(-1);
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    return (super.checkLayoutParams(paramLayoutParams) && paramLayoutParams instanceof c);
  }
  
  protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
    return (ViewGroup.LayoutParams)new c(-2, -2);
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet) {
    return (ViewGroup.LayoutParams)new c(getContext(), paramAttributeSet);
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    return (ViewGroup.LayoutParams)new c(paramLayoutParams);
  }
  
  public int getCheckedChipId() {
    return this.h ? this.l : -1;
  }
  
  public int getChipSpacingHorizontal() {
    return this.f;
  }
  
  public int getChipSpacingVertical() {
    return this.g;
  }
  
  protected void onFinishInflate() {
    super.onFinishInflate();
    int i = this.l;
    if (i != -1) {
      a(i, true);
      setCheckedId(this.l);
    } 
  }
  
  public void setChipSpacing(int paramInt) {
    setChipSpacingHorizontal(paramInt);
    setChipSpacingVertical(paramInt);
  }
  
  public void setChipSpacingHorizontal(int paramInt) {
    if (this.f != paramInt) {
      this.f = paramInt;
      setItemSpacing(paramInt);
      requestLayout();
    } 
  }
  
  public void setChipSpacingHorizontalResource(int paramInt) {
    setChipSpacingHorizontal(getResources().getDimensionPixelOffset(paramInt));
  }
  
  public void setChipSpacingResource(int paramInt) {
    setChipSpacing(getResources().getDimensionPixelOffset(paramInt));
  }
  
  public void setChipSpacingVertical(int paramInt) {
    if (this.g != paramInt) {
      this.g = paramInt;
      setLineSpacing(paramInt);
      requestLayout();
    } 
  }
  
  public void setChipSpacingVerticalResource(int paramInt) {
    setChipSpacingVertical(getResources().getDimensionPixelOffset(paramInt));
  }
  
  @Deprecated
  public void setDividerDrawableHorizontal(Drawable paramDrawable) {
    throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
  }
  
  @Deprecated
  public void setDividerDrawableVertical(Drawable paramDrawable) {
    throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
  }
  
  @Deprecated
  public void setFlexWrap(int paramInt) {
    throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
  }
  
  public void setOnCheckedChangeListener(d paramd) {
    this.i = paramd;
  }
  
  public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener paramOnHierarchyChangeListener) {
    e.a(this.k, paramOnHierarchyChangeListener);
  }
  
  @Deprecated
  public void setShowDividerHorizontal(int paramInt) {
    throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
  }
  
  @Deprecated
  public void setShowDividerVertical(int paramInt) {
    throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
  }
  
  public void setSingleLine(int paramInt) {
    setSingleLine(getResources().getBoolean(paramInt));
  }
  
  public void setSingleLine(boolean paramBoolean) {
    super.setSingleLine(paramBoolean);
  }
  
  public void setSingleSelection(int paramInt) {
    setSingleSelection(getResources().getBoolean(paramInt));
  }
  
  public void setSingleSelection(boolean paramBoolean) {
    if (this.h != paramBoolean) {
      this.h = paramBoolean;
      b();
    } 
  }
  
  private class b implements CompoundButton.OnCheckedChangeListener {
    private b(ChipGroup this$0) {}
    
    public void onCheckedChanged(CompoundButton param1CompoundButton, boolean param1Boolean) {
      if (ChipGroup.a(this.a))
        return; 
      int i = param1CompoundButton.getId();
      if (param1Boolean) {
        if (ChipGroup.b(this.a) != -1 && ChipGroup.b(this.a) != i && ChipGroup.c(this.a)) {
          ChipGroup chipGroup = this.a;
          ChipGroup.a(chipGroup, ChipGroup.b(chipGroup), false);
        } 
        ChipGroup.a(this.a, i);
        return;
      } 
      if (ChipGroup.b(this.a) == i)
        ChipGroup.a(this.a, -1); 
    }
  }
  
  public static class c extends ViewGroup.MarginLayoutParams {
    public c(int param1Int1, int param1Int2) {
      super(param1Int1, param1Int2);
    }
    
    public c(Context param1Context, AttributeSet param1AttributeSet) {
      super(param1Context, param1AttributeSet);
    }
    
    public c(ViewGroup.LayoutParams param1LayoutParams) {
      super(param1LayoutParams);
    }
  }
  
  public static interface d {
    void a(ChipGroup param1ChipGroup, int param1Int);
  }
  
  private class e implements ViewGroup.OnHierarchyChangeListener {
    private ViewGroup.OnHierarchyChangeListener c;
    
    private e(ChipGroup this$0) {}
    
    public void onChildViewAdded(View param1View1, View param1View2) {
      if (param1View1 == this.d && param1View2 instanceof Chip) {
        if (param1View2.getId() == -1) {
          int i;
          if (Build.VERSION.SDK_INT >= 17) {
            i = View.generateViewId();
          } else {
            i = param1View2.hashCode();
          } 
          param1View2.setId(i);
        } 
        ((Chip)param1View2).setOnCheckedChangeListenerInternal(ChipGroup.d(this.d));
      } 
      ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.c;
      if (onHierarchyChangeListener != null)
        onHierarchyChangeListener.onChildViewAdded(param1View1, param1View2); 
    }
    
    public void onChildViewRemoved(View param1View1, View param1View2) {
      if (param1View1 == this.d && param1View2 instanceof Chip)
        ((Chip)param1View2).setOnCheckedChangeListenerInternal(null); 
      ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.c;
      if (onHierarchyChangeListener != null)
        onHierarchyChangeListener.onChildViewRemoved(param1View1, param1View2); 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/chip/ChipGroup.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */