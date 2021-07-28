package e.f.a.e.i.n;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

final class y extends WeakReference<Throwable> {
  private final int a;
  
  public y(Throwable paramThrowable, ReferenceQueue<Throwable> paramReferenceQueue) {
    super(paramThrowable, paramReferenceQueue);
    if (paramThrowable != null) {
      this.a = System.identityHashCode(paramThrowable);
      return;
    } 
    throw new NullPointerException("The referent cannot be null");
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject != null) {
      if (paramObject.getClass() != y.class)
        return false; 
      if (this == paramObject)
        return true; 
      paramObject = paramObject;
      if (this.a == ((y)paramObject).a && get() == paramObject.get())
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    return this.a;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */