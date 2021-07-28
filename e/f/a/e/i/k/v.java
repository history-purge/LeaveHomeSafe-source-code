package e.f.a.e.i.k;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;

abstract class v<K, V> extends e0<Map.Entry<K, V>> {
  public final void clear() {
    zza().clear();
  }
  
  public abstract boolean contains(Object paramObject);
  
  public final boolean isEmpty() {
    return zza().isEmpty();
  }
  
  public final boolean removeAll(Collection<?> paramCollection) {
    if (paramCollection != null)
      try {
        return f0.a(this, paramCollection);
      } catch (UnsupportedOperationException unsupportedOperationException) {
        return f0.a(this, paramCollection.iterator());
      }  
    throw null;
  }
  
  public final boolean retainAll(Collection<?> paramCollection) {
    if (paramCollection != null)
      try {
        return super.retainAll(paramCollection);
      } catch (UnsupportedOperationException unsupportedOperationException) {
        StringBuilder stringBuilder;
        int i = paramCollection.size();
        if (i < 3) {
          if (i >= 0) {
            i++;
          } else {
            stringBuilder = new StringBuilder(52);
            stringBuilder.append("expectedSize");
            stringBuilder.append(" cannot be negative but was: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
          } 
        } else if (i < 1073741824) {
          i = (int)(i / 0.75F + 1.0F);
        } else {
          i = Integer.MAX_VALUE;
        } 
        HashSet<?> hashSet = new HashSet(i);
        for (Map.Entry entry : stringBuilder) {
          if (contains(entry))
            hashSet.add(((Map.Entry)entry).getKey()); 
        } 
        return ((e8)zza()).f.a().retainAll(hashSet);
      }  
    throw null;
  }
  
  public final int size() {
    return zza().size();
  }
  
  abstract Map<K, V> zza();
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/k/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */