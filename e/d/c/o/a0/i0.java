package e.d.c.o.a0;

import e.d.c.j;

public class i0 extends j<j0> {
  public i0(j0 paramj0) {
    super(paramj0);
  }
  
  public String a() {
    return a(264, new String[] { "sRGB", "Adobe RGB", "Pro Photo RGB" });
  }
  
  public String b() {
    Integer integer = ((j0)this.a).k(267);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    if (i != 0) {
      if (i != 1) {
        if (i != 6 && i != 8) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Unknown (");
          stringBuilder.append(integer);
          stringBuilder.append(")");
          return stringBuilder.toString();
        } 
        return "Edited (Portrait)";
      } 
      return "Edited (Landscape)";
    } 
    return "Original";
  }
  
  public String c() {
    return a(265, new String[] { "High Speed", "High Function", "Advanced High Speed", "Advanced High Function" });
  }
  
  public String c(int paramInt) {
    if (paramInt != 0) {
      switch (paramInt) {
        default:
          return super.c(paramInt);
        case 268:
          return e();
        case 267:
          return b();
        case 266:
          return d();
        case 265:
          return c();
        case 264:
          break;
      } 
      return a();
    } 
    return f();
  }
  
  public String d() {
    Integer integer = ((j0)this.a).k(266);
    if (integer == null)
      return null; 
    if (integer.intValue() == 0)
      return "(none)"; 
    StringBuilder stringBuilder = new StringBuilder();
    int i = integer.intValue();
    if ((i & 0x1) != 0)
      stringBuilder.append("Noise Reduction, "); 
    if ((i >> 1 & 0x1) != 0)
      stringBuilder.append("Noise Filter, "); 
    if ((i >> 2 & 0x1) != 0)
      stringBuilder.append("Noise Filter (ISO Boost), "); 
    return stringBuilder.substring(0, stringBuilder.length() - 2);
  }
  
  public String e() {
    Integer integer = ((j0)this.a).k(268);
    if (integer == null)
      return null; 
    if (integer.intValue() == 0)
      return "(none)"; 
    StringBuilder stringBuilder = new StringBuilder();
    int i = integer.intValue();
    if ((i & 0x1) != 0)
      stringBuilder.append("WB Color Temp, "); 
    if ((i >> 1 & 0x1) != 0)
      stringBuilder.append("WB Gray Point, "); 
    if ((i >> 2 & 0x1) != 0)
      stringBuilder.append("Saturation, "); 
    if ((i >> 3 & 0x1) != 0)
      stringBuilder.append("Contrast, "); 
    if ((i >> 4 & 0x1) != 0)
      stringBuilder.append("Sharpness, "); 
    if ((i >> 5 & 0x1) != 0)
      stringBuilder.append("Color Space, "); 
    if ((i >> 6 & 0x1) != 0)
      stringBuilder.append("High Function, "); 
    if ((i >> 7 & 0x1) != 0)
      stringBuilder.append("Noise Reduction, "); 
    return stringBuilder.substring(0, stringBuilder.length() - 2);
  }
  
  public String f() {
    return b(0, 4);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/o/a0/i0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */