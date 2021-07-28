package b.e.b.k.m;

import b.e.b.k.a;
import b.e.b.k.e;
import java.util.Iterator;

class i extends m {
  public i(e parame) {
    super(parame);
  }
  
  private void a(f paramf) {
    this.h.k.add(paramf);
    paramf.l.add(this.h);
  }
  
  void a() {
    e e = this.b;
    if (e instanceof a) {
      j j1;
      this.h.b = true;
      a a = (a)e;
      int k = a.I();
      boolean bool = a.H();
      boolean bool1 = false;
      boolean bool2 = false;
      boolean bool3 = false;
      int j = 0;
      if (k != 0) {
        l l;
        if (k != 1) {
          if (k != 2) {
            if (k != 3)
              return; 
            this.h.e = f.a.i;
            while (j < ((b.e.b.k.i)a).h0) {
              e e1 = ((b.e.b.k.i)a).g0[j];
              if (bool || e1.y() != 8) {
                f f = e1.e.i;
                f.k.add(this.h);
                this.h.l.add(f);
              } 
              j++;
            } 
          } else {
            this.h.e = f.a.h;
            for (j = bool1; j < ((b.e.b.k.i)a).h0; j++) {
              e e1 = ((b.e.b.k.i)a).g0[j];
              if (bool || e1.y() != 8) {
                f f = e1.e.h;
                f.k.add(this.h);
                this.h.l.add(f);
              } 
            } 
          } 
          a(this.b.e.h);
          l = this.b.e;
        } else {
          this.h.e = f.a.g;
          for (j = bool2; j < ((b.e.b.k.i)l).h0; j++) {
            e e1 = ((b.e.b.k.i)l).g0[j];
            if (bool || e1.y() != 8) {
              f f = e1.d.i;
              f.k.add(this.h);
              this.h.l.add(f);
            } 
          } 
          a(this.b.d.h);
          j1 = this.b.d;
        } 
      } else {
        this.h.e = f.a.f;
        for (j = bool3; j < ((b.e.b.k.i)j1).h0; j++) {
          e e1 = ((b.e.b.k.i)j1).g0[j];
          if (bool || e1.y() != 8) {
            f f = e1.d.h;
            f.k.add(this.h);
            this.h.l.add(f);
          } 
        } 
        a(this.b.d.h);
        j1 = this.b.d;
      } 
      a(j1.i);
    } 
  }
  
  public void a(d paramd) {
    Object object1;
    Object object2;
    a a = (a)this.b;
    int j = a.I();
    Iterator<f> iterator = this.h.l.iterator();
    byte b1 = -1;
    byte b = 0;
    while (true) {
      while (true)
        break; 
      if (b < SYNTHETIC_LOCAL_VARIABLE_4) {
        object1 = SYNTHETIC_LOCAL_VARIABLE_4;
        object2 = SYNTHETIC_LOCAL_VARIABLE_5;
      } 
    } 
    if (j == 0 || j == 2) {
      this.h.a(object2 + a.J());
      return;
    } 
    this.h.a(object1 + a.J());
  }
  
  public void b() {
    e e = this.b;
    if (e instanceof a) {
      int j = ((a)e).I();
      if (j == 0 || j == 1) {
        this.b.q(this.h.g);
        return;
      } 
      this.b.r(this.h.g);
      return;
    } 
  }
  
  void c() {
    this.c = null;
    this.h.a();
  }
  
  boolean f() {
    return false;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/e/b/k/m/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */