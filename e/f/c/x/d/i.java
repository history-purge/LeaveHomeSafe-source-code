package e.f.c.x.d;

import e.f.c.s.m.a;
import e.f.c.x.a;
import java.lang.reflect.Array;

final class i {
  private static final float[][] a = (float[][])Array.newInstance(float.class, new int[] { a.b.length, 8 });
  
  static {
    int j = 0;
    while (true) {
      int[] arrayOfInt = a.b;
      if (j < arrayOfInt.length) {
        int n = arrayOfInt[j];
        int k = n & 0x1;
        int m = 0;
        while (m < 8) {
          float f = 0.0F;
          while (true) {
            int i1 = n & 0x1;
            if (i1 == k) {
              f++;
              n >>= 1;
              continue;
            } 
            a[j][8 - m - 1] = f / 17.0F;
            m++;
            k = i1;
          } 
        } 
        j++;
        continue;
      } 
      break;
    } 
  }
  
  private static int a(int[] paramArrayOfint) {
    long l = 0L;
    for (int j = 0; j < paramArrayOfint.length; j++) {
      for (int k = 0; k < paramArrayOfint[j]; k++) {
        boolean bool = true;
        if (j % 2 != 0)
          bool = false; 
        l = l << 1L | bool;
      } 
    } 
    return (int)l;
  }
  
  private static int b(int[] paramArrayOfint) {
    int k = a.a(paramArrayOfint);
    float[] arrayOfFloat = new float[8];
    if (k > 1) {
      int m;
      for (m = 0; m < 8; m++)
        arrayOfFloat[m] = paramArrayOfint[m] / k; 
    } 
    k = -1;
    int j = 0;
    float f = Float.MAX_VALUE;
    while (true) {
      float[][] arrayOfFloat1 = a;
      if (j < arrayOfFloat1.length) {
        float f1;
        float[] arrayOfFloat2 = arrayOfFloat1[j];
        int m = 0;
        float f2 = 0.0F;
        while (true) {
          f1 = f2;
          if (m < 8) {
            f1 = arrayOfFloat2[m] - arrayOfFloat[m];
            f2 += f1 * f1;
            f1 = f2;
            if (f2 < f) {
              m++;
              continue;
            } 
          } 
          break;
        } 
        f2 = f;
        if (f1 < f) {
          k = a.b[j];
          f2 = f1;
        } 
        j++;
        f = f2;
        continue;
      } 
      return k;
    } 
  }
  
  private static int c(int[] paramArrayOfint) {
    int j = a(paramArrayOfint);
    return (a.a(j) == -1) ? -1 : j;
  }
  
  static int d(int[] paramArrayOfint) {
    int j = c(e(paramArrayOfint));
    return (j != -1) ? j : b(paramArrayOfint);
  }
  
  private static int[] e(int[] paramArrayOfint) {
    float f = a.a(paramArrayOfint);
    int[] arrayOfInt = new int[8];
    int k = 0;
    int m = 0;
    int j;
    for (j = 0; k < 17; j = n) {
      float f1 = f / 34.0F;
      float f2 = k * f / 17.0F;
      int i1 = m;
      int n = j;
      if ((paramArrayOfint[j] + m) <= f1 + f2) {
        i1 = m + paramArrayOfint[j];
        n = j + 1;
      } 
      arrayOfInt[n] = arrayOfInt[n] + 1;
      k++;
      m = i1;
    } 
    return arrayOfInt;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/x/d/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */