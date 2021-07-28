package net.time4j.tz;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import net.time4j.c1.a;
import net.time4j.c1.f;
import net.time4j.c1.g;

final class j extends l implements m {
  private static final long serialVersionUID = 7807230388259573234L;
  
  private static final j v = new j(p.m);
  
  private final p offset;
  
  private j(p paramp) {
    if (paramp.q() != 0) {
      int k = paramp.r();
      int i = k;
      if (paramp.q() < 0)
        i = k - 1; 
      paramp = p.f(i);
    } 
    this.offset = paramp;
  }
  
  static j a(p paramp) {
    return (paramp.r() == 0 && paramp.q() == 0) ? v : new j(paramp);
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) {
    paramObjectInputStream.defaultReadObject();
    if (this.offset.q() == 0)
      return; 
    throw new InvalidObjectException("Fractional offset is invalid.");
  }
  
  public String a(d paramd, Locale paramLocale) {
    return paramd.a() ? this.offset.toString() : this.offset.a();
  }
  
  public List<p> a(a parama, g paramg) {
    return Collections.singletonList(this.offset);
  }
  
  public l a(o paramo) {
    return this;
  }
  
  public q a(f paramf) {
    return null;
  }
  
  public boolean a() {
    return false;
  }
  
  public p b() {
    return this.offset;
  }
  
  public p b(f paramf) {
    return this.offset;
  }
  
  public q b(a parama, g paramg) {
    return null;
  }
  
  public m c() {
    return this;
  }
  
  public p c(a parama, g paramg) {
    return this.offset;
  }
  
  public boolean c(f paramf) {
    return false;
  }
  
  public k d() {
    return this.offset;
  }
  
  public boolean d(a parama, g paramg) {
    return false;
  }
  
  public o e() {
    return l.e;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof j) {
      paramObject = paramObject;
      return this.offset.equals(((j)paramObject).offset);
    } 
    return false;
  }
  
  public boolean f() {
    return true;
  }
  
  public int hashCode() {
    return this.offset.hashCode();
  }
  
  public boolean isEmpty() {
    return true;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(32);
    stringBuilder.append('[');
    stringBuilder.append(j.class.getName());
    stringBuilder.append(':');
    stringBuilder.append(this.offset);
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/tz/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */