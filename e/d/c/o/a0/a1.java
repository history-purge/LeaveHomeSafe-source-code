package e.d.c.o.a0;

import e.d.c.j;

public class a1 extends j<b1> {
  public a1(b1 paramb1) {
    super(paramb1);
  }
  
  private String a() {
    String str = ((b1)this.a).p(8);
    if (str == null || str.length() == 0)
      return null; 
    char c = str.charAt(0);
    return (c != 'A') ? ((c != 'M') ? ((c != 'P') ? ((c != 'S') ? str : "Shutter Speed Priority AE") : "Program AE") : "Manual") : "Aperture Priority AE";
  }
  
  private String b() {
    String str = ((b1)this.a).p(9);
    if (str == null || str.length() == 0)
      return null; 
    char c = str.charAt(0);
    return (c != '8') ? ((c != 'A') ? ((c != 'C') ? str : "Center Weighted Average") : "Average") : "Multi Segment";
  }
  
  public String c(int paramInt) {
    return (paramInt != 8) ? ((paramInt != 9) ? super.c(paramInt) : b()) : a();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/o/a0/a1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */