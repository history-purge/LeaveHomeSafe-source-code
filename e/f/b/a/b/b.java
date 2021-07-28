package e.f.b.a.b;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.o;
import e.f.a.e.i.i.h0;
import e.f.a.e.i.i.i0;
import e.f.b.a.c.l;
import e.f.b.a.c.o.a;
import java.util.EnumMap;

public abstract class b {
  private final String a;
  
  private final a b;
  
  private final l c;
  
  static {
    new EnumMap<a, Object>(a.class);
    new EnumMap<a, Object>(a.class);
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof b))
      return false; 
    paramObject = paramObject;
    return (o.a(this.a, ((b)paramObject).a) && o.a(this.b, ((b)paramObject).b) && o.a(this.c, ((b)paramObject).c));
  }
  
  public int hashCode() {
    return o.a(new Object[] { this.a, this.b, this.c });
  }
  
  @RecentlyNonNull
  public String toString() {
    h0 h0 = i0.a("RemoteModel");
    h0.a("modelName", this.a);
    h0.a("baseModel", this.b);
    h0.a("modelType", this.c);
    return h0.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/b/a/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */