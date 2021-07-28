package net.time4j.history;

import net.time4j.d1.a0;
import net.time4j.f0;

final class f {
  final long a;
  
  final c b;
  
  final h c;
  
  final h d;
  
  f(long paramLong, c paramc1, c paramc2) {
    h h1;
    this.a = paramLong;
    this.b = paramc2;
    if (paramLong == Long.MIN_VALUE) {
      h1 = new h(j.c, 1000000000, 1, 1);
      this.c = h1;
    } else {
      this.c = this.b.a(paramLong);
      h1 = h1.a(paramLong - 1L);
    } 
    this.d = h1;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof f) {
      paramObject = paramObject;
      return (this.a == ((f)paramObject).a && this.b == ((f)paramObject).b && this.d.equals(((f)paramObject).d));
    } 
    return false;
  }
  
  public int hashCode() {
    long l = this.a;
    return (int)(l ^ l >>> 32L);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(f.class.getName());
    stringBuilder.append("[start=");
    stringBuilder.append(this.a);
    stringBuilder.append(" (");
    stringBuilder.append(f0.a(this.a, a0.e));
    stringBuilder.append("),algorithm=");
    stringBuilder.append(this.b);
    stringBuilder.append(",date-before-cutover=");
    stringBuilder.append(this.d);
    stringBuilder.append(",date-at-cutover=");
    stringBuilder.append(this.c);
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/history/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */