package e.f.a.e.i.k;

import java.util.List;
import java.util.ListIterator;

final class k8 extends i8 implements ListIterator {
  k8(l8 paraml8) {
    super(paraml8);
  }
  
  public k8(l8 paraml8, int paramInt) {
    super(paraml8, ((List)paraml8.d).listIterator(paramInt));
  }
  
  public final void add(Object paramObject) {
    boolean bool = this.f.isEmpty();
    zza();
    ((ListIterator<Object>)this.c).add(paramObject);
    m8.c(this.f.h);
    if (bool)
      this.f.a(); 
  }
  
  public final boolean hasPrevious() {
    zza();
    return ((ListIterator)this.c).hasPrevious();
  }
  
  public final int nextIndex() {
    zza();
    return ((ListIterator)this.c).nextIndex();
  }
  
  public final Object previous() {
    zza();
    return ((ListIterator)this.c).previous();
  }
  
  public final int previousIndex() {
    zza();
    return ((ListIterator)this.c).previousIndex();
  }
  
  public final void set(Object paramObject) {
    zza();
    ((ListIterator<Object>)this.c).set(paramObject);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/k/k8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */