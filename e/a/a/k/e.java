package e.a.a.k;

import e.a.a.d;

public final class e extends c {
  public e() {}
  
  public e(int paramInt) {
    super(paramInt);
  }
  
  public e a(boolean paramBoolean) {
    a(512, paramBoolean);
    return this;
  }
  
  public void a(int paramInt) {
    if ((paramInt & 0x100) <= 0 || (paramInt & 0x200) <= 0) {
      if ((paramInt & 0x2) > 0) {
        if ((paramInt & 0x300) <= 0)
          return; 
        throw new d("Structs and arrays can't have \"value\" options", 103);
      } 
      return;
    } 
    throw new d("IsStruct and IsArray options are mutually exclusive", 103);
  }
  
  public void a(e parame) {
    if (parame != null) {
      int i = a();
      c(parame.a() | i);
    } 
  }
  
  protected int b() {
    return -2147475470;
  }
  
  public e b(boolean paramBoolean) {
    a(4096, paramBoolean);
    return this;
  }
  
  public e c(boolean paramBoolean) {
    a(2048, paramBoolean);
    return this;
  }
  
  public boolean c() {
    return b(64);
  }
  
  public e d(boolean paramBoolean) {
    a(1024, paramBoolean);
    return this;
  }
  
  public boolean d() {
    return b(512);
  }
  
  public e e(boolean paramBoolean) {
    a(64, paramBoolean);
    return this;
  }
  
  public boolean e() {
    return b(4096);
  }
  
  public e f(boolean paramBoolean) {
    a(16, paramBoolean);
    return this;
  }
  
  public boolean f() {
    return b(2048);
  }
  
  public e g(boolean paramBoolean) {
    a(128, paramBoolean);
    return this;
  }
  
  public boolean g() {
    return b(1024);
  }
  
  public e h(boolean paramBoolean) {
    a(32, paramBoolean);
    return this;
  }
  
  public boolean h() {
    return ((a() & 0x300) > 0);
  }
  
  public e i(boolean paramBoolean) {
    a(-2147483648, paramBoolean);
    return this;
  }
  
  public boolean i() {
    return b(32);
  }
  
  public e j(boolean paramBoolean) {
    a(256, paramBoolean);
    return this;
  }
  
  public boolean j() {
    return b(-2147483648);
  }
  
  public e k(boolean paramBoolean) {
    a(2, paramBoolean);
    return this;
  }
  
  public boolean k() {
    return ((a() & 0x300) == 0);
  }
  
  public boolean l() {
    return b(256);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/a/a/k/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */