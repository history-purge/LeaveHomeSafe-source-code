package e.f.c.y.c;

import e.f.c.j;
import e.f.c.q;
import java.util.ArrayList;
import java.util.List;

final class b {
  private final e.f.c.s.b a;
  
  private final List<a> b;
  
  private final int c;
  
  private final int d;
  
  private final int e;
  
  private final int f;
  
  private final float g;
  
  private final int[] h;
  
  private final q i;
  
  b(e.f.c.s.b paramb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, q paramq) {
    this.a = paramb;
    this.b = new ArrayList<a>(5);
    this.c = paramInt1;
    this.d = paramInt2;
    this.e = paramInt3;
    this.f = paramInt4;
    this.g = paramFloat;
    this.h = new int[3];
    this.i = paramq;
  }
  
  private float a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    e.f.c.s.b b1 = this.a;
    int j = b1.c();
    int[] arrayOfInt = this.h;
    arrayOfInt[0] = 0;
    arrayOfInt[1] = 0;
    arrayOfInt[2] = 0;
    int i;
    for (i = paramInt1; i >= 0 && b1.b(paramInt2, i) && arrayOfInt[1] <= paramInt3; i--)
      arrayOfInt[1] = arrayOfInt[1] + 1; 
    if (i >= 0) {
      if (arrayOfInt[1] > paramInt3)
        return Float.NaN; 
      while (i >= 0 && !b1.b(paramInt2, i) && arrayOfInt[0] <= paramInt3) {
        arrayOfInt[0] = arrayOfInt[0] + 1;
        i--;
      } 
      if (arrayOfInt[0] > paramInt3)
        return Float.NaN; 
      while (++paramInt1 < j && b1.b(paramInt2, paramInt1) && arrayOfInt[1] <= paramInt3) {
        arrayOfInt[1] = arrayOfInt[1] + 1;
        paramInt1++;
      } 
      if (paramInt1 != j) {
        if (arrayOfInt[1] > paramInt3)
          return Float.NaN; 
        while (paramInt1 < j && !b1.b(paramInt2, paramInt1) && arrayOfInt[2] <= paramInt3) {
          arrayOfInt[2] = arrayOfInt[2] + 1;
          paramInt1++;
        } 
        if (arrayOfInt[2] > paramInt3)
          return Float.NaN; 
        if (Math.abs(arrayOfInt[0] + arrayOfInt[1] + arrayOfInt[2] - paramInt4) * 5 >= paramInt4 * 2)
          return Float.NaN; 
        if (a(arrayOfInt))
          return a(arrayOfInt, paramInt1); 
      } 
    } 
    return Float.NaN;
  }
  
  private static float a(int[] paramArrayOfint, int paramInt) {
    return (paramInt - paramArrayOfint[2]) - paramArrayOfint[1] / 2.0F;
  }
  
  private a a(int[] paramArrayOfint, int paramInt1, int paramInt2) {
    int i = paramArrayOfint[0];
    int j = paramArrayOfint[1];
    int k = paramArrayOfint[2];
    float f1 = a(paramArrayOfint, paramInt2);
    float f2 = a(paramInt1, (int)f1, paramArrayOfint[1] * 2, i + j + k);
    if (!Float.isNaN(f2)) {
      float f = (paramArrayOfint[0] + paramArrayOfint[1] + paramArrayOfint[2]) / 3.0F;
      for (a a1 : this.b) {
        if (a1.a(f, f2, f1))
          return a1.b(f2, f1, f); 
      } 
      a a = new a(f1, f2, f);
      this.b.add(a);
      q q1 = this.i;
      if (q1 != null)
        q1.a(a); 
    } 
    return null;
  }
  
  private boolean a(int[] paramArrayOfint) {
    float f1 = this.g;
    float f2 = f1 / 2.0F;
    int i;
    for (i = 0; i < 3; i++) {
      if (Math.abs(f1 - paramArrayOfint[i]) >= f2)
        return false; 
    } 
    return true;
  }
  
  a a() {
    int j = this.c;
    int k = this.f;
    int m = this.e + j;
    int n = this.d;
    int i1 = k / 2;
    int[] arrayOfInt = new int[3];
    for (int i = 0; i < k; i++) {
      if ((i & 0x1) == 0) {
        i2 = (i + 1) / 2;
      } else {
        i2 = -((i + 1) / 2);
      } 
      int i5 = i2 + n + i1;
      arrayOfInt[0] = 0;
      arrayOfInt[1] = 0;
      arrayOfInt[2] = 0;
      int i3;
      for (i3 = j; i3 < m && !this.a.b(i3, i5); i3++);
      int i2 = 0;
      int i4;
      for (i4 = i3; i4 < m; i4++) {
        if (this.a.b(i4, i5)) {
          if (i2 == 1) {
            arrayOfInt[1] = arrayOfInt[1] + 1;
          } else if (i2 == 2) {
            if (a(arrayOfInt)) {
              a a = a(arrayOfInt, i5, i4);
              if (a != null)
                return a; 
            } 
            arrayOfInt[0] = arrayOfInt[2];
            arrayOfInt[1] = 1;
            arrayOfInt[2] = 0;
            i2 = 1;
          } else {
            arrayOfInt[++i2] = arrayOfInt[i2] + 1;
          } 
        } else {
          i3 = i2;
          if (i2 == 1)
            i3 = i2 + 1; 
          arrayOfInt[i3] = arrayOfInt[i3] + 1;
          i2 = i3;
        } 
      } 
      if (a(arrayOfInt)) {
        a a = a(arrayOfInt, i5, m);
        if (a != null)
          return a; 
      } 
    } 
    if (!this.b.isEmpty())
      return this.b.get(0); 
    j j1 = j.a();
    throw j1;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/y/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */