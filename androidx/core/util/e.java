package androidx.core.util;

public class e<T> extends Pools$SimplePool<T> {
  private final Object c = new Object();
  
  public e(int paramInt) {
    super(paramInt);
  }
  
  public T a() {
    synchronized (this.c) {
      return super.a();
    } 
  }
  
  public boolean a(T paramT) {
    synchronized (this.c) {
      return super.a(paramT);
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/core/util/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */