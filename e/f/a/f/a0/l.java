package e.f.a.f.a0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

public class l {
  private final m[] a = new m[4];
  
  private final Matrix[] b = new Matrix[4];
  
  private final Matrix[] c = new Matrix[4];
  
  private final PointF d = new PointF();
  
  private final m e = new m();
  
  private final float[] f = new float[2];
  
  private final float[] g = new float[2];
  
  public l() {
    for (int i = 0; i < 4; i++) {
      this.a[i] = new m();
      this.b[i] = new Matrix();
      this.c[i] = new Matrix();
    } 
  }
  
  private float a(int paramInt) {
    return ((paramInt + 1) * 90);
  }
  
  private float a(RectF paramRectF, int paramInt) {
    float[] arrayOfFloat = this.f;
    m[] arrayOfM = this.a;
    arrayOfFloat[0] = (arrayOfM[paramInt]).c;
    arrayOfFloat[1] = (arrayOfM[paramInt]).d;
    this.b[paramInt].mapPoints(arrayOfFloat);
    if (paramInt != 1 && paramInt != 3) {
      float f3 = paramRectF.centerY();
      float f4 = this.f[1];
      return Math.abs(f3 - f4);
    } 
    float f1 = paramRectF.centerX();
    float f2 = this.f[0];
    return Math.abs(f1 - f2);
  }
  
  private c a(int paramInt, k paramk) {
    return (paramInt != 1) ? ((paramInt != 2) ? ((paramInt != 3) ? paramk.l() : paramk.j()) : paramk.c()) : paramk.e();
  }
  
  private void a(int paramInt, RectF paramRectF, PointF paramPointF) {
    if (paramInt != 1) {
      float f3;
      float f4;
      if (paramInt != 2) {
        if (paramInt != 3) {
          f3 = paramRectF.right;
        } else {
          f3 = paramRectF.left;
        } 
        f4 = paramRectF.top;
      } else {
        f3 = paramRectF.left;
        f4 = paramRectF.bottom;
      } 
      paramPointF.set(f3, f4);
      return;
    } 
    float f1 = paramRectF.right;
    float f2 = paramRectF.bottom;
  }
  
  private void a(b paramb, int paramInt) {
    this.f[0] = this.a[paramInt].c();
    this.f[1] = this.a[paramInt].d();
    this.b[paramInt].mapPoints(this.f);
    Path path = paramb.b;
    float[] arrayOfFloat = this.f;
    if (paramInt == 0) {
      path.moveTo(arrayOfFloat[0], arrayOfFloat[1]);
    } else {
      path.lineTo(arrayOfFloat[0], arrayOfFloat[1]);
    } 
    this.a[paramInt].a(this.b[paramInt], paramb.b);
    a a = paramb.d;
    if (a != null)
      a.b(this.a[paramInt], this.b[paramInt], paramInt); 
  }
  
  private d b(int paramInt, k paramk) {
    return (paramInt != 1) ? ((paramInt != 2) ? ((paramInt != 3) ? paramk.k() : paramk.i()) : paramk.b()) : paramk.d();
  }
  
  private void b(int paramInt) {
    this.f[0] = this.a[paramInt].a();
    this.f[1] = this.a[paramInt].b();
    this.b[paramInt].mapPoints(this.f);
    float f = a(paramInt);
    this.c[paramInt].reset();
    Matrix matrix = this.c[paramInt];
    float[] arrayOfFloat = this.f;
    matrix.setTranslate(arrayOfFloat[0], arrayOfFloat[1]);
    this.c[paramInt].preRotate(f);
  }
  
  private void b(b paramb, int paramInt) {
    int i = (paramInt + 1) % 4;
    this.f[0] = this.a[paramInt].a();
    this.f[1] = this.a[paramInt].b();
    this.b[paramInt].mapPoints(this.f);
    this.g[0] = this.a[i].c();
    this.g[1] = this.a[i].d();
    this.b[i].mapPoints(this.g);
    float[] arrayOfFloat1 = this.f;
    float f1 = arrayOfFloat1[0];
    float[] arrayOfFloat2 = this.g;
    f1 = Math.max((float)Math.hypot((f1 - arrayOfFloat2[0]), (arrayOfFloat1[1] - arrayOfFloat2[1])) - 0.001F, 0.0F);
    float f2 = a(paramb.c, paramInt);
    this.e.b(0.0F, 0.0F);
    c(paramInt, paramb.a).a(f1, f2, paramb.e, this.e);
    this.e.a(this.c[paramInt], paramb.b);
    a a = paramb.d;
    if (a != null)
      a.a(this.e, this.c[paramInt], paramInt); 
  }
  
  private f c(int paramInt, k paramk) {
    return (paramInt != 1) ? ((paramInt != 2) ? ((paramInt != 3) ? paramk.g() : paramk.h()) : paramk.f()) : paramk.a();
  }
  
  private void c(b paramb, int paramInt) {
    c c = a(paramInt, paramb.a);
    b(paramInt, paramb.a).a(this.a[paramInt], 90.0F, paramb.e, paramb.c, c);
    float f = a(paramInt);
    this.b[paramInt].reset();
    a(paramInt, paramb.c, this.d);
    Matrix matrix = this.b[paramInt];
    PointF pointF = this.d;
    matrix.setTranslate(pointF.x, pointF.y);
    this.b[paramInt].preRotate(f);
  }
  
  public void a(k paramk, float paramFloat, RectF paramRectF, Path paramPath) {
    a(paramk, paramFloat, paramRectF, null, paramPath);
  }
  
  public void a(k paramk, float paramFloat, RectF paramRectF, a parama, Path paramPath) {
    int j;
    paramPath.rewind();
    b b = new b(paramk, paramFloat, paramRectF, parama, paramPath);
    byte b1 = 0;
    int i = 0;
    while (true) {
      j = b1;
      if (i < 4) {
        c(b, i);
        b(i);
        i++;
        continue;
      } 
      break;
    } 
    while (j < 4) {
      a(b, j);
      b(b, j);
      j++;
    } 
    paramPath.close();
  }
  
  public static interface a {
    void a(m param1m, Matrix param1Matrix, int param1Int);
    
    void b(m param1m, Matrix param1Matrix, int param1Int);
  }
  
  static final class b {
    public final k a;
    
    public final Path b;
    
    public final RectF c;
    
    public final l.a d;
    
    public final float e;
    
    b(k param1k, float param1Float, RectF param1RectF, l.a param1a, Path param1Path) {
      this.d = param1a;
      this.a = param1k;
      this.e = param1Float;
      this.c = param1RectF;
      this.b = param1Path;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/f/a0/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */