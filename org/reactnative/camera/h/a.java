package org.reactnative.camera.h;

public class a {
  private int a;
  
  private int b;
  
  private int c;
  
  private int d;
  
  public a(int paramInt1, int paramInt2) {
    this(paramInt1, paramInt2, 0);
  }
  
  public a(int paramInt1, int paramInt2, int paramInt3) {
    this(paramInt1, paramInt2, paramInt3, -1);
  }
  
  public a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt4;
    this.d = paramInt3;
  }
  
  public int a() {
    return this.c;
  }
  
  public int b() {
    return e() ? this.a : this.b;
  }
  
  public int c() {
    return this.d;
  }
  
  public int d() {
    return e() ? this.b : this.a;
  }
  
  public boolean e() {
    return (this.d % 180 == 90);
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject instanceof a) {
      paramObject = paramObject;
      return (paramObject.d() == d() && paramObject.b() == b() && paramObject.a() == a() && paramObject.c() == c());
    } 
    return super.equals(paramObject);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/org/reactnative/camera/h/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */