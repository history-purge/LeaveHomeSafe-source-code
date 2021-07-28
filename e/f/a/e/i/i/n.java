package e.f.a.e.i.i;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

final class n extends WeakReference<Throwable> {
  private final int a;
  
  public n(Throwable paramThrowable, ReferenceQueue<Throwable> paramReferenceQueue) {
    super(paramThrowable, paramReferenceQueue);
    this.a = System.identityHashCode(paramThrowable);
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject != null) {
      if (paramObject.getClass() != n.class)
        return false; 
      if (this == paramObject)
        return true; 
      paramObject = paramObject;
      if (this.a == ((n)paramObject).a && get() == paramObject.get())
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    return this.a;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/i/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */