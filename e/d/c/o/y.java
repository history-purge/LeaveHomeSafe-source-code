package e.d.c.o;

import e.d.c.j;

public class y extends j<z> {
  public y(z paramz) {
    super(paramz);
  }
  
  public String c(int paramInt) {
    if (paramInt != 0) {
      Integer integer = ((z)this.a).k(paramInt);
      return (integer == null) ? null : String.format("0x%08x", new Object[] { integer });
    } 
    return super.c(paramInt);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/o/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */