package e.f.a.e.i.k;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

class i8 implements Iterator {
  final Iterator c;
  
  final Collection d;
  
  i8(j8 paramj8) {
    Iterator iterator;
    this.d = this.e.d;
    Collection collection = paramj8.d;
    if (collection instanceof List) {
      iterator = ((List)collection).listIterator();
    } else {
      iterator = iterator.iterator();
    } 
    this.c = iterator;
  }
  
  i8(j8 paramj8, Iterator paramIterator) {
    this.d = this.e.d;
    this.c = paramIterator;
  }
  
  public final boolean hasNext() {
    zza();
    return this.c.hasNext();
  }
  
  public final Object next() {
    zza();
    return this.c.next();
  }
  
  public final void remove() {
    this.c.remove();
    m8.b(this.e.g);
    this.e.zzb();
  }
  
  final void zza() {
    this.e.zza();
    if (this.e.d == this.d)
      return; 
    throw new ConcurrentModificationException();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/k/i8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */