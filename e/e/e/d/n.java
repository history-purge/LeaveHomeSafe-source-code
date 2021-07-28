package e.e.e.d;

public final class n {
  public static RuntimeException a(Throwable paramThrowable) {
    i.a(paramThrowable);
    b(paramThrowable);
    throw new RuntimeException(paramThrowable);
  }
  
  public static <X extends Throwable> void a(Throwable paramThrowable, Class<X> paramClass) throws X {
    if (paramThrowable != null) {
      if (!paramClass.isInstance(paramThrowable))
        return; 
      throw (X)paramClass.cast(paramThrowable);
    } 
  }
  
  public static void b(Throwable paramThrowable) {
    a(paramThrowable, Error.class);
    a(paramThrowable, RuntimeException.class);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/e/d/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */