package net.time4j.history;

import net.time4j.c1.c;
import net.time4j.d1.i;

public enum j implements i {
  c, d, e, f, g;
  
  int a(j paramj, int paramInt) {
    int k = paramj.f(paramInt);
    try {
      int m = a.a[ordinal()];
      if (m != 1) {
        if (m != 2) {
          if (m != 3) {
            if (m != 4) {
              if (m == 5)
                return c.c(k, 753); 
              throw new UnsupportedOperationException(name());
            } 
            return c.c(k, 5508);
          } 
          return c.c(k, 38);
        } 
      } else {
        return c.e(1, k);
      } 
    } catch (ArithmeticException arithmeticException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Out of range: ");
      stringBuilder.append(paramInt);
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
    return k;
  }
  
  public int f(int paramInt) {
    try {
      int k = a.a[ordinal()];
      if (k != 1) {
        if (k != 2) {
          if (k != 3) {
            if (k != 4) {
              if (k == 5)
                return c.e(paramInt, 753); 
              throw new UnsupportedOperationException(name());
            } 
            return c.e(paramInt, 5508);
          } 
          return c.e(paramInt, 38);
        } 
      } else {
        return c.e(1, paramInt);
      } 
    } catch (ArithmeticException arithmeticException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Out of range: ");
      stringBuilder.append(paramInt);
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
    return paramInt;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/history/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */