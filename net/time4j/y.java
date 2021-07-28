package net.time4j;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;
import net.time4j.c1.c;
import net.time4j.d1.k0;
import net.time4j.d1.m0;
import net.time4j.g1.f;

public final class y<U> implements m0<U>, Comparable<y<U>>, Serializable {
  private static final y<TimeUnit> f = new y(0L, 0, f.c);
  
  private static final y<m0> g = new y(0L, 0, f.d);
  
  private static final long serialVersionUID = -4150291820807606229L;
  
  private final transient long c;
  
  private final transient int d;
  
  private final transient f e;
  
  static {
    new b(f.c, null);
    new b(f.d, null);
  }
  
  private y(long paramLong, int paramInt, f paramf) {
    int i = paramInt;
    long l = paramLong;
    while (true) {
      paramLong = l;
      paramInt = i;
      if (i < 0) {
        i += 1000000000;
        l = c.c(l, 1L);
        continue;
      } 
      break;
    } 
    while (paramInt >= 1000000000) {
      paramInt -= 1000000000;
      paramLong = c.a(paramLong, 1L);
    } 
    l = paramLong;
    i = paramInt;
    if (paramLong < 0L) {
      l = paramLong;
      i = paramInt;
      if (paramInt > 0) {
        l = paramLong + 1L;
        i = paramInt - 1000000000;
      } 
    } 
    this.c = l;
    this.d = i;
    this.e = paramf;
  }
  
  public static y<TimeUnit> a(long paramLong, int paramInt) {
    return (paramLong == 0L && paramInt == 0) ? f : new y<TimeUnit>(paramLong, paramInt, f.c);
  }
  
  private void a(StringBuilder paramStringBuilder) {
    long l;
    if (q()) {
      paramStringBuilder.append('-');
      l = Math.abs(this.c);
    } else {
      l = this.c;
    } 
    paramStringBuilder.append(l);
    if (this.d != 0) {
      paramStringBuilder.append('.');
      String str = String.valueOf(Math.abs(this.d));
      for (int i = 9 - str.length(); i > 0; i--)
        paramStringBuilder.append('0'); 
      paramStringBuilder.append(str);
    } 
  }
  
  public static y<m0> b(long paramLong, int paramInt) {
    return (paramLong == 0L && paramInt == 0) ? g : new y<m0>(paramLong, paramInt, f.d);
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) {
    throw new InvalidObjectException("Serialization proxy required.");
  }
  
  private Object writeReplace() {
    return new SPX(this, 5);
  }
  
  public int a(y<U> paramy) {
    if (this.e == paramy.e) {
      long l1 = this.c;
      long l2 = paramy.c;
      return (l1 < l2) ? -1 : ((l1 > l2) ? 1 : (this.d - paramy.d));
    } 
    throw new ClassCastException("Different time scales.");
  }
  
  public int b() {
    int j = this.d;
    int i = j;
    if (j < 0)
      i = j + 1000000000; 
    return i;
  }
  
  public f c() {
    return this.e;
  }
  
  public long d() {
    long l2 = this.c;
    long l1 = l2;
    if (this.d < 0)
      l1 = l2 - 1L; 
    return l1;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof y) {
      paramObject = paramObject;
      return (this.c == ((y)paramObject).c && this.d == ((y)paramObject).d && this.e == ((y)paramObject).e);
    } 
    return false;
  }
  
  public int hashCode() {
    long l = this.c;
    return ((161 + (int)(l ^ l >>> 32L)) * 23 + this.d) * 23 + this.e.hashCode();
  }
  
  public boolean q() {
    return (this.c < 0L || this.d < 0);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    a(stringBuilder);
    stringBuilder.append("s [");
    stringBuilder.append(this.e.name());
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
  
  private static class b<U> implements k0<TimeUnit, y<U>> {
    private b(f param1f) {}
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */