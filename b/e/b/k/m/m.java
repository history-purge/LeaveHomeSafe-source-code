package b.e.b.k.m;

import b.e.b.k.d;
import b.e.b.k.e;

public abstract class m implements d {
  public int a;
  
  e b;
  
  k c;
  
  protected e.b d;
  
  g e = new g(this);
  
  public int f = 0;
  
  boolean g = false;
  
  public f h = new f(this);
  
  public f i = new f(this);
  
  protected b j = b.c;
  
  public m(e parame) {
    this.b = parame;
  }
  
  private void b(int paramInt1, int paramInt2) {
    int j = this.a;
    int i = paramInt2;
    if (j != 0) {
      if (j != 1) {
        if (j != 2) {
          l l;
          j j1;
          if (j != 3)
            return; 
          e e2 = this.b;
          j j2 = e2.d;
          e.b b2 = j2.d;
          e.b b1 = e.b.e;
          if (b2 == b1 && j2.a == 3) {
            l l1 = e2.e;
            if (l1.d == b1 && l1.a == 3)
              return; 
          } 
          e e1 = this.b;
          if (paramInt1 == 0) {
            l = e1.e;
          } else {
            j1 = ((e)l).d;
          } 
          if (j1.e.j) {
            float f1 = this.b.h();
            if (paramInt1 == 1) {
              paramInt1 = (int)(j1.e.g / f1 + 0.5F);
            } else {
              paramInt1 = (int)(f1 * j1.e.g + 0.5F);
            } 
            this.e.a(paramInt1);
            return;
          } 
        } else {
          e e1 = this.b.s();
          if (e1 != null) {
            j j1;
            l l;
            if (paramInt1 == 0) {
              j1 = e1.d;
            } else {
              l = ((e)j1).e;
            } 
            if (l.e.j) {
              float f1;
              e e2 = this.b;
              if (paramInt1 == 0) {
                f1 = e2.o;
              } else {
                f1 = e2.r;
              } 
              i = (int)(l.e.g * f1 + 0.5F);
            } else {
              return;
            } 
          } else {
            return;
          } 
          g g2 = this.e;
          paramInt1 = a(i, paramInt1);
        } 
      } else {
        paramInt1 = a(this.e.m, paramInt1);
        g g2 = this.e;
        paramInt1 = Math.min(paramInt1, paramInt2);
        g2.a(paramInt1);
      } 
      return;
    } 
    g g1 = this.e;
    paramInt1 = a(i, paramInt1);
  }
  
  protected final int a(int paramInt1, int paramInt2) {
    if (paramInt2 == 0) {
      e e1 = this.b;
      int i = e1.n;
      paramInt2 = Math.max(e1.m, paramInt1);
      if (i > 0)
        paramInt2 = Math.min(i, paramInt1); 
      i = paramInt1;
      if (paramInt2 != paramInt1)
        return paramInt2; 
    } else {
      e e1 = this.b;
      int i = e1.q;
      paramInt2 = Math.max(e1.p, paramInt1);
      if (i > 0)
        paramInt2 = Math.min(i, paramInt1); 
      i = paramInt1;
      if (paramInt2 != paramInt1)
        return paramInt2; 
    } 
    return SYNTHETIC_LOCAL_VARIABLE_3;
  }
  
  protected final f a(d paramd) {
    d d1 = paramd.d;
    if (d1 == null)
      return null; 
    e e1 = d1.b;
    d.b b1 = d1.c;
    int i = a.a[b1.ordinal()];
    if (i != 1) {
      l l;
      if (i != 2) {
        if (i != 3) {
          if (i != 4) {
            if (i != 5)
              return null; 
            l = e1.e;
          } else {
            return ((e)l).e.k;
          } 
        } else {
          l = ((e)l).e;
          return l.h;
        } 
      } else {
        j = ((e)l).d;
      } 
      return j.i;
    } 
    j j = ((e)j).d;
    return j.h;
  }
  
  protected final f a(d paramd, int paramInt) {
    j j;
    l l;
    d d1 = paramd.d;
    if (d1 == null)
      return null; 
    e e1 = d1.b;
    if (paramInt == 0) {
      j = e1.d;
    } else {
      l = ((e)j).e;
    } 
    d.b b1 = paramd.d.c;
    paramInt = a.a[b1.ordinal()];
    if (paramInt != 1)
      if (paramInt != 2) {
        if (paramInt != 3)
          return (paramInt != 5) ? null : l.i; 
      } else {
        return l.i;
      }  
    return l.h;
  }
  
  abstract void a();
  
  public void a(d paramd) {}
  
  protected void a(d paramd, d paramd1, d paramd2, int paramInt) {
    paramd = a(paramd1);
    f f1 = a(paramd2);
    if (((f)paramd).j) {
      if (!f1.j)
        return; 
      int j = ((f)paramd).g + paramd1.a();
      int i = f1.g - paramd2.a();
      int n = i - j;
      if (!this.e.j && this.d == e.b.e)
        b(paramInt, n); 
      g g1 = this.e;
      if (!g1.j)
        return; 
      if (g1.g == n) {
        this.h.a(j);
        paramd = this.i;
      } else {
        float f2;
        e e1 = this.b;
        if (paramInt == 0) {
          f2 = e1.k();
        } else {
          f2 = e1.u();
        } 
        paramInt = j;
        if (paramd == f1) {
          paramInt = ((f)paramd).g;
          i = f1.g;
          f2 = 0.5F;
        } 
        j = this.e.g;
        this.h.a((int)(paramInt + 0.5F + (i - paramInt - j) * f2));
        paramd = this.i;
        i = this.h.g + this.e.g;
      } 
      paramd.a(i);
      return;
    } 
  }
  
  protected final void a(f paramf1, f paramf2, int paramInt) {
    paramf1.l.add(paramf2);
    paramf1.f = paramInt;
    paramf2.k.add(paramf1);
  }
  
  protected final void a(f paramf1, f paramf2, int paramInt, g paramg) {
    paramf1.l.add(paramf2);
    paramf1.l.add(this.e);
    paramf1.h = paramInt;
    paramf1.i = paramg;
    paramf2.k.add(paramf1);
    paramg.k.add(paramf1);
  }
  
  abstract void b();
  
  protected void b(d paramd) {}
  
  abstract void c();
  
  protected void c(d paramd) {}
  
  public long d() {
    g g1 = this.e;
    return g1.j ? g1.g : 0L;
  }
  
  public boolean e() {
    return this.g;
  }
  
  abstract boolean f();
  
  enum b {
    c, d, e, f;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/e/b/k/m/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */