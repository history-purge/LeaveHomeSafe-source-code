package e.f.a.e.i.k;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

final class e8 extends y {
  final transient Map e;
  
  e8(m8 paramm8, Map paramMap) {
    this.e = paramMap;
  }
  
  protected final Set<Map.Entry> a() {
    return new c8(this);
  }
  
  public final void clear() {
    if (this.e == m8.a(this.f)) {
      this.f.f();
      return;
    } 
    s.a(new d8(this));
  }
  
  public final boolean containsKey(Object paramObject) {
    return z.b(this.e, paramObject);
  }
  
  public final boolean equals(Object paramObject) {
    return (this == paramObject || this.e.equals(paramObject));
  }
  
  public final int hashCode() {
    return this.e.hashCode();
  }
  
  public final Set keySet() {
    return this.f.a();
  }
  
  public final int size() {
    return this.e.size();
  }
  
  public final String toString() {
    return this.e.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/k/e8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */