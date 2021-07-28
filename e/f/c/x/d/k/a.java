package e.f.c.x.d.k;

import e.f.c.d;

public final class a {
  private final b a = b.f;
  
  private int[] a(c paramc) {
    int k = paramc.a();
    int[] arrayOfInt = new int[k];
    int i = 1;
    int j;
    for (j = 0; i < this.a.b() && j < k; j = m) {
      int m = j;
      if (paramc.a(i) == 0) {
        arrayOfInt[j] = this.a.b(i);
        m = j + 1;
      } 
      i++;
    } 
    if (j == k)
      return arrayOfInt; 
    d d = d.a();
    throw d;
  }
  
  private int[] a(c paramc1, c paramc2, int[] paramArrayOfint) {
    int j = paramc2.a();
    int[] arrayOfInt = new int[j];
    int i;
    for (i = 1; i <= j; i++)
      arrayOfInt[j - i] = this.a.c(i, paramc2.b(i)); 
    paramc2 = new c(this.a, arrayOfInt);
    j = paramArrayOfint.length;
    arrayOfInt = new int[j];
    for (i = 0; i < j; i++) {
      int m = this.a.b(paramArrayOfint[i]);
      int k = this.a.d(0, paramc1.a(m));
      m = this.a.b(paramc2.a(m));
      arrayOfInt[i] = this.a.c(k, m);
    } 
    return arrayOfInt;
  }
  
  private c[] a(c paramc1, c paramc2, int paramInt) {
    c c1 = paramc1;
    c c2 = paramc2;
    if (paramc1.a() < paramc2.a()) {
      c2 = paramc1;
      c1 = paramc2;
    } 
    c c3 = this.a.c();
    paramc2 = this.a.a();
    paramc1 = c2;
    c2 = c3;
    while (true) {
      c3 = c2;
      c2 = c1;
      c1 = paramc1;
      if (c1.a() >= paramInt / 2) {
        if (!c1.b()) {
          c c4 = this.a.c();
          int i = c1.b(c1.a());
          i = this.a.b(i);
          paramc1 = c2;
          c2 = c4;
          while (paramc1.a() >= c1.a() && !paramc1.b()) {
            int j = paramc1.a() - c1.a();
            int k = this.a.c(paramc1.b(paramc1.a()), i);
            c2 = c2.a(this.a.b(j, k));
            paramc1 = paramc1.c(c1.a(j, k));
          } 
          c3 = c2.b(paramc2).c(c3).c();
          c2 = paramc2;
          paramc2 = c3;
          continue;
        } 
        throw d.a();
      } 
      paramInt = paramc2.b(0);
      if (paramInt != 0) {
        paramInt = this.a.b(paramInt);
        return new c[] { paramc2.c(paramInt), c1.c(paramInt) };
      } 
      d d = d.a();
      throw d;
    } 
  }
  
  public int a(int[] paramArrayOfint1, int paramInt, int[] paramArrayOfint2) {
    c c2 = new c(this.a, paramArrayOfint1);
    int[] arrayOfInt3 = new int[paramInt];
    boolean bool = false;
    int i = paramInt;
    int j = 0;
    while (i > 0) {
      int k = c2.a(this.a.a(i));
      arrayOfInt3[paramInt - i] = k;
      if (k != 0)
        j = 1; 
      i--;
    } 
    if (!j)
      return 0; 
    c2 = this.a.a();
    if (paramArrayOfint2 != null) {
      j = paramArrayOfint2.length;
      for (i = 0; i < j; i++) {
        int k = paramArrayOfint2[i];
        k = this.a.a(paramArrayOfint1.length - 1 - k);
        b b1 = this.a;
        c2 = c2.b(new c(b1, new int[] { b1.d(0, k), 1 }));
      } 
    } 
    c c1 = new c(this.a, arrayOfInt3);
    c[] arrayOfC = a(this.a.b(paramInt, 1), c1, paramInt);
    c1 = arrayOfC[0];
    c c3 = arrayOfC[1];
    int[] arrayOfInt2 = a(c1);
    int[] arrayOfInt1 = a(c3, c1, arrayOfInt2);
    paramInt = bool;
    while (paramInt < arrayOfInt2.length) {
      i = paramArrayOfint1.length - 1 - this.a.c(arrayOfInt2[paramInt]);
      if (i >= 0) {
        paramArrayOfint1[i] = this.a.d(paramArrayOfint1[i], arrayOfInt1[paramInt]);
        paramInt++;
        continue;
      } 
      throw d.a();
    } 
    return arrayOfInt2.length;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/x/d/k/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */