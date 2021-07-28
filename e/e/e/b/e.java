package e.e.e.b;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class e<T> implements Runnable {
  protected final AtomicInteger c = new AtomicInteger(0);
  
  public void a() {
    if (this.c.compareAndSet(0, 2))
      c(); 
  }
  
  protected abstract void a(Exception paramException);
  
  protected abstract void a(T paramT);
  
  protected abstract T b();
  
  protected abstract void b(T paramT);
  
  protected abstract void c();
  
  public final void run() {
    if (!this.c.compareAndSet(0, 1))
      return; 
    try {
      T t = b();
      this.c.set(3);
      try {
        b(t);
        return;
      } finally {
        a(t);
      } 
    } catch (Exception exception) {
      this.c.set(4);
      a(exception);
      return;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/e/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */