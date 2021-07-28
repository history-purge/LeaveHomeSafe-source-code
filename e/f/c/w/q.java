package e.f.c.w;

import e.f.c.a;
import e.f.c.j;
import e.f.c.s.a;

public final class q extends p {
  private static final int[] i = new int[] { 1, 1, 1, 1, 1, 1 };
  
  static final int[][] j = new int[][] { { 56, 52, 50, 49, 44, 38, 35, 42, 41, 37 }, { 7, 11, 13, 14, 19, 25, 28, 21, 22, 26 } };
  
  private final int[] h = new int[4];
  
  private static void a(StringBuilder paramStringBuilder, int paramInt) {
    for (int i = 0; i <= 1; i++) {
      for (int k = 0; k < 10; k++) {
        if (paramInt == j[i][k]) {
          paramStringBuilder.insert(0, (char)(i + 48));
          paramStringBuilder.append((char)(k + 48));
          return;
        } 
      } 
    } 
    j j = j.a();
    throw j;
  }
  
  public static String b(String paramString) {
    char[] arrayOfChar = new char[6];
    paramString.getChars(1, 7, arrayOfChar, 0);
    StringBuilder stringBuilder = new StringBuilder(12);
    stringBuilder.append(paramString.charAt(0));
    char c = arrayOfChar[5];
    switch (c) {
      default:
        stringBuilder.append(arrayOfChar, 0, 5);
        stringBuilder.append("0000");
        stringBuilder.append(c);
        break;
      case '4':
        stringBuilder.append(arrayOfChar, 0, 4);
        stringBuilder.append("00000");
        stringBuilder.append(arrayOfChar[4]);
        break;
      case '3':
        stringBuilder.append(arrayOfChar, 0, 3);
        stringBuilder.append("00000");
        stringBuilder.append(arrayOfChar, 3, 2);
        break;
      case '0':
      case '1':
      case '2':
        stringBuilder.append(arrayOfChar, 0, 2);
        stringBuilder.append(c);
        stringBuilder.append("0000");
        stringBuilder.append(arrayOfChar, 2, 3);
        break;
    } 
    if (paramString.length() >= 8)
      stringBuilder.append(paramString.charAt(7)); 
    return stringBuilder.toString();
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
    return i;
  }
  
  protected boolean a(String paramString) {
    return super.a(b(paramString));
  }
  
  protected int[] a(a parama, int paramInt) {
    return p.a(parama, paramInt, true, i);
  }
  
  a b() {
    return a.r;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/w/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */