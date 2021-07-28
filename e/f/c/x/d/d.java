package e.f.c.x.d;

final class d {
  private final int a;
  
  private final int b;
  
  private final int c;
  
  private final int d;
  
  private int e = -1;
  
  d(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = paramInt4;
  }
  
  int a() {
    return this.c;
  }
  
  boolean a(int paramInt) {
    return (paramInt != -1 && this.c == paramInt % 3 * 3);
  }
  
  int b() {
    return this.b;
  }
  
  void b(int paramInt) {
    this.e = paramInt;
  }
  
  int c() {
    return this.e;
  }
  
  int d() {
    return this.a;
  }
  
  int e() {
    return this.d;
  }
  
  int f() {
    return this.b - this.a;
  }
  
  boolean g() {
    return a(this.e);
  }
  
  void h() {
    this.e = this.d / 30 * 3 + this.c / 3;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.e);
    stringBuilder.append("|");
    stringBuilder.append(this.d);
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/x/d/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */