package e.f.a.e.i.i;

import java.util.NoSuchElementException;

abstract class c<E> extends k<E> {
  private final int c;
  
  private int d;
  
  protected c(int paramInt1, int paramInt2) {
    k0.b(paramInt2, paramInt1, "index");
    this.c = paramInt1;
    this.d = paramInt2;
  }
  
  protected abstract E a(int paramInt);
  
  public final boolean hasNext() {
    return (this.d < this.c);
  }
  
  public final boolean hasPrevious() {
    return (this.d > 0);
  }
  
  public final E next() {
    if (hasNext()) {
      int i = this.d;
      this.d = i + 1;
      return a(i);
    } 
    throw new NoSuchElementException();
  }
  
  public final int nextIndex() {
    return this.d;
  }
  
  public final E previous() {
    if (hasPrevious()) {
      int i = this.d - 1;
      this.d = i;
      return a(i);
    } 
    throw new NoSuchElementException();
  }
  
  public final int previousIndex() {
    return this.d - 1;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/i/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */