package e.d.c.y.g;

import e.d.b.o;
import e.d.c.y.e;

public class g extends d {
  long e;
  
  long f;
  
  long g;
  
  long h;
  
  String i;
  
  public g(o paramo, b paramb) {
    super(paramo, paramb);
    if (this.d == 1) {
      this.e = paramo.e();
      this.f = paramo.e();
      this.g = paramo.d();
      l = paramo.e();
    } else {
      this.e = paramo.i();
      this.f = paramo.i();
      this.g = paramo.i();
      l = paramo.i();
    } 
    this.h = l;
    short s = paramo.c();
    this.i = new String(new char[] { (char)(((s & 0x7C00) >> 10) + 96), (char)(((s & 0x3E0) >> 5) + 96), (char)((s & 0x1F) + 96) });
    e.c = Long.valueOf(this.e);
    e.d = Long.valueOf(this.f);
    e.b = Long.valueOf(this.g);
    long l = this.h;
    e.e = this.i;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/y/g/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */