package e.d.c.o.a0;

import e.d.c.j;

public class g extends j<h> {
  public g(h paramh) {
    super(paramh);
  }
  
  public String a() {
    byte[] arrayOfByte = ((h)this.a).d(8192);
    if (arrayOfByte == null)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("<");
    stringBuilder.append(arrayOfByte.length);
    stringBuilder.append(" bytes of image data>");
    return stringBuilder.toString();
  }
  
  public String b() {
    return a(12308, new String[] { "Off", "On" });
  }
  
  public String c() {
    return a(12309, new String[] { "Off" });
  }
  
  public String c(int paramInt) {
    if (paramInt != 2) {
      if (paramInt != 3) {
        if (paramInt != 4) {
          if (paramInt != 8) {
            if (paramInt != 9) {
              if (paramInt != 13) {
                if (paramInt != 20) {
                  if (paramInt != 25) {
                    if (paramInt != 29) {
                      if (paramInt != 8192) {
                        if (paramInt != 8226) {
                          if (paramInt != 8244) {
                            if (paramInt != 12294) {
                              if (paramInt != 8209) {
                                if (paramInt != 8210) {
                                  switch (paramInt) {
                                    default:
                                      switch (paramInt) {
                                        default:
                                          switch (paramInt) {
                                            default:
                                              return super.c(paramInt);
                                            case 12311:
                                              return f();
                                            case 12310:
                                              return e();
                                            case 12309:
                                              return c();
                                            case 12308:
                                              break;
                                          } 
                                          return b();
                                        case 12291:
                                          return j();
                                        case 12290:
                                          return n();
                                        case 12289:
                                          return r();
                                        case 12288:
                                          break;
                                      } 
                                      return p();
                                    case 33:
                                      return s();
                                    case 32:
                                      return d();
                                    case 31:
                                      break;
                                  } 
                                  return q();
                                } 
                                return y();
                              } 
                              return z();
                            } 
                            return w();
                          } 
                          return g();
                        } 
                        return m();
                      } 
                      return a();
                    } 
                    return h();
                  } 
                  return x();
                } 
                return l();
              } 
              return i();
            } 
            return k();
          } 
          return o();
        } 
        return u();
      } 
      return v();
    } 
    return t();
  }
  
  public String d() {
    return a(32, new String[] { "-1", "Normal", "+1" });
  }
  
  public String e() {
    return a(12310, new String[] { "Off" });
  }
  
  public String f() {
    return a(12311, new String[] { "Off" });
  }
  
  public String g() {
    return a(8244, new String[] { "Off" });
  }
  
  public String h() {
    Double double_ = ((h)this.a).g(29);
    return (double_ == null) ? null : j.b(double_.doubleValue() / 10.0D);
  }
  
  public String i() {
    return a(13, new String[] { "Normal", "Macro" });
  }
  
  public String j() {
    Integer integer = ((h)this.a).k(12291);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    if (i != 1) {
      if (i != 6) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown (");
        stringBuilder.append(integer);
        stringBuilder.append(")");
        return stringBuilder.toString();
      } 
      return "Multi-Area Focus";
    } 
    return "Fixation";
  }
  
  public String k() {
    Integer integer = ((h)this.a).k(9);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    if (i != 0) {
      if (i != 36) {
        if (i != 4) {
          if (i != 5) {
            StringBuilder stringBuilder;
            switch (i) {
              default:
                stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown (");
                stringBuilder.append(integer);
                stringBuilder.append(")");
                return stringBuilder.toString();
              case 22:
                return "2304 x 1728 pixels";
              case 21:
                return "2592 x 1944 pixels";
              case 20:
                break;
            } 
            return "2288 x 1712 pixels";
          } 
          return "2048 x 1536 pixels";
        } 
        return "1600 x 1200 pixels";
      } 
      return "3008 x 2008 pixels";
    } 
    return "640 x 480 pixels";
  }
  
  public String l() {
    Integer integer = ((h)this.a).k(20);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    if (i != 3) {
      if (i != 4) {
        if (i != 6) {
          if (i != 9) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown (");
            stringBuilder.append(integer);
            stringBuilder.append(")");
            return stringBuilder.toString();
          } 
          return "200";
        } 
        return "100";
      } 
      return "64";
    } 
    return "50";
  }
  
  public String m() {
    Integer integer = ((h)this.a).k(8226);
    if (integer == null)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(Integer.toString(integer.intValue()));
    stringBuilder.append(" mm");
    return stringBuilder.toString();
  }
  
  public String n() {
    return a(12290, 3, new String[] { "Fine" });
  }
  
  public String o() {
    return a(8, 1, new String[] { "Fine", "Super Fine" });
  }
  
  public String p() {
    return a(12288, 2, new String[] { "Normal" });
  }
  
  public String q() {
    return a(31, new String[] { "-1", "Normal", "+1" });
  }
  
  public String r() {
    return a(12289, 1, new String[] { "Off" });
  }
  
  public String s() {
    return a(33, new String[] { "-1", "Normal", "+1" });
  }
  
  public String t() {
    int[] arrayOfInt = ((h)this.a).j(2);
    if (arrayOfInt == null || arrayOfInt.length != 2)
      return ((h)this.a).p(2); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(arrayOfInt[0]);
    stringBuilder.append(" x ");
    stringBuilder.append(arrayOfInt[1]);
    stringBuilder.append(" pixels");
    return stringBuilder.toString();
  }
  
  public String u() {
    return ((h)this.a).p(4);
  }
  
  public String v() {
    Integer integer = ((h)this.a).k(3);
    if (integer == null)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(Integer.toString(integer.intValue()));
    stringBuilder.append(" bytes");
    return stringBuilder.toString();
  }
  
  public String w() {
    return ((h)this.a).p(12294);
  }
  
  public String x() {
    return a(25, new String[] { "Auto", "Daylight", "Shade", "Tungsten", "Florescent", "Manual" });
  }
  
  public String y() {
    Integer integer = ((h)this.a).k(8210);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    if (i != 0) {
      if (i != 1) {
        if (i != 4 && i != 12) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Unknown (");
          stringBuilder.append(integer);
          stringBuilder.append(")");
          return stringBuilder.toString();
        } 
        return "Flash";
      } 
      return "Auto";
    } 
    return "Manual";
  }
  
  public String z() {
    return ((h)this.a).p(8209);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/o/a0/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */