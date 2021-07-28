package e.d.c.a0;

import e.d.c.j;

public class h extends j<i> {
  public h(i parami) {
    super(parami);
  }
  
  public String a() {
    String str;
    Integer integer = ((i)this.a).k(4);
    if (integer == null)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(integer);
    stringBuilder.append(" bit");
    if (integer.intValue() == 1) {
      str = "";
    } else {
      str = "s";
    } 
    stringBuilder.append(str);
    stringBuilder.append(" per channel");
    return stringBuilder.toString();
  }
  
  public String b() {
    String str;
    Integer integer = ((i)this.a).k(1);
    if (integer == null)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(integer);
    stringBuilder.append(" channel");
    if (integer.intValue() == 1) {
      str = "";
    } else {
      str = "s";
    } 
    stringBuilder.append(str);
    return stringBuilder.toString();
  }
  
  public String c() {
    return a(5, new String[] { "Bitmap", "Grayscale", "Indexed", "RGB", "CMYK", null, null, "Multichannel", "Duotone", "Lab" });
  }
  
  public String c(int paramInt) {
    return (paramInt != 1) ? ((paramInt != 2) ? ((paramInt != 3) ? ((paramInt != 4) ? ((paramInt != 5) ? super.c(paramInt) : c()) : a()) : e()) : d()) : b();
  }
  
  public String d() {
    String str;
    Integer integer = ((i)this.a).k(2);
    if (integer == null)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(integer);
    stringBuilder.append(" pixel");
    if (integer.intValue() == 1) {
      str = "";
    } else {
      str = "s";
    } 
    stringBuilder.append(str);
    return stringBuilder.toString();
  }
  
  public String e() {
    StringBuilder stringBuilder;
    try {
      Integer integer = ((i)this.a).k(3);
      if (integer == null)
        return null; 
      stringBuilder = new StringBuilder();
      stringBuilder.append(integer);
      stringBuilder.append(" pixel");
      if (integer.intValue() == 1) {
        null = "";
        stringBuilder.append(null);
        return stringBuilder.toString();
      } 
    } catch (Exception exception) {
      return null;
    } 
    null = "s";
    stringBuilder.append(null);
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/a0/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */