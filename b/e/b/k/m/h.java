package b.e.b.k.m;

import b.e.b.k.e;
import b.e.b.k.g;

class h extends m {
  public h(e parame) {
    super(parame);
    parame.d.c();
    parame.e.c();
    this.f = ((g)parame).H();
  }
  
  private void a(f paramf) {
    this.h.k.add(paramf);
    paramf.l.add(this.h);
  }
  
  void a() {
    g g = (g)this.b;
    int i = g.I();
    int j = g.J();
    g.K();
    if (g.H() == 1) {
      j j2;
      f f = this.h;
      if (i != -1) {
        f.l.add(this.b.K.d.h);
        this.b.K.d.h.k.add(this.h);
        f = this.h;
      } else if (j != -1) {
        f.l.add(this.b.K.d.i);
        this.b.K.d.i.k.add(this.h);
        f = this.h;
        i = -j;
      } else {
        f.b = true;
        f.l.add(this.b.K.d.i);
        this.b.K.d.i.k.add(this.h);
        a(this.b.d.h);
        j2 = this.b.d;
      } 
      ((f)j2).f = i;
    } else {
      f f = this.h;
      if (i != -1) {
        f.l.add(this.b.K.e.h);
        this.b.K.e.h.k.add(this.h);
        f = this.h;
      } else if (j != -1) {
        f.l.add(this.b.K.e.i);
        this.b.K.e.i.k.add(this.h);
        f = this.h;
        i = -j;
      } else {
        f.b = true;
        f.l.add(this.b.K.e.i);
        this.b.K.e.i.k.add(this.h);
        a(this.b.e.h);
        l = this.b.e;
      } 
      ((f)l).f = i;
      a(this.b.e.h);
      l l = this.b.e;
    } 
    a(this.b.d.h);
    j j1 = this.b.d;
  }
  
  public void a(d paramd) {
    paramd = this.h;
    if (!((f)paramd).c)
      return; 
    if (((f)paramd).j)
      return; 
    paramd = ((f)paramd).l.get(0);
    g g = (g)this.b;
    int i = (int)(((f)paramd).g * g.K() + 0.5F);
    this.h.a(i);
  }
  
  public void b() {
    if (((g)this.b).H() == 1) {
      this.b.q(this.h.g);
      return;
    } 
    this.b.r(this.h.g);
  }
  
  void c() {
    this.h.a();
  }
  
  boolean f() {
    return false;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/e/b/k/m/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */