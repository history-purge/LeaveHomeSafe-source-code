package e.f.a.e.i.d;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class x3 extends AbstractList<String> implements u1, RandomAccess {
  private final u1 c;
  
  public x3(u1 paramu1) {
    this.c = paramu1;
  }
  
  public final Object i(int paramInt) {
    return this.c.i(paramInt);
  }
  
  public final Iterator<String> iterator() {
    return new z3(this);
  }
  
  public final ListIterator<String> listIterator(int paramInt) {
    return new y3(this, paramInt);
  }
  
  public final int size() {
    return this.c.size();
  }
  
  public final List<?> y() {
    return this.c.y();
  }
  
  public final u1 z() {
    return this;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/x3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */