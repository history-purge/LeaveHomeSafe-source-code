package androidx.lifecycle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class w {
  private final HashMap<String, u> a = new HashMap<String, u>();
  
  final u a(String paramString) {
    return this.a.get(paramString);
  }
  
  public final void a() {
    Iterator<u> iterator = this.a.values().iterator();
    while (iterator.hasNext())
      ((u)iterator.next()).a(); 
    this.a.clear();
  }
  
  final void a(String paramString, u paramu) {
    u u1 = this.a.put(paramString, paramu);
    if (u1 != null)
      u1.b(); 
  }
  
  Set<String> b() {
    return new HashSet<String>(this.a.keySet());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/lifecycle/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */