package b.a.o;

import android.view.View;
import android.view.animation.Interpolator;
import b.g.m.a0;
import b.g.m.b0;
import b.g.m.z;
import java.util.ArrayList;
import java.util.Iterator;

public class h {
  final ArrayList<z> a = new ArrayList<z>();
  
  private long b = -1L;
  
  private Interpolator c;
  
  a0 d;
  
  private boolean e;
  
  private final b0 f = new a(this);
  
  public h a(long paramLong) {
    if (!this.e)
      this.b = paramLong; 
    return this;
  }
  
  public h a(Interpolator paramInterpolator) {
    if (!this.e)
      this.c = paramInterpolator; 
    return this;
  }
  
  public h a(a0 parama0) {
    if (!this.e)
      this.d = parama0; 
    return this;
  }
  
  public h a(z paramz) {
    if (!this.e)
      this.a.add(paramz); 
    return this;
  }
  
  public h a(z paramz1, z paramz2) {
    this.a.add(paramz1);
    paramz2.b(paramz1.b());
    this.a.add(paramz2);
    return this;
  }
  
  public void a() {
    if (!this.e)
      return; 
    Iterator<z> iterator = this.a.iterator();
    while (iterator.hasNext())
      ((z)iterator.next()).a(); 
    this.e = false;
  }
  
  void b() {
    this.e = false;
  }
  
  public void c() {
    if (this.e)
      return; 
    for (z z : this.a) {
      long l = this.b;
      if (l >= 0L)
        z.a(l); 
      Interpolator interpolator = this.c;
      if (interpolator != null)
        z.a(interpolator); 
      if (this.d != null)
        z.a((a0)this.f); 
      z.c();
    } 
    this.e = true;
  }
  
  class a extends b0 {
    private boolean a = false;
    
    private int b = 0;
    
    a(h this$0) {}
    
    void a() {
      this.b = 0;
      this.a = false;
      this.c.b();
    }
    
    public void b(View param1View) {
      int i = this.b + 1;
      this.b = i;
      if (i == this.c.a.size()) {
        a0 a0 = this.c.d;
        if (a0 != null)
          a0.b(null); 
        a();
      } 
    }
    
    public void c(View param1View) {
      if (this.a)
        return; 
      this.a = true;
      a0 a0 = this.c.d;
      if (a0 != null)
        a0.c(null); 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/a/o/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */