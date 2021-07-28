package com.google.android.material.bottomappbar;

import e.f.a.f.a0.f;
import e.f.a.f.a0.m;

public class a extends f implements Cloneable {
  private float c;
  
  private float d;
  
  private float e;
  
  private float f;
  
  private float g;
  
  float a() {
    return this.f;
  }
  
  void a(float paramFloat) {
    this.f = paramFloat;
  }
  
  public void a(float paramFloat1, float paramFloat2, float paramFloat3, m paramm) {
    float f1 = this.e;
    if (f1 == 0.0F) {
      paramm.a(paramFloat1, 0.0F);
      return;
    } 
    f1 = (this.d * 2.0F + f1) / 2.0F;
    float f2 = paramFloat3 * this.c;
    paramFloat2 += this.g;
    paramFloat3 = this.f * paramFloat3 + (1.0F - paramFloat3) * f1;
    if (paramFloat3 / f1 >= 1.0F) {
      paramm.a(paramFloat1, 0.0F);
      return;
    } 
    float f3 = f1 + f2;
    float f5 = paramFloat3 + f2;
    float f6 = (float)Math.sqrt((f3 * f3 - f5 * f5));
    f3 = paramFloat2 - f6;
    float f4 = paramFloat2 + f6;
    f5 = (float)Math.toDegrees(Math.atan((f6 / f5)));
    f6 = 90.0F - f5;
    paramm.a(f3, 0.0F);
    float f7 = f2 * 2.0F;
    paramm.a(f3 - f2, 0.0F, f3 + f2, f7, 270.0F, f5);
    paramm.a(paramFloat2 - f1, -f1 - paramFloat3, paramFloat2 + f1, f1 - paramFloat3, 180.0F - f6, f6 * 2.0F - 180.0F);
    paramm.a(f4 - f2, 0.0F, f4 + f2, f7, 270.0F - f5, f5);
    paramm.a(paramFloat1, 0.0F);
  }
  
  float b() {
    return this.d;
  }
  
  void b(float paramFloat) {
    this.d = paramFloat;
  }
  
  float c() {
    return this.c;
  }
  
  void c(float paramFloat) {
    this.c = paramFloat;
  }
  
  public float d() {
    return this.e;
  }
  
  public void d(float paramFloat) {
    this.e = paramFloat;
  }
  
  void e(float paramFloat) {
    this.g = paramFloat;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/bottomappbar/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */