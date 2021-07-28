package e.f.a.e.i.n;

import java.util.NoSuchElementException;

final class y1 extends a2 {
  private int c = 0;
  
  private final int d = this.e.zza();
  
  y1(z1 paramz1) {}
  
  public final boolean hasNext() {
    return (this.c < this.d);
  }
  
  public final byte zza() {
    int i = this.c;
    if (i < this.d) {
      this.c = i + 1;
      return this.e.g(i);
    } 
    throw new NoSuchElementException();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/y1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */