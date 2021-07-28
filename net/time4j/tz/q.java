package net.time4j.tz;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public final class q implements Comparable<q>, Serializable {
  private static final long serialVersionUID = 4594838367057225304L;
  
  private final int dst;
  
  private final long posix;
  
  private final int previous;
  
  private final int total;
  
  public q(long paramLong, int paramInt1, int paramInt2, int paramInt3) {
    this.posix = paramLong;
    this.previous = paramInt1;
    this.total = paramInt2;
    this.dst = paramInt3;
    g(paramInt1);
    g(paramInt2);
    f(paramInt3);
  }
  
  private static void f(int paramInt) {
    if (paramInt != Integer.MAX_VALUE)
      g(paramInt); 
  }
  
  private static void g(int paramInt) {
    if (paramInt >= -64800 && paramInt <= 64800)
      return; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Offset out of range: ");
    stringBuilder.append(paramInt);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) {
    paramObjectInputStream.defaultReadObject();
    try {
      g(this.previous);
      g(this.total);
      f(this.dst);
      return;
    } catch (IllegalArgumentException illegalArgumentException) {
      throw new InvalidObjectException(illegalArgumentException.getMessage());
    } 
  }
  
  public int a() {
    int j = this.dst;
    int i = j;
    if (j == Integer.MAX_VALUE)
      i = 0; 
    return i;
  }
  
  public int a(q paramq) {
    long l2 = this.posix - paramq.posix;
    long l1 = l2;
    if (l2 == 0L) {
      l2 = (this.previous - paramq.previous);
      l1 = l2;
      if (l2 == 0L) {
        l2 = (this.total - paramq.total);
        l1 = l2;
        if (l2 == 0L) {
          l2 = (a() - paramq.a());
          l1 = l2;
          if (l2 == 0L)
            return 0; 
        } 
      } 
    } 
    return (l1 < 0L) ? -1 : 1;
  }
  
  public long b() {
    return this.posix;
  }
  
  public int c() {
    return this.previous;
  }
  
  public int d() {
    return this.total - this.previous;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof q) {
      paramObject = paramObject;
      return (this.posix == ((q)paramObject).posix && this.previous == ((q)paramObject).previous && this.total == ((q)paramObject).total && a() == paramObject.a());
    } 
    return false;
  }
  
  public int hashCode() {
    long l = this.posix;
    return (int)(l ^ l >>> 32L);
  }
  
  public int q() {
    return this.total - a();
  }
  
  public int r() {
    return this.total;
  }
  
  public boolean s() {
    return (this.total > this.previous);
  }
  
  public boolean t() {
    return (this.total < this.previous);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(128);
    stringBuilder.append("[POSIX=");
    stringBuilder.append(this.posix);
    stringBuilder.append(", previous-offset=");
    stringBuilder.append(this.previous);
    stringBuilder.append(", total-offset=");
    stringBuilder.append(this.total);
    stringBuilder.append(", dst-offset=");
    stringBuilder.append(a());
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/tz/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */