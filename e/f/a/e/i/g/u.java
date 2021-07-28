package e.f.a.e.i.g;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

final class u extends WeakReference<Throwable> {
  private final int a;
  
  public u(Throwable paramThrowable, ReferenceQueue<Throwable> paramReferenceQueue) {
    super(paramThrowable, paramReferenceQueue);
    this.a = System.identityHashCode(paramThrowable);
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject != null) {
      if (paramObject.getClass() != u.class)
        return false; 
      if (this == paramObject)
        return true; 
      paramObject = paramObject;
      if (this.a == ((u)paramObject).a && get() == paramObject.get())
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    return this.a;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/g/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */