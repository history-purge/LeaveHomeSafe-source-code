package net.time4j.tz.model;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import net.time4j.b0;
import net.time4j.c1.b;
import net.time4j.f0;
import net.time4j.w0;

final class h extends g {
  private static final long serialVersionUID = -946839310332554772L;
  
  private final transient byte h;
  
  h(b0 paramb0, w0 paramw0, int paramInt1, i parami, int paramInt2) {
    super(paramb0, paramInt1, parami, paramInt2);
    this.h = (byte)paramw0.a();
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) {
    throw new InvalidObjectException("Serialization proxy required.");
  }
  
  private Object writeReplace() {
    return new SPX(this, f());
  }
  
  protected f0 b(int paramInt) {
    byte b = g();
    int k = b.a(paramInt, b);
    int j = b.b(paramInt, b, k) - this.h;
    int i = j;
    if (j < 0)
      i = j + 7; 
    return f0.b(paramInt, b, k - i);
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof h) {
      paramObject = paramObject;
      return (this.h == ((h)paramObject).h && a((g)paramObject));
    } 
    return false;
  }
  
  int f() {
    return 122;
  }
  
  byte h() {
    return this.h;
  }
  
  public int hashCode() {
    return this.h * 17 + g() * 37;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(64);
    stringBuilder.append("LastDayOfWeekPattern:[month=");
    stringBuilder.append(g());
    stringBuilder.append(",day-of-week=");
    stringBuilder.append(w0.g(this.h));
    stringBuilder.append(",day-overflow=");
    stringBuilder.append(b());
    stringBuilder.append(",time-of-day=");
    stringBuilder.append(e());
    stringBuilder.append(",offset-indicator=");
    stringBuilder.append(c());
    stringBuilder.append(",dst-offset=");
    stringBuilder.append(d());
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/tz/model/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */