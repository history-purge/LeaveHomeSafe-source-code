package e.f.a.e.i.d;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

class n3 extends AbstractSet<Map.Entry<K, V>> {
  private n3(e3 parame3) {}
  
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
    return new m3(this.c, null);
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


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/n3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */