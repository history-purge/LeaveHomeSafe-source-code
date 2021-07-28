package net.time4j.g1;

import net.time4j.c1.a;
import net.time4j.c1.b;

public enum f {
  c, d, e, f, g, h;
  
  private static double a(int paramInt, double paramDouble) {
    if (paramInt >= -2000 && paramInt <= 3000) {
      double d1;
      double d2;
      double d4;
      double d5;
      if (paramInt > 2050) {
        paramDouble = (paramDouble - 1820.0D) / 100.0D;
        return 32.0D * paramDouble * paramDouble - 20.0D;
      } 
      if (paramInt >= 2018) {
        paramDouble -= 2000.0D;
        d1 = 64.16D;
        d2 = 0.0533D;
        d3 = 0.012125D * paramDouble;
        return (d3 + d2) * paramDouble + d1;
      } 
      if (paramInt >= 2005) {
        paramDouble -= 2000.0D;
        d1 = 63.5934D;
        d2 = 0.171417D;
        d3 = 0.014201D;
        d4 = -0.00112745D;
        d5 = 4.2060317E-5D * paramDouble;
      } else {
        if (paramInt >= 1986) {
          paramDouble -= 2000.0D;
          d1 = 63.86D;
          d2 = 0.3345D;
          d3 = -0.060374D;
          d4 = 0.0017275D;
          d5 = 6.51814E-4D;
          double d = 2.373599E-5D * paramDouble;
          return ((((d + d5) * paramDouble + d4) * paramDouble + d3) * paramDouble + d2) * paramDouble + d1;
        } 
        if (paramInt >= 1961) {
          paramDouble -= 1975.0D;
          d1 = 45.45D;
          d2 = 1.067D;
          d3 = 0.0D - paramDouble / 718.0D;
          return (d3 * paramDouble + d2) * paramDouble + d1;
        } 
        if (paramInt >= 1941) {
          paramDouble -= 1950.0D;
          d1 = 29.07D;
          d2 = 0.407D;
          d3 = (paramDouble / 2547.0D + 0.0D) * paramDouble;
          return (d3 + d2) * paramDouble + d1;
        } 
        if (paramInt >= 1920) {
          paramDouble -= 1920.0D;
          d1 = 21.2D;
          d2 = 0.84493D;
          d3 = -0.0761D;
          d4 = 0.0020936D * paramDouble;
          return ((d4 + d3) * paramDouble + d2) * paramDouble + d1;
        } 
        if (paramInt >= 1900) {
          paramDouble -= 1900.0D;
          d1 = -2.79D;
          d2 = 1.494119D;
          d3 = -0.0598939D;
          d4 = (0.0061966D - 1.97E-4D * paramDouble) * paramDouble;
          return ((d4 + d3) * paramDouble + d2) * paramDouble + d1;
        } 
        if (paramInt >= 1860) {
          paramDouble -= 1860.0D;
          d1 = 7.62D;
          d2 = 0.5737D;
          d3 = -0.251754D;
          d4 = 0.01680668D;
          d5 = -4.473624E-4D;
          double d = paramDouble / 233174.0D;
          return ((((d + d5) * paramDouble + d4) * paramDouble + d3) * paramDouble + d2) * paramDouble + d1;
        } 
        if (paramInt >= 1800) {
          paramDouble -= 1800.0D;
          return ((((((8.75E-10D * paramDouble - 1.699E-7D) * paramDouble + 1.21272E-5D) * paramDouble - 3.7436E-4D) * paramDouble + 0.0041116D) * paramDouble + 0.0068612D) * paramDouble - 0.332447D) * paramDouble + 13.72D;
        } 
        if (paramInt >= 1700) {
          paramDouble -= 1700.0D;
          d1 = 8.83D;
          d2 = 0.1603D;
          d3 = -0.0059285D;
          d4 = 1.3336E-4D;
          d5 = paramDouble / 1174000.0D;
        } else {
          if (paramInt >= 1600) {
            paramDouble -= 1600.0D;
            d1 = 120.0D;
            d2 = -0.9808D;
            d3 = -0.01532D;
            d4 = paramDouble / 7129.0D;
            return ((d4 + d3) * paramDouble + d2) * paramDouble + d1;
          } 
          if (paramInt >= 500) {
            paramDouble = (paramDouble - 1000.0D) / 100.0D;
            d1 = 1574.2D;
            d2 = -556.01D;
            d3 = 71.23472D;
            d4 = 0.319781D;
            d5 = -0.8503463D;
            double d6 = -0.005050998D;
            double d7 = 0.0083572073D;
            return (((((d7 * paramDouble + d6) * paramDouble + d5) * paramDouble + d4) * paramDouble + d3) * paramDouble + d2) * paramDouble + d1;
          } 
          if (paramInt >= -500) {
            paramDouble /= 100.0D;
            d1 = 10583.6D;
            d2 = -1014.41D;
            d3 = 33.78311D;
            d4 = -5.952053D;
            d5 = -0.1798452D;
            double d6 = 0.022174192D;
            double d7 = 0.0090316521D;
            return (((((d7 * paramDouble + d6) * paramDouble + d5) * paramDouble + d4) * paramDouble + d3) * paramDouble + d2) * paramDouble + d1;
          } 
          paramDouble = (paramDouble - 1820.0D) / 100.0D;
          return 32.0D * paramDouble * paramDouble - 20.0D;
        } 
      } 
      double d3 = (d5 + d4) * paramDouble + d3;
      return (d3 * paramDouble + d2) * paramDouble + d1;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Year out of range: ");
    stringBuilder.append(paramInt);
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
    throw illegalArgumentException;
  }
  
  public static double a(int paramInt1, int paramInt2) {
    if (paramInt2 >= 1 && paramInt2 <= 12) {
      double d1 = paramInt1;
      double d2 = paramInt2;
      Double.isNaN(d2);
      d2 = (d2 - 0.5D) / 12.0D;
      Double.isNaN(d1);
      return a(paramInt1, d1 + d2);
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Month out of range: ");
    stringBuilder.append(paramInt2);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public static double a(a parama) {
    char c;
    int k = parama.getYear();
    if (b.b(k)) {
      c = 'Ů';
    } else {
      c = 'ŭ';
    } 
    int m = parama.getMonth();
    int i = 1;
    int j = 0;
    while (i < m) {
      j += b.a(k, i);
      i++;
    } 
    m = parama.r() + j;
    if (m <= c) {
      j = k;
      i = m;
      if (k == -2001) {
        j = k;
        i = m;
        if (m == 365) {
          j = -2000;
          i = 1;
        } 
      } 
      double d1 = j;
      double d2 = i;
      Double.isNaN(d2);
      double d3 = c;
      Double.isNaN(d3);
      d2 = (d2 - 1.0D) / d3;
      Double.isNaN(d1);
      return a(j, d1 + d2);
    } 
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(parama.toString());
    throw illegalArgumentException;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/g1/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */