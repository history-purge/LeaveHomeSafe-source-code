package e.e.l.q;

import e.e.e.d.i;
import e.e.k.b;
import e.e.l.e.e;
import e.e.l.e.f;
import e.e.l.k.d;

public class a {
  public static float a(f paramf, e parame, d paramd) {
    int j;
    i.a(d.d(paramd));
    if (parame == null || parame.b <= 0 || parame.a <= 0 || paramd.z() == 0 || paramd.r() == 0)
      return 1.0F; 
    int i = a(paramf, paramd);
    if (i == 90 || i == 270) {
      j = 1;
    } else {
      j = 0;
    } 
    if (j) {
      i = paramd.r();
    } else {
      i = paramd.z();
    } 
    if (j) {
      j = paramd.z();
    } else {
      j = paramd.r();
    } 
    float f1 = parame.a / i;
    float f2 = parame.b / j;
    float f3 = Math.max(f1, f2);
    e.e.e.e.a.b("DownsampleUtil", "Downsample - Specified size: %dx%d, image size: %dx%d ratio: %.1f x %.1f, ratio: %.3f", new Object[] { Integer.valueOf(parame.a), Integer.valueOf(parame.b), Integer.valueOf(i), Integer.valueOf(j), Float.valueOf(f1), Float.valueOf(f2), Float.valueOf(f3) });
    return f3;
  }
  
  public static int a(float paramFloat) {
    if (paramFloat > 0.6666667F)
      return 1; 
    int i;
    for (i = 2;; i++) {
      double d1 = i;
      double d2 = Math.pow(d1, 2.0D);
      Double.isNaN(d1);
      d2 = 1.0D / (d2 - d1);
      Double.isNaN(d1);
      if (1.0D / d1 + d2 * 0.3333333432674408D <= paramFloat)
        return i - 1; 
    } 
  }
  
  public static int a(f paramf, e parame, d paramd, int paramInt) {
    int i;
    if (!d.d(paramd))
      return 1; 
    float f1 = a(paramf, parame, paramd);
    if (paramd.t() == b.a) {
      i = b(f1);
    } else {
      i = a(f1);
    } 
    int j = Math.max(paramd.r(), paramd.z());
    if (parame != null) {
      f1 = parame.c;
    } else {
      f1 = paramInt;
    } 
    while ((j / i) > f1) {
      if (paramd.t() == b.a) {
        i *= 2;
        continue;
      } 
      i++;
    } 
    return i;
  }
  
  private static int a(f paramf, d paramd) {
    boolean bool1 = paramf.d();
    boolean bool = false;
    if (!bool1)
      return 0; 
    int i = paramd.v();
    if (i == 0 || i == 90 || i == 180 || i == 270)
      bool = true; 
    i.a(bool);
    return i;
  }
  
  public static int b(float paramFloat) {
    if (paramFloat > 0.6666667F)
      return 1; 
    for (int i = 2;; i = j) {
      int j = i * 2;
      double d = j;
      Double.isNaN(d);
      d = 1.0D / d;
      if (d + 0.3333333432674408D * d <= paramFloat)
        return i; 
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/q/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */