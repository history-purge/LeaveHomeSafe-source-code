package e.e.j.e;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import e.e.e.d.i;
import java.util.Arrays;

public class n extends h implements k {
  b f = b.c;
  
  private final RectF g = new RectF();
  
  private RectF h;
  
  private Matrix i;
  
  private final float[] j = new float[8];
  
  final float[] k = new float[8];
  
  final Paint l = new Paint(1);
  
  private boolean m = false;
  
  private float n = 0.0F;
  
  private int o = 0;
  
  private int p = 0;
  
  private float q = 0.0F;
  
  private boolean r = false;
  
  private boolean s = false;
  
  private final Path t = new Path();
  
  private final Path u = new Path();
  
  private final RectF v = new RectF();
  
  public n(Drawable paramDrawable) {
    super(paramDrawable);
  }
  
  private void c() {
    this.t.reset();
    this.u.reset();
    this.v.set(getBounds());
    RectF rectF = this.v;
    float f = this.q;
    rectF.inset(f, f);
    this.t.addRect(this.v, Path.Direction.CW);
    if (this.m) {
      this.t.addCircle(this.v.centerX(), this.v.centerY(), Math.min(this.v.width(), this.v.height()) / 2.0F, Path.Direction.CW);
    } else {
      this.t.addRoundRect(this.v, this.j, Path.Direction.CW);
    } 
    rectF = this.v;
    f = this.q;
    rectF.inset(-f, -f);
    rectF = this.v;
    f = this.n;
    rectF.inset(f / 2.0F, f / 2.0F);
    if (this.m) {
      f = Math.min(this.v.width(), this.v.height()) / 2.0F;
      this.u.addCircle(this.v.centerX(), this.v.centerY(), f, Path.Direction.CW);
    } else {
      int i = 0;
      while (true) {
        float[] arrayOfFloat = this.k;
        if (i < arrayOfFloat.length) {
          arrayOfFloat[i] = this.j[i] + this.q - this.n / 2.0F;
          i++;
          continue;
        } 
        this.u.addRoundRect(this.v, arrayOfFloat, Path.Direction.CW);
        RectF rectF1 = this.v;
        f = this.n;
        rectF1.inset(-f / 2.0F, -f / 2.0F);
        return;
      } 
    } 
    rectF = this.v;
    f = this.n;
    rectF.inset(-f / 2.0F, -f / 2.0F);
  }
  
  public void a(float paramFloat) {
    this.q = paramFloat;
    c();
    invalidateSelf();
  }
  
  public void a(int paramInt) {
    this.p = paramInt;
    invalidateSelf();
  }
  
  public void a(int paramInt, float paramFloat) {
    this.o = paramInt;
    this.n = paramFloat;
    c();
    invalidateSelf();
  }
  
  public void a(boolean paramBoolean) {
    this.m = paramBoolean;
    c();
    invalidateSelf();
  }
  
  public void a(float[] paramArrayOffloat) {
    if (paramArrayOffloat == null) {
      Arrays.fill(this.j, 0.0F);
    } else {
      boolean bool;
      if (paramArrayOffloat.length == 8) {
        bool = true;
      } else {
        bool = false;
      } 
      i.a(bool, "radii should have exactly 8 values");
      System.arraycopy(paramArrayOffloat, 0, this.j, 0, 8);
    } 
    c();
    invalidateSelf();
  }
  
  public void b(float paramFloat) {
    Arrays.fill(this.j, paramFloat);
    c();
    invalidateSelf();
  }
  
  public void b(boolean paramBoolean) {
    if (this.s != paramBoolean) {
      this.s = paramBoolean;
      invalidateSelf();
    } 
  }
  
  public boolean b() {
    return this.s;
  }
  
  public void c(boolean paramBoolean) {
    this.r = paramBoolean;
    c();
    invalidateSelf();
  }
  
  public void draw(Canvas paramCanvas) {
    this.g.set(getBounds());
    int i = a.a[this.f.ordinal()];
    if (i != 1) {
      if (i == 2) {
        if (this.r) {
          RectF rectF = this.h;
          if (rectF == null) {
            this.h = new RectF(this.g);
            this.i = new Matrix();
          } else {
            rectF.set(this.g);
          } 
          rectF = this.h;
          float f = this.n;
          rectF.inset(f, f);
          this.i.setRectToRect(this.g, this.h, Matrix.ScaleToFit.FILL);
          i = paramCanvas.save();
          paramCanvas.clipRect(this.g);
          paramCanvas.concat(this.i);
          super.draw(paramCanvas);
          paramCanvas.restoreToCount(i);
        } else {
          super.draw(paramCanvas);
        } 
        this.l.setStyle(Paint.Style.FILL);
        this.l.setColor(this.p);
        this.l.setStrokeWidth(0.0F);
        this.l.setFilterBitmap(b());
        this.t.setFillType(Path.FillType.EVEN_ODD);
        paramCanvas.drawPath(this.t, this.l);
        if (this.m) {
          float f2 = (this.g.width() - this.g.height() + this.n) / 2.0F;
          float f1 = (this.g.height() - this.g.width() + this.n) / 2.0F;
          if (f2 > 0.0F) {
            RectF rectF = this.g;
            float f = rectF.left;
            paramCanvas.drawRect(f, rectF.top, f + f2, rectF.bottom, this.l);
            rectF = this.g;
            f = rectF.right;
            paramCanvas.drawRect(f - f2, rectF.top, f, rectF.bottom, this.l);
          } 
          if (f1 > 0.0F) {
            RectF rectF = this.g;
            f2 = rectF.left;
            float f = rectF.top;
            paramCanvas.drawRect(f2, f, rectF.right, f + f1, this.l);
            rectF = this.g;
            f2 = rectF.left;
            f = rectF.bottom;
            paramCanvas.drawRect(f2, f - f1, rectF.right, f, this.l);
          } 
        } 
      } 
    } else {
      i = paramCanvas.save();
      this.t.setFillType(Path.FillType.EVEN_ODD);
      paramCanvas.clipPath(this.t);
      super.draw(paramCanvas);
      paramCanvas.restoreToCount(i);
    } 
    if (this.o != 0) {
      this.l.setStyle(Paint.Style.STROKE);
      this.l.setColor(this.o);
      this.l.setStrokeWidth(this.n);
      this.t.setFillType(Path.FillType.EVEN_ODD);
      paramCanvas.drawPath(this.u, this.l);
    } 
  }
  
  protected void onBoundsChange(Rect paramRect) {
    super.onBoundsChange(paramRect);
    c();
  }
  
  public enum b {
    c, d;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/j/e/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */