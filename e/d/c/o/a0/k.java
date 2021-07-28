package e.d.c.o.a0;

import e.d.c.j;

public class k extends j<l> {
  public k(l paraml) {
    super(paraml);
  }
  
  public String a() {
    return a(10, new String[] { "Off", "On" });
  }
  
  public String b() {
    Integer integer = ((l)this.a).k(102);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    if (i != 1)
      if (i != 2) {
        if (i != 3) {
          if (i != 4) {
            if (i != 32) {
              if (i != 64) {
                if (i != 256) {
                  if (i != 512) {
                    if (i != 8192) {
                      if (i != 16384) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Unknown (");
                        stringBuilder.append(integer);
                        stringBuilder.append(")");
                        return stringBuilder.toString();
                      } 
                      return "Sepia";
                    } 
                  } else {
                    return "Neutral Color";
                  } 
                } else {
                  return "Saturated Color";
                } 
              } else {
                return "Neutral Color";
              } 
            } else {
              return "Saturated Color";
            } 
          } else {
            return "B&W Red Filter";
          } 
        } else {
          return "B&W Yellow Filter";
        } 
      } else {
        return "Sepia";
      }  
    return "B&W";
  }
  
  public String c() {
    return a(93, new String[] { "No", "Yes" });
  }
  
  public String c(int paramInt) {
    return (paramInt != 9) ? ((paramInt != 10) ? ((paramInt != 27) ? ((paramInt != 56) ? ((paramInt != 64) ? ((paramInt != 102) ? ((paramInt != 107) ? ((paramInt != 92) ? ((paramInt != 93) ? super.c(paramInt) : c()) : d()) : g()) : b()) : i()) : e()) : h()) : a()) : f();
  }
  
  public String d() {
    Integer integer = ((l)this.a).k(92);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    if (i != 0) {
      if (i != 1)
        if (i != 2) {
          if (i != 3) {
            if (i != 16) {
              if (i != 32) {
                if (i != 64) {
                  StringBuilder stringBuilder = new StringBuilder();
                  stringBuilder.append("Unknown (");
                  stringBuilder.append(integer);
                  stringBuilder.append(")");
                  return stringBuilder.toString();
                } 
                return "Red Eye";
              } 
              return "Off";
            } 
          } else {
            return "Red Eye";
          } 
        } else {
          return "Off";
        }  
      return "Fill Flash";
    } 
    return "Auto";
  }
  
  public String e() {
    return a(56, new String[] { "Normal", null, "Macro" });
  }
  
  public String f() {
    return a(9, 1, new String[] { "Fine", "Normal" });
  }
  
  public String g() {
    return a(107, new String[] { "Normal" });
  }
  
  public String h() {
    Integer integer = ((l)this.a).k(27);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    if (i != 0) {
      if (i != 8) {
        if (i != 32) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Unknown (");
          stringBuilder.append(integer);
          stringBuilder.append(")");
          return stringBuilder.toString();
        } 
        return "Manual";
      } 
      return "Aperture Priority";
    } 
    return "Auto";
  }
  
  public String i() {
    return a(64, new String[] { "Auto", "Flash", "Tungsten", "Daylight" });
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/o/a0/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */