package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.widget.i;
import b.a.a;
import b.g.m.u;

public class k extends EditText implements u {
  private final e c;
  
  private final y d;
  
  private final x e;
  
  public k(Context paramContext) {
    this(paramContext, null);
  }
  
  public k(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, a.editTextStyle);
  }
  
  public k(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(u0.b(paramContext), paramAttributeSet, paramInt);
    s0.a((View)this, getContext());
    this.c = new e((View)this);
    this.c.a(paramAttributeSet, paramInt);
    this.d = new y((TextView)this);
    this.d.a(paramAttributeSet, paramInt);
    this.d.a();
    this.e = new x((TextView)this);
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
  
  public Editable getText() {
    return (Build.VERSION.SDK_INT >= 28) ? super.getText() : getEditableText();
  }
  
  public TextClassifier getTextClassifier() {
    if (Build.VERSION.SDK_INT < 28) {
      x x1 = this.e;
      if (x1 != null)
        return x1.a(); 
    } 
    return super.getTextClassifier();
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
  
  public void setCustomSelectionActionModeCallback(ActionMode.Callback paramCallback) {
    super.setCustomSelectionActionModeCallback(i.a((TextView)this, paramCallback));
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
  
  public void setTextClassifier(TextClassifier paramTextClassifier) {
    if (Build.VERSION.SDK_INT < 28) {
      x x1 = this.e;
      if (x1 != null) {
        x1.a(paramTextClassifier);
        return;
      } 
    } 
    super.setTextClassifier(paramTextClassifier);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/widget/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */