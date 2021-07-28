package e.d.c.l;

import e.d.c.j;

public class a extends j<b> {
  public a(b paramb) {
    super(paramb);
  }
  
  public String c(int paramInt) {
    return (paramInt != 6 && paramInt != 7) ? super.c(paramInt) : j(paramInt);
  }
  
  public String j(int paramInt) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(((b)this.a).p(paramInt));
    stringBuilder.append(" pixels");
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/l/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */