package net.time4j.e1.a0;

import java.util.HashMap;
import java.util.Map;
import net.time4j.d1.p;

class q extends HashMap<p<?>, Object> {
  private static final long serialVersionUID = 1245025551222311435L;
  
  q(Map<? extends p<?>, ?> paramMap) {
    super(paramMap);
  }
  
  public Object a(p<?> paramp, Object paramObject) {
    Object object = super.put(paramp, paramObject);
    if (paramp != null && object != null) {
      if (object.equals(paramObject))
        return object; 
      throw new a(paramp);
    } 
    return object;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/e1/a0/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */