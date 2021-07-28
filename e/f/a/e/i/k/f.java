package e.f.a.e.i.k;

import java.util.Map;

final class f extends n8 {
  private final Object c;
  
  private int d;
  
  f(h paramh, int paramInt) {
    this.c = paramh.e[paramInt];
    this.d = paramInt;
  }
  
  private final void a() {
    int i = this.d;
    if (i == -1 || i >= this.e.size() || !a0.a(this.c, this.e.e[this.d])) {
      this.d = h.b(this.e, this.c);
      return;
    } 
  }
  
  public final Object getKey() {
    return this.c;
  }
  
  public final Object getValue() {
    Map map = this.e.b();
    if (map != null)
      return map.get(this.c); 
    a();
    int i = this.d;
    return (i == -1) ? null : this.e.f[i];
  }
  
  public final Object setValue(Object paramObject) {
    Map<Object, Object> map = this.e.b();
    if (map != null)
      return map.put(this.c, paramObject); 
    a();
    int i = this.d;
    if (i == -1) {
      this.e.put(this.c, paramObject);
      return null;
    } 
    Object[] arrayOfObject = this.e.f;
    Object object = arrayOfObject[i];
    arrayOfObject[i] = paramObject;
    return object;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/k/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */