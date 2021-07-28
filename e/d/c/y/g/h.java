package e.d.c.y.g;

import e.d.b.o;
import e.d.c.y.d;
import java.util.Calendar;
import java.util.Date;

public class h extends d {
  protected long e;
  
  protected long f;
  
  protected long g;
  
  protected long h;
  
  protected int i;
  
  protected int j;
  
  protected int[] k;
  
  protected long l;
  
  public h(o paramo, b paramb) {
    super(paramo, paramb);
    long l;
    if (this.d == 1) {
      this.e = paramo.e();
      this.f = paramo.e();
      this.g = paramo.i();
      l = paramo.e();
    } else {
      this.e = paramo.i();
      this.f = paramo.i();
      this.g = paramo.i();
      l = paramo.i();
    } 
    this.h = l;
    this.i = paramo.d();
    this.j = paramo.c();
    paramo.a(2L);
    paramo.a(8L);
    this.k = new int[] { paramo.d(), paramo.d(), paramo.d(), paramo.d(), paramo.d(), paramo.d(), paramo.d(), paramo.d(), paramo.d() };
    paramo.a(24L);
    this.l = paramo.i();
  }
  
  public void a(d paramd) {
    Calendar calendar = Calendar.getInstance();
    calendar.set(1904, 0, 1, 0, 0, 0);
    long l = calendar.getTime().getTime();
    paramd.a(256, new Date(this.e * 1000L + l));
    paramd.a(257, new Date(this.f * 1000L + l));
    this.h /= this.g;
    paramd.a(259, this.h);
    paramd.a(258, this.g);
    paramd.a(271, this.k);
    int i = this.i;
    double d1 = ((0xFFFF0000 & i) >> 16);
    double d2 = (i & 0xFFFF);
    double d3 = Math.pow(2.0D, 4.0D);
    Double.isNaN(d2);
    d2 /= d3;
    Double.isNaN(d1);
    paramd.a(260, d1 + d2);
    i = this.j;
    d1 = ((0xFF00 & i) >> 8);
    d2 = (i & 0xFF);
    d3 = Math.pow(2.0D, 2.0D);
    Double.isNaN(d2);
    d2 /= d3;
    Double.isNaN(d1);
    paramd.a(261, d1 + d2);
    paramd.a(270, this.l);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/y/g/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */