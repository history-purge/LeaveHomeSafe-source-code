package e.d.c.o.a0;

import e.d.c.j;

public class c1 extends j<d1> {
  public c1(d1 paramd1) {
    super(paramd1);
  }
  
  public String A() {
    Integer integer = ((d1)this.a).k(261);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    if (i != 0) {
      if (i != 72) {
        if (i != 80) {
          if (i != 96) {
            if (i != 136) {
              if (i != 144) {
                if (i != 160) {
                  StringBuilder stringBuilder = new StringBuilder();
                  stringBuilder.append("Unknown (");
                  stringBuilder.append(integer);
                  stringBuilder.append(")");
                  return stringBuilder.toString();
                } 
                return "Minolta AF 1.4x APO";
              } 
              return "Minolta AF 1.4x APO II";
            } 
            return "Minolta/Sony AF 1.4x APO (D)";
          } 
          return "Minolta AF 2x APO";
        } 
        return "Minolta AF 2x APO II";
      } 
      return "Minolta/Sony AF 2x APO (D)";
    } 
    return "None";
  }
  
  public String B() {
    Integer integer = ((d1)this.a).k(8209);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    return (i != -1) ? ((i != 0) ? ((i != 2) ? String.format("Unknown (%d)", new Object[] { integer }) : "Auto") : "Off") : "N/A";
  }
  
  public String C() {
    Integer integer = ((d1)this.a).k(277);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    if (i != 0) {
      if (i != 1) {
        if (i != 16) {
          if (i != 32) {
            if (i != 48) {
              if (i != 64) {
                if (i != 80) {
                  if (i != 96) {
                    if (i != 112) {
                      StringBuilder stringBuilder = new StringBuilder();
                      stringBuilder.append("Unknown (");
                      stringBuilder.append(integer);
                      stringBuilder.append(")");
                      return stringBuilder.toString();
                    } 
                    return "Custom";
                  } 
                  return "Fluorescent";
                } 
                return "Flash";
              } 
              return "Tungsten";
            } 
            return "Shade";
          } 
          return "Cloudy";
        } 
        return "Daylight";
      } 
      return "Color Temperature/Color Filter";
    } 
    return "Auto";
  }
  
  public String D() {
    return a(45092, new String[] { "ISO Setting Used", "High Key", "Low Key" });
  }
  
  public String a() {
    Integer integer = ((d1)this.a).k(45124);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    if (i != 0) {
      if (i != 1) {
        if (i != 65535) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Unknown (");
          stringBuilder.append(integer);
          stringBuilder.append(")");
          return stringBuilder.toString();
        } 
        return "n/a";
      } 
      return "Auto";
    } 
    return "Off";
  }
  
  public String b() {
    Integer integer = ((d1)this.a).k(45123);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    if (i != 0) {
      if (i != 1) {
        if (i != 2) {
          if (i != 3) {
            if (i != 4) {
              if (i != 6) {
                if (i != 65535) {
                  if (i != 14) {
                    if (i != 15) {
                      StringBuilder stringBuilder = new StringBuilder();
                      stringBuilder.append("Unknown (");
                      stringBuilder.append(integer);
                      stringBuilder.append(")");
                      return stringBuilder.toString();
                    } 
                    return "Face Detected";
                  } 
                  return "Manual Focus";
                } 
                return "n/a";
              } 
              return "Touch";
            } 
            return "Flexible Spot";
          } 
          return "Spot";
        } 
        return "Center";
      } 
      return "Multi";
    } 
    return "Default";
  }
  
  public String c() {
    return a(8222, new String[] { 
          "Auto", "Center", "Top", "Upper-right", "Right", "Lower-right", "Bottom", "Lower-left", "Left", "Upper-left\t  \t", 
          "Far Right", "Far Left", "Upper-middle", "Near Right", "Lower-middle", "Near Left", "Upper Far Right", "Lower Far Right", "Lower Far Left", "Upper Far Left" });
  }
  
  public String c(int paramInt) {
    switch (paramInt) {
      default:
        return super.c(paramInt);
      case 45134:
        return s();
      case 45131:
        return d();
      case 45130:
        return x();
      case 45129:
        return v();
      case 45128:
        return l();
      case 45127:
        return q();
      case 45124:
        return a();
      case 45123:
        return b();
      case 45121:
        return j();
      case 45120:
        return t();
      case 45097:
        return f();
      case 45094:
        return p();
      case 45093:
        return i();
      case 45092:
        return D();
      case 45091:
        return w();
      case 45089:
        return g();
      case 45057:
        return z();
      case 8222:
        return c();
      case 8219:
        return m();
      case 8214:
        return e();
      case 8211:
        return h();
      case 8210:
        return r();
      case 8209:
        return B();
      case 8207:
        return y();
      case 8206:
        return u();
      case 8201:
        return n();
      case 277:
        return C();
      case 261:
        return A();
      case 260:
        return k();
      case 258:
        break;
    } 
    return o();
  }
  
  public String d() {
    Integer integer = ((d1)this.a).k(45131);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    return (i != 0) ? ((i != 1) ? ((i != 2) ? ((i != 65535) ? String.format("Unknown (%d)", new Object[] { integer }) : "N/A") : "On (Shooting)") : "On (Continuous)") : "Off";
  }
  
  public String e() {
    return a(8214, new String[] { "No", "Yes" });
  }
  
  public String f() {
    Integer integer = ((d1)this.a).k(45097);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    switch (i) {
      default:
        switch (i) {
          default:
            switch (i) {
              default:
                return String.format("Unknown (%d)", new Object[] { integer });
              case 105:
                return "Autumn Leaves";
              case 104:
                return "Night View";
              case 103:
                return "Light";
              case 102:
                return "Deep";
              case 101:
                return "Clear";
              case 100:
                break;
            } 
            break;
          case 17:
            return "Sepia";
          case 16:
            return "Autumn";
          case 15:
          case 14:
          case 13:
          
          case 12:
            break;
        } 
        return "Neutral";
      case 7:
        return "Adobe RGB";
      case 6:
        return "Black & White";
      case 5:
        return "Night Portrait";
      case 4:
        return "Sunset";
      case 3:
        return "Landscape";
      case 2:
        return "Portrait";
      case 1:
        return "Vivid";
      case 0:
        break;
    } 
    return "Standard";
  }
  
  public String g() {
    Integer integer = ((d1)this.a).k(45089);
    if (integer == null)
      return null; 
    if (integer.intValue() == 0)
      return "Auto"; 
    int i = integer.intValue();
    return String.format("%d K", new Object[] { Integer.valueOf((integer.intValue() & 0xFF000000) >> 24 | (i & 0xFF0000) >> 8) });
  }
  
  public String h() {
    Integer integer = ((d1)this.a).k(8211);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    return (i != -1) ? ((i != 0) ? ((i != 2) ? String.format("Unknown (%d)", new Object[] { integer }) : "Auto") : "Off") : "N/A";
  }
  
  public String i() {
    Integer integer = ((d1)this.a).k(45093);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    if (i != 0) {
      if (i != 1) {
        if (i != 2) {
          if (i != 3) {
            switch (i) {
              default:
                switch (i) {
                  default:
                    return String.format("Unknown (%d)", new Object[] { integer });
                  case 20:
                    return "LV5";
                  case 19:
                    return "LV4";
                  case 18:
                    return "LV3";
                  case 17:
                    return "LV2";
                  case 16:
                    break;
                } 
                return "LV1";
              case 12:
                return "Advanced LV5";
              case 11:
                return "Advanced LV4";
              case 10:
                return "Advanced LV3";
              case 9:
                return "Advanced LV2";
              case 8:
                break;
            } 
            return "Advanced LV1";
          } 
          return "Auto";
        } 
        return "Advanced Auto";
      } 
      return "Standard";
    } 
    return "Off";
  }
  
  public String j() {
    Integer integer = ((d1)this.a).k(45121);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    if (i != 29) {
      if (i != 65535) {
        switch (i) {
          default:
            switch (i) {
              default:
                switch (i) {
                  default:
                    return String.format("Unknown (%d)", new Object[] { integer });
                  case 42:
                    return "3D Image";
                  case 41:
                    return "Soft Skin";
                  case 40:
                    return "Background Defocus";
                  case 39:
                    return "Superior Auto";
                  case 38:
                    return "Backlight Correction HDR";
                  case 37:
                    return "Pet";
                  case 36:
                    return "Anti Motion Blur";
                  case 35:
                    return "Handheld Night Shot";
                  case 34:
                    return "Panorama";
                  case 33:
                    break;
                } 
                return "Food";
              case 20:
                return "Advanced Sports Shooting";
              case 19:
                return "Macro";
              case 18:
                break;
            } 
            return "High Sensitivity";
          case 15:
            return "Manual";
          case 14:
            return "Smile Shutter";
          case 13:
            return "Fireworks";
          case 12:
            return "Soft Snap/Portrait";
          case 11:
            return "Twilight Portrait";
          case 10:
            return "Hi-Speed Shutter";
          case 9:
            return "Night Scene / Twilight";
          case 8:
            return "Shutter Priority";
          case 7:
            return "Aperture Priority";
          case 6:
            return "Auto";
          case 5:
            return "Landscape";
          case 4:
            return "Snow";
          case 3:
            return "Sports";
          case 2:
            return "Beach";
          case 1:
            return "Portrait";
          case 0:
            break;
        } 
        return "Program";
      } 
      return "N/A";
    } 
    return "Underwater";
  }
  
  public String k() {
    return a(260, "%d EV");
  }
  
  public String l() {
    Integer integer = ((d1)this.a).k(45128);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    if (i != -32768) {
      if (i != 128) {
        if (i != 32767) {
          StringBuilder stringBuilder;
          switch (i) {
            default:
              stringBuilder = new StringBuilder();
              stringBuilder.append("Unknown (");
              stringBuilder.append(integer);
              stringBuilder.append(")");
              return stringBuilder.toString();
            case 3:
              return "+3/3";
            case 2:
              return "+2/3";
            case 1:
              return "+1/3";
            case 0:
              return "Normal";
            case -1:
              return "-1/3";
            case -2:
              return "-2/3";
            case -3:
              break;
          } 
          return "-3/3";
        } 
        return "High";
      } 
      return "n/a";
    } 
    return "Low";
  }
  
  public String m() {
    return a(8219, new String[] { "Manual", null, "AF-A", "AF-C", "AF-S", null, "DMF", "AF-D" });
  }
  
  public String n() {
    Integer integer = ((d1)this.a).k(8201);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    return (i != 0) ? ((i != 1) ? ((i != 2) ? ((i != 3) ? ((i != 256) ? ((i != 65535) ? String.format("Unknown (%d)", new Object[] { integer }) : "N/A") : "Auto") : "High") : "Normal") : "On") : "Off";
  }
  
  public String o() {
    return a(258, new String[] { "RAW", "Super Fine", "Fine", "Standard", "Economy", "Extra Fine", "RAW + JPEG", "Compressed RAW", "Compressed RAW + JPEG" });
  }
  
  public String p() {
    Integer integer = ((d1)this.a).k(45094);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    return (i != 0) ? ((i != 1) ? "N/A" : "On") : "Off";
  }
  
  public String q() {
    Integer integer = ((d1)this.a).k(45127);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    return (i != 0) ? ((i != 1) ? ((i != 2) ? ((i != 65535) ? String.format("Unknown (%d)", new Object[] { integer }) : "N/A") : "Extra Fine") : "Fine") : "Normal";
  }
  
  public String r() {
    Integer integer = ((d1)this.a).k(8210);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    return (i != -1) ? ((i != 0) ? ((i != 2) ? String.format("Unknown (%d)", new Object[] { integer }) : "Auto") : "Off") : "N/A";
  }
  
  public String s() {
    Integer integer = ((d1)this.a).k(45134);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    return (i != 0) ? ((i != 1) ? ((i != 65535) ? String.format("Unknown (%d)", new Object[] { integer }) : "N/A") : "On") : "Off";
  }
  
  public String t() {
    Integer integer = ((d1)this.a).k(45120);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    return (i != 0) ? ((i != 1) ? ((i != 2) ? ((i != 65535) ? String.format("Unknown (%d)", new Object[] { integer }) : "N/A") : "Magnifying Glass/Super Macro") : "On") : "Off";
  }
  
  public String u() {
    Integer integer = ((d1)this.a).k(8206);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    if (i != 13) {
      if (i != 80) {
        if (i != 97) {
          if (i != 98) {
            switch (i) {
              default:
                switch (i) {
                  default:
                    switch (i) {
                      default:
                        switch (i) {
                          default:
                            switch (i) {
                              default:
                                switch (i) {
                                  default:
                                    return String.format("Unknown (%d)", new Object[] { integer });
                                  case 114:
                                    return "Illustration (high)";
                                  case 113:
                                    return "Illustration";
                                  case 112:
                                    break;
                                } 
                                return "Illustration (low)";
                              case 66:
                                return "HDR Painting (high)";
                              case 65:
                                return "HDR Painting";
                              case 64:
                                break;
                            } 
                            return "HDR Painting (low)";
                          case 54:
                            return "Miniature (right)";
                          case 53:
                            return "Miniature (middle vertical)";
                          case 52:
                            return "Miniature (left)";
                          case 51:
                            return "Miniature (bottom)";
                          case 50:
                            return "Miniature (middle horizontal)";
                          case 49:
                            return "Miniature (top)";
                          case 48:
                            break;
                        } 
                        return "Miniature (auto)";
                      case 34:
                        return "Soft Focus (high)";
                      case 33:
                        return "Soft Focus";
                      case 32:
                        break;
                    } 
                    return "Soft Focus (low)";
                  case 20:
                    return "Toy Camera (magenta)";
                  case 19:
                    return "Toy Camera (green)";
                  case 18:
                    return "Toy Camera (warm)";
                  case 17:
                    return "Toy Camera (cool)";
                  case 16:
                    break;
                } 
                return "Toy Camera (normal)";
              case 10:
                return "Partial Color (yellow)";
              case 9:
                return "Partial Color (blue)";
              case 8:
                return "Partial Color (green)";
              case 7:
                return "Partial Color (red)";
              case 6:
                return "Soft High Key";
              case 5:
                return "Retro Photo";
              case 4:
                return "Posterization B/W";
              case 3:
                return "Posterization";
              case 2:
                return "Pop Color";
              case 1:
                return "Toy Camera";
              case 0:
                break;
            } 
            return "Off";
          } 
          return "Water Color 2";
        } 
        return "Water Color";
      } 
      return "Rich-tone Monochrome";
    } 
    return "High Contrast Monochrome";
  }
  
  public String v() {
    Integer integer = ((d1)this.a).k(45129);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    if (i != 0) {
      if (i != 2) {
        if (i != 65535) {
          if (i != 5) {
            if (i != 6) {
              StringBuilder stringBuilder = new StringBuilder();
              stringBuilder.append("Unknown (");
              stringBuilder.append(integer);
              stringBuilder.append(")");
              return stringBuilder.toString();
            } 
            return "White Balance Bracketing";
          } 
          return "Exposure Bracketing";
        } 
        return "n/a";
      } 
      return "Continuous";
    } 
    return "Normal";
  }
  
  public String w() {
    StringBuilder stringBuilder;
    Integer integer = ((d1)this.a).k(45091);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    switch (i) {
      default:
        switch (i) {
          default:
            stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown (");
            stringBuilder.append(integer);
            stringBuilder.append(")");
            return stringBuilder.toString();
          case 28:
            return "Pet";
          case 27:
            return "Food";
          case 26:
            return "Fireworks";
          case 25:
            return "High Sensitivity";
          case 24:
            return "Superior Auto";
          case 23:
            return "3D Sweep Panorama";
          case 22:
            return "Auto+";
          case 21:
            return "Cont. Priority AE";
          case 20:
            return "Anti Motion Blur";
          case 19:
            return "Handheld Night Shot";
          case 18:
            return "Sweep Panorama";
          case 17:
            return "Night View/Portrait";
          case 16:
            break;
        } 
        return "Auto";
      case 9:
        return "Super Macro";
      case 8:
        return "Macro";
      case 7:
        return "Night Portrait";
      case 6:
        return "Landscape";
      case 5:
        return "Sports";
      case 4:
        return "Sunset";
      case 3:
        return "Night Scene";
      case 2:
        return "Text";
      case 1:
        return "Portrait";
      case 0:
        break;
    } 
    return "Standard";
  }
  
  public String x() {
    Integer integer = ((d1)this.a).k(45129);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    return (i != 0) ? ((i != 65535) ? integer.toString() : "n/a") : "Single";
  }
  
  public String y() {
    return a(8207, new String[] { "Off", "Low", "Mid", "High" });
  }
  
  public String z() {
    Integer integer = ((d1)this.a).k(45057);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    if (i != 2) {
      if (i != 269) {
        if (i != 270) {
          StringBuilder stringBuilder;
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
                    case 298:
                      return "DSC-RX1";
                    case 297:
                      return "DSC-RX100";
                    case 296:
                      return "NEX-5R";
                    case 295:
                      return "NEX-6";
                    case 294:
                      return "SLT-A99V";
                    case 293:
                      return "NEX-F3";
                    case 292:
                      return "SLT-A57";
                    case 291:
                      return "SLT-A37";
                    case 290:
                      return "NEX-VG20E";
                    case 289:
                      return "NEX-7";
                    case 288:
                      return "NEX-5N";
                    case 287:
                      return "SLT-A77V";
                    case 286:
                      return "SLT-A65V";
                    case 285:
                      return "SLT-A35";
                    case 284:
                      return "NEX-C3";
                    case 283:
                      return "DSLR-A580";
                    case 282:
                      return "DSLR-A560";
                    case 281:
                      return "SLT-A55V";
                    case 280:
                      return "SLT-A33";
                    case 279:
                      return "NEX-3";
                    case 278:
                      break;
                  } 
                  return "NEX-5";
                case 275:
                  return "DSLR-A450";
                case 274:
                  return "DSLR-A500";
                case 273:
                  break;
              } 
              return "DSLR-A550";
            case 266:
              return "DSLR-A290";
            case 265:
              return "DSLR-A230";
            case 264:
              return "DSLR-A330";
            case 263:
              return "DSLR-A380/A390";
            case 262:
              return "DSLR-A900 (APS-C mode)";
            case 261:
              return "DSLR-A300";
            case 260:
              return "DSLR-A350";
            case 259:
              return "DSLR-A200";
            case 258:
              return "DSLR-A700";
            case 257:
              return "DSLR-A900";
            case 256:
              break;
          } 
          return "DSLR-A100";
        } 
        return "DSLR-A850 (APS-C mode)";
      } 
      return "DSLR-A850";
    } 
    return "DSC-R1";
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/o/a0/c1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */