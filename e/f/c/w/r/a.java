package e.f.c.w.r;

import e.f.c.j;
import e.f.c.w.k;

public abstract class a extends k {
  private final int[] a = new int[4];
  
  private final int[] b = new int[8];
  
  private final float[] c = new float[4];
  
  private final float[] d = new float[4];
  
  private final int[] e;
  
  private final int[] f;
  
  protected a() {
    int[] arrayOfInt = this.b;
    this.e = new int[arrayOfInt.length / 2];
    this.f = new int[arrayOfInt.length / 2];
  }
  
  protected static int a(int[] paramArrayOfint, int[][] paramArrayOfint1) {
    for (int i = 0; i < paramArrayOfint1.length; i++) {
      if (k.a(paramArrayOfint, paramArrayOfint1[i], 0.45F) < 0.2F)
        return i; 
    } 
    j j = j.a();
    throw j;
  }
  
  protected static void a(int[] paramArrayOfint, float[] paramArrayOffloat) {
    float f = paramArrayOffloat[0];
    int i = 1;
    int j = 0;
    while (i < paramArrayOfint.length) {
      float f1 = f;
      if (paramArrayOffloat[i] < f) {
        f1 = paramArrayOffloat[i];
        j = i;
      } 
      i++;
      f = f1;
    } 
    paramArrayOfint[j] = paramArrayOfint[j] - 1;
  }
  
  protected static boolean a(int[] paramArrayOfint) {
    int i = paramArrayOfint[0] + paramArrayOfint[1];
    int j = paramArrayOfint[2];
    int m = paramArrayOfint[3];
    float f = i / (j + i + m);
    if (f >= 0.7916667F && f <= 0.89285713F) {
      int n = Integer.MIN_VALUE;
      int i1 = paramArrayOfint.length;
      j = 0;
      for (i = Integer.MAX_VALUE; j < i1; i = i3) {
        int i2 = paramArrayOfint[j];
        m = n;
        if (i2 > n)
          m = i2; 
        int i3 = i;
        if (i2 < i)
          i3 = i2; 
        j++;
        n = m;
      } 
      if (n < i * 10)
        return true; 
    } 
    return false;
  }
  
  protected static void b(int[] paramArrayOfint, float[] paramArrayOffloat) {
    float f = paramArrayOffloat[0];
    int i = 1;
    int j = 0;
    while (i < paramArrayOfint.length) {
      float f1 = f;
      if (paramArrayOffloat[i] > f) {
        f1 = paramArrayOffloat[i];
        j = i;
      } 
      i++;
      f = f1;
    } 
    paramArrayOfint[j] = paramArrayOfint[j] + 1;
  }
  
  protected final int[] b() {
    return this.b;
  }
  
  protected final int[] c() {
    return this.a;
  }
  
  protected final int[] d() {
    return this.f;
  }
  
  protected final float[] e() {
    return this.d;
  }
  
  protected final int[] f() {
    return this.e;
  }
  
  protected final float[] g() {
    return this.c;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/w/r/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */