package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.core.widget.j;
import b.a.a;
import b.a.k.a.a;
import b.g.m.u;

public class g extends CheckBox implements j, u {
  private final i c;
  
  private final e d;
  
  private final y e;
  
  public g(Context paramContext) {
    this(paramContext, null);
  }
  
  public g(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, a.checkboxStyle);
  }
  
  public g(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(u0.b(paramContext), paramAttributeSet, paramInt);
    s0.a((View)this, getContext());
    this.c = new i((CompoundButton)this);
    this.c.a(paramAttributeSet, paramInt);
    this.d = new e((View)this);
    this.d.a(paramAttributeSet, paramInt);
    this.e = new y((TextView)this);
    this.e.a(paramAttributeSet, paramInt);
  }
  
  protected void drawableStateChanged() {
    super.drawableStateChanged();
    e e1 = this.d;
    if (e1 != null)
      e1.a(); 
    y y1 = this.e;
    if (y1 != null)
      y1.a(); 
  }
  
  public int getCompoundPaddingLeft() {
    int m = super.getCompoundPaddingLeft();
    i i1 = this.c;
    int k = m;
    if (i1 != null)
      k = i1.a(m); 
    return k;
  }
  
  public ColorStateList getSupportBackgroundTintList() {
    e e1 = this.d;
    return (e1 != null) ? e1.b() : null;
  }
  
  public PorterDuff.Mode getSupportBackgroundTintMode() {
    e e1 = this.d;
    return (e1 != null) ? e1.c() : null;
  }
  
  public ColorStateList getSupportButtonTintList() {
    i i1 = this.c;
    return (i1 != null) ? i1.b() : null;
  }
  
  public PorterDuff.Mode getSupportButtonTintMode() {
    i i1 = this.c;
    return (i1 != null) ? i1.c() : null;
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable) {
    super.setBackgroundDrawable(paramDrawable);
    e e1 = this.d;
    if (e1 != null)
      e1.a(paramDrawable); 
  }
  
  public void setBackgroundResource(int paramInt) {
    super.setBackgroundResource(paramInt);
    e e1 = this.d;
    if (e1 != null)
      e1.a(paramInt); 
  }
  
  public void setButtonDrawable(int paramInt) {
    setButtonDrawable(a.c(getContext(), paramInt));
  }
  
  public void setButtonDrawable(Drawable paramDrawable) {
    super.setButtonDrawable(paramDrawable);
    i i1 = this.c;
    if (i1 != null)
      i1.d(); 
  }
  
  public void setSupportBackgroundTintList(ColorStateList paramColorStateList) {
    e e1 = this.d;
    if (e1 != null)
      e1.b(paramColorStateList); 
  }
  
  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode) {
    e e1 = this.d;
    if (e1 != null)
      e1.a(paramMode); 
  }
  
  public void setSupportButtonTintList(ColorStateList paramColorStateList) {
    i i1 = this.c;
    if (i1 != null)
      i1.a(paramColorStateList); 
  }
  
  public void setSupportButtonTintMode(PorterDuff.Mode paramMode) {
    i i1 = this.c;
    if (i1 != null)
      i1.a(paramMode); 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/widget/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */