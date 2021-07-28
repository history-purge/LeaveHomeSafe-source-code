package e.f.c.y.c;

import e.f.c.p;

public final class d extends p {
  private final float c;
  
  private final int d;
  
  d(float paramFloat1, float paramFloat2, float paramFloat3) {
    this(paramFloat1, paramFloat2, paramFloat3, 1);
  }
  
  private d(float paramFloat1, float paramFloat2, float paramFloat3, int paramInt) {
    super(paramFloat1, paramFloat2);
    this.c = paramFloat3;
    this.d = paramInt;
  }
  
  boolean a(float paramFloat1, float paramFloat2, float paramFloat3) {
    if (Math.abs(paramFloat2 - b()) <= paramFloat1 && Math.abs(paramFloat3 - a()) <= paramFloat1) {
      paramFloat1 = Math.abs(paramFloat1 - this.c);
      return (paramFloat1 <= 1.0F || paramFloat1 <= this.c);
    } 
    return false;
  }
  
  d b(float paramFloat1, float paramFloat2, float paramFloat3) {
    int i = this.d;
    int j = i + 1;
    float f1 = i;
    float f2 = a();
    float f3 = j;
    return new d((f1 * f2 + paramFloat2) / f3, (this.d * b() + paramFloat1) / f3, (this.d * this.c + paramFloat3) / f3, j);
  }
  
  int c() {
    return this.d;
  }
  
  public float d() {
    return this.c;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/y/c/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */