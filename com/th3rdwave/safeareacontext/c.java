package com.th3rdwave.safeareacontext;

class c {
  float a;
  
  float b;
  
  float c;
  
  float d;
  
  c(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    this.a = paramFloat1;
    this.b = paramFloat2;
    this.c = paramFloat3;
    this.d = paramFloat4;
  }
  
  boolean a(c paramc) {
    return (this == paramc) ? true : ((this.a == paramc.a && this.b == paramc.b && this.c == paramc.c && this.d == paramc.d));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/th3rdwave/safeareacontext/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */