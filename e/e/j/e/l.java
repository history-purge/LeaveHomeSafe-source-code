package e.e.j.e;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import e.e.l.p.b;
import java.lang.ref.WeakReference;

public class l extends o {
  private final Paint F = new Paint();
  
  private final Paint G = new Paint(1);
  
  private final Bitmap H;
  
  private WeakReference<Bitmap> I;
  
  public l(Resources paramResources, Bitmap paramBitmap, Paint paramPaint) {
    super((Drawable)new BitmapDrawable(paramResources, paramBitmap));
    this.H = paramBitmap;
    if (paramPaint != null)
      this.F.set(paramPaint); 
    this.F.setFlags(1);
    this.G.setStyle(Paint.Style.STROKE);
  }
  
  private void e() {
    WeakReference<Bitmap> weakReference = this.I;
    if (weakReference == null || weakReference.get() != this.H) {
      this.I = new WeakReference<Bitmap>(this.H);
      Paint paint = this.F;
      Bitmap bitmap = this.H;
      Shader.TileMode tileMode = Shader.TileMode.CLAMP;
      paint.setShader((Shader)new BitmapShader(bitmap, tileMode, tileMode));
      this.h = true;
    } 
    if (this.h) {
      this.F.getShader().setLocalMatrix(this.z);
      this.h = false;
    } 
    this.F.setFilterBitmap(a());
  }
  
  boolean b() {
    return (super.b() && this.H != null);
  }
  
  public void draw(Canvas paramCanvas) {
    if (b.c())
      b.a("RoundedBitmapDrawable#draw"); 
    if (!b()) {
      super.draw(paramCanvas);
      if (b.c())
        b.a(); 
      return;
    } 
    d();
    c();
    e();
    int i = paramCanvas.save();
    paramCanvas.concat(this.w);
    paramCanvas.drawPath(this.g, this.F);
    float f = this.f;
    if (f > 0.0F) {
      this.G.setStrokeWidth(f);
      this.G.setColor(f.a(this.i, this.F.getAlpha()));
      paramCanvas.drawPath(this.j, this.G);
    } 
    paramCanvas.restoreToCount(i);
    if (b.c())
      b.a(); 
  }
  
  public void setAlpha(int paramInt) {
    super.setAlpha(paramInt);
    if (paramInt != this.F.getAlpha()) {
      this.F.setAlpha(paramInt);
      super.setAlpha(paramInt);
      invalidateSelf();
    } 
  }
  
  public void setColorFilter(ColorFilter paramColorFilter) {
    super.setColorFilter(paramColorFilter);
    this.F.setColorFilter(paramColorFilter);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/j/e/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */