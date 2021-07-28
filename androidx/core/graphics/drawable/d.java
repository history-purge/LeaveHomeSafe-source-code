package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

class d extends Drawable implements Drawable.Callback, c, b {
  static final PorterDuff.Mode i = PorterDuff.Mode.SRC_IN;
  
  private int c;
  
  private PorterDuff.Mode d;
  
  private boolean e;
  
  f f = c();
  
  private boolean g;
  
  Drawable h;
  
  d(Drawable paramDrawable) {
    a(paramDrawable);
  }
  
  d(f paramf, Resources paramResources) {
    a(paramResources);
  }
  
  private void a(Resources paramResources) {
    f f1 = this.f;
    if (f1 != null) {
      Drawable.ConstantState constantState = f1.b;
      if (constantState != null)
        a(constantState.newDrawable(paramResources)); 
    } 
  }
  
  private boolean a(int[] paramArrayOfint) {
    if (!b())
      return false; 
    f f1 = this.f;
    ColorStateList colorStateList = f1.c;
    PorterDuff.Mode mode = f1.d;
    if (colorStateList != null && mode != null) {
      int i = colorStateList.getColorForState(paramArrayOfint, colorStateList.getDefaultColor());
      if (!this.e || i != this.c || mode != this.d) {
        setColorFilter(i, mode);
        this.c = i;
        this.d = mode;
        this.e = true;
        return true;
      } 
    } else {
      this.e = false;
      clearColorFilter();
    } 
    return false;
  }
  
  private f c() {
    return new f(this.f);
  }
  
  public final Drawable a() {
    return this.h;
  }
  
  public final void a(Drawable paramDrawable) {
    Drawable drawable = this.h;
    if (drawable != null)
      drawable.setCallback(null); 
    this.h = paramDrawable;
    if (paramDrawable != null) {
      paramDrawable.setCallback(this);
      setVisible(paramDrawable.isVisible(), true);
      setState(paramDrawable.getState());
      setLevel(paramDrawable.getLevel());
      setBounds(paramDrawable.getBounds());
      f f1 = this.f;
      if (f1 != null)
        f1.b = paramDrawable.getConstantState(); 
    } 
    invalidateSelf();
  }
  
  protected boolean b() {
    return true;
  }
  
  public void draw(Canvas paramCanvas) {
    this.h.draw(paramCanvas);
  }
  
  public int getChangingConfigurations() {
    byte b1;
    int i = super.getChangingConfigurations();
    f f1 = this.f;
    if (f1 != null) {
      b1 = f1.getChangingConfigurations();
    } else {
      b1 = 0;
    } 
    return i | b1 | this.h.getChangingConfigurations();
  }
  
  public Drawable.ConstantState getConstantState() {
    f f1 = this.f;
    if (f1 != null && f1.a()) {
      this.f.a = getChangingConfigurations();
      return this.f;
    } 
    return null;
  }
  
  public Drawable getCurrent() {
    return this.h.getCurrent();
  }
  
  public int getIntrinsicHeight() {
    return this.h.getIntrinsicHeight();
  }
  
  public int getIntrinsicWidth() {
    return this.h.getIntrinsicWidth();
  }
  
  public int getMinimumHeight() {
    return this.h.getMinimumHeight();
  }
  
  public int getMinimumWidth() {
    return this.h.getMinimumWidth();
  }
  
  public int getOpacity() {
    return this.h.getOpacity();
  }
  
  public boolean getPadding(Rect paramRect) {
    return this.h.getPadding(paramRect);
  }
  
  public int[] getState() {
    return this.h.getState();
  }
  
  public Region getTransparentRegion() {
    return this.h.getTransparentRegion();
  }
  
  public void invalidateDrawable(Drawable paramDrawable) {
    invalidateSelf();
  }
  
  public boolean isAutoMirrored() {
    return this.h.isAutoMirrored();
  }
  
  public boolean isStateful() {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual b : ()Z
    //   4: ifeq -> 24
    //   7: aload_0
    //   8: getfield f : Landroidx/core/graphics/drawable/f;
    //   11: astore_1
    //   12: aload_1
    //   13: ifnull -> 24
    //   16: aload_1
    //   17: getfield c : Landroid/content/res/ColorStateList;
    //   20: astore_1
    //   21: goto -> 26
    //   24: aconst_null
    //   25: astore_1
    //   26: aload_1
    //   27: ifnull -> 37
    //   30: aload_1
    //   31: invokevirtual isStateful : ()Z
    //   34: ifne -> 47
    //   37: aload_0
    //   38: getfield h : Landroid/graphics/drawable/Drawable;
    //   41: invokevirtual isStateful : ()Z
    //   44: ifeq -> 49
    //   47: iconst_1
    //   48: ireturn
    //   49: iconst_0
    //   50: ireturn
  }
  
  public void jumpToCurrentState() {
    this.h.jumpToCurrentState();
  }
  
  public Drawable mutate() {
    if (!this.g && super.mutate() == this) {
      this.f = c();
      Drawable drawable = this.h;
      if (drawable != null)
        drawable.mutate(); 
      f f1 = this.f;
      if (f1 != null) {
        drawable = this.h;
        if (drawable != null) {
          Drawable.ConstantState constantState = drawable.getConstantState();
        } else {
          drawable = null;
        } 
        f1.b = (Drawable.ConstantState)drawable;
      } 
      this.g = true;
    } 
    return this;
  }
  
  protected void onBoundsChange(Rect paramRect) {
    Drawable drawable = this.h;
    if (drawable != null)
      drawable.setBounds(paramRect); 
  }
  
  protected boolean onLevelChange(int paramInt) {
    return this.h.setLevel(paramInt);
  }
  
  public void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong) {
    scheduleSelf(paramRunnable, paramLong);
  }
  
  public void setAlpha(int paramInt) {
    this.h.setAlpha(paramInt);
  }
  
  public void setAutoMirrored(boolean paramBoolean) {
    this.h.setAutoMirrored(paramBoolean);
  }
  
  public void setChangingConfigurations(int paramInt) {
    this.h.setChangingConfigurations(paramInt);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter) {
    this.h.setColorFilter(paramColorFilter);
  }
  
  public void setDither(boolean paramBoolean) {
    this.h.setDither(paramBoolean);
  }
  
  public void setFilterBitmap(boolean paramBoolean) {
    this.h.setFilterBitmap(paramBoolean);
  }
  
  public boolean setState(int[] paramArrayOfint) {
    boolean bool = this.h.setState(paramArrayOfint);
    return (a(paramArrayOfint) || bool);
  }
  
  public void setTint(int paramInt) {
    setTintList(ColorStateList.valueOf(paramInt));
  }
  
  public void setTintList(ColorStateList paramColorStateList) {
    this.f.c = paramColorStateList;
    a(getState());
  }
  
  public void setTintMode(PorterDuff.Mode paramMode) {
    this.f.d = paramMode;
    a(getState());
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2) {
    return (super.setVisible(paramBoolean1, paramBoolean2) || this.h.setVisible(paramBoolean1, paramBoolean2));
  }
  
  public void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable) {
    unscheduleSelf(paramRunnable);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/core/graphics/drawable/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */