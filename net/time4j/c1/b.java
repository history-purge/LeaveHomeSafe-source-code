package net.time4j.c1;

public final class b {
  private static int a(int paramInt) {
    StringBuilder stringBuilder;
    switch (paramInt) {
      default:
        stringBuilder = new StringBuilder();
        stringBuilder.append("Month out of range: ");
        stringBuilder.append(paramInt);
        throw new IllegalArgumentException(stringBuilder.toString());
      case 12:
        return 25;
      case 11:
        return 23;
      case 10:
        return 20;
      case 9:
        return 18;
      case 8:
        return 15;
      case 7:
        return 12;
      case 6:
        return 10;
      case 5:
        return 7;
      case 4:
        return 5;
      case 3:
        return 2;
      case 2:
        return 31;
      case 1:
        break;
    } 
    return 28;
  }
  
  public static int a(int paramInt1, int paramInt2) {
    StringBuilder stringBuilder;
    switch (paramInt2) {
      default:
        stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid month: ");
        stringBuilder.append(paramInt2);
        throw new IllegalArgumentException(stringBuilder.toString());
      case 4:
      case 6:
      case 9:
      case 11:
        return 30;
      case 2:
        return b(paramInt1) ? 29 : 28;
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        break;
    } 
    return 31;
  }
  
  public static int a(long paramLong) {
    return (int)(paramLong & 0xFFL);
  }
  
  public static long a(a parama) {
    return d(parama.getYear(), parama.getMonth(), parama.r());
  }
  
  public static void a(int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt1 >= -999999999 && paramInt1 <= 999999999) {
      if (paramInt2 >= 1 && paramInt2 <= 12) {
        if (paramInt3 >= 1 && paramInt3 <= 31) {
          if (paramInt3 <= a(paramInt1, paramInt2))
            return; 
          StringBuilder stringBuilder3 = new StringBuilder();
          stringBuilder3.append("DAY_OF_MONTH exceeds month length in given year: ");
          stringBuilder3.append(e(paramInt1, paramInt2, paramInt3));
          throw new IllegalArgumentException(stringBuilder3.toString());
        } 
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("DAY_OF_MONTH out of range: ");
        stringBuilder2.append(paramInt3);
        throw new IllegalArgumentException(stringBuilder2.toString());
      } 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("MONTH out of range: ");
      stringBuilder1.append(paramInt2);
      throw new IllegalArgumentException(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("YEAR out of range: ");
    stringBuilder.append(paramInt1);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public static int b(int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt3 >= 1 && paramInt3 <= 31) {
      if (paramInt3 <= a(paramInt1, paramInt2)) {
        int m = a(paramInt2);
        int j = paramInt1 % 100;
        int k = c.a(paramInt1, 100);
        int i = j;
        if (j < 0)
          i = j + 100; 
        paramInt1 = i;
        j = k;
        if (paramInt2 <= 2) {
          paramInt2 = i - 1;
          paramInt1 = paramInt2;
          j = k;
          if (paramInt2 < 0) {
            paramInt1 = 99;
            j = k - 1;
          } 
        } 
        paramInt2 = c.a(j, 4);
        paramInt2 = (paramInt3 + m + paramInt1 + paramInt1 / 4 + paramInt2 - j * 2) % 7;
        paramInt1 = paramInt2;
        if (paramInt2 <= 0)
          paramInt1 = paramInt2 + 7; 
        return paramInt1;
      } 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Day exceeds month length: ");
      stringBuilder1.append(e(paramInt1, paramInt2, paramInt3));
      throw new IllegalArgumentException(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Day out of range: ");
    stringBuilder.append(paramInt3);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public static int b(long paramLong) {
    return (int)(paramLong >> 16L & 0xFFL);
  }
  
  public static boolean b(int paramInt) {
    boolean bool = false;
    null = false;
    if (paramInt > 1900 && paramInt < 2100) {
      if ((paramInt & 0x3) == 0)
        null = true; 
      return null;
    } 
    if ((paramInt & 0x3) != 0 || paramInt % 100 == 0) {
      null = bool;
      return (paramInt % 400 == 0) ? true : null;
    } 
    return true;
  }
  
  public static int c(long paramLong) {
    return (int)(paramLong >> 32L);
  }
  
  public static boolean c(int paramInt1, int paramInt2, int paramInt3) {
    return (paramInt1 >= -999999999 && paramInt1 <= 999999999 && paramInt2 >= 1 && paramInt2 <= 12 && paramInt3 >= 1 && paramInt3 <= a(paramInt1, paramInt2));
  }
  
  public static long d(int paramInt1, int paramInt2, int paramInt3) {
    a(paramInt1, paramInt2, paramInt3);
    long l2 = paramInt1;
    long l1 = l2;
    paramInt1 = paramInt2;
    if (paramInt2 < 3) {
      l1 = l2 - 1L;
      paramInt1 = paramInt2 + 12;
    } 
    return 365L * l1 + c.a(l1, 4) - c.a(l1, 100) + c.a(l1, 400) + ((paramInt1 + 1) * 153 / 5) - 123L + paramInt3 - 678881L;
  }
  
  public static long d(long paramLong) {
    paramLong = c.a(paramLong, 678881L);
    long l = c.a(paramLong, 146097);
    int k = c.b(paramLong, 146097);
    int j = 29;
    int i = 2;
    if (k == 146096) {
      paramLong = (l + 1L) * 400L;
    } else {
      int m = k / 36524;
      int n = k % 36524;
      k = n / 1461;
      n %= 1461;
      if (n == 1460) {
        paramLong = l * 400L + (m * 100) + ((k + 1) * 4);
      } else {
        i = n / 365;
        j = n % 365;
        l = l * 400L + (m * 100) + (k * 4) + i;
        m = 2 + (j + 31) * 5 / 153;
        k = j - (m + 1) * 153 / 5 + 123;
        i = m;
        paramLong = l;
        j = k;
        if (m > 12) {
          paramLong = l + 1L;
          i = m - 12;
          j = k;
        } 
      } 
    } 
    if (paramLong >= -999999999L && paramLong <= 999999999L) {
      l = (i << 16);
      return j | paramLong << 32L | l;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Year out of range: ");
    stringBuilder.append(paramLong);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  static String e(int paramInt1, int paramInt2, int paramInt3) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramInt1);
    stringBuilder.append('-');
    if (paramInt2 < 10)
      stringBuilder.append('0'); 
    stringBuilder.append(paramInt2);
    stringBuilder.append('-');
    if (paramInt3 < 10)
      stringBuilder.append('0'); 
    stringBuilder.append(paramInt3);
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/c1/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */