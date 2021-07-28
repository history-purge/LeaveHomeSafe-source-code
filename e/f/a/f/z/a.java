package e.f.a.f.z;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

public class a {
  private static final int[] h = new int[3];
  
  private static final float[] i = new float[] { 0.0F, 0.5F, 1.0F };
  
  private static final int[] j = new int[4];
  
  private static final float[] k = new float[] { 0.0F, 0.0F, 0.5F, 1.0F };
  
  private final Paint a;
  
  private final Paint b;
  
  private final Paint c;
  
  private int d;
  
  private int e;
  
  private int f;
  
  private final Path g = new Path();
  
  public a() {
    this(-16777216);
  }
  
  public a(int paramInt) {
    a(paramInt);
    this.b = new Paint(4);
    this.b.setStyle(Paint.Style.FILL);
    this.a = new Paint();
    this.a.setColor(this.d);
    this.c = new Paint(this.b);
  }
  
  public Paint a() {
    return this.a;
  }
  
  public void a(int paramInt) {
    this.d = b.g.f.a.c(paramInt, 68);
    this.e = b.g.f.a.c(paramInt, 20);
    this.f = b.g.f.a.c(paramInt, 0);
  }
  
  public void a(Canvas paramCanvas, Matrix paramMatrix, RectF paramRectF, int paramInt) {
    paramRectF.bottom += paramInt;
    paramRectF.offset(0.0F, -paramInt);
    int[] arrayOfInt = h;
    arrayOfInt[0] = this.f;
    arrayOfInt[1] = this.e;
    arrayOfInt[2] = this.d;
    Paint paint = this.c;
    float f = paramRectF.left;
    paint.setShader((Shader)new LinearGradient(f, paramRectF.top, f, paramRectF.bottom, arrayOfInt, i, Shader.TileMode.CLAMP));
    paramCanvas.save();
    paramCanvas.concat(paramMatrix);
    paramCanvas.drawRect(paramRectF, this.c);
    paramCanvas.restore();
  }
  
  public void a(Canvas paramCanvas, Matrix paramMatrix, RectF paramRectF, int paramInt, float paramFloat1, float paramFloat2) {
    boolean bool;
    if (paramFloat2 < 0.0F) {
      bool = true;
    } else {
      bool = false;
    } 
    Path path = this.g;
    if (bool) {
      int[] arrayOfInt = j;
      arrayOfInt[0] = 0;
      arrayOfInt[1] = this.f;
      arrayOfInt[2] = this.e;
      arrayOfInt[3] = this.d;
    } else {
      path.rewind();
      path.moveTo(paramRectF.centerX(), paramRectF.centerY());
      path.arcTo(paramRectF, paramFloat1, paramFloat2);
      path.close();
      float f = -paramInt;
      paramRectF.inset(f, f);
      int[] arrayOfInt = j;
      arrayOfInt[0] = 0;
      arrayOfInt[1] = this.d;
      arrayOfInt[2] = this.e;
      arrayOfInt[3] = this.f;
    } 
    float f1 = 1.0F - paramInt / paramRectF.width() / 2.0F;
    float f2 = (1.0F - f1) / 2.0F;
    float[] arrayOfFloat = k;
    arrayOfFloat[1] = f1;
    arrayOfFloat[2] = f2 + f1;
    this.b.setShader((Shader)new RadialGradient(paramRectF.centerX(), paramRectF.centerY(), paramRectF.width() / 2.0F, j, k, Shader.TileMode.CLAMP));
    paramCanvas.save();
    paramCanvas.concat(paramMatrix);
    if (!bool)
      paramCanvas.clipPath(path, Region.Op.DIFFERENCE); 
    paramCanvas.drawArc(paramRectF, paramFloat1, paramFloat2, true, this.b);
    paramCanvas.restore();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/f/z/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */