package net.time4j.tz;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.List;
import net.time4j.c1.a;
import net.time4j.c1.f;
import net.time4j.c1.g;

final class c extends l {
  private static final long serialVersionUID = 1738909257417361021L;
  
  private final transient k v;
  
  private final transient m w;
  
  private final transient o x;
  
  c(k paramk, m paramm) {
    this(paramk, paramm, l.e);
  }
  
  c(k paramk, m paramm, o paramo) {
    if (paramk != null) {
      if (!(paramk instanceof p) || paramm.isEmpty()) {
        if (paramm != null) {
          if (paramo != null) {
            this.v = paramk;
            this.w = paramm;
            this.x = paramo;
            return;
          } 
          throw new NullPointerException("Missing transition strategy.");
        } 
        throw new NullPointerException("Missing timezone history.");
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Fixed zonal offset can't be combined with offset transitions: ");
      stringBuilder.append(paramk.a());
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
    throw new NullPointerException("Missing timezone id.");
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) {
    throw new InvalidObjectException("Serialization proxy required.");
  }
  
  private Object writeReplace() {
    return new SPX(this, 14);
  }
  
  public l a(o paramo) {
    return (this.x == paramo) ? this : new c(this.v, this.w, paramo);
  }
  
  public p b(f paramf) {
    q q = this.w.a(paramf);
    return (q == null) ? this.w.b() : p.f(q.r());
  }
  
  public m c() {
    return this.w;
  }
  
  public p c(a parama, g paramg) {
    List<p> list = this.w.a(parama, paramg);
    return (list.size() == 1) ? list.get(0) : p.f(this.w.b(parama, paramg).r());
  }
  
  public boolean c(f paramf) {
    q q1 = this.w.a(paramf);
    boolean bool = false;
    if (q1 == null)
      return false; 
    int i = q1.a();
    if (i > 0)
      return true; 
    if (i < 0)
      return false; 
    if (!this.w.a())
      return false; 
    f f1 = i.a(q1.b(), 0);
    q q2 = this.w.a(f1);
    if (q2 == null)
      return false; 
    if (q2.q() == q1.q()) {
      if (q2.a() < 0)
        bool = true; 
      return bool;
    } 
    return c(f1);
  }
  
  public k d() {
    return this.v;
  }
  
  public boolean d(a parama, g paramg) {
    q q = this.w.b(parama, paramg);
    return (q != null && q.s());
  }
  
  public o e() {
    return this.x;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof c) {
      paramObject = paramObject;
      return (this.v.a().equals(((c)paramObject).v.a()) && this.w.equals(((c)paramObject).w) && this.x.equals(((c)paramObject).x));
    } 
    return false;
  }
  
  public boolean f() {
    return this.w.isEmpty();
  }
  
  public int hashCode() {
    return this.v.a().hashCode();
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(32);
    stringBuilder.append('[');
    stringBuilder.append(c.class.getName());
    stringBuilder.append(':');
    stringBuilder.append(this.v.a());
    stringBuilder.append(",history={");
    stringBuilder.append(this.w);
    stringBuilder.append("},strategy=");
    stringBuilder.append(this.x);
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/tz/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */