package e.d.b;

import java.io.Serializable;

public class m extends Number implements Comparable<m>, Serializable {
  private static final long serialVersionUID = 510688928138848770L;
  
  private final long _denominator;
  
  private final long _numerator;
  
  public m(long paramLong1, long paramLong2) {
    this._numerator = paramLong1;
    this._denominator = paramLong2;
  }
  
  private static long a(long paramLong1, long paramLong2) {
    long l1 = paramLong1;
    if (paramLong1 < 0L)
      l1 = -paramLong1; 
    long l2 = l1;
    paramLong1 = paramLong2;
    if (paramLong2 < 0L) {
      paramLong1 = -paramLong2;
      l2 = l1;
    } 
    while (l2 != 0L && paramLong1 != 0L) {
      if (l2 > paramLong1) {
        l2 %= paramLong1;
        continue;
      } 
      paramLong1 %= l2;
    } 
    paramLong2 = l2;
    if (l2 == 0L)
      paramLong2 = paramLong1; 
    return paramLong2;
  }
  
  public int a(m paramm) {
    return Double.compare(doubleValue(), paramm.doubleValue());
  }
  
  public final long a() {
    return this._denominator;
  }
  
  public String a(boolean paramBoolean) {
    if (this._denominator == 0L && this._numerator != 0L)
      return toString(); 
    if (q())
      return Integer.toString(intValue()); 
    long l = this._numerator;
    if (l != 1L) {
      long l1 = this._denominator;
      if (l1 % l == 0L)
        return (new m(1L, l1 / l)).a(paramBoolean); 
    } 
    m m1 = d();
    if (paramBoolean) {
      String str = Double.toString(m1.doubleValue());
      if (str.length() < 5)
        return str; 
    } 
    return m1.toString();
  }
  
  public final long b() {
    return this._numerator;
  }
  
  public boolean b(m paramm) {
    return (paramm.doubleValue() == doubleValue());
  }
  
  public final byte byteValue() {
    return (byte)(int)doubleValue();
  }
  
  public m c() {
    return new m(this._denominator, this._numerator);
  }
  
  public m d() {
    long l = a(this._numerator, this._denominator);
    return new m(this._numerator / l, this._denominator / l);
  }
  
  public double doubleValue() {
    long l = this._numerator;
    if (l == 0L)
      return 0.0D; 
    double d1 = l;
    double d2 = this._denominator;
    Double.isNaN(d1);
    Double.isNaN(d2);
    return d1 / d2;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (paramObject != null) {
      if (!(paramObject instanceof m))
        return false; 
      paramObject = paramObject;
      bool1 = bool2;
      if (doubleValue() == paramObject.doubleValue())
        bool1 = true; 
    } 
    return bool1;
  }
  
  public float floatValue() {
    long l = this._numerator;
    return (l == 0L) ? 0.0F : ((float)l / (float)this._denominator);
  }
  
  public int hashCode() {
    return (int)this._denominator * 23 + (int)this._numerator;
  }
  
  public final int intValue() {
    return (int)doubleValue();
  }
  
  public final long longValue() {
    return (long)doubleValue();
  }
  
  public boolean q() {
    long l = this._denominator;
    return (l == 1L || (l != 0L && this._numerator % l == 0L) || (this._denominator == 0L && this._numerator == 0L));
  }
  
  public boolean r() {
    return (this._numerator == 0L || this._denominator == 0L);
  }
  
  public final short shortValue() {
    return (short)(int)doubleValue();
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this._numerator);
    stringBuilder.append("/");
    stringBuilder.append(this._denominator);
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/b/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */