package e.d.c.o.a0;

import e.d.b.m;
import e.d.c.j;

public class s extends j<t> {
  public s(t paramt) {
    super(paramt);
  }
  
  public String a() {
    return a(6, new String[] { "ISO80", null, "ISO160", null, "ISO320", "ISO100" });
  }
  
  public String b() {
    return a(4, 1, new String[] { "Color", "Monochrome" });
  }
  
  public String c() {
    return a(11, new String[] { "None", "Fisheye converter" });
  }
  
  public String c(int paramInt) {
    switch (paramInt) {
      default:
        return super.c(paramInt);
      case 11:
        return c();
      case 10:
        return d();
      case 8:
        return e();
      case 7:
        return h();
      case 6:
        return a();
      case 5:
        return f();
      case 4:
        return b();
      case 3:
        break;
    } 
    return g();
  }
  
  public String d() {
    m m = ((t)this.a).n(10);
    if (m == null)
      return null; 
    if (m.b() == 0L)
      return "No digital zoom"; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(m.a(true));
    stringBuilder.append("x digital zoom");
    return stringBuilder.toString();
  }
  
  public String e() {
    m m = ((t)this.a).n(8);
    return (m == null) ? null : ((m.b() == 1L && m.a() == 0L) ? "Infinite" : m.a(true));
  }
  
  public String f() {
    return a(5, new String[] { "Normal", "Bright +", "Bright -", "Contrast +", "Contrast -" });
  }
  
  public String g() {
    return a(3, 1, new String[] { "VGA Basic", "VGA Normal", "VGA Fine", "SXGA Basic", "SXGA Normal", "SXGA Fine" });
  }
  
  public String h() {
    return a(7, new String[] { "Auto", "Preset", "Daylight", "Incandescence", "Florescence", "Cloudy", "SpeedLight" });
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/o/a0/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */