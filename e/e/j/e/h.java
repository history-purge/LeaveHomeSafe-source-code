package e.e.j.e;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

public class h extends Drawable implements Drawable.Callback, t, s, d {
  private Drawable c;
  
  private final e d = new e();
  
  protected t e;
  
  static {
    new Matrix();
  }
  
  public h(Drawable paramDrawable) {
    this.c = paramDrawable;
    f.a(this.c, this, this);
  }
  
  public Drawable a() {
    return getCurrent();
  }
  
  public Drawable a(Drawable paramDrawable) {
    return b(paramDrawable);
  }
  
  public void a(Matrix paramMatrix) {
    b(paramMatrix);
  }
  
  public void a(RectF paramRectF) {
    t t1 = this.e;
    if (t1 != null) {
      t1.a(paramRectF);
      return;
    } 
    paramRectF.set(getBounds());
  }
  
  public void a(t paramt) {
    this.e = paramt;
  }
  
  public Drawable b(Drawable paramDrawable) {
    paramDrawable = c(paramDrawable);
    invalidateSelf();
    return paramDrawable;
  }
  
  protected void b(Matrix paramMatrix) {
    t t1 = this.e;
    if (t1 != null) {
      t1.a(paramMatrix);
      return;
    } 
    paramMatrix.reset();
  }
  
  protected Drawable c(Drawable paramDrawable) {
    Drawable drawable = this.c;
    f.a(drawable, null, null);
    f.a(paramDrawable, null, null);
    f.a(paramDrawable, this.d);
    f.a(paramDrawable, this);
    f.a(paramDrawable, this, this);
    this.c = paramDrawable;
    return drawable;
  }
  
  public void draw(Canvas paramCanvas) {
    Drawable drawable = this.c;
    if (drawable != null)
      drawable.draw(paramCanvas); 
  }
  
  public Drawable.ConstantState getConstantState() {
    Drawable drawable = this.c;
    return (drawable == null) ? super.getConstantState() : drawable.getConstantState();
  }
  
  public Drawable getCurrent() {
    return this.c;
  }
  
  public int getIntrinsicHeight() {
    Drawable drawable = this.c;
    return (drawable == null) ? super.getIntrinsicHeight() : drawable.getIntrinsicHeight();
  }
  
  public int getIntrinsicWidth() {
    Drawable drawable = this.c;
    return (drawable == null) ? super.getIntrinsicWidth() : drawable.getIntrinsicWidth();
  }
  
  public int getOpacity() {
    Drawable drawable = this.c;
    return (drawable == null) ? 0 : drawable.getOpacity();
  }
  
  public boolean getPadding(Rect paramRect) {
    Drawable drawable = this.c;
    return (drawable == null) ? super.getPadding(paramRect) : drawable.getPadding(paramRect);
  }
  
  public void invalidateDrawable(Drawable paramDrawable) {
    invalidateSelf();
  }
  
  public boolean isStateful() {
    Drawable drawable = this.c;
    return (drawable == null) ? false : drawable.isStateful();
  }
  
  public Drawable mutate() {
    Drawable drawable = this.c;
    if (drawable != null)
      drawable.mutate(); 
    return this;
  }
  
  protected void onBoundsChange(Rect paramRect) {
    Drawable drawable = this.c;
    if (drawable != null)
      drawable.setBounds(paramRect); 
  }
  
  protected boolean onLevelChange(int paramInt) {
    Drawable drawable = this.c;
    return (drawable == null) ? super.onLevelChange(paramInt) : drawable.setLevel(paramInt);
  }
  
  protected boolean onStateChange(int[] paramArrayOfint) {
    Drawable drawable = this.c;
    return (drawable == null) ? super.onStateChange(paramArrayOfint) : drawable.setState(paramArrayOfint);
  }
  
  public void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong) {
    scheduleSelf(paramRunnable, paramLong);
  }
  
  public void setAlpha(int paramInt) {
    this.d.a(paramInt);
    Drawable drawable = this.c;
    if (drawable != null)
      drawable.setAlpha(paramInt); 
  }
  
  public void setColorFilter(ColorFilter paramColorFilter) {
    this.d.a(paramColorFilter);
    Drawable drawable = this.c;
    if (drawable != null)
      drawable.setColorFilter(paramColorFilter); 
  }
  
  public void setDither(boolean paramBoolean) {
    this.d.a(paramBoolean);
    Drawable drawable = this.c;
    if (drawable != null)
      drawable.setDither(paramBoolean); 
  }
  
  public void setFilterBitmap(boolean paramBoolean) {
    this.d.b(paramBoolean);
    Drawable drawable = this.c;
    if (drawable != null)
      drawable.setFilterBitmap(paramBoolean); 
  }
  
  @TargetApi(21)
  public void setHotspot(float paramFloat1, float paramFloat2) {
    Drawable drawable = this.c;
    if (drawable != null)
      drawable.setHotspot(paramFloat1, paramFloat2); 
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2) {
    boolean bool = super.setVisible(paramBoolean1, paramBoolean2);
    Drawable drawable = this.c;
    return (drawable == null) ? bool : drawable.setVisible(paramBoolean1, paramBoolean2);
  }
  
  public void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable) {
    unscheduleSelf(paramRunnable);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/j/e/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */