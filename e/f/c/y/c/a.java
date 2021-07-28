package e.f.c.y.c;

import e.f.c.p;

public final class a extends p {
  private final float c;
  
  a(float paramFloat1, float paramFloat2, float paramFloat3) {
    super(paramFloat1, paramFloat2);
    this.c = paramFloat3;
  }
  
  boolean a(float paramFloat1, float paramFloat2, float paramFloat3) {
    if (Math.abs(paramFloat2 - b()) <= paramFloat1 && Math.abs(paramFloat3 - a()) <= paramFloat1) {
      paramFloat1 = Math.abs(paramFloat1 - this.c);
      return (paramFloat1 <= 1.0F || paramFloat1 <= this.c);
    } 
    return false;
  }
  
  a b(float paramFloat1, float paramFloat2, float paramFloat3) {
    return new a((a() + paramFloat2) / 2.0F, (b() + paramFloat1) / 2.0F, (this.c + paramFloat3) / 2.0F);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/y/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */