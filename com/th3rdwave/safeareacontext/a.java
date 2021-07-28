package com.th3rdwave.safeareacontext;

class a {
  float a;
  
  float b;
  
  float c;
  
  float d;
  
  a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    this.a = paramFloat1;
    this.b = paramFloat2;
    this.c = paramFloat3;
    this.d = paramFloat4;
  }
  
  boolean a(a parama) {
    return (this == parama) ? true : ((this.a == parama.a && this.b == parama.b && this.c == parama.c && this.d == parama.d));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/th3rdwave/safeareacontext/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */