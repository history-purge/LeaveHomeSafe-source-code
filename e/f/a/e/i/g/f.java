package e.f.a.e.i.g;

import com.google.firebase.m.e;
import com.google.firebase.m.g;
import java.io.OutputStream;
import java.util.Map;

public final class f {
  private final Map<Class<?>, e<?>> a;
  
  private final Map<Class<?>, g<?>> b;
  
  private final e<Object> c;
  
  f(Map<Class<?>, e<?>> paramMap, Map<Class<?>, g<?>> paramMap1, e<Object> parame) {
    this.a = paramMap;
    this.b = paramMap1;
    this.c = parame;
  }
  
  public final void a(Object paramObject, OutputStream paramOutputStream) {
    (new c(paramOutputStream, this.a, this.b, this.c)).a(paramObject);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/g/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */