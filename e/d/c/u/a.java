package e.d.c.u;

import e.d.c.j;

public class a extends j<b> {
  public a(b paramb) {
    super(paramb);
  }
  
  public String a() {
    Integer integer = ((b)this.a).k(7);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    return (i != 0) ? ((i != 1) ? ((i != 2) ? "unit" : "centimetre") : "inch") : "none";
  }
  
  public String b() {
    String str;
    Integer integer = ((b)this.a).k(8);
    if (integer == null)
      return null; 
    if (integer.intValue() == 1) {
      str = "";
    } else {
      str = "s";
    } 
    return String.format("%d dot%s", new Object[] { integer, str });
  }
  
  public String c() {
    String str;
    Integer integer = ((b)this.a).k(10);
    if (integer == null)
      return null; 
    if (integer.intValue() == 1) {
      str = "";
    } else {
      str = "s";
    } 
    return String.format("%d dot%s", new Object[] { integer, str });
  }
  
  public String c(int paramInt) {
    return (paramInt != 5) ? ((paramInt != 10) ? ((paramInt != 7) ? ((paramInt != 8) ? super.c(paramInt) : b()) : a()) : c()) : d();
  }
  
  public String d() {
    Integer integer = ((b)this.a).k(5);
    return (integer == null) ? null : String.format("%d.%d", new Object[] { Integer.valueOf((integer.intValue() & 0xFF00) >> 8), Integer.valueOf(integer.intValue() & 0xFF) });
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/u/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */