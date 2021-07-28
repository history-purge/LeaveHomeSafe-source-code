package net.time4j;

import java.io.Serializable;
import net.time4j.d1.f;
import net.time4j.d1.n0;
import net.time4j.d1.x;

final class e0 extends f implements u, Serializable {
  private static final long serialVersionUID = 1988843503875912054L;
  
  private final int policy;
  
  private final f unit;
  
  e0(f paramf, int paramInt) {
    this.unit = paramf;
    this.policy = paramInt;
  }
  
  public char a() {
    return Character.MIN_VALUE;
  }
  
  protected <T extends net.time4j.d1.q<T>> n0<T> a(x<T> paramx) {
    return paramx.c(f0.p) ? new f.j<T>(this.unit, this.policy) : null;
  }
  
  public double b() {
    return this.unit.b();
  }
  
  public boolean c() {
    return true;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof e0) {
      paramObject = paramObject;
      return (this.unit == ((e0)paramObject).unit && this.policy == ((e0)paramObject).policy);
    } 
    return false;
  }
  
  public int hashCode() {
    return this.unit.hashCode() * 23 + this.policy * 37;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.unit.a());
    stringBuilder.append('-');
    switch (this.policy) {
      default:
        str = "PREVIOUS_VALID_DATE";
        stringBuilder.append(str);
        return stringBuilder.toString();
      case 6:
        str = "JODA_METRIC";
        stringBuilder.append(str);
        return stringBuilder.toString();
      case 5:
        str = "KEEPING_LAST_DATE";
        stringBuilder.append(str);
        return stringBuilder.toString();
      case 4:
        str = "UNLESS_INVALID";
        stringBuilder.append(str);
        return stringBuilder.toString();
      case 3:
        str = "CARRY_OVER";
        stringBuilder.append(str);
        return stringBuilder.toString();
      case 2:
        str = "END_OF_MONTH";
        stringBuilder.append(str);
        return stringBuilder.toString();
      case 1:
        break;
    } 
    String str = "NEXT_VALID_DATE";
    stringBuilder.append(str);
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/e0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */