package e.d.c.o.a0;

import e.d.c.j;
import java.util.HashMap;

public class g0 extends j<h0> {
  private static final HashMap<Integer, String> b = new HashMap<Integer, String>();
  
  static {
    b.put(Integer.valueOf(0), "Off");
    b.put(Integer.valueOf(1), "Soft Focus");
    b.put(Integer.valueOf(2), "Pop Art");
    b.put(Integer.valueOf(3), "Pale & Light Color");
    b.put(Integer.valueOf(4), "Light Tone");
    b.put(Integer.valueOf(5), "Pin Hole");
    b.put(Integer.valueOf(6), "Grainy Film");
    b.put(Integer.valueOf(9), "Diorama");
    b.put(Integer.valueOf(10), "Cross Process");
    b.put(Integer.valueOf(12), "Fish Eye");
    b.put(Integer.valueOf(13), "Drawing");
    b.put(Integer.valueOf(14), "Gentle Sepia");
    b.put(Integer.valueOf(15), "Pale & Light Color II");
    b.put(Integer.valueOf(16), "Pop Art II");
    b.put(Integer.valueOf(17), "Pin Hole II");
    b.put(Integer.valueOf(18), "Pin Hole III");
    b.put(Integer.valueOf(19), "Grainy Film II");
    b.put(Integer.valueOf(20), "Dramatic Tone");
    b.put(Integer.valueOf(21), "Punk");
    b.put(Integer.valueOf(22), "Soft Focus 2");
    b.put(Integer.valueOf(23), "Sparkle");
    b.put(Integer.valueOf(24), "Watercolor");
    b.put(Integer.valueOf(25), "Key Line");
    b.put(Integer.valueOf(26), "Key Line II");
    b.put(Integer.valueOf(27), "Miniature");
    b.put(Integer.valueOf(28), "Reflection");
    b.put(Integer.valueOf(29), "Fragmented");
    b.put(Integer.valueOf(31), "Cross Process II");
    b.put(Integer.valueOf(32), "Dramatic Tone II");
    b.put(Integer.valueOf(33), "Watercolor I");
    b.put(Integer.valueOf(34), "Watercolor II");
    b.put(Integer.valueOf(35), "Diorama II");
    b.put(Integer.valueOf(36), "Vintage");
    b.put(Integer.valueOf(37), "Vintage II");
    b.put(Integer.valueOf(38), "Vintage III");
    b.put(Integer.valueOf(39), "Partial Color");
    b.put(Integer.valueOf(40), "Partial Color II");
    b.put(Integer.valueOf(41), "Partial Color III");
  }
  
  public g0(h0 paramh0) {
    super(paramh0);
  }
  
  public String a() {
    return j(289);
  }
  
  public String b() {
    return a(265, new String[] { "sRGB", "Adobe RGB", "Pro Photo RGB" });
  }
  
  public String c() {
    return a(267, new String[] { "High Speed", "High Function", "Advanced High Speed", "Advanced High Function" });
  }
  
  public String c(int paramInt) {
    if (paramInt != 0) {
      if (paramInt != 256) {
        if (paramInt != 289) {
          if (paramInt != 272) {
            if (paramInt != 273) {
              switch (paramInt) {
                default:
                  return super.c(paramInt);
                case 268:
                  return f();
                case 267:
                  return c();
                case 266:
                  return e();
                case 265:
                  break;
              } 
              return b();
            } 
            return h();
          } 
          return g();
        } 
        return a();
      } 
      return d();
    } 
    return i();
  }
  
  public String d() {
    return a(256, 1, new String[] { "Color Temperature", "Gray Point" });
  }
  
  public String e() {
    Integer integer = ((h0)this.a).k(266);
    if (integer == null)
      return null; 
    if (integer.intValue() == 0)
      return "(none)"; 
    StringBuilder stringBuilder = new StringBuilder();
    int i = integer.intValue();
    if ((i & 0x1) != 0)
      stringBuilder.append("Noise Reduction, "); 
    if ((i >> 1 & 0x1) != 0)
      stringBuilder.append("Noise Filter, "); 
    if ((i >> 2 & 0x1) != 0)
      stringBuilder.append("Noise Filter (ISO Boost), "); 
    return stringBuilder.substring(0, stringBuilder.length() - 2);
  }
  
  public String f() {
    Integer integer = ((h0)this.a).k(268);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    if (i != 1) {
      if (i != 2) {
        if (i != 3) {
          if (i != 256) {
            if (i != 512) {
              StringBuilder stringBuilder = new StringBuilder();
              stringBuilder.append("Unknown (");
              stringBuilder.append(integer);
              stringBuilder.append(")");
              return stringBuilder.toString();
            } 
            return "Sepia";
          } 
          return "Monotone";
        } 
        return "Muted";
      } 
      return "Natural";
    } 
    return "Vivid";
  }
  
  public String g() {
    return a(272, new String[] { "Neutral", "Yellow", "Orange", "Red", "Green" });
  }
  
  public String h() {
    return a(273, new String[] { "Neutral", "Sepia", "Blue", "Purple", "Green" });
  }
  
  public String i() {
    return b(0, 4);
  }
  
  public String j(int paramInt) {
    int[] arrayOfInt = ((h0)this.a).j(paramInt);
    if (arrayOfInt == null || arrayOfInt.length == 0)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    for (paramInt = 0; paramInt < arrayOfInt.length; paramInt++) {
      if (paramInt == 0) {
        String str;
        if (b.containsKey(Integer.valueOf(arrayOfInt[paramInt]))) {
          str = b.get(Integer.valueOf(arrayOfInt[paramInt]));
        } else {
          str = "[unknown]";
        } 
        stringBuilder.append(str);
      } else {
        stringBuilder.append(arrayOfInt[paramInt]);
        stringBuilder.append("; ");
      } 
      stringBuilder.append("; ");
    } 
    return stringBuilder.substring(0, stringBuilder.length() - 2);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/o/a0/g0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */