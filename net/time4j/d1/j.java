package net.time4j.d1;

import java.util.Map;

public final class j<T extends l<T>> extends x<T> {
  private final Map<String, ? extends k<T>> j;
  
  public k<T> a(String paramString) {
    if (!paramString.isEmpty()) {
      k<T> k = this.j.get(paramString);
      if (k != null)
        return k; 
      super.a(paramString);
      throw null;
    } 
    d();
    throw null;
  }
  
  public k<T> d() {
    throw new r("Cannot determine calendar system without variant.");
  }
  
  public boolean d(p<?> paramp) {
    return (super.d(paramp) || paramp instanceof a0);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/d1/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */