package e.f.a.e.i.n;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

class u5 extends AbstractSet<Map.Entry<K, V>> {
  private u5(n5 paramn5) {}
  
  public void clear() {
    this.c.clear();
  }
  
  public boolean contains(Object paramObject) {
    Map.Entry entry = (Map.Entry)paramObject;
    paramObject = this.c.get(entry.getKey());
    entry = (Map.Entry)entry.getValue();
    return (paramObject == entry || (paramObject != null && paramObject.equals(entry)));
  }
  
  public Iterator<Map.Entry<K, V>> iterator() {
    return new v5(this.c, null);
  }
  
  public boolean remove(Object paramObject) {
    paramObject = paramObject;
    if (contains(paramObject)) {
      this.c.remove(paramObject.getKey());
      return true;
    } 
    return false;
  }
  
  public int size() {
    return this.c.size();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/u5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */