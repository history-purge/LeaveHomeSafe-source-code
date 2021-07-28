package e.f.c.w.r.g;

import java.util.ArrayList;
import java.util.List;

final class c {
  private final List<b> a;
  
  private final int b;
  
  private final boolean c;
  
  c(List<b> paramList, int paramInt, boolean paramBoolean) {
    this.a = new ArrayList<b>(paramList);
    this.b = paramInt;
    this.c = paramBoolean;
  }
  
  List<b> a() {
    return this.a;
  }
  
  boolean a(List<b> paramList) {
    return this.a.equals(paramList);
  }
  
  int b() {
    return this.b;
  }
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof c))
      return false; 
    paramObject = paramObject;
    return (this.a.equals(paramObject.a()) && this.c == ((c)paramObject).c);
  }
  
  public int hashCode() {
    return this.a.hashCode() ^ Boolean.valueOf(this.c).hashCode();
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder("{ ");
    stringBuilder.append(this.a);
    stringBuilder.append(" }");
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/w/r/g/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */