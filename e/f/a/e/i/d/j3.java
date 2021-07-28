package e.f.a.e.i.d;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class j3 implements Iterator<Object> {
  public final boolean hasNext() {
    return false;
  }
  
  public final Object next() {
    throw new NoSuchElementException();
  }
  
  public final void remove() {
    throw new UnsupportedOperationException();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/j3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */