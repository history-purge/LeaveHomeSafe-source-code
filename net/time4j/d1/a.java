package net.time4j.d1;

import java.util.List;

public abstract class a<U extends w> implements m0<U> {
  public boolean b() {
    List<m0.a<U>> list = a();
    int j = list.size();
    for (int i = 0; i < j; i++) {
      if (((m0.a)list.get(i)).a() > 0L)
        return false; 
    } 
    return true;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/d1/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */