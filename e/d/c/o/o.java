package e.d.c.o;

import e.d.b.i;
import e.d.b.m;
import e.d.c.j;
import java.text.DecimalFormat;

public class o extends j<p> {
  public o(p paramp) {
    super(paramp);
  }
  
  private String k() {
    return b(0, 1);
  }
  
  public String a() {
    m m = ((p)this.a).n(6);
    if (m == null)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(m.intValue());
    stringBuilder.append(" metres");
    return stringBuilder.toString();
  }
  
  public String b() {
    return a(5, new String[] { "Sea level", "Below sea level" });
  }
  
  public String c() {
    String str = ((p)this.a).p(25);
    if (str == null)
      return null; 
    str = str.trim();
    if ("K".equalsIgnoreCase(str))
      return "kilometers"; 
    if ("M".equalsIgnoreCase(str))
      return "miles"; 
    if ("N".equalsIgnoreCase(str))
      return "knots"; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unknown (");
    stringBuilder.append(str);
    stringBuilder.append(")");
    return stringBuilder.toString();
  }
  
  public String c(int paramInt) {
    if (paramInt != 0) {
      if (paramInt != 2) {
        if (paramInt != 12) {
          if (paramInt != 30) {
            if (paramInt != 4) {
              if (paramInt != 5) {
                if (paramInt != 6) {
                  if (paramInt != 7) {
                    if (paramInt != 9) {
                      if (paramInt != 10) {
                        switch (paramInt) {
                          default:
                            switch (paramInt) {
                              default:
                                return super.c(paramInt);
                              case 25:
                                return c();
                              case 24:
                                return j(paramInt);
                              case 23:
                                break;
                            } 
                            break;
                          case 15:
                          case 17:
                          
                          case 14:
                          case 16:
                            break;
                        } 
                        return k(paramInt);
                      } 
                      return g();
                    } 
                    return i();
                  } 
                  return j();
                } 
                return a();
              } 
              return b();
            } 
            return f();
          } 
          return d();
        } 
        return h();
      } 
      return e();
    } 
    return k();
  }
  
  public String d() {
    return a(30, new String[] { "No Correction", "Differential Corrected" });
  }
  
  public String e() {
    i i = ((p)this.a).f();
    return (i == null) ? null : i.b(i.a());
  }
  
  public String f() {
    i i = ((p)this.a).f();
    return (i == null) ? null : i.b(i.b());
  }
  
  public String g() {
    String str = ((p)this.a).p(10);
    if (str == null)
      return null; 
    str = str.trim();
    if ("2".equalsIgnoreCase(str))
      return "2-dimensional measurement"; 
    if ("3".equalsIgnoreCase(str))
      return "3-dimensional measurement"; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unknown (");
    stringBuilder.append(str);
    stringBuilder.append(")");
    return stringBuilder.toString();
  }
  
  public String h() {
    String str = ((p)this.a).p(12);
    if (str == null)
      return null; 
    str = str.trim();
    if ("K".equalsIgnoreCase(str))
      return "kph"; 
    if ("M".equalsIgnoreCase(str))
      return "mph"; 
    if ("N".equalsIgnoreCase(str))
      return "knots"; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unknown (");
    stringBuilder.append(str);
    stringBuilder.append(")");
    return stringBuilder.toString();
  }
  
  public String i() {
    String str = ((p)this.a).p(9);
    if (str == null)
      return null; 
    str = str.trim();
    if ("A".equalsIgnoreCase(str))
      return "Active (Measurement in progress)"; 
    if ("V".equalsIgnoreCase(str))
      return "Void (Measurement Interoperability)"; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unknown (");
    stringBuilder.append(str);
    stringBuilder.append(")");
    return stringBuilder.toString();
  }
  
  public String j() {
    m[] arrayOfM = ((p)this.a).o(7);
    DecimalFormat decimalFormat = new DecimalFormat("00.000");
    return (arrayOfM == null) ? null : String.format("%02d:%02d:%s UTC", new Object[] { Integer.valueOf(arrayOfM[0].intValue()), Integer.valueOf(arrayOfM[1].intValue()), decimalFormat.format(arrayOfM[2].doubleValue()) });
  }
  
  public String j(int paramInt) {
    String str;
    m m = ((p)this.a).n(paramInt);
    if (m != null) {
      str = (new DecimalFormat("0.##")).format(m.doubleValue());
    } else {
      str = ((p)this.a).p(paramInt);
    } 
    if (str == null || str.trim().length() == 0)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(str.trim());
    stringBuilder.append(" degrees");
    return stringBuilder.toString();
  }
  
  public String k(int paramInt) {
    String str = ((p)this.a).p(paramInt);
    if (str == null)
      return null; 
    str = str.trim();
    if ("T".equalsIgnoreCase(str))
      return "True direction"; 
    if ("M".equalsIgnoreCase(str))
      return "Magnetic direction"; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unknown (");
    stringBuilder.append(str);
    stringBuilder.append(")");
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/o/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */