package com.horcrux.svg;

import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;

class j {
  private double[] A = new double[] { 0.0D };
  
  private int B;
  
  private int C;
  
  private int D;
  
  private int E;
  
  private int F;
  
  private int G = -1;
  
  private int H = -1;
  
  private int I = -1;
  
  private int J = -1;
  
  private int K = -1;
  
  private int L;
  
  private final float M;
  
  private final float N;
  
  private final float O;
  
  final ArrayList<h> a = new ArrayList<h>();
  
  private final ArrayList<c0[]> b = (ArrayList)new ArrayList<c0>();
  
  private final ArrayList<c0[]> c = (ArrayList)new ArrayList<c0>();
  
  private final ArrayList<c0[]> d = (ArrayList)new ArrayList<c0>();
  
  private final ArrayList<c0[]> e = (ArrayList)new ArrayList<c0>();
  
  private final ArrayList<double[]> f = (ArrayList)new ArrayList<double>();
  
  private final ArrayList<Integer> g = new ArrayList<Integer>();
  
  private final ArrayList<Integer> h = new ArrayList<Integer>();
  
  private final ArrayList<Integer> i = new ArrayList<Integer>();
  
  private final ArrayList<Integer> j = new ArrayList<Integer>();
  
  private final ArrayList<Integer> k = new ArrayList<Integer>();
  
  private final ArrayList<Integer> l = new ArrayList<Integer>();
  
  private final ArrayList<Integer> m = new ArrayList<Integer>();
  
  private final ArrayList<Integer> n = new ArrayList<Integer>();
  
  private final ArrayList<Integer> o = new ArrayList<Integer>();
  
  private final ArrayList<Integer> p = new ArrayList<Integer>();
  
  private double q = 12.0D;
  
  private h r = h.p;
  
  private double s;
  
  private double t;
  
  private double u;
  
  private double v;
  
  private c0[] w = new c0[0];
  
  private c0[] x = new c0[0];
  
  private c0[] y = new c0[0];
  
  private c0[] z = new c0[0];
  
  j(float paramFloat1, float paramFloat2, float paramFloat3) {
    this.M = paramFloat1;
    this.N = paramFloat2;
    this.O = paramFloat3;
    this.b.add(this.w);
    this.c.add(this.x);
    this.d.add(this.y);
    this.e.add(this.z);
    this.f.add(this.A);
    this.g.add(Integer.valueOf(this.G));
    this.h.add(Integer.valueOf(this.H));
    this.i.add(Integer.valueOf(this.I));
    this.j.add(Integer.valueOf(this.J));
    this.k.add(Integer.valueOf(this.K));
    this.a.add(this.r);
    j();
  }
  
  private h a(l paraml) {
    if (this.L > 0)
      return this.r; 
    while (true) {
      paraml = paraml.getParentTextRoot();
      if (paraml != null) {
        h h1 = paraml.k().a();
        if (h1 != h.p)
          return h1; 
        continue;
      } 
      return h.p;
    } 
  }
  
  private static void a(ArrayList<Integer> paramArrayList, int paramInt) {
    while (paramInt >= 0) {
      paramArrayList.set(paramInt, Integer.valueOf(((Integer)paramArrayList.get(paramInt)).intValue() + 1));
      paramInt--;
    } 
  }
  
  private double[] a(ArrayList<c0> paramArrayList) {
    int k = paramArrayList.size();
    double[] arrayOfDouble = new double[k];
    for (int i = 0; i < k; i++)
      arrayOfDouble[i] = ((c0)paramArrayList.get(i)).a; 
    return arrayOfDouble;
  }
  
  private void b(l paraml, ReadableMap paramReadableMap) {
    h h1 = a(paraml);
    this.L++;
    if (paramReadableMap == null) {
      this.a.add(h1);
      return;
    } 
    h1 = new h(paramReadableMap, h1, this.M);
    this.q = h1.a;
    this.a.add(h1);
    this.r = h1;
  }
  
  private c0[] b(ArrayList<c0> paramArrayList) {
    int k = paramArrayList.size();
    c0[] arrayOfC0 = new c0[k];
    for (int i = 0; i < k; i++)
      arrayOfC0[i] = paramArrayList.get(i); 
    return arrayOfC0;
  }
  
  private void j() {
    this.l.add(Integer.valueOf(this.B));
    this.m.add(Integer.valueOf(this.C));
    this.n.add(Integer.valueOf(this.D));
    this.o.add(Integer.valueOf(this.E));
    this.p.add(Integer.valueOf(this.F));
  }
  
  private void k() {
    this.F = 0;
    this.E = 0;
    this.D = 0;
    this.C = 0;
    this.B = 0;
    this.K = -1;
    this.J = -1;
    this.I = -1;
    this.H = -1;
    this.G = -1;
    this.v = 0.0D;
    this.u = 0.0D;
    this.t = 0.0D;
    this.s = 0.0D;
  }
  
  double a(double paramDouble) {
    a(this.g, this.B);
    int i = this.G + 1;
    c0[] arrayOfC0 = this.w;
    if (i < arrayOfC0.length) {
      this.u = 0.0D;
      this.G = i;
      this.s = w.a(arrayOfC0[i], this.N, 0.0D, this.M, this.q);
    } 
    this.s += paramDouble;
    return this.s;
  }
  
  h a() {
    return this.r;
  }
  
  void a(l paraml, ReadableMap paramReadableMap) {
    b(paraml, paramReadableMap);
    j();
  }
  
  void a(boolean paramBoolean, u0 paramu0, ReadableMap paramReadableMap, ArrayList<c0> paramArrayList1, ArrayList<c0> paramArrayList2, ArrayList<c0> paramArrayList3, ArrayList<c0> paramArrayList4, ArrayList<c0> paramArrayList5) {
    if (paramBoolean)
      k(); 
    b(paramu0, paramReadableMap);
    if (paramArrayList1 != null && paramArrayList1.size() != 0) {
      this.B++;
      this.G = -1;
      this.g.add(Integer.valueOf(this.G));
      this.w = b(paramArrayList1);
      this.b.add(this.w);
    } 
    if (paramArrayList2 != null && paramArrayList2.size() != 0) {
      this.C++;
      this.H = -1;
      this.h.add(Integer.valueOf(this.H));
      this.x = b(paramArrayList2);
      this.c.add(this.x);
    } 
    if (paramArrayList3 != null && paramArrayList3.size() != 0) {
      this.D++;
      this.I = -1;
      this.i.add(Integer.valueOf(this.I));
      this.y = b(paramArrayList3);
      this.d.add(this.y);
    } 
    if (paramArrayList4 != null && paramArrayList4.size() != 0) {
      this.E++;
      this.J = -1;
      this.j.add(Integer.valueOf(this.J));
      this.z = b(paramArrayList4);
      this.e.add(this.z);
    } 
    if (paramArrayList5 != null && paramArrayList5.size() != 0) {
      this.F++;
      this.K = -1;
      this.k.add(Integer.valueOf(this.K));
      this.A = a(paramArrayList5);
      this.f.add(this.A);
    } 
    j();
  }
  
  double b() {
    return this.q;
  }
  
  float c() {
    return this.O;
  }
  
  float d() {
    return this.N;
  }
  
  double e() {
    a(this.i, this.D);
    int i = this.I + 1;
    c0[] arrayOfC0 = this.y;
    if (i < arrayOfC0.length) {
      this.I = i;
      double d = w.a(arrayOfC0[i], this.N, 0.0D, this.M, this.q);
      this.u += d;
    } 
    return this.u;
  }
  
  double f() {
    a(this.j, this.E);
    int i = this.J + 1;
    c0[] arrayOfC0 = this.z;
    if (i < arrayOfC0.length) {
      this.J = i;
      double d = w.a(arrayOfC0[i], this.O, 0.0D, this.M, this.q);
      this.v += d;
    } 
    return this.v;
  }
  
  double g() {
    a(this.k, this.F);
    this.K = Math.min(this.K + 1, this.A.length - 1);
    return this.A[this.K];
  }
  
  double h() {
    a(this.h, this.C);
    int i = this.H + 1;
    c0[] arrayOfC0 = this.x;
    if (i < arrayOfC0.length) {
      this.v = 0.0D;
      this.H = i;
      this.t = w.a(arrayOfC0[i], this.O, 0.0D, this.M, this.q);
    } 
    return this.t;
  }
  
  void i() {
    this.a.remove(this.L);
    this.l.remove(this.L);
    this.m.remove(this.L);
    this.n.remove(this.L);
    this.o.remove(this.L);
    this.p.remove(this.L);
    this.L--;
    int i = this.B;
    int k = this.C;
    int m = this.D;
    int n = this.E;
    int i1 = this.F;
    this.r = this.a.get(this.L);
    this.B = ((Integer)this.l.get(this.L)).intValue();
    this.C = ((Integer)this.m.get(this.L)).intValue();
    this.D = ((Integer)this.n.get(this.L)).intValue();
    this.E = ((Integer)this.o.get(this.L)).intValue();
    this.F = ((Integer)this.p.get(this.L)).intValue();
    if (i != this.B) {
      this.b.remove(i);
      this.w = this.b.get(this.B);
      this.G = ((Integer)this.g.get(this.B)).intValue();
    } 
    if (k != this.C) {
      this.c.remove(k);
      this.x = this.c.get(this.C);
      this.H = ((Integer)this.h.get(this.C)).intValue();
    } 
    if (m != this.D) {
      this.d.remove(m);
      this.y = this.d.get(this.D);
      this.I = ((Integer)this.i.get(this.D)).intValue();
    } 
    if (n != this.E) {
      this.e.remove(n);
      this.z = this.e.get(this.E);
      this.J = ((Integer)this.j.get(this.E)).intValue();
    } 
    if (i1 != this.F) {
      this.f.remove(i1);
      this.A = this.f.get(this.F);
      this.K = ((Integer)this.k.get(this.F)).intValue();
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/horcrux/svg/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */