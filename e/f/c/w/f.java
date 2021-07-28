package e.f.c.w;

import e.f.c.a;
import e.f.c.s.a;

public final class f extends p {
  private final int[] h = new int[4];
  
  protected int a(a parama, int[] paramArrayOfint, StringBuilder paramStringBuilder) {
    int[] arrayOfInt = this.h;
    arrayOfInt[0] = 0;
    arrayOfInt[1] = 0;
    arrayOfInt[2] = 0;
    arrayOfInt[3] = 0;
    int k = parama.c();
    int i = paramArrayOfint[1];
    int j;
    for (j = 0; j < 4 && i < k; j++) {
      paramStringBuilder.append((char)(p.a(parama, arrayOfInt, i, p.f) + 48));
      int n = arrayOfInt.length;
      int m;
      for (m = 0; m < n; m++)
        i += arrayOfInt[m]; 
    } 
    i = p.a(parama, i, true, p.e)[1];
    for (j = 0; j < 4 && i < k; j++) {
      paramStringBuilder.append((char)(p.a(parama, arrayOfInt, i, p.f) + 48));
      int n = arrayOfInt.length;
      int m;
      for (m = 0; m < n; m++)
        i += arrayOfInt[m]; 
    } 
    return i;
  }
  
  a b() {
    return a.i;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/w/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */