package i.a.a.c;

public class a extends Exception {
  private static final long serialVersionUID = 1L;
  
  private int code = -1;
  
  public a() {}
  
  public a(String paramString) {
    super(paramString);
  }
  
  public a(String paramString, int paramInt) {
    super(paramString);
    this.code = paramInt;
  }
  
  public a(String paramString, Throwable paramThrowable) {
    super(paramString, paramThrowable);
  }
  
  public a(String paramString, Throwable paramThrowable, int paramInt) {
    super(paramString, paramThrowable);
    this.code = paramInt;
  }
  
  public a(Throwable paramThrowable) {
    super(paramThrowable);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/i/a/a/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */