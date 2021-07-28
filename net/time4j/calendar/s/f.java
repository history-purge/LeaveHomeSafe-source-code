package net.time4j.calendar.s;

import net.time4j.d1.p;
import net.time4j.g0;
import net.time4j.h0;
import net.time4j.tz.k;
import net.time4j.tz.p;

public enum f implements e {
  c {
    private double c(double param1Double) {
      h0 h0 = c.a(param1Double).c().b((k)p.m);
      param1Double = h0.w().x();
      double d = ((Integer)h0.x().e((p)g0.B)).intValue();
      Double.isNaN(d);
      d /= 86400.0D;
      Double.isNaN(param1Double);
      return param1Double + d;
    }
    
    private double f(double param1Double) {
      param1Double = param1Double * 0.9856D - 3.289D;
      return a.b(Math.sin(Math.toRadians(param1Double)) * 1.916D + param1Double + Math.sin(Math.toRadians(param1Double) * 2.0D) * 0.02D + 282.634D);
    }
    
    public double a(double param1Double) {
      return Math.toDegrees(Math.asin(Math.sin(Math.toRadians(f(c(param1Double)))) * 0.39782D));
    }
    
    public double b(double param1Double) {
      param1Double = f(c(param1Double));
      double d = a.b(Math.toDegrees(Math.atan(Math.tan(Math.toRadians(param1Double)) * 0.91764D)));
      return d + Math.floor(param1Double / 90.0D) * 90.0D - Math.floor(d / 90.0D) * 90.0D;
    }
  },
  d {
    private double c(double param1Double) {
      return Math.asin(Math.sin(Math.toRadians(i(param1Double))) * Math.sin(Math.toRadians(j(param1Double))));
    }
    
    private double f(double param1Double) {
      double d = Math.toRadians(g(param1Double));
      return Math.sin(d) * (1.914602D - (1.4E-5D * param1Double + 0.004817D) * param1Double) + Math.sin(2.0D * d) * (0.019993D - param1Double * 1.01E-4D) + Math.sin(d * 3.0D) * 2.89E-4D;
    }
    
    private double g(double param1Double) {
      return (35999.05029D - 1.537E-4D * param1Double) * param1Double + 357.52911D;
    }
    
    private double h(double param1Double) {
      return ((3.032E-4D * param1Double + 36000.76983D) * param1Double + 280.46646D) % 360.0D;
    }
    
    private double i(double param1Double) {
      return (((0.001813D * param1Double - 5.9E-4D) * param1Double - 46.815D) * param1Double + 21.448D) / 3600.0D + 23.433333333333334D + Math.cos(Math.toRadians(125.04D - param1Double * 1934.136D)) * 0.00256D;
    }
    
    private double j(double param1Double) {
      return h(param1Double) + f(param1Double) - 0.00569D - Math.sin(Math.toRadians(125.04D - param1Double * 1934.136D)) * 0.00478D;
    }
    
    public double a(double param1Double) {
      return Math.toDegrees(c(d(param1Double)));
    }
    
    public double b(double param1Double) {
      param1Double = d(param1Double);
      double d = Math.toRadians(j(param1Double));
      return a.b(Math.toDegrees(Math.atan2(Math.cos(Math.toRadians(i(param1Double))) * Math.sin(d), Math.cos(d))));
    }
  },
  e {
    private double c(double param1Double) {
      return Math.asin(Math.sin(Math.toRadians(h(param1Double))) * Math.sin(Math.toRadians(a(param1Double, g(param1Double)))));
    }
    
    private double f(double param1Double) {
      return ((4.8E-7D * param1Double - 1.559E-4D) * param1Double + 35999.0503D) * param1Double + 357.5291D;
    }
    
    private double g(double param1Double) {
      double d = Math.toRadians((0.002063D * param1Double - 1934.134D) * param1Double + 124.9D);
      param1Double = Math.toRadians((5.7E-4D * param1Double + 72001.5377D) * param1Double + 201.11D);
      return Math.sin(d) * -0.004778D - Math.sin(param1Double) * 3.667E-4D;
    }
    
    private double h(double param1Double) {
      return (((0.001813D * param1Double - 5.9E-4D) * param1Double - 46.815D) * param1Double + 21.448D) / 3600.0D + 23.433333333333334D;
    }
    
    public double a(double param1Double) {
      return a(param1Double, "declination");
    }
    
    public double a(double param1Double, String param1String) {
      param1Double = d(param1Double);
      if (param1String.equals("declination"))
        return Math.toDegrees(c(param1Double)); 
      if (param1String.equals("right-ascension")) {
        double d = Math.toRadians(a(param1Double, g(param1Double)));
        return a.b(Math.toDegrees(Math.atan2(Math.cos(Math.toRadians(h(param1Double))) * Math.sin(d), Math.cos(d))));
      } 
      return param1String.equals("nutation") ? g(param1Double) : (param1String.equals("obliquity") ? h(param1Double) : (param1String.equals("mean-anomaly") ? f(param1Double) : (param1String.equals("solar-longitude") ? a(param1Double, g(param1Double)) : (param1String.equals("solar-latitude") ? 0.0D : Double.NaN))));
    }
    
    public double b(double param1Double) {
      return a(param1Double, "right-ascension");
    }
  },
  f {
    private double c(double param1Double) {
      double[] arrayOfDouble = new double[2];
      a(param1Double, arrayOfDouble);
      return Math.asin(Math.sin(Math.toRadians(e(param1Double) + arrayOfDouble[1])) * Math.sin(Math.toRadians(a(param1Double, arrayOfDouble[0]))));
    }
    
    private double f(double param1Double) {
      return (35999.05029D - 1.537E-4D * param1Double) * param1Double + 357.52911D;
    }
    
    public double a(double param1Double) {
      return a(param1Double, "declination");
    }
    
    public double a(double param1Double, String param1String) {
      double[] arrayOfDouble;
      param1Double = d(param1Double);
      if (param1String.equals("declination"))
        return Math.toDegrees(c(param1Double)); 
      if (param1String.equals("right-ascension")) {
        arrayOfDouble = new double[2];
        a(param1Double, arrayOfDouble);
        double d1 = Math.toRadians(a(param1Double, arrayOfDouble[0]));
        return a.b(Math.toDegrees(Math.atan2(Math.cos(Math.toRadians(e(param1Double) + arrayOfDouble[1])) * Math.sin(d1), Math.cos(d1))));
      } 
      if (arrayOfDouble.equals("nutation")) {
        arrayOfDouble = new double[2];
        a(param1Double, arrayOfDouble);
        return arrayOfDouble[0];
      } 
      if (arrayOfDouble.equals("obliquity")) {
        arrayOfDouble = new double[2];
        a(param1Double, arrayOfDouble);
        return e(param1Double) + arrayOfDouble[1];
      } 
      if (arrayOfDouble.equals("mean-anomaly"))
        return f(param1Double); 
      if (arrayOfDouble.equals("solar-longitude")) {
        arrayOfDouble = new double[2];
        a(param1Double, arrayOfDouble);
        return a(param1Double, arrayOfDouble[0]);
      } 
      return arrayOfDouble.equals("solar-latitude") ? 0.0D : Double.NaN;
    }
    
    public double b(double param1Double) {
      return a(param1Double, "right-ascension");
    }
  };
  
  private static final int[] g;
  
  private static final double[] h;
  
  private static final double[] i;
  
  private static final double[][] j;
  
  static {
    g = new int[] { 
        403406, 195207, 119433, 112392, 3891, 2819, 1721, 660, 350, 334, 
        314, 268, 242, 234, 158, 132, 129, 114, 99, 93, 
        86, 78, 72, 68, 64, 46, 38, 37, 32, 29, 
        28, 27, 27, 25, 24, 21, 21, 20, 18, 17, 
        14, 13, 13, 13, 12, 10, 10, 10, 10 };
    h = new double[] { 
        270.54861D, 340.19128D, 63.91854D, 331.2622D, 317.843D, 86.631D, 240.052D, 310.26D, 247.23D, 260.87D, 
        297.82D, 343.14D, 166.79D, 81.53D, 3.5D, 132.75D, 182.95D, 162.03D, 29.8D, 266.4D, 
        249.2D, 157.6D, 257.8D, 185.1D, 69.9D, 8.0D, 197.1D, 250.4D, 65.3D, 162.7D, 
        341.5D, 291.6D, 98.5D, 146.7D, 110.0D, 5.2D, 342.6D, 230.9D, 256.1D, 45.3D, 
        242.9D, 115.2D, 151.8D, 285.3D, 53.3D, 126.6D, 205.7D, 85.9D, 146.1D };
    i = new double[] { 
        0.9287892D, 35999.1376958D, 35999.4089666D, 35998.7287385D, 71998.20261D, 71998.4403D, 36000.35726D, 71997.4812D, 32964.4678D, -19.441D, 
        445267.1117D, 45036.884D, 3.1008D, 22518.4434D, -19.9739D, 65928.9345D, 9038.0293D, 3034.7684D, 33718.148D, 3034.448D, 
        -2280.773D, 29929.992D, 31556.493D, 149.588D, 9037.75D, 107997.405D, -4444.176D, 151.771D, 67555.316D, 31556.08D, 
        -4561.54D, 107996.706D, 1221.655D, 62894.167D, 31437.369D, 14578.298D, -31931.757D, 34777.243D, 1221.999D, 62894.511D, 
        -4442.039D, 107997.909D, 119.066D, 16859.071D, -4.578D, 26895.292D, -39.127D, 12297.536D, 90073.778D };
    double[] arrayOfDouble1 = { 0.0D, 0.0D, 0.0D, 0.0D, 1.0D, -171996.0D, -174.2D, 92025.0D, 8.9D };
    double[] arrayOfDouble2 = { -2.0D, 0.0D, 0.0D, 2.0D, 2.0D, -13187.0D, -1.6D, 5736.0D, -3.1D };
    double[] arrayOfDouble3 = { 0.0D, 0.0D, 0.0D, 2.0D, 2.0D, -2274.0D, -0.2D, 977.0D, -0.5D };
    double[] arrayOfDouble4 = { 0.0D, 0.0D, 0.0D, 0.0D, 2.0D, 2062.0D, 0.2D, -895.0D, 0.5D };
    double[] arrayOfDouble5 = { -2.0D, 1.0D, 0.0D, 2.0D, 2.0D, -517.0D, 1.2D, 224.0D, -0.6D };
    double[] arrayOfDouble6 = { 0.0D, 0.0D, 0.0D, 2.0D, 1.0D, -386.0D, -0.4D, 200.0D, 0.0D };
    double[] arrayOfDouble7 = { 0.0D, 0.0D, 1.0D, 2.0D, 2.0D, -301.0D, 0.0D, 129.0D, -0.1D };
    double[] arrayOfDouble8 = { -2.0D, 0.0D, 1.0D, 0.0D, 0.0D, -158.0D, 0.0D, 0.0D, 0.0D };
    double[] arrayOfDouble9 = { -2.0D, 0.0D, 0.0D, 2.0D, 1.0D, 129.0D, 0.1D, -70.0D, 0.0D };
    double[] arrayOfDouble10 = { 0.0D, 0.0D, -1.0D, 2.0D, 2.0D, 123.0D, 0.0D, -53.0D, 0.0D };
    double[] arrayOfDouble11 = { 2.0D, 0.0D, 0.0D, 0.0D, 0.0D, 63.0D, 0.0D, 0.0D, 0.0D };
    double[] arrayOfDouble12 = { 0.0D, 0.0D, 1.0D, 0.0D, 1.0D, 63.0D, 0.1D, -33.0D, 0.0D };
    double[] arrayOfDouble13 = { 2.0D, 0.0D, -1.0D, 2.0D, 2.0D, -59.0D, 0.0D, 26.0D, 0.0D };
    double[] arrayOfDouble14 = { 0.0D, 0.0D, -1.0D, 0.0D, 1.0D, -58.0D, -0.1D, 32.0D, 0.0D };
    double[] arrayOfDouble15 = { 0.0D, 0.0D, 1.0D, 2.0D, 1.0D, -51.0D, 0.0D, 27.0D, 0.0D };
    double[] arrayOfDouble16 = { -2.0D, 0.0D, 2.0D, 0.0D, 0.0D, 48.0D, 0.0D, 0.0D, 0.0D };
    double[] arrayOfDouble17 = { 0.0D, 0.0D, 2.0D, 2.0D, 2.0D, -31.0D, 0.0D, 13.0D, 0.0D };
    double[] arrayOfDouble18 = { 0.0D, 0.0D, 2.0D, 0.0D, 0.0D, 29.0D, 0.0D, 0.0D, 0.0D };
    double[] arrayOfDouble19 = { -2.0D, 0.0D, 1.0D, 2.0D, 2.0D, 29.0D, 0.0D, -12.0D, 0.0D };
    double[] arrayOfDouble20 = { -2.0D, 0.0D, 0.0D, 2.0D, 0.0D, -22.0D, 0.0D, 0.0D, 0.0D };
    double[] arrayOfDouble21 = { 0.0D, 0.0D, -1.0D, 2.0D, 1.0D, 21.0D, 0.0D, -10.0D, 0.0D };
    double[] arrayOfDouble22 = { 0.0D, 2.0D, 0.0D, 0.0D, 0.0D, 17.0D, -0.1D, 0.0D, 0.0D };
    double[] arrayOfDouble23 = { 2.0D, 0.0D, -1.0D, 0.0D, 1.0D, 16.0D, 0.0D, -8.0D, 0.0D };
    double[] arrayOfDouble24 = { -2.0D, 2.0D, 0.0D, 2.0D, 2.0D, -16.0D, 0.1D, 7.0D, 0.0D };
    double[] arrayOfDouble25 = { 0.0D, 1.0D, 0.0D, 0.0D, 1.0D, -15.0D, 0.0D, 9.0D, 0.0D };
    double[] arrayOfDouble26 = { 0.0D, -1.0D, 0.0D, 0.0D, 1.0D, -12.0D, 0.0D, 6.0D, 0.0D };
    double[] arrayOfDouble27 = { 0.0D, 0.0D, 2.0D, -2.0D, 0.0D, 11.0D, 0.0D, 0.0D, 0.0D };
    double[] arrayOfDouble28 = { 2.0D, 0.0D, -1.0D, 2.0D, 1.0D, -10.0D, 0.0D, 5.0D, 0.0D };
    double[] arrayOfDouble29 = { 2.0D, 0.0D, 1.0D, 2.0D, 2.0D, -8.0D, 0.0D, 3.0D, 0.0D };
    double[] arrayOfDouble30 = { 0.0D, 1.0D, 0.0D, 2.0D, 2.0D, 7.0D, 0.0D, -3.0D, 0.0D };
    double[] arrayOfDouble31 = { -2.0D, 1.0D, 1.0D, 0.0D, 0.0D, -7.0D, 0.0D, 0.0D, 0.0D };
    double[] arrayOfDouble32 = { 2.0D, 0.0D, 0.0D, 2.0D, 1.0D, -7.0D, 0.0D, 3.0D, 0.0D };
    double[] arrayOfDouble33 = { 2.0D, 0.0D, 1.0D, 0.0D, 0.0D, 6.0D, 0.0D, 0.0D, 0.0D };
    double[] arrayOfDouble34 = { -2.0D, 0.0D, 1.0D, 2.0D, 1.0D, 6.0D, 0.0D, -3.0D, 0.0D };
    double[] arrayOfDouble35 = { 2.0D, 0.0D, -2.0D, 0.0D, 1.0D, -6.0D, 0.0D, 3.0D, 0.0D };
    double[] arrayOfDouble36 = { 2.0D, 0.0D, 0.0D, 0.0D, 1.0D, -6.0D, 0.0D, 3.0D, 0.0D };
    double[] arrayOfDouble37 = { 0.0D, -1.0D, 1.0D, 0.0D, 0.0D, 5.0D, 0.0D, 0.0D, 0.0D };
    double[] arrayOfDouble38 = { -2.0D, -1.0D, 0.0D, 2.0D, 1.0D, -5.0D, 0.0D, 3.0D, 0.0D };
    double[] arrayOfDouble39 = { 0.0D, 0.0D, 2.0D, 2.0D, 1.0D, -5.0D, 0.0D, 3.0D, 0.0D };
    double[] arrayOfDouble40 = { -2.0D, 1.0D, 0.0D, 2.0D, 1.0D, 4.0D, 0.0D, 0.0D, 0.0D };
    double[] arrayOfDouble41 = { 0.0D, 0.0D, 1.0D, -2.0D, 0.0D, 4.0D, 0.0D, 0.0D, 0.0D };
    double[] arrayOfDouble42 = { -1.0D, 0.0D, 1.0D, 0.0D, 0.0D, -4.0D, 0.0D, 0.0D, 0.0D };
    double[] arrayOfDouble43 = { 1.0D, 0.0D, 0.0D, 0.0D, 0.0D, -4.0D, 0.0D, 0.0D, 0.0D };
    double[] arrayOfDouble44 = { 0.0D, 0.0D, 1.0D, 2.0D, 0.0D, 3.0D, 0.0D, 0.0D, 0.0D };
    double[] arrayOfDouble45 = { 0.0D, 0.0D, -2.0D, 2.0D, 2.0D, -3.0D, 0.0D, 0.0D, 0.0D };
    double[] arrayOfDouble46 = { -1.0D, -1.0D, 1.0D, 0.0D, 0.0D, -3.0D, 0.0D, 0.0D, 0.0D };
    double[] arrayOfDouble47 = { 0.0D, 1.0D, 1.0D, 0.0D, 0.0D, -3.0D, 0.0D, 0.0D, 0.0D };
    double[] arrayOfDouble48 = { 0.0D, -1.0D, 1.0D, 2.0D, 2.0D, -3.0D, 0.0D, 0.0D, 0.0D };
    double[] arrayOfDouble49 = { 0.0D, 0.0D, 3.0D, 2.0D, 2.0D, -3.0D, 0.0D, 0.0D, 0.0D };
    j = new double[][] { 
        arrayOfDouble1, arrayOfDouble2, arrayOfDouble3, arrayOfDouble4, { 0.0D, 1.0D, 0.0D, 0.0D, 0.0D, 1426.0D, -3.4D, 54.0D, -0.1D }, { 0.0D, 0.0D, 1.0D, 0.0D, 0.0D, 712.0D, 0.1D, -7.0D, 0.0D }, arrayOfDouble5, arrayOfDouble6, arrayOfDouble7, { -2.0D, -1.0D, 0.0D, 2.0D, 2.0D, 217.0D, -0.5D, -95.0D, 0.3D }, 
        arrayOfDouble8, arrayOfDouble9, arrayOfDouble10, arrayOfDouble11, arrayOfDouble12, arrayOfDouble13, arrayOfDouble14, arrayOfDouble15, arrayOfDouble16, { 0.0D, 0.0D, -2.0D, 2.0D, 1.0D, 46.0D, 0.0D, -24.0D, 0.0D }, 
        { 2.0D, 0.0D, 0.0D, 2.0D, 2.0D, -38.0D, 0.0D, 16.0D, 0.0D }, arrayOfDouble17, arrayOfDouble18, arrayOfDouble19, { 0.0D, 0.0D, 0.0D, 2.0D, 0.0D, 26.0D, 0.0D, 0.0D, 0.0D }, arrayOfDouble20, arrayOfDouble21, arrayOfDouble22, arrayOfDouble23, arrayOfDouble24, 
        arrayOfDouble25, { -2.0D, 0.0D, 1.0D, 0.0D, 1.0D, -13.0D, 0.0D, 7.0D, 0.0D }, arrayOfDouble26, arrayOfDouble27, arrayOfDouble28, arrayOfDouble29, arrayOfDouble30, arrayOfDouble31, { 0.0D, -1.0D, 0.0D, 2.0D, 2.0D, -7.0D, 0.0D, 3.0D, 0.0D }, arrayOfDouble32, 
        arrayOfDouble33, { -2.0D, 0.0D, 2.0D, 2.0D, 2.0D, 6.0D, 0.0D, -3.0D, 0.0D }, arrayOfDouble34, arrayOfDouble35, arrayOfDouble36, arrayOfDouble37, arrayOfDouble38, { -2.0D, 0.0D, 0.0D, 0.0D, 1.0D, -5.0D, 0.0D, 3.0D, 0.0D }, arrayOfDouble39, { -2.0D, 0.0D, 2.0D, 0.0D, 1.0D, 4.0D, 0.0D, 0.0D, 0.0D }, 
        arrayOfDouble40, arrayOfDouble41, arrayOfDouble42, { -2.0D, 1.0D, 0.0D, 0.0D, 0.0D, -4.0D, 0.0D, 0.0D, 0.0D }, arrayOfDouble43, arrayOfDouble44, arrayOfDouble45, arrayOfDouble46, arrayOfDouble47, arrayOfDouble48, 
        { 2.0D, -1.0D, -1.0D, 2.0D, 2.0D, -3.0D, 0.0D, 0.0D, 0.0D }, arrayOfDouble49, { 2.0D, -1.0D, 0.0D, 2.0D, 2.0D, -3.0D, 0.0D, 0.0D, 0.0D } };
  }
  
  static void a(double paramDouble, double[] paramArrayOfdouble) {
    double d3 = Math.toRadians(((5.277768981496142E-6D * paramDouble - 0.0019142D) * paramDouble + 445267.11148D) * paramDouble + 297.85036D);
    double d4 = Math.toRadians(((-3.3333333333333333E-6D * paramDouble - 1.603E-4D) * paramDouble + 35999.05034D) * paramDouble + 357.52772D);
    double d5 = Math.toRadians(((1.7777777777777779E-4D * paramDouble + 0.0086972D) * paramDouble + 477198.867398D) * paramDouble + 134.96298D);
    double d6 = Math.toRadians(((3.0555810187307116E-6D * paramDouble - 0.0036825D) * paramDouble + 483202.017538D) * paramDouble + 93.27191D);
    double d7 = Math.toRadians(((2.222222222222222E-6D * paramDouble + 0.0020708D) * paramDouble - 1934.136261D) * paramDouble + 125.04452D);
    int i = j.length - 1;
    double d2 = 0.0D;
    double d1 = 0.0D;
    while (i >= 0) {
      double[] arrayOfDouble = j[i];
      double d = arrayOfDouble[0] * d3 + arrayOfDouble[1] * d4 + arrayOfDouble[2] * d5 + arrayOfDouble[3] * d6 + arrayOfDouble[4] * d7;
      d2 += Math.sin(d) * (arrayOfDouble[5] + arrayOfDouble[6] * paramDouble);
      d1 += Math.cos(d) * (arrayOfDouble[7] + arrayOfDouble[8] * paramDouble);
      i--;
    } 
    paramArrayOfdouble[0] = d2 * 1.0E-4D / 3600.0D;
    paramArrayOfdouble[1] = d1 * 1.0E-4D / 3600.0D;
  }
  
  private static double b(double paramDouble1, double paramDouble2) {
    int i = g.length - 1;
    double d = 0.0D;
    while (i >= 0) {
      double d1 = g[i];
      double d2 = Math.sin(Math.toRadians(h[i] + i[i] * paramDouble1));
      Double.isNaN(d1);
      d += d1 * d2;
      i--;
    } 
    paramDouble1 = (36000.76953744D * paramDouble1 + 282.7771834D + d * 5.729577951308232D / 1000000.0D + c(paramDouble1) + paramDouble2) / 360.0D;
    return (paramDouble1 - Math.floor(paramDouble1)) * 360.0D;
  }
  
  private static double c(double paramDouble) {
    return Math.cos(Math.toRadians(paramDouble * 35999.01848D + 177.63D)) * 9.74E-5D - 0.005575D;
  }
  
  static double e(double paramDouble) {
    return (((0.001813D * paramDouble - 5.9E-4D) * paramDouble - 46.815D) * paramDouble + 21.448D) / 3600.0D + 23.433333333333334D;
  }
  
  private static double f(double paramDouble) {
    return (paramDouble - 2451545.0D) / 36525.0D;
  }
  
  public double a(double paramDouble) {
    throw new AbstractMethodError();
  }
  
  public double a(double paramDouble, String paramString) {
    return paramString.equals("declination") ? a(paramDouble) : (paramString.equals("right-ascension") ? b(paramDouble) : Double.NaN);
  }
  
  public double b(double paramDouble) {
    throw new AbstractMethodError();
  }
  
  enum a {
    private double c(double param1Double) {
      h0 h0 = c.a(param1Double).c().b((k)p.m);
      param1Double = h0.w().x();
      double d = ((Integer)h0.x().e((p)g0.B)).intValue();
      Double.isNaN(d);
      d /= 86400.0D;
      Double.isNaN(param1Double);
      return param1Double + d;
    }
    
    private double f(double param1Double) {
      param1Double = param1Double * 0.9856D - 3.289D;
      return a.b(Math.sin(Math.toRadians(param1Double)) * 1.916D + param1Double + Math.sin(Math.toRadians(param1Double) * 2.0D) * 0.02D + 282.634D);
    }
    
    public double a(double param1Double) {
      return Math.toDegrees(Math.asin(Math.sin(Math.toRadians(f(c(param1Double)))) * 0.39782D));
    }
    
    public double b(double param1Double) {
      param1Double = f(c(param1Double));
      double d = a.b(Math.toDegrees(Math.atan(Math.tan(Math.toRadians(param1Double)) * 0.91764D)));
      return d + Math.floor(param1Double / 90.0D) * 90.0D - Math.floor(d / 90.0D) * 90.0D;
    }
  }
  
  enum b {
    private double c(double param1Double) {
      return Math.asin(Math.sin(Math.toRadians(i(param1Double))) * Math.sin(Math.toRadians(j(param1Double))));
    }
    
    private double f(double param1Double) {
      double d = Math.toRadians(g(param1Double));
      return Math.sin(d) * (1.914602D - (1.4E-5D * param1Double + 0.004817D) * param1Double) + Math.sin(2.0D * d) * (0.019993D - param1Double * 1.01E-4D) + Math.sin(d * 3.0D) * 2.89E-4D;
    }
    
    private double g(double param1Double) {
      return (35999.05029D - 1.537E-4D * param1Double) * param1Double + 357.52911D;
    }
    
    private double h(double param1Double) {
      return ((3.032E-4D * param1Double + 36000.76983D) * param1Double + 280.46646D) % 360.0D;
    }
    
    private double i(double param1Double) {
      return (((0.001813D * param1Double - 5.9E-4D) * param1Double - 46.815D) * param1Double + 21.448D) / 3600.0D + 23.433333333333334D + Math.cos(Math.toRadians(125.04D - param1Double * 1934.136D)) * 0.00256D;
    }
    
    private double j(double param1Double) {
      return h(param1Double) + f(param1Double) - 0.00569D - Math.sin(Math.toRadians(125.04D - param1Double * 1934.136D)) * 0.00478D;
    }
    
    public double a(double param1Double) {
      return Math.toDegrees(c(f.d(param1Double)));
    }
    
    public double b(double param1Double) {
      param1Double = f.d(param1Double);
      double d = Math.toRadians(j(param1Double));
      return a.b(Math.toDegrees(Math.atan2(Math.cos(Math.toRadians(i(param1Double))) * Math.sin(d), Math.cos(d))));
    }
  }
  
  enum c {
    private double c(double param1Double) {
      return Math.asin(Math.sin(Math.toRadians(h(param1Double))) * Math.sin(Math.toRadians(f.a(param1Double, g(param1Double)))));
    }
    
    private double f(double param1Double) {
      return ((4.8E-7D * param1Double - 1.559E-4D) * param1Double + 35999.0503D) * param1Double + 357.5291D;
    }
    
    private double g(double param1Double) {
      double d = Math.toRadians((0.002063D * param1Double - 1934.134D) * param1Double + 124.9D);
      param1Double = Math.toRadians((5.7E-4D * param1Double + 72001.5377D) * param1Double + 201.11D);
      return Math.sin(d) * -0.004778D - Math.sin(param1Double) * 3.667E-4D;
    }
    
    private double h(double param1Double) {
      return (((0.001813D * param1Double - 5.9E-4D) * param1Double - 46.815D) * param1Double + 21.448D) / 3600.0D + 23.433333333333334D;
    }
    
    public double a(double param1Double) {
      return a(param1Double, "declination");
    }
    
    public double a(double param1Double, String param1String) {
      param1Double = f.d(param1Double);
      if (param1String.equals("declination"))
        return Math.toDegrees(c(param1Double)); 
      if (param1String.equals("right-ascension")) {
        double d = Math.toRadians(f.a(param1Double, g(param1Double)));
        return a.b(Math.toDegrees(Math.atan2(Math.cos(Math.toRadians(h(param1Double))) * Math.sin(d), Math.cos(d))));
      } 
      return param1String.equals("nutation") ? g(param1Double) : (param1String.equals("obliquity") ? h(param1Double) : (param1String.equals("mean-anomaly") ? f(param1Double) : (param1String.equals("solar-longitude") ? f.a(param1Double, g(param1Double)) : (param1String.equals("solar-latitude") ? 0.0D : Double.NaN))));
    }
    
    public double b(double param1Double) {
      return a(param1Double, "right-ascension");
    }
  }
  
  enum d {
    private double c(double param1Double) {
      double[] arrayOfDouble = new double[2];
      f.a(param1Double, arrayOfDouble);
      return Math.asin(Math.sin(Math.toRadians(f.e(param1Double) + arrayOfDouble[1])) * Math.sin(Math.toRadians(f.a(param1Double, arrayOfDouble[0]))));
    }
    
    private double f(double param1Double) {
      return (35999.05029D - 1.537E-4D * param1Double) * param1Double + 357.52911D;
    }
    
    public double a(double param1Double) {
      return a(param1Double, "declination");
    }
    
    public double a(double param1Double, String param1String) {
      double[] arrayOfDouble;
      param1Double = f.d(param1Double);
      if (param1String.equals("declination"))
        return Math.toDegrees(c(param1Double)); 
      if (param1String.equals("right-ascension")) {
        arrayOfDouble = new double[2];
        f.a(param1Double, arrayOfDouble);
        double d1 = Math.toRadians(f.a(param1Double, arrayOfDouble[0]));
        return a.b(Math.toDegrees(Math.atan2(Math.cos(Math.toRadians(f.e(param1Double) + arrayOfDouble[1])) * Math.sin(d1), Math.cos(d1))));
      } 
      if (arrayOfDouble.equals("nutation")) {
        arrayOfDouble = new double[2];
        f.a(param1Double, arrayOfDouble);
        return arrayOfDouble[0];
      } 
      if (arrayOfDouble.equals("obliquity")) {
        arrayOfDouble = new double[2];
        f.a(param1Double, arrayOfDouble);
        return f.e(param1Double) + arrayOfDouble[1];
      } 
      if (arrayOfDouble.equals("mean-anomaly"))
        return f(param1Double); 
      if (arrayOfDouble.equals("solar-longitude")) {
        arrayOfDouble = new double[2];
        f.a(param1Double, arrayOfDouble);
        return f.a(param1Double, arrayOfDouble[0]);
      } 
      return arrayOfDouble.equals("solar-latitude") ? 0.0D : Double.NaN;
    }
    
    public double b(double param1Double) {
      return a(param1Double, "right-ascension");
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/calendar/s/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */