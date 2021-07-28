package e.d.c.o.a0;

import e.d.c.j;

public class c0 extends j<d0> {
  public c0(d0 paramd0) {
    super(paramd0);
  }
  
  public String a() {
    byte[] arrayOfByte = ((d0)this.a).d(4370);
    if (arrayOfByte == null || arrayOfByte.length < 2)
      return null; 
    String str = String.format("%d %d", new Object[] { Byte.valueOf(arrayOfByte[0]), Byte.valueOf(arrayOfByte[1]) });
    if (str.equals("1 1"))
      return "4:3"; 
    if (str.equals("1 4"))
      return "1:1"; 
    if (str.equals("2 1"))
      return "3:2 (RAW)"; 
    if (str.equals("2 2"))
      return "3:2"; 
    if (str.equals("3 1"))
      return "16:9 (RAW)"; 
    if (str.equals("3 3"))
      return "16:9"; 
    if (str.equals("4 1"))
      return "1:1 (RAW)"; 
    if (str.equals("4 4"))
      return "6:6"; 
    if (str.equals("5 5"))
      return "5:4"; 
    if (str.equals("6 6"))
      return "7:6"; 
    if (str.equals("7 7"))
      return "6:5"; 
    if (str.equals("8 8"))
      return "7:5"; 
    if (str.equals("9 1"))
      return "3:4 (RAW)"; 
    if (str.equals("9 9"))
      return "3:4"; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unknown (");
    stringBuilder.append(str);
    stringBuilder.append(")");
    return stringBuilder.toString();
  }
  
  public String b() {
    int[] arrayOfInt = ((d0)this.a).j(512);
    if (arrayOfInt == null)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < arrayOfInt.length; i++) {
      if (i != 0)
        stringBuilder.append(" "); 
      stringBuilder.append((short)arrayOfInt[i]);
    } 
    return stringBuilder.toString();
  }
  
  public String c() {
    return a(4113, new String[] { "Off", "On" });
  }
  
  public String c(int paramInt) {
    if (paramInt != 0) {
      if (paramInt != 512) {
        if (paramInt != 4124) {
          if (paramInt != 4370) {
            if (paramInt != 6400) {
              if (paramInt != 6401) {
                switch (paramInt) {
                  default:
                    return super.c(paramInt);
                  case 4114:
                    return i();
                  case 4113:
                    return c();
                  case 4112:
                    break;
                } 
                return h();
              } 
              return f();
            } 
            return e();
          } 
          return a();
        } 
        return g();
      } 
      return b();
    } 
    return d();
  }
  
  public String d() {
    return b(0, 4);
  }
  
  public String e() {
    byte[] arrayOfByte = ((d0)this.a).d(6400);
    if (arrayOfByte == null || arrayOfByte.length < 2)
      return null; 
    String str = String.format("%d %d", new Object[] { Byte.valueOf(arrayOfByte[0]), Byte.valueOf(arrayOfByte[1]) });
    if (str.equals("0 0"))
      return "Off"; 
    if (str.equals("0 1"))
      return "On"; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unknown (");
    stringBuilder.append(str);
    stringBuilder.append(")");
    return stringBuilder.toString();
  }
  
  public String f() {
    return a(6401, new String[] { "Vertical", "Horizontal" });
  }
  
  public String g() {
    String str;
    int[] arrayOfInt1 = ((d0)this.a).j(4124);
    int[] arrayOfInt2 = arrayOfInt1;
    if (arrayOfInt1 == null) {
      Integer integer = ((d0)this.a).k(4124);
      if (integer == null)
        return null; 
      arrayOfInt2 = new int[] { integer.intValue() };
    } 
    if (arrayOfInt2.length == 0)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    short s = (short)arrayOfInt2[0];
    if (s != 0) {
      if (s != 2) {
        if (s != 3) {
          stringBuilder.append("Unknown (");
          stringBuilder.append((short)arrayOfInt2[0]);
          str = ")";
        } else {
          str = "On (3 frames)";
        } 
      } else {
        str = "On (2 frames)";
      } 
    } else {
      str = "Off";
    } 
    stringBuilder.append(str);
    if (arrayOfInt2.length > 1) {
      stringBuilder.append("; ");
      stringBuilder.append((short)arrayOfInt2[1]);
    } 
    return stringBuilder.toString();
  }
  
  public String h() {
    Integer integer = ((d0)this.a).k(4112);
    if (integer == null)
      return null; 
    if (integer.intValue() == 0)
      return "(none)"; 
    StringBuilder stringBuilder = new StringBuilder();
    short s = integer.shortValue();
    if ((s & 0x1) != 0)
      stringBuilder.append("Noise Reduction, "); 
    if ((s >> 1 & 0x1) != 0)
      stringBuilder.append("Noise Filter, "); 
    if ((s >> 2 & 0x1) != 0)
      stringBuilder.append("Noise Filter (ISO Boost), "); 
    return stringBuilder.substring(0, stringBuilder.length() - 2);
  }
  
  public String i() {
    return a(4114, new String[] { "Off", "On" });
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/o/a0/c0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */