package e.e.l.q;

import android.graphics.Matrix;
import e.e.l.e.f;
import e.e.l.k.d;

public class e {
  public static final e.e.e.d.e<Integer> a = e.e.e.d.e.of((Object[])new Integer[] { Integer.valueOf(2), Integer.valueOf(7), Integer.valueOf(4), Integer.valueOf(5) });
  
  public static float a(e.e.l.e.e parame, int paramInt1, int paramInt2) {
    if (parame == null)
      return 1.0F; 
    float f1 = parame.a;
    float f4 = paramInt1;
    f1 /= f4;
    float f2 = parame.b;
    float f3 = paramInt2;
    f2 = Math.max(f1, f2 / f3);
    float f5 = parame.c;
    f1 = f2;
    if (f4 * f2 > f5)
      f1 = f5 / f4; 
    f4 = parame.c;
    f2 = f1;
    if (f3 * f1 > f4)
      f2 = f4 / f3; 
    return f2;
  }
  
  public static int a(float paramFloat1, float paramFloat2) {
    return (int)(paramFloat2 + paramFloat1 * 8.0F);
  }
  
  public static int a(int paramInt) {
    return Math.max(1, 8 / paramInt);
  }
  
  public static int a(f paramf, e.e.l.e.e parame, d paramd, boolean paramBoolean) {
    if (!paramBoolean)
      return 8; 
    if (parame == null)
      return 8; 
    int k = b(paramf, paramd);
    paramBoolean = a.contains(Integer.valueOf(paramd.e()));
    int i = 0;
    if (paramBoolean) {
      j = a(paramf, paramd);
    } else {
      j = 0;
    } 
    if (k == 90 || k == 270 || j == 5 || j == 7)
      i = 1; 
    if (i) {
      j = paramd.r();
    } else {
      j = paramd.z();
    } 
    if (i) {
      i = paramd.z();
    } else {
      i = paramd.r();
    } 
    int j = a(a(parame, j, i), parame.d);
    if (j > 8)
      return 8; 
    i = j;
    if (j < 1)
      i = 1; 
    return i;
  }
  
  public static int a(f paramf, d paramd) {
    int i = paramd.e();
    int j = a.indexOf(Integer.valueOf(i));
    if (j >= 0) {
      i = 0;
      if (!paramf.d())
        i = paramf.b(); 
      i /= 90;
      e.e.e.d.e<Integer> e1 = a;
      return ((Integer)e1.get((j + i) % e1.size())).intValue();
    } 
    throw new IllegalArgumentException("Only accepts inverted exif orientations");
  }
  
  private static int a(d paramd) {
    int i = paramd.v();
    return (i != 90 && i != 180 && i != 270) ? 0 : paramd.v();
  }
  
  public static Matrix a(d paramd, f paramf) {
    if (a.contains(Integer.valueOf(paramd.e())))
      return b(a(paramf, paramd)); 
    int i = b(paramf, paramd);
    if (i != 0) {
      Matrix matrix = new Matrix();
      matrix.setRotate(i);
      return matrix;
    } 
    return null;
  }
  
  public static int b(f paramf, d paramd) {
    if (!paramf.c())
      return 0; 
    int i = a(paramd);
    return paramf.d() ? i : ((i + paramf.b()) % 360);
  }
  
  private static Matrix b(int paramInt) {
    Matrix matrix = new Matrix();
    if (paramInt != 2) {
      if (paramInt != 7) {
        float f1;
        if (paramInt != 4) {
          if (paramInt != 5)
            return null; 
          f1 = 90.0F;
        } else {
          f1 = 180.0F;
        } 
        matrix.setRotate(f1);
        matrix.postScale(-1.0F, 1.0F);
        return matrix;
      } 
      float f = -90.0F;
      matrix.setRotate(f);
      matrix.postScale(-1.0F, 1.0F);
      return matrix;
    } 
    matrix.setScale(-1.0F, 1.0F);
    return matrix;
  }
  
  public static boolean c(int paramInt) {
    switch (paramInt) {
      default:
        return false;
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
        break;
    } 
    return true;
  }
  
  public static boolean d(int paramInt) {
    return (paramInt >= 0 && paramInt <= 270 && paramInt % 90 == 0);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/q/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */