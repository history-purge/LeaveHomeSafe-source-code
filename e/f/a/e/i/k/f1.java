package e.f.a.e.i.k;

import com.google.android.gms.common.internal.o;

public final class f1 {
  private final u5 a;
  
  private final Boolean b;
  
  private final Boolean c;
  
  private final m5 d;
  
  public final u5 a() {
    return this.a;
  }
  
  public final Boolean b() {
    return this.c;
  }
  
  public final m5 c() {
    return this.d;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof f1))
      return false; 
    paramObject = paramObject;
    if (o.a(this.a, ((f1)paramObject).a)) {
      Boolean bool = ((f1)paramObject).b;
      if (o.a(null, null) && o.a(this.c, ((f1)paramObject).c) && o.a(this.d, ((f1)paramObject).d))
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    return o.a(new Object[] { this.a, null, this.c, this.d });
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/k/f1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */