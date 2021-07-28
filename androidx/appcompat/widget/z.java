package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.widget.b;
import androidx.core.widget.i;
import androidx.core.widget.k;
import b.a.k.a.a;
import b.g.f.d;
import b.g.l.c;
import b.g.m.u;
import java.util.concurrent.Future;

public class z extends TextView implements u, k, b {
  private final e c;
  
  private final y d;
  
  private final x e;
  
  private Future<c> f;
  
  public z(Context paramContext) {
    this(paramContext, null);
  }
  
  public z(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 16842884);
  }
  
  public z(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(u0.b(paramContext), paramAttributeSet, paramInt);
    s0.a((View)this, getContext());
    this.c = new e((View)this);
    this.c.a(paramAttributeSet, paramInt);
    this.d = new y(this);
    this.d.a(paramAttributeSet, paramInt);
    this.d.a();
    this.e = new x(this);
  }
  
  private void d() {
    Future<c> future = this.f;
    if (future != null)
      try {
        this.f = null;
        i.a(this, future.get());
        return;
      } catch (InterruptedException|java.util.concurrent.ExecutionException interruptedException) {
        return;
      }  
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
  
  public int getFirstBaselineToTopHeight() {
    return i.b(this);
  }
  
  public int getLastBaselineToBottomHeight() {
    return i.c(this);
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
  
  public CharSequence getText() {
    d();
    return super.getText();
  }
  
  public TextClassifier getTextClassifier() {
    if (Build.VERSION.SDK_INT < 28) {
      x x1 = this.e;
      if (x1 != null)
        return x1.a(); 
    } 
    return super.getTextClassifier();
  }
  
  public c.a getTextMetricsParamsCompat() {
    return i.e(this);
  }
  
  public InputConnection onCreateInputConnection(EditorInfo paramEditorInfo) {
    InputConnection inputConnection = super.onCreateInputConnection(paramEditorInfo);
    l.a(inputConnection, paramEditorInfo, (View)this);
    return inputConnection;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    y y1 = this.d;
    if (y1 != null)
      y1.a(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4); 
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    d();
    super.onMeasure(paramInt1, paramInt2);
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
  
  public void setCompoundDrawables(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4) {
    super.setCompoundDrawables(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    y y1 = this.d;
    if (y1 != null)
      y1.k(); 
  }
  
  public void setCompoundDrawablesRelative(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4) {
    super.setCompoundDrawablesRelative(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    y y1 = this.d;
    if (y1 != null)
      y1.k(); 
  }
  
  public void setCompoundDrawablesRelativeWithIntrinsicBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Drawable drawable1;
    Drawable drawable2;
    Drawable drawable3;
    Context context = getContext();
    Drawable drawable4 = null;
    if (paramInt1 != 0) {
      drawable1 = a.c(context, paramInt1);
    } else {
      drawable1 = null;
    } 
    if (paramInt2 != 0) {
      drawable2 = a.c(context, paramInt2);
    } else {
      drawable2 = null;
    } 
    if (paramInt3 != 0) {
      drawable3 = a.c(context, paramInt3);
    } else {
      drawable3 = null;
    } 
    if (paramInt4 != 0)
      drawable4 = a.c(context, paramInt4); 
    setCompoundDrawablesRelativeWithIntrinsicBounds(drawable1, drawable2, drawable3, drawable4);
    y y1 = this.d;
    if (y1 != null)
      y1.k(); 
  }
  
  public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4) {
    super.setCompoundDrawablesRelativeWithIntrinsicBounds(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    y y1 = this.d;
    if (y1 != null)
      y1.k(); 
  }
  
  public void setCompoundDrawablesWithIntrinsicBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Drawable drawable1;
    Drawable drawable2;
    Drawable drawable3;
    Context context = getContext();
    Drawable drawable4 = null;
    if (paramInt1 != 0) {
      drawable1 = a.c(context, paramInt1);
    } else {
      drawable1 = null;
    } 
    if (paramInt2 != 0) {
      drawable2 = a.c(context, paramInt2);
    } else {
      drawable2 = null;
    } 
    if (paramInt3 != 0) {
      drawable3 = a.c(context, paramInt3);
    } else {
      drawable3 = null;
    } 
    if (paramInt4 != 0)
      drawable4 = a.c(context, paramInt4); 
    setCompoundDrawablesWithIntrinsicBounds(drawable1, drawable2, drawable3, drawable4);
    y y1 = this.d;
    if (y1 != null)
      y1.k(); 
  }
  
  public void setCompoundDrawablesWithIntrinsicBounds(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4) {
    super.setCompoundDrawablesWithIntrinsicBounds(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    y y1 = this.d;
    if (y1 != null)
      y1.k(); 
  }
  
  public void setCustomSelectionActionModeCallback(ActionMode.Callback paramCallback) {
    super.setCustomSelectionActionModeCallback(i.a(this, paramCallback));
  }
  
  public void setFirstBaselineToTopHeight(int paramInt) {
    if (Build.VERSION.SDK_INT >= 28) {
      super.setFirstBaselineToTopHeight(paramInt);
      return;
    } 
    i.a(this, paramInt);
  }
  
  public void setLastBaselineToBottomHeight(int paramInt) {
    if (Build.VERSION.SDK_INT >= 28) {
      super.setLastBaselineToBottomHeight(paramInt);
      return;
    } 
    i.b(this, paramInt);
  }
  
  public void setLineHeight(int paramInt) {
    i.c(this, paramInt);
  }
  
  public void setPrecomputedText(c paramc) {
    i.a(this, paramc);
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
  
  public void setTextFuture(Future<c> paramFuture) {
    this.f = paramFuture;
    if (paramFuture != null)
      requestLayout(); 
  }
  
  public void setTextMetricsParamsCompat(c.a parama) {
    i.a(this, parama);
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
  
  public void setTypeface(Typeface paramTypeface, int paramInt) {
    Typeface typeface;
    if (paramTypeface != null && paramInt > 0) {
      typeface = d.a(getContext(), paramTypeface, paramInt);
    } else {
      typeface = null;
    } 
    if (typeface != null)
      paramTypeface = typeface; 
    super.setTypeface(paramTypeface, paramInt);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/widget/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */