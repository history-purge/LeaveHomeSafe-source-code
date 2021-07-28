package e.d.c.x.h;

import e.d.b.o;
import e.d.c.x.d;
import java.util.Calendar;
import java.util.Date;

public class f extends c {
  long c;
  
  long d;
  
  long e;
  
  long f;
  
  int g;
  
  int h;
  
  long i;
  
  long j;
  
  long k;
  
  long l;
  
  long m;
  
  long n;
  
  long o;
  
  public f(o paramo, a parama) {
    super(paramo, parama);
    this.c = paramo.i();
    this.d = paramo.i();
    this.e = paramo.i();
    this.f = paramo.i();
    this.g = paramo.d();
    this.h = paramo.c();
    paramo.a(10L);
    paramo.d();
    paramo.d();
    paramo.d();
    paramo.d();
    paramo.d();
    paramo.d();
    paramo.d();
    paramo.d();
    paramo.d();
    this.i = paramo.i();
    this.j = paramo.i();
    this.k = paramo.i();
    this.l = paramo.i();
    this.m = paramo.i();
    this.n = paramo.i();
    this.o = paramo.i();
  }
  
  public void a(d paramd) {
    Calendar calendar = Calendar.getInstance();
    calendar.set(1904, 0, 1, 0, 0, 0);
    long l = calendar.getTime().getTime();
    paramd.a(256, new Date(this.c * 1000L + l));
    paramd.a(257, new Date(this.d * 1000L + l));
    this.f /= this.e;
    paramd.a(259, this.f);
    paramd.a(258, this.e);
    int i = this.g;
    double d1 = ((0xFFFF0000 & i) >> 16);
    double d2 = (i & 0xFFFF);
    double d3 = Math.pow(2.0D, 4.0D);
    Double.isNaN(d2);
    d2 /= d3;
    Double.isNaN(d1);
    paramd.a(260, d1 + d2);
    i = this.h;
    d1 = ((0xFF00 & i) >> 8);
    d2 = (i & 0xFF);
    d3 = Math.pow(2.0D, 2.0D);
    Double.isNaN(d2);
    d2 /= d3;
    Double.isNaN(d1);
    paramd.a(261, d1 + d2);
    paramd.a(264, this.i);
    paramd.a(265, this.j);
    paramd.a(266, this.k);
    paramd.a(267, this.l);
    paramd.a(268, this.m);
    paramd.a(269, this.n);
    paramd.a(270, this.o);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/x/h/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */