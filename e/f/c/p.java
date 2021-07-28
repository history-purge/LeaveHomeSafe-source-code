package e.f.c;

import e.f.c.s.m.a;

public class p {
  private final float a;
  
  private final float b;
  
  public p(float paramFloat1, float paramFloat2) {
    this.a = paramFloat1;
    this.b = paramFloat2;
  }
  
  public static float a(p paramp1, p paramp2) {
    return a.a(paramp1.a, paramp1.b, paramp2.a, paramp2.b);
  }
  
  private static float a(p paramp1, p paramp2, p paramp3) {
    float f1 = paramp2.a;
    float f2 = paramp2.b;
    return (paramp3.a - f1) * (paramp1.b - f2) - (paramp3.b - f2) * (paramp1.a - f1);
  }
  
  public static void a(p[] paramArrayOfp) {
    p p1;
    p p2;
    p p3;
    float f1 = a(paramArrayOfp[0], paramArrayOfp[1]);
    float f2 = a(paramArrayOfp[1], paramArrayOfp[2]);
    float f3 = a(paramArrayOfp[0], paramArrayOfp[2]);
    if (f2 >= f1 && f2 >= f3) {
      p3 = paramArrayOfp[0];
      p1 = paramArrayOfp[1];
      p2 = paramArrayOfp[2];
    } else if (f3 >= f2 && f3 >= f1) {
      p3 = paramArrayOfp[1];
      p1 = paramArrayOfp[0];
      p2 = paramArrayOfp[2];
    } else {
      p3 = paramArrayOfp[2];
      p1 = paramArrayOfp[0];
      p2 = paramArrayOfp[1];
    } 
    p p5 = p1;
    p p4 = p2;
    if (a(p1, p3, p2) < 0.0F) {
      p4 = p1;
      p5 = p2;
    } 
    paramArrayOfp[0] = p5;
    paramArrayOfp[1] = p3;
    paramArrayOfp[2] = p4;
  }
  
  public final float a() {
    return this.a;
  }
  
  public final float b() {
    return this.b;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject instanceof p) {
      paramObject = paramObject;
      if (this.a == ((p)paramObject).a && this.b == ((p)paramObject).b)
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    return Float.floatToIntBits(this.a) * 31 + Float.floatToIntBits(this.b);
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("(");
    stringBuilder.append(this.a);
    stringBuilder.append(',');
    stringBuilder.append(this.b);
    stringBuilder.append(')');
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */