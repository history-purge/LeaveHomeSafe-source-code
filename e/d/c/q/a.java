package e.d.c.q;

import e.d.c.j;

public class a extends j<b> {
  public a(b paramb) {
    super(paramb);
  }
  
  public String a() {
    Integer integer = ((b)this.a).k(1);
    if (integer == null)
      return null; 
    if (integer.intValue() == 0)
      return "Infinite"; 
    if (integer.intValue() == 1)
      return "Once"; 
    if (integer.intValue() == 2)
      return "Twice"; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(integer.toString());
    stringBuilder.append(" times");
    return stringBuilder.toString();
  }
  
  public String c(int paramInt) {
    return (paramInt != 1) ? super.c(paramInt) : a();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/q/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */