package e.f.c.w.r.g.e;

import e.f.c.f;

final class p extends q {
  private final int b;
  
  private final int c;
  
  p(int paramInt1, int paramInt2, int paramInt3) {
    super(paramInt1);
    if (paramInt2 >= 0 && paramInt2 <= 10 && paramInt3 >= 0 && paramInt3 <= 10) {
      this.b = paramInt2;
      this.c = paramInt3;
      return;
    } 
    throw f.a();
  }
  
  int b() {
    return this.b;
  }
  
  int c() {
    return this.c;
  }
  
  boolean d() {
    return (this.b == 10);
  }
  
  boolean e() {
    return (this.c == 10);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/w/r/g/e/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */