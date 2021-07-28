package e.e.j.e;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import e.e.e.d.h;

public class q extends h {
  r.b f;
  
  Object g;
  
  PointF h = null;
  
  int i = 0;
  
  int j = 0;
  
  Matrix k;
  
  private Matrix l = new Matrix();
  
  public q(Drawable paramDrawable, r.b paramb) {
    super(paramDrawable);
    this.f = paramb;
  }
  
  private void d() {
    boolean bool1;
    r.b b1 = this.f;
    boolean bool = b1 instanceof r.l;
    boolean bool3 = true;
    if (bool) {
      Object object = ((r.l)b1).getState();
      if (object == null || !object.equals(this.g)) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      this.g = object;
    } else {
      bool1 = false;
    } 
    boolean bool2 = bool3;
    if (this.i == getCurrent().getIntrinsicWidth())
      if (this.j != getCurrent().getIntrinsicHeight()) {
        bool2 = bool3;
      } else {
        bool2 = false;
      }  
    if (bool2 || bool1)
      b(); 
  }
  
  public void a(Matrix paramMatrix) {
    b(paramMatrix);
    d();
    Matrix matrix = this.k;
    if (matrix != null)
      paramMatrix.preConcat(matrix); 
  }
  
  public void a(PointF paramPointF) {
    if (h.a(this.h, paramPointF))
      return; 
    if (this.h == null)
      this.h = new PointF(); 
    this.h.set(paramPointF);
    b();
    invalidateSelf();
  }
  
  public void a(r.b paramb) {
    if (h.a(this.f, paramb))
      return; 
    this.f = paramb;
    this.g = null;
    b();
    invalidateSelf();
  }
  
  public Drawable b(Drawable paramDrawable) {
    paramDrawable = super.b(paramDrawable);
    b();
    return paramDrawable;
  }
  
  void b() {
    float f1;
    float f2;
    Drawable drawable = getCurrent();
    Rect rect = getBounds();
    int i = rect.width();
    int j = rect.height();
    int k = drawable.getIntrinsicWidth();
    this.i = k;
    int m = drawable.getIntrinsicHeight();
    this.j = m;
    if (k <= 0 || m <= 0) {
      drawable.setBounds(rect);
      this.k = null;
      return;
    } 
    if (k == i && m == j) {
      drawable.setBounds(rect);
      this.k = null;
      return;
    } 
    if (this.f == r.b.a) {
      drawable.setBounds(rect);
      this.k = null;
      return;
    } 
    drawable.setBounds(0, 0, k, m);
    r.b b1 = this.f;
    Matrix matrix = this.l;
    PointF pointF = this.h;
    if (pointF != null) {
      f1 = pointF.x;
    } else {
      f1 = 0.5F;
    } 
    pointF = this.h;
    if (pointF != null) {
      f2 = pointF.y;
    } else {
      f2 = 0.5F;
    } 
    b1.a(matrix, rect, k, m, f1, f2);
    this.k = this.l;
  }
  
  public r.b c() {
    return this.f;
  }
  
  public void draw(Canvas paramCanvas) {
    d();
    if (this.k != null) {
      int i = paramCanvas.save();
      paramCanvas.clipRect(getBounds());
      paramCanvas.concat(this.k);
      super.draw(paramCanvas);
      paramCanvas.restoreToCount(i);
      return;
    } 
    super.draw(paramCanvas);
  }
  
  protected void onBoundsChange(Rect paramRect) {
    b();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/j/e/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */