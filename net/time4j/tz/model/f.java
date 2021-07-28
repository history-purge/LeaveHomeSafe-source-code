package net.time4j.tz.model;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import net.time4j.b0;
import net.time4j.c1.b;
import net.time4j.f0;

final class f extends g {
  private static final long serialVersionUID = 3957240859230862745L;
  
  private final transient byte h;
  
  f(b0 paramb0, int paramInt1, int paramInt2, i parami, int paramInt3) {
    super(paramb0, paramInt2, parami, paramInt3);
    b.a(2000, paramb0.a(), paramInt1);
    this.h = (byte)paramInt1;
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) {
    throw new InvalidObjectException("Serialization proxy required.");
  }
  
  private Object writeReplace() {
    return new SPX(this, f());
  }
  
  protected f0 b(int paramInt) {
    return f0.b(paramInt, g(), this.h);
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof f) {
      paramObject = paramObject;
      return (this.h == ((f)paramObject).h && a((g)paramObject));
    } 
    return false;
  }
  
  int f() {
    return 120;
  }
  
  int h() {
    return this.h;
  }
  
  public int hashCode() {
    return this.h + g() * 37;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(64);
    stringBuilder.append("FixedDayPattern:[month=");
    stringBuilder.append(g());
    stringBuilder.append(",day-of-month=");
    stringBuilder.append(this.h);
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


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/tz/model/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */