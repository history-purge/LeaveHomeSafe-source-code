package net.time4j.calendar.s;

import java.io.ObjectInputStream;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import net.time4j.a0;
import net.time4j.d1.a0;
import net.time4j.f0;
import net.time4j.g1.d;
import net.time4j.g1.f;

public final class c implements Serializable {
  private static final long serialVersionUID = 486345450973062467L;
  
  private final f scale;
  
  private final double value;
  
  private c(double paramDouble, f paramf) {
    a(paramDouble, paramf);
    this.value = paramDouble;
    this.scale = paramf;
  }
  
  static double a(a0 parama0, f paramf) {
    long l1 = parama0.a(paramf);
    long l2 = a(paramf);
    int i = parama0.b(paramf);
    double d1 = (l1 + l2);
    double d2 = i;
    Double.isNaN(d2);
    d2 /= 1.0E9D;
    Double.isNaN(d1);
    return (d1 + d2) / 86400.0D;
  }
  
  private static long a(f paramf) {
    int i = a.a[paramf.ordinal()];
    if (i != 1 && i != 2) {
      if (i == 3)
        return 210866760000L; 
      throw new UnsupportedOperationException(paramf.name());
    } 
    return 210929832000L;
  }
  
  public static c a(double paramDouble) {
    return new c(paramDouble, f.g);
  }
  
  public static c a(a0 parama0) {
    return new c(a(parama0, f.g), f.g);
  }
  
  private static void a(double paramDouble, f paramf) {
    if (!Double.isNaN(paramDouble) && !Double.isInfinite(paramDouble)) {
      StringBuilder stringBuilder1;
      int i = a.a[paramf.ordinal()];
      if (i == 1 || i == 2 || i == 3) {
        if (Double.compare(990575.0D, paramDouble) <= 0 && Double.compare(paramDouble, 2817152.0D) <= 0)
          return; 
        stringBuilder1 = new StringBuilder();
        stringBuilder1.append("Out of range: ");
        stringBuilder1.append(paramDouble);
        throw new IllegalArgumentException(stringBuilder1.toString());
      } 
      StringBuilder stringBuilder2 = new StringBuilder();
      stringBuilder2.append("Unsupported time scale: ");
      stringBuilder2.append(stringBuilder1);
      throw new IllegalArgumentException(stringBuilder2.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Value is not finite: ");
    stringBuilder.append(paramDouble);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) {
    try {
      paramObjectInputStream.defaultReadObject();
      a(this.value, this.scale);
      return;
    } catch (ClassNotFoundException classNotFoundException) {
      throw new StreamCorruptedException();
    } catch (IllegalArgumentException illegalArgumentException) {
      throw new StreamCorruptedException();
    } 
  }
  
  public double a() {
    return this.value - 2400000.5D;
  }
  
  public double b() {
    return this.value;
  }
  
  public a0 c() {
    double d1 = this.value * 86400.0D;
    f f2 = this.scale;
    double d2 = d1;
    f f1 = f2;
    if (!d.k().h()) {
      d2 = d1;
      f1 = f2;
      if (f2 != f.c) {
        d2 = d1;
        if (f2 == f.g) {
          f0 f0 = f0.a((long)Math.floor(a()), a0.e);
          d2 = d1 - f.a(f0.getYear(), f0.getMonth());
        } 
        d2 += 6.3072E7D;
        f1 = f.c;
      } 
    } 
    return a0.a(net.time4j.c1.c.c((long)d2, a(f1)), (int)((d2 - Math.floor(d2)) * 1.0E9D), f1);
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof c) {
      paramObject = paramObject;
      return (this.value == ((c)paramObject).value && this.scale == ((c)paramObject).scale);
    } 
    return false;
  }
  
  public int hashCode() {
    return a.a(this.value) ^ this.scale.hashCode();
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("JD(");
    stringBuilder.append(this.scale.name());
    stringBuilder.append(')');
    stringBuilder.append(this.value);
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/calendar/s/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */