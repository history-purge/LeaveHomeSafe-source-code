package androidx.core.util;

public class c<F, S> {
  public final F a;
  
  public final S b;
  
  public c(F paramF, S paramS) {
    this.a = paramF;
    this.b = paramS;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = paramObject instanceof c;
    boolean bool1 = false;
    if (!bool)
      return false; 
    paramObject = paramObject;
    bool = bool1;
    if (b.a(((c)paramObject).a, this.a)) {
      bool = bool1;
      if (b.a(((c)paramObject).b, this.b))
        bool = true; 
    } 
    return bool;
  }
  
  public int hashCode() {
    int i;
    F f = this.a;
    int j = 0;
    if (f == null) {
      i = 0;
    } else {
      i = f.hashCode();
    } 
    S s = this.b;
    if (s != null)
      j = s.hashCode(); 
    return i ^ j;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Pair{");
    stringBuilder.append(String.valueOf(this.a));
    stringBuilder.append(" ");
    stringBuilder.append(String.valueOf(this.b));
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/core/util/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */