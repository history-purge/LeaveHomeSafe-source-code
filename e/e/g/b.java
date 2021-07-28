package e.e.g;

public abstract class b<T> implements e<T> {
  public void a(c<T> paramc) {}
  
  public void b(c<T> paramc) {
    boolean bool = paramc.d();
    try {
      f(paramc);
      return;
    } finally {
      if (bool)
        paramc.close(); 
    } 
  }
  
  public void c(c<T> paramc) {
    try {
      e(paramc);
      return;
    } finally {
      paramc.close();
    } 
  }
  
  public void d(c<T> paramc) {}
  
  protected abstract void e(c<T> paramc);
  
  protected abstract void f(c<T> paramc);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/g/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */