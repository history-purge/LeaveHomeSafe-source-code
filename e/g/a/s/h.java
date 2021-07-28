package e.g.a.s;

public abstract class h<T, F> extends g<T> implements e<F> {
  public void a(Exception paramException, F paramF) {
    if (isCancelled())
      return; 
    if (paramException != null) {
      b(paramException);
      return;
    } 
    try {
      b(paramF);
      return;
    } catch (Exception exception) {
      b(exception);
      return;
    } 
  }
  
  protected void b(Exception paramException) {
    a(paramException);
  }
  
  protected abstract void b(F paramF);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/g/a/s/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */