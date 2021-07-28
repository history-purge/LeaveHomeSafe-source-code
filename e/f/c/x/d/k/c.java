package e.f.c.x.d.k;

final class c {
  private final b a;
  
  private final int[] b;
  
  c(b paramb, int[] paramArrayOfint) {
    if (paramArrayOfint.length != 0) {
      this.a = paramb;
      int i = paramArrayOfint.length;
      if (i > 1 && paramArrayOfint[0] == 0) {
        int j;
        for (j = 1; j < i && paramArrayOfint[j] == 0; j++);
        if (j == i) {
          this.b = new int[] { 0 };
          return;
        } 
        this.b = new int[i - j];
        int[] arrayOfInt = this.b;
        System.arraycopy(paramArrayOfint, j, arrayOfInt, 0, arrayOfInt.length);
        return;
      } 
      this.b = paramArrayOfint;
      return;
    } 
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
    throw illegalArgumentException;
  }
  
  int a() {
    return this.b.length - 1;
  }
  
  int a(int paramInt) {
    int j = 0;
    if (paramInt == 0)
      return b(0); 
    int i = 1;
    if (paramInt == 1) {
      int[] arrayOfInt1 = this.b;
      int m = arrayOfInt1.length;
      i = 0;
      for (paramInt = j; paramInt < m; paramInt++) {
        j = arrayOfInt1[paramInt];
        i = this.a.a(i, j);
      } 
      return i;
    } 
    int[] arrayOfInt = this.b;
    j = arrayOfInt[0];
    int k = arrayOfInt.length;
    while (i < k) {
      b b1 = this.a;
      j = b1.a(b1.c(paramInt, j), this.b[i]);
      i++;
    } 
    return j;
  }
  
  c a(int paramInt1, int paramInt2) {
    if (paramInt1 >= 0) {
      if (paramInt2 == 0)
        return this.a.c(); 
      int i = this.b.length;
      int[] arrayOfInt = new int[paramInt1 + i];
      for (paramInt1 = 0; paramInt1 < i; paramInt1++)
        arrayOfInt[paramInt1] = this.a.c(this.b[paramInt1], paramInt2); 
      return new c(this.a, arrayOfInt);
    } 
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
    throw illegalArgumentException;
  }
  
  c a(c paramc) {
    if (this.a.equals(paramc.a)) {
      if (b())
        return paramc; 
      if (paramc.b())
        return this; 
      int[] arrayOfInt2 = this.b;
      int[] arrayOfInt4 = paramc.b;
      int[] arrayOfInt3 = arrayOfInt2;
      int[] arrayOfInt1 = arrayOfInt4;
      if (arrayOfInt2.length > arrayOfInt4.length) {
        arrayOfInt3 = arrayOfInt4;
        arrayOfInt1 = arrayOfInt2;
      } 
      arrayOfInt2 = new int[arrayOfInt1.length];
      int j = arrayOfInt1.length - arrayOfInt3.length;
      System.arraycopy(arrayOfInt1, 0, arrayOfInt2, 0, j);
      for (int i = j; i < arrayOfInt1.length; i++)
        arrayOfInt2[i] = this.a.a(arrayOfInt3[i - j], arrayOfInt1[i]); 
      return new c(this.a, arrayOfInt2);
    } 
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    throw illegalArgumentException;
  }
  
  int b(int paramInt) {
    int[] arrayOfInt = this.b;
    return arrayOfInt[arrayOfInt.length - 1 - paramInt];
  }
  
  c b(c paramc) {
    if (this.a.equals(paramc.a)) {
      if (b() || paramc.b())
        return this.a.c(); 
      int[] arrayOfInt2 = this.b;
      int j = arrayOfInt2.length;
      int[] arrayOfInt1 = paramc.b;
      int k = arrayOfInt1.length;
      int[] arrayOfInt3 = new int[j + k - 1];
      for (int i = 0; i < j; i++) {
        int n = arrayOfInt2[i];
        for (int m = 0; m < k; m++) {
          int i1 = i + m;
          b b1 = this.a;
          arrayOfInt3[i1] = b1.a(arrayOfInt3[i1], b1.c(n, arrayOfInt1[m]));
        } 
      } 
      return new c(this.a, arrayOfInt3);
    } 
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    throw illegalArgumentException;
  }
  
  boolean b() {
    return (this.b[0] == 0);
  }
  
  c c() {
    int j = this.b.length;
    int[] arrayOfInt = new int[j];
    for (int i = 0; i < j; i++)
      arrayOfInt[i] = this.a.d(0, this.b[i]); 
    return new c(this.a, arrayOfInt);
  }
  
  c c(int paramInt) {
    if (paramInt == 0)
      return this.a.c(); 
    if (paramInt == 1)
      return this; 
    int j = this.b.length;
    int[] arrayOfInt = new int[j];
    for (int i = 0; i < j; i++)
      arrayOfInt[i] = this.a.c(this.b[i], paramInt); 
    return new c(this.a, arrayOfInt);
  }
  
  c c(c paramc) {
    if (this.a.equals(paramc.a))
      return paramc.b() ? this : a(paramc.c()); 
    throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(a() * 8);
    for (int i = a(); i >= 0; i--) {
      int j = b(i);
      if (j != 0) {
        int k;
        if (j < 0) {
          stringBuilder.append(" - ");
          k = -j;
        } else {
          k = j;
          if (stringBuilder.length() > 0) {
            stringBuilder.append(" + ");
            k = j;
          } 
        } 
        if (i == 0 || k != 1)
          stringBuilder.append(k); 
        if (i != 0)
          if (i == 1) {
            stringBuilder.append('x');
          } else {
            stringBuilder.append("x^");
            stringBuilder.append(i);
          }  
      } 
    } 
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/x/d/k/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */