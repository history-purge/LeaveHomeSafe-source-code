package e.e.l.n;

import e.e.e.b.e;
import java.util.Map;

public abstract class q0<T> extends e<T> {
  private final k<T> d;
  
  private final m0 e;
  
  private final String f;
  
  private final String g;
  
  public q0(k<T> paramk, m0 paramm0, String paramString1, String paramString2) {
    this.d = paramk;
    this.e = paramm0;
    this.f = paramString1;
    this.g = paramString2;
    this.e.a(this.g, this.f);
  }
  
  protected void a(Exception paramException) {
    Map map;
    m0 m01 = this.e;
    String str1 = this.g;
    String str2 = this.f;
    if (m01.a(str1)) {
      map = b(paramException);
    } else {
      map = null;
    } 
    m01.a(str1, str2, paramException, map);
    this.d.a(paramException);
  }
  
  protected Map<String, String> b(Exception paramException) {
    return null;
  }
  
  protected void b(T paramT) {
    Map map;
    m0 m01 = this.e;
    String str1 = this.g;
    String str2 = this.f;
    if (m01.a(str1)) {
      map = c(paramT);
    } else {
      map = null;
    } 
    m01.a(str1, str2, map);
    this.d.a(paramT, 1);
  }
  
  protected Map<String, String> c(T paramT) {
    return null;
  }
  
  protected void c() {
    Map map;
    m0 m01 = this.e;
    String str1 = this.g;
    String str2 = this.f;
    if (m01.a(str1)) {
      map = d();
    } else {
      map = null;
    } 
    m01.b(str1, str2, map);
    this.d.a();
  }
  
  protected Map<String, String> d() {
    return null;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/n/q0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */