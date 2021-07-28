package net.time4j.tz;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import net.time4j.c1.f;
import net.time4j.c1.g;

final class a extends l {
  private static final long serialVersionUID = -2894726563499525332L;
  
  private final l fallback;
  
  private final k tzid;
  
  a(k paramk, l paraml) {
    if (paramk != null && paraml != null) {
      this.tzid = paramk;
      this.fallback = paraml;
      return;
    } 
    throw new NullPointerException();
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) {
    throw new InvalidObjectException("Serialization proxy required.");
  }
  
  private Object writeReplace() {
    return new SPX(this, 12);
  }
  
  public l a(o paramo) {
    return new a(this.tzid, this.fallback.a(paramo));
  }
  
  public p b(f paramf) {
    return this.fallback.b(paramf);
  }
  
  public m c() {
    return this.fallback.c();
  }
  
  public p c(net.time4j.c1.a parama, g paramg) {
    return this.fallback.c(parama, paramg);
  }
  
  public boolean c(f paramf) {
    return this.fallback.c(paramf);
  }
  
  public k d() {
    return this.tzid;
  }
  
  public boolean d(net.time4j.c1.a parama, g paramg) {
    return this.fallback.d(parama, paramg);
  }
  
  public o e() {
    return this.fallback.e();
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof a) {
      paramObject = paramObject;
      return (this.tzid.a().equals(((a)paramObject).tzid.a()) && this.fallback.equals(((a)paramObject).fallback));
    } 
    return false;
  }
  
  public boolean f() {
    return this.fallback.f();
  }
  
  public int hashCode() {
    return this.tzid.a().hashCode();
  }
  
  l q() {
    return this.fallback;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(32);
    stringBuilder.append('[');
    stringBuilder.append(a.class.getName());
    stringBuilder.append(':');
    stringBuilder.append(this.tzid.a());
    stringBuilder.append(",fallback=");
    stringBuilder.append(this.fallback);
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/tz/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */