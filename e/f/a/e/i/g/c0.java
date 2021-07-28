package e.f.a.e.i.g;

import java.io.OutputStream;

final class c0 extends OutputStream {
  private long c = 0L;
  
  final long a() {
    return this.c;
  }
  
  public final void write(int paramInt) {
    this.c++;
  }
  
  public final void write(byte[] paramArrayOfbyte) {
    this.c += paramArrayOfbyte.length;
  }
  
  public final void write(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (paramInt1 >= 0) {
      int i = paramArrayOfbyte.length;
      if (paramInt1 <= i && paramInt2 >= 0) {
        paramInt1 += paramInt2;
        if (paramInt1 <= i && paramInt1 >= 0) {
          this.c += paramInt2;
          return;
        } 
      } 
    } 
    throw new IndexOutOfBoundsException();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/g/c0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */