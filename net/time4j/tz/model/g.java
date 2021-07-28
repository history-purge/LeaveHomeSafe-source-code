package net.time4j.tz.model;

import java.io.Serializable;
import net.time4j.b0;
import net.time4j.c1.a;
import net.time4j.c1.b;
import net.time4j.e1.c;
import net.time4j.f;
import net.time4j.f0;

@c("iso8601")
public class g extends d implements Serializable {
  private static final long serialVersionUID = 1L;
  
  private final transient byte g;
  
  protected g(b0 paramb0, int paramInt1, i parami, int paramInt2) {
    super(paramInt1, parami, paramInt2);
    this.g = (byte)paramb0.a();
  }
  
  protected int a(long paramLong) {
    return b.c(b.d(paramLong));
  }
  
  protected int a(a parama) {
    return parama.getYear();
  }
  
  protected String a() {
    return "iso8601";
  }
  
  public final f0 a(int paramInt) {
    return (f0)b(paramInt).b(b(), f.j);
  }
  
  protected boolean a(g paramg) {
    return (e().equals(paramg.e()) && b() == paramg.b() && c() == paramg.c() && d() == paramg.d() && this.g == paramg.g);
  }
  
  protected f0 b(int paramInt) {
    throw null;
  }
  
  byte g() {
    return this.g;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/tz/model/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */