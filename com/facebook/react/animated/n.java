package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableMap;

class n extends d {
  private long e;
  
  private boolean f;
  
  private double g;
  
  private double h;
  
  private double i;
  
  private double j;
  
  private boolean k;
  
  private final b l = new b(null);
  
  private double m;
  
  private double n;
  
  private double o;
  
  private double p;
  
  private double q;
  
  private int r;
  
  private int s;
  
  private double t;
  
  n(ReadableMap paramReadableMap) {
    this.l.b = paramReadableMap.getDouble("initialVelocity");
    a(paramReadableMap);
  }
  
  private double a(b paramb) {
    return Math.abs(this.n - paramb.a);
  }
  
  private void a(double paramDouble) {
    if (a())
      return; 
    double d1 = 0.064D;
    if (paramDouble > 0.064D)
      paramDouble = d1; 
    this.q += paramDouble;
    double d3 = this.h;
    d1 = this.i;
    double d2 = this.g;
    paramDouble = -this.j;
    double d6 = d3 / Math.sqrt(d2 * d1) * 2.0D;
    double d7 = Math.sqrt(d2 / d1);
    double d4 = Math.sqrt(1.0D - d6 * d6) * d7;
    d2 = this.n - this.m;
    double d5 = this.q;
    if (d6 < 1.0D) {
      d1 = Math.exp(-d6 * d7 * d5);
      d3 = this.n;
      d6 *= d7;
      paramDouble += d6 * d2;
      d7 = paramDouble / d4;
      double d9 = d5 * d4;
      d5 = Math.sin(d9);
      double d8 = Math.cos(d9);
      paramDouble = d6 * d1 * (Math.sin(d9) * paramDouble / d4 + Math.cos(d9) * d2) - (Math.cos(d9) * paramDouble - d4 * d2 * Math.sin(d9)) * d1;
      d1 = d3 - (d7 * d5 + d8 * d2) * d1;
    } else {
      d3 = Math.exp(-d7 * d5);
      d1 = this.n - ((d7 * d2 + paramDouble) * d5 + d2) * d3;
      paramDouble = d3 * (paramDouble * (d5 * d7 - 1.0D) + d5 * d2 * d7 * d7);
    } 
    b b1 = this.l;
    b1.a = d1;
    b1.b = paramDouble;
    if (a() || (this.k && b())) {
      if (this.g > 0.0D) {
        paramDouble = this.n;
        this.m = paramDouble;
        this.l.a = paramDouble;
      } else {
        this.n = this.l.a;
        this.m = this.n;
      } 
      this.l.b = 0.0D;
    } 
  }
  
  private boolean a() {
    return (Math.abs(this.l.b) <= this.o && (a(this.l) <= this.p || this.g == 0.0D));
  }
  
  private boolean b() {
    if (this.g > 0.0D) {
      double d1 = this.m;
      double d2 = this.n;
      if (d1 >= d2 || this.l.a <= d2) {
        d1 = this.m;
        d2 = this.n;
        if (d1 > d2 && this.l.a < d2)
          return true; 
      } else {
        return true;
      } 
    } 
    return false;
  }
  
  public void a(long paramLong) {
    paramLong /= 1000000L;
    if (!this.f) {
      if (this.s == 0) {
        this.t = this.b.f;
        this.s = 1;
      } 
      b b1 = this.l;
      double d2 = this.b.f;
      b1.a = d2;
      this.m = d2;
      this.e = paramLong;
      this.q = 0.0D;
      this.f = true;
    } 
    double d1 = (paramLong - this.e);
    Double.isNaN(d1);
    a(d1 / 1000.0D);
    this.e = paramLong;
    this.b.f = this.l.a;
    if (a()) {
      int i = this.r;
      if (i == -1 || this.s < i) {
        this.f = false;
        this.b.f = this.t;
        this.s++;
        return;
      } 
      this.a = true;
      return;
    } 
  }
  
  public void a(ReadableMap paramReadableMap) {
    boolean bool1;
    this.g = paramReadableMap.getDouble("stiffness");
    this.h = paramReadableMap.getDouble("damping");
    this.i = paramReadableMap.getDouble("mass");
    this.j = this.l.b;
    this.n = paramReadableMap.getDouble("toValue");
    this.o = paramReadableMap.getDouble("restSpeedThreshold");
    this.p = paramReadableMap.getDouble("restDisplacementThreshold");
    this.k = paramReadableMap.getBoolean("overshootClamping");
    boolean bool = paramReadableMap.hasKey("iterations");
    boolean bool2 = true;
    if (bool) {
      bool1 = paramReadableMap.getInt("iterations");
    } else {
      bool1 = true;
    } 
    this.r = bool1;
    if (this.r != 0)
      bool2 = false; 
    this.a = bool2;
    this.s = 0;
    this.q = 0.0D;
    this.f = false;
  }
  
  private static class b {
    double a;
    
    double b;
    
    private b() {}
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/animated/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */