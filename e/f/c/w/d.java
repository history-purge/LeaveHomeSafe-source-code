package e.f.c.w;

import e.f.c.a;
import e.f.c.e;
import e.f.c.f;
import e.f.c.j;
import e.f.c.n;
import e.f.c.p;
import e.f.c.s.a;
import java.util.Arrays;
import java.util.Map;

public final class d extends k {
  private static final char[] c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();
  
  static final int[] d;
  
  private static final int e;
  
  private final StringBuilder a = new StringBuilder(20);
  
  private final int[] b = new int[6];
  
  static {
    int[] arrayOfInt = new int[48];
    arrayOfInt[0] = 276;
    arrayOfInt[1] = 328;
    arrayOfInt[2] = 324;
    arrayOfInt[3] = 322;
    arrayOfInt[4] = 296;
    arrayOfInt[5] = 292;
    arrayOfInt[6] = 290;
    arrayOfInt[7] = 336;
    arrayOfInt[8] = 274;
    arrayOfInt[9] = 266;
    arrayOfInt[10] = 424;
    arrayOfInt[11] = 420;
    arrayOfInt[12] = 418;
    arrayOfInt[13] = 404;
    arrayOfInt[14] = 402;
    arrayOfInt[15] = 394;
    arrayOfInt[16] = 360;
    arrayOfInt[17] = 356;
    arrayOfInt[18] = 354;
    arrayOfInt[19] = 308;
    arrayOfInt[20] = 282;
    arrayOfInt[21] = 344;
    arrayOfInt[22] = 332;
    arrayOfInt[23] = 326;
    arrayOfInt[24] = 300;
    arrayOfInt[25] = 278;
    arrayOfInt[26] = 436;
    arrayOfInt[27] = 434;
    arrayOfInt[28] = 428;
    arrayOfInt[29] = 422;
    arrayOfInt[30] = 406;
    arrayOfInt[31] = 410;
    arrayOfInt[32] = 364;
    arrayOfInt[33] = 358;
    arrayOfInt[34] = 310;
    arrayOfInt[35] = 314;
    arrayOfInt[36] = 302;
    arrayOfInt[37] = 468;
    arrayOfInt[38] = 466;
    arrayOfInt[39] = 458;
    arrayOfInt[40] = 366;
    arrayOfInt[41] = 374;
    arrayOfInt[42] = 430;
    arrayOfInt[43] = 294;
    arrayOfInt[44] = 474;
    arrayOfInt[45] = 470;
    arrayOfInt[46] = 306;
    arrayOfInt[47] = 350;
    d = arrayOfInt;
    e = arrayOfInt[47];
  }
  
  private static char a(int paramInt) {
    int i = 0;
    while (true) {
      int[] arrayOfInt = d;
      if (i < arrayOfInt.length) {
        if (arrayOfInt[i] == paramInt)
          return c[i]; 
        i++;
        continue;
      } 
      j j = j.a();
      throw j;
    } 
  }
  
  private static int a(int[] paramArrayOfint) {
    int m = paramArrayOfint.length;
    int i = 0;
    int j = 0;
    while (i < m) {
      j += paramArrayOfint[i];
      i++;
    } 
    int n = paramArrayOfint.length;
    m = 0;
    i = 0;
    while (m < n) {
      int i1 = Math.round(paramArrayOfint[m] * 9.0F / j);
      if (i1 <= 0 || i1 > 4)
        return -1; 
      if ((m & 0x1) == 0) {
        int i2;
        for (i2 = 0; i2 < i1; i2++)
          i = i << 1 | 0x1; 
      } else {
        i <<= i1;
      } 
      m++;
    } 
    return i;
  }
  
  private static void a(CharSequence paramCharSequence) {
    int i = paramCharSequence.length();
    a(paramCharSequence, i - 2, 20);
    a(paramCharSequence, i - 1, 15);
  }
  
  private static void a(CharSequence paramCharSequence, int paramInt1, int paramInt2) {
    int j = paramInt1 - 1;
    int m = 0;
    int i = 1;
    while (j >= 0) {
      m += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(paramCharSequence.charAt(j)) * i;
      int n = i + 1;
      i = n;
      if (n > paramInt2)
        i = 1; 
      j--;
    } 
    if (paramCharSequence.charAt(paramInt1) == c[m % 47])
      return; 
    e.f.c.d d1 = e.f.c.d.a();
    throw d1;
  }
  
  private int[] a(a parama) {
    int i1 = parama.c();
    int n = parama.b(0);
    Arrays.fill(this.b, 0);
    int[] arrayOfInt = this.b;
    int i2 = arrayOfInt.length;
    int i = n;
    boolean bool = false;
    int m = 0;
    while (n < i1) {
      int i3;
      if (parama.a(n) != bool) {
        arrayOfInt[m] = arrayOfInt[m] + 1;
        i3 = i;
      } else {
        if (m == i2 - 1) {
          if (a(arrayOfInt) == e)
            return new int[] { i, n }; 
          int i5 = i + arrayOfInt[0] + arrayOfInt[1];
          i = m - 1;
          System.arraycopy(arrayOfInt, 2, arrayOfInt, 0, i);
          arrayOfInt[i] = 0;
          arrayOfInt[m] = 0;
          i = m - 1;
          m = i5;
        } else {
          int i5 = m + 1;
          m = i;
          i = i5;
        } 
        arrayOfInt[i] = 1;
        int i4 = bool ^ true;
        i3 = m;
        m = i;
      } 
      n++;
      i = i3;
    } 
    j j = j.a();
    throw j;
  }
  
  private static String b(CharSequence paramCharSequence) {
    int j = paramCharSequence.length();
    StringBuilder stringBuilder = new StringBuilder(j);
    for (int i = 0; i < j; i = m + 1) {
      char c1 = paramCharSequence.charAt(i);
      int m = i;
      char c = c1;
      if (c1 >= 'a') {
        m = i;
        c = c1;
        if (c1 <= 'd')
          if (i < j - 1) {
            m = i + 1;
            i = paramCharSequence.charAt(m);
            switch (c1) {
              default:
                c = Character.MIN_VALUE;
                break;
              case 'd':
                if (i >= 65 && i <= 90) {
                  i += 32;
                } else {
                  throw f.a();
                } 
                c = (char)i;
                break;
              case 'c':
                if (i >= 65 && i <= 79) {
                  i -= 32;
                } else {
                  if (i == 90) {
                    c = ':';
                    break;
                  } 
                  throw f.a();
                } 
                c = (char)i;
                break;
              case 'b':
                if (i >= 65 && i <= 69) {
                  i -= 38;
                } else if (i >= 70 && i <= 74) {
                  i -= 11;
                } else if (i >= 75 && i <= 79) {
                  i += 16;
                } else if (i >= 80 && i <= 83) {
                  i += 43;
                } else {
                  if (i >= 84 && i <= 90) {
                    c = '';
                    break;
                  } 
                  throw f.a();
                } 
                c = (char)i;
                break;
              case 'a':
                if (i >= 65 && i <= 90) {
                  i -= 64;
                } else {
                  throw f.a();
                } 
                c = (char)i;
                break;
            } 
          } else {
            throw f.a();
          }  
      } 
      stringBuilder.append(c);
    } 
    return stringBuilder.toString();
  }
  
  public n a(int paramInt, a parama, Map<e, ?> paramMap) {
    int[] arrayOfInt1 = a(parama);
    int i = parama.b(arrayOfInt1[1]);
    int j = parama.c();
    int[] arrayOfInt2 = this.b;
    Arrays.fill(arrayOfInt2, 0);
    StringBuilder stringBuilder = this.a;
    stringBuilder.setLength(0);
    while (true) {
      k.a(parama, i, arrayOfInt2);
      int m = a(arrayOfInt2);
      if (m >= 0) {
        char c = a(m);
        stringBuilder.append(c);
        int i1 = arrayOfInt2.length;
        int n = i;
        for (m = 0; m < i1; m++)
          n += arrayOfInt2[m]; 
        i1 = parama.b(n);
        if (c == '*') {
          stringBuilder.deleteCharAt(stringBuilder.length() - 1);
          int i2 = arrayOfInt2.length;
          m = 0;
          n = 0;
          while (m < i2) {
            n += arrayOfInt2[m];
            m++;
          } 
          if (i1 != j && parama.a(i1)) {
            if (stringBuilder.length() >= 2) {
              a(stringBuilder);
              stringBuilder.setLength(stringBuilder.length() - 2);
              String str = b(stringBuilder);
              float f1 = (arrayOfInt1[1] + arrayOfInt1[0]) / 2.0F;
              float f2 = i;
              float f3 = n / 2.0F;
              float f4 = paramInt;
              p p1 = new p(f1, f4);
              p p2 = new p(f2 + f3, f4);
              a a1 = a.f;
              return new n(str, null, new p[] { p1, p2 }, a1);
            } 
            throw j.a();
          } 
          throw j.a();
        } 
        i = i1;
        continue;
      } 
      j j1 = j.a();
      throw j1;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/w/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */