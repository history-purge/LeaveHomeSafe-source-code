package k.b.a;

import android.content.Context;
import android.util.SparseArray;
import e.f.a.e.n.d.a;
import k.b.b.a;
import org.reactnative.camera.h.a;

public class b {
  public static int e = 0;
  
  public static int f = 1;
  
  public static int g = 2;
  
  public static int h;
  
  private e.f.a.e.n.d.b a = null;
  
  private a b;
  
  private e.f.a.e.n.d.b.a c;
  
  private int d = 0;
  
  public b(Context paramContext) {
    e.f.a.e.n.d.b.a a1 = new e.f.a.e.n.d.b.a(paramContext);
    a1.a(this.d);
    this.c = a1;
  }
  
  private void c() {
    this.a = this.c.a();
  }
  
  private void d() {
    e.f.a.e.n.d.b b1 = this.a;
    if (b1 != null) {
      b1.a();
      this.a = null;
    } 
  }
  
  public SparseArray<a> a(a parama) {
    if (!parama.a().equals(this.b))
      d(); 
    if (this.a == null) {
      c();
      this.b = parama.a();
    } 
    return this.a.a(parama.b());
  }
  
  public void a(int paramInt) {
    if (paramInt != this.d) {
      b();
      this.c.a(paramInt);
      this.d = paramInt;
    } 
  }
  
  public boolean a() {
    if (this.a == null)
      c(); 
    return this.a.b();
  }
  
  public void b() {
    d();
    this.b = null;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/k/b/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */