package net.time4j.calendar.s;

import java.util.concurrent.TimeUnit;
import net.time4j.a0;
import net.time4j.c1.c;
import net.time4j.d1.l0;
import net.time4j.g1.g;
import net.time4j.h0;

public enum d {
  d(0),
  e(90),
  f(180),
  g(270);
  
  private static final a0 h;
  
  private static final int[] i;
  
  private static final int[] j;
  
  private static final int[] k;
  
  private static final int[] l;
  
  private static final int[] m;
  
  private static final int[] n;
  
  private static final int[] o;
  
  private static final int[] p;
  
  private static final double[] q;
  
  private static final double[] r;
  
  private static final double[] s;
  
  private final transient int c;
  
  static {
    h = h0.a(2000, 1, 6, 18, 13, 42).v();
    i = new int[] { 
        0, 1, 0, 0, 1, 1, 2, 0, 0, 1, 
        0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 
        0, 0, 0, 0 };
    j = new int[] { 
        0, 1, 1, 0, 0, 1, 2, 0, 0, 0, 
        1, 1, 1, 2, 1, 0, 0, 0, 0, 0, 
        0, 0, 0, 0 };
    k = new int[] { 
        0, 1, 0, 0, -1, 1, 2, 0, 0, 1, 
        0, 1, 1, -1, 2, 0, 3, 1, 0, 1, 
        -1, -1, 1, 0 };
    l = new int[] { 
        0, 1, 1, 0, 0, -1, 2, 0, 0, 0, 
        -1, 1, 1, 2, 1, -1, 0, 1, -2, 1, 
        3, 0, -1, 1 };
    m = new int[] { 
        1, 0, 2, 0, 1, 1, 0, 1, 1, 2, 
        3, 0, 0, 2, 1, 2, 0, 1, 2, 1, 
        1, 1, 3, 4 };
    n = new int[] { 
        1, 0, 1, 2, 0, 1, 0, 1, 1, 3, 
        2, 0, 0, 1, 2, 1, 2, 1, 1, 1, 
        0, 2, 1, 3 };
    o = new int[] { 
        0, 0, 0, 2, 0, 0, 0, -2, 2, 0, 
        0, 2, -2, 0, 0, -2, 0, -2, 2, 2, 
        2, -2, 0, 0 };
    p = new int[] { 
        0, 0, 0, 0, 2, 0, 0, -2, 2, 0, 
        0, 2, -2, 0, 0, -2, 2, 2, 0, -2, 
        0, -2, 2, 0 };
    q = new double[] { 
        -0.4072D, 0.17241D, 0.01608D, 0.01039D, 0.00739D, -0.00514D, 0.00208D, -0.00111D, -5.7E-4D, 5.6E-4D, 
        -4.2E-4D, 4.2E-4D, 3.8E-4D, -2.4E-4D, -7.0E-5D, 4.0E-5D, 4.0E-5D, 3.0E-5D, 3.0E-5D, -3.0E-5D, 
        3.0E-5D, -2.0E-5D, -2.0E-5D, 2.0E-5D };
    r = new double[] { 
        -0.40614D, 0.17302D, 0.01614D, 0.01043D, 0.00734D, -0.00515D, 0.00209D, -0.00111D, -5.7E-4D, 5.6E-4D, 
        -4.2E-4D, 4.2E-4D, 3.8E-4D, -2.4E-4D, -7.0E-5D, 4.0E-5D, 4.0E-5D, 3.0E-5D, 3.0E-5D, -3.0E-5D, 
        3.0E-5D, -2.0E-5D, -2.0E-5D, 2.0E-5D };
    s = new double[] { 
        -0.62801D, 0.17172D, -0.01183D, 0.00862D, 0.00804D, 0.00454D, 0.00204D, -0.0018D, -7.0E-4D, -4.0E-4D, 
        -3.4E-4D, 3.2E-4D, 3.2E-4D, -2.8E-4D, 2.7E-4D, -5.0E-5D, 4.0E-5D, -4.0E-5D, 4.0E-5D, 3.0E-5D, 
        3.0E-5D, 2.0E-5D, 2.0E-5D, -2.0E-5D };
  }
  
  d(int paramInt1) {
    this.c = paramInt1;
  }
  
  private static double a(double paramDouble) {
    return Math.cos(paramDouble * Math.PI / 180.0D);
  }
  
  private static double a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4) {
    return 0.00306D - paramDouble1 * 3.8E-4D * a(paramDouble2) + a(paramDouble3) * 2.6E-4D - a(paramDouble3 - paramDouble2) * 2.0E-5D + a(paramDouble3 + paramDouble2) * 2.0E-5D + a(paramDouble4 * 2.0D) * 2.0E-5D;
  }
  
  private static double b(double paramDouble) {
    return Math.sin(paramDouble * Math.PI / 180.0D);
  }
  
  private double b(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4) {
    double[] arrayOfDouble;
    int[] arrayOfInt1;
    int[] arrayOfInt2;
    int[] arrayOfInt3;
    int[] arrayOfInt4;
    if (this == d) {
      arrayOfDouble = q;
    } else if (this == f) {
      arrayOfDouble = r;
    } else {
      arrayOfDouble = s;
    } 
    if (this == d || this == f) {
      arrayOfInt1 = i;
    } else {
      arrayOfInt1 = j;
    } 
    if (this == d || this == f) {
      arrayOfInt2 = k;
    } else {
      arrayOfInt2 = l;
    } 
    if (this == d || this == f) {
      arrayOfInt3 = m;
    } else {
      arrayOfInt3 = n;
    } 
    if (this == d || this == f) {
      arrayOfInt4 = o;
    } else {
      arrayOfInt4 = p;
    } 
    double d1 = 0.0D;
    int i;
    for (i = 23; i >= 0; i--) {
      double d3 = arrayOfDouble[i];
      if (arrayOfInt1[i] != 1) {
        double d4 = d3;
        if (arrayOfInt1[i] == 2) {
          d3 *= paramDouble1;
        } else {
          continue;
        } 
      } 
      double d2 = d3 * paramDouble1;
      continue;
      d2 = arrayOfInt2[i];
      Double.isNaN(d2);
      d3 = arrayOfInt3[i];
      Double.isNaN(d3);
      d4 = arrayOfInt4[i];
      Double.isNaN(d4);
      d1 += SYNTHETIC_LOCAL_VARIABLE_11 * b(d2 * paramDouble2 + d3 * paramDouble3 + d4 * paramDouble4);
    } 
    return d1;
  }
  
  private int c(a0 parama0) {
    double d1 = h.a((l0)parama0, TimeUnit.DAYS);
    Double.isNaN(d1);
    d1 /= 29.530588861D;
    double d2 = this.c;
    Double.isNaN(d2);
    return c.a(Math.round(d1 - d2 / 360.0D));
  }
  
  public a0 a(a0 parama0) {
    int j = c(parama0);
    a0 a01 = f(j);
    int i = j;
    while (a01.a((g)parama0))
      a01 = f(++i); 
    a0 a02 = a01;
    if (i <= j)
      while (true) {
        a0 a03 = f(--i);
        a02 = a01;
        if (!a03.a((g)parama0)) {
          a01 = a03;
          continue;
        } 
        break;
      }  
    return a02;
  }
  
  public a0 b(a0 parama0) {
    int j = c(parama0);
    a0 a01 = f(j);
    int i = j;
    while (!a01.a((g)parama0))
      a01 = f(--i); 
    a0 a02 = a01;
    if (i >= j)
      while (true) {
        a02 = a01;
        if (((a0)a01.b(29L, TimeUnit.DAYS)).a((g)parama0)) {
          a0 a03 = f(++i);
          a02 = a01;
          if (a03.a((g)parama0)) {
            a01 = a03;
            continue;
          } 
        } 
        break;
      }  
    return a02;
  }
  
  public a0 f(int paramInt) {
    double d1 = paramInt;
    double d2 = this.c;
    Double.isNaN(d2);
    d2 /= 360.0D;
    Double.isNaN(d1);
    double d3 = d1 + d2;
    d1 = d3 / 1236.85D;
    double d4 = d1 * d1;
    d2 = Math.sin(Math.toRadians(124.7746D - 1.56375588D * d3 + (2.15E-6D * d1 + 0.0020672D) * d4));
    double d5 = 1.0D - (7.4E-6D * d1 + 0.002516D) * d1;
    double d6 = 29.1053567D * d3 + 2.5534D - (1.1E-7D * d1 + 1.4E-6D) * d4;
    double d7 = 385.81693528D * d3 + 201.5643D + ((1.238E-5D - 5.8E-8D * d1) * d1 + 0.0107582D) * d4;
    double d8 = 390.67050284D * d3 + 160.7108D + ((1.1E-8D * d1 - 2.27E-6D) * d1 - 0.0016118D) * d4;
    d2 = 29.530588861D * d3 + 2451550.09766D + ((7.3E-10D * d1 - 1.5E-7D) * d1 + 1.5437E-4D) * d4 - d2 * 1.7E-4D + b(d5, d6, d7, d8);
    if (this == e) {
      d1 = d2 + a(d5, d6, d7, d8);
    } else {
      d1 = d2;
      if (this == g)
        d1 = d2 - a(d5, d6, d7, d8); 
    } 
    double[] arrayOfDouble = new double[28];
    paramInt = 0;
    arrayOfDouble[0] = 0.107408D * d3 + 299.77D - d4 * 0.009173D;
    arrayOfDouble[1] = 3.25E-4D;
    arrayOfDouble[2] = 0.016321D * d3 + 251.88D;
    arrayOfDouble[3] = 1.65E-4D;
    arrayOfDouble[4] = 26.651886D * d3 + 251.83D;
    arrayOfDouble[5] = 1.64E-4D;
    arrayOfDouble[6] = 36.412478D * d3 + 349.42D;
    arrayOfDouble[7] = 1.26E-4D;
    arrayOfDouble[8] = 18.206239D * d3 + 84.66D;
    arrayOfDouble[9] = 1.1E-4D;
    arrayOfDouble[10] = 53.303771D * d3 + 141.74D;
    arrayOfDouble[11] = 6.2E-5D;
    arrayOfDouble[12] = 2.453732D * d3 + 207.14D;
    arrayOfDouble[13] = 6.0E-5D;
    arrayOfDouble[14] = 7.30686D * d3 + 154.84D;
    arrayOfDouble[15] = 5.6E-5D;
    arrayOfDouble[16] = 27.261239D * d3 + 34.52D;
    arrayOfDouble[17] = 4.7E-5D;
    arrayOfDouble[18] = 0.121824D * d3 + 207.19D;
    arrayOfDouble[19] = 4.2E-5D;
    arrayOfDouble[20] = 1.844379D * d3 + 291.34D;
    arrayOfDouble[21] = 4.0E-5D;
    arrayOfDouble[22] = 24.198154D * d3 + 161.72D;
    arrayOfDouble[23] = 3.7E-5D;
    arrayOfDouble[24] = 25.513099D * d3 + 239.56D;
    arrayOfDouble[25] = 3.5E-5D;
    arrayOfDouble[26] = d3 * 3.592518D + 331.55D;
    arrayOfDouble[27] = 2.3E-5D;
    while (paramInt < 28) {
      d1 += arrayOfDouble[paramInt + 1] * Math.sin(Math.toRadians(arrayOfDouble[paramInt]));
      paramInt += 2;
    } 
    return (a0)c.a(d1).c().b(a0.l, TimeUnit.SECONDS);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/calendar/s/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */