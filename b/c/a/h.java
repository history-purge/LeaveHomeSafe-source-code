package b.c.a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

class h extends Drawable {
  private static final double q = Math.cos(Math.toRadians(45.0D));
  
  static a r;
  
  private final int a;
  
  private Paint b;
  
  private Paint c;
  
  private Paint d;
  
  private final RectF e;
  
  private float f;
  
  private Path g;
  
  private float h;
  
  private float i;
  
  private float j;
  
  private ColorStateList k;
  
  private boolean l;
  
  private final int m;
  
  private final int n;
  
  private boolean o;
  
  private boolean p;
  
  static float a(float paramFloat1, float paramFloat2, boolean paramBoolean) {
    float f = paramFloat1;
    if (paramBoolean) {
      double d1 = paramFloat1;
      double d2 = q;
      double d3 = paramFloat2;
      Double.isNaN(d3);
      Double.isNaN(d1);
      f = (float)(d1 + (1.0D - d2) * d3);
    } 
    return f;
  }
  
  private void a(float paramFloat1, float paramFloat2) {
    if (paramFloat1 >= 0.0F) {
      if (paramFloat2 >= 0.0F) {
        float f = d(paramFloat1);
        paramFloat2 = d(paramFloat2);
        paramFloat1 = f;
        if (f > paramFloat2) {
          if (!this.p)
            this.p = true; 
          paramFloat1 = paramFloat2;
        } 
        if (this.j == paramFloat1 && this.h == paramFloat2)
          return; 
        this.j = paramFloat1;
        this.h = paramFloat2;
        this.i = (int)(paramFloat1 * 1.5F + this.a + 0.5F);
        this.l = true;
        invalidateSelf();
        return;
      } 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Invalid max shadow size ");
      stringBuilder1.append(paramFloat2);
      stringBuilder1.append(". Must be >= 0");
      throw new IllegalArgumentException(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Invalid shadow size ");
    stringBuilder.append(paramFloat1);
    stringBuilder.append(". Must be >= 0");
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  private void a(Canvas paramCanvas) {
    boolean bool;
    float f2 = this.f;
    float f1 = -f2 - this.i;
    f2 = f2 + this.a + this.j / 2.0F;
    float f3 = this.e.width();
    float f4 = f2 * 2.0F;
    if (f3 - f4 > 0.0F) {
      i = 1;
    } else {
      i = 0;
    } 
    if (this.e.height() - f4 > 0.0F) {
      bool = true;
    } else {
      bool = false;
    } 
    int j = paramCanvas.save();
    RectF rectF = this.e;
    paramCanvas.translate(rectF.left + f2, rectF.top + f2);
    paramCanvas.drawPath(this.g, this.c);
    if (i)
      paramCanvas.drawRect(0.0F, f1, this.e.width() - f4, -this.f, this.d); 
    paramCanvas.restoreToCount(j);
    j = paramCanvas.save();
    rectF = this.e;
    paramCanvas.translate(rectF.right - f2, rectF.bottom - f2);
    paramCanvas.rotate(180.0F);
    paramCanvas.drawPath(this.g, this.c);
    if (i)
      paramCanvas.drawRect(0.0F, f1, this.e.width() - f4, -this.f + this.i, this.d); 
    paramCanvas.restoreToCount(j);
    int i = paramCanvas.save();
    rectF = this.e;
    paramCanvas.translate(rectF.left + f2, rectF.bottom - f2);
    paramCanvas.rotate(270.0F);
    paramCanvas.drawPath(this.g, this.c);
    if (bool)
      paramCanvas.drawRect(0.0F, f1, this.e.height() - f4, -this.f, this.d); 
    paramCanvas.restoreToCount(i);
    i = paramCanvas.save();
    rectF = this.e;
    paramCanvas.translate(rectF.right - f2, rectF.top + f2);
    paramCanvas.rotate(90.0F);
    paramCanvas.drawPath(this.g, this.c);
    if (bool)
      paramCanvas.drawRect(0.0F, f1, this.e.height() - f4, -this.f, this.d); 
    paramCanvas.restoreToCount(i);
  }
  
  static float b(float paramFloat1, float paramFloat2, boolean paramBoolean) {
    float f = paramFloat1 * 1.5F;
    paramFloat1 = f;
    if (paramBoolean) {
      double d1 = f;
      double d2 = q;
      double d3 = paramFloat2;
      Double.isNaN(d3);
      Double.isNaN(d1);
      paramFloat1 = (float)(d1 + (1.0D - d2) * d3);
    } 
    return paramFloat1;
  }
  
  private void b(ColorStateList paramColorStateList) {
    ColorStateList colorStateList = paramColorStateList;
    if (paramColorStateList == null)
      colorStateList = ColorStateList.valueOf(0); 
    this.k = colorStateList;
    this.b.setColor(this.k.getColorForState(getState(), this.k.getDefaultColor()));
  }
  
  private void b(Rect paramRect) {
    float f1 = this.h;
    float f2 = 1.5F * f1;
    this.e.set(paramRect.left + f1, paramRect.top + f2, paramRect.right - f1, paramRect.bottom - f2);
    g();
  }
  
  private int d(float paramFloat) {
    int j = (int)(paramFloat + 0.5F);
    int i = j;
    if (j % 2 == 1)
      i = j - 1; 
    return i;
  }
  
  private void g() {
    float f1 = this.f;
    RectF rectF1 = new RectF(-f1, -f1, f1, f1);
    RectF rectF2 = new RectF(rectF1);
    f1 = this.i;
    rectF2.inset(-f1, -f1);
    Path path = this.g;
    if (path == null) {
      this.g = new Path();
    } else {
      path.reset();
    } 
    this.g.setFillType(Path.FillType.EVEN_ODD);
    this.g.moveTo(-this.f, 0.0F);
    this.g.rLineTo(-this.i, 0.0F);
    this.g.arcTo(rectF2, 180.0F, 90.0F, false);
    this.g.arcTo(rectF1, 270.0F, -90.0F, false);
    this.g.close();
    f1 = this.f;
    float f2 = this.i;
    float f3 = f1 / (f1 + f2);
    Paint paint = this.c;
    int i = this.m;
    int j = this.n;
    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
    paint.setShader((Shader)new RadialGradient(0.0F, 0.0F, f1 + f2, new int[] { i, i, j }, new float[] { 0.0F, f3, 1.0F }, tileMode));
    paint = this.d;
    f3 = this.f;
    f1 = -f3;
    f2 = this.i;
    f3 = -f3;
    i = this.m;
    j = this.n;
    tileMode = Shader.TileMode.CLAMP;
    paint.setShader((Shader)new LinearGradient(0.0F, f1 + f2, 0.0F, f3 - f2, new int[] { i, i, j }, new float[] { 0.0F, 0.5F, 1.0F }, tileMode));
    this.d.setAntiAlias(false);
  }
  
  ColorStateList a() {
    return this.k;
  }
  
  void a(float paramFloat) {
    if (paramFloat >= 0.0F) {
      paramFloat = (int)(paramFloat + 0.5F);
      if (this.f == paramFloat)
        return; 
      this.f = paramFloat;
      this.l = true;
      invalidateSelf();
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Invalid radius ");
    stringBuilder.append(paramFloat);
    stringBuilder.append(". Must be >= 0");
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  void a(ColorStateList paramColorStateList) {
    b(paramColorStateList);
    invalidateSelf();
  }
  
  void a(Rect paramRect) {
    getPadding(paramRect);
  }
  
  void a(boolean paramBoolean) {
    this.o = paramBoolean;
    invalidateSelf();
  }
  
  float b() {
    return this.f;
  }
  
  void b(float paramFloat) {
    a(this.j, paramFloat);
  }
  
  float c() {
    return this.h;
  }
  
  void c(float paramFloat) {
    a(paramFloat, this.h);
  }
  
  float d() {
    float f = this.h;
    return Math.max(f, this.f + this.a + f * 1.5F / 2.0F) * 2.0F + (this.h * 1.5F + this.a) * 2.0F;
  }
  
  public void draw(Canvas paramCanvas) {
    if (this.l) {
      b(getBounds());
      this.l = false;
    } 
    paramCanvas.translate(0.0F, this.j / 2.0F);
    a(paramCanvas);
    paramCanvas.translate(0.0F, -this.j / 2.0F);
    r.a(paramCanvas, this.e, this.f, this.b);
  }
  
  float e() {
    float f = this.h;
    return Math.max(f, this.f + this.a + f / 2.0F) * 2.0F + (this.h + this.a) * 2.0F;
  }
  
  float f() {
    return this.j;
  }
  
  public int getOpacity() {
    return -3;
  }
  
  public boolean getPadding(Rect paramRect) {
    int i = (int)Math.ceil(b(this.h, this.f, this.o));
    int j = (int)Math.ceil(a(this.h, this.f, this.o));
    paramRect.set(j, i, j, i);
    return true;
  }
  
  public boolean isStateful() {
    ColorStateList colorStateList = this.k;
    return ((colorStateList != null && colorStateList.isStateful()) || super.isStateful());
  }
  
  protected void onBoundsChange(Rect paramRect) {
    super.onBoundsChange(paramRect);
    this.l = true;
  }
  
  protected boolean onStateChange(int[] paramArrayOfint) {
    ColorStateList colorStateList = this.k;
    int i = colorStateList.getColorForState(paramArrayOfint, colorStateList.getDefaultColor());
    if (this.b.getColor() == i)
      return false; 
    this.b.setColor(i);
    this.l = true;
    invalidateSelf();
    return true;
  }
  
  public void setAlpha(int paramInt) {
    this.b.setAlpha(paramInt);
    this.c.setAlpha(paramInt);
    this.d.setAlpha(paramInt);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter) {
    this.b.setColorFilter(paramColorFilter);
  }
  
  static interface a {
    void a(Canvas param1Canvas, RectF param1RectF, float param1Float, Paint param1Paint);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/c/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */