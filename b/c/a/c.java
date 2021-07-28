package b.c.a;

import android.content.res.ColorStateList;

class c implements f {
  private g j(e parame) {
    return (g)parame.d();
  }
  
  public float a(e parame) {
    return j(parame).b();
  }
  
  public void a() {}
  
  public void a(e parame, float paramFloat) {
    j(parame).a(paramFloat);
  }
  
  public void a(e parame, ColorStateList paramColorStateList) {
    j(parame).a(paramColorStateList);
  }
  
  public ColorStateList b(e parame) {
    return j(parame).a();
  }
  
  public void b(e parame, float paramFloat) {
    parame.a().setElevation(paramFloat);
  }
  
  public float c(e parame) {
    return parame.a().getElevation();
  }
  
  public void c(e parame, float paramFloat) {
    j(parame).a(paramFloat, parame.c(), parame.b());
    i(parame);
  }
  
  public float d(e parame) {
    return j(parame).c();
  }
  
  public float e(e parame) {
    return d(parame) * 2.0F;
  }
  
  public float f(e parame) {
    return d(parame) * 2.0F;
  }
  
  public void g(e parame) {
    c(parame, a(parame));
  }
  
  public void h(e parame) {
    c(parame, a(parame));
  }
  
  public void i(e parame) {
    if (!parame.c()) {
      parame.a(0, 0, 0, 0);
      return;
    } 
    float f1 = a(parame);
    float f2 = d(parame);
    int i = (int)Math.ceil(h.a(f1, f2, parame.b()));
    int j = (int)Math.ceil(h.b(f1, f2, parame.b()));
    parame.a(i, j, i, j);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/c/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */