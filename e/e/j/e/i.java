package e.e.j.e;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public class i extends h {
  private Matrix f;
  
  private Matrix g;
  
  private int h;
  
  private int i;
  
  private void b() {
    Matrix matrix;
    Drawable drawable = getCurrent();
    Rect rect = getBounds();
    int j = drawable.getIntrinsicWidth();
    this.h = j;
    int k = drawable.getIntrinsicHeight();
    this.i = k;
    if (j <= 0 || k <= 0) {
      drawable.setBounds(rect);
      drawable = null;
    } else {
      drawable.setBounds(0, 0, j, k);
      matrix = this.f;
    } 
    this.g = matrix;
  }
  
  private void c() {
    if (this.h != getCurrent().getIntrinsicWidth() || this.i != getCurrent().getIntrinsicHeight())
      b(); 
  }
  
  public void a(Matrix paramMatrix) {
    super.a(paramMatrix);
    Matrix matrix = this.g;
    if (matrix != null)
      paramMatrix.preConcat(matrix); 
  }
  
  public Drawable b(Drawable paramDrawable) {
    paramDrawable = super.b(paramDrawable);
    b();
    return paramDrawable;
  }
  
  public void draw(Canvas paramCanvas) {
    c();
    if (this.g != null) {
      int j = paramCanvas.save();
      paramCanvas.clipRect(getBounds());
      paramCanvas.concat(this.g);
      super.draw(paramCanvas);
      paramCanvas.restoreToCount(j);
      return;
    } 
    super.draw(paramCanvas);
  }
  
  protected void onBoundsChange(Rect paramRect) {
    super.onBoundsChange(paramRect);
    b();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/j/e/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */