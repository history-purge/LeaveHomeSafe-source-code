package e.f.c.s.n;

public final class c {
  private final a a;
  
  public c(a parama) {
    this.a = parama;
  }
  
  private int[] a(b paramb) {
    int k = paramb.a();
    int j = 0;
    int i = 1;
    if (k == 1)
      return new int[] { paramb.b(1) }; 
    int[] arrayOfInt = new int[k];
    while (i < this.a.c() && j < k) {
      int m = j;
      if (paramb.a(i) == 0) {
        arrayOfInt[j] = this.a.b(i);
        m = j + 1;
      } 
      i++;
      j = m;
    } 
    if (j == k)
      return arrayOfInt; 
    d d = new d("Error locator degree does not match number of roots");
    throw d;
  }
  
  private int[] a(b paramb, int[] paramArrayOfint) {
    int j = paramArrayOfint.length;
    int[] arrayOfInt = new int[j];
    for (int i = 0; i < j; i++) {
      int n = this.a.b(paramArrayOfint[i]);
      int k = 0;
      int m;
      for (m = 1; k < j; m = i1) {
        int i1 = m;
        if (i != k) {
          i1 = this.a.b(paramArrayOfint[k], n);
          if ((i1 & 0x1) == 0) {
            i1 |= 0x1;
          } else {
            i1 &= 0xFFFFFFFE;
          } 
          i1 = this.a.b(m, i1);
        } 
        k++;
      } 
      arrayOfInt[i] = this.a.b(paramb.a(n), this.a.b(m));
      if (this.a.a() != 0)
        arrayOfInt[i] = this.a.b(arrayOfInt[i], n); 
    } 
    return arrayOfInt;
  }
  
  private b[] a(b paramb1, b paramb2, int paramInt) {
    b b1 = paramb1;
    b b2 = paramb2;
    if (paramb1.a() < paramb2.a()) {
      b2 = paramb1;
      b1 = paramb2;
    } 
    b b3 = this.a.d();
    paramb2 = this.a.b();
    paramb1 = b2;
    b2 = b3;
    while (true) {
      b3 = b2;
      b2 = b1;
      b1 = paramb1;
      if (b1.a() >= paramInt / 2) {
        if (!b1.b()) {
          b b4 = this.a.d();
          int i = b1.b(b1.a());
          i = this.a.b(i);
          paramb1 = b2;
          b2 = b4;
          while (paramb1.a() >= b1.a() && !paramb1.b()) {
            int j = paramb1.a() - b1.a();
            int k = this.a.b(paramb1.b(paramb1.a()), i);
            b2 = b2.a(this.a.a(j, k));
            paramb1 = paramb1.a(b1.a(j, k));
          } 
          b3 = b2.b(paramb2).a(b3);
          if (paramb1.a() < b1.a()) {
            b2 = paramb2;
            paramb2 = b3;
            continue;
          } 
          throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
        } 
        throw new d("r_{i-1} was zero");
      } 
      paramInt = paramb2.b(0);
      if (paramInt != 0) {
        paramInt = this.a.b(paramInt);
        return new b[] { paramb2.c(paramInt), b1.c(paramInt) };
      } 
      d d = new d("sigmaTilde(0) was zero");
      throw d;
    } 
  }
  
  public void a(int[] paramArrayOfint, int paramInt) {
    b b1 = new b(this.a, paramArrayOfint);
    int[] arrayOfInt3 = new int[paramInt];
    boolean bool2 = false;
    int i = 0;
    boolean bool1 = true;
    while (i < paramInt) {
      a a1 = this.a;
      int j = b1.a(a1.a(a1.a() + i));
      arrayOfInt3[paramInt - 1 - i] = j;
      if (j != 0)
        bool1 = false; 
      i++;
    } 
    if (bool1)
      return; 
    b1 = new b(this.a, arrayOfInt3);
    b[] arrayOfB = a(this.a.a(paramInt, 1), b1, paramInt);
    b1 = arrayOfB[0];
    b b2 = arrayOfB[1];
    int[] arrayOfInt1 = a(b1);
    int[] arrayOfInt2 = a(b2, arrayOfInt1);
    paramInt = bool2;
    while (paramInt < arrayOfInt1.length) {
      i = paramArrayOfint.length - 1 - this.a.c(arrayOfInt1[paramInt]);
      if (i >= 0) {
        paramArrayOfint[i] = a.c(paramArrayOfint[i], arrayOfInt2[paramInt]);
        paramInt++;
        continue;
      } 
      throw new d("Bad error location");
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/s/n/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */