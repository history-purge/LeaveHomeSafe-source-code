package net.time4j.history;

import net.time4j.c1.c;

class m {
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
        return a(paramInt1) ? 29 : 28;
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
  
  public static void a(int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt1 >= -999999999 && paramInt1 <= 999999999) {
      if (paramInt2 >= 1 && paramInt2 <= 12) {
        if (paramInt3 >= 1 && paramInt3 <= 31) {
          if (paramInt3 <= a(paramInt1, paramInt2))
            return; 
          StringBuilder stringBuilder3 = new StringBuilder();
          stringBuilder3.append("DAY_OF_MONTH exceeds month length in given year: ");
          stringBuilder3.append(d(paramInt1, paramInt2, paramInt3));
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
  
  public static boolean a(int paramInt) {
    return (c.b(paramInt, 4) == 0);
  }
  
  public static int b(long paramLong) {
    return (int)(paramLong >> 16L & 0xFFL);
  }
  
  public static boolean b(int paramInt1, int paramInt2, int paramInt3) {
    return (paramInt1 >= -999999999 && paramInt1 <= 999999999 && paramInt2 >= 1 && paramInt2 <= 12 && paramInt3 >= 1 && paramInt3 <= a(paramInt1, paramInt2));
  }
  
  public static int c(long paramLong) {
    return (int)(paramLong >> 32L);
  }
  
  public static long c(int paramInt1, int paramInt2, int paramInt3) {
    a(paramInt1, paramInt2, paramInt3);
    long l2 = paramInt1;
    long l1 = l2;
    paramInt1 = paramInt2;
    if (paramInt2 < 3) {
      l1 = l2 - 1L;
      paramInt1 = paramInt2 + 12;
    } 
    return 365L * l1 + c.a(l1, 4) + ((paramInt1 + 1) * 153 / 5) - 123L + paramInt3 - 678883L;
  }
  
  public static long d(long paramLong) {
    paramLong = c.a(paramLong, 678883L);
    long l = c.a(paramLong, 1461);
    int j = c.b(paramLong, 1461);
    int i = 2;
    if (j == 1460) {
      paramLong = (l + 1L) * 4L;
      j = 29;
    } else {
      i = j / 365;
      j %= 365;
      l = l * 4L + i;
      int k = 2 + (j + 31) * 5 / 153;
      int n = j - (k + 1) * 153 / 5 + 123;
      paramLong = l;
      j = n;
      i = k;
      if (k > 12) {
        paramLong = l + 1L;
        i = k - 12;
        j = n;
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
  
  private static String d(int paramInt1, int paramInt2, int paramInt3) {
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


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/history/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */