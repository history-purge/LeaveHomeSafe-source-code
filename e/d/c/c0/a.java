package e.d.c.c0;

import e.d.a.s.b;
import e.d.b.m;
import e.d.c.b;
import e.d.c.c;
import e.d.c.e;
import e.d.c.h;
import java.util.Stack;

public abstract class a implements b {
  private final Stack<b> a = new Stack<b>();
  
  private b b;
  
  protected b c;
  
  protected final e d;
  
  protected a(e parame, b paramb) {
    this.d = parame;
    this.b = paramb;
  }
  
  private b c() {
    b b1 = this.c;
    if (b1 != null)
      return b1; 
    c c = (c)this.d.b(c.class);
    if (c != null)
      return (b)c; 
    a((Class)c.class);
    return this.c;
  }
  
  public void a(int paramInt, byte paramByte) {
    this.c.a(paramInt, paramByte);
  }
  
  public void a(int paramInt, double paramDouble) {
    this.c.a(paramInt, paramDouble);
  }
  
  public void a(int paramInt, float paramFloat) {
    this.c.a(paramInt, paramFloat);
  }
  
  public void a(int paramInt1, int paramInt2) {
    this.c.a(paramInt1, paramInt2);
  }
  
  public void a(int paramInt, long paramLong) {
    this.c.a(paramInt, paramLong);
  }
  
  public void a(int paramInt, m paramm) {
    this.c.a(paramInt, paramm);
  }
  
  public void a(int paramInt, h paramh) {
    this.c.a(paramInt, paramh);
  }
  
  public void a(int paramInt, short paramShort) {
    this.c.a(paramInt, paramShort);
  }
  
  public void a(int paramInt, byte[] paramArrayOfbyte) {
    this.c.a(paramInt, paramArrayOfbyte);
  }
  
  public void a(int paramInt, double[] paramArrayOfdouble) {
    this.c.a(paramInt, paramArrayOfdouble);
  }
  
  public void a(int paramInt, float[] paramArrayOffloat) {
    this.c.a(paramInt, paramArrayOffloat);
  }
  
  public void a(int paramInt, int[] paramArrayOfint) {
    this.c.a(paramInt, paramArrayOfint);
  }
  
  public void a(int paramInt, long[] paramArrayOflong) {
    this.c.b(paramInt, paramArrayOflong);
  }
  
  public void a(int paramInt, m[] paramArrayOfm) {
    this.c.a(paramInt, paramArrayOfm);
  }
  
  public void a(int paramInt, short[] paramArrayOfshort) {
    this.c.b(paramInt, paramArrayOfshort);
  }
  
  protected void a(Class<? extends b> paramClass) {
    try {
      b b1 = paramClass.newInstance();
      b b2 = this.c;
      if (b2 == null) {
        b2 = this.b;
        if (b2 != null) {
          b1.a(b2);
          this.b = null;
        } 
      } else {
        this.a.push(b2);
        b1.a(this.c);
      } 
      this.c = b1;
      this.d.a(this.c);
      return;
    } catch (InstantiationException instantiationException) {
      throw new RuntimeException(instantiationException);
    } catch (IllegalAccessException illegalAccessException) {
      throw new RuntimeException(illegalAccessException);
    } 
  }
  
  public void a(String paramString) {
    c().a(paramString);
  }
  
  public void b() {
    b b1;
    if (this.a.empty()) {
      b1 = null;
    } else {
      b1 = this.a.pop();
    } 
    this.c = b1;
  }
  
  public void b(int paramInt1, int paramInt2) {
    this.c.a(paramInt1, paramInt2);
  }
  
  public void b(int paramInt, byte[] paramArrayOfbyte) {
    this.c.a(paramInt, paramArrayOfbyte);
  }
  
  public void b(int paramInt, int[] paramArrayOfint) {
    this.c.b(paramInt, paramArrayOfint);
  }
  
  public void b(int paramInt, short[] paramArrayOfshort) {
    this.c.b(paramInt, paramArrayOfshort);
  }
  
  public void b(String paramString) {
    c().a(paramString);
  }
  
  public void c(int paramInt1, int paramInt2) {
    this.c.a(paramInt1, paramInt2);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/c0/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */