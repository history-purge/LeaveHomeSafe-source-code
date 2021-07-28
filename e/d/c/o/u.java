package e.d.c.o;

import e.d.c.j;

public class u extends j<v> {
  public u(v paramv) {
    super(paramv);
  }
  
  public String c(int paramInt) {
    return (paramInt != 1 && paramInt != 5 && paramInt != 9 && paramInt != 13 && paramInt != 17 && paramInt != 21 && paramInt != 25) ? super.c(paramInt) : j(paramInt);
  }
  
  public String j(int paramInt) {
    Integer integer = ((v)this.a).k(paramInt);
    return (integer == null) ? null : a(integer.shortValue());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/o/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */