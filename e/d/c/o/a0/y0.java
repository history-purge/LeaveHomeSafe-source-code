package e.d.c.o.a0;

import e.d.c.j;

public class y0 extends j<z0> {
  public y0(z0 paramz0) {
    super(paramz0);
  }
  
  private String b() {
    return a(528, new String[] { "Off", "On" });
  }
  
  private String c() {
    return a(516, 3);
  }
  
  private String d() {
    return a(539, new String[] { "Off", "On" });
  }
  
  private String e() {
    return a(549, new String[] { "Auto", "Force", "Disabled", "Red eye" });
  }
  
  private String f() {
    return a(536, new String[] { "Off", "On" });
  }
  
  private String g() {
    return a(541, new String[] { "Off", "On" });
  }
  
  private String h() {
    return a(514, new String[] { "Normal", "Macro", "View", "Manual" });
  }
  
  private String i() {
    return a(537, new String[] { "Off", "On" });
  }
  
  private String j() {
    return a(531, new String[] { "Off", "On" });
  }
  
  private String k() {
    return a(535, new String[] { "Record while down", "Press start, press stop" });
  }
  
  private String l() {
    return a(542, new String[] { "No", "Yes" });
  }
  
  private String m() {
    return a(543, new String[] { "Off", "Sport", "TV", "Night", "User 1", "User 2", "Lamp" });
  }
  
  private String n() {
    return a(532, new String[] { "Off", "On" });
  }
  
  private String o() {
    return a(548, new String[] { "5 frames/sec", "10 frames/sec", "15 frames/sec", "20 frames/sec" });
  }
  
  private String p() {
    return a(526, new String[] { "None", "Standard", "Best", "Adjust Exposure" });
  }
  
  private String q() {
    return a(534, new String[] { "Off", "On" });
  }
  
  private String r() {
    return a(527, new String[] { "Off", "On" });
  }
  
  public String a() {
    StringBuilder stringBuilder;
    Integer integer = ((z0)this.a).k(513);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    switch (i) {
      default:
        switch (i) {
          default:
            switch (i) {
              default:
                stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown (");
                stringBuilder.append(integer);
                stringBuilder.append(")");
                return stringBuilder.toString();
              case 519:
                return "Super Fine/Super High";
              case 518:
                return "Super Fine/Very High";
              case 517:
                return "Super Fine/High";
              case 516:
                return "Super Fine/Medium High";
              case 515:
                return "Super Fine/Medium";
              case 514:
                return "Super Fine/Medium Low";
              case 513:
                return "Super Fine/Low";
              case 512:
                break;
            } 
            return "Super Fine/Very Low";
          case 263:
            return "Fine/Super High";
          case 262:
            return "Fine/Very High";
          case 261:
            return "Fine/High";
          case 260:
            return "Fine/Medium High";
          case 259:
            return "Fine/Medium";
          case 258:
            return "Fine/Medium Low";
          case 257:
            return "Fine/Low";
          case 256:
            break;
        } 
        return "Fine/Very Low";
      case 7:
        return "Normal/Super High";
      case 6:
        return "Normal/Very High";
      case 5:
        return "Normal/High";
      case 4:
        return "Normal/Medium High";
      case 3:
        return "Normal/Medium";
      case 2:
        return "Normal/Medium Low";
      case 1:
        return "Normal/Low";
      case 0:
        break;
    } 
    return "Normal/Very Low";
  }
  
  public String c(int paramInt) {
    if (paramInt != 513) {
      if (paramInt != 514) {
        if (paramInt != 516) {
          if (paramInt != 539) {
            if (paramInt != 531) {
              if (paramInt != 532) {
                if (paramInt != 548) {
                  if (paramInt != 549) {
                    switch (paramInt) {
                      default:
                        switch (paramInt) {
                          default:
                            switch (paramInt) {
                              default:
                                return super.c(paramInt);
                              case 543:
                                return m();
                              case 542:
                                return l();
                              case 541:
                                break;
                            } 
                            return g();
                          case 537:
                            return i();
                          case 536:
                            return f();
                          case 535:
                            return k();
                          case 534:
                            break;
                        } 
                        return q();
                      case 528:
                        return b();
                      case 527:
                        return r();
                      case 526:
                        break;
                    } 
                    return p();
                  } 
                  return e();
                } 
                return o();
              } 
              return n();
            } 
            return j();
          } 
          return d();
        } 
        return c();
      } 
      return h();
    } 
    return a();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/o/a0/y0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */