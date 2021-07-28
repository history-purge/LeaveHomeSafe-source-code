package e.f.a.b;

import b.d.a;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

class k {
  private final a<a, SortedSet<j>> a = new a();
  
  void a() {
    this.a.clear();
  }
  
  public void a(a parama) {
    this.a.remove(parama);
  }
  
  public boolean a(j paramj) {
    Iterator<a> iterator = this.a.keySet().iterator();
    while (iterator.hasNext()) {
      a a1 = iterator.next();
      if (a1.a(paramj)) {
        SortedSet<j> sortedSet = (SortedSet)this.a.get(a1);
        if (sortedSet.contains(paramj))
          return false; 
        sortedSet.add(paramj);
        return true;
      } 
    } 
    TreeSet<j> treeSet = new TreeSet();
    treeSet.add(paramj);
    this.a.put(a.b(paramj.r(), paramj.q()), treeSet);
    return true;
  }
  
  SortedSet<j> b(a parama) {
    return (SortedSet<j>)this.a.get(parama);
  }
  
  boolean b() {
    return this.a.isEmpty();
  }
  
  Set<a> c() {
    return this.a.keySet();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/b/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */