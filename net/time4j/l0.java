package net.time4j;

import net.time4j.c1.a;
import net.time4j.d1.n;
import net.time4j.d1.v;

public enum l0 implements n<a>, v<f0> {
  c, d, e, f;
  
  private static final l0[] g;
  
  static {
    g = values();
  }
  
  public static l0 f(int paramInt) {
    if (paramInt >= 1 && paramInt <= 4)
      return g[paramInt - 1]; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Out of range: ");
    stringBuilder.append(paramInt);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public int a() {
    return ordinal() + 1;
  }
  
  public f0 a(f0 paramf0) {
    return (f0)paramf0.b(f0.t, this);
  }
  
  public boolean a(a parama) {
    int i = parama.getMonth();
    return (a() == (i - 1) / 3 + 1);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/l0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */