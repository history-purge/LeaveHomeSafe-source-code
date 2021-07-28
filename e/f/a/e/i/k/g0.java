package e.f.a.e.i.k;

import java.util.Iterator;

abstract class g0<F, T> implements Iterator<T> {
  final Iterator<? extends F> c;
  
  g0(Iterator<? extends F> paramIterator) {
    if (paramIterator != null) {
      this.c = paramIterator;
      return;
    } 
    throw null;
  }
  
  abstract T a(F paramF);
  
  public final boolean hasNext() {
    return this.c.hasNext();
  }
  
  public final T next() {
    return a(this.c.next());
  }
  
  public final void remove() {
    this.c.remove();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/k/g0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */