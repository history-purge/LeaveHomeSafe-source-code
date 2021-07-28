package e.f.c;

public final class f extends m {
  private static final f e;
  
  static {
    f f1 = new f();
    e = f1;
    f1.setStackTrace(m.d);
  }
  
  private f() {}
  
  private f(Throwable paramThrowable) {
    super(paramThrowable);
  }
  
  public static f a() {
    return m.c ? new f() : e;
  }
  
  public static f a(Throwable paramThrowable) {
    return m.c ? new f(paramThrowable) : e;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */