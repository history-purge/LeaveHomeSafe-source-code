package e.d.c.o.a0;

import e.d.b.m;
import e.d.c.j;

public class i extends j<j> {
  public i(j paramj) {
    super(paramj);
  }
  
  private String x() {
    return b(0, 2);
  }
  
  public String a() {
    return a(4352, new String[] { "Off", "On", "No Flash & Flash" });
  }
  
  public String b() {
    return a(4866, new String[] { "AE Good", "Over Exposed" });
  }
  
  public String c() {
    return a(4864, new String[] { "No Blur Warning", "Blur warning" });
  }
  
  public String c(int paramInt) {
    if (paramInt != 0) {
      if (paramInt != 4102) {
        if (paramInt != 4107) {
          if (paramInt != 4110) {
            if (paramInt != 4352) {
              if (paramInt != 4624) {
                if (paramInt != 4112) {
                  if (paramInt != 4113) {
                    if (paramInt != 4128) {
                      if (paramInt != 4129) {
                        if (paramInt != 4144) {
                          if (paramInt != 4145) {
                            if (paramInt != 4147) {
                              if (paramInt != 4148) {
                                switch (paramInt) {
                                  default:
                                    switch (paramInt) {
                                      default:
                                        switch (paramInt) {
                                          default:
                                            return super.c(paramInt);
                                          case 5122:
                                            return g();
                                          case 5121:
                                            return j();
                                          case 5120:
                                            break;
                                        } 
                                        return f();
                                      case 4866:
                                        return b();
                                      case 4865:
                                        return o();
                                      case 4864:
                                        break;
                                    } 
                                    return c();
                                  case 4100:
                                    return v();
                                  case 4099:
                                    return d();
                                  case 4098:
                                    return w();
                                  case 4097:
                                    break;
                                } 
                                return t();
                              } 
                              return i();
                            } 
                            return h();
                          } 
                          return s();
                        } 
                        return u();
                      } 
                      return n();
                    } 
                    return q();
                  } 
                  return l();
                } 
                return m();
              } 
              return k();
            } 
            return a();
          } 
          return p();
        } 
        return r();
      } 
      return e();
    } 
    return x();
  }
  
  public String d() {
    Integer integer = ((j)this.a).k(4099);
    if (integer == null)
      return null; 
    int k = integer.intValue();
    if (k != 0) {
      if (k != 128) {
        if (k != 256) {
          if (k != 384) {
            if (k != 512) {
              if (k != 32768) {
                StringBuilder stringBuilder;
                switch (k) {
                  default:
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Unknown (");
                    stringBuilder.append(integer);
                    stringBuilder.append(")");
                    return stringBuilder.toString();
                  case 772:
                    return "B&W Sepia";
                  case 771:
                    return "B&W Blue Filter";
                  case 770:
                    return "B&W Yellow Filter";
                  case 769:
                    return "B&W Green Filter";
                  case 768:
                    break;
                } 
                return "None (B&W)";
              } 
              return "Film Simulation";
            } 
            return "Low";
          } 
          return "Medium Low";
        } 
        return "High";
      } 
      return "Medium High";
    } 
    return "Normal";
  }
  
  public String e() {
    Integer integer = ((j)this.a).k(4102);
    if (integer == null)
      return null; 
    int k = integer.intValue();
    if (k != 0) {
      if (k != 256) {
        if (k != 768) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Unknown (");
          stringBuilder.append(integer);
          stringBuilder.append(")");
          return stringBuilder.toString();
        } 
        return "Low";
      } 
      return "High";
    } 
    return "Normal";
  }
  
  public String f() {
    return a(5120, 1, new String[] { "Standard", null, "Wide" });
  }
  
  public String g() {
    Integer integer = ((j)this.a).k(5122);
    if (integer == null)
      return null; 
    int k = integer.intValue();
    if (k != 0) {
      if (k != 1) {
        if (k != 256) {
          if (k != 32768) {
            if (k != 512) {
              if (k != 513) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown (");
                stringBuilder.append(integer);
                stringBuilder.append(")");
                return stringBuilder.toString();
              } 
              return "Wide 2 (400%)";
            } 
            return "Wide 1 (230%)";
          } 
          return "Film Simulation";
        } 
        return "Standard (100%)";
      } 
      return "Manual";
    } 
    return "Auto (100-400%)";
  }
  
  public String h() {
    return a(4147, new String[] { "Auto", "Manual" });
  }
  
  public String i() {
    Integer integer = ((j)this.a).k(4148);
    if (integer == null)
      return null; 
    int k = integer.intValue();
    if (k != 256) {
      if (k != 512) {
        if (k != 768) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Unknown (");
          stringBuilder.append(integer);
          stringBuilder.append(")");
          return stringBuilder.toString();
        } 
        return "DR (Dynamic Range Priority)";
      } 
      return "SN (Signal to Noise Priority)";
    } 
    return "HR (High Resolution)";
  }
  
  public String j() {
    Integer integer = ((j)this.a).k(5121);
    if (integer == null)
      return null; 
    int k = integer.intValue();
    if (k != 0) {
      if (k != 256) {
        if (k != 272) {
          if (k != 288) {
            if (k != 304) {
              if (k != 512) {
                if (k != 768) {
                  if (k != 1024) {
                    if (k != 1280) {
                      if (k != 1281) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Unknown (");
                        stringBuilder.append(integer);
                        stringBuilder.append(")");
                        return stringBuilder.toString();
                      } 
                      return "Pro Neg. Hi";
                    } 
                    return "Pro Neg. Std";
                  } 
                  return "F4/Velvia";
                } 
                return "F3/Studio Portrait Ex";
              } 
              return "F2/Fujichrome (Velvia)";
            } 
            return "F1c/Studio Portrait Increased Sharpness";
          } 
          return "F1b/Studio Portrait Smooth Skin Tone (Astia)";
        } 
        return "F1a/Studio Portrait Enhanced Saturation";
      } 
      return "F1/Studio Portrait";
    } 
    return "F0/Standard (Provia) ";
  }
  
  public String k() {
    Integer integer = ((j)this.a).k(4624);
    if (integer == null)
      return null; 
    int k = integer.intValue();
    if (k != 0) {
      if (k != 16) {
        if (k != 48) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Unknown (");
          stringBuilder.append(integer);
          stringBuilder.append(")");
          return stringBuilder.toString();
        } 
        return "B&W";
      } 
      return "Chrome";
    } 
    return "Standard";
  }
  
  public String l() {
    m m = ((j)this.a).n(4113);
    if (m == null)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(m.a(false));
    stringBuilder.append(" EV (Apex)");
    return stringBuilder.toString();
  }
  
  public String m() {
    return a(4112, new String[] { "Auto", "On", "Off", "Red-eye Reduction", "External" });
  }
  
  public String n() {
    return a(4129, new String[] { "Auto Focus", "Manual Focus" });
  }
  
  public String o() {
    return a(4865, new String[] { "Good Focus", "Out Of Focus" });
  }
  
  public String p() {
    Integer integer = ((j)this.a).k(4110);
    if (integer == null)
      return null; 
    int k = integer.intValue();
    if (k != 0) {
      if (k != 256) {
        if (k != 512) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Unknown (");
          stringBuilder.append(integer);
          stringBuilder.append(")");
          return stringBuilder.toString();
        } 
        return "Weak";
      } 
      return "Strong";
    } 
    return "Normal";
  }
  
  public String q() {
    return a(4128, new String[] { "Off", "On" });
  }
  
  public String r() {
    Integer integer = ((j)this.a).k(4107);
    if (integer == null)
      return null; 
    int k = integer.intValue();
    if (k != 64) {
      if (k != 128) {
        if (k != 256) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Unknown (");
          stringBuilder.append(integer);
          stringBuilder.append(")");
          return stringBuilder.toString();
        } 
        return "N/A";
      } 
      return "Normal";
    } 
    return "Low";
  }
  
  public String s() {
    Integer integer = ((j)this.a).k(4145);
    if (integer == null)
      return null; 
    int k = integer.intValue();
    if (k != 27) {
      if (k != 28) {
        if (k != 256) {
          if (k != 512) {
            if (k != 768) {
              StringBuilder stringBuilder;
              switch (k) {
                default:
                  switch (k) {
                    default:
                      stringBuilder = new StringBuilder();
                      stringBuilder.append("Unknown (");
                      stringBuilder.append(integer);
                      stringBuilder.append(")");
                      return stringBuilder.toString();
                    case 25:
                      return "Pro Focus";
                    case 24:
                      return "Pro Low-light";
                    case 23:
                      return "Night (Tripod)";
                    case 22:
                      break;
                  } 
                  return "Panorama";
                case 20:
                  return "Portrait with Skin Correction";
                case 19:
                  return "Underwater";
                case 18:
                  return "Fireworks";
                case 17:
                  return "Snow";
                case 16:
                  return "Beach";
                case 15:
                  return "Natural Light & Flash";
                case 14:
                  return "Text";
                case 13:
                  return "Flower";
                case 12:
                  return "Party";
                case 11:
                  return "Museum";
                case 10:
                  return "Sunset";
                case 9:
                  return "Beach & Snow";
                case 8:
                  return "Anti-blur";
                case 7:
                  return "Natural Light";
                case 6:
                  return "Program AE";
                case 5:
                  return "Night scene";
                case 4:
                  return "Sports scene";
                case 3:
                  return "Macro";
                case 2:
                  return "Landscape scene";
                case 1:
                  return "Portrait scene";
                case 0:
                  break;
              } 
              return "Auto";
            } 
            return "Manual exposure";
          } 
          return "Shutter priority AE";
        } 
        return "Aperture priority AE";
      } 
      return "Cat Face Detection";
    } 
    return "Dog Face Detection";
  }
  
  public String t() {
    Integer integer = ((j)this.a).k(4097);
    if (integer == null)
      return null; 
    int k = integer.intValue();
    if (k != 1) {
      if (k != 2) {
        if (k != 3) {
          if (k != 4) {
            if (k != 5) {
              if (k != 130) {
                if (k != 132) {
                  if (k != 32768) {
                    if (k != 65535) {
                      StringBuilder stringBuilder = new StringBuilder();
                      stringBuilder.append("Unknown (");
                      stringBuilder.append(integer);
                      stringBuilder.append(")");
                      return stringBuilder.toString();
                    } 
                    return "N/A";
                  } 
                  return "Film Simulation";
                } 
                return "Medium Hard";
              } 
              return "Medium Soft";
            } 
            return "Hardest";
          } 
          return "Hard";
        } 
        return "Normal";
      } 
      return "Soft";
    } 
    return "Softest";
  }
  
  public String u() {
    return a(4144, new String[] { "Off", "On" });
  }
  
  public String v() {
    Integer integer = ((j)this.a).k(4100);
    if (integer == null)
      return null; 
    int k = integer.intValue();
    if (k != 0) {
      if (k != 128) {
        if (k != 256) {
          if (k != 384) {
            if (k != 512) {
              if (k != 768) {
                if (k != 32768) {
                  StringBuilder stringBuilder = new StringBuilder();
                  stringBuilder.append("Unknown (");
                  stringBuilder.append(integer);
                  stringBuilder.append(")");
                  return stringBuilder.toString();
                } 
                return "Film Simulation";
              } 
              return "None (B&W)";
            } 
            return "Low";
          } 
          return "Medium Low";
        } 
        return "High";
      } 
      return "Medium High";
    } 
    return "Normal";
  }
  
  public String w() {
    Integer integer = ((j)this.a).k(4098);
    if (integer == null)
      return null; 
    int k = integer.intValue();
    if (k != 0) {
      if (k != 256) {
        if (k != 512) {
          if (k != 1024) {
            if (k != 1280) {
              if (k != 4080) {
                StringBuilder stringBuilder;
                switch (k) {
                  default:
                    switch (k) {
                      default:
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Unknown (");
                        stringBuilder.append(integer);
                        stringBuilder.append(")");
                        return stringBuilder.toString();
                      case 3844:
                        return "Custom White Balance 5";
                      case 3843:
                        return "Custom White Balance 4";
                      case 3842:
                        return "Custom White Balance 3";
                      case 3841:
                        return "Custom White Balance 2";
                      case 3840:
                        break;
                    } 
                    return "Custom White Balance";
                  case 772:
                    return "Living Room Warm White Fluorescent";
                  case 771:
                    return "Warm White Fluorescent";
                  case 770:
                    return "White Fluorescent";
                  case 769:
                    return "Day White Fluorescent";
                  case 768:
                    break;
                } 
                return "Daylight Fluorescent";
              } 
              return "Kelvin";
            } 
            return "Flash";
          } 
          return "Incandescence";
        } 
        return "Cloudy";
      } 
      return "Daylight";
    } 
    return "Auto";
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/o/a0/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */