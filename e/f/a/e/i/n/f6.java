package e.f.a.e.i.n;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class f6 extends AbstractList<String> implements b4, RandomAccess {
  private final b4 c;
  
  public f6(b4 paramb4) {
    this.c = paramb4;
  }
  
  public final void a(z1 paramz1) {
    throw new UnsupportedOperationException();
  }
  
  public final b4 e() {
    return this;
  }
  
  public final List<?> f() {
    return this.c.f();
  }
  
  public final Object g(int paramInt) {
    return this.c.g(paramInt);
  }
  
  public final Iterator<String> iterator() {
    return new i6(this);
  }
  
  public final ListIterator<String> listIterator(int paramInt) {
    return new e6(this, paramInt);
  }
  
  public final int size() {
    return this.c.size();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/f6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */