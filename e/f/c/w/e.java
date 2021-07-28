package e.f.c.w;

import e.f.c.a;
import e.f.c.j;
import e.f.c.s.a;

public final class e extends p {
  static final int[] i = new int[] { 0, 11, 13, 14, 19, 25, 28, 21, 22, 26 };
  
  private final int[] h = new int[4];
  
  private static void a(StringBuilder paramStringBuilder, int paramInt) {
    for (int i = 0; i < 10; i++) {
      if (paramInt == i[i]) {
        paramStringBuilder.insert(0, (char)(i + 48));
        return;
      } 
    } 
    j j = j.a();
    throw j;
  }
  
  protected int a(a parama, int[] paramArrayOfint, StringBuilder paramStringBuilder) {
    int[] arrayOfInt = this.h;
    arrayOfInt[0] = 0;
    arrayOfInt[1] = 0;
    arrayOfInt[2] = 0;
    arrayOfInt[3] = 0;
    int m = parama.c();
    int i = paramArrayOfint[1];
    int j = 0;
    int k;
    for (k = 0; j < 6 && i < m; k = n) {
      int i1 = p.a(parama, arrayOfInt, i, p.g);
      paramStringBuilder.append((char)(i1 % 10 + 48));
      int i2 = arrayOfInt.length;
      int n;
      for (n = 0; n < i2; n++)
        i += arrayOfInt[n]; 
      n = k;
      if (i1 >= 10)
        n = 1 << 5 - j | k; 
      j++;
    } 
    a(paramStringBuilder, k);
    i = p.a(parama, i, true, p.e)[1];
    for (j = 0; j < 6 && i < m; j++) {
      paramStringBuilder.append((char)(p.a(parama, arrayOfInt, i, p.f) + 48));
      int n = arrayOfInt.length;
      for (k = 0; k < n; k++)
        i += arrayOfInt[k]; 
    } 
    return i;
  }
  
  a b() {
    return a.j;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/w/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */