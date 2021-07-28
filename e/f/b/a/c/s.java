package e.f.b.a.c;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

final class s extends PhantomReference<Object> implements a.a {
  private final Set<s> a;
  
  private final Runnable b;
  
  public final void a() {
    if (!this.a.remove(this))
      return; 
    clear();
    this.b.run();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/b/a/c/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */