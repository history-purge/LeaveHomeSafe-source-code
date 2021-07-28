package e.f.a.c.i.u.b;

import e.f.a.c.i.u.a;

public final class c<T> implements b<T>, a<T> {
  private final T a;
  
  static {
    new c(null);
  }
  
  private c(T paramT) {
    this.a = paramT;
  }
  
  public static <T> b<T> a(T paramT) {
    d.a(paramT, "instance cannot be null");
    return new c<T>(paramT);
  }
  
  public T get() {
    return this.a;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/c/i/u/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */