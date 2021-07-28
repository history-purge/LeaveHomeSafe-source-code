package e.f.a.e.i.d;

import java.util.Collections;
import java.util.List;
import java.util.Map;

final class f3 extends e3<FieldDescriptorType, Object> {
  f3(int paramInt) {
    super(paramInt, null);
  }
  
  public final void e() {
    if (!a()) {
      for (int i = 0; i < b(); i++) {
        Map.Entry<K, V> entry = a(i);
        if (((z0)entry.getKey()).p())
          entry.setValue((V)Collections.unmodifiableList((List)entry.getValue())); 
      } 
      for (Map.Entry<K, V> entry : c()) {
        if (((z0)entry.getKey()).p())
          entry.setValue(Collections.unmodifiableList((List)entry.getValue())); 
      } 
    } 
    super.e();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/f3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */