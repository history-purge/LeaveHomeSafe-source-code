package net.time4j.tz.model;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.util.List;
import net.time4j.c1.a;
import net.time4j.c1.f;
import net.time4j.c1.g;
import net.time4j.tz.p;
import net.time4j.tz.q;

final class b extends l {
  private static final long serialVersionUID = 1749643877954103721L;
  
  private final transient int c;
  
  private final transient a d;
  
  private final transient j e;
  
  private final transient q f;
  
  private transient int g = 0;
  
  b(int paramInt, List<q> paramList, List<d> paramList1, boolean paramBoolean1, boolean paramBoolean2) {
    this.c = paramInt;
    this.d = new a(paramList, paramBoolean1, paramBoolean2);
    this.f = this.d.c();
    this.e = new j(this.f, paramList1, paramBoolean1);
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) {
    throw new InvalidObjectException("Serialization proxy required.");
  }
  
  private Object writeReplace() {
    return new SPX(this, 127);
  }
  
  public List<p> a(a parama, g paramg) {
    return this.d.b(parama, paramg, this.e);
  }
  
  public q a(f paramf) {
    if (paramf.b() < this.f.b())
      return this.d.a(paramf); 
    q q2 = this.e.a(paramf);
    q q1 = q2;
    if (q2 == null)
      q1 = this.f; 
    return q1;
  }
  
  void a(ObjectOutput paramObjectOutput) {
    this.d.a(this.c, paramObjectOutput);
  }
  
  public boolean a() {
    return (this.e.a() || this.d.a());
  }
  
  public p b() {
    return this.d.b();
  }
  
  public q b(a parama, g paramg) {
    return this.d.a(parama, paramg, this.e);
  }
  
  List<d> c() {
    return this.e.d();
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof b) {
      paramObject = paramObject;
      return (this.d.a(((b)paramObject).d, this.c, ((b)paramObject).c) && this.e.d().equals(((b)paramObject).e.d()));
    } 
    return false;
  }
  
  public int hashCode() {
    int k = this.g;
    int i = k;
    if (k == 0) {
      i = this.d.c(this.c) + this.e.d().hashCode() * 37;
      this.g = i;
    } 
    return i;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(32);
    stringBuilder.append(b.class.getName());
    stringBuilder.append("[transition-count=");
    stringBuilder.append(this.c);
    stringBuilder.append(",hash=");
    stringBuilder.append(hashCode());
    stringBuilder.append(",last-rules=");
    stringBuilder.append(this.e.d());
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/tz/model/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */