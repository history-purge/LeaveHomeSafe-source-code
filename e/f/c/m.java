package e.f.c;

public abstract class m extends Exception {
  protected static final boolean c;
  
  protected static final StackTraceElement[] d = new StackTraceElement[0];
  
  m() {}
  
  m(Throwable paramThrowable) {
    super(paramThrowable);
  }
  
  public final Throwable fillInStackTrace() {
    /* monitor enter ThisExpression{ObjectType{e/f/c/m}} */
    /* monitor exit ThisExpression{ObjectType{e/f/c/m}} */
    return null;
  }
  
  static {
    boolean bool;
    if (System.getProperty("surefire.test.class.path") != null) {
      bool = true;
    } else {
      bool = false;
    } 
    c = bool;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */