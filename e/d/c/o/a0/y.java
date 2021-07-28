package e.d.c.o.a0;

import e.d.c.j;
import java.text.DecimalFormat;
import java.util.HashMap;

public class y extends j<z> {
  private static final HashMap<String, String> b = new HashMap<String, String>();
  
  private static final HashMap<String, String> c = new HashMap<String, String>();
  
  static {
    b.put("0 00 00", "None");
    b.put("0 01 00", "Olympus Zuiko Digital ED 50mm F2.0 Macro");
    b.put("0 01 01", "Olympus Zuiko Digital 40-150mm F3.5-4.5");
    b.put("0 01 10", "Olympus M.Zuiko Digital ED 14-42mm F3.5-5.6");
    b.put("0 02 00", "Olympus Zuiko Digital ED 150mm F2.0");
    b.put("0 02 10", "Olympus M.Zuiko Digital 17mm F2.8 Pancake");
    b.put("0 03 00", "Olympus Zuiko Digital ED 300mm F2.8");
    b.put("0 03 10", "Olympus M.Zuiko Digital ED 14-150mm F4.0-5.6 [II]");
    b.put("0 04 10", "Olympus M.Zuiko Digital ED 9-18mm F4.0-5.6");
    b.put("0 05 00", "Olympus Zuiko Digital 14-54mm F2.8-3.5");
    b.put("0 05 01", "Olympus Zuiko Digital Pro ED 90-250mm F2.8");
    b.put("0 05 10", "Olympus M.Zuiko Digital ED 14-42mm F3.5-5.6 L");
    b.put("0 06 00", "Olympus Zuiko Digital ED 50-200mm F2.8-3.5");
    b.put("0 06 01", "Olympus Zuiko Digital ED 8mm F3.5 Fisheye");
    b.put("0 06 10", "Olympus M.Zuiko Digital ED 40-150mm F4.0-5.6");
    b.put("0 07 00", "Olympus Zuiko Digital 11-22mm F2.8-3.5");
    b.put("0 07 01", "Olympus Zuiko Digital 18-180mm F3.5-6.3");
    b.put("0 07 10", "Olympus M.Zuiko Digital ED 12mm F2.0");
    b.put("0 08 01", "Olympus Zuiko Digital 70-300mm F4.0-5.6");
    b.put("0 08 10", "Olympus M.Zuiko Digital ED 75-300mm F4.8-6.7");
    b.put("0 09 10", "Olympus M.Zuiko Digital 14-42mm F3.5-5.6 II");
    b.put("0 10 01", "Kenko Tokina Reflex 300mm F6.3 MF Macro");
    b.put("0 10 10", "Olympus M.Zuiko Digital ED 12-50mm F3.5-6.3 EZ");
    b.put("0 11 10", "Olympus M.Zuiko Digital 45mm F1.8");
    b.put("0 12 10", "Olympus M.Zuiko Digital ED 60mm F2.8 Macro");
    b.put("0 13 10", "Olympus M.Zuiko Digital 14-42mm F3.5-5.6 II R");
    b.put("0 14 10", "Olympus M.Zuiko Digital ED 40-150mm F4.0-5.6 R");
    b.put("0 15 00", "Olympus Zuiko Digital ED 7-14mm F4.0");
    b.put("0 15 10", "Olympus M.Zuiko Digital ED 75mm F1.8");
    b.put("0 16 10", "Olympus M.Zuiko Digital 17mm F1.8");
    b.put("0 17 00", "Olympus Zuiko Digital Pro ED 35-100mm F2.0");
    b.put("0 18 00", "Olympus Zuiko Digital 14-45mm F3.5-5.6");
    b.put("0 18 10", "Olympus M.Zuiko Digital ED 75-300mm F4.8-6.7 II");
    b.put("0 19 10", "Olympus M.Zuiko Digital ED 12-40mm F2.8 Pro");
    b.put("0 20 00", "Olympus Zuiko Digital 35mm F3.5 Macro");
    b.put("0 20 10", "Olympus M.Zuiko Digital ED 40-150mm F2.8 Pro");
    b.put("0 21 10", "Olympus M.Zuiko Digital ED 14-42mm F3.5-5.6 EZ");
    b.put("0 22 00", "Olympus Zuiko Digital 17.5-45mm F3.5-5.6");
    b.put("0 22 10", "Olympus M.Zuiko Digital 25mm F1.8");
    b.put("0 23 00", "Olympus Zuiko Digital ED 14-42mm F3.5-5.6");
    b.put("0 23 10", "Olympus M.Zuiko Digital ED 7-14mm F2.8 Pro");
    b.put("0 24 00", "Olympus Zuiko Digital ED 40-150mm F4.0-5.6");
    b.put("0 24 10", "Olympus M.Zuiko Digital ED 300mm F4.0 IS Pro");
    b.put("0 25 10", "Olympus M.Zuiko Digital ED 8mm F1.8 Fisheye Pro");
    b.put("0 30 00", "Olympus Zuiko Digital ED 50-200mm F2.8-3.5 SWD");
    b.put("0 31 00", "Olympus Zuiko Digital ED 12-60mm F2.8-4.0 SWD");
    b.put("0 32 00", "Olympus Zuiko Digital ED 14-35mm F2.0 SWD");
    b.put("0 33 00", "Olympus Zuiko Digital 25mm F2.8");
    b.put("0 34 00", "Olympus Zuiko Digital ED 9-18mm F4.0-5.6");
    b.put("0 35 00", "Olympus Zuiko Digital 14-54mm F2.8-3.5 II");
    b.put("1 01 00", "Sigma 18-50mm F3.5-5.6 DC");
    b.put("1 01 10", "Sigma 30mm F2.8 EX DN");
    b.put("1 02 00", "Sigma 55-200mm F4.0-5.6 DC");
    b.put("1 02 10", "Sigma 19mm F2.8 EX DN");
    b.put("1 03 00", "Sigma 18-125mm F3.5-5.6 DC");
    b.put("1 03 10", "Sigma 30mm F2.8 DN | A");
    b.put("1 04 00", "Sigma 18-125mm F3.5-5.6 DC");
    b.put("1 04 10", "Sigma 19mm F2.8 DN | A");
    b.put("1 05 00", "Sigma 30mm F1.4 EX DC HSM");
    b.put("1 05 10", "Sigma 60mm F2.8 DN | A");
    b.put("1 06 00", "Sigma APO 50-500mm F4.0-6.3 EX DG HSM");
    b.put("1 07 00", "Sigma Macro 105mm F2.8 EX DG");
    b.put("1 08 00", "Sigma APO Macro 150mm F2.8 EX DG HSM");
    b.put("1 09 00", "Sigma 18-50mm F2.8 EX DC Macro");
    b.put("1 10 00", "Sigma 24mm F1.8 EX DG Aspherical Macro");
    b.put("1 11 00", "Sigma APO 135-400mm F4.5-5.6 DG");
    b.put("1 12 00", "Sigma APO 300-800mm F5.6 EX DG HSM");
    b.put("1 13 00", "Sigma 30mm F1.4 EX DC HSM");
    b.put("1 14 00", "Sigma APO 50-500mm F4.0-6.3 EX DG HSM");
    b.put("1 15 00", "Sigma 10-20mm F4.0-5.6 EX DC HSM");
    b.put("1 16 00", "Sigma APO 70-200mm F2.8 II EX DG Macro HSM");
    b.put("1 17 00", "Sigma 50mm F1.4 EX DG HSM");
    b.put("2 01 00", "Leica D Vario Elmarit 14-50mm F2.8-3.5 Asph.");
    b.put("2 01 10", "Lumix G Vario 14-45mm F3.5-5.6 Asph. Mega OIS");
    b.put("2 02 00", "Leica D Summilux 25mm F1.4 Asph.");
    b.put("2 02 10", "Lumix G Vario 45-200mm F4.0-5.6 Mega OIS");
    b.put("2 03 00", "Leica D Vario Elmar 14-50mm F3.8-5.6 Asph. Mega OIS");
    b.put("2 03 01", "Leica D Vario Elmar 14-50mm F3.8-5.6 Asph.");
    b.put("2 03 10", "Lumix G Vario HD 14-140mm F4.0-5.8 Asph. Mega OIS");
    b.put("2 04 00", "Leica D Vario Elmar 14-150mm F3.5-5.6");
    b.put("2 04 10", "Lumix G Vario 7-14mm F4.0 Asph.");
    b.put("2 05 10", "Lumix G 20mm F1.7 Asph.");
    b.put("2 06 10", "Leica DG Macro-Elmarit 45mm F2.8 Asph. Mega OIS");
    b.put("2 07 10", "Lumix G Vario 14-42mm F3.5-5.6 Asph. Mega OIS");
    b.put("2 08 10", "Lumix G Fisheye 8mm F3.5");
    b.put("2 09 10", "Lumix G Vario 100-300mm F4.0-5.6 Mega OIS");
    b.put("2 10 10", "Lumix G 14mm F2.5 Asph.");
    b.put("2 11 10", "Lumix G 12.5mm F12 3D");
    b.put("2 12 10", "Leica DG Summilux 25mm F1.4 Asph.");
    b.put("2 13 10", "Lumix G X Vario PZ 45-175mm F4.0-5.6 Asph. Power OIS");
    b.put("2 14 10", "Lumix G X Vario PZ 14-42mm F3.5-5.6 Asph. Power OIS");
    b.put("2 15 10", "Lumix G X Vario 12-35mm F2.8 Asph. Power OIS");
    b.put("2 16 10", "Lumix G Vario 45-150mm F4.0-5.6 Asph. Mega OIS");
    b.put("2 17 10", "Lumix G X Vario 35-100mm F2.8 Power OIS");
    b.put("2 18 10", "Lumix G Vario 14-42mm F3.5-5.6 II Asph. Mega OIS");
    b.put("2 19 10", "Lumix G Vario 14-140mm F3.5-5.6 Asph. Power OIS");
    b.put("2 20 10", "Lumix G Vario 12-32mm F3.5-5.6 Asph. Mega OIS");
    b.put("2 21 10", "Leica DG Nocticron 42.5mm F1.2 Asph. Power OIS");
    b.put("2 22 10", "Leica DG Summilux 15mm F1.7 Asph.");
    b.put("2 24 10", "Lumix G Macro 30mm F2.8 Asph. Mega OIS");
    b.put("2 25 10", "Lumix G 42.5mm F1.7 Asph. Power OIS");
    b.put("3 01 00", "Leica D Vario Elmarit 14-50mm F2.8-3.5 Asph.");
    b.put("3 02 00", "Leica D Summilux 25mm F1.4 Asph.");
    b.put("5 01 10", "Tamron 14-150mm F3.5-5.8 Di III");
    c.put("0 00", "None");
    c.put("0 04", "Olympus Zuiko Digital EC-14 1.4x Teleconverter");
    c.put("0 08", "Olympus EX-25 Extension Tube");
    c.put("0 10", "Olympus Zuiko Digital EC-20 2.0x Teleconverter");
  }
  
  public y(z paramz) {
    super(paramz);
  }
  
  private static double j(int paramInt) {
    double d1 = Math.sqrt(2.0D);
    double d2 = paramInt;
    Double.isNaN(d2);
    return Math.pow(d1, d2 / 256.0D);
  }
  
  public String a() {
    Integer integer = ((z)this.a).k(260);
    if (integer == null)
      return null; 
    String str = String.format("%04X", new Object[] { integer });
    return String.format("%s.%s", new Object[] { str.substring(0, str.length() - 3), str.substring(str.length() - 3) });
  }
  
  public String b() {
    String str2 = ((z)this.a).p(256);
    if (str2 == null)
      return null; 
    String str1 = str2;
    if (f0.f.containsKey(str2))
      str1 = f0.f.get(str2); 
    return str1;
  }
  
  public String c() {
    return b(0, 4);
  }
  
  public String c(int paramInt) {
    if (paramInt != 0) {
      if (paramInt != 256) {
        if (paramInt != 513) {
          if (paramInt != 769) {
            if (paramInt != 259) {
              if (paramInt != 260) {
                if (paramInt != 522) {
                  if (paramInt != 523) {
                    if (paramInt != 4096) {
                      if (paramInt != 4097) {
                        switch (paramInt) {
                          default:
                            return super.c(paramInt);
                          case 518:
                            return k();
                          case 517:
                            return l();
                          case 516:
                            break;
                        } 
                        return h();
                      } 
                      return e();
                    } 
                    return f();
                  } 
                  return i();
                } 
                return m();
              } 
              return a();
            } 
            return g();
          } 
          return d();
        } 
        return j();
      } 
      return b();
    } 
    return c();
  }
  
  public String d() {
    String str = ((z)this.a).p(769);
    if (str == null)
      return null; 
    String[] arrayOfString = str.split(" ");
    if (arrayOfString.length < 6)
      return null; 
    try {
      null = String.format("%X %02X", new Object[] { Integer.valueOf(Integer.parseInt(arrayOfString[0])), Integer.valueOf(Integer.parseInt(arrayOfString[2])) });
      return c.get(null);
    } catch (NumberFormatException numberFormatException) {
      return null;
    } 
  }
  
  public String e() {
    return a(4097, new String[] { "None", "FL-20", "FL-50", "RF-11", "TF-22", "FL-36", "FL-50R", "FL-36R" });
  }
  
  public String f() {
    return a(4096, new String[] { "None", null, "Simple E-System", "E-System" });
  }
  
  public String g() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(((z)this.a).p(259));
    stringBuilder.append(" mm");
    return stringBuilder.toString();
  }
  
  public String h() {
    Integer integer = ((z)this.a).k(516);
    if (integer == null)
      return null; 
    String str = String.format("%04X", new Object[] { integer });
    return String.format("%s.%s", new Object[] { str.substring(0, str.length() - 3), str.substring(str.length() - 3) });
  }
  
  public String i() {
    Integer integer = ((z)this.a).k(523);
    return (integer == null) ? null : String.format("0x%04X", new Object[] { integer });
  }
  
  public String j() {
    String str = ((z)this.a).p(513);
    if (str == null)
      return null; 
    String[] arrayOfString = str.split(" ");
    if (arrayOfString.length < 6)
      return null; 
    try {
      int i = Integer.parseInt(arrayOfString[0]);
      int k = Integer.parseInt(arrayOfString[2]);
      int m = Integer.parseInt(arrayOfString[3]);
      return b.get(String.format("%X %02X %02X", new Object[] { Integer.valueOf(i), Integer.valueOf(k), Integer.valueOf(m) }));
    } catch (NumberFormatException numberFormatException) {
      return null;
    } 
  }
  
  public String k() {
    Integer integer = ((z)this.a).k(518);
    return (integer == null) ? null : (new DecimalFormat("0.#")).format(j(integer.intValue()));
  }
  
  public String l() {
    Integer integer = ((z)this.a).k(517);
    return (integer == null) ? null : (new DecimalFormat("0.#")).format(j(integer.intValue()));
  }
  
  public String m() {
    Integer integer = ((z)this.a).k(522);
    return (integer == null) ? null : (new DecimalFormat("0.#")).format(j(integer.intValue()));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/o/a0/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */