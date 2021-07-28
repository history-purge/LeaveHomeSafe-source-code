package e.f.a.e.i.d;

import java.io.IOException;

public class w4 {
  protected volatile int c = -1;
  
  public static final void a(w4 paramw4, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    try {
      p4 p4 = p4.a(paramArrayOfbyte, 0, paramInt2);
      paramw4.a(p4);
      p4.a();
      return;
    } catch (IOException iOException) {
      throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", iOException);
    } 
  }
  
  public final int a() {
    int i = b();
    this.c = i;
    return i;
  }
  
  public void a(p4 paramp4) {}
  
  protected int b() {
    return 0;
  }
  
  public w4 c() {
    return (w4)super.clone();
  }
  
  public String toString() {
    return y4.a(this);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/w4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */