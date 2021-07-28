package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableMap;

class s extends b {
  Object e = null;
  
  double f = Double.NaN;
  
  double g = 0.0D;
  
  private c h;
  
  public s() {}
  
  public s(ReadableMap paramReadableMap) {
    this.f = paramReadableMap.getDouble("value");
    this.g = paramReadableMap.getDouble("offset");
  }
  
  public void a(c paramc) {
    this.h = paramc;
  }
  
  public void b() {
    this.g += this.f;
    this.f = 0.0D;
  }
  
  public void c() {
    this.f += this.g;
    this.g = 0.0D;
  }
  
  public Object d() {
    return this.e;
  }
  
  public double e() {
    if (Double.isNaN(this.g + this.f))
      a(); 
    return this.g + this.f;
  }
  
  public void f() {
    c c1 = this.h;
    if (c1 == null)
      return; 
    c1.a(e());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/animated/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */