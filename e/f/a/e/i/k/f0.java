package e.f.a.e.i.k;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class f0 {
  static boolean a(Set<?> paramSet, Collection<?> paramCollection) {
    if (paramCollection != null) {
      Iterator<?> iterator;
      Collection<?> collection = paramCollection;
      if (paramCollection instanceof c0)
        collection = ((c0)paramCollection).zza(); 
      if (collection instanceof Set && collection.size() > paramSet.size()) {
        iterator = paramSet.iterator();
        if (collection != null) {
          boolean bool = false;
          while (iterator.hasNext()) {
            if (collection.contains(iterator.next())) {
              iterator.remove();
              bool = true;
            } 
          } 
          return bool;
        } 
        throw null;
      } 
      return a((Set<?>)iterator, collection.iterator());
    } 
    throw null;
  }
  
  static boolean a(Set<?> paramSet, Iterator<?> paramIterator) {
    boolean bool;
    for (bool = false; paramIterator.hasNext(); bool |= paramSet.remove(paramIterator.next()));
    return !(true != bool);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/k/f0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */