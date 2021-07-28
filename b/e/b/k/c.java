package b.e.b.k;

import java.util.ArrayList;

public class c {
  protected e a;
  
  protected e b;
  
  protected e c;
  
  protected e d;
  
  protected e e;
  
  protected e f;
  
  protected e g;
  
  protected ArrayList<e> h;
  
  protected int i;
  
  protected int j;
  
  protected float k = 0.0F;
  
  int l;
  
  int m;
  
  int n;
  
  private int o;
  
  private boolean p = false;
  
  protected boolean q;
  
  protected boolean r;
  
  protected boolean s;
  
  private boolean t;
  
  public c(e parame, int paramInt, boolean paramBoolean) {
    this.a = parame;
    this.o = paramInt;
    this.p = paramBoolean;
  }
  
  private static boolean a(e parame, int paramInt) {
    if (parame.y() != 8 && parame.J[paramInt] == e.b.e) {
      int[] arrayOfInt = parame.l;
      if (arrayOfInt[paramInt] == 0 || arrayOfInt[paramInt] == 3)
        return true; 
    } 
    return false;
  }
  
  private void b() {
    int i = this.o * 2;
    e e1 = this.a;
    boolean bool3 = false;
    e e2 = e1;
    boolean bool1 = false;
    while (!bool1) {
      this.i++;
      e[] arrayOfE = e1.e0;
      int j = this.o;
      e e3 = null;
      arrayOfE[j] = null;
      e1.d0[j] = null;
      if (e1.y() != 8) {
        this.l++;
        if (e1.b(this.o) != e.b.e)
          this.m += e1.c(this.o); 
        this.m += e1.G[i].a();
        j = this.m;
        d[] arrayOfD = e1.G;
        int k = i + 1;
        this.m = j + arrayOfD[k].a();
        this.n += e1.G[i].a();
        this.n += e1.G[k].a();
        if (this.b == null)
          this.b = e1; 
        this.d = e1;
        e.b[] arrayOfB = e1.J;
        j = this.o;
        if (arrayOfB[j] == e.b.e) {
          int[] arrayOfInt = e1.l;
          if (arrayOfInt[j] == 0 || arrayOfInt[j] == 3 || arrayOfInt[j] == 2) {
            this.j++;
            float[] arrayOfFloat = e1.c0;
            j = this.o;
            float f1 = arrayOfFloat[j];
            if (f1 > 0.0F)
              this.k += arrayOfFloat[j]; 
            if (a(e1, this.o)) {
              if (f1 < 0.0F) {
                this.q = true;
              } else {
                this.r = true;
              } 
              if (this.h == null)
                this.h = new ArrayList<e>(); 
              this.h.add(e1);
            } 
            if (this.f == null)
              this.f = e1; 
            e e4 = this.g;
            if (e4 != null)
              e4.d0[this.o] = e1; 
            this.g = e1;
          } 
          if (this.o == 0) {
            if (e1.j == 0 && e1.m == 0)
              j = e1.n; 
          } else if (e1.k == 0 && e1.p == 0) {
            j = e1.q;
          } 
          float f = e1.N;
        } 
      } 
      if (e2 != e1)
        e2.e0[this.o] = e1; 
      d d = (e1.G[i + 1]).d;
      e2 = e3;
      if (d != null) {
        e e4 = d.b;
        d[] arrayOfD = e4.G;
        e2 = e3;
        if ((arrayOfD[i]).d != null)
          if ((arrayOfD[i]).d.b != e1) {
            e2 = e3;
          } else {
            e2 = e4;
          }  
      } 
      if (e2 == null) {
        e2 = e1;
        bool1 = true;
      } 
      e3 = e1;
      e1 = e2;
      e2 = e3;
    } 
    e2 = this.b;
    if (e2 != null)
      this.m -= e2.G[i].a(); 
    e2 = this.d;
    if (e2 != null)
      this.m -= e2.G[i + 1].a(); 
    this.c = e1;
    if (this.o == 0 && this.p) {
      e1 = this.c;
    } else {
      e1 = this.a;
    } 
    this.e = e1;
    boolean bool2 = bool3;
    if (this.r) {
      bool2 = bool3;
      if (this.q)
        bool2 = true; 
    } 
    this.s = bool2;
  }
  
  public void a() {
    if (!this.t)
      b(); 
    this.t = true;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/e/b/k/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */