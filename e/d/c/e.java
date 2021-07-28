package e.d.c;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class e {
  private final List<b> a = new ArrayList<b>();
  
  public Iterable<b> a() {
    return this.a;
  }
  
  public <T extends b> Collection<T> a(Class<T> paramClass) {
    ArrayList<b> arrayList = new ArrayList();
    for (b b : this.a) {
      if (paramClass.isAssignableFrom(b.getClass()))
        arrayList.add(b); 
    } 
    return (Collection)arrayList;
  }
  
  public <T extends b> void a(T paramT) {
    this.a.add((b)paramT);
  }
  
  public int b() {
    return this.a.size();
  }
  
  public <T extends b> T b(Class<T> paramClass) {
    for (b b : this.a) {
      if (paramClass.isAssignableFrom(b.getClass()))
        return (T)b; 
    } 
    return null;
  }
  
  public String toString() {
    String str;
    int i = b();
    if (i == 1) {
      str = "directory";
    } else {
      str = "directories";
    } 
    return String.format("Metadata (%d %s)", new Object[] { Integer.valueOf(i), str });
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */