package e.e.j.e;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

public class b extends h implements Runnable, c {
  private int f;
  
  private boolean g;
  
  float h = 0.0F;
  
  private boolean i = false;
  
  public b(Drawable paramDrawable, int paramInt) {
    this(paramDrawable, paramInt, true);
  }
  
  public b(Drawable paramDrawable, int paramInt, boolean paramBoolean) {
    super(paramDrawable);
    this.f = paramInt;
    this.g = paramBoolean;
  }
  
  private int b() {
    return (int)(20.0F / this.f * 360.0F);
  }
  
  private void c() {
    if (!this.i) {
      this.i = true;
      scheduleSelf(this, SystemClock.uptimeMillis() + 20L);
    } 
  }
  
  public void draw(Canvas paramCanvas) {
    int i = paramCanvas.save();
    Rect rect = getBounds();
    int j = rect.right;
    int k = rect.left;
    int m = rect.bottom;
    int n = rect.top;
    float f2 = this.h;
    float f1 = f2;
    if (!this.g)
      f1 = 360.0F - f2; 
    paramCanvas.rotate(f1, (rect.left + (j - k) / 2), (rect.top + (m - n) / 2));
    super.draw(paramCanvas);
    paramCanvas.restoreToCount(i);
    c();
  }
  
  public void run() {
    this.i = false;
    this.h += b();
    invalidateSelf();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/j/e/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */