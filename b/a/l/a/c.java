package b.a.l.a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.a;

public class c extends Drawable implements Drawable.Callback {
  private Drawable c;
  
  public c(Drawable paramDrawable) {
    a(paramDrawable);
  }
  
  public Drawable a() {
    return this.c;
  }
  
  public void a(Drawable paramDrawable) {
    Drawable drawable = this.c;
    if (drawable != null)
      drawable.setCallback(null); 
    this.c = paramDrawable;
    if (paramDrawable != null)
      paramDrawable.setCallback(this); 
  }
  
  public void draw(Canvas paramCanvas) {
    this.c.draw(paramCanvas);
  }
  
  public int getChangingConfigurations() {
    return this.c.getChangingConfigurations();
  }
  
  public Drawable getCurrent() {
    return this.c.getCurrent();
  }
  
  public int getIntrinsicHeight() {
    return this.c.getIntrinsicHeight();
  }
  
  public int getIntrinsicWidth() {
    return this.c.getIntrinsicWidth();
  }
  
  public int getMinimumHeight() {
    return this.c.getMinimumHeight();
  }
  
  public int getMinimumWidth() {
    return this.c.getMinimumWidth();
  }
  
  public int getOpacity() {
    return this.c.getOpacity();
  }
  
  public boolean getPadding(Rect paramRect) {
    return this.c.getPadding(paramRect);
  }
  
  public int[] getState() {
    return this.c.getState();
  }
  
  public Region getTransparentRegion() {
    return this.c.getTransparentRegion();
  }
  
  public void invalidateDrawable(Drawable paramDrawable) {
    invalidateSelf();
  }
  
  public boolean isAutoMirrored() {
    return a.f(this.c);
  }
  
  public boolean isStateful() {
    return this.c.isStateful();
  }
  
  public void jumpToCurrentState() {
    this.c.jumpToCurrentState();
  }
  
  protected void onBoundsChange(Rect paramRect) {
    this.c.setBounds(paramRect);
  }
  
  protected boolean onLevelChange(int paramInt) {
    return this.c.setLevel(paramInt);
  }
  
  public void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong) {
    scheduleSelf(paramRunnable, paramLong);
  }
  
  public void setAlpha(int paramInt) {
    this.c.setAlpha(paramInt);
  }
  
  public void setAutoMirrored(boolean paramBoolean) {
    a.a(this.c, paramBoolean);
  }
  
  public void setChangingConfigurations(int paramInt) {
    this.c.setChangingConfigurations(paramInt);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter) {
    this.c.setColorFilter(paramColorFilter);
  }
  
  public void setDither(boolean paramBoolean) {
    this.c.setDither(paramBoolean);
  }
  
  public void setFilterBitmap(boolean paramBoolean) {
    this.c.setFilterBitmap(paramBoolean);
  }
  
  public void setHotspot(float paramFloat1, float paramFloat2) {
    a.a(this.c, paramFloat1, paramFloat2);
  }
  
  public void setHotspotBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    a.a(this.c, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public boolean setState(int[] paramArrayOfint) {
    return this.c.setState(paramArrayOfint);
  }
  
  public void setTint(int paramInt) {
    a.b(this.c, paramInt);
  }
  
  public void setTintList(ColorStateList paramColorStateList) {
    a.a(this.c, paramColorStateList);
  }
  
  public void setTintMode(PorterDuff.Mode paramMode) {
    a.a(this.c, paramMode);
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2) {
    return (super.setVisible(paramBoolean1, paramBoolean2) || this.c.setVisible(paramBoolean1, paramBoolean2));
  }
  
  public void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable) {
    unscheduleSelf(paramRunnable);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/a/l/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */