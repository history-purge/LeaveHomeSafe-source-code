package e.f.c.s;

import e.f.c.j;

public final class f extends i {
  public b a(b paramb, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8, float paramFloat9, float paramFloat10, float paramFloat11, float paramFloat12, float paramFloat13, float paramFloat14, float paramFloat15, float paramFloat16) {
    return a(paramb, paramInt1, paramInt2, k.a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramFloat7, paramFloat8, paramFloat9, paramFloat10, paramFloat11, paramFloat12, paramFloat13, paramFloat14, paramFloat15, paramFloat16));
  }
  
  public b a(b paramb, int paramInt1, int paramInt2, k paramk) {
    if (paramInt1 > 0 && paramInt2 > 0) {
      b b1 = new b(paramInt1, paramInt2);
      float[] arrayOfFloat = new float[paramInt1 * 2];
      paramInt1 = 0;
      label29: while (true) {
        if (paramInt1 < paramInt2) {
          int n = arrayOfFloat.length;
          float f1 = paramInt1;
          int m;
          for (m = 0; m < n; m += 2) {
            arrayOfFloat[m] = (m / 2) + 0.5F;
            arrayOfFloat[m + 1] = f1 + 0.5F;
          } 
          paramk.a(arrayOfFloat);
          i.a(paramb, arrayOfFloat);
          m = 0;
          while (true) {
            if (m < n) {
              try {
                if (paramb.b((int)arrayOfFloat[m], (int)arrayOfFloat[m + 1]))
                  b1.c(m / 2, paramInt1); 
                m += 2;
              } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                throw j.a();
              } 
              continue;
            } 
            paramInt1++;
            continue label29;
          } 
          break;
        } 
        return b1;
      } 
    } 
    j j = j.a();
    throw j;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/s/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */