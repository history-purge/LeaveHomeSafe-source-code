package e.d.c.s;

import e.d.c.j;

public class a extends j<b> {
  public a(b paramb) {
    super(paramb);
  }
  
  public String a() {
    String str;
    Integer integer = ((b)this.a).k(4);
    if (integer == null)
      return null; 
    if (integer.intValue() == 0)
      return "No palette"; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(integer);
    stringBuilder.append(" colour");
    if (integer.intValue() == 1) {
      str = "";
    } else {
      str = "s";
    } 
    stringBuilder.append(str);
    return stringBuilder.toString();
  }
  
  public String b() {
    int i;
    Integer integer = ((b)this.a).k(3);
    if (integer == null)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    if (integer.intValue() == 0) {
      i = 256;
    } else {
      i = integer.intValue();
    } 
    stringBuilder.append(i);
    stringBuilder.append(" pixels");
    return stringBuilder.toString();
  }
  
  public String c() {
    return a(1, 1, new String[] { "Icon", "Cursor" });
  }
  
  public String c(int paramInt) {
    return (paramInt != 1) ? ((paramInt != 2) ? ((paramInt != 3) ? ((paramInt != 4) ? super.c(paramInt) : a()) : b()) : d()) : c();
  }
  
  public String d() {
    int i;
    Integer integer = ((b)this.a).k(2);
    if (integer == null)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    if (integer.intValue() == 0) {
      i = 256;
    } else {
      i = integer.intValue();
    } 
    stringBuilder.append(i);
    stringBuilder.append(" pixels");
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/s/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */