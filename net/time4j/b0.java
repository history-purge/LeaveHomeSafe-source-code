package net.time4j;

import net.time4j.c1.a;
import net.time4j.d1.n;
import net.time4j.d1.v;

public enum b0 implements n<a>, v<f0> {
  c, d, e, f, g, h, i, j, k, l, m, n;
  
  private static final b0[] o;
  
  static {
    o = values();
  }
  
  public static b0 f(int paramInt) {
    if (paramInt >= 1 && paramInt <= 12)
      return o[paramInt - 1]; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Out of range: ");
    stringBuilder.append(paramInt);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public int a() {
    return ordinal() + 1;
  }
  
  public f0 a(f0 paramf0) {
    return (f0)paramf0.b(f0.u, this);
  }
  
  public boolean a(a parama) {
    return (parama.getMonth() == a());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/b0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */