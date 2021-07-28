package c;

public class g<TResult> {
  private final f<TResult> a = new f<TResult>();
  
  public f<TResult> a() {
    return this.a;
  }
  
  public void a(Exception paramException) {
    if (b(paramException))
      return; 
    throw new IllegalStateException("Cannot set the error on a completed task.");
  }
  
  public void a(TResult paramTResult) {
    if (b(paramTResult))
      return; 
    throw new IllegalStateException("Cannot set the result of a completed task.");
  }
  
  public void b() {
    if (c())
      return; 
    throw new IllegalStateException("Cannot cancel a completed task.");
  }
  
  public boolean b(Exception paramException) {
    return this.a.a(paramException);
  }
  
  public boolean b(TResult paramTResult) {
    return this.a.a(paramTResult);
  }
  
  public boolean c() {
    return this.a.f();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/c/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */