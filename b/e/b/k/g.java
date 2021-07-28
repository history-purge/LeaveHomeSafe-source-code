package b.e.b.k;

import b.e.b.d;
import b.e.b.i;

public class g extends e {
  protected float g0 = -1.0F;
  
  protected int h0 = -1;
  
  protected int i0 = -1;
  
  private d j0 = this.z;
  
  private int k0;
  
  public g() {
    int i = 0;
    this.k0 = 0;
    this.H.clear();
    this.H.add(this.j0);
    int j = this.G.length;
    while (i < j) {
      this.G[i] = this.j0;
      i++;
    } 
  }
  
  public int H() {
    return this.k0;
  }
  
  public int I() {
    return this.h0;
  }
  
  public int J() {
    return this.i0;
  }
  
  public float K() {
    return this.g0;
  }
  
  public d a(d.b paramb) {
    switch (a.a[paramb.ordinal()]) {
      default:
        throw new AssertionError(paramb.name());
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
        return null;
      case 3:
      case 4:
        if (this.k0 == 0)
          return this.j0; 
      case 1:
      case 2:
        break;
    } 
    if (this.k0 == 1)
      return this.j0; 
  }
  
  public void a(d paramd) {
    boolean bool;
    f f = (f)s();
    if (f == null)
      return; 
    d d1 = f.a(d.b.d);
    d d2 = f.a(d.b.f);
    e e1 = this.K;
    if (e1 != null && e1.J[0] == e.b.d) {
      bool = true;
    } else {
      bool = false;
    } 
    if (this.k0 == 0) {
      d1 = f.a(d.b.e);
      d2 = f.a(d.b.g);
      e e2 = this.K;
      if (e2 != null && e2.J[1] == e.b.d) {
        bool = true;
      } else {
        bool = false;
      } 
    } 
    if (this.h0 != -1) {
      i i = paramd.a(this.j0);
      paramd.a(i, paramd.a(d1), this.h0, 8);
      if (bool) {
        paramd.b(paramd.a(d2), i, 0, 5);
        return;
      } 
    } else {
      i i;
      if (this.i0 != -1) {
        i i1 = paramd.a(this.j0);
        i = paramd.a(d2);
        paramd.a(i1, i, -this.i0, 8);
        if (bool) {
          paramd.b(i1, paramd.a(d1), 0, 5);
          paramd.b(i, i1, 0, 5);
          return;
        } 
      } else if (this.g0 != -1.0F) {
        paramd.a(d.a(paramd, paramd.a(this.j0), paramd.a(i), this.g0));
      } 
    } 
  }
  
  public void c(d paramd) {
    if (s() == null)
      return; 
    int i = paramd.b(this.j0);
    if (this.k0 == 1) {
      q(i);
      r(0);
      h(s().j());
      p(0);
      return;
    } 
    q(0);
    r(i);
    p(s().z());
    h(0);
  }
  
  public boolean c() {
    return true;
  }
  
  public void e(float paramFloat) {
    if (paramFloat > -1.0F) {
      this.g0 = paramFloat;
      this.h0 = -1;
      this.i0 = -1;
    } 
  }
  
  public void s(int paramInt) {
    if (paramInt > -1) {
      this.g0 = -1.0F;
      this.h0 = paramInt;
      this.i0 = -1;
    } 
  }
  
  public void t(int paramInt) {
    if (paramInt > -1) {
      this.g0 = -1.0F;
      this.h0 = -1;
      this.i0 = paramInt;
    } 
  }
  
  public void u(int paramInt) {
    d d1;
    if (this.k0 == paramInt)
      return; 
    this.k0 = paramInt;
    this.H.clear();
    if (this.k0 == 1) {
      d1 = this.y;
    } else {
      d1 = this.z;
    } 
    this.j0 = d1;
    this.H.add(this.j0);
    int i = this.G.length;
    for (paramInt = 0; paramInt < i; paramInt++)
      this.G[paramInt] = this.j0; 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/e/b/k/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */