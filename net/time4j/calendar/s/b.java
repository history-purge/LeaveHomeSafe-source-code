package net.time4j.calendar.s;

import net.time4j.a0;
import net.time4j.g1.d;
import net.time4j.g1.f;

public enum b {
  c, d, e, f;
  
  private static final int[] g;
  
  private static final double[] h;
  
  private static final double[] i;
  
  static {
    g = new int[] { 
        485, 203, 199, 182, 156, 136, 77, 74, 70, 58, 
        52, 50, 45, 44, 29, 18, 17, 16, 14, 12, 
        12, 12, 9, 8 };
    h = new double[] { 
        324.96D, 337.23D, 342.08D, 27.85D, 73.14D, 171.52D, 222.54D, 296.72D, 243.58D, 119.81D, 
        297.17D, 21.02D, 247.54D, 325.15D, 60.93D, 155.12D, 288.79D, 198.04D, 199.76D, 95.39D, 
        287.11D, 320.81D, 227.73D, 15.45D };
    i = new double[] { 
        1934.136D, 32964.467D, 20.186D, 445267.112D, 45036.886D, 22518.443D, 65928.934D, 3034.906D, 9037.513D, 33718.147D, 
        150.678D, 2281.226D, 29929.562D, 31555.956D, 4443.417D, 67555.328D, 4562.452D, 62894.029D, 31436.921D, 14577.848D, 
        31931.756D, 34777.259D, 1222.114D, 16859.074D };
  }
  
  private static double a(double paramDouble) {
    return Math.cos(paramDouble * Math.PI / 180.0D);
  }
  
  private static double b(double paramDouble) {
    double d = 0.0D;
    int i;
    for (i = 0; i < 24; i++) {
      double d1 = g[i];
      double d2 = a(h[i] + i[i] * paramDouble);
      Double.isNaN(d1);
      d += d1 * d2;
    } 
    return d;
  }
  
  private static void g(int paramInt) {
    if (paramInt >= -2000 && paramInt <= 3000)
      return; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Year out of supported range: -2000 <= ");
    stringBuilder.append(paramInt);
    stringBuilder.append(" <= +3000");
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  private double h(int paramInt) {
    double d1 = i(paramInt);
    double d2 = (d1 - 2451545.0D) / 36525.0D;
    double d4 = 35999.373D * d2 - 2.47D;
    double d3 = a(d4);
    d4 = a(d4 * 2.0D);
    return d1 + b(d2) * 1.0E-5D / (d3 * 0.0334D + 1.0D + d4 * 7.0E-4D);
  }
  
  private double i(int paramInt) {
    if (paramInt < 1000) {
      double d8 = paramInt;
      Double.isNaN(d8);
      double d13 = d8 / 1000.0D;
      paramInt = a.a[ordinal()];
      if (paramInt != 1) {
        if (paramInt != 2) {
          if (paramInt != 3) {
            if (paramInt == 4) {
              d8 = 1721414.39987D;
              double d22 = 365242.88257D;
              double d23 = -0.00769D;
              double d24 = -0.00933D;
              double d25 = 6.0E-5D;
              return (((d24 - d25 * d13) * d13 + d23) * d13 + d22) * d13 + d8;
            } 
            throw new AssertionError(this);
          } 
          d8 = 1721325.70455D;
          double d18 = 365242.49558D;
          double d19 = -0.11677D;
          double d20 = -0.00297D;
          double d21 = 7.4E-4D;
          return (((d21 * d13 + d20) * d13 + d19) * d13 + d18) * d13 + d8;
        } 
        d8 = 1721233.25401D;
        double d14 = 365241.72562D;
        double d15 = -0.05323D;
        double d16 = 0.00907D;
        double d17 = 2.5E-4D;
        return (((d17 * d13 + d16) * d13 + d15) * d13 + d14) * d13 + d8;
      } 
      d8 = 1721139.29189D;
      double d9 = 365242.1374D;
      double d10 = 0.06134D;
      double d11 = 0.00111D;
      double d12 = 7.1E-4D;
      return (((d11 - d12 * d13) * d13 + d10) * d13 + d9) * d13 + d8;
    } 
    double d1 = (paramInt - 2000);
    Double.isNaN(d1);
    double d4 = d1 / 1000.0D;
    paramInt = a.a[ordinal()];
    if (paramInt != 1) {
      if (paramInt != 2) {
        if (paramInt != 3) {
          if (paramInt == 4) {
            d1 = 2451900.05952D;
            double d18 = 365242.74049D;
            double d19 = -0.06223D;
            double d22 = -0.00823D;
            double d20 = 3.2E-4D;
            double d21 = d4;
            d4 = d22;
            return (((d20 * d21 + d4) * d21 + d19) * d21 + d18) * d21 + d1;
          } 
          throw new AssertionError(this);
        } 
        d1 = 2451810.21715D;
        double d13 = 365242.01767D;
        double d14 = -0.11575D;
        double d17 = 0.00337D;
        double d15 = 7.8E-4D;
        double d16 = d4;
        d4 = d17;
        return (((d15 * d16 + d4) * d16 + d14) * d16 + d13) * d16 + d1;
      } 
      d1 = 2451716.56767D;
      double d8 = 365241.62603D;
      double d9 = 0.00325D;
      double d12 = 0.00888D;
      double d10 = 3.0E-4D;
      double d11 = d4;
      d4 = d12;
      return (((d4 - d10 * d11) * d11 + d9) * d11 + d8) * d11 + d1;
    } 
    d1 = 2451623.80984D;
    double d2 = 365242.37404D;
    double d3 = 0.05169D;
    double d7 = -0.00411D;
    double d5 = 5.7E-4D;
    double d6 = d4;
    d4 = d7;
    return (((d4 - d5 * d6) * d6 + d3) * d6 + d2) * d6 + d1;
  }
  
  public a0 f(int paramInt) {
    f f;
    g(paramInt);
    double d1 = (h(paramInt) - 2441317.5D) * 86400.0D;
    boolean bool = d.k().h();
    if (!bool || paramInt < 1972) {
      d1 -= f.a(paramInt, (ordinal() + 1) * 3);
      f = f.h;
    } else {
      d1 -= 42.184D;
      f = f.d;
    } 
    long l2 = (long)Math.floor(d1);
    double d2 = l2;
    Double.isNaN(d2);
    paramInt = (int)((d1 - d2) * 1.0E9D);
    long l1 = l2;
    if (!bool) {
      l1 = l2 + 63072000L;
      f = f.c;
    } 
    return a0.a(l1, paramInt, f);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/calendar/s/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */