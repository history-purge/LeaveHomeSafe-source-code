package e.f.a.e.i.n;

import java.util.Collections;
import java.util.List;
import java.util.Map;

final class m5 extends n5<FieldDescriptorType, Object> {
  m5(int paramInt) {
    super(paramInt, null);
  }
  
  public final void a() {
    if (!b()) {
      for (int i = 0; i < c(); i++) {
        Map.Entry<K, V> entry = a(i);
        if (((b3)entry.getKey()).f())
          entry.setValue((V)Collections.unmodifiableList((List)entry.getValue())); 
      } 
      for (Map.Entry<K, V> entry : d()) {
        if (((b3)entry.getKey()).f())
          entry.setValue(Collections.unmodifiableList((List)entry.getValue())); 
      } 
    } 
    super.a();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/m5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */