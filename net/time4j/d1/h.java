package net.time4j.d1;

import java.io.Serializable;

public final class h implements Comparable<h>, Serializable {
  public static final h c = new h(0L);
  
  public static final h d = new h(1L);
  
  private final long days;
  
  private h(long paramLong) {
    this.days = paramLong;
  }
  
  public static h a(long paramLong) {
    return (paramLong == 0L) ? c : ((paramLong == 1L) ? d : new h(paramLong));
  }
  
  public int a(h paramh) {
    long l1 = this.days;
    long l2 = paramh.days;
    return (l1 < l2) ? -1 : ((l1 > l2) ? 1 : 0);
  }
  
  public long a() {
    return this.days;
  }
  
  public boolean equals(Object paramObject) {
    return (this == paramObject) ? true : ((paramObject instanceof h) ? ((this.days == ((h)paramObject).days)) : false);
  }
  
  public int hashCode() {
    long l = this.days;
    return (int)(l ^ l >>> 32L);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    if (this.days < 0L)
      stringBuilder.append('-'); 
    stringBuilder.append('P');
    stringBuilder.append(Math.abs(this.days));
    stringBuilder.append('D');
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/d1/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */