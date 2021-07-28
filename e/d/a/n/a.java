package e.d.a.n;

import e.d.b.n;
import java.io.IOException;

public class a {
  private final int a;
  
  private final int b;
  
  private final int c;
  
  private final int d;
  
  private final int e;
  
  private final int f;
  
  private final int g;
  
  private final int h;
  
  public a(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte.length == 32) {
      n n = new n(paramArrayOfbyte);
      try {
        this.a = n.d();
        this.b = n.d();
        this.c = n.d();
        this.d = n.d();
        this.e = n.d();
        this.f = n.d();
        this.g = n.d();
        this.h = n.d();
        return;
      } catch (IOException iOException) {
        throw new h(iOException);
      } 
    } 
    throw new h("Invalid number of bytes");
  }
  
  public int a() {
    return this.g;
  }
  
  public int b() {
    return this.h;
  }
  
  public int c() {
    return this.e;
  }
  
  public int d() {
    return this.f;
  }
  
  public int e() {
    return this.c;
  }
  
  public int f() {
    return this.d;
  }
  
  public int g() {
    return this.a;
  }
  
  public int h() {
    return this.b;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/a/n/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */