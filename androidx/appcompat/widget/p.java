package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;
import b.a.a;
import b.a.k.a.a;
import b.g.m.u;

public class p extends MultiAutoCompleteTextView implements u {
  private static final int[] e = new int[] { 16843126 };
  
  private final e c;
  
  private final y d;
  
  public p(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, a.autoCompleteTextViewStyle);
  }
  
  public p(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(u0.b(paramContext), paramAttributeSet, paramInt);
    s0.a((View)this, getContext());
    x0 x0 = x0.a(getContext(), paramAttributeSet, e, paramInt, 0);
    if (x0.g(0))
      setDropDownBackgroundDrawable(x0.b(0)); 
    x0.b();
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
  
  public ColorStateList getSupportBackgroundTintList() {
    e e1 = this.c;
    return (e1 != null) ? e1.b() : null;
  }
  
  public PorterDuff.Mode getSupportBackgroundTintMode() {
    e e1 = this.c;
    return (e1 != null) ? e1.c() : null;
  }
  
  public InputConnection onCreateInputConnection(EditorInfo paramEditorInfo) {
    InputConnection inputConnection = super.onCreateInputConnection(paramEditorInfo);
    l.a(inputConnection, paramEditorInfo, (View)this);
    return inputConnection;
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
  
  public void setDropDownBackgroundResource(int paramInt) {
    setDropDownBackgroundDrawable(a.c(getContext(), paramInt));
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
  
  public void setTextAppearance(Context paramContext, int paramInt) {
    super.setTextAppearance(paramContext, paramInt);
    y y1 = this.d;
    if (y1 != null)
      y1.a(paramContext, paramInt); 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/widget/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */