package e.e.e.h;

import java.lang.ref.SoftReference;

public class b<T> {
  SoftReference<T> a = null;
  
  SoftReference<T> b = null;
  
  SoftReference<T> c = null;
  
  public void a() {
    SoftReference<T> softReference = this.a;
    if (softReference != null) {
      softReference.clear();
      this.a = null;
    } 
    softReference = this.b;
    if (softReference != null) {
      softReference.clear();
      this.b = null;
    } 
    softReference = this.c;
    if (softReference != null) {
      softReference.clear();
      this.c = null;
    } 
  }
  
  public void a(T paramT) {
    this.a = new SoftReference<T>(paramT);
    this.b = new SoftReference<T>(paramT);
    this.c = new SoftReference<T>(paramT);
  }
  
  public T b() {
    SoftReference<T> softReference = this.a;
    return (softReference == null) ? null : softReference.get();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/e/h/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */