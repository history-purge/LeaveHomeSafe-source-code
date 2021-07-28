package e.e.l.e;

import e.e.e.d.i;
import e.e.e.k.b;

public class e {
  public final int a;
  
  public final int b;
  
  public final float c;
  
  public final float d;
  
  public e(int paramInt1, int paramInt2) {
    this(paramInt1, paramInt2, 2048.0F);
  }
  
  public e(int paramInt1, int paramInt2, float paramFloat) {
    this(paramInt1, paramInt2, paramFloat, 0.6666667F);
  }
  
  public e(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2) {
    boolean bool1;
    boolean bool2 = true;
    if (paramInt1 > 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    i.a(bool1);
    if (paramInt2 > 0) {
      bool1 = bool2;
    } else {
      bool1 = false;
    } 
    i.a(bool1);
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramFloat1;
    this.d = paramFloat2;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof e))
      return false; 
    paramObject = paramObject;
    return (this.a == ((e)paramObject).a && this.b == ((e)paramObject).b);
  }
  
  public int hashCode() {
    return b.a(this.a, this.b);
  }
  
  public String toString() {
    return String.format(null, "%dx%d", new Object[] { Integer.valueOf(this.a), Integer.valueOf(this.b) });
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/e/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */