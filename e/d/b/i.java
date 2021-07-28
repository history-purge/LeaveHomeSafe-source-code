package e.d.b;

import java.text.DecimalFormat;

public final class i {
  private final double a;
  
  private final double b;
  
  public i(double paramDouble1, double paramDouble2) {
    this.a = paramDouble1;
    this.b = paramDouble2;
  }
  
  public static Double a(m paramm1, m paramm2, m paramm3, boolean paramBoolean) {
    double d2 = Math.abs(paramm1.doubleValue()) + paramm2.doubleValue() / 60.0D + paramm3.doubleValue() / 3600.0D;
    if (Double.isNaN(d2))
      return null; 
    double d1 = d2;
    if (paramBoolean)
      d1 = d2 * -1.0D; 
    return Double.valueOf(d1);
  }
  
  public static double[] a(double paramDouble) {
    int j = (int)paramDouble;
    paramDouble = Math.abs(paramDouble % 1.0D * 60.0D);
    return new double[] { j, (int)paramDouble, paramDouble % 1.0D * 60.0D };
  }
  
  public static String b(double paramDouble) {
    double[] arrayOfDouble = a(paramDouble);
    DecimalFormat decimalFormat = new DecimalFormat("0.##");
    return String.format("%s° %s' %s\"", new Object[] { decimalFormat.format(arrayOfDouble[0]), decimalFormat.format(arrayOfDouble[1]), decimalFormat.format(arrayOfDouble[2]) });
  }
  
  public double a() {
    return this.a;
  }
  
  public double b() {
    return this.b;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject != null) {
      if (i.class != paramObject.getClass())
        return false; 
      paramObject = paramObject;
      return (Double.compare(((i)paramObject).a, this.a) != 0) ? false : (!(Double.compare(((i)paramObject).b, this.b) != 0));
    } 
    return false;
  }
  
  public int hashCode() {
    double d = this.a;
    long l2 = 0L;
    if (d != 0.0D) {
      l1 = Double.doubleToLongBits(d);
    } else {
      l1 = 0L;
    } 
    int j = (int)(l1 ^ l1 >>> 32L);
    d = this.b;
    long l1 = l2;
    if (d != 0.0D)
      l1 = Double.doubleToLongBits(d); 
    return j * 31 + (int)(l1 ^ l1 >>> 32L);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.a);
    stringBuilder.append(", ");
    stringBuilder.append(this.b);
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/b/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */