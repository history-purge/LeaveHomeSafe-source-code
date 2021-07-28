package e.e.j.d.b;

import android.graphics.drawable.Animatable;
import e.e.j.c.c;

public class a extends c {
  private long b = -1L;
  
  private long c = -1L;
  
  private b d;
  
  public a(b paramb) {
    this.d = paramb;
  }
  
  public void a(String paramString, Object paramObject, Animatable paramAnimatable) {
    this.c = System.currentTimeMillis();
    b b1 = this.d;
    if (b1 != null)
      b1.a(this.c - this.b); 
  }
  
  public void b(String paramString, Object paramObject) {
    this.b = System.currentTimeMillis();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/j/d/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */