package e.f.a.e.i.k;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class d<T> implements Iterator<T> {
  int c = h.a(this.f);
  
  int d = this.f.d();
  
  int e = -1;
  
  private final void a() {
    if (h.a(this.f) == this.c)
      return; 
    throw new ConcurrentModificationException();
  }
  
  abstract T a(int paramInt);
  
  public final boolean hasNext() {
    return (this.d >= 0);
  }
  
  public final T next() {
    a();
    if (hasNext()) {
      int i = this.d;
      this.e = i;
      T t = a(i);
      this.d = this.f.b(this.d);
      return t;
    } 
    throw new NoSuchElementException();
  }
  
  public final void remove() {
    boolean bool;
    a();
    if (this.e >= 0) {
      bool = true;
    } else {
      bool = false;
    } 
    e4.a(bool, "no calls to next() since the last call to remove()");
    this.c += 32;
    h h1 = this.f;
    h1.remove(h1.e[this.e]);
    this.d--;
    this.e = -1;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/k/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */