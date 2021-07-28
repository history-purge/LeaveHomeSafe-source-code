package e.d.c.o.a0;

import e.d.c.j;

public class o0 extends j<p0> {
  public o0(p0 paramp0) {
    super(paramp0);
  }
  
  public String a() {
    return a(1, new String[] { "Auto", "Night-scene", "Manual", null, "Multiple" });
  }
  
  public String b() {
    return a(23, 1, new String[] { "Normal", "Black & White", "Sepia" });
  }
  
  public String c() {
    return a(12, new String[] { "Normal", "Low", "High" });
  }
  
  public String c(int paramInt) {
    if (paramInt != 1) {
      if (paramInt != 2) {
        if (paramInt != 3) {
          if (paramInt != 4) {
            if (paramInt != 7) {
              if (paramInt != 20) {
                if (paramInt != 23) {
                  switch (paramInt) {
                    default:
                      return super.c(paramInt);
                    case 13:
                      return i();
                    case 12:
                      return c();
                    case 11:
                      return j();
                    case 10:
                      break;
                  } 
                  return d();
                } 
                return b();
              } 
              return g();
            } 
            return k();
          } 
          return e();
        } 
        return f();
      } 
      return h();
    } 
    return a();
  }
  
  public String d() {
    Float float_ = ((p0)this.a).h(10);
    return (float_ == null) ? null : ((float_.floatValue() == 0.0F) ? "Off" : Float.toString(float_.floatValue()));
  }
  
  public String e() {
    return a(4, 1, new String[] { "Auto", "Flash On", null, "Flash Off", null, "Red-eye Reduction" });
  }
  
  public String f() {
    return a(3, 2, new String[] { "Custom", "Auto" });
  }
  
  public String g() {
    Integer integer = ((p0)this.a).k(20);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    if (i != 10) {
      if (i != 16) {
        if (i != 100) {
          if (i != 200) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown (");
            stringBuilder.append(integer);
            stringBuilder.append(")");
            return stringBuilder.toString();
          } 
          return "ISO 200";
        } 
        return "ISO 100";
      } 
      return "ISO 200";
    } 
    return "ISO 100";
  }
  
  public String h() {
    return a(2, new String[] { "Good", "Better", "Best" });
  }
  
  public String i() {
    return a(13, new String[] { "Normal", "Low", "High" });
  }
  
  public String j() {
    return a(11, new String[] { "Normal", "Soft", "Hard" });
  }
  
  public String k() {
    return a(7, new String[] { "Auto", "Daylight", "Shade", "Tungsten", "Fluorescent", "Manual" });
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/o/a0/o0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */