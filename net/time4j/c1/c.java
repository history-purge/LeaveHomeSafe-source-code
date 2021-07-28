package net.time4j.c1;

public final class c {
  public static int a(int paramInt) {
    if (paramInt != Integer.MIN_VALUE)
      return -paramInt; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Not negatable: ");
    stringBuilder.append(paramInt);
    throw new ArithmeticException(stringBuilder.toString());
  }
  
  public static int a(int paramInt1, int paramInt2) {
    return (paramInt1 >= 0) ? (paramInt1 / paramInt2) : ((paramInt1 + 1) / paramInt2 - 1);
  }
  
  public static int a(long paramLong) {
    if (paramLong >= -2147483648L && paramLong <= 2147483647L)
      return (int)paramLong; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Out of range: ");
    stringBuilder.append(paramLong);
    throw new ArithmeticException(stringBuilder.toString());
  }
  
  public static long a(long paramLong, int paramInt) {
    return (paramLong >= 0L) ? (paramLong / paramInt) : ((paramLong + 1L) / paramInt - 1L);
  }
  
  public static long a(long paramLong1, long paramLong2) {
    if (paramLong2 == 0L)
      return paramLong1; 
    if ((paramLong2 > 0L) ? (paramLong1 <= Long.MAX_VALUE - paramLong2) : (paramLong1 >= Long.MIN_VALUE - paramLong2))
      return paramLong1 + paramLong2; 
    StringBuilder stringBuilder = new StringBuilder(32);
    stringBuilder.append("Long overflow: (");
    stringBuilder.append(paramLong1);
    stringBuilder.append(',');
    stringBuilder.append(paramLong2);
    stringBuilder.append(')');
    throw new ArithmeticException(stringBuilder.toString());
  }
  
  public static int b(int paramInt1, int paramInt2) {
    return paramInt1 - paramInt2 * a(paramInt1, paramInt2);
  }
  
  public static int b(long paramLong, int paramInt) {
    return (int)(paramLong - paramInt * a(paramLong, paramInt));
  }
  
  public static long b(long paramLong) {
    if (paramLong != Long.MIN_VALUE)
      return -paramLong; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Not negatable: ");
    stringBuilder.append(paramLong);
    throw new ArithmeticException(stringBuilder.toString());
  }
  
  public static long b(long paramLong1, long paramLong2) {
    if (paramLong2 == 1L)
      return paramLong1; 
    if ((paramLong2 > 0L) ? (paramLong1 <= Long.MAX_VALUE / paramLong2 && paramLong1 >= Long.MIN_VALUE / paramLong2) : ((paramLong2 < -1L) ? (paramLong1 <= Long.MIN_VALUE / paramLong2 && paramLong1 >= Long.MAX_VALUE / paramLong2) : (paramLong2 != -1L || paramLong1 != Long.MIN_VALUE)))
      return paramLong1 * paramLong2; 
    StringBuilder stringBuilder = new StringBuilder(32);
    stringBuilder.append("Long overflow: (");
    stringBuilder.append(paramLong1);
    stringBuilder.append(',');
    stringBuilder.append(paramLong2);
    stringBuilder.append(')');
    throw new ArithmeticException(stringBuilder.toString());
  }
  
  public static int c(int paramInt1, int paramInt2) {
    if (paramInt2 == 0)
      return paramInt1; 
    long l = paramInt1 + paramInt2;
    if (l >= -2147483648L && l <= 2147483647L)
      return (int)l; 
    StringBuilder stringBuilder = new StringBuilder(32);
    stringBuilder.append("Integer overflow: (");
    stringBuilder.append(paramInt1);
    stringBuilder.append(',');
    stringBuilder.append(paramInt2);
    stringBuilder.append(')');
    throw new ArithmeticException(stringBuilder.toString());
  }
  
  public static long c(long paramLong1, long paramLong2) {
    if (paramLong2 == 0L)
      return paramLong1; 
    if ((paramLong2 > 0L) ? (paramLong1 >= Long.MIN_VALUE + paramLong2) : (paramLong1 <= Long.MAX_VALUE + paramLong2))
      return paramLong1 - paramLong2; 
    StringBuilder stringBuilder = new StringBuilder(32);
    stringBuilder.append("Long overflow: (");
    stringBuilder.append(paramLong1);
    stringBuilder.append(',');
    stringBuilder.append(paramLong2);
    stringBuilder.append(')');
    throw new ArithmeticException(stringBuilder.toString());
  }
  
  public static int d(int paramInt1, int paramInt2) {
    if (paramInt2 == 1)
      return paramInt1; 
    long l = paramInt1 * paramInt2;
    if (l >= -2147483648L && l <= 2147483647L)
      return (int)l; 
    StringBuilder stringBuilder = new StringBuilder(32);
    stringBuilder.append("Integer overflow: (");
    stringBuilder.append(paramInt1);
    stringBuilder.append(',');
    stringBuilder.append(paramInt2);
    stringBuilder.append(')');
    throw new ArithmeticException(stringBuilder.toString());
  }
  
  public static int e(int paramInt1, int paramInt2) {
    if (paramInt2 == 0)
      return paramInt1; 
    long l = paramInt1 - paramInt2;
    if (l >= -2147483648L && l <= 2147483647L)
      return (int)l; 
    StringBuilder stringBuilder = new StringBuilder(32);
    stringBuilder.append("Integer overflow: (");
    stringBuilder.append(paramInt1);
    stringBuilder.append(',');
    stringBuilder.append(paramInt2);
    stringBuilder.append(')');
    throw new ArithmeticException(stringBuilder.toString());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/c1/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */