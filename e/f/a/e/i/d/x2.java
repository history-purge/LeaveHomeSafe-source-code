package e.f.a.e.i.d;

import java.util.ArrayList;
import java.util.List;

final class x2<E> extends t<E> {
  private static final x2<Object> e;
  
  private final List<E> d;
  
  static {
    x2<Object> x21 = new x2();
    e = x21;
    x21.x();
  }
  
  x2() {
    this(new ArrayList<E>(10));
  }
  
  private x2(List<E> paramList) {
    this.d = paramList;
  }
  
  public static <E> x2<E> b() {
    return (x2)e;
  }
  
  public final void add(int paramInt, E paramE) {
    a();
    this.d.add(paramInt, paramE);
    this.modCount++;
  }
  
  public final E get(int paramInt) {
    return this.d.get(paramInt);
  }
  
  public final E remove(int paramInt) {
    a();
    E e = this.d.remove(paramInt);
    this.modCount++;
    return e;
  }
  
  public final E set(int paramInt, E paramE) {
    a();
    paramE = this.d.set(paramInt, paramE);
    this.modCount++;
    return paramE;
  }
  
  public final int size() {
    return this.d.size();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/x2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */