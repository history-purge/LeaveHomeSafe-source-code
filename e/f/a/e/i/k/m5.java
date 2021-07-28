package e.f.a.e.i.k;

import com.google.android.gms.common.internal.o;

public final class m5 {
  private final l5 a;
  
  private final Integer b;
  
  private final Integer c;
  
  public final l5 a() {
    return this.a;
  }
  
  public final Integer b() {
    return this.b;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof m5))
      return false; 
    paramObject = paramObject;
    if (o.a(this.a, ((m5)paramObject).a) && o.a(this.b, ((m5)paramObject).b)) {
      paramObject = ((m5)paramObject).c;
      if (o.a(null, null))
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    return o.a(new Object[] { this.a, this.b, null });
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/k/m5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */