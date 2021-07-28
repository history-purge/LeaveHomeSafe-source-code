package i.a.a.f;

public class a {
  private int a;
  
  private long b;
  
  private long c;
  
  private int d;
  
  private boolean e;
  
  private boolean f;
  
  public a() {
    d();
    this.d = 0;
  }
  
  public void a() {
    d();
  }
  
  public void a(int paramInt) {}
  
  public void a(long paramLong) {
    this.b = paramLong;
  }
  
  public void a(String paramString) {}
  
  public void a(Throwable paramThrowable) {
    d();
  }
  
  public int b() {
    return this.a;
  }
  
  public void b(int paramInt) {
    this.d = paramInt;
  }
  
  public void b(long paramLong) {
    this.c += paramLong;
    paramLong = this.b;
    if (paramLong > 0L) {
      this.d = (int)(this.c * 100L / paramLong);
      if (this.d > 100)
        this.d = 100; 
    } 
    while (true) {
      if (this.f) {
        try {
          Thread.sleep(150L);
        } catch (InterruptedException interruptedException) {}
        continue;
      } 
      return;
    } 
  }
  
  public void c(int paramInt) {}
  
  public boolean c() {
    return this.e;
  }
  
  public void d() {
    this.a = 0;
    this.b = 0L;
    this.c = 0L;
    this.d = 0;
  }
  
  public void d(int paramInt) {
    this.a = paramInt;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/i/a/a/f/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */