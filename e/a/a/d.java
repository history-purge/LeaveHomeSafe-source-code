package e.a.a;

public class d extends Exception {
  private int errorCode;
  
  public d(String paramString, int paramInt) {
    super(paramString);
    this.errorCode = paramInt;
  }
  
  public d(String paramString, int paramInt, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.errorCode = paramInt;
  }
  
  public int a() {
    return this.errorCode;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/a/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */