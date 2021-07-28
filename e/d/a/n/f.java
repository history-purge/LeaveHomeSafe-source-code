package e.d.a.n;

import e.d.b.n;
import java.io.IOException;

public class f {
  private int a;
  
  private int b;
  
  private byte c;
  
  private e d;
  
  private byte e;
  
  private byte f;
  
  private byte g;
  
  public f(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte.length == 13) {
      n n = new n(paramArrayOfbyte);
      try {
        this.a = n.d();
        this.b = n.d();
        this.c = n.f();
        byte b = n.f();
        e e1 = e.f(b);
        if (e1 != null) {
          this.d = e1;
          this.e = n.f();
          this.f = n.f();
          this.g = n.f();
          return;
        } 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected PNG color type: ");
        stringBuilder.append(b);
        throw new h(stringBuilder.toString());
      } catch (IOException iOException) {
        throw new h(iOException);
      } 
    } 
    throw new h("PNG header chunk must have 13 data bytes");
  }
  
  public byte a() {
    return this.c;
  }
  
  public e b() {
    return this.d;
  }
  
  public byte c() {
    return this.e;
  }
  
  public byte d() {
    return this.f;
  }
  
  public int e() {
    return this.b;
  }
  
  public int f() {
    return this.a;
  }
  
  public byte g() {
    return this.g;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/a/n/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */