package e.f.a.e.i.d;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class b0 implements Iterator {
  private int c = 0;
  
  private final int d = this.e.size();
  
  b0(a0 parama0) {}
  
  private final byte a() {
    try {
      a0 a01 = this.e;
      int i = this.c;
      this.c = i + 1;
      return a01.a(i);
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw new NoSuchElementException(indexOutOfBoundsException.getMessage());
    } 
  }
  
  public final boolean hasNext() {
    return (this.c < this.d);
  }
  
  public final void remove() {
    throw new UnsupportedOperationException();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/b0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */