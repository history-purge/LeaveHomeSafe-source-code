package e.d.c.o.a0;

import e.d.b.m;
import e.d.c.j;
import java.text.DecimalFormat;

public class u extends j<v> {
  public u(v paramv) {
    super(paramv);
  }
  
  private String j(int paramInt) {
    int[] arrayOfInt = ((v)this.a).j(paramInt);
    if (arrayOfInt != null) {
      if (arrayOfInt.length < 2)
        return null; 
      if (arrayOfInt.length >= 3) {
        if (arrayOfInt[2] == 0)
          return null; 
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        double d1 = (arrayOfInt[0] * arrayOfInt[1]);
        double d2 = arrayOfInt[2];
        Double.isNaN(d1);
        Double.isNaN(d2);
        d1 /= d2;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(decimalFormat.format(d1));
        stringBuilder.append(" EV");
        return stringBuilder.toString();
      } 
    } 
    return null;
  }
  
  public String a() {
    Integer integer = ((v)this.a).k(34);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    if (i != 0) {
      if (i != 1) {
        if (i != 3) {
          if (i != 5) {
            if (i != 7) {
              if (i != 65535) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown (");
                stringBuilder.append(integer);
                stringBuilder.append(")");
                return stringBuilder.toString();
              } 
              return "Auto";
            } 
            return "Extra High";
          } 
          return "High";
        } 
        return "Normal";
      } 
      return "Light";
    } 
    return "Off";
  }
  
  public String b() {
    return j(18);
  }
  
  public String c() {
    StringBuilder stringBuilder2;
    int[] arrayOfInt = ((v)this.a).j(136);
    if (arrayOfInt == null)
      return null; 
    if (arrayOfInt.length != 4 || arrayOfInt[0] != 0 || arrayOfInt[2] != 0 || arrayOfInt[3] != 0) {
      stringBuilder2 = new StringBuilder();
      stringBuilder2.append("Unknown (");
      stringBuilder2.append(((v)this.a).p(136));
      stringBuilder2.append(")");
      return stringBuilder2.toString();
    } 
    StringBuilder stringBuilder1 = stringBuilder2[1];
    if (stringBuilder1 != null) {
      if (stringBuilder1 != true) {
        if (stringBuilder1 != 2) {
          if (stringBuilder1 != 3) {
            if (stringBuilder1 != 4) {
              StringBuilder stringBuilder = new StringBuilder();
              stringBuilder.append("Unknown (");
              stringBuilder.append(stringBuilder2[1]);
              stringBuilder.append(")");
              return stringBuilder.toString();
            } 
            return "Right";
          } 
          return "Left";
        } 
        return "Bottom";
      } 
      return "Top";
    } 
    return "Centre";
  }
  
  public String c(int paramInt) {
    if (paramInt != 1) {
      if (paramInt != 2) {
        if (paramInt != 13) {
          if (paramInt != 14) {
            if (paramInt != 18) {
              if (paramInt != 28) {
                if (paramInt != 30) {
                  if (paramInt != 34) {
                    if (paramInt != 42) {
                      if (paramInt != 139) {
                        if (paramInt != 141) {
                          if (paramInt != 177) {
                            if (paramInt != 182) {
                              if (paramInt != 23) {
                                if (paramInt != 24) {
                                  if (paramInt != 131) {
                                    if (paramInt != 132) {
                                      if (paramInt != 146) {
                                        if (paramInt != 147) {
                                          switch (paramInt) {
                                            default:
                                              return super.c(paramInt);
                                            case 137:
                                              return v();
                                            case 136:
                                              return c();
                                            case 135:
                                              return l();
                                            case 134:
                                              break;
                                          } 
                                          return f();
                                        } 
                                        return s();
                                      } 
                                      return n();
                                    } 
                                    return p();
                                  } 
                                  return r();
                                } 
                                return j();
                              } 
                              return k();
                            } 
                            return t();
                          } 
                          return m();
                        } 
                        return d();
                      } 
                      return q();
                    } 
                    return w();
                  } 
                  return a();
                } 
                return e();
              } 
              return h();
            } 
            return b();
          } 
          return g();
        } 
        return u();
      } 
      return o();
    } 
    return i();
  }
  
  public String d() {
    String str2 = ((v)this.a).p(141);
    if (str2 == null)
      return null; 
    String str1 = str2;
    if (str2.startsWith("MODE1"))
      str1 = "Mode I (sRGB)"; 
    return str1;
  }
  
  public String e() {
    return a(30, 1, new String[] { "sRGB", "Adobe RGB" });
  }
  
  public String f() {
    m m = ((v)this.a).n(134);
    if (m == null)
      return null; 
    if (m.intValue() == 1)
      return "No digital zoom"; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(m.a(true));
    stringBuilder.append("x digital zoom");
    return stringBuilder.toString();
  }
  
  public String g() {
    return j(14);
  }
  
  public String h() {
    return j(28);
  }
  
  public String i() {
    return b(1, 2);
  }
  
  public String j() {
    return j(24);
  }
  
  public String k() {
    return j(23);
  }
  
  public String l() {
    return a(135, new String[] { "Flash Not Used", "Manual Flash", null, "Flash Not Ready", null, null, null, "External Flash", "Fired, Commander Mode", "Fired, TTL Mode" });
  }
  
  public String m() {
    return a(177, new String[] { "Off", "Minimal", "Low", null, "Normal", null, "High" });
  }
  
  public String n() {
    return b(146, "%s degrees");
  }
  
  public String o() {
    StringBuilder stringBuilder1;
    int[] arrayOfInt = ((v)this.a).j(2);
    if (arrayOfInt == null)
      return null; 
    if (arrayOfInt[0] != 0 || arrayOfInt[1] == 0) {
      stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Unknown (");
      stringBuilder1.append(((v)this.a).p(2));
      stringBuilder1.append(")");
      return stringBuilder1.toString();
    } 
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append("ISO ");
    stringBuilder2.append(stringBuilder1[1]);
    return stringBuilder2.toString();
  }
  
  public String p() {
    return e(132);
  }
  
  public String q() {
    return j(139);
  }
  
  public String r() {
    return a(131, new Object[] { { "AF", "MF" }, "D", "G", "VR" });
  }
  
  public String s() {
    return a(147, 1, new String[] { "Lossy (Type 1)", null, "Uncompressed", null, null, null, "Lossless", "Lossy (Type 2)" });
  }
  
  public String t() {
    return d(182);
  }
  
  public String u() {
    return j(13);
  }
  
  public String v() {
    return a(137, new Object[] { { "Single Frame", "Continuous" }, "Delay", null, "PC Control", "Exposure Bracketing", "Auto ISO", "White-Balance Bracketing", "IR Control" });
  }
  
  public String w() {
    Integer integer = ((v)this.a).k(42);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    if (i != 0) {
      if (i != 1) {
        if (i != 3) {
          if (i != 5) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown (");
            stringBuilder.append(integer);
            stringBuilder.append(")");
            return stringBuilder.toString();
          } 
          return "High";
        } 
        return "Normal";
      } 
      return "Low";
    } 
    return "Off";
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/o/a0/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */