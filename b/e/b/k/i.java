package b.e.b.k;

import java.util.Arrays;

public class i extends e implements h {
  public e[] g0 = new e[4];
  
  public int h0 = 0;
  
  public void a() {
    this.h0 = 0;
    Arrays.fill((Object[])this.g0, (Object)null);
  }
  
  public void a(e parame) {
    if (parame != this) {
      if (parame == null)
        return; 
      int j = this.h0;
      e[] arrayOfE = this.g0;
      if (j + 1 > arrayOfE.length)
        this.g0 = Arrays.<e>copyOf(arrayOfE, arrayOfE.length * 2); 
      arrayOfE = this.g0;
      j = this.h0;
      arrayOfE[j] = parame;
      this.h0 = j + 1;
    } 
  }
  
  public void a(f paramf) {}
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/e/b/k/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */