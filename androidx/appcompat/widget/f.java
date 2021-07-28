package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.widget.b;
import androidx.core.widget.i;
import androidx.core.widget.k;
import b.a.a;
import b.g.m.u;

public class f extends Button implements u, b, k {
  private final e c;
  
  private final y d;
  
  public f(Context paramContext) {
    this(paramContext, null);
  }
  
  public f(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, a.buttonStyle);
  }
  
  public f(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(u0.b(paramContext), paramAttributeSet, paramInt);
    s0.a((View)this, getContext());
    this.c = new e((View)this);
    this.c.a(paramAttributeSet, paramInt);
    this.d = new y((TextView)this);
    this.d.a(paramAttributeSet, paramInt);
    this.d.a();
  }
  
  protected void drawableStateChanged() {
    super.drawableStateChanged();
    e e1 = this.c;
    if (e1 != null)
      e1.a(); 
    y y1 = this.d;
    if (y1 != null)
      y1.a(); 
  }
  
  public int getAutoSizeMaxTextSize() {
    if (b.a)
      return super.getAutoSizeMaxTextSize(); 
    y y1 = this.d;
    return (y1 != null) ? y1.c() : -1;
  }
  
  public int getAutoSizeMinTextSize() {
    if (b.a)
      return super.getAutoSizeMinTextSize(); 
    y y1 = this.d;
    return (y1 != null) ? y1.d() : -1;
  }
  
  public int getAutoSizeStepGranularity() {
    if (b.a)
      return super.getAutoSizeStepGranularity(); 
    y y1 = this.d;
    return (y1 != null) ? y1.e() : -1;
  }
  
  public int[] getAutoSizeTextAvailableSizes() {
    if (b.a)
      return super.getAutoSizeTextAvailableSizes(); 
    y y1 = this.d;
    return (y1 != null) ? y1.f() : new int[0];
  }
  
  @SuppressLint({"WrongConstant"})
  public int getAutoSizeTextType() {
    boolean bool1 = b.a;
    boolean bool = false;
    if (bool1) {
      if (super.getAutoSizeTextType() == 1)
        bool = true; 
      return bool;
    } 
    y y1 = this.d;
    return (y1 != null) ? y1.g() : 0;
  }
  
  public ColorStateList getSupportBackgroundTintList() {
    e e1 = this.c;
    return (e1 != null) ? e1.b() : null;
  }
  
  public PorterDuff.Mode getSupportBackgroundTintMode() {
    e e1 = this.c;
    return (e1 != null) ? e1.c() : null;
  }
  
  public ColorStateList getSupportCompoundDrawablesTintList() {
    return this.d.h();
  }
  
  public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
    return this.d.i();
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent) {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(Button.class.getName());
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo) {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    paramAccessibilityNodeInfo.setClassName(Button.class.getName());
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    y y1 = this.d;
    if (y1 != null)
      y1.a(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4); 
  }
  
  protected void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {
    super.onTextChanged(paramCharSequence, paramInt1, paramInt2, paramInt3);
    y y1 = this.d;
    if (y1 != null && !b.a && y1.j())
      this.d.b(); 
  }
  
  public void setAutoSizeTextTypeUniformWithConfiguration(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (b.a) {
      super.setAutoSizeTextTypeUniformWithConfiguration(paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    } 
    y y1 = this.d;
    if (y1 != null)
      y1.a(paramInt1, paramInt2, paramInt3, paramInt4); 
  }
  
  public void setAutoSizeTextTypeUniformWithPresetSizes(int[] paramArrayOfint, int paramInt) {
    if (b.a) {
      super.setAutoSizeTextTypeUniformWithPresetSizes(paramArrayOfint, paramInt);
      return;
    } 
    y y1 = this.d;
    if (y1 != null)
      y1.a(paramArrayOfint, paramInt); 
  }
  
  public void setAutoSizeTextTypeWithDefaults(int paramInt) {
    if (b.a) {
      super.setAutoSizeTextTypeWithDefaults(paramInt);
      return;
    } 
    y y1 = this.d;
    if (y1 != null)
      y1.a(paramInt); 
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable) {
    super.setBackgroundDrawable(paramDrawable);
    e e1 = this.c;
    if (e1 != null)
      e1.a(paramDrawable); 
  }
  
  public void setBackgroundResource(int paramInt) {
    super.setBackgroundResource(paramInt);
    e e1 = this.c;
    if (e1 != null)
      e1.a(paramInt); 
  }
  
  public void setCustomSelectionActionModeCallback(ActionMode.Callback paramCallback) {
    super.setCustomSelectionActionModeCallback(i.a((TextView)this, paramCallback));
  }
  
  public void setSupportAllCaps(boolean paramBoolean) {
    y y1 = this.d;
    if (y1 != null)
      y1.a(paramBoolean); 
  }
  
  public void setSupportBackgroundTintList(ColorStateList paramColorStateList) {
    e e1 = this.c;
    if (e1 != null)
      e1.b(paramColorStateList); 
  }
  
  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode) {
    e e1 = this.c;
    if (e1 != null)
      e1.a(paramMode); 
  }
  
  public void setSupportCompoundDrawablesTintList(ColorStateList paramColorStateList) {
    this.d.a(paramColorStateList);
    this.d.a();
  }
  
  public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode paramMode) {
    this.d.a(paramMode);
    this.d.a();
  }
  
  public void setTextAppearance(Context paramContext, int paramInt) {
    super.setTextAppearance(paramContext, paramInt);
    y y1 = this.d;
    if (y1 != null)
      y1.a(paramContext, paramInt); 
  }
  
  public void setTextSize(int paramInt, float paramFloat) {
    if (b.a) {
      super.setTextSize(paramInt, paramFloat);
      return;
    } 
    y y1 = this.d;
    if (y1 != null)
      y1.a(paramInt, paramFloat); 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/widget/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */