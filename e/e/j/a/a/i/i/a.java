package e.e.j.a.a.i.i;

import android.graphics.drawable.Animatable;
import com.facebook.common.time.b;
import e.e.j.a.a.i.g;
import e.e.j.a.a.i.h;
import e.e.j.c.c;
import e.e.l.k.e;

public class a extends c<e> {
  private final b b;
  
  private final h c;
  
  private final g d;
  
  public a(b paramb, h paramh, g paramg) {
    this.b = paramb;
    this.c = paramh;
    this.d = paramg;
  }
  
  private void b(long paramLong) {
    this.c.b(false);
    this.c.h(paramLong);
    this.d.a(this.c, 2);
  }
  
  public void a(long paramLong) {
    this.c.b(true);
    this.c.i(paramLong);
    this.d.a(this.c, 1);
  }
  
  public void a(String paramString) {
    super.a(paramString);
    long l = this.b.now();
    int i = this.c.a();
    if (i != 3 && i != 5) {
      this.c.a(l);
      this.c.a(paramString);
      this.d.b(this.c, 4);
    } 
    b(l);
  }
  
  public void a(String paramString, e parame) {
    long l = this.b.now();
    this.c.d(l);
    this.c.a(paramString);
    this.c.a(parame);
    this.d.b(this.c, 2);
  }
  
  public void a(String paramString, e parame, Animatable paramAnimatable) {
    long l = this.b.now();
    this.c.c(l);
    this.c.f(l);
    this.c.a(paramString);
    this.c.a(parame);
    this.d.b(this.c, 3);
  }
  
  public void b(String paramString, Object paramObject) {
    long l = this.b.now();
    this.c.e(l);
    this.c.a(paramString);
    this.c.a(paramObject);
    this.d.b(this.c, 0);
    a(l);
  }
  
  public void b(String paramString, Throwable paramThrowable) {
    long l = this.b.now();
    this.c.b(l);
    this.c.a(paramString);
    this.d.b(this.c, 5);
    b(l);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/j/a/a/i/i/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */