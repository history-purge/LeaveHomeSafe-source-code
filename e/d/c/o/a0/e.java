package e.d.c.o.a0;

import e.d.c.j;

public class e extends j<f> {
  public e(f paramf) {
    super(paramf);
  }
  
  public String a() {
    Integer integer = ((f)this.a).k(20);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    if (i != 64) {
      if (i != 80) {
        if (i != 100) {
          if (i != 125) {
            if (i != 244) {
              if (i != 250) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown (");
                stringBuilder.append(integer);
                stringBuilder.append(")");
                return stringBuilder.toString();
              } 
              return "+2.0";
            } 
            return "+3.0";
          } 
          return "+1.0";
        } 
        return "High";
      } 
      return "Normal (ISO 80 equivalent)";
    } 
    return "Normal";
  }
  
  public String b() {
    return a(12, new String[] { "Normal", "Low", "High" });
  }
  
  public String c() {
    Integer integer = ((f)this.a).k(10);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    if (i != 65536) {
      if (i != 65537 && i != 131072) {
        if (i != 262144) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Unknown (");
          stringBuilder.append(integer);
          stringBuilder.append(")");
          return stringBuilder.toString();
        } 
        return "4x digital zoom";
      } 
      return "2x digital zoom";
    } 
    return "No digital zoom";
  }
  
  public String c(int paramInt) {
    if (paramInt != 20) {
      switch (paramInt) {
        default:
          switch (paramInt) {
            default:
              return super.c(paramInt);
            case 13:
              return j();
            case 12:
              return b();
            case 11:
              return k();
            case 10:
              break;
          } 
          return c();
        case 7:
          return l();
        case 6:
          return g();
        case 5:
          return d();
        case 4:
          return e();
        case 3:
          return f();
        case 2:
          return h();
        case 1:
          break;
      } 
      return i();
    } 
    return a();
  }
  
  public String d() {
    Integer integer = ((f)this.a).k(5);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    if (i != 11) {
      if (i != 13) {
        if (i != 15) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Unknown (");
          stringBuilder.append(integer);
          stringBuilder.append(")");
          return stringBuilder.toString();
        } 
        return "Strong";
      } 
      return "Normal";
    } 
    return "Weak";
  }
  
  public String e() {
    return a(4, 1, new String[] { "Auto", "On", "Off", "Red eye reduction" });
  }
  
  public String f() {
    return a(3, 2, new String[] { "Macro", "Auto focus", "Manual focus", "Infinity" });
  }
  
  public String g() {
    Integer integer = ((f)this.a).k(6);
    return (integer == null) ? null : j.b(integer.intValue());
  }
  
  public String h() {
    return a(2, 1, new String[] { "Economy", "Normal", "Fine" });
  }
  
  public String i() {
    return a(1, 1, new String[] { "Single shutter", "Panorama", "Night scene", "Portrait", "Landscape" });
  }
  
  public String j() {
    return a(13, new String[] { "Normal", "Low", "High" });
  }
  
  public String k() {
    return a(11, new String[] { "Normal", "Soft", "Hard" });
  }
  
  public String l() {
    Integer integer = ((f)this.a).k(7);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    if (i != 1) {
      if (i != 2) {
        if (i != 3) {
          if (i != 4) {
            if (i != 5) {
              if (i != 129) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown (");
                stringBuilder.append(integer);
                stringBuilder.append(")");
                return stringBuilder.toString();
              } 
              return "Manual";
            } 
            return "Shade";
          } 
          return "Florescent";
        } 
        return "Daylight";
      } 
      return "Tungsten";
    } 
    return "Auto";
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/o/a0/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */