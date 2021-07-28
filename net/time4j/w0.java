package net.time4j;

import net.time4j.c1.a;
import net.time4j.c1.b;
import net.time4j.d1.n;
import net.time4j.d1.v;

public enum w0 implements n<a>, v<f0> {
  c, d, e, f, g, h, i;
  
  private static final w0[] j;
  
  static {
    j = values();
  }
  
  public static w0 g(int paramInt) {
    if (paramInt >= 1 && paramInt <= 7)
      return j[paramInt - 1]; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Out of range: ");
    stringBuilder.append(paramInt);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public int a() {
    return ordinal() + 1;
  }
  
  public int a(y0 paramy0) {
    int i = paramy0.e().ordinal();
    return (ordinal() + 7 - i) % 7 + 1;
  }
  
  public f0 a(f0 paramf0) {
    return (f0)paramf0.b(f0.x, this);
  }
  
  public boolean a(a parama) {
    return (b.b(parama.getYear(), parama.getMonth(), parama.r()) == a());
  }
  
  public w0 f(int paramInt) {
    return g((ordinal() + paramInt % 7 + 7) % 7 + 1);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/w0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */