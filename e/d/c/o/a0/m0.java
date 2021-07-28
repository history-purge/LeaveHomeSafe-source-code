package e.d.c.o.a0;

import e.d.b.b;
import e.d.b.f;
import e.d.c.a;
import e.d.c.d;
import e.d.c.j;
import java.io.IOException;
import java.text.DecimalFormat;

public class m0 extends j<n0> {
  private static final String[] b = new String[] { 
      "Normal", "Portrait", "Scenery", "Sports", "Night Portrait", "Program", "Aperture Priority", "Shutter Priority", "Macro", "Spot", 
      "Manual", "Movie Preview", "Panning", "Simple", "Color Effects", "Self Portrait", "Economy", "Fireworks", "Party", "Snow", 
      "Night Scenery", "Food", "Baby", "Soft Skin", "Candlelight", "Starry Night", "High Sensitivity", "Panorama Assist", "Underwater", "Beach", 
      "Aerial Photo", "Sunset", "Pet", "Intelligent ISO", "Clipboard", "High Speed Continuous Shooting", "Intelligent Auto", null, "Multi-aspect", null, 
      "Transform", "Flash Burst", "Pin Hole", "Film Grain", "My Color", "Photo Frame", null, null, null, null, 
      "HDR" };
  
  public m0(n0 paramn0) {
    super(paramn0);
  }
  
  private static String a(String paramString) {
    return (paramString == null) ? null : paramString.trim();
  }
  
  private String a(d[] paramArrayOfd) {
    String str;
    d[] arrayOfD = null;
    if (paramArrayOfd == null)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < paramArrayOfd.length; i = k) {
      stringBuilder.append("Face ");
      int k = i + 1;
      stringBuilder.append(k);
      stringBuilder.append(": ");
      stringBuilder.append(paramArrayOfd[i].toString());
      stringBuilder.append("\n");
    } 
    paramArrayOfd = arrayOfD;
    if (stringBuilder.length() > 0)
      str = stringBuilder.substring(0, stringBuilder.length() - 1); 
    return str;
  }
  
  private String j(int paramInt) {
    int i;
    byte[] arrayOfByte = ((n0)this.a).d(paramInt);
    if (arrayOfByte == null)
      return null; 
    b b = new b(arrayOfByte);
    try {
      paramInt = b.k(0);
      i = b.k(2);
      if (paramInt == -1 && i == 1)
        return "Slim Low"; 
    } catch (IOException iOException) {
      return null;
    } 
    if (paramInt == -3 && i == 2)
      return "Slim High"; 
    if (paramInt == 0 && i == 0)
      return "Off"; 
    if (paramInt == 1 && i == 1)
      return "Stretch Low"; 
    if (paramInt == 3 && i == 2)
      return "Stretch High"; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unknown (");
    stringBuilder.append(paramInt);
    stringBuilder.append(" ");
    stringBuilder.append(i);
    stringBuilder.append(")");
    return stringBuilder.toString();
  }
  
  public String A() {
    return a(7, 1, new String[] { "Auto", "Manual", null, "Auto, Focus Button", "Auto, Continuous" });
  }
  
  public String B() {
    Integer integer = ((n0)this.a).k(158);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    return (i != 0) ? ((i != 100) ? ((i != 200) ? ((i != 300) ? ((i != 32868) ? ((i != 32968) ? ((i != 33068) ? String.format("Unknown (%d)", new Object[] { integer }) : "3 EV (Auto)") : "2 EV (Auto)") : "1 EV (Auto)") : "3 EV") : "2 EV") : "1 EV") : "Off";
  }
  
  public String C() {
    return a(26, 2, new String[] { "On, Mode 1", "Off", "On, Mode 2" });
  }
  
  public String D() {
    return a(121, new String[] { "Off", "Low", "Standard", "High" });
  }
  
  public String E() {
    return a(93, new String[] { "Off", "Low", "Standard", "High" });
  }
  
  public String F() {
    return a(112, new String[] { "Off", null, "Auto", "On" });
  }
  
  public String G() {
    return a(37);
  }
  
  public String H() {
    return a(a(111, f.a));
  }
  
  public String I() {
    byte[] arrayOfByte = ((n0)this.a).d(96);
    if (arrayOfByte == null)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < arrayOfByte.length; i++) {
      stringBuilder.append(arrayOfByte[i]);
      if (i < arrayOfByte.length - 1)
        stringBuilder.append("."); 
    } 
    return stringBuilder.toString();
  }
  
  public String J() {
    return a(a(103, f.a));
  }
  
  public String K() {
    return a(73, 1, new String[] { "Off", "On" });
  }
  
  public String L() {
    return a(28, 1, new String[] { "Off", "On" });
  }
  
  public String M() {
    return b(32768, 2);
  }
  
  public String N() {
    return a(45, new String[] { "Standard (0)", "Low (-1)", "High (+1)", "Lowest (-2)", "Highest (+2)" });
  }
  
  public String O() {
    return a(52, 1, new String[] { "Standard", "Extended" });
  }
  
  public String P() {
    return a(137, new String[] { "Auto", "Standard or Custom", "Vivid", "Natural", "Monochrome", "Scenery", "Portrait" });
  }
  
  public String Q() {
    Integer integer = ((n0)this.a).k(145);
    if (integer == null)
      return null; 
    DecimalFormat decimalFormat = new DecimalFormat("0.#");
    double d = -integer.shortValue();
    Double.isNaN(d);
    return decimalFormat.format(d / 10.0D);
  }
  
  public String R() {
    return a(1, 2, new String[] { "High", "Normal", null, null, "Very High", "Raw", null, "Motion Picture" });
  }
  
  public String S() {
    return a(((n0)this.a).g());
  }
  
  public String T() {
    return a(31, 1, b);
  }
  
  public String U() {
    Integer integer = ((n0)this.a).k(144);
    if (integer == null)
      return null; 
    DecimalFormat decimalFormat = new DecimalFormat("0.#");
    double d = integer.shortValue();
    Double.isNaN(d);
    return decimalFormat.format(d / 10.0D);
  }
  
  public String V() {
    Integer integer = ((n0)this.a).k(48);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    if (i != 1) {
      if (i != 3) {
        if (i != 6) {
          if (i != 8) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown (");
            stringBuilder.append(integer);
            stringBuilder.append(")");
            return stringBuilder.toString();
          } 
          return "Rotate 270 CW";
        } 
        return "Rotate 90 CW";
      } 
      return "Rotate 180";
    } 
    return "Horizontal";
  }
  
  public String W() {
    return a(32769, 1, b);
  }
  
  public String X() {
    return a(46, 1, new String[] { "Off", "10 s", "2 s" });
  }
  
  public String Y() {
    return a(138, new String[] { "Off", "On" });
  }
  
  public String Z() {
    return a(159, new String[] { "Mechanical", "Electronic", "Hybrid" });
  }
  
  public String a() {
    Integer integer = ((n0)this.a).k(141);
    return (integer == null) ? null : String.valueOf(integer.shortValue());
  }
  
  public String a0() {
    return a(a(107, f.a));
  }
  
  public String b() {
    Integer integer = ((n0)this.a).k(142);
    return (integer == null) ? null : String.valueOf(integer.shortValue());
  }
  
  public String b0() {
    return a(147, new String[] { "Off", "Left to Right", "Right to Left", "Top to Bottom", "Bottom to Top" });
  }
  
  public String c() {
    Integer integer = ((n0)this.a).k(140);
    return (integer == null) ? null : String.valueOf(integer.shortValue());
  }
  
  public String c(int paramInt) {
    switch (paramInt) {
      default:
        return super.c(paramInt);
      case 32786:
        return j0();
      case 32784:
        return h();
      case 32777:
        return e0();
      case 32776:
        return d0();
      case 32775:
        return y();
      case 32769:
        return W();
      case 32768:
        return M();
      case 171:
        return i0();
      case 159:
        return Z();
      case 158:
        return B();
      case 150:
        return g0();
      case 147:
        return b0();
      case 145:
        return Q();
      case 144:
        return U();
      case 143:
        return m();
      case 142:
        return b();
      case 141:
        return a();
      case 140:
        return c();
      case 138:
        return Y();
      case 137:
        return P();
      case 124:
        return o();
      case 121:
        return D();
      case 112:
        return F();
      case 111:
        return H();
      case 109:
        return n();
      case 107:
        return a0();
      case 105:
        return u();
      case 103:
        return J();
      case 102:
        return j();
      case 101:
        return h0();
      case 98:
        return z();
      case 97:
        return S();
      case 96:
        return I();
      case 93:
        return E();
      case 89:
        return k0();
      case 78:
        return v();
      case 73:
        return K();
      case 72:
        return x();
      case 69:
        return k();
      case 62:
        return c0();
      case 61:
        return d();
      case 59:
        return f0();
      case 58:
        return p0();
      case 57:
        return r();
      case 53:
        return t();
      case 52:
        return O();
      case 51:
        return i();
      case 50:
        return q();
      case 49:
        return f();
      case 48:
        return V();
      case 46:
        return X();
      case 45:
        return N();
      case 44:
        return s();
      case 42:
        return l();
      case 41:
        return m0();
      case 40:
        return p();
      case 38:
        return w();
      case 37:
        return G();
      case 33:
        return l0();
      case 32:
        return g();
      case 31:
        return T();
      case 28:
        return L();
      case 26:
        return C();
      case 15:
        return e();
      case 7:
        return A();
      case 3:
        return o0();
      case 2:
        return n0();
      case 1:
        break;
    } 
    return R();
  }
  
  public String c0() {
    return a(62, 1, new String[] { "Off", "On" });
  }
  
  public String d() {
    return a(61, 1, new String[] { 
          "Normal", "Outdoor/Illuminations/Flower/HDR Art", "Indoor/Architecture/Objects/HDR B&W", "Creative", "Auto", null, "Expressive", "Retro", "Pure", "Elegant", 
          null, "Monochrome", "Dynamic Art", "Silhouette" });
  }
  
  public String d0() {
    return a(32776, 1, new String[] { "Off", "On" });
  }
  
  public String e() {
    int[] arrayOfInt = ((n0)this.a).j(15);
    if (arrayOfInt == null || arrayOfInt.length < 2)
      return null; 
    int i = arrayOfInt[0];
    if (i != 0) {
      if (i != 1) {
        if (i != 16) {
          if (i != 32) {
            if (i != 64) {
              StringBuilder stringBuilder = new StringBuilder();
              stringBuilder.append("Unknown (");
              stringBuilder.append(arrayOfInt[0]);
              stringBuilder.append(" ");
              i = arrayOfInt[1];
              stringBuilder.append(i);
              stringBuilder.append(")");
              return stringBuilder.toString();
            } 
            return "Face Detect";
          } 
          i = arrayOfInt[1];
          if (i != 0) {
            if (i != 1) {
              if (i != 2) {
                if (i != 3) {
                  StringBuilder stringBuilder = new StringBuilder();
                  stringBuilder.append("Unknown (");
                  stringBuilder.append(arrayOfInt[0]);
                  stringBuilder.append(" ");
                  i = arrayOfInt[1];
                  stringBuilder.append(i);
                  stringBuilder.append(")");
                  return stringBuilder.toString();
                } 
                return "3-area (right)";
              } 
              return "3-area (center)";
            } 
            return "3-area (left)";
          } 
          return "Auto or Face Detect";
        } 
        i = arrayOfInt[1];
        if (i != 0) {
          if (i != 16) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown (");
            stringBuilder.append(arrayOfInt[0]);
            stringBuilder.append(" ");
            i = arrayOfInt[1];
            stringBuilder.append(i);
            stringBuilder.append(")");
            return stringBuilder.toString();
          } 
          return "1-area (high speed)";
        } 
        return "1-area";
      } 
      i = arrayOfInt[1];
      if (i != 0) {
        if (i != 1) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Unknown (");
          stringBuilder.append(arrayOfInt[0]);
          stringBuilder.append(" ");
          i = arrayOfInt[1];
          stringBuilder.append(i);
          stringBuilder.append(")");
          return stringBuilder.toString();
        } 
        return "5-area";
      } 
      return "Spot Focusing";
    } 
    i = arrayOfInt[1];
    if (i != 1) {
      if (i != 16) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown (");
        stringBuilder.append(arrayOfInt[0]);
        stringBuilder.append(" ");
        i = arrayOfInt[1];
        stringBuilder.append(i);
        stringBuilder.append(")");
        return stringBuilder.toString();
      } 
      return "Spot Mode Off";
    } 
    return "Spot Mode On";
  }
  
  public String e0() {
    return a(32777, 1, new String[] { "Off", "On" });
  }
  
  public String f() {
    return a(49, 1, new String[] { "Fired", "Enabled but not used", "Disabled but required", "Disabled and not required" });
  }
  
  public String f0() {
    return a(59, 1, new String[] { "Off", "On" });
  }
  
  public String g() {
    return a(32, 1, new String[] { "Off", "On" });
  }
  
  public String g0() {
    return a(150, new String[] { "Off", "Time Lapse", "Stop-motion Animation" });
  }
  
  public String h() {
    a a = ((n0)this.a).v(32784);
    return (a == null) ? null : a.a();
  }
  
  public String h0() {
    return a(a(101, f.a));
  }
  
  public String i() {
    a a = ((n0)this.a).v(51);
    return (a == null) ? null : a.a();
  }
  
  public String i0() {
    return a(171, new String[] { "Off", "On" });
  }
  
  public String j() {
    return a(a(102, f.a));
  }
  
  public String j0() {
    return j(32786);
  }
  
  public String k() {
    return a(69, new String[] { "No Bracket", "3 Images, Sequence 0/-/+", "3 Images, Sequence -/0/+", "5 Images, Sequence 0/-/+", "5 Images, Sequence -/0/+", "7 Images, Sequence 0/-/+", "7 Images, Sequence -/0/+" });
  }
  
  public String k0() {
    return j(89);
  }
  
  public String l() {
    return a(42, new String[] { "Off", null, "On", "Indefinite", "Unlimited" });
  }
  
  public String l0() {
    return b(33);
  }
  
  public String m() {
    return a(143, new String[] { "Normal", "Rotate CW", "Rotate 180", "Rotate CCW", "Tilt Upwards", "Tile Downwards" });
  }
  
  public String m0() {
    Integer integer = ((n0)this.a).k(41);
    if (integer == null)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(integer.intValue() / 100.0F);
    stringBuilder.append(" s");
    return stringBuilder.toString();
  }
  
  public String n() {
    return a(a(109, f.a));
  }
  
  public String n0() {
    return b(2, 2);
  }
  
  public String o() {
    return a(124, new String[] { "Off", "On" });
  }
  
  public String o0() {
    return a(3, 1, new String[] { 
          "Auto", "Daylight", "Cloudy", "Incandescent", "Manual", null, null, "Flash", null, "Black & White", 
          "Manual", "Shade" });
  }
  
  public String p() {
    return a(40, 1, new String[] { "Off", "Warm", "Cool", "Black & White", "Sepia" });
  }
  
  public String p0() {
    return a(58, 1, new String[] { "Home", "Destination" });
  }
  
  public String q() {
    return a(50, new String[] { "Normal", "Natural", "Vivid" });
  }
  
  public String r() {
    return a(57, new String[] { "Normal" });
  }
  
  public String s() {
    Integer integer = ((n0)this.a).k(44);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    if (i != 0) {
      if (i != 1) {
        if (i != 2) {
          if (i != 6) {
            if (i != 7) {
              if (i != 256) {
                if (i != 272) {
                  if (i != 288) {
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
            return "Medium High";
          } 
          return "Medium Low";
        } 
        return "High";
      } 
      return "Low";
    } 
    return "Normal";
  }
  
  public String t() {
    return a(53, 1, new String[] { "Off", "Wide", "Telephoto", "Macro" });
  }
  
  public String u() {
    return a(a(105, f.a));
  }
  
  public String v() {
    return a(((n0)this.a).f());
  }
  
  public String w() {
    return b(38, 2);
  }
  
  public String x() {
    return a(72, new String[] { "n/a", "1st", "2nd" });
  }
  
  public String y() {
    return a(32775, 1, new String[] { "Off", "On" });
  }
  
  public String z() {
    return a(98, new String[] { "No", "Yes (Flash required but disabled)" });
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/o/a0/m0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */