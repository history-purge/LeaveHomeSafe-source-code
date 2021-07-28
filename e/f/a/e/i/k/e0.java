package e.f.a.e.i.k;

import java.util.AbstractSet;
import java.util.Collection;

abstract class e0<E> extends AbstractSet<E> {
  public boolean removeAll(Collection<?> paramCollection) {
    return f0.a(this, paramCollection);
  }
  
  public boolean retainAll(Collection<?> paramCollection) {
    if (paramCollection != null)
      return super.retainAll(paramCollection); 
    throw null;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/k/e0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */