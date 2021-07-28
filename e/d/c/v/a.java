package e.d.c.v;

import e.d.c.j;

public class a extends j<b> {
  public a(b paramb) {
    super(paramb);
  }
  
  public String a() {
    Integer integer = ((b)this.a).k(5);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    if (i != 16) {
      if (i != 17) {
        if (i != 19) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Unknown extension code ");
          stringBuilder.append(integer);
          return stringBuilder.toString();
        } 
        return "Thumbnail stored using 3 bytes/pixel";
      } 
      return "Thumbnail stored using 1 byte/pixel";
    } 
    return "Thumbnail coded using JPEG";
  }
  
  public String c(int paramInt) {
    return (paramInt != 5) ? super.c(paramInt) : a();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/v/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */