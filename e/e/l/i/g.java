package e.e.l.i;

import e.e.e.d.i;
import e.e.l.k.f;
import java.util.Collections;
import java.util.List;

public class g implements e {
  private final c a;
  
  public g() {
    this(new b(null));
  }
  
  public g(c paramc) {
    i.a(paramc);
    this.a = paramc;
  }
  
  public int a(int paramInt) {
    List<Integer> list = this.a.b();
    if (list == null || list.isEmpty())
      return paramInt + 1; 
    for (int i = 0; i < list.size(); i++) {
      if (((Integer)list.get(i)).intValue() > paramInt)
        return ((Integer)list.get(i)).intValue(); 
    } 
    return Integer.MAX_VALUE;
  }
  
  public e.e.l.k.g b(int paramInt) {
    boolean bool;
    if (paramInt >= this.a.a()) {
      bool = true;
    } else {
      bool = false;
    } 
    return f.a(paramInt, bool, false);
  }
  
  private static class b implements c {
    private b() {}
    
    public int a() {
      return 0;
    }
    
    public List<Integer> b() {
      return Collections.EMPTY_LIST;
    }
  }
  
  public static interface c {
    int a();
    
    List<Integer> b();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/i/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */