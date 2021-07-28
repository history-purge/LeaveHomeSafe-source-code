package net.time4j.history;

import java.io.DataInput;
import java.io.DataOutput;
import net.time4j.d1.a0;
import net.time4j.d1.p;
import net.time4j.f0;

public final class g {
  static final g d = new g();
  
  private static final h e = h.a(j.d, 1, 1, 1);
  
  private static final h f = h.a(j.c, 38, 1, 1);
  
  private static final f0 g = f0.a(2000, 1);
  
  private final j a;
  
  private final f0 b;
  
  private final f0 c;
  
  private g() {
    this.a = null;
    this.b = (f0)f0.I().j();
    this.c = (f0)f0.I().i();
  }
  
  private g(j paramj, f0 paramf01, f0 paramf02) {
    StringBuilder stringBuilder;
    if (paramj.compareTo(j.d) > 0) {
      if (!paramf02.c((net.time4j.d1.g)paramf01)) {
        this.a = paramj;
        this.b = paramf01;
        this.c = paramf02;
        return;
      } 
      stringBuilder = new StringBuilder();
      stringBuilder.append("End before start: ");
      stringBuilder.append(paramf01);
      stringBuilder.append("/");
      stringBuilder.append(paramf02);
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
    throw new UnsupportedOperationException(stringBuilder.name());
  }
  
  static g a(DataInput paramDataInput) {
    if (paramDataInput.readByte() == Byte.MAX_VALUE) {
      j j1 = j.valueOf(paramDataInput.readUTF());
      long l1 = paramDataInput.readLong();
      long l2 = paramDataInput.readLong();
      return new g(j1, (f0)g.b((p)a0.e, l1), (f0)g.b((p)a0.e, l2));
    } 
    return d;
  }
  
  public static g a(f0 paramf0) {
    return b((f0)f0.I().j(), paramf0);
  }
  
  public static g a(f0 paramf01, f0 paramf02) {
    return new g(j.g, paramf01, paramf02);
  }
  
  public static g b(f0 paramf0) {
    return c((f0)f0.I().j(), paramf0);
  }
  
  public static g b(f0 paramf01, f0 paramf02) {
    return new g(j.f, paramf01, paramf02);
  }
  
  public static g c(f0 paramf01, f0 paramf02) {
    return new g(j.e, paramf01, paramf02);
  }
  
  j a(h paramh, f0 paramf0) {
    return (this.a == null || paramf0.c((net.time4j.d1.g)this.b) || paramf0.b((net.time4j.d1.g)this.c)) ? ((paramh.a(e) < 0) ? j.c : j.d) : ((this.a == j.e && paramh.a(f) < 0) ? j.c : this.a);
  }
  
  void a(DataOutput paramDataOutput) {
    if (this == d) {
      paramDataOutput.writeByte(0);
      return;
    } 
    paramDataOutput.writeByte(127);
    paramDataOutput.writeUTF(this.a.name());
    paramDataOutput.writeLong(((Long)this.b.e((p)a0.e)).longValue());
    paramDataOutput.writeLong(((Long)this.c.e((p)a0.e)).longValue());
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof g) {
      paramObject = paramObject;
      g g1 = d;
      return (this == g1) ? ((paramObject == g1)) : ((this.a == ((g)paramObject).a && this.b.equals(((g)paramObject).b) && this.c.equals(((g)paramObject).c)));
    } 
    return false;
  }
  
  public int hashCode() {
    return this.a.hashCode() * 17 + this.b.hashCode() * 31 + this.c.hashCode() * 37;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append('[');
    if (this == d) {
      stringBuilder.append("default");
    } else {
      stringBuilder.append("era->");
      stringBuilder.append(this.a);
      stringBuilder.append(",start->");
      stringBuilder.append(this.b);
      stringBuilder.append(",end->");
      stringBuilder.append(this.c);
    } 
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/history/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */