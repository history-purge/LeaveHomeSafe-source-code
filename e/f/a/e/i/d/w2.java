package e.f.a.e.i.d;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class w2 {
  private static final w2 c = new w2();
  
  private final c3 a;
  
  private final ConcurrentMap<Class<?>, b3<?>> b = new ConcurrentHashMap<Class<?>, b3<?>>();
  
  private w2() {
    c3 c31 = null;
    int i = 0;
    while (i) {
      (new String[1])[0] = "com.google.protobuf.AndroidProto3SchemaFactory";
      c3 c33 = a((new String[1])[0]);
      c31 = c33;
      if (c33 == null) {
        i++;
        c31 = c33;
      } 
    } 
    c3 c32 = c31;
    if (c31 == null)
      c32 = new a2(); 
    this.a = c32;
  }
  
  private static c3 a(String paramString) {
    try {
      return Class.forName(paramString).getConstructor(new Class[0]).newInstance(new Object[0]);
    } finally {
      paramString = null;
    } 
  }
  
  public static w2 a() {
    return c;
  }
  
  public final <T> b3<T> a(Class<T> paramClass) {
    h1.a(paramClass, "messageType");
    b3<T> b32 = (b3)this.b.get(paramClass);
    b3<T> b31 = b32;
    if (b32 == null) {
      b31 = this.a.a(paramClass);
      h1.a(paramClass, "messageType");
      h1.a(b31, "schema");
      b3<T> b3 = (b3)this.b.putIfAbsent(paramClass, b31);
      if (b3 != null)
        b31 = b3; 
    } 
    return b31;
  }
  
  public final <T> b3<T> a(T paramT) {
    return a((Class)paramT.getClass());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/w2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */