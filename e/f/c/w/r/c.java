package e.f.c.w.r;

import e.f.c.p;

public final class c {
  private final int a;
  
  private final int[] b;
  
  private final p[] c;
  
  public c(int paramInt1, int[] paramArrayOfint, int paramInt2, int paramInt3, int paramInt4) {
    this.a = paramInt1;
    this.b = paramArrayOfint;
    float f1 = paramInt2;
    float f2 = paramInt4;
    this.c = new p[] { new p(f1, f2), new p(paramInt3, f2) };
  }
  
  public p[] a() {
    return this.c;
  }
  
  public int[] b() {
    return this.b;
  }
  
  public int c() {
    return this.a;
  }
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof c))
      return false; 
    paramObject = paramObject;
    return (this.a == ((c)paramObject).a);
  }
  
  public int hashCode() {
    return this.a;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/w/r/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */