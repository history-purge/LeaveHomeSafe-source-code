package e.e.j.e;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

public class j extends h {
  final Matrix f = new Matrix();
  
  private int g;
  
  private int h;
  
  private final Matrix i = new Matrix();
  
  private final RectF j = new RectF();
  
  public j(Drawable paramDrawable, int paramInt1, int paramInt2) {
    super(paramDrawable);
    this.g = paramInt1 - paramInt1 % 90;
    if (paramInt2 < 0 || paramInt2 > 8)
      paramInt2 = 0; 
    this.h = paramInt2;
  }
  
  public void a(Matrix paramMatrix) {
    b(paramMatrix);
    if (!this.f.isIdentity())
      paramMatrix.preConcat(this.f); 
  }
  
  public void draw(Canvas paramCanvas) {
    if (this.g <= 0) {
      int k = this.h;
      if (k == 0 || k == 1) {
        super.draw(paramCanvas);
        return;
      } 
    } 
    int i = paramCanvas.save();
    paramCanvas.concat(this.f);
    super.draw(paramCanvas);
    paramCanvas.restoreToCount(i);
  }
  
  public int getIntrinsicHeight() {
    int i = this.h;
    return (i == 5 || i == 7 || this.g % 180 != 0) ? super.getIntrinsicWidth() : super.getIntrinsicHeight();
  }
  
  public int getIntrinsicWidth() {
    int i = this.h;
    return (i == 5 || i == 7 || this.g % 180 != 0) ? super.getIntrinsicHeight() : super.getIntrinsicWidth();
  }
  
  protected void onBoundsChange(Rect paramRect) {
    Drawable drawable = getCurrent();
    if (this.g <= 0) {
      int k = this.h;
      if (k == 0 || k == 1) {
        drawable.setBounds(paramRect);
        return;
      } 
    } 
    int i = this.h;
    if (i != 2) {
      if (i != 7) {
        if (i != 4) {
          if (i != 5) {
            this.f.setRotate(this.g, paramRect.centerX(), paramRect.centerY());
          } else {
            this.f.setRotate(270.0F, paramRect.centerX(), paramRect.centerY());
            this.f.postScale(1.0F, -1.0F);
          } 
        } else {
          this.f.setScale(1.0F, -1.0F);
        } 
      } else {
        this.f.setRotate(270.0F, paramRect.centerX(), paramRect.centerY());
        this.f.postScale(-1.0F, 1.0F);
      } 
    } else {
      this.f.setScale(-1.0F, 1.0F);
    } 
    this.i.reset();
    this.f.invert(this.i);
    this.j.set(paramRect);
    this.i.mapRect(this.j);
    RectF rectF = this.j;
    drawable.setBounds((int)rectF.left, (int)rectF.top, (int)rectF.right, (int)rectF.bottom);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/j/e/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */